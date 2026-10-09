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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e40 extends pm0 {
    public final Context c;
    public final /* synthetic */ i40 d;

    public e40(i40 i40Var, Context context) {
        this.d = i40Var;
        this.c = context;
    }

    @Override // s4.i0
    public final void A(s4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        View view = d1Var.a;
        if ((view instanceof org.telegram.ui.Cells.b5) && this.d.f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            return false;
        }
        int i10 = d1Var.f;
        return i10 == 0 || i10 == 1;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.r0;
    }

    @Override // s4.i0
    public final int j(int i10) {
        i40 i40Var = this.d;
        if ((i10 >= i40Var.k0 && i10 < i40Var.l0) || (i10 >= i40Var.n0 && i10 < i40Var.o0)) {
            return 0;
        }
        if (i10 == i40Var.i0) {
            return 1;
        }
        if (i10 == i40Var.p0 || i10 == i40Var.m0) {
            return 2;
        }
        i40Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == i40Var.j0) {
            return 4;
        }
        return i10 == i40Var.q0 ? 5 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        TLObject tLObject;
        int i11;
        int i12;
        i40 i40Var = this.d;
        ArrayList arrayList = i40Var.X;
        int i13 = d1Var.f;
        View view = d1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            int i14 = i40Var.k0;
            if (i10 < i14 || i10 >= i40Var.l0) {
                int i15 = i40Var.n0;
                tLObject = (i10 < i15 || i10 >= i40Var.o0) ? null : (TLObject) i40Var.Y.get(i10 - i15);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i14);
            }
            if (i10 < i40Var.k0 || i10 >= (i11 = i40Var.l0)) {
                i11 = i40Var.o0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i12 = ((org.telegram.ui.ActionBar.f3) i40Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            if (user != null) {
                b5Var.setCustomImageVisible(i40Var.f0.contains(Long.valueOf(user.id)));
                b5Var.b(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i10 == i40Var.i0) {
                if ((!i40Var.c0 || i40Var.d0) && i40Var.p0 == -1 && !arrayList.isEmpty()) {
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
        if (i10 == i40Var.p0) {
            v3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == i40Var.m0) {
            if (i40Var.h0) {
                v3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                v3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Components.j10] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Cells.y4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, org.telegram.ui.Cells.v3] */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.i6.pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.i6.gg);
                b5Var = y4Var;
            } else if (i10 == 2) {
                ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.i6.Qg);
                b5Var = v3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                b5Var = view;
            } else if (i10 != 5) {
                b5Var = new View(context);
            } else {
                ?? j10Var = new j10(context, null);
                j10Var.setViewType(6);
                j10Var.setIsSingleCell(true);
                j10Var.f(org.telegram.ui.ActionBar.i6.fg, org.telegram.ui.ActionBar.i6.Rg, org.telegram.ui.ActionBar.i6.jg);
                b5Var = j10Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ng, false));
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.lg, false);
            int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.pg, false);
            b5Var2.H = x02;
            b5Var2.I = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.i6.gg);
            b5Var = b5Var2;
        }
        return new am0(b5Var);
    }
}
