package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ jt0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ org.telegram.messenger.fj d;
    public final /* synthetic */ int e;

    public /* synthetic */ pp0(jt0 jt0Var, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.messenger.fj fjVar) {
        this.b = jt0Var;
        this.c = h6Var;
        this.e = i7;
        this.d = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, this.b.getContext(), this.c)};
                int i7 = this.e;
                int w02 = org.telegram.messenger.zy.C(i7).w0(this.d, null, new fs(t1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.h3(new aq0(t1VarArr, i7, w02, 0), 500L);
                    break;
                }
                break;
            default:
                jt0 jt0Var = this.b;
                Context context = jt0Var.getContext();
                org.telegram.ui.ActionBar.h6 h6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.Q0 = false;
                org.telegram.messenger.fj fjVar = this.d;
                if (fjVar.c4()) {
                    t1Var.S = org.telegram.messenger.gd.N0(2131744583, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131744584, null);
                } else {
                    t1Var.S = org.telegram.messenger.gd.N0(2131744588, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131744589, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744600, null), new bg.g0(jt0Var, h6Var, fjVar, this.e, 5));
                i5.c.y(null, 2131752577, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ pp0(jt0 jt0Var, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.fj fjVar, int i7) {
        this.b = jt0Var;
        this.c = h6Var;
        this.d = fjVar;
        this.e = i7;
    }
}
