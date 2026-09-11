package g2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n implements h {
    public final Context a;
    public final ArrayList b;
    public final h c;
    public t d;
    public b e;
    public e f;
    public h h;
    public e0 n;
    public f r;
    public a0 s;
    public h v;

    public n(Context context, h hVar) {
        this.a = context.getApplicationContext();
        hVar.getClass();
        this.c = hVar;
        this.b = new ArrayList();
    }

    public static void c(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    public final void a(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            hVar.addTransferListener((c0) arrayList.get(i10));
            i10++;
        }
    }

    @Override // g2.h
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.c.addTransferListener(c0Var);
        this.b.add(c0Var);
        c(this.d, c0Var);
        c(this.e, c0Var);
        c(this.f, c0Var);
        c(this.h, c0Var);
        c(this.n, c0Var);
        c(this.r, c0Var);
        c(this.s, c0Var);
    }

    @Override // g2.h
    public final void close() {
        h hVar = this.v;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.v = null;
            }
        }
    }

    @Override // g2.h
    public final Map getResponseHeaders() {
        h hVar = this.v;
        return hVar == null ? Collections.EMPTY_MAP : hVar.getResponseHeaders();
    }

    @Override // g2.h
    public final Uri getUri() {
        h hVar = this.v;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override // g2.h
    public final long open(m mVar) {
        e2.d.g(this.v == null);
        Uri uri = mVar.a;
        String scheme = uri.getScheme();
        String str = e2.d0.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    t tVar = new t(false);
                    this.d = tVar;
                    a(tVar);
                }
                this.v = this.d;
            } else {
                if (this.e == null) {
                    b bVar = new b(context);
                    this.e = bVar;
                    a(bVar);
                }
                this.v = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                b bVar2 = new b(context);
                this.e = bVar2;
                a(bVar2);
            }
            this.v = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                e eVar = new e(context);
                this.f = eVar;
                a(eVar);
            }
            this.v = this.f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            h hVar = this.c;
            if (equals) {
                if (this.h == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.h = hVar2;
                        a(hVar2);
                    } catch (ClassNotFoundException unused) {
                        e2.a.n("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.h == null) {
                        this.h = hVar;
                    }
                }
                this.v = this.h;
            } else if ("udp".equals(scheme)) {
                if (this.n == null) {
                    e0 e0Var = new e0();
                    this.n = e0Var;
                    a(e0Var);
                }
                this.v = this.n;
            } else if ("data".equals(scheme)) {
                if (this.r == null) {
                    f fVar = new f(false);
                    this.r = fVar;
                    a(fVar);
                }
                this.v = this.r;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.s == null) {
                    a0 a0Var = new a0(context);
                    this.s = a0Var;
                    a(a0Var);
                }
                this.v = this.s;
            } else {
                this.v = hVar;
            }
        }
        return this.v.open(mVar);
    }

    @Override // b2.k
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar = this.v;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }
}
