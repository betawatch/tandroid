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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class n30 extends kl0 {
    public final Context c;
    public final /* synthetic */ r30 d;

    public n30(r30 r30Var, Context context) {
        this.d = r30Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.a;
        if ((view instanceof org.telegram.ui.Cells.a5) && this.d.f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            return false;
        }
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.r0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        r30 r30Var = this.d;
        if ((i10 >= r30Var.k0 && i10 < r30Var.l0) || (i10 >= r30Var.n0 && i10 < r30Var.o0)) {
            return 0;
        }
        if (i10 == r30Var.i0) {
            return 1;
        }
        if (i10 == r30Var.p0 || i10 == r30Var.m0) {
            return 2;
        }
        r30Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == r30Var.j0) {
            return 4;
        }
        return i10 == r30Var.q0 ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLObject tLObject;
        int i11;
        int i12;
        r30 r30Var = this.d;
        ArrayList arrayList = r30Var.X;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            int i14 = r30Var.k0;
            if (i10 < i14 || i10 >= r30Var.l0) {
                int i15 = r30Var.n0;
                tLObject = (i10 < i15 || i10 >= r30Var.o0) ? null : (TLObject) r30Var.Y.get(i10 - i15);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i14);
            }
            if (i10 < r30Var.k0 || i10 >= (i11 = r30Var.l0)) {
                i11 = r30Var.o0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i12 = ((org.telegram.ui.ActionBar.f3) r30Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            if (user != null) {
                a5Var.setCustomImageVisible(r30Var.f0.contains(Long.valueOf(user.id)));
                a5Var.b(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i10 == r30Var.i0) {
                if ((!r30Var.c0 || r30Var.d0) && r30Var.p0 == -1 && !arrayList.isEmpty()) {
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
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (i10 == r30Var.p0) {
            u3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == r30Var.m0) {
            if (r30Var.h0) {
                u3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                u3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Components.t00] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Cells.x4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, org.telegram.ui.Cells.u3] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
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
                ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                a5Var = u3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                a5Var = view;
            } else if (i10 != 5) {
                a5Var = new View(context);
            } else {
                ?? t00Var = new t00(context, null);
                t00Var.setViewType(6);
                t00Var.setIsSingleCell(true);
                t00Var.f(org.telegram.ui.ActionBar.j6.fg, org.telegram.ui.ActionBar.j6.Rg, org.telegram.ui.ActionBar.j6.jg);
                a5Var = t00Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(6, 2, this.c, null, false);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
            a5Var2.H = w02;
            a5Var2.I = w03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.gg);
            a5Var = a5Var2;
        }
        return new vk0(a5Var);
    }
}
