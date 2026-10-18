package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Utilities.Callback0Return {
    public final /* synthetic */ l4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ pf.c d;

    public /* synthetic */ g0(l4 l4Var, String str, boolean[] zArr, pf.c cVar) {
        this.a = l4Var;
        this.b = str;
        this.c = zArr;
        this.d = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!pf.d.e(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        l4 l4Var = this.a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.c = new i0(0, l4Var, cVar);
        } else {
            x3 x3Var = l4Var.K;
            if (x3Var != null) {
                x3Var.dismiss(true);
            }
        }
        pf.d.q(l4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
