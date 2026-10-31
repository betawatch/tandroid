package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c0 implements h {
    public final h a;
    public long b;
    public Uri c;
    public Map d;

    public c0(h hVar) {
        hVar.getClass();
        this.a = hVar;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // g2.h
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.a.addTransferListener(d0Var);
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
    public final long open(n nVar) {
        h hVar = this.a;
        this.c = nVar.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(nVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override // b2.p
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.a.read(bArr, i10, i11);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
