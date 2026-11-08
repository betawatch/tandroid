package j2;

import a8.ia;
import android.net.Uri;
import android.util.Base64;
import e2.t0;
import h2.m0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f extends c {
    public m a;
    public byte[] b;
    public int c;
    public int d;

    @Override // j2.h
    public final void close() {
        if (this.b != null) {
            this.b = null;
            transferEnded();
        }
        this.a = null;
    }

    @Override // j2.h
    public final Uri getUri() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar.a;
        }
        return null;
    }

    @Override // j2.h
    public final long open(m mVar) {
        transferInitializing(mVar);
        this.a = mVar;
        Uri uri = mVar.a;
        long j3 = mVar.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        ia.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = m0.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new t0("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e10) {
                throw new t0(rf.b.i("Error while parsing Base64 encoded string: ", str2), e10, true, 0);
            }
        } else {
            this.b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j10 = mVar.e;
        byte[] bArr = this.b;
        if (j10 > bArr.length) {
            this.b = null;
            throw new j(2008);
        }
        int i7 = (int) j10;
        this.c = i7;
        int length = bArr.length - i7;
        this.d = length;
        if (j3 != -1) {
            this.d = (int) Math.min(length, j3);
        }
        transferStarted(mVar);
        return j3 != -1 ? j3 : this.d;
    }

    @Override // e2.n
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.d;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.b;
        String str = m0.a;
        System.arraycopy(bArr2, this.c, bArr, i7, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
