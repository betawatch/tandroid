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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class od1 implements View.OnClickListener {
    public final /* synthetic */ xh0 a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ org.telegram.ui.Components.tl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.q70 e;
    public final /* synthetic */ org.telegram.ui.Components.q70 f;
    public final /* synthetic */ ud1 h;

    public od1(ud1 ud1Var, xh0 xh0Var, xn xnVar, org.telegram.ui.Components.tl0 tl0Var, LinearLayout linearLayout, org.telegram.ui.Components.q70 q70Var, org.telegram.ui.Components.q70 q70Var2) {
        this.h = ud1Var;
        this.a = xh0Var;
        this.b = xnVar;
        this.c = tl0Var;
        this.d = linearLayout;
        this.e = q70Var;
        this.f = q70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xh0 xh0Var = this.a;
        ArrayList arrayList = xh0Var.b;
        ArrayList arrayList2 = xh0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        ud1 ud1Var = this.h;
        xn xnVar = this.b;
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
            xnVar.presentFragment(new ProfileActivity(bundle, null));
            ud1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(ud1Var.getContext()), ud1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            xnVar.k1 = t6;
            t6.j = 4000;
            t6.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.tl0 tl0Var = this.c;
        tl0Var.requestLayout();
        this.d.requestLayout();
        tl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
