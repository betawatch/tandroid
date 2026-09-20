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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class tt0 extends ul0 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ jv0 f;

    public tt0(jv0 jv0Var, Context context) {
        this.f = jv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final int j(int i10) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        jv0 jv0Var = this.f;
        org.telegram.ui.ActionBar.n2 n2Var = jv0Var.v1;
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.ab) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
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
                abVar.a(str, z10, z11, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(n2Var.getMessagesController().getChat(Long.valueOf(-jv0Var.j1))), new p60(this, user, str, z10, z11, z12, 1));
                abVar.d(user, null, null, i10 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var = this.f;
        if (i10 != 20) {
            org.telegram.ui.Cells.ab abVar = new org.telegram.ui.Cells.ab(9, 0, this.c, jv0Var.F1, true, false);
            abVar.setLayoutParams(new s4.p0(-1, -2));
            return new fl0(abVar);
        }
        wt0 M = jv0.M(7, jv0Var.j1, this.c, jv0Var.F1);
        M.setLayoutParams(new s4.p0(-1, -1));
        return new fl0(M);
    }
}
