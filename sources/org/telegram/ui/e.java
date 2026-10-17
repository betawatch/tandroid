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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                xu xuVar = ((c7) this.b).T;
                if (xuVar != null) {
                    xuVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
                    break;
                }
                break;
            case 2:
                m9.U((m9) this.b);
                break;
            case 3:
                od odVar = (od) this.b;
                LinearLayout linearLayout = odVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = odVar.L.getChildAt(i10);
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
                sn snVar = (sn) this.b;
                dj djVar = snVar.w;
                if (djVar != null) {
                    djVar.b();
                }
                dj djVar2 = snVar.x;
                if (djVar2 != null) {
                    djVar2.b();
                }
                hk hkVar = snVar.Y;
                if (hkVar != null) {
                    hkVar.d();
                }
                ci.b3 b3Var = snVar.J1;
                if (b3Var != null) {
                    b3Var.e1();
                }
                pj pjVar = snVar.x0;
                if (pjVar != null) {
                    int childCount2 = pjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = snVar.x0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.x0) {
                            ((org.telegram.ui.Cells.x0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.u1 u1Var = snVar.L3;
                if (u1Var != null) {
                    int childCount3 = u1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = snVar.L3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (snVar.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.e1[] e1VarArr = snVar.S8;
                        if (i13 < e1VarArr.length) {
                            e1VarArr[i13].c(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.E8), snVar.getThemedColor(org.telegram.ui.ActionBar.h6.F8));
                            snVar.S8[i13].setSelectorColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = snVar.Q8;
                if (m1Var != null) {
                    View contentView = m1Var.getContentView();
                    contentView.setBackgroundColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.pg0 pg0Var = snVar.z2;
                if (pg0Var != null) {
                    pg0Var.d();
                }
                ik ikVar = snVar.Z;
                if (ikVar != null && ikVar.getEditView() != null) {
                    for (org.telegram.ui.Components.nd ndVar : snVar.Z.getEditView().a) {
                        ndVar.d();
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
                if (u0Var != null) {
                    u0Var.N();
                }
                bk bkVar = snVar.X1;
                if (bkVar != null) {
                    bkVar.q();
                }
                jj jjVar = snVar.a1;
                if (jjVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = jjVar.d0;
                    org.telegram.ui.Components.fx0 fx0Var = jjVar.N;
                    if (fx0Var != null) {
                        fx0Var.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.pa, d6Var));
                    }
                    Drawable drawable = jjVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.p5 p5Var = jjVar.g0;
                    if (p5Var != null) {
                        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, d6Var)));
                    }
                    org.telegram.ui.Components.p5 p5Var2 = jjVar.f0;
                    if (p5Var2 != null) {
                        p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, d6Var)));
                    }
                    Drawable drawable2 = jjVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = jjVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    jjVar.invalidate();
                }
                lm lmVar = snVar.X0;
                if (lmVar != null) {
                    lmVar.N();
                    ai.hc hcVar = snVar.X0.L;
                    if (hcVar != null) {
                        hcVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = snVar.M0;
                if (chVar != null) {
                    dh.d dVar2 = chVar.s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.gz0 gz0Var = snVar.d1;
                if (gz0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = gz0Var.b;
                    Paint paint = gz0Var.O;
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
                jj jjVar2 = snVar.a1;
                if (jjVar2 != null && jjVar2.getTimeItem() != null) {
                    snVar.a1.getTimeItem().invalidate();
                }
                ih.f fVar = snVar.S;
                if (fVar != null) {
                    fVar.f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                kh.h hVar = snVar.j1;
                if (hVar != null) {
                    for (androidx.biometric.e eVar : hVar.e) {
                        if (eVar != null && (aVar = (bVar = (jh.b) eVar.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                lk lkVar = snVar.O0;
                if (lkVar != null) {
                    for (androidx.activity.o oVar : lkVar.a) {
                        if (oVar != null) {
                            ((jh.a) oVar.b).g();
                        }
                    }
                }
                Iterator it = snVar.E.iterator();
                while (it.hasNext()) {
                    ((dh.d) it.next()).v();
                }
                snVar.s9();
                break;
            case 5:
                ci.k4 k4Var = ((ko) this.b).e;
                if (k4Var != null) {
                    k4Var.invalidate();
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
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.n, nVar2.f);
                            nVar2.a.invalidate();
                        }
                    }
                }
                yoVar.G.f();
                org.telegram.ui.Components.l70 l70Var = yoVar.p0;
                if (l70Var != null) {
                    l70Var.d();
                    break;
                }
                break;
            case 7:
                kp kpVar = (kp) this.b;
                org.telegram.ui.Components.im0 im0Var = kpVar.b;
                if (im0Var != null) {
                    int childCount5 = im0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = kpVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
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
                ai.u1 u1Var2 = dqVar.b;
                if (u1Var2 != null) {
                    int childCount6 = u1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = dqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                jr jrVar = (jr) this.b;
                ai.u1 u1Var3 = jrVar.c;
                if (u1Var3 != null) {
                    int childCount7 = u1Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = jrVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
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
                ai.u1 u1Var4 = p00Var.a;
                if (u1Var4 != null) {
                    int childCount8 = u1Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = p00Var.a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                ci.i3 i3Var = ((g10) this.b).m0;
                if (i3Var != null && (dVar = (dh.d) i3Var.c) != null) {
                    dVar.v();
                    break;
                }
                break;
            case 15:
                ((a20) this.b).w0();
                break;
            case 16:
                n60 n60Var = (n60) this.b;
                org.telegram.ui.Components.im0 im0Var2 = n60Var.n;
                if (im0Var2 != null) {
                    int childCount9 = im0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = n60Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.k20 k20Var = n60Var.f;
                if (k20Var != null) {
                    k20Var.d();
                }
                org.telegram.ui.Components.h20 h20Var = n60Var.y;
                if (h20Var != null) {
                    h20Var.g();
                    break;
                }
                break;
            case 17:
                u60 u60Var = (u60) this.b;
                org.telegram.ui.Components.im0 im0Var3 = u60Var.b;
                if (im0Var3 != null) {
                    int childCount10 = im0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = u60Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.h20 h20Var2 = u60Var.v;
                if (h20Var2 != null) {
                    h20Var2.g();
                    break;
                }
                break;
            case 18:
                ((l70) this.b).V(true);
                break;
            case 19:
                t70 t70Var = (t70) this.b;
                org.telegram.ui.Components.im0 im0Var4 = t70Var.h;
                if (im0Var4 != null) {
                    int childCount11 = im0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = t70Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt11).a();
                        }
                    }
                    break;
                }
                break;
            case 20:
                cb0 cb0Var = (cb0) this.b;
                org.telegram.ui.Cells.d9 d9Var = cb0Var.G;
                if (d9Var != null) {
                    d9Var.getContext();
                    ya0 ya0Var = cb0Var.F;
                    int i23 = org.telegram.ui.ActionBar.h6.G6;
                    ya0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                    ya0 ya0Var2 = cb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.h6.y6;
                    ya0Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    cb0Var.w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                    cb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    org.telegram.ui.Cells.ba baVar = cb0Var.I;
                    if (baVar != null) {
                        baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
                    }
                    cb0Var.M.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    cb0Var.K.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                    cb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    break;
                }
                break;
            case 21:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.d.setIconColor(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ui));
                pc0Var.d.B(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                pc0Var.d.G(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
                pc0Var.d.G(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
                pc0Var.s.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5), PorterDuff.Mode.MULTIPLY));
                pc0Var.v.invalidate();
                if (pc0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!pc0Var.a0) {
                            pc0Var.a0 = true;
                            pc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = pc0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                pc0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (pc0Var.a0) {
                        pc0Var.a0 = false;
                        pc0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = pc0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            pc0Var.O.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((fg0) this.b).y1();
                break;
            case 23:
                ((pg0) this.b).e0();
                break;
            case 24:
                kh0 kh0Var = (kh0) this.b;
                org.telegram.ui.Components.im0 im0Var5 = kh0Var.b;
                if (im0Var5 != null) {
                    int childCount12 = im0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = kh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.q90) {
                            ((org.telegram.ui.Components.q90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.l70 l70Var2 = kh0Var.l0;
                if (l70Var2 != null) {
                    l70Var2.d();
                    break;
                }
                break;
            case 25:
                wi0 wi0Var = (wi0) this.b;
                org.telegram.ui.Components.im0 im0Var6 = wi0Var.f;
                if (im0Var6 != null) {
                    int childCount13 = im0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        wi0Var.d0(wi0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = wi0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        wi0Var.d0(wi0Var.f.V(i28));
                    }
                    int cachedChildCount = wi0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        wi0Var.d0(wi0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = wi0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        wi0Var.d0(wi0Var.f.O(i30));
                    }
                    wi0Var.f.getRecycledViewPool().a();
                }
                jg.f fVar2 = wi0Var.c0;
                if (fVar2 != null) {
                    fVar2.a = true;
                }
                View subtitleTextView = wi0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Pi, wi0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.im0 im0Var7 = notificationsCustomSettingsActivity.a;
                if (im0Var7 != null) {
                    int childCount14 = im0Var7.getChildCount();
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
                ((jp0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                mx0 mx0Var = (mx0) this.b;
                org.telegram.ui.Components.im0 im0Var8 = mx0Var.a;
                if (im0Var8 != null) {
                    int childCount15 = im0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = mx0Var.a.getChildAt(i32);
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
