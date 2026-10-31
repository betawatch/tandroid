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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k70 extends org.telegram.ui.ActionBar.z2 {
    public static long A1;
    public static long B1;
    public static int C1;
    public static ArrayList z1;
    public Drawable i1;
    public boolean j1;
    public int k1;
    public org.telegram.ui.Cells.u0 l1;
    public g70 m1;
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
    public i70 y1;

    public static void I0(k70 k70Var) {
        g70 g70Var = k70Var.m1;
        if (k70Var.s1 == 0) {
            return;
        }
        if (g70Var.getChildCount() <= 0) {
            int paddingTop = g70Var.getPaddingTop();
            k70Var.r1 = paddingTop;
            g70Var.setTopGlowOffset(paddingTop);
            k70Var.b.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = g70Var.getChildAt(0);
        ck0 ck0Var = (ck0) g70Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(9.0f);
        if (top > 0 && ck0Var != null && ck0Var.b() == 0) {
            i10 = top;
        }
        if (k70Var.r1 != i10) {
            k70Var.n1.setTranslationY(org.telegram.messenger.i0.L(19.0f) + top);
            k70Var.o1.setTranslationY(org.telegram.messenger.i0.L(56.0f) + top);
            k70Var.r1 = i10;
            g70Var.setTopGlowOffset(i10);
            k70Var.b.invalidate();
        }
    }

    public static void J0(Activity activity, long j10, org.telegram.messenger.c cVar, org.telegram.messenger.zr zrVar) {
        int i10 = C1;
        int i11 = cVar.a;
        if (i10 == i11 && B1 == j10 && z1 != null && SystemClock.elapsedRealtime() - A1 < 240000) {
            zrVar.i(z1.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.vp.r1(i11).i1(j10);
        x1Var.setOnCancelListener(new b70(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new c70(x1Var, j10, cVar, zrVar)), 1));
        try {
            x1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j10, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.Peer peer, i70 i70Var) {
        if (context != null) {
            int i11 = C1;
            int i12 = cVar.a;
            if (i11 == i12 && B1 == j10 && z1 != null && SystemClock.elapsedRealtime() - A1 < 300000) {
                if (z1.size() != 1 || i10 == 0) {
                    L0(context, j10, z1, k2Var, i10, peer, i70Var);
                    return;
                } else {
                    i70Var.a(org.telegram.messenger.vp.r1(i12).i1(org.telegram.messenger.jj.C1((TLRPC.Peer) z1.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.vp.r1(i12).i1(j10);
            x1Var.setOnCancelListener(new b70(cVar, ConnectionsManager.getInstance(i12).sendRequest(getgroupcalljoinas, new a70(x1Var, cVar, i70Var, j10, context, k2Var, i10, peer)), 0));
            try {
                x1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.Peer peer, i70 i70Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog yqVar = new yq(k2Var, arrayList, j10, i70Var);
            if (k2Var.getParentActivity() != null) {
                k2Var.showDialog(yqVar);
                return;
            } else {
                yqVar.show();
                return;
            }
        }
        k70 k70Var = new k70(context, false);
        k70Var.v0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        k70Var.p1 = arrayList2;
        k70Var.y1 = i70Var;
        k70Var.s1 = i10;
        Drawable f7 = i0.a.f(context, R.drawable.sheet_shadow_round);
        k70Var.i1 = f7;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) k70Var.p1.get(i12);
                    if (org.telegram.messenger.jj.C1(peer2) == selfId) {
                        k70Var.u1 = peer2;
                        k70Var.t1 = peer2;
                        break;
                    }
                    i12++;
                }
            } else if (peer != null) {
                long C12 = org.telegram.messenger.jj.C1(peer);
                int size2 = arrayList2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) k70Var.p1.get(i13);
                    if (org.telegram.messenger.jj.C1(peer3) == C12) {
                        k70Var.u1 = peer3;
                        k70Var.t1 = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                k70Var.t1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = k70Var.i1;
            i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
            f7.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            k70Var.j1 = true;
            k70Var.k1 = x02;
            k70Var.t1 = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        k70Var.P(i11);
        if (k70Var.s1 == 0) {
            e70 e70Var = new e70(k70Var, context);
            e70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(e70Var);
            k70Var.N = nestedScrollView;
            viewGroup = e70Var;
        } else {
            f70 f70Var = new f70(k70Var, context);
            k70Var.b = f70Var;
            f70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = k70Var.b;
            int i14 = k70Var.t0;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = f70Var;
        }
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(k70Var.a).L0(Long.valueOf(-j10));
        g70 g70Var = new g70(k70Var, context);
        k70Var.m1 = g70Var;
        k70Var.getContext();
        g70Var.setLayoutManager(new s4.a0(k70Var.s1 == 0 ? 0 : 1, false));
        g70Var.setAdapter(new j70(k70Var, context));
        g70Var.setVerticalScrollBarEnabled(false);
        g70Var.setClipToPadding(false);
        g70Var.setEnabled(true);
        g70Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.a7.m(g70Var, 21, org.telegram.ui.ActionBar.t6.A5, null);
        g70Var.setOnScrollListener(new h70(k70Var));
        int i15 = 10;
        g70Var.setOnItemClickListener(new mg.q0(i15, k70Var, L0));
        if (i10 != 0) {
            viewGroup.addView(g70Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            g70Var.setSelectorDrawableColor(0);
            g70Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        }
        if (i10 == 0) {
            ei0 ei0Var = new ei0(context);
            ei0Var.setAutoRepeat(true);
            ei0Var.f(R.raw.utyan_schedule, 120, 120, null);
            ei0Var.d();
            viewGroup.addView(ei0Var, w7.b6.t(org.telegram.messenger.zs.q2, org.telegram.messenger.zs.q2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        k70Var.n1 = textView;
        org.telegram.messenger.z20.n(textView, 1, 20.0f);
        if (i10 == 2) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.bh, null);
        } else {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (org.telegram.messenger.w3.W(L0)) {
                textView.setText(org.telegram.messenger.cd.L0(2131744921, null));
            } else {
                textView.setText(org.telegram.messenger.cd.L0(2131744918, null));
            }
            viewGroup.addView(textView, w7.b6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(org.telegram.messenger.cd.L0(2131743412, null));
            } else if (org.telegram.messenger.w3.W(L0)) {
                textView.setText(org.telegram.messenger.cd.L0(2131743502, null));
            } else {
                textView.setText(org.telegram.messenger.cd.L0(2131743394, null));
            }
            viewGroup.addView(textView, w7.b6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(k70Var.getContext());
        k70Var.o1 = textView2;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.ch, null);
        } else {
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = k70Var.p1.size();
        for (int i16 = 0; i16 < size3; i16++) {
            long C13 = org.telegram.messenger.jj.C1((TLRPC.Peer) k70Var.p1.get(i16));
            if (C13 < 0) {
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(k70Var.a).L0(Long.valueOf(-C13));
                if (!org.telegram.messenger.w3.T(L02) || L02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        k70Var.o1.setMovementMethod(new org.telegram.messenger.e0(false));
        org.telegram.ui.ActionBar.a7.H(k70Var.o1, org.telegram.ui.ActionBar.t6.k5, null);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!org.telegram.messenger.w3.T(L0) || L0.megagroup) {
                sb2.append(org.telegram.messenger.cd.L0(2131743359, null));
            } else {
                sb2.append(org.telegram.messenger.cd.L0(2131743484, null));
            }
            if (k70Var.p1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.cd.L0(2131743469, null));
            } else {
                k70Var.m1.setVisibility(8);
            }
            k70Var.o1.setText(sb2);
            k70Var.o1.setGravity(49);
            viewGroup.addView(k70Var.o1, w7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                k70Var.o1.setText(org.telegram.messenger.cd.L0(2131743357, null));
            } else {
                k70Var.o1.setText(org.telegram.messenger.cd.L0(2131743358, null));
            }
            k70Var.o1.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
            viewGroup.addView(k70Var.o1, w7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(k70Var.m1, w7.b6.t(k70Var.p1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(k70Var, context, false);
        k70Var.l1 = u0Var;
        ((View) u0Var.d).setOnClickListener(new sr(i15, k70Var, i70Var));
        if (k70Var.s1 == 0) {
            viewGroup.addView(u0Var, w7.b6.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.u0 u0Var2 = new org.telegram.ui.Cells.u0(k70Var, context, true);
            if (org.telegram.messenger.w3.W(L0)) {
                u0Var2.a(org.telegram.messenger.cd.L0(2131743488, null), false);
            } else {
                u0Var2.a(org.telegram.messenger.cd.L0(2131743367, null), false);
            }
            ((View) u0Var2.d).setOnClickListener(new h0(k70Var, 27));
            viewGroup.addView(u0Var2, w7.b6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(u0Var, w7.b6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        k70Var.M0(L0, false);
        if (k2Var == null) {
            k70Var.show();
        } else if (k2Var.getParentActivity() != null) {
            k2Var.showDialog(k70Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.v1;
        if (inputPeer != null) {
            this.y1.a(inputPeer, this.p1.size() > 1, this.w1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z10) {
        org.telegram.ui.Cells.u0 u0Var = this.l1;
        if (this.s1 == 0) {
            if (org.telegram.messenger.w3.W(chat)) {
                u0Var.a(org.telegram.messenger.cd.a0("VoipChannelStartVoiceChat", null, 2131743481, new Object[0]), z10);
                return;
            } else {
                u0Var.a(org.telegram.messenger.cd.a0("VoipGroupStartVoiceChat", null, 2131743350, new Object[0]), z10);
                return;
            }
        }
        long C12 = org.telegram.messenger.jj.C1(this.t1);
        if (org.telegram.messenger.o5.E(C12)) {
            u0Var.a(org.telegram.messenger.cd.a0("VoipGroupContinueAs", null, 2131743417, org.telegram.messenger.h20.j(org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(C12)), true)), z10);
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-C12));
            u0Var.a(org.telegram.messenger.cd.a0("VoipGroupContinueAs", null, 2131743417, L0 != null ? L0.title : ""), z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
            if (!this.j1 || (drawable = this.i1) == null || x02 == this.k1) {
                return;
            }
            this.k1 = x02;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
