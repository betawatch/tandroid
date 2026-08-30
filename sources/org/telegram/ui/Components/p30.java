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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p30 extends rl0 {
    public final Context c;
    public final /* synthetic */ t30 d;

    public p30(t30 t30Var, Context context) {
        this.d = t30Var;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        View view = l1Var.a;
        if ((view instanceof org.telegram.ui.Cells.b5) && this.d.c0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
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
        t30 t30Var = this.d;
        if ((i10 >= t30Var.h0 && i10 < t30Var.i0) || (i10 >= t30Var.k0 && i10 < t30Var.l0)) {
            return 0;
        }
        if (i10 == t30Var.f0) {
            return 1;
        }
        if (i10 == t30Var.m0 || i10 == t30Var.j0) {
            return 2;
        }
        t30Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == t30Var.g0) {
            return 4;
        }
        return i10 == t30Var.n0 ? 5 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        TLObject tLObject;
        int i11;
        int i12;
        t30 t30Var = this.d;
        ArrayList arrayList = t30Var.U;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            int i14 = t30Var.h0;
            if (i10 < i14 || i10 >= t30Var.i0) {
                int i15 = t30Var.k0;
                tLObject = (i10 < i15 || i10 >= t30Var.l0) ? null : (TLObject) t30Var.V.get(i10 - i15);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i14);
            }
            if (i10 < t30Var.h0 || i10 >= (i11 = t30Var.i0)) {
                i11 = t30Var.l0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i12 = ((org.telegram.ui.ActionBar.g3) t30Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            if (user != null) {
                b5Var.setCustomImageVisible(t30Var.c0.contains(Long.valueOf(user.id)));
                b5Var.b(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i10 == t30Var.f0) {
                if ((!t30Var.Z || t30Var.a0) && t30Var.m0 == -1 && !arrayList.isEmpty()) {
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
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (i10 == t30Var.m0) {
            u3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == t30Var.j0) {
            if (t30Var.e0) {
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
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Cells.y4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, org.telegram.ui.Cells.u3] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.j6.pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.j6.gg);
                b5Var = y4Var;
            } else if (i10 == 2) {
                ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                b5Var = u3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                b5Var = view;
            } else if (i10 != 5) {
                b5Var = new View(context);
            } else {
                ?? t00Var = new t00(context, null);
                t00Var.setViewType(6);
                t00Var.setIsSingleCell(true);
                t00Var.f(org.telegram.ui.ActionBar.j6.fg, org.telegram.ui.ActionBar.j6.Rg, org.telegram.ui.ActionBar.j6.jg);
                b5Var = t00Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
            b5Var2.E = w02;
            b5Var2.F = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.gg);
            b5Var = b5Var2;
        }
        return new el0(b5Var);
    }
}
