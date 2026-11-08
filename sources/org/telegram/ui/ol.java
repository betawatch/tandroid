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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ol extends org.telegram.ui.Components.rt0 {
    public int f0;
    public int g0;
    public int h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public Paint m0;
    public int n0;
    public final ml o0;
    public final ml p0;
    public final RectF q0;
    public float r0;
    public float s0;
    public long t0;
    public boolean u0;
    public ColorDrawable v0;
    public final /* synthetic */ an w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.ml] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.ml] */
    public ol(an anVar, Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context, q4Var);
        this.w0 = anVar;
        this.f0 = 0;
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        final int i7 = 0;
        this.o0 = new eh.a(this) { // from class: org.telegram.ui.ml
            public final /* synthetic */ ol b;

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
                        an anVar2 = this.b.w0;
                        if (anVar2.z0.Y0()) {
                            anVar2.z0.d(canvas, rectF);
                            break;
                        } else {
                            anVar2.z0.z1(canvas, rectF);
                            for (int i10 = 0; i10 < anVar2.z0.getChildCount(); i10++) {
                                View childAt = anVar2.z0.getChildAt(i10);
                                if (!an.l2(anVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                        if (q1Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, q1Var.V);
                                            q1Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        anVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.j2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                        anVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                                        canvas.restore();
                                    } else {
                                        anVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            anVar2.z0.A1(canvas, rectF);
                            break;
                        }
                    default:
                        ol olVar = this.b;
                        an anVar3 = olVar.w0;
                        RectF rectF2 = olVar.q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, olVar.getWidth(), olVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = anVar3.cd.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.r1(f10 * 0.85f, anVar3.getThemedColor(org.telegram.ui.ActionBar.k6.d6))));
                            }
                            ih.d.b(olVar.o0, canvas, rectF, anVar3.z0, olVar, i11);
                            bi.q1 q1Var2 = anVar3.Z3;
                            if (q1Var2 != null) {
                                ih.d.b(q1Var2, canvas, rectF, q1Var2, olVar, i12);
                            }
                            fi.g1 g1Var = anVar3.E1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = anVar3.E1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = anVar3.E1.getChildAt(i13);
                                    if ((childAt2 instanceof cn) && childAt2.getVisibility() == 0) {
                                        ol olVar2 = ((cn) childAt2).a.l1;
                                        ih.d.a(olVar2.p0, canvas, rectF, olVar2, olVar);
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
        this.p0 = new eh.a(this) { // from class: org.telegram.ui.ml
            public final /* synthetic */ ol b;

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
                        an anVar2 = this.b.w0;
                        if (anVar2.z0.Y0()) {
                            anVar2.z0.d(canvas, rectF);
                            break;
                        } else {
                            anVar2.z0.z1(canvas, rectF);
                            for (int i102 = 0; i102 < anVar2.z0.getChildCount(); i102++) {
                                View childAt = anVar2.z0.getChildAt(i102);
                                if (!an.l2(anVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                        if (q1Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, q1Var.V);
                                            q1Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        anVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.j2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                        anVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                                        canvas.restore();
                                    } else {
                                        anVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            anVar2.z0.A1(canvas, rectF);
                            break;
                        }
                    default:
                        ol olVar = this.b;
                        an anVar3 = olVar.w0;
                        RectF rectF2 = olVar.q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, olVar.getWidth(), olVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = anVar3.cd.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.r1(f10 * 0.85f, anVar3.getThemedColor(org.telegram.ui.ActionBar.k6.d6))));
                            }
                            ih.d.b(olVar.o0, canvas, rectF, anVar3.z0, olVar, i11);
                            bi.q1 q1Var2 = anVar3.Z3;
                            if (q1Var2 != null) {
                                ih.d.b(q1Var2, canvas, rectF, q1Var2, olVar, i12);
                            }
                            fi.g1 g1Var = anVar3.E1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = anVar3.E1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = anVar3.E1.getChildAt(i13);
                                    if ((childAt2 instanceof cn) && childAt2.getVisibility() == 0) {
                                        ol olVar2 = ((cn) childAt2).a.l1;
                                        ih.d.a(olVar2.p0, canvas, rectF, olVar2, olVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.q0 = new RectF();
        this.H = new nl(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.w0;
        anVar.l1.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        kVar.setTranslationY(0.0f);
        hk hkVar = anVar.xb;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.C1 != null ? r3.getCurrentHeight() : 0);
        }
        fi.m3 m3Var = anVar.K1;
        if (m3Var != null) {
            m3Var.setTranslationY(0.0f);
        }
        fi.m3 m3Var2 = anVar.J1;
        if (m3Var2 != null) {
            m3Var2.setTranslationY(0.0f);
        }
        anVar.e1.setTranslationY(0.0f);
        anVar.Q.setTranslationY(0.0f);
        anVar.P9 = 0.0f;
        anVar.Q9 = 0.0f;
        anVar.l1.setBackgroundTranslation(0);
        org.telegram.ui.Components.t40 t40Var = anVar.p3;
        if (t40Var != null) {
            t40Var.g(0.0f);
        }
        fi.p5 p5Var = anVar.M2;
        if (p5Var != null) {
            org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) p5Var.b;
            w9Var.u = 0.0f;
            w9Var.d.invalidate();
        }
        anVar.setFragmentPanTranslationOffset(0);
        anVar.K9();
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.rt0
    public final int Q() {
        di.u2 u2Var = this.w0.X1;
        if (u2Var == null || !u2Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.rt0
    public final void T(Drawable drawable) {
        an anVar = this.w0;
        jh.l lVar = anVar.X;
        if (drawable instanceof org.telegram.ui.Components.qa0) {
            ((org.telegram.ui.Components.qa0) drawable).p();
        }
        ri.a c10 = lVar.c(drawable);
        float B = org.telegram.messenger.g0.B(lVar.b(c10));
        float B2 = org.telegram.messenger.g0.B(lVar.a(c10));
        anVar.dc = B <= 0.721f;
        anVar.ec = B2 <= 0.9f;
        anVar.M.a = c10;
        ri.f fVar = anVar.I;
        if (fVar != null) {
            Iterator it = fVar.w.iterator();
            while (it.hasNext()) {
                fh.e eVar = ((fh.g) it.next()).f0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ri.f fVar2 = anVar.J;
        if (fVar2 != null) {
            Iterator it2 = fVar2.w.iterator();
            while (it2.hasNext()) {
                fh.e eVar2 = ((fh.g) it2.next()).f0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        lh.f fVar3 = anVar.Y;
        if (fVar3 != null) {
            fVar3.setOverlayColor(anVar.Q9() ? anVar.getThemedColor(org.telegram.ui.ActionBar.k6.va) : 0);
            anVar.Y.invalidate();
        }
        jh.f fVar4 = anVar.T;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        anVar.l1.invalidate();
        Iterator it3 = anVar.E.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        anVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.q1 q1Var, int i7) {
        int save = canvas.save();
        an anVar = this.w0;
        float x10 = q1Var.getX() + anVar.z0.getLeft();
        float y10 = q1Var.getY() + anVar.z0.getY() + q1Var.getPaddingTop();
        float alpha = q1Var.b() ? q1Var.getAlpha() : 1.0f;
        canvas.clipRect(anVar.z0.getLeft(), f10, anVar.z0.getRight(), ((((anVar.z0.getY() + anVar.z0.getMeasuredHeight()) - anVar.Ua) - anVar.w.e()) - anVar.Wc) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y10);
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.x1(alpha, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, alpha);
        } else if (i7 == 2) {
            q1Var.Q0(alpha, canvas, q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0);
        } else if (i7 == 3) {
            boolean z9 = q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0;
            q1Var.V0(canvas, alpha);
            if (!z9) {
                q1Var.o1(canvas, alpha, null);
            }
        } else if (i7 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().l) != 0) && anVar.a9 != null)) {
            float f11 = (anVar.V8 * anVar.Y8) / 0.2f;
            canvas.save();
            q1Var.s1(canvas, anVar.a9, f11, anVar.W8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            q1Var.t1(this, canvas, anVar.b9, anVar.a9, f11);
            canvas.restore();
        }
        q1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.c1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.z0) goto L69;
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
        fi.p5 p5Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.ij ijVar;
        boolean z9;
        boolean z10;
        tj tjVar;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.Components.t40 t40Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        an anVar = this.w0;
        boolean z11 = false;
        if ((anVar.X8 == null && ((ArrayList) anVar.fa.c).size() <= 0) || (view != anVar.x1 && view != anVar.l3 && view != anVar.m3 && view != anVar.F9 && view != anVar.qa && view != anVar.s2 && view != null && view != anVar.M3 && view != anVar.N3)) {
            if ((view != anVar.M3 || !PhotoViewer.p1().P1()) && (!anVar.la || view != anVar.z0)) {
                if (anVar.Da) {
                    kVar3 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                }
                if (view != anVar.p3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (p5Var = anVar.M2) != null && p5Var.a() && anVar.M2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        ijVar = MediaController.B().u0;
                        if (ijVar == null) {
                        }
                        z9 = false;
                        z10 = false;
                        if (view == anVar.H8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    } else {
                        if (view != anVar.z0) {
                            if (view != anVar.T) {
                            }
                        }
                        ijVar = MediaController.B().u0;
                        if (ijVar == null && ijVar.T == 0) {
                            z9 = ijVar.i4();
                            if (z9 || org.telegram.messenger.ij.M4(ijVar.k)) {
                                z10 = true;
                                if (view == anVar.H8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-anVar.ga) - (anVar.na != 0.0f ? (anVar.z0.getMeasuredHeight() - anVar.ga) * anVar.na : 0.0f));
                                    if (ijVar != null && ijVar.D == 5) {
                                        if (org.telegram.ui.ActionBar.k6.k3 != null && anVar.J8.d) {
                                            int x10 = ((int) view.getX()) - org.telegram.messenger.g0.L(3.0f);
                                            int y10 = ((int) view.getY()) - org.telegram.messenger.g0.L(2.0f);
                                            canvas.save();
                                            canvas.scale(anVar.H8.getScaleX(), anVar.H8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.k6.k3.setAlpha(org.telegram.messenger.qs.e4);
                                            org.telegram.ui.ActionBar.k6.k3.setBounds(x10, y10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.g3(anVar.Z9(), anVar.Q9()) + x10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.g3(anVar.Z9(), anVar.Q9()) + y10);
                                            org.telegram.ui.ActionBar.k6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z11 = super.drawChild(canvas, view, j3);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-org.telegram.messenger.g0.L(1000.0f));
                                        z11 = super.drawChild(canvas, view, j3);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z11;
                                }
                                if (view == anVar.T && (t40Var = anVar.p3) != null && t40Var.getVisibility() == 0) {
                                    super.drawChild(canvas, anVar.p3, j3);
                                }
                                z11 = super.drawChild(canvas, view, j3);
                                if (z10 && view == anVar.z0 && ijVar.D != 5 && (tjVar = anVar.H8) != null && tjVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-anVar.ga) - (anVar.na != 0.0f ? (anVar.z0.getMeasuredHeight() - anVar.ga) * anVar.na : 0.0f)) + anVar.ha);
                                    super.drawChild(canvas, anVar.H8, j3);
                                    if (anVar.I8 != null) {
                                        canvas.save();
                                        canvas.translate(anVar.I8.getX(), anVar.z0.getY() + anVar.I8.getTop());
                                        if (z9) {
                                            anVar.I8.r1(canvas);
                                            invalidate();
                                            anVar.I8.invalidate();
                                        } else {
                                            anVar.I8.j1(canvas);
                                            org.telegram.ui.Cells.q1 q1Var = anVar.I8;
                                            if (!q1Var.F9 && ((ijVar2 = q1Var.P5) == null || ijVar2.D != 27)) {
                                                q1Var.x1(q1Var.getAlpha(), canvas, true);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        z10 = false;
                        if (view == anVar.H8) {
                        }
                    }
                }
            }
            return true;
        }
        return z11;
    }

    public final boolean a0(View view) {
        if (view == this.L) {
            return true;
        }
        an anVar = this.w0;
        return view == anVar.M2 || view == anVar.E1 || view == anVar.F9 || view == anVar.Y || view == anVar.Y3 || view == anVar.m0 || (view instanceof org.telegram.ui.ActionBar.i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ag agVar;
        an anVar = this.w0;
        qj qjVar = anVar.Z;
        if (qjVar == null || view != qjVar.m0) {
            super.addView(view, i7, layoutParams);
        } else {
            lh.f fVar = anVar.Y;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i7 = indexOfChild;
            }
            super.addView(view, i7, layoutParams);
        }
        qj qjVar2 = anVar.Z;
        if (qjVar2 != null && view == qjVar2.m0) {
            hi.u uVar = (hi.u) view;
            uVar.setBackgroundDrawable(anVar.K.c(uVar.c, anVar.D, false));
        }
        qj qjVar3 = anVar.Z;
        if (qjVar3 == null || view != (agVar = qjVar3.O1)) {
            return;
        }
        agVar.setBlurredBackgroundFactory(anVar.K);
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
    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
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
        ol olVar;
        float f14;
        float f15;
        View view3;
        org.telegram.ui.Components.g90 g90Var;
        org.telegram.ui.Components.g90 g90Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        sl slVar;
        View view6;
        org.telegram.messenger.dj djVar;
        sl slVar2;
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
        sl slVar3;
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.dj djVar2;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.aj ajVar;
        View view7;
        org.telegram.messenger.dj djVar3;
        View view8;
        int i12;
        int i13;
        ArrayList arrayList5;
        org.telegram.ui.Cells.q1 q1Var2;
        ArrayList arrayList6;
        vi viVar;
        Integer num4;
        float f20;
        float f21;
        boolean z9;
        sl slVar4;
        sl slVar5;
        org.telegram.ui.Components.g90 g90Var3;
        float f22;
        float f23;
        qj qjVar;
        sl slVar6;
        sl slVar7;
        sl slVar8;
        sl slVar9;
        float f24;
        float f25;
        Canvas canvas4;
        float f26;
        float f27;
        View view9;
        float f28;
        float f29;
        float f30;
        org.telegram.messenger.aj ajVar2;
        Integer num5;
        float f31;
        int i14;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.t0 t0Var2;
        Paint paint14;
        float f32;
        float f33;
        Paint paint15;
        float f34;
        float f35;
        float f36;
        float f37;
        sl slVar10;
        sl slVar11;
        Integer num7;
        sl slVar12;
        sl slVar13;
        Integer num8;
        ol olVar2;
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
        sl slVar14;
        sl slVar15;
        Integer num9;
        sl slVar16;
        sl slVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        float f49;
        Paint paint22;
        float f50;
        Integer num11;
        sl slVar18;
        sl slVar19;
        float f51;
        Integer num12;
        org.telegram.ui.Components.ve veVar;
        org.telegram.ui.Components.g90 g90Var4;
        org.telegram.ui.Components.g90 g90Var5;
        sl slVar20;
        float f52;
        org.telegram.ui.Cells.q1 q1Var3;
        boolean z10;
        org.telegram.ui.Components.g90 g90Var6;
        float f53;
        org.telegram.ui.Components.g90 g90Var7;
        float f54;
        sl slVar21;
        org.telegram.ui.Components.g90 g90Var8;
        org.telegram.ui.Components.g90 g90Var9;
        sl slVar22;
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
        boolean z11;
        org.telegram.ui.ActionBar.k kVar10;
        cj cjVar;
        ol olVar3 = this;
        an anVar = olVar3.w0;
        vi viVar2 = anVar.w;
        ArrayList arrayList7 = anVar.D6;
        anVar.Z.V1();
        anVar.Nc();
        if (anVar.Ka || ((cjVar = anVar.A0) != null && cjVar.k())) {
            anVar.Ka = false;
            anVar.Yc();
        }
        anVar.rd(false, false);
        anVar.ad();
        fi.m3 m3Var = anVar.u2;
        if (m3Var != null && m3Var.V) {
            m3Var.z();
        }
        fi.m3 m3Var2 = anVar.w2;
        if (m3Var2 != null && m3Var2.V) {
            m3Var2.z();
        }
        float f69 = 0.2f;
        float f70 = 2.0f;
        if (anVar.Da) {
            kVar10 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            canvas2 = canvas;
            i7 = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), olVar3.getMeasuredWidth(), olVar3.getMeasuredHeight(), (int) (anVar.Ea * 255.0f), 31);
            float f71 = (anVar.Ea * 0.2f) + 0.8f;
            canvas2.scale(f71, f71, olVar3.getMeasuredWidth() / 2.0f, olVar3.getMeasuredHeight() / 2.0f);
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
            org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList7.get(i18);
            org.telegram.messenger.ej ejVar = q1Var4.getMessageObject().L1;
            if (ejVar != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    ak akVar = anVar.C1;
                    int currentHeight = measuredHeight + (akVar != null ? akVar.getCurrentHeight() : 0);
                    nj njVar = anVar.D1;
                    int currentHeight2 = currentHeight + (njVar != null ? njVar.getCurrentHeight() : 0);
                    z11 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
                    i16 = currentHeight2 + (z11 ? org.telegram.messenger.g0.m : 0);
                } else {
                    i16 = 0;
                }
                f67 = f70;
                f68 = f69;
                canvas2.clipRect(0.0f, i16 + anVar.M9, olVar3.getWidth(), olVar3.getHeight());
                ImageReceiver photoImage = q1Var4.getPhotoImage();
                q1Var4.getLocationInWindow(org.telegram.messenger.g0.R);
                int topViewEnterProgress = (int) ((anVar.Z.getTopViewEnterProgress() * org.telegram.messenger.g0.L(48.0f)) + ((int) com.google.android.recaptcha.internal.a.v(1.0f, ejVar.g, q1Var4.getTranslationY(), r9[1])));
                if (ejVar.h) {
                    canvas2.translate(ejVar.e, org.telegram.messenger.g0.T1(ejVar.b, topViewEnterProgress, ejVar.g));
                } else {
                    canvas2.translate(ejVar.e, org.telegram.messenger.g0.T1(ejVar.b, photoImage.s() + topViewEnterProgress, ejVar.g));
                }
                float f72 = ejVar.d;
                canvas2.scale(f72, f72);
                if (!ejVar.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                q1Var4.setTimeAlpha(ejVar.f);
                q1Var4.draw(canvas2);
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
        num = anVar.a9;
        if (num != null) {
            view24 = anVar.X8;
        }
        paint = anVar.R8;
        if (paint != null) {
            matrix = anVar.S8;
            matrix.reset();
            float measuredWidth = olVar3.getMeasuredWidth() / anVar.P8.getWidth();
            matrix2 = anVar.S8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = anVar.Q8;
            matrix3 = anVar.S8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = anVar.R8;
            f13 = anVar.Z8;
            paint5.setAlpha((int) (f13 * 255.0f));
            paint6 = anVar.R8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = olVar3.getMeasuredWidth();
                float measuredHeight2 = olVar3.getMeasuredHeight();
                paint7 = anVar.R8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = anVar.T8;
            f12 = anVar.V8;
            float f75 = f12 * 255.0f;
            view = anVar.X8;
            paint2.setAlpha((int) (f75 * (view != null ? anVar.Y8 : 1.0f)));
            paint3 = anVar.T8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = olVar3.getMeasuredWidth();
                float measuredHeight3 = olVar3.getMeasuredHeight();
                paint4 = anVar.T8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = anVar.a9;
        if (num2 != null && anVar.c9) {
            olVar3.invalidate();
        }
        view2 = anVar.X8;
        if (view2 != null) {
            view4 = anVar.X8;
            if (view4 == anVar.x1) {
                f64 = anVar.Y8;
                if (f64 < 1.0f) {
                    paint30 = anVar.T8;
                    f65 = anVar.V8;
                    f66 = anVar.Y8;
                    paint30.setAlpha((int) ((1.0f - f66) * f65 * 255.0f));
                    float measuredWidth4 = olVar3.getMeasuredWidth();
                    float measuredHeight4 = olVar3.getMeasuredHeight();
                    paint31 = anVar.T8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = anVar.X8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f55 = anVar.Y8;
                    if (f55 < 1.0f) {
                        view20 = anVar.X8;
                        float left = view20.getLeft();
                        view21 = anVar.X8;
                        float top = view21.getTop();
                        view22 = anVar.X8;
                        float right = view22.getRight();
                        view23 = anVar.X8;
                        float bottom = view23.getBottom();
                        f59 = anVar.Y8;
                        int i19 = (int) (f59 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i19, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = anVar.X8;
                    float left2 = view12.getLeft();
                    view13 = anVar.X8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = anVar.X8;
                    kVar6 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = anVar.X8;
                        float x10 = view16.getX();
                        view17 = anVar.X8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = anVar.X8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f73;
                        view19 = anVar.X8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f73;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, anVar.U8);
                    }
                    view15 = anVar.X8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f56 = anVar.Y8;
                    if (f56 < 1.0f) {
                        paint23 = anVar.T8;
                        f57 = anVar.V8;
                        f58 = anVar.Y8;
                        paint23.setAlpha((int) ((1.0f - f58) * f57 * 255.0f));
                        float measuredWidth6 = olVar3.getMeasuredWidth();
                        float measuredHeight6 = olVar3.getMeasuredHeight();
                        paint24 = anVar.T8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    slVar = anVar.z0;
                    float y10 = ((slVar.getY() + anVar.L9) - anVar.N9) - org.telegram.messenger.g0.L(4.0f);
                    view6 = anVar.X8;
                    if (view6 instanceof org.telegram.ui.Cells.q1) {
                        view11 = anVar.X8;
                        djVar = ((org.telegram.ui.Cells.q1) view11).getCurrentMessagesGroup();
                    } else {
                        djVar = null;
                    }
                    slVar2 = anVar.z0;
                    int childCount = slVar2.getChildCount();
                    int i20 = 0;
                    boolean z12 = false;
                    while (true) {
                        arrayList = olVar3.k0;
                        f15 = 20.0f;
                        arrayList2 = olVar3.j0;
                        arrayList3 = olVar3.i0;
                        f14 = f11;
                        arrayList4 = olVar3.l0;
                        if (i20 >= childCount) {
                            break;
                        }
                        slVar3 = anVar.z0;
                        View childAt = slVar3.getChildAt(i20);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            q1Var = (org.telegram.ui.Cells.q1) childAt;
                            djVar2 = q1Var.getCurrentMessagesGroup();
                            ajVar = q1Var.getCurrentPosition();
                            t0Var = null;
                        } else {
                            t0Var = childAt instanceof org.telegram.ui.Cells.t0 ? (org.telegram.ui.Cells.t0) childAt : null;
                            djVar2 = null;
                            q1Var = null;
                            ajVar = null;
                        }
                        float f76 = y10;
                        view7 = anVar.X8;
                        if ((childAt == view7 || (djVar != null && djVar == djVar2)) && childAt.getAlpha() != f14) {
                            if (z12 || q1Var == null || djVar == null) {
                                djVar3 = djVar;
                                view8 = childAt;
                                i12 = childCount;
                                i13 = i20;
                                arrayList5 = arrayList;
                                q1Var2 = q1Var;
                                arrayList6 = arrayList4;
                                viVar = viVar2;
                                num4 = null;
                                f20 = 1.0f;
                                f21 = 9.0f;
                            } else {
                                ArrayList arrayList8 = djVar.d;
                                f21 = 9.0f;
                                org.telegram.messenger.cj cjVar2 = djVar.m;
                                djVar3 = djVar;
                                org.telegram.ui.Cells.q1 q1Var5 = cjVar2.m;
                                view8 = childAt;
                                if (q1Var5 != null) {
                                    float R1 = q1Var5.R1(true);
                                    float f77 = cjVar2.a + R1 + cjVar2.e;
                                    float f78 = cjVar2.b + cjVar2.f;
                                    float f79 = cjVar2.c + R1 + cjVar2.g;
                                    float f80 = f78;
                                    float f81 = cjVar2.d + cjVar2.h;
                                    if (!cjVar2.j) {
                                        f80 = cjVar2.m.getTranslationY() + f80;
                                        f81 = cjVar2.m.getTranslationY() + f81;
                                    }
                                    float L = f80 < (anVar.L9 - ((float) anVar.N9)) - ((float) org.telegram.messenger.g0.L(20.0f)) ? (anVar.L9 - anVar.N9) - org.telegram.messenger.g0.L(20.0f) : f80;
                                    slVar20 = anVar.z0;
                                    i12 = childCount;
                                    if (f81 > org.telegram.messenger.g0.L(20.0f) + slVar20.getMeasuredHeight()) {
                                        slVar22 = anVar.z0;
                                        f52 = org.telegram.messenger.g0.L(20.0f) + slVar22.getMeasuredHeight();
                                    } else {
                                        f52 = f81;
                                    }
                                    i13 = i20;
                                    int size2 = arrayList8.size();
                                    arrayList5 = arrayList;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size2) {
                                            q1Var3 = q1Var;
                                            z10 = true;
                                            break;
                                        }
                                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList8.get(i21);
                                        ArrayList arrayList9 = arrayList8;
                                        int i22 = i21;
                                        if (anVar.m6[ijVar.A0() == anVar.j6 ? (char) 0 : (char) 1].indexOfKey(ijVar.f1()) < 0) {
                                            q1Var3 = q1Var;
                                            z10 = false;
                                            break;
                                        } else {
                                            i21 = i22 + 1;
                                            arrayList8 = arrayList9;
                                        }
                                    }
                                    canvas3.save();
                                    float measuredHeight7 = ((getMeasuredHeight() - viVar2.e()) - anVar.Wc) - org.telegram.messenger.g0.L(9.0f);
                                    g90Var6 = anVar.W1;
                                    if (g90Var6 != null) {
                                        g90Var9 = anVar.W1;
                                        f53 = g90Var9.d();
                                    } else {
                                        f53 = f14;
                                    }
                                    float f82 = measuredHeight7 - f53;
                                    g90Var7 = anVar.W1;
                                    if (g90Var7 != null) {
                                        g90Var8 = anVar.W1;
                                        f54 = g90Var8.e();
                                    } else {
                                        f54 = f14;
                                    }
                                    org.telegram.ui.Cells.q1 q1Var6 = q1Var3;
                                    canvas3.clipRect(f14, f76 + f54, getMeasuredWidth(), f82);
                                    slVar21 = anVar.z0;
                                    canvas3.translate(f14, slVar21.getY());
                                    boolean z13 = cjVar2.k;
                                    boolean z14 = cjVar2.l;
                                    arrayList6 = arrayList4;
                                    viVar = viVar2;
                                    q1Var2 = q1Var6;
                                    num4 = null;
                                    f20 = 1.0f;
                                    cjVar2.m.K0(canvas, (int) f77, (int) L, (int) f79, (int) f52, z13, z14, z10, 0);
                                    canvas.restore();
                                    z9 = true;
                                    if (q1Var2 != null && q1Var2.getPhotoImage().M()) {
                                        invalidate();
                                    }
                                    slVar4 = anVar.z0;
                                    float left3 = slVar4.getLeft();
                                    slVar5 = anVar.z0;
                                    float right2 = slVar5.getRight();
                                    float measuredHeight8 = (((getMeasuredHeight() - viVar.e()) - anVar.Wc) - anVar.r9(org.telegram.ui.Components.i11.c)) - org.telegram.messenger.g0.L(f21);
                                    g90Var3 = anVar.W1;
                                    if (g90Var3 == null) {
                                        g90Var4 = anVar.W1;
                                        float max = Math.max(0.0f, g90Var4.e());
                                        g90Var5 = anVar.W1;
                                        f23 = Math.max(0.0f, g90Var5.d());
                                        f22 = max;
                                    } else {
                                        f22 = 0.0f;
                                        f23 = 0.0f;
                                    }
                                    qjVar = anVar.Z;
                                    if (qjVar != null && (veVar = qjVar.m0) != null) {
                                        f23 = Math.max(f23, veVar.f ? 0.0f : Math.max(0.0f, veVar.getMeasuredHeight() - (veVar.c.getTranslationY() + veVar.e)));
                                    }
                                    float f83 = f76 + f22;
                                    float f84 = measuredHeight8 - f23;
                                    if (q1Var2 != null || !q1Var2.getTransitionParams().x0) {
                                        slVar6 = anVar.z0;
                                        left3 = Math.max(left3, view8.getX() + slVar6.getLeft());
                                        slVar7 = anVar.z0;
                                        f83 = Math.max(f83, view8.getY() + slVar7.getY());
                                        slVar8 = anVar.z0;
                                        right2 = Math.min(right2, view8.getX() + slVar8.getLeft() + view8.getMeasuredWidth());
                                        slVar9 = anVar.z0;
                                        f84 = Math.min(f84, view8.getY() + slVar9.getY() + view8.getMeasuredHeight());
                                    }
                                    f24 = f84;
                                    f25 = f83;
                                    float f85 = right2;
                                    float max2 = Math.max(left3, anVar.l9());
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
                                        if (q1Var2 != null) {
                                            q1Var2.setInvalidatesParent(true);
                                            num12 = anVar.a9;
                                            q1Var2.setScrimReaction(num12);
                                        } else if (t0Var != null) {
                                            t0Var.setInvalidatesParent(true);
                                            num11 = anVar.a9;
                                            t0Var.setScrimReaction(num11);
                                        }
                                        canvas4.clipRect(f29, f50, f30, f27);
                                        slVar18 = anVar.z0;
                                        float x11 = view8.getX() + slVar18.getLeft();
                                        slVar19 = anVar.z0;
                                        canvas4.translate(x11, view8.getY() + slVar19.getY());
                                        if (q1Var2 != null && djVar3 == null && q1Var2.L0()) {
                                            canvas4.save();
                                            canvas4.translate(0.0f, q1Var2.getPaddingTop());
                                            q1Var2.M0(canvas4, true, false);
                                            canvas4.restore();
                                        }
                                        if (q1Var2 != null && djVar3 == null) {
                                            f51 = anVar.Z8;
                                            q1Var2.b1(canvas4, f51);
                                        }
                                        view9 = view8;
                                        view9.draw(canvas4);
                                        if (q1Var2 == null || !q1Var2.j2()) {
                                            f26 = f50;
                                            f28 = 0.0f;
                                        } else {
                                            canvas4.save();
                                            f26 = f50;
                                            f28 = 0.0f;
                                            canvas4.translate(0.0f, q1Var2.getPaddingTop());
                                            q1Var2.i1(canvas4);
                                            canvas4.restore();
                                        }
                                        if (t0Var != null) {
                                            t0Var.G(canvas4);
                                        }
                                        canvas4.restore();
                                        if (q1Var2 != null) {
                                            q1Var2.setInvalidatesParent(false);
                                            q1Var2.setScrimReaction(num4);
                                        } else if (t0Var != null) {
                                            t0Var.setInvalidatesParent(false);
                                            t0Var.setScrimReaction(num4);
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
                                    ajVar2 = ajVar;
                                    if (ajVar2 == null || (q1Var2 != null && q1Var2.getTransitionParams().x0)) {
                                        if (ajVar2 != null || ajVar2.h || (ajVar2.a == 0 && ajVar2.c == 0)) {
                                            if (ajVar2 != null || ajVar2.h) {
                                                arrayList3.add(q1Var2);
                                            }
                                            if (ajVar2 != null || (ajVar2.a == 0 && ajVar2.c == 0 && q1Var2.i2())) {
                                                arrayList2.add(q1Var2);
                                            }
                                        }
                                        if (ajVar2 != null || (ajVar2.l & q1Var2.B()) != 0) {
                                            arrayList5.add(q1Var2);
                                        }
                                        if (ajVar2 != null) {
                                            int i23 = ajVar2.l;
                                            if ((i23 & 8) != 0) {
                                            }
                                        }
                                        arrayList6.add(q1Var2);
                                    }
                                    num5 = anVar.a9;
                                    if (num5 == null && q1Var2 != null && djVar3 == null) {
                                        paint18 = anVar.R8;
                                        if (paint18 != null) {
                                            matrix10 = anVar.S8;
                                            matrix10.reset();
                                            float measuredWidth7 = getMeasuredWidth() / anVar.P8.getWidth();
                                            matrix11 = anVar.S8;
                                            matrix11.postScale(measuredWidth7, measuredWidth7);
                                            BitmapShader bitmapShader2 = anVar.Q8;
                                            matrix12 = anVar.S8;
                                            bitmapShader2.setLocalMatrix(matrix12);
                                            paint21 = anVar.R8;
                                            f49 = anVar.Z8;
                                            paint21.setAlpha((int) (f49 * 255.0f));
                                            float measuredWidth8 = getMeasuredWidth();
                                            float measuredHeight9 = getMeasuredHeight();
                                            paint22 = anVar.R8;
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
                                            paint19 = anVar.T8;
                                            f41 = anVar.V8;
                                            f42 = anVar.Y8;
                                            paint19.setAlpha((int) (f42 * f41 * 255.0f));
                                            float measuredWidth9 = getMeasuredWidth();
                                            float measuredHeight10 = getMeasuredHeight();
                                            paint20 = anVar.T8;
                                            canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint20);
                                        }
                                        if (f25 < f24) {
                                            f43 = anVar.V8;
                                            f44 = anVar.Y8;
                                            float f86 = (f44 * f43) / f74;
                                            float alpha = view10.getAlpha();
                                            f45 = anVar.Y8;
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
                                            slVar14 = anVar.z0;
                                            float x12 = view10.getX() + slVar14.getLeft();
                                            slVar15 = anVar.z0;
                                            canvas5.translate(x12, view10.getY() + slVar15.getY() + view10.getPaddingTop());
                                            num9 = anVar.a9;
                                            q1Var2.s1(canvas5, num9, f86, anVar.W8);
                                            canvas5.restore();
                                            canvas5.save();
                                            slVar16 = anVar.z0;
                                            float x13 = view10.getX() + slVar16.getLeft();
                                            slVar17 = anVar.z0;
                                            canvas5.translate(x13, view10.getY() + slVar17.getY() + view10.getPaddingTop());
                                            int i24 = anVar.b9;
                                            num10 = anVar.a9;
                                            i14 = i15;
                                            f31 = f76;
                                            f14 = f46;
                                            q1Var2.t1(this, canvas5, i24, num10, f86);
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
                                        num6 = anVar.a9;
                                        if (num6 != null && t0Var != null) {
                                            paint13 = anVar.R8;
                                            if (paint13 == null) {
                                                matrix7 = anVar.S8;
                                                matrix7.reset();
                                                float measuredWidth10 = getMeasuredWidth() / anVar.P8.getWidth();
                                                matrix8 = anVar.S8;
                                                matrix8.postScale(measuredWidth10, measuredWidth10);
                                                BitmapShader bitmapShader3 = anVar.Q8;
                                                matrix9 = anVar.S8;
                                                bitmapShader3.setLocalMatrix(matrix9);
                                                paint16 = anVar.R8;
                                                f38 = anVar.Z8;
                                                paint16.setAlpha((int) (f38 * 255.0f));
                                                float measuredWidth11 = getMeasuredWidth();
                                                float measuredHeight11 = getMeasuredHeight();
                                                paint17 = anVar.R8;
                                                t0Var2 = t0Var;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint17);
                                            } else {
                                                t0Var2 = t0Var;
                                                paint14 = anVar.T8;
                                                f32 = anVar.V8;
                                                f33 = anVar.Y8;
                                                paint14.setAlpha((int) (f33 * f32 * 255.0f));
                                                float measuredWidth12 = getMeasuredWidth();
                                                float measuredHeight12 = getMeasuredHeight();
                                                paint15 = anVar.T8;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint15);
                                            }
                                            if (f25 < f24) {
                                                f34 = anVar.V8;
                                                f35 = anVar.Y8;
                                                float f93 = (f35 * f34) / f74;
                                                float alpha2 = view25.getAlpha();
                                                f36 = anVar.Y8;
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
                                                slVar10 = anVar.z0;
                                                float x14 = view25.getX() + slVar10.getLeft();
                                                slVar11 = anVar.z0;
                                                canvas3.translate(x14, view25.getY() + slVar11.getY() + view25.getPaddingTop());
                                                num7 = anVar.a9;
                                                boolean z15 = anVar.W8;
                                                ch.p0 p0Var = t0Var2.E0;
                                                p0Var.getClass();
                                                org.telegram.ui.ActionBar.f6 f6Var = t0Var2.g1;
                                                if (f6Var != null) {
                                                    f6Var.b(t0Var2.u0, t0Var2.t0 + org.telegram.messenger.g0.L(4.0f), t0Var2.getMeasuredWidth(), t0Var2.v0);
                                                } else {
                                                    org.telegram.ui.ActionBar.k6.r(t0Var2.u0, t0Var2.t0 + org.telegram.messenger.g0.L(4.0f), t0Var2.getMeasuredWidth(), t0Var2.v0);
                                                }
                                                p0Var.A = f93;
                                                p0Var.B = z15;
                                                p0Var.d(canvas3, t0Var2.r2.c, num7);
                                                canvas3.restore();
                                                canvas3.save();
                                                slVar12 = anVar.z0;
                                                float x15 = view25.getX() + slVar12.getLeft();
                                                slVar13 = anVar.z0;
                                                canvas3.translate(x15, view25.getY() + slVar13.getY() + view25.getPaddingTop());
                                                int i25 = anVar.b9;
                                                num8 = anVar.a9;
                                                t0Var2.J(this, canvas3, i25, num8, f93);
                                                olVar2 = this;
                                                canvas3.restore();
                                                z12 = z9;
                                            }
                                        }
                                    }
                                    olVar2 = this;
                                    canvas3 = canvas;
                                    z12 = z9;
                                } else {
                                    i12 = childCount;
                                    i13 = i20;
                                    arrayList5 = arrayList;
                                    q1Var2 = q1Var;
                                    arrayList6 = arrayList4;
                                    viVar = viVar2;
                                    num4 = null;
                                    f20 = 1.0f;
                                }
                            }
                            z9 = z12;
                            if (q1Var2 != null) {
                                invalidate();
                            }
                            slVar4 = anVar.z0;
                            float left32 = slVar4.getLeft();
                            slVar5 = anVar.z0;
                            float right22 = slVar5.getRight();
                            float measuredHeight82 = (((getMeasuredHeight() - viVar.e()) - anVar.Wc) - anVar.r9(org.telegram.ui.Components.i11.c)) - org.telegram.messenger.g0.L(f21);
                            g90Var3 = anVar.W1;
                            if (g90Var3 == null) {
                            }
                            qjVar = anVar.Z;
                            if (qjVar != null) {
                                f23 = Math.max(f23, veVar.f ? 0.0f : Math.max(0.0f, veVar.getMeasuredHeight() - (veVar.c.getTranslationY() + veVar.e)));
                            }
                            float f832 = f76 + f22;
                            float f842 = measuredHeight82 - f23;
                            if (q1Var2 != null) {
                            }
                            slVar6 = anVar.z0;
                            left32 = Math.max(left32, view8.getX() + slVar6.getLeft());
                            slVar7 = anVar.z0;
                            f832 = Math.max(f832, view8.getY() + slVar7.getY());
                            slVar8 = anVar.z0;
                            right22 = Math.min(right22, view8.getX() + slVar8.getLeft() + view8.getMeasuredWidth());
                            slVar9 = anVar.z0;
                            f842 = Math.min(f842, view8.getY() + slVar9.getY() + view8.getMeasuredHeight());
                            f24 = f842;
                            f25 = f832;
                            float f852 = right22;
                            float max22 = Math.max(left32, anVar.l9());
                            if (f25 >= f24) {
                            }
                            ajVar2 = ajVar;
                            if (ajVar2 == null) {
                            }
                            if (ajVar2 != null) {
                            }
                            if (ajVar2 != null) {
                            }
                            arrayList3.add(q1Var2);
                            if (ajVar2 != null) {
                            }
                            arrayList2.add(q1Var2);
                            if (ajVar2 != null) {
                            }
                            arrayList5.add(q1Var2);
                            if (ajVar2 != null) {
                            }
                            arrayList6.add(q1Var2);
                            num5 = anVar.a9;
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
                            num6 = anVar.a9;
                            if (num6 != null) {
                                paint13 = anVar.R8;
                                if (paint13 == null) {
                                }
                                if (f25 < f24) {
                                }
                            }
                            olVar2 = this;
                            canvas3 = canvas;
                            z12 = z9;
                        } else {
                            f20 = 1.0f;
                            i14 = 1;
                            olVar2 = this;
                            djVar3 = djVar;
                            i12 = childCount;
                            i13 = i20;
                            viVar = viVar2;
                            f31 = f76;
                        }
                        i20 = i13 + 1;
                        olVar3 = olVar2;
                        y10 = f31;
                        f11 = f14;
                        viVar2 = viVar;
                        f10 = f20;
                        i10 = i14;
                        djVar = djVar3;
                        childCount = i12;
                    }
                    org.telegram.messenger.dj djVar4 = djVar;
                    int i26 = i10;
                    f16 = f10;
                    float f95 = y10;
                    olVar = olVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i27 = 0; i27 < size3; i27++) {
                            olVar.Y(canvas3, f95, (org.telegram.ui.Cells.q1) arrayList3.get(i27), 0);
                        }
                        i11 = 0;
                        arrayList3.clear();
                    } else {
                        i11 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i28 = i11; i28 < size4; i28++) {
                            olVar.Y(canvas3, f95, (org.telegram.ui.Cells.q1) arrayList2.get(i28), i26);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i29 = i11; i29 < size5; i29++) {
                            org.telegram.ui.Cells.q1 q1Var7 = (org.telegram.ui.Cells.q1) arrayList.get(i29);
                            if (q1Var7.getCurrentPosition() != null || q1Var7.getTransitionParams().x0) {
                                olVar.Y(canvas3, f95, q1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i30 = i11; i30 < size6; i30++) {
                            org.telegram.ui.Cells.q1 q1Var8 = (org.telegram.ui.Cells.q1) arrayList4.get(i30);
                            if (q1Var8.getCurrentPosition() != null || q1Var8.getTransitionParams().x0) {
                                olVar.Y(canvas3, f95, q1Var8, 3);
                            }
                        }
                    }
                    num3 = anVar.a9;
                    if (num3 != null && djVar4 != null) {
                        paint8 = anVar.R8;
                        if (paint8 != null) {
                            matrix4 = anVar.S8;
                            matrix4.reset();
                            float measuredWidth13 = olVar.getMeasuredWidth() / anVar.P8.getWidth();
                            matrix5 = anVar.S8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = anVar.Q8;
                            matrix6 = anVar.S8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = anVar.R8;
                            f19 = anVar.Z8;
                            paint11.setAlpha((int) (f19 * 255.0f));
                            float measuredWidth14 = olVar.getMeasuredWidth();
                            float measuredHeight13 = olVar.getMeasuredHeight();
                            paint12 = anVar.R8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = anVar.T8;
                            f17 = anVar.V8;
                            f18 = anVar.Y8;
                            paint9.setAlpha((int) (f18 * f17 * 255.0f));
                            float measuredWidth15 = olVar.getMeasuredWidth();
                            float measuredHeight14 = olVar.getMeasuredHeight();
                            paint10 = anVar.T8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i31 = i11; i31 < size7; i31++) {
                            org.telegram.ui.Cells.q1 q1Var9 = (org.telegram.ui.Cells.q1) arrayList4.get(i31);
                            if (q1Var9.getCurrentPosition() != null || q1Var9.getTransitionParams().x0) {
                                olVar.Y(canvas3, f95, q1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = anVar.a9;
                    if (num13 == null) {
                        f60 = anVar.Y8;
                        if (f60 < f16) {
                            paint25 = anVar.R8;
                            if (paint25 != null) {
                                matrix13 = anVar.S8;
                                matrix13.reset();
                                float measuredWidth16 = olVar.getMeasuredWidth() / anVar.P8.getWidth();
                                matrix14 = anVar.S8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = anVar.Q8;
                                matrix15 = anVar.S8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = anVar.R8;
                                f63 = anVar.Z8;
                                paint28.setAlpha((int) (f63 * 255.0f));
                                float measuredWidth17 = olVar.getMeasuredWidth();
                                float measuredHeight15 = olVar.getMeasuredHeight();
                                paint29 = anVar.R8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = anVar.T8;
                                f61 = anVar.V8;
                                f62 = anVar.Y8;
                                paint26.setAlpha((int) ((f16 - f62) * f61 * 255.0f));
                                float measuredWidth18 = olVar.getMeasuredWidth();
                                float measuredHeight16 = olVar.getMeasuredHeight();
                                paint27 = anVar.T8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            olVar = olVar3;
            f16 = 1.0f;
            f14 = 0.0f;
            f15 = 20.0f;
            num13 = anVar.a9;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            olVar = olVar3;
            f14 = 0.0f;
            f15 = 20.0f;
        }
        view3 = anVar.X8;
        if (view3 != null || ((ArrayList) anVar.fa.c).size() > 0) {
            g90Var = anVar.W1;
            if (g90Var != null) {
                g90Var2 = anVar.W1;
            }
            super.drawChild(canvas3, anVar.x1, SystemClock.uptimeMillis());
            ij ijVar2 = anVar.l3;
            if (ijVar2 != null && ijVar2.getTag() != null) {
                super.drawChild(canvas3, anVar.l3, SystemClock.uptimeMillis());
            }
            gj gjVar = anVar.m3;
            if (gjVar != null && gjVar.getTag() != null) {
                super.drawChild(canvas3, anVar.m3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.kz kzVar = anVar.F9;
            if (kzVar != null) {
                super.drawChild(canvas3, kzVar, SystemClock.uptimeMillis());
            }
            wh.i iVar = anVar.qa;
            if (iVar != null) {
                super.drawChild(canvas3, iVar, SystemClock.uptimeMillis());
            }
            fi.m3 m3Var3 = anVar.s2;
            if (m3Var3 != null) {
                super.drawChild(canvas3, m3Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = anVar.M3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.M3, SystemClock.uptimeMillis());
            }
            mk mkVar = anVar.N3;
            if (mkVar != null && mkVar.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.N3, SystemClock.uptimeMillis());
            }
            fi.m3 m3Var4 = anVar.L1;
            if (m3Var4 != null && m3Var4.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.L1, SystemClock.uptimeMillis());
            }
            zk zkVar = anVar.P1;
            if (zkVar != null && zkVar.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.P1, SystemClock.uptimeMillis());
            }
            fi.m3 m3Var5 = anVar.N1;
            if (m3Var5 != null && m3Var5.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.N1, SystemClock.uptimeMillis());
            }
            qj qjVar2 = anVar.Z;
            if (qjVar2 != null && qjVar2.L != null) {
                canvas3.save();
                canvas3.translate(anVar.Z.L.getX() + anVar.Z.getX(), anVar.Z.L.getY() + anVar.Z.getY());
                anVar.Z.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (anVar.Ia > 0 && olVar.f < org.telegram.messenger.g0.L(f15)) {
            int themedColor = anVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            if (olVar.m0 == null) {
                olVar.m0 = new Paint();
            }
            if (olVar.n0 != themedColor) {
                Paint paint32 = olVar.m0;
                olVar.n0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, olVar.getMeasuredHeight() - anVar.Ia, olVar.getMeasuredWidth(), olVar.getMeasuredHeight(), olVar.m0);
            canvas3 = canvas6;
        }
        vo voVar = anVar.ia;
        if (voVar != null) {
            if (voVar.S > 0.0f && !voVar.R) {
                int inputBubbleTop = (int) anVar.T.getInputBubbleTop();
                int inputBubbleBottom = (int) anVar.T.getInputBubbleBottom();
                an anVar2 = anVar.ma;
                int i32 = inputBubbleTop - ((int) (anVar.na * (anVar2 == null ? f14 : anVar2.ha)));
                vo voVar2 = anVar.ia;
                olVar.getMeasuredWidth();
                voVar2.b(canvas3, i32, inputBubbleBottom);
            }
        }
        if (anVar.ma != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, olVar.getMeasuredWidth(), olVar.getMeasuredHeight(), (int) (anVar.na * 255.0f), 31);
            canvas3 = canvas;
            anVar.ma.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        anVar.Qa.e(canvas3);
        if (i17 >= 0) {
            canvas3.restore();
        }
        if (anVar.Da) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (anVar.Ea * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        lk lkVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (lkVar = this.w0.Ya) == null || !lkVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        lkVar.a(true);
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
        boolean z9;
        yj yjVar;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.w0;
        jh.e eVar = anVar.b4;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y10 = (org.telegram.messenger.g0.E || anVar.isInBubbleMode()) ? (anVar.Z.getEmojiView() != null ? anVar.Z.getEmojiView() : anVar.Z).getY() : anVar.Z.getY();
        View view = anVar.X8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        }
        qj qjVar = anVar.Z;
        if (qjVar == null || !qjVar.z3 || motionEvent.getY() >= y10) {
            anVar.C9 = motionEvent.getY();
            org.telegram.ui.Cells.u9 n10 = anVar.q9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!anVar.q9.x() || !anVar.q9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                fi.g1 g1Var = anVar.E1;
                if (g1Var != null) {
                    if (anVar.I3 != null) {
                        z9 = g1Var.B(motionEvent);
                        if (anVar.E1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !anVar.q9.x() || (motionEvent.getY() >= anVar.z0.getTop() && motionEvent.getY() <= anVar.z0.getBottom())) {
                            yjVar = anVar.Pa;
                            if (!yjVar.n) {
                                return yjVar.g(motionEvent);
                            }
                            ab.q qVar = ab.q.e;
                            if (qVar == null || !qVar.a) {
                                if (anVar.isInPreviewMode() && anVar.ca) {
                                    if (motionEvent.getAction() == 0) {
                                        int i7 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (anVar.x1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                h6.m mVar = anVar.x1.e[i10 == 0 ? 1 : i10 == 1 ? i7 : i11];
                                                if (mVar != null) {
                                                    ((kh.b) mVar.b).getLocationInWindow(iArr2);
                                                    Rect rect = org.telegram.messenger.g0.Q;
                                                    int i12 = iArr2[0] - iArr[0];
                                                    rect.set(i12, iArr2[1] - iArr[1], org.telegram.messenger.g0.L(56.0f) + i12, org.telegram.messenger.g0.L(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z10 = true;
                                                        break;
                                                    }
                                                }
                                                i10++;
                                                i7 = 2;
                                            }
                                        }
                                        z10 = false;
                                        ui uiVar = anVar.o1;
                                        if (uiVar != null) {
                                            uiVar.getLocationInWindow(iArr2);
                                            Rect rect2 = org.telegram.messenger.g0.Q;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], anVar.o1.getMeasuredWidth() + i13, anVar.o1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z11 = true;
                                                if (z10) {
                                                    this.r0 = motionEvent.getX();
                                                    this.s0 = motionEvent.getY();
                                                    this.t0 = SystemClock.elapsedRealtime();
                                                    this.u0 = z11;
                                                    ui uiVar2 = anVar.o1;
                                                    if (uiVar2 != null) {
                                                        uiVar2.h0.c(z11);
                                                    }
                                                    z9 = true;
                                                } else {
                                                    this.t0 = -1L;
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z10) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        ui uiVar3 = anVar.o1;
                                        if (uiVar3 != null) {
                                            uiVar3.h0.c(false);
                                        }
                                        if (this.u0 || (a8.r9.a(this.r0, this.s0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.L(6.0f) && SystemClock.elapsedRealtime() - this.t0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.u0) {
                                                q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                                                anVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) q4Var2).S(ProfileActivity.A4(anVar.j6));
                                            } else {
                                                q4Var = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                                                ((ActionBarLayout) q4Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.t0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.t0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z9) {
                                }
                            } else {
                                r4 r4Var = (r4) ab.q.o().d;
                                if (r4Var != null) {
                                    r4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (anVar.q9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n10.getX(), n10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = g1Var.e;
                        if (g1Var.H) {
                            g1Var.I = true;
                            g1Var.H = false;
                            g1Var.F(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                g1Var.F(view2, g1Var.D ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            g1Var.d = 0;
                            g1Var.c = 1.0f;
                            org.telegram.ui.Components.k61 k61Var = g1Var.M;
                            if (k61Var != null) {
                                k61Var.e(1.0f, 0, g1Var.b);
                            }
                            g1Var.x(false);
                        }
                    }
                }
                z9 = false;
                if (motionEvent.getAction() == 0) {
                }
                yjVar = anVar.Pa;
                if (!yjVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        an anVar = this.w0;
        org.telegram.ui.Components.s01 s01Var = anVar.m0;
        float progress = (view == s01Var || view == this.L || view == anVar.Y || (view instanceof org.telegram.ui.ActionBar.i5) || s01Var == null) ? 0.0f : s01Var.getProgress() * anVar.m0.getContentWidth();
        if (progress <= 0.0f) {
            return Z(canvas, view, j3);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j3);
        canvas.restore();
        return Z;
    }

    @Override // org.telegram.ui.Components.rt0
    public float getBottomOffset() {
        return this.w0.z0.getBottom();
    }

    public an getChatActivity() {
        return this.w0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.w0.getThemedColor(org.telegram.ui.ActionBar.k6.ua);
        ColorDrawable colorDrawable = this.v0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.v0 = new ColorDrawable(themedColor);
        }
        return this.v0;
    }

    @Override // org.telegram.ui.Components.rt0
    public int getKeyboardHeight() {
        if (this.w0.ib) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.rt0
    public float getListTranslationY() {
        return this.w0.z0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.rt0
    public Drawable getNewDrawable() {
        an anVar = this.w0;
        if (anVar.Q9()) {
            return getCompactBackground();
        }
        Drawable m10 = anVar.xa.m();
        return m10 != null ? m10 : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.rt0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.w0.xa.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.rt0
    public int getScrollOffset() {
        return this.w0.z0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        View view;
        super.onAttachedToWindow();
        an anVar = this.w0;
        if (anVar.ib) {
            this.H.b = anVar.l1;
        } else {
            q4Var = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                if (((ActionBarLayout) q4Var2).b) {
                    org.telegram.ui.ActionBar.i1 i1Var = this.H;
                    q4Var3 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                    i1Var.b = (FrameLayout) q4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        anVar.Z.setAdjustPanLayoutHelper(this.H);
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if (ijVar != null && ((ijVar.i4() || org.telegram.messenger.ij.M4(ijVar.k)) && ijVar.T == 0 && org.telegram.messenger.ij.B0(ijVar.k) == anVar.j6)) {
            MediaController.B().p0(anVar.c8(false), anVar.J8, anVar.H8, true);
        }
        vo voVar = anVar.ia;
        if (voVar != null) {
            voVar.F.P();
            org.telegram.ui.Components.i5 i5Var = voVar.k0;
            if (i5Var != null && (view = voVar.a0) != null) {
                i5Var.a(view);
            }
            org.telegram.messenger.qs.f(voVar.e0).c(voVar, org.telegram.messenger.qs.r);
        }
        anVar.Qa.i();
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        an anVar = this.w0;
        vo voVar = anVar.ia;
        if (voVar != null) {
            org.telegram.messenger.qs.f(voVar.e0).n(voVar, org.telegram.messenger.qs.r);
            voVar.F.R();
            org.telegram.ui.Components.i5 i5Var = voVar.k0;
            if (i5Var != null && (view = voVar.a0) != null) {
                i5Var.n(view);
            }
            voVar.Q = 0.0f;
            voVar.P = 0L;
            anVar.ia = null;
        }
        anVar.Qa.j();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.rc(15));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        an anVar;
        fi.p5 p5Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (p5Var = (anVar = this.w0).M2) == null || !p5Var.a() || anVar.M2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        if (r8 != r3.gd) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int D;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int L;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar3;
        int i19;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        an anVar = this.w0;
        vi viVar = anVar.w;
        int i20 = (measuredWidth - anVar.nb) - anVar.ob;
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
                int i23 = i22 & org.telegram.messenger.qs.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    D = jg.g.D(i20, measuredWidth2, 2, anVar.nb) + layoutParams.leftMargin;
                    i13 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i14 = anVar.nb + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i17 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
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
                            if (childAt != anVar.fa && childAt != anVar.qa && childAt != anVar.T && !(childAt instanceof org.telegram.ui.Components.y20) && childAt != anVar.m0) {
                                if (childAt instanceof org.telegram.ui.Cells.u9) {
                                    i18 = anVar.Ta;
                                } else if (childAt == anVar.e1) {
                                    kVar3 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                        i19 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    i17 += i19;
                                } else if (anVar.Z.t0(childAt)) {
                                    if (!org.telegram.messenger.g0.E) {
                                        z10 = ((org.telegram.ui.ActionBar.f2) anVar).inBubbleMode;
                                        if (!z10) {
                                            i17 = anVar.Z.getBottom();
                                        }
                                    }
                                    i17 = anVar.Z.getTop() - childAt.getMeasuredHeight();
                                    L = org.telegram.messenger.g0.L(1.0f);
                                    i17 += L;
                                } else {
                                    qj qjVar = anVar.Z;
                                    if (qjVar != null && (childAt == qjVar.O1 || childAt == qjVar.N1)) {
                                        i17 = org.telegram.messenger.camera.q.w(7.0f, viVar.e(), i17);
                                        i14 -= org.telegram.messenger.g0.L(3.0f);
                                    } else if (childAt == anVar.K2) {
                                        i17 = org.telegram.messenger.camera.q.w(7.0f, viVar.e(), i17);
                                    } else if (qjVar != null && childAt == qjVar.e1) {
                                        i17 = org.telegram.messenger.camera.q.w(9.0f, viVar.e(), i17);
                                    } else if (childAt == anVar.z0 || childAt == anVar.x0 || childAt == anVar.l3 || childAt == anVar.m3 || childAt == anVar.n3) {
                                        i18 = anVar.Ta;
                                    } else if (childAt != anVar.Q) {
                                        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                        if (childAt == kVar) {
                                            i17 -= getPaddingTop();
                                            if (anVar.isInPreviewMode()) {
                                                L = org.telegram.messenger.g0.L(1.0f);
                                                i17 += L;
                                            }
                                        } else if (childAt == anVar.H8) {
                                            kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                            i17 = kVar2.getMeasuredHeight();
                                        } else if (childAt != anVar.p3 && childAt != anVar.q3 && childAt != anVar.w0) {
                                            if (childAt instanceof org.telegram.ui.Components.ia0) {
                                                i17 = org.telegram.messenger.g0.m;
                                            } else if (childAt != anVar.U) {
                                                if (childAt != anVar.b4) {
                                                }
                                            }
                                        }
                                    } else if (qjVar.z0()) {
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
                    D = (measuredWidth - anVar.ob) - measuredWidth2;
                    i13 = layoutParams.rightMargin;
                }
                i14 = D - i13;
                if (i23 == 16) {
                }
                i17 = i15 - i16;
                if (a0(childAt)) {
                }
                childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
            }
        }
        gj gjVar = anVar.m3;
        if (gjVar != null) {
            gjVar.setBackgroundHeight(getMeasuredHeight());
        }
        anVar.K9();
        anVar.M9();
        anVar.rd(false, false);
        R();
        anVar.H7();
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
        boolean z9;
        int i11;
        int i12;
        org.telegram.ui.Components.cc ccVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i13;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.x xVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.r0 r0Var2;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        an anVar = this.w0;
        vi viVar = anVar.w;
        int i14 = (size - anVar.nb) - anVar.ob;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
        ri.a aVar = anVar.M.a;
        if (aVar instanceof ri.b) {
            ((ri.b) aVar).b(i14, size2);
        }
        int i15 = 0;
        if (this.h0 != i14) {
            anVar.R4 = false;
            this.h0 = makeMeasureSpec;
            z12 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
            if (z12 || (user = anVar.f) == null || !user.self) {
                anVar.da = false;
            } else {
                org.telegram.ui.ActionBar.k5 titleTextView = anVar.o1.getTitleTextView();
                if (i14 - org.telegram.messenger.g0.L(152.0f) > org.telegram.messenger.g0.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    anVar.da = !anVar.ea;
                } else {
                    anVar.da = false;
                }
            }
            if (anVar.da || anVar.ea || org.telegram.messenger.t10.v(anVar.f)) {
                ui uiVar = anVar.o1;
                if (uiVar != null && uiVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) anVar.o1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(anVar.f4 == 3 && ((r0Var = anVar.l0) == null || r0Var.getVisibility() != 0) ? 52.0f : 92.0f);
                }
            } else {
                ui uiVar2 = anVar.o1;
                if (uiVar2 != null && uiVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) anVar.o1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(52.0f);
                }
            }
            if (anVar.da) {
                kVar8 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (!kVar8.n0 && (r0Var2 = anVar.o0) != null) {
                    r0Var2.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var3 = anVar.i0;
                if (r0Var3 != null) {
                    r0Var3.t(40);
                }
            } else {
                org.telegram.ui.ActionBar.r0 r0Var4 = anVar.i0;
                if (r0Var4 != null) {
                    r0Var4.S(40);
                }
                org.telegram.ui.ActionBar.r0 r0Var5 = anVar.o0;
                if (r0Var5 != null) {
                    r0Var5.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if (!kVar7.n0 && (xVar = anVar.p0) != null) {
                xVar.e((!anVar.ea || anVar.da) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.r0 r0Var6 = anVar.i0;
            if (r0Var6 != null) {
                TLRPC.UserFull userFull = anVar.q8;
                if (anVar.ea) {
                    r0Var6.t(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    r0Var6.S(32);
                }
            }
            anVar.R4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z13 = this.f + anVar.Ha >= org.telegram.messenger.g0.L(20.0f);
        if (this.g0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (anVar.Ia > 0 && keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            anVar.Ha = anVar.Ia;
        } else if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            anVar.Ha = anVar.Z.s0() ? anVar.Z.getEmojiPadding() : 0;
        } else {
            anVar.Ha = 0;
        }
        setEmojiKeyboardHeight(anVar.Ha);
        boolean z14 = this.f + anVar.Ha >= org.telegram.messenger.g0.L(20.0f);
        if (MediaController.B().u0 != null && MediaController.B().u0.i4() && z13 != z14) {
            for (int i16 = 0; i16 < anVar.z0.getChildCount(); i16++) {
                View childAt = anVar.z0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.ij messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    if (messageObject.i4() && MediaController.B().I(messageObject)) {
                        anVar.z0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            anVar.B0.i1(R, (int) (((((anVar.z0.getMeasuredHeight() - anVar.L9) - anVar.Ua) + ((this.f + anVar.Ha) - r1)) - (z14 ? org.telegram.messenger.g0.u : org.telegram.messenger.g0.g3(anVar.Z9(), anVar.Q9()))) / 2.0f), false);
                            anVar.C0.g(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(anVar.Z, makeMeasureSpec, 0, i10, 0);
                            z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
                            if (!z9 || anVar.ib) {
                                this.f0 = 0;
                            } else {
                                this.f0 = anVar.Z.getMeasuredHeight();
                            }
                            anVar.Ta = 0;
                            anVar.Ua = 0;
                            if (org.telegram.messenger.iz.f() && !anVar.ib && anVar.G != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = anVar.H;
                                anVar.Ta = i18;
                                anVar.Ua = i18;
                            }
                            i11 = 0;
                            while (i11 < childCount) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i11);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != anVar.Z) {
                                        kVar4 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                        if (childAt2 != kVar4) {
                                            if (a0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == anVar.z0 || childAt2 == anVar.x0 || (childAt2 instanceof org.telegram.ui.Cells.u9)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), anVar.Ta + size2 + anVar.Ua), TLObject.FLAG_30));
                                                } else if (childAt2 == anVar.Q) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int L = org.telegram.messenger.g0.L(10.0f);
                                                    int i20 = i17 - this.f0;
                                                    z11 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, org.telegram.messenger.g0.L((anVar.Z.z0() ? 48 : i15) + 2) + (i20 - (z11 ? org.telegram.messenger.g0.m : i15))), TLObject.FLAG_30));
                                                } else if (childAt2 == anVar.p3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    anVar.p3.setInternalPadding(org.telegram.messenger.g0.L(12.0f) + viVar.e() + ((int) anVar.Xc));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == anVar.q3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - viVar.e()) - ((int) anVar.Xc)) - org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == anVar.e1) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                                } else if (anVar.Z.t0(childAt2)) {
                                                    org.telegram.ui.Components.jf jfVar = anVar.Z.H1;
                                                    if (childAt2 == jfVar && jfVar != null) {
                                                        i19 = jfVar.getKeyboardHeight();
                                                    }
                                                    z10 = ((org.telegram.ui.ActionBar.f2) anVar).inBubbleMode;
                                                    if (z10) {
                                                        int paddingTop2 = getPaddingTop() + (i17 - this.f0) + measuredHeight;
                                                        if (i19 < 0) {
                                                            i19 = Math.max(Math.min(paddingTop2, org.telegram.messenger.g0.L(350.0f)), paddingTop2 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                    } else if (org.telegram.messenger.g0.E) {
                                                        int paddingTop3 = getPaddingTop() + (((i17 - this.f0) + measuredHeight) - org.telegram.messenger.g0.m);
                                                        if (i19 < 0) {
                                                            i19 = Math.max(Math.min(paddingTop3, org.telegram.messenger.g0.L(350.0f)), paddingTop3 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                    }
                                                } else {
                                                    jj jjVar = anVar.W1;
                                                    if (childAt2 == jjVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jjVar.getLayoutParams();
                                                        jg.i1 adapter = anVar.W1.getAdapter();
                                                        if (adapter.w0 == null || adapter.h0) {
                                                            anVar.W1.setIgnoreLayout(true);
                                                            layoutParams.height = i17;
                                                            layoutParams.topMargin = 0;
                                                            anVar.W1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == anVar.q9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                        int i21 = i17 + anVar.Ta;
                                                        if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f) || getLayoutParams().height >= 0 || anVar.ib) {
                                                            pl plVar = anVar.q9;
                                                            plVar.d0 = 0;
                                                            plVar.w();
                                                        } else {
                                                            i21 += keyboardHeight;
                                                            pl plVar2 = anVar.q9;
                                                            plVar2.d0 = keyboardHeight;
                                                            plVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.ia0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n, TLObject.FLAG_30));
                                                    } else if (childAt2 == anVar.f2) {
                                                        kVar5 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                                        if (kVar5.getVisibility() == 0) {
                                                            kVar6 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
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
                            if (anVar.Q4) {
                                anVar.R4 = true;
                                anVar.K9();
                                anVar.M9();
                                anVar.Q4 = false;
                                aj ajVar = anVar.z0;
                                ajVar.measure(View.MeasureSpec.makeMeasureSpec(ajVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(anVar.z0.getMeasuredHeight(), TLObject.FLAG_30));
                                anVar.R4 = false;
                            }
                            i12 = anVar.L4;
                            if (i12 != -1) {
                                org.telegram.messenger.g0.h3(new bg.m0(this, i12, 27));
                                anVar.L4 = -1;
                            }
                            ccVar = org.telegram.ui.Components.cc.w;
                            if (ccVar != null && anVar.Ac != null) {
                                ccVar.l();
                            }
                            anVar.g7();
                            this.g0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.je jeVar = anVar.Z.Y3;
        org.telegram.messenger.g0.r(jeVar);
        jeVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(anVar.Z, makeMeasureSpec, 0, i10, 0);
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        if (z9) {
        }
        this.f0 = 0;
        anVar.Ta = 0;
        anVar.Ua = 0;
        if (org.telegram.messenger.iz.f()) {
            int i182 = anVar.H;
            anVar.Ta = i182;
            anVar.Ua = i182;
        }
        i11 = 0;
        while (i11 < childCount) {
        }
        if (anVar.Q4) {
        }
        i12 = anVar.L4;
        if (i12 != -1) {
        }
        ccVar = org.telegram.ui.Components.cc.w;
        if (ccVar != null) {
            ccVar.l();
        }
        anVar.g7();
        this.g0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        an anVar = this.w0;
        ih.d.c(anVar.N8, anVar.fragmentView);
        anVar.O8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        an anVar = this.w0;
        anVar.O9 = i10;
        anVar.K9();
        anVar.M9();
    }

    @Override // org.telegram.ui.Components.rt0
    public final void L() {
    }

    @Override // org.telegram.ui.Components.rt0
    public final void V() {
    }

    @Override // org.telegram.ui.Components.rt0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
    }
}
