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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class an extends th implements org.telegram.ui.ActionBar.z5, pt0, org.telegram.messenger.cs {
    public static final /* synthetic */ int s1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final u20 E;
    public int E0;
    public ey F;
    public int F0;
    public final gi.p3 G;
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
    public final cg.v0 N0;
    public Editable O;
    public final cg.v0 O0;
    public Editable P;
    public final cg.v0[] P0;
    public Editable Q;
    public final ArrayList Q0;
    public final th.o R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final mi.b0 V0;
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
    public org.telegram.ui.Cells.z5 h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public zm k0;
    public final Paint k1;
    public int l0;
    public ei.x2 l1;
    public int m0;
    public int m1;
    public final boolean n;
    public int n0;
    public final th.d n1;
    public int o0;
    public Drawable o1;
    public int p0;
    public Drawable p1;
    public int q0;
    public int q1;
    public final org.telegram.ui.n4 r;
    public int r0;
    public int r1;
    public final org.telegram.ui.u51 s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final pm w;
    public int w0;
    public final lg.d0 x;
    public int x0;
    public final rm y;
    public int y0;
    public int z0;

    public an(bi biVar, Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, Boolean bool) {
        super(context, e6Var, biVar);
        int i3 = 1;
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.c0 = true;
        this.g0 = true;
        this.h0 = true;
        this.l0 = -1;
        cg.v0 v0Var = new cg.v0(this);
        this.N0 = v0Var;
        cg.v0 v0Var2 = new cg.v0(this);
        this.O0 = v0Var2;
        this.P0 = new cg.v0[]{v0Var, v0Var2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new mi.b0(this, 28);
        this.W0 = false;
        this.X0 = -1;
        this.i1 = false;
        this.j1 = false;
        Paint paint = new Paint(1);
        this.k1 = paint;
        this.n1 = new th.d();
        this.n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean q10 = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(this.b.E3).a).q();
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
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vl, this.a));
        this.b.m3.setDelegate(this);
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(i3, this, context);
        this.r = n4Var;
        int i10 = 5;
        org.telegram.ui.u51 u51Var = new org.telegram.ui.u51(i10, context, null);
        this.s = u51Var;
        setBlur3Capture(u51Var);
        this.d = u51Var;
        this.h = true;
        this.f = true;
        pm pmVar = new pm(this);
        this.w = pmVar;
        u51Var.setItemAnimator(pmVar);
        arrayList.clear();
        pmVar.m = false;
        pmVar.C = false;
        pmVar.o(xq.h);
        pmVar.n(350L);
        u51Var.setClipToPadding(false);
        u51Var.setVerticalScrollBarEnabled(false);
        u51Var.setSections(true);
        int i11 = 4;
        lg.d0 d0Var = new lg.d0(this, org.telegram.messenger.g0.L(65.0f) + org.telegram.messenger.g0.m, u51Var, i11);
        this.x = d0Var;
        u51Var.setLayoutManager(d0Var);
        d0Var.O = true;
        new u4.y(new fi.c(this, i11)).h(u51Var);
        addView(u51Var, b8.mf.e(-1, -1, 51));
        u51Var.setPreserveFocusAfterLayout(true);
        u51Var.setAdapter(n4Var);
        u51Var.setOnItemClickListener(new fm(this, e6Var, biVar, context));
        u51Var.setOnScrollListener(new ji(this, i10));
        u20 u20Var = new u20(context, 4);
        this.E = u20Var;
        u20Var.setAlpha(0.0f);
        u20Var.setVisibility(4);
        addView(u20Var, b8.mf.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.b.E3).x7.J.b).c;
        this.R = new th.o(this.b.E3);
        org.telegram.messenger.hs.f(this.b.E3).c(this, org.telegram.messenger.hs.w0);
        if (q10) {
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
            rm rmVar = new rm(context, this.b.E3, null, e6Var);
            this.y = rmVar;
            rmVar.E = true;
            rmVar.F = true;
            rmVar.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            addView(rmVar, b8.mf.e(-2, org.telegram.messenger.hs.q2, 51));
        }
        this.G = new gi.p3(this.b.m3, false, null);
        X();
    }

    public static void O(an anVar, int i3) {
        u20 u20Var = anVar.E;
        u4.d1 K = anVar.s.K(anVar.u0 + i3);
        if (K != null) {
            View view = K.a;
            if (view instanceof org.telegram.ui.Cells.z5) {
                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                    rm rmVar = anVar.y;
                    if (rmVar != null) {
                        rmVar.f();
                    }
                    u20Var.setText(org.telegram.messenger.bd.M0(2131747190, null));
                    u20Var.c(z5Var.getCheckBox());
                    ImageView imageView = u20Var.b;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.g0.L(48.0f));
                    u20Var.setTranslationY(u20Var.getTranslationY() + org.telegram.messenger.g0.L(10.0f));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void P(an anVar, View view, int i3) {
        int i10;
        int length;
        int i11;
        int i12;
        int length2;
        float f10;
        boolean z10 = anVar.n;
        if (!(view instanceof org.telegram.ui.Cells.z5)) {
            return;
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
        if (i3 == anVar.o0) {
            i12 = anVar.T0;
            Editable editable = anVar.P;
            if (editable != null) {
                length2 = editable.length();
                i11 = i12 - length2;
                f10 = i12;
                if (i11 > f10 - (0.7f * f10)) {
                    z5Var.setText2("");
                    return;
                }
                z5Var.setText2(String.format("%d", Integer.valueOf(i11)));
                org.telegram.ui.ActionBar.k5 textView2 = z5Var.getTextView2();
                int i13 = i11 < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.A6;
                org.telegram.ui.ActionBar.r6.Y(textView2, i13, anVar.a);
                textView2.setTag(Integer.valueOf(i13));
                return;
            }
            length2 = 0;
            i11 = i12 - length2;
            f10 = i12;
            if (i11 > f10 - (0.7f * f10)) {
            }
        } else if (i3 == anVar.n0) {
            i12 = z10 ? anVar.getMessagesController().S6 : org.telegram.messenger.hs.e4;
            Editable editable2 = anVar.O;
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
            if (i3 == anVar.q0) {
                Editable editable3 = anVar.Q;
                int length3 = editable3 != null ? editable3.length() : 0;
                i10 = org.telegram.messenger.hs.e3;
                length = 200 - length3;
            } else {
                int i14 = anVar.u0;
                if (i3 < i14 || i3 >= anVar.N + i14) {
                    return;
                }
                int i15 = i3 - i14;
                i10 = z10 ? anVar.getMessagesController().T6 : 100;
                CharSequence charSequence = anVar.L[i15];
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

    public static void Q(an anVar, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        if (anVar.J && z10) {
            if (anVar.h1 == z5Var && anVar.b1 && anVar.i1) {
                anVar.b0();
                anVar.b1 = false;
            }
            org.telegram.ui.Cells.z5 z5Var2 = anVar.h1;
            anVar.h1 = z5Var;
            z5Var.setEmojiButtonVisibility(true);
            hg emojiButton = z5Var.getEmojiButton();
            fg fgVar = fg.e;
            emojiButton.j(fgVar, false);
            org.telegram.ui.u51 u51Var = anVar.s;
            View F = u51Var.F(z5Var);
            u4.d1 T = F == null ? null : u51Var.T(F);
            rm rmVar = anVar.y;
            if (rmVar != null) {
                rmVar.f();
                if (T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.z5) && rmVar.getDelegate() != view) {
                        rmVar.setDelegate((org.telegram.ui.Cells.z5) view);
                    }
                }
            }
            if (z5Var2 == null || z5Var2 == z5Var) {
                return;
            }
            if (anVar.b1) {
                anVar.b0();
                anVar.e0(false);
                anVar.h0();
            }
            z5Var2.setEmojiButtonVisibility(false);
            z5Var2.getEmojiButton().j(fgVar, false);
        }
    }

    public static void R(an anVar, org.telegram.ui.Cells.z5 z5Var) {
        anVar.h1 = z5Var;
        if (!anVar.b1) {
            anVar.k0(1);
        } else {
            anVar.b0();
            anVar.h0();
        }
    }

    public static void S(an anVar, int i3) {
        bi biVar;
        org.telegram.ui.ActionBar.d2 d2Var;
        th.d dVar = anVar.n1;
        if (dVar.b(i3) == null) {
            anVar.g0(i3);
            return;
        }
        th.c b10 = dVar.b(i3);
        if (b10 == null || (biVar = anVar.b) == null || (d2Var = biVar.X1) == null) {
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        if (b10 instanceof uh.d) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((uh.d) b10).b);
            PhotoViewer.v1().N2(parentActivity, null, null);
            PhotoViewer.v1().j2(arrayList, 0, 14, false, new im(anVar, i3), null);
            return;
        }
        if (b10 instanceof uh.h) {
            uh.h hVar = (uh.h) b10;
            org.telegram.ui.is.p().v(parentActivity);
            org.telegram.ui.is p10 = org.telegram.ui.is.p();
            km kmVar = new km();
            kmVar.b = anVar;
            kmVar.a = i3;
            p10.u(kmVar);
            org.telegram.ui.is p11 = org.telegram.ui.is.p();
            TLRPC.Document document = hVar.b;
            p11.s(document, null, "", null, null, org.telegram.messenger.zi.I2(document) ? 2 : 0, false, hVar.c, anVar.a, org.telegram.messenger.hs.e3);
            return;
        }
        if (b10 instanceof uh.c) {
            uh.c cVar = (uh.c) b10;
            anVar.l0(i3, new org.telegram.ui.bf(1, cVar.d, org.telegram.messenger.g0.i0(cVar.e, true, true) + " " + cVar.f), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
            return;
        }
        if (b10 instanceof uh.g) {
            uh.g gVar = (uh.g) b10;
            TLRPC.Document F0 = gVar.b.F0();
            anVar.l0(i3, new gi.s4(org.telegram.messenger.zi.y1(F0), org.telegram.messenger.zi.w1(F0) + " - " + org.telegram.messenger.bd.R((int) org.telegram.messenger.zi.H0(F0)), gVar, 2), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
            return;
        }
        if (b10 instanceof uh.f) {
            anVar.l0(i3, new di((uh.f) b10, 1), org.telegram.messenger.g0.L(300.0f), (org.telegram.messenger.g0.L(300.0f) * 9) / 16);
        } else if (!(b10 instanceof uh.e)) {
            anVar.g0(i3);
        } else {
            uh.e eVar = (uh.e) b10;
            t4.f0(anVar.getContext(), anVar.a, eVar.b, eVar.n, new bm(anVar, i3, 1), new cm(anVar, i3, 0));
        }
    }

    public static CharSequence d0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence n12 = org.telegram.messenger.g0.n1(charSequence);
        while (TextUtils.indexOf(n12, "\n\n\n") >= 0) {
            n12 = TextUtils.replace(n12, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(n12, "\n\n\n") == 0) {
            n12 = TextUtils.replace(n12, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return n12;
    }

    private int getAnswersMaxCount() {
        return this.n ? getMessagesController().R6 : ((org.telegram.messenger.j0) getMessagesController().x7.G.b).c;
    }

    private int getCurrentAccount() {
        bi biVar = this.b;
        return biVar != null ? biVar.E3 : org.telegram.messenger.h10.t0;
    }

    private org.telegram.messenger.hp getMessagesController() {
        return org.telegram.messenger.hp.s1(getCurrentAccount());
    }

    public static ei.x2 i0(org.telegram.ui.ActionBar.d2 d2Var, int i3, org.telegram.messenger.u10 u10Var, vf vfVar) {
        if (d2Var == null) {
            return null;
        }
        ei.x2 x2Var = new ei.x2(d2Var.getContext(), d2Var, d2Var.getResourceProvider(), vfVar);
        x2Var.U3 = new mm(x2Var, u10Var, d2Var);
        x2Var.V3 = new nm(u10Var, x2Var);
        x2Var.b2.i0();
        x2Var.y1(1, true);
        x2Var.V0(i3);
        x2Var.r4 = new dm(u10Var);
        x2Var.P1 = new om(x2Var, u10Var, d2Var);
        x2Var.Q1 = new org.telegram.ui.jo(21, u10Var, x2Var);
        x2Var.e1();
        x2Var.A0(true);
        x2Var.show();
        return x2Var;
    }

    @Override // org.telegram.ui.Components.th
    public final void A() {
        org.telegram.ui.n4 n4Var = this.r;
        if (n4Var != null) {
            n4Var.f();
        }
        if (this.J) {
            e0(false);
            rm rmVar = this.y;
            if (rmVar != null) {
                rmVar.f();
            }
            org.telegram.ui.Cells.z5 z5Var = this.h1;
            if (z5Var != null) {
                z5Var.setEmojiButtonVisibility(false);
                this.h1.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.h1.getEditField());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
        int L;
        int i11;
        bi biVar = this.b;
        if (biVar.m3.Q() > org.telegram.messenger.g0.L(20.0f) || this.b1 || this.g1 || this.i1) {
            L = org.telegram.messenger.g0.L(52.0f);
            biVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(13.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    biVar.r0 = this.i0;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(13.0f);
            if (L < 0) {
            }
            biVar.r0 = this.i0;
        }
        int i12 = L + org.telegram.messenger.g0.m;
        this.j0 = true;
        int i13 = this.S0;
        org.telegram.ui.u51 u51Var = this.s;
        if (i13 != i12 || u51Var.getPaddingBottom() != this.e) {
            this.S0 = i12;
            u51Var.q1(0, 0, 0, this.e);
            u51Var.setItemAnimator(null);
            this.r.g(0);
        }
        this.j0 = false;
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        bi biVar = this.b;
        try {
            biVar.S2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131744064, null));
        } else if (this.f0) {
            biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131748272, null));
        } else {
            biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131748273, null));
        }
        biVar.L1();
        this.x.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        this.s.y0(1);
    }

    @Override // org.telegram.ui.Components.pt0
    public final void K(int i3, boolean z10) {
        boolean z11;
        if (this.J) {
            if (i3 > org.telegram.messenger.g0.L(50.0f) && this.f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.e1 = i3;
                    org.telegram.messenger.hp.d1().edit().putInt("kbd_height_land3", this.e1).commit();
                } else {
                    this.d1 = i3;
                    org.telegram.messenger.hp.d1().edit().putInt("kbd_height", this.d1).commit();
                }
            }
            boolean z12 = this.b1;
            bi biVar = this.b;
            gi.p3 p3Var = this.G;
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
                    biVar.m3.requestLayout();
                    boolean z13 = this.j1;
                    if (z13 != this.i1) {
                        U(z13 ? -org.telegram.messenger.g0.L(120.0f) : org.telegram.messenger.g0.L(120.0f));
                    }
                    this.j1 = this.i1;
                }
            }
            if (this.Z0 == i3 && this.a1 == z10) {
                return;
            }
            this.Z0 = i3;
            this.a1 = z10;
            boolean z14 = this.f1;
            org.telegram.ui.Cells.z5 z5Var = this.h1;
            if (z5Var != null) {
                this.f1 = z5Var.getEditField().isFocused() && p3Var.c() && i3 > 0;
            } else {
                this.f1 = false;
            }
            if (this.f1 && this.b1) {
                k0(0);
            }
            if (this.c1 != 0 && !(z11 = this.f1) && z11 != z14 && !this.b1) {
                this.c1 = 0;
                p3Var.a();
                biVar.m3.requestLayout();
            }
            if (this.f1 && this.H) {
                this.H = false;
                org.telegram.messenger.g0.r(this.V0);
            }
        }
    }

    public final void T() {
        rm rmVar = this.y;
        if (rmVar != null) {
            rmVar.setDelegate(null);
            rmVar.f();
        }
        this.s.setItemAnimator(this.w);
        int i3 = this.N;
        this.M[i3] = false;
        int i10 = i3 + 1;
        this.N = i10;
        int length = this.L.length;
        org.telegram.ui.n4 n4Var = this.r;
        if (i10 == length) {
            n4Var.s(this.v0);
        }
        n4Var.i(this.v0);
        n0();
        this.l0 = (this.u0 + this.N) - 1;
        n4Var.g(this.w0);
        n4Var.g(this.B0);
    }

    public final void U(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.of(this, f10, 2));
        ofFloat.addListener(new hm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.w);
        ofFloat.start();
    }

    public final void V() {
        boolean z10 = (this.d0 || this.b0) ? false : true;
        if (!z10) {
            this.U = false;
        }
        int i3 = this.D0;
        if (i3 < 0) {
            return;
        }
        u4.d1 K = this.s.K(i3);
        if (K == null) {
            this.r.g(this.D0);
            return;
        }
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) K.a;
        if (!z10) {
            x5Var.setChecked(false);
        }
        x5Var.getCheckBox().a.a(!z10, true);
    }

    public final boolean W() {
        boolean z10 = TextUtils.isEmpty(d0(this.O)) && TextUtils.isEmpty(d0(this.P)) && TextUtils.isEmpty(d0(this.Q)) && this.n1.a.size() == 0;
        if (z10) {
            for (int i3 = 0; i3 < this.N && (z10 = TextUtils.isEmpty(d0(this.L[i3]))); i3++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.X1.getParentActivity());
            boolean z11 = this.n;
            String M0 = org.telegram.messenger.bd.M0(z11 ? 2131752567 : 2131752573, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(z11 ? 2131752568 : 2131752574, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new t(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            alertDialog$Builder.p();
        }
        return z10;
    }

    public final void X() {
        int i3;
        boolean z10 = this.d0;
        CharSequence[] charSequenceArr = this.L;
        if (z10) {
            int i10 = 0;
            i3 = 0;
            while (true) {
                boolean[] zArr = this.M;
                if (i10 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(d0(charSequenceArr[i10])) && zArr[i10]) {
                    i3++;
                }
                i10++;
            }
        } else {
            i3 = 0;
        }
        boolean z11 = this.n;
        int i11 = z11 ? getMessagesController().S6 : org.telegram.messenger.hs.e4;
        int i12 = z11 ? getMessagesController().T6 : 100;
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
        if (i14 < 1 || (this.d0 && i3 < 1)) {
            z12 = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z13 && this.n1.a.size() <= 0) {
            this.i0 = true;
        } else {
            this.i0 = false;
        }
        boolean z14 = this.i0;
        bi biVar = this.b;
        biVar.r0 = z14;
        this.Y0 = z12;
        biVar.L1();
    }

    public final void Z(org.telegram.ui.Cells.l8 l8Var, boolean z10) {
        if (this.W != 0) {
            l8Var.q(org.telegram.messenger.bd.M0(2131747138, null), org.telegram.messenger.bd.Q(this.W), z10, false);
        } else if (this.V != 0) {
            l8Var.q(org.telegram.messenger.bd.M0(2131747140, null), org.telegram.messenger.bd.G(this.V / 3600, "Hours", new Object[0]), z10, false);
        } else {
            l8Var.q(org.telegram.messenger.bd.M0(2131747138, null), null, z10, false);
        }
    }

    public final void a0(uh.e eVar, boolean z10) {
        TLRPC.Photo photo;
        String str = eVar.b;
        th.o oVar = this.R;
        boolean containsKey = oVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) oVar.b.get(eVar.b);
        qe.a aVar = eVar.s;
        ImageReceiver imageReceiver = eVar.a;
        eVar.r.a(containsKey || (webPage instanceof TLRPC.TL_webPagePending), z10);
        eVar.n = webPage;
        if (webPage == null || (photo = webPage.photo) == null) {
            aVar.a(false, z10);
            imageReceiver.f();
        } else {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, false, null, false);
            imageReceiver.r0(org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), "48_48", org.telegram.messenger.ac.f(w10, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            aVar.a(true, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
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
            U(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(View view, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int b10;
        rm rmVar;
        org.telegram.ui.ActionBar.d2 d2Var;
        if (view.getTag() != null) {
            return;
        }
        int i3 = 1;
        view.setTag(1);
        org.telegram.ui.u51 u51Var = this.s;
        u4.d1 G = u51Var.G(z5Var);
        if (G == null || (b10 = G.b()) == -1) {
            return;
        }
        int i10 = b10 - this.u0;
        th.d dVar = this.n1;
        boolean z11 = dVar.b(i10) != null;
        if (z10 && z11 && (d2Var = this.b.X1) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), this.a);
            String M0 = org.telegram.messenger.bd.M0(!this.d0 ? 2131751405 : 2131751403, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(!this.d0 ? 2131751404 : 2131751402, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new aa.a(this, view, z5Var, 29));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s1Var.setOnCancelListener(new qg(view, i3));
            s1Var.show();
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        dVar.h(i10);
        u51Var.setItemAnimator(this.w);
        org.telegram.ui.n4 n4Var = this.r;
        n4Var.s(b10);
        int i11 = i10 + 1;
        CharSequence[] charSequenceArr = this.L;
        System.arraycopy(charSequenceArr, i11, charSequenceArr, i10, (charSequenceArr.length - 1) - i10);
        boolean[] zArr = this.M;
        System.arraycopy(zArr, i11, zArr, i10, (zArr.length - 1) - i10);
        charSequenceArr[charSequenceArr.length - 1] = null;
        zArr[zArr.length - 1] = false;
        int i12 = this.N - 1;
        this.N = i12;
        if (i12 == charSequenceArr.length - 1) {
            n4Var.i((this.u0 + charSequenceArr.length) - 1);
        }
        u4.d1 K = u51Var.K(b10 - 1);
        EditTextBoldCursor textView2 = z5Var.getTextView();
        if (K != null) {
            View view2 = K.a;
            if (view2 instanceof org.telegram.ui.Cells.z5) {
                ((org.telegram.ui.Cells.z5) view2).getTextView().requestFocus();
                textView2.clearFocus();
                X();
                n0();
                rmVar = this.y;
                if (rmVar != null) {
                    rmVar.f();
                    rmVar.setDelegate(null);
                }
                n4Var.g(this.w0);
                n4Var.g(this.B0);
            }
        }
        if (textView2.isFocused()) {
            org.telegram.messenger.g0.v1(textView2);
            e0(true);
        } else if (this.i1) {
            e0(true);
        }
        textView2.clearFocus();
        X();
        n0();
        rmVar = this.y;
        if (rmVar != null) {
        }
        n4Var.g(this.w0);
        n4Var.g(this.B0);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i3 != org.telegram.messenger.hs.w0) {
            if (i3 == org.telegram.messenger.hs.i4) {
                ey eyVar = this.F;
                if (eyVar != null) {
                    eyVar.Q.g1();
                }
                org.telegram.ui.Cells.z5 z5Var = this.h1;
                if (z5Var != null) {
                    int currentTextColor = z5Var.getEditField().getCurrentTextColor();
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
        th.d dVar = this.n1;
        int size = dVar.a.size();
        for (int i11 = 0; i11 < size; i11++) {
            th.c cVar = (th.c) dVar.a.get(i11);
            if (cVar instanceof uh.e) {
                a0((uh.e) cVar, true);
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.J) {
            int i3 = 0;
            if (this.b1) {
                ey eyVar = this.F;
                eyVar.Q.C0();
                eyVar.J.scrollTo(0, 0);
                eyVar.E(1);
                eyVar.R.h1(0, 0);
                this.F.t(false);
                if (z10) {
                    this.F.A();
                }
                this.i1 = false;
                k0(0);
            }
            if (z10) {
                ey eyVar2 = this.F;
                if (eyVar2 == null || eyVar2.getVisibility() != 0) {
                    f0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                ofFloat.addUpdateListener(new em(this, i3));
                this.g1 = true;
                ofFloat.addListener(new hm(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                ofFloat.start();
            }
        }
    }

    public final void f0() {
        ey eyVar;
        hg emojiButton;
        if (!this.b1 && (eyVar = this.F) != null && eyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.z5 z5Var = this.h1;
            if (z5Var != null && (emojiButton = z5Var.getEmojiButton()) != null) {
                emojiButton.j(fg.e, false);
            }
            this.F.setVisibility(8);
        }
        int i3 = this.c1;
        this.c1 = 0;
        if (i3 != 0) {
            this.G.a();
        }
    }

    public final void g0(int i3) {
        this.m1 = i3;
        org.telegram.ui.ActionBar.d2 d2Var = this.b.X1;
        this.n1.b(i3);
        this.l1 = i0(d2Var, (i3 == -2 || i3 == -3) ? 74 : 41026, new bm(this, i3, 0), new vf(this, 27));
    }

    @Override // org.telegram.ui.Components.th
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(70.0f);
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        View childAt;
        org.telegram.ui.u51 u51Var = this.s;
        if (u51Var.getChildCount() <= 1 || (childAt = u51Var.getChildAt(1)) == null) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View F = u51Var.F(childAt);
        bj0 bj0Var = (bj0) (F == null ? null : u51Var.T(F));
        int y9 = (((int) childAt.getY()) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(20.0f);
        int i3 = (y9 <= 0 || bj0Var == null || bj0Var.b() != 1) ? 0 : y9;
        if (y9 < 0 || bj0Var == null || bj0Var.b() != 1) {
            y9 = i3;
        }
        return org.telegram.messenger.g0.L(25.0f) + y9;
    }

    public int getEmojiPadding() {
        return this.c1;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(17.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return this.S0;
    }

    @Override // org.telegram.ui.Components.th
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        int i3 = org.telegram.ui.ActionBar.k6.A5;
        org.telegram.ui.u51 u51Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 16, new Class[]{sm.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        int i10 = org.telegram.ui.ActionBar.k6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 262144, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        int i13 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 32, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Cells.z5 z5Var = this.h1;
        if (z5Var != null) {
            this.G.e = true;
            EditTextBoldCursor editField = z5Var.getEditField();
            editField.requestFocus();
            org.telegram.messenger.g0.K3(editField);
        }
        k0(org.telegram.messenger.g0.D ? 0 : 2);
        if (org.telegram.messenger.g0.D || this.f1 || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.H = true;
        mi.b0 b0Var = this.V0;
        org.telegram.messenger.g0.r(b0Var);
        org.telegram.messenger.g0.i3(b0Var, 100L);
    }

    @Override // org.telegram.ui.Components.th
    public final boolean i() {
        return this.Y0;
    }

    @Override // org.telegram.ui.Components.th
    public final int j() {
        return 1;
    }

    public final void j0(int i3, th.c cVar) {
        int i10;
        th.d dVar = this.n1;
        if (cVar != null) {
            dVar.a.put(i3, cVar);
        } else {
            dVar.a.remove(i3);
        }
        if (i3 == -2) {
            i10 = this.o0;
        } else if (i3 == -3) {
            i10 = this.q0;
        } else {
            int i11 = this.u0;
            i10 = (i11 < 0 || i3 < 0 || i3 >= this.N) ? -1 : i3 + i11;
        }
        if (i10 >= 0) {
            u4.d1 K = this.s.K(i10);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.z5) {
                    ((org.telegram.ui.Cells.z5) view).e.b(cVar, true);
                }
            }
            this.r.g(i10);
        }
        if (cVar instanceof uh.e) {
            uh.e eVar = (uh.e) cVar;
            String str = eVar.b;
            ai.q4 q4Var = new ai.q4(14, this, cVar);
            th.o oVar = this.R;
            HashMap hashMap = oVar.c;
            HashMap hashMap2 = oVar.b;
            if (hashMap2.containsKey(str)) {
                q4Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(q4Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(oVar.a).sendRequestTyped(getwebpagepreview, new c3.b(1), new org.telegram.ui.Wallet.s1(5, oVar, str));
                }
            }
            a0(eVar, false);
        }
        X();
    }

    @Override // org.telegram.ui.Components.th
    public final boolean k() {
        if (!this.b1) {
            return !W();
        }
        e0(true);
        return true;
    }

    public final void k0(int i3) {
        hg emojiButton;
        org.telegram.ui.Cells.z5 z5Var;
        if (this.J) {
            gi.p3 p3Var = this.G;
            bi biVar = this.b;
            int i10 = 1;
            if (i3 != 1) {
                org.telegram.ui.Cells.z5 z5Var2 = this.h1;
                emojiButton = z5Var2 != null ? z5Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(fg.e, true);
                }
                ey eyVar = this.F;
                if (eyVar != null) {
                    this.b1 = false;
                    this.i1 = false;
                    if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        eyVar.setVisibility(8);
                    }
                }
                if (i3 == 0) {
                    this.c1 = 0;
                }
                p3Var.a();
                biVar.m3.requestLayout();
                return;
            }
            ey eyVar2 = this.F;
            boolean z10 = eyVar2 != null && eyVar2.getVisibility() == 0;
            ey eyVar3 = this.F;
            if (eyVar3 != null && eyVar3.d1 != org.telegram.messenger.h10.t0) {
                biVar.m3.removeView(eyVar3);
                this.F = null;
            }
            if (this.F == null) {
                ey eyVar4 = new ey(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                this.F = eyVar4;
                eyVar4.c = 3;
                eyVar4.x0 = false;
                eyVar4.y2 = false;
                eyVar4.setShouldDrawBackground(false);
                ey eyVar5 = this.F;
                eyVar5.V0 = false;
                eyVar5.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.F.setForseMultiwindowLayout(true);
                }
                this.F.setDelegate(new gm(this));
                biVar.m3.addView(this.F);
                this.F.setBottomInset(org.telegram.messenger.g0.n);
            }
            this.F.setVisibility(0);
            this.b1 = true;
            ey eyVar6 = this.F;
            if (this.d1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.d1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.d1 = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.e1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.e1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.e1 = org.telegram.messenger.hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int i11 = point.x > point.y ? this.e1 : this.d1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eyVar6.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.n + i11;
            eyVar6.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (z5Var = this.h1) != null) {
                org.telegram.messenger.g0.v1(z5Var.getEditField());
            }
            this.c1 = i11;
            p3Var.a();
            biVar.m3.requestLayout();
            org.telegram.ui.Cells.z5 z5Var3 = this.h1;
            emojiButton = z5Var3 != null ? z5Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(fg.d, true);
            }
            if (z10 || this.f1) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c1, 0.0f);
            ofFloat.addUpdateListener(new em(this, i10));
            ofFloat.addListener(new hm(this, i10));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.w);
            ofFloat.start();
        }
    }

    public final void l0(int i3, org.telegram.messenger.v10 v10Var, int i10, int i11) {
        f60 F = f60.F(this, null, new View(getContext()));
        F.s = 0;
        F.t = false;
        F.c(R.drawable.msg_replace, org.telegram.messenger.bd.M0(2131746279, null), new cm(this, i3, 1), false);
        F.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, null), new cm(this, i3, 2), true);
        nk0 nk0Var = new nk0(getContext(), this.a);
        F.p = new org.telegram.ui.ee(nk0Var, 1);
        F.S = org.telegram.messenger.g0.L(185.0f);
        F.Y();
        nk0Var.e(F);
        Drawable drawable = (Drawable) v10Var.a(nk0Var.s);
        gh.g c2 = nk0Var.n.c(null, null, false);
        c2.p(b8.cd.k(nk0Var.b));
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.R.e = true;
        c2.r(org.telegram.messenger.g0.L(16.0f));
        nk0Var.G = c2;
        nk0Var.F = drawable;
        Point point = org.telegram.messenger.g0.q;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c2.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i14, org.telegram.messenger.g0.L(8.0f) + i15);
        nk0Var.F.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) nk0Var.y.getLayoutParams()).gravity = 1;
        nk0Var.M = true;
        nk0Var.show();
    }

    public final void m0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, e6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k7, e6Var);
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
            org.telegram.ui.u51 u51Var = this.s;
            if (u51Var != null) {
                for (int i3 = 0; i3 < u51Var.getChildCount(); i3++) {
                    View childAt = u51Var.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Cells.l8) {
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
        cg.v0 v0Var = this.N0;
        v0Var.b = -1;
        cg.v0 v0Var2 = this.O0;
        v0Var2.b = -1;
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
        int i3 = this.R0;
        int i10 = i3 + 1;
        this.s0 = i3;
        int i11 = i3 + 2;
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
            TLRPC.Chat chat = ((org.telegram.ui.wm) this.b.X1).e;
            boolean z11 = org.telegram.messenger.t3.T(chat) && !chat.megagroup;
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
                v0Var.b = i21;
                int i22 = i20 + 5;
                this.R0 = i22;
                v0Var2.b = i20 + 4;
                if (v0Var2.a) {
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

    @Override // org.telegram.ui.Components.th
    public final void p() {
        this.I = true;
        bi biVar = this.b;
        org.telegram.messenger.hs.f(biVar.E3).n(this, org.telegram.messenger.hs.w0);
        if (this.J) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
            ey eyVar = this.F;
            if (eyVar != null) {
                biVar.m3.removeView(eyVar);
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

    @Override // org.telegram.ui.Components.th
    public final boolean s() {
        return W();
    }

    public void setDelegate(zm zmVar) {
        this.k0 = zmVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.th
    public final void t() {
        this.b.L1();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.k1.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vl, this.a));
            m0();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void v(float f10) {
        this.b.L1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v31 */
    @Override // org.telegram.ui.Components.th
    public final void w(int i3) {
        int i10;
        if (i3 != 40) {
            return;
        }
        boolean z10 = this.n;
        int i11 = 0;
        int i12 = 1;
        bi biVar = this.b;
        CharSequence[] charSequenceArr = this.L;
        if (z10) {
            CharSequence[] charSequenceArr2 = {d0(this.O)};
            int i13 = biVar.E3;
            ArrayList<TLRPC.MessageEntity> W = org.telegram.messenger.li.b0(i13).W(charSequenceArr2, true, true);
            CharSequence charSequence = charSequenceArr2[0];
            if (W != null) {
                int size = W.size();
                for (int i14 = 0; i14 < size; i14++) {
                    TLRPC.MessageEntity messageEntity = W.get(i14);
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
            tL_messageMediaToDo.todo.title.entities = W;
            for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                if (!TextUtils.isEmpty(d0(charSequenceArr[i15]))) {
                    CharSequence[] charSequenceArr3 = {d0(charSequenceArr[i15])};
                    ArrayList<TLRPC.MessageEntity> W2 = org.telegram.messenger.li.b0(i13).W(charSequenceArr3, true, true);
                    CharSequence charSequence2 = charSequenceArr3[0];
                    if (W2 != null) {
                        int size2 = W2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            TLRPC.MessageEntity messageEntity2 = W2.get(i16);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                    }
                    TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    todoItem.title = tL_textWithEntities;
                    tL_textWithEntities.text = charSequence2.toString();
                    todoItem.title.entities = W2;
                    todoItem.id = tL_messageMediaToDo.todo.list.size() + 1;
                    tL_messageMediaToDo.todo.list.add(todoItem);
                }
            }
            t4.Z(i13, biVar.X0() + 1, biVar.b1(), new ai.m(this, (org.telegram.ui.wm) biVar.X1, tL_messageMediaToDo, 9));
            return;
        }
        boolean z12 = this.d0;
        org.telegram.ui.u51 u51Var = this.s;
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
                    u4.d1 K = u51Var.K(i18);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.z5) {
                            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                            if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                rm rmVar = this.y;
                                if (rmVar != null) {
                                    rmVar.f();
                                }
                                String M0 = org.telegram.messenger.bd.M0(2131747163, null);
                                u20 u20Var = this.E;
                                u20Var.setText(M0);
                                u20Var.c(z5Var.getCheckBox());
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
            th.d dVar = this.n1;
            if (i19 >= length) {
                CharSequence[] charSequenceArr4 = {d0(this.O)};
                int i20 = biVar.E3;
                ArrayList<TLRPC.MessageEntity> W3 = org.telegram.messenger.li.b0(i20).W(charSequenceArr4, true, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                if (W3 != null) {
                    int size3 = W3.size();
                    for (int i21 = 0; i21 < size3; i21++) {
                        TLRPC.MessageEntity messageEntity3 = W3.get(i21);
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
                tL_messageMediaPoll.poll.question.entities = W3;
                ArrayList arrayList2 = new ArrayList(this.K);
                int i24 = 0;
                while (i24 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(d0(charSequenceArr[i24]))) {
                        dVar.h(tL_messageMediaPoll.poll.answers.size());
                        i10 = i11;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[i12];
                        charSequenceArr5[i11] = d0(charSequenceArr[i24]);
                        ArrayList<TLRPC.MessageEntity> W4 = org.telegram.messenger.li.b0(i20).W(charSequenceArr5, i12, i12);
                        CharSequence charSequence4 = charSequenceArr5[i11];
                        if (W4 != null) {
                            int size4 = W4.size();
                            int i25 = i11;
                            while (i25 < size4) {
                                TLRPC.MessageEntity messageEntity4 = W4.get(i25);
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
                        tL_pollAnswer.text.entities = W4;
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
                    ArrayList<TLRPC.MessageEntity> W5 = org.telegram.messenger.li.b0(i20).W(charSequenceArr6, true, true);
                    if (W5 != null && !W5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = W5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                t4.Z(i20, biVar.X0() + 1, biVar.b1(), new ai.v1(this, (org.telegram.ui.wm) biVar.X1, tL_messageMediaPoll, arrayList2, 9));
                return;
            }
            if (TextUtils.isEmpty(d0(charSequenceArr[i19])) && dVar.b(i19) != null) {
                this.W0 = true;
                this.X0 = i19;
                u51Var.y0(this.u0 + i19);
                return;
            }
            i19++;
        }
    }
}
