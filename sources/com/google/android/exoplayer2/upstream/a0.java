package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 implements l {
    public final we.b a = new we.b(13, (byte) 0);
    public final String b;
    public final y0 c;
    public final int d;
    public final int e;
    public final boolean f;

    public a0(String str, y0 y0Var) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.b = str;
        this.c = y0Var;
        this.d = 8000;
        this.e = 8000;
        this.f = true;
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public final m createDataSource() {
        z zVar = new z(this.b, this.d, this.e, this.f, this.a, 0);
        y0 y0Var = this.c;
        if (y0Var != null) {
            zVar.addTransferListener(y0Var);
        }
        return zVar;
    }
}
