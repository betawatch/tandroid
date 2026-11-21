package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class vr0 extends dk0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ jt0 f;

    public vr0(jt0 jt0Var, Context context) {
        this.f = jt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
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
        jt0 jt0Var = this.f;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.ra) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i7)).intValue()) : this.d.participants.participants.get(i7);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.gd.N0(2131752411, "ChannelCreator");
                        }
                        z14 = true;
                        z15 = true;
                        z13 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.gd.N0(2131752508, "ChannelAdmin");
                        }
                        z13 = channelParticipant.promoted_by == g2Var.getUserConfig().e();
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
                            str3 = org.telegram.messenger.gd.N0(2131752411, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.gd.N0(2131752508, "ChannelAdmin");
                        }
                        z12 = chatParticipant.inviter_id == g2Var.getUserConfig().e();
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
                TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(chatParticipant.user_id));
                raVar.a(str, z10, z11, org.telegram.messenger.o10.C(c22) && org.telegram.messenger.v3.h(g2Var.getMessagesController().O0(Long.valueOf(-jt0Var.m1))), new q50(this, c22, str, z10, z11, z12, 1));
                raVar.d(c22, null, null, i7 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jt0 jt0Var = this.f;
        if (i7 != 20) {
            org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(9, 0, this.c, jt0Var.I1, true, false);
            raVar.setLayoutParams(new v4.q0(-1, -2));
            return new mj0(raVar);
        }
        y3 X = jt0.X(7, jt0Var.m1, this.c, jt0Var.I1);
        X.setLayoutParams(new v4.q0(-1, -1));
        return new mj0(X);
    }
}
