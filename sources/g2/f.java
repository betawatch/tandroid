package g2;

import android.net.Uri;
import android.util.Base64;
import b2.w0;
import e2.m0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import si.o0;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class f extends c {
    public m a;
    public byte[] b;
    public int c;
    public int d;

    @Override // g2.h
    public final void close() {
        if (this.b != null) {
            this.b = null;
            transferEnded();
        }
        this.a = null;
    }

    @Override // g2.h
    public final Uri getUri() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar.a;
        }
        return null;
    }

    @Override // g2.h
    public final long open(m mVar) {
        transferInitializing(mVar);
        this.a = mVar;
        Uri uri = mVar.a;
        long j10 = mVar.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        u6.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = m0.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new w0("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new w0(o0.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j11 = mVar.e;
        byte[] bArr = this.b;
        if (j11 > bArr.length) {
            this.b = null;
            throw new j(2008);
        }
        int i10 = (int) j11;
        this.c = i10;
        int length = bArr.length - i10;
        this.d = length;
        if (j10 != -1) {
            this.d = (int) Math.min(length, j10);
        }
        transferStarted(mVar);
        return j10 != -1 ? j10 : this.d;
    }

    @Override // b2.o
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
        String str = m0.a;
        System.arraycopy(bArr2, this.c, bArr, i10, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
