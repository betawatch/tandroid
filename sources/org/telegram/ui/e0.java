package org.telegram.ui;

import android.net.Uri;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements org.telegram.messenger.o10 {
    public final /* synthetic */ g4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ vf.b d;

    public /* synthetic */ e0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.a = g4Var;
        this.b = str;
        this.c = zArr;
        this.d = bVar;
    }

    @Override // org.telegram.messenger.o10
    public final Object run() {
        String str = this.b;
        if (!vf.c.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.c = new n2.c0(25, g4Var, bVar);
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
