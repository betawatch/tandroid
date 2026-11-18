package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class tr0 extends bk0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ gt0 f;

    public tr0(gt0 gt0Var, Context context) {
        this.f = gt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final int d(int i7) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        gt0 gt0Var = this.f;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.qa) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i7)).intValue()) : this.d.participants.participants.get(i7);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.gd.M0(2131752412, "ChannelCreator");
                        }
                        z14 = true;
                        z15 = true;
                        z13 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.gd.M0(2131752509, "ChannelAdmin");
                        }
                        z13 = channelParticipant.promoted_by == h2Var.getUserConfig().e();
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
                            str3 = org.telegram.messenger.gd.M0(2131752412, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.gd.M0(2131752509, "ChannelAdmin");
                        }
                        z12 = chatParticipant.inviter_id == h2Var.getUserConfig().e();
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
                TLRPC.User c22 = h2Var.getMessagesController().c2(Long.valueOf(chatParticipant.user_id));
                qaVar.a(str, z10, z11, org.telegram.messenger.o10.C(c22) && org.telegram.messenger.v3.h(h2Var.getMessagesController().O0(Long.valueOf(-gt0Var.m1))), new n50(this, c22, str, z10, z11, z12, 1));
                qaVar.d(c22, null, null, i7 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        gt0 gt0Var = this.f;
        if (i7 != 20) {
            org.telegram.ui.Cells.qa qaVar = new org.telegram.ui.Cells.qa(9, 0, this.c, gt0Var.I1, true, false);
            qaVar.setLayoutParams(new v4.q0(-1, -2));
            return new kj0(qaVar);
        }
        x3 X = gt0.X(7, gt0Var.m1, this.c, gt0Var.I1);
        X.setLayoutParams(new v4.q0(-1, -1));
        return new kj0(X);
    }
}
