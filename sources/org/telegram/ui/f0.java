package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
