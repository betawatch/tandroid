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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gt0 extends kl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ xu0 f;

    public gt0(xu0 xu0Var, Context context) {
        this.f = xu0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        xu0 xu0Var = this.f;
        long j3 = xu0Var.j1;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
        if (n2Var == null) {
            return;
        }
        if (DialogObject.isChatDialog(j3)) {
            TLRPC.Chat chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
            if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return;
            }
        } else if (MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j3)) == null) {
            return;
        }
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(n2Var.getCurrentAccount()).getChannelRecommendations(j3);
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

    @Override // s4.h0
    public final int h() {
        return this.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return (this.e <= 0 || i10 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.h6)) {
                return;
            } else {
                h6Var = (org.telegram.ui.Cells.h6) view;
            }
        } else if (i11 != 18) {
            h6Var = null;
        } else if (!(view instanceof ut0)) {
            return;
        } else {
            h6Var = ((ut0) view).a;
        }
        org.telegram.ui.Cells.h6 h6Var2 = h6Var;
        if (h6Var2 != null) {
            ArrayList arrayList = this.d;
            h6Var2.t(arrayList.get(i10), null, null, null, false, false);
            h6Var2.M = i10 != arrayList.size() - 1;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View h6Var;
        xu0 xu0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
            h6Var = new ut0(n2Var == null ? UserConfig.selectedAccount : n2Var.getCurrentAccount(), this.c, xu0Var.j1 > 0, xu0Var.F1, new jq0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.c, xu0Var.F1);
        }
        h6Var.setLayoutParams(new s4.p0(-1, -2));
        return new vk0(h6Var);
    }
}
