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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class os0 extends vk0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ eu0 f;

    public os0(eu0 eu0Var, Context context) {
        this.f = eu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
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

    @Override // f2.r0
    public final int j(int i9) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        eu0 eu0Var = this.f;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i9)).intValue()) : this.d.participants.participants.get(i9);
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
                            z13 = channelParticipant.promoted_by == o2Var.getUserConfig().getClientUserId();
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
                        z12 = chatParticipant.inviter_id == o2Var.getUserConfig().getClientUserId();
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
                TLRPC.User user = o2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                vaVar.a(str, z10, z11, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(o2Var.getMessagesController().getChat(Long.valueOf(-eu0Var.f1))), new q50(this, user, str, z10, z11, z12, 1));
                vaVar.e(user, null, null, i9 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        eu0 eu0Var = this.f;
        if (i9 != 20) {
            org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(9, 0, this.c, eu0Var.B1, true, false);
            vaVar.setLayoutParams(new f2.a1(-1, -2));
            return new ik0(vaVar);
        }
        rs0 M = eu0.M(7, eu0Var.f1, this.c, eu0Var.B1);
        M.setLayoutParams(new f2.a1(-1, -1));
        return new ik0(M);
    }
}
