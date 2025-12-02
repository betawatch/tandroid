package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes.dex */
public abstract class zzu {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final Uri zzb;
    private static final Uri zzc;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        zzb = parse;
        zzc = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
