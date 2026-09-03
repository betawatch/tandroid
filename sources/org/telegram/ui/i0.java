package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Utilities.Callback0Return {
    public final /* synthetic */ n4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ ze.c d;

    public /* synthetic */ i0(n4 n4Var, String str, boolean[] zArr, ze.c cVar) {
        this.a = n4Var;
        this.b = str;
        this.c = zArr;
        this.d = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!ze.d.f(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        n4 n4Var = this.a;
        ze.c cVar = this.d;
        if (cVar != null) {
            cVar.c = new org.telegram.messenger.voip.h(15, n4Var, cVar);
        } else {
            a4 a4Var = n4Var.H;
            if (a4Var != null) {
                a4Var.dismiss(true);
            }
        }
        ze.d.r(n4Var.I, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
