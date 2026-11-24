// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k62 extends p02 implements tjb, bja, gk7 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final ke5 E;
    public int E0;
    public t14 F;
    public int F0;
    public final mv5 G;
    public int G0;
    public boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public final boolean J;
    public int J0;
    public final int K;
    public int K0;
    public final CharSequence[] L;
    public int L0;
    public final boolean[] M;
    public int M0;
    public int N;
    public final c9c N0;
    public Editable O;
    public final c9c O0;
    public Editable P;
    public final c9c[] P0;
    public Editable Q;
    public final ArrayList Q0;
    public final itc R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final o1 V0;
    public int W;
    public boolean W0;
    public int X0;
    public boolean Y0;
    public int Z0;
    public boolean a0;
    public boolean a1;
    public boolean b0;
    public boolean b1;
    public boolean c0;
    public int c1;
    public boolean d0;
    public int d1;
    public boolean e0;
    public int e1;
    public final boolean f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public boolean h0;
    public le8 h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public j62 k0;
    public final Paint k1;
    public int l0;
    public x31 l1;
    public boolean m0;
    public int m1;
    public final boolean n;
    public int n0;
    public final ud8 n1;
    public int o0;
    public Drawable o1;
    public int p0;
    public Drawable p1;
    public int q0;
    public int q1;
    public final s20 r;
    public int r0;
    public int r1;
    public final rkb s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final a62 w;
    public int w0;
    public final z12 x;
    public int x0;
    public final c62 y;
    public int y0;
    public int z0;

    public k62(x02 x02Var, Context context, boolean z, wjb wjbVar, Boolean bool) {
        super(x02Var, wjbVar, context);
        byte b = 1;
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.c0 = true;
        this.g0 = true;
        this.h0 = true;
        this.l0 = -1;
        c9c c9cVar = new c9c(this);
        this.N0 = c9cVar;
        c9c c9cVar2 = new c9c(this);
        this.O0 = c9cVar2;
        this.P0 = new c9c[]{c9cVar, c9cVar2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new o1(this, (byte) 17);
        this.W0 = false;
        this.X0 = -1;
        this.i1 = false;
        this.j1 = false;
        Paint paint = new Paint(1);
        this.k1 = paint;
        this.n1 = new ud8();
        this.n = z;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean p = y6c.h(j5.a(this.b.G3).a).p();
        this.J = p;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.d0 = booleanValue;
            this.f0 = booleanValue;
            boolean z2 = !booleanValue;
            this.U = z2;
            this.S = z2;
        }
        n0();
        paint.setColor(bkb.v0(bkb.Xl, this.a));
        this.b.o3.setDelegate(this);
        s20 s20Var = new s20(this, context, b);
        this.r = s20Var;
        byte b2 = 3;
        rkb rkbVar = new rkb(context, null, b2);
        this.s = rkbVar;
        setBlur3Capture(rkbVar);
        this.d = rkbVar;
        this.h = true;
        this.f = true;
        a62 a62Var = new a62(this);
        this.w = a62Var;
        rkbVar.setItemAnimator(a62Var);
        arrayList.clear();
        a62Var.m = false;
        a62Var.C = false;
        a62Var.o(s33.h);
        a62Var.n(350L);
        rkbVar.setClipToPadding(false);
        rkbVar.setVerticalScrollBarEnabled(false);
        rkbVar.setSections(true);
        z12 z12Var = new z12(this, gl.L(65.0f) + gl.m, rkbVar, b2);
        this.x = z12Var;
        rkbVar.setLayoutManager(z12Var);
        z12Var.O = true;
        new is5(new r10(this, b2)).h(rkbVar);
        addView(rkbVar, nme.e(-1, -1, 51));
        rkbVar.setPreserveFocusAfterLayout(true);
        rkbVar.setAdapter(s20Var);
        rkbVar.setOnItemClickListener(new r52(this, wjbVar, x02Var, context));
        rkbVar.setOnScrollListener(new y(this, (byte) 21));
        ke5 ke5Var = new ke5(context, 4);
        this.E = ke5Var;
        ke5Var.setAlpha(0.0f);
        ke5Var.setVisibility(4);
        addView(ke5Var, nme.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = na7.q1(this.b.G3).k4.N.f();
        this.R = new itc(this.b.G3);
        kk7.f(this.b.G3).b(this, kk7.v0);
        if (p) {
            kk7.e().b(this, kk7.k4);
            c62 c62Var = new c62(context, this.b.G3, null, wjbVar);
            this.y = c62Var;
            c62Var.E = true;
            c62Var.F = true;
            c62Var.setHorizontalPadding(gl.L(24.0f));
            addView(c62Var, nme.e(-2, kk7.p2, 51));
        }
        this.G = new mv5(this.b.o3, false, null);
        T();
    }

    public static CharSequence Y(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence m1 = gl.m1(charSequence);
        while (TextUtils.indexOf(m1, "\n\n\n") >= 0) {
            m1 = TextUtils.replace(m1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(m1, "\n\n\n") == 0) {
            m1 = TextUtils.replace(m1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return m1;
    }

    public static x31 g0(d dVar, int i, p8c p8cVar, hq1 hq1Var) {
        if (dVar == null) {
            return null;
        }
        x31 x31Var = new x31(dVar.getContext(), dVar, dVar.getResourceProvider(), hq1Var);
        x31Var.W3 = new x52(x31Var, p8cVar, dVar);
        x31Var.X3 = new y52(p8cVar, x31Var);
        x31Var.d2.h0();
        x31Var.t1(1, true);
        x31Var.P0(i);
        x31Var.t4 = new p52(p8cVar, (byte) 0);
        x31Var.R1 = new z52(x31Var, p8cVar, dVar);
        x31Var.S1 = new q31((Object) p8cVar, (Object) x31Var, (byte) 27);
        x31Var.Z0();
        x31Var.v0(true);
        x31Var.show();
        return x31Var;
    }

    private int getAnswersMaxCount() {
        return this.n ? getMessagesController().k4.x3.f() : getMessagesController().k4.K.f();
    }

    private int getCurrentAccount() {
        x02 x02Var = this.b;
        return x02Var != null ? x02Var.G3 : y6c.t0;
    }

    private na7 getMessagesController() {
        return na7.q1(getCurrentAccount());
    }

    @Override // p02
    public final void B() {
        s20 s20Var = this.r;
        if (s20Var != null) {
            s20Var.f();
        }
        if (this.J) {
            Z(false);
            c62 c62Var = this.y;
            if (c62Var != null) {
                c62Var.e();
            }
            le8 le8Var = this.h1;
            if (le8Var != null) {
                le8Var.setEmojiButtonVisibility(false);
                this.h1.getTextView().clearFocus();
                gl.t1(this.h1.getEditField());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int L;
        int i3;
        x02 x02Var = this.b;
        if (x02Var.o3.Q() > gl.L(20.0f) || this.b1 || this.g1 || this.i1) {
            L = gl.L(52.0f);
            x02Var.r0 = false;
        } else {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    L = i3 - gl.L(13.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    x02Var.r0 = this.i0;
                }
            }
            i3 = (i2 / 5) << 1;
            L = i3 - gl.L(13.0f);
            if (L < 0) {
            }
            x02Var.r0 = this.i0;
        }
        int i4 = L + gl.m;
        this.j0 = true;
        int i5 = this.S0;
        rkb rkbVar = this.s;
        if (i5 != i4 || rkbVar.getPaddingBottom() != this.e) {
            this.S0 = i4;
            rkbVar.q1(0, 0, 0, this.e);
            rkbVar.setItemAnimator(null);
            this.r.g(0);
        }
        this.j0 = false;
    }

    @Override // p02
    public final void I(p02 p02Var) {
        x02 x02Var = this.b;
        try {
            x02Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            x02Var.U2.setTitle(k96.M0(2131743813, null));
        } else if (this.f0) {
            x02Var.U2.setTitle(k96.M0(2131748072, null));
        } else {
            x02Var.U2.setTitle(k96.M0(2131748073, null));
        }
        x02Var.G1();
        this.x.g1(0, 0);
    }

    @Override // p02
    public final void K() {
        this.s.z0(1);
    }

    @Override // bja
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (this.J) {
            if (i > gl.L(50.0f) && this.f1 && !gl.E && !gl.O1()) {
                if (z) {
                    this.e1 = i;
                    na7.b1().edit().putInt("kbd_height_land3", this.e1).commit();
                } else {
                    this.d1 = i;
                    na7.b1().edit().putInt("kbd_height", this.d1).commit();
                }
            }
            boolean z4 = this.b1;
            x02 x02Var = this.b;
            mv5 mv5Var = this.G;
            if (z4) {
                int i2 = z ? this.e1 : this.d1;
                if (this.i1) {
                    i2 += gl.L(120.0f);
                }
                int i3 = i2 + gl.n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i4 = layoutParams.width;
                int i5 = gl.q.x;
                if (i4 != i5 || layoutParams.height != i3 || this.j1 != this.i1) {
                    layoutParams.width = i5;
                    layoutParams.height = i3;
                    this.F.setLayoutParams(layoutParams);
                    this.c1 = layoutParams.height;
                    mv5Var.a();
                    x02Var.o3.requestLayout();
                    boolean z5 = this.j1;
                    if (z5 != this.i1) {
                        Q(z5 ? -gl.L(120.0f) : gl.L(120.0f));
                    }
                    this.j1 = this.i1;
                }
            }
            if (this.Z0 == i && this.a1 == z) {
                return;
            }
            this.Z0 = i;
            this.a1 = z;
            boolean z6 = this.f1;
            le8 le8Var = this.h1;
            if (le8Var != null) {
                z2 = le8Var.getEditField().isFocused() && mv5Var.c() && i > 0;
                this.f1 = z2;
            } else {
                this.f1 = false;
                z2 = false;
            }
            if (z2 && this.b1) {
                j0(0);
            }
            if (this.c1 != 0 && !(z3 = this.f1) && z3 != z6 && !this.b1) {
                this.c1 = 0;
                mv5Var.a();
                x02Var.o3.requestLayout();
            }
            if (this.f1 && this.H) {
                this.H = false;
                gl.r(this.V0);
            }
        }
    }

    public final void P() {
        c62 c62Var = this.y;
        if (c62Var != null) {
            c62Var.setDelegate(null);
            c62Var.e();
        }
        this.s.setItemAnimator(this.w);
        int i = this.N;
        this.M[i] = false;
        int i2 = i + 1;
        this.N = i2;
        int length = this.L.length;
        s20 s20Var = this.r;
        if (i2 == length) {
            s20Var.r(this.v0);
        }
        s20Var.i(this.v0);
        n0();
        this.l0 = (this.u0 + this.N) - 1;
        s20Var.g(this.w0);
        s20Var.g(this.B0);
    }

    public final void Q(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new rm1(this, f, (byte) 3));
        ofFloat.addListener(new t52(this, (byte) 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(gb.w);
        ofFloat.start();
    }

    public final void R() {
        boolean z = (this.d0 || this.b0) ? false : true;
        if (!z) {
            this.U = false;
        }
        int i = this.D0;
        if (i < 0) {
            return;
        }
        s49 K = this.s.K(i);
        if (K == null) {
            this.r.g(this.D0);
            return;
        }
        je8 je8Var = (je8) K.a;
        if (!z) {
            je8Var.setChecked(false);
        }
        je8Var.getCheckBox().a.a(!z, true);
    }

    public final boolean S() {
        boolean z = TextUtils.isEmpty(Y(this.O)) && TextUtils.isEmpty(Y(this.P)) && TextUtils.isEmpty(Y(this.Q)) && this.n1.a.size() == 0;
        if (z) {
            for (int i = 0; i < this.N && (z = TextUtils.isEmpty(Y(this.L[i]))); i++) {
            }
        }
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.Z1.getParentActivity());
            boolean z2 = this.n;
            String M0 = k96.M0(z2 ? 2131752555 : 2131752561, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(z2 ? 2131752556 : 2131752562, null);
            alertDialog$Builder.j(k96.M0(2131747387, null), new rh1((Object) this, (byte) 17));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.o();
        }
        return z;
    }

    public final void T() {
        int i;
        int i2;
        int i3;
        boolean z = this.d0;
        CharSequence[] charSequenceArr = this.L;
        boolean z2 = false;
        if (z) {
            int i4 = 0;
            i = 0;
            while (true) {
                boolean[] zArr = this.M;
                if (i4 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(Y(charSequenceArr[i4])) && zArr[i4]) {
                    i++;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        if (this.n) {
            i2 = getMessagesController().k4.H2.f();
            i3 = getMessagesController().k4.I2.f();
        } else {
            i2 = kk7.d4;
            i3 = 100;
        }
        boolean z3 = (TextUtils.isEmpty(Y(this.P)) || this.P.length() <= this.T0) && (TextUtils.isEmpty(Y(this.Q)) || this.Q.length() <= 200) && !TextUtils.isEmpty(Y(this.O)) && this.O.length() <= i2;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(Y(charSequenceArr[i5]))) {
                if (charSequenceArr[i5].length() > i3) {
                    i6 = 0;
                    z4 = true;
                    break;
                } else {
                    i6++;
                    z4 = true;
                }
            }
            i5++;
        }
        if (i6 < 1 || (this.d0 && i < 1)) {
            z3 = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z4 && this.n1.a.size() <= 0) {
            this.i0 = true;
            z2 = true;
        } else {
            this.i0 = false;
        }
        x02 x02Var = this.b;
        x02Var.r0 = z2;
        this.Y0 = z3;
        x02Var.G1();
    }

    public final void U(wgb wgbVar, boolean z) {
        if (this.W != 0) {
            wgbVar.q(k96.M0(2131746937, null), k96.Q(this.W), z, false);
        } else if (this.V != 0) {
            wgbVar.q(k96.M0(2131746939, null), k96.G(this.V / 3600, "Hours", new Object[0]), z, false);
        } else {
            wgbVar.q(k96.M0(2131746937, null), null, z, false);
        }
    }

    public final void V(qd8 qd8Var, boolean z) {
        TLRPC.Photo photo;
        String str = qd8Var.b;
        itc itcVar = this.R;
        boolean containsKey = itcVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) itcVar.b.get(qd8Var.b);
        fm0 fm0Var = qd8Var.s;
        ImageReceiver imageReceiver = qd8Var.a;
        qd8Var.r.a(containsKey || (webPage instanceof TLRPC.TL_webPagePending), z);
        qd8Var.n = webPage;
        if (webPage == null || (photo = webPage.photo) == null) {
            fm0Var.a(false, z);
            imageReceiver.f();
        } else {
            TLRPC.PhotoSize w = ba4.w(photo.sizes, 40, false, null, false);
            imageReceiver.Z(gl5.f(ba4.w(webPage.photo.sizes, gl.L(36.0f), false, w, true), webPage.photo), "48_48", gl5.f(w, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            fm0Var.a(true, z);
        }
    }

    public final void W() {
        if (this.i1) {
            this.F.s(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= gl.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.c1 = layoutParams.height;
            this.j1 = this.i1;
            this.i1 = false;
            Q(-gl.L(120.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(View view, le8 le8Var, boolean z) {
        int b;
        c62 c62Var;
        d dVar;
        if (view.getTag() == null) {
            view.setTag(1);
            rkb rkbVar = this.s;
            s49 G = rkbVar.G(le8Var);
            if (G == null || (b = G.b()) == -1) {
                return;
            }
            int i = b - this.u0;
            ud8 ud8Var = this.n1;
            boolean z2 = ud8Var.b(i) != null;
            if (z && z2 && (dVar = this.b.Z1) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, dVar.getParentActivity());
                String M0 = k96.M0(!this.d0 ? 2131751392 : 2131751390, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(!this.d0 ? 2131751391 : 2131751389, null);
                alertDialog$Builder.j(k96.M0(2131751586, null), new ie((Object) this, (Object) view, (Object) le8Var, (byte) 25));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hdVar.setOnCancelListener(new ur0(view, (byte) 4));
                hdVar.show();
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                    return;
                }
                return;
            }
            ud8Var.h(i);
            rkbVar.setItemAnimator(this.w);
            s20 s20Var = this.r;
            s20Var.r(b);
            int i2 = i + 1;
            CharSequence[] charSequenceArr = this.L;
            System.arraycopy(charSequenceArr, i2, charSequenceArr, i, (charSequenceArr.length - 1) - i);
            boolean[] zArr = this.M;
            System.arraycopy(zArr, i2, zArr, i, (zArr.length - 1) - i);
            charSequenceArr[charSequenceArr.length - 1] = null;
            zArr[zArr.length - 1] = false;
            int i3 = this.N - 1;
            this.N = i3;
            if (i3 == charSequenceArr.length - 1) {
                s20Var.i((this.u0 + charSequenceArr.length) - 1);
            }
            s49 K = rkbVar.K(b - 1);
            EditTextBoldCursor textView2 = le8Var.getTextView();
            if (K != null) {
                View view2 = K.a;
                if (view2 instanceof le8) {
                    ((le8) view2).getTextView().requestFocus();
                    textView2.clearFocus();
                    T();
                    n0();
                    c62Var = this.y;
                    if (c62Var != null) {
                        c62Var.e();
                        c62Var.setDelegate(null);
                    }
                    s20Var.g(this.w0);
                    s20Var.g(this.B0);
                }
            }
            if (textView2.isFocused()) {
                gl.t1(textView2);
                Z(true);
            } else if (this.i1) {
                Z(true);
            }
            textView2.clearFocus();
            T();
            n0();
            c62Var = this.y;
            if (c62Var != null) {
            }
            s20Var.g(this.w0);
            s20Var.g(this.B0);
        }
    }

    public final void Z(boolean z) {
        if (this.J) {
            byte b = 0;
            if (this.b1) {
                t14 t14Var = this.F;
                t14Var.Q.D0();
                t14Var.J.scrollTo(0, 0);
                t14Var.D(1);
                t14Var.R.g1(0, 0);
                this.F.s(false);
                if (z) {
                    this.F.z();
                }
                this.i1 = false;
                j0(0);
            }
            if (z) {
                t14 t14Var2 = this.F;
                if (t14Var2 == null || t14Var2.getVisibility() != 0) {
                    a0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                ofFloat.addUpdateListener(new q52(this, b));
                this.g1 = true;
                ofFloat.addListener(new t52(this, (byte) 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(gb.w);
                ofFloat.start();
            }
        }
    }

    public final void a0() {
        t14 t14Var;
        qy1 emojiButton;
        if (!this.b1 && (t14Var = this.F) != null && t14Var.getVisibility() != 8) {
            le8 le8Var = this.h1;
            if (le8Var != null && (emojiButton = le8Var.getEmojiButton()) != null) {
                emojiButton.j(oy1.e, false);
            }
            this.F.setVisibility(8);
        }
        int i = this.c1;
        this.c1 = 0;
        if (i != 0) {
            this.G.a();
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Yl));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.Li));
        hashSet.add(Integer.valueOf(bkb.G6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.Z6));
        hashSet.add(Integer.valueOf(bkb.a7));
    }

    public final void b0(le8 le8Var, boolean z) {
        if (this.J && z) {
            if (this.h1 == le8Var && this.b1 && this.i1) {
                W();
                this.b1 = false;
            }
            le8 le8Var2 = this.h1;
            this.h1 = le8Var;
            le8Var.setEmojiButtonVisibility(true);
            qy1 emojiButton = le8Var.getEmojiButton();
            oy1 oy1Var = oy1.e;
            emojiButton.j(oy1Var, false);
            rkb rkbVar = this.s;
            View F = rkbVar.F(le8Var);
            s49 T = F == null ? null : rkbVar.T(F);
            c62 c62Var = this.y;
            if (c62Var != null) {
                c62Var.e();
                if (T != null) {
                    View view = T.a;
                    if ((view instanceof le8) && c62Var.getDelegate() != view) {
                        c62Var.setDelegate((le8) view);
                    }
                }
            }
            if (le8Var2 == null || le8Var2 == le8Var) {
                return;
            }
            if (this.b1) {
                W();
                Z(false);
                f0();
            }
            le8Var2.setEmojiButtonVisibility(false);
            le8Var2.getEmojiButton().j(oy1Var, false);
        }
    }

    public final void c0(le8 le8Var) {
        this.h1 = le8Var;
        if (!this.b1) {
            j0(1);
        } else {
            W();
            f0();
        }
    }

    public final void d0(int i) {
        this.m1 = i;
        d dVar = this.b.Z1;
        this.n1.b(i);
        this.l1 = g0(dVar, (i == -2 || i == -3) ? 74 : 41026, new n52(this, i, (byte) 0), new hq1(this, (byte) 19));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i != kk7.v0) {
            if (i == kk7.k4) {
                t14 t14Var = this.F;
                if (t14Var != null) {
                    t14Var.Q.h1();
                }
                le8 le8Var = this.h1;
                if (le8Var != null) {
                    int currentTextColor = le8Var.getEditField().getCurrentTextColor();
                    this.h1.getEditField().setTextColor(-1);
                    this.h1.getEditField().setTextColor(currentTextColor);
                    return;
                }
                return;
            }
            return;
        }
        vf6 vf6Var = (vf6) objArr[0];
        for (Map.Entry entry : this.R.b.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) vf6Var.f(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                entry.setValue(webPage);
            }
        }
        ud8 ud8Var = this.n1;
        int size = ud8Var.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            ld8 ld8Var = (ld8) ud8Var.a.get(i3);
            if (ld8Var instanceof qd8) {
                V((qd8) ld8Var, true);
            }
        }
    }

    public final void e0(int i) {
        x02 x02Var;
        d dVar;
        ud8 ud8Var = this.n1;
        if (ud8Var.b(i) == null) {
            d0(i);
            return;
        }
        ld8 b = ud8Var.b(i);
        if (b == null || (x02Var = this.b) == null || (dVar = x02Var.Z1) == null) {
            return;
        }
        Activity parentActivity = dVar.getParentActivity();
        byte b2 = 1;
        if (b instanceof pd8) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((pd8) b).b);
            PhotoViewer.r0().T1(parentActivity, null, null);
            PhotoViewer.r0().o1(arrayList, 0, 14, false, new u52(this, i), null);
            return;
        }
        if (b instanceof vd8) {
            vd8 vd8Var = (vd8) b;
            xv2.e().l(parentActivity);
            xv2.e().k(new dd((Object) this, i, (byte) 4));
            xv2 e = xv2.e();
            TLRPC.Document document = vd8Var.b;
            e.i(document, null, "", null, null, k27.H2(document) ? 2 : 0, false, vd8Var.c, this.a, kk7.d3);
            return;
        }
        if (b instanceof od8) {
            od8 od8Var = (od8) b;
            l0(i, new bm1(od8Var.d, gl.i0(od8Var.e, true, true) + " " + od8Var.f, b2), gl.L(240.0f), gl.L(60.0f));
            return;
        }
        if (b instanceof td8) {
            td8 td8Var = (td8) b;
            TLRPC.Document F0 = td8Var.b.F0();
            l0(i, new r(k27.x1(F0), k27.v1(F0) + " - " + k96.R((int) k27.H0(F0)), td8Var, b2), gl.L(240.0f), gl.L(60.0f));
            return;
        }
        if (b instanceof sd8) {
            l0(i, new z02((sd8) b, b2), gl.L(300.0f), (gl.L(300.0f) * 9) / 16);
        } else if (!(b instanceof qd8)) {
            d0(i);
        } else {
            qd8 qd8Var = (qd8) b;
            ij.d0(getContext(), this.a, qd8Var.b, qd8Var.n, new n52(this, i, (byte) 1), new o52(this, i, (byte) 0));
        }
    }

    public final void f0() {
        le8 le8Var = this.h1;
        if (le8Var != null) {
            this.G.e = true;
            EditTextBoldCursor editField = le8Var.getEditField();
            editField.requestFocus();
            gl.E3(editField);
        }
        j0(gl.D ? 0 : 2);
        if (gl.D || this.f1 || gl.E || gl.O1()) {
            return;
        }
        this.H = true;
        o1 o1Var = this.V0;
        gl.r(o1Var);
        gl.d3(o1Var, 100L);
    }

    @Override // p02
    public int getButtonsHideOffset() {
        return gl.L(70.0f);
    }

    @Override // p02
    public int getCurrentItemTop() {
        View childAt;
        rkb rkbVar = this.s;
        if (rkbVar.getChildCount() <= 1 || (childAt = rkbVar.getChildAt(1)) == null) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View F = rkbVar.F(childAt);
        y29 y29Var = (y29) (F == null ? null : rkbVar.T(F));
        int y = (((int) childAt.getY()) - gl.m) - gl.L(20.0f);
        int i = (y <= 0 || y29Var == null || y29Var.b() != 1) ? 0 : y;
        if (y < 0 || y29Var == null || y29Var.b() != 1) {
            y = i;
        }
        return gl.L(25.0f) + y;
    }

    public int getEmojiPadding() {
        return this.c1;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(17.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return this.S0;
    }

    @Override // p02
    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        int i = bkb.z5;
        rkb rkbVar = this.s;
        arrayList.add(new blb(rkbVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(rkbVar, 16, new Class[]{d62.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        int i2 = bkb.o7;
        arrayList.add(new blb(rkbVar, 262144, new Class[]{ld5.class}, new String[]{"textView2"}, (Drawable[]) null, (alb) null, i2));
        int i3 = bkb.l6;
        arrayList.add(new blb(rkbVar, TLObject.FLAG_23, new Class[]{le8.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(rkbVar, TLObject.FLAG_23, new Class[]{le8.class}, new String[]{"moveImageView"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(rkbVar, 262144, new Class[]{le8.class}, new String[]{"textView2"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(rkbVar, 0, new Class[]{le8.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i3));
        int i4 = bkb.j7;
        arrayList.add(new blb(rkbVar, 0, new Class[]{le8.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i4));
        arrayList.add(new blb(rkbVar, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        int i5 = bkb.M6;
        arrayList.add(new blb(rkbVar, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i5));
        arrayList.add(new blb(rkbVar, 32, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, i5));
        arrayList.add(new blb(rkbVar, 0, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, i4));
        return arrayList;
    }

    public final void h0(int i, ld8 ld8Var) {
        int i2;
        ud8 ud8Var = this.n1;
        if (ld8Var != null) {
            ud8Var.a.put(i, ld8Var);
        } else {
            ud8Var.a.remove(i);
        }
        if (i == -2) {
            i2 = this.o0;
        } else if (i == -3) {
            i2 = this.q0;
        } else {
            int i3 = this.u0;
            i2 = (i3 < 0 || i < 0 || i >= this.N) ? -1 : i + i3;
        }
        if (i2 >= 0) {
            s49 K = this.s.K(i2);
            if (K != null) {
                View view = K.a;
                if (view instanceof le8) {
                    ((le8) view).e.a(ld8Var, true);
                }
            }
            this.r.g(i2);
        }
        if (ld8Var instanceof qd8) {
            qd8 qd8Var = (qd8) ld8Var;
            String str = qd8Var.b;
            ae2 ae2Var = new ae2((Object) this, (Object) ld8Var, (byte) 10);
            itc itcVar = this.R;
            HashMap hashMap = itcVar.c;
            HashMap hashMap2 = itcVar.b;
            byte b = 0;
            if (hashMap2.containsKey(str)) {
                ae2Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(ae2Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(itcVar.a).sendRequestTyped(getwebpagepreview, new hc(b), new w77(itcVar, str, (byte) 20));
                }
            }
            V(qd8Var, false);
        }
        T();
    }

    @Override // p02
    public final boolean i() {
        return this.Y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(int i, View view) {
        int f;
        int length;
        int i2;
        float f2;
        if (!(view instanceof le8)) {
            return;
        }
        le8 le8Var = (le8) view;
        if (i == this.o0) {
            Editable editable = this.P;
            length = editable != null ? editable.length() : 0;
            f = this.T0;
        } else {
            int i3 = this.n0;
            boolean z = this.n;
            if (i == i3) {
                f = z ? getMessagesController().k4.H2.f() : kk7.d4;
                Editable editable2 = this.O;
                if (editable2 != null) {
                    length = editable2.length();
                }
                length = 0;
            } else {
                if (i == this.q0) {
                    Editable editable3 = this.Q;
                    int length2 = editable3 != null ? editable3.length() : 0;
                    f = kk7.d3;
                    i2 = 200 - length2;
                    f2 = f;
                    if (i2 <= f2 - (0.7f * f2)) {
                        le8Var.setText2("");
                        return;
                    }
                    le8Var.setText2(String.format("%d", Integer.valueOf(i2)));
                    jia textView2 = le8Var.getTextView2();
                    int i4 = i2 < 0 ? bkb.o7 : bkb.z6;
                    zkb.W(textView2, i4, this.a);
                    textView2.setTag(Integer.valueOf(i4));
                    return;
                }
                int i5 = this.u0;
                if (i < i5 || i >= this.N + i5) {
                    return;
                }
                int i6 = i - i5;
                f = z ? getMessagesController().k4.I2.f() : 100;
                CharSequence charSequence = this.L[i6];
                if (charSequence != null) {
                    length = charSequence.length();
                }
                length = 0;
            }
        }
        i2 = f - length;
        f2 = f;
        if (i2 <= f2 - (0.7f * f2)) {
        }
    }

    @Override // p02
    public final int j() {
        return 1;
    }

    public final void j0(int i) {
        qy1 emojiButton;
        le8 le8Var;
        if (this.J) {
            mv5 mv5Var = this.G;
            x02 x02Var = this.b;
            byte b = 1;
            if (i != 1) {
                le8 le8Var2 = this.h1;
                emojiButton = le8Var2 != null ? le8Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(oy1.e, true);
                }
                t14 t14Var = this.F;
                if (t14Var != null) {
                    this.b1 = false;
                    this.i1 = false;
                    if (gl.D || gl.E) {
                        t14Var.setVisibility(8);
                    }
                }
                if (i == 0) {
                    this.c1 = 0;
                }
                mv5Var.a();
                x02Var.o3.requestLayout();
                return;
            }
            t14 t14Var2 = this.F;
            boolean z = t14Var2 != null && t14Var2.getVisibility() == 0;
            t14 t14Var3 = this.F;
            if (t14Var3 != null && t14Var3.d1 != y6c.t0) {
                x02Var.o3.removeView(t14Var3);
                this.F = null;
                t14Var3 = null;
            }
            if (t14Var3 == null) {
                t14 t14Var4 = new t14(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                this.F = t14Var4;
                t14Var4.c = 3;
                t14Var4.x0 = false;
                t14Var4.x2 = false;
                t14Var4.setShouldDrawBackground(false);
                t14 t14Var5 = this.F;
                t14Var5.V0 = false;
                t14Var5.setVisibility(8);
                if (gl.O1()) {
                    this.F.setForseMultiwindowLayout(true);
                }
                this.F.setDelegate(new s52(this));
                x02Var.o3.addView(this.F);
                this.F.setBottomInset(gl.n);
            }
            this.F.setVisibility(0);
            this.b1 = true;
            t14 t14Var6 = this.F;
            if (this.d1 <= 0) {
                if (gl.O1()) {
                    this.d1 = gl.L(150.0f);
                } else {
                    this.d1 = na7.b1().getInt("kbd_height", gl.L(200.0f));
                }
            }
            int i2 = this.e1;
            if (i2 <= 0) {
                if (gl.O1()) {
                    i2 = gl.L(150.0f);
                    this.e1 = i2;
                } else {
                    i2 = na7.b1().getInt("kbd_height_land3", gl.L(200.0f));
                    this.e1 = i2;
                }
            }
            Point point = gl.q;
            if (point.x <= point.y) {
                i2 = this.d1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t14Var6.getLayoutParams();
            layoutParams.height = gl.n + i2;
            t14Var6.setLayoutParams(layoutParams);
            if (!gl.E && !gl.O1() && (le8Var = this.h1) != null) {
                gl.t1(le8Var.getEditField());
            }
            this.c1 = i2;
            mv5Var.a();
            x02Var.o3.requestLayout();
            le8 le8Var3 = this.h1;
            emojiButton = le8Var3 != null ? le8Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(oy1.d, true);
            }
            if (z || this.f1) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c1, 0.0f);
            ofFloat.addUpdateListener(new q52(this, b));
            ofFloat.addListener(new t52(this, b));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(gb.w);
            ofFloat.start();
        }
    }

    @Override // p02
    public final boolean k() {
        if (!this.b1) {
            return !S();
        }
        Z(true);
        return true;
    }

    public final void k0(int i) {
        s49 K = this.s.K(this.u0 + i);
        if (K != null) {
            View view = K.a;
            if (view instanceof le8) {
                le8 le8Var = (le8) view;
                if (le8Var.getTop() > gl.L(40.0f)) {
                    c62 c62Var = this.y;
                    if (c62Var != null) {
                        c62Var.e();
                    }
                    String M0 = k96.M0(2131746989, null);
                    ke5 ke5Var = this.E;
                    ke5Var.setText(M0);
                    ke5Var.c(le8Var.getCheckBox());
                    ImageView imageView = ke5Var.b;
                    imageView.setTranslationX(imageView.getTranslationX() + gl.L(48.0f));
                    ke5Var.setTranslationY(ke5Var.getTranslationY() + gl.L(10.0f));
                }
            }
        }
    }

    public final void l0(int i, q8c q8cVar, int i2, int i3) {
        cs5 G = cs5.G(this, null, new View(getContext()));
        G.s = (short) 0;
        G.t = false;
        G.b(R.drawable.msg_replace, k96.M0(2131746078, null), new o52(this, i, (byte) 1), false);
        G.b(R.drawable.msg_delete, k96.M0(2131751586, null), new o52(this, i, (byte) 2), true);
        tq9 tq9Var = new tq9(getContext(), this.a);
        G.p = new zk1(tq9Var, (byte) 1);
        G.V = gl.L(185.0f);
        G.Z();
        tq9Var.e(G);
        Drawable drawable = (Drawable) q8cVar.a(tq9Var.s);
        il0 c = tq9Var.n.c(null, null, false);
        c.p(nod.k(tq9Var.b));
        c.q(gl.L(8.0f));
        c.S.e = true;
        c.r(gl.L(16.0f));
        tq9Var.G = c;
        tq9Var.F = drawable;
        Point point = gl.q;
        int i4 = (point.x - i2) / 2;
        int i5 = (point.y - i3) / 2;
        int i6 = i2 + i4;
        int i7 = i3 + i5;
        c.setBounds(i4 - gl.L(8.0f), i5 - gl.L(8.0f), gl.L(8.0f) + i6, gl.L(8.0f) + i7);
        tq9Var.F.setBounds(i4, i5, i6, i7);
        ((FrameLayout.LayoutParams) tq9Var.y.getLayoutParams()).gravity = 1;
        tq9Var.M = true;
        tq9Var.show();
    }

    public final void m0() {
        wjb wjbVar = this.a;
        try {
            int v0 = bkb.v0(bkb.M6, wjbVar);
            int v02 = bkb.v0(bkb.j7, wjbVar);
            if (v0 == this.q1 && v02 == this.r1) {
                return;
            }
            this.q1 = v0;
            this.r1 = v02;
            Drawable drawable = this.o1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
            Drawable drawable2 = this.p1;
            if (drawable2 != null) {
                drawable2.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            }
            rkb rkbVar = this.s;
            if (rkbVar != null) {
                for (int i = 0; i < rkbVar.getChildCount(); i++) {
                    View childAt = rkbVar.getChildAt(i);
                    if (childAt instanceof wgb) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void n0() {
        int i;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.G0 = -1;
        this.C0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.D0 = -1;
        this.F0 = -1;
        this.E0 = -1;
        this.H0 = -1;
        c9c c9cVar = this.N0;
        c9cVar.b = -1;
        c9c c9cVar2 = this.O0;
        c9cVar2.b = -1;
        this.M0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.v0 = -1;
        this.u0 = -1;
        this.y0 = -1;
        this.o0 = -1;
        this.m0 = true;
        int i2 = 3;
        this.R0 = 3;
        this.n0 = 2;
        boolean z = this.n;
        if (!z) {
            this.R0 = 4;
            this.o0 = 3;
            i2 = 4;
        }
        int i3 = i2 + 1;
        this.s0 = i2;
        int i4 = i2 + 2;
        this.R0 = i4;
        this.t0 = i3;
        int i5 = this.N;
        if (i5 != 0) {
            this.u0 = i4;
            i4 += i5;
            this.R0 = i4;
        }
        if (i5 != this.L.length) {
            int i6 = i4 + 1;
            this.R0 = i6;
            this.v0 = i4;
            i4 = i6;
        }
        this.w0 = i4;
        int i7 = i4 + 2;
        this.R0 = i7;
        this.x0 = i4 + 1;
        if (z) {
            i = i4 + 3;
            this.R0 = i;
            this.A0 = i7;
            if (this.h0) {
                int i8 = i4 + 4;
                this.R0 = i8;
                this.z0 = i;
                i = i8;
            }
        } else {
            TLRPC.Chat chat = ((mu1) this.b.Z1).e;
            boolean z2 = hc2.T(chat) && !chat.megagroup;
            if (z2) {
                this.b0 = true;
            } else {
                int i9 = this.R0;
                this.R0 = i9 + 1;
                this.C0 = i9;
            }
            int i10 = this.R0;
            int i11 = i10 + 1;
            this.R0 = i11;
            this.G0 = i10;
            if (z2) {
                this.U = false;
            } else {
                int i12 = i10 + 2;
                this.R0 = i12;
                this.D0 = i11;
                i11 = i12;
            }
            this.E0 = i11;
            this.F0 = i11 + 1;
            int i13 = i11 + 3;
            this.R0 = i13;
            this.H0 = i11 + 2;
            if (z2) {
                c9cVar.b = i13;
                i13 = i11 + 5;
                this.R0 = i13;
                c9cVar2.b = i11 + 4;
                if (c9cVar2.a) {
                    int i14 = i11 + 6;
                    this.R0 = i14;
                    this.M0 = i13;
                    i13 = i14;
                }
            }
            int i15 = i13 + 1;
            this.R0 = i15;
            this.I0 = i13;
            if (this.V != 0 || this.W != 0) {
                this.J0 = i15;
                int i16 = i13 + 3;
                this.K0 = i13 + 2;
                int i17 = i13 + 4;
                this.R0 = i17;
                this.L0 = i16;
                i15 = i17;
            }
            i = i15 + 1;
            this.R0 = i;
            this.y0 = i15;
            if (this.d0) {
                this.p0 = i;
                int i18 = i15 + 3;
                this.q0 = i15 + 2;
                int i19 = i15 + 4;
                this.R0 = i19;
                this.r0 = i18;
                i = i19;
            }
        }
        this.R0 = i + 1;
        this.B0 = i;
    }

    @Override // p02
    public final void q() {
        this.I = true;
        x02 x02Var = this.b;
        kk7.f(x02Var.G3).n(this, kk7.v0);
        if (this.J) {
            kk7.e().n(this, kk7.k4);
            t14 t14Var = this.F;
            if (t14Var != null) {
                x02Var.o3.removeView(t14Var);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.j0) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(j62 j62Var) {
        this.k0 = j62Var;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override // p02
    public final boolean t() {
        return S();
    }

    @Override // p02
    public final void u() {
        this.b.G1();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.k1.setColor(bkb.v0(bkb.Xl, this.a));
            m0();
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // p02
    public final void w(float f) {
        this.b.G1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // p02
    public final void x(int i) {
        int i2;
        if (i != 40) {
            return;
        }
        boolean z = this.n;
        int i3 = 0;
        int i4 = 1;
        x02 x02Var = this.b;
        CharSequence[] charSequenceArr = this.L;
        if (z) {
            CharSequence[] charSequenceArr2 = {Y(this.O)};
            int i5 = x02Var.G3;
            ArrayList<TLRPC.MessageEntity> Y = hq6.d0(i5).Y(charSequenceArr2, true, true);
            CharSequence charSequence = charSequenceArr2[0];
            if (Y != null) {
                int size = Y.size();
                for (int i6 = 0; i6 < size; i6++) {
                    TLRPC.MessageEntity messageEntity = Y.get(i6);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
            }
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
            TLRPC.TodoList todoList = new TLRPC.TodoList();
            tL_messageMediaToDo.todo = todoList;
            boolean z2 = this.h0;
            todoList.others_can_append = z2 && this.g0;
            todoList.others_can_complete = z2;
            todoList.title = new TLRPC.TL_textWithEntities();
            tL_messageMediaToDo.todo.title.text = charSequence.toString();
            tL_messageMediaToDo.todo.title.entities = Y;
            for (int i7 = 0; i7 < charSequenceArr.length; i7++) {
                if (!TextUtils.isEmpty(Y(charSequenceArr[i7]))) {
                    CharSequence[] charSequenceArr3 = {Y(charSequenceArr[i7])};
                    ArrayList<TLRPC.MessageEntity> Y2 = hq6.d0(i5).Y(charSequenceArr3, true, true);
                    CharSequence charSequence2 = charSequenceArr3[0];
                    if (Y2 != null) {
                        int size2 = Y2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            TLRPC.MessageEntity messageEntity2 = Y2.get(i8);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                    }
                    TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    todoItem.title = tL_textWithEntities;
                    tL_textWithEntities.text = charSequence2.toString();
                    todoItem.title.entities = Y2;
                    todoItem.id = tL_messageMediaToDo.todo.list.size() + 1;
                    tL_messageMediaToDo.todo.list.add(todoItem);
                }
            }
            ij.X(i5, x02Var.V0(), x02Var.R0() + 1, new ht(this, (mu1) x02Var.Z1, tL_messageMediaToDo, (byte) 12));
            return;
        }
        boolean z3 = this.d0;
        rkb rkbVar = this.s;
        boolean[] zArr = this.M;
        if (z3 && !this.Y0) {
            int i9 = 0;
            while (i3 < zArr.length) {
                if (!TextUtils.isEmpty(Y(charSequenceArr[i3])) && zArr[i3]) {
                    i9++;
                }
                i3++;
            }
            if (i9 <= 0) {
                for (int i10 = this.u0; i10 < this.u0 + this.N; i10++) {
                    s49 K = rkbVar.K(i10);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof le8) {
                            le8 le8Var = (le8) view;
                            if (le8Var.getTop() > gl.L(40.0f)) {
                                c62 c62Var = this.y;
                                if (c62Var != null) {
                                    c62Var.e();
                                }
                                String M0 = k96.M0(2131746962, null);
                                ke5 ke5Var = this.E;
                                ke5Var.setText(M0);
                                ke5Var.c(le8Var.getCheckBox());
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            int length = charSequenceArr.length;
            ud8 ud8Var = this.n1;
            if (i11 >= length) {
                CharSequence[] charSequenceArr4 = {Y(this.O)};
                int i12 = x02Var.G3;
                ArrayList<TLRPC.MessageEntity> Y3 = hq6.d0(i12).Y(charSequenceArr4, true, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                if (Y3 != null) {
                    int size3 = Y3.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        TLRPC.MessageEntity messageEntity3 = Y3.get(i13);
                        if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                            messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = this.c0;
                tL_poll.quiz = this.d0;
                tL_poll.public_voters = !this.b0;
                tL_poll.open_answers = this.U;
                tL_poll.revoting_disabled = !this.S;
                tL_poll.shuffle_answers = this.T;
                tL_poll.subscribers_only = this.N0.a;
                if (this.O0.a) {
                    ArrayList arrayList = this.Q0;
                    if (!arrayList.isEmpty()) {
                        TLRPC.Poll poll = tL_messageMediaPoll.poll;
                        poll.flags |= TLObject.FLAG_12;
                        poll.countries_iso2.addAll(arrayList);
                    }
                }
                TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                poll2.creator = true;
                int i14 = this.V;
                if (i14 != 0) {
                    poll2.hide_results_until_close = this.a0;
                    poll2.close_period = i14;
                    poll2.flags |= 16;
                } else {
                    int i15 = this.W;
                    if (i15 != 0) {
                        poll2.hide_results_until_close = this.a0;
                        poll2.close_date = i15;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = Y3;
                ArrayList arrayList2 = new ArrayList(this.K);
                int i16 = 0;
                while (i16 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i16]))) {
                        ud8Var.h(tL_messageMediaPoll.poll.answers.size());
                        i2 = i3;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[i4];
                        charSequenceArr5[i3] = Y(charSequenceArr[i16]);
                        ArrayList<TLRPC.MessageEntity> Y4 = hq6.d0(i12).Y(charSequenceArr5, i4, i4);
                        CharSequence charSequence4 = charSequenceArr5[i3];
                        if (Y4 != null) {
                            int size4 = Y4.size();
                            int i17 = i3;
                            while (i17 < size4) {
                                TLRPC.MessageEntity messageEntity4 = Y4.get(i17);
                                int i18 = i3;
                                if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                    messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                }
                                i17++;
                                i3 = i18;
                            }
                        }
                        i2 = i3;
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = Y4;
                        byte[] bArr = new byte[1];
                        tL_pollAnswer.option = bArr;
                        bArr[i2] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                        if ((this.c0 || this.d0) && zArr[i16]) {
                            arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i16++;
                    i3 = i2;
                    i4 = 1;
                }
                int i19 = i3;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence Y5 = Y(this.Q);
                if (Y5 != null) {
                    tL_messageMediaPoll.results.solution = Y5.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i19] = Y5;
                    ArrayList<TLRPC.MessageEntity> Y6 = hq6.d0(i12).Y(charSequenceArr6, true, true);
                    if (Y6 != null && !Y6.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = Y6;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                ij.X(i12, x02Var.V0(), x02Var.R0() + 1, new au0((Object) this, x02Var.Z1, (Object) tL_messageMediaPoll, (Object) arrayList2, (byte) 6));
                return;
            }
            if (TextUtils.isEmpty(Y(charSequenceArr[i11])) && ud8Var.b(i11) != null) {
                this.W0 = true;
                this.X0 = i11;
                rkbVar.z0(this.u0 + i11);
                return;
            }
            i11++;
        }
    }
}
