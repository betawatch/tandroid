package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import h3.t1;
import java.net.URLDecoder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        d5.a.e("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i9 = d5.f0.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new t1("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new t1(ta.b.d("Error while parsing Base64 encoded string: ", str), e10, true, 0);
            }
        } else {
            this.b = URLDecoder.decode(str, n8.d.a.name()).getBytes(n8.d.c);
        }
        long j11 = qVar.e;
        byte[] bArr = this.b;
        if (j11 > bArr.length) {
            this.b = null;
            throw new n(2008);
        }
        int i10 = (int) j11;
        this.c = i10;
        int length = bArr.length - i10;
        this.d = length;
        if (j10 != -1) {
            this.d = (int) Math.min(length, j10);
        }
        transferStarted(qVar);
        return j10 != -1 ? j10 : this.d;
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.d;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.b;
        int i12 = d5.f0.a;
        System.arraycopy(bArr2, this.c, bArr, i9, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
