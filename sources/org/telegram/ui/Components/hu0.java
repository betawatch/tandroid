package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hu0 extends lm0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ xv0 f;

    public hu0(xv0 xv0Var, Context context) {
        this.f = xv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
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
    public final int j(int i10) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        xv0 xv0Var = this.f;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.wa) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i10)).intValue()) : this.d.participants.participants.get(i10);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        z14 = true;
                        z15 = true;
                        z13 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        z13 = channelParticipant.promoted_by == o2Var.getUserConfig().getClientUserId();
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
                            str3 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        z12 = chatParticipant.inviter_id == o2Var.getUserConfig().getClientUserId();
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
                TLRPC.User user = o2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                waVar.a(str, z10, z11, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(o2Var.getMessagesController().getChat(Long.valueOf(-xv0Var.j1))), new c70(this, user, str, z10, z11, z12, 1));
                waVar.d(user, null, null, i10 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var = this.f;
        if (i10 != 20) {
            org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(9, 0, this.c, xv0Var.F1, true, false);
            waVar.setLayoutParams(new s4.o0(-1, -2));
            return new wl0(waVar);
        }
        ku0 N = xv0.N(7, xv0Var.j1, this.c, xv0Var.F1);
        N.setLayoutParams(new s4.o0(-1, -1));
        return new wl0(N);
    }
}
