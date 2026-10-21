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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class lv0 implements View.OnClickListener {
    public final /* synthetic */ qh0 a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ org.telegram.ui.Components.jm0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.i80 e;
    public final /* synthetic */ org.telegram.ui.Components.i80 f;
    public final /* synthetic */ qv0 h;

    public lv0(qv0 qv0Var, qh0 qh0Var, qn qnVar, org.telegram.ui.Components.jm0 jm0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = qv0Var;
        this.a = qh0Var;
        this.b = qnVar;
        this.c = jm0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f = i80Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qh0 qh0Var = this.a;
        ArrayList arrayList = qh0Var.b;
        ArrayList arrayList2 = qh0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        qv0 qv0Var = this.h;
        qn qnVar = this.b;
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
            qnVar.presentFragment(new ProfileActivity(bundle, null));
            qv0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && qnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qv0Var.getContext()), qv0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            qnVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.jm0 jm0Var = this.c;
        jm0Var.requestLayout();
        this.d.requestLayout();
        jm0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
