// default package

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h63 extends qf0 {
    public u63 a;
    public byte[] b;
    public int c;
    public int d;

    @Override // o63
    public final void close() {
        if (this.b != null) {
            this.b = null;
            transferEnded();
        }
        this.a = null;
    }

    @Override // o63
    public final Uri getUri() {
        u63 u63Var = this.a;
        if (u63Var != null) {
            return u63Var.a;
        }
        return null;
    }

    @Override // o63
    public final long open(u63 u63Var) {
        byte[] decode;
        transferInitializing(u63Var);
        this.a = u63Var;
        Uri uri = u63Var.a;
        long j = u63Var.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        gre.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = g8c.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new av7("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                decode = Base64.decode(str2, 0);
                this.b = decode;
            } catch (IllegalArgumentException e) {
                throw new av7(b00.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            decode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.b = decode;
        }
        long j2 = u63Var.e;
        if (j2 > decode.length) {
            this.b = null;
            throw new r63(2008);
        }
        int i = (int) j2;
        this.c = i;
        int length = decode.length - i;
        this.d = length;
        if (j != -1) {
            this.d = (int) Math.min(length, j);
        }
        transferStarted(u63Var);
        return j != -1 ? j : this.d;
    }

    @Override // g63
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.b;
        String str = g8c.a;
        System.arraycopy(bArr2, this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
