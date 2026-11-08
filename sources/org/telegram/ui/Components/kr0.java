package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class kr0 extends oj0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ xs0 f;

    public kr0(xs0 xs0Var, Context context) {
        this.f = xs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
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

    @Override // v4.g0
    public final int d(int i7) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        xs0 xs0Var = this.f;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i7)).intValue()) : this.d.participants.participants.get(i7);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.id.M0(2131752423, "ChannelCreator");
                        }
                        z13 = true;
                        z14 = true;
                        z12 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.id.M0(2131752520, "ChannelAdmin");
                        }
                        z12 = channelParticipant.promoted_by == f2Var.getUserConfig().e();
                        z13 = true;
                        z14 = false;
                    } else {
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    }
                    boolean z15 = z14;
                    z11 = z12;
                    z9 = z13;
                    z10 = z15;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.id.M0(2131752423, "ChannelCreator");
                        }
                        str = str3;
                        z9 = true;
                        z10 = true;
                        z11 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.id.M0(2131752520, "ChannelAdmin");
                        }
                        z11 = chatParticipant.inviter_id == f2Var.getUserConfig().e();
                        str = str3;
                        z9 = true;
                        z10 = false;
                    } else {
                        str = str3;
                        z9 = false;
                        z10 = false;
                        z11 = false;
                    }
                }
                TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                paVar.a(str, z9, z10, org.telegram.messenger.t10.B(a22) && org.telegram.messenger.t3.h(f2Var.getMessagesController().M0(Long.valueOf(-xs0Var.l1))), new c50(this, a22, str, z9, z10, z11, 1));
                paVar.d(a22, null, null, i7 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        xs0 xs0Var = this.f;
        if (i7 != 20) {
            org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(9, 0, this.c, xs0Var.H1, true, false);
            paVar.setLayoutParams(new v4.o0(-1, -2));
            return new xi0(paVar);
        }
        r3 X = xs0.X(7, xs0Var.l1, this.c, xs0Var.H1);
        X.setLayoutParams(new v4.o0(-1, -1));
        return new xi0(X);
    }
}
