package li;

import a8.m7;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.o2;
import bi.w2;
import bi.z4;
import c8.ja;
import fi.b7;
import hi.i1;
import hi.j9;
import hi.v7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o0;
import kg.t1;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class d0 extends u2 implements is, te.b, p2 {
    public static final /* synthetic */ int Q1 = 0;
    public final zz A1;
    public final u41 B1;
    public final o2 C1;
    public final o2 D1;
    public final bg.c0 E1;
    public final bg.c0 F1;
    public final View G1;
    public final k0 H1;
    public final boolean I1;
    public final z10 J1;
    public final Paint K1;
    public ArrayList L1;
    public String M1;
    public String N1;
    public i0.c O1;
    public i0.c P1;
    public final te.a m1;
    public final te.a n1;
    public final i1 o1;
    public final long p1;
    public TLRPC.Chat q1;
    public boolean r1;
    public hi.d s1;
    public hi.d t1;
    public final e2 u1;
    public final z v1;
    public final y w1;
    public final y x1;
    public final v00 y1;
    public final v00 z1;

    public d0(e2 e2Var, long j3) {
        this(e2Var, j3, null, null);
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            float a10 = m7.a(f10);
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
            z zVar = this.v1;
            zVar.a.setAlpha(a10);
            zVar.a.setScaleX(T1);
            zVar.a.setScaleY(T1);
            zVar.a.setVisibility(a10 > 0.0f ? 0 : 8);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            v00 v00Var = this.y1;
            v00Var.setAlpha(f10);
            v00Var.setScaleX(T12);
            v00Var.setScaleY(T12);
            v00Var.setVisibility(f10 > 0.0f ? 0 : 8);
            zVar.d.setAlpha(a10);
            zVar.d.setVisibility(a10 > 0.0f ? 0 : 8);
            this.s1.setAlpha(a10);
            this.s1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.s1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.s1.setVisibility(a10 > 0.0f ? 0 : 8);
            zz zzVar = this.A1;
            zzVar.setAlpha(f10);
            zzVar.setVisibility(f10 > 0.0f ? 0 : 8);
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
            v00 v00Var2 = this.z1;
            v00Var2.setAlpha(f10);
            v00Var2.setScaleX(T14);
            v00Var2.setScaleY(T14);
            v00Var2.setVisibility(f10 > 0.0f ? 0 : 8);
            yVar.d.setAlpha(a11);
            yVar.d.setVisibility(a11 > 0.0f ? 0 : 8);
            if (!this.I1) {
                this.t1.setAlpha(a11);
                this.t1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.t1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.t1.setVisibility(a11 > 0.0f ? 0 : 8);
            }
            u41 u41Var = this.B1;
            u41Var.setAlpha(f10);
            u41Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.D1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        if (this.m1.f || this.n1.f) {
            return false;
        }
        View currentView = this.o1.getCurrentView();
        if (currentView instanceof b0) {
            return ((b0) currentView).e;
        }
        return true;
    }

    public final boolean I0(b41 b41Var) {
        Object obj = b41Var.G;
        if (!(obj instanceof mi.f)) {
            return false;
        }
        mi.f fVar = (mi.f) obj;
        long j3 = fVar.a;
        TLRPC.Chat M0 = np.s1(this.a).M0(Long.valueOf(-j3));
        TLRPC.User a22 = np.s1(this.a).a2(Long.valueOf(j3));
        e2 e2Var = this.u1;
        if (a22 != null) {
            e2Var.presentFragment(an.ua(a22.id));
            return true;
        }
        if (t3.t0(M0) || t3.j0(M0)) {
            e2Var.presentFragment(an.ua(-M0.id));
            return true;
        }
        new ni.b(getContext(), M0, new t1(14, this, fVar)).show();
        return true;
    }

    public final void J0(ArrayList arrayList, boolean z10) {
        String str;
        int i7 = 0;
        if (!z10) {
            arrayList.add(b41.E(99, (int) (org.telegram.messenger.g0.q.y * 0.35f)));
            arrayList.add(b41.E(0, org.telegram.messenger.g0.L(56.0f)));
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
                    arrayList.add(b41.w(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(b41.w(chat));
                    }
                }
            }
        }
    }

    public final void K0(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.id;
        boolean V = t3.V(chat);
        if (t3.T(chat)) {
            np.s1(this.a).Q2(j10, j3, false, z10, new j9(1, this, V));
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
        t1Var.r(250L);
        np.s1(this.a).T(getContext(), -j10, null, new c(this, t1Var, j3, z10, 1), null);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        ns.f(this.a).n(this, ns.T);
        ns.f(this.a).n(this, ns.r);
        super.L();
    }

    public final void L0(b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.I1) {
                new ni.a(getContext(), this.q1, -chat.id, new v(0, this, chat)).show();
            } else {
                this.J1.a(chat);
                dismiss();
            }
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.T;
        long j3 = this.p1;
        z zVar = this.v1;
        if (i7 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).id == j3) {
                zVar.d.g3.O(true);
            }
        } else if (i7 == ns.r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = np.D8;
            if ((intValue & TLObject.FLAG_13) == 0 && (num.intValue() & 2) == 0 && (num.intValue() & 8) == 0 && (num.intValue() & 16) == 0) {
                return;
            }
            TLRPC.Chat M0 = np.s1(this.a).M0(Long.valueOf(j3));
            this.q1 = M0;
            zVar.a.setTitle(m5.m(M0));
            zVar.h.f(this.q1, zVar.n);
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
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
                v00 v00Var = this.z1;
                org.telegram.messenger.g0.v1(v00Var.r);
                v00Var.r.clearFocus();
                return;
            }
        }
        this.o1.C(0);
    }

    @Override // org.telegram.ui.Cells.p2
    public final void r(t2 t2Var) {
        TLRPC.TL_forumTopic f10;
        if (t2Var.getMessage() == null || (f10 = np.s1(this.a).r7.f(-t2Var.getDialogId(), gj.b2(this.a, t2Var.getMessage().k, true, false))) == null) {
            return;
        }
        qg.c.m(this.u1, -t2Var.getDialogId(), f10, 0);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        Paint paint = this.K1;
        try {
            super.s0();
            int w02 = j6.w0(j6.a7, this.J0);
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
        if (np.s1(this.a).P1().K(t2Var.getDialogId())) {
            e2 e2Var = this.u1;
            e2Var.getOrCreateStoryViewer().getClass();
            e2Var.getOrCreateStoryViewer().J(e2Var.getContext(), t2Var.getDialogId(), b7.a((uj0) t2Var.getParent()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e2 e2Var, long j3, ArrayList arrayList, w2 w2Var) {
        super(e2Var.getContext(), e2Var.getResourceProvider(), true, true);
        int i7 = 1;
        er erVar = er.h;
        this.m1 = new te.a(1, this, erVar, 350L, false);
        this.n1 = new te.a(2, this, erVar, 350L, false);
        int i10 = 2;
        this.E1 = new bg.c0(2);
        int i11 = 8;
        this.F1 = new bg.c0(8);
        Paint paint = new Paint(1);
        this.K1 = paint;
        i0.c cVar = i0.c.e;
        this.O1 = cVar;
        this.P1 = cVar;
        org.telegram.messenger.g0.S(getWindow());
        this.u1 = e2Var;
        int i12 = 0;
        this.I1 = arrayList != null;
        this.L1 = arrayList;
        this.J1 = w2Var;
        Context context = e2Var.getContext();
        ns.f(this.a).c(this, ns.T);
        ns.f(this.a).c(this, ns.r);
        int i13 = j6.a7;
        paint.setColor(j6.w0(i13, this.J0));
        Q(i13);
        this.b = new v7(this, context);
        i1 i1Var = new i1(i10, context, this);
        this.o1 = i1Var;
        int i14 = this.u0;
        i1Var.setPadding(i14, 0, i14, 0);
        this.b.addView(this.o1, ja.e(-1, -1, ns.E1));
        this.C1 = new o2(i11, context, this);
        this.D1 = new o2(i11, context, this);
        v00 v00Var = new v00(context, this.J0);
        this.y1 = v00Var;
        v00Var.setCloseButtonVisible(true);
        v00Var.y = true;
        v00Var.updateColors();
        String M0 = hd.M0(2131745836, null);
        ah.i iVar = v00Var.r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new w(this, i12));
        v00Var.setVisibility(8);
        v00 v00Var2 = new v00(context, this.J0);
        this.z1 = v00Var2;
        v00Var2.setCloseButtonVisible(true);
        v00Var2.y = true;
        v00Var2.updateColors();
        String M02 = hd.M0(2131745836, null);
        ah.i iVar2 = v00Var2.r;
        iVar2.setHint(M02);
        iVar2.addTextChangedListener(new w(this, i7));
        v00Var2.setVisibility(8);
        u41 u41Var = new u41(context, this.a, 0, false, new s(this, i12), new t(this, i12), null, this.J0);
        this.B1 = u41Var;
        u41Var.j(new z4(this, 23));
        u41Var.setClipToPadding(false);
        u41Var.setVisibility(8);
        u41Var.r1();
        u41Var.g3.r = false;
        u41Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.m, 0, org.telegram.messenger.g0.n);
        zz zzVar = new zz(e2Var);
        this.A1 = zzVar;
        zzVar.setVisibility(8);
        zzVar.setBackground(null);
        zzVar.setChatPreviewDelegate(new pb.b(13));
        zzVar.setUiCallback(new gc.b(this, 15));
        zzVar.b.setClipToPadding(false);
        this.G1 = new View(getContext());
        Context context2 = getContext();
        e6 e6Var = this.J0;
        k0 k0Var = new k0(context2, e6Var, new cc((FrameLayout) this.b, e6Var), this.a, j3);
        this.H1 = k0Var;
        k0Var.h = new k8.a(i10, this, e2Var);
        this.p1 = j3;
        this.q1 = np.s1(this.a).M0(Long.valueOf(j3));
        np.s1(this.a).N0(j3);
        TLRPC.Chat chat = this.q1;
        this.r1 = chat != null && chat.collapsed_in_dialogs;
        o0 o0Var = new o0(R.drawable.search_users_filled, 4, m5.u(chat));
        o0Var.f = this.q1;
        o0Var.h = false;
        ArrayList arrayList2 = v00Var.G;
        arrayList2.add(o0Var);
        v00Var.J = arrayList2.size() - 1;
        v00Var.e();
        v0(j6.w0(i13, this.J0));
        this.w1 = new y(this, context, 1);
        this.v1 = new z(this, context);
        this.x1 = new y(this, context, 0);
        this.o1.setAdapter(new x(this, i12));
        v00Var.setCloseButtonOnClickListener(new u(this, i12));
        v00Var2.setCloseButtonOnClickListener(new u(this, i7));
        k0Var.d();
        np.s1(this.a).V2(0, j3, true);
        xb.a((FrameLayout) this.b, new bi.t(6));
        ViewGroup viewGroup = this.b;
        t tVar = new t(this, i7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup, tVar);
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
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
