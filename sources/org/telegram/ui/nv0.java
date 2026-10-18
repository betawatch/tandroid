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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class nv0 implements View.OnClickListener {
    public final /* synthetic */ rh0 a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ org.telegram.ui.Components.im0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.i80 e;
    public final /* synthetic */ org.telegram.ui.Components.i80 f;
    public final /* synthetic */ sv0 h;

    public nv0(sv0 sv0Var, rh0 rh0Var, sn snVar, org.telegram.ui.Components.im0 im0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = sv0Var;
        this.a = rh0Var;
        this.b = snVar;
        this.c = im0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f = i80Var2;
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
        sv0 sv0Var = this.h;
        sn snVar = this.b;
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
            snVar.presentFragment(new ProfileActivity(bundle, null));
            sv0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && snVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(sv0Var.getContext()), sv0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            snVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.im0 im0Var = this.c;
        im0Var.requestLayout();
        this.d.requestLayout();
        im0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
