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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class li implements View.OnClickListener {
    public final /* synthetic */ fi0 a;
    public final /* synthetic */ org.telegram.ui.Components.ll0 b;
    public final /* synthetic */ LinearLayout c;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ bo f;

    public li(bo boVar, fi0 fi0Var, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = boVar;
        this.a = fi0Var;
        this.b = ll0Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fi0 fi0Var = this.a;
        ArrayList arrayList = fi0Var.b;
        ArrayList arrayList2 = fi0Var.c;
        bo boVar = this.f;
        if (boVar.Q8 == null || arrayList2.isEmpty()) {
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
            boVar.presentFragment(new ProfileActivity(bundle, null));
            boVar.A7(true);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && boVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.oc t10 = new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            boVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.ll0 ll0Var = this.b;
        ll0Var.requestLayout();
        this.c.requestLayout();
        ll0Var.getAdapter().l();
        this.d.getSwipeBack().e(this.e[0]);
    }
}
