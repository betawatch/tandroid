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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ne1 implements View.OnClickListener {
    public final /* synthetic */ li0 a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ org.telegram.ui.Components.mm0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.m80 e;
    public final /* synthetic */ org.telegram.ui.Components.m80 f;
    public final /* synthetic */ se1 h;

    public ne1(se1 se1Var, li0 li0Var, fo foVar, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, org.telegram.ui.Components.m80 m80Var, org.telegram.ui.Components.m80 m80Var2) {
        this.h = se1Var;
        this.a = li0Var;
        this.b = foVar;
        this.c = mm0Var;
        this.d = linearLayout;
        this.e = m80Var;
        this.f = m80Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        li0 li0Var = this.a;
        ArrayList arrayList = li0Var.b;
        ArrayList arrayList2 = li0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        se1 se1Var = this.h;
        fo foVar = this.b;
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
            foVar.presentFragment(new ProfileActivity(bundle, null));
            se1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && foVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(se1Var.getContext()), se1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            foVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.mm0 mm0Var = this.c;
        mm0Var.requestLayout();
        this.d.requestLayout();
        mm0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
