package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Utilities.Callback0Return {
    public final /* synthetic */ m4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ ye.c d;

    public /* synthetic */ i0(m4 m4Var, String str, boolean[] zArr, ye.c cVar) {
        this.a = m4Var;
        this.b = str;
        this.c = zArr;
        this.d = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!ye.d.f(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        m4 m4Var = this.a;
        ye.c cVar = this.d;
        if (cVar != null) {
            cVar.c = new org.telegram.ui.ActionBar.c(7, m4Var, cVar);
        } else {
            z3 z3Var = m4Var.G;
            if (z3Var != null) {
                z3Var.dismiss(true);
            }
        }
        ye.d.r(m4Var.H, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
