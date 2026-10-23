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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class w30 extends lm0 {
    public final Context c;
    public final /* synthetic */ a40 d;

    public w30(a40 a40Var, Context context) {
        this.d = a40Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        View view = b1Var.a;
        if ((view instanceof org.telegram.ui.Cells.a5) && this.d.f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            return false;
        }
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 1;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.r0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        a40 a40Var = this.d;
        if ((i10 >= a40Var.k0 && i10 < a40Var.l0) || (i10 >= a40Var.n0 && i10 < a40Var.o0)) {
            return 0;
        }
        if (i10 == a40Var.i0) {
            return 1;
        }
        if (i10 == a40Var.p0 || i10 == a40Var.m0) {
            return 2;
        }
        a40Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == a40Var.j0) {
            return 4;
        }
        return i10 == a40Var.q0 ? 5 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        TLObject tLObject;
        int i11;
        int i12;
        a40 a40Var = this.d;
        ArrayList arrayList = a40Var.X;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            int i14 = a40Var.k0;
            if (i10 < i14 || i10 >= a40Var.l0) {
                int i15 = a40Var.n0;
                tLObject = (i10 < i15 || i10 >= a40Var.o0) ? null : (TLObject) a40Var.Y.get(i10 - i15);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i14);
            }
            if (i10 < a40Var.k0 || i10 >= (i11 = a40Var.l0)) {
                i11 = a40Var.o0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i12 = ((org.telegram.ui.ActionBar.h3) a40Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            if (user != null) {
                a5Var.setCustomImageVisible(a40Var.f0.contains(Long.valueOf(user.id)));
                a5Var.c(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i10 == a40Var.i0) {
                if ((!a40Var.c0 || a40Var.d0) && a40Var.p0 == -1 && !arrayList.isEmpty()) {
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
        if (i10 == a40Var.p0) {
            u3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == a40Var.m0) {
            if (a40Var.h0) {
                u3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                u3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.telegram.ui.Cells.x4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, org.telegram.ui.Cells.u3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Components.b10] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i11 = org.telegram.ui.ActionBar.k6.pg;
                x4Var.a(i11, i11);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.k6.gg);
                a5Var = x4Var;
            } else if (i10 == 2) {
                ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.jg, u3Var, null);
                u3Var.setTextColor(org.telegram.ui.ActionBar.k6.Qg);
                a5Var = u3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                a5Var = view;
            } else if (i10 != 5) {
                a5Var = new View(context);
            } else {
                ?? b10Var = new b10(context, null);
                b10Var.setViewType(6);
                b10Var.setIsSingleCell(true);
                b10Var.e(org.telegram.ui.ActionBar.k6.fg, org.telegram.ui.ActionBar.k6.Rg, org.telegram.ui.ActionBar.k6.jg);
                a5Var = b10Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(6, 2, this.c, null, false);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ng, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.pg, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.gg);
            a5Var = a5Var2;
        }
        return new wl0(a5Var);
    }
}
