package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rz extends ma {
    public static final /* synthetic */ int y2 = 0;
    public String Q1;
    public int R1;
    public TL_chatlists.chatlist_ChatlistInvite S1;
    public TL_chatlists.TL_chatlists_chatlistUpdates T1;
    public final boolean U1;
    public String V1;
    public ArrayList W1;
    public boolean X1;
    public CharSequence Y1;
    public ArrayList Z1;
    public ArrayList a2;
    public ArrayList b2;
    public ArrayList c2;
    public FrameLayout d2;
    public nz e2;
    public View f2;
    public qz g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public int p2;
    public int q2;
    public oz r2;
    public int s2;
    public boolean t2;
    public org.telegram.messenger.u10 u2;
    public int v2;
    public long w2;
    public long x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(org.telegram.ui.ActionBar.d2 d2Var, int i3, ArrayList arrayList) {
        super(d2Var, false);
        org.telegram.messenger.mo moVar;
        TLRPC.Chat M0;
        this.R1 = -1;
        this.V1 = "";
        this.W1 = new ArrayList();
        this.Y1 = "";
        this.a2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.b2 = arrayList2;
        this.s2 = -1;
        this.v2 = -5;
        this.R1 = i3;
        this.U1 = true;
        this.Z1 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = d2Var.getMessagesController().Q0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.mo) arrayList3.get(i10)).a == i3) {
                    moVar = (org.telegram.messenger.mo) arrayList3.get(i10);
                    break;
                }
            }
        }
        moVar = null;
        if (moVar != null) {
            this.V1 = moVar.b;
            this.W1 = moVar.c;
            this.X1 = moVar.n;
            for (int i11 = 0; i11 < this.b2.size(); i11++) {
                TLRPC.Peer z12 = d2Var.getMessagesController().z1(((Long) this.b2.get(i11)).longValue());
                if ((z12 instanceof TLRPC.TL_peerChat) || (z12 instanceof TLRPC.TL_peerChannel)) {
                    this.Z1.add(z12);
                }
            }
            for (int i12 = 0; i12 < moVar.h.size(); i12++) {
                Long l10 = (Long) moVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.b2.contains(l10)) {
                    TLRPC.Peer z13 = d2Var.getMessagesController().z1(longValue);
                    if (((z13 instanceof TLRPC.TL_peerChat) || (z13 instanceof TLRPC.TL_peerChannel)) && ((M0 = d2Var.getMessagesController().M0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.t3.r0(M0))) {
                        this.Z1.add(z13);
                    }
                }
            }
        }
        f1();
    }

    public static void g1(org.telegram.ui.ActionBar.d2 d2Var, int i3, org.telegram.messenger.u10 u10Var) {
        org.telegram.messenger.mo moVar;
        ArrayList arrayList = d2Var.getMessagesController().Q0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.mo) arrayList.get(i10)).a == i3) {
                    moVar = (org.telegram.messenger.mo) arrayList.get(i10);
                    break;
                }
            }
        }
        moVar = null;
        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(i3, d2Var, u10Var, 9);
        if (moVar == null || !moVar.f()) {
            f4Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getContext());
        String M0 = org.telegram.messenger.bd.M0(2131750791, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new dm(u10Var));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new zw(f4Var, 3));
        d2Var.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        return new lz(this);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        if (this.U1) {
            return org.telegram.messenger.bd.M0(2131750634, null);
        }
        if (this.S1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.bd.M0(2131750637, null);
        }
        ArrayList arrayList = this.Z1;
        return (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.bd.M0(2131750635, null) : org.telegram.messenger.bd.M0(2131750636, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void U0(qt0 qt0Var) {
        tj0 tj0Var = this.l1;
        tj0Var.setOverScrollMode(2);
        tj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.e2 != null ? 68.0f : 0.0f));
        tj0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void d1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.bd.G(this.b2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (!z10 || this.r2 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.r2.b.getText());
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        if (this.s2 >= 0) {
            this.p1.getConnectionsManager().cancelRequest(this.s2, true);
        }
        org.telegram.messenger.u10 u10Var = this.u2;
        if (u10Var != null) {
            u10Var.a(Boolean.valueOf(this.t2));
            this.u2 = null;
        }
    }

    public final void e1(oz ozVar, boolean z10) {
        ArrayList arrayList = this.Z1;
        ArrayList arrayList2 = this.b2;
        arrayList2.clear();
        arrayList2.addAll(this.a2);
        int i3 = 0;
        if (!z10) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long o10 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList.get(i10));
                if (!arrayList2.contains(Long.valueOf(o10))) {
                    arrayList2.add(Long.valueOf(o10));
                }
            }
        }
        h1(true);
        ozVar.a(org.telegram.messenger.bd.M0(z10 ? 2131745680 : 2131751458, null), new ci.v6(this, ozVar, z10, 20));
        d1(true);
        while (true) {
            tj0 tj0Var = this.l1;
            if (i3 >= tj0Var.getChildCount()) {
                return;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.h4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i3++;
        }
    }

    public final void f1() {
        boolean z10;
        long j10;
        boolean r02;
        ArrayList arrayList = this.c2;
        this.Y1 = org.telegram.messenger.g0.K2(this.V1, "✱", "*");
        ArrayList arrayList2 = this.Z1;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i3);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.d2 d2Var = this.p1;
                        if (z11) {
                            j10 = -peer.chat_id;
                            r02 = org.telegram.messenger.t3.r0(d2Var.getMessagesController().M0(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            r02 = org.telegram.messenger.t3.r0(d2Var.getMessagesController().M0(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !r02;
                    }
                    if (j10 != 0 && !this.U1) {
                        if (z10) {
                            this.a2.add(Long.valueOf(j10));
                        }
                        this.b2.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.h2 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.i2 = -1;
            this.j2 = -1;
            this.k2 = -1;
            this.l2 = -1;
        } else {
            int i10 = this.h2;
            int i11 = i10 + 1;
            this.i2 = i10;
            int i12 = i10 + 2;
            this.h2 = i12;
            this.j2 = i11;
            this.k2 = i12;
            int size = arrayList2.size() + i12;
            this.h2 = size;
            this.l2 = size;
        }
        int i13 = this.h2;
        this.h2 = i13 + 1;
        this.m2 = i13;
        if (arrayList == null || arrayList.isEmpty()) {
            this.n2 = -1;
            this.o2 = -1;
            this.p2 = -1;
            this.q2 = -1;
        } else {
            int i14 = this.h2;
            int i15 = i14 + 1;
            this.h2 = i15;
            this.n2 = i14;
            this.o2 = i15;
            int size2 = arrayList.size() + i15;
            this.p2 = size2;
            this.h2 = size2 + 1;
            this.q2 = size2;
        }
        Context context = getContext();
        nz nzVar = new nz(context);
        xq xqVar = xq.h;
        nzVar.e = new u5(350L, xqVar);
        nzVar.n = 0.0f;
        nzVar.w = 1.0f;
        nzVar.E = 1.0f;
        nzVar.F = true;
        nzVar.J = org.telegram.ui.ActionBar.k6.I.q();
        View view = new View(context);
        nzVar.f = view;
        int i16 = org.telegram.ui.ActionBar.k6.Ci;
        view.setBackground(org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.k6.x0(null, i16, false)), 8.0f));
        nzVar.addView(view, b8.mf.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        nzVar.h = d02;
        nzVar.setBackground(d02);
        Paint paint = new Paint(1);
        nzVar.a = paint;
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        g6 g6Var = new g6(true, true, false);
        nzVar.b = g6Var;
        g6Var.n(0.3f, 250L, xqVar);
        g6Var.setCallback(nzVar);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        g6Var.t("", true, true);
        g6Var.b = 1;
        g6 g6Var2 = new g6(false, false, true);
        nzVar.c = g6Var2;
        g6Var2.n(0.3f, 250L, xqVar);
        g6Var2.setCallback(nzVar);
        g6Var2.w(org.telegram.messenger.g0.L(12.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        g6Var2.t("", true, true);
        g6Var2.b = 1;
        nzVar.setWillNotDraw(false);
        this.e2 = nzVar;
        nzVar.setOnClickListener(new f0(this, 15));
        this.b.addView(this.e2, b8.mf.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f2 = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, view2, null);
        this.b.addView(this.f2, b8.mf.d(-1, 1.0f / org.telegram.messenger.g0.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.l1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.e2 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d2 = frameLayout;
        this.b.addView(frameLayout, b8.mf.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        O(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
        h1(false);
        this.m1.setTitle(O0());
    }

    public final void h1(boolean z10) {
        int i3;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.S1;
        int size = this.b2.size();
        nz nzVar = this.e2;
        if (nzVar != null) {
            if (this.U1) {
                nzVar.b(org.telegram.messenger.bd.M0(size > 0 ? 2131750670 : 2131750671, null), z10);
            } else {
                ArrayList arrayList = this.Z1;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.e2.b(org.telegram.messenger.bd.M0(2131747839, null), z10);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.e2.b(org.telegram.messenger.bd.V(null, null, 2131750676, org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(this.V1, this.e2.b.a.getFontMetricsInt(), false, null, 0), this.W1, this.e2.b.a.getFontMetricsInt(), false)), z10);
                        this.e2.b.p = this.X1 ? 26 : 0;
                    } else {
                        this.e2.b(size > 0 ? org.telegram.messenger.bd.G(size, "FolderLinkButtonJoinPlural", new Object[0]) : org.telegram.messenger.bd.M0(2131750672, null), z10);
                    }
                }
            }
            nz nzVar2 = this.e2;
            g6 g6Var = nzVar2.c;
            if (z10) {
                g6Var.a();
            }
            if (z10 && size != (i3 = nzVar2.y) && size > 0 && i3 > 0) {
                ValueAnimator valueAnimator = nzVar2.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    nzVar2.x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                nzVar2.x = ofFloat;
                ofFloat.addUpdateListener(new mz(nzVar2, 1));
                nzVar2.x.addListener(new x5(nzVar2, 28));
                org.telegram.messenger.camera.q.i(2.0f, nzVar2.x);
                nzVar2.x.setDuration(200L);
                nzVar2.x.start();
            }
            nzVar2.y = size;
            nzVar2.d = size != 0 ? 1.0f : 0.0f;
            g6Var.t("" + size, z10, true);
            nzVar2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.e2.setEnabled(!r1.isEmpty());
            }
        }
        qz qzVar = this.g2;
        if (qzVar != null) {
            qzVar.a();
        }
    }

    public final void i1() {
        ArrayList arrayList = this.a2;
        ArrayList arrayList2 = this.Z1;
        oz ozVar = this.r2;
        if (ozVar == null) {
            return;
        }
        if (this.U1) {
            ozVar.b(org.telegram.messenger.bd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            ozVar.b(org.telegram.messenger.bd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.r2.a("", null);
        } else {
            boolean z10 = this.b2.size() >= arrayList2.size() - arrayList.size();
            this.r2.a(org.telegram.messenger.bd.M0(z10 ? 2131751458 : 2131745680, null), new ci.e1(24, this, z10));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            if (this.H0 != x02) {
                O(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
