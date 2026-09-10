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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        hh.b bVar;
        hh.a aVar;
        bh.d dVar;
        switch (this.a) {
            case 0:
                ((h) this.b).c0();
                break;
            case 1:
                lv lvVar = ((y6) this.b).T;
                if (lvVar != null) {
                    lvVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                    break;
                }
                break;
            case 2:
                k9.U((k9) this.b);
                break;
            case 3:
                nd ndVar = (nd) this.b;
                LinearLayout linearLayout = ndVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = ndVar.L.getChildAt(i10);
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
                eo eoVar = (eo) this.b;
                lj ljVar = eoVar.w;
                if (ljVar != null) {
                    ljVar.b();
                }
                lj ljVar2 = eoVar.x;
                if (ljVar2 != null) {
                    ljVar2.b();
                }
                ok okVar = eoVar.Y;
                if (okVar != null) {
                    okVar.e();
                }
                gg.m mVar = eoVar.J1;
                if (mVar != null) {
                    mVar.c1();
                }
                wj wjVar = eoVar.x0;
                if (wjVar != null) {
                    int childCount2 = wjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = eoVar.x0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                bi.y1 y1Var = eoVar.L3;
                if (y1Var != null) {
                    int childCount3 = y1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = eoVar.L3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (eoVar.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = eoVar.S8;
                        if (i13 < g1VarArr.length) {
                            g1VarArr[i13].c(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            eoVar.S8[i13].setSelectorColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = eoVar.Q8;
                if (p1Var != null) {
                    View contentView = p1Var.getContentView();
                    contentView.setBackgroundColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.eg0 eg0Var = eoVar.z2;
                if (eg0Var != null) {
                    eg0Var.d();
                }
                qk qkVar = eoVar.Z;
                if (qkVar != null && qkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.md mdVar : eoVar.Z.getEditView().a) {
                        mdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = eoVar.h0;
                if (w0Var != null) {
                    w0Var.N();
                }
                jk jkVar = eoVar.X1;
                if (jkVar != null) {
                    jkVar.p();
                }
                rj rjVar = eoVar.a1;
                if (rjVar != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = rjVar.d0;
                    org.telegram.ui.Components.ww0 ww0Var = rjVar.N;
                    if (ww0Var != null) {
                        ww0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pa, f6Var));
                    }
                    Drawable drawable = rjVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.n5 n5Var = rjVar.g0;
                    if (n5Var != null) {
                        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    org.telegram.ui.Components.n5 n5Var2 = rjVar.f0;
                    if (n5Var2 != null) {
                        n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    Drawable drawable2 = rjVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = rjVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    rjVar.invalidate();
                }
                vm vmVar = eoVar.X0;
                if (vmVar != null) {
                    vmVar.N();
                    bi.nc ncVar = eoVar.X0.L;
                    if (ncVar != null) {
                        ncVar.invalidate();
                    }
                }
                org.telegram.ui.Components.fh fhVar = eoVar.M0;
                if (fhVar != null) {
                    bh.d dVar2 = fhVar.s;
                    if (dVar2 != null) {
                        dVar2.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    fhVar.invalidate();
                }
                org.telegram.ui.Components.zy0 zy0Var = eoVar.d1;
                if (zy0Var != null) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = zy0Var.b;
                    Paint paint = zy0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Be, f6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.j6.E4;
                    int i14 = org.telegram.ui.ActionBar.j6.Be;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.j6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var2), mode));
                }
                rj rjVar2 = eoVar.a1;
                if (rjVar2 != null && rjVar2.getTimeItem() != null) {
                    eoVar.a1.getTimeItem().invalidate();
                }
                gh.g gVar = eoVar.S;
                if (gVar != null) {
                    gVar.f.u();
                    gVar.h.u();
                    gVar.invalidate();
                }
                ih.h hVar = eoVar.j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (hh.b) aVar2.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                tk tkVar = eoVar.O0;
                if (tkVar != null) {
                    for (androidx.activity.o oVar : tkVar.a) {
                        if (oVar != null) {
                            ((hh.a) oVar.c).g();
                        }
                    }
                }
                Iterator it = eoVar.E.iterator();
                while (it.hasNext()) {
                    ((bh.d) it.next()).u();
                }
                eoVar.n9();
                break;
            case 5:
                gg.i1 i1Var = ((yo) this.b).e;
                if (i1Var != null) {
                    i1Var.invalidate();
                    break;
                }
                break;
            case 6:
                mp mpVar = (mp) this.b;
                LinearLayout linearLayout2 = mpVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = mpVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.n, nVar2.f);
                            nVar2.a.invalidate();
                        }
                    }
                }
                mpVar.G.f();
                org.telegram.ui.Components.a70 a70Var = mpVar.p0;
                if (a70Var != null) {
                    a70Var.b0();
                    break;
                }
                break;
            case 7:
                yp ypVar = (yp) this.b;
                org.telegram.ui.Components.vl0 vl0Var = ypVar.b;
                if (vl0Var != null) {
                    int childCount5 = vl0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = ypVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((fq) this.b).W();
                break;
            case 9:
                rq rqVar = (rq) this.b;
                bi.y1 y1Var2 = rqVar.b;
                if (y1Var2 != null) {
                    int childCount6 = y1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = rqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                wr wrVar = (wr) this.b;
                bi.y1 y1Var3 = wrVar.c;
                if (y1Var3 != null) {
                    int childCount7 = y1Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = wrVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                ts.W((ts) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                h10 h10Var = (h10) this.b;
                bi.y1 y1Var4 = h10Var.a;
                if (y1Var4 != null) {
                    int childCount8 = y1Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = h10Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.bb) {
                            ((org.telegram.ui.Cells.bb) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                u7 u7Var = ((z10) this.b).m0;
                if (u7Var != null && (dVar = (bh.d) u7Var.c) != null) {
                    dVar.u();
                    break;
                }
                break;
            case 15:
                ((s20) this.b).v0();
                break;
            case 16:
                e70 e70Var = (e70) this.b;
                org.telegram.ui.Components.vl0 vl0Var2 = e70Var.n;
                if (vl0Var2 != null) {
                    int childCount9 = vl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = e70Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.k20 k20Var = e70Var.f;
                if (k20Var != null) {
                    k20Var.e();
                }
                org.telegram.ui.Components.h20 h20Var = e70Var.y;
                if (h20Var != null) {
                    h20Var.g();
                    break;
                }
                break;
            case 17:
                k70 k70Var = (k70) this.b;
                org.telegram.ui.Components.vl0 vl0Var3 = k70Var.b;
                if (vl0Var3 != null) {
                    int childCount10 = vl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = k70Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.h20 h20Var2 = k70Var.v;
                if (h20Var2 != null) {
                    h20Var2.g();
                    break;
                }
                break;
            case 18:
                ((c80) this.b).V(true);
                break;
            case 19:
                k80 k80Var = (k80) this.b;
                org.telegram.ui.Components.vl0 vl0Var4 = k80Var.h;
                if (vl0Var4 != null) {
                    int childCount11 = vl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = k80Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                xb0 xb0Var = (xb0) this.b;
                org.telegram.ui.Cells.f9 f9Var = xb0Var.G;
                if (f9Var != null) {
                    f9Var.getContext();
                    tb0 tb0Var = xb0Var.F;
                    int i23 = org.telegram.ui.ActionBar.j6.G6;
                    tb0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    tb0 tb0Var2 = xb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.j6.y6;
                    tb0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    xb0Var.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    xb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    org.telegram.ui.Cells.ga gaVar = xb0Var.I;
                    if (gaVar != null) {
                        gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    }
                    xb0Var.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    xb0Var.K.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    xb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                id0 id0Var = (id0) this.b;
                id0Var.d.setIconColor(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                id0Var.d.B(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                id0Var.d.G(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                id0Var.d.G(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                id0Var.s.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5), PorterDuff.Mode.MULTIPLY));
                id0Var.v.invalidate();
                if (id0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!id0Var.a0) {
                            id0Var.a0 = true;
                            id0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = id0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                id0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (id0Var.a0) {
                        id0Var.a0 = false;
                        id0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = id0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            id0Var.O.setFillColor(TLObject.FLAG_29);
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
                org.telegram.ui.Components.vl0 vl0Var5 = zh0Var.b;
                if (vl0Var5 != null) {
                    int childCount12 = vl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = zh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.f90) {
                            ((org.telegram.ui.Components.f90) childAt12).f();
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
                org.telegram.ui.Components.vl0 vl0Var6 = kj0Var.f;
                if (vl0Var6 != null) {
                    int childCount13 = vl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        kj0Var.d0(kj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = kj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        kj0Var.d0(kj0Var.f.V(i28));
                    }
                    int cachedChildCount = kj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        kj0Var.d0(kj0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = kj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        kj0Var.d0(kj0Var.f.O(i30));
                    }
                    kj0Var.f.getRecycledViewPool().a();
                }
                hg.f fVar = kj0Var.c0;
                if (fVar != null) {
                    fVar.g = true;
                }
                View subtitleTextView = kj0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.l5) {
                    ((org.telegram.ui.ActionBar.l5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, kj0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.vl0 vl0Var7 = notificationsCustomSettingsActivity.a;
                if (vl0Var7 != null) {
                    int childCount14 = vl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.bb) {
                            ((org.telegram.ui.Cells.bb) childAt13).j(0);
                        }
                    }
                    break;
                }
                break;
            case 27:
                ((bq0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                ky0 ky0Var = (ky0) this.b;
                org.telegram.ui.Components.vl0 vl0Var8 = ky0Var.a;
                if (vl0Var8 != null) {
                    int childCount15 = vl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = ky0Var.a.getChildAt(i32);
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
