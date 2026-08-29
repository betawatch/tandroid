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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ci implements View.OnClickListener {
    public final /* synthetic */ oh0 a;
    public final /* synthetic */ org.telegram.ui.Components.jl0 b;
    public final /* synthetic */ LinearLayout c;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ tn f;

    public ci(tn tnVar, oh0 oh0Var, org.telegram.ui.Components.jl0 jl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = tnVar;
        this.a = oh0Var;
        this.b = jl0Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        oh0 oh0Var = this.a;
        ArrayList arrayList = oh0Var.b;
        ArrayList arrayList2 = oh0Var.c;
        tn tnVar = this.f;
        if (tnVar.M8 == null || arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
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
            tnVar.A7(true);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && tnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.mc t10 = new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.aa).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            tnVar.j1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.jl0 jl0Var = this.b;
        jl0Var.requestLayout();
        this.c.requestLayout();
        jl0Var.getAdapter().l();
        this.d.getSwipeBack().e(this.e[0]);
    }
}
