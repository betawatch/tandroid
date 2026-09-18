package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Utilities.Callback0Return {
    public final /* synthetic */ h4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ nf.e d;

    public /* synthetic */ f0(h4 h4Var, String str, boolean[] zArr, nf.e eVar) {
        this.a = h4Var;
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
        h4 h4Var = this.a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.c = new m4.g0(28, h4Var, eVar);
        } else {
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.dismiss(true);
            }
        }
        nf.f.r(h4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
