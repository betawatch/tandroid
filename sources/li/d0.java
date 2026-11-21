package li;

import a8.m7;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.h5;
import bi.m3;
import bi.u1;
import c8.ma;
import fi.y6;
import hi.i1;
import hi.j9;
import hi.u7;
import hi.w4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o0;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
import org.telegram.ui.c00;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class d0 extends w2 implements fs, te.b, q2 {
    public static final /* synthetic */ int Q1 = 0;
    public final c00 A1;
    public final h51 B1;
    public final m3 C1;
    public final m3 D1;
    public final bg.d0 E1;
    public final bg.d0 F1;
    public final View G1;
    public final k0 H1;
    public final boolean I1;
    public final x10 J1;
    public final Paint K1;
    public ArrayList L1;
    public String M1;
    public String N1;
    public i0.b O1;
    public i0.b P1;
    public final te.a m1;
    public final te.a n1;
    public final i1 o1;
    public final long p1;
    public TLRPC.Chat q1;
    public boolean r1;
    public hi.e s1;
    public hi.e t1;
    public final g2 u1;
    public final z v1;
    public final y w1;
    public final y x1;
    public final e10 y1;
    public final e10 z1;

    public d0(g2 g2Var, long j3) {
        this(g2Var, j3, null, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        if (this.m1.f || this.n1.f) {
            return false;
        }
        View currentView = this.o1.getCurrentView();
        if (currentView instanceof b0) {
            return ((b0) currentView).e;
        }
        return true;
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            float a10 = m7.a(f10);
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
            z zVar = this.v1;
            zVar.a.setAlpha(a10);
            zVar.a.setScaleX(T1);
            zVar.a.setScaleY(T1);
            zVar.a.setVisibility(a10 > 0.0f ? 0 : 8);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            e10 e10Var = this.y1;
            e10Var.setAlpha(f10);
            e10Var.setScaleX(T12);
            e10Var.setScaleY(T12);
            e10Var.setVisibility(f10 > 0.0f ? 0 : 8);
            zVar.d.setAlpha(a10);
            zVar.d.setVisibility(a10 > 0.0f ? 0 : 8);
            this.s1.setAlpha(a10);
            this.s1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.s1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.s1.setVisibility(a10 > 0.0f ? 0 : 8);
            c00 c00Var = this.A1;
            c00Var.setAlpha(f10);
            c00Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 2) {
            float a11 = m7.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            y yVar = this.x1;
            yVar.a.setAlpha(a11);
            yVar.a.setScaleX(T13);
            yVar.a.setScaleY(T13);
            yVar.a.setVisibility(a11 > 0.0f ? 0 : 8);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            e10 e10Var2 = this.z1;
            e10Var2.setAlpha(f10);
            e10Var2.setScaleX(T14);
            e10Var2.setScaleY(T14);
            e10Var2.setVisibility(f10 > 0.0f ? 0 : 8);
            yVar.d.setAlpha(a11);
            yVar.d.setVisibility(a11 > 0.0f ? 0 : 8);
            if (!this.I1) {
                this.t1.setAlpha(a11);
                this.t1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.t1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.t1.setVisibility(a11 > 0.0f ? 0 : 8);
            }
            h51 h51Var = this.B1;
            h51Var.setAlpha(f10);
            h51Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.D1.invalidate();
        }
    }

    public final boolean J0(o41 o41Var) {
        Object obj = o41Var.H;
        if (!(obj instanceof mi.f)) {
            return false;
        }
        mi.f fVar = (mi.f) obj;
        long j3 = fVar.a;
        TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(-j3));
        TLRPC.User c22 = mp.u1(this.a).c2(Long.valueOf(j3));
        g2 g2Var = this.u1;
        if (c22 != null) {
            g2Var.presentFragment(bn.ua(c22.id));
            return true;
        }
        if (v3.t0(O0) || v3.j0(O0)) {
            g2Var.presentFragment(bn.ua(-O0.id));
            return true;
        }
        new ni.b(getContext(), O0, new ji.i(19, this, fVar)).show();
        return true;
    }

    public final void K0(ArrayList arrayList, boolean z10) {
        String str;
        int i7 = 0;
        if (!z10) {
            arrayList.add(o41.E(99, (int) (org.telegram.messenger.g0.q.y * 0.35f)));
            arrayList.add(o41.E(0, org.telegram.messenger.g0.L(56.0f)));
        }
        if (this.L1 != null) {
            String lowerCase = (!z10 || (str = this.N1) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.L1;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z10 || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(o41.w(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(o41.w(chat));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        ks.f(this.a).n(this, ks.T);
        ks.f(this.a).n(this, ks.r);
        super.L();
    }

    public final void L0(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.id;
        boolean V = v3.V(chat);
        if (v3.T(chat)) {
            mp.u1(this.a).W2(j10, j3, false, z10, new j9(this, V, 1));
            return;
        }
        t1 t1Var = new t1(3, getContext(), null);
        t1Var.r(250L);
        mp.u1(this.a).T(getContext(), -j10, null, new e(this, t1Var, j3, z10, 1), null);
    }

    public final void M0(o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.I1) {
                new ni.a(getContext(), this.q1, -chat.id, new d(2, this, chat)).show();
            } else {
                this.J1.a(chat);
                dismiss();
            }
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.T;
        long j3 = this.p1;
        z zVar = this.v1;
        if (i7 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).id == j3) {
                zVar.d.g3.O(true);
            }
        } else if (i7 == ks.r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = mp.I8;
            if ((intValue & TLObject.FLAG_13) == 0 && (num.intValue() & 2) == 0 && (num.intValue() & 8) == 0 && (num.intValue() & 16) == 0) {
                return;
            }
            TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(j3));
            this.q1 = O0;
            zVar.a.setTitle(n5.m(O0));
            zVar.h.f(this.q1, zVar.n);
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        if (this.o1.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.o1.getCurrentPosition() == 2) {
            te.a aVar = this.n1;
            if (aVar.f) {
                this.x1.d.f3.h1(1, this.P1.b);
                aVar.a(false, true);
                this.r0 = true;
                e10 e10Var = this.z1;
                org.telegram.messenger.g0.v1(e10Var.r);
                e10Var.r.clearFocus();
                return;
            }
        }
        this.o1.A(0);
    }

    @Override // org.telegram.ui.Cells.q2
    public final void r(u2 u2Var) {
        TLRPC.TL_forumTopic f10;
        if (u2Var.getMessage() == null || (f10 = mp.u1(this.a).t7.f(-u2Var.getDialogId(), fj.b2(this.a, u2Var.getMessage().k, true, false))) == null) {
            return;
        }
        qg.c.n(this.u1, -u2Var.getDialogId(), f10, 0);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        Paint paint = this.K1;
        try {
            super.s0();
            int w02 = m6.w0(m6.a7, this.J0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final void u(u2 u2Var) {
        if (mp.u1(this.a).R1().K(u2Var.getDialogId())) {
            g2 g2Var = this.u1;
            g2Var.getOrCreateStoryViewer().getClass();
            g2Var.getOrCreateStoryViewer().J(g2Var.getContext(), u2Var.getDialogId(), y6.a((ek0) u2Var.getParent()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g2 g2Var, long j3, ArrayList arrayList, h5 h5Var) {
        super(g2Var.getContext(), g2Var.getResourceProvider(), true, true);
        int i7 = 1;
        nr nrVar = nr.h;
        this.m1 = new te.a(1, this, nrVar, 350L, false);
        this.n1 = new te.a(2, this, nrVar, 350L, false);
        int i10 = 2;
        this.E1 = new bg.d0(2);
        int i11 = 8;
        this.F1 = new bg.d0(8);
        Paint paint = new Paint(1);
        this.K1 = paint;
        i0.b bVar = i0.b.e;
        this.O1 = bVar;
        this.P1 = bVar;
        org.telegram.messenger.g0.S(getWindow());
        this.u1 = g2Var;
        int i12 = 0;
        this.I1 = arrayList != null;
        this.L1 = arrayList;
        this.J1 = h5Var;
        Context context = g2Var.getContext();
        ks.f(this.a).c(this, ks.T);
        ks.f(this.a).c(this, ks.r);
        int i13 = m6.a7;
        paint.setColor(m6.w0(i13, this.J0));
        Q(i13);
        this.b = new u7(this, context);
        i1 i1Var = new i1(i10, context, this);
        this.o1 = i1Var;
        int i14 = this.u0;
        i1Var.setPadding(i14, 0, i14, 0);
        this.b.addView(this.o1, ma.e(-1, -1, ks.E1));
        this.C1 = new m3(i11, context, this);
        this.D1 = new m3(i11, context, this);
        e10 e10Var = new e10(context, this.J0);
        this.y1 = e10Var;
        e10Var.setCloseButtonVisible(true);
        e10Var.y = true;
        e10Var.updateColors();
        String N0 = gd.N0(2131745640, null);
        ah.i iVar = e10Var.r;
        iVar.setHint(N0);
        iVar.addTextChangedListener(new w(this, i12));
        e10Var.setVisibility(8);
        e10 e10Var2 = new e10(context, this.J0);
        this.z1 = e10Var2;
        e10Var2.setCloseButtonVisible(true);
        e10Var2.y = true;
        e10Var2.updateColors();
        String N02 = gd.N0(2131745640, null);
        ah.i iVar2 = e10Var2.r;
        iVar2.setHint(N02);
        iVar2.addTextChangedListener(new w(this, i7));
        e10Var2.setVisibility(8);
        h51 h51Var = new h51(context, this.a, 0, false, new t(this, i12), new u(this, i12), null, this.J0);
        this.B1 = h51Var;
        h51Var.j(new u1(this, 24));
        h51Var.setClipToPadding(false);
        h51Var.setVisibility(8);
        h51Var.r1();
        h51Var.g3.r = false;
        h51Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.m, 0, org.telegram.messenger.g0.n);
        c00 c00Var = new c00(g2Var);
        this.A1 = c00Var;
        c00Var.setVisibility(8);
        c00Var.setBackground(null);
        c00Var.setChatPreviewDelegate(new pb.b(13));
        c00Var.setUiCallback(new w4(this, 10));
        c00Var.b.setClipToPadding(false);
        this.G1 = new View(getContext());
        Context context2 = getContext();
        h6 h6Var = this.J0;
        k0 k0Var = new k0(context2, h6Var, new lc((FrameLayout) this.b, h6Var), this.a, j3);
        this.H1 = k0Var;
        k0Var.h = new k8.a(i10, this, g2Var);
        this.p1 = j3;
        this.q1 = mp.u1(this.a).O0(Long.valueOf(j3));
        mp.u1(this.a).P0(j3);
        TLRPC.Chat chat = this.q1;
        this.r1 = chat != null && chat.collapsed_in_dialogs;
        o0 o0Var = new o0(R.drawable.search_users_filled, 4, n5.u(chat));
        o0Var.f = this.q1;
        o0Var.h = false;
        ArrayList arrayList2 = e10Var.G;
        arrayList2.add(o0Var);
        e10Var.J = arrayList2.size() - 1;
        e10Var.e();
        v0(m6.w0(i13, this.J0));
        this.w1 = new y(this, context, 1);
        this.v1 = new z(this, context);
        this.x1 = new y(this, context, 0);
        this.o1.setAdapter(new x(this, i12));
        e10Var.setCloseButtonOnClickListener(new v(this, i12));
        e10Var2.setCloseButtonOnClickListener(new v(this, i7));
        k0Var.d();
        mp.u1(this.a).b3(0, j3, true);
        gc.a((FrameLayout) this.b, new bi.t(6));
        ViewGroup viewGroup = this.b;
        u uVar = new u(this, i7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup, uVar);
    }

    @Override // org.telegram.ui.Cells.q2
    public final void q() {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void l(u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void w(u2 u2Var) {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
