package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Utilities.Callback0Return {
    public final /* synthetic */ j4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ nf.e d;

    public /* synthetic */ g0(j4 j4Var, String str, boolean[] zArr, nf.e eVar) {
        this.a = j4Var;
        this.b = str;
        this.c = zArr;
        this.d = eVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!nf.f.f(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        j4 j4Var = this.a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.c = new n(1, j4Var, eVar);
        } else {
            w3 w3Var = j4Var.K;
            if (w3Var != null) {
                w3Var.dismiss(true);
            }
        }
        nf.f.r(j4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
