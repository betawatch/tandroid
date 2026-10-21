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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void b() {
        jh.b bVar;
        jh.a aVar;
        dh.d dVar;
        switch (this.a) {
            case 0:
                ((h) this.b).b0();
                break;
            case 1:
                vu vuVar = ((c7) this.b).T;
                if (vuVar != null) {
                    vuVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
                    break;
                }
                break;
            case 2:
                m9.U((m9) this.b);
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
                qn qnVar = (qn) this.b;
                bj bjVar = qnVar.w;
                if (bjVar != null) {
                    bjVar.b();
                }
                bj bjVar2 = qnVar.x;
                if (bjVar2 != null) {
                    bjVar2.b();
                }
                fk fkVar = qnVar.Y;
                if (fkVar != null) {
                    fkVar.d();
                }
                ci.b3 b3Var = qnVar.J1;
                if (b3Var != null) {
                    b3Var.e1();
                }
                nj njVar = qnVar.x0;
                if (njVar != null) {
                    int childCount2 = njVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = qnVar.x0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.u1 u1Var = qnVar.L3;
                if (u1Var != null) {
                    int childCount3 = u1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = qnVar.L3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (qnVar.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.e1[] e1VarArr = qnVar.S8;
                        if (i13 < e1VarArr.length) {
                            e1VarArr[i13].c(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.E8), qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.F8));
                            qnVar.S8[i13].setSelectorColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = qnVar.Q8;
                if (m1Var != null) {
                    View contentView = m1Var.getContentView();
                    contentView.setBackgroundColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.qg0 qg0Var = qnVar.z2;
                if (qg0Var != null) {
                    qg0Var.d();
                }
                gk gkVar = qnVar.Z;
                if (gkVar != null && gkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.nd ndVar : qnVar.Z.getEditView().a) {
                        ndVar.d();
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var = qnVar.h0;
                if (u0Var != null) {
                    u0Var.N();
                }
                zj zjVar = qnVar.X1;
                if (zjVar != null) {
                    zjVar.q();
                }
                hj hjVar = qnVar.a1;
                if (hjVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = hjVar.d0;
                    org.telegram.ui.Components.hx0 hx0Var = hjVar.N;
                    if (hx0Var != null) {
                        hx0Var.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.pa, d6Var));
                    }
                    Drawable drawable = hjVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.p5 p5Var = hjVar.g0;
                    if (p5Var != null) {
                        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, d6Var)));
                    }
                    org.telegram.ui.Components.p5 p5Var2 = hjVar.f0;
                    if (p5Var2 != null) {
                        p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, d6Var)));
                    }
                    Drawable drawable2 = hjVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = hjVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    hjVar.invalidate();
                }
                jm jmVar = qnVar.X0;
                if (jmVar != null) {
                    jmVar.N();
                    ai.ic icVar = qnVar.X0.L;
                    if (icVar != null) {
                        icVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = qnVar.M0;
                if (chVar != null) {
                    dh.d dVar2 = chVar.s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.iz0 iz0Var = qnVar.d1;
                if (iz0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = iz0Var.b;
                    Paint paint = iz0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Be, d6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.h6.E4;
                    int i14 = org.telegram.ui.ActionBar.h6.Be;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i14, d6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    org.telegram.ui.ActionBar.h6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, d6Var2), mode));
                }
                hj hjVar2 = qnVar.a1;
                if (hjVar2 != null && hjVar2.getTimeItem() != null) {
                    qnVar.a1.getTimeItem().invalidate();
                }
                ih.f fVar = qnVar.S;
                if (fVar != null) {
                    fVar.f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                kh.h hVar = qnVar.j1;
                if (hVar != null) {
                    for (androidx.biometric.e eVar : hVar.e) {
                        if (eVar != null && (aVar = (bVar = (jh.b) eVar.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                jk jkVar = qnVar.O0;
                if (jkVar != null) {
                    for (androidx.activity.o oVar : jkVar.a) {
                        if (oVar != null) {
                            ((jh.a) oVar.b).g();
                        }
                    }
                }
                Iterator it = qnVar.E.iterator();
                while (it.hasNext()) {
                    ((dh.d) it.next()).v();
                }
                qnVar.s9();
                break;
            case 5:
                ci.k4 k4Var = ((io) this.b).e;
                if (k4Var != null) {
                    k4Var.invalidate();
                    break;
                }
                break;
            case 6:
                wo woVar = (wo) this.b;
                LinearLayout linearLayout2 = woVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = woVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.n, nVar2.f);
                            nVar2.a.invalidate();
                        }
                    }
                }
                woVar.G.f();
                org.telegram.ui.Components.l70 l70Var = woVar.p0;
                if (l70Var != null) {
                    l70Var.d();
                    break;
                }
                break;
            case 7:
                ip ipVar = (ip) this.b;
                org.telegram.ui.Components.jm0 jm0Var = ipVar.b;
                if (jm0Var != null) {
                    int childCount5 = jm0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = ipVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((pp) this.b).W();
                break;
            case 9:
                bq bqVar = (bq) this.b;
                ai.u1 u1Var2 = bqVar.b;
                if (u1Var2 != null) {
                    int childCount6 = u1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = bqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                hr hrVar = (hr) this.b;
                ai.u1 u1Var3 = hrVar.c;
                if (u1Var3 != null) {
                    int childCount7 = u1Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = hrVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                fs.W((fs) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                n00 n00Var = (n00) this.b;
                ai.u1 u1Var4 = n00Var.a;
                if (u1Var4 != null) {
                    int childCount8 = u1Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = n00Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                ci.i3 i3Var = ((e10) this.b).m0;
                if (i3Var != null && (dVar = (dh.d) i3Var.c) != null) {
                    dVar.v();
                    break;
                }
                break;
            case 15:
                ((y10) this.b).w0();
                break;
            case 16:
                l60 l60Var = (l60) this.b;
                org.telegram.ui.Components.jm0 jm0Var2 = l60Var.n;
                if (jm0Var2 != null) {
                    int childCount9 = jm0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = l60Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.k20 k20Var = l60Var.f;
                if (k20Var != null) {
                    k20Var.d();
                }
                org.telegram.ui.Components.h20 h20Var = l60Var.y;
                if (h20Var != null) {
                    h20Var.g();
                    break;
                }
                break;
            case 17:
                s60 s60Var = (s60) this.b;
                org.telegram.ui.Components.jm0 jm0Var3 = s60Var.b;
                if (jm0Var3 != null) {
                    int childCount10 = jm0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = s60Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.h20 h20Var2 = s60Var.v;
                if (h20Var2 != null) {
                    h20Var2.g();
                    break;
                }
                break;
            case 18:
                ((j70) this.b).V(true);
                break;
            case 19:
                r70 r70Var = (r70) this.b;
                org.telegram.ui.Components.jm0 jm0Var4 = r70Var.h;
                if (jm0Var4 != null) {
                    int childCount11 = jm0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = r70Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                ab0 ab0Var = (ab0) this.b;
                org.telegram.ui.Cells.d9 d9Var = ab0Var.G;
                if (d9Var != null) {
                    d9Var.getContext();
                    wa0 wa0Var = ab0Var.F;
                    int i23 = org.telegram.ui.ActionBar.h6.G6;
                    wa0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                    wa0 wa0Var2 = ab0Var.F;
                    int i24 = org.telegram.ui.ActionBar.h6.y6;
                    wa0Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    ab0Var.w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                    ab0Var.w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    org.telegram.ui.Cells.ba baVar = ab0Var.I;
                    if (baVar != null) {
                        baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
                    }
                    ab0Var.M.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    ab0Var.K.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                    ab0Var.K.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    break;
                }
                break;
            case 21:
                nc0 nc0Var = (nc0) this.b;
                nc0Var.d.setIconColor(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ui));
                nc0Var.d.B(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                nc0Var.d.G(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
                nc0Var.d.G(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
                nc0Var.s.setColorFilter(new PorterDuffColorFilter(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5), PorterDuff.Mode.MULTIPLY));
                nc0Var.v.invalidate();
                if (nc0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!nc0Var.a0) {
                            nc0Var.a0 = true;
                            nc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = nc0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                nc0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (nc0Var.a0) {
                        nc0Var.a0 = false;
                        nc0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = nc0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            nc0Var.O.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((dg0) this.b).y1();
                break;
            case 23:
                ((ng0) this.b).e0();
                break;
            case 24:
                ih0 ih0Var = (ih0) this.b;
                org.telegram.ui.Components.jm0 jm0Var5 = ih0Var.b;
                if (jm0Var5 != null) {
                    int childCount12 = jm0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = ih0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.q90) {
                            ((org.telegram.ui.Components.q90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.l70 l70Var2 = ih0Var.l0;
                if (l70Var2 != null) {
                    l70Var2.d();
                    break;
                }
                break;
            case 25:
                ui0 ui0Var = (ui0) this.b;
                org.telegram.ui.Components.jm0 jm0Var6 = ui0Var.f;
                if (jm0Var6 != null) {
                    int childCount13 = jm0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        ui0Var.d0(ui0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = ui0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        ui0Var.d0(ui0Var.f.V(i28));
                    }
                    int cachedChildCount = ui0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        ui0Var.d0(ui0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = ui0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        ui0Var.d0(ui0Var.f.O(i30));
                    }
                    ui0Var.f.getRecycledViewPool().a();
                }
                jg.f fVar2 = ui0Var.c0;
                if (fVar2 != null) {
                    fVar2.a = true;
                }
                View subtitleTextView = ui0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Pi, ui0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.jm0 jm0Var7 = notificationsCustomSettingsActivity.a;
                if (jm0Var7 != null) {
                    int childCount14 = jm0Var7.getChildCount();
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
                ((ip0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                kx0 kx0Var = (kx0) this.b;
                org.telegram.ui.Components.jm0 jm0Var8 = kx0Var.a;
                if (jm0Var8 != null) {
                    int childCount15 = jm0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = kx0Var.a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt14).c(0);
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
