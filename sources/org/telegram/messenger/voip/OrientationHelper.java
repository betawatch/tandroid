package org.telegram.messenger.voip;

import android.view.OrientationEventListener;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class OrientationHelper {
    private static final int ORIENTATION_HYSTERESIS = 5;
    public static volatile int cameraOrientation;
    public static volatile int cameraRotation;
    public static volatile boolean cameraRotationDisabled;
    private OrientationEventListener orientationEventListener = new OrientationEventListener(org.telegram.messenger.a.b) { // from class: org.telegram.messenger.voip.OrientationHelper.1
        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            if (OrientationHelper.this.orientationEventListener == null || i == -1) {
                return;
            }
            OrientationHelper orientationHelper = OrientationHelper.this;
            int roundOrientation = orientationHelper.roundOrientation(i, orientationHelper.rotation);
            if (roundOrientation != OrientationHelper.this.rotation) {
                OrientationHelper orientationHelper2 = OrientationHelper.this;
                orientationHelper2.rotation = roundOrientation;
                orientationHelper2.onOrientationUpdate(roundOrientation);
            }
        }
    };
    private int rotation;

    /* JADX INFO: Access modifiers changed from: private */
    public int roundOrientation(int i, int i2) {
        if (i2 != -1) {
            int abs = Math.abs(i - i2);
            if (Math.min(abs, 360 - abs) < 50) {
                return i2;
            }
        }
        return (((i + 45) / 90) * 90) % 360;
    }

    public int getOrientation() {
        if (cameraRotationDisabled) {
            return 0;
        }
        return this.rotation;
    }

    public void start() {
        boolean canDetectOrientation = this.orientationEventListener.canDetectOrientation();
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (canDetectOrientation) {
            orientationEventListener.enable();
        } else {
            orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    public void stop() {
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    public void onOrientationUpdate(int i) {
    }
}
