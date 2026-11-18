package org.telegram.ui;

import android.net.Uri;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements org.telegram.messenger.p10 {
    public final /* synthetic */ g4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ vf.b d;

    public /* synthetic */ f0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.a = g4Var;
        this.b = str;
        this.c = zArr;
        this.d = bVar;
    }

    @Override // org.telegram.messenger.p10
    public final Object run() {
        String str = this.b;
        if (!vf.c.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.c = new oi.s2(21, g4Var, bVar);
        } else {
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.a(true);
            }
        }
        vf.c.s(g4Var.M, Uri.parse(str), true, true, false, bVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
