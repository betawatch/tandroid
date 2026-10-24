package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Utilities.Callback0Return {
    public final /* synthetic */ k4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ pf.c d;

    public /* synthetic */ f0(k4 k4Var, String str, boolean[] zArr, pf.c cVar) {
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
            cVar.c = new h0(0, k4Var, cVar);
        } else {
            w3 w3Var = k4Var.K;
            if (w3Var != null) {
                w3Var.dismiss(true);
            }
        }
        pf.d.q(k4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
