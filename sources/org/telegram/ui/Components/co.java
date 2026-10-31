package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class co implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ co(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = context;
        this.e = obj2;
        this.c = i10;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                go goVar = (go) this.d;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.e;
                fo foVar = (fo) this.f;
                goVar.a();
                s4.F(this.b, p6Var, new i2.q(this.c, foVar, 8));
                break;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                ep epVar = (ep) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f;
                z2Var.dismiss();
                Activity W = org.telegram.messenger.i0.W(this.b);
                if (W != null) {
                    org.telegram.messenger.vp.d1().edit().putBoolean("callmiconstart", epVar.a.q).apply();
                    org.telegram.ui.Components.voip.m1.g(W, this.c, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
