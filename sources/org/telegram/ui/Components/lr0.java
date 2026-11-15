package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lr0 extends tj0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ ys0 f;

    public lr0(ys0 ys0Var, Context context) {
        this.f = ys0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
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

    @Override // v4.h0
    public final int d(int i7) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ys0 ys0Var = this.f;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i7)).intValue()) : this.d.participants.participants.get(i7);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.hd.M0(2131752423, "ChannelCreator");
                        }
                        z14 = true;
                        z15 = true;
                        z13 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.hd.M0(2131752520, "ChannelAdmin");
                        }
                        z13 = channelParticipant.promoted_by == e2Var.getUserConfig().e();
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
                            str3 = org.telegram.messenger.hd.M0(2131752423, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.hd.M0(2131752520, "ChannelAdmin");
                        }
                        z12 = chatParticipant.inviter_id == e2Var.getUserConfig().e();
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
                TLRPC.User a22 = e2Var.getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                paVar.a(str, z10, z11, org.telegram.messenger.q10.B(a22) && org.telegram.messenger.t3.h(e2Var.getMessagesController().M0(Long.valueOf(-ys0Var.m1))), new f50(this, a22, str, z10, z11, z12, 1));
                paVar.d(a22, null, null, i7 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.f;
        if (i7 != 20) {
            org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(9, 0, this.c, ys0Var.I1, true, false);
            paVar.setLayoutParams(new v4.p0(-1, -2));
            return new cj0(paVar);
        }
        p3 X = ys0.X(7, ys0Var.m1, this.c, ys0Var.I1);
        X.setLayoutParams(new v4.p0(-1, -1));
        return new cj0(X);
    }
}
