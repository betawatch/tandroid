package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class fp {
    public final long a;
    public final long b;
    public final byte[] c;

    public fp(long j10, String str, long j11) {
        this.a = j10;
        this.b = j11;
        this.c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fp)) {
            return false;
        }
        fp fpVar = (fp) obj;
        return this.a == fpVar.a && this.b == fpVar.b && Arrays.equals(this.c, fpVar.c);
    }

    public fp(long j10, long j11, byte[] bArr) {
        this.a = j10;
        this.b = j11;
        this.c = bArr;
    }
}
