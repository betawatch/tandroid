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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o60 extends org.telegram.ui.ActionBar.t2 {
    public static ArrayList A1;
    public static long B1;
    public static long C1;
    public static int D1;
    public Drawable j1;
    public boolean k1;
    public int l1;
    public org.telegram.ui.Cells.v0 m1;
    public k60 n1;
    public TextView o1;
    public TextView p1;
    public ArrayList q1;
    public boolean r1;
    public int s1;
    public int t1;
    public TLRPC.Peer u1;
    public TLRPC.Peer v1;
    public TLRPC.InputPeer w1;
    public boolean x1;
    public boolean y1;
    public m60 z1;

    public static void I0(o60 o60Var) {
        k60 k60Var = o60Var.n1;
        if (o60Var.t1 == 0) {
            return;
        }
        if (k60Var.getChildCount() <= 0) {
            int paddingTop = k60Var.getPaddingTop();
            o60Var.s1 = paddingTop;
            k60Var.setTopGlowOffset(paddingTop);
            o60Var.b.invalidate();
            return;
        }
        int i3 = 0;
        View childAt = k60Var.getChildAt(0);
        bj0 bj0Var = (bj0) k60Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
        if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = top;
        }
        if (o60Var.s1 != i3) {
            o60Var.o1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
            o60Var.p1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
            o60Var.s1 = i3;
            k60Var.setTopGlowOffset(i3);
            o60Var.b.invalidate();
        }
    }

    public static void J0(Activity activity, long j10, org.telegram.messenger.c cVar, org.telegram.messenger.ir irVar) {
        int i3 = D1;
        int i10 = cVar.a;
        if (i3 == i10 && C1 == j10 && A1 != null && SystemClock.elapsedRealtime() - B1 < 240000) {
            irVar.o(A1.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.hp.s1(i10).j1(j10);
        s1Var.setOnCancelListener(new h60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new ci.a0(s1Var, j10, cVar, irVar)), 1));
        try {
            s1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j10, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Peer peer, m60 m60Var) {
        if (context != null) {
            int i10 = D1;
            int i11 = cVar.a;
            if (i10 == i11 && C1 == j10 && A1 != null && SystemClock.elapsedRealtime() - B1 < 300000) {
                if (A1.size() != 1 || i3 == 0) {
                    L0(context, j10, A1, d2Var, i3, peer, m60Var);
                    return;
                } else {
                    m60Var.a(org.telegram.messenger.hp.s1(i11).j1(org.telegram.messenger.zi.C1((TLRPC.Peer) A1.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.hp.s1(i11).j1(j10);
            s1Var.setOnCancelListener(new h60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new g60(s1Var, cVar, m60Var, j10, context, d2Var, i3, peer)), 0));
            try {
                s1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Peer peer, m60 m60Var) {
        int i10;
        ViewGroup viewGroup;
        boolean z10;
        if (i3 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog oqVar = new oq(d2Var, arrayList, j10, m60Var);
            if (d2Var.getParentActivity() != null) {
                d2Var.showDialog(oqVar);
                return;
            } else {
                oqVar.show();
                return;
            }
        }
        o60 o60Var = new o60(context, false);
        o60Var.w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        o60Var.q1 = arrayList2;
        o60Var.z1 = m60Var;
        o60Var.t1 = i3;
        Drawable g7 = k2.p1.g(context, R.drawable.sheet_shadow_round);
        o60Var.j1 = g7;
        if (i3 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) o60Var.q1.get(i11);
                    if (org.telegram.messenger.zi.C1(peer2) == selfId) {
                        o60Var.v1 = peer2;
                        o60Var.u1 = peer2;
                        break;
                    }
                    i11++;
                }
            } else if (peer != null) {
                long C12 = org.telegram.messenger.zi.C1(peer);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) o60Var.q1.get(i12);
                    if (org.telegram.messenger.zi.C1(peer3) == C12) {
                        o60Var.v1 = peer3;
                        o60Var.u1 = peer3;
                        break;
                    }
                    i12++;
                }
            } else {
                o60Var.u1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = o60Var.j1;
            i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            g7.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            o60Var.k1 = true;
            o60Var.l1 = x02;
            o60Var.u1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        o60Var.O(i10);
        if (o60Var.t1 == 0) {
            i60 i60Var = new i60(o60Var, context);
            i60Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(i60Var);
            o60Var.O = nestedScrollView;
            viewGroup = i60Var;
        } else {
            j60 j60Var = new j60(o60Var, context);
            o60Var.b = j60Var;
            j60Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = o60Var.b;
            int i13 = o60Var.u0;
            viewGroup2.setPadding(i13, 0, i13, 0);
            viewGroup = j60Var;
        }
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(o60Var.a).M0(Long.valueOf(-j10));
        k60 k60Var = new k60(o60Var, context);
        o60Var.n1 = k60Var;
        o60Var.getContext();
        k60Var.setLayoutManager(new u4.b0(o60Var.t1 == 0 ? 0 : 1, false));
        k60Var.setAdapter(new n60(o60Var, context));
        k60Var.setVerticalScrollBarEnabled(false);
        k60Var.setClipToPadding(false);
        k60Var.setEnabled(true);
        k60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.r6.m(k60Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        k60Var.setOnScrollListener(new l60(o60Var));
        k60Var.setOnItemClickListener(new ei.q4(11, o60Var, M0));
        if (i3 != 0) {
            viewGroup.addView(k60Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            k60Var.setSelectorDrawableColor(0);
            k60Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i3 == 0) {
            fh0 fh0Var = new fh0(context);
            fh0Var.setAutoRepeat(true);
            fh0Var.f(R.raw.utyan_schedule, 120, 120, null);
            fh0Var.d();
            viewGroup.addView(fh0Var, b8.mf.t(org.telegram.messenger.hs.q2, org.telegram.messenger.hs.q2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        o60Var.o1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        if (i3 == 2) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.bh, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i3 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.bd.M0(2131744913, null));
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131744910, null));
            }
            viewGroup.addView(textView, b8.mf.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i3 == 2) {
                textView.setText(org.telegram.messenger.bd.M0(2131743396, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.bd.M0(2131743486, null));
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131743378, null));
            }
            viewGroup.addView(textView, b8.mf.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(o60Var.getContext());
        o60Var.p1 = textView2;
        if (i3 == 2) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.ch, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = o60Var.q1.size();
        for (int i14 = 0; i14 < size3; i14++) {
            long C13 = org.telegram.messenger.zi.C1((TLRPC.Peer) o60Var.q1.get(i14));
            if (C13 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(o60Var.a).M0(Long.valueOf(-C13));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        o60Var.p1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.r6.H(o60Var.p1, org.telegram.ui.ActionBar.k6.k5, null);
        if (i3 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                sb2.append(org.telegram.messenger.bd.M0(2131743343, null));
            } else {
                sb2.append(org.telegram.messenger.bd.M0(2131743468, null));
            }
            if (o60Var.q1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.bd.M0(2131743453, null));
            } else {
                o60Var.n1.setVisibility(8);
            }
            o60Var.p1.setText(sb2);
            o60Var.p1.setGravity(49);
            viewGroup.addView(o60Var.p1, b8.mf.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                o60Var.p1.setText(org.telegram.messenger.bd.M0(2131743341, null));
            } else {
                o60Var.p1.setText(org.telegram.messenger.bd.M0(2131743342, null));
            }
            o60Var.p1.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
            viewGroup.addView(o60Var.p1, b8.mf.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i3 == 0) {
            viewGroup.addView(o60Var.n1, b8.mf.t(o60Var.q1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(o60Var, context, false);
        o60Var.m1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new q2(23, o60Var, m60Var));
        if (o60Var.t1 == 0) {
            viewGroup.addView(v0Var, b8.mf.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(o60Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.bd.M0(2131743472, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.bd.M0(2131743351, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new f0(o60Var, 27));
            viewGroup.addView(v0Var2, b8.mf.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(v0Var, b8.mf.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        o60Var.M0(M0, false);
        if (d2Var == null) {
            o60Var.show();
        } else if (d2Var.getParentActivity() != null) {
            d2Var.showDialog(o60Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.w1;
        if (inputPeer != null) {
            this.z1.a(inputPeer, this.q1.size() > 1, this.x1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z10) {
        org.telegram.ui.Cells.v0 v0Var = this.m1;
        if (this.t1 == 0) {
            if (org.telegram.messenger.t3.W(chat)) {
                v0Var.a(org.telegram.messenger.bd.a0("VoipChannelStartVoiceChat", null, 2131743465, new Object[0]), z10);
                return;
            } else {
                v0Var.a(org.telegram.messenger.bd.a0("VoipGroupStartVoiceChat", null, 2131743334, new Object[0]), z10);
                return;
            }
        }
        long C12 = org.telegram.messenger.zi.C1(this.u1);
        if (org.telegram.messenger.m5.E(C12)) {
            v0Var.a(org.telegram.messenger.bd.a0("VoipGroupContinueAs", null, 2131743401, org.telegram.messenger.l10.j(org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(C12)), true)), z10);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-C12));
            v0Var.a(org.telegram.messenger.bd.a0("VoipGroupContinueAs", null, 2131743401, M0 != null ? M0.title : ""), z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            if (!this.k1 || (drawable = this.j1) == null || x02 == this.l1) {
                return;
            }
            this.l1 = x02;
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
