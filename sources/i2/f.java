package i2;

import android.net.Uri;
import android.util.Base64;
import b8.zb;
import d2.v0;
import g2.n0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends c {
    public n a;
    public byte[] b;
    public int c;
    public int d;

    @Override // i2.h
    public final void close() {
        if (this.b != null) {
            this.b = null;
            transferEnded();
        }
        this.a = null;
    }

    @Override // i2.h
    public final Uri getUri() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.a;
        }
        return null;
    }

    @Override // i2.h
    public final long open(n nVar) {
        transferInitializing(nVar);
        this.a = nVar;
        Uri uri = nVar.a;
        long j10 = nVar.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zb.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = n0.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new v0("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e10) {
                throw new v0(t4.c.f("Error while parsing Base64 encoded string: ", str2), e10, true, 0);
            }
        } else {
            this.b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j11 = nVar.e;
        byte[] bArr = this.b;
        if (j11 > bArr.length) {
            this.b = null;
            throw new k(2008);
        }
        int i3 = (int) j11;
        this.c = i3;
        int length = bArr.length - i3;
        this.d = length;
        if (j10 != -1) {
            this.d = (int) Math.min(length, j10);
        }
        transferStarted(nVar);
        return j10 != -1 ? j10 : this.d;
    }

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.d;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.b;
        String str = n0.a;
        System.arraycopy(bArr2, this.c, bArr, i3, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
