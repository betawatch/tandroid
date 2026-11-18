package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class wo {
    public final long a;
    public final long b;
    public final byte[] c;

    public wo(long j3, String str, long j10) {
        this.a = j3;
        this.b = j10;
        this.c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        return this.a == woVar.a && this.b == woVar.b && Arrays.equals(this.c, woVar.c);
    }

    public wo(long j3, long j10, byte[] bArr) {
        this.a = j3;
        this.b = j10;
        this.c = bArr;
    }
}
