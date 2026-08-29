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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cv0 implements View.OnClickListener {
    public final /* synthetic */ oh0 a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ org.telegram.ui.Components.jl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.j70 e;
    public final /* synthetic */ org.telegram.ui.Components.j70 f;
    public final /* synthetic */ iv0 h;

    public cv0(iv0 iv0Var, oh0 oh0Var, tn tnVar, org.telegram.ui.Components.jl0 jl0Var, LinearLayout linearLayout, org.telegram.ui.Components.j70 j70Var, org.telegram.ui.Components.j70 j70Var2) {
        this.h = iv0Var;
        this.a = oh0Var;
        this.b = tnVar;
        this.c = jl0Var;
        this.d = linearLayout;
        this.e = j70Var;
        this.f = j70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        oh0 oh0Var = this.a;
        ArrayList arrayList = oh0Var.b;
        ArrayList arrayList2 = oh0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        iv0 iv0Var = this.h;
        tn tnVar = this.b;
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
            tnVar.presentFragment(new ProfileActivity(bundle, null));
            iv0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && tnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.mc t10 = new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(iv0Var.getContext()), iv0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            tnVar.j1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.jl0 jl0Var = this.c;
        jl0Var.requestLayout();
        this.d.requestLayout();
        jl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
