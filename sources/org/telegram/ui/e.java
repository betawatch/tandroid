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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                jv jvVar = ((z6) this.b).T;
                if (jvVar != null) {
                    jvVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
                    break;
                }
                break;
            case 2:
                k9.U((k9) this.b);
                break;
            case 3:
                ld ldVar = (ld) this.b;
                LinearLayout linearLayout = ldVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = ldVar.L.getChildAt(i10);
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
                bo boVar = (bo) this.b;
                jj jjVar = boVar.w;
                if (jjVar != null) {
                    jjVar.d();
                }
                jj jjVar2 = boVar.x;
                if (jjVar2 != null) {
                    jjVar2.d();
                }
                mk mkVar = boVar.Y;
                if (mkVar != null) {
                    mkVar.e();
                }
                ai.g4 g4Var = boVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                uj ujVar = boVar.x0;
                if (ujVar != null) {
                    int childCount2 = ujVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = boVar.x0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = boVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = boVar.L3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (boVar.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = boVar.S8;
                        if (i13 < f1VarArr.length) {
                            f1VarArr[i13].c(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.E8), boVar.getThemedColor(org.telegram.ui.ActionBar.i6.F8));
                            boVar.S8[i13].setSelectorColor(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = boVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.vf0 vf0Var = boVar.z2;
                if (vf0Var != null) {
                    vf0Var.d();
                }
                ok okVar = boVar.Z;
                if (okVar != null && okVar.getEditView() != null) {
                    for (org.telegram.ui.Components.md mdVar : boVar.Z.getEditView().a) {
                        mdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = boVar.h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                hk hkVar = boVar.X1;
                if (hkVar != null) {
                    hkVar.q();
                }
                pj pjVar = boVar.a1;
                if (pjVar != null) {
                    org.telegram.ui.ActionBar.e6 e6Var = pjVar.d0;
                    org.telegram.ui.Components.lw0 lw0Var = pjVar.N;
                    if (lw0Var != null) {
                        lw0Var.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.pa, e6Var));
                    }
                    Drawable drawable = pjVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.m5 m5Var = pjVar.g0;
                    if (m5Var != null) {
                        m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.zh, e6Var)));
                    }
                    org.telegram.ui.Components.m5 m5Var2 = pjVar.f0;
                    if (m5Var2 != null) {
                        m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.zh, e6Var)));
                    }
                    Drawable drawable2 = pjVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = pjVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ah, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    pjVar.invalidate();
                }
                tm tmVar = boVar.X0;
                if (tmVar != null) {
                    tmVar.N();
                    ci.eb ebVar = boVar.X0.L;
                    if (ebVar != null) {
                        ebVar.invalidate();
                    }
                }
                org.telegram.ui.Components.bh bhVar = boVar.M0;
                if (bhVar != null) {
                    ch.d dVar2 = bhVar.s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                    bhVar.invalidate();
                }
                org.telegram.ui.Components.ny0 ny0Var = boVar.d1;
                if (ny0Var != null) {
                    org.telegram.ui.ActionBar.e6 e6Var2 = ny0Var.b;
                    Paint paint = ny0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Be, e6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.i6.E4;
                    int i14 = org.telegram.ui.ActionBar.i6.Be;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i14, e6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.i6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i14, e6Var2), mode));
                }
                pj pjVar2 = boVar.a1;
                if (pjVar2 != null && pjVar2.getTimeItem() != null) {
                    boVar.a1.getTimeItem().invalidate();
                }
                hh.g gVar = boVar.S;
                if (gVar != null) {
                    gVar.f.v();
                    gVar.h.v();
                    gVar.invalidate();
                }
                jh.h hVar = boVar.j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                rk rkVar = boVar.O0;
                if (rkVar != null) {
                    for (androidx.activity.n nVar2 : rkVar.a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.c).g();
                        }
                    }
                }
                Iterator it = boVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                boVar.n9();
                break;
            case 5:
                ai.z5 z5Var = ((wo) this.b).e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    break;
                }
                break;
            case 6:
                kp kpVar = (kp) this.b;
                LinearLayout linearLayout2 = kpVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = kpVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.n, nVar3.f);
                            nVar3.a.invalidate();
                        }
                    }
                }
                kpVar.G.f();
                org.telegram.ui.Components.r60 r60Var = kpVar.p0;
                if (r60Var != null) {
                    r60Var.b0();
                    break;
                }
                break;
            case 7:
                wp wpVar = (wp) this.b;
                org.telegram.ui.Components.ll0 ll0Var = wpVar.b;
                if (ll0Var != null) {
                    int childCount5 = ll0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = wpVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((dq) this.b).W();
                break;
            case 9:
                pq pqVar = (pq) this.b;
                ai.w0 w0Var2 = pqVar.b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = pqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                ur urVar = (ur) this.b;
                ai.w0 w0Var3 = urVar.c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = urVar.c.getChildAt(i18);
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
                        if (childAt8 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt8).j(0);
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
                org.telegram.ui.Components.ll0 ll0Var2 = e70Var.n;
                if (ll0Var2 != null) {
                    int childCount9 = ll0Var2.getChildCount();
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
                org.telegram.ui.Components.ll0 ll0Var3 = l70Var.b;
                if (ll0Var3 != null) {
                    int childCount10 = ll0Var3.getChildCount();
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
                org.telegram.ui.Components.ll0 ll0Var4 = l80Var.h;
                if (ll0Var4 != null) {
                    int childCount11 = ll0Var4.getChildCount();
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
                xb0 xb0Var = (xb0) this.b;
                org.telegram.ui.Cells.e9 e9Var = xb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    tb0 tb0Var = xb0Var.F;
                    int i23 = org.telegram.ui.ActionBar.i6.G6;
                    tb0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i23, false));
                    tb0 tb0Var2 = xb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.i6.y6;
                    tb0Var2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    xb0Var.w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i23, false));
                    xb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    org.telegram.ui.Cells.ea eaVar = xb0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p7, false));
                    }
                    xb0Var.M.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    xb0Var.K.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i23, false));
                    xb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                id0 id0Var = (id0) this.b;
                id0Var.d.setIconColor(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ui));
                id0Var.d.B(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                id0Var.d.G(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true);
                id0Var.d.G(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
                id0Var.s.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5), PorterDuff.Mode.MULTIPLY));
                id0Var.v.invalidate();
                if (id0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
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
                ((wg0) this.b).y1();
                break;
            case 23:
                ((eh0) this.b).e0();
                break;
            case 24:
                yh0 yh0Var = (yh0) this.b;
                org.telegram.ui.Components.ll0 ll0Var5 = yh0Var.b;
                if (ll0Var5 != null) {
                    int childCount12 = ll0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = yh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.v80) {
                            ((org.telegram.ui.Components.v80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.r60 r60Var2 = yh0Var.l0;
                if (r60Var2 != null) {
                    r60Var2.b0();
                    break;
                }
                break;
            case 25:
                jj0 jj0Var = (jj0) this.b;
                org.telegram.ui.Components.ll0 ll0Var6 = jj0Var.f;
                if (ll0Var6 != null) {
                    int childCount13 = ll0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        jj0Var.d0(jj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = jj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        jj0Var.d0(jj0Var.f.V(i28));
                    }
                    int cachedChildCount = jj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        jj0Var.d0(jj0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = jj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        jj0Var.d0(jj0Var.f.O(i30));
                    }
                    jj0Var.f.getRecycledViewPool().a();
                }
                ig.f fVar = jj0Var.c0;
                if (fVar != null) {
                    fVar.g = true;
                }
                View subtitleTextView = jj0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Pi, jj0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.ll0 ll0Var7 = notificationsCustomSettingsActivity.a;
                if (ll0Var7 != null) {
                    int childCount14 = ll0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt13).j(0);
                        }
                    }
                    break;
                }
                break;
            case 27:
                ((aq0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                gy0 gy0Var = (gy0) this.b;
                org.telegram.ui.Components.ll0 ll0Var8 = gy0Var.a;
                if (ll0Var8 != null) {
                    int childCount15 = ll0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = gy0Var.a.getChildAt(i32);
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
