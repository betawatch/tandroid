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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ps0 extends yk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ hu0 f;

    public ps0(hu0 hu0Var, Context context) {
        this.f = hu0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final void E(boolean z10) {
        hu0 hu0Var = this.f;
        long j10 = hu0Var.f1;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
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

    @Override // f2.q0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return (this.e <= 0 || i10 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Cells.e6 e6Var;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.e6)) {
                return;
            } else {
                e6Var = (org.telegram.ui.Cells.e6) view;
            }
        } else if (i11 != 18) {
            e6Var = null;
        } else if (!(view instanceof dt0)) {
            return;
        } else {
            e6Var = ((dt0) view).a;
        }
        org.telegram.ui.Cells.e6 e6Var2 = e6Var;
        if (e6Var2 != null) {
            ArrayList arrayList = this.d;
            e6Var2.u(arrayList.get(i10), null, null, null, false, false);
            e6Var2.I = i10 != arrayList.size() - 1;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View e6Var;
        hu0 hu0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
            e6Var = new dt0(n2Var == null ? UserConfig.selectedAccount : n2Var.getCurrentAccount(), this.c, hu0Var.f1 > 0, hu0Var.B1, new up0(this, 3));
        } else {
            e6Var = new org.telegram.ui.Cells.e6(this.c, hu0Var.B1);
        }
        e6Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(e6Var);
    }
}
