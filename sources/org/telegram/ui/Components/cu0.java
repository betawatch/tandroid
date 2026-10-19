package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class cu0 extends hm0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ tv0 f;

    public cu0(tv0 tv0Var, Context context) {
        this.f = tv0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(boolean z10) {
        tv0 tv0Var = this.f;
        long j10 = tv0Var.j1;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
        if (n2Var == null) {
            return;
        }
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
            if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return;
            }
        } else if (MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
            return;
        }
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(n2Var.getCurrentAccount()).getChannelRecommendations(j10);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        if (channelRecommendations != null) {
            for (int i11 = 0; i11 < channelRecommendations.chats.size(); i11++) {
                TLObject tLObject = channelRecommendations.chats.get(i11);
                if ((tLObject instanceof TLRPC.Chat) && ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                    arrayList.add(tLObject);
                } else {
                    arrayList.add(tLObject);
                }
            }
        }
        if (!arrayList.isEmpty() && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            i10 = channelRecommendations.more;
        }
        this.e = i10;
        if (z10) {
            l();
        }
    }

    @Override // s4.g0
    public final int h() {
        return this.d.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return (this.e <= 0 || i10 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.h6)) {
                return;
            } else {
                h6Var = (org.telegram.ui.Cells.h6) view;
            }
        } else if (i11 != 18) {
            h6Var = null;
        } else if (!(view instanceof qu0)) {
            return;
        } else {
            h6Var = ((qu0) view).a;
        }
        org.telegram.ui.Cells.h6 h6Var2 = h6Var;
        if (h6Var2 != null) {
            ArrayList arrayList = this.d;
            h6Var2.u(arrayList.get(i10), null, null, null, false, false);
            h6Var2.M = i10 != arrayList.size() - 1;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View h6Var;
        tv0 tv0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
            h6Var = new qu0(n2Var == null ? UserConfig.selectedAccount : n2Var.getCurrentAccount(), this.c, tv0Var.j1 > 0, tv0Var.F1, new gr0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.c, tv0Var.F1);
        }
        h6Var.setLayoutParams(new s4.o0(-1, -2));
        return new sl0(h6Var);
    }
}
