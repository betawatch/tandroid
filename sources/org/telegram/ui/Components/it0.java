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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class it0 extends ll0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ zu0 f;

    public it0(zu0 zu0Var, Context context) {
        this.f = zu0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        zu0 zu0Var = this.f;
        long j3 = zu0Var.j1;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        if (o2Var == null) {
            return;
        }
        if (DialogObject.isChatDialog(j3)) {
            TLRPC.Chat chat = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
            if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return;
            }
        } else if (MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j3)) == null) {
            return;
        }
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(o2Var.getCurrentAccount()).getChannelRecommendations(j3);
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
        if (!arrayList.isEmpty() && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
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
        } else if (!(view instanceof wt0)) {
            return;
        } else {
            h6Var = ((wt0) view).a;
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
        zu0 zu0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
            h6Var = new wt0(o2Var == null ? UserConfig.selectedAccount : o2Var.getCurrentAccount(), this.c, zu0Var.j1 > 0, zu0Var.F1, new kq0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.c, zu0Var.F1);
        }
        h6Var.setLayoutParams(new s4.p0(-1, -2));
        return new wk0(h6Var);
    }
}
