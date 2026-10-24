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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ov0 implements View.OnClickListener {
    public final /* synthetic */ uh0 a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ org.telegram.ui.Components.mm0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.j80 e;
    public final /* synthetic */ org.telegram.ui.Components.j80 f;
    public final /* synthetic */ uv0 h;

    public ov0(uv0 uv0Var, uh0 uh0Var, sn snVar, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, org.telegram.ui.Components.j80 j80Var, org.telegram.ui.Components.j80 j80Var2) {
        this.h = uv0Var;
        this.a = uh0Var;
        this.b = snVar;
        this.c = mm0Var;
        this.d = linearLayout;
        this.e = j80Var;
        this.f = j80Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uh0 uh0Var = this.a;
        ArrayList arrayList = uh0Var.b;
        ArrayList arrayList2 = uh0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        uv0 uv0Var = this.h;
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
            uv0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && snVar.j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(uv0Var.getContext()), uv0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            snVar.z1 = t10;
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
