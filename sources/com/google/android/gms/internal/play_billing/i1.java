package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i1 {
    public static final i1 b;
    public static final i1 c;
    public final Throwable a;

    static {
        if (f4.d) {
            c = null;
            b = null;
        } else {
            c = new i1(null);
            b = new i1(null);
        }
    }

    public i1(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
