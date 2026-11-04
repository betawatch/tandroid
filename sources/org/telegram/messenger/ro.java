package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ro {
    public final long a;
    public final long b;
    public final byte[] c;

    public ro(long j10, String str, long j11) {
        this.a = j10;
        this.b = j11;
        this.c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ro)) {
            return false;
        }
        ro roVar = (ro) obj;
        return this.a == roVar.a && this.b == roVar.b && Arrays.equals(this.c, roVar.c);
    }

    public ro(long j10, long j11, byte[] bArr) {
        this.a = j10;
        this.b = j11;
        this.c = bArr;
    }
}
