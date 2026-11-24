// default package

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
