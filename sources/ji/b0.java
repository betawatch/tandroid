package ji;

import ai.g3;
import ai.j5;
import ai.o1;
import ai.x2;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.mf;
import b8.v9;
import ei.i7;
import gi.g1;
import gi.m9;
import gi.w5;
import gi.w7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kg.l0;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.wm;
import org.telegram.ui.wz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b0 extends t2 implements cs, qe.b, p2 {
    public static final /* synthetic */ int N1 = 0;
    public final x2 A1;
    public final cg.b0 B1;
    public final cg.b0 C1;
    public final View D1;
    public final i0 E1;
    public final boolean F1;
    public final u10 G1;
    public final Paint H1;
    public ArrayList I1;
    public String J1;
    public String K1;
    public i0.b L1;
    public i0.b M1;
    public final qe.a j1;
    public final qe.a k1;
    public final g1 l1;
    public final long m1;
    public TLRPC.Chat n1;
    public boolean o1;
    public gi.d p1;
    public gi.d q1;
    public final d2 r1;
    public final x s1;
    public final w t1;
    public final w u1;
    public final n00 v1;
    public final n00 w1;
    public final wz x1;
    public final l41 y1;
    public final x2 z1;

    public b0(d2 d2Var, long j10) {
        this(d2Var, j10, null, null);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        if (this.j1.f || this.k1.f) {
            return false;
        }
        View currentView = this.l1.getCurrentView();
        if (currentView instanceof z) {
            return ((z) currentView).e;
        }
        return true;
    }

    public final boolean I0(r31 r31Var) {
        Object obj = r31Var.G;
        if (!(obj instanceof ki.f)) {
            return false;
        }
        ki.f fVar = (ki.f) obj;
        long j10 = fVar.a;
        TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-j10));
        TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(j10));
        d2 d2Var = this.r1;
        if (a22 != null) {
            d2Var.presentFragment(wm.ra(a22.id));
            return true;
        }
        if (t3.t0(M0) || t3.j0(M0)) {
            d2Var.presentFragment(wm.ra(-M0.id));
            return true;
        }
        new li.b(getContext(), M0, new ii.e(9, this, fVar)).show();
        return true;
    }

    public final void J0(ArrayList arrayList, boolean z10) {
        String str;
        int i3 = 0;
        if (!z10) {
            arrayList.add(r31.E(99, (int) (org.telegram.messenger.g0.q.y * 0.35f)));
            arrayList.add(r31.E(0, org.telegram.messenger.g0.L(56.0f)));
        }
        if (this.I1 != null) {
            String lowerCase = (!z10 || (str = this.K1) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.I1;
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z10 || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(r31.w(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(r31.w(chat));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        hs.f(this.a).n(this, hs.T);
        hs.f(this.a).n(this, hs.r);
        super.K();
    }

    public final void K0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.id;
        boolean V = t3.V(chat);
        if (t3.T(chat)) {
            hp.s1(this.a).Q2(j11, j10, false, z10, new m9(1, this, V));
            return;
        }
        s1 s1Var = new s1(3, getContext(), null);
        s1Var.r(250L);
        hp.s1(this.a).T(getContext(), -j11, null, new c(this, s1Var, j10, z10, 1), null);
    }

    public final void L0(r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.F1) {
                new li.a(getContext(), this.n1, -chat.id, new o1(26, this, chat)).show();
            } else {
                this.G1.a(chat);
                dismiss();
            }
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 1) {
            float a10 = v9.a(f10);
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
            x xVar = this.s1;
            xVar.a.setAlpha(a10);
            xVar.a.setScaleX(T1);
            xVar.a.setScaleY(T1);
            xVar.a.setVisibility(a10 > 0.0f ? 0 : 8);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            n00 n00Var = this.v1;
            n00Var.setAlpha(f10);
            n00Var.setScaleX(T12);
            n00Var.setScaleY(T12);
            n00Var.setVisibility(f10 > 0.0f ? 0 : 8);
            xVar.d.setAlpha(a10);
            xVar.d.setVisibility(a10 > 0.0f ? 0 : 8);
            this.p1.setAlpha(a10);
            this.p1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.p1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.p1.setVisibility(a10 > 0.0f ? 0 : 8);
            wz wzVar = this.x1;
            wzVar.setAlpha(f10);
            wzVar.setVisibility(f10 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.z1.invalidate();
        }
        if (i3 == 2) {
            float a11 = v9.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            w wVar = this.u1;
            wVar.a.setAlpha(a11);
            wVar.a.setScaleX(T13);
            wVar.a.setScaleY(T13);
            wVar.a.setVisibility(a11 > 0.0f ? 0 : 8);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            n00 n00Var2 = this.w1;
            n00Var2.setAlpha(f10);
            n00Var2.setScaleX(T14);
            n00Var2.setScaleY(T14);
            n00Var2.setVisibility(f10 > 0.0f ? 0 : 8);
            wVar.d.setAlpha(a11);
            wVar.d.setVisibility(a11 > 0.0f ? 0 : 8);
            if (!this.F1) {
                this.q1.setAlpha(a11);
                this.q1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.q1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.q1.setVisibility(a11 > 0.0f ? 0 : 8);
            }
            l41 l41Var = this.y1;
            l41Var.setAlpha(f10);
            l41Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.A1.invalidate();
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.T;
        long j10 = this.m1;
        x xVar = this.s1;
        if (i3 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).id == j10) {
                xVar.d.g3.O(true);
            }
        } else if (i3 == hs.r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = hp.C8;
            if ((intValue & TLObject.FLAG_13) == 0 && (num.intValue() & 2) == 0 && (num.intValue() & 8) == 0 && (num.intValue() & 16) == 0) {
                return;
            }
            TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(j10));
            this.n1 = M0;
            xVar.a.setTitle(m5.m(M0));
            xVar.h.e(this.n1, xVar.n);
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        if (this.l1.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.l1.getCurrentPosition() == 2) {
            qe.a aVar = this.k1;
            if (aVar.f) {
                this.u1.d.f3.h1(1, this.M1.b);
                aVar.a(false, true);
                this.r0 = true;
                n00 n00Var = this.w1;
                org.telegram.messenger.g0.v1(n00Var.r);
                n00Var.r.clearFocus();
                return;
            }
        }
        this.l1.D(0);
    }

    @Override // org.telegram.ui.Cells.p2
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        TLRPC.TL_forumTopic f10;
        if (t2Var.getMessage() == null || (f10 = hp.s1(this.a).q7.f(-t2Var.getDialogId(), zi.c2(this.a, t2Var.getMessage().k, true, false))) == null) {
            return;
        }
        rg.c.m(this.r1, -t2Var.getDialogId(), f10, 0);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        Paint paint = this.H1;
        try {
            super.s0();
            int w02 = k6.w0(k6.a7, this.J0);
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
    public final void u(org.telegram.ui.Cells.t2 t2Var) {
        if (hp.s1(this.a).P1().K(t2Var.getDialogId())) {
            d2 d2Var = this.r1;
            d2Var.getOrCreateStoryViewer().getClass();
            d2Var.getOrCreateStoryViewer().R(d2Var.getContext(), t2Var.getDialogId(), i7.a((tj0) t2Var.getParent()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(d2 d2Var, long j10, ArrayList arrayList, g3 g3Var) {
        super(d2Var.getContext(), d2Var.getResourceProvider(), true, true);
        int i3 = 1;
        xq xqVar = xq.h;
        this.j1 = new qe.a(1, this, xqVar, 350L, false);
        int i10 = 2;
        this.k1 = new qe.a(2, this, xqVar, 350L, false);
        this.B1 = new cg.b0(2);
        this.C1 = new cg.b0(8);
        Paint paint = new Paint(1);
        this.H1 = paint;
        i0.b bVar = i0.b.e;
        this.L1 = bVar;
        this.M1 = bVar;
        org.telegram.messenger.g0.S(getWindow());
        this.r1 = d2Var;
        int i11 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        this.F1 = arrayList != null;
        this.I1 = arrayList;
        this.G1 = g3Var;
        Context context = d2Var.getContext();
        hs.f(this.a).c(this, hs.T);
        hs.f(this.a).c(this, hs.r);
        int i12 = k6.a7;
        paint.setColor(k6.w0(i12, this.J0));
        P(i12);
        this.b = new w7(this, context);
        g1 g1Var = new g1(i10, context, this);
        this.l1 = g1Var;
        int i13 = this.u0;
        g1Var.setPadding(i13, 0, i13, 0);
        this.b.addView(this.l1, mf.e(-1, -1, hs.E1));
        int i14 = 6;
        this.z1 = new x2(i14, context, this);
        this.A1 = new x2(i14, context, this);
        n00 n00Var = new n00(context, this.J0);
        this.v1 = n00Var;
        n00Var.setCloseButtonVisible(true);
        n00Var.y = true;
        n00Var.updateColors();
        String M0 = bd.M0(2131745846, null);
        bh.g gVar = n00Var.r;
        gVar.setHint(M0);
        gVar.addTextChangedListener(new u(this, i11));
        n00Var.setVisibility(8);
        n00 n00Var2 = new n00(context, this.J0);
        this.w1 = n00Var2;
        n00Var2.setCloseButtonVisible(true);
        n00Var2.y = true;
        n00Var2.updateColors();
        String M02 = bd.M0(2131745846, null);
        bh.g gVar2 = n00Var2.r;
        gVar2.setHint(M02);
        gVar2.addTextChangedListener(new u(this, i3));
        n00Var2.setVisibility(8);
        l41 l41Var = new l41(context, this.a, 0, false, new r(this, objArr5 == true ? 1 : 0), new s(this, objArr4 == true ? 1 : 0), null, this.J0);
        this.y1 = l41Var;
        l41Var.j(new j5(this, 20));
        l41Var.setClipToPadding(false);
        l41Var.setVisibility(8);
        l41Var.r1();
        l41Var.g3.r = false;
        l41Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.m, 0, org.telegram.messenger.g0.n);
        wz wzVar = new wz(d2Var);
        this.x1 = wzVar;
        wzVar.setVisibility(8);
        wzVar.setBackground(null);
        wzVar.setChatPreviewDelegate(new v7.s(12));
        wzVar.setUiCallback(new w5(this, 5));
        wzVar.b.setClipToPadding(false);
        this.D1 = new View(getContext());
        Context context2 = getContext();
        e6 e6Var = this.J0;
        i0 i0Var = new i0(context2, e6Var, new fc((FrameLayout) this.b, e6Var), this.a, j10);
        this.E1 = i0Var;
        i0Var.h = new tf.b(this, d2Var, objArr3 == true ? 1 : 0);
        this.m1 = j10;
        this.n1 = hp.s1(this.a).M0(Long.valueOf(j10));
        hp.s1(this.a).N0(j10);
        TLRPC.Chat chat = this.n1;
        this.o1 = chat != null && chat.collapsed_in_dialogs;
        l0 l0Var = new l0(R.drawable.search_users_filled, 4, m5.u(chat));
        l0Var.f = this.n1;
        l0Var.h = false;
        ArrayList arrayList2 = n00Var.G;
        arrayList2.add(l0Var);
        n00Var.J = arrayList2.size() - 1;
        n00Var.e();
        v0(k6.w0(i12, this.J0));
        this.t1 = new w(this, context, 1);
        this.s1 = new x(this, context);
        this.u1 = new w(this, context, 0);
        this.l1.setAdapter(new v(this, objArr2 == true ? 1 : 0));
        n00Var.setCloseButtonOnClickListener(new t(this, objArr == true ? 1 : 0));
        n00Var2.setCloseButtonOnClickListener(new t(this, i3));
        i0Var.d();
        hp.s1(this.a).V2(0, j10, true);
        ac.a((FrameLayout) this.b, new ai.y(i14));
        ViewGroup viewGroup = this.b;
        s sVar = new s(this, i3);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup, sVar);
    }

    @Override // org.telegram.ui.Cells.p2
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void w(org.telegram.ui.Cells.t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
