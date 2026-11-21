package j2;

import a8.la;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import h2.l0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
    public h w;

    public n(Context context, h hVar) {
        this.a = context.getApplicationContext();
        hVar.getClass();
        this.c = hVar;
        this.b = new ArrayList();
    }

    public static void e(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    public final void a(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                return;
            }
            hVar.addTransferListener((c0) arrayList.get(i7));
            i7++;
        }
    }

    @Override // j2.h
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.c.addTransferListener(c0Var);
        this.b.add(c0Var);
        e(this.d, c0Var);
        e(this.e, c0Var);
        e(this.f, c0Var);
        e(this.h, c0Var);
        e(this.n, c0Var);
        e(this.r, c0Var);
        e(this.s, c0Var);
    }

    @Override // j2.h
    public final void close() {
        h hVar = this.w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.w = null;
            }
        }
    }

    @Override // j2.h
    public final Map getResponseHeaders() {
        h hVar = this.w;
        return hVar == null ? Collections.EMPTY_MAP : hVar.getResponseHeaders();
    }

    @Override // j2.h
    public final Uri getUri() {
        h hVar = this.w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override // j2.h
    public final long open(m mVar) {
        la.p(this.w == null);
        Uri uri = mVar.a;
        String scheme = uri.getScheme();
        String str = l0.a;
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
                this.w = this.d;
            } else {
                if (this.e == null) {
                    b bVar = new b(context);
                    this.e = bVar;
                    a(bVar);
                }
                this.w = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                b bVar2 = new b(context);
                this.e = bVar2;
                a(bVar2);
            }
            this.w = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                e eVar = new e(context);
                this.f = eVar;
                a(eVar);
            }
            this.w = this.f;
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
                        h2.a.l("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.h == null) {
                        this.h = hVar;
                    }
                }
                this.w = this.h;
            } else if ("udp".equals(scheme)) {
                if (this.n == null) {
                    e0 e0Var = new e0();
                    this.n = e0Var;
                    a(e0Var);
                }
                this.w = this.n;
            } else if ("data".equals(scheme)) {
                if (this.r == null) {
                    f fVar = new f(false);
                    this.r = fVar;
                    a(fVar);
                }
                this.w = this.r;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.s == null) {
                    a0 a0Var = new a0(context);
                    this.s = a0Var;
                    a(a0Var);
                }
                this.w = this.s;
            } else {
                this.w = hVar;
            }
        }
        return this.w.open(mVar);
    }

    @Override // e2.n
    public final int read(byte[] bArr, int i7, int i10) {
        h hVar = this.w;
        hVar.getClass();
        return hVar.read(bArr, i7, i10);
    }
}
