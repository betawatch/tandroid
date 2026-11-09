package org.telegram.ui;

import android.net.Uri;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements org.telegram.messenger.u10 {
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

    @Override // org.telegram.messenger.u10
    public final Object run() {
        String str = this.b;
        if (!vf.c.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.c = new org.telegram.ui.ActionBar.p(6, g4Var, bVar);
        } else {
            t3 t3Var = g4Var.K;
            if (t3Var != null) {
                t3Var.a(true);
            }
        }
        vf.c.s(g4Var.L, Uri.parse(str), true, true, false, bVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
