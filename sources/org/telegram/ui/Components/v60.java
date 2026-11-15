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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v60 extends org.telegram.ui.ActionBar.u2 {
    public static ArrayList D1;
    public static long E1;
    public static long F1;
    public static int G1;
    public boolean A1;
    public boolean B1;
    public t60 C1;
    public Drawable m1;
    public boolean n1;
    public int o1;
    public org.telegram.ui.Cells.v0 p1;
    public r60 q1;
    public TextView r1;
    public TextView s1;
    public ArrayList t1;
    public boolean u1;
    public int v1;
    public int w1;
    public TLRPC.Peer x1;
    public TLRPC.Peer y1;
    public TLRPC.InputPeer z1;

    public static void I0(v60 v60Var) {
        r60 r60Var = v60Var.q1;
        if (v60Var.w1 == 0) {
            return;
        }
        if (r60Var.getChildCount() <= 0) {
            int paddingTop = r60Var.getPaddingTop();
            v60Var.v1 = paddingTop;
            r60Var.setTopGlowOffset(paddingTop);
            v60Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = r60Var.getChildAt(0);
        cj0 cj0Var = (cj0) r60Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
        if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = top;
        }
        if (v60Var.v1 != i7) {
            v60Var.r1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
            v60Var.s1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
            v60Var.v1 = i7;
            r60Var.setTopGlowOffset(i7);
            v60Var.b.invalidate();
        }
    }

    public static void J0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.nr nrVar) {
        int i7 = G1;
        int i10 = cVar.a;
        if (i7 == i10 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 240000) {
            nrVar.j(D1.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.np.s1(i10).j1(j3);
        t1Var.setOnCancelListener(new o60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new di.y(t1Var, j3, cVar, nrVar)), 1));
        try {
            t1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.Peer peer, t60 t60Var) {
        if (context != null) {
            int i10 = G1;
            int i11 = cVar.a;
            if (i10 == i11 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 300000) {
                if (D1.size() != 1 || i7 == 0) {
                    L0(context, j3, D1, e2Var, i7, peer, t60Var);
                    return;
                } else {
                    t60Var.a(org.telegram.messenger.np.s1(i11).j1(org.telegram.messenger.gj.B1((TLRPC.Peer) D1.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.np.s1(i11).j1(j3);
            t1Var.setOnCancelListener(new o60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new n60(t1Var, cVar, t60Var, j3, context, e2Var, i7, peer)), 0));
            try {
                t1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.Peer peer, t60 t60Var) {
        int i10;
        ViewGroup viewGroup;
        boolean z10;
        if (i7 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog vqVar = new vq(e2Var, arrayList, j3, t60Var);
            if (e2Var.getParentActivity() != null) {
                e2Var.showDialog(vqVar);
                return;
            } else {
                vqVar.show();
                return;
            }
        }
        v60 v60Var = new v60(context, false);
        v60Var.w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        v60Var.t1 = arrayList2;
        v60Var.C1 = t60Var;
        v60Var.w1 = i7;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        v60Var.m1 = g10;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) v60Var.t1.get(i11);
                    if (org.telegram.messenger.gj.B1(peer2) == selfId) {
                        v60Var.y1 = peer2;
                        v60Var.x1 = peer2;
                        break;
                    }
                    i11++;
                }
            } else if (peer != null) {
                long B1 = org.telegram.messenger.gj.B1(peer);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) v60Var.t1.get(i12);
                    if (org.telegram.messenger.gj.B1(peer3) == B1) {
                        v60Var.y1 = peer3;
                        v60Var.x1 = peer3;
                        break;
                    }
                    i12++;
                }
            } else {
                v60Var.x1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = v60Var.m1;
            i10 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Wg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
            g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            v60Var.n1 = true;
            v60Var.o1 = x02;
            v60Var.x1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        v60Var.P(i10);
        if (v60Var.w1 == 0) {
            p60 p60Var = new p60(v60Var, context);
            p60Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(p60Var);
            v60Var.O = nestedScrollView;
            viewGroup = p60Var;
        } else {
            q60 q60Var = new q60(v60Var, context);
            v60Var.b = q60Var;
            q60Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = v60Var.b;
            int i13 = v60Var.u0;
            viewGroup2.setPadding(i13, 0, i13, 0);
            viewGroup = q60Var;
        }
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(v60Var.a).M0(Long.valueOf(-j3));
        r60 r60Var = new r60(v60Var, context);
        v60Var.q1 = r60Var;
        v60Var.getContext();
        r60Var.setLayoutManager(new v4.b0(v60Var.w1 == 0 ? 0 : 1, false));
        r60Var.setAdapter(new u60(v60Var, context));
        r60Var.setVerticalScrollBarEnabled(false);
        r60Var.setClipToPadding(false);
        r60Var.setEnabled(true);
        r60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.q6.l(r60Var, 21, org.telegram.ui.ActionBar.j6.A5, null);
        r60Var.setOnScrollListener(new s60(v60Var));
        r60Var.setOnItemClickListener(new fi.i4(11, v60Var, M0));
        if (i7 != 0) {
            viewGroup.addView(r60Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            r60Var.setSelectorDrawableColor(0);
            r60Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            fh0 fh0Var = new fh0(context);
            fh0Var.setAutoRepeat(true);
            fh0Var.f(R.raw.utyan_schedule, 120, 120, null);
            fh0Var.d();
            viewGroup.addView(fh0Var, c8.ja.t(org.telegram.messenger.ns.q2, org.telegram.messenger.ns.q2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        v60Var.r1 = textView;
        org.telegram.messenger.i20.o(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.eh, null);
        } else {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.hd.M0(2131744903, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131744900, null));
            }
            viewGroup.addView(textView, c8.ja.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.hd.M0(2131743386, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.hd.M0(2131743476, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131743368, null));
            }
            viewGroup.addView(textView, c8.ja.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(v60Var.getContext());
        v60Var.s1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.fh, null);
        } else {
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = v60Var.t1.size();
        for (int i14 = 0; i14 < size3; i14++) {
            long B12 = org.telegram.messenger.gj.B1((TLRPC.Peer) v60Var.t1.get(i14));
            if (B12 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(v60Var.a).M0(Long.valueOf(-B12));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        v60Var.s1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.q6.G(v60Var.s1, org.telegram.ui.ActionBar.j6.k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                sb2.append(org.telegram.messenger.hd.M0(2131743333, null));
            } else {
                sb2.append(org.telegram.messenger.hd.M0(2131743458, null));
            }
            if (v60Var.t1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.hd.M0(2131743443, null));
            } else {
                v60Var.q1.setVisibility(8);
            }
            v60Var.s1.setText(sb2);
            v60Var.s1.setGravity(49);
            viewGroup.addView(v60Var.s1, c8.ja.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                v60Var.s1.setText(org.telegram.messenger.hd.M0(2131743331, null));
            } else {
                v60Var.s1.setText(org.telegram.messenger.hd.M0(2131743332, null));
            }
            v60Var.s1.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            viewGroup.addView(v60Var.s1, c8.ja.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            viewGroup.addView(v60Var.q1, c8.ja.t(v60Var.t1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(v60Var, context, false);
        v60Var.p1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new n2(24, v60Var, t60Var));
        if (v60Var.w1 == 0) {
            viewGroup.addView(v0Var, c8.ja.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(v60Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.hd.M0(2131743462, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.hd.M0(2131743341, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new e0(v60Var, 28));
            viewGroup.addView(v0Var2, c8.ja.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(v0Var, c8.ja.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        v60Var.M0(M0, false);
        if (e2Var == null) {
            v60Var.show();
        } else if (e2Var.getParentActivity() != null) {
            e2Var.showDialog(v60Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.z1;
        if (inputPeer != null) {
            this.C1.a(inputPeer, this.t1.size() > 1, this.A1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z10) {
        org.telegram.ui.Cells.v0 v0Var = this.p1;
        if (this.w1 == 0) {
            if (org.telegram.messenger.t3.W(chat)) {
                v0Var.a(org.telegram.messenger.hd.a0("VoipChannelStartVoiceChat", null, 2131743455, new Object[0]), z10);
                return;
            } else {
                v0Var.a(org.telegram.messenger.hd.a0("VoipGroupStartVoiceChat", null, 2131743324, new Object[0]), z10);
                return;
            }
        }
        long B1 = org.telegram.messenger.gj.B1(this.x1);
        if (org.telegram.messenger.m5.E(B1)) {
            v0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743391, org.telegram.messenger.q10.j(org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(B1)), true)), z10);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-B1));
            v0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743391, M0 != null ? M0.title : ""), z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
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
