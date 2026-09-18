package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fe1 implements View.OnClickListener {
    public final /* synthetic */ gi0 a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ org.telegram.ui.Components.wl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.w70 e;
    public final /* synthetic */ org.telegram.ui.Components.w70 f;
    public final /* synthetic */ ke1 h;

    public fe1(ke1 ke1Var, gi0 gi0Var, zn znVar, org.telegram.ui.Components.wl0 wl0Var, LinearLayout linearLayout, org.telegram.ui.Components.w70 w70Var, org.telegram.ui.Components.w70 w70Var2) {
        this.h = ke1Var;
        this.a = gi0Var;
        this.b = znVar;
        this.c = wl0Var;
        this.d = linearLayout;
        this.e = w70Var;
        this.f = w70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gi0 gi0Var = this.a;
        ArrayList arrayList = gi0Var.b;
        ArrayList arrayList2 = gi0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        ke1 ke1Var = this.h;
        zn znVar = this.b;
        if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
            TLObject tLObject = (TLObject) arrayList2.get(0);
            if (tLObject == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            } else if (tLObject instanceof TLRPC.Chat) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            }
            znVar.presentFragment(new ProfileActivity(bundle, null));
            ke1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(ke1Var.getContext()), ke1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            znVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.c;
        wl0Var.requestLayout();
        this.d.requestLayout();
        wl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
