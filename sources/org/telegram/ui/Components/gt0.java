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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gt0 extends rl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ yu0 f;

    public gt0(yu0 yu0Var, Context context) {
        this.f = yu0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E(boolean z4) {
        yu0 yu0Var = this.f;
        long j10 = yu0Var.g1;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        if (p2Var == null) {
            return;
        }
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
            if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return;
            }
        } else if (MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
            return;
        }
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(p2Var.getCurrentAccount()).getChannelRecommendations(j10);
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
        if (!arrayList.isEmpty() && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
            i10 = channelRecommendations.more;
        }
        this.e = i10;
        if (z4) {
            l();
        }
    }

    @Override // f2.o0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return (this.e <= 0 || i10 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        int i11 = l1Var.f;
        View view = l1Var.a;
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
            h6Var2.J = i10 != arrayList.size() - 1;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View h6Var;
        yu0 yu0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
            h6Var = new ut0(p2Var == null ? UserConfig.selectedAccount : p2Var.getCurrentAccount(), this.c, yu0Var.g1 > 0, yu0Var.C1, new nq0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.c, yu0Var.C1);
        }
        h6Var.setLayoutParams(new f2.w0(-1, -2));
        return new el0(h6Var);
    }
}
