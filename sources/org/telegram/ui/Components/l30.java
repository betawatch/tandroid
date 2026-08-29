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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l30 extends il0 {
    public final Context c;
    public final /* synthetic */ p30 d;

    public l30(p30 p30Var, Context context) {
        this.d = p30Var;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        View view = n1Var.a;
        if ((view instanceof org.telegram.ui.Cells.z4) && this.d.b0.contains(Long.valueOf(((org.telegram.ui.Cells.z4) view).getUserId()))) {
            return false;
        }
        int i10 = n1Var.f;
        return i10 == 0 || i10 == 1;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.n0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        p30 p30Var = this.d;
        if ((i10 >= p30Var.g0 && i10 < p30Var.h0) || (i10 >= p30Var.j0 && i10 < p30Var.k0)) {
            return 0;
        }
        if (i10 == p30Var.e0) {
            return 1;
        }
        if (i10 == p30Var.l0 || i10 == p30Var.i0) {
            return 2;
        }
        p30Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == p30Var.f0) {
            return 4;
        }
        return i10 == p30Var.m0 ? 5 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        TLObject tLObject;
        int i11;
        int i12;
        p30 p30Var = this.d;
        ArrayList arrayList = p30Var.T;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
            z4Var.setTag(Integer.valueOf(i10));
            int i14 = p30Var.g0;
            if (i10 < i14 || i10 >= p30Var.h0) {
                int i15 = p30Var.j0;
                tLObject = (i10 < i15 || i10 >= p30Var.k0) ? null : (TLObject) p30Var.U.get(i10 - i15);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i14);
            }
            if (i10 < p30Var.g0 || i10 >= (i11 = p30Var.h0)) {
                i11 = p30Var.k0;
            }
            long peerId = tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            i12 = ((org.telegram.ui.ActionBar.f3) p30Var).currentAccount;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            if (user != null) {
                z4Var.setCustomImageVisible(p30Var.b0.contains(Long.valueOf(user.id)));
                z4Var.b(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.w4 w4Var = (org.telegram.ui.Cells.w4) view;
            if (i10 == p30Var.e0) {
                if ((!p30Var.Y || p30Var.Z) && p30Var.l0 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                w4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, r3);
                return;
            }
            return;
        }
        if (i13 != 2) {
            return;
        }
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        if (i10 == p30Var.l0) {
            s3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == p30Var.i0) {
            if (p30Var.d0) {
                s3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                s3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Components.p00] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Cells.w4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, org.telegram.ui.Cells.s3] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z4 z4Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? w4Var = new org.telegram.ui.Cells.w4(context);
                int i11 = org.telegram.ui.ActionBar.g6.pg;
                w4Var.a(i11, i11);
                w4Var.setDividerColor(org.telegram.ui.ActionBar.g6.gg);
                z4Var = w4Var;
            } else if (i10 == 2) {
                ?? s3Var = new org.telegram.ui.Cells.s3(context, null);
                s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jg, false));
                s3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                z4Var = s3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                z4Var = view;
            } else if (i10 != 5) {
                z4Var = new View(context);
            } else {
                ?? p00Var = new p00(context, null);
                p00Var.setViewType(6);
                p00Var.setIsSingleCell(true);
                p00Var.f(org.telegram.ui.ActionBar.g6.fg, org.telegram.ui.ActionBar.g6.Rg, org.telegram.ui.ActionBar.g6.jg);
                z4Var = p00Var;
            }
        } else {
            org.telegram.ui.Cells.z4 z4Var2 = new org.telegram.ui.Cells.z4(6, 2, this.c, null, false);
            z4Var2.setCustomRightImage(R.drawable.msg_invited);
            z4Var2.setNameColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false));
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lg, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false);
            z4Var2.D = w02;
            z4Var2.E = w03;
            z4Var2.setDividerColor(org.telegram.ui.ActionBar.g6.gg);
            z4Var = z4Var2;
        }
        return new vk0(z4Var);
    }
}
