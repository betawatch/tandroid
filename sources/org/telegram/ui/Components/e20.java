package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e20 extends pj0 {
    public final Context c;
    public final /* synthetic */ i20 d;

    public e20(i20 i20Var, Context context) {
        this.d = i20Var;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        View view = d1Var.a;
        if ((view instanceof org.telegram.ui.Cells.a5) && this.d.W1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            return false;
        }
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 1;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.i2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        i20 i20Var = this.d;
        if ((i7 >= i20Var.b2 && i7 < i20Var.c2) || (i7 >= i20Var.e2 && i7 < i20Var.f2)) {
            return 0;
        }
        if (i7 == i20Var.Z1) {
            return 1;
        }
        if (i7 == i20Var.g2 || i7 == i20Var.d2) {
            return 2;
        }
        i20Var.getClass();
        if (i7 == 0) {
            return 3;
        }
        if (i7 == i20Var.a2) {
            return 4;
        }
        return i7 == i20Var.h2 ? 5 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLObject tLObject;
        int i10;
        i20 i20Var = this.d;
        ArrayList arrayList = i20Var.O1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            int i12 = i20Var.b2;
            if (i7 < i12 || i7 >= i20Var.c2) {
                int i13 = i20Var.e2;
                tLObject = (i7 < i13 || i7 >= i20Var.f2) ? null : (TLObject) i20Var.P1.get(i7 - i13);
            } else {
                tLObject = (TLObject) arrayList.get(i7 - i12);
            }
            if (i7 < i20Var.b2 || i7 >= (i10 = i20Var.c2)) {
                i10 = i20Var.f2;
            }
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i20Var.a).a2(Long.valueOf(tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id));
            if (a22 != null) {
                a5Var.setCustomImageVisible(i20Var.W1.contains(Long.valueOf(a22.id)));
                a5Var.c(a22, null, null, i7 != i10 - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i7 == i20Var.Z1) {
                if ((!i20Var.T1 || i20Var.U1) && i20Var.g2 == -1 && !arrayList.isEmpty()) {
                    r3 = true;
                }
                x4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.id.M0(2131743390, null), r3);
                return;
            }
            return;
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (i7 == i20Var.g2) {
            x3Var.setText(org.telegram.messenger.id.M0(2131752336, null));
        } else if (i7 == i20Var.d2) {
            if (i20Var.Y1) {
                x3Var.setText(org.telegram.messenger.id.M0(2131742825, null));
            } else {
                x3Var.setText(org.telegram.messenger.id.M0(2131749456, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.telegram.ui.Cells.x4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v12, types: [org.telegram.ui.Components.mz] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i10 = org.telegram.ui.ActionBar.l6.dh;
                x4Var.a(i10, i10);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.l6.Ug);
                a5Var = x4Var;
            } else if (i7 == 2) {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.Xg, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.l6.Eh);
                a5Var = x3Var;
            } else if (i7 == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                a5Var = view;
            } else if (i7 != 5) {
                a5Var = new View(context);
            } else {
                ?? mzVar = new mz(context, null);
                mzVar.setViewType(6);
                mzVar.setIsSingleCell(true);
                mzVar.e(org.telegram.ui.ActionBar.l6.Tg, org.telegram.ui.ActionBar.l6.Fh, org.telegram.ui.ActionBar.l6.Xg);
                a5Var = mzVar;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.c, 6, 2, false, null);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.bh, false));
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.dh, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.l6.Ug);
            a5Var = a5Var2;
        }
        return new yi0(a5Var);
    }
}
