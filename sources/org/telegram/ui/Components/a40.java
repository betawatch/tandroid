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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a40 extends lm0 {
    public final Context c;
    public final /* synthetic */ e40 d;

    public a40(e40 e40Var, Context context) {
        this.d = e40Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        View view = b1Var.a;
        if ((view instanceof org.telegram.ui.Cells.b5) && this.d.f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
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
        e40 e40Var = this.d;
        if ((i10 >= e40Var.k0 && i10 < e40Var.l0) || (i10 >= e40Var.n0 && i10 < e40Var.o0)) {
            return 0;
        }
        if (i10 == e40Var.i0) {
            return 1;
        }
        if (i10 == e40Var.p0 || i10 == e40Var.m0) {
            return 2;
        }
        e40Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == e40Var.j0) {
            return 4;
        }
        return i10 == e40Var.q0 ? 5 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        TLObject tLObject;
        int i11;
        int i12;
        e40 e40Var = this.d;
        ArrayList arrayList = e40Var.X;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            int i14 = e40Var.k0;
            if (i10 < i14 || i10 >= e40Var.l0) {
                int i15 = e40Var.n0;
                tLObject = (i10 < i15 || i10 >= e40Var.o0) ? null : (TLObject) e40Var.Y.get(i10 - i15);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i14);
            }
            if (i10 < e40Var.k0 || i10 >= (i11 = e40Var.l0)) {
                i11 = e40Var.o0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i12 = ((org.telegram.ui.ActionBar.e3) e40Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            if (user != null) {
                b5Var.setCustomImageVisible(e40Var.f0.contains(Long.valueOf(user.id)));
                b5Var.b(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i10 == e40Var.i0) {
                if ((!e40Var.c0 || e40Var.d0) && e40Var.p0 == -1 && !arrayList.isEmpty()) {
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
        if (i10 == e40Var.p0) {
            v3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == e40Var.m0) {
            if (e40Var.h0) {
                v3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                v3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Components.f10] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Cells.y4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, org.telegram.ui.Cells.v3] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.g6.pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.g6.gg);
                b5Var = y4Var;
            } else if (i10 == 2) {
                ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                b5Var = v3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                b5Var = view;
            } else if (i10 != 5) {
                b5Var = new View(context);
            } else {
                ?? f10Var = new f10(context, null);
                f10Var.setViewType(6);
                f10Var.setIsSingleCell(true);
                f10Var.f(org.telegram.ui.ActionBar.g6.fg, org.telegram.ui.ActionBar.g6.Rg, org.telegram.ui.ActionBar.g6.jg);
                b5Var = f10Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ng, false));
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.lg, false);
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.pg, false);
            b5Var2.H = x02;
            b5Var2.I = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.g6.gg);
            b5Var = b5Var2;
        }
        return new wl0(b5Var);
    }
}
