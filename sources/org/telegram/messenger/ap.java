package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class ap {
    public final long a;
    public final long b;
    public final byte[] c;

    public ap(long j3, String str, long j10) {
        this.a = j3;
        this.b = j10;
        this.c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return this.a == apVar.a && this.b == apVar.b && Arrays.equals(this.c, apVar.c);
    }

    public ap(long j3, long j10, byte[] bArr) {
        this.a = j3;
        this.b = j10;
        this.c = bArr;
    }
}
