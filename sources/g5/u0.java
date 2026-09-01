package g5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class u0 implements m {
    public final m a;
    public long b;
    public Uri c;

    public u0(m mVar) {
        mVar.getClass();
        this.a = mVar;
        this.c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // g5.m
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        this.a.addTransferListener(v0Var);
    }

    @Override // g5.m
    public final void close() {
        this.a.close();
    }

    @Override // g5.m
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // g5.m
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // g5.m
    public final long open(p pVar) {
        this.c = pVar.a;
        Map map = Collections.EMPTY_MAP;
        m mVar = this.a;
        long open = mVar.open(pVar);
        Uri uri = mVar.getUri();
        uri.getClass();
        this.c = uri;
        mVar.getResponseHeaders();
        return open;
    }

    @Override // g5.j
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.a.read(bArr, i10, i11);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
