package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jr0 extends sj0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ ws0 f;

    public jr0(ws0 ws0Var, Context context) {
        this.f = ws0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 1;
        }
        TLRPC.ChatFull chatFull2 = this.d;
        if (chatFull2 != null) {
            return chatFull2.participants.participants.size();
        }
        return 0;
    }

    @Override // u4.h0
    public final int d(int i3) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ws0 ws0Var = this.f;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i3)).intValue()) : this.d.participants.participants.get(i3);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.bd.M0(2131752423, "ChannelCreator");
                        }
                        z14 = true;
                        z15 = true;
                        z13 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.bd.M0(2131752520, "ChannelAdmin");
                        }
                        z13 = channelParticipant.promoted_by == d2Var.getUserConfig().e();
                        z14 = true;
                        z15 = false;
                    } else {
                        z13 = false;
                        z14 = false;
                        z15 = false;
                    }
                    boolean z16 = z15;
                    z12 = z13;
                    z10 = z14;
                    z11 = z16;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.bd.M0(2131752423, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.bd.M0(2131752520, "ChannelAdmin");
                        }
                        z12 = chatParticipant.inviter_id == d2Var.getUserConfig().e();
                        str = str3;
                        z10 = true;
                        z11 = false;
                    } else {
                        str = str3;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                    }
                }
                TLRPC.User a22 = d2Var.getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                paVar.a(str, z10, z11, org.telegram.messenger.l10.B(a22) && org.telegram.messenger.t3.h(d2Var.getMessagesController().M0(Long.valueOf(-ws0Var.m1))), new y40(this, a22, str, z10, z11, z12, 1));
                paVar.d(a22, null, null, i3 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ws0 ws0Var = this.f;
        if (i3 != 20) {
            org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(9, 0, this.c, ws0Var.I1, true, false);
            paVar.setLayoutParams(new u4.p0(-1, -2));
            return new bj0(paVar);
        }
        p3 X = ws0.X(7, ws0Var.m1, this.c, ws0Var.I1);
        X.setLayoutParams(new u4.p0(-1, -1));
        return new bj0(X);
    }
}
