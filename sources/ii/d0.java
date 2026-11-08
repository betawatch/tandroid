package ii;

import a8.j7;
import ai.f1;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.ec;
import c8.ha;
import di.h7;
import fi.g1;
import fi.m9;
import fi.r7;
import fi.x7;
import hi.d4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o0;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.yz;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class d0 extends v2 implements ls, te.b, p2 {
    public static final /* synthetic */ int M1 = 0;
    public final bg.c0 A1;
    public final bg.c0 B1;
    public final View C1;
    public final l0 D1;
    public final boolean E1;
    public final c20 F1;
    public final Paint G1;
    public ArrayList H1;
    public String I1;
    public String J1;
    public i0.b K1;
    public i0.b L1;
    public final te.a i1;
    public final te.a j1;
    public final g1 k1;
    public final long l1;
    public TLRPC.Chat m1;
    public boolean n1;
    public fi.d o1;
    public fi.d p1;
    public final f2 q1;
    public final z r1;
    public final y s1;
    public final y t1;
    public final s00 u1;
    public final s00 v1;
    public final yz w1;
    public final q41 x1;
    public final ec y1;
    public final ec z1;

    public d0(f2 f2Var, long j3) {
        this(f2Var, j3, null, null);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        if (this.i1.f || this.j1.f) {
            return false;
        }
        View currentView = this.k1.getCurrentView();
        if (currentView instanceof b0) {
            return ((b0) currentView).e;
        }
        return true;
    }

    public final boolean I0(x31 x31Var) {
        Object obj = x31Var.G;
        if (!(obj instanceof ji.f)) {
            return false;
        }
        ji.f fVar = (ji.f) obj;
        long j3 = fVar.a;
        TLRPC.Chat M0 = qp.s1(this.a).M0(Long.valueOf(-j3));
        TLRPC.User a22 = qp.s1(this.a).a2(Long.valueOf(j3));
        f2 f2Var = this.q1;
        if (a22 != null) {
            f2Var.presentFragment(an.ra(a22.id));
            return true;
        }
        if (t3.t0(M0) || t3.j0(M0)) {
            f2Var.presentFragment(an.ra(-M0.id));
            return true;
        }
        new ki.b(getContext(), M0, new ha.b(10, this, fVar)).show();
        return true;
    }

    public final void J0(ArrayList arrayList, boolean z9) {
        String str;
        int i7 = 0;
        if (!z9) {
            arrayList.add(x31.E(99, (int) (org.telegram.messenger.g0.q.y * 0.35f)));
            arrayList.add(x31.E(0, org.telegram.messenger.g0.L(56.0f)));
        }
        if (this.H1 != null) {
            String lowerCase = (!z9 || (str = this.J1) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.H1;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z9 || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(x31.w(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(x31.w(chat));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        qs.f(this.a).n(this, qs.T);
        qs.f(this.a).n(this, qs.r);
        super.K();
    }

    public final void K0(TLRPC.Chat chat, long j3, boolean z9) {
        long j10 = -chat.id;
        boolean V = t3.V(chat);
        if (t3.T(chat)) {
            qp.s1(this.a).Q2(j10, j3, false, z9, new m9(1, this, V));
            return;
        }
        u1 u1Var = new u1(3, getContext(), null);
        u1Var.r(250L);
        qp.s1(this.a).T(getContext(), -j10, null, new d(this, u1Var, j3, z9, 1), null);
    }

    public final void L0(x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.E1) {
                new ki.a(getContext(), this.m1, -chat.id, new f1(22, this, chat)).show();
            } else {
                this.F1.a(chat);
                dismiss();
            }
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            float a10 = j7.a(f10);
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
            z zVar = this.r1;
            zVar.a.setAlpha(a10);
            zVar.a.setScaleX(T1);
            zVar.a.setScaleY(T1);
            zVar.a.setVisibility(a10 > 0.0f ? 0 : 8);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            s00 s00Var = this.u1;
            s00Var.setAlpha(f10);
            s00Var.setScaleX(T12);
            s00Var.setScaleY(T12);
            s00Var.setVisibility(f10 > 0.0f ? 0 : 8);
            zVar.d.setAlpha(a10);
            zVar.d.setVisibility(a10 > 0.0f ? 0 : 8);
            this.o1.setAlpha(a10);
            this.o1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.o1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.o1.setVisibility(a10 > 0.0f ? 0 : 8);
            yz yzVar = this.w1;
            yzVar.setAlpha(f10);
            yzVar.setVisibility(f10 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.y1.invalidate();
        }
        if (i7 == 2) {
            float a11 = j7.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            y yVar = this.t1;
            yVar.a.setAlpha(a11);
            yVar.a.setScaleX(T13);
            yVar.a.setScaleY(T13);
            yVar.a.setVisibility(a11 > 0.0f ? 0 : 8);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            s00 s00Var2 = this.v1;
            s00Var2.setAlpha(f10);
            s00Var2.setScaleX(T14);
            s00Var2.setScaleY(T14);
            s00Var2.setVisibility(f10 > 0.0f ? 0 : 8);
            yVar.d.setAlpha(a11);
            yVar.d.setVisibility(a11 > 0.0f ? 0 : 8);
            if (!this.E1) {
                this.p1.setAlpha(a11);
                this.p1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.p1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.p1.setVisibility(a11 > 0.0f ? 0 : 8);
            }
            q41 q41Var = this.x1;
            q41Var.setAlpha(f10);
            q41Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.z1.invalidate();
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.T;
        long j3 = this.l1;
        z zVar = this.r1;
        if (i7 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).id == j3) {
                zVar.d.f3.O(true);
            }
        } else if (i7 == qs.r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = qp.C8;
            if ((intValue & TLObject.FLAG_13) == 0 && (num.intValue() & 2) == 0 && (num.intValue() & 8) == 0 && (num.intValue() & 16) == 0) {
                return;
            }
            TLRPC.Chat M0 = qp.s1(this.a).M0(Long.valueOf(j3));
            this.m1 = M0;
            zVar.a.setTitle(m5.m(M0));
            zVar.h.e(this.m1, zVar.n);
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        if (this.k1.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.k1.getCurrentPosition() == 2) {
            te.a aVar = this.j1;
            if (aVar.f) {
                this.t1.d.e3.h1(1, this.L1.b);
                aVar.a(false, true);
                this.q0 = true;
                s00 s00Var = this.v1;
                org.telegram.messenger.g0.v1(s00Var.r);
                s00Var.r.clearFocus();
                return;
            }
        }
        this.k1.E(0);
    }

    @Override // org.telegram.ui.Cells.p2
    public final void r(t2 t2Var) {
        TLRPC.TL_forumTopic f10;
        if (t2Var.getMessage() == null || (f10 = qp.s1(this.a).q7.f(-t2Var.getDialogId(), ij.c2(this.a, t2Var.getMessage().k, true, false))) == null) {
            return;
        }
        qg.d.m(this.q1, -t2Var.getDialogId(), f10, 0);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        Paint paint = this.G1;
        try {
            super.s0();
            int w02 = k6.w0(k6.a7, this.I0);
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

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        if (qp.s1(this.a).P1().K(t2Var.getDialogId())) {
            f2 f2Var = this.q1;
            f2Var.getOrCreateStoryViewer().getClass();
            f2Var.getOrCreateStoryViewer().J(f2Var.getContext(), t2Var.getDialogId(), h7.a((pj0) t2Var.getParent()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(f2 f2Var, long j3, ArrayList arrayList, d4 d4Var) {
        super(f2Var.getContext(), f2Var.getResourceProvider(), true, true);
        int i7 = 1;
        xq xqVar = xq.h;
        this.i1 = new te.a(1, this, xqVar, 350L, false);
        int i10 = 2;
        this.j1 = new te.a(2, this, xqVar, 350L, false);
        this.A1 = new bg.c0(2);
        this.B1 = new bg.c0(8);
        Paint paint = new Paint(1);
        this.G1 = paint;
        i0.b bVar = i0.b.e;
        this.K1 = bVar;
        this.L1 = bVar;
        org.telegram.messenger.g0.S(getWindow());
        this.q1 = f2Var;
        int i11 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        this.E1 = arrayList != null;
        this.H1 = arrayList;
        this.F1 = d4Var;
        Context context = f2Var.getContext();
        qs.f(this.a).c(this, qs.T);
        qs.f(this.a).c(this, qs.r);
        int i12 = k6.a7;
        paint.setColor(k6.w0(i12, this.I0));
        P(i12);
        this.b = new x7(this, context);
        g1 g1Var = new g1(i10, context, this);
        this.k1 = g1Var;
        int i13 = this.t0;
        g1Var.setPadding(i13, 0, i13, 0);
        this.b.addView(this.k1, ha.e(-1, -1, qs.E1));
        int i14 = 5;
        this.y1 = new ec(i14, context, this);
        this.z1 = new ec(i14, context, this);
        s00 s00Var = new s00(context, this.I0);
        this.u1 = s00Var;
        s00Var.setCloseButtonVisible(true);
        s00Var.y = true;
        s00Var.updateColors();
        String M0 = id.M0(2131745839, null);
        ah.i iVar = s00Var.r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new w(this, i11));
        s00Var.setVisibility(8);
        s00 s00Var2 = new s00(context, this.I0);
        this.v1 = s00Var2;
        s00Var2.setCloseButtonVisible(true);
        s00Var2.y = true;
        s00Var2.updateColors();
        String M02 = id.M0(2131745839, null);
        ah.i iVar2 = s00Var2.r;
        iVar2.setHint(M02);
        iVar2.addTextChangedListener(new w(this, i7));
        s00Var2.setVisibility(8);
        q41 q41Var = new q41(context, this.a, 0, false, new t(this, objArr5 == true ? 1 : 0), new u(this, objArr4 == true ? 1 : 0), null, this.I0);
        this.x1 = q41Var;
        q41Var.j(new ai.b(this, 17));
        q41Var.setClipToPadding(false);
        q41Var.setVisibility(8);
        q41Var.r1();
        q41Var.f3.r = false;
        q41Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.m, 0, org.telegram.messenger.g0.n);
        yz yzVar = new yz(f2Var);
        this.w1 = yzVar;
        yzVar.setVisibility(8);
        yzVar.setBackground(null);
        yzVar.setChatPreviewDelegate(new qb.a(11));
        yzVar.setUiCallback(new gf.g(this, 6));
        yzVar.b.setClipToPadding(false);
        this.C1 = new View(getContext());
        Context context2 = getContext();
        f6 f6Var = this.I0;
        l0 l0Var = new l0(context2, f6Var, new hc((FrameLayout) this.b, f6Var), this.a, j3);
        this.D1 = l0Var;
        l0Var.h = new wf.b(this, f2Var, objArr3 == true ? 1 : 0, 23);
        this.l1 = j3;
        this.m1 = qp.s1(this.a).M0(Long.valueOf(j3));
        qp.s1(this.a).N0(j3);
        TLRPC.Chat chat = this.m1;
        this.n1 = chat != null && chat.collapsed_in_dialogs;
        o0 o0Var = new o0(R.drawable.search_users_filled, 4, m5.u(chat));
        o0Var.f = this.m1;
        o0Var.h = false;
        ArrayList arrayList2 = s00Var.F;
        arrayList2.add(o0Var);
        s00Var.I = arrayList2.size() - 1;
        s00Var.e();
        v0(k6.w0(i12, this.I0));
        this.s1 = new y(this, context, 1);
        this.r1 = new z(this, context);
        this.t1 = new y(this, context, 0);
        this.k1.setAdapter(new x(this, objArr2 == true ? 1 : 0));
        s00Var.setCloseButtonOnClickListener(new v(this, objArr == true ? 1 : 0));
        s00Var2.setCloseButtonOnClickListener(new v(this, i7));
        l0Var.d();
        qp.s1(this.a).V2(0, j3, true);
        cc.a((FrameLayout) this.b, new r7(i14));
        ViewGroup viewGroup = this.b;
        u uVar = new u(this, i7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup, uVar);
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void l(t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void w(t2 t2Var) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
