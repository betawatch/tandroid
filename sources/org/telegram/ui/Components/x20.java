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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x20 extends vk0 {
    public final Context c;
    public final /* synthetic */ b30 d;

    public x20(b30 b30Var, Context context) {
        this.d = b30Var;
        this.c = context;
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        View view = q1Var.a;
        if ((view instanceof org.telegram.ui.Cells.b5) && this.d.b0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            return false;
        }
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 1;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.n0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        b30 b30Var = this.d;
        if ((i9 >= b30Var.g0 && i9 < b30Var.h0) || (i9 >= b30Var.j0 && i9 < b30Var.k0)) {
            return 0;
        }
        if (i9 == b30Var.e0) {
            return 1;
        }
        if (i9 == b30Var.l0 || i9 == b30Var.i0) {
            return 2;
        }
        b30Var.getClass();
        if (i9 == 0) {
            return 3;
        }
        if (i9 == b30Var.f0) {
            return 4;
        }
        return i9 == b30Var.m0 ? 5 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLObject tLObject;
        int i10;
        int i11;
        b30 b30Var = this.d;
        ArrayList arrayList = b30Var.T;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i9));
            int i13 = b30Var.g0;
            if (i9 < i13 || i9 >= b30Var.h0) {
                int i14 = b30Var.j0;
                tLObject = (i9 < i14 || i9 >= b30Var.k0) ? null : (TLObject) b30Var.U.get(i9 - i14);
            } else {
                tLObject = (TLObject) arrayList.get(i9 - i13);
            }
            if (i9 < b30Var.g0 || i9 >= (i10 = b30Var.h0)) {
                i10 = b30Var.k0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i11 = ((org.telegram.ui.ActionBar.f3) b30Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
            if (user != null) {
                b5Var.setCustomImageVisible(b30Var.b0.contains(Long.valueOf(user.id)));
                b5Var.b(user, null, null, i9 != i10 - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i9 == b30Var.e0) {
                if ((!b30Var.Y || b30Var.Z) && b30Var.l0 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, r3);
                return;
            }
            return;
        }
        if (i12 != 2) {
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (i9 == b30Var.l0) {
            v3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i9 == b30Var.i0) {
            if (b30Var.d0) {
                v3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                v3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Components.e00] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Cells.y4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, org.telegram.ui.Cells.v3] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i9 != 0) {
            Context context = this.c;
            if (i9 == 1) {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i10 = org.telegram.ui.ActionBar.f6.pg;
                y4Var.a(i10, i10);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.f6.gg);
                b5Var = y4Var;
            } else if (i9 == 2) {
                ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.f6.Qg);
                b5Var = v3Var;
            } else if (i9 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                b5Var = view;
            } else if (i9 != 5) {
                b5Var = new View(context);
            } else {
                ?? e00Var = new e00(context, null);
                e00Var.setViewType(6);
                e00Var.setIsSingleCell(true);
                e00Var.f(org.telegram.ui.ActionBar.f6.fg, org.telegram.ui.ActionBar.f6.Rg, org.telegram.ui.ActionBar.f6.jg);
                b5Var = e00Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false));
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lg, false);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false);
            b5Var2.D = w02;
            b5Var2.E = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.f6.gg);
            b5Var = b5Var2;
        }
        return new ik0(b5Var);
    }
}
