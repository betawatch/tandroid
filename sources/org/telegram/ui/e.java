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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ((h) this.b).b0();
                break;
            case 1:
                iv ivVar = ((y6) this.b).T;
                if (ivVar != null) {
                    ivVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false));
                    break;
                }
                break;
            case 2:
                j9.U((j9) this.b);
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
                zn znVar = (zn) this.b;
                kj kjVar = znVar.w;
                if (kjVar != null) {
                    kjVar.b();
                }
                kj kjVar2 = znVar.x;
                if (kjVar2 != null) {
                    kjVar2.b();
                }
                ok okVar = znVar.Y;
                if (okVar != null) {
                    okVar.e();
                }
                ai.h4 h4Var = znVar.J1;
                if (h4Var != null) {
                    h4Var.e1();
                }
                wj wjVar = znVar.x0;
                if (wjVar != null) {
                    int childCount2 = wjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = znVar.x0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = znVar.L3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (znVar.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = znVar.S8;
                        if (i13 < f1VarArr.length) {
                            f1VarArr[i13].c(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.E8), znVar.getThemedColor(org.telegram.ui.ActionBar.i6.F8));
                            znVar.S8[i13].setSelectorColor(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.xg0 xg0Var = znVar.z2;
                if (xg0Var != null) {
                    xg0Var.d();
                }
                pk pkVar = znVar.Z;
                if (pkVar != null && pkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.rd rdVar : znVar.Z.getEditView().a) {
                        rdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                ik ikVar = znVar.X1;
                if (ikVar != null) {
                    ikVar.q();
                }
                qj qjVar = znVar.a1;
                if (qjVar != null) {
                    org.telegram.ui.ActionBar.e6 e6Var = qjVar.d0;
                    org.telegram.ui.Components.ox0 ox0Var = qjVar.N;
                    if (ox0Var != null) {
                        ox0Var.b(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.pa, e6Var));
                    }
                    Drawable drawable = qjVar.q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.q5 q5Var = qjVar.g0;
                    if (q5Var != null) {
                        q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, e6Var)));
                    }
                    org.telegram.ui.Components.q5 q5Var2 = qjVar.f0;
                    if (q5Var2 != null) {
                        q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, e6Var)));
                    }
                    Drawable drawable2 = qjVar.r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = qjVar.s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ah, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    qjVar.invalidate();
                }
                sm smVar = znVar.X0;
                if (smVar != null) {
                    smVar.N();
                    ci.bb bbVar = znVar.X0.L;
                    if (bbVar != null) {
                        bbVar.invalidate();
                    }
                }
                org.telegram.ui.Components.fh fhVar = znVar.M0;
                if (fhVar != null) {
                    ch.d dVar2 = fhVar.s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                    fhVar.invalidate();
                }
                org.telegram.ui.Components.oz0 oz0Var = znVar.d1;
                if (oz0Var != null) {
                    org.telegram.ui.ActionBar.e6 e6Var2 = oz0Var.b;
                    Paint paint = oz0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Be, e6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.i6.E4;
                    int i14 = org.telegram.ui.ActionBar.i6.Be;
                    int w02 = org.telegram.ui.ActionBar.i6.w0(i14, e6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    org.telegram.ui.ActionBar.i6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i14, e6Var2), mode));
                }
                qj qjVar2 = znVar.a1;
                if (qjVar2 != null && qjVar2.getTimeItem() != null) {
                    znVar.a1.getTimeItem().invalidate();
                }
                hh.f fVar = znVar.S;
                if (fVar != null) {
                    fVar.f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                jh.h hVar = znVar.j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.b).b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                sk skVar = znVar.O0;
                if (skVar != null) {
                    for (androidx.activity.n nVar2 : skVar.a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.c).g();
                        }
                    }
                }
                Iterator it = znVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                znVar.s9();
                break;
            case 5:
                ai.z5 z5Var = ((uo) this.b).e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    break;
                }
                break;
            case 6:
                ip ipVar = (ip) this.b;
                LinearLayout linearLayout2 = ipVar.x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = ipVar.x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.n, nVar3.f);
                            nVar3.a.invalidate();
                        }
                    }
                }
                ipVar.G.f();
                org.telegram.ui.Components.t70 t70Var = ipVar.p0;
                if (t70Var != null) {
                    t70Var.e();
                    break;
                }
                break;
            case 7:
                up upVar = (up) this.b;
                org.telegram.ui.Components.qm0 qm0Var = upVar.b;
                if (qm0Var != null) {
                    int childCount5 = qm0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = upVar.b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((bq) this.b).W();
                break;
            case 9:
                nq nqVar = (nq) this.b;
                ai.w0 w0Var2 = nqVar.b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = nqVar.b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt6).b();
                        }
                    }
                    break;
                }
                break;
            case 10:
                tr trVar = (tr) this.b;
                ai.w0 w0Var3 = trVar.c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = trVar.c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    break;
                }
                break;
            case 11:
                qs.W((qs) this.b);
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
                        if (childAt8 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt8).j(0);
                        }
                    }
                    break;
                }
                break;
            case 14:
                ai.o4 o4Var = ((w10) this.b).m0;
                if (o4Var != null && (dVar = (ch.d) o4Var.c) != null) {
                    dVar.v();
                    break;
                }
                break;
            case 15:
                ((p20) this.b).w0();
                break;
            case 16:
                c70 c70Var = (c70) this.b;
                org.telegram.ui.Components.qm0 qm0Var2 = c70Var.n;
                if (qm0Var2 != null) {
                    int childCount9 = qm0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = c70Var.n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.s20 s20Var = c70Var.f;
                if (s20Var != null) {
                    s20Var.e();
                }
                org.telegram.ui.Components.p20 p20Var = c70Var.y;
                if (p20Var != null) {
                    p20Var.g();
                    break;
                }
                break;
            case 17:
                j70 j70Var = (j70) this.b;
                org.telegram.ui.Components.qm0 qm0Var3 = j70Var.b;
                if (qm0Var3 != null) {
                    int childCount10 = qm0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = j70Var.b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.p20 p20Var2 = j70Var.v;
                if (p20Var2 != null) {
                    p20Var2.g();
                    break;
                }
                break;
            case 18:
                ((d80) this.b).V(true);
                break;
            case 19:
                l80 l80Var = (l80) this.b;
                org.telegram.ui.Components.qm0 qm0Var4 = l80Var.h;
                if (qm0Var4 != null) {
                    int childCount11 = qm0Var4.getChildCount();
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
                vb0 vb0Var = (vb0) this.b;
                org.telegram.ui.Cells.e9 e9Var = vb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    rb0 rb0Var = vb0Var.F;
                    int i23 = org.telegram.ui.ActionBar.i6.G6;
                    rb0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i23, false));
                    rb0 rb0Var2 = vb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.i6.y6;
                    rb0Var2.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i24, false));
                    vb0Var.w.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i23, false));
                    vb0Var.w.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i24, false));
                    org.telegram.ui.Cells.ca caVar = vb0Var.I;
                    if (caVar != null) {
                        caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.p7, false));
                    }
                    vb0Var.M.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    vb0Var.K.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i23, false));
                    vb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i24, false));
                    break;
                }
                break;
            case 21:
                hd0 hd0Var = (hd0) this.b;
                hd0Var.d.setIconColor(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ui));
                hd0Var.d.B(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                hd0Var.d.G(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true);
                hd0Var.d.G(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
                hd0Var.s.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5), PorterDuff.Mode.MULTIPLY));
                hd0Var.v.invalidate();
                if (hd0Var.I != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!hd0Var.a0) {
                            hd0Var.a0 = true;
                            hd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = hd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                hd0Var.O.setFillColor(553648127);
                                break;
                            }
                        }
                    } else if (hd0Var.a0) {
                        hd0Var.a0 = false;
                        hd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = hd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            hd0Var.O.setFillColor(TLObject.FLAG_29);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ((wg0) this.b).y1();
                break;
            case 23:
                ((fh0) this.b).e0();
                break;
            case 24:
                zh0 zh0Var = (zh0) this.b;
                org.telegram.ui.Components.qm0 qm0Var5 = zh0Var.b;
                if (qm0Var5 != null) {
                    int childCount12 = qm0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = zh0Var.b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.x90) {
                            ((org.telegram.ui.Components.x90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.t70 t70Var2 = zh0Var.l0;
                if (t70Var2 != null) {
                    t70Var2.e();
                    break;
                }
                break;
            case 25:
                lj0 lj0Var = (lj0) this.b;
                org.telegram.ui.Components.qm0 qm0Var6 = lj0Var.f;
                if (qm0Var6 != null) {
                    int childCount13 = qm0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        lj0Var.d0(lj0Var.f.getChildAt(i27));
                    }
                    int hiddenChildCount = lj0Var.f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        lj0Var.d0(lj0Var.f.V(i28));
                    }
                    int cachedChildCount = lj0Var.f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        lj0Var.d0(lj0Var.f.P(i29));
                    }
                    int attachedScrapChildCount = lj0Var.f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        lj0Var.d0(lj0Var.f.O(i30));
                    }
                    lj0Var.f.getRecycledViewPool().a();
                }
                ig.f fVar2 = lj0Var.c0;
                if (fVar2 != null) {
                    fVar2.g = true;
                }
                View subtitleTextView = lj0Var.b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Pi, lj0Var.getResourceProvider()));
                    break;
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                org.telegram.ui.Components.qm0 qm0Var7 = notificationsCustomSettingsActivity.a;
                if (qm0Var7 != null) {
                    int childCount14 = qm0Var7.getChildCount();
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
                ((aq0) this.b).F0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            default:
                gy0 gy0Var = (gy0) this.b;
                org.telegram.ui.Components.qm0 qm0Var8 = gy0Var.a;
                if (qm0Var8 != null) {
                    int childCount15 = qm0Var8.getChildCount();
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
