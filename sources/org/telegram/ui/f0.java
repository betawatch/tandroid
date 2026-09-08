package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Utilities.Callback0Return {
    public final /* synthetic */ i4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ of.e d;

    public /* synthetic */ f0(i4 i4Var, String str, boolean[] zArr, of.e eVar) {
        this.a = i4Var;
        this.b = str;
        this.c = zArr;
        this.d = eVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!of.f.f(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.a;
        of.e eVar = this.d;
        if (eVar != null) {
            eVar.c = new org.telegram.ui.ActionBar.c6(4, i4Var, eVar);
        } else {
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.dismiss(true);
            }
        }
        of.f.r(i4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
