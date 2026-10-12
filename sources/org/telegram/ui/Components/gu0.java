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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gu0 extends lm0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ xv0 f;

    public gu0(xv0 xv0Var, Context context) {
        this.f = xv0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(boolean z10) {
        xv0 xv0Var = this.f;
        long j10 = xv0Var.j1;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
        if (m2Var == null) {
            return;
        }
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(m2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
            if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return;
            }
        } else if (MessagesController.getInstance(m2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
            return;
        }
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(m2Var.getCurrentAccount()).getChannelRecommendations(j10);
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
        if (!arrayList.isEmpty() && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
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
        org.telegram.ui.Cells.i6 i6Var;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.i6)) {
                return;
            } else {
                i6Var = (org.telegram.ui.Cells.i6) view;
            }
        } else if (i11 != 18) {
            i6Var = null;
        } else if (!(view instanceof uu0)) {
            return;
        } else {
            i6Var = ((uu0) view).a;
        }
        org.telegram.ui.Cells.i6 i6Var2 = i6Var;
        if (i6Var2 != null) {
            ArrayList arrayList = this.d;
            i6Var2.u(arrayList.get(i10), null, null, null, false, false);
            i6Var2.M = i10 != arrayList.size() - 1;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View i6Var;
        xv0 xv0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
            i6Var = new uu0(m2Var == null ? UserConfig.selectedAccount : m2Var.getCurrentAccount(), this.c, xv0Var.j1 > 0, xv0Var.F1, new lr0(this, 4));
        } else {
            i6Var = new org.telegram.ui.Cells.i6(this.c, xv0Var.F1);
        }
        i6Var.setLayoutParams(new s4.o0(-1, -2));
        return new wl0(i6Var);
    }
}
