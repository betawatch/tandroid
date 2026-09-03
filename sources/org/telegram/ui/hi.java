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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hi implements View.OnClickListener {
    public final /* synthetic */ xh0 a;
    public final /* synthetic */ org.telegram.ui.Components.sl0 b;
    public final /* synthetic */ LinearLayout c;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ xn f;

    public hi(xn xnVar, xh0 xh0Var, org.telegram.ui.Components.sl0 sl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = xnVar;
        this.a = xh0Var;
        this.b = sl0Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xh0 xh0Var = this.a;
        ArrayList arrayList = xh0Var.b;
        ArrayList arrayList2 = xh0Var.c;
        xn xnVar = this.f;
        if (xnVar.N8 == null || arrayList2.isEmpty()) {
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
            xnVar.presentFragment(new ProfileActivity(bundle, null));
            xnVar.A7(true);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.ba).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            xnVar.k1 = t6;
            t6.j = 4000;
            t6.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.b;
        sl0Var.requestLayout();
        this.c.requestLayout();
        sl0Var.getAdapter().l();
        this.d.getSwipeBack().e(this.e[0]);
    }
}
