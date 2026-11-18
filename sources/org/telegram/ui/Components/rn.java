package org.telegram.ui.Components;

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
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rn extends ki implements org.telegram.ui.ActionBar.c6, zt0, org.telegram.messenger.fs {
    public static final /* synthetic */ int s1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final j30 E;
    public int E0;
    public ry F;
    public int F0;
    public final hi.p3 G;
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
    public final bg.w0 N0;
    public Editable O;
    public final bg.w0 O0;
    public Editable P;
    public final bg.w0[] P0;
    public Editable Q;
    public final ArrayList Q0;
    public final sh.p R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final gk V0;
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
    public org.telegram.ui.Cells.a6 h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public qn k0;
    public final Paint k1;
    public int l0;
    public fi.n2 l1;
    public int m0;
    public int m1;
    public final boolean n;
    public int n0;
    public final sh.e n1;
    public int o0;
    public Drawable o1;
    public int p0;
    public Drawable p1;
    public int q0;
    public int q1;
    public final org.telegram.ui.l4 r;
    public int r0;
    public int r1;
    public final org.telegram.ui.f61 s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final fn w;
    public int w0;
    public final kg.c0 x;
    public int x0;
    public final in y;
    public int y0;
    public int z0;

    public rn(si siVar, Context context, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, Boolean bool) {
        super(context, i6Var, siVar);
        int i7 = 1;
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.c0 = true;
        this.g0 = true;
        this.h0 = true;
        this.l0 = -1;
        bg.w0 w0Var = new bg.w0(this);
        this.N0 = w0Var;
        bg.w0 w0Var2 = new bg.w0(this);
        this.O0 = w0Var2;
        this.P0 = new bg.w0[]{w0Var, w0Var2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new gk(this, 2);
        this.W0 = false;
        this.X0 = -1;
        this.i1 = false;
        this.j1 = false;
        Paint paint = new Paint(1);
        this.k1 = paint;
        this.n1 = new sh.e();
        this.n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean q10 = org.telegram.messenger.j10.i(org.telegram.messenger.c.a(this.b.H3).a).q();
        this.J = q10;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.d0 = booleanValue;
            this.f0 = booleanValue;
            boolean z11 = !booleanValue;
            this.U = z11;
            this.S = z11;
        }
        n0();
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Yl, this.a));
        this.b.p3.setDelegate(this);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(i7, this, context);
        this.r = l4Var;
        org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(5, context, null);
        this.s = f61Var;
        setBlur3Capture(f61Var);
        this.d = f61Var;
        this.h = true;
        this.f = true;
        fn fnVar = new fn(this);
        this.w = fnVar;
        f61Var.setItemAnimator(fnVar);
        arrayList.clear();
        fnVar.m = false;
        fnVar.C = false;
        fnVar.o(lr.h);
        fnVar.n(350L);
        f61Var.setClipToPadding(false);
        f61Var.setVerticalScrollBarEnabled(false);
        f61Var.setSections(true);
        int i10 = 4;
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(65.0f) + org.telegram.messenger.g0.m, f61Var, i10);
        this.x = c0Var;
        f61Var.setLayoutManager(c0Var);
        c0Var.O = true;
        new v4.z(new gi.c(this, i10)).h(f61Var);
        addView(f61Var, c8.ma.e(-1, -1, 51));
        f61Var.setPreserveFocusAfterLayout(true);
        f61Var.setAdapter(l4Var);
        f61Var.setOnItemClickListener(new vm(this, i6Var, siVar, context));
        f61Var.setOnScrollListener(new oa(this, 6));
        j30 j30Var = new j30(context, 4);
        this.E = j30Var;
        j30Var.setAlpha(0.0f);
        j30Var.setVisibility(4);
        addView(j30Var, c8.ma.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.b.H3).A7.O.b).c;
        this.R = new sh.p(this.b.H3);
        org.telegram.messenger.ks.f(this.b.H3).c(this, org.telegram.messenger.ks.w0);
        if (q10) {
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.k4);
            in inVar = new in(context, this.b.H3, null, i6Var);
            this.y = inVar;
            inVar.E = true;
            inVar.F = true;
            inVar.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            addView(inVar, c8.ma.e(-2, org.telegram.messenger.ks.q2, 51));
        }
        this.G = new hi.p3(this.b.p3, false, null);
        Y();
    }

    public static void P(rn rnVar, int i7) {
        j30 j30Var = rnVar.E;
        v4.f1 K = rnVar.s.K(rnVar.u0 + i7);
        if (K != null) {
            View view = K.a;
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                    in inVar = rnVar.y;
                    if (inVar != null) {
                        inVar.f();
                    }
                    j30Var.setText(org.telegram.messenger.gd.M0(2131746989, null));
                    j30Var.c(a6Var.getCheckBox());
                    ImageView imageView = j30Var.b;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.g0.L(48.0f));
                    j30Var.setTranslationY(j30Var.getTranslationY() + org.telegram.messenger.g0.L(10.0f));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q(rn rnVar, View view, int i7) {
        int i10;
        int length;
        int i11;
        int i12;
        int length2;
        float f10;
        boolean z10 = rnVar.n;
        if (!(view instanceof org.telegram.ui.Cells.a6)) {
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
        if (i7 == rnVar.o0) {
            i12 = rnVar.T0;
            Editable editable = rnVar.P;
            if (editable != null) {
                length2 = editable.length();
                i11 = i12 - length2;
                f10 = i12;
                if (i11 > f10 - (0.7f * f10)) {
                    a6Var.setText2("");
                    return;
                }
                a6Var.setText2(String.format("%d", Integer.valueOf(i11)));
                org.telegram.ui.ActionBar.n5 textView2 = a6Var.getTextView2();
                int i13 = i11 < 0 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.A6;
                org.telegram.ui.ActionBar.u6.X(textView2, i13, rnVar.a);
                textView2.setTag(Integer.valueOf(i13));
                return;
            }
            length2 = 0;
            i11 = i12 - length2;
            f10 = i12;
            if (i11 > f10 - (0.7f * f10)) {
            }
        } else if (i7 == rnVar.n0) {
            i12 = z10 ? rnVar.getMessagesController().V6 : org.telegram.messenger.ks.e4;
            Editable editable2 = rnVar.O;
            if (editable2 != null) {
                length2 = editable2.length();
                i11 = i12 - length2;
                f10 = i12;
                if (i11 > f10 - (0.7f * f10)) {
                }
            }
            length2 = 0;
            i11 = i12 - length2;
            f10 = i12;
            if (i11 > f10 - (0.7f * f10)) {
            }
        } else {
            if (i7 == rnVar.q0) {
                Editable editable3 = rnVar.Q;
                int length3 = editable3 != null ? editable3.length() : 0;
                i10 = org.telegram.messenger.ks.e3;
                length = 200 - length3;
            } else {
                int i14 = rnVar.u0;
                if (i7 < i14 || i7 >= rnVar.N + i14) {
                    return;
                }
                int i15 = i7 - i14;
                i10 = z10 ? rnVar.getMessagesController().W6 : 100;
                CharSequence charSequence = rnVar.L[i15];
                length = i10 - (charSequence != null ? charSequence.length() : 0);
            }
            int i16 = i10;
            i11 = length;
            i12 = i16;
            f10 = i12;
            if (i11 > f10 - (0.7f * f10)) {
            }
        }
    }

    public static void R(rn rnVar, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        if (rnVar.J && z10) {
            if (rnVar.h1 == a6Var && rnVar.b1 && rnVar.i1) {
                rnVar.b0();
                rnVar.b1 = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = rnVar.h1;
            rnVar.h1 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            yg emojiButton = a6Var.getEmojiButton();
            wg wgVar = wg.e;
            emojiButton.j(wgVar, false);
            org.telegram.ui.f61 f61Var = rnVar.s;
            View F = f61Var.F(a6Var);
            v4.f1 T = F == null ? null : f61Var.T(F);
            in inVar = rnVar.y;
            if (inVar != null) {
                inVar.f();
                if (T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && inVar.getDelegate() != view) {
                        inVar.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 == null || a6Var2 == a6Var) {
                return;
            }
            if (rnVar.b1) {
                rnVar.b0();
                rnVar.e0(false);
                rnVar.h0();
            }
            a6Var2.setEmojiButtonVisibility(false);
            a6Var2.getEmojiButton().j(wgVar, false);
        }
    }

    public static void S(rn rnVar, org.telegram.ui.Cells.a6 a6Var) {
        rnVar.h1 = a6Var;
        if (!rnVar.b1) {
            rnVar.k0(1);
        } else {
            rnVar.b0();
            rnVar.h0();
        }
    }

    public static void T(rn rnVar, int i7) {
        si siVar;
        org.telegram.ui.ActionBar.h2 h2Var;
        sh.e eVar = rnVar.n1;
        if (eVar.b(i7) == null) {
            rnVar.g0(i7);
            return;
        }
        sh.d b10 = eVar.b(i7);
        if (b10 == null || (siVar = rnVar.b) == null || (h2Var = siVar.a2) == null) {
            return;
        }
        Activity parentActivity = h2Var.getParentActivity();
        if (b10 instanceof th.d) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((th.d) b10).b);
            PhotoViewer.p1().I2(parentActivity, null, null);
            PhotoViewer.p1().f2(arrayList, 0, 14, false, new ym(rnVar, i7), null);
            return;
        }
        if (b10 instanceof th.h) {
            th.h hVar = (th.h) b10;
            org.telegram.ui.ns.p().v(parentActivity);
            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
            an anVar = new an();
            anVar.b = rnVar;
            anVar.a = i7;
            p10.u(anVar);
            org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
            TLRPC.Document document = hVar.b;
            p11.s(document, null, "", null, null, org.telegram.messenger.fj.H2(document) ? 2 : 0, false, hVar.c, rnVar.a, org.telegram.messenger.ks.e3);
            return;
        }
        if (b10 instanceof th.c) {
            th.c cVar = (th.c) b10;
            rnVar.l0(i7, new org.telegram.ui.ef(1, cVar.d, org.telegram.messenger.g0.i0(cVar.e, true, true) + " " + cVar.f), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
            return;
        }
        if (b10 instanceof th.g) {
            th.g gVar = (th.g) b10;
            TLRPC.Document F0 = gVar.b.F0();
            rnVar.l0(i7, new hi.q4(org.telegram.messenger.fj.x1(F0), org.telegram.messenger.fj.v1(F0) + " - " + org.telegram.messenger.gd.R((int) org.telegram.messenger.fj.H0(F0)), gVar, 2), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
            return;
        }
        if (b10 instanceof th.f) {
            rnVar.l0(i7, new ui((th.f) b10, 1), org.telegram.messenger.g0.L(300.0f), (org.telegram.messenger.g0.L(300.0f) * 9) / 16);
        } else if (!(b10 instanceof th.e)) {
            rnVar.g0(i7);
        } else {
            th.e eVar2 = (th.e) b10;
            b5.d0(rnVar.getContext(), rnVar.a, eVar2.b, eVar2.n, new qm(rnVar, i7, 1), new sm(rnVar, i7, 0));
        }
    }

    public static CharSequence d0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence n1 = org.telegram.messenger.g0.n1(charSequence);
        while (TextUtils.indexOf(n1, "\n\n\n") >= 0) {
            n1 = TextUtils.replace(n1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(n1, "\n\n\n") == 0) {
            n1 = TextUtils.replace(n1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return n1;
    }

    private int getAnswersMaxCount() {
        return this.n ? getMessagesController().U6 : ((org.telegram.messenger.j0) getMessagesController().A7.L.b).c;
    }

    private int getCurrentAccount() {
        si siVar = this.b;
        return siVar != null ? siVar.H3 : org.telegram.messenger.j10.t0;
    }

    private org.telegram.messenger.mp getMessagesController() {
        return org.telegram.messenger.mp.u1(getCurrentAccount());
    }

    public static fi.n2 i0(org.telegram.ui.ActionBar.h2 h2Var, int i7, org.telegram.messenger.x10 x10Var, lg lgVar) {
        if (h2Var == null) {
            return null;
        }
        fi.n2 n2Var = new fi.n2(h2Var.getContext(), h2Var, h2Var.getResourceProvider(), lgVar);
        n2Var.X3 = new cn(n2Var, x10Var, h2Var);
        n2Var.Y3 = new dn(x10Var, n2Var);
        n2Var.e2.i0();
        n2Var.z1(1, true);
        n2Var.W0(i7);
        n2Var.u4 = new tm(x10Var);
        n2Var.S1 = new en(n2Var, x10Var, h2Var);
        n2Var.T1 = new g2(14, x10Var, n2Var);
        n2Var.f1();
        n2Var.A0(true);
        n2Var.show();
        return n2Var;
    }

    @Override // org.telegram.ui.Components.ki
    public final void A() {
        org.telegram.ui.l4 l4Var = this.r;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.J) {
            e0(false);
            in inVar = this.y;
            if (inVar != null) {
                inVar.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.h1;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.h1.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.h1.getEditField());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // org.telegram.ui.Components.ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        int i11;
        si siVar = this.b;
        if (siVar.p3.Q() > org.telegram.messenger.g0.L(20.0f) || this.b1 || this.g1 || this.i1) {
            L = org.telegram.messenger.g0.L(52.0f);
            siVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(13.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    siVar.r0 = this.i0;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(13.0f);
            if (L < 0) {
            }
            siVar.r0 = this.i0;
        }
        int i12 = L + org.telegram.messenger.g0.m;
        this.j0 = true;
        int i13 = this.S0;
        org.telegram.ui.f61 f61Var = this.s;
        if (i13 != i12 || f61Var.getPaddingBottom() != this.e) {
            this.S0 = i12;
            f61Var.q1(0, 0, 0, this.e);
            f61Var.setItemAnimator(null);
            this.r.g(0);
        }
        this.j0 = false;
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        si siVar = this.b;
        try {
            siVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            siVar.V2.setTitle(org.telegram.messenger.gd.M0(2131743819, null));
        } else if (this.f0) {
            siVar.V2.setTitle(org.telegram.messenger.gd.M0(2131748072, null));
        } else {
            siVar.V2.setTitle(org.telegram.messenger.gd.M0(2131748073, null));
        }
        siVar.M1();
        this.x.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        this.s.y0(1);
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        boolean z11;
        if (this.J) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.e1 = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.e1).commit();
                } else {
                    this.d1 = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.d1).commit();
                }
            }
            boolean z12 = this.b1;
            si siVar = this.b;
            hi.p3 p3Var = this.G;
            if (z12) {
                int i10 = z10 ? this.e1 : this.d1;
                if (this.i1) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                int i11 = i10 + org.telegram.messenger.g0.n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.g0.q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.j1 != this.i1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.F.setLayoutParams(layoutParams);
                    this.c1 = layoutParams.height;
                    p3Var.a();
                    siVar.p3.requestLayout();
                    boolean z13 = this.j1;
                    if (z13 != this.i1) {
                        V(z13 ? -org.telegram.messenger.g0.L(120.0f) : org.telegram.messenger.g0.L(120.0f));
                    }
                    this.j1 = this.i1;
                }
            }
            if (this.Z0 == i7 && this.a1 == z10) {
                return;
            }
            this.Z0 = i7;
            this.a1 = z10;
            boolean z14 = this.f1;
            org.telegram.ui.Cells.a6 a6Var = this.h1;
            if (a6Var != null) {
                this.f1 = a6Var.getEditField().isFocused() && p3Var.c() && i7 > 0;
            } else {
                this.f1 = false;
            }
            if (this.f1 && this.b1) {
                k0(0);
            }
            if (this.c1 != 0 && !(z11 = this.f1) && z11 != z14 && !this.b1) {
                this.c1 = 0;
                p3Var.a();
                siVar.p3.requestLayout();
            }
            if (this.f1 && this.H) {
                this.H = false;
                org.telegram.messenger.g0.r(this.V0);
            }
        }
    }

    public final void U() {
        in inVar = this.y;
        if (inVar != null) {
            inVar.setDelegate(null);
            inVar.f();
        }
        this.s.setItemAnimator(this.w);
        int i7 = this.N;
        this.M[i7] = false;
        int i10 = i7 + 1;
        this.N = i10;
        int length = this.L.length;
        org.telegram.ui.l4 l4Var = this.r;
        if (i10 == length) {
            l4Var.s(this.v0);
        }
        l4Var.i(this.v0);
        n0();
        this.l0 = (this.u0 + this.N) - 1;
        l4Var.g(this.w0);
        l4Var.g(this.B0);
    }

    public final void V(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.rf(this, f10, 4));
        ofFloat.addListener(new xm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
        ofFloat.start();
    }

    public final void W() {
        boolean z10 = (this.d0 || this.b0) ? false : true;
        if (!z10) {
            this.U = false;
        }
        int i7 = this.D0;
        if (i7 < 0) {
            return;
        }
        v4.f1 K = this.s.K(i7);
        if (K == null) {
            this.r.g(this.D0);
            return;
        }
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) K.a;
        if (!z10) {
            y5Var.setChecked(false);
        }
        y5Var.getCheckBox().a.a(!z10, true);
    }

    public final boolean X() {
        boolean z10 = TextUtils.isEmpty(d0(this.O)) && TextUtils.isEmpty(d0(this.P)) && TextUtils.isEmpty(d0(this.Q)) && this.n1.a.size() == 0;
        if (z10) {
            for (int i7 = 0; i7 < this.N && (z10 = TextUtils.isEmpty(d0(this.L[i7]))); i7++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.a2.getParentActivity());
            boolean z11 = this.n;
            String M0 = org.telegram.messenger.gd.M0(z11 ? 2131752556 : 2131752562, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(z11 ? 2131752557 : 2131752563, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747387, null), new b0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            alertDialog$Builder.p();
        }
        return z10;
    }

    public final void Y() {
        int i7;
        boolean z10 = this.d0;
        CharSequence[] charSequenceArr = this.L;
        if (z10) {
            int i10 = 0;
            i7 = 0;
            while (true) {
                boolean[] zArr = this.M;
                if (i10 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(d0(charSequenceArr[i10])) && zArr[i10]) {
                    i7++;
                }
                i10++;
            }
        } else {
            i7 = 0;
        }
        boolean z11 = this.n;
        int i11 = z11 ? getMessagesController().V6 : org.telegram.messenger.ks.e4;
        int i12 = z11 ? getMessagesController().W6 : 100;
        boolean z12 = (TextUtils.isEmpty(d0(this.P)) || this.P.length() <= this.T0) && (TextUtils.isEmpty(d0(this.Q)) || this.Q.length() <= 200) && !TextUtils.isEmpty(d0(this.O)) && this.O.length() <= i11;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i13 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(d0(charSequenceArr[i13]))) {
                if (charSequenceArr[i13].length() > i12) {
                    i14 = 0;
                    z13 = true;
                    break;
                } else {
                    i14++;
                    z13 = true;
                }
            }
            i13++;
        }
        if (i14 < 1 || (this.d0 && i7 < 1)) {
            z12 = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z13 && this.n1.a.size() <= 0) {
            this.i0 = true;
        } else {
            this.i0 = false;
        }
        boolean z14 = this.i0;
        si siVar = this.b;
        siVar.r0 = z14;
        this.Y0 = z12;
        siVar.M1();
    }

    public final void Z(org.telegram.ui.Cells.m8 m8Var, boolean z10) {
        if (this.W != 0) {
            m8Var.q(org.telegram.messenger.gd.M0(2131746937, null), org.telegram.messenger.gd.Q(this.W), z10, false);
        } else if (this.V != 0) {
            m8Var.q(org.telegram.messenger.gd.M0(2131746939, null), org.telegram.messenger.gd.G(this.V / 3600, "Hours", new Object[0]), z10, false);
        } else {
            m8Var.q(org.telegram.messenger.gd.M0(2131746937, null), null, z10, false);
        }
    }

    public final void a0(th.e eVar, boolean z10) {
        TLRPC.Photo photo;
        String str = eVar.b;
        sh.p pVar = this.R;
        boolean containsKey = pVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) pVar.b.get(eVar.b);
        te.a aVar = eVar.s;
        ImageReceiver imageReceiver = eVar.a;
        eVar.r.a(containsKey || (webPage instanceof TLRPC.TL_webPagePending), z10);
        eVar.n = webPage;
        if (webPage == null || (photo = webPage.photo) == null) {
            aVar.a(false, z10);
            imageReceiver.f();
        } else {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, false, null, false);
            imageReceiver.r0(org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), "48_48", org.telegram.messenger.fc.f(w10, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            aVar.a(true, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
    }

    public final void b0() {
        if (this.i1) {
            this.F.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.c1 = layoutParams.height;
            this.j1 = this.i1;
            this.i1 = false;
            V(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(View view, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        int b10;
        in inVar;
        org.telegram.ui.ActionBar.h2 h2Var;
        if (view.getTag() != null) {
            return;
        }
        int i7 = 1;
        view.setTag(1);
        org.telegram.ui.f61 f61Var = this.s;
        v4.f1 G = f61Var.G(a6Var);
        if (G == null || (b10 = G.b()) == -1) {
            return;
        }
        int i10 = b10 - this.u0;
        sh.e eVar = this.n1;
        int i11 = 0;
        boolean z11 = eVar.b(i10) != null;
        if (z10 && z11 && (h2Var = this.b.a2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h2Var.getParentActivity(), this.a);
            String M0 = org.telegram.messenger.gd.M0(!this.d0 ? 2131751393 : 2131751391, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(!this.d0 ? 2131751392 : 2131751390, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new rm(this, view, a6Var, i11));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            u1Var.setOnCancelListener(new hh(view, i7));
            u1Var.show();
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                return;
            }
            return;
        }
        eVar.h(i10);
        f61Var.setItemAnimator(this.w);
        org.telegram.ui.l4 l4Var = this.r;
        l4Var.s(b10);
        int i12 = i10 + 1;
        CharSequence[] charSequenceArr = this.L;
        System.arraycopy(charSequenceArr, i12, charSequenceArr, i10, (charSequenceArr.length - 1) - i10);
        boolean[] zArr = this.M;
        System.arraycopy(zArr, i12, zArr, i10, (zArr.length - 1) - i10);
        charSequenceArr[charSequenceArr.length - 1] = null;
        zArr[zArr.length - 1] = false;
        int i13 = this.N - 1;
        this.N = i13;
        if (i13 == charSequenceArr.length - 1) {
            l4Var.i((this.u0 + charSequenceArr.length) - 1);
        }
        v4.f1 K = f61Var.K(b10 - 1);
        EditTextBoldCursor textView2 = a6Var.getTextView();
        if (K != null) {
            View view2 = K.a;
            if (view2 instanceof org.telegram.ui.Cells.a6) {
                ((org.telegram.ui.Cells.a6) view2).getTextView().requestFocus();
                textView2.clearFocus();
                Y();
                n0();
                inVar = this.y;
                if (inVar != null) {
                    inVar.f();
                    inVar.setDelegate(null);
                }
                l4Var.g(this.w0);
                l4Var.g(this.B0);
            }
        }
        if (textView2.isFocused()) {
            org.telegram.messenger.g0.v1(textView2);
            e0(true);
        } else if (this.i1) {
            e0(true);
        }
        textView2.clearFocus();
        Y();
        n0();
        inVar = this.y;
        if (inVar != null) {
        }
        l4Var.g(this.w0);
        l4Var.g(this.B0);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i7 != org.telegram.messenger.ks.w0) {
            if (i7 == org.telegram.messenger.ks.k4) {
                ry ryVar = this.F;
                if (ryVar != null) {
                    ryVar.Q.g1();
                }
                org.telegram.ui.Cells.a6 a6Var = this.h1;
                if (a6Var != null) {
                    int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                    this.h1.getEditField().setTextColor(-1);
                    this.h1.getEditField().setTextColor(currentTextColor);
                    return;
                }
                return;
            }
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (Map.Entry entry : this.R.b.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                entry.setValue(webPage);
            }
        }
        sh.e eVar = this.n1;
        int size = eVar.a.size();
        for (int i11 = 0; i11 < size; i11++) {
            sh.d dVar = (sh.d) eVar.a.get(i11);
            if (dVar instanceof th.e) {
                a0((th.e) dVar, true);
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.J) {
            int i7 = 0;
            if (this.b1) {
                ry ryVar = this.F;
                ryVar.Q.C0();
                ryVar.J.scrollTo(0, 0);
                ryVar.F(1);
                ryVar.R.h1(0, 0);
                this.F.t(false);
                if (z10) {
                    this.F.A();
                }
                this.i1 = false;
                k0(0);
            }
            if (z10) {
                ry ryVar2 = this.F;
                if (ryVar2 == null || ryVar2.getVisibility() != 0) {
                    f0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                ofFloat.addUpdateListener(new um(this, i7));
                this.g1 = true;
                ofFloat.addListener(new xm(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
                ofFloat.start();
            }
        }
    }

    public final void f0() {
        ry ryVar;
        yg emojiButton;
        if (!this.b1 && (ryVar = this.F) != null && ryVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.h1;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(wg.e, false);
            }
            this.F.setVisibility(8);
        }
        int i7 = this.c1;
        this.c1 = 0;
        if (i7 != 0) {
            this.G.a();
        }
    }

    public final void g0(int i7) {
        this.m1 = i7;
        org.telegram.ui.ActionBar.h2 h2Var = this.b.a2;
        this.n1.b(i7);
        this.l1 = i0(h2Var, (i7 == -2 || i7 == -3) ? 74 : 41026, new qm(this, i7, 0), new lg(this, 29));
    }

    @Override // org.telegram.ui.Components.ki
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(70.0f);
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        View childAt;
        org.telegram.ui.f61 f61Var = this.s;
        if (f61Var.getChildCount() <= 1 || (childAt = f61Var.getChildAt(1)) == null) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View F = f61Var.F(childAt);
        kj0 kj0Var = (kj0) (F == null ? null : f61Var.T(F));
        int y10 = (((int) childAt.getY()) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(20.0f);
        int i7 = (y10 <= 0 || kj0Var == null || kj0Var.b() != 1) ? 0 : y10;
        if (y10 < 0 || kj0Var == null || kj0Var.b() != 1) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.c1;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(17.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return this.S0;
    }

    @Override // org.telegram.ui.Components.ki
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        org.telegram.ui.f61 f61Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 16, new Class[]{jn.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.a7));
        int i10 = org.telegram.ui.ActionBar.n6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 262144, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        int i12 = org.telegram.ui.ActionBar.n6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        int i13 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 32, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Cells.a6 a6Var = this.h1;
        if (a6Var != null) {
            this.G.e = true;
            EditTextBoldCursor editField = a6Var.getEditField();
            editField.requestFocus();
            org.telegram.messenger.g0.I3(editField);
        }
        k0(org.telegram.messenger.g0.D ? 0 : 2);
        if (org.telegram.messenger.g0.D || this.f1 || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.H = true;
        gk gkVar = this.V0;
        org.telegram.messenger.g0.r(gkVar);
        org.telegram.messenger.g0.h3(gkVar, 100L);
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean i() {
        return this.Y0;
    }

    @Override // org.telegram.ui.Components.ki
    public final int j() {
        return 1;
    }

    public final void j0(int i7, sh.d dVar) {
        int i10;
        sh.e eVar = this.n1;
        if (dVar != null) {
            eVar.a.put(i7, dVar);
        } else {
            eVar.a.remove(i7);
        }
        if (i7 == -2) {
            i10 = this.o0;
        } else if (i7 == -3) {
            i10 = this.q0;
        } else {
            int i11 = this.u0;
            i10 = (i11 < 0 || i7 < 0 || i7 >= this.N) ? -1 : i7 + i11;
        }
        if (i10 >= 0) {
            v4.f1 K = this.s.K(i10);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.a6) {
                    ((org.telegram.ui.Cells.a6) view).e.b(dVar, true);
                }
            }
            this.r.g(i10);
        }
        if (dVar instanceof th.e) {
            th.e eVar2 = (th.e) dVar;
            String str = eVar2.b;
            bi.m6 m6Var = new bi.m6(18, this, dVar);
            sh.p pVar = this.R;
            HashMap hashMap = pVar.c;
            HashMap hashMap2 = pVar.b;
            if (hashMap2.containsKey(str)) {
                m6Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(m6Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(pVar.a).sendRequestTyped(getwebpagepreview, new d3.b(1), new org.telegram.ui.Wallet.e0(8, pVar, str));
                }
            }
            a0(eVar2, false);
        }
        Y();
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean k() {
        if (!this.b1) {
            return !X();
        }
        e0(true);
        return true;
    }

    public final void k0(int i7) {
        yg emojiButton;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.J) {
            hi.p3 p3Var = this.G;
            si siVar = this.b;
            int i10 = 1;
            if (i7 != 1) {
                org.telegram.ui.Cells.a6 a6Var2 = this.h1;
                emojiButton = a6Var2 != null ? a6Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(wg.e, true);
                }
                ry ryVar = this.F;
                if (ryVar != null) {
                    this.b1 = false;
                    this.i1 = false;
                    if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        ryVar.setVisibility(8);
                    }
                }
                if (i7 == 0) {
                    this.c1 = 0;
                }
                p3Var.a();
                siVar.p3.requestLayout();
                return;
            }
            ry ryVar2 = this.F;
            boolean z10 = ryVar2 != null && ryVar2.getVisibility() == 0;
            ry ryVar3 = this.F;
            if (ryVar3 != null && ryVar3.d1 != org.telegram.messenger.j10.t0) {
                siVar.p3.removeView(ryVar3);
                this.F = null;
            }
            if (this.F == null) {
                ry ryVar4 = new ry(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                this.F = ryVar4;
                ryVar4.c = 3;
                ryVar4.x0 = false;
                ryVar4.y2 = false;
                ryVar4.setShouldDrawBackground(false);
                ry ryVar5 = this.F;
                ryVar5.V0 = false;
                ryVar5.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.F.setForseMultiwindowLayout(true);
                }
                this.F.setDelegate(new wm(this));
                siVar.p3.addView(this.F);
                this.F.setBottomInset(org.telegram.messenger.g0.n);
            }
            this.F.setVisibility(0);
            this.b1 = true;
            ry ryVar6 = this.F;
            if (this.d1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.d1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.d1 = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.e1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.e1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.e1 = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int i11 = point.x > point.y ? this.e1 : this.d1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ryVar6.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.n + i11;
            ryVar6.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (a6Var = this.h1) != null) {
                org.telegram.messenger.g0.v1(a6Var.getEditField());
            }
            this.c1 = i11;
            p3Var.a();
            siVar.p3.requestLayout();
            org.telegram.ui.Cells.a6 a6Var3 = this.h1;
            emojiButton = a6Var3 != null ? a6Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(wg.d, true);
            }
            if (z10 || this.f1) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c1, 0.0f);
            ofFloat.addUpdateListener(new um(this, i10));
            ofFloat.addListener(new xm(this, i10));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
            ofFloat.start();
        }
    }

    public final void l0(int i7, org.telegram.messenger.y10 y10Var, int i10, int i11) {
        y60 G = y60.G(this, null, new View(getContext()));
        G.s = 0;
        G.t = false;
        G.c(R.drawable.msg_replace, org.telegram.messenger.gd.M0(2131746076, null), new sm(this, i7, 1), false);
        G.c(R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751587, null), new sm(this, i7, 2), true);
        wk0 wk0Var = new wk0(getContext(), this.a);
        G.p = new org.telegram.ui.fe(wk0Var, 1);
        G.V = org.telegram.messenger.g0.L(185.0f);
        G.Z();
        wk0Var.e(G);
        Drawable drawable = (Drawable) y10Var.a(wk0Var.s);
        fh.g c10 = wk0Var.n.c(null, null, false);
        c10.p(c8.i0.l(wk0Var.b));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.e = true;
        c10.r(org.telegram.messenger.g0.L(16.0f));
        wk0Var.G = c10;
        wk0Var.F = drawable;
        Point point = org.telegram.messenger.g0.q;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c10.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i14, org.telegram.messenger.g0.L(8.0f) + i15);
        wk0Var.F.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) wk0Var.y.getLayoutParams()).gravity = 1;
        wk0Var.M = true;
        wk0Var.show();
    }

    public final void m0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.N6, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.k7, i6Var);
            if (w02 == this.q1 && w03 == this.r1) {
                return;
            }
            this.q1 = w02;
            this.r1 = w03;
            Drawable drawable = this.o1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            Drawable drawable2 = this.p1;
            if (drawable2 != null) {
                drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.f61 f61Var = this.s;
            if (f61Var != null) {
                for (int i7 = 0; i7 < f61Var.getChildCount(); i7++) {
                    View childAt = f61Var.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.m8) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void n0() {
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
        bg.w0 w0Var = this.N0;
        w0Var.b = -1;
        bg.w0 w0Var2 = this.O0;
        w0Var2.b = -1;
        this.M0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.v0 = -1;
        this.u0 = -1;
        this.y0 = -1;
        this.o0 = -1;
        this.m0 = 1;
        this.R0 = 3;
        this.n0 = 2;
        boolean z10 = this.n;
        if (!z10) {
            this.R0 = 4;
            this.o0 = 3;
        }
        int i7 = this.R0;
        int i10 = i7 + 1;
        this.s0 = i7;
        int i11 = i7 + 2;
        this.R0 = i11;
        this.t0 = i10;
        int i12 = this.N;
        if (i12 != 0) {
            this.u0 = i11;
            this.R0 = i11 + i12;
        }
        if (i12 != this.L.length) {
            int i13 = this.R0;
            this.R0 = i13 + 1;
            this.v0 = i13;
        }
        int i14 = this.R0;
        this.w0 = i14;
        int i15 = i14 + 2;
        this.R0 = i15;
        this.x0 = i14 + 1;
        if (z10) {
            int i16 = i14 + 3;
            this.R0 = i16;
            this.A0 = i15;
            if (this.h0) {
                this.R0 = i14 + 4;
                this.z0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.bn) this.b.a2).e;
            boolean z11 = org.telegram.messenger.v3.T(chat) && !chat.megagroup;
            if (z11) {
                this.b0 = true;
            } else {
                int i17 = this.R0;
                this.R0 = i17 + 1;
                this.C0 = i17;
            }
            int i18 = this.R0;
            int i19 = i18 + 1;
            this.R0 = i19;
            this.G0 = i18;
            if (z11) {
                this.U = false;
            } else {
                this.R0 = i18 + 2;
                this.D0 = i19;
            }
            int i20 = this.R0;
            this.E0 = i20;
            this.F0 = i20 + 1;
            int i21 = i20 + 3;
            this.R0 = i21;
            this.H0 = i20 + 2;
            if (z11) {
                w0Var.b = i21;
                int i22 = i20 + 5;
                this.R0 = i22;
                w0Var2.b = i20 + 4;
                if (w0Var2.a) {
                    this.R0 = i20 + 6;
                    this.M0 = i22;
                }
            }
            int i23 = this.R0;
            int i24 = i23 + 1;
            this.R0 = i24;
            this.I0 = i23;
            if (this.V != 0 || this.W != 0) {
                this.J0 = i24;
                this.K0 = i23 + 2;
                this.R0 = i23 + 4;
                this.L0 = i23 + 3;
            }
            int i25 = this.R0;
            int i26 = i25 + 1;
            this.R0 = i26;
            this.y0 = i25;
            if (this.d0) {
                this.p0 = i26;
                this.q0 = i25 + 2;
                this.R0 = i25 + 4;
                this.r0 = i25 + 3;
            }
        }
        int i27 = this.R0;
        this.R0 = i27 + 1;
        this.B0 = i27;
    }

    @Override // org.telegram.ui.Components.ki
    public final void p() {
        this.I = true;
        si siVar = this.b;
        org.telegram.messenger.ks.f(siVar.H3).n(this, org.telegram.messenger.ks.w0);
        if (this.J) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k4);
            ry ryVar = this.F;
            if (ryVar != null) {
                siVar.p3.removeView(ryVar);
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

    @Override // org.telegram.ui.Components.ki
    public final boolean s() {
        return X();
    }

    public void setDelegate(qn qnVar) {
        this.k0 = qnVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.ki
    public final void t() {
        this.b.M1();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.k1.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Yl, this.a));
            m0();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void v(float f10) {
        this.b.M1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v31 */
    @Override // org.telegram.ui.Components.ki
    public final void w(int i7) {
        int i10;
        if (i7 != 40) {
            return;
        }
        boolean z10 = this.n;
        int i11 = 0;
        int i12 = 1;
        si siVar = this.b;
        CharSequence[] charSequenceArr = this.L;
        if (z10) {
            CharSequence[] charSequenceArr2 = {d0(this.O)};
            int i13 = siVar.H3;
            ArrayList<TLRPC.MessageEntity> Y = org.telegram.messenger.ri.d0(i13).Y(charSequenceArr2, true, true);
            CharSequence charSequence = charSequenceArr2[0];
            if (Y != null) {
                int size = Y.size();
                for (int i14 = 0; i14 < size; i14++) {
                    TLRPC.MessageEntity messageEntity = Y.get(i14);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
            }
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
            TLRPC.TodoList todoList = new TLRPC.TodoList();
            tL_messageMediaToDo.todo = todoList;
            boolean z11 = this.h0;
            todoList.others_can_append = z11 && this.g0;
            todoList.others_can_complete = z11;
            todoList.title = new TLRPC.TL_textWithEntities();
            tL_messageMediaToDo.todo.title.text = charSequence.toString();
            tL_messageMediaToDo.todo.title.entities = Y;
            for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                if (!TextUtils.isEmpty(d0(charSequenceArr[i15]))) {
                    CharSequence[] charSequenceArr3 = {d0(charSequenceArr[i15])};
                    ArrayList<TLRPC.MessageEntity> Y2 = org.telegram.messenger.ri.d0(i13).Y(charSequenceArr3, true, true);
                    CharSequence charSequence2 = charSequenceArr3[0];
                    if (Y2 != null) {
                        int size2 = Y2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            TLRPC.MessageEntity messageEntity2 = Y2.get(i16);
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
            b5.X(i13, siVar.Y0() + 1, siVar.c1(), new bi.j(this, (org.telegram.ui.bn) siVar.a2, tL_messageMediaToDo, 12));
            return;
        }
        boolean z12 = this.d0;
        org.telegram.ui.f61 f61Var = this.s;
        boolean[] zArr = this.M;
        if (z12 && !this.Y0) {
            int i17 = 0;
            while (i11 < zArr.length) {
                if (!TextUtils.isEmpty(d0(charSequenceArr[i11])) && zArr[i11]) {
                    i17++;
                }
                i11++;
            }
            if (i17 <= 0) {
                for (int i18 = this.u0; i18 < this.u0 + this.N; i18++) {
                    v4.f1 K = f61Var.K(i18);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.a6) {
                            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                            if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                in inVar = this.y;
                                if (inVar != null) {
                                    inVar.f();
                                }
                                String M0 = org.telegram.messenger.gd.M0(2131746962, null);
                                j30 j30Var = this.E;
                                j30Var.setText(M0);
                                j30Var.c(a6Var.getCheckBox());
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
        int i19 = 0;
        while (true) {
            int length = charSequenceArr.length;
            sh.e eVar = this.n1;
            if (i19 >= length) {
                CharSequence[] charSequenceArr4 = {d0(this.O)};
                int i20 = siVar.H3;
                ArrayList<TLRPC.MessageEntity> Y3 = org.telegram.messenger.ri.d0(i20).Y(charSequenceArr4, true, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                if (Y3 != null) {
                    int size3 = Y3.size();
                    for (int i21 = 0; i21 < size3; i21++) {
                        TLRPC.MessageEntity messageEntity3 = Y3.get(i21);
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
                int i22 = this.V;
                if (i22 != 0) {
                    poll2.hide_results_until_close = this.a0;
                    poll2.close_period = i22;
                    poll2.flags |= 16;
                } else {
                    int i23 = this.W;
                    if (i23 != 0) {
                        poll2.hide_results_until_close = this.a0;
                        poll2.close_date = i23;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = Y3;
                ArrayList arrayList2 = new ArrayList(this.K);
                int i24 = 0;
                while (i24 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(d0(charSequenceArr[i24]))) {
                        eVar.h(tL_messageMediaPoll.poll.answers.size());
                        i10 = i11;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[i12];
                        charSequenceArr5[i11] = d0(charSequenceArr[i24]);
                        ArrayList<TLRPC.MessageEntity> Y4 = org.telegram.messenger.ri.d0(i20).Y(charSequenceArr5, i12, i12);
                        CharSequence charSequence4 = charSequenceArr5[i11];
                        if (Y4 != null) {
                            int size4 = Y4.size();
                            int i25 = i11;
                            while (i25 < size4) {
                                TLRPC.MessageEntity messageEntity4 = Y4.get(i25);
                                int i26 = i11;
                                if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                    messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                }
                                i25++;
                                i11 = i26;
                            }
                        }
                        i10 = i11;
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = Y4;
                        byte[] bArr = new byte[1];
                        tL_pollAnswer.option = bArr;
                        bArr[i10] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                        if ((this.c0 || this.d0) && zArr[i24]) {
                            arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i24++;
                    i11 = i10;
                    i12 = 1;
                }
                int i27 = i11;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence d02 = d0(this.Q);
                if (d02 != null) {
                    tL_messageMediaPoll.results.solution = d02.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i27] = d02;
                    ArrayList<TLRPC.MessageEntity> Y5 = org.telegram.messenger.ri.d0(i20).Y(charSequenceArr6, true, true);
                    if (Y5 != null && !Y5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = Y5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                b5.X(i20, siVar.Y0() + 1, siVar.c1(), new bi.i2(this, (org.telegram.ui.bn) siVar.a2, tL_messageMediaPoll, arrayList2, 9));
                return;
            }
            if (TextUtils.isEmpty(d0(charSequenceArr[i19])) && eVar.b(i19) != null) {
                this.W0 = true;
                this.X0 = i19;
                f61Var.y0(this.u0 + i19);
                return;
            }
            i19++;
        }
    }
}
