package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class b0 implements h {
    public final h a;
    public long b;
    public Uri c;

    public b0(h hVar) {
        hVar.getClass();
        this.a = hVar;
        this.c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // g2.h
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.a.addTransferListener(c0Var);
    }

    @Override // g2.h
    public final void close() {
        this.a.close();
    }

    @Override // g2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // g2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // g2.h
    public final long open(m mVar) {
        h hVar = this.a;
        this.c = mVar.a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override // b2.k
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.a.read(bArr, i10, i11);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
