package org.telegram.ui;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class pl extends org.telegram.ui.Components.du0 {
    public int g0;
    public int h0;
    public int i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public final ArrayList m0;
    public Paint n0;
    public int o0;
    public final nl p0;
    public final nl q0;
    public final RectF r0;
    public float s0;
    public float t0;
    public long u0;
    public boolean v0;
    public ColorDrawable w0;
    public final /* synthetic */ bn x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.nl] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.nl] */
    public pl(bn bnVar, Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context, r4Var);
        this.x0 = bnVar;
        this.g0 = 0;
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        this.m0 = new ArrayList();
        final int i7 = 0;
        this.p0 = new eh.a(this) { // from class: org.telegram.ui.nl
            public final /* synthetic */ pl b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // eh.a
            public final void c(dh.a aVar, RectF rectF) {
                switch (i7) {
                }
                aVar.a = true;
            }

            @Override // eh.a
            public final void d(Canvas canvas, RectF rectF) {
                switch (i7) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        bn bnVar2 = this.b.x0;
                        if (!bnVar2.A0.Y0() || bnVar2.A0.getOverScrollMode() == 2) {
                            bnVar2.A0.z1(canvas, rectF);
                            for (int i10 = 0; i10 < bnVar2.A0.getChildCount(); i10++) {
                                View childAt = bnVar2.A0.getChildAt(i10);
                                if (!bn.m2(bnVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                                        if (r1Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, r1Var.W);
                                            r1Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (r1Var.k2()) {
                                            canvas.save();
                                            canvas.translate(r1Var.getX(), r1Var.getY());
                                            r1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                        bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.v0) childAt).I(canvas);
                                        canvas.restore();
                                    } else {
                                        bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            bnVar2.A0.A1(canvas, rectF);
                            break;
                        } else {
                            bnVar2.A0.d(canvas, rectF);
                            break;
                        }
                        break;
                    default:
                        pl plVar = this.b;
                        bn bnVar3 = plVar.x0;
                        RectF rectF2 = plVar.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, plVar.getWidth(), plVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = bnVar3.gd.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.r1(f10 * 0.85f, bnVar3.getThemedColor(org.telegram.ui.ActionBar.m6.d6))));
                            }
                            ih.d.b(plVar.p0, canvas, rectF, bnVar3.A0, plVar, i11);
                            di.b1 b1Var = bnVar3.a4;
                            if (b1Var != null) {
                                ih.d.b(b1Var, canvas, rectF, b1Var, plVar, i12);
                            }
                            hi.i1 i1Var = bnVar3.F1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = bnVar3.F1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = bnVar3.F1.getChildAt(i13);
                                    if ((childAt2 instanceof dn) && childAt2.getVisibility() == 0) {
                                        pl plVar2 = ((dn) childAt2).a.m1;
                                        ih.d.a(plVar2.q0, canvas, rectF, plVar2, plVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.q0 = new eh.a(this) { // from class: org.telegram.ui.nl
            public final /* synthetic */ pl b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // eh.a
            public final void c(dh.a aVar, RectF rectF) {
                switch (i10) {
                }
                aVar.a = true;
            }

            @Override // eh.a
            public final void d(Canvas canvas, RectF rectF) {
                switch (i10) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        bn bnVar2 = this.b.x0;
                        if (!bnVar2.A0.Y0() || bnVar2.A0.getOverScrollMode() == 2) {
                            bnVar2.A0.z1(canvas, rectF);
                            for (int i102 = 0; i102 < bnVar2.A0.getChildCount(); i102++) {
                                View childAt = bnVar2.A0.getChildAt(i102);
                                if (!bn.m2(bnVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                                        if (r1Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, r1Var.W);
                                            r1Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (r1Var.k2()) {
                                            canvas.save();
                                            canvas.translate(r1Var.getX(), r1Var.getY());
                                            r1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                        bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.v0) childAt).I(canvas);
                                        canvas.restore();
                                    } else {
                                        bnVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            bnVar2.A0.A1(canvas, rectF);
                            break;
                        } else {
                            bnVar2.A0.d(canvas, rectF);
                            break;
                        }
                        break;
                    default:
                        pl plVar = this.b;
                        bn bnVar3 = plVar.x0;
                        RectF rectF2 = plVar.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, plVar.getWidth(), plVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = bnVar3.gd.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.r1(f10 * 0.85f, bnVar3.getThemedColor(org.telegram.ui.ActionBar.m6.d6))));
                            }
                            ih.d.b(plVar.p0, canvas, rectF, bnVar3.A0, plVar, i11);
                            di.b1 b1Var = bnVar3.a4;
                            if (b1Var != null) {
                                ih.d.b(b1Var, canvas, rectF, b1Var, plVar, i12);
                            }
                            hi.i1 i1Var = bnVar3.F1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = bnVar3.F1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = bnVar3.F1.getChildAt(i13);
                                    if ((childAt2 instanceof dn) && childAt2.getVisibility() == 0) {
                                        pl plVar2 = ((dn) childAt2).a.m1;
                                        ih.d.a(plVar2.q0, canvas, rectF, plVar2, plVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.r0 = new RectF();
        this.I = new ol(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.x0;
        bnVar.m1.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        kVar.setTranslationY(0.0f);
        ik ikVar = bnVar.Bb;
        if (ikVar != null) {
            ikVar.setTranslationY(bnVar.D1 != null ? r3.getCurrentHeight() : 0);
        }
        hi.l3 l3Var = bnVar.L1;
        if (l3Var != null) {
            l3Var.setTranslationY(0.0f);
        }
        hi.l3 l3Var2 = bnVar.K1;
        if (l3Var2 != null) {
            l3Var2.setTranslationY(0.0f);
        }
        bnVar.f1.setTranslationY(0.0f);
        bnVar.R.setTranslationY(0.0f);
        bnVar.T9 = 0.0f;
        bnVar.U9 = 0.0f;
        bnVar.m1.setBackgroundTranslation(0);
        org.telegram.ui.Components.h50 h50Var = bnVar.q3;
        if (h50Var != null) {
            h50Var.g(0.0f);
        }
        hi.l5 l5Var = bnVar.N2;
        if (l5Var != null) {
            org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) l5Var.b;
            aaVar.u = 0.0f;
            aaVar.d.invalidate();
        }
        bnVar.setFragmentPanTranslationOffset(0);
        bnVar.M9();
    }

    @Override // org.telegram.ui.Components.du0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.du0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.du0
    public final int Q() {
        fi.n2 n2Var = this.x0.Y1;
        if (n2Var == null || !n2Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.du0
    public final void T(Drawable drawable) {
        bn bnVar = this.x0;
        jh.l lVar = bnVar.Y;
        if (drawable instanceof org.telegram.ui.Components.cb0) {
            ((org.telegram.ui.Components.cb0) drawable).p();
        }
        ui.a c10 = lVar.c(drawable);
        float B = org.telegram.messenger.g0.B(lVar.b(c10));
        float B2 = org.telegram.messenger.g0.B(lVar.a(c10));
        bnVar.hc = B <= 0.721f;
        bnVar.ic = B2 <= 0.9f;
        bnVar.N.a = c10;
        ui.f fVar = bnVar.J;
        if (fVar != null) {
            Iterator it = fVar.w.iterator();
            while (it.hasNext()) {
                fh.e eVar = ((fh.g) it.next()).g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ui.f fVar2 = bnVar.K;
        if (fVar2 != null) {
            Iterator it2 = fVar2.w.iterator();
            while (it2.hasNext()) {
                fh.e eVar2 = ((fh.g) it2.next()).g0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        lh.f fVar3 = bnVar.Z;
        if (fVar3 != null) {
            fVar3.setOverlayColor(bnVar.S9() ? bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.va) : 0);
            bnVar.Z.invalidate();
        }
        jh.f fVar4 = bnVar.U;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        bnVar.m1.invalidate();
        Iterator it3 = bnVar.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        bnVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.r1 r1Var, int i7) {
        int save = canvas.save();
        bn bnVar = this.x0;
        float x10 = r1Var.getX() + bnVar.A0.getLeft();
        float y10 = r1Var.getY() + bnVar.A0.getY() + r1Var.getPaddingTop();
        float alpha = r1Var.b() ? r1Var.getAlpha() : 1.0f;
        canvas.clipRect(bnVar.A0.getLeft(), f10, bnVar.A0.getRight(), ((((bnVar.A0.getY() + bnVar.A0.getMeasuredHeight()) - bnVar.Ya) - bnVar.w.e()) - bnVar.ad) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y10);
        r1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            r1Var.y1(alpha, canvas, true);
        } else if (i7 == 1) {
            r1Var.h1(canvas, alpha);
        } else if (i7 == 2) {
            r1Var.Q0(alpha, canvas, r1Var.getCurrentPosition() != null && (r1Var.getCurrentPosition().l & 1) == 0);
        } else if (i7 == 3) {
            boolean z10 = r1Var.getCurrentPosition() != null && (r1Var.getCurrentPosition().l & 1) == 0;
            r1Var.V0(canvas, alpha);
            if (!z10) {
                r1Var.o1(canvas, alpha, null);
            }
        } else if (i7 == 4 && ((r1Var.getCurrentPosition() == null || (1 & r1Var.getCurrentPosition().l) != 0) && bnVar.c9 != null)) {
            float f11 = (bnVar.X8 * bnVar.a9) / 0.2f;
            canvas.save();
            r1Var.s1(canvas, bnVar.c9, f11, bnVar.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            r1Var.t1(this, canvas, bnVar.d9, bnVar.c9, f11);
            canvas.restore();
        }
        r1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.d1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.A0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(Canvas canvas, View view, long j3) {
        hi.l5 l5Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.gj gjVar;
        boolean z10;
        boolean z11;
        uj ujVar;
        org.telegram.messenger.gj gjVar2;
        org.telegram.ui.Components.h50 h50Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        bn bnVar = this.x0;
        boolean z12 = false;
        if ((bnVar.Z8 == null && ((ArrayList) bnVar.ja.c).size() <= 0) || (view != bnVar.y1 && view != bnVar.m3 && view != bnVar.n3 && view != bnVar.J9 && view != bnVar.ua && view != bnVar.t2 && view != null && view != bnVar.N3 && view != bnVar.O3)) {
            if ((view != bnVar.N3 || !PhotoViewer.p1().P1()) && (!bnVar.pa || view != bnVar.A0)) {
                if (bnVar.Ha) {
                    kVar3 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                }
                if (view != bnVar.q3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (l5Var = bnVar.N2) != null && l5Var.a() && bnVar.N2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        gjVar = MediaController.B().v0;
                        if (gjVar == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == bnVar.J8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    } else {
                        if (view != bnVar.A0) {
                            if (view != bnVar.U) {
                            }
                        }
                        gjVar = MediaController.B().v0;
                        if (gjVar == null && gjVar.T == 0) {
                            z10 = gjVar.h4();
                            if (z10 || org.telegram.messenger.gj.L4(gjVar.k)) {
                                z11 = true;
                                if (view == bnVar.J8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-bnVar.ka) - (bnVar.ra != 0.0f ? (bnVar.A0.getMeasuredHeight() - bnVar.ka) * bnVar.ra : 0.0f));
                                    if (gjVar != null && gjVar.D == 5) {
                                        if (org.telegram.ui.ActionBar.m6.k3 != null && bnVar.L8.d) {
                                            int x10 = ((int) view.getX()) - org.telegram.messenger.g0.L(3.0f);
                                            int y10 = ((int) view.getY()) - org.telegram.messenger.g0.L(2.0f);
                                            canvas.save();
                                            canvas.scale(bnVar.J8.getScaleX(), bnVar.J8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.m6.k3.setAlpha(org.telegram.messenger.ls.e4);
                                            org.telegram.ui.ActionBar.m6.k3.setBounds(x10, y10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.f3(bnVar.ba(), bnVar.S9()) + x10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.f3(bnVar.ba(), bnVar.S9()) + y10);
                                            org.telegram.ui.ActionBar.m6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z12 = super.drawChild(canvas, view, j3);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-org.telegram.messenger.g0.L(1000.0f));
                                        z12 = super.drawChild(canvas, view, j3);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z12;
                                }
                                if (view == bnVar.U && (h50Var = bnVar.q3) != null && h50Var.getVisibility() == 0) {
                                    super.drawChild(canvas, bnVar.q3, j3);
                                }
                                z12 = super.drawChild(canvas, view, j3);
                                if (z11 && view == bnVar.A0 && gjVar.D != 5 && (ujVar = bnVar.J8) != null && ujVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-bnVar.ka) - (bnVar.ra != 0.0f ? (bnVar.A0.getMeasuredHeight() - bnVar.ka) * bnVar.ra : 0.0f)) + bnVar.la);
                                    super.drawChild(canvas, bnVar.J8, j3);
                                    if (bnVar.K8 != null) {
                                        canvas.save();
                                        canvas.translate(bnVar.K8.getX(), bnVar.A0.getY() + bnVar.K8.getTop());
                                        if (z10) {
                                            bnVar.K8.r1(canvas);
                                            invalidate();
                                            bnVar.K8.invalidate();
                                        } else {
                                            bnVar.K8.j1(canvas);
                                            org.telegram.ui.Cells.r1 r1Var = bnVar.K8;
                                            if (!r1Var.G9 && ((gjVar2 = r1Var.Q5) == null || gjVar2.D != 27)) {
                                                r1Var.y1(r1Var.getAlpha(), canvas, true);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                }
                            }
                        } else {
                            z10 = false;
                        }
                        z11 = false;
                        if (view == bnVar.J8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    public final boolean a0(View view) {
        if (view == this.M) {
            return true;
        }
        bn bnVar = this.x0;
        return view == bnVar.N2 || view == bnVar.F1 || view == bnVar.J9 || view == bnVar.Z || view == bnVar.Z3 || view == bnVar.n0 || (view instanceof org.telegram.ui.ActionBar.j5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.rg rgVar;
        bn bnVar = this.x0;
        rj rjVar = bnVar.a0;
        if (rjVar == null || view != rjVar.n0) {
            super.addView(view, i7, layoutParams);
        } else {
            lh.f fVar = bnVar.Z;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i7 = indexOfChild;
            }
            super.addView(view, i7, layoutParams);
        }
        rj rjVar2 = bnVar.a0;
        if (rjVar2 != null && view == rjVar2.n0) {
            ki.u uVar = (ki.u) view;
            uVar.setBackgroundDrawable(bnVar.L.c(uVar.c, bnVar.E, false));
        }
        rj rjVar3 = bnVar.a0;
        if (rjVar3 == null || view != (rgVar = rjVar3.E2)) {
            return;
        }
        rgVar.setBlurredBackgroundFactory(bnVar.L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0c32, code lost:
    
        if (r0.getVisibility() != 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0792, code lost:
    
        if ((r5 & 1) != 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018c, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0b87  */
    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        float f10;
        float f11;
        int i10;
        Integer num;
        Paint paint;
        Paint paint2;
        float f12;
        View view;
        Paint paint3;
        Paint paint4;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Paint paint5;
        float f13;
        Paint paint6;
        Paint paint7;
        Integer num2;
        View view2;
        Canvas canvas3;
        pl plVar;
        float f14;
        float f15;
        View view3;
        org.telegram.ui.Components.v90 v90Var;
        org.telegram.ui.Components.v90 v90Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        tl tlVar;
        View view6;
        org.telegram.messenger.bj bjVar;
        tl tlVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f16;
        int i11;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f17;
        float f18;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        float f19;
        Paint paint12;
        tl tlVar3;
        org.telegram.ui.Cells.v0 v0Var;
        org.telegram.messenger.bj bjVar2;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.yi yiVar;
        View view7;
        org.telegram.messenger.bj bjVar3;
        View view8;
        int i12;
        int i13;
        ArrayList arrayList5;
        org.telegram.ui.Cells.r1 r1Var2;
        ArrayList arrayList6;
        wi wiVar;
        Integer num4;
        float f20;
        float f21;
        boolean z10;
        tl tlVar4;
        tl tlVar5;
        org.telegram.ui.Components.v90 v90Var3;
        float f22;
        float f23;
        rj rjVar;
        tl tlVar6;
        tl tlVar7;
        tl tlVar8;
        tl tlVar9;
        float f24;
        float f25;
        Canvas canvas4;
        float f26;
        float f27;
        View view9;
        float f28;
        float f29;
        float f30;
        org.telegram.messenger.yi yiVar2;
        Integer num5;
        float f31;
        int i14;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.v0 v0Var2;
        Paint paint14;
        float f32;
        float f33;
        Paint paint15;
        float f34;
        float f35;
        float f36;
        float f37;
        tl tlVar10;
        tl tlVar11;
        Integer num7;
        tl tlVar12;
        tl tlVar13;
        Integer num8;
        pl plVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        float f38;
        Paint paint17;
        Paint paint18;
        float f39;
        float f40;
        View view10;
        int i15;
        Paint paint19;
        float f41;
        float f42;
        Paint paint20;
        float f43;
        float f44;
        float f45;
        Canvas canvas5;
        float f46;
        float f47;
        float f48;
        tl tlVar14;
        tl tlVar15;
        Integer num9;
        tl tlVar16;
        tl tlVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        float f49;
        Paint paint22;
        float f50;
        Integer num11;
        tl tlVar18;
        tl tlVar19;
        float f51;
        Integer num12;
        org.telegram.ui.Components.ef efVar;
        org.telegram.ui.Components.v90 v90Var4;
        org.telegram.ui.Components.v90 v90Var5;
        tl tlVar20;
        float f52;
        org.telegram.ui.Cells.r1 r1Var3;
        boolean z11;
        org.telegram.ui.Components.v90 v90Var6;
        float f53;
        org.telegram.ui.Components.v90 v90Var7;
        float f54;
        tl tlVar21;
        org.telegram.ui.Components.v90 v90Var8;
        org.telegram.ui.Components.v90 v90Var9;
        tl tlVar22;
        View view11;
        float f55;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.k kVar6;
        View view15;
        float f56;
        Paint paint23;
        float f57;
        float f58;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f59;
        Integer num13;
        float f60;
        Paint paint25;
        Paint paint26;
        float f61;
        float f62;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        float f63;
        Paint paint29;
        float f64;
        Paint paint30;
        float f65;
        float f66;
        Paint paint31;
        View view24;
        float f67;
        float f68;
        org.telegram.ui.ActionBar.k kVar7;
        int i16;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        dj djVar;
        pl plVar3 = this;
        bn bnVar = plVar3.x0;
        wi wiVar2 = bnVar.w;
        ArrayList arrayList7 = bnVar.F6;
        bnVar.a0.I2();
        bnVar.Rc();
        if (bnVar.Oa || ((djVar = bnVar.B0) != null && djVar.k())) {
            bnVar.Oa = false;
            bnVar.cd();
        }
        bnVar.vd(false, false);
        bnVar.ed();
        hi.l3 l3Var = bnVar.v2;
        if (l3Var != null && l3Var.W) {
            l3Var.A();
        }
        hi.l3 l3Var2 = bnVar.x2;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.A();
        }
        float f69 = 0.2f;
        float f70 = 2.0f;
        if (bnVar.Ha) {
            kVar10 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            canvas2 = canvas;
            i7 = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), plVar3.getMeasuredWidth(), plVar3.getMeasuredHeight(), (int) (bnVar.Ia * 255.0f), 31);
            float f71 = (bnVar.Ia * 0.2f) + 0.8f;
            canvas2.scale(f71, f71, plVar3.getMeasuredWidth() / 2.0f, plVar3.getMeasuredHeight() / 2.0f);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        int i17 = i7;
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        int i18 = 0;
        while (true) {
            f10 = 1.0f;
            f11 = 0.0f;
            i10 = 1;
            if (i18 >= size) {
                break;
            }
            org.telegram.ui.Cells.r1 r1Var4 = (org.telegram.ui.Cells.r1) arrayList7.get(i18);
            org.telegram.messenger.cj cjVar = r1Var4.getMessageObject().N1;
            if (cjVar != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    bk bkVar = bnVar.D1;
                    int currentHeight = measuredHeight + (bkVar != null ? bkVar.getCurrentHeight() : 0);
                    oj ojVar = bnVar.E1;
                    int currentHeight2 = currentHeight + (ojVar != null ? ojVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
                    i16 = currentHeight2 + (z12 ? org.telegram.messenger.g0.m : 0);
                } else {
                    i16 = 0;
                }
                f67 = f70;
                f68 = f69;
                canvas2.clipRect(0.0f, i16 + bnVar.Q9, plVar3.getWidth(), plVar3.getHeight());
                ImageReceiver photoImage = r1Var4.getPhotoImage();
                r1Var4.getLocationInWindow(org.telegram.messenger.g0.R);
                int topViewEnterProgress = (int) ((bnVar.a0.getTopViewEnterProgress() * org.telegram.messenger.g0.L(48.0f)) + ((int) com.google.android.gms.internal.vision.e2.t(1.0f, cjVar.g, r1Var4.getTranslationY(), r9[1])));
                if (cjVar.h) {
                    canvas2.translate(cjVar.e, org.telegram.messenger.g0.T1(cjVar.b, topViewEnterProgress, cjVar.g));
                } else {
                    canvas2.translate(cjVar.e, org.telegram.messenger.g0.T1(cjVar.b, photoImage.s() + topViewEnterProgress, cjVar.g));
                }
                float f72 = cjVar.d;
                canvas2.scale(f72, f72);
                if (!cjVar.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                r1Var4.setTimeAlpha(cjVar.f);
                r1Var4.draw(canvas2);
                canvas2.restore();
            } else {
                f67 = f70;
                f68 = f69;
            }
            i18++;
            f70 = f67;
            f69 = f68;
        }
        float f73 = f70;
        float f74 = f69;
        num = bnVar.c9;
        if (num != null) {
            view24 = bnVar.Z8;
        }
        paint = bnVar.T8;
        if (paint != null) {
            matrix = bnVar.U8;
            matrix.reset();
            float measuredWidth = plVar3.getMeasuredWidth() / bnVar.R8.getWidth();
            matrix2 = bnVar.U8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = bnVar.S8;
            matrix3 = bnVar.U8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = bnVar.T8;
            f13 = bnVar.b9;
            paint5.setAlpha((int) (f13 * 255.0f));
            paint6 = bnVar.T8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = plVar3.getMeasuredWidth();
                float measuredHeight2 = plVar3.getMeasuredHeight();
                paint7 = bnVar.T8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = bnVar.V8;
            f12 = bnVar.X8;
            float f75 = f12 * 255.0f;
            view = bnVar.Z8;
            paint2.setAlpha((int) (f75 * (view != null ? bnVar.a9 : 1.0f)));
            paint3 = bnVar.V8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = plVar3.getMeasuredWidth();
                float measuredHeight3 = plVar3.getMeasuredHeight();
                paint4 = bnVar.V8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = bnVar.c9;
        if (num2 != null && bnVar.e9) {
            plVar3.invalidate();
        }
        view2 = bnVar.Z8;
        if (view2 != null) {
            view4 = bnVar.Z8;
            if (view4 == bnVar.y1) {
                f64 = bnVar.a9;
                if (f64 < 1.0f) {
                    paint30 = bnVar.V8;
                    f65 = bnVar.X8;
                    f66 = bnVar.a9;
                    paint30.setAlpha((int) ((1.0f - f66) * f65 * 255.0f));
                    float measuredWidth4 = plVar3.getMeasuredWidth();
                    float measuredHeight4 = plVar3.getMeasuredHeight();
                    paint31 = bnVar.V8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = bnVar.Z8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f55 = bnVar.a9;
                    if (f55 < 1.0f) {
                        view20 = bnVar.Z8;
                        float left = view20.getLeft();
                        view21 = bnVar.Z8;
                        float top = view21.getTop();
                        view22 = bnVar.Z8;
                        float right = view22.getRight();
                        view23 = bnVar.Z8;
                        float bottom = view23.getBottom();
                        f59 = bnVar.a9;
                        int i19 = (int) (f59 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i19, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = bnVar.Z8;
                    float left2 = view12.getLeft();
                    view13 = bnVar.Z8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = bnVar.Z8;
                    kVar6 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = bnVar.Z8;
                        float x10 = view16.getX();
                        view17 = bnVar.Z8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = bnVar.Z8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f73;
                        view19 = bnVar.Z8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f73;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, bnVar.W8);
                    }
                    view15 = bnVar.Z8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f56 = bnVar.a9;
                    if (f56 < 1.0f) {
                        paint23 = bnVar.V8;
                        f57 = bnVar.X8;
                        f58 = bnVar.a9;
                        paint23.setAlpha((int) ((1.0f - f58) * f57 * 255.0f));
                        float measuredWidth6 = plVar3.getMeasuredWidth();
                        float measuredHeight6 = plVar3.getMeasuredHeight();
                        paint24 = bnVar.V8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    tlVar = bnVar.A0;
                    float y10 = ((tlVar.getY() + bnVar.P9) - bnVar.R9) - org.telegram.messenger.g0.L(4.0f);
                    view6 = bnVar.Z8;
                    if (view6 instanceof org.telegram.ui.Cells.r1) {
                        view11 = bnVar.Z8;
                        bjVar = ((org.telegram.ui.Cells.r1) view11).getCurrentMessagesGroup();
                    } else {
                        bjVar = null;
                    }
                    tlVar2 = bnVar.A0;
                    int childCount = tlVar2.getChildCount();
                    int i20 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = plVar3.l0;
                        f15 = 20.0f;
                        arrayList2 = plVar3.k0;
                        arrayList3 = plVar3.j0;
                        f14 = f11;
                        arrayList4 = plVar3.m0;
                        if (i20 >= childCount) {
                            break;
                        }
                        tlVar3 = bnVar.A0;
                        View childAt = tlVar3.getChildAt(i20);
                        if (childAt instanceof org.telegram.ui.Cells.r1) {
                            r1Var = (org.telegram.ui.Cells.r1) childAt;
                            bjVar2 = r1Var.getCurrentMessagesGroup();
                            yiVar = r1Var.getCurrentPosition();
                            v0Var = null;
                        } else {
                            v0Var = childAt instanceof org.telegram.ui.Cells.v0 ? (org.telegram.ui.Cells.v0) childAt : null;
                            bjVar2 = null;
                            r1Var = null;
                            yiVar = null;
                        }
                        float f76 = y10;
                        view7 = bnVar.Z8;
                        if ((childAt == view7 || (bjVar != null && bjVar == bjVar2)) && childAt.getAlpha() != f14) {
                            if (z13 || r1Var == null || bjVar == null) {
                                bjVar3 = bjVar;
                                view8 = childAt;
                                i12 = childCount;
                                i13 = i20;
                                arrayList5 = arrayList;
                                r1Var2 = r1Var;
                                arrayList6 = arrayList4;
                                wiVar = wiVar2;
                                num4 = null;
                                f20 = 1.0f;
                                f21 = 9.0f;
                            } else {
                                ArrayList arrayList8 = bjVar.d;
                                f21 = 9.0f;
                                org.telegram.messenger.aj ajVar = bjVar.m;
                                bjVar3 = bjVar;
                                org.telegram.ui.Cells.r1 r1Var5 = ajVar.m;
                                view8 = childAt;
                                if (r1Var5 != null) {
                                    float S1 = r1Var5.S1(true);
                                    float f77 = ajVar.a + S1 + ajVar.e;
                                    float f78 = ajVar.b + ajVar.f;
                                    float f79 = ajVar.c + S1 + ajVar.g;
                                    float f80 = f78;
                                    float f81 = ajVar.d + ajVar.h;
                                    if (!ajVar.j) {
                                        f80 = ajVar.m.getTranslationY() + f80;
                                        f81 = ajVar.m.getTranslationY() + f81;
                                    }
                                    float L = f80 < (bnVar.P9 - ((float) bnVar.R9)) - ((float) org.telegram.messenger.g0.L(20.0f)) ? (bnVar.P9 - bnVar.R9) - org.telegram.messenger.g0.L(20.0f) : f80;
                                    tlVar20 = bnVar.A0;
                                    i12 = childCount;
                                    if (f81 > org.telegram.messenger.g0.L(20.0f) + tlVar20.getMeasuredHeight()) {
                                        tlVar22 = bnVar.A0;
                                        f52 = org.telegram.messenger.g0.L(20.0f) + tlVar22.getMeasuredHeight();
                                    } else {
                                        f52 = f81;
                                    }
                                    i13 = i20;
                                    int size2 = arrayList8.size();
                                    arrayList5 = arrayList;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size2) {
                                            r1Var3 = r1Var;
                                            z11 = true;
                                            break;
                                        }
                                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList8.get(i21);
                                        ArrayList arrayList9 = arrayList8;
                                        int i22 = i21;
                                        if (bnVar.o6[gjVar.A0() == bnVar.l6 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) < 0) {
                                            r1Var3 = r1Var;
                                            z11 = false;
                                            break;
                                        } else {
                                            i21 = i22 + 1;
                                            arrayList8 = arrayList9;
                                        }
                                    }
                                    canvas3.save();
                                    float measuredHeight7 = ((getMeasuredHeight() - wiVar2.e()) - bnVar.ad) - org.telegram.messenger.g0.L(9.0f);
                                    v90Var6 = bnVar.X1;
                                    if (v90Var6 != null) {
                                        v90Var9 = bnVar.X1;
                                        f53 = v90Var9.d();
                                    } else {
                                        f53 = f14;
                                    }
                                    float f82 = measuredHeight7 - f53;
                                    v90Var7 = bnVar.X1;
                                    if (v90Var7 != null) {
                                        v90Var8 = bnVar.X1;
                                        f54 = v90Var8.e();
                                    } else {
                                        f54 = f14;
                                    }
                                    org.telegram.ui.Cells.r1 r1Var6 = r1Var3;
                                    canvas3.clipRect(f14, f76 + f54, getMeasuredWidth(), f82);
                                    tlVar21 = bnVar.A0;
                                    canvas3.translate(f14, tlVar21.getY());
                                    boolean z14 = ajVar.k;
                                    boolean z15 = ajVar.l;
                                    arrayList6 = arrayList4;
                                    wiVar = wiVar2;
                                    r1Var2 = r1Var6;
                                    num4 = null;
                                    f20 = 1.0f;
                                    ajVar.m.K0(canvas, (int) f77, (int) L, (int) f79, (int) f52, z14, z15, z11, 0);
                                    canvas.restore();
                                    z10 = true;
                                    if (r1Var2 != null && r1Var2.getPhotoImage().M()) {
                                        invalidate();
                                    }
                                    tlVar4 = bnVar.A0;
                                    float left3 = tlVar4.getLeft();
                                    tlVar5 = bnVar.A0;
                                    float right2 = tlVar5.getRight();
                                    float measuredHeight8 = (((getMeasuredHeight() - wiVar.e()) - bnVar.ad) - bnVar.t9(org.telegram.ui.Components.w11.c)) - org.telegram.messenger.g0.L(f21);
                                    v90Var3 = bnVar.X1;
                                    if (v90Var3 == null) {
                                        v90Var4 = bnVar.X1;
                                        float max = Math.max(0.0f, v90Var4.e());
                                        v90Var5 = bnVar.X1;
                                        f23 = Math.max(0.0f, v90Var5.d());
                                        f22 = max;
                                    } else {
                                        f22 = 0.0f;
                                        f23 = 0.0f;
                                    }
                                    rjVar = bnVar.a0;
                                    if (rjVar != null && (efVar = rjVar.n0) != null) {
                                        f23 = Math.max(f23, efVar.f ? 0.0f : Math.max(0.0f, efVar.getMeasuredHeight() - (efVar.c.getTranslationY() + efVar.e)));
                                    }
                                    float f83 = f76 + f22;
                                    float f84 = measuredHeight8 - f23;
                                    if (r1Var2 != null || !r1Var2.getTransitionParams().x0) {
                                        tlVar6 = bnVar.A0;
                                        left3 = Math.max(left3, view8.getX() + tlVar6.getLeft());
                                        tlVar7 = bnVar.A0;
                                        f83 = Math.max(f83, view8.getY() + tlVar7.getY());
                                        tlVar8 = bnVar.A0;
                                        right2 = Math.min(right2, view8.getX() + tlVar8.getLeft() + view8.getMeasuredWidth());
                                        tlVar9 = bnVar.A0;
                                        f84 = Math.min(f84, view8.getY() + tlVar9.getY() + view8.getMeasuredHeight());
                                    }
                                    f24 = f84;
                                    f25 = f83;
                                    float f85 = right2;
                                    float max2 = Math.max(left3, bnVar.n9());
                                    if (f25 >= f24) {
                                        if (view8.getAlpha() != f20) {
                                            canvas4 = canvas;
                                            canvas4.saveLayerAlpha(max2, f25, f85, f24, (int) (view8.getAlpha() * 255.0f), 31);
                                            f50 = f25;
                                            f27 = f24;
                                            f29 = max2;
                                            f30 = f85;
                                        } else {
                                            canvas4 = canvas;
                                            f50 = f25;
                                            f27 = f24;
                                            f29 = max2;
                                            f30 = f85;
                                            canvas4.save();
                                        }
                                        if (r1Var2 != null) {
                                            r1Var2.setInvalidatesParent(true);
                                            num12 = bnVar.c9;
                                            r1Var2.setScrimReaction(num12);
                                        } else if (v0Var != null) {
                                            v0Var.setInvalidatesParent(true);
                                            num11 = bnVar.c9;
                                            v0Var.setScrimReaction(num11);
                                        }
                                        canvas4.clipRect(f29, f50, f30, f27);
                                        tlVar18 = bnVar.A0;
                                        float x11 = view8.getX() + tlVar18.getLeft();
                                        tlVar19 = bnVar.A0;
                                        canvas4.translate(x11, view8.getY() + tlVar19.getY());
                                        if (r1Var2 != null && bjVar3 == null && r1Var2.L0()) {
                                            canvas4.save();
                                            canvas4.translate(0.0f, r1Var2.getPaddingTop());
                                            r1Var2.M0(canvas4, true, false);
                                            canvas4.restore();
                                        }
                                        if (r1Var2 != null && bjVar3 == null) {
                                            f51 = bnVar.b9;
                                            r1Var2.b1(canvas4, f51);
                                        }
                                        view9 = view8;
                                        view9.draw(canvas4);
                                        if (r1Var2 == null || !r1Var2.k2()) {
                                            f26 = f50;
                                            f28 = 0.0f;
                                        } else {
                                            canvas4.save();
                                            f26 = f50;
                                            f28 = 0.0f;
                                            canvas4.translate(0.0f, r1Var2.getPaddingTop());
                                            r1Var2.i1(canvas4);
                                            canvas4.restore();
                                        }
                                        if (v0Var != null) {
                                            v0Var.I(canvas4);
                                        }
                                        canvas4.restore();
                                        if (r1Var2 != null) {
                                            r1Var2.setInvalidatesParent(false);
                                            r1Var2.setScrimReaction(num4);
                                        } else if (v0Var != null) {
                                            v0Var.setInvalidatesParent(false);
                                            v0Var.setScrimReaction(num4);
                                        }
                                    } else {
                                        canvas4 = canvas;
                                        f26 = f25;
                                        f27 = f24;
                                        view9 = view8;
                                        f28 = 0.0f;
                                        f29 = max2;
                                        f30 = f85;
                                    }
                                    yiVar2 = yiVar;
                                    if (yiVar2 == null || (r1Var2 != null && r1Var2.getTransitionParams().x0)) {
                                        if (yiVar2 != null || yiVar2.h || (yiVar2.a == 0 && yiVar2.c == 0)) {
                                            if (yiVar2 != null || yiVar2.h) {
                                                arrayList3.add(r1Var2);
                                            }
                                            if (yiVar2 != null || (yiVar2.a == 0 && yiVar2.c == 0 && r1Var2.j2())) {
                                                arrayList2.add(r1Var2);
                                            }
                                        }
                                        if (yiVar2 != null || (yiVar2.l & r1Var2.B()) != 0) {
                                            arrayList5.add(r1Var2);
                                        }
                                        if (yiVar2 != null) {
                                            int i23 = yiVar2.l;
                                            if ((i23 & 8) != 0) {
                                            }
                                        }
                                        arrayList6.add(r1Var2);
                                    }
                                    num5 = bnVar.c9;
                                    if (num5 == null && r1Var2 != null && bjVar3 == null) {
                                        paint18 = bnVar.T8;
                                        if (paint18 != null) {
                                            matrix10 = bnVar.U8;
                                            matrix10.reset();
                                            float measuredWidth7 = getMeasuredWidth() / bnVar.R8.getWidth();
                                            matrix11 = bnVar.U8;
                                            matrix11.postScale(measuredWidth7, measuredWidth7);
                                            BitmapShader bitmapShader2 = bnVar.S8;
                                            matrix12 = bnVar.U8;
                                            bitmapShader2.setLocalMatrix(matrix12);
                                            paint21 = bnVar.T8;
                                            f49 = bnVar.b9;
                                            paint21.setAlpha((int) (f49 * 255.0f));
                                            float measuredWidth8 = getMeasuredWidth();
                                            float measuredHeight9 = getMeasuredHeight();
                                            paint22 = bnVar.T8;
                                            f39 = f30;
                                            f40 = f29;
                                            view10 = view9;
                                            i15 = 1;
                                            canvas4.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint22);
                                        } else {
                                            f39 = f30;
                                            f40 = f29;
                                            view10 = view9;
                                            i15 = 1;
                                            paint19 = bnVar.V8;
                                            f41 = bnVar.X8;
                                            f42 = bnVar.a9;
                                            paint19.setAlpha((int) (f42 * f41 * 255.0f));
                                            float measuredWidth9 = getMeasuredWidth();
                                            float measuredHeight10 = getMeasuredHeight();
                                            paint20 = bnVar.V8;
                                            canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint20);
                                        }
                                        if (f25 < f24) {
                                            f43 = bnVar.X8;
                                            f44 = bnVar.a9;
                                            float f86 = (f44 * f43) / f74;
                                            float alpha = view10.getAlpha();
                                            f45 = bnVar.a9;
                                            float f87 = f45 * alpha;
                                            if (f87 < f20) {
                                                f46 = f28;
                                                canvas5 = canvas;
                                                f47 = f27;
                                                float f88 = f26;
                                                canvas5.saveLayerAlpha(f40, f88, f39, f47, (int) (f87 * 255.0f), 31);
                                                f48 = f88;
                                            } else {
                                                canvas5 = canvas;
                                                f46 = f28;
                                                f47 = f27;
                                                f48 = f26;
                                                canvas5.save();
                                            }
                                            canvas5.clipRect(f40, f48, f39, f47);
                                            tlVar14 = bnVar.A0;
                                            float x12 = view10.getX() + tlVar14.getLeft();
                                            tlVar15 = bnVar.A0;
                                            canvas5.translate(x12, view10.getY() + tlVar15.getY() + view10.getPaddingTop());
                                            num9 = bnVar.c9;
                                            r1Var2.s1(canvas5, num9, f86, bnVar.Y8);
                                            canvas5.restore();
                                            canvas5.save();
                                            tlVar16 = bnVar.A0;
                                            float x13 = view10.getX() + tlVar16.getLeft();
                                            tlVar17 = bnVar.A0;
                                            canvas5.translate(x13, view10.getY() + tlVar17.getY() + view10.getPaddingTop());
                                            int i24 = bnVar.d9;
                                            num10 = bnVar.c9;
                                            i14 = i15;
                                            f31 = f76;
                                            f14 = f46;
                                            r1Var2.t1(this, canvas5, i24, num10, f86);
                                            canvas.restore();
                                        } else {
                                            i14 = i15;
                                            f31 = f76;
                                            f14 = f28;
                                        }
                                    } else {
                                        float f89 = f30;
                                        float f90 = f29;
                                        View view25 = view9;
                                        f14 = f28;
                                        float f91 = f27;
                                        float f92 = f26;
                                        f31 = f76;
                                        i14 = 1;
                                        num6 = bnVar.c9;
                                        if (num6 != null && v0Var != null) {
                                            paint13 = bnVar.T8;
                                            if (paint13 == null) {
                                                matrix7 = bnVar.U8;
                                                matrix7.reset();
                                                float measuredWidth10 = getMeasuredWidth() / bnVar.R8.getWidth();
                                                matrix8 = bnVar.U8;
                                                matrix8.postScale(measuredWidth10, measuredWidth10);
                                                BitmapShader bitmapShader3 = bnVar.S8;
                                                matrix9 = bnVar.U8;
                                                bitmapShader3.setLocalMatrix(matrix9);
                                                paint16 = bnVar.T8;
                                                f38 = bnVar.b9;
                                                paint16.setAlpha((int) (f38 * 255.0f));
                                                float measuredWidth11 = getMeasuredWidth();
                                                float measuredHeight11 = getMeasuredHeight();
                                                paint17 = bnVar.T8;
                                                v0Var2 = v0Var;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint17);
                                            } else {
                                                v0Var2 = v0Var;
                                                paint14 = bnVar.V8;
                                                f32 = bnVar.X8;
                                                f33 = bnVar.a9;
                                                paint14.setAlpha((int) (f33 * f32 * 255.0f));
                                                float measuredWidth12 = getMeasuredWidth();
                                                float measuredHeight12 = getMeasuredHeight();
                                                paint15 = bnVar.V8;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint15);
                                            }
                                            if (f25 < f24) {
                                                f34 = bnVar.X8;
                                                f35 = bnVar.a9;
                                                float f93 = (f35 * f34) / f74;
                                                float alpha2 = view25.getAlpha();
                                                f36 = bnVar.a9;
                                                float f94 = f36 * alpha2;
                                                if (f94 < f20) {
                                                    canvas.saveLayerAlpha(f90, f92, f89, f91, (int) (f94 * 255.0f), 31);
                                                    f91 = f91;
                                                    f37 = f92;
                                                    canvas3 = canvas;
                                                } else {
                                                    canvas3 = canvas;
                                                    f37 = f92;
                                                    canvas3.save();
                                                }
                                                canvas3.clipRect(f90, f37, f89, f91);
                                                tlVar10 = bnVar.A0;
                                                float x14 = view25.getX() + tlVar10.getLeft();
                                                tlVar11 = bnVar.A0;
                                                canvas3.translate(x14, view25.getY() + tlVar11.getY() + view25.getPaddingTop());
                                                num7 = bnVar.c9;
                                                boolean z16 = bnVar.Y8;
                                                ch.q0 q0Var = v0Var2.F0;
                                                q0Var.getClass();
                                                org.telegram.ui.ActionBar.h6 h6Var = v0Var2.h1;
                                                if (h6Var != null) {
                                                    h6Var.e(v0Var2.v0, v0Var2.u0 + org.telegram.messenger.g0.L(4.0f), v0Var2.getMeasuredWidth(), v0Var2.w0);
                                                } else {
                                                    org.telegram.ui.ActionBar.m6.r(v0Var2.v0, v0Var2.u0 + org.telegram.messenger.g0.L(4.0f), v0Var2.getMeasuredWidth(), v0Var2.w0);
                                                }
                                                q0Var.A = f93;
                                                q0Var.B = z16;
                                                q0Var.d(canvas3, v0Var2.x2.c, num7);
                                                canvas3.restore();
                                                canvas3.save();
                                                tlVar12 = bnVar.A0;
                                                float x15 = view25.getX() + tlVar12.getLeft();
                                                tlVar13 = bnVar.A0;
                                                canvas3.translate(x15, view25.getY() + tlVar13.getY() + view25.getPaddingTop());
                                                int i25 = bnVar.d9;
                                                num8 = bnVar.c9;
                                                v0Var2.L(this, canvas3, i25, num8, f93);
                                                plVar2 = this;
                                                canvas3.restore();
                                                z13 = z10;
                                            }
                                        }
                                    }
                                    plVar2 = this;
                                    canvas3 = canvas;
                                    z13 = z10;
                                } else {
                                    i12 = childCount;
                                    i13 = i20;
                                    arrayList5 = arrayList;
                                    r1Var2 = r1Var;
                                    arrayList6 = arrayList4;
                                    wiVar = wiVar2;
                                    num4 = null;
                                    f20 = 1.0f;
                                }
                            }
                            z10 = z13;
                            if (r1Var2 != null) {
                                invalidate();
                            }
                            tlVar4 = bnVar.A0;
                            float left32 = tlVar4.getLeft();
                            tlVar5 = bnVar.A0;
                            float right22 = tlVar5.getRight();
                            float measuredHeight82 = (((getMeasuredHeight() - wiVar.e()) - bnVar.ad) - bnVar.t9(org.telegram.ui.Components.w11.c)) - org.telegram.messenger.g0.L(f21);
                            v90Var3 = bnVar.X1;
                            if (v90Var3 == null) {
                            }
                            rjVar = bnVar.a0;
                            if (rjVar != null) {
                                f23 = Math.max(f23, efVar.f ? 0.0f : Math.max(0.0f, efVar.getMeasuredHeight() - (efVar.c.getTranslationY() + efVar.e)));
                            }
                            float f832 = f76 + f22;
                            float f842 = measuredHeight82 - f23;
                            if (r1Var2 != null) {
                            }
                            tlVar6 = bnVar.A0;
                            left32 = Math.max(left32, view8.getX() + tlVar6.getLeft());
                            tlVar7 = bnVar.A0;
                            f832 = Math.max(f832, view8.getY() + tlVar7.getY());
                            tlVar8 = bnVar.A0;
                            right22 = Math.min(right22, view8.getX() + tlVar8.getLeft() + view8.getMeasuredWidth());
                            tlVar9 = bnVar.A0;
                            f842 = Math.min(f842, view8.getY() + tlVar9.getY() + view8.getMeasuredHeight());
                            f24 = f842;
                            f25 = f832;
                            float f852 = right22;
                            float max22 = Math.max(left32, bnVar.n9());
                            if (f25 >= f24) {
                            }
                            yiVar2 = yiVar;
                            if (yiVar2 == null) {
                            }
                            if (yiVar2 != null) {
                            }
                            if (yiVar2 != null) {
                            }
                            arrayList3.add(r1Var2);
                            if (yiVar2 != null) {
                            }
                            arrayList2.add(r1Var2);
                            if (yiVar2 != null) {
                            }
                            arrayList5.add(r1Var2);
                            if (yiVar2 != null) {
                            }
                            arrayList6.add(r1Var2);
                            num5 = bnVar.c9;
                            if (num5 == null) {
                            }
                            float f892 = f30;
                            float f902 = f29;
                            View view252 = view9;
                            f14 = f28;
                            float f912 = f27;
                            float f922 = f26;
                            f31 = f76;
                            i14 = 1;
                            num6 = bnVar.c9;
                            if (num6 != null) {
                                paint13 = bnVar.T8;
                                if (paint13 == null) {
                                }
                                if (f25 < f24) {
                                }
                            }
                            plVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            f20 = 1.0f;
                            i14 = 1;
                            plVar2 = this;
                            bjVar3 = bjVar;
                            i12 = childCount;
                            i13 = i20;
                            wiVar = wiVar2;
                            f31 = f76;
                        }
                        i20 = i13 + 1;
                        plVar3 = plVar2;
                        y10 = f31;
                        f11 = f14;
                        wiVar2 = wiVar;
                        f10 = f20;
                        i10 = i14;
                        bjVar = bjVar3;
                        childCount = i12;
                    }
                    org.telegram.messenger.bj bjVar4 = bjVar;
                    int i26 = i10;
                    f16 = f10;
                    float f95 = y10;
                    plVar = plVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i27 = 0; i27 < size3; i27++) {
                            plVar.Y(canvas3, f95, (org.telegram.ui.Cells.r1) arrayList3.get(i27), 0);
                        }
                        i11 = 0;
                        arrayList3.clear();
                    } else {
                        i11 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i28 = i11; i28 < size4; i28++) {
                            plVar.Y(canvas3, f95, (org.telegram.ui.Cells.r1) arrayList2.get(i28), i26);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i29 = i11; i29 < size5; i29++) {
                            org.telegram.ui.Cells.r1 r1Var7 = (org.telegram.ui.Cells.r1) arrayList.get(i29);
                            if (r1Var7.getCurrentPosition() != null || r1Var7.getTransitionParams().x0) {
                                plVar.Y(canvas3, f95, r1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i30 = i11; i30 < size6; i30++) {
                            org.telegram.ui.Cells.r1 r1Var8 = (org.telegram.ui.Cells.r1) arrayList4.get(i30);
                            if (r1Var8.getCurrentPosition() != null || r1Var8.getTransitionParams().x0) {
                                plVar.Y(canvas3, f95, r1Var8, 3);
                            }
                        }
                    }
                    num3 = bnVar.c9;
                    if (num3 != null && bjVar4 != null) {
                        paint8 = bnVar.T8;
                        if (paint8 != null) {
                            matrix4 = bnVar.U8;
                            matrix4.reset();
                            float measuredWidth13 = plVar.getMeasuredWidth() / bnVar.R8.getWidth();
                            matrix5 = bnVar.U8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = bnVar.S8;
                            matrix6 = bnVar.U8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = bnVar.T8;
                            f19 = bnVar.b9;
                            paint11.setAlpha((int) (f19 * 255.0f));
                            float measuredWidth14 = plVar.getMeasuredWidth();
                            float measuredHeight13 = plVar.getMeasuredHeight();
                            paint12 = bnVar.T8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = bnVar.V8;
                            f17 = bnVar.X8;
                            f18 = bnVar.a9;
                            paint9.setAlpha((int) (f18 * f17 * 255.0f));
                            float measuredWidth15 = plVar.getMeasuredWidth();
                            float measuredHeight14 = plVar.getMeasuredHeight();
                            paint10 = bnVar.V8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i31 = i11; i31 < size7; i31++) {
                            org.telegram.ui.Cells.r1 r1Var9 = (org.telegram.ui.Cells.r1) arrayList4.get(i31);
                            if (r1Var9.getCurrentPosition() != null || r1Var9.getTransitionParams().x0) {
                                plVar.Y(canvas3, f95, r1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = bnVar.c9;
                    if (num13 == null) {
                        f60 = bnVar.a9;
                        if (f60 < f16) {
                            paint25 = bnVar.T8;
                            if (paint25 != null) {
                                matrix13 = bnVar.U8;
                                matrix13.reset();
                                float measuredWidth16 = plVar.getMeasuredWidth() / bnVar.R8.getWidth();
                                matrix14 = bnVar.U8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = bnVar.S8;
                                matrix15 = bnVar.U8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = bnVar.T8;
                                f63 = bnVar.b9;
                                paint28.setAlpha((int) (f63 * 255.0f));
                                float measuredWidth17 = plVar.getMeasuredWidth();
                                float measuredHeight15 = plVar.getMeasuredHeight();
                                paint29 = bnVar.T8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = bnVar.V8;
                                f61 = bnVar.X8;
                                f62 = bnVar.a9;
                                paint26.setAlpha((int) ((f16 - f62) * f61 * 255.0f));
                                float measuredWidth18 = plVar.getMeasuredWidth();
                                float measuredHeight16 = plVar.getMeasuredHeight();
                                paint27 = bnVar.V8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            plVar = plVar3;
            f16 = 1.0f;
            f14 = 0.0f;
            f15 = 20.0f;
            num13 = bnVar.c9;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            plVar = plVar3;
            f14 = 0.0f;
            f15 = 20.0f;
        }
        view3 = bnVar.Z8;
        if (view3 != null || ((ArrayList) bnVar.ja.c).size() > 0) {
            v90Var = bnVar.X1;
            if (v90Var != null) {
                v90Var2 = bnVar.X1;
            }
            super.drawChild(canvas3, bnVar.y1, SystemClock.uptimeMillis());
            jj jjVar = bnVar.m3;
            if (jjVar != null && jjVar.getTag() != null) {
                super.drawChild(canvas3, bnVar.m3, SystemClock.uptimeMillis());
            }
            hj hjVar = bnVar.n3;
            if (hjVar != null && hjVar.getTag() != null) {
                super.drawChild(canvas3, bnVar.n3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.wz wzVar = bnVar.J9;
            if (wzVar != null) {
                super.drawChild(canvas3, wzVar, SystemClock.uptimeMillis());
            }
            wh.i iVar = bnVar.ua;
            if (iVar != null) {
                super.drawChild(canvas3, iVar, SystemClock.uptimeMillis());
            }
            hi.l3 l3Var3 = bnVar.t2;
            if (l3Var3 != null) {
                super.drawChild(canvas3, l3Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = bnVar.N3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, bnVar.N3, SystemClock.uptimeMillis());
            }
            nk nkVar = bnVar.O3;
            if (nkVar != null && nkVar.getVisibility() == 0) {
                super.drawChild(canvas3, bnVar.O3, SystemClock.uptimeMillis());
            }
            hi.l3 l3Var4 = bnVar.M1;
            if (l3Var4 != null && l3Var4.getVisibility() == 0) {
                super.drawChild(canvas3, bnVar.M1, SystemClock.uptimeMillis());
            }
            al alVar = bnVar.Q1;
            if (alVar != null && alVar.getVisibility() == 0) {
                super.drawChild(canvas3, bnVar.Q1, SystemClock.uptimeMillis());
            }
            hi.l3 l3Var5 = bnVar.O1;
            if (l3Var5 != null && l3Var5.getVisibility() == 0) {
                super.drawChild(canvas3, bnVar.O1, SystemClock.uptimeMillis());
            }
            rj rjVar2 = bnVar.a0;
            if (rjVar2 != null && rjVar2.M != null) {
                canvas3.save();
                canvas3.translate(bnVar.a0.M.getX() + bnVar.a0.getX(), bnVar.a0.M.getY() + bnVar.a0.getY());
                bnVar.a0.M.draw(canvas3);
                canvas3.restore();
            }
        }
        if (bnVar.Ma > 0 && plVar.f < org.telegram.messenger.g0.L(f15)) {
            int themedColor = bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6);
            if (plVar.n0 == null) {
                plVar.n0 = new Paint();
            }
            if (plVar.o0 != themedColor) {
                Paint paint32 = plVar.n0;
                plVar.o0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, plVar.getMeasuredHeight() - bnVar.Ma, plVar.getMeasuredWidth(), plVar.getMeasuredHeight(), plVar.n0);
            canvas3 = canvas6;
        }
        yo yoVar = bnVar.ma;
        if (yoVar != null) {
            if (yoVar.T > 0.0f && !yoVar.S) {
                int inputBubbleTop = (int) bnVar.U.getInputBubbleTop();
                int inputBubbleBottom = (int) bnVar.U.getInputBubbleBottom();
                bn bnVar2 = bnVar.qa;
                int i32 = inputBubbleTop - ((int) (bnVar.ra * (bnVar2 == null ? f14 : bnVar2.la)));
                yo yoVar2 = bnVar.ma;
                plVar.getMeasuredWidth();
                yoVar2.b(canvas3, i32, inputBubbleBottom);
            }
        }
        if (bnVar.qa != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, plVar.getMeasuredWidth(), plVar.getMeasuredHeight(), (int) (bnVar.ra * 255.0f), 31);
            canvas3 = canvas;
            bnVar.qa.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        bnVar.Ua.e(canvas3);
        if (i17 >= 0) {
            canvas3.restore();
        }
        if (bnVar.Ha) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (bnVar.Ia * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        mk mkVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (mkVar = this.x0.cb) == null || !mkVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        mkVar.a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r4 == r6.getBackButton()) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        zj zjVar;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.x0;
        jh.e eVar = bnVar.c4;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y10 = (org.telegram.messenger.g0.E || bnVar.isInBubbleMode()) ? (bnVar.a0.getEmojiView() != null ? bnVar.a0.getEmojiView() : bnVar.a0).getY() : bnVar.a0.getY();
        View view = bnVar.Z8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        }
        rj rjVar = bnVar.a0;
        if (rjVar == null || !rjVar.p4 || motionEvent.getY() >= y10) {
            bnVar.G9 = motionEvent.getY();
            org.telegram.ui.Cells.v9 n10 = bnVar.u9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!bnVar.u9.x() || !bnVar.u9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                hi.i1 i1Var = bnVar.F1;
                if (i1Var != null) {
                    if (bnVar.J3 != null) {
                        z10 = i1Var.x(motionEvent);
                        if (bnVar.F1.I) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !bnVar.u9.x() || (motionEvent.getY() >= bnVar.A0.getTop() && motionEvent.getY() <= bnVar.A0.getBottom())) {
                            zjVar = bnVar.Ta;
                            if (!zjVar.n) {
                                return zjVar.g(motionEvent);
                            }
                            ab.q qVar = ab.q.e;
                            if (qVar == null || !qVar.a) {
                                if (bnVar.isInPreviewMode() && bnVar.ga) {
                                    if (motionEvent.getAction() == 0) {
                                        int i7 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (bnVar.y1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                h6.m mVar = bnVar.y1.e[i10 == 0 ? 1 : i10 == 1 ? i7 : i11];
                                                if (mVar != null) {
                                                    ((kh.b) mVar.b).getLocationInWindow(iArr2);
                                                    Rect rect = org.telegram.messenger.g0.Q;
                                                    int i12 = iArr2[0] - iArr[0];
                                                    rect.set(i12, iArr2[1] - iArr[1], org.telegram.messenger.g0.L(56.0f) + i12, org.telegram.messenger.g0.L(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                i10++;
                                                i7 = 2;
                                            }
                                        }
                                        z11 = false;
                                        vi viVar = bnVar.p1;
                                        if (viVar != null) {
                                            viVar.getLocationInWindow(iArr2);
                                            Rect rect2 = org.telegram.messenger.g0.Q;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], bnVar.p1.getMeasuredWidth() + i13, bnVar.p1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.s0 = motionEvent.getX();
                                                    this.t0 = motionEvent.getY();
                                                    this.u0 = SystemClock.elapsedRealtime();
                                                    this.v0 = z12;
                                                    vi viVar2 = bnVar.p1;
                                                    if (viVar2 != null) {
                                                        viVar2.i0.c(z12);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    this.u0 = -1L;
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        vi viVar3 = bnVar.p1;
                                        if (viVar3 != null) {
                                            viVar3.i0.c(false);
                                        }
                                        if (this.v0 || (a8.w9.a(this.s0, this.t0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.L(6.0f) && SystemClock.elapsedRealtime() - this.u0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.v0) {
                                                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                                                bnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) r4Var2).S(ProfileActivity.D4(bnVar.l6));
                                            } else {
                                                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                                                ((ActionBarLayout) r4Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.u0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.u0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z10) {
                                }
                            } else {
                                r4 r4Var3 = (r4) ab.q.o().d;
                                if (r4Var3 != null) {
                                    r4Var3.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (bnVar.u9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n10.getX(), n10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = i1Var.e;
                        if (i1Var.I) {
                            i1Var.J = true;
                            i1Var.I = false;
                            i1Var.B(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                i1Var.B(view2, i1Var.E ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            i1Var.d = 0;
                            i1Var.c = 1.0f;
                            org.telegram.ui.Components.z61 z61Var = i1Var.N;
                            if (z61Var != null) {
                                z61Var.f(1.0f, 0, i1Var.b);
                            }
                            i1Var.t(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                zjVar = bnVar.Ta;
                if (!zjVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bn bnVar = this.x0;
        org.telegram.ui.Components.g11 g11Var = bnVar.n0;
        float progress = (view == g11Var || view == this.M || view == bnVar.Z || (view instanceof org.telegram.ui.ActionBar.j5) || g11Var == null) ? 0.0f : g11Var.getProgress() * bnVar.n0.getContentWidth();
        if (progress <= 0.0f) {
            return Z(canvas, view, j3);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j3);
        canvas.restore();
        return Z;
    }

    @Override // org.telegram.ui.Components.du0
    public float getBottomOffset() {
        return this.x0.A0.getBottom();
    }

    public bn getChatActivity() {
        return this.x0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.x0.getThemedColor(org.telegram.ui.ActionBar.m6.ua);
        ColorDrawable colorDrawable = this.w0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.w0 = new ColorDrawable(themedColor);
        }
        return this.w0;
    }

    @Override // org.telegram.ui.Components.du0
    public int getKeyboardHeight() {
        if (this.x0.mb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.du0
    public float getListTranslationY() {
        return this.x0.A0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.du0
    public Drawable getNewDrawable() {
        bn bnVar = this.x0;
        if (bnVar.S9()) {
            return getCompactBackground();
        }
        Drawable c10 = bnVar.Ba.c();
        return c10 != null ? c10 : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.du0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.x0.Ba.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.du0
    public int getScrollOffset() {
        return this.x0.A0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        View view;
        super.onAttachedToWindow();
        bn bnVar = this.x0;
        if (bnVar.mb) {
            this.I.b = bnVar.m1;
        } else {
            r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                if (((ActionBarLayout) r4Var2).b) {
                    org.telegram.ui.ActionBar.i1 i1Var = this.I;
                    r4Var3 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                    i1Var.b = (FrameLayout) r4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.I.c();
        bnVar.a0.setAdjustPanLayoutHelper(this.I);
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        if (gjVar != null && ((gjVar.h4() || org.telegram.messenger.gj.L4(gjVar.k)) && gjVar.T == 0 && org.telegram.messenger.gj.B0(gjVar.k) == bnVar.l6)) {
            MediaController.B().p0(bnVar.e8(false), bnVar.L8, bnVar.J8, true);
        }
        yo yoVar = bnVar.ma;
        if (yoVar != null) {
            yoVar.G.P();
            org.telegram.ui.Components.p5 p5Var = yoVar.l0;
            if (p5Var != null && (view = yoVar.b0) != null) {
                p5Var.a(view);
            }
            org.telegram.messenger.ls.f(yoVar.f0).c(yoVar, org.telegram.messenger.ls.r);
        }
        bnVar.Ua.i();
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.I.d();
        bn bnVar = this.x0;
        yo yoVar = bnVar.ma;
        if (yoVar != null) {
            org.telegram.messenger.ls.f(yoVar.f0).n(yoVar, org.telegram.messenger.ls.r);
            yoVar.G.R();
            org.telegram.ui.Components.p5 p5Var = yoVar.l0;
            if (p5Var != null && (view = yoVar.b0) != null) {
                p5Var.n(view);
            }
            yoVar.R = 0.0f;
            yoVar.Q = 0L;
            bnVar.ma = null;
        }
        bnVar.Ua.j();
        org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(21));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        bn bnVar;
        hi.l5 l5Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (l5Var = (bnVar = this.x0).N2) == null || !l5Var.a() || bnVar.N2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        if (r8 != r3.kd) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int e10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int L;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar3;
        int i19;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        bn bnVar = this.x0;
        wi wiVar = bnVar.w;
        int i20 = (measuredWidth - bnVar.rb) - bnVar.sb;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.ls.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    e10 = i5.c.e(i20, measuredWidth2, 2, bnVar.rb) + layoutParams.leftMargin;
                    i13 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i14 = bnVar.rb + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i17 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                    i17 += kVar7.getMeasuredHeight();
                                }
                            }
                        } else if (i23 != 80) {
                            i17 = layoutParams.topMargin;
                        } else {
                            i15 = (i12 - i10) - measuredHeight;
                            i16 = layoutParams.bottomMargin;
                        }
                        if (a0(childAt)) {
                            i17 = 0;
                            i14 = 0;
                        } else {
                            if (childAt != bnVar.ja && childAt != bnVar.ua && childAt != bnVar.U && !(childAt instanceof org.telegram.ui.Components.m30) && childAt != bnVar.n0) {
                                if (childAt instanceof org.telegram.ui.Cells.v9) {
                                    i18 = bnVar.Xa;
                                } else if (childAt == bnVar.f1) {
                                    kVar3 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                        i19 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    i17 += i19;
                                } else if (bnVar.a0.T0(childAt)) {
                                    if (!org.telegram.messenger.g0.E) {
                                        z11 = ((org.telegram.ui.ActionBar.g2) bnVar).inBubbleMode;
                                        if (!z11) {
                                            i17 = bnVar.a0.getBottom();
                                        }
                                    }
                                    i17 = bnVar.a0.getTop() - childAt.getMeasuredHeight();
                                    L = org.telegram.messenger.g0.L(1.0f);
                                    i17 += L;
                                } else {
                                    rj rjVar = bnVar.a0;
                                    if (rjVar != null && (childAt == rjVar.E2 || childAt == rjVar.D2)) {
                                        i17 = org.telegram.messenger.o10.x(7.0f, wiVar.e(), i17);
                                        i14 -= org.telegram.messenger.g0.L(3.0f);
                                    } else if (childAt == bnVar.L2) {
                                        i17 = org.telegram.messenger.o10.x(7.0f, wiVar.e(), i17);
                                    } else if (rjVar != null && childAt == rjVar.f1) {
                                        i17 = org.telegram.messenger.o10.x(9.0f, wiVar.e(), i17);
                                    } else if (childAt == bnVar.A0 || childAt == bnVar.y0 || childAt == bnVar.m3 || childAt == bnVar.n3 || childAt == bnVar.o3) {
                                        i18 = bnVar.Xa;
                                    } else if (childAt != bnVar.R) {
                                        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                        if (childAt == kVar) {
                                            i17 -= getPaddingTop();
                                            if (bnVar.isInPreviewMode()) {
                                                L = org.telegram.messenger.g0.L(1.0f);
                                                i17 += L;
                                            }
                                        } else if (childAt == bnVar.J8) {
                                            kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                            i17 = kVar2.getMeasuredHeight();
                                        } else if (childAt != bnVar.q3 && childAt != bnVar.r3 && childAt != bnVar.x0) {
                                            if (childAt instanceof org.telegram.ui.Components.wa0) {
                                                i17 = org.telegram.messenger.g0.m;
                                            } else if (childAt != bnVar.V) {
                                                if (childAt != bnVar.c4) {
                                                }
                                            }
                                        }
                                    } else if (rjVar.Z0()) {
                                        i17 -= org.telegram.messenger.g0.L(48.0f);
                                    }
                                }
                                i17 = -i18;
                            }
                            i17 = 0;
                        }
                        childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
                    } else {
                        i15 = (((i12 - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    i17 = i15 - i16;
                    if (a0(childAt)) {
                    }
                    childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
                } else {
                    e10 = (measuredWidth - bnVar.sb) - measuredWidth2;
                    i13 = layoutParams.rightMargin;
                }
                i14 = e10 - i13;
                if (i23 == 16) {
                }
                i17 = i15 - i16;
                if (a0(childAt)) {
                }
                childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
            }
        }
        hj hjVar = bnVar.n3;
        if (hjVar != null) {
            hjVar.setBackgroundHeight(getMeasuredHeight());
        }
        bnVar.M9();
        bnVar.O9();
        bnVar.vd(false, false);
        R();
        bnVar.I7();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x053b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int childCount;
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.Components.gc gcVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i13;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.x xVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.q0 q0Var2;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        bn bnVar = this.x0;
        wi wiVar = bnVar.w;
        int i14 = (size - bnVar.rb) - bnVar.sb;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
        ui.a aVar = bnVar.N.a;
        if (aVar instanceof ui.b) {
            ((ui.b) aVar).b(i14, size2);
        }
        int i15 = 0;
        if (this.i0 != i14) {
            bnVar.T4 = false;
            this.i0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
            if (z13 || (user = bnVar.f) == null || !user.self) {
                bnVar.ha = false;
            } else {
                org.telegram.ui.ActionBar.m5 titleTextView = bnVar.p1.getTitleTextView();
                if (i14 - org.telegram.messenger.g0.L(152.0f) > org.telegram.messenger.g0.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    bnVar.ha = !bnVar.ia;
                } else {
                    bnVar.ha = false;
                }
            }
            if (bnVar.ha || bnVar.ia || org.telegram.messenger.p10.w(bnVar.f)) {
                vi viVar = bnVar.p1;
                if (viVar != null && viVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) bnVar.p1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(bnVar.g4 == 3 && ((q0Var = bnVar.m0) == null || q0Var.getVisibility() != 0) ? 52.0f : 92.0f);
                }
            } else {
                vi viVar2 = bnVar.p1;
                if (viVar2 != null && viVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) bnVar.p1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(52.0f);
                }
            }
            if (bnVar.ha) {
                kVar8 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (!kVar8.o0 && (q0Var2 = bnVar.p0) != null) {
                    q0Var2.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var3 = bnVar.j0;
                if (q0Var3 != null) {
                    q0Var3.u(40);
                }
            } else {
                org.telegram.ui.ActionBar.q0 q0Var4 = bnVar.j0;
                if (q0Var4 != null) {
                    q0Var4.T(40);
                }
                org.telegram.ui.ActionBar.q0 q0Var5 = bnVar.p0;
                if (q0Var5 != null) {
                    q0Var5.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            if (!kVar7.o0 && (xVar = bnVar.q0) != null) {
                xVar.e((!bnVar.ia || bnVar.ha) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.q0 q0Var6 = bnVar.j0;
            if (q0Var6 != null) {
                TLRPC.UserFull userFull = bnVar.s8;
                if (bnVar.ia) {
                    q0Var6.u(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    q0Var6.T(32);
                }
            }
            bnVar.T4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + bnVar.La >= org.telegram.messenger.g0.L(20.0f);
        if (this.h0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (bnVar.Ma > 0 && keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            bnVar.La = bnVar.Ma;
        } else if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            bnVar.La = bnVar.a0.S0() ? bnVar.a0.getEmojiPadding() : 0;
        } else {
            bnVar.La = 0;
        }
        setEmojiKeyboardHeight(bnVar.La);
        boolean z15 = this.f + bnVar.La >= org.telegram.messenger.g0.L(20.0f);
        if (MediaController.B().v0 != null && MediaController.B().v0.h4() && z14 != z15) {
            for (int i16 = 0; i16 < bnVar.A0.getChildCount(); i16++) {
                View childAt = bnVar.A0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.r1) childAt).getMessageObject();
                    if (messageObject.h4() && MediaController.B().I(messageObject)) {
                        bnVar.A0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            bnVar.C0.i1(R, (int) (((((bnVar.A0.getMeasuredHeight() - bnVar.P9) - bnVar.Ya) + ((this.f + bnVar.La) - r1)) - (z15 ? org.telegram.messenger.g0.u : org.telegram.messenger.g0.f3(bnVar.ba(), bnVar.S9()))) / 2.0f), false);
                            bnVar.D0.g(R);
                            this.I.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(bnVar.a0, makeMeasureSpec, 0, i10, 0);
                            z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
                            if (!z10 || bnVar.mb) {
                                this.g0 = 0;
                            } else {
                                this.g0 = bnVar.a0.getMeasuredHeight();
                            }
                            bnVar.Xa = 0;
                            bnVar.Ya = 0;
                            if (org.telegram.messenger.cz.f() && !bnVar.mb && bnVar.H != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = bnVar.I;
                                bnVar.Xa = i18;
                                bnVar.Ya = i18;
                            }
                            i11 = 0;
                            while (i11 < childCount) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i11);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != bnVar.a0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                        if (childAt2 != kVar4) {
                                            if (a0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == bnVar.A0 || childAt2 == bnVar.y0 || (childAt2 instanceof org.telegram.ui.Cells.v9)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), bnVar.Xa + size2 + bnVar.Ya), TLObject.FLAG_30));
                                                } else if (childAt2 == bnVar.R) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int L = org.telegram.messenger.g0.L(10.0f);
                                                    int i20 = i17 - this.g0;
                                                    z12 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, org.telegram.messenger.g0.L((bnVar.a0.Z0() ? 48 : i15) + 2) + (i20 - (z12 ? org.telegram.messenger.g0.m : i15))), TLObject.FLAG_30));
                                                } else if (childAt2 == bnVar.q3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    bnVar.q3.setInternalPadding(org.telegram.messenger.g0.L(12.0f) + wiVar.e() + ((int) bnVar.bd));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == bnVar.r3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - wiVar.e()) - ((int) bnVar.bd)) - org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == bnVar.f1) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                                } else if (bnVar.a0.T0(childAt2)) {
                                                    org.telegram.ui.Components.bg bgVar = bnVar.a0.x2;
                                                    if (childAt2 == bgVar && bgVar != null) {
                                                        i19 = bgVar.getKeyboardHeight();
                                                    }
                                                    z11 = ((org.telegram.ui.ActionBar.g2) bnVar).inBubbleMode;
                                                    if (z11) {
                                                        int paddingTop2 = getPaddingTop() + (i17 - this.g0) + measuredHeight;
                                                        if (i19 < 0) {
                                                            i19 = Math.max(Math.min(paddingTop2, org.telegram.messenger.g0.L(350.0f)), paddingTop2 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                    } else if (org.telegram.messenger.g0.E) {
                                                        int paddingTop3 = getPaddingTop() + (((i17 - this.g0) + measuredHeight) - org.telegram.messenger.g0.m);
                                                        if (i19 < 0) {
                                                            i19 = Math.max(Math.min(paddingTop3, org.telegram.messenger.g0.L(350.0f)), paddingTop3 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                    }
                                                } else {
                                                    kj kjVar = bnVar.X1;
                                                    if (childAt2 == kjVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kjVar.getLayoutParams();
                                                        jg.h1 adapter = bnVar.X1.getAdapter();
                                                        if (adapter.x0 == null || adapter.i0) {
                                                            bnVar.X1.setIgnoreLayout(true);
                                                            layoutParams.height = i17;
                                                            layoutParams.topMargin = 0;
                                                            bnVar.X1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == bnVar.u9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                        int i21 = i17 + bnVar.Xa;
                                                        if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f) || getLayoutParams().height >= 0 || bnVar.mb) {
                                                            ql qlVar = bnVar.u9;
                                                            qlVar.d0 = 0;
                                                            qlVar.w();
                                                        } else {
                                                            i21 += keyboardHeight;
                                                            ql qlVar2 = bnVar.u9;
                                                            qlVar2.d0 = keyboardHeight;
                                                            qlVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.wa0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n, TLObject.FLAG_30));
                                                    } else if (childAt2 == bnVar.g2) {
                                                        kVar5 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                                        if (kVar5.getVisibility() == 0) {
                                                            kVar6 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                                                            i13 = size2 - kVar6.getMeasuredHeight();
                                                        } else {
                                                            i13 = size2;
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
                                                    } else {
                                                        measureChildWithMargins(childAt2, makeMeasureSpec, 0, i10, 0);
                                                    }
                                                }
                                                i11++;
                                                i15 = 0;
                                            }
                                        }
                                    }
                                    i11++;
                                    i15 = 0;
                                }
                                i11++;
                                i15 = 0;
                            }
                            if (bnVar.S4) {
                                bnVar.T4 = true;
                                bnVar.M9();
                                bnVar.O9();
                                bnVar.S4 = false;
                                bj bjVar = bnVar.A0;
                                bjVar.measure(View.MeasureSpec.makeMeasureSpec(bjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bnVar.A0.getMeasuredHeight(), TLObject.FLAG_30));
                                bnVar.T4 = false;
                            }
                            i12 = bnVar.N4;
                            if (i12 != -1) {
                                org.telegram.messenger.g0.g3(new ii(this, i12, 1));
                                bnVar.N4 = -1;
                            }
                            gcVar = org.telegram.ui.Components.gc.w;
                            if (gcVar != null && bnVar.Ec != null) {
                                gcVar.l();
                            }
                            bnVar.h7();
                            this.h0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.te teVar = bnVar.a0.O4;
        org.telegram.messenger.g0.r(teVar);
        teVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(bnVar.a0, makeMeasureSpec, 0, i10, 0);
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        if (z10) {
        }
        this.g0 = 0;
        bnVar.Xa = 0;
        bnVar.Ya = 0;
        if (org.telegram.messenger.cz.f()) {
            int i182 = bnVar.I;
            bnVar.Xa = i182;
            bnVar.Ya = i182;
        }
        i11 = 0;
        while (i11 < childCount) {
        }
        if (bnVar.S4) {
        }
        i12 = bnVar.N4;
        if (i12 != -1) {
        }
        gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar != null) {
            gcVar.l();
        }
        bnVar.h7();
        this.h0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        bn bnVar = this.x0;
        ih.d.c(bnVar.P8, bnVar.fragmentView);
        bnVar.Q8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x0.T4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        bn bnVar = this.x0;
        bnVar.S9 = i10;
        bnVar.M9();
        bnVar.O9();
    }

    @Override // org.telegram.ui.Components.du0
    public final void K() {
    }

    @Override // org.telegram.ui.Components.du0
    public final void V() {
    }

    @Override // org.telegram.ui.Components.du0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
