package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r20 extends dk0 {
    public final Context c;
    public final /* synthetic */ v20 d;

    public r20(v20 v20Var, Context context) {
        this.d = v20Var;
        this.c = context;
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        View view = f1Var.a;
        if ((view instanceof org.telegram.ui.Cells.b5) && this.d.a2.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            return false;
        }
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 1;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.m2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        v20 v20Var = this.d;
        if ((i7 >= v20Var.f2 && i7 < v20Var.g2) || (i7 >= v20Var.i2 && i7 < v20Var.j2)) {
            return 0;
        }
        if (i7 == v20Var.d2) {
            return 1;
        }
        if (i7 == v20Var.k2 || i7 == v20Var.h2) {
            return 2;
        }
        v20Var.getClass();
        if (i7 == 0) {
            return 3;
        }
        if (i7 == v20Var.e2) {
            return 4;
        }
        return i7 == v20Var.l2 ? 5 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLObject tLObject;
        int i10;
        v20 v20Var = this.d;
        ArrayList arrayList = v20Var.S1;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i7));
            int i12 = v20Var.f2;
            if (i7 < i12 || i7 >= v20Var.g2) {
                int i13 = v20Var.i2;
                tLObject = (i7 < i13 || i7 >= v20Var.j2) ? null : (TLObject) v20Var.T1.get(i7 - i13);
            } else {
                tLObject = (TLObject) arrayList.get(i7 - i12);
            }
            if (i7 < v20Var.f2 || i7 >= (i10 = v20Var.g2)) {
                i10 = v20Var.j2;
            }
            TLRPC.User c22 = org.telegram.messenger.np.u1(v20Var.a).c2(Long.valueOf(tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id));
            if (c22 != null) {
                b5Var.setCustomImageVisible(v20Var.a2.contains(Long.valueOf(c22.id)));
                b5Var.c(c22, null, null, i7 != i10 - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i7 == v20Var.d2) {
                if ((!v20Var.X1 || v20Var.Y1) && v20Var.k2 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                y4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.hd.N0(2131743145, null), r3);
                return;
            }
            return;
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        if (i7 == v20Var.k2) {
            y3Var.setText(org.telegram.messenger.hd.N0(2131752324, null));
        } else if (i7 == v20Var.h2) {
            if (v20Var.c2) {
                y3Var.setText(org.telegram.messenger.hd.N0(2131742559, null));
            } else {
                y3Var.setText(org.telegram.messenger.hd.N0(2131749263, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.telegram.ui.Cells.y4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, org.telegram.ui.Cells.y3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Components.yz] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i10 = org.telegram.ui.ActionBar.m6.gh;
                y4Var.a(i10, i10);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.m6.Xg);
                b5Var = y4Var;
            } else if (i7 == 2) {
                ?? y3Var = new org.telegram.ui.Cells.y3(context, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.ah, y3Var, null);
                y3Var.setTextColor(org.telegram.ui.ActionBar.m6.Hh);
                b5Var = y3Var;
            } else if (i7 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                b5Var = view;
            } else if (i7 != 5) {
                b5Var = new View(context);
            } else {
                ?? yzVar = new yz(context, null);
                yzVar.setViewType(6);
                yzVar.setIsSingleCell(true);
                yzVar.e(org.telegram.ui.ActionBar.m6.Wg, org.telegram.ui.ActionBar.m6.Ih, org.telegram.ui.ActionBar.m6.ah);
                b5Var = yzVar;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(this.c, 6, 2, false, null);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.eh, false));
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ch, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.gh, false);
            b5Var2.P = true;
            b5Var2.I = x02;
            b5Var2.J = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.m6.Xg);
            b5Var = b5Var2;
        }
        return new mj0(b5Var);
    }
}
