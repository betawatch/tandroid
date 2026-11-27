// default package

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gfc implements h73 {
    public final ExtendedDefaultDataSource a;
    public final long b;

    public gfc(ExtendedDefaultDataSource extendedDefaultDataSource, long j) {
        this.a = extendedDefaultDataSource;
        this.b = j;
    }

    @Override // h73
    public final void addTransferListener(v2c v2cVar) {
        this.a.addTransferListener(v2cVar);
    }

    @Override // h73
    public final void close() {
        this.a.close();
    }

    @Override // h73
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // h73
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // h73
    public final long open(n73 n73Var) {
        m73 a = n73Var.a();
        a.e = n73Var.e + this.b;
        return this.a.open(a.a());
    }

    @Override // z63
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
