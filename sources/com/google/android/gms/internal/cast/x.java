package com.google.android.gms.internal.cast;

import android.os.Build;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class x {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }
}
