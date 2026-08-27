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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dv0 implements View.OnClickListener {
    public final /* synthetic */ rh0 a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ org.telegram.ui.Components.zk0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.b70 e;
    public final /* synthetic */ org.telegram.ui.Components.b70 f;
    public final /* synthetic */ jv0 h;

    public dv0(jv0 jv0Var, rh0 rh0Var, rn rnVar, org.telegram.ui.Components.zk0 zk0Var, LinearLayout linearLayout, org.telegram.ui.Components.b70 b70Var, org.telegram.ui.Components.b70 b70Var2) {
        this.h = jv0Var;
        this.a = rh0Var;
        this.b = rnVar;
        this.c = zk0Var;
        this.d = linearLayout;
        this.e = b70Var;
        this.f = b70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rh0 rh0Var = this.a;
        ArrayList arrayList = rh0Var.b;
        ArrayList arrayList2 = rh0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        jv0 jv0Var = this.h;
        rn rnVar = this.b;
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
            rnVar.presentFragment(new ProfileActivity(bundle, null));
            jv0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && rnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ec t10 = new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(jv0Var.getContext()), jv0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            rnVar.j1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.zk0 zk0Var = this.c;
        zk0Var.requestLayout();
        this.d.requestLayout();
        zk0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
