package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oo(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
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
                ro roVar = (ro) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                qo qoVar = (qo) this.f;
                roVar.a();
                e5.G(this.b, d6Var, new i2.s(this.c, qoVar, 7));
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                pp ppVar = (pp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f;
                e3Var.dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", ppVar.a.q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.c, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
