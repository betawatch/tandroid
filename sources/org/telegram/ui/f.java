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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void a(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
        vg.b bVar;
        vg.a aVar;
        pg.b bVar2;
        switch (this.a) {
            case 0:
                ((i) this.b).c0();
                break;
            case 1:
                iv ivVar = ((d7) this.b).Q;
                if (ivVar != null) {
                    ivVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                    break;
                }
                break;
            case 2:
                n9.U((n9) this.b);
                break;
            case 3:
                pd pdVar = (pd) this.b;
                LinearLayout linearLayout = pdVar.I;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = pdVar.I.getChildAt(i10);
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
                hj hjVar = znVar.w;
                if (hjVar != null) {
                    hjVar.b();
                }
                hj hjVar2 = znVar.x;
                if (hjVar2 != null) {
                    hjVar2.b();
                }
                lk lkVar = znVar.V;
                if (lkVar != null) {
                    lkVar.e();
                }
                nh.t2 t2Var = znVar.G1;
                if (t2Var != null) {
                    t2Var.c1();
                }
                sj sjVar = znVar.u0;
                if (sjVar != null) {
                    int childCount2 = sjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = znVar.u0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                            ((org.telegram.ui.Cells.s1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                lh.e1 e1Var = znVar.I3;
                if (e1Var != null) {
                    int childCount3 = e1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = znVar.I3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.q2) {
                            ((org.telegram.ui.Cells.q2) childAt3).b0(0, true);
                        }
                    }
                }
                if (znVar.P8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = znVar.P8;
                        if (i13 < g1VarArr.length) {
                            g1VarArr[i13].c(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            znVar.P8[i13].setSelectorColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = znVar.N8;
                if (p1Var != null) {
                    View contentView = p1Var.getContentView();
                    contentView.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.bg0 bg0Var = znVar.w2;
                if (bg0Var != null) {
                    bg0Var.d();
                }
                nk nkVar = znVar.W;
                if (nkVar != null && nkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.ed edVar : znVar.W.getEditView().a) {
                        edVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = znVar.e0;
                if (w0Var != null) {
                    w0Var.N();
                }
                fk fkVar = znVar.U1;
                if (fkVar != null) {
                    fkVar.p();
                }
                nj njVar = znVar.X0;
                if (njVar != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = njVar.a0;
                    org.telegram.ui.Components.mw0 mw0Var = njVar.K;
                    if (mw0Var != null) {
                        mw0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pa, f6Var));
                    }
                    Drawable drawable = njVar.n0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.j5 j5Var = njVar.d0;
                    if (j5Var != null) {
                        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    org.telegram.ui.Components.j5 j5Var2 = njVar.c0;
                    if (j5Var2 != null) {
                        j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    Drawable drawable2 = njVar.o0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = njVar.p0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    njVar.invalidate();
                }
                rm rmVar = znVar.U0;
                if (rmVar != null) {
                    rmVar.N();
                    eg.h0 h0Var = znVar.U0.I;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                }
                org.telegram.ui.Components.sg sgVar = znVar.J0;
                if (sgVar != null) {
                    pg.b bVar3 = sgVar.s;
                    if (bVar3 != null) {
                        bVar3.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    sgVar.invalidate();
                }
                org.telegram.ui.Components.qy0 qy0Var = znVar.a1;
                if (qy0Var != null) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = qy0Var.b;
                    Paint paint = qy0Var.L;
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
                nj njVar2 = znVar.X0;
                if (njVar2 != null && njVar2.getTimeItem() != null) {
                    znVar.X0.getTimeItem().invalidate();
                }
                ug.f fVar = znVar.P;
                if (fVar != null) {
                    fVar.f.u();
                    fVar.h.u();
                    fVar.invalidate();
                }
                wg.g gVar = znVar.g1;
                if (gVar != null) {
                    for (s5.m mVar : gVar.e) {
                        if (mVar != null && (aVar = (bVar = (vg.b) mVar.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                qk qkVar = znVar.L0;
                if (qkVar != null) {
                    for (androidx.activity.o oVar : qkVar.a) {
                        if (oVar != null) {
                            ((vg.a) oVar.b).g();
                        }
                    }
                }
                Iterator it = znVar.B.iterator();
                while (it.hasNext()) {
                    ((pg.b) it.next()).u();
                }
                znVar.n9();
                break;
            case 5:
                nh.y3 y3Var = ((ro) this.b).e;
                if (y3Var != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
            case 6:
                fp fpVar = (fp) this.b;
                LinearLayout linearLayout2 = fpVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = fpVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.n, nVar2.f);
                            nVar2.a.invalidate();
                        }
                    }
                }
                fpVar.D.f();
                org.telegram.ui.Components.t60 t60Var = fpVar.m0;
                if (t60Var != null) {
                    t60Var.b0();
                    break;
                }
                break;
            case 7:
                sp spVar = (sp) this.b;
                org.telegram.ui.Components.rl0 rl0Var = spVar.b;
                if (rl0Var != null) {
                    int childCount5 = rl0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = spVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((zp) this.b).W();
                break;
            case 9:
                lq lqVar = (lq) this.b;
                lh.e1 e1Var2 = lqVar.b;
                if (e1Var2 != null) {
                    int childCount6 = e1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = lqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ta) {
                            ((org.telegram.ui.Cells.ta) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                rr rrVar = (rr) this.b;
                lh.e1 e1Var3 = rrVar.c;
                if (e1Var3 != null) {
                    int childCount7 = e1Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = rrVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                ps.W((ps) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                c10 c10Var = (c10) this.b;
                lh.e1 e1Var4 = c10Var.a;
                if (e1Var4 != null) {
                    int childCount8 = e1Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = c10Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                nh.a3 a3Var = ((u10) this.b).j0;
                if (a3Var != null && (bVar2 = (pg.b) a3Var.c) != null) {
                    bVar2.u();
                    break;
                }
                break;
            case 15:
                ((n20) this.b).v0();
                break;
            case 16:
                a70 a70Var = (a70) this.b;
                org.telegram.ui.Components.rl0 rl0Var2 = a70Var.n;
                if (rl0Var2 != null) {
                    int childCount9 = rl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = a70Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.d20 d20Var = a70Var.f;
                if (d20Var != null) {
                    d20Var.e();
                }
                org.telegram.ui.Components.a20 a20Var = a70Var.y;
                if (a20Var != null) {
                    a20Var.g();
                    break;
                }
                break;
            case 17:
                g70 g70Var = (g70) this.b;
                org.telegram.ui.Components.rl0 rl0Var3 = g70Var.b;
                if (rl0Var3 != null) {
                    int childCount10 = rl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = g70Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.a20 a20Var2 = g70Var.v;
                if (a20Var2 != null) {
                    a20Var2.g();
                    break;
                }
                break;
            case 18:
                ((w70) this.b).V(true);
                break;
            case 19:
                e80 e80Var = (e80) this.b;
                org.telegram.ui.Components.rl0 rl0Var4 = e80Var.h;
                if (rl0Var4 != null) {
                    int childCount11 = rl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = e80Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                pb0 pb0Var = (pb0) this.b;
                org.telegram.ui.Cells.z8 z8Var = pb0Var.D;
                if (z8Var != null) {
                    z8Var.getContext();
                    lb0 lb0Var = pb0Var.C;
                    int i23 = org.telegram.ui.ActionBar.j6.G6;
                    lb0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    lb0 lb0Var2 = pb0Var.C;
                    int i24 = org.telegram.ui.ActionBar.j6.y6;
                    lb0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    pb0Var.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    pb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    org.telegram.ui.Cells.z9 z9Var = pb0Var.F;
                    if (z9Var != null) {
                        z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    }
                    pb0Var.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    pb0Var.H.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    pb0Var.H.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                cd0 cd0Var = (cd0) this.b;
                cd0Var.d.setIconColor(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                cd0Var.d.B(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                cd0Var.d.G(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                cd0Var.d.G(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                cd0Var.s.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5), PorterDuff.Mode.MULTIPLY));
                cd0Var.v.invalidate();
                if (cd0Var.F != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!cd0Var.X) {
                            cd0Var.X = true;
                            cd0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = cd0Var.L;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                cd0Var.L.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (cd0Var.X) {
                        cd0Var.X = false;
                        cd0Var.F.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = cd0Var.L;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            cd0Var.L.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((pg0) this.b).y1();
                break;
            case 23:
                ((xg0) this.b).e0();
                break;
            case 24:
                rh0 rh0Var = (rh0) this.b;
                org.telegram.ui.Components.rl0 rl0Var5 = rh0Var.b;
                if (rl0Var5 != null) {
                    int childCount12 = rl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = rh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.x80) {
                            ((org.telegram.ui.Components.x80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.t60 t60Var2 = rh0Var.i0;
                if (t60Var2 != null) {
                    t60Var2.b0();
                    break;
                }
                break;
            case 25:
                cj0 cj0Var = (cj0) this.b;
                org.telegram.ui.Components.rl0 rl0Var6 = cj0Var.f;
                if (rl0Var6 != null) {
                    int childCount13 = rl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        cj0Var.d0(cj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = cj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        cj0Var.d0(cj0Var.f.V(i28));
                    }
                    int cachedChildCount = cj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        cj0Var.d0(cj0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = cj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        cj0Var.d0(cj0Var.f.O(i30));
                    }
                    cj0Var.f.getRecycledViewPool().a();
                }
                vf.f fVar2 = cj0Var.Z;
                if (fVar2 != null) {
                    fVar2.g = true;
                }
                View subtitleTextView = cj0Var.Y.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
                    ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, cj0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.rl0 rl0Var7 = notificationsCustomSettingsActivity.a;
                if (rl0Var7 != null) {
                    int childCount14 = rl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt13).j(0);
                        }
                    }
                    break;
                }
                break;
            case 27:
                ((np0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                tx0 tx0Var = (tx0) this.b;
                org.telegram.ui.Components.rl0 rl0Var8 = tx0Var.a;
                if (rl0Var8 != null) {
                    int childCount15 = rl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = tx0Var.a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt14).c(0);
                        }
                    }
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void A(float f10) {
    }

    private final /* synthetic */ void B(float f10) {
    }

    private final /* synthetic */ void C(float f10) {
    }

    private final /* synthetic */ void D(float f10) {
    }

    private final /* synthetic */ void E(float f10) {
    }

    private final /* synthetic */ void F(float f10) {
    }

    private final /* synthetic */ void c(float f10) {
    }

    private final /* synthetic */ void d(float f10) {
    }

    private final /* synthetic */ void e(float f10) {
    }

    private final /* synthetic */ void f(float f10) {
    }

    private final /* synthetic */ void g(float f10) {
    }

    private final /* synthetic */ void h(float f10) {
    }

    private final /* synthetic */ void i(float f10) {
    }

    private final /* synthetic */ void j(float f10) {
    }

    private final /* synthetic */ void k(float f10) {
    }

    private final /* synthetic */ void l(float f10) {
    }

    private final /* synthetic */ void m(float f10) {
    }

    private final /* synthetic */ void n(float f10) {
    }

    private final /* synthetic */ void o(float f10) {
    }

    private final /* synthetic */ void p(float f10) {
    }

    private final /* synthetic */ void q(float f10) {
    }

    private final /* synthetic */ void r(float f10) {
    }

    private final /* synthetic */ void s(float f10) {
    }

    private final /* synthetic */ void t(float f10) {
    }

    private final /* synthetic */ void u(float f10) {
    }

    private final /* synthetic */ void v(float f10) {
    }

    private final /* synthetic */ void w(float f10) {
    }

    private final /* synthetic */ void x(float f10) {
    }

    private final /* synthetic */ void y(float f10) {
    }

    private final /* synthetic */ void z(float f10) {
    }
}
