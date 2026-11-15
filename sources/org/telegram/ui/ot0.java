package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ot0 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ pt0 d;

    public ot0(pt0 pt0Var, Context context) {
        this.d = pt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 0 || i7 == 2 || i7 == 4;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.e;
    }

    @Override // v4.h0
    public final int d(int i7) {
        pt0 pt0Var = this.d;
        if (i7 == pt0Var.x) {
            return 4;
        }
        if (i7 == pt0Var.n) {
            return 3;
        }
        if (i7 == pt0Var.f) {
            return 2;
        }
        return (i7 == pt0Var.h || i7 == pt0Var.w) ? 1 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        String M0;
        pt0 pt0Var = this.d;
        int i10 = pt0Var.E;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            if (i10 != 1) {
                throw null;
            }
            long keyAt = pt0Var.getMessagesController().H0.keyAt(i7 - pt0Var.r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat M02 = pt0Var.getMessagesController().M0(Long.valueOf(-keyAt));
                if (M02 != null) {
                    int i12 = M02.participants_count;
                    a5Var.c(M02, null, i12 != 0 ? org.telegram.messenger.hd.G(i12, "Members", new Object[0]) : M02.has_geo ? org.telegram.messenger.hd.M0(2131748642, null) : !org.telegram.messenger.t3.t0(M02) ? org.telegram.messenger.hd.M0(2131748641, null) : org.telegram.messenger.hd.M0(2131748638, null), i7 != pt0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User a22 = pt0Var.getMessagesController().a2(Long.valueOf(keyAt));
            if (a22 != null) {
                if (a22.bot) {
                    M0 = org.telegram.messenger.hd.M0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.hd.M0(2131753156, null).substring(1);
                } else {
                    String str = a22.phone;
                    M0 = (str == null || str.length() == 0) ? org.telegram.messenger.hd.M0(2131747832, null) : org.telegram.messenger.k5.h(new StringBuilder("+"), a22.phone, pf.b.c());
                }
                a5Var.c(a22, null, M0, i7 != pt0Var.s - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 != pt0Var.h) {
                if (i7 == pt0Var.w) {
                    y8Var.setFixedSize(12);
                    y8Var.setText("");
                    return;
                }
                return;
            }
            if (i10 == 1) {
                y8Var.setFixedSize(0);
                y8Var.setText(org.telegram.messenger.hd.M0(2131753677, null));
                return;
            } else {
                y8Var.setFixedSize(8);
                y8Var.setText(null);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            if (i10 == 1) {
                x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.hd.M0(2131753692, null), false);
                return;
            } else {
                org.telegram.messenger.hd.M0(2131746868, null);
                throw null;
            }
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i7 == pt0Var.n) {
            if (i10 == 1) {
                n4Var.setText(org.telegram.messenger.hd.G(pt0Var.getMessagesController().I0, "BlockedUsersCount", new Object[0]));
            } else {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746840, null));
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout y8Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                y8Var = new org.telegram.ui.Cells.y8(context);
            } else if (i7 == 2) {
                y8Var = new org.telegram.ui.Cells.x4(context);
            } else if (i7 != 4) {
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                frameLayout = n4Var;
            } else {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.k(org.telegram.messenger.hd.M0(2131747915, null), false);
                l8Var.g(-1, org.telegram.ui.ActionBar.j6.p7);
                frameLayout = l8Var;
            }
            frameLayout = y8Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 7, 6, true, null);
            a5Var.setDelegate(new ni0(this, 9));
            frameLayout = a5Var;
        }
        return new org.telegram.ui.Components.cj0(frameLayout);
    }
}
