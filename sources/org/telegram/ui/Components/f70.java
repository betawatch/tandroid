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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f70 extends org.telegram.ui.ActionBar.w2 {
    public static ArrayList D1;
    public static long E1;
    public static long F1;
    public static int G1;
    public boolean A1;
    public boolean B1;
    public d70 C1;
    public Drawable m1;
    public boolean n1;
    public int o1;
    public org.telegram.ui.Cells.x0 p1;
    public b70 q1;
    public TextView r1;
    public TextView s1;
    public ArrayList t1;
    public boolean u1;
    public int v1;
    public int w1;
    public TLRPC.Peer x1;
    public TLRPC.Peer y1;
    public TLRPC.InputPeer z1;

    public static void J0(f70 f70Var) {
        b70 b70Var = f70Var.q1;
        if (f70Var.w1 == 0) {
            return;
        }
        if (b70Var.getChildCount() <= 0) {
            int paddingTop = b70Var.getPaddingTop();
            f70Var.v1 = paddingTop;
            b70Var.setTopGlowOffset(paddingTop);
            f70Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = b70Var.getChildAt(0);
        mj0 mj0Var = (mj0) b70Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        }
        if (f70Var.v1 != i7) {
            f70Var.r1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
            f70Var.s1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
            f70Var.v1 = i7;
            b70Var.setTopGlowOffset(i7);
            f70Var.b.invalidate();
        }
    }

    public static void K0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.lr lrVar) {
        int i7 = G1;
        int i10 = cVar.a;
        if (i7 == i10 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 240000) {
            lrVar.q(D1.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.mp.u1(i10).l1(j3);
        t1Var.setOnCancelListener(new y60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new di.y(t1Var, j3, cVar, lrVar)), 1));
        try {
            t1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void L0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer, d70 d70Var) {
        if (context != null) {
            int i10 = G1;
            int i11 = cVar.a;
            if (i10 == i11 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 300000) {
                if (D1.size() != 1 || i7 == 0) {
                    M0(context, j3, D1, g2Var, i7, peer, d70Var);
                    return;
                } else {
                    d70Var.a(org.telegram.messenger.mp.u1(i11).l1(org.telegram.messenger.fj.B1((TLRPC.Peer) D1.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.mp.u1(i11).l1(j3);
            t1Var.setOnCancelListener(new y60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new ii.c(t1Var, cVar, d70Var, j3, context, g2Var, i7, peer)), 0));
            try {
                t1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void M0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer, d70 d70Var) {
        int i10;
        ViewGroup viewGroup;
        boolean z10;
        if (i7 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog brVar = new br(g2Var, arrayList, j3, d70Var);
            if (g2Var.getParentActivity() != null) {
                g2Var.showDialog(brVar);
                return;
            } else {
                brVar.show();
                return;
            }
        }
        f70 f70Var = new f70(context, false);
        f70Var.w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        f70Var.t1 = arrayList2;
        f70Var.C1 = d70Var;
        f70Var.w1 = i7;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        f70Var.m1 = g10;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) f70Var.t1.get(i11);
                    if (org.telegram.messenger.fj.B1(peer2) == selfId) {
                        f70Var.y1 = peer2;
                        f70Var.x1 = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) f70Var.t1.get(i12);
                    if (org.telegram.messenger.fj.B1(peer3) == B1) {
                        f70Var.y1 = peer3;
                        f70Var.x1 = peer3;
                        break;
                    }
                    i12++;
                }
            } else {
                f70Var.x1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = f70Var.m1;
            i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
            g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            f70Var.n1 = true;
            f70Var.o1 = x02;
            f70Var.x1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        f70Var.P(i10);
        if (f70Var.w1 == 0) {
            z60 z60Var = new z60(f70Var, context);
            z60Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(z60Var);
            f70Var.O = nestedScrollView;
            viewGroup = z60Var;
        } else {
            a70 a70Var = new a70(f70Var, context);
            f70Var.b = a70Var;
            a70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = f70Var.b;
            int i13 = f70Var.u0;
            viewGroup2.setPadding(i13, 0, i13, 0);
            viewGroup = a70Var;
        }
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(f70Var.a).O0(Long.valueOf(-j3));
        b70 b70Var = new b70(f70Var, context);
        f70Var.q1 = b70Var;
        f70Var.getContext();
        b70Var.setLayoutManager(new v4.c0(f70Var.w1 == 0 ? 0 : 1, false));
        b70Var.setAdapter(new e70(f70Var, context));
        b70Var.setVerticalScrollBarEnabled(false);
        b70Var.setClipToPadding(false);
        b70Var.setEnabled(true);
        b70Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.u6.l(b70Var, 21, org.telegram.ui.ActionBar.n6.A5, null);
        b70Var.setOnScrollListener(new c70(f70Var));
        b70Var.setOnItemClickListener(new fi.g4(11, f70Var, O0));
        if (i7 != 0) {
            viewGroup.addView(b70Var, c8.na.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            b70Var.setSelectorDrawableColor(0);
            b70Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            qh0 qh0Var = new qh0(context);
            qh0Var.setAutoRepeat(true);
            qh0Var.f(R.raw.utyan_schedule, 120, 120, null);
            qh0Var.d();
            viewGroup.addView(qh0Var, c8.na.t(org.telegram.messenger.ks.q2, org.telegram.messenger.ks.q2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        f70Var.r1 = textView;
        org.telegram.messenger.m10.p(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.eh, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.gd.N0(2131744662, null));
            } else {
                textView.setText(org.telegram.messenger.gd.N0(2131744659, null));
            }
            viewGroup.addView(textView, c8.na.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.gd.N0(2131743136, null));
            } else if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.gd.N0(2131743226, null));
            } else {
                textView.setText(org.telegram.messenger.gd.N0(2131743118, null));
            }
            viewGroup.addView(textView, c8.na.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(f70Var.getContext());
        f70Var.s1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.fh, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = f70Var.t1.size();
        for (int i14 = 0; i14 < size3; i14++) {
            long B12 = org.telegram.messenger.fj.B1((TLRPC.Peer) f70Var.t1.get(i14));
            if (B12 < 0) {
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(f70Var.a).O0(Long.valueOf(-B12));
                if (!org.telegram.messenger.v3.T(O02) || O02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        f70Var.s1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.u6.G(f70Var.s1, org.telegram.ui.ActionBar.n6.k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!org.telegram.messenger.v3.T(O0) || O0.megagroup) {
                sb2.append(org.telegram.messenger.gd.N0(2131743083, null));
            } else {
                sb2.append(org.telegram.messenger.gd.N0(2131743208, null));
            }
            if (f70Var.t1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.gd.N0(2131743193, null));
            } else {
                f70Var.q1.setVisibility(8);
            }
            f70Var.s1.setText(sb2);
            f70Var.s1.setGravity(49);
            viewGroup.addView(f70Var.s1, c8.na.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                f70Var.s1.setText(org.telegram.messenger.gd.N0(2131743081, null));
            } else {
                f70Var.s1.setText(org.telegram.messenger.gd.N0(2131743082, null));
            }
            f70Var.s1.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
            viewGroup.addView(f70Var.s1, c8.na.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            viewGroup.addView(f70Var.q1, c8.na.t(f70Var.t1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(f70Var, context, false);
        f70Var.p1 = x0Var;
        ((View) x0Var.d).setOnClickListener(new l8(19, f70Var, d70Var));
        if (f70Var.w1 == 0) {
            viewGroup.addView(x0Var, c8.na.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.x0 x0Var2 = new org.telegram.ui.Cells.x0(f70Var, context, true);
            if (org.telegram.messenger.v3.W(O0)) {
                x0Var2.a(org.telegram.messenger.gd.N0(2131743212, null), false);
            } else {
                x0Var2.a(org.telegram.messenger.gd.N0(2131743091, null), false);
            }
            ((View) x0Var2.d).setOnClickListener(new n0(f70Var, 29));
            viewGroup.addView(x0Var2, c8.na.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(x0Var, c8.na.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        f70Var.N0(O0, false);
        if (g2Var == null) {
            f70Var.show();
        } else if (g2Var.getParentActivity() != null) {
            g2Var.showDialog(f70Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
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
                x0Var.a(org.telegram.messenger.gd.a0("VoipChannelStartVoiceChat", null, 2131743205, new Object[0]), z10);
                return;
            } else {
                x0Var.a(org.telegram.messenger.gd.a0("VoipGroupStartVoiceChat", null, 2131743074, new Object[0]), z10);
                return;
            }
        }
        long B1 = org.telegram.messenger.fj.B1(this.x1);
        if (org.telegram.messenger.n5.E(B1)) {
            x0Var.a(org.telegram.messenger.gd.a0("VoipGroupContinueAs", null, 2131743141, org.telegram.messenger.n10.k(org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(B1)), true)), z10);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-B1));
            x0Var.a(org.telegram.messenger.gd.a0("VoipGroupContinueAs", null, 2131743141, O0 != null ? O0.title : ""), z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
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
