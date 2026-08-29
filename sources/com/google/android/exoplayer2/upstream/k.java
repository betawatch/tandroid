package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import j3.t1;
import java.net.URLDecoder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends g {
    public q a;
    public byte[] b;
    public int c;
    public int d;

    @Override // com.google.android.exoplayer2.upstream.m
    public final void close() {
        if (this.b != null) {
            this.b = null;
            transferEnded();
        }
        this.a = null;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        q qVar = this.a;
        if (qVar != null) {
            return qVar.a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final long open(q qVar) {
        transferInitializing(qVar);
        this.a = qVar;
        Uri uri = qVar.a;
        long j10 = qVar.f;
        String scheme = uri.getScheme();
        f5.a.e("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = f5.d0.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new t1("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new t1(u3.c.e("Error while parsing Base64 encoded string: ", str), e10, true, 0);
            }
        } else {
            this.b = URLDecoder.decode(str, p8.d.a.name()).getBytes(p8.d.c);
        }
        long j11 = qVar.e;
        byte[] bArr = this.b;
        if (j11 > bArr.length) {
            this.b = null;
            throw new n(2008);
        }
        int i11 = (int) j11;
        this.c = i11;
        int length = bArr.length - i11;
        this.d = length;
        if (j10 != -1) {
            this.d = (int) Math.min(length, j10);
        }
        transferStarted(qVar);
        return j10 != -1 ? j10 : this.d;
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.d;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.b;
        int i13 = f5.d0.a;
        System.arraycopy(bArr2, this.c, bArr, i10, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
