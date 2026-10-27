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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ku0 extends mm0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ bw0 f;

    public ku0(bw0 bw0Var, Context context) {
        this.f = bw0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final void E(boolean z10) {
        bw0 bw0Var = this.f;
        long j10 = bw0Var.l1;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
        if (r2Var == null) {
            return;
        }
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(r2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
            if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return;
            }
        } else if (MessagesController.getInstance(r2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
            return;
        }
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(r2Var.getCurrentAccount()).getChannelRecommendations(j10);
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
        if (!arrayList.isEmpty() && !UserConfig.getInstance(r2Var.getCurrentAccount()).isPremium()) {
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
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Cells.m6 m6Var;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.m6)) {
                return;
            } else {
                m6Var = (org.telegram.ui.Cells.m6) view;
            }
        } else if (i11 != 18) {
            m6Var = null;
        } else if (!(view instanceof yu0)) {
            return;
        } else {
            m6Var = ((yu0) view).b;
        }
        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
        if (m6Var2 != null) {
            ArrayList arrayList = this.d;
            m6Var2.s(arrayList.get(i10), null, null, null, false, false);
            m6Var2.M = i10 != arrayList.size() - 1;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View m6Var;
        bw0 bw0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
            m6Var = new yu0(r2Var == null ? UserConfig.selectedAccount : r2Var.getCurrentAccount(), this.c, bw0Var.l1 > 0, bw0Var.H1, new np0(this, 7));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(this.c, bw0Var.H1);
        }
        m6Var.setLayoutParams(new s4.q0(-1, -2));
        return new wl0(m6Var);
    }
}
