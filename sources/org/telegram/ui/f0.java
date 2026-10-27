package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Utilities.Callback0Return {
    public final /* synthetic */ j4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ qf.c d;

    public /* synthetic */ f0(j4 j4Var, String str, boolean[] zArr, qf.c cVar) {
        this.a = j4Var;
        this.b = str;
        this.c = zArr;
        this.d = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!qf.d.e(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        j4 j4Var = this.a;
        qf.c cVar = this.d;
        if (cVar != null) {
            cVar.c = new org.telegram.messenger.voip.m0(11, j4Var, cVar);
        } else {
            v3 v3Var = j4Var.K;
            if (v3Var != null) {
                v3Var.dismiss(true);
            }
        }
        qf.d.q(j4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
