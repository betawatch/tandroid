package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q30 extends ql0 {
    public final Context c;
    public final /* synthetic */ u30 d;

    public q30(u30 u30Var, Context context) {
        this.d = u30Var;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        View view = l1Var.a;
        if ((view instanceof org.telegram.ui.Cells.a5) && this.d.c0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            return false;
        }
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 1;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.o0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        u30 u30Var = this.d;
        if ((i10 >= u30Var.h0 && i10 < u30Var.i0) || (i10 >= u30Var.k0 && i10 < u30Var.l0)) {
            return 0;
        }
        if (i10 == u30Var.f0) {
            return 1;
        }
        if (i10 == u30Var.m0 || i10 == u30Var.j0) {
            return 2;
        }
        u30Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == u30Var.g0) {
            return 4;
        }
        return i10 == u30Var.n0 ? 5 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        TLObject tLObject;
        int i11;
        int i12;
        u30 u30Var = this.d;
        ArrayList arrayList = u30Var.U;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            int i14 = u30Var.h0;
            if (i10 < i14 || i10 >= u30Var.i0) {
                int i15 = u30Var.k0;
                tLObject = (i10 < i15 || i10 >= u30Var.l0) ? null : (TLObject) u30Var.V.get(i10 - i15);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i14);
            }
            if (i10 < u30Var.h0 || i10 >= (i11 = u30Var.i0)) {
                i11 = u30Var.l0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i12 = ((org.telegram.ui.ActionBar.g3) u30Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            if (user != null) {
                a5Var.setCustomImageVisible(u30Var.c0.contains(Long.valueOf(user.id)));
                a5Var.b(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i10 == u30Var.f0) {
                if ((!u30Var.Z || u30Var.a0) && u30Var.m0 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                x4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, r3);
                return;
            }
            return;
        }
        if (i13 != 2) {
            return;
        }
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
        if (i10 == u30Var.m0) {
            t3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == u30Var.j0) {
            if (u30Var.e0) {
                t3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                t3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Components.u00] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Cells.x4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, org.telegram.ui.Cells.t3] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i11 = org.telegram.ui.ActionBar.j6.pg;
                x4Var.a(i11, i11);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.j6.gg);
                a5Var = x4Var;
            } else if (i10 == 2) {
                ?? t3Var = new org.telegram.ui.Cells.t3(context, null);
                t3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jg, false));
                t3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                a5Var = t3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                a5Var = view;
            } else if (i10 != 5) {
                a5Var = new View(context);
            } else {
                ?? u00Var = new u00(context, null);
                u00Var.setViewType(6);
                u00Var.setIsSingleCell(true);
                u00Var.f(org.telegram.ui.ActionBar.j6.fg, org.telegram.ui.ActionBar.j6.Rg, org.telegram.ui.ActionBar.j6.jg);
                a5Var = u00Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(6, 2, this.c, null, false);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
            a5Var2.E = w02;
            a5Var2.F = w03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.gg);
            a5Var = a5Var2;
        }
        return new dl0(a5Var);
    }
}
