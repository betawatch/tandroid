package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bo(Object obj, Context context, Object obj2, int i9, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = context;
        this.e = obj2;
        this.c = i9;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fo foVar = (fo) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
                eo eoVar = (eo) this.f;
                foVar.a();
                y4.G(this.b, b6Var, new bg.x2(this.c, eoVar, 5));
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                dp dpVar = (dp) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f;
                f3Var.dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dpVar.a.q).apply();
                    org.telegram.ui.Components.voip.e2.h(findActivity, this.c, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
