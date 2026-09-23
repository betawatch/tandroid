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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        switch (this.a) {
            case 0:
                ((h) this.b).c0();
                break;
            case 1:
                gv gvVar = ((z6) this.b).T;
                if (gvVar != null) {
                    gvVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false));
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
                xn xnVar = (xn) this.b;
                gj gjVar = xnVar.w;
                if (gjVar != null) {
                    gjVar.d();
                }
                gj gjVar2 = xnVar.x;
                if (gjVar2 != null) {
                    gjVar2.d();
                }
                jk jkVar = xnVar.Y;
                if (jkVar != null) {
                    jkVar.e();
                }
                ai.g4 g4Var = xnVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                rj rjVar = xnVar.x0;
                if (rjVar != null) {
                    int childCount2 = rjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = xnVar.x0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = xnVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = xnVar.L3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (xnVar.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = xnVar.S8;
                        if (i13 < f1VarArr.length) {
                            f1VarArr[i13].c(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.E8), xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.F8));
                            xnVar.S8[i13].setSelectorColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = xnVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.vf0 vf0Var = xnVar.z2;
                if (vf0Var != null) {
                    vf0Var.d();
                }
                lk lkVar = xnVar.Z;
                if (lkVar != null && lkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.od odVar : xnVar.Z.getEditView().a) {
                        odVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = xnVar.h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                ek ekVar = xnVar.X1;
                if (ekVar != null) {
                    ekVar.q();
                }
                mj mjVar = xnVar.a1;
                if (mjVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = mjVar.d0;
                    org.telegram.ui.Components.lw0 lw0Var = mjVar.N;
                    if (lw0Var != null) {
                        lw0Var.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.pa, d6Var));
                    }
                    Drawable drawable = mjVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.o5 o5Var = mjVar.g0;
                    if (o5Var != null) {
                        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.zh, d6Var)));
                    }
                    org.telegram.ui.Components.o5 o5Var2 = mjVar.f0;
                    if (o5Var2 != null) {
                        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.zh, d6Var)));
                    }
                    Drawable drawable2 = mjVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = mjVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    mjVar.invalidate();
                }
                qm qmVar = xnVar.X0;
                if (qmVar != null) {
                    qmVar.N();
                    ci.bb bbVar = xnVar.X0.L;
                    if (bbVar != null) {
                        bbVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = xnVar.M0;
                if (chVar != null) {
                    ch.d dVar2 = chVar.s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.my0 my0Var = xnVar.d1;
                if (my0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = my0Var.b;
                    Paint paint = my0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Be, d6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.h6.E4;
                    int i14 = org.telegram.ui.ActionBar.h6.Be;
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i14, d6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.h6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, d6Var2), mode));
                }
                mj mjVar2 = xnVar.a1;
                if (mjVar2 != null && mjVar2.getTimeItem() != null) {
                    xnVar.a1.getTimeItem().invalidate();
                }
                hh.g gVar = xnVar.S;
                if (gVar != null) {
                    gVar.f.v();
                    gVar.h.v();
                    gVar.invalidate();
                }
                jh.h hVar = xnVar.j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ok okVar = xnVar.O0;
                if (okVar != null) {
                    for (androidx.activity.n nVar2 : okVar.a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.c).g();
                        }
                    }
                }
                Iterator it = xnVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                xnVar.n9();
                break;
            case 5:
                ai.y5 y5Var = ((so) this.b).e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    break;
                }
                break;
            case 6:
                gp gpVar = (gp) this.b;
                LinearLayout linearLayout2 = gpVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = gpVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.n, nVar3.f);
                            nVar3.a.invalidate();
                        }
                    }
                }
                gpVar.G.f();
                org.telegram.ui.Components.s60 s60Var = gpVar.p0;
                if (s60Var != null) {
                    s60Var.b0();
                    break;
                }
                break;
            case 7:
                sp spVar = (sp) this.b;
                org.telegram.ui.Components.ml0 ml0Var = spVar.b;
                if (ml0Var != null) {
                    int childCount5 = ml0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = spVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
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
                ai.w0 w0Var2 = lqVar.b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = lqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                qr qrVar = (qr) this.b;
                ai.w0 w0Var3 = qrVar.c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
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
                ns.W((ns) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                c10 c10Var = (c10) this.b;
                ai.w0 w0Var4 = c10Var.a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = c10Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.bb) {
                            ((org.telegram.ui.Cells.bb) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                ai.n4 n4Var = ((u10) this.b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.c) != null) {
                    dVar.v();
                    break;
                }
                break;
            case 15:
                ((o20) this.b).v0();
                break;
            case 16:
                b70 b70Var = (b70) this.b;
                org.telegram.ui.Components.ml0 ml0Var2 = b70Var.n;
                if (ml0Var2 != null) {
                    int childCount9 = ml0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = b70Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.c20 c20Var = b70Var.f;
                if (c20Var != null) {
                    c20Var.e();
                }
                org.telegram.ui.Components.z10 z10Var = b70Var.y;
                if (z10Var != null) {
                    z10Var.g();
                    break;
                }
                break;
            case 17:
                i70 i70Var = (i70) this.b;
                org.telegram.ui.Components.ml0 ml0Var3 = i70Var.b;
                if (ml0Var3 != null) {
                    int childCount10 = ml0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = i70Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.z10 z10Var2 = i70Var.v;
                if (z10Var2 != null) {
                    z10Var2.g();
                    break;
                }
                break;
            case 18:
                ((a80) this.b).V(true);
                break;
            case 19:
                i80 i80Var = (i80) this.b;
                org.telegram.ui.Components.ml0 ml0Var4 = i80Var.h;
                if (ml0Var4 != null) {
                    int childCount11 = ml0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = i80Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                sb0 sb0Var = (sb0) this.b;
                org.telegram.ui.Cells.f9 f9Var = sb0Var.G;
                if (f9Var != null) {
                    f9Var.getContext();
                    ob0 ob0Var = sb0Var.F;
                    int i23 = org.telegram.ui.ActionBar.h6.G6;
                    ob0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i23, false));
                    ob0 ob0Var2 = sb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.h6.y6;
                    ob0Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    sb0Var.w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i23, false));
                    sb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    org.telegram.ui.Cells.fa faVar = sb0Var.I;
                    if (faVar != null) {
                        faVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
                    }
                    sb0Var.M.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    sb0Var.K.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i23, false));
                    sb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                dd0 dd0Var = (dd0) this.b;
                dd0Var.d.setIconColor(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ui));
                dd0Var.d.B(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                dd0Var.d.G(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
                dd0Var.d.G(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
                dd0Var.s.setColorFilter(new PorterDuffColorFilter(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5), PorterDuff.Mode.MULTIPLY));
                dd0Var.v.invalidate();
                if (dd0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!dd0Var.a0) {
                            dd0Var.a0 = true;
                            dd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = dd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                dd0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (dd0Var.a0) {
                        dd0Var.a0 = false;
                        dd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = dd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            dd0Var.O.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((rg0) this.b).y1();
                break;
            case 23:
                ((zg0) this.b).e0();
                break;
            case 24:
                th0 th0Var = (th0) this.b;
                org.telegram.ui.Components.ml0 ml0Var5 = th0Var.b;
                if (ml0Var5 != null) {
                    int childCount12 = ml0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = th0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.w80) {
                            ((org.telegram.ui.Components.w80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.s60 s60Var2 = th0Var.l0;
                if (s60Var2 != null) {
                    s60Var2.b0();
                    break;
                }
                break;
            case 25:
                ej0 ej0Var = (ej0) this.b;
                org.telegram.ui.Components.ml0 ml0Var6 = ej0Var.f;
                if (ml0Var6 != null) {
                    int childCount13 = ml0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        ej0Var.d0(ej0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = ej0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        ej0Var.d0(ej0Var.f.V(i28));
                    }
                    int cachedChildCount = ej0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        ej0Var.d0(ej0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = ej0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        ej0Var.d0(ej0Var.f.O(i30));
                    }
                    ej0Var.f.getRecycledViewPool().a();
                }
                ig.f fVar = ej0Var.c0;
                if (fVar != null) {
                    fVar.g = true;
                }
                View subtitleTextView = ej0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.i5) {
                    ((org.telegram.ui.ActionBar.i5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Pi, ej0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.ml0 ml0Var7 = notificationsCustomSettingsActivity.a;
                if (ml0Var7 != null) {
                    int childCount14 = ml0Var7.getChildCount();
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
                ((up0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                zx0 zx0Var = (zx0) this.b;
                org.telegram.ui.Components.ml0 ml0Var8 = zx0Var.a;
                if (ml0Var8 != null) {
                    int childCount15 = ml0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = zx0Var.a.getChildAt(i32);
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
