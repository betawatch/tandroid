package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Utilities.Callback0Return {
    public final /* synthetic */ l4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ ve.d d;

    public /* synthetic */ h0(l4 l4Var, String str, boolean[] zArr, ve.d dVar) {
        this.a = l4Var;
        this.b = str;
        this.c = zArr;
        this.d = dVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!ve.e.f(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        l4 l4Var = this.a;
        ve.d dVar = this.d;
        if (dVar != null) {
            dVar.c = new org.telegram.messenger.voip.l0(10, l4Var, dVar);
        } else {
            y3 y3Var = l4Var.G;
            if (y3Var != null) {
                y3Var.dismiss(true);
            }
        }
        ve.e.r(l4Var.H, Uri.parse(str), true, true, false, dVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
