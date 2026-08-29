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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void a(float f9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
        tg.b bVar;
        tg.a aVar;
        ng.d dVar;
        switch (this.a) {
            case 0:
                ((i) this.b).c0();
                break;
            case 1:
                yu yuVar = ((x6) this.b).P;
                if (yuVar != null) {
                    yuVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
                    break;
                }
                break;
            case 2:
                h9.U((h9) this.b);
                break;
            case 3:
                hd hdVar = (hd) this.b;
                LinearLayout linearLayout = hdVar.H;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = hdVar.H.getChildAt(i10);
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
                tn tnVar = (tn) this.b;
                aj ajVar = tnVar.w;
                if (ajVar != null) {
                    ajVar.b();
                }
                aj ajVar2 = tnVar.x;
                if (ajVar2 != null) {
                    ajVar2.b();
                }
                dk dkVar = tnVar.U;
                if (dkVar != null) {
                    dkVar.e();
                }
                lh.s2 s2Var = tnVar.F1;
                if (s2Var != null) {
                    s2Var.c1();
                }
                lj ljVar = tnVar.t0;
                if (ljVar != null) {
                    int childCount2 = ljVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = tnVar.t0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                            ((org.telegram.ui.Cells.s1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                jh.e1 e1Var = tnVar.H3;
                if (e1Var != null) {
                    int childCount3 = e1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = tnVar.H3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.p2) {
                            ((org.telegram.ui.Cells.p2) childAt3).b0(0, true);
                        }
                    }
                }
                if (tnVar.O8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = tnVar.O8;
                        if (i13 < g1VarArr.length) {
                            g1VarArr[i13].c(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.E8), tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.F8));
                            tnVar.O8[i13].setSelectorColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = tnVar.M8;
                if (o1Var != null) {
                    View contentView = o1Var.getContentView();
                    contentView.setBackgroundColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.rf0 rf0Var = tnVar.v2;
                if (rf0Var != null) {
                    rf0Var.d();
                }
                fk fkVar = tnVar.V;
                if (fkVar != null && fkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.hd hdVar2 : tnVar.V.getEditView().a) {
                        hdVar2.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = tnVar.d0;
                if (w0Var != null) {
                    w0Var.N();
                }
                yj yjVar = tnVar.T1;
                if (yjVar != null) {
                    yjVar.p();
                }
                gj gjVar = tnVar.W0;
                if (gjVar != null) {
                    org.telegram.ui.ActionBar.c6 c6Var = gjVar.W;
                    org.telegram.ui.Components.dw0 dw0Var = gjVar.J;
                    if (dw0Var != null) {
                        dw0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.pa, c6Var));
                    }
                    Drawable drawable = gjVar.m0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.n5 n5Var = gjVar.c0;
                    if (n5Var != null) {
                        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
                    }
                    org.telegram.ui.Components.n5 n5Var2 = gjVar.b0;
                    if (n5Var2 != null) {
                        n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
                    }
                    Drawable drawable2 = gjVar.n0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = gjVar.o0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    gjVar.invalidate();
                }
                km kmVar = tnVar.T0;
                if (kmVar != null) {
                    kmVar.N();
                    cg.h0 h0Var = tnVar.T0.H;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                }
                org.telegram.ui.Components.vg vgVar = tnVar.I0;
                if (vgVar != null) {
                    ng.d dVar2 = vgVar.s;
                    if (dVar2 != null) {
                        dVar2.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    vgVar.invalidate();
                }
                org.telegram.ui.Components.fy0 fy0Var = tnVar.Z0;
                if (fy0Var != null) {
                    org.telegram.ui.ActionBar.c6 c6Var2 = fy0Var.b;
                    Paint paint = fy0Var.K;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Be, c6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.g6.E4;
                    int i14 = org.telegram.ui.ActionBar.g6.Be;
                    int v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.g6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var2), mode));
                }
                gj gjVar2 = tnVar.W0;
                if (gjVar2 != null && gjVar2.getTimeItem() != null) {
                    tnVar.W0.getTimeItem().invalidate();
                }
                sg.f fVar = tnVar.O;
                if (fVar != null) {
                    fVar.f.u();
                    fVar.h.u();
                    fVar.invalidate();
                }
                ug.g gVar = tnVar.f1;
                if (gVar != null) {
                    for (l3.g0 g0Var : gVar.e) {
                        if (g0Var != null && (aVar = (bVar = (tg.b) g0Var.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ik ikVar = tnVar.K0;
                if (ikVar != null) {
                    for (androidx.activity.n nVar2 : ikVar.a) {
                        if (nVar2 != null) {
                            ((tg.a) nVar2.b).g();
                        }
                    }
                }
                Iterator it = tnVar.A.iterator();
                while (it.hasNext()) {
                    ((ng.d) it.next()).u();
                }
                tnVar.n9();
                break;
            case 5:
                lh.y3 y3Var = ((ko) this.b).e;
                if (y3Var != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
            case 6:
                yo yoVar = (yo) this.b;
                LinearLayout linearLayout2 = yoVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = yoVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.n, nVar3.f);
                            nVar3.a.invalidate();
                        }
                    }
                }
                yoVar.C.f();
                org.telegram.ui.Components.n60 n60Var = yoVar.l0;
                if (n60Var != null) {
                    n60Var.b0();
                    break;
                }
                break;
            case 7:
                kp kpVar = (kp) this.b;
                org.telegram.ui.Components.jl0 jl0Var = kpVar.b;
                if (jl0Var != null) {
                    int childCount5 = jl0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = kpVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.z4) {
                            ((org.telegram.ui.Cells.z4) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((rp) this.b).W();
                break;
            case 9:
                dq dqVar = (dq) this.b;
                jh.e1 e1Var2 = dqVar.b;
                if (e1Var2 != null) {
                    int childCount6 = e1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = dqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ra) {
                            ((org.telegram.ui.Cells.ra) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                jr jrVar = (jr) this.b;
                jh.e1 e1Var3 = jrVar.c;
                if (e1Var3 != null) {
                    int childCount7 = e1Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = jrVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.z4) {
                            ((org.telegram.ui.Cells.z4) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                hs.W((hs) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                p00 p00Var = (p00) this.b;
                jh.e1 e1Var4 = p00Var.a;
                if (e1Var4 != null) {
                    int childCount8 = e1Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = p00Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.sa) {
                            ((org.telegram.ui.Cells.sa) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                lh.z2 z2Var = ((h10) this.b).i0;
                if (z2Var != null && (dVar = (ng.d) z2Var.c) != null) {
                    dVar.u();
                    break;
                }
                break;
            case 15:
                ((z10) this.b).v0();
                break;
            case 16:
                m60 m60Var = (m60) this.b;
                org.telegram.ui.Components.jl0 jl0Var2 = m60Var.n;
                if (jl0Var2 != null) {
                    int childCount9 = jl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = m60Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.x10 x10Var = m60Var.f;
                if (x10Var != null) {
                    x10Var.e();
                }
                org.telegram.ui.Components.u10 u10Var = m60Var.y;
                if (u10Var != null) {
                    u10Var.g();
                    break;
                }
                break;
            case 17:
                t60 t60Var = (t60) this.b;
                org.telegram.ui.Components.jl0 jl0Var3 = t60Var.b;
                if (jl0Var3 != null) {
                    int childCount10 = jl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = t60Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.u10 u10Var2 = t60Var.v;
                if (u10Var2 != null) {
                    u10Var2.g();
                    break;
                }
                break;
            case 18:
                ((k70) this.b).V(true);
                break;
            case 19:
                s70 s70Var = (s70) this.b;
                org.telegram.ui.Components.jl0 jl0Var4 = s70Var.h;
                if (jl0Var4 != null) {
                    int childCount11 = jl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = s70Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                eb0 eb0Var = (eb0) this.b;
                org.telegram.ui.Cells.y8 y8Var = eb0Var.C;
                if (y8Var != null) {
                    y8Var.getContext();
                    ab0 ab0Var = eb0Var.B;
                    int i23 = org.telegram.ui.ActionBar.g6.G6;
                    ab0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
                    ab0 ab0Var2 = eb0Var.B;
                    int i24 = org.telegram.ui.ActionBar.g6.y6;
                    ab0Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    eb0Var.w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
                    eb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    org.telegram.ui.Cells.y9 y9Var = eb0Var.E;
                    if (y9Var != null) {
                        y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                    }
                    eb0Var.I.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    eb0Var.G.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
                    eb0Var.G.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                rc0 rc0Var = (rc0) this.b;
                rc0Var.d.setIconColor(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ui));
                rc0Var.d.B(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                rc0Var.d.G(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true);
                rc0Var.d.G(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
                rc0Var.s.setColorFilter(new PorterDuffColorFilter(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5), PorterDuff.Mode.MULTIPLY));
                rc0Var.v.invalidate();
                if (rc0Var.E != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!rc0Var.W) {
                            rc0Var.W = true;
                            rc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = rc0Var.K;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                rc0Var.K.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (rc0Var.W) {
                        rc0Var.W = false;
                        rc0Var.E.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = rc0Var.K;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            rc0Var.K.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((fg0) this.b).y1();
                break;
            case 23:
                ((ng0) this.b).e0();
                break;
            case 24:
                hh0 hh0Var = (hh0) this.b;
                org.telegram.ui.Components.jl0 jl0Var5 = hh0Var.b;
                if (jl0Var5 != null) {
                    int childCount12 = jl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = hh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.z4) {
                            ((org.telegram.ui.Cells.z4) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.r80) {
                            ((org.telegram.ui.Components.r80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.n60 n60Var2 = hh0Var.h0;
                if (n60Var2 != null) {
                    n60Var2.b0();
                    break;
                }
                break;
            case 25:
                si0 si0Var = (si0) this.b;
                org.telegram.ui.Components.jl0 jl0Var6 = si0Var.f;
                if (jl0Var6 != null) {
                    int childCount13 = jl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        si0Var.d0(si0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = si0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        si0Var.d0(si0Var.f.V(i28));
                    }
                    int cachedChildCount = si0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        si0Var.d0(si0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = si0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        si0Var.d0(si0Var.f.O(i30));
                    }
                    si0Var.f.getRecycledViewPool().a();
                }
                tf.f fVar2 = si0Var.Y;
                if (fVar2 != null) {
                    fVar2.g = true;
                }
                View subtitleTextView = si0Var.X.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
                    ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Pi, si0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.jl0 jl0Var7 = notificationsCustomSettingsActivity.a;
                if (jl0Var7 != null) {
                    int childCount14 = jl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.sa) {
                            ((org.telegram.ui.Cells.sa) childAt13).j(0);
                        }
                    }
                    break;
                }
                break;
            case 27:
                ((yo0) this.b).z0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                bx0 bx0Var = (bx0) this.b;
                org.telegram.ui.Components.jl0 jl0Var8 = bx0Var.a;
                if (jl0Var8 != null) {
                    int childCount15 = jl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = bx0Var.a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.z4) {
                            ((org.telegram.ui.Cells.z4) childAt14).c(0);
                        }
                    }
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void A(float f9) {
    }

    private final /* synthetic */ void B(float f9) {
    }

    private final /* synthetic */ void C(float f9) {
    }

    private final /* synthetic */ void D(float f9) {
    }

    private final /* synthetic */ void E(float f9) {
    }

    private final /* synthetic */ void F(float f9) {
    }

    private final /* synthetic */ void c(float f9) {
    }

    private final /* synthetic */ void d(float f9) {
    }

    private final /* synthetic */ void e(float f9) {
    }

    private final /* synthetic */ void f(float f9) {
    }

    private final /* synthetic */ void g(float f9) {
    }

    private final /* synthetic */ void h(float f9) {
    }

    private final /* synthetic */ void i(float f9) {
    }

    private final /* synthetic */ void j(float f9) {
    }

    private final /* synthetic */ void k(float f9) {
    }

    private final /* synthetic */ void l(float f9) {
    }

    private final /* synthetic */ void m(float f9) {
    }

    private final /* synthetic */ void n(float f9) {
    }

    private final /* synthetic */ void o(float f9) {
    }

    private final /* synthetic */ void p(float f9) {
    }

    private final /* synthetic */ void q(float f9) {
    }

    private final /* synthetic */ void r(float f9) {
    }

    private final /* synthetic */ void s(float f9) {
    }

    private final /* synthetic */ void t(float f9) {
    }

    private final /* synthetic */ void u(float f9) {
    }

    private final /* synthetic */ void v(float f9) {
    }

    private final /* synthetic */ void w(float f9) {
    }

    private final /* synthetic */ void x(float f9) {
    }

    private final /* synthetic */ void y(float f9) {
    }

    private final /* synthetic */ void z(float f9) {
    }
}
