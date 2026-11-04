package i2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // i2.h
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.a.addTransferListener(d0Var);
    }

    @Override // i2.h
    public final void close() {
        this.a.close();
    }

    @Override // i2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // i2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // i2.h
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

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        int read = this.a.read(bArr, i3, i10);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
