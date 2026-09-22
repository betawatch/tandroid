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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fw0 implements View.OnClickListener {
    public final /* synthetic */ fi0 a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ org.telegram.ui.Components.ll0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.n70 e;
    public final /* synthetic */ org.telegram.ui.Components.n70 f;
    public final /* synthetic */ mw0 h;

    public fw0(mw0 mw0Var, fi0 fi0Var, bo boVar, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.h = mw0Var;
        this.a = fi0Var;
        this.b = boVar;
        this.c = ll0Var;
        this.d = linearLayout;
        this.e = n70Var;
        this.f = n70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fi0 fi0Var = this.a;
        ArrayList arrayList = fi0Var.b;
        ArrayList arrayList2 = fi0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        mw0 mw0Var = this.h;
        bo boVar = this.b;
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
            boVar.presentFragment(new ProfileActivity(bundle, null));
            mw0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && boVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.oc t10 = new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(mw0Var.getContext()), mw0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            boVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.ll0 ll0Var = this.c;
        ll0Var.requestLayout();
        this.d.requestLayout();
        ll0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
