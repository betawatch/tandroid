package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Utilities.Callback0Return {
    public final /* synthetic */ k4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ pf.c d;

    public /* synthetic */ g0(k4 k4Var, String str, boolean[] zArr, pf.c cVar) {
        this.a = k4Var;
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
        k4 k4Var = this.a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.c = new org.telegram.messenger.voip.p0(11, k4Var, cVar);
        } else {
            x3 x3Var = k4Var.K;
            if (x3Var != null) {
                x3Var.dismiss(true);
            }
        }
        pf.d.q(k4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
