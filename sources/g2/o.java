package g2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import e2.l0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o implements h {
    public final Context a;
    public final ArrayList b;
    public final h c;
    public u d;
    public b e;
    public e f;
    public h h;
    public f0 n;
    public f r;
    public b0 s;
    public h w;

    public o(Context context, h hVar) {
        this.a = context.getApplicationContext();
        hVar.getClass();
        this.c = hVar;
        this.b = new ArrayList();
    }

    public static void c(h hVar, d0 d0Var) {
        if (hVar != null) {
            hVar.addTransferListener(d0Var);
        }
    }

    public final void a(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            hVar.addTransferListener((d0) arrayList.get(i10));
            i10++;
        }
    }

    @Override // g2.h
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.c.addTransferListener(d0Var);
        this.b.add(d0Var);
        c(this.d, d0Var);
        c(this.e, d0Var);
        c(this.f, d0Var);
        c(this.h, d0Var);
        c(this.n, d0Var);
        c(this.r, d0Var);
        c(this.s, d0Var);
    }

    @Override // g2.h
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

    @Override // g2.h
    public final Map getResponseHeaders() {
        h hVar = this.w;
        return hVar == null ? Collections.EMPTY_MAP : hVar.getResponseHeaders();
    }

    @Override // g2.h
    public final Uri getUri() {
        h hVar = this.w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override // g2.h
    public final long open(n nVar) {
        t6.p(this.w == null);
        Uri uri = nVar.a;
        String scheme = uri.getScheme();
        String str = l0.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    u uVar = new u(false);
                    this.d = uVar;
                    a(uVar);
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
                        e2.a.l("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.h == null) {
                        this.h = hVar;
                    }
                }
                this.w = this.h;
            } else if ("udp".equals(scheme)) {
                if (this.n == null) {
                    f0 f0Var = new f0();
                    this.n = f0Var;
                    a(f0Var);
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
                    b0 b0Var = new b0(context);
                    this.s = b0Var;
                    a(b0Var);
                }
                this.w = this.s;
            } else {
                this.w = hVar;
            }
        }
        return this.w.open(nVar);
    }

    @Override // b2.p
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar = this.w;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }
}
