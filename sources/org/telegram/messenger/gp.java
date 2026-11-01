package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class gp {
    public final long a;
    public final long b;
    public final byte[] c;

    public gp(long j10, String str, long j11) {
        this.a = j10;
        this.b = j11;
        this.c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return this.a == gpVar.a && this.b == gpVar.b && Arrays.equals(this.c, gpVar.c);
    }

    public gp(long j10, long j11, byte[] bArr) {
        this.a = j10;
        this.b = j11;
        this.c = bArr;
    }
}
