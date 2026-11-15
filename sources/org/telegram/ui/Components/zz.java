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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zz extends ja {
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
    public vz h2;
    public View i2;
    public yz j2;
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
    public wz u2;
    public int v2;
    public boolean w2;
    public org.telegram.messenger.z10 x2;
    public int y2;
    public long z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(org.telegram.ui.ActionBar.e2 e2Var, int i7, ArrayList arrayList) {
        super(e2Var, false);
        org.telegram.messenger.so soVar;
        TLRPC.Chat M0;
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
        ArrayList arrayList3 = e2Var.getMessagesController().Q0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.so) arrayList3.get(i10)).a == i7) {
                    soVar = (org.telegram.messenger.so) arrayList3.get(i10);
                    break;
                }
            }
        }
        soVar = null;
        if (soVar != null) {
            this.Y1 = soVar.b;
            this.Z1 = soVar.c;
            this.a2 = soVar.n;
            for (int i11 = 0; i11 < this.e2.size(); i11++) {
                TLRPC.Peer z12 = e2Var.getMessagesController().z1(((Long) this.e2.get(i11)).longValue());
                if ((z12 instanceof TLRPC.TL_peerChat) || (z12 instanceof TLRPC.TL_peerChannel)) {
                    this.c2.add(z12);
                }
            }
            for (int i12 = 0; i12 < soVar.h.size(); i12++) {
                Long l10 = (Long) soVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.e2.contains(l10)) {
                    TLRPC.Peer z13 = e2Var.getMessagesController().z1(longValue);
                    if (((z13 instanceof TLRPC.TL_peerChat) || (z13 instanceof TLRPC.TL_peerChannel)) && ((M0 = e2Var.getMessagesController().M0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.t3.r0(M0))) {
                        this.c2.add(z13);
                    }
                }
            }
        }
        f1();
    }

    public static void g1(org.telegram.ui.ActionBar.e2 e2Var, int i7, org.telegram.messenger.z10 z10Var) {
        org.telegram.messenger.so soVar;
        ArrayList arrayList = e2Var.getMessagesController().Q0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.so) arrayList.get(i10)).a == i7) {
                    soVar = (org.telegram.messenger.so) arrayList.get(i10);
                    break;
                }
            }
        }
        soVar = null;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(i7, e2Var, z10Var, 11);
        if (soVar == null || !soVar.f()) {
            f0Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getContext());
        String M0 = org.telegram.messenger.hd.M0(2131750790, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131750788, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new mm(z10Var));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new gx(f0Var, 3));
        e2Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
        }
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        return new sz(this);
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        if (this.X1) {
            return org.telegram.messenger.hd.M0(2131750633, null);
        }
        if (this.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.hd.M0(2131750636, null);
        }
        ArrayList arrayList = this.c2;
        return (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.hd.M0(2131750634, null) : org.telegram.messenger.hd.M0(2131750635, null);
    }

    @Override // org.telegram.ui.Components.ja
    public final void U0(st0 st0Var) {
        uj0 uj0Var = this.o1;
        uj0Var.setOverScrollMode(2);
        uj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.h2 != null ? 68.0f : 0.0f));
        uj0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void d1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.hd.G(this.e2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (!z10 || this.u2 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.u2.b.getText());
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        if (this.v2 >= 0) {
            this.s1.getConnectionsManager().cancelRequest(this.v2, true);
        }
        org.telegram.messenger.z10 z10Var = this.x2;
        if (z10Var != null) {
            z10Var.a(Boolean.valueOf(this.w2));
            this.x2 = null;
        }
    }

    public final void e1(wz wzVar, boolean z10) {
        ArrayList arrayList = this.c2;
        ArrayList arrayList2 = this.e2;
        arrayList2.clear();
        arrayList2.addAll(this.d2);
        int i7 = 0;
        if (!z10) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList.get(i10));
                if (!arrayList2.contains(Long.valueOf(o4))) {
                    arrayList2.add(Long.valueOf(o4));
                }
            }
        }
        h1(true);
        wzVar.a(org.telegram.messenger.hd.M0(z10 ? 2131745670 : 2131751457, null), new di.m6(this, wzVar, z10, 20));
        d1(true);
        while (true) {
            uj0 uj0Var = this.o1;
            if (i7 >= uj0Var.getChildCount()) {
                return;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.h4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i7++;
        }
    }

    public final void f1() {
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
                        org.telegram.ui.ActionBar.e2 e2Var = this.s1;
                        if (z11) {
                            j3 = -peer.chat_id;
                            r02 = org.telegram.messenger.t3.r0(e2Var.getMessagesController().M0(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            r02 = org.telegram.messenger.t3.r0(e2Var.getMessagesController().M0(Long.valueOf(-j3)));
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
        vz vzVar = new vz(context);
        er erVar = er.h;
        vzVar.e = new u5(350L, erVar);
        vzVar.n = 0.0f;
        vzVar.w = 1.0f;
        vzVar.E = 1.0f;
        vzVar.F = true;
        vzVar.J = org.telegram.ui.ActionBar.j6.I.q();
        View view = new View(context);
        vzVar.f = view;
        int i16 = org.telegram.ui.ActionBar.j6.Fi;
        view.setBackground(org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.j6.x0(null, i16, false)), 8.0f));
        vzVar.addView(view, c8.ja.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.j6.x0(null, i16, false));
        vzVar.h = d02;
        vzVar.setBackground(d02);
        Paint paint = new Paint(1);
        vzVar.a = paint;
        int i17 = org.telegram.ui.ActionBar.j6.Ji;
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i17, false));
        g6 g6Var = new g6(true, true, false);
        vzVar.b = g6Var;
        g6Var.n(0.3f, 250L, erVar);
        g6Var.setCallback(vzVar);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.j6.x0(null, i17, false));
        g6Var.t("", true, true);
        g6Var.b = 1;
        g6 g6Var2 = new g6(false, false, true);
        vzVar.c = g6Var2;
        g6Var2.n(0.3f, 250L, erVar);
        g6Var2.setCallback(vzVar);
        g6Var2.w(org.telegram.messenger.g0.L(12.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(org.telegram.ui.ActionBar.j6.x0(null, i16, false));
        g6Var2.t("", true, true);
        g6Var2.b = 1;
        vzVar.setWillNotDraw(false);
        this.h2 = vzVar;
        vzVar.setOnClickListener(new e0(this, 16));
        this.b.addView(this.h2, c8.ja.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.i2 = view2;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, view2, null);
        this.b.addView(this.i2, c8.ja.d(-1, 1.0f / org.telegram.messenger.g0.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.h2 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g2 = frameLayout;
        this.b.addView(frameLayout, c8.ja.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        P(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false));
        h1(false);
        this.p1.setTitle(O0());
    }

    public final void h1(boolean z10) {
        int i7;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V1;
        int size = this.e2.size();
        vz vzVar = this.h2;
        if (vzVar != null) {
            if (this.X1) {
                vzVar.b(org.telegram.messenger.hd.M0(size > 0 ? 2131750669 : 2131750670, null), z10);
            } else {
                ArrayList arrayList = this.c2;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.h2.b(org.telegram.messenger.hd.M0(2131747831, null), z10);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.h2.b(org.telegram.messenger.hd.V(null, null, 2131750675, org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(this.Y1, this.h2.b.a.getFontMetricsInt(), false, null, 0), this.Z1, this.h2.b.a.getFontMetricsInt(), false)), z10);
                        this.h2.b.p = this.a2 ? 26 : 0;
                    } else {
                        this.h2.b(size > 0 ? org.telegram.messenger.hd.G(size, "FolderLinkButtonJoinPlural", new Object[0]) : org.telegram.messenger.hd.M0(2131750671, null), z10);
                    }
                }
            }
            vz vzVar2 = this.h2;
            g6 g6Var = vzVar2.c;
            if (z10) {
                g6Var.a();
            }
            if (z10 && size != (i7 = vzVar2.y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = vzVar2.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    vzVar2.x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vzVar2.x = ofFloat;
                ofFloat.addUpdateListener(new tz(vzVar2, 1));
                vzVar2.x.addListener(new x5(vzVar2, 28));
                org.telegram.messenger.i20.k(2.0f, vzVar2.x);
                vzVar2.x.setDuration(200L);
                vzVar2.x.start();
            }
            vzVar2.y = size;
            vzVar2.d = size != 0 ? 1.0f : 0.0f;
            g6Var.t("" + size, z10, true);
            vzVar2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.h2.setEnabled(!r1.isEmpty());
            }
        }
        yz yzVar = this.j2;
        if (yzVar != null) {
            yzVar.a();
        }
    }

    public final void i1() {
        ArrayList arrayList = this.d2;
        ArrayList arrayList2 = this.c2;
        wz wzVar = this.u2;
        if (wzVar == null) {
            return;
        }
        if (this.X1) {
            wzVar.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            wzVar.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.u2.a("", null);
        } else {
            boolean z10 = this.e2.size() >= arrayList2.size() - arrayList.size();
            this.u2.a(org.telegram.messenger.hd.M0(z10 ? 2131751457 : 2131745670, null), new ai.q(25, this, z10));
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
            if (this.H0 != x02) {
                P(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
