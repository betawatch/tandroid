package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v20 extends sk0 {
    public final Context c;
    public final /* synthetic */ z20 d;

    public v20(z20 z20Var, Context context) {
        this.d = z20Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.a;
        if ((view instanceof org.telegram.ui.Cells.e5) && this.d.W1.contains(Long.valueOf(((org.telegram.ui.Cells.e5) view).getUserId()))) {
            return false;
        }
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 1;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.i2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        z20 z20Var = this.d;
        if ((i10 >= z20Var.b2 && i10 < z20Var.c2) || (i10 >= z20Var.e2 && i10 < z20Var.f2)) {
            return 0;
        }
        if (i10 == z20Var.Z1) {
            return 1;
        }
        if (i10 == z20Var.g2 || i10 == z20Var.d2) {
            return 2;
        }
        z20Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == z20Var.a2) {
            return 4;
        }
        return i10 == z20Var.h2 ? 5 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLObject tLObject;
        int i11;
        z20 z20Var = this.d;
        ArrayList arrayList = z20Var.O1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
            e5Var.setTag(Integer.valueOf(i10));
            int i13 = z20Var.b2;
            if (i10 < i13 || i10 >= z20Var.c2) {
                int i14 = z20Var.e2;
                tLObject = (i10 < i14 || i10 >= z20Var.f2) ? null : (TLObject) z20Var.P1.get(i10 - i14);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i13);
            }
            if (i10 < z20Var.b2 || i10 >= (i11 = z20Var.c2)) {
                i11 = z20Var.f2;
            }
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(z20Var.a).Z1(Long.valueOf(tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id));
            if (Z1 != null) {
                e5Var.setCustomImageVisible(z20Var.W1.contains(Long.valueOf(Z1.id)));
                e5Var.c(Z1, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            if (i10 == z20Var.Z1) {
                if ((!z20Var.T1 || z20Var.U1) && z20Var.g2 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                b5Var.b(R.drawable.msg_link, 7, org.telegram.messenger.cd.L0(2131743416, null), r3);
                return;
            }
            return;
        }
        if (i12 != 2) {
            return;
        }
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
        if (i10 == z20Var.g2) {
            z3Var.setText(org.telegram.messenger.cd.L0(2131752336, null));
        } else if (i10 == z20Var.d2) {
            if (z20Var.Y1) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131742850, null));
            } else {
                z3Var.setText(org.telegram.messenger.cd.L0(2131749465, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.telegram.ui.Cells.b5] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, org.telegram.ui.Cells.z3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Components.zz] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e5 e5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? b5Var = new org.telegram.ui.Cells.b5(context);
                int i11 = org.telegram.ui.ActionBar.t6.dh;
                b5Var.a(i11, i11);
                b5Var.setDividerColor(org.telegram.ui.ActionBar.t6.Ug);
                e5Var = b5Var;
            } else if (i10 == 2) {
                ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Xg, z3Var, null);
                z3Var.setTextColor(org.telegram.ui.ActionBar.t6.Eh);
                e5Var = z3Var;
            } else if (i10 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                e5Var = view;
            } else if (i10 != 5) {
                e5Var = new View(context);
            } else {
                ?? zzVar = new zz(context, null);
                zzVar.setViewType(6);
                zzVar.setIsSingleCell(true);
                zzVar.e(org.telegram.ui.ActionBar.t6.Tg, org.telegram.ui.ActionBar.t6.Fh, org.telegram.ui.ActionBar.t6.Xg);
                e5Var = zzVar;
            }
        } else {
            org.telegram.ui.Cells.e5 e5Var2 = new org.telegram.ui.Cells.e5(6, 2, this.c, null, false);
            e5Var2.setCustomRightImage(R.drawable.msg_invited);
            e5Var2.setNameColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bh, false));
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.dh, false);
            e5Var2.O = true;
            e5Var2.H = x02;
            e5Var2.I = x03;
            e5Var2.setDividerColor(org.telegram.ui.ActionBar.t6.Ug);
            e5Var = e5Var2;
        }
        return new ck0(e5Var);
    }
}
