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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t60 extends org.telegram.ui.ActionBar.v2 {
    public static long A1;
    public static long B1;
    public static int C1;
    public static ArrayList z1;
    public Drawable i1;
    public boolean j1;
    public int k1;
    public org.telegram.ui.Cells.v0 l1;
    public p60 m1;
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
    public r60 y1;

    public static void I0(t60 t60Var) {
        p60 p60Var = t60Var.m1;
        if (t60Var.s1 == 0) {
            return;
        }
        if (p60Var.getChildCount() <= 0) {
            int paddingTop = p60Var.getPaddingTop();
            t60Var.r1 = paddingTop;
            p60Var.setTopGlowOffset(paddingTop);
            t60Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = p60Var.getChildAt(0);
        xi0 xi0Var = (xi0) p60Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
        if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
            i7 = top;
        }
        if (t60Var.r1 != i7) {
            t60Var.n1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
            t60Var.o1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
            t60Var.r1 = i7;
            p60Var.setTopGlowOffset(i7);
            t60Var.b.invalidate();
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
        u1Var.setOnCancelListener(new m60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new bi.f0(u1Var, j3, cVar, qrVar)), 1));
        try {
            u1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer, r60 r60Var) {
        if (context != null) {
            int i10 = C1;
            int i11 = cVar.a;
            if (i10 == i11 && B1 == j3 && z1 != null && SystemClock.elapsedRealtime() - A1 < 300000) {
                if (z1.size() != 1 || i7 == 0) {
                    L0(context, j3, z1, f2Var, i7, peer, r60Var);
                    return;
                } else {
                    r60Var.a(org.telegram.messenger.qp.s1(i11).j1(org.telegram.messenger.ij.C1((TLRPC.Peer) z1.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.qp.s1(i11).j1(j3);
            u1Var.setOnCancelListener(new m60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new l60(u1Var, cVar, r60Var, j3, context, f2Var, i7, peer)), 0));
            try {
                u1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer, r60 r60Var) {
        int i10;
        ViewGroup viewGroup;
        boolean z9;
        if (i7 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog oqVar = new oq(f2Var, arrayList, j3, r60Var);
            if (f2Var.getParentActivity() != null) {
                f2Var.showDialog(oqVar);
                return;
            } else {
                oqVar.show();
                return;
            }
        }
        t60 t60Var = new t60(context, false);
        t60Var.v0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        t60Var.p1 = arrayList2;
        t60Var.y1 = r60Var;
        t60Var.s1 = i7;
        Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
        t60Var.i1 = h;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) t60Var.p1.get(i11);
                    if (org.telegram.messenger.ij.C1(peer2) == selfId) {
                        t60Var.u1 = peer2;
                        t60Var.t1 = peer2;
                        break;
                    }
                    i11++;
                }
            } else if (peer != null) {
                long C12 = org.telegram.messenger.ij.C1(peer);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) t60Var.p1.get(i12);
                    if (org.telegram.messenger.ij.C1(peer3) == C12) {
                        t60Var.u1 = peer3;
                        t60Var.t1 = peer3;
                        break;
                    }
                    i12++;
                }
            } else {
                t60Var.t1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = t60Var.i1;
            i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            h.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            t60Var.j1 = true;
            t60Var.k1 = x02;
            t60Var.t1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        t60Var.O(i10);
        if (t60Var.s1 == 0) {
            n60 n60Var = new n60(t60Var, context);
            n60Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(n60Var);
            t60Var.N = nestedScrollView;
            viewGroup = n60Var;
        } else {
            o60 o60Var = new o60(t60Var, context);
            t60Var.b = o60Var;
            o60Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = t60Var.b;
            int i13 = t60Var.t0;
            viewGroup2.setPadding(i13, 0, i13, 0);
            viewGroup = o60Var;
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(t60Var.a).M0(Long.valueOf(-j3));
        p60 p60Var = new p60(t60Var, context);
        t60Var.m1 = p60Var;
        t60Var.getContext();
        p60Var.setLayoutManager(new v4.b0(t60Var.s1 == 0 ? 0 : 1, false));
        p60Var.setAdapter(new s60(t60Var, context));
        p60Var.setVerticalScrollBarEnabled(false);
        p60Var.setClipToPadding(false);
        p60Var.setEnabled(true);
        p60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.r6.m(p60Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        p60Var.setOnScrollListener(new q60(t60Var));
        p60Var.setOnItemClickListener(new di.p4(11, t60Var, M0));
        if (i7 != 0) {
            viewGroup.addView(p60Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            p60Var.setSelectorDrawableColor(0);
            p60Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            ch0 ch0Var = new ch0(context);
            ch0Var.setAutoRepeat(true);
            ch0Var.f(R.raw.utyan_schedule, 120, 120, null);
            ch0Var.d();
            viewGroup.addView(ch0Var, c8.ha.t(org.telegram.messenger.qs.q2, org.telegram.messenger.qs.q2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        t60Var.n1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.bh, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.hd.M0(2131744904, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131744901, null));
            }
            viewGroup.addView(textView, c8.ha.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.hd.M0(2131743387, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.hd.M0(2131743477, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131743369, null));
            }
            viewGroup.addView(textView, c8.ha.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(t60Var.getContext());
        t60Var.o1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.ch, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = t60Var.p1.size();
        for (int i14 = 0; i14 < size3; i14++) {
            long C13 = org.telegram.messenger.ij.C1((TLRPC.Peer) t60Var.p1.get(i14));
            if (C13 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(t60Var.a).M0(Long.valueOf(-C13));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        t60Var.o1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.r6.H(t60Var.o1, org.telegram.ui.ActionBar.k6.k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                sb2.append(org.telegram.messenger.hd.M0(2131743334, null));
            } else {
                sb2.append(org.telegram.messenger.hd.M0(2131743459, null));
            }
            if (t60Var.p1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.hd.M0(2131743444, null));
            } else {
                t60Var.m1.setVisibility(8);
            }
            t60Var.o1.setText(sb2);
            t60Var.o1.setGravity(49);
            viewGroup.addView(t60Var.o1, c8.ha.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z9) {
                t60Var.o1.setText(org.telegram.messenger.hd.M0(2131743332, null));
            } else {
                t60Var.o1.setText(org.telegram.messenger.hd.M0(2131743333, null));
            }
            t60Var.o1.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            viewGroup.addView(t60Var.o1, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            viewGroup.addView(t60Var.m1, c8.ha.t(t60Var.p1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(t60Var, context, false);
        t60Var.l1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new lk(17, t60Var, r60Var));
        if (t60Var.s1 == 0) {
            viewGroup.addView(v0Var, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(t60Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.hd.M0(2131743463, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.hd.M0(2131743342, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new h0(t60Var, 27));
            viewGroup.addView(v0Var2, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(v0Var, c8.ha.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        t60Var.M0(M0, false);
        if (f2Var == null) {
            t60Var.show();
        } else if (f2Var.getParentActivity() != null) {
            f2Var.showDialog(t60Var);
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
                v0Var.a(org.telegram.messenger.hd.a0("VoipChannelStartVoiceChat", null, 2131743456, new Object[0]), z9);
                return;
            } else {
                v0Var.a(org.telegram.messenger.hd.a0("VoipGroupStartVoiceChat", null, 2131743325, new Object[0]), z9);
                return;
            }
        }
        long C12 = org.telegram.messenger.ij.C1(this.t1);
        if (org.telegram.messenger.m5.E(C12)) {
            v0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743392, org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(C12)), true)), z9);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-C12));
            v0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743392, M0 != null ? M0.title : ""), z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
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
