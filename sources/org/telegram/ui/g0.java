package org.telegram.ui;

import android.net.Uri;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements org.telegram.messenger.j20 {
    public final /* synthetic */ h4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ gf.e d;

    public /* synthetic */ g0(h4 h4Var, String str, boolean[] zArr, gf.e eVar) {
        this.a = h4Var;
        this.b = str;
        this.c = zArr;
        this.d = eVar;
    }

    @Override // org.telegram.messenger.j20
    public final Object run() {
        String str = this.b;
        if (!gf.f.e(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.a;
        gf.e eVar = this.d;
        if (eVar != null) {
            eVar.c = new h0(0, h4Var, eVar);
        } else {
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.a(true);
            }
        }
        gf.f.q(h4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
