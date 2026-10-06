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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements org.telegram.ui.ActionBar.j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final void b() {
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        switch (this.a) {
            case 0:
                ((h) this.b).c0();
                break;
            case 1:
                jv jvVar = ((a7) this.b).Z;
                if (jvVar != null) {
                    jvVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
                    break;
                }
                break;
            case 2:
                m9.T((m9) this.b);
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
                yn ynVar = (yn) this.b;
                hj hjVar = ynVar.w;
                if (hjVar != null) {
                    hjVar.d();
                }
                hj hjVar2 = ynVar.x;
                if (hjVar2 != null) {
                    hjVar2.d();
                }
                jk jkVar = ynVar.W;
                if (jkVar != null) {
                    jkVar.e();
                }
                ai.g4 g4Var = ynVar.H1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                sj sjVar = ynVar.v0;
                if (sjVar != null) {
                    int childCount2 = sjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = ynVar.v0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = ynVar.J3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = ynVar.J3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (ynVar.Q8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = ynVar.Q8;
                        if (i13 < f1VarArr.length) {
                            f1VarArr[i13].c(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.E8), ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.F8));
                            ynVar.Q8[i13].setSelectorColor(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = ynVar.O8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.ig0 ig0Var = ynVar.x2;
                if (ig0Var != null) {
                    ig0Var.d();
                }
                lk lkVar = ynVar.X;
                if (lkVar != null && lkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.pd pdVar : ynVar.X.getEditView().a) {
                        pdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = ynVar.f0;
                if (v0Var != null) {
                    v0Var.N();
                }
                ek ekVar = ynVar.V1;
                if (ekVar != null) {
                    ekVar.q();
                }
                nj njVar = ynVar.Y0;
                if (njVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = njVar.d0;
                    org.telegram.ui.Components.ix0 ix0Var = njVar.N;
                    if (ix0Var != null) {
                        ix0Var.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.pa, d6Var));
                    }
                    Drawable drawable = njVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.o5 o5Var = njVar.g0;
                    if (o5Var != null) {
                        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.zh, d6Var)));
                    }
                    org.telegram.ui.Components.o5 o5Var2 = njVar.f0;
                    if (o5Var2 != null) {
                        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.zh, d6Var)));
                    }
                    Drawable drawable2 = njVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = njVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    njVar.invalidate();
                }
                qm qmVar = ynVar.V0;
                if (qmVar != null) {
                    qmVar.N();
                    ci.ab abVar = ynVar.V0.L;
                    if (abVar != null) {
                        abVar.invalidate();
                    }
                }
                org.telegram.ui.Components.eh ehVar = ynVar.K0;
                if (ehVar != null) {
                    ch.d dVar2 = ehVar.s;
                    if (dVar2 != null) {
                        dVar2.k();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                    ehVar.invalidate();
                }
                org.telegram.ui.Components.jz0 jz0Var = ynVar.b1;
                if (jz0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = jz0Var.b;
                    Paint paint = jz0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Be, d6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.i6.E4;
                    int i14 = org.telegram.ui.ActionBar.i6.Be;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i14, d6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.i6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i14, d6Var2), mode));
                }
                nj njVar2 = ynVar.Y0;
                if (njVar2 != null && njVar2.getTimeItem() != null) {
                    ynVar.Y0.getTimeItem().invalidate();
                }
                hh.g gVar = ynVar.Q;
                if (gVar != null) {
                    gVar.f.k();
                    gVar.h.k();
                    gVar.invalidate();
                }
                jh.h hVar = ynVar.h1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ok okVar = ynVar.M0;
                if (okVar != null) {
                    for (androidx.activity.n nVar2 : okVar.a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.c).g();
                        }
                    }
                }
                Iterator it = ynVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).k();
                }
                ynVar.V0.invalidate();
                Iterator it2 = ynVar.y.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                break;
            case 5:
                ai.y5 y5Var = ((to) this.b).e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    break;
                }
                break;
            case 6:
                hp hpVar = (hp) this.b;
                LinearLayout linearLayout2 = hpVar.y;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = hpVar.y.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.n, nVar3.f);
                            nVar3.a.invalidate();
                        }
                    }
                }
                hpVar.H.f();
                org.telegram.ui.Components.f70 f70Var = hpVar.q0;
                if (f70Var != null) {
                    f70Var.b0();
                    break;
                }
                break;
            case 7:
                tp tpVar = (tp) this.b;
                org.telegram.ui.Components.zl0 zl0Var = tpVar.b;
                if (zl0Var != null) {
                    int childCount5 = zl0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = tpVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((aq) this.b).h.l();
                break;
            case 9:
                mq mqVar = (mq) this.b;
                ai.w0 w0Var2 = mqVar.b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = mqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                rr rrVar = (rr) this.b;
                ai.w0 w0Var3 = rrVar.c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = rrVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                qs.U((qs) this.b);
                break;
            case 12:
                ContactsActivity.T((ContactsActivity) this.b);
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
                    dVar.k();
                    break;
                }
                break;
            case 15:
                ((r20) this.b).z0();
                break;
            case 16:
                d70 d70Var = (d70) this.b;
                org.telegram.ui.Components.zl0 zl0Var2 = d70Var.n;
                if (zl0Var2 != null) {
                    int childCount9 = zl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = d70Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.f20 f20Var = d70Var.f;
                if (f20Var != null) {
                    f20Var.e();
                }
                org.telegram.ui.Components.c20 c20Var = d70Var.y;
                if (c20Var != null) {
                    c20Var.g();
                    break;
                }
                break;
            case 17:
                k70 k70Var = (k70) this.b;
                org.telegram.ui.Components.zl0 zl0Var3 = k70Var.b;
                if (zl0Var3 != null) {
                    int childCount10 = zl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = k70Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.c20 c20Var2 = k70Var.v;
                if (c20Var2 != null) {
                    c20Var2.g();
                    break;
                }
                break;
            case 18:
                ((c80) this.b).T(true);
                break;
            case 19:
                k80 k80Var = (k80) this.b;
                org.telegram.ui.Components.zl0 zl0Var4 = k80Var.h;
                if (zl0Var4 != null) {
                    int childCount11 = zl0Var4.getChildCount();
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
                vb0 vb0Var = (vb0) this.b;
                org.telegram.ui.Cells.e9 e9Var = vb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    rb0 rb0Var = vb0Var.F;
                    int i23 = org.telegram.ui.ActionBar.i6.G6;
                    rb0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i23, false));
                    rb0 rb0Var2 = vb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.i6.y6;
                    rb0Var2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    vb0Var.w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i23, false));
                    vb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    org.telegram.ui.Cells.ea eaVar = vb0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p7, false));
                    }
                    vb0Var.M.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    vb0Var.K.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i23, false));
                    vb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                gd0 gd0Var = (gd0) this.b;
                gd0Var.d.setIconColor(gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ui));
                gd0Var.d.B(gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                gd0Var.d.G(gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true);
                gd0Var.d.G(gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
                gd0Var.s.setColorFilter(new PorterDuffColorFilter(gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5), PorterDuff.Mode.MULTIPLY));
                gd0Var.v.invalidate();
                if (gd0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!gd0Var.a0) {
                            gd0Var.a0 = true;
                            gd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = gd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                gd0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (gd0Var.a0) {
                        gd0Var.a0 = false;
                        gd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = gd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            gd0Var.O.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((ug0) this.b).y1();
                break;
            case 23:
                ((ch0) this.b).e0();
                break;
            case 24:
                wh0 wh0Var = (wh0) this.b;
                org.telegram.ui.Components.zl0 zl0Var5 = wh0Var.b;
                if (zl0Var5 != null) {
                    int childCount12 = zl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = wh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.j90) {
                            ((org.telegram.ui.Components.j90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.f70 f70Var2 = wh0Var.l0;
                if (f70Var2 != null) {
                    f70Var2.b0();
                    break;
                }
                break;
            case 25:
                hj0 hj0Var = (hj0) this.b;
                org.telegram.ui.Components.zl0 zl0Var6 = hj0Var.f;
                if (zl0Var6 != null) {
                    int childCount13 = zl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        hj0Var.d0(hj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = hj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        hj0Var.d0(hj0Var.f.V(i28));
                    }
                    int cachedChildCount = hj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        hj0Var.d0(hj0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = hj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        hj0Var.d0(hj0Var.f.O(i30));
                    }
                    hj0Var.f.getRecycledViewPool().a();
                }
                ig.f fVar = hj0Var.c0;
                if (fVar != null) {
                    fVar.g = true;
                }
                View subtitleTextView = hj0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.i5) {
                    ((org.telegram.ui.ActionBar.i5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Pi, hj0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.zl0 zl0Var7 = notificationsCustomSettingsActivity.a;
                if (zl0Var7 != null) {
                    int childCount14 = zl0Var7.getChildCount();
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
                ((wp0) this.b).E0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                by0 by0Var = (by0) this.b;
                org.telegram.ui.Components.zl0 zl0Var8 = by0Var.a;
                if (zl0Var8 != null) {
                    int childCount15 = zl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = by0Var.a.getChildAt(i32);
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
