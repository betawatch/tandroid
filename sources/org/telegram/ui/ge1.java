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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ge1 implements View.OnClickListener {
    public final /* synthetic */ gi0 a;
    public final /* synthetic */ co b;
    public final /* synthetic */ org.telegram.ui.Components.ll0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.n70 e;
    public final /* synthetic */ org.telegram.ui.Components.n70 f;
    public final /* synthetic */ le1 h;

    public ge1(le1 le1Var, gi0 gi0Var, co coVar, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.h = le1Var;
        this.a = gi0Var;
        this.b = coVar;
        this.c = ll0Var;
        this.d = linearLayout;
        this.e = n70Var;
        this.f = n70Var2;
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
        le1 le1Var = this.h;
        co coVar = this.b;
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
            coVar.presentFragment(new ProfileActivity(bundle, null));
            le1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && coVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(le1Var.getContext()), le1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            coVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.ll0 ll0Var = this.c;
        ll0Var.requestLayout();
        this.d.requestLayout();
        ll0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
