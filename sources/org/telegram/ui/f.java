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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements org.telegram.ui.ActionBar.l6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final /* synthetic */ void a(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final void b() {
        wg.b bVar;
        wg.a aVar;
        qg.b bVar2;
        switch (this.a) {
            case 0:
                ((i) this.b).c0();
                break;
            case 1:
                hv hvVar = ((b7) this.b).Q;
                if (hvVar != null) {
                    hvVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
                    break;
                }
                break;
            case 2:
                l9.U((l9) this.b);
                break;
            case 3:
                nd ndVar = (nd) this.b;
                LinearLayout linearLayout = ndVar.I;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = ndVar.I.getChildAt(i10);
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
                xn xnVar = (xn) this.b;
                fj fjVar = xnVar.w;
                if (fjVar != null) {
                    fjVar.b();
                }
                fj fjVar2 = xnVar.x;
                if (fjVar2 != null) {
                    fjVar2.b();
                }
                jk jkVar = xnVar.V;
                if (jkVar != null) {
                    jkVar.e();
                }
                oh.u2 u2Var = xnVar.G1;
                if (u2Var != null) {
                    u2Var.c1();
                }
                qj qjVar = xnVar.u0;
                if (qjVar != null) {
                    int childCount2 = qjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = xnVar.u0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                mh.d1 d1Var = xnVar.I3;
                if (d1Var != null) {
                    int childCount3 = d1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = xnVar.I3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (xnVar.P8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = xnVar.P8;
                        if (i13 < g1VarArr.length) {
                            g1VarArr[i13].c(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.E8), xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.F8));
                            xnVar.P8[i13].setSelectorColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
                if (p1Var != null) {
                    View contentView = p1Var.getContentView();
                    contentView.setBackgroundColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.cg0 cg0Var = xnVar.w2;
                if (cg0Var != null) {
                    cg0Var.d();
                }
                lk lkVar = xnVar.W;
                if (lkVar != null && lkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.ed edVar : xnVar.W.getEditView().a) {
                        edVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.e0;
                if (w0Var != null) {
                    w0Var.N();
                }
                dk dkVar = xnVar.U1;
                if (dkVar != null) {
                    dkVar.p();
                }
                lj ljVar = xnVar.X0;
                if (ljVar != null) {
                    org.telegram.ui.ActionBar.g6 g6Var = ljVar.a0;
                    org.telegram.ui.Components.nw0 nw0Var = ljVar.K;
                    if (nw0Var != null) {
                        nw0Var.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.pa, g6Var));
                    }
                    Drawable drawable = ljVar.n0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.j5 j5Var = ljVar.d0;
                    if (j5Var != null) {
                        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var)));
                    }
                    org.telegram.ui.Components.j5 j5Var2 = ljVar.c0;
                    if (j5Var2 != null) {
                        j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var)));
                    }
                    Drawable drawable2 = ljVar.o0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ljVar.p0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ah, g6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ljVar.invalidate();
                }
                pm pmVar = xnVar.U0;
                if (pmVar != null) {
                    pmVar.N();
                    fg.h0 h0Var = xnVar.U0.I;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                }
                org.telegram.ui.Components.sg sgVar = xnVar.J0;
                if (sgVar != null) {
                    qg.b bVar3 = sgVar.s;
                    if (bVar3 != null) {
                        bVar3.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    sgVar.invalidate();
                }
                org.telegram.ui.Components.ry0 ry0Var = xnVar.a1;
                if (ry0Var != null) {
                    org.telegram.ui.ActionBar.g6 g6Var2 = ry0Var.b;
                    Paint paint = ry0Var.L;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Be, g6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.k6.E4;
                    int i14 = org.telegram.ui.ActionBar.k6.Be;
                    int v02 = org.telegram.ui.ActionBar.k6.v0(i14, g6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.k6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, g6Var2), mode));
                }
                lj ljVar2 = xnVar.X0;
                if (ljVar2 != null && ljVar2.getTimeItem() != null) {
                    xnVar.X0.getTimeItem().invalidate();
                }
                vg.f fVar = xnVar.P;
                if (fVar != null) {
                    fVar.f.u();
                    fVar.h.u();
                    fVar.invalidate();
                }
                xg.g gVar = xnVar.g1;
                if (gVar != null) {
                    for (s5.m mVar : gVar.e) {
                        if (mVar != null && (aVar = (bVar = (wg.b) mVar.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ok okVar = xnVar.L0;
                if (okVar != null) {
                    for (androidx.activity.o oVar : okVar.a) {
                        if (oVar != null) {
                            ((wg.a) oVar.b).g();
                        }
                    }
                }
                Iterator it = xnVar.B.iterator();
                while (it.hasNext()) {
                    ((qg.b) it.next()).u();
                }
                xnVar.n9();
                break;
            case 5:
                oh.a4 a4Var = ((po) this.b).e;
                if (a4Var != null) {
                    a4Var.invalidate();
                    break;
                }
                break;
            case 6:
                ep epVar = (ep) this.b;
                LinearLayout linearLayout2 = epVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = epVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.n, nVar2.f);
                            nVar2.a.invalidate();
                        }
                    }
                }
                epVar.D.f();
                org.telegram.ui.Components.u60 u60Var = epVar.m0;
                if (u60Var != null) {
                    u60Var.b0();
                    break;
                }
                break;
            case 7:
                rp rpVar = (rp) this.b;
                org.telegram.ui.Components.tl0 tl0Var = rpVar.b;
                if (tl0Var != null) {
                    int childCount5 = tl0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = rpVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((yp) this.b).W();
                break;
            case 9:
                kq kqVar = (kq) this.b;
                mh.d1 d1Var2 = kqVar.b;
                if (d1Var2 != null) {
                    int childCount6 = d1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = kqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                qr qrVar = (qr) this.b;
                mh.d1 d1Var3 = qrVar.c;
                if (d1Var3 != null) {
                    int childCount7 = d1Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = qrVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                os.W((os) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                b10 b10Var = (b10) this.b;
                mh.d1 d1Var4 = b10Var.a;
                if (d1Var4 != null) {
                    int childCount8 = d1Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = b10Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                oh.b3 b3Var = ((t10) this.b).j0;
                if (b3Var != null && (bVar2 = (qg.b) b3Var.c) != null) {
                    bVar2.u();
                    break;
                }
                break;
            case 15:
                ((m20) this.b).v0();
                break;
            case 16:
                z60 z60Var = (z60) this.b;
                org.telegram.ui.Components.tl0 tl0Var2 = z60Var.n;
                if (tl0Var2 != null) {
                    int childCount9 = tl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = z60Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.d20 d20Var = z60Var.f;
                if (d20Var != null) {
                    d20Var.e();
                }
                org.telegram.ui.Components.a20 a20Var = z60Var.y;
                if (a20Var != null) {
                    a20Var.g();
                    break;
                }
                break;
            case 17:
                f70 f70Var = (f70) this.b;
                org.telegram.ui.Components.tl0 tl0Var3 = f70Var.b;
                if (tl0Var3 != null) {
                    int childCount10 = tl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = f70Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.a20 a20Var2 = f70Var.v;
                if (a20Var2 != null) {
                    a20Var2.g();
                    break;
                }
                break;
            case 18:
                ((v70) this.b).V(true);
                break;
            case 19:
                d80 d80Var = (d80) this.b;
                org.telegram.ui.Components.tl0 tl0Var4 = d80Var.h;
                if (tl0Var4 != null) {
                    int childCount11 = tl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = d80Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                ob0 ob0Var = (ob0) this.b;
                org.telegram.ui.Cells.a9 a9Var = ob0Var.D;
                if (a9Var != null) {
                    a9Var.getContext();
                    kb0 kb0Var = ob0Var.C;
                    int i23 = org.telegram.ui.ActionBar.k6.G6;
                    kb0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i23, false));
                    kb0 kb0Var2 = ob0Var.C;
                    int i24 = org.telegram.ui.ActionBar.k6.y6;
                    kb0Var2.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
                    ob0Var.w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i23, false));
                    ob0Var.w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
                    org.telegram.ui.Cells.aa aaVar = ob0Var.F;
                    if (aaVar != null) {
                        aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
                    }
                    ob0Var.J.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                    ob0Var.H.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i23, false));
                    ob0Var.H.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                bd0 bd0Var = (bd0) this.b;
                bd0Var.d.setIconColor(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.ui));
                bd0Var.d.B(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                bd0Var.d.G(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.F8), true);
                bd0Var.d.G(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
                bd0Var.s.setColorFilter(new PorterDuffColorFilter(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5), PorterDuff.Mode.MULTIPLY));
                bd0Var.v.invalidate();
                if (bd0Var.F != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!bd0Var.X) {
                            bd0Var.X = true;
                            bd0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = bd0Var.L;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                bd0Var.L.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (bd0Var.X) {
                        bd0Var.X = false;
                        bd0Var.F.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = bd0Var.L;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            bd0Var.L.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((og0) this.b).y1();
                break;
            case 23:
                ((wg0) this.b).e0();
                break;
            case 24:
                qh0 qh0Var = (qh0) this.b;
                org.telegram.ui.Components.tl0 tl0Var5 = qh0Var.b;
                if (tl0Var5 != null) {
                    int childCount12 = tl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = qh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.y80) {
                            ((org.telegram.ui.Components.y80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.u60 u60Var2 = qh0Var.i0;
                if (u60Var2 != null) {
                    u60Var2.b0();
                    break;
                }
                break;
            case 25:
                bj0 bj0Var = (bj0) this.b;
                org.telegram.ui.Components.tl0 tl0Var6 = bj0Var.f;
                if (tl0Var6 != null) {
                    int childCount13 = tl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        bj0Var.d0(bj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = bj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        bj0Var.d0(bj0Var.f.V(i28));
                    }
                    int cachedChildCount = bj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        bj0Var.d0(bj0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = bj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        bj0Var.d0(bj0Var.f.O(i30));
                    }
                    bj0Var.f.getRecycledViewPool().a();
                }
                wf.f fVar2 = bj0Var.Z;
                if (fVar2 != null) {
                    fVar2.g = true;
                }
                View subtitleTextView = bj0Var.Y.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.l5) {
                    ((org.telegram.ui.ActionBar.l5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Pi, bj0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.tl0 tl0Var7 = notificationsCustomSettingsActivity.a;
                if (tl0Var7 != null) {
                    int childCount14 = tl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt13).j(0);
                        }
                    }
                    break;
                }
                break;
            case 27:
                ((ip0) this.b).z0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                ox0 ox0Var = (ox0) this.b;
                org.telegram.ui.Components.tl0 tl0Var8 = ox0Var.a;
                if (tl0Var8 != null) {
                    int childCount15 = tl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = ox0Var.a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt14).c(0);
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
