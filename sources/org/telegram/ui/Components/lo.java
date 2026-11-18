package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lo(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
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
                po poVar = (po) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                oo ooVar = (oo) this.f;
                poVar.a();
                b5.D(this.b, i6Var, new ai.s1(this.c, ooVar, 9));
                break;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.d;
                mp mpVar = (mp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f;
                x2Var.dismiss();
                Activity W = org.telegram.messenger.g0.W(this.b);
                if (W != null) {
                    org.telegram.messenger.mp.g1().edit().putBoolean("callmiconstart", mpVar.a.q).apply();
                    org.telegram.ui.Components.voip.b2.g(W, this.c, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
