package org.telegram.ui;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        switch (this.a) {
            case 0:
                ((h) this.b).c0();
                break;
            case 1:
                kv kvVar = ((z6) this.b).X;
                if (kvVar != null) {
                    kvVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                    break;
                }
                break;
            case 2:
                l9.U((l9) this.b);
                break;
            case 3:
                md mdVar = (md) this.b;
                LinearLayout linearLayout = mdVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = mdVar.L.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.n, nVar.f);
                            nVar.a.invalidate();
                        }
                    }
                    break;
                }
                break;
            case 4:
                zn znVar = (zn) this.b;
                ij ijVar = znVar.w;
                if (ijVar != null) {
                    ijVar.d();
                }
                ij ijVar2 = znVar.x;
                if (ijVar2 != null) {
                    ijVar2.d();
                }
                lk lkVar = znVar.Y;
                if (lkVar != null) {
                    lkVar.e();
                }
                ai.g4 g4Var = znVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                tj tjVar = znVar.x0;
                if (tjVar != null) {
                    int childCount2 = tjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = znVar.x0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = znVar.L3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (znVar.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = znVar.S8;
                        if (i13 < f1VarArr.length) {
                            f1VarArr[i13].c(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            znVar.S8[i13].setSelectorColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.eg0 eg0Var = znVar.z2;
                if (eg0Var != null) {
                    eg0Var.d();
                }
                nk nkVar = znVar.Z;
                if (nkVar != null && nkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.nd ndVar : znVar.Z.getEditView().a) {
                        ndVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                gk gkVar = znVar.X1;
                if (gkVar != null) {
                    gkVar.q();
                }
                oj ojVar = znVar.a1;
                if (ojVar != null) {
                    org.telegram.ui.ActionBar.e6 e6Var = ojVar.d0;
                    org.telegram.ui.Components.xw0 xw0Var = ojVar.N;
                    if (xw0Var != null) {
                        xw0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pa, e6Var));
                    }
                    Drawable drawable = ojVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.o5 o5Var = ojVar.g0;
                    if (o5Var != null) {
                        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, e6Var)));
                    }
                    org.telegram.ui.Components.o5 o5Var2 = ojVar.f0;
                    if (o5Var2 != null) {
                        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, e6Var)));
                    }
                    Drawable drawable2 = ojVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ojVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ojVar.invalidate();
                }
                rm rmVar = znVar.X0;
                if (rmVar != null) {
                    rmVar.N();
                    ci.eb ebVar = znVar.X0.L;
                    if (ebVar != null) {
                        ebVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = znVar.M0;
                if (chVar != null) {
                    ch.d dVar2 = chVar.s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.zy0 zy0Var = znVar.d1;
                if (zy0Var != null) {
                    org.telegram.ui.ActionBar.e6 e6Var2 = zy0Var.b;
                    Paint paint = zy0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Be, e6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.j6.E4;
                    int i14 = org.telegram.ui.ActionBar.j6.Be;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i14, e6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.j6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, e6Var2), mode));
                }
                oj ojVar2 = znVar.a1;
                if (ojVar2 != null && ojVar2.getTimeItem() != null) {
                    znVar.a1.getTimeItem().invalidate();
                }
                hh.g gVar = znVar.S;
                if (gVar != null) {
                    gVar.f.v();
                    gVar.h.v();
                    gVar.invalidate();
                }
                jh.h hVar = znVar.j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                qk qkVar = znVar.O0;
                if (qkVar != null) {
                    for (androidx.activity.n nVar2 : qkVar.a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.c).g();
                        }
                    }
                }
                Iterator it = znVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                znVar.n9();
                break;
            case 5:
                ai.z5 z5Var = ((uo) this.b).e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    break;
                }
                break;
            case 6:
                ip ipVar = (ip) this.b;
                LinearLayout linearLayout2 = ipVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = ipVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.n, nVar3.f);
                            nVar3.a.invalidate();
                        }
                    }
                }
                ipVar.G.f();
                org.telegram.ui.Components.a70 a70Var = ipVar.p0;
                if (a70Var != null) {
                    a70Var.b0();
                    break;
                }
                break;
            case 7:
                up upVar = (up) this.b;
                org.telegram.ui.Components.wl0 wl0Var = upVar.b;
                if (wl0Var != null) {
                    int childCount5 = wl0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = upVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((bq) this.b).W();
                break;
            case 9:
                nq nqVar = (nq) this.b;
                ai.w0 w0Var2 = nqVar.b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = nqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                sr srVar = (sr) this.b;
                ai.w0 w0Var3 = srVar.c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = srVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                ss.W((ss) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                f10 f10Var = (f10) this.b;
                ai.w0 w0Var4 = f10Var.a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = f10Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                ai.n4 n4Var = ((x10) this.b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.c) != null) {
                    dVar.v();
                    break;
                }
                break;
            case 15:
                ((r20) this.b).v0();
                break;
            case 16:
                e70 e70Var = (e70) this.b;
                org.telegram.ui.Components.wl0 wl0Var2 = e70Var.n;
                if (wl0Var2 != null) {
                    int childCount9 = wl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = e70Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.b20 b20Var = e70Var.f;
                if (b20Var != null) {
                    b20Var.e();
                }
                org.telegram.ui.Components.y10 y10Var = e70Var.y;
                if (y10Var != null) {
                    y10Var.g();
                    break;
                }
                break;
            case 17:
                l70 l70Var = (l70) this.b;
                org.telegram.ui.Components.wl0 wl0Var3 = l70Var.b;
                if (wl0Var3 != null) {
                    int childCount10 = wl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = l70Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.y10 y10Var2 = l70Var.v;
                if (y10Var2 != null) {
                    y10Var2.g();
                    break;
                }
                break;
            case 18:
                ((d80) this.b).V(true);
                break;
            case 19:
                l80 l80Var = (l80) this.b;
                org.telegram.ui.Components.wl0 wl0Var4 = l80Var.h;
                if (wl0Var4 != null) {
                    int childCount11 = wl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = l80Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                yb0 yb0Var = (yb0) this.b;
                org.telegram.ui.Cells.e9 e9Var = yb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    ub0 ub0Var = yb0Var.F;
                    int i23 = org.telegram.ui.ActionBar.j6.G6;
                    ub0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    ub0 ub0Var2 = yb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.j6.y6;
                    ub0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    yb0Var.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    yb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    org.telegram.ui.Cells.ea eaVar = yb0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    }
                    yb0Var.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    yb0Var.K.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    yb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                jd0 jd0Var = (jd0) this.b;
                jd0Var.d.setIconColor(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                jd0Var.d.B(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                jd0Var.d.G(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                jd0Var.d.G(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                jd0Var.s.setColorFilter(new PorterDuffColorFilter(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5), PorterDuff.Mode.MULTIPLY));
                jd0Var.v.invalidate();
                if (jd0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!jd0Var.a0) {
                            jd0Var.a0 = true;
                            jd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = jd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                jd0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (jd0Var.a0) {
                        jd0Var.a0 = false;
                        jd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = jd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            jd0Var.O.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((xg0) this.b).y1();
                break;
            case 23:
                ((fh0) this.b).e0();
                break;
            case 24:
                zh0 zh0Var = (zh0) this.b;
                org.telegram.ui.Components.wl0 wl0Var5 = zh0Var.b;
                if (wl0Var5 != null) {
                    int childCount12 = wl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = zh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.e90) {
                            ((org.telegram.ui.Components.e90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.a70 a70Var2 = zh0Var.l0;
                if (a70Var2 != null) {
                    a70Var2.b0();
                    break;
                }
                break;
            case 25:
                kj0 kj0Var = (kj0) this.b;
                org.telegram.ui.Components.wl0 wl0Var6 = kj0Var.f;
                if (wl0Var6 != null) {
                    int childCount13 = wl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        kj0Var.d0(kj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = kj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        kj0Var.d0(kj0Var.f.W(i28));
                    }
                    int cachedChildCount = kj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        kj0Var.d0(kj0Var.f.Q(i29));
                    }
                    int attachedScrapChildCount = kj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        kj0Var.d0(kj0Var.f.P(i30));
                    }
                    kj0Var.f.getRecycledViewPool().a();
                }
                ig.f fVar = kj0Var.c0;
                if (fVar != null) {
                    fVar.g = true;
                }
                View subtitleTextView = kj0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, kj0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.wl0 wl0Var7 = notificationsCustomSettingsActivity.a;
                if (wl0Var7 != null) {
                    int childCount14 = wl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt13).j(0);
                        }
                    }
                    break;
                }
                break;
            case 27:
                ((cq0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                hy0 hy0Var = (hy0) this.b;
                org.telegram.ui.Components.wl0 wl0Var8 = hy0Var.a;
                if (wl0Var8 != null) {
                    int childCount15 = wl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = hy0Var.a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt14).c(0);
                        }
                    }
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void A(float f7) {
    }

    private final /* synthetic */ void B(float f7) {
    }

    private final /* synthetic */ void C(float f7) {
    }

    private final /* synthetic */ void D(float f7) {
    }

    private final /* synthetic */ void E(float f7) {
    }

    private final /* synthetic */ void F(float f7) {
    }

    private final /* synthetic */ void c(float f7) {
    }

    private final /* synthetic */ void d(float f7) {
    }

    private final /* synthetic */ void e(float f7) {
    }

    private final /* synthetic */ void f(float f7) {
    }

    private final /* synthetic */ void g(float f7) {
    }

    private final /* synthetic */ void h(float f7) {
    }

    private final /* synthetic */ void i(float f7) {
    }

    private final /* synthetic */ void j(float f7) {
    }

    private final /* synthetic */ void k(float f7) {
    }

    private final /* synthetic */ void l(float f7) {
    }

    private final /* synthetic */ void m(float f7) {
    }

    private final /* synthetic */ void n(float f7) {
    }

    private final /* synthetic */ void o(float f7) {
    }

    private final /* synthetic */ void p(float f7) {
    }

    private final /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void r(float f7) {
    }

    private final /* synthetic */ void s(float f7) {
    }

    private final /* synthetic */ void t(float f7) {
    }

    private final /* synthetic */ void u(float f7) {
    }

    private final /* synthetic */ void v(float f7) {
    }

    private final /* synthetic */ void w(float f7) {
    }

    private final /* synthetic */ void x(float f7) {
    }

    private final /* synthetic */ void y(float f7) {
    }

    private final /* synthetic */ void z(float f7) {
    }
}
