// default package

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gbc implements o63 {
    public final ExtendedDefaultDataSource a;
    public final long b;

    public gbc(ExtendedDefaultDataSource extendedDefaultDataSource, long j) {
        this.a = extendedDefaultDataSource;
        this.b = j;
    }

    @Override // o63
    public final void addTransferListener(vyb vybVar) {
        this.a.addTransferListener(vybVar);
    }

    @Override // o63
    public final void close() {
        this.a.close();
    }

    @Override // o63
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // o63
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // o63
    public final long open(u63 u63Var) {
        t63 a = u63Var.a();
        a.e = u63Var.e + this.b;
        return this.a.open(a.a());
    }

    @Override // g63
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
