package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v implements m {
    public final Context a;
    public final ArrayList b;
    public final m c;
    public d0 d;
    public c e;
    public i f;
    public m h;
    public a1 n;
    public k r;
    public RawResourceDataSource s;
    public m v;

    public v(Context context, m mVar) {
        this.a = context.getApplicationContext();
        mVar.getClass();
        this.c = mVar;
        this.b = new ArrayList();
    }

    public static void c(m mVar, y0 y0Var) {
        if (mVar != null) {
            mVar.addTransferListener(y0Var);
        }
    }

    public final void a(m mVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            mVar.addTransferListener((y0) arrayList.get(i10));
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void addTransferListener(y0 y0Var) {
        y0Var.getClass();
        this.c.addTransferListener(y0Var);
        this.b.add(y0Var);
        c(this.d, y0Var);
        c(this.e, y0Var);
        c(this.f, y0Var);
        c(this.h, y0Var);
        c(this.n, y0Var);
        c(this.r, y0Var);
        c(this.s, y0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.m
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

    @Override // com.google.android.exoplayer2.upstream.m
    public final Map getResponseHeaders() {
        m mVar = this.v;
        return mVar == null ? Collections.EMPTY_MAP : mVar.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        m mVar = this.v;
        if (mVar == null) {
            return null;
        }
        return mVar.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final long open(q qVar) {
        d5.a.i(this.v == null);
        String scheme = qVar.a.getScheme();
        Uri uri = qVar.a;
        int i10 = d5.g0.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = qVar.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    d0 d0Var = new d0(false);
                    this.d = d0Var;
                    a(d0Var);
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
                        d5.a.K("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e9) {
                        throw new RuntimeException("Error instantiating RTMP extension", e9);
                    }
                    if (this.h == null) {
                        this.h = mVar;
                    }
                }
                this.v = this.h;
            } else if ("udp".equals(scheme)) {
                if (this.n == null) {
                    a1 a1Var = new a1();
                    this.n = a1Var;
                    a(a1Var);
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
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.s = rawResourceDataSource;
                    a(rawResourceDataSource);
                }
                this.v = this.s;
            } else {
                this.v = mVar;
            }
        }
        return this.v.open(qVar);
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i10, int i11) {
        m mVar = this.v;
        mVar.getClass();
        return mVar.read(bArr, i10, i11);
    }
}
