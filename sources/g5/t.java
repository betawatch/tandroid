package g5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t implements m {
    public final Context a;
    public final ArrayList b;
    public final m c;
    public a0 d;
    public c e;
    public i f;
    public m h;
    public x0 n;
    public k r;
    public r0 s;
    public m v;

    public t(Context context, m mVar) {
        this.a = context.getApplicationContext();
        mVar.getClass();
        this.c = mVar;
        this.b = new ArrayList();
    }

    public static void b(m mVar, v0 v0Var) {
        if (mVar != null) {
            mVar.addTransferListener(v0Var);
        }
    }

    public final void a(m mVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            mVar.addTransferListener((v0) arrayList.get(i10));
            i10++;
        }
    }

    @Override // g5.m
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        this.c.addTransferListener(v0Var);
        this.b.add(v0Var);
        b(this.d, v0Var);
        b(this.e, v0Var);
        b(this.f, v0Var);
        b(this.h, v0Var);
        b(this.n, v0Var);
        b(this.r, v0Var);
        b(this.s, v0Var);
    }

    @Override // g5.m
    public final void close() {
        m mVar = this.v;
        if (mVar != null) {
            try {
                mVar.close();
            } finally {
                this.v = null;
            }
        }
    }

    @Override // g5.m
    public final Map getResponseHeaders() {
        m mVar = this.v;
        return mVar == null ? Collections.EMPTY_MAP : mVar.getResponseHeaders();
    }

    @Override // g5.m
    public final Uri getUri() {
        m mVar = this.v;
        if (mVar == null) {
            return null;
        }
        return mVar.getUri();
    }

    @Override // g5.m
    public final long open(p pVar) {
        h5.a.i(this.v == null);
        Uri uri = pVar.a;
        String scheme = uri.getScheme();
        int i10 = h5.d0.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    a0 a0Var = new a0(false);
                    this.d = a0Var;
                    a(a0Var);
                }
                this.v = this.d;
            } else {
                if (this.e == null) {
                    c cVar = new c(context);
                    this.e = cVar;
                    a(cVar);
                }
                this.v = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                c cVar2 = new c(context);
                this.e = cVar2;
                a(cVar2);
            }
            this.v = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                i iVar = new i(context);
                this.f = iVar;
                a(iVar);
            }
            this.v = this.f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            m mVar = this.c;
            if (equals) {
                if (this.h == null) {
                    try {
                        m mVar2 = (m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.h = mVar2;
                        a(mVar2);
                    } catch (ClassNotFoundException unused) {
                        h5.a.K("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.h == null) {
                        this.h = mVar;
                    }
                }
                this.v = this.h;
            } else if ("udp".equals(scheme)) {
                if (this.n == null) {
                    x0 x0Var = new x0();
                    this.n = x0Var;
                    a(x0Var);
                }
                this.v = this.n;
            } else if ("data".equals(scheme)) {
                if (this.r == null) {
                    k kVar = new k(false);
                    this.r = kVar;
                    a(kVar);
                }
                this.v = this.r;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.s == null) {
                    r0 r0Var = new r0(context);
                    this.s = r0Var;
                    a(r0Var);
                }
                this.v = this.s;
            } else {
                this.v = mVar;
            }
        }
        return this.v.open(pVar);
    }

    @Override // g5.j
    public final int read(byte[] bArr, int i10, int i11) {
        m mVar = this.v;
        mVar.getClass();
        return mVar.read(bArr, i10, i11);
    }
}
