package g5;

import android.net.Uri;
import android.util.Base64;
import j3.r1;
import java.net.URLDecoder;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k extends g {
    public p a;
    public byte[] b;
    public int c;
    public int d;

    @Override // g5.m
    public final void close() {
        if (this.b != null) {
            this.b = null;
            transferEnded();
        }
        this.a = null;
    }

    @Override // g5.m
    public final Uri getUri() {
        p pVar = this.a;
        if (pVar != null) {
            return pVar.a;
        }
        return null;
    }

    @Override // g5.m
    public final long open(p pVar) {
        transferInitializing(pVar);
        this.a = pVar;
        Uri uri = pVar.a;
        long j10 = pVar.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        h5.a.e("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = h5.d0.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new r1("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e6) {
                throw new r1(yh.k("Error while parsing Base64 encoded string: ", str), e6, true, 0);
            }
        } else {
            this.b = URLDecoder.decode(str, r8.d.a.name()).getBytes(r8.d.c);
        }
        long j11 = pVar.e;
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
        transferStarted(pVar);
        return j10 != -1 ? j10 : this.d;
    }

    @Override // g5.j
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
        int i13 = h5.d0.a;
        System.arraycopy(bArr2, this.c, bArr, i10, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
