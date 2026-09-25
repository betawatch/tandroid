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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class o30 extends vl0 {
    public final Context c;
    public final /* synthetic */ s30 d;

    public o30(s30 s30Var, Context context) {
        this.d = s30Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.a;
        if ((view instanceof org.telegram.ui.Cells.b5) && this.d.f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
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
        s30 s30Var = this.d;
        if ((i10 >= s30Var.k0 && i10 < s30Var.l0) || (i10 >= s30Var.n0 && i10 < s30Var.o0)) {
            return 0;
        }
        if (i10 == s30Var.i0) {
            return 1;
        }
        if (i10 == s30Var.p0 || i10 == s30Var.m0) {
            return 2;
        }
        s30Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == s30Var.j0) {
            return 4;
        }
        return i10 == s30Var.q0 ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLObject tLObject;
        int i11;
        int i12;
        s30 s30Var = this.d;
        ArrayList arrayList = s30Var.X;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            int i14 = s30Var.k0;
            if (i10 < i14 || i10 >= s30Var.l0) {
                int i15 = s30Var.n0;
                tLObject = (i10 < i15 || i10 >= s30Var.o0) ? null : (TLObject) s30Var.Y.get(i10 - i15);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i14);
            }
            if (i10 < s30Var.k0 || i10 >= (i11 = s30Var.l0)) {
                i11 = s30Var.o0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i12 = ((org.telegram.ui.ActionBar.e3) s30Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            if (user != null) {
                b5Var.setCustomImageVisible(s30Var.f0.contains(Long.valueOf(user.id)));
                b5Var.b(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i10 == s30Var.i0) {
                if ((!s30Var.c0 || s30Var.d0) && s30Var.p0 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, r3);
                return;
            }
            return;
        }
        if (i13 != 2) {
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (i10 == s30Var.p0) {
            v3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == s30Var.m0) {
            if (s30Var.h0) {
                v3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                v3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Components.u00] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Cells.y4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, org.telegram.ui.Cells.v3] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.h6.pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.h6.gg);
                b5Var = y4Var;
            } else if (i10 == 2) {
                ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.h6.Qg);
                b5Var = v3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                b5Var = view;
            } else if (i10 != 5) {
                b5Var = new View(context);
            } else {
                ?? u00Var = new u00(context, null);
                u00Var.setViewType(6);
                u00Var.setIsSingleCell(true);
                u00Var.f(org.telegram.ui.ActionBar.h6.fg, org.telegram.ui.ActionBar.h6.Rg, org.telegram.ui.ActionBar.h6.jg);
                b5Var = u00Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.ng, false));
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.lg, false);
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.pg, false);
            b5Var2.H = w02;
            b5Var2.I = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.h6.gg);
            b5Var = b5Var2;
        }
        return new gl0(b5Var);
    }
}
