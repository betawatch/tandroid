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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ht0 extends rl0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ yu0 f;

    public ht0(yu0 yu0Var, Context context) {
        this.f = yu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final int j(int i10) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        yu0 yu0Var = this.f;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            TLRPC.ChatParticipant chatParticipant = !this.e.isEmpty() ? this.d.participants.participants.get(((Integer) this.e.get(i10)).intValue()) : this.d.participants.participants.get(i10);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        z12 = false;
                        z13 = true;
                        z14 = true;
                    } else {
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            z12 = channelParticipant.promoted_by == p2Var.getUserConfig().getClientUserId();
                            z13 = true;
                        } else {
                            z12 = false;
                            z13 = false;
                        }
                        z14 = false;
                    }
                    boolean z15 = z14;
                    z11 = z12;
                    z4 = z13;
                    z10 = z15;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        str = str3;
                        z4 = true;
                        z10 = true;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        z11 = chatParticipant.inviter_id == p2Var.getUserConfig().getClientUserId();
                        str = str3;
                        z4 = true;
                        z10 = false;
                    } else {
                        str = str3;
                        z4 = false;
                        z10 = false;
                    }
                    z11 = false;
                }
                TLRPC.User user = p2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                vaVar.a(str, z4, z10, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(p2Var.getMessagesController().getChat(Long.valueOf(-yu0Var.g1))), new i60(this, user, str, z4, z10, z11, 1));
                vaVar.d(user, null, null, i10 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.f;
        if (i10 != 20) {
            org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(9, 0, this.c, yu0Var.C1, true, false);
            vaVar.setLayoutParams(new f2.w0(-1, -2));
            return new el0(vaVar);
        }
        kt0 M = yu0.M(7, yu0Var.g1, this.c, yu0Var.C1);
        M.setLayoutParams(new f2.w0(-1, -1));
        return new el0(M);
    }
}
