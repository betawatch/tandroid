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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j00 extends ha {
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
    public f00 d2;
    public View e2;
    public i00 f2;
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
    public g00 q2;
    public int r2;
    public boolean s2;
    public org.telegram.messenger.q20 t2;
    public int u2;
    public long v2;
    public long w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j00(org.telegram.ui.ActionBar.k2 k2Var, int i10, ArrayList arrayList) {
        super(k2Var, false);
        org.telegram.messenger.ap apVar;
        TLRPC.Chat L0;
        this.Q1 = -1;
        this.U1 = "";
        this.V1 = new ArrayList();
        this.X1 = "";
        this.Z1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.a2 = arrayList2;
        this.r2 = -1;
        this.u2 = -5;
        this.Q1 = i10;
        this.T1 = true;
        this.Y1 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = k2Var.getMessagesController().P0;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (((org.telegram.messenger.ap) arrayList3.get(i11)).a == i10) {
                    apVar = (org.telegram.messenger.ap) arrayList3.get(i11);
                    break;
                }
            }
        }
        apVar = null;
        if (apVar != null) {
            this.U1 = apVar.b;
            this.V1 = apVar.c;
            this.W1 = apVar.n;
            for (int i12 = 0; i12 < this.a2.size(); i12++) {
                TLRPC.Peer y12 = k2Var.getMessagesController().y1(((Long) this.a2.get(i12)).longValue());
                if ((y12 instanceof TLRPC.TL_peerChat) || (y12 instanceof TLRPC.TL_peerChannel)) {
                    this.Y1.add(y12);
                }
            }
            for (int i13 = 0; i13 < apVar.h.size(); i13++) {
                Long l4 = (Long) apVar.h.get(i13);
                long longValue = l4.longValue();
                if (!this.a2.contains(l4)) {
                    TLRPC.Peer y13 = k2Var.getMessagesController().y1(longValue);
                    if (((y13 instanceof TLRPC.TL_peerChat) || (y13 instanceof TLRPC.TL_peerChannel)) && ((L0 = k2Var.getMessagesController().L0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.w3.r0(L0))) {
                        this.Y1.add(y13);
                    }
                }
            }
        }
        f1();
    }

    public static void g1(org.telegram.ui.ActionBar.k2 k2Var, int i10, org.telegram.messenger.q20 q20Var) {
        org.telegram.messenger.ap apVar;
        ArrayList arrayList = k2Var.getMessagesController().P0;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((org.telegram.messenger.ap) arrayList.get(i11)).a == i10) {
                    apVar = (org.telegram.messenger.ap) arrayList.get(i11);
                    break;
                }
            }
        }
        apVar = null;
        ag.o0 o0Var = new ag.o0(i10, k2Var, q20Var, 25);
        if (apVar == null || !apVar.f()) {
            o0Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getContext());
        String L0 = org.telegram.messenger.cd.L0(2131750791, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new mm(q20Var));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new px(o0Var, 3));
        k2Var.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        return new c00(this);
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        if (this.T1) {
            return org.telegram.messenger.cd.L0(2131750634, null);
        }
        if (this.R1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.cd.L0(2131750637, null);
        }
        ArrayList arrayList = this.Y1;
        return (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.cd.L0(2131750635, null) : org.telegram.messenger.cd.L0(2131750636, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void U0(uu0 uu0Var) {
        tk0 tk0Var = this.k1;
        tk0Var.setOverScrollMode(2);
        tk0Var.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(this.d2 != null ? 68.0f : 0.0f));
        tk0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void d1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.cd.G(this.a2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (!z10 || this.q2 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.q2.b.getText());
        }
        sb2.append(str);
        org.telegram.messenger.i0.i2(sb2.toString());
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        if (this.r2 >= 0) {
            this.o1.getConnectionsManager().cancelRequest(this.r2, true);
        }
        org.telegram.messenger.q20 q20Var = this.t2;
        if (q20Var != null) {
            q20Var.a(Boolean.valueOf(this.s2));
            this.t2 = null;
        }
    }

    public final void e1(g00 g00Var, boolean z10) {
        ArrayList arrayList = this.Y1;
        ArrayList arrayList2 = this.a2;
        arrayList2.clear();
        arrayList2.addAll(this.Z1);
        int i10 = 0;
        if (!z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long o10 = org.telegram.messenger.o5.o((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(o10))) {
                    arrayList2.add(Long.valueOf(o10));
                }
            }
        }
        h1(true);
        g00Var.a(org.telegram.messenger.cd.L0(z10 ? 2131745687 : 2131751458, null), new ag.j0(this, g00Var, z10, 17));
        d1(true);
        while (true) {
            tk0 tk0Var = this.k1;
            if (i10 >= tk0Var.getChildCount()) {
                return;
            }
            View childAt = tk0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.j4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i10++;
        }
    }

    public final void f1() {
        boolean z10;
        long j10;
        boolean r02;
        ArrayList arrayList = this.b2;
        this.X1 = org.telegram.messenger.i0.J2(this.U1, "✱", "*");
        ArrayList arrayList2 = this.Y1;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.k2 k2Var = this.o1;
                        if (z11) {
                            j10 = -peer.chat_id;
                            r02 = org.telegram.messenger.w3.r0(k2Var.getMessagesController().L0(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            r02 = org.telegram.messenger.w3.r0(k2Var.getMessagesController().L0(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !r02;
                    }
                    if (j10 != 0 && !this.T1) {
                        if (z10) {
                            this.Z1.add(Long.valueOf(j10));
                        }
                        this.a2.add(Long.valueOf(j10));
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
            int i11 = this.g2;
            int i12 = i11 + 1;
            this.h2 = i11;
            int i13 = i11 + 2;
            this.g2 = i13;
            this.i2 = i12;
            this.j2 = i13;
            int size = arrayList2.size() + i13;
            this.g2 = size;
            this.k2 = size;
        }
        int i14 = this.g2;
        this.g2 = i14 + 1;
        this.l2 = i14;
        if (arrayList == null || arrayList.isEmpty()) {
            this.m2 = -1;
            this.n2 = -1;
            this.o2 = -1;
            this.p2 = -1;
        } else {
            int i15 = this.g2;
            int i16 = i15 + 1;
            this.g2 = i16;
            this.m2 = i15;
            this.n2 = i16;
            int size2 = arrayList.size() + i16;
            this.o2 = size2;
            this.g2 = size2 + 1;
            this.p2 = size2;
        }
        Context context = getContext();
        f00 f00Var = new f00(context);
        gr grVar = gr.h;
        f00Var.e = new t5(350L, grVar);
        f00Var.n = 0.0f;
        f00Var.w = 1.0f;
        f00Var.D = 1.0f;
        f00Var.E = true;
        f00Var.I = org.telegram.ui.ActionBar.t6.I.q();
        View view = new View(context);
        f00Var.f = view;
        int i17 = org.telegram.ui.ActionBar.t6.Ci;
        view.setBackground(org.telegram.ui.ActionBar.j6.d(0, org.telegram.ui.ActionBar.j6.b(org.telegram.ui.ActionBar.t6.x0(null, i17, false)), 8.0f));
        f00Var.addView(view, w7.b6.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(8.0f), org.telegram.ui.ActionBar.t6.x0(null, i17, false));
        f00Var.h = d02;
        f00Var.setBackground(d02);
        Paint paint = new Paint(1);
        f00Var.a = paint;
        int i18 = org.telegram.ui.ActionBar.t6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i18, false));
        e6 e6Var = new e6(true, true, false);
        f00Var.b = e6Var;
        e6Var.n(0.3f, 250L, grVar);
        e6Var.setCallback(f00Var);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, i18, false));
        e6Var.t("", true, true);
        e6Var.b = 1;
        e6 e6Var2 = new e6(false, false, true);
        f00Var.c = e6Var2;
        e6Var2.n(0.3f, 250L, grVar);
        e6Var2.setCallback(f00Var);
        e6Var2.w(org.telegram.messenger.i0.L(12.0f));
        e6Var2.x(org.telegram.messenger.i0.o());
        e6Var2.u(org.telegram.ui.ActionBar.t6.x0(null, i17, false));
        e6Var2.t("", true, true);
        e6Var2.b = 1;
        f00Var.setWillNotDraw(false);
        this.d2 = f00Var;
        f00Var.setOnClickListener(new h0(this, 14));
        this.b.addView(this.d2, w7.b6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.e2 = view2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, view2, null);
        this.b.addView(this.e2, w7.b6.d(-1, 1.0f / org.telegram.messenger.i0.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.k1.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(this.d2 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c2 = frameLayout;
        this.b.addView(frameLayout, w7.b6.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        P(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
        h1(false);
        this.l1.setTitle(O0());
    }

    public final void h1(boolean z10) {
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.R1;
        int size = this.a2.size();
        f00 f00Var = this.d2;
        if (f00Var != null) {
            if (this.T1) {
                f00Var.b(org.telegram.messenger.cd.L0(size > 0 ? 2131750670 : 2131750671, null), z10);
            } else {
                ArrayList arrayList = this.Y1;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.d2.b(org.telegram.messenger.cd.L0(2131747847, null), z10);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.d2.b(org.telegram.messenger.cd.V(null, null, 2131750676, org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(this.U1, this.d2.b.a.getFontMetricsInt(), false, null, 0), this.V1, this.d2.b.a.getFontMetricsInt(), false)), z10);
                        this.d2.b.p = this.W1 ? 26 : 0;
                    } else {
                        this.d2.b(size > 0 ? org.telegram.messenger.cd.G(size, "FolderLinkButtonJoinPlural", new Object[0]) : org.telegram.messenger.cd.L0(2131750672, null), z10);
                    }
                }
            }
            f00 f00Var2 = this.d2;
            e6 e6Var = f00Var2.c;
            if (z10) {
                e6Var.a();
            }
            if (z10 && size != (i10 = f00Var2.y) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = f00Var2.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    f00Var2.x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f00Var2.x = ofFloat;
                ofFloat.addUpdateListener(new d00(f00Var2, 1));
                f00Var2.x.addListener(new w5(f00Var2, 28));
                org.telegram.messenger.z20.j(2.0f, f00Var2.x);
                f00Var2.x.setDuration(200L);
                f00Var2.x.start();
            }
            f00Var2.y = size;
            f00Var2.d = size != 0 ? 1.0f : 0.0f;
            e6Var.t("" + size, z10, true);
            f00Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.d2.setEnabled(!r1.isEmpty());
            }
        }
        i00 i00Var = this.f2;
        if (i00Var != null) {
            i00Var.a();
        }
    }

    public final void i1() {
        ArrayList arrayList = this.Z1;
        ArrayList arrayList2 = this.Y1;
        g00 g00Var = this.q2;
        if (g00Var == null) {
            return;
        }
        if (this.T1) {
            g00Var.b(org.telegram.messenger.cd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            g00Var.b(org.telegram.messenger.cd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.q2.a("", null);
        } else {
            boolean z10 = this.a2.size() >= arrayList2.size() - arrayList.size();
            this.q2.a(org.telegram.messenger.cd.L0(z10 ? 2131751458 : 2131745687, null), new k2.v(14, this, z10));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
            if (this.G0 != x02) {
                P(x02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
