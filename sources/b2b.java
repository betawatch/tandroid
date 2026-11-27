// default package

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class b2b implements h73 {
    public final h73 a;
    public long b;
    public Uri c;
    public Map d;

    public b2b(h73 h73Var) {
        h73Var.getClass();
        this.a = h73Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // h73
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
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
        h73 h73Var = this.a;
        this.c = n73Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return h73Var.open(n73Var);
        } finally {
            Uri uri = h73Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = h73Var.getResponseHeaders();
        }
    }

    @Override // z63
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
