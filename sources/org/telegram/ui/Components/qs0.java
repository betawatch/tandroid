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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qs0 extends yk0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ hu0 f;

    public qs0(hu0 hu0Var, Context context) {
        this.f = hu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
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

    @Override // f2.q0
    public final int j(int i10) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        hu0 hu0Var = this.f;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i10)).intValue()) : this.d.participants.participants.get(i10);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        z13 = false;
                        z14 = true;
                        z15 = true;
                    } else {
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            z13 = channelParticipant.promoted_by == n2Var.getUserConfig().getClientUserId();
                            z14 = true;
                        } else {
                            z13 = false;
                            z14 = false;
                        }
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
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        z12 = chatParticipant.inviter_id == n2Var.getUserConfig().getClientUserId();
                        str = str3;
                        z10 = true;
                        z11 = false;
                    } else {
                        str = str3;
                        z10 = false;
                        z11 = false;
                    }
                    z12 = false;
                }
                TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                saVar.a(str, z10, z11, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(n2Var.getMessagesController().getChat(Long.valueOf(-hu0Var.f1))), new v50(this, user, str, z10, z11, z12, 1));
                saVar.e(user, null, null, i10 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = this.f;
        if (i10 != 20) {
            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(9, 0, this.c, hu0Var.B1, true, false);
            saVar.setLayoutParams(new f2.y0(-1, -2));
            return new lk0(saVar);
        }
        ts0 M = hu0.M(7, hu0Var.f1, this.c, hu0Var.B1);
        M.setLayoutParams(new f2.y0(-1, -1));
        return new lk0(M);
    }
}
