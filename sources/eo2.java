// default package

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class eo2 extends fx0 implements gk7, x74, qe3 {
    public static final /* synthetic */ int P1 = 0;
    public final q5c A1;
    public final sb B1;
    public final sb C1;
    public final jz4 D1;
    public final jz4 E1;
    public final View F1;
    public final mo2 G1;
    public final boolean H1;
    public final a61 I1;
    public final Paint J1;
    public ArrayList K1;
    public String L1;
    public String M1;
    public io5 N1;
    public io5 O1;
    public final fm0 l1;
    public final fm0 m1;
    public final vq1 n1;
    public final long o1;
    public TLRPC.Chat p1;
    public boolean q1;
    public u41 r1;
    public u41 s1;
    public final d t1;
    public final yn2 u1;
    public final xn2 v1;
    public final xn2 w1;
    public final no4 x1;
    public final no4 y1;
    public final af4 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo2(d dVar, long j, ArrayList arrayList, a61 a61Var) {
        super(dVar.getResourceProvider(), dVar.getContext(), true, true);
        byte b = 1;
        s33 s33Var = s33.h;
        this.l1 = new fm0(1, this, s33Var, 350L, false);
        this.m1 = new fm0(2, this, s33Var, 350L, false);
        this.D1 = new jz4(2);
        byte b2 = 8;
        this.E1 = new jz4(8);
        Paint paint = new Paint(1);
        this.J1 = paint;
        io5 io5Var = io5.e;
        this.N1 = io5Var;
        this.O1 = io5Var;
        gl.S(getWindow());
        this.t1 = dVar;
        byte b3 = 0;
        this.H1 = arrayList != null;
        this.K1 = arrayList;
        this.I1 = a61Var;
        Context context = dVar.getContext();
        kk7.f(this.a).b(this, kk7.S);
        kk7.f(this.a).b(this, 2);
        int i = bkb.Z6;
        paint.setColor(bkb.v0(i, this.J0));
        M(i);
        this.b = new zn2(this, context);
        vq1 vq1Var = new vq1(b, context, this);
        this.n1 = vq1Var;
        int i2 = this.u0;
        vq1Var.setPadding(i2, 0, i2, 0);
        this.b.addView(this.n1, nme.e(-1, -1, kk7.D1));
        this.B1 = new sb(b2, context, this);
        this.C1 = new sb(b2, context, this);
        no4 no4Var = new no4(context, this.J0);
        this.x1 = no4Var;
        no4Var.setCloseButtonVisible(true);
        no4Var.y = true;
        no4Var.updateColors();
        String M0 = k96.M0(2131745644, null);
        l7 l7Var = no4Var.r;
        l7Var.setHint(M0);
        l7Var.addTextChangedListener(new wn2(this, b3));
        no4Var.setVisibility(8);
        no4 no4Var2 = new no4(context, this.J0);
        this.y1 = no4Var2;
        no4Var2.setCloseButtonVisible(true);
        no4Var2.y = true;
        no4Var2.updateColors();
        String M02 = k96.M0(2131745644, null);
        l7 l7Var2 = no4Var2.r;
        l7Var2.setHint(M02);
        l7Var2.addTextChangedListener(new wn2(this, b));
        no4Var2.setVisibility(8);
        q5c q5cVar = new q5c(context, this.a, 0, false, new sn2(this, b3), new tn2(this, b3), null, this.J0);
        this.A1 = q5cVar;
        q5cVar.j(new y(this, (byte) 29));
        q5cVar.setClipToPadding(false);
        q5cVar.setVisibility(8);
        q5cVar.r1();
        q5cVar.g3.r = false;
        q5cVar.setPadding(0, gl.L(52.0f) + gl.m, 0, gl.n);
        af4 af4Var = new af4(dVar);
        this.z1 = af4Var;
        af4Var.setVisibility(8);
        af4Var.setBackground(null);
        byte b4 = 15;
        af4Var.setChatPreviewDelegate(new i2f(b4));
        af4Var.setUiCallback(new lj9((Object) this, (byte) 22));
        af4Var.b.setClipToPadding(false);
        this.F1 = new View(getContext());
        Context context2 = getContext();
        wjb wjbVar = this.J0;
        mo2 mo2Var = new mo2(context2, wjbVar, new u21((FrameLayout) this.b, wjbVar), this.a, j);
        this.G1 = mo2Var;
        mo2Var.h = new lv6(this, dVar, b4);
        this.o1 = j;
        this.p1 = na7.q1(this.a).K0(Long.valueOf(j));
        na7.q1(this.a).L0(j);
        TLRPC.Chat chat = this.p1;
        this.q1 = chat != null && chat.collapsed_in_dialogs;
        rf4 rf4Var = new rf4(R.drawable.search_users_filled, 4, cf3.t(chat));
        rf4Var.f = this.p1;
        rf4Var.h = false;
        ArrayList arrayList2 = no4Var.G;
        arrayList2.add(rf4Var);
        no4Var.J = arrayList2.size() - 1;
        no4Var.e();
        s0(bkb.v0(i, this.J0));
        this.v1 = new xn2(this, context, (byte) 1);
        this.u1 = new yn2(this, context);
        this.w1 = new xn2(this, context, (byte) 0);
        this.n1.setAdapter(new sl2(this, b));
        no4Var.setCloseButtonOnClickListener(new un2(this, b3));
        no4Var2.setCloseButtonOnClickListener(new un2(this, b));
        mo2Var.d();
        na7.q1(this.a).X2(0, j, true);
        m21.a((FrameLayout) this.b, new oy((byte) 6));
        ViewGroup viewGroup = this.b;
        tn2 tn2Var = new tn2(this, b);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(viewGroup, tn2Var);
    }

    public final boolean D0(c4c c4cVar) {
        Object obj = c4cVar.H;
        if (!(obj instanceof kn2)) {
            return false;
        }
        kn2 kn2Var = (kn2) obj;
        long j = kn2Var.a;
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-j));
        TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(j));
        d dVar = this.t1;
        if (V1 != null) {
            dVar.presentFragment(mu1.U9(V1.id));
            return true;
        }
        if (hc2.t0(K0) || hc2.j0(K0)) {
            dVar.presentFragment(mu1.U9(-K0.id));
            return true;
        }
        new fn2(getContext(), K0, new n92(this, kn2Var, (byte) 23)).show();
        return true;
    }

    @Override // fx0
    public final boolean E() {
        if (this.l1.f || this.m1.f) {
            return false;
        }
        View currentView = this.n1.getCurrentView();
        if (currentView instanceof co2) {
            return ((co2) currentView).e;
        }
        return true;
    }

    public final void E0(ArrayList arrayList, boolean z) {
        String str;
        int i = 0;
        if (!z) {
            arrayList.add(c4c.E(99, (int) (gl.q.y * 0.35f)));
            arrayList.add(c4c.E(0, gl.L(56.0f)));
        }
        if (this.K1 != null) {
            String lowerCase = (!z || (str = this.M1) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.K1;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(c4c.w(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(c4c.w(chat));
                    }
                }
            }
        }
    }

    public final void F0(TLRPC.Chat chat, long j, boolean z) {
        long j2 = -chat.id;
        boolean V = hc2.V(chat);
        if (hc2.T(chat)) {
            na7.q1(this.a).S2(j2, j, false, z, new vn2(this, V, (byte) 0));
            return;
        }
        hd hdVar = new hd(3, null, getContext());
        hdVar.q(250L);
        na7.q1(this.a).P(getContext(), -j2, null, new um2(this, hdVar, j, z, (byte) 1), null);
    }

    public final void G0(c4c c4cVar) {
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.H1) {
                new qm2(getContext(), this.p1, -chat.id, new pz1((Object) this, (Object) chat, (byte) 9)).show();
            } else {
                this.I1.a(chat);
                dismiss();
            }
        }
    }

    @Override // fx0
    public final void I() {
        kk7.f(this.a).n(this, kk7.S);
        kk7.f(this.a).n(this, 2);
        super.I();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.S;
        long j = this.o1;
        yn2 yn2Var = this.u1;
        if (i == i3) {
            if (((TLRPC.ChatFull) objArr[0]).id == j) {
                yn2Var.d.g3.O(true);
            }
        } else if (i == 2) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i4 = na7.q5;
            if ((intValue & TLObject.FLAG_13) == 0 && (num.intValue() & 2) == 0 && (num.intValue() & 8) == 0 && (num.intValue() & 16) == 0) {
                return;
            }
            TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(j));
            this.p1 = K0;
            yn2Var.a.setTitle(cf3.l(K0));
            yn2Var.h.f(this.p1, yn2Var.n);
        }
    }

    @Override // qe3
    public final void k(ue3 ue3Var) {
        if (na7.q1(this.a).M1().J(ue3Var.getDialogId())) {
            d dVar = this.t1;
            dVar.getOrCreateStoryViewer().getClass();
            dVar.getOrCreateStoryViewer().H(dVar.getContext(), ue3Var.getDialogId(), p2b.a((o39) ue3Var.getParent()));
        }
    }

    @Override // qe3
    public final boolean m() {
        return true;
    }

    @Override // qe3
    public final void o(ue3 ue3Var) {
        TLRPC.TL_forumTopic f;
        if (ue3Var.getMessage() == null || (f = na7.q1(this.a).g4.f(-ue3Var.getDialogId(), k27.b2(this.a, ue3Var.getMessage().k, true, false))) == null) {
            return;
        }
        mm4.n(this.t1, -ue3Var.getDialogId(), f, 0);
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        vq1 vq1Var = this.n1;
        if (vq1Var.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (vq1Var.getCurrentPosition() == 2) {
            fm0 fm0Var = this.m1;
            if (fm0Var.f) {
                this.w1.d.f3.g1(1, this.O1.b);
                fm0Var.a(false, true);
                this.r0 = true;
                no4 no4Var = this.y1;
                gl.t1(no4Var.r);
                no4Var.r.clearFocus();
                return;
            }
        }
        vq1Var.E(0);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 1) {
            float a = zfe.a(f);
            float R1 = gl.R1(0.9f, 1.0f, a);
            yn2 yn2Var = this.u1;
            yn2Var.a.setAlpha(a);
            yn2Var.a.setScaleX(R1);
            yn2Var.a.setScaleY(R1);
            yn2Var.a.setVisibility(a > 0.0f ? 0 : 8);
            float R12 = gl.R1(0.9f, 1.0f, f);
            no4 no4Var = this.x1;
            no4Var.setAlpha(f);
            no4Var.setScaleX(R12);
            no4Var.setScaleY(R12);
            no4Var.setVisibility(f > 0.0f ? 0 : 8);
            yn2Var.d.setAlpha(a);
            yn2Var.d.setVisibility(a > 0.0f ? 0 : 8);
            this.r1.setAlpha(a);
            this.r1.setScaleX(gl.R1(0.95f, 1.0f, a));
            this.r1.setScaleY(gl.R1(0.95f, 1.0f, a));
            this.r1.setVisibility(a > 0.0f ? 0 : 8);
            af4 af4Var = this.z1;
            af4Var.setAlpha(f);
            af4Var.setVisibility(f > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.B1.invalidate();
        }
        if (i == 2) {
            float a2 = zfe.a(f);
            float R13 = gl.R1(0.9f, 1.0f, a2);
            xn2 xn2Var = this.w1;
            xn2Var.a.setAlpha(a2);
            xn2Var.a.setScaleX(R13);
            xn2Var.a.setScaleY(R13);
            xn2Var.a.setVisibility(a2 > 0.0f ? 0 : 8);
            float R14 = gl.R1(0.9f, 1.0f, f);
            no4 no4Var2 = this.y1;
            no4Var2.setAlpha(f);
            no4Var2.setScaleX(R14);
            no4Var2.setScaleY(R14);
            no4Var2.setVisibility(f > 0.0f ? 0 : 8);
            xn2Var.d.setAlpha(a2);
            xn2Var.d.setVisibility(a2 > 0.0f ? 0 : 8);
            if (!this.H1) {
                this.s1.setAlpha(a2);
                this.s1.setScaleX(gl.R1(0.95f, 1.0f, a2));
                this.s1.setScaleY(gl.R1(0.95f, 1.0f, a2));
                this.s1.setVisibility(a2 > 0.0f ? 0 : 8);
            }
            q5c q5cVar = this.A1;
            q5cVar.setAlpha(f);
            q5cVar.setVisibility(f > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.C1.invalidate();
        }
    }

    @Override // fx0
    public final void p0() {
        Paint paint = this.J1;
        try {
            super.p0();
            int v0 = bkb.v0(bkb.Z6, this.J0);
            if (paint.getColor() != v0) {
                s0(v0);
                paint.setColor(v0);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // qe3
    public final void s() {
    }

    @Override // qe3
    public final void v(ue3 ue3Var) {
    }

    @Override // qe3
    public final void w(ue3 ue3Var) {
    }

    @Override // x74
    public final void D(float f, int i) {
    }

    public eo2(d dVar, long j) {
        this(dVar, j, null, null);
    }
}
