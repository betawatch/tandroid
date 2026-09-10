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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gw0 implements View.OnClickListener {
    public final /* synthetic */ gi0 a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ org.telegram.ui.Components.vl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.w70 e;
    public final /* synthetic */ org.telegram.ui.Components.w70 f;
    public final /* synthetic */ ow0 h;

    public gw0(ow0 ow0Var, gi0 gi0Var, eo eoVar, org.telegram.ui.Components.vl0 vl0Var, LinearLayout linearLayout, org.telegram.ui.Components.w70 w70Var, org.telegram.ui.Components.w70 w70Var2) {
        this.h = ow0Var;
        this.a = gi0Var;
        this.b = eoVar;
        this.c = vl0Var;
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
        ow0 ow0Var = this.h;
        eo eoVar = this.b;
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
            eoVar.presentFragment(new ProfileActivity(bundle, null));
            ow0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && eoVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.pc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(ow0Var.getContext()), ow0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            eoVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.c;
        vl0Var.requestLayout();
        this.d.requestLayout();
        vl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
