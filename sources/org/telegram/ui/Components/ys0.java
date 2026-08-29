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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ys0 extends il0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ qu0 f;

    public ys0(qu0 qu0Var, Context context) {
        this.f = qu0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final void E(boolean z10) {
        qu0 qu0Var = this.f;
        long j10 = qu0Var.f1;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
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

    @Override // f2.p0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return (this.e <= 0 || i10 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        org.telegram.ui.Cells.f6 f6Var;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.f6)) {
                return;
            } else {
                f6Var = (org.telegram.ui.Cells.f6) view;
            }
        } else if (i11 != 18) {
            f6Var = null;
        } else if (!(view instanceof mt0)) {
            return;
        } else {
            f6Var = ((mt0) view).a;
        }
        org.telegram.ui.Cells.f6 f6Var2 = f6Var;
        if (f6Var2 != null) {
            ArrayList arrayList = this.d;
            f6Var2.t(arrayList.get(i10), null, null, null, false, false);
            f6Var2.I = i10 != arrayList.size() - 1;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View f6Var;
        qu0 qu0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
            f6Var = new mt0(o2Var == null ? UserConfig.selectedAccount : o2Var.getCurrentAccount(), this.c, qu0Var.f1 > 0, qu0Var.B1, new fq0(this, 3));
        } else {
            f6Var = new org.telegram.ui.Cells.f6(this.c, qu0Var.B1);
        }
        f6Var.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(f6Var);
    }
}
