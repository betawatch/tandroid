package org.telegram.messenger;

import android.view.Window;
import java.util.HashMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class FlagSecureReason {
    private static HashMap<Window, Integer> currentSecureReasons;
    private final FlagSecureCondition condition;
    private final Window window;
    private boolean attached = false;
    private boolean value = false;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public interface FlagSecureCondition {
        boolean run();
    }

    public FlagSecureReason(Window window, FlagSecureCondition flagSecureCondition) {
        this.window = window;
        this.condition = flagSecureCondition;
    }

    public static boolean isSecuredNow(Window window) {
        HashMap<Window, Integer> hashMap = currentSecureReasons;
        return (hashMap == null || hashMap.get(window) == null) ? false : true;
    }

    private void update(int i10) {
        if (currentSecureReasons == null) {
            currentSecureReasons = new HashMap<>();
        }
        Integer num = currentSecureReasons.get(this.window);
        int max = Math.max(0, (num == null ? 0 : num.intValue()) + i10);
        if (max <= 0) {
            currentSecureReasons.remove(this.window);
        } else {
            currentSecureReasons.put(this.window, Integer.valueOf(max));
        }
        updateWindowSecure(this.window);
    }

    private static void updateWindowSecure(Window window) {
        if (window == null) {
            return;
        }
        if (isSecuredNow(window)) {
            window.addFlags(8192);
            AndroidUtilities.logFlagSecure();
        } else {
            window.clearFlags(8192);
            AndroidUtilities.logFlagSecure();
        }
    }

    public void attach() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        invalidate();
    }

    public void detach() {
        if (this.attached) {
            this.attached = false;
            invalidate();
        }
    }

    public void invalidate() {
        FlagSecureCondition flagSecureCondition;
        boolean z10 = this.attached && (flagSecureCondition = this.condition) != null && flagSecureCondition.run();
        if (z10 != this.value) {
            this.value = z10;
            update(z10 ? 1 : -1);
        }
    }
}
