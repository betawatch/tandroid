package org.telegram.messenger.utils;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes3.dex */
public final class RefreshRateController {
    private final Activity activity;
    private Window.OnFrameMetricsAvailableListener listener;
    private Display.Mode mode60;
    private Display.Mode modeMax;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final long[] frameNs = new long[NotificationCenter.appConfigUpdated];
    private int ringCount = 0;
    private int ringPos = 0;
    private long ringSumNs = 0;
    private long belowSinceMs = -1;
    private long aboveSinceMs = -1;
    private long lastSwitchMs = 0;
    private int currentPreferredModeId = 0;

    private void logDecision(String str, float f) {
    }

    public RefreshRateController(Activity activity) {
        this.activity = activity;
    }

    public void start() {
        if (resolveModes()) {
            installListener();
        }
    }

    public void stop() {
        removeListener();
        resetStats();
    }

    private void resetStats() {
        this.ringCount = 0;
        this.ringPos = 0;
        this.ringSumNs = 0L;
        this.belowSinceMs = -1L;
        this.aboveSinceMs = -1L;
    }

    private void installListener() {
        Window window = this.activity.getWindow();
        if (this.listener != null) {
            return;
        }
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: org.telegram.messenger.utils.RefreshRateController$$ExternalSyntheticLambda4
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                RefreshRateController.this.lambda$installListener$0(window2, frameMetrics, i);
            }
        };
        this.listener = onFrameMetricsAvailableListener;
        window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.mainHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$installListener$0(Window window, FrameMetrics frameMetrics, int i) {
        long metric;
        metric = frameMetrics.getMetric(8);
        if (metric <= 0) {
            return;
        }
        pushFrame(metric);
        maybeSwitch();
    }

    private void removeListener() {
        Window window = this.activity.getWindow();
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.listener;
        if (onFrameMetricsAvailableListener != null) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
            this.listener = null;
        }
    }

    private void pushFrame(long j) {
        int i = this.ringCount;
        if (i < 240) {
            this.ringCount = i + 1;
        } else {
            this.ringSumNs -= this.frameNs[this.ringPos];
        }
        long[] jArr = this.frameNs;
        int i2 = this.ringPos;
        jArr[i2] = j;
        this.ringSumNs += j;
        int i3 = i2 + 1;
        this.ringPos = i3;
        if (i3 == 240) {
            this.ringPos = 0;
        }
    }

    private float getAvgFps() {
        int i = this.ringCount;
        if (i == 0) {
            return 0.0f;
        }
        double d = this.ringSumNs / i;
        if (d <= 0.0d) {
            return 0.0f;
        }
        return (float) (1.0E9d / d);
    }

    private void maybeSwitch() {
        if (this.ringCount < 30) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float avgFps = getAvgFps();
        boolean z = uptimeMillis - this.lastSwitchMs >= 3000;
        if (isPrefer60()) {
            if (avgFps < 58.5f) {
                this.aboveSinceMs = -1L;
                return;
            }
            if (this.aboveSinceMs < 0) {
                this.aboveSinceMs = uptimeMillis;
            }
            if (uptimeMillis - this.aboveSinceMs < 1800 || !z) {
                return;
            }
            setPreferredMode(this.modeMax);
            this.lastSwitchMs = uptimeMillis;
            this.belowSinceMs = -1L;
            this.aboveSinceMs = -1L;
            logDecision("UP", avgFps);
            return;
        }
        if (avgFps > 55.0f) {
            this.belowSinceMs = -1L;
            return;
        }
        if (this.belowSinceMs < 0) {
            this.belowSinceMs = uptimeMillis;
        }
        if (uptimeMillis - this.belowSinceMs < 1800 || !z) {
            return;
        }
        setPreferredMode(this.mode60);
        this.lastSwitchMs = uptimeMillis;
        this.belowSinceMs = -1L;
        this.aboveSinceMs = -1L;
        logDecision("DOWN", avgFps);
    }

    private boolean isPrefer60() {
        int modeId;
        Display.Mode mode = this.mode60;
        if (mode == null) {
            return false;
        }
        int i = this.currentPreferredModeId;
        modeId = mode.getModeId();
        return i == modeId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r7 > r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        r0 = r0.getSupportedModes();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean resolveModes() {
        Display.Mode[] supportedModes;
        float refreshRate;
        float refreshRate2;
        int physicalWidth;
        int physicalHeight;
        int physicalWidth2;
        int physicalHeight2;
        float refreshRate3;
        float refreshRate4;
        Display displayCompat = getDisplayCompat(this.activity);
        if (displayCompat == null || supportedModes == null || supportedModes.length == 0) {
            return false;
        }
        Display.Mode mode = null;
        Display.Mode mode2 = null;
        for (Display.Mode mode3 : supportedModes) {
            if (mode2 != null) {
                refreshRate3 = mode3.getRefreshRate();
                refreshRate4 = mode2.getRefreshRate();
            }
            mode2 = mode3;
            refreshRate = mode3.getRefreshRate();
            if (refreshRate >= 58.0f && refreshRate <= 62.5f) {
                if (mode != null) {
                    refreshRate2 = mode.getRefreshRate();
                    float abs = Math.abs(refreshRate2 - 60.0f);
                    float abs2 = Math.abs(refreshRate - 60.0f);
                    if (abs2 >= abs) {
                        if (abs2 == abs) {
                            physicalWidth = mode.getPhysicalWidth();
                            physicalHeight = mode.getPhysicalHeight();
                            int i = physicalWidth * physicalHeight;
                            physicalWidth2 = mode3.getPhysicalWidth();
                            physicalHeight2 = mode3.getPhysicalHeight();
                            if (physicalWidth2 * physicalHeight2 <= i) {
                            }
                        }
                    }
                }
                mode = mode3;
            }
        }
        this.mode60 = mode;
        this.modeMax = mode2;
        return mode != mode2;
    }

    private void setPreferredMode(Display.Mode mode) {
        float refreshRate;
        int modeId;
        if (mode == null) {
            return;
        }
        Window window = this.activity.getWindow();
        refreshRate = mode.getRefreshRate();
        AndroidUtilities.setPreferredMaxRefreshRate(window, refreshRate);
        modeId = mode.getModeId();
        this.currentPreferredModeId = modeId;
    }

    private static Display getDisplayCompat(Activity activity) {
        Display display;
        if (Build.VERSION.SDK_INT >= 30) {
            display = activity.getDisplay();
            return display;
        }
        return activity.getWindowManager().getDefaultDisplay();
    }
}
