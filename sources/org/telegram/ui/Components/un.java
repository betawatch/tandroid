package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ un(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = context;
        this.e = obj2;
        this.c = i7;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.d;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.e;
                wn wnVar = (wn) this.f;
                xnVar.a();
                u4.D(this.b, h6Var, new l2.q(this.c, wnVar, 6));
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.d;
                wo woVar = (wo) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f;
                w2Var.dismiss();
                Activity W = org.telegram.messenger.g0.W(this.b);
                if (W != null) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.a.q).apply();
                    org.telegram.ui.Components.voip.y1.g(W, this.c, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
