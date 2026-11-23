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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g00 extends ra {
    public static final /* synthetic */ int B2 = 0;
    public long A2;
    public String T1;
    public int U1;
    public TL_chatlists.chatlist_ChatlistInvite V1;
    public TL_chatlists.TL_chatlists_chatlistUpdates W1;
    public final boolean X1;
    public String Y1;
    public ArrayList Z1;
    public boolean a2;
    public CharSequence b2;
    public ArrayList c2;
    public ArrayList d2;
    public ArrayList e2;
    public ArrayList f2;
    public FrameLayout g2;
    public c00 h2;
    public View i2;
    public f00 j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public int p2;
    public int q2;
    public int r2;
    public int s2;
    public int t2;
    public d00 u2;
    public int v2;
    public boolean w2;
    public org.telegram.messenger.w10 x2;
    public int y2;
    public long z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g00(org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList) {
        super(g2Var, false);
        org.telegram.messenger.ro roVar;
        TLRPC.Chat O0;
        this.U1 = -1;
        this.Y1 = "";
        this.Z1 = new ArrayList();
        this.b2 = "";
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.e2 = arrayList2;
        this.v2 = -1;
        this.y2 = -5;
        this.U1 = i7;
        this.X1 = true;
        this.c2 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = g2Var.getMessagesController().Q0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.ro) arrayList3.get(i10)).a == i7) {
                    roVar = (org.telegram.messenger.ro) arrayList3.get(i10);
                    break;
                }
            }
        }
        roVar = null;
        if (roVar != null) {
            this.Y1 = roVar.b;
            this.Z1 = roVar.c;
            this.a2 = roVar.n;
            for (int i11 = 0; i11 < this.e2.size(); i11++) {
                TLRPC.Peer B1 = g2Var.getMessagesController().B1(((Long) this.e2.get(i11)).longValue());
                if ((B1 instanceof TLRPC.TL_peerChat) || (B1 instanceof TLRPC.TL_peerChannel)) {
                    this.c2.add(B1);
                }
            }
            for (int i12 = 0; i12 < roVar.h.size(); i12++) {
                Long l10 = (Long) roVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.e2.contains(l10)) {
                    TLRPC.Peer B12 = g2Var.getMessagesController().B1(longValue);
                    if (((B12 instanceof TLRPC.TL_peerChat) || (B12 instanceof TLRPC.TL_peerChannel)) && ((O0 = g2Var.getMessagesController().O0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.v3.r0(O0))) {
                        this.c2.add(B12);
                    }
                }
            }
        }
        g1();
    }

    public static void h1(org.telegram.ui.ActionBar.g2 g2Var, int i7, org.telegram.messenger.w10 w10Var) {
        org.telegram.messenger.ro roVar;
        ArrayList arrayList = g2Var.getMessagesController().Q0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.ro) arrayList.get(i10)).a == i7) {
                    roVar = (org.telegram.messenger.ro) arrayList.get(i10);
                    break;
                }
            }
        }
        roVar = null;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(i7, g2Var, w10Var, 11);
        if (roVar == null || !roVar.e()) {
            f0Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getContext());
        String N0 = org.telegram.messenger.gd.N0(2131750778, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131750776, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new tm(w10Var));
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new hy(f0Var, 2));
        g2Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        return new zz(this);
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        if (this.X1) {
            return org.telegram.messenger.gd.N0(2131750616, null);
        }
        if (this.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.gd.N0(2131750619, null);
        }
        ArrayList arrayList = this.c2;
        return (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.gd.N0(2131750617, null) : org.telegram.messenger.gd.N0(2131750618, null);
    }

    @Override // org.telegram.ui.Components.ra
    public final void V0(cu0 cu0Var) {
        ek0 ek0Var = this.o1;
        ek0Var.setOverScrollMode(2);
        ek0Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.h2 != null ? 68.0f : 0.0f));
        ek0Var.setOnItemClickListener(new n(this, 8));
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        if (this.v2 >= 0) {
            this.s1.getConnectionsManager().cancelRequest(this.v2, true);
        }
        org.telegram.messenger.w10 w10Var = this.x2;
        if (w10Var != null) {
            w10Var.a(Boolean.valueOf(this.w2));
            this.x2 = null;
        }
    }

    public final void e1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.gd.G(this.e2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (!z10 || this.u2 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.u2.b.getText());
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    public final void f1(d00 d00Var, boolean z10) {
        ArrayList arrayList = this.c2;
        ArrayList arrayList2 = this.e2;
        arrayList2.clear();
        arrayList2.addAll(this.d2);
        int i7 = 0;
        if (!z10) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) arrayList.get(i10));
                if (!arrayList2.contains(Long.valueOf(o4))) {
                    arrayList2.add(Long.valueOf(o4));
                }
            }
        }
        i1(true);
        d00Var.a(org.telegram.messenger.gd.N0(z10 ? 2131745474 : 2131751445, null), new di.p6(this, d00Var, z10, 20));
        e1(true);
        while (true) {
            ek0 ek0Var = this.o1;
            if (i7 >= ek0Var.getChildCount()) {
                return;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.i4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i7++;
        }
    }

    public final void g1() {
        boolean z10;
        long j3;
        boolean r02;
        ArrayList arrayList = this.f2;
        this.b2 = org.telegram.messenger.g0.K2(this.Y1, "✱", "*");
        ArrayList arrayList2 = this.c2;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i7);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.g2 g2Var = this.s1;
                        if (z11) {
                            j3 = -peer.chat_id;
                            r02 = org.telegram.messenger.v3.r0(g2Var.getMessagesController().O0(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            r02 = org.telegram.messenger.v3.r0(g2Var.getMessagesController().O0(Long.valueOf(-j3)));
                        } else {
                            z10 = false;
                            j3 = 0;
                        }
                        z10 = !r02;
                    }
                    if (j3 != 0 && !this.X1) {
                        if (z10) {
                            this.d2.add(Long.valueOf(j3));
                        }
                        this.e2.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.k2 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.l2 = -1;
            this.m2 = -1;
            this.n2 = -1;
            this.o2 = -1;
        } else {
            int i10 = this.k2;
            int i11 = i10 + 1;
            this.l2 = i10;
            int i12 = i10 + 2;
            this.k2 = i12;
            this.m2 = i11;
            this.n2 = i12;
            int size = arrayList2.size() + i12;
            this.k2 = size;
            this.o2 = size;
        }
        int i13 = this.k2;
        this.k2 = i13 + 1;
        this.p2 = i13;
        if (arrayList == null || arrayList.isEmpty()) {
            this.q2 = -1;
            this.r2 = -1;
            this.s2 = -1;
            this.t2 = -1;
        } else {
            int i14 = this.k2;
            int i15 = i14 + 1;
            this.k2 = i15;
            this.q2 = i14;
            this.r2 = i15;
            int size2 = arrayList.size() + i15;
            this.s2 = size2;
            this.k2 = size2 + 1;
            this.t2 = size2;
        }
        Context context = getContext();
        c00 c00Var = new c00(context);
        kr krVar = kr.h;
        c00Var.e = new c6(350L, krVar);
        c00Var.n = 0.0f;
        c00Var.w = 1.0f;
        c00Var.E = 1.0f;
        c00Var.F = true;
        c00Var.J = org.telegram.ui.ActionBar.n6.I.q();
        View view = new View(context);
        c00Var.f = view;
        int i16 = org.telegram.ui.ActionBar.n6.Fi;
        view.setBackground(org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.n6.x0(null, i16, false)), 8.0f));
        c00Var.addView(view, c8.na.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.n6.x0(null, i16, false));
        c00Var.h = d02;
        c00Var.setBackground(d02);
        Paint paint = new Paint(1);
        c00Var.a = paint;
        int i17 = org.telegram.ui.ActionBar.n6.Ji;
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i17, false));
        m6 m6Var = new m6(true, true, false);
        c00Var.b = m6Var;
        m6Var.n(0.3f, 250L, krVar);
        m6Var.setCallback(c00Var);
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, i17, false));
        m6Var.t("", true, true);
        m6Var.b = 1;
        m6 m6Var2 = new m6(false, false, true);
        c00Var.c = m6Var2;
        m6Var2.n(0.3f, 250L, krVar);
        m6Var2.setCallback(c00Var);
        m6Var2.w(org.telegram.messenger.g0.L(12.0f));
        m6Var2.x(org.telegram.messenger.g0.o());
        m6Var2.u(org.telegram.ui.ActionBar.n6.x0(null, i16, false));
        m6Var2.t("", true, true);
        m6Var2.b = 1;
        c00Var.setWillNotDraw(false);
        this.h2 = c00Var;
        c00Var.setOnClickListener(new n0(this, 17));
        this.b.addView(this.h2, c8.na.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.i2 = view2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, view2, null);
        this.b.addView(this.i2, c8.na.d(-1, 1.0f / org.telegram.messenger.g0.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.h2 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g2 = frameLayout;
        this.b.addView(frameLayout, c8.na.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        P(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false));
        i1(false);
        this.p1.setTitle(P0());
    }

    public final void i1(boolean z10) {
        int i7;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V1;
        int size = this.e2.size();
        c00 c00Var = this.h2;
        if (c00Var != null) {
            if (this.X1) {
                c00Var.b(org.telegram.messenger.gd.N0(size > 0 ? 2131750652 : 2131750653, null), z10);
            } else {
                ArrayList arrayList = this.c2;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.h2.b(org.telegram.messenger.gd.N0(2131747637, null), z10);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.h2.b(org.telegram.messenger.gd.V(null, null, 2131750658, org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(this.Y1, this.h2.b.a.getFontMetricsInt(), false, null, 0), this.Z1, this.h2.b.a.getFontMetricsInt(), false)), z10);
                        this.h2.b.p = this.a2 ? 26 : 0;
                    } else {
                        this.h2.b(size > 0 ? org.telegram.messenger.gd.G(size, "FolderLinkButtonJoinPlural", new Object[0]) : org.telegram.messenger.gd.N0(2131750654, null), z10);
                    }
                }
            }
            c00 c00Var2 = this.h2;
            m6 m6Var = c00Var2.c;
            if (z10) {
                m6Var.a();
            }
            if (z10 && size != (i7 = c00Var2.y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = c00Var2.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    c00Var2.x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                c00Var2.x = ofFloat;
                ofFloat.addUpdateListener(new a00(c00Var2, 1));
                c00Var2.x.addListener(new x(c00Var2, 28));
                org.telegram.ui.Cells.c0.q(2.0f, c00Var2.x);
                c00Var2.x.setDuration(200L);
                c00Var2.x.start();
            }
            c00Var2.y = size;
            c00Var2.d = size != 0 ? 1.0f : 0.0f;
            m6Var.t("" + size, z10, true);
            c00Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.h2.setEnabled(!r1.isEmpty());
            }
        }
        f00 f00Var = this.j2;
        if (f00Var != null) {
            f00Var.a();
        }
    }

    public final void j1() {
        ArrayList arrayList = this.d2;
        ArrayList arrayList2 = this.c2;
        d00 d00Var = this.u2;
        if (d00Var == null) {
            return;
        }
        if (this.X1) {
            d00Var.b(org.telegram.messenger.gd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            d00Var.b(org.telegram.messenger.gd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.u2.a("", null);
        } else {
            boolean z10 = this.e2.size() >= arrayList2.size() - arrayList.size();
            this.u2.a(org.telegram.messenger.gd.N0(z10 ? 2131751445 : 2131745474, null), new ch.k(25, this, z10));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
            if (this.H0 != x02) {
                P(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
