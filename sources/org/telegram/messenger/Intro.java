package org.telegram.messenger;

import android.graphics.Color;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class Intro {
    public static native void onDrawFrame(int i10);

    public static native void onSurfaceChanged(int i10, int i11, float f7, int i12);

    public static native void onSurfaceCreated();

    private static native void setBackgroundColor(float f7, float f10, float f11, float f12);

    public static void setBackgroundColor(int i10) {
        setBackgroundColor(Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f);
    }

    public static native void setDate(float f7);

    public static native void setFastTextures(int i10, int i11, int i12, int i13);

    public static native void setFreeTextures(int i10, int i11);

    public static native void setIcTextures(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    public static native void setPage(int i10);

    public static native void setPowerfulTextures(int i10, int i11, int i12, int i13);

    public static native void setPrivateTextures(int i10, int i11);

    public static native void setScrollOffset(float f7);

    public static native void setTelegramTextures(int i10, int i11, int i12);
}
