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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bi implements View.OnClickListener {
    public final /* synthetic */ rh0 a;
    public final /* synthetic */ org.telegram.ui.Components.zk0 b;
    public final /* synthetic */ LinearLayout c;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ rn f;

    public bi(rn rnVar, rh0 rh0Var, org.telegram.ui.Components.zk0 zk0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = rnVar;
        this.a = rh0Var;
        this.b = zk0Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rh0 rh0Var = this.a;
        ArrayList arrayList = rh0Var.b;
        ArrayList arrayList2 = rh0Var.c;
        rn rnVar = this.f;
        if (rnVar.M8 == null || arrayList2.isEmpty()) {
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
            rnVar.presentFragment(new ProfileActivity(bundle, null));
            rnVar.A7(true);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && rnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ec t10 = new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(rnVar.getParentActivity()), rnVar.aa).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            rnVar.j1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.zk0 zk0Var = this.b;
        zk0Var.requestLayout();
        this.c.requestLayout();
        zk0Var.getAdapter().l();
        this.d.getSwipeBack().e(this.e[0]);
    }
}
