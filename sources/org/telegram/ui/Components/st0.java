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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class st0 extends vl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ jv0 f;

    public st0(jv0 jv0Var, Context context) {
        this.f = jv0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        jv0 jv0Var = this.f;
        long j3 = jv0Var.j1;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
        if (m2Var == null) {
            return;
        }
        if (DialogObject.isChatDialog(j3)) {
            TLRPC.Chat chat = MessagesController.getInstance(m2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
            if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return;
            }
        } else if (MessagesController.getInstance(m2Var.getCurrentAccount()).getUser(Long.valueOf(j3)) == null) {
            return;
        }
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(m2Var.getCurrentAccount()).getChannelRecommendations(j3);
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
        org.telegram.ui.Cells.i6 i6Var;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.i6)) {
                return;
            } else {
                i6Var = (org.telegram.ui.Cells.i6) view;
            }
        } else if (i11 != 18) {
            i6Var = null;
        } else if (!(view instanceof gu0)) {
            return;
        } else {
            i6Var = ((gu0) view).a;
        }
        org.telegram.ui.Cells.i6 i6Var2 = i6Var;
        if (i6Var2 != null) {
            ArrayList arrayList = this.d;
            i6Var2.t(arrayList.get(i10), null, null, null, false, false);
            i6Var2.M = i10 != arrayList.size() - 1;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View i6Var;
        jv0 jv0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
            i6Var = new gu0(m2Var == null ? UserConfig.selectedAccount : m2Var.getCurrentAccount(), this.c, jv0Var.j1 > 0, jv0Var.F1, new wq0(this, 4));
        } else {
            i6Var = new org.telegram.ui.Cells.i6(this.c, jv0Var.F1);
        }
        i6Var.setLayoutParams(new s4.p0(-1, -2));
        return new gl0(i6Var);
    }
}
