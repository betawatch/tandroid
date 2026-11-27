// default package

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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bw5 extends nx0 {
    public static ArrayList C1;
    public static long D1;
    public static long E1;
    public static int F1;
    public boolean A1;
    public zv5 B1;
    public Drawable l1;
    public boolean m1;
    public int n1;
    public pa2 o1;
    public xv5 p1;
    public TextView q1;
    public TextView r1;
    public ArrayList s1;
    public boolean t1;
    public int u1;
    public int v1;
    public TLRPC.Peer w1;
    public TLRPC.Peer x1;
    public TLRPC.InputPeer y1;
    public boolean z1;

    public static void E0(Activity activity, long j, k5 k5Var, bf7 bf7Var) {
        int i = F1;
        int i2 = k5Var.a;
        char c = 1;
        if (i == i2 && E1 == j && C1 != null && SystemClock.elapsedRealtime() - D1 < 240000) {
            bf7Var.A(C1.size() == 1);
            return;
        }
        id idVar = new id(3, null, activity);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = uc7.s1(i2).j1(j);
        idVar.setOnCancelListener(new tv5(k5Var, ConnectionsManager.getInstance(i2).sendRequest(getgroupcalljoinas, new ft0(idVar, j, k5Var, bf7Var)), c == true ? 1 : 0));
        try {
            idVar.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void F0(Context context, long j, k5 k5Var, e eVar, int i, TLRPC.Peer peer, zv5 zv5Var) {
        if (context != null) {
            int i2 = F1;
            int i3 = k5Var.a;
            byte b = 0;
            if (i2 == i3 && E1 == j && C1 != null && SystemClock.elapsedRealtime() - D1 < 300000) {
                if (C1.size() != 1 || i == 0) {
                    G0(context, j, C1, eVar, i, peer, zv5Var);
                    return;
                } else {
                    zv5Var.a(uc7.s1(i3).j1(r47.B1((TLRPC.Peer) C1.get(0))), false, false, false);
                    return;
                }
            }
            id idVar = new id(3, null, context);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = uc7.s1(i3).j1(j);
            idVar.setOnCancelListener(new tv5(k5Var, ConnectionsManager.getInstance(i3).sendRequest(getgroupcalljoinas, new q15(idVar, k5Var, zv5Var, j, context, eVar, i, peer)), b));
            try {
                idVar.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void G0(Context context, long j, ArrayList arrayList, e eVar, int i, TLRPC.Peer peer, zv5 zv5Var) {
        int i2;
        ViewGroup viewGroup;
        boolean z;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog h13Var = new h13(eVar, arrayList, j, zv5Var);
            if (eVar.getParentActivity() != null) {
                eVar.showDialog(h13Var);
                return;
            } else {
                h13Var.show();
                return;
            }
        }
        byte b = 0;
        bw5 bw5Var = new bw5(context, false);
        bw5Var.w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        bw5Var.s1 = arrayList2;
        bw5Var.B1 = zv5Var;
        bw5Var.v1 = i;
        Drawable e = c00.e(context, R.drawable.sheet_shadow_round);
        bw5Var.l1 = e;
        if (i == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) bw5Var.s1.get(i3);
                    if (r47.B1(peer2) == selfId) {
                        bw5Var.x1 = peer2;
                        bw5Var.w1 = peer2;
                        break;
                    }
                    i3++;
                }
            } else if (peer != null) {
                long B1 = r47.B1(peer);
                int size2 = arrayList2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) bw5Var.s1.get(i4);
                    if (r47.B1(peer3) == B1) {
                        bw5Var.x1 = peer3;
                        bw5Var.w1 = peer3;
                        break;
                    }
                    i4++;
                }
            } else {
                bw5Var.w1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = bw5Var.l1;
            i2 = aob.w0(null, aob.Wg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        } else {
            int w0 = aob.w0(null, aob.h5, false);
            e.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
            bw5Var.m1 = true;
            bw5Var.n1 = w0;
            bw5Var.w1 = (TLRPC.Peer) arrayList2.get(0);
            i2 = w0;
        }
        bw5Var.K(i2);
        if (bw5Var.v1 == 0) {
            vv5 vv5Var = new vv5(bw5Var, context);
            vv5Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(vv5Var);
            bw5Var.O = nestedScrollView;
            viewGroup = vv5Var;
        } else {
            wv5 wv5Var = new wv5(bw5Var, context);
            bw5Var.b = wv5Var;
            wv5Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = bw5Var.b;
            int i5 = bw5Var.u0;
            viewGroup2.setPadding(i5, 0, i5, 0);
            viewGroup = wv5Var;
        }
        TLRPC.Chat M0 = uc7.s1(bw5Var.a).M0(Long.valueOf(-j));
        xv5 xv5Var = new xv5(bw5Var, context);
        bw5Var.p1 = xv5Var;
        bw5Var.getContext();
        xv5Var.setLayoutManager(new x46(bw5Var.v1 == 0 ? 0 : 1, false));
        xv5Var.setAdapter(new aw5(bw5Var, context));
        xv5Var.setVerticalScrollBarEnabled(false);
        xv5Var.setClipToPadding(false);
        xv5Var.setEnabled(true);
        xv5Var.setSelectorDrawableColor(0);
        yob.l(xv5Var, 21, aob.A5, null);
        xv5Var.setOnScrollListener(new yv5(bw5Var));
        xv5Var.setOnItemClickListener(new l0(bw5Var, M0, (byte) 14));
        if (i != 0) {
            viewGroup.addView(xv5Var, tre.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            xv5Var.setSelectorDrawableColor(0);
            xv5Var.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            e29 e29Var = new e29(context);
            e29Var.setAutoRepeat(true);
            e29Var.f(R.raw.utyan_schedule, jn7.E1, jn7.E1, null);
            e29Var.d();
            viewGroup.addView(e29Var, tre.t(jn7.p2, jn7.p2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        bw5Var.q1 = textView;
        ik8.v(textView, 1, 20.0f);
        if (i == 2) {
            yob.X(textView, aob.eh, null);
        } else {
            yob.X(textView, aob.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0) {
            if (xc2.W(M0)) {
                textView.setText(ob6.M0(2131744560, null));
            } else {
                textView.setText(ob6.M0(2131744557, null));
            }
            viewGroup.addView(textView, tre.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i == 2) {
                textView.setText(ob6.M0(2131743038, null));
            } else if (xc2.W(M0)) {
                textView.setText(ob6.M0(2131743128, null));
            } else {
                textView.setText(ob6.M0(2131743020, null));
            }
            viewGroup.addView(textView, tre.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(bw5Var.getContext());
        bw5Var.r1 = textView2;
        if (i == 2) {
            yob.X(textView2, aob.fh, null);
        } else {
            yob.X(textView2, aob.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = bw5Var.s1.size();
        for (int i6 = 0; i6 < size3; i6++) {
            long B12 = r47.B1((TLRPC.Peer) bw5Var.s1.get(i6));
            if (B12 < 0) {
                TLRPC.Chat M02 = uc7.s1(bw5Var.a).M0(Long.valueOf(-B12));
                if (!xc2.T(M02) || M02.megagroup) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        bw5Var.r1.setMovementMethod(new dl((byte) 0));
        yob.G(bw5Var.r1, aob.k5, null);
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            if (!xc2.T(M0) || M0.megagroup) {
                sb.append(ob6.M0(2131742985, null));
            } else {
                sb.append(ob6.M0(2131743110, null));
            }
            if (bw5Var.s1.size() > 1) {
                sb.append("\n\n");
                sb.append(ob6.M0(2131743095, null));
            } else {
                bw5Var.p1.setVisibility(8);
            }
            bw5Var.r1.setText(sb);
            bw5Var.r1.setGravity(49);
            viewGroup.addView(bw5Var.r1, tre.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            TextView textView3 = bw5Var.r1;
            if (z) {
                textView3.setText(ob6.M0(2131742983, null));
            } else {
                textView3.setText(ob6.M0(2131742984, null));
            }
            bw5Var.r1.setGravity((ob6.a0 ? 5 : 3) | 48);
            viewGroup.addView(bw5Var.r1, tre.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i == 0) {
            viewGroup.addView(bw5Var.p1, tre.t(bw5Var.s1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        pa2 pa2Var = new pa2(bw5Var, context, false);
        bw5Var.o1 = pa2Var;
        ((View) pa2Var.d).setOnClickListener(new uv5(bw5Var, zv5Var, b));
        if (bw5Var.v1 == 0) {
            viewGroup.addView(pa2Var, tre.t(-1, 50, 51, 0, 0, 0, 0));
            pa2 pa2Var2 = new pa2(bw5Var, context, true);
            if (xc2.W(M0)) {
                pa2Var2.a(ob6.M0(2131743114, null), false);
            } else {
                pa2Var2.a(ob6.M0(2131742993, null), false);
            }
            ((View) pa2Var2.d).setOnClickListener(new sa5(bw5Var, (byte) 12));
            viewGroup.addView(pa2Var2, tre.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(pa2Var, tre.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        bw5Var.H0(M0, false);
        if (eVar == null) {
            bw5Var.show();
        } else if (eVar.getParentActivity() != null) {
            eVar.showDialog(bw5Var);
        }
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    @Override // nx0
    public final void H() {
        super.H();
        TLRPC.InputPeer inputPeer = this.y1;
        if (inputPeer != null) {
            this.B1.a(inputPeer, this.s1.size() > 1, this.z1, false);
        }
    }

    public final void H0(TLRPC.Chat chat, boolean z) {
        pa2 pa2Var = this.o1;
        if (this.v1 == 0) {
            if (xc2.W(chat)) {
                pa2Var.a(ob6.a0("VoipChannelStartVoiceChat", null, 2131743107, new Object[0]), z);
                return;
            } else {
                pa2Var.a(ob6.a0("VoipGroupStartVoiceChat", null, 2131742976, new Object[0]), z);
                return;
            }
        }
        long B1 = r47.B1(this.w1);
        boolean D = wf3.D(B1);
        int i = this.a;
        if (D) {
            pa2Var.a(ob6.a0("VoipGroupContinueAs", null, 2131743043, lbc.k(uc7.s1(i).X1(Long.valueOf(B1)), true)), z);
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-B1));
            pa2Var.a(ob6.a0("VoipGroupContinueAs", null, 2131743043, M0 != null ? M0.title : ""), z);
        }
    }

    public final void I0() {
        xv5 xv5Var = this.p1;
        if (this.v1 != 0) {
            if (xv5Var.getChildCount() <= 0) {
                int paddingTop = xv5Var.getPaddingTop();
                this.u1 = paddingTop;
                xv5Var.setTopGlowOffset(paddingTop);
                this.b.invalidate();
                return;
            }
            int i = 0;
            View childAt = xv5Var.getChildAt(0);
            n69 n69Var = (n69) xv5Var.H(childAt);
            int top = childAt.getTop() - hl.L(9.0f);
            if (top > 0 && n69Var != null && n69Var.b() == 0) {
                i = top;
            }
            if (this.u1 != i) {
                this.q1.setTranslationY(hl.L(19.0f) + top);
                this.r1.setTranslationY(hl.L(56.0f) + top);
                this.u1 = i;
                xv5Var.setTopGlowOffset(i);
                this.b.invalidate();
            }
        }
    }

    @Override // nx0
    public final void p0() {
        Drawable drawable;
        super.p0();
        try {
            int w0 = aob.w0(null, aob.h5, false);
            if (!this.m1 || (drawable = this.l1) == null || w0 == this.n1) {
                return;
            }
            this.n1 = w0;
            drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
