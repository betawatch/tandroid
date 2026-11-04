package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z10 extends sj0 {
    public final Context c;
    public final /* synthetic */ d20 d;

    public z10(d20 d20Var, Context context) {
        this.d = d20Var;
        this.c = context;
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        View view = d1Var.a;
        if ((view instanceof org.telegram.ui.Cells.a5) && this.d.X1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            return false;
        }
        int i3 = d1Var.f;
        return i3 == 0 || i3 == 1;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.j2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        d20 d20Var = this.d;
        if ((i3 >= d20Var.c2 && i3 < d20Var.d2) || (i3 >= d20Var.f2 && i3 < d20Var.g2)) {
            return 0;
        }
        if (i3 == d20Var.a2) {
            return 1;
        }
        if (i3 == d20Var.h2 || i3 == d20Var.e2) {
            return 2;
        }
        d20Var.getClass();
        if (i3 == 0) {
            return 3;
        }
        if (i3 == d20Var.b2) {
            return 4;
        }
        return i3 == d20Var.i2 ? 5 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLObject tLObject;
        int i10;
        d20 d20Var = this.d;
        ArrayList arrayList = d20Var.P1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i3));
            int i12 = d20Var.c2;
            if (i3 < i12 || i3 >= d20Var.d2) {
                int i13 = d20Var.f2;
                tLObject = (i3 < i13 || i3 >= d20Var.g2) ? null : (TLObject) d20Var.Q1.get(i3 - i13);
            } else {
                tLObject = (TLObject) arrayList.get(i3 - i12);
            }
            if (i3 < d20Var.c2 || i3 >= (i10 = d20Var.d2)) {
                i10 = d20Var.g2;
            }
            TLRPC.User a22 = org.telegram.messenger.hp.s1(d20Var.a).a2(Long.valueOf(tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id));
            if (a22 != null) {
                a5Var.setCustomImageVisible(d20Var.X1.contains(Long.valueOf(a22.id)));
                a5Var.c(a22, null, null, i3 != i10 - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i3 == d20Var.a2) {
                if ((!d20Var.U1 || d20Var.V1) && d20Var.h2 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                x4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.bd.M0(2131743400, null), r3);
                return;
            }
            return;
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (i3 == d20Var.h2) {
            x3Var.setText(org.telegram.messenger.bd.M0(2131752336, null));
        } else if (i3 == d20Var.e2) {
            if (d20Var.Z1) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131742835, null));
            } else {
                x3Var.setText(org.telegram.messenger.bd.M0(2131749464, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.telegram.ui.Cells.x4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Components.iz] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i3 != 0) {
            Context context = this.c;
            if (i3 == 1) {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i10 = org.telegram.ui.ActionBar.k6.dh;
                x4Var.a(i10, i10);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.k6.Ug);
                a5Var = x4Var;
            } else if (i3 == 2) {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Xg, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.k6.Eh);
                a5Var = x3Var;
            } else if (i3 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                a5Var = view;
            } else if (i3 != 5) {
                a5Var = new View(context);
            } else {
                ?? izVar = new iz(context, null);
                izVar.setViewType(6);
                izVar.setIsSingleCell(true);
                izVar.e(org.telegram.ui.ActionBar.k6.Tg, org.telegram.ui.ActionBar.k6.Fh, org.telegram.ui.ActionBar.k6.Xg);
                a5Var = izVar;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.c, 6, 2, false, null);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bh, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.dh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.Ug);
            a5Var = a5Var2;
        }
        return new bj0(a5Var);
    }
}
