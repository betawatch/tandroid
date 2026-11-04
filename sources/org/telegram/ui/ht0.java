package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ht0 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ it0 d;

    public ht0(it0 it0Var, Context context) {
        this.d = it0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 0 || i3 == 2 || i3 == 4;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.e;
    }

    @Override // u4.h0
    public final int d(int i3) {
        it0 it0Var = this.d;
        if (i3 == it0Var.x) {
            return 4;
        }
        if (i3 == it0Var.n) {
            return 3;
        }
        if (i3 == it0Var.f) {
            return 2;
        }
        return (i3 == it0Var.h || i3 == it0Var.w) ? 1 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        String M0;
        it0 it0Var = this.d;
        int i10 = it0Var.E;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            if (i10 != 1) {
                throw null;
            }
            long keyAt = it0Var.getMessagesController().H0.keyAt(i3 - it0Var.r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat M02 = it0Var.getMessagesController().M0(Long.valueOf(-keyAt));
                if (M02 != null) {
                    int i12 = M02.participants_count;
                    a5Var.c(M02, null, i12 != 0 ? org.telegram.messenger.bd.G(i12, "Members", new Object[0]) : M02.has_geo ? org.telegram.messenger.bd.M0(2131748650, null) : !org.telegram.messenger.t3.t0(M02) ? org.telegram.messenger.bd.M0(2131748649, null) : org.telegram.messenger.bd.M0(2131748646, null), i3 != it0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User a22 = it0Var.getMessagesController().a2(Long.valueOf(keyAt));
            if (a22 != null) {
                if (a22.bot) {
                    M0 = org.telegram.messenger.bd.M0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.bd.M0(2131753156, null).substring(1);
                } else {
                    String str = a22.phone;
                    M0 = (str == null || str.length() == 0) ? org.telegram.messenger.bd.M0(2131747840, null) : org.telegram.messenger.k5.i(new StringBuilder("+"), a22.phone, mf.b.c());
                }
                a5Var.c(a22, null, M0, i3 != it0Var.s - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 != it0Var.h) {
                if (i3 == it0Var.w) {
                    y8Var.setFixedSize(12);
                    y8Var.setText("");
                    return;
                }
                return;
            }
            if (i10 == 1) {
                y8Var.setFixedSize(0);
                y8Var.setText(org.telegram.messenger.bd.M0(2131753677, null));
                return;
            } else {
                y8Var.setFixedSize(8);
                y8Var.setText(null);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            if (i10 == 1) {
                x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.bd.M0(2131753692, null), false);
                return;
            } else {
                org.telegram.messenger.bd.M0(2131746876, null);
                throw null;
            }
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i3 == it0Var.n) {
            if (i10 == 1) {
                n4Var.setText(org.telegram.messenger.bd.G(it0Var.getMessagesController().I0, "BlockedUsersCount", new Object[0]));
            } else {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746848, null));
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        FrameLayout y8Var;
        if (i3 != 0) {
            Context context = this.c;
            if (i3 == 1) {
                y8Var = new org.telegram.ui.Cells.y8(context);
            } else if (i3 == 2) {
                y8Var = new org.telegram.ui.Cells.x4(context);
            } else if (i3 != 4) {
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                frameLayout = n4Var;
            } else {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.k(org.telegram.messenger.bd.M0(2131747923, null), false);
                l8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                frameLayout = l8Var;
            }
            frameLayout = y8Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 7, 6, true, null);
            a5Var.setDelegate(new ci0(this, 10));
            frameLayout = a5Var;
        }
        return new org.telegram.ui.Components.bj0(frameLayout);
    }
}
