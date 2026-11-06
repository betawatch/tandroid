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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class vz extends na {
    public static final /* synthetic */ int x2 = 0;
    public String P1;
    public int Q1;
    public TL_chatlists.chatlist_ChatlistInvite R1;
    public TL_chatlists.TL_chatlists_chatlistUpdates S1;
    public final boolean T1;
    public String U1;
    public ArrayList V1;
    public boolean W1;
    public CharSequence X1;
    public ArrayList Y1;
    public ArrayList Z1;
    public ArrayList a2;
    public ArrayList b2;
    public FrameLayout c2;
    public rz d2;
    public View e2;
    public uz f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public int p2;
    public sz q2;
    public int r2;
    public boolean s2;
    public org.telegram.messenger.c20 t2;
    public int u2;
    public long v2;
    public long w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz(org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList) {
        super(f2Var, false);
        org.telegram.messenger.vo voVar;
        TLRPC.Chat M0;
        this.Q1 = -1;
        this.U1 = "";
        this.V1 = new ArrayList();
        this.X1 = "";
        this.Z1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.a2 = arrayList2;
        this.r2 = -1;
        this.u2 = -5;
        this.Q1 = i7;
        this.T1 = true;
        this.Y1 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = f2Var.getMessagesController().P0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.vo) arrayList3.get(i10)).a == i7) {
                    voVar = (org.telegram.messenger.vo) arrayList3.get(i10);
                    break;
                }
            }
        }
        voVar = null;
        if (voVar != null) {
            this.U1 = voVar.b;
            this.V1 = voVar.c;
            this.W1 = voVar.n;
            for (int i11 = 0; i11 < this.a2.size(); i11++) {
                TLRPC.Peer z12 = f2Var.getMessagesController().z1(((Long) this.a2.get(i11)).longValue());
                if ((z12 instanceof TLRPC.TL_peerChat) || (z12 instanceof TLRPC.TL_peerChannel)) {
                    this.Y1.add(z12);
                }
            }
            for (int i12 = 0; i12 < voVar.h.size(); i12++) {
                Long l10 = (Long) voVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.a2.contains(l10)) {
                    TLRPC.Peer z13 = f2Var.getMessagesController().z1(longValue);
                    if (((z13 instanceof TLRPC.TL_peerChat) || (z13 instanceof TLRPC.TL_peerChannel)) && ((M0 = f2Var.getMessagesController().M0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.t3.r0(M0))) {
                        this.Y1.add(z13);
                    }
                }
            }
        }
        f1();
    }

    public static void g1(org.telegram.ui.ActionBar.f2 f2Var, int i7, org.telegram.messenger.c20 c20Var) {
        org.telegram.messenger.vo voVar;
        ArrayList arrayList = f2Var.getMessagesController().P0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.vo) arrayList.get(i10)).a == i7) {
                    voVar = (org.telegram.messenger.vo) arrayList.get(i10);
                    break;
                }
            }
        }
        voVar = null;
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(i7, f2Var, c20Var, 8);
        if (voVar == null || !voVar.f()) {
            q8Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getContext());
        String M0 = org.telegram.messenger.hd.M0(2131750791, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new em(c20Var));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new ax(q8Var, 3));
        f2Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        return new oz(this);
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        if (this.T1) {
            return org.telegram.messenger.hd.M0(2131750634, null);
        }
        if (this.R1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.hd.M0(2131750637, null);
        }
        ArrayList arrayList = this.Y1;
        return (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.hd.M0(2131750635, null) : org.telegram.messenger.hd.M0(2131750636, null);
    }

    @Override // org.telegram.ui.Components.na
    public final void U0(rt0 rt0Var) {
        pj0 pj0Var = this.k1;
        pj0Var.setOverScrollMode(2);
        pj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.d2 != null ? 68.0f : 0.0f));
        pj0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void d1(boolean z9) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.hd.G(this.a2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (!z9 || this.q2 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.q2.b.getText());
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        if (this.r2 >= 0) {
            this.o1.getConnectionsManager().cancelRequest(this.r2, true);
        }
        org.telegram.messenger.c20 c20Var = this.t2;
        if (c20Var != null) {
            c20Var.a(Boolean.valueOf(this.s2));
            this.t2 = null;
        }
    }

    public final void e1(sz szVar, boolean z9) {
        ArrayList arrayList = this.Y1;
        ArrayList arrayList2 = this.a2;
        arrayList2.clear();
        arrayList2.addAll(this.Z1);
        int i7 = 0;
        if (!z9) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList.get(i10));
                if (!arrayList2.contains(Long.valueOf(o4))) {
                    arrayList2.add(Long.valueOf(o4));
                }
            }
        }
        h1(true);
        szVar.a(org.telegram.messenger.hd.M0(z9 ? 2131745671 : 2131751458, null), new bi.u7(this, szVar, z9, 20));
        d1(true);
        while (true) {
            pj0 pj0Var = this.k1;
            if (i7 >= pj0Var.getChildCount()) {
                return;
            }
            View childAt = pj0Var.getChildAt(i7);
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
        boolean z9;
        long j3;
        boolean r02;
        ArrayList arrayList = this.b2;
        this.X1 = org.telegram.messenger.g0.K2(this.U1, "✱", "*");
        ArrayList arrayList2 = this.Y1;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i7);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z9 = false;
                    } else {
                        boolean z10 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.f2 f2Var = this.o1;
                        if (z10) {
                            j3 = -peer.chat_id;
                            r02 = org.telegram.messenger.t3.r0(f2Var.getMessagesController().M0(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            r02 = org.telegram.messenger.t3.r0(f2Var.getMessagesController().M0(Long.valueOf(-j3)));
                        } else {
                            z9 = false;
                            j3 = 0;
                        }
                        z9 = !r02;
                    }
                    if (j3 != 0 && !this.T1) {
                        if (z9) {
                            this.Z1.add(Long.valueOf(j3));
                        }
                        this.a2.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.g2 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.h2 = -1;
            this.i2 = -1;
            this.j2 = -1;
            this.k2 = -1;
        } else {
            int i10 = this.g2;
            int i11 = i10 + 1;
            this.h2 = i10;
            int i12 = i10 + 2;
            this.g2 = i12;
            this.i2 = i11;
            this.j2 = i12;
            int size = arrayList2.size() + i12;
            this.g2 = size;
            this.k2 = size;
        }
        int i13 = this.g2;
        this.g2 = i13 + 1;
        this.l2 = i13;
        if (arrayList == null || arrayList.isEmpty()) {
            this.m2 = -1;
            this.n2 = -1;
            this.o2 = -1;
            this.p2 = -1;
        } else {
            int i14 = this.g2;
            int i15 = i14 + 1;
            this.g2 = i15;
            this.m2 = i14;
            this.n2 = i15;
            int size2 = arrayList.size() + i15;
            this.o2 = size2;
            this.g2 = size2 + 1;
            this.p2 = size2;
        }
        Context context = getContext();
        rz rzVar = new rz(context);
        xq xqVar = xq.h;
        rzVar.e = new w5(350L, xqVar);
        rzVar.n = 0.0f;
        rzVar.w = 1.0f;
        rzVar.D = 1.0f;
        rzVar.E = true;
        rzVar.I = org.telegram.ui.ActionBar.k6.I.q();
        View view = new View(context);
        rzVar.f = view;
        int i16 = org.telegram.ui.ActionBar.k6.Ci;
        view.setBackground(org.telegram.ui.ActionBar.z5.d(0, org.telegram.ui.ActionBar.z5.b(org.telegram.ui.ActionBar.k6.x0(null, i16, false)), 8.0f));
        rzVar.addView(view, c8.ha.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        rzVar.h = d02;
        rzVar.setBackground(d02);
        Paint paint = new Paint(1);
        rzVar.a = paint;
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        i6 i6Var = new i6(true, true, false);
        rzVar.b = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.setCallback(rzVar);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        i6Var.t("", true, true);
        i6Var.b = 1;
        i6 i6Var2 = new i6(false, false, true);
        rzVar.c = i6Var2;
        i6Var2.n(0.3f, 250L, xqVar);
        i6Var2.setCallback(rzVar);
        i6Var2.w(org.telegram.messenger.g0.L(12.0f));
        i6Var2.x(org.telegram.messenger.g0.o());
        i6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        i6Var2.t("", true, true);
        i6Var2.b = 1;
        rzVar.setWillNotDraw(false);
        this.d2 = rzVar;
        rzVar.setOnClickListener(new h0(this, 15));
        this.b.addView(this.d2, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.e2 = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, view2, null);
        this.b.addView(this.e2, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.k1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.d2 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c2 = frameLayout;
        this.b.addView(frameLayout, c8.ha.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        O(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
        h1(false);
        this.l1.setTitle(O0());
    }

    public final void h1(boolean z9) {
        int i7;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.R1;
        int size = this.a2.size();
        rz rzVar = this.d2;
        if (rzVar != null) {
            if (this.T1) {
                rzVar.b(org.telegram.messenger.hd.M0(size > 0 ? 2131750670 : 2131750671, null), z9);
            } else {
                ArrayList arrayList = this.Y1;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.d2.b(org.telegram.messenger.hd.M0(2131747830, null), z9);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.d2.b(org.telegram.messenger.hd.V(null, null, 2131750676, org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(this.U1, this.d2.b.a.getFontMetricsInt(), false, null, 0), this.V1, this.d2.b.a.getFontMetricsInt(), false)), z9);
                        this.d2.b.p = this.W1 ? 26 : 0;
                    } else {
                        this.d2.b(size > 0 ? org.telegram.messenger.hd.G(size, "FolderLinkButtonJoinPlural", new Object[0]) : org.telegram.messenger.hd.M0(2131750672, null), z9);
                    }
                }
            }
            rz rzVar2 = this.d2;
            i6 i6Var = rzVar2.c;
            if (z9) {
                i6Var.a();
            }
            if (z9 && size != (i7 = rzVar2.y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = rzVar2.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    rzVar2.x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                rzVar2.x = ofFloat;
                ofFloat.addUpdateListener(new pz(rzVar2, 1));
                rzVar2.x.addListener(new z5(rzVar2, 28));
                org.telegram.messenger.camera.q.i(2.0f, rzVar2.x);
                rzVar2.x.setDuration(200L);
                rzVar2.x.start();
            }
            rzVar2.y = size;
            rzVar2.d = size != 0 ? 1.0f : 0.0f;
            i6Var.t("" + size, z9, true);
            rzVar2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.d2.setEnabled(!r1.isEmpty());
            }
        }
        uz uzVar = this.f2;
        if (uzVar != null) {
            uzVar.a();
        }
    }

    public final void i1() {
        ArrayList arrayList = this.Z1;
        ArrayList arrayList2 = this.Y1;
        sz szVar = this.q2;
        if (szVar == null) {
            return;
        }
        if (this.T1) {
            szVar.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            szVar.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.q2.a("", null);
        } else {
            boolean z9 = this.a2.size() >= arrayList2.size() - arrayList.size();
            this.q2.a(org.telegram.messenger.hd.M0(z9 ? 2131751458 : 2131745671, null), new bi.k1(24, this, z9));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            if (this.G0 != x02) {
                O(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
