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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
        jh.b bVar;
        jh.a aVar;
        dh.d dVar;
        switch (this.a) {
            case 0:
                ((h) this.b).b0();
                break;
            case 1:
                ov ovVar = ((d7) this.b).T;
                if (ovVar != null) {
                    ovVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
                    break;
                }
                break;
            case 2:
                n9.U((n9) this.b);
                break;
            case 3:
                sd sdVar = (sd) this.b;
                LinearLayout linearLayout = sdVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = sdVar.L.getChildAt(i10);
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
                fo foVar = (fo) this.b;
                oj ojVar = foVar.w;
                if (ojVar != null) {
                    ojVar.b();
                }
                oj ojVar2 = foVar.x;
                if (ojVar2 != null) {
                    ojVar2.b();
                }
                sk skVar = foVar.Y;
                if (skVar != null) {
                    skVar.d();
                }
                bi.w3 w3Var = foVar.J1;
                if (w3Var != null) {
                    w3Var.e1();
                }
                ak akVar = foVar.x0;
                if (akVar != null) {
                    int childCount2 = akVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = foVar.x0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.x0) {
                            ((org.telegram.ui.Cells.x0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                bi.o0 o0Var = foVar.L3;
                if (o0Var != null) {
                    int childCount3 = o0Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = foVar.L3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (foVar.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.e1[] e1VarArr = foVar.S8;
                        if (i13 < e1VarArr.length) {
                            e1VarArr[i13].c(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.E8), foVar.getThemedColor(org.telegram.ui.ActionBar.g6.F8));
                            foVar.S8[i13].setSelectorColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
                if (m1Var != null) {
                    View contentView = m1Var.getContentView();
                    contentView.setBackgroundColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.vg0 vg0Var = foVar.z2;
                if (vg0Var != null) {
                    vg0Var.d();
                }
                tk tkVar = foVar.Z;
                if (tkVar != null && tkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.pd pdVar : foVar.Z.getEditView().a) {
                        pdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var = foVar.h0;
                if (u0Var != null) {
                    u0Var.N();
                }
                mk mkVar = foVar.X1;
                if (mkVar != null) {
                    mkVar.q();
                }
                uj ujVar = foVar.a1;
                if (ujVar != null) {
                    org.telegram.ui.ActionBar.c6 c6Var = ujVar.d0;
                    org.telegram.ui.Components.kx0 kx0Var = ujVar.N;
                    if (kx0Var != null) {
                        kx0Var.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.pa, c6Var));
                    }
                    Drawable drawable = ujVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.q5 q5Var = ujVar.g0;
                    if (q5Var != null) {
                        q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
                    }
                    org.telegram.ui.Components.q5 q5Var2 = ujVar.f0;
                    if (q5Var2 != null) {
                        q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
                    }
                    Drawable drawable2 = ujVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ujVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ah, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ujVar.invalidate();
                }
                xm xmVar = foVar.X0;
                if (xmVar != null) {
                    xmVar.N();
                    di.ab abVar = foVar.X0.L;
                    if (abVar != null) {
                        abVar.invalidate();
                    }
                }
                org.telegram.ui.Components.dh dhVar = foVar.M0;
                if (dhVar != null) {
                    dh.d dVar2 = dhVar.s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    dhVar.invalidate();
                }
                org.telegram.ui.Components.kz0 kz0Var = foVar.d1;
                if (kz0Var != null) {
                    org.telegram.ui.ActionBar.c6 c6Var2 = kz0Var.b;
                    Paint paint = kz0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Be, c6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.g6.E4;
                    int i14 = org.telegram.ui.ActionBar.g6.Be;
                    int w02 = org.telegram.ui.ActionBar.g6.w0(i14, c6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    org.telegram.ui.ActionBar.g6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i14, c6Var2), mode));
                }
                uj ujVar2 = foVar.a1;
                if (ujVar2 != null && ujVar2.getTimeItem() != null) {
                    foVar.a1.getTimeItem().invalidate();
                }
                ih.f fVar = foVar.S;
                if (fVar != null) {
                    fVar.f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                kh.h hVar = foVar.j1;
                if (hVar != null) {
                    for (androidx.biometric.e eVar : hVar.e) {
                        if (eVar != null && (aVar = (bVar = (jh.b) eVar.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                wk wkVar = foVar.O0;
                if (wkVar != null) {
                    for (androidx.activity.o oVar : wkVar.a) {
                        if (oVar != null) {
                            ((jh.a) oVar.b).g();
                        }
                    }
                }
                Iterator it = foVar.E.iterator();
                while (it.hasNext()) {
                    ((dh.d) it.next()).v();
                }
                foVar.s9();
                break;
            case 5:
                bi.k5 k5Var = ((zo) this.b).e;
                if (k5Var != null) {
                    k5Var.invalidate();
                    break;
                }
                break;
            case 6:
                np npVar = (np) this.b;
                LinearLayout linearLayout2 = npVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = npVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.n, nVar2.f);
                            nVar2.a.invalidate();
                        }
                    }
                }
                npVar.G.f();
                org.telegram.ui.Components.p70 p70Var = npVar.p0;
                if (p70Var != null) {
                    p70Var.d();
                    break;
                }
                break;
            case 7:
                aq aqVar = (aq) this.b;
                org.telegram.ui.Components.mm0 mm0Var = aqVar.b;
                if (mm0Var != null) {
                    int childCount5 = mm0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = aqVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((hq) this.b).W();
                break;
            case 9:
                tq tqVar = (tq) this.b;
                bi.o0 o0Var2 = tqVar.b;
                if (o0Var2 != null) {
                    int childCount6 = o0Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = tqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                yr yrVar = (yr) this.b;
                bi.o0 o0Var3 = yrVar.c;
                if (o0Var3 != null) {
                    int childCount7 = o0Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = yrVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                ws.W((ws) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                l10 l10Var = (l10) this.b;
                bi.o0 o0Var4 = l10Var.a;
                if (o0Var4 != null) {
                    int childCount8 = o0Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = l10Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                bi.d4 d4Var = ((c20) this.b).m0;
                if (d4Var != null && (dVar = (dh.d) d4Var.c) != null) {
                    dVar.v();
                    break;
                }
                break;
            case 15:
                ((v20) this.b).w0();
                break;
            case 16:
                j70 j70Var = (j70) this.b;
                org.telegram.ui.Components.mm0 mm0Var2 = j70Var.n;
                if (mm0Var2 != null) {
                    int childCount9 = mm0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = j70Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.o20 o20Var = j70Var.f;
                if (o20Var != null) {
                    o20Var.d();
                }
                org.telegram.ui.Components.l20 l20Var = j70Var.y;
                if (l20Var != null) {
                    l20Var.g();
                    break;
                }
                break;
            case 17:
                p70 p70Var2 = (p70) this.b;
                org.telegram.ui.Components.mm0 mm0Var3 = p70Var2.b;
                if (mm0Var3 != null) {
                    int childCount10 = mm0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = p70Var2.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.l20 l20Var2 = p70Var2.v;
                if (l20Var2 != null) {
                    l20Var2.g();
                    break;
                }
                break;
            case 18:
                ((h80) this.b).V(true);
                break;
            case 19:
                p80 p80Var = (p80) this.b;
                org.telegram.ui.Components.mm0 mm0Var4 = p80Var.h;
                if (mm0Var4 != null) {
                    int childCount11 = mm0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = p80Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                ac0 ac0Var = (ac0) this.b;
                org.telegram.ui.Cells.e9 e9Var = ac0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    wb0 wb0Var = ac0Var.F;
                    int i23 = org.telegram.ui.ActionBar.g6.G6;
                    wb0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i23, false));
                    wb0 wb0Var2 = ac0Var.F;
                    int i24 = org.telegram.ui.ActionBar.g6.y6;
                    wb0Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i24, false));
                    ac0Var.w.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i23, false));
                    ac0Var.w.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i24, false));
                    org.telegram.ui.Cells.ca caVar = ac0Var.I;
                    if (caVar != null) {
                        caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
                    }
                    ac0Var.M.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    ac0Var.K.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i23, false));
                    ac0Var.K.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i24, false));
                    break;
                }
                break;
            case 21:
                nd0 nd0Var = (nd0) this.b;
                nd0Var.d.setIconColor(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ui));
                nd0Var.d.B(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                nd0Var.d.G(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true);
                nd0Var.d.G(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
                nd0Var.s.setColorFilter(new PorterDuffColorFilter(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5), PorterDuff.Mode.MULTIPLY));
                nd0Var.v.invalidate();
                if (nd0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!nd0Var.a0) {
                            nd0Var.a0 = true;
                            nd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = nd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                nd0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (nd0Var.a0) {
                        nd0Var.a0 = false;
                        nd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = nd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            nd0Var.O.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((bh0) this.b).y1();
                break;
            case 23:
                ((kh0) this.b).e0();
                break;
            case 24:
                ei0 ei0Var = (ei0) this.b;
                org.telegram.ui.Components.mm0 mm0Var5 = ei0Var.b;
                if (mm0Var5 != null) {
                    int childCount12 = mm0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = ei0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.w90) {
                            ((org.telegram.ui.Components.w90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.p70 p70Var3 = ei0Var.l0;
                if (p70Var3 != null) {
                    p70Var3.d();
                    break;
                }
                break;
            case 25:
                qj0 qj0Var = (qj0) this.b;
                org.telegram.ui.Components.mm0 mm0Var6 = qj0Var.f;
                if (mm0Var6 != null) {
                    int childCount13 = mm0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        qj0Var.d0(qj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = qj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        qj0Var.d0(qj0Var.f.V(i28));
                    }
                    int cachedChildCount = qj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        qj0Var.d0(qj0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = qj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        qj0Var.d0(qj0Var.f.O(i30));
                    }
                    qj0Var.f.getRecycledViewPool().a();
                }
                jg.f fVar2 = qj0Var.c0;
                if (fVar2 != null) {
                    fVar2.a = true;
                }
                View subtitleTextView = qj0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
                    ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Pi, qj0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.mm0 mm0Var7 = notificationsCustomSettingsActivity.a;
                if (mm0Var7 != null) {
                    int childCount14 = mm0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt13).j(0);
                        }
                    }
                    break;
                }
                break;
            case 27:
                ((gq0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                my0 my0Var = (my0) this.b;
                org.telegram.ui.Components.mm0 mm0Var8 = my0Var.a;
                if (mm0Var8 != null) {
                    int childCount15 = mm0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = my0Var.a.getChildAt(i32);
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
