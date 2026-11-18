package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g70 extends org.telegram.ui.ActionBar.x2 {
    public static ArrayList D1;
    public static long E1;
    public static long F1;
    public static int G1;
    public boolean A1;
    public boolean B1;
    public e70 C1;
    public Drawable m1;
    public boolean n1;
    public int o1;
    public org.telegram.ui.Cells.x0 p1;
    public c70 q1;
    public TextView r1;
    public TextView s1;
    public ArrayList t1;
    public boolean u1;
    public int v1;
    public int w1;
    public TLRPC.Peer x1;
    public TLRPC.Peer y1;
    public TLRPC.InputPeer z1;

    public static void J0(g70 g70Var) {
        c70 c70Var = g70Var.q1;
        if (g70Var.w1 == 0) {
            return;
        }
        if (c70Var.getChildCount() <= 0) {
            int paddingTop = c70Var.getPaddingTop();
            g70Var.v1 = paddingTop;
            c70Var.setTopGlowOffset(paddingTop);
            g70Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = c70Var.getChildAt(0);
        kj0 kj0Var = (kj0) c70Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
        if (top > 0 && kj0Var != null && kj0Var.b() == 0) {
            i7 = top;
        }
        if (g70Var.v1 != i7) {
            g70Var.r1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
            g70Var.s1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
            g70Var.v1 = i7;
            c70Var.setTopGlowOffset(i7);
            g70Var.b.invalidate();
        }
    }

    public static void K0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.lr lrVar) {
        int i7 = G1;
        int i10 = cVar.a;
        if (i7 == i10 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 240000) {
            lrVar.d(D1.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.mp.u1(i10).l1(j3);
        u1Var.setOnCancelListener(new z60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new di.y(u1Var, j3, cVar, lrVar)), 1));
        try {
            u1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void L0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.Peer peer, e70 e70Var) {
        if (context != null) {
            int i10 = G1;
            int i11 = cVar.a;
            if (i10 == i11 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 300000) {
                if (D1.size() != 1 || i7 == 0) {
                    M0(context, j3, D1, h2Var, i7, peer, e70Var);
                    return;
                } else {
                    e70Var.a(org.telegram.messenger.mp.u1(i11).l1(org.telegram.messenger.fj.B1((TLRPC.Peer) D1.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.mp.u1(i11).l1(j3);
            u1Var.setOnCancelListener(new z60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new ii.c(u1Var, cVar, e70Var, j3, context, h2Var, i7, peer)), 0));
            try {
                u1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void M0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.Peer peer, e70 e70Var) {
        int i10;
        ViewGroup viewGroup;
        boolean z10;
        if (i7 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog crVar = new cr(h2Var, arrayList, j3, e70Var);
            if (h2Var.getParentActivity() != null) {
                h2Var.showDialog(crVar);
                return;
            } else {
                crVar.show();
                return;
            }
        }
        g70 g70Var = new g70(context, false);
        g70Var.w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        g70Var.t1 = arrayList2;
        g70Var.C1 = e70Var;
        g70Var.w1 = i7;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        g70Var.m1 = g10;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) g70Var.t1.get(i11);
                    if (org.telegram.messenger.fj.B1(peer2) == selfId) {
                        g70Var.y1 = peer2;
                        g70Var.x1 = peer2;
                        break;
                    }
                    i11++;
                }
            } else if (peer != null) {
                long B1 = org.telegram.messenger.fj.B1(peer);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) g70Var.t1.get(i12);
                    if (org.telegram.messenger.fj.B1(peer3) == B1) {
                        g70Var.y1 = peer3;
                        g70Var.x1 = peer3;
                        break;
                    }
                    i12++;
                }
            } else {
                g70Var.x1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = g70Var.m1;
            i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
            g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            g70Var.n1 = true;
            g70Var.o1 = x02;
            g70Var.x1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        g70Var.P(i10);
        if (g70Var.w1 == 0) {
            a70 a70Var = new a70(g70Var, context);
            a70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(a70Var);
            g70Var.O = nestedScrollView;
            viewGroup = a70Var;
        } else {
            b70 b70Var = new b70(g70Var, context);
            g70Var.b = b70Var;
            b70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = g70Var.b;
            int i13 = g70Var.u0;
            viewGroup2.setPadding(i13, 0, i13, 0);
            viewGroup = b70Var;
        }
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(g70Var.a).O0(Long.valueOf(-j3));
        c70 c70Var = new c70(g70Var, context);
        g70Var.q1 = c70Var;
        g70Var.getContext();
        c70Var.setLayoutManager(new v4.c0(g70Var.w1 == 0 ? 0 : 1, false));
        c70Var.setAdapter(new f70(g70Var, context));
        c70Var.setVerticalScrollBarEnabled(false);
        c70Var.setClipToPadding(false);
        c70Var.setEnabled(true);
        c70Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.u6.l(c70Var, 21, org.telegram.ui.ActionBar.n6.A5, null);
        c70Var.setOnScrollListener(new d70(g70Var));
        c70Var.setOnItemClickListener(new fi.g4(11, g70Var, O0));
        if (i7 != 0) {
            viewGroup.addView(c70Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            c70Var.setSelectorDrawableColor(0);
            c70Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            ph0 ph0Var = new ph0(context);
            ph0Var.setAutoRepeat(true);
            ph0Var.f(R.raw.utyan_schedule, 120, 120, null);
            ph0Var.d();
            viewGroup.addView(ph0Var, c8.ma.t(org.telegram.messenger.ks.q2, org.telegram.messenger.ks.q2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        g70Var.r1 = textView;
        org.telegram.messenger.n10.p(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.eh, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.gd.M0(2131744668, null));
            } else {
                textView.setText(org.telegram.messenger.gd.M0(2131744665, null));
            }
            viewGroup.addView(textView, c8.ma.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.gd.M0(2131743149, null));
            } else if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.gd.M0(2131743239, null));
            } else {
                textView.setText(org.telegram.messenger.gd.M0(2131743131, null));
            }
            viewGroup.addView(textView, c8.ma.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(g70Var.getContext());
        g70Var.s1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.fh, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = g70Var.t1.size();
        for (int i14 = 0; i14 < size3; i14++) {
            long B12 = org.telegram.messenger.fj.B1((TLRPC.Peer) g70Var.t1.get(i14));
            if (B12 < 0) {
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(g70Var.a).O0(Long.valueOf(-B12));
                if (!org.telegram.messenger.v3.T(O02) || O02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        g70Var.s1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.u6.G(g70Var.s1, org.telegram.ui.ActionBar.n6.k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!org.telegram.messenger.v3.T(O0) || O0.megagroup) {
                sb2.append(org.telegram.messenger.gd.M0(2131743096, null));
            } else {
                sb2.append(org.telegram.messenger.gd.M0(2131743221, null));
            }
            if (g70Var.t1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.gd.M0(2131743206, null));
            } else {
                g70Var.q1.setVisibility(8);
            }
            g70Var.s1.setText(sb2);
            g70Var.s1.setGravity(49);
            viewGroup.addView(g70Var.s1, c8.ma.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                g70Var.s1.setText(org.telegram.messenger.gd.M0(2131743094, null));
            } else {
                g70Var.s1.setText(org.telegram.messenger.gd.M0(2131743095, null));
            }
            g70Var.s1.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
            viewGroup.addView(g70Var.s1, c8.ma.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            viewGroup.addView(g70Var.q1, c8.ma.t(g70Var.t1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(g70Var, context, false);
        g70Var.p1 = x0Var;
        ((View) x0Var.d).setOnClickListener(new y7(20, g70Var, e70Var));
        if (g70Var.w1 == 0) {
            viewGroup.addView(x0Var, c8.ma.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.x0 x0Var2 = new org.telegram.ui.Cells.x0(g70Var, context, true);
            if (org.telegram.messenger.v3.W(O0)) {
                x0Var2.a(org.telegram.messenger.gd.M0(2131743225, null), false);
            } else {
                x0Var2.a(org.telegram.messenger.gd.M0(2131743104, null), false);
            }
            ((View) x0Var2.d).setOnClickListener(new n0(g70Var, 29));
            viewGroup.addView(x0Var2, c8.ma.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(x0Var, c8.ma.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        g70Var.N0(O0, false);
        if (h2Var == null) {
            g70Var.show();
        } else if (h2Var.getParentActivity() != null) {
            h2Var.showDialog(g70Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.z1;
        if (inputPeer != null) {
            this.C1.a(inputPeer, this.t1.size() > 1, this.A1, false);
        }
    }

    public final void N0(TLRPC.Chat chat, boolean z10) {
        org.telegram.ui.Cells.x0 x0Var = this.p1;
        if (this.w1 == 0) {
            if (org.telegram.messenger.v3.W(chat)) {
                x0Var.a(org.telegram.messenger.gd.a0("VoipChannelStartVoiceChat", null, 2131743218, new Object[0]), z10);
                return;
            } else {
                x0Var.a(org.telegram.messenger.gd.a0("VoipGroupStartVoiceChat", null, 2131743087, new Object[0]), z10);
                return;
            }
        }
        long B1 = org.telegram.messenger.fj.B1(this.x1);
        if (org.telegram.messenger.n5.E(B1)) {
            x0Var.a(org.telegram.messenger.gd.a0("VoipGroupContinueAs", null, 2131743154, org.telegram.messenger.o10.k(org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(B1)), true)), z10);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-B1));
            x0Var.a(org.telegram.messenger.gd.a0("VoipGroupContinueAs", null, 2131743154, O0 != null ? O0.title : ""), z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
            if (!this.n1 || (drawable = this.m1) == null || x02 == this.o1) {
                return;
            }
            this.o1 = x02;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
