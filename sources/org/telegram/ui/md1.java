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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class md1 implements View.OnClickListener {
    public final /* synthetic */ wh0 a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ org.telegram.ui.Components.sl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.o70 e;
    public final /* synthetic */ org.telegram.ui.Components.o70 f;
    public final /* synthetic */ rd1 h;

    public md1(rd1 rd1Var, wh0 wh0Var, xn xnVar, org.telegram.ui.Components.sl0 sl0Var, LinearLayout linearLayout, org.telegram.ui.Components.o70 o70Var, org.telegram.ui.Components.o70 o70Var2) {
        this.h = rd1Var;
        this.a = wh0Var;
        this.b = xnVar;
        this.c = sl0Var;
        this.d = linearLayout;
        this.e = o70Var;
        this.f = o70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wh0 wh0Var = this.a;
        ArrayList arrayList = wh0Var.b;
        ArrayList arrayList2 = wh0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        rd1 rd1Var = this.h;
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
            rd1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(rd1Var.getContext()), rd1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            xnVar.k1 = t6;
            t6.j = 4000;
            t6.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.c;
        sl0Var.requestLayout();
        this.d.requestLayout();
        sl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
