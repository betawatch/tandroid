package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Utilities.Callback0Return {
    public final /* synthetic */ l4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ af.f d;

    public /* synthetic */ h0(l4 l4Var, String str, boolean[] zArr, af.f fVar) {
        this.a = l4Var;
        this.b = str;
        this.c = zArr;
        this.d = fVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        String str = this.b;
        if (!af.g.f(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        l4 l4Var = this.a;
        af.f fVar = this.d;
        if (fVar != null) {
            fVar.c = new org.telegram.messenger.voip.h(14, l4Var, fVar);
        } else {
            y3 y3Var = l4Var.H;
            if (y3Var != null) {
                y3Var.dismiss(true);
            }
        }
        af.g.r(l4Var.I, Uri.parse(str), true, true, false, fVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
