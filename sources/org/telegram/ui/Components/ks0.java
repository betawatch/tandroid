package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ks0 extends sk0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ zt0 f;

    public ks0(zt0 zt0Var, Context context) {
        this.f = zt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final int d(int i10) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        zt0 zt0Var = this.f;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i10)).intValue()) : this.d.participants.participants.get(i10);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.cd.L0(2131752423, "ChannelCreator");
                        }
                        z14 = true;
                        z15 = true;
                        z13 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.cd.L0(2131752520, "ChannelAdmin");
                        }
                        z13 = channelParticipant.promoted_by == k2Var.getUserConfig().e();
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
                            str3 = org.telegram.messenger.cd.L0(2131752423, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.cd.L0(2131752520, "ChannelAdmin");
                        }
                        z12 = chatParticipant.inviter_id == k2Var.getUserConfig().e();
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
                TLRPC.User Z1 = k2Var.getMessagesController().Z1(Long.valueOf(chatParticipant.user_id));
                paVar.a(str, z10, z11, org.telegram.messenger.h20.B(Z1) && org.telegram.messenger.w3.h(k2Var.getMessagesController().L0(Long.valueOf(-zt0Var.l1))), new s50(this, Z1, str, z10, z11, z12, 1));
                paVar.d(Z1, null, null, i10 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zt0 zt0Var = this.f;
        if (i10 != 20) {
            org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(9, 0, this.c, zt0Var.H1, true, false);
            paVar.setLayoutParams(new s4.o0(-1, -2));
            return new ck0(paVar);
        }
        p3 V = zt0.V(7, zt0Var.l1, this.c, zt0Var.H1);
        V.setLayoutParams(new s4.o0(-1, -1));
        return new ck0(V);
    }
}
