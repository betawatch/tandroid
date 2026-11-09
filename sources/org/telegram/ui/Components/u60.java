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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u60 extends org.telegram.ui.ActionBar.v2 {
    public static long A1;
    public static long B1;
    public static int C1;
    public static ArrayList z1;
    public Drawable i1;
    public boolean j1;
    public int k1;
    public org.telegram.ui.Cells.v0 l1;
    public q60 m1;
    public TextView n1;
    public TextView o1;
    public ArrayList p1;
    public boolean q1;
    public int r1;
    public int s1;
    public TLRPC.Peer t1;
    public TLRPC.Peer u1;
    public TLRPC.InputPeer v1;
    public boolean w1;
    public boolean x1;
    public s60 y1;

    public static void I0(u60 u60Var) {
        q60 q60Var = u60Var.m1;
        if (u60Var.s1 == 0) {
            return;
        }
        if (q60Var.getChildCount() <= 0) {
            int paddingTop = q60Var.getPaddingTop();
            u60Var.r1 = paddingTop;
            q60Var.setTopGlowOffset(paddingTop);
            u60Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = q60Var.getChildAt(0);
        yi0 yi0Var = (yi0) q60Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
        if (top > 0 && yi0Var != null && yi0Var.b() == 0) {
            i7 = top;
        }
        if (u60Var.r1 != i7) {
            u60Var.n1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
            u60Var.o1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
            u60Var.r1 = i7;
            q60Var.setTopGlowOffset(i7);
            u60Var.b.invalidate();
        }
    }

    public static void J0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.qr qrVar) {
        int i7 = C1;
        int i10 = cVar.a;
        if (i7 == i10 && B1 == j3 && z1 != null && SystemClock.elapsedRealtime() - A1 < 240000) {
            qrVar.k(z1.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.qp.s1(i10).j1(j3);
        u1Var.setOnCancelListener(new n60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new bi.f0(u1Var, j3, cVar, qrVar)), 1));
        try {
            u1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer, s60 s60Var) {
        if (context != null) {
            int i10 = C1;
            int i11 = cVar.a;
            if (i10 == i11 && B1 == j3 && z1 != null && SystemClock.elapsedRealtime() - A1 < 300000) {
                if (z1.size() != 1 || i7 == 0) {
                    L0(context, j3, z1, f2Var, i7, peer, s60Var);
                    return;
                } else {
                    s60Var.a(org.telegram.messenger.qp.s1(i11).j1(org.telegram.messenger.ij.B1((TLRPC.Peer) z1.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.qp.s1(i11).j1(j3);
            u1Var.setOnCancelListener(new n60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new m60(u1Var, cVar, s60Var, j3, context, f2Var, i7, peer)), 0));
            try {
                u1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer, s60 s60Var) {
        int i10;
        ViewGroup viewGroup;
        boolean z9;
        if (i7 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog oqVar = new oq(f2Var, arrayList, j3, s60Var);
            if (f2Var.getParentActivity() != null) {
                f2Var.showDialog(oqVar);
                return;
            } else {
                oqVar.show();
                return;
            }
        }
        u60 u60Var = new u60(context, false);
        u60Var.v0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        u60Var.p1 = arrayList2;
        u60Var.y1 = s60Var;
        u60Var.s1 = i7;
        Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
        u60Var.i1 = h;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) u60Var.p1.get(i11);
                    if (org.telegram.messenger.ij.B1(peer2) == selfId) {
                        u60Var.u1 = peer2;
                        u60Var.t1 = peer2;
                        break;
                    }
                    i11++;
                }
            } else if (peer != null) {
                long B12 = org.telegram.messenger.ij.B1(peer);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) u60Var.p1.get(i12);
                    if (org.telegram.messenger.ij.B1(peer3) == B12) {
                        u60Var.u1 = peer3;
                        u60Var.t1 = peer3;
                        break;
                    }
                    i12++;
                }
            } else {
                u60Var.t1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = u60Var.i1;
            i10 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false);
            h.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            u60Var.j1 = true;
            u60Var.k1 = x02;
            u60Var.t1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        u60Var.O(i10);
        if (u60Var.s1 == 0) {
            o60 o60Var = new o60(u60Var, context);
            o60Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(o60Var);
            u60Var.N = nestedScrollView;
            viewGroup = o60Var;
        } else {
            p60 p60Var = new p60(u60Var, context);
            u60Var.b = p60Var;
            p60Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = u60Var.b;
            int i13 = u60Var.t0;
            viewGroup2.setPadding(i13, 0, i13, 0);
            viewGroup = p60Var;
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(u60Var.a).M0(Long.valueOf(-j3));
        q60 q60Var = new q60(u60Var, context);
        u60Var.m1 = q60Var;
        u60Var.getContext();
        q60Var.setLayoutManager(new v4.b0(u60Var.s1 == 0 ? 0 : 1, false));
        q60Var.setAdapter(new t60(u60Var, context));
        q60Var.setVerticalScrollBarEnabled(false);
        q60Var.setClipToPadding(false);
        q60Var.setEnabled(true);
        q60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.s6.l(q60Var, 21, org.telegram.ui.ActionBar.l6.A5, null);
        q60Var.setOnScrollListener(new r60(u60Var));
        q60Var.setOnItemClickListener(new di.q4(11, u60Var, M0));
        if (i7 != 0) {
            viewGroup.addView(q60Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            q60Var.setSelectorDrawableColor(0);
            q60Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            dh0 dh0Var = new dh0(context);
            dh0Var.setAutoRepeat(true);
            dh0Var.f(R.raw.utyan_schedule, 120, 120, null);
            dh0Var.d();
            viewGroup.addView(dh0Var, c8.ha.t(org.telegram.messenger.qs.q2, org.telegram.messenger.qs.q2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        u60Var.n1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.bh, null);
        } else {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.id.M0(2131744903, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131744900, null));
            }
            viewGroup.addView(textView, c8.ha.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.id.M0(2131743386, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.id.M0(2131743476, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131743368, null));
            }
            viewGroup.addView(textView, c8.ha.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(u60Var.getContext());
        u60Var.o1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.ch, null);
        } else {
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = u60Var.p1.size();
        for (int i14 = 0; i14 < size3; i14++) {
            long B13 = org.telegram.messenger.ij.B1((TLRPC.Peer) u60Var.p1.get(i14));
            if (B13 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(u60Var.a).M0(Long.valueOf(-B13));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        u60Var.o1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.s6.G(u60Var.o1, org.telegram.ui.ActionBar.l6.k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                sb2.append(org.telegram.messenger.id.M0(2131743333, null));
            } else {
                sb2.append(org.telegram.messenger.id.M0(2131743458, null));
            }
            if (u60Var.p1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.id.M0(2131743443, null));
            } else {
                u60Var.m1.setVisibility(8);
            }
            u60Var.o1.setText(sb2);
            u60Var.o1.setGravity(49);
            viewGroup.addView(u60Var.o1, c8.ha.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z9) {
                u60Var.o1.setText(org.telegram.messenger.id.M0(2131743331, null));
            } else {
                u60Var.o1.setText(org.telegram.messenger.id.M0(2131743332, null));
            }
            u60Var.o1.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
            viewGroup.addView(u60Var.o1, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            viewGroup.addView(u60Var.m1, c8.ha.t(u60Var.p1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(u60Var, context, false);
        u60Var.l1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new lk(17, u60Var, s60Var));
        if (u60Var.s1 == 0) {
            viewGroup.addView(v0Var, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(u60Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.id.M0(2131743462, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.id.M0(2131743341, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new h0(u60Var, 27));
            viewGroup.addView(v0Var2, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(v0Var, c8.ha.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        u60Var.M0(M0, false);
        if (f2Var == null) {
            u60Var.show();
        } else if (f2Var.getParentActivity() != null) {
            f2Var.showDialog(u60Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.v1;
        if (inputPeer != null) {
            this.y1.a(inputPeer, this.p1.size() > 1, this.w1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z9) {
        org.telegram.ui.Cells.v0 v0Var = this.l1;
        if (this.s1 == 0) {
            if (org.telegram.messenger.t3.W(chat)) {
                v0Var.a(org.telegram.messenger.id.a0("VoipChannelStartVoiceChat", null, 2131743455, new Object[0]), z9);
                return;
            } else {
                v0Var.a(org.telegram.messenger.id.a0("VoipGroupStartVoiceChat", null, 2131743324, new Object[0]), z9);
                return;
            }
        }
        long B12 = org.telegram.messenger.ij.B1(this.t1);
        if (org.telegram.messenger.m5.E(B12)) {
            v0Var.a(org.telegram.messenger.id.a0("VoipGroupContinueAs", null, 2131743391, org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(B12)), true)), z9);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-B12));
            v0Var.a(org.telegram.messenger.id.a0("VoipGroupContinueAs", null, 2131743391, M0 != null ? M0.title : ""), z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false);
            if (!this.j1 || (drawable = this.i1) == null || x02 == this.k1) {
                return;
            }
            this.k1 = x02;
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
