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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class st0 extends ul0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ jv0 f;

    public st0(jv0 jv0Var, Context context) {
        this.f = jv0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        jv0 jv0Var = this.f;
        long j3 = jv0Var.j1;
        org.telegram.ui.ActionBar.n2 n2Var = jv0Var.v1;
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
        org.telegram.ui.Cells.j6 j6Var;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.j6)) {
                return;
            } else {
                j6Var = (org.telegram.ui.Cells.j6) view;
            }
        } else if (i11 != 18) {
            j6Var = null;
        } else if (!(view instanceof gu0)) {
            return;
        } else {
            j6Var = ((gu0) view).a;
        }
        org.telegram.ui.Cells.j6 j6Var2 = j6Var;
        if (j6Var2 != null) {
            ArrayList arrayList = this.d;
            j6Var2.t(arrayList.get(i10), null, null, null, false, false);
            j6Var2.M = i10 != arrayList.size() - 1;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View j6Var;
        jv0 jv0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.n2 n2Var = jv0Var.v1;
            j6Var = new gu0(n2Var == null ? UserConfig.selectedAccount : n2Var.getCurrentAccount(), this.c, jv0Var.j1 > 0, jv0Var.F1, new wq0(this, 3));
        } else {
            j6Var = new org.telegram.ui.Cells.j6(this.c, jv0Var.F1);
        }
        j6Var.setLayoutParams(new s4.p0(-1, -2));
        return new fl0(j6Var);
    }
}
