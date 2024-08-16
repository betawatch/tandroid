package org.telegram.messenger;

import android.os.Build;
import android.os.VibrationEffect;
/* loaded from: classes3.dex */
public enum BotWebViewVibrationEffect {
    IMPACT_LIGHT(new long[]{7}, new int[]{65}, new long[]{60}),
    IMPACT_MEDIUM(new long[]{7}, new int[]{NotificationCenter.messagePlayingDidReset}, new long[]{70}),
    IMPACT_HEAVY(new long[]{7}, new int[]{NotificationCenter.voipServiceCreated}, new long[]{80}),
    IMPACT_RIGID(new long[]{3}, new int[]{NotificationCenter.emojiLoaded}, new long[]{50}),
    IMPACT_SOFT(new long[]{10}, new int[]{NotificationCenter.themeUploadedToServer}, new long[]{55}),
    NOTIFICATION_ERROR(new long[]{14, 48, 14, 48, 14, 48, 20}, new int[]{NotificationCenter.storyQualityUpdate, 0, NotificationCenter.storyQualityUpdate, 0, NotificationCenter.voipServiceCreated, 0, NotificationCenter.messagePlayingDidReset}, new long[]{40, 60, 40, 60, 65, 60, 40}),
    NOTIFICATION_SUCCESS(new long[]{14, 65, 14}, new int[]{NotificationCenter.themeUploadedToServer, 0, NotificationCenter.voipServiceCreated}, new long[]{50, 60, 65}),
    NOTIFICATION_WARNING(new long[]{14, 64, 14}, new int[]{NotificationCenter.emojiLoaded, 0, NotificationCenter.themeUploadedToServer}, new long[]{65, 60, 40}),
    SELECTION_CHANGE(new long[]{1}, new int[]{65}, new long[]{30}),
    APP_ERROR(new long[]{30, 10, 150, 10}, new int[]{0, 100, 0, 100}, new long[]{40, 60, 40, 60, 65, 60, 40});
    
    public final int[] amplitudes;
    public final long[] fallbackTimings;
    public final long[] timings;
    private Object vibrationEffect;

    BotWebViewVibrationEffect(long[] jArr, int[] iArr, long[] jArr2) {
        this.timings = jArr;
        this.amplitudes = iArr;
        this.fallbackTimings = jArr2;
    }

    public VibrationEffect getVibrationEffectForOreo() {
        boolean hasAmplitudeControl;
        VibrationEffect createWaveform;
        VibrationEffect createWaveform2;
        if (this.vibrationEffect == null) {
            hasAmplitudeControl = AndroidUtilities.getVibrator().hasAmplitudeControl();
            if (!hasAmplitudeControl) {
                createWaveform2 = VibrationEffect.createWaveform(this.fallbackTimings, -1);
                this.vibrationEffect = createWaveform2;
            } else {
                createWaveform = VibrationEffect.createWaveform(this.timings, this.amplitudes, -1);
                this.vibrationEffect = createWaveform;
            }
        }
        return BotWebViewVibrationEffect$$ExternalSyntheticApiModelOutline3.m(this.vibrationEffect);
    }

    public void vibrate() {
        if (Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.getVibrator().vibrate(getVibrationEffectForOreo());
        } else {
            AndroidUtilities.getVibrator().vibrate(this.fallbackTimings, -1);
        }
    }
}
