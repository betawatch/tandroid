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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class he1 implements View.OnClickListener {
    public final /* synthetic */ hi0 a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ org.telegram.ui.Components.yl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.y70 e;
    public final /* synthetic */ org.telegram.ui.Components.y70 f;
    public final /* synthetic */ me1 h;

    public he1(me1 me1Var, hi0 hi0Var, zn znVar, org.telegram.ui.Components.yl0 yl0Var, LinearLayout linearLayout, org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.h = me1Var;
        this.a = hi0Var;
        this.b = znVar;
        this.c = yl0Var;
        this.d = linearLayout;
        this.e = y70Var;
        this.f = y70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hi0 hi0Var = this.a;
        ArrayList arrayList = hi0Var.b;
        ArrayList arrayList2 = hi0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        me1 me1Var = this.h;
        zn znVar = this.b;
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
            znVar.presentFragment(new ProfileActivity(bundle, null));
            me1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.pc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(me1Var.getContext()), me1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            znVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.yl0 yl0Var = this.c;
        yl0Var.requestLayout();
        this.d.requestLayout();
        yl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
