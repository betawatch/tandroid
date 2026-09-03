package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ko(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
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
                no noVar = (no) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                mo moVar = (mo) this.f;
                noVar.a();
                z4.G(this.b, g6Var, new hg.m2(this.c, moVar, 6));
                break;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.d;
                np npVar = (np) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f;
                h3Var.dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.a.q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.c, tL_inputGroupCallSlug, false, null, null);
                    break;
                }
                break;
        }
    }
}
