package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
