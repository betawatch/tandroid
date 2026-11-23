package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class xo {
    public final long a;
    public final long b;
    public final byte[] c;

    public xo(long j3, String str, long j10) {
        this.a = j3;
        this.b = j10;
        this.c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        return this.a == xoVar.a && this.b == xoVar.b && Arrays.equals(this.c, xoVar.c);
    }

    public xo(long j3, long j10, byte[] bArr) {
        this.a = j3;
        this.b = j10;
        this.c = bArr;
    }
}
