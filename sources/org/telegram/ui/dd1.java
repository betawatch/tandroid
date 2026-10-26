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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dd1 implements View.OnClickListener {
    public final /* synthetic */ rh0 a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.ui.Components.mm0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.k80 e;
    public final /* synthetic */ org.telegram.ui.Components.k80 f;
    public final /* synthetic */ id1 h;

    public dd1(id1 id1Var, rh0 rh0Var, un unVar, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, org.telegram.ui.Components.k80 k80Var, org.telegram.ui.Components.k80 k80Var2) {
        this.h = id1Var;
        this.a = rh0Var;
        this.b = unVar;
        this.c = mm0Var;
        this.d = linearLayout;
        this.e = k80Var;
        this.f = k80Var2;
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
        id1 id1Var = this.h;
        un unVar = this.b;
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
            unVar.presentFragment(new ProfileActivity(bundle, null));
            id1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && unVar.j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(id1Var.getContext()), id1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            unVar.z1 = t10;
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
