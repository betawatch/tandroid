package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g20 extends tj0 {
    public final Context c;
    public final /* synthetic */ k20 d;

    public g20(k20 k20Var, Context context) {
        this.d = k20Var;
        this.c = context;
    }

    @Override // v4.h0
    public final void A(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        View view = e1Var.a;
        if ((view instanceof org.telegram.ui.Cells.a5) && this.d.a2.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            return false;
        }
        int i7 = e1Var.f;
        return i7 == 0 || i7 == 1;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.m2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        k20 k20Var = this.d;
        if ((i7 >= k20Var.f2 && i7 < k20Var.g2) || (i7 >= k20Var.i2 && i7 < k20Var.j2)) {
            return 0;
        }
        if (i7 == k20Var.d2) {
            return 1;
        }
        if (i7 == k20Var.k2 || i7 == k20Var.h2) {
            return 2;
        }
        k20Var.getClass();
        if (i7 == 0) {
            return 3;
        }
        if (i7 == k20Var.e2) {
            return 4;
        }
        return i7 == k20Var.l2 ? 5 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLObject tLObject;
        int i10;
        k20 k20Var = this.d;
        ArrayList arrayList = k20Var.S1;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            int i12 = k20Var.f2;
            if (i7 < i12 || i7 >= k20Var.g2) {
                int i13 = k20Var.i2;
                tLObject = (i7 < i13 || i7 >= k20Var.j2) ? null : (TLObject) k20Var.T1.get(i7 - i13);
            } else {
                tLObject = (TLObject) arrayList.get(i7 - i12);
            }
            if (i7 < k20Var.f2 || i7 >= (i10 = k20Var.g2)) {
                i10 = k20Var.j2;
            }
            TLRPC.User a22 = org.telegram.messenger.np.s1(k20Var.a).a2(Long.valueOf(tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id));
            if (a22 != null) {
                a5Var.setCustomImageVisible(k20Var.a2.contains(Long.valueOf(a22.id)));
                a5Var.c(a22, null, null, i7 != i10 - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i7 == k20Var.d2) {
                if ((!k20Var.X1 || k20Var.Y1) && k20Var.k2 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                x4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.hd.M0(2131743390, null), r3);
                return;
            }
            return;
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (i7 == k20Var.k2) {
            x3Var.setText(org.telegram.messenger.hd.M0(2131752336, null));
        } else if (i7 == k20Var.h2) {
            if (k20Var.c2) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131742825, null));
            } else {
                x3Var.setText(org.telegram.messenger.hd.M0(2131749456, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.telegram.ui.Cells.x4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Components.pz] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i10 = org.telegram.ui.ActionBar.j6.gh;
                x4Var.a(i10, i10);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.j6.Xg);
                a5Var = x4Var;
            } else if (i7 == 2) {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.ah, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.j6.Hh);
                a5Var = x3Var;
            } else if (i7 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                a5Var = view;
            } else if (i7 != 5) {
                a5Var = new View(context);
            } else {
                ?? pzVar = new pz(context, null);
                pzVar.setViewType(6);
                pzVar.setIsSingleCell(true);
                pzVar.e(org.telegram.ui.ActionBar.j6.Wg, org.telegram.ui.ActionBar.j6.Ih, org.telegram.ui.ActionBar.j6.ah);
                a5Var = pzVar;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.c, 6, 2, false, null);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.eh, false));
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.ch, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.gh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.Xg);
            a5Var = a5Var2;
        }
        return new cj0(a5Var);
    }
}
