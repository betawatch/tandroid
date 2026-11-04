package org.telegram.ui;

import android.net.Uri;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements org.telegram.messenger.m10 {
    public final /* synthetic */ i4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ sf.b d;

    public /* synthetic */ g0(i4 i4Var, String str, boolean[] zArr, sf.b bVar) {
        this.a = i4Var;
        this.b = str;
        this.c = zArr;
        this.d = bVar;
    }

    @Override // org.telegram.messenger.m10
    public final Object run() {
        String str = this.b;
        if (!sf.c.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.a;
        sf.b bVar = this.d;
        if (bVar != null) {
            bVar.c = new org.telegram.messenger.voip.l0(11, i4Var, bVar);
        } else {
            u3 u3Var = i4Var.L;
            if (u3Var != null) {
                u3Var.a(true);
            }
        }
        sf.c.s(i4Var.M, Uri.parse(str), true, true, false, bVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
