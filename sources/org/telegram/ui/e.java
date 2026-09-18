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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                lv lvVar = ((a7) this.b).X;
                if (lvVar != null) {
                    lvVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                    break;
                }
                break;
            case 2:
                m9.U((m9) this.b);
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
                bo boVar = (bo) this.b;
                kj kjVar = boVar.w;
                if (kjVar != null) {
                    kjVar.d();
                }
                kj kjVar2 = boVar.x;
                if (kjVar2 != null) {
                    kjVar2.d();
                }
                nk nkVar = boVar.Y;
                if (nkVar != null) {
                    nkVar.e();
                }
                ai.g4 g4Var = boVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                vj vjVar = boVar.x0;
                if (vjVar != null) {
                    int childCount2 = vjVar.getChildCount();
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
                        org.telegram.ui.ActionBar.g1[] g1VarArr = boVar.S8;
                        if (i13 < g1VarArr.length) {
                            g1VarArr[i13].c(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), boVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            boVar.S8[i13].setSelectorColor(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = boVar.Q8;
                if (o1Var != null) {
                    View contentView = o1Var.getContentView();
                    contentView.setBackgroundColor(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.vf0 vf0Var = boVar.z2;
                if (vf0Var != null) {
                    vf0Var.d();
                }
                pk pkVar = boVar.Z;
                if (pkVar != null && pkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.md mdVar : boVar.Z.getEditView().a) {
                        mdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = boVar.h0;
                if (w0Var2 != null) {
                    w0Var2.N();
                }
                ik ikVar = boVar.X1;
                if (ikVar != null) {
                    ikVar.q();
                }
                qj qjVar = boVar.a1;
                if (qjVar != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = qjVar.d0;
                    org.telegram.ui.Components.mw0 mw0Var = qjVar.N;
                    if (mw0Var != null) {
                        mw0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pa, f6Var));
                    }
                    Drawable drawable = qjVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.m5 m5Var = qjVar.g0;
                    if (m5Var != null) {
                        m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    org.telegram.ui.Components.m5 m5Var2 = qjVar.f0;
                    if (m5Var2 != null) {
                        m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    Drawable drawable2 = qjVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = qjVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    qjVar.invalidate();
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
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    bhVar.invalidate();
                }
                org.telegram.ui.Components.oy0 oy0Var = boVar.d1;
                if (oy0Var != null) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = oy0Var.b;
                    Paint paint = oy0Var.O;
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
                qj qjVar2 = boVar.a1;
                if (qjVar2 != null && qjVar2.getTimeItem() != null) {
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
                sk skVar = boVar.O0;
                if (skVar != null) {
                    for (androidx.activity.n nVar2 : skVar.a) {
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
                org.telegram.ui.Components.ml0 ml0Var = wpVar.b;
                if (ml0Var != null) {
                    int childCount5 = ml0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = wpVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
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
                ai.w0 w0Var3 = pqVar.b;
                if (w0Var3 != null) {
                    int childCount6 = w0Var3.getChildCount();
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
                ai.w0 w0Var4 = urVar.c;
                if (w0Var4 != null) {
                    int childCount7 = w0Var4.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = urVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                us.W((us) this.b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.b);
                break;
            case 13:
                h10 h10Var = (h10) this.b;
                ai.w0 w0Var5 = h10Var.a;
                if (w0Var5 != null) {
                    int childCount8 = w0Var5.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = h10Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                ai.n4 n4Var = ((z10) this.b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.c) != null) {
                    dVar.v();
                    break;
                }
                break;
            case 15:
                ((t20) this.b).v0();
                break;
            case 16:
                g70 g70Var = (g70) this.b;
                org.telegram.ui.Components.ml0 ml0Var2 = g70Var.n;
                if (ml0Var2 != null) {
                    int childCount9 = ml0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = g70Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.b20 b20Var = g70Var.f;
                if (b20Var != null) {
                    b20Var.e();
                }
                org.telegram.ui.Components.y10 y10Var = g70Var.y;
                if (y10Var != null) {
                    y10Var.g();
                    break;
                }
                break;
            case 17:
                n70 n70Var = (n70) this.b;
                org.telegram.ui.Components.ml0 ml0Var3 = n70Var.b;
                if (ml0Var3 != null) {
                    int childCount10 = ml0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = n70Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.y10 y10Var2 = n70Var.v;
                if (y10Var2 != null) {
                    y10Var2.g();
                    break;
                }
                break;
            case 18:
                ((f80) this.b).V(true);
                break;
            case 19:
                n80 n80Var = (n80) this.b;
                org.telegram.ui.Components.ml0 ml0Var4 = n80Var.h;
                if (ml0Var4 != null) {
                    int childCount11 = ml0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = n80Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                zb0 zb0Var = (zb0) this.b;
                org.telegram.ui.Cells.e9 e9Var = zb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    vb0 vb0Var = zb0Var.F;
                    int i23 = org.telegram.ui.ActionBar.j6.G6;
                    vb0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    vb0 vb0Var2 = zb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.j6.y6;
                    vb0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    zb0Var.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    zb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    org.telegram.ui.Cells.ea eaVar = zb0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    }
                    zb0Var.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    zb0Var.K.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    zb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    break;
                }
                break;
            case 21:
                kd0 kd0Var = (kd0) this.b;
                kd0Var.d.setIconColor(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                kd0Var.d.B(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                kd0Var.d.G(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                kd0Var.d.G(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                kd0Var.s.setColorFilter(new PorterDuffColorFilter(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5), PorterDuff.Mode.MULTIPLY));
                kd0Var.v.invalidate();
                if (kd0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!kd0Var.a0) {
                            kd0Var.a0 = true;
                            kd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = kd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                kd0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (kd0Var.a0) {
                        kd0Var.a0 = false;
                        kd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = kd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            kd0Var.O.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((yg0) this.b).y1();
                break;
            case 23:
                ((gh0) this.b).e0();
                break;
            case 24:
                ai0 ai0Var = (ai0) this.b;
                org.telegram.ui.Components.ml0 ml0Var5 = ai0Var.b;
                if (ml0Var5 != null) {
                    int childCount12 = ml0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = ai0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.v80) {
                            ((org.telegram.ui.Components.v80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.r60 r60Var2 = ai0Var.l0;
                if (r60Var2 != null) {
                    r60Var2.b0();
                    break;
                }
                break;
            case 25:
                lj0 lj0Var = (lj0) this.b;
                org.telegram.ui.Components.ml0 ml0Var6 = lj0Var.f;
                if (ml0Var6 != null) {
                    int childCount13 = ml0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        lj0Var.d0(lj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = lj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        lj0Var.d0(lj0Var.f.W(i28));
                    }
                    int cachedChildCount = lj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        lj0Var.d0(lj0Var.f.Q(i29));
                    }
                    int attachedScrapChildCount = lj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        lj0Var.d0(lj0Var.f.P(i30));
                    }
                    lj0Var.f.getRecycledViewPool().a();
                }
                ig.f fVar = lj0Var.c0;
                if (fVar != null) {
                    fVar.g = true;
                }
                View subtitleTextView = lj0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
                    ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, lj0Var.getResourceProvider()));
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
                        if (childAt13 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt13).j(0);
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
                iy0 iy0Var = (iy0) this.b;
                org.telegram.ui.Components.ml0 ml0Var8 = iy0Var.a;
                if (ml0Var8 != null) {
                    int childCount15 = ml0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = iy0Var.a.getChildAt(i32);
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
