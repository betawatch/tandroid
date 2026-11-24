// default package

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jb3 implements a83 {
    public final Context a;
    public final ArrayList b;
    public final a83 c;
    public ab4 d;
    public ly e;
    public jw2 f;
    public a83 h;
    public l6c n;
    public t73 r;
    public l19 s;
    public a83 w;

    public jb3(Context context, a83 a83Var) {
        this.a = context.getApplicationContext();
        a83Var.getClass();
        this.c = a83Var;
        this.b = new ArrayList();
    }

    public static void e(a83 a83Var, w0c w0cVar) {
        if (a83Var != null) {
            a83Var.addTransferListener(w0cVar);
        }
    }

    public final void a(a83 a83Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            a83Var.addTransferListener((w0c) arrayList.get(i));
            i++;
        }
    }

    @Override // a83
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        this.c.addTransferListener(w0cVar);
        this.b.add(w0cVar);
        e(this.d, w0cVar);
        e(this.e, w0cVar);
        e(this.f, w0cVar);
        e(this.h, w0cVar);
        e(this.n, w0cVar);
        e(this.r, w0cVar);
        e(this.s, w0cVar);
    }

    @Override // a83
    public final void close() {
        a83 a83Var = this.w;
        if (a83Var != null) {
            try {
                a83Var.close();
            } finally {
                this.w = null;
            }
        }
    }

    @Override // a83
    public final Map getResponseHeaders() {
        a83 a83Var = this.w;
        return a83Var == null ? Collections.EMPTY_MAP : a83Var.getResponseHeaders();
    }

    @Override // a83
    public final Uri getUri() {
        a83 a83Var = this.w;
        if (a83Var == null) {
            return null;
        }
        return a83Var.getUri();
    }

    @Override // a83
    public final long open(g83 g83Var) {
        a83 a83Var;
        jte.p(this.w == null);
        Uri uri = g83Var.a;
        String scheme = uri.getScheme();
        String str = hac.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    ab4 ab4Var = new ab4(false);
                    this.d = ab4Var;
                    a(ab4Var);
                }
                a83Var = this.d;
                this.w = a83Var;
            } else {
                if (this.e == null) {
                    ly lyVar = new ly(context);
                    this.e = lyVar;
                    a(lyVar);
                }
                a83Var = this.e;
                this.w = a83Var;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                ly lyVar2 = new ly(context);
                this.e = lyVar2;
                a(lyVar2);
            }
            a83Var = this.e;
            this.w = a83Var;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                jw2 jw2Var = new jw2(context);
                this.f = jw2Var;
                a(jw2Var);
            }
            a83Var = this.f;
            this.w = a83Var;
        } else {
            boolean equals = "rtmp".equals(scheme);
            a83 a83Var2 = this.c;
            if (equals) {
                a83Var = this.h;
                if (a83Var == null) {
                    try {
                        a83 a83Var3 = (a83) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.h = a83Var3;
                        a(a83Var3);
                    } catch (ClassNotFoundException unused) {
                        ncd.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        rjb.k("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    a83 a83Var4 = this.h;
                    if (a83Var4 == null) {
                        this.h = a83Var2;
                    } else {
                        a83Var2 = a83Var4;
                    }
                    a83Var = a83Var2;
                }
                this.w = a83Var;
            } else if ("udp".equals(scheme)) {
                if (this.n == null) {
                    l6c l6cVar = new l6c();
                    this.n = l6cVar;
                    a(l6cVar);
                }
                a83Var = this.n;
                this.w = a83Var;
            } else if ("data".equals(scheme)) {
                if (this.r == null) {
                    t73 t73Var = new t73(false);
                    this.r = t73Var;
                    a(t73Var);
                }
                a83Var = this.r;
                this.w = a83Var;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.s == null) {
                    l19 l19Var = new l19(context);
                    this.s = l19Var;
                    a(l19Var);
                }
                a83Var = this.s;
                this.w = a83Var;
            } else {
                this.w = a83Var2;
                a83Var = a83Var2;
            }
        }
        return a83Var.open(g83Var);
    }

    @Override // s73
    public final int read(byte[] bArr, int i, int i2) {
        a83 a83Var = this.w;
        a83Var.getClass();
        return a83Var.read(bArr, i, i2);
    }
}
