package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Utilities.Callback0Return {
    public final /* synthetic */ m4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ we.d d;

    public /* synthetic */ i0(m4 m4Var, String str, boolean[] zArr, we.d dVar) {
        this.a = m4Var;
        this.b = str;
        this.c = zArr;
        this.d = dVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!we.e.f(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        m4 m4Var = this.a;
        we.d dVar = this.d;
        if (dVar != null) {
            dVar.c = new org.telegram.messenger.voip.l0(10, m4Var, dVar);
        } else {
            z3 z3Var = m4Var.G;
            if (z3Var != null) {
                z3Var.dismiss(true);
            }
        }
        we.e.r(m4Var.H, Uri.parse(str), true, true, false, dVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
