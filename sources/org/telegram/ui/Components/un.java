package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ un(Object obj, Context context, Object obj2, int i3, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = context;
        this.e = obj2;
        this.c = i3;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                wn wnVar = (wn) this.f;
                xnVar.a();
                t4.F(this.b, e6Var, new k2.q(this.c, wnVar, 7));
                break;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.d;
                wo woVar = (wo) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f;
                t2Var.dismiss();
                Activity W = org.telegram.messenger.g0.W(this.b);
                if (W != null) {
                    org.telegram.messenger.hp.e1().edit().putBoolean("callmiconstart", woVar.a.q).apply();
                    org.telegram.ui.Components.voip.n1.g(W, this.c, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
