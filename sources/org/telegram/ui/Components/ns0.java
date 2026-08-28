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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ns0 extends vk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ eu0 f;

    public ns0(eu0 eu0Var, Context context) {
        this.f = eu0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E(boolean z10) {
        eu0 eu0Var = this.f;
        long j10 = eu0Var.f1;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        if (o2Var == null) {
            return;
        }
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
            if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return;
            }
        } else if (MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
            return;
        }
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(o2Var.getCurrentAccount()).getChannelRecommendations(j10);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i9 = 0;
        if (channelRecommendations != null) {
            for (int i10 = 0; i10 < channelRecommendations.chats.size(); i10++) {
                TLObject tLObject = channelRecommendations.chats.get(i10);
                if ((tLObject instanceof TLRPC.Chat) && ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                    arrayList.add(tLObject);
                } else {
                    arrayList.add(tLObject);
                }
            }
        }
        if (!arrayList.isEmpty() && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
            i9 = channelRecommendations.more;
        }
        this.e = i9;
        if (z10) {
            l();
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return (this.e <= 0 || i9 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Cells.h6 h6Var;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.h6)) {
                return;
            } else {
                h6Var = (org.telegram.ui.Cells.h6) view;
            }
        } else if (i10 != 18) {
            h6Var = null;
        } else if (!(view instanceof bt0)) {
            return;
        } else {
            h6Var = ((bt0) view).a;
        }
        org.telegram.ui.Cells.h6 h6Var2 = h6Var;
        if (h6Var2 != null) {
            ArrayList arrayList = this.d;
            h6Var2.t(arrayList.get(i9), null, null, null, false, false);
            h6Var2.I = i9 != arrayList.size() - 1;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View h6Var;
        eu0 eu0Var = this.f;
        if (i9 == 18) {
            org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
            h6Var = new bt0(o2Var == null ? UserConfig.selectedAccount : o2Var.getCurrentAccount(), this.c, eu0Var.f1 > 0, eu0Var.B1, new tp0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.c, eu0Var.B1);
        }
        h6Var.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(h6Var);
    }
}
