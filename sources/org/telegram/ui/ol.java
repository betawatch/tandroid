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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ol extends org.telegram.ui.Components.st0 {
    public int g0;
    public int h0;
    public int i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public final ArrayList m0;
    public Paint n0;
    public int o0;
    public final ml p0;
    public final ml q0;
    public final RectF r0;
    public float s0;
    public float t0;
    public long u0;
    public boolean v0;
    public ColorDrawable w0;
    public final /* synthetic */ an x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.ml] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.ml] */
    public ol(an anVar, Context context, org.telegram.ui.ActionBar.o4 o4Var) {
        super(context, o4Var);
        this.x0 = anVar;
        this.g0 = 0;
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        this.m0 = new ArrayList();
        final int i7 = 0;
        this.p0 = new eh.a(this) { // from class: org.telegram.ui.ml
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
                        an anVar2 = this.b.x0;
                        if (!anVar2.A0.Y0() || anVar2.A0.getOverScrollMode() == 2) {
                            anVar2.A0.z1(canvas, rectF);
                            for (int i10 = 0; i10 < anVar2.A0.getChildCount(); i10++) {
                                View childAt = anVar2.A0.getChildAt(i10);
                                if (!an.m2(anVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                        if (q1Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, q1Var.W);
                                            q1Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.k2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                        anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.t0) childAt).J(canvas);
                                        canvas.restore();
                                    } else {
                                        anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            anVar2.A0.A1(canvas, rectF);
                            break;
                        } else {
                            anVar2.A0.d(canvas, rectF);
                            break;
                        }
                        break;
                    default:
                        ol olVar = this.b;
                        an anVar3 = olVar.x0;
                        RectF rectF2 = olVar.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, olVar.getWidth(), olVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = anVar3.fd.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.j6.n0(org.telegram.ui.ActionBar.j6.r1(f10 * 0.85f, anVar3.getThemedColor(org.telegram.ui.ActionBar.j6.d6))));
                            }
                            ih.d.b(olVar.p0, canvas, rectF, anVar3.A0, olVar, i11);
                            di.c1 c1Var = anVar3.a4;
                            if (c1Var != null) {
                                ih.d.b(c1Var, canvas, rectF, c1Var, olVar, i12);
                            }
                            hi.i1 i1Var = anVar3.F1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = anVar3.F1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = anVar3.F1.getChildAt(i13);
                                    if ((childAt2 instanceof cn) && childAt2.getVisibility() == 0) {
                                        ol olVar2 = ((cn) childAt2).a.m1;
                                        ih.d.a(olVar2.q0, canvas, rectF, olVar2, olVar);
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
        this.q0 = new eh.a(this) { // from class: org.telegram.ui.ml
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
                        an anVar2 = this.b.x0;
                        if (!anVar2.A0.Y0() || anVar2.A0.getOverScrollMode() == 2) {
                            anVar2.A0.z1(canvas, rectF);
                            for (int i102 = 0; i102 < anVar2.A0.getChildCount(); i102++) {
                                View childAt = anVar2.A0.getChildAt(i102);
                                if (!an.m2(anVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                        if (q1Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, q1Var.W);
                                            q1Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.k2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                        anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.t0) childAt).J(canvas);
                                        canvas.restore();
                                    } else {
                                        anVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            anVar2.A0.A1(canvas, rectF);
                            break;
                        } else {
                            anVar2.A0.d(canvas, rectF);
                            break;
                        }
                        break;
                    default:
                        ol olVar = this.b;
                        an anVar3 = olVar.x0;
                        RectF rectF2 = olVar.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, olVar.getWidth(), olVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = anVar3.fd.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.j6.n0(org.telegram.ui.ActionBar.j6.r1(f10 * 0.85f, anVar3.getThemedColor(org.telegram.ui.ActionBar.j6.d6))));
                            }
                            ih.d.b(olVar.p0, canvas, rectF, anVar3.A0, olVar, i11);
                            di.c1 c1Var = anVar3.a4;
                            if (c1Var != null) {
                                ih.d.b(c1Var, canvas, rectF, c1Var, olVar, i12);
                            }
                            hi.i1 i1Var = anVar3.F1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = anVar3.F1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = anVar3.F1.getChildAt(i13);
                                    if ((childAt2 instanceof cn) && childAt2.getVisibility() == 0) {
                                        ol olVar2 = ((cn) childAt2).a.m1;
                                        ih.d.a(olVar2.q0, canvas, rectF, olVar2, olVar);
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
        this.I = new nl(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.x0;
        anVar.m1.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        kVar.setTranslationY(0.0f);
        hk hkVar = anVar.Ab;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.D1 != null ? r3.getCurrentHeight() : 0);
        }
        hi.l3 l3Var = anVar.L1;
        if (l3Var != null) {
            l3Var.setTranslationY(0.0f);
        }
        hi.l3 l3Var2 = anVar.K1;
        if (l3Var2 != null) {
            l3Var2.setTranslationY(0.0f);
        }
        anVar.f1.setTranslationY(0.0f);
        anVar.R.setTranslationY(0.0f);
        anVar.S9 = 0.0f;
        anVar.T9 = 0.0f;
        anVar.m1.setBackgroundTranslation(0);
        org.telegram.ui.Components.w40 w40Var = anVar.q3;
        if (w40Var != null) {
            w40Var.g(0.0f);
        }
        hi.n5 n5Var = anVar.N2;
        if (n5Var != null) {
            org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) n5Var.b;
            s9Var.u = 0.0f;
            s9Var.d.invalidate();
        }
        anVar.setFragmentPanTranslationOffset(0);
        anVar.M9();
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final int Q() {
        fi.p2 p2Var = this.x0.Y1;
        if (p2Var == null || !p2Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.st0
    public final void T(Drawable drawable) {
        an anVar = this.x0;
        jh.l lVar = anVar.Y;
        if (drawable instanceof org.telegram.ui.Components.ra0) {
            ((org.telegram.ui.Components.ra0) drawable).p();
        }
        ui.a c10 = lVar.c(drawable);
        float B = org.telegram.messenger.g0.B(lVar.b(c10));
        float B2 = org.telegram.messenger.g0.B(lVar.a(c10));
        anVar.gc = B <= 0.721f;
        anVar.hc = B2 <= 0.9f;
        anVar.N.a = c10;
        ui.f fVar = anVar.J;
        if (fVar != null) {
            Iterator it = fVar.w.iterator();
            while (it.hasNext()) {
                fh.e eVar = ((fh.g) it.next()).g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ui.f fVar2 = anVar.K;
        if (fVar2 != null) {
            Iterator it2 = fVar2.w.iterator();
            while (it2.hasNext()) {
                fh.e eVar2 = ((fh.g) it2.next()).g0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        lh.f fVar3 = anVar.Z;
        if (fVar3 != null) {
            fVar3.setOverlayColor(anVar.S9() ? anVar.getThemedColor(org.telegram.ui.ActionBar.j6.va) : 0);
            anVar.Z.invalidate();
        }
        jh.f fVar4 = anVar.U;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        anVar.m1.invalidate();
        Iterator it3 = anVar.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        anVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.q1 q1Var, int i7) {
        int save = canvas.save();
        an anVar = this.x0;
        float x10 = q1Var.getX() + anVar.A0.getLeft();
        float y10 = q1Var.getY() + anVar.A0.getY() + q1Var.getPaddingTop();
        float alpha = q1Var.a() ? q1Var.getAlpha() : 1.0f;
        canvas.clipRect(anVar.A0.getLeft(), f10, anVar.A0.getRight(), ((((anVar.A0.getY() + anVar.A0.getMeasuredHeight()) - anVar.Xa) - anVar.w.e()) - anVar.Zc) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y10);
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.y1(alpha, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, alpha);
        } else if (i7 == 2) {
            q1Var.Q0(alpha, canvas, q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0);
        } else if (i7 == 3) {
            boolean z10 = q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0;
            q1Var.V0(canvas, alpha);
            if (!z10) {
                q1Var.o1(canvas, alpha, null);
            }
        } else if (i7 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().l) != 0) && anVar.b9 != null)) {
            float f11 = (anVar.W8 * anVar.Z8) / 0.2f;
            canvas.save();
            q1Var.s1(canvas, anVar.b9, f11, anVar.X8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            q1Var.t1(this, canvas, anVar.c9, anVar.b9, f11);
            canvas.restore();
        }
        q1Var.setInvalidatesParent(false);
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
        hi.n5 n5Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.gj gjVar;
        boolean z10;
        boolean z11;
        tj tjVar;
        org.telegram.messenger.gj gjVar2;
        org.telegram.ui.Components.w40 w40Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        an anVar = this.x0;
        boolean z12 = false;
        if ((anVar.Y8 == null && ((ArrayList) anVar.ia.c).size() <= 0) || (view != anVar.y1 && view != anVar.m3 && view != anVar.n3 && view != anVar.I9 && view != anVar.ta && view != anVar.t2 && view != null && view != anVar.N3 && view != anVar.O3)) {
            if ((view != anVar.N3 || !PhotoViewer.p1().P1()) && (!anVar.oa || view != anVar.A0)) {
                if (anVar.Ga) {
                    kVar3 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                }
                if (view != anVar.q3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (n5Var = anVar.N2) != null && n5Var.a() && anVar.N2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        gjVar = MediaController.B().v0;
                        if (gjVar == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == anVar.I8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    } else {
                        if (view != anVar.A0) {
                            if (view != anVar.U) {
                            }
                        }
                        gjVar = MediaController.B().v0;
                        if (gjVar == null && gjVar.T == 0) {
                            z10 = gjVar.h4();
                            if (z10 || org.telegram.messenger.gj.L4(gjVar.k)) {
                                z11 = true;
                                if (view == anVar.I8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-anVar.ja) - (anVar.qa != 0.0f ? (anVar.A0.getMeasuredHeight() - anVar.ja) * anVar.qa : 0.0f));
                                    if (gjVar != null && gjVar.D == 5) {
                                        if (org.telegram.ui.ActionBar.j6.k3 != null && anVar.K8.d) {
                                            int x10 = ((int) view.getX()) - org.telegram.messenger.g0.L(3.0f);
                                            int y10 = ((int) view.getY()) - org.telegram.messenger.g0.L(2.0f);
                                            canvas.save();
                                            canvas.scale(anVar.I8.getScaleX(), anVar.I8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.j6.k3.setAlpha(org.telegram.messenger.ns.e4);
                                            org.telegram.ui.ActionBar.j6.k3.setBounds(x10, y10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.g3(anVar.ba(), anVar.S9()) + x10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.g3(anVar.ba(), anVar.S9()) + y10);
                                            org.telegram.ui.ActionBar.j6.k3.draw(canvas);
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
                                if (view == anVar.U && (w40Var = anVar.q3) != null && w40Var.getVisibility() == 0) {
                                    super.drawChild(canvas, anVar.q3, j3);
                                }
                                z12 = super.drawChild(canvas, view, j3);
                                if (z11 && view == anVar.A0 && gjVar.D != 5 && (tjVar = anVar.I8) != null && tjVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-anVar.ja) - (anVar.qa != 0.0f ? (anVar.A0.getMeasuredHeight() - anVar.ja) * anVar.qa : 0.0f)) + anVar.ka);
                                    super.drawChild(canvas, anVar.I8, j3);
                                    if (anVar.J8 != null) {
                                        canvas.save();
                                        canvas.translate(anVar.J8.getX(), anVar.A0.getY() + anVar.J8.getTop());
                                        if (z10) {
                                            anVar.J8.r1(canvas);
                                            invalidate();
                                            anVar.J8.invalidate();
                                        } else {
                                            anVar.J8.j1(canvas);
                                            org.telegram.ui.Cells.q1 q1Var = anVar.J8;
                                            if (!q1Var.G9 && ((gjVar2 = q1Var.Q5) == null || gjVar2.D != 27)) {
                                                q1Var.y1(q1Var.getAlpha(), canvas, true);
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
                        if (view == anVar.I8) {
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
        an anVar = this.x0;
        return view == anVar.N2 || view == anVar.F1 || view == anVar.I9 || view == anVar.Z || view == anVar.Z3 || view == anVar.n0 || (view instanceof org.telegram.ui.ActionBar.g5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.gg ggVar;
        an anVar = this.x0;
        qj qjVar = anVar.a0;
        if (qjVar == null || view != qjVar.n0) {
            super.addView(view, i7, layoutParams);
        } else {
            lh.f fVar = anVar.Z;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i7 = indexOfChild;
            }
            super.addView(view, i7, layoutParams);
        }
        qj qjVar2 = anVar.a0;
        if (qjVar2 != null && view == qjVar2.n0) {
            ki.w wVar = (ki.w) view;
            wVar.setBackgroundDrawable(anVar.L.c(wVar.c, anVar.E, false));
        }
        qj qjVar3 = anVar.a0;
        if (qjVar3 == null || view != (ggVar = qjVar3.w2)) {
            return;
        }
        ggVar.setBlurredBackgroundFactory(anVar.L);
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
    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
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
        org.telegram.ui.Components.j90 j90Var;
        org.telegram.ui.Components.j90 j90Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        sl slVar;
        View view6;
        org.telegram.messenger.bj bjVar;
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
        org.telegram.messenger.bj bjVar2;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.yi yiVar;
        View view7;
        org.telegram.messenger.bj bjVar3;
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
        boolean z10;
        sl slVar4;
        sl slVar5;
        org.telegram.ui.Components.j90 j90Var3;
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
        org.telegram.messenger.yi yiVar2;
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
        org.telegram.ui.Components.j90 j90Var4;
        org.telegram.ui.Components.j90 j90Var5;
        sl slVar20;
        float f52;
        org.telegram.ui.Cells.q1 q1Var3;
        boolean z11;
        org.telegram.ui.Components.j90 j90Var6;
        float f53;
        org.telegram.ui.Components.j90 j90Var7;
        float f54;
        sl slVar21;
        org.telegram.ui.Components.j90 j90Var8;
        org.telegram.ui.Components.j90 j90Var9;
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
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        cj cjVar;
        ol olVar3 = this;
        an anVar = olVar3.x0;
        vi viVar2 = anVar.w;
        ArrayList arrayList7 = anVar.E6;
        anVar.a0.v2();
        anVar.Rc();
        if (anVar.Na || ((cjVar = anVar.B0) != null && cjVar.k())) {
            anVar.Na = false;
            anVar.cd();
        }
        anVar.vd(false, false);
        anVar.ed();
        hi.l3 l3Var = anVar.v2;
        if (l3Var != null && l3Var.W) {
            l3Var.z();
        }
        hi.l3 l3Var2 = anVar.x2;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.z();
        }
        float f69 = 0.2f;
        float f70 = 2.0f;
        if (anVar.Ga) {
            kVar10 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            canvas2 = canvas;
            i7 = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), olVar3.getMeasuredWidth(), olVar3.getMeasuredHeight(), (int) (anVar.Ha * 255.0f), 31);
            float f71 = (anVar.Ha * 0.2f) + 0.8f;
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
            org.telegram.messenger.cj cjVar2 = q1Var4.getMessageObject().N1;
            if (cjVar2 != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    ak akVar = anVar.D1;
                    int currentHeight = measuredHeight + (akVar != null ? akVar.getCurrentHeight() : 0);
                    nj njVar = anVar.E1;
                    int currentHeight2 = currentHeight + (njVar != null ? njVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
                    i16 = currentHeight2 + (z12 ? org.telegram.messenger.g0.m : 0);
                } else {
                    i16 = 0;
                }
                f67 = f70;
                f68 = f69;
                canvas2.clipRect(0.0f, i16 + anVar.P9, olVar3.getWidth(), olVar3.getHeight());
                ImageReceiver photoImage = q1Var4.getPhotoImage();
                q1Var4.getLocationInWindow(org.telegram.messenger.g0.R);
                int topViewEnterProgress = (int) ((anVar.a0.getTopViewEnterProgress() * org.telegram.messenger.g0.L(48.0f)) + ((int) com.google.android.gms.internal.vision.e2.t(1.0f, cjVar2.g, q1Var4.getTranslationY(), r9[1])));
                if (cjVar2.h) {
                    canvas2.translate(cjVar2.e, org.telegram.messenger.g0.T1(cjVar2.b, topViewEnterProgress, cjVar2.g));
                } else {
                    canvas2.translate(cjVar2.e, org.telegram.messenger.g0.T1(cjVar2.b, photoImage.s() + topViewEnterProgress, cjVar2.g));
                }
                float f72 = cjVar2.d;
                canvas2.scale(f72, f72);
                if (!cjVar2.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                q1Var4.setTimeAlpha(cjVar2.f);
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
        num = anVar.b9;
        if (num != null) {
            view24 = anVar.Y8;
        }
        paint = anVar.S8;
        if (paint != null) {
            matrix = anVar.T8;
            matrix.reset();
            float measuredWidth = olVar3.getMeasuredWidth() / anVar.Q8.getWidth();
            matrix2 = anVar.T8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = anVar.R8;
            matrix3 = anVar.T8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = anVar.S8;
            f13 = anVar.a9;
            paint5.setAlpha((int) (f13 * 255.0f));
            paint6 = anVar.S8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = olVar3.getMeasuredWidth();
                float measuredHeight2 = olVar3.getMeasuredHeight();
                paint7 = anVar.S8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = anVar.U8;
            f12 = anVar.W8;
            float f75 = f12 * 255.0f;
            view = anVar.Y8;
            paint2.setAlpha((int) (f75 * (view != null ? anVar.Z8 : 1.0f)));
            paint3 = anVar.U8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = olVar3.getMeasuredWidth();
                float measuredHeight3 = olVar3.getMeasuredHeight();
                paint4 = anVar.U8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = anVar.b9;
        if (num2 != null && anVar.d9) {
            olVar3.invalidate();
        }
        view2 = anVar.Y8;
        if (view2 != null) {
            view4 = anVar.Y8;
            if (view4 == anVar.y1) {
                f64 = anVar.Z8;
                if (f64 < 1.0f) {
                    paint30 = anVar.U8;
                    f65 = anVar.W8;
                    f66 = anVar.Z8;
                    paint30.setAlpha((int) ((1.0f - f66) * f65 * 255.0f));
                    float measuredWidth4 = olVar3.getMeasuredWidth();
                    float measuredHeight4 = olVar3.getMeasuredHeight();
                    paint31 = anVar.U8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = anVar.Y8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f55 = anVar.Z8;
                    if (f55 < 1.0f) {
                        view20 = anVar.Y8;
                        float left = view20.getLeft();
                        view21 = anVar.Y8;
                        float top = view21.getTop();
                        view22 = anVar.Y8;
                        float right = view22.getRight();
                        view23 = anVar.Y8;
                        float bottom = view23.getBottom();
                        f59 = anVar.Z8;
                        int i19 = (int) (f59 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i19, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = anVar.Y8;
                    float left2 = view12.getLeft();
                    view13 = anVar.Y8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = anVar.Y8;
                    kVar6 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = anVar.Y8;
                        float x10 = view16.getX();
                        view17 = anVar.Y8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = anVar.Y8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f73;
                        view19 = anVar.Y8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f73;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, anVar.V8);
                    }
                    view15 = anVar.Y8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f56 = anVar.Z8;
                    if (f56 < 1.0f) {
                        paint23 = anVar.U8;
                        f57 = anVar.W8;
                        f58 = anVar.Z8;
                        paint23.setAlpha((int) ((1.0f - f58) * f57 * 255.0f));
                        float measuredWidth6 = olVar3.getMeasuredWidth();
                        float measuredHeight6 = olVar3.getMeasuredHeight();
                        paint24 = anVar.U8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    slVar = anVar.A0;
                    float y10 = ((slVar.getY() + anVar.O9) - anVar.Q9) - org.telegram.messenger.g0.L(4.0f);
                    view6 = anVar.Y8;
                    if (view6 instanceof org.telegram.ui.Cells.q1) {
                        view11 = anVar.Y8;
                        bjVar = ((org.telegram.ui.Cells.q1) view11).getCurrentMessagesGroup();
                    } else {
                        bjVar = null;
                    }
                    slVar2 = anVar.A0;
                    int childCount = slVar2.getChildCount();
                    int i20 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = olVar3.l0;
                        f15 = 20.0f;
                        arrayList2 = olVar3.k0;
                        arrayList3 = olVar3.j0;
                        f14 = f11;
                        arrayList4 = olVar3.m0;
                        if (i20 >= childCount) {
                            break;
                        }
                        slVar3 = anVar.A0;
                        View childAt = slVar3.getChildAt(i20);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            q1Var = (org.telegram.ui.Cells.q1) childAt;
                            bjVar2 = q1Var.getCurrentMessagesGroup();
                            yiVar = q1Var.getCurrentPosition();
                            t0Var = null;
                        } else {
                            t0Var = childAt instanceof org.telegram.ui.Cells.t0 ? (org.telegram.ui.Cells.t0) childAt : null;
                            bjVar2 = null;
                            q1Var = null;
                            yiVar = null;
                        }
                        float f76 = y10;
                        view7 = anVar.Y8;
                        if ((childAt == view7 || (bjVar != null && bjVar == bjVar2)) && childAt.getAlpha() != f14) {
                            if (z13 || q1Var == null || bjVar == null) {
                                bjVar3 = bjVar;
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
                                ArrayList arrayList8 = bjVar.d;
                                f21 = 9.0f;
                                org.telegram.messenger.aj ajVar = bjVar.m;
                                bjVar3 = bjVar;
                                org.telegram.ui.Cells.q1 q1Var5 = ajVar.m;
                                view8 = childAt;
                                if (q1Var5 != null) {
                                    float S1 = q1Var5.S1(true);
                                    float f77 = ajVar.a + S1 + ajVar.e;
                                    float f78 = ajVar.b + ajVar.f;
                                    float f79 = ajVar.c + S1 + ajVar.g;
                                    float f80 = f78;
                                    float f81 = ajVar.d + ajVar.h;
                                    if (!ajVar.j) {
                                        f80 = ajVar.m.getTranslationY() + f80;
                                        f81 = ajVar.m.getTranslationY() + f81;
                                    }
                                    float L = f80 < (anVar.O9 - ((float) anVar.Q9)) - ((float) org.telegram.messenger.g0.L(20.0f)) ? (anVar.O9 - anVar.Q9) - org.telegram.messenger.g0.L(20.0f) : f80;
                                    slVar20 = anVar.A0;
                                    i12 = childCount;
                                    if (f81 > org.telegram.messenger.g0.L(20.0f) + slVar20.getMeasuredHeight()) {
                                        slVar22 = anVar.A0;
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
                                            z11 = true;
                                            break;
                                        }
                                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList8.get(i21);
                                        ArrayList arrayList9 = arrayList8;
                                        int i22 = i21;
                                        if (anVar.n6[gjVar.A0() == anVar.k6 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) < 0) {
                                            q1Var3 = q1Var;
                                            z11 = false;
                                            break;
                                        } else {
                                            i21 = i22 + 1;
                                            arrayList8 = arrayList9;
                                        }
                                    }
                                    canvas3.save();
                                    float measuredHeight7 = ((getMeasuredHeight() - viVar2.e()) - anVar.Zc) - org.telegram.messenger.g0.L(9.0f);
                                    j90Var6 = anVar.X1;
                                    if (j90Var6 != null) {
                                        j90Var9 = anVar.X1;
                                        f53 = j90Var9.d();
                                    } else {
                                        f53 = f14;
                                    }
                                    float f82 = measuredHeight7 - f53;
                                    j90Var7 = anVar.X1;
                                    if (j90Var7 != null) {
                                        j90Var8 = anVar.X1;
                                        f54 = j90Var8.e();
                                    } else {
                                        f54 = f14;
                                    }
                                    org.telegram.ui.Cells.q1 q1Var6 = q1Var3;
                                    canvas3.clipRect(f14, f76 + f54, getMeasuredWidth(), f82);
                                    slVar21 = anVar.A0;
                                    canvas3.translate(f14, slVar21.getY());
                                    boolean z14 = ajVar.k;
                                    boolean z15 = ajVar.l;
                                    arrayList6 = arrayList4;
                                    viVar = viVar2;
                                    q1Var2 = q1Var6;
                                    num4 = null;
                                    f20 = 1.0f;
                                    ajVar.m.K0(canvas, (int) f77, (int) L, (int) f79, (int) f52, z14, z15, z11, 0);
                                    canvas.restore();
                                    z10 = true;
                                    if (q1Var2 != null && q1Var2.getPhotoImage().M()) {
                                        invalidate();
                                    }
                                    slVar4 = anVar.A0;
                                    float left3 = slVar4.getLeft();
                                    slVar5 = anVar.A0;
                                    float right2 = slVar5.getRight();
                                    float measuredHeight8 = (((getMeasuredHeight() - viVar.e()) - anVar.Zc) - anVar.t9(org.telegram.ui.Components.l11.c)) - org.telegram.messenger.g0.L(f21);
                                    j90Var3 = anVar.X1;
                                    if (j90Var3 == null) {
                                        j90Var4 = anVar.X1;
                                        float max = Math.max(0.0f, j90Var4.e());
                                        j90Var5 = anVar.X1;
                                        f23 = Math.max(0.0f, j90Var5.d());
                                        f22 = max;
                                    } else {
                                        f22 = 0.0f;
                                        f23 = 0.0f;
                                    }
                                    qjVar = anVar.a0;
                                    if (qjVar != null && (veVar = qjVar.n0) != null) {
                                        f23 = Math.max(f23, veVar.f ? 0.0f : Math.max(0.0f, veVar.getMeasuredHeight() - (veVar.c.getTranslationY() + veVar.e)));
                                    }
                                    float f83 = f76 + f22;
                                    float f84 = measuredHeight8 - f23;
                                    if (q1Var2 != null || !q1Var2.getTransitionParams().x0) {
                                        slVar6 = anVar.A0;
                                        left3 = Math.max(left3, view8.getX() + slVar6.getLeft());
                                        slVar7 = anVar.A0;
                                        f83 = Math.max(f83, view8.getY() + slVar7.getY());
                                        slVar8 = anVar.A0;
                                        right2 = Math.min(right2, view8.getX() + slVar8.getLeft() + view8.getMeasuredWidth());
                                        slVar9 = anVar.A0;
                                        f84 = Math.min(f84, view8.getY() + slVar9.getY() + view8.getMeasuredHeight());
                                    }
                                    f24 = f84;
                                    f25 = f83;
                                    float f85 = right2;
                                    float max2 = Math.max(left3, anVar.n9());
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
                                            num12 = anVar.b9;
                                            q1Var2.setScrimReaction(num12);
                                        } else if (t0Var != null) {
                                            t0Var.setInvalidatesParent(true);
                                            num11 = anVar.b9;
                                            t0Var.setScrimReaction(num11);
                                        }
                                        canvas4.clipRect(f29, f50, f30, f27);
                                        slVar18 = anVar.A0;
                                        float x11 = view8.getX() + slVar18.getLeft();
                                        slVar19 = anVar.A0;
                                        canvas4.translate(x11, view8.getY() + slVar19.getY());
                                        if (q1Var2 != null && bjVar3 == null && q1Var2.L0()) {
                                            canvas4.save();
                                            canvas4.translate(0.0f, q1Var2.getPaddingTop());
                                            q1Var2.M0(canvas4, true, false);
                                            canvas4.restore();
                                        }
                                        if (q1Var2 != null && bjVar3 == null) {
                                            f51 = anVar.a9;
                                            q1Var2.b1(canvas4, f51);
                                        }
                                        view9 = view8;
                                        view9.draw(canvas4);
                                        if (q1Var2 == null || !q1Var2.k2()) {
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
                                            t0Var.J(canvas4);
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
                                    yiVar2 = yiVar;
                                    if (yiVar2 == null || (q1Var2 != null && q1Var2.getTransitionParams().x0)) {
                                        if (yiVar2 != null || yiVar2.h || (yiVar2.a == 0 && yiVar2.c == 0)) {
                                            if (yiVar2 != null || yiVar2.h) {
                                                arrayList3.add(q1Var2);
                                            }
                                            if (yiVar2 != null || (yiVar2.a == 0 && yiVar2.c == 0 && q1Var2.j2())) {
                                                arrayList2.add(q1Var2);
                                            }
                                        }
                                        if (yiVar2 != null || (yiVar2.l & q1Var2.D()) != 0) {
                                            arrayList5.add(q1Var2);
                                        }
                                        if (yiVar2 != null) {
                                            int i23 = yiVar2.l;
                                            if ((i23 & 8) != 0) {
                                            }
                                        }
                                        arrayList6.add(q1Var2);
                                    }
                                    num5 = anVar.b9;
                                    if (num5 == null && q1Var2 != null && bjVar3 == null) {
                                        paint18 = anVar.S8;
                                        if (paint18 != null) {
                                            matrix10 = anVar.T8;
                                            matrix10.reset();
                                            float measuredWidth7 = getMeasuredWidth() / anVar.Q8.getWidth();
                                            matrix11 = anVar.T8;
                                            matrix11.postScale(measuredWidth7, measuredWidth7);
                                            BitmapShader bitmapShader2 = anVar.R8;
                                            matrix12 = anVar.T8;
                                            bitmapShader2.setLocalMatrix(matrix12);
                                            paint21 = anVar.S8;
                                            f49 = anVar.a9;
                                            paint21.setAlpha((int) (f49 * 255.0f));
                                            float measuredWidth8 = getMeasuredWidth();
                                            float measuredHeight9 = getMeasuredHeight();
                                            paint22 = anVar.S8;
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
                                            paint19 = anVar.U8;
                                            f41 = anVar.W8;
                                            f42 = anVar.Z8;
                                            paint19.setAlpha((int) (f42 * f41 * 255.0f));
                                            float measuredWidth9 = getMeasuredWidth();
                                            float measuredHeight10 = getMeasuredHeight();
                                            paint20 = anVar.U8;
                                            canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint20);
                                        }
                                        if (f25 < f24) {
                                            f43 = anVar.W8;
                                            f44 = anVar.Z8;
                                            float f86 = (f44 * f43) / f74;
                                            float alpha = view10.getAlpha();
                                            f45 = anVar.Z8;
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
                                            slVar14 = anVar.A0;
                                            float x12 = view10.getX() + slVar14.getLeft();
                                            slVar15 = anVar.A0;
                                            canvas5.translate(x12, view10.getY() + slVar15.getY() + view10.getPaddingTop());
                                            num9 = anVar.b9;
                                            q1Var2.s1(canvas5, num9, f86, anVar.X8);
                                            canvas5.restore();
                                            canvas5.save();
                                            slVar16 = anVar.A0;
                                            float x13 = view10.getX() + slVar16.getLeft();
                                            slVar17 = anVar.A0;
                                            canvas5.translate(x13, view10.getY() + slVar17.getY() + view10.getPaddingTop());
                                            int i24 = anVar.c9;
                                            num10 = anVar.b9;
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
                                        num6 = anVar.b9;
                                        if (num6 != null && t0Var != null) {
                                            paint13 = anVar.S8;
                                            if (paint13 == null) {
                                                matrix7 = anVar.T8;
                                                matrix7.reset();
                                                float measuredWidth10 = getMeasuredWidth() / anVar.Q8.getWidth();
                                                matrix8 = anVar.T8;
                                                matrix8.postScale(measuredWidth10, measuredWidth10);
                                                BitmapShader bitmapShader3 = anVar.R8;
                                                matrix9 = anVar.T8;
                                                bitmapShader3.setLocalMatrix(matrix9);
                                                paint16 = anVar.S8;
                                                f38 = anVar.a9;
                                                paint16.setAlpha((int) (f38 * 255.0f));
                                                float measuredWidth11 = getMeasuredWidth();
                                                float measuredHeight11 = getMeasuredHeight();
                                                paint17 = anVar.S8;
                                                t0Var2 = t0Var;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint17);
                                            } else {
                                                t0Var2 = t0Var;
                                                paint14 = anVar.U8;
                                                f32 = anVar.W8;
                                                f33 = anVar.Z8;
                                                paint14.setAlpha((int) (f33 * f32 * 255.0f));
                                                float measuredWidth12 = getMeasuredWidth();
                                                float measuredHeight12 = getMeasuredHeight();
                                                paint15 = anVar.U8;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint15);
                                            }
                                            if (f25 < f24) {
                                                f34 = anVar.W8;
                                                f35 = anVar.Z8;
                                                float f93 = (f35 * f34) / f74;
                                                float alpha2 = view25.getAlpha();
                                                f36 = anVar.Z8;
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
                                                slVar10 = anVar.A0;
                                                float x14 = view25.getX() + slVar10.getLeft();
                                                slVar11 = anVar.A0;
                                                canvas3.translate(x14, view25.getY() + slVar11.getY() + view25.getPaddingTop());
                                                num7 = anVar.b9;
                                                boolean z16 = anVar.X8;
                                                ch.q0 q0Var = t0Var2.F0;
                                                q0Var.getClass();
                                                org.telegram.ui.ActionBar.e6 e6Var = t0Var2.h1;
                                                if (e6Var != null) {
                                                    e6Var.b(t0Var2.v0, t0Var2.u0 + org.telegram.messenger.g0.L(4.0f), t0Var2.getMeasuredWidth(), t0Var2.w0);
                                                } else {
                                                    org.telegram.ui.ActionBar.j6.r(t0Var2.v0, t0Var2.u0 + org.telegram.messenger.g0.L(4.0f), t0Var2.getMeasuredWidth(), t0Var2.w0);
                                                }
                                                q0Var.A = f93;
                                                q0Var.B = z16;
                                                q0Var.d(canvas3, t0Var2.s2.c, num7);
                                                canvas3.restore();
                                                canvas3.save();
                                                slVar12 = anVar.A0;
                                                float x15 = view25.getX() + slVar12.getLeft();
                                                slVar13 = anVar.A0;
                                                canvas3.translate(x15, view25.getY() + slVar13.getY() + view25.getPaddingTop());
                                                int i25 = anVar.c9;
                                                num8 = anVar.b9;
                                                t0Var2.M(this, canvas3, i25, num8, f93);
                                                olVar2 = this;
                                                canvas3.restore();
                                                z13 = z10;
                                            }
                                        }
                                    }
                                    olVar2 = this;
                                    canvas3 = canvas;
                                    z13 = z10;
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
                            z10 = z13;
                            if (q1Var2 != null) {
                                invalidate();
                            }
                            slVar4 = anVar.A0;
                            float left32 = slVar4.getLeft();
                            slVar5 = anVar.A0;
                            float right22 = slVar5.getRight();
                            float measuredHeight82 = (((getMeasuredHeight() - viVar.e()) - anVar.Zc) - anVar.t9(org.telegram.ui.Components.l11.c)) - org.telegram.messenger.g0.L(f21);
                            j90Var3 = anVar.X1;
                            if (j90Var3 == null) {
                            }
                            qjVar = anVar.a0;
                            if (qjVar != null) {
                                f23 = Math.max(f23, veVar.f ? 0.0f : Math.max(0.0f, veVar.getMeasuredHeight() - (veVar.c.getTranslationY() + veVar.e)));
                            }
                            float f832 = f76 + f22;
                            float f842 = measuredHeight82 - f23;
                            if (q1Var2 != null) {
                            }
                            slVar6 = anVar.A0;
                            left32 = Math.max(left32, view8.getX() + slVar6.getLeft());
                            slVar7 = anVar.A0;
                            f832 = Math.max(f832, view8.getY() + slVar7.getY());
                            slVar8 = anVar.A0;
                            right22 = Math.min(right22, view8.getX() + slVar8.getLeft() + view8.getMeasuredWidth());
                            slVar9 = anVar.A0;
                            f842 = Math.min(f842, view8.getY() + slVar9.getY() + view8.getMeasuredHeight());
                            f24 = f842;
                            f25 = f832;
                            float f852 = right22;
                            float max22 = Math.max(left32, anVar.n9());
                            if (f25 >= f24) {
                            }
                            yiVar2 = yiVar;
                            if (yiVar2 == null) {
                            }
                            if (yiVar2 != null) {
                            }
                            if (yiVar2 != null) {
                            }
                            arrayList3.add(q1Var2);
                            if (yiVar2 != null) {
                            }
                            arrayList2.add(q1Var2);
                            if (yiVar2 != null) {
                            }
                            arrayList5.add(q1Var2);
                            if (yiVar2 != null) {
                            }
                            arrayList6.add(q1Var2);
                            num5 = anVar.b9;
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
                            num6 = anVar.b9;
                            if (num6 != null) {
                                paint13 = anVar.S8;
                                if (paint13 == null) {
                                }
                                if (f25 < f24) {
                                }
                            }
                            olVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            f20 = 1.0f;
                            i14 = 1;
                            olVar2 = this;
                            bjVar3 = bjVar;
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
                        bjVar = bjVar3;
                        childCount = i12;
                    }
                    org.telegram.messenger.bj bjVar4 = bjVar;
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
                    num3 = anVar.b9;
                    if (num3 != null && bjVar4 != null) {
                        paint8 = anVar.S8;
                        if (paint8 != null) {
                            matrix4 = anVar.T8;
                            matrix4.reset();
                            float measuredWidth13 = olVar.getMeasuredWidth() / anVar.Q8.getWidth();
                            matrix5 = anVar.T8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = anVar.R8;
                            matrix6 = anVar.T8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = anVar.S8;
                            f19 = anVar.a9;
                            paint11.setAlpha((int) (f19 * 255.0f));
                            float measuredWidth14 = olVar.getMeasuredWidth();
                            float measuredHeight13 = olVar.getMeasuredHeight();
                            paint12 = anVar.S8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = anVar.U8;
                            f17 = anVar.W8;
                            f18 = anVar.Z8;
                            paint9.setAlpha((int) (f18 * f17 * 255.0f));
                            float measuredWidth15 = olVar.getMeasuredWidth();
                            float measuredHeight14 = olVar.getMeasuredHeight();
                            paint10 = anVar.U8;
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
                    num13 = anVar.b9;
                    if (num13 == null) {
                        f60 = anVar.Z8;
                        if (f60 < f16) {
                            paint25 = anVar.S8;
                            if (paint25 != null) {
                                matrix13 = anVar.T8;
                                matrix13.reset();
                                float measuredWidth16 = olVar.getMeasuredWidth() / anVar.Q8.getWidth();
                                matrix14 = anVar.T8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = anVar.R8;
                                matrix15 = anVar.T8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = anVar.S8;
                                f63 = anVar.a9;
                                paint28.setAlpha((int) (f63 * 255.0f));
                                float measuredWidth17 = olVar.getMeasuredWidth();
                                float measuredHeight15 = olVar.getMeasuredHeight();
                                paint29 = anVar.S8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = anVar.U8;
                                f61 = anVar.W8;
                                f62 = anVar.Z8;
                                paint26.setAlpha((int) ((f16 - f62) * f61 * 255.0f));
                                float measuredWidth18 = olVar.getMeasuredWidth();
                                float measuredHeight16 = olVar.getMeasuredHeight();
                                paint27 = anVar.U8;
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
            num13 = anVar.b9;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            olVar = olVar3;
            f14 = 0.0f;
            f15 = 20.0f;
        }
        view3 = anVar.Y8;
        if (view3 != null || ((ArrayList) anVar.ia.c).size() > 0) {
            j90Var = anVar.X1;
            if (j90Var != null) {
                j90Var2 = anVar.X1;
            }
            super.drawChild(canvas3, anVar.y1, SystemClock.uptimeMillis());
            ij ijVar = anVar.m3;
            if (ijVar != null && ijVar.getTag() != null) {
                super.drawChild(canvas3, anVar.m3, SystemClock.uptimeMillis());
            }
            gj gjVar2 = anVar.n3;
            if (gjVar2 != null && gjVar2.getTag() != null) {
                super.drawChild(canvas3, anVar.n3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.nz nzVar = anVar.I9;
            if (nzVar != null) {
                super.drawChild(canvas3, nzVar, SystemClock.uptimeMillis());
            }
            wh.i iVar = anVar.ta;
            if (iVar != null) {
                super.drawChild(canvas3, iVar, SystemClock.uptimeMillis());
            }
            hi.l3 l3Var3 = anVar.t2;
            if (l3Var3 != null) {
                super.drawChild(canvas3, l3Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = anVar.N3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.N3, SystemClock.uptimeMillis());
            }
            mk mkVar = anVar.O3;
            if (mkVar != null && mkVar.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.O3, SystemClock.uptimeMillis());
            }
            hi.l3 l3Var4 = anVar.M1;
            if (l3Var4 != null && l3Var4.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.M1, SystemClock.uptimeMillis());
            }
            zk zkVar = anVar.Q1;
            if (zkVar != null && zkVar.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.Q1, SystemClock.uptimeMillis());
            }
            hi.l3 l3Var5 = anVar.O1;
            if (l3Var5 != null && l3Var5.getVisibility() == 0) {
                super.drawChild(canvas3, anVar.O1, SystemClock.uptimeMillis());
            }
            qj qjVar2 = anVar.a0;
            if (qjVar2 != null && qjVar2.M != null) {
                canvas3.save();
                canvas3.translate(anVar.a0.M.getX() + anVar.a0.getX(), anVar.a0.M.getY() + anVar.a0.getY());
                anVar.a0.M.draw(canvas3);
                canvas3.restore();
            }
        }
        if (anVar.La > 0 && olVar.f < org.telegram.messenger.g0.L(f15)) {
            int themedColor = anVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            if (olVar.n0 == null) {
                olVar.n0 = new Paint();
            }
            if (olVar.o0 != themedColor) {
                Paint paint32 = olVar.n0;
                olVar.o0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, olVar.getMeasuredHeight() - anVar.La, olVar.getMeasuredWidth(), olVar.getMeasuredHeight(), olVar.n0);
            canvas3 = canvas6;
        }
        wo woVar = anVar.la;
        if (woVar != null) {
            if (woVar.T > 0.0f && !woVar.S) {
                int inputBubbleTop = (int) anVar.U.getInputBubbleTop();
                int inputBubbleBottom = (int) anVar.U.getInputBubbleBottom();
                an anVar2 = anVar.pa;
                int i32 = inputBubbleTop - ((int) (anVar.qa * (anVar2 == null ? f14 : anVar2.ka)));
                wo woVar2 = anVar.la;
                olVar.getMeasuredWidth();
                woVar2.b(canvas3, i32, inputBubbleBottom);
            }
        }
        if (anVar.pa != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, olVar.getMeasuredWidth(), olVar.getMeasuredHeight(), (int) (anVar.qa * 255.0f), 31);
            canvas3 = canvas;
            anVar.pa.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        anVar.Ta.e(canvas3);
        if (i17 >= 0) {
            canvas3.restore();
        }
        if (anVar.Ga) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (anVar.Ha * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        lk lkVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (lkVar = this.x0.bb) == null || !lkVar.s) {
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
        boolean z10;
        yj yjVar;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.x0;
        jh.e eVar = anVar.c4;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y10 = (org.telegram.messenger.g0.E || anVar.isInBubbleMode()) ? (anVar.a0.getEmojiView() != null ? anVar.a0.getEmojiView() : anVar.a0).getY() : anVar.a0.getY();
        View view = anVar.Y8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        }
        qj qjVar = anVar.a0;
        if (qjVar == null || !qjVar.h4 || motionEvent.getY() >= y10) {
            anVar.F9 = motionEvent.getY();
            org.telegram.ui.Cells.t9 n10 = anVar.t9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!anVar.t9.x() || !anVar.t9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                hi.i1 i1Var = anVar.F1;
                if (i1Var != null) {
                    if (anVar.J3 != null) {
                        z10 = i1Var.z(motionEvent);
                        if (anVar.F1.I) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !anVar.t9.x() || (motionEvent.getY() >= anVar.A0.getTop() && motionEvent.getY() <= anVar.A0.getBottom())) {
                            yjVar = anVar.Sa;
                            if (!yjVar.n) {
                                return yjVar.g(motionEvent);
                            }
                            ab.q qVar = ab.q.e;
                            if (qVar == null || !qVar.a) {
                                if (anVar.isInPreviewMode() && anVar.fa) {
                                    if (motionEvent.getAction() == 0) {
                                        int i7 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (anVar.y1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                h6.m mVar = anVar.y1.e[i10 == 0 ? 1 : i10 == 1 ? i7 : i11];
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
                                        ui uiVar = anVar.p1;
                                        if (uiVar != null) {
                                            uiVar.getLocationInWindow(iArr2);
                                            Rect rect2 = org.telegram.messenger.g0.Q;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], anVar.p1.getMeasuredWidth() + i13, anVar.p1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.s0 = motionEvent.getX();
                                                    this.t0 = motionEvent.getY();
                                                    this.u0 = SystemClock.elapsedRealtime();
                                                    this.v0 = z12;
                                                    ui uiVar2 = anVar.p1;
                                                    if (uiVar2 != null) {
                                                        uiVar2.i0.c(z12);
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
                                        ui uiVar3 = anVar.p1;
                                        if (uiVar3 != null) {
                                            uiVar3.i0.c(false);
                                        }
                                        if (this.v0 || (a8.t9.a(this.s0, this.t0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.L(6.0f) && SystemClock.elapsedRealtime() - this.u0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.v0) {
                                                o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                                                anVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) o4Var2).S(ProfileActivity.C4(anVar.k6));
                                            } else {
                                                o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                                                ((ActionBarLayout) o4Var).r();
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
                                r4 r4Var = (r4) ab.q.o().d;
                                if (r4Var != null) {
                                    r4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (anVar.t9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n10.getX(), n10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = i1Var.e;
                        if (i1Var.I) {
                            i1Var.J = true;
                            i1Var.I = false;
                            i1Var.D(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                i1Var.D(view2, i1Var.E ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            i1Var.d = 0;
                            i1Var.c = 1.0f;
                            org.telegram.ui.Components.l61 l61Var = i1Var.N;
                            if (l61Var != null) {
                                l61Var.e(1.0f, 0, i1Var.b);
                            }
                            i1Var.u(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                yjVar = anVar.Sa;
                if (!yjVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        an anVar = this.x0;
        org.telegram.ui.Components.v01 v01Var = anVar.n0;
        float progress = (view == v01Var || view == this.M || view == anVar.Z || (view instanceof org.telegram.ui.ActionBar.g5) || v01Var == null) ? 0.0f : v01Var.getProgress() * anVar.n0.getContentWidth();
        if (progress <= 0.0f) {
            return Z(canvas, view, j3);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j3);
        canvas.restore();
        return Z;
    }

    @Override // org.telegram.ui.Components.st0
    public float getBottomOffset() {
        return this.x0.A0.getBottom();
    }

    public an getChatActivity() {
        return this.x0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.x0.getThemedColor(org.telegram.ui.ActionBar.j6.ua);
        ColorDrawable colorDrawable = this.w0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.w0 = new ColorDrawable(themedColor);
        }
        return this.w0;
    }

    @Override // org.telegram.ui.Components.st0
    public int getKeyboardHeight() {
        if (this.x0.lb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.st0
    public float getListTranslationY() {
        return this.x0.A0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.st0
    public Drawable getNewDrawable() {
        an anVar = this.x0;
        if (anVar.S9()) {
            return getCompactBackground();
        }
        Drawable m10 = anVar.Aa.m();
        return m10 != null ? m10 : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.st0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.x0.Aa.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.st0
    public int getScrollOffset() {
        return this.x0.A0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.ActionBar.o4 o4Var3;
        View view;
        super.onAttachedToWindow();
        an anVar = this.x0;
        if (anVar.lb) {
            this.I.b = anVar.m1;
        } else {
            o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
            if (o4Var != null) {
                o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                if (((ActionBarLayout) o4Var2).b) {
                    org.telegram.ui.ActionBar.i1 i1Var = this.I;
                    o4Var3 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                    i1Var.b = (FrameLayout) o4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.I.c();
        anVar.a0.setAdjustPanLayoutHelper(this.I);
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        if (gjVar != null && ((gjVar.h4() || org.telegram.messenger.gj.L4(gjVar.k)) && gjVar.T == 0 && org.telegram.messenger.gj.B0(gjVar.k) == anVar.k6)) {
            MediaController.B().p0(anVar.e8(false), anVar.K8, anVar.I8, true);
        }
        wo woVar = anVar.la;
        if (woVar != null) {
            woVar.G.P();
            org.telegram.ui.Components.g5 g5Var = woVar.l0;
            if (g5Var != null && (view = woVar.b0) != null) {
                g5Var.a(view);
            }
            org.telegram.messenger.ns.f(woVar.f0).c(woVar, org.telegram.messenger.ns.r);
        }
        anVar.Ta.i();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.I.d();
        an anVar = this.x0;
        wo woVar = anVar.la;
        if (woVar != null) {
            org.telegram.messenger.ns.f(woVar.f0).n(woVar, org.telegram.messenger.ns.r);
            woVar.G.R();
            org.telegram.ui.Components.g5 g5Var = woVar.l0;
            if (g5Var != null && (view = woVar.b0) != null) {
                g5Var.n(view);
            }
            woVar.R = 0.0f;
            woVar.Q = 0L;
            anVar.la = null;
        }
        anVar.Ta.j();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.c6(19));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        an anVar;
        hi.n5 n5Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (n5Var = (anVar = this.x0).N2) == null || !n5Var.a() || anVar.N2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        if (r8 != r3.jd) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        an anVar = this.x0;
        vi viVar = anVar.w;
        int i20 = (measuredWidth - anVar.qb) - anVar.rb;
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
                int i23 = i22 & org.telegram.messenger.ns.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    e10 = i5.c.e(i20, measuredWidth2, 2, anVar.qb) + layoutParams.leftMargin;
                    i13 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i14 = anVar.qb + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i17 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
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
                            if (childAt != anVar.ia && childAt != anVar.ta && childAt != anVar.U && !(childAt instanceof org.telegram.ui.Components.b30) && childAt != anVar.n0) {
                                if (childAt instanceof org.telegram.ui.Cells.t9) {
                                    i18 = anVar.Wa;
                                } else if (childAt == anVar.f1) {
                                    kVar3 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                        i19 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    i17 += i19;
                                } else if (anVar.a0.H0(childAt)) {
                                    if (!org.telegram.messenger.g0.E) {
                                        z11 = ((org.telegram.ui.ActionBar.e2) anVar).inBubbleMode;
                                        if (!z11) {
                                            i17 = anVar.a0.getBottom();
                                        }
                                    }
                                    i17 = anVar.a0.getTop() - childAt.getMeasuredHeight();
                                    L = org.telegram.messenger.g0.L(1.0f);
                                    i17 += L;
                                } else {
                                    qj qjVar = anVar.a0;
                                    if (qjVar != null && (childAt == qjVar.w2 || childAt == qjVar.v2)) {
                                        i17 = org.telegram.messenger.i20.w(7.0f, viVar.e(), i17);
                                        i14 -= org.telegram.messenger.g0.L(3.0f);
                                    } else if (childAt == anVar.L2) {
                                        i17 = org.telegram.messenger.i20.w(7.0f, viVar.e(), i17);
                                    } else if (qjVar != null && childAt == qjVar.f1) {
                                        i17 = org.telegram.messenger.i20.w(9.0f, viVar.e(), i17);
                                    } else if (childAt == anVar.A0 || childAt == anVar.y0 || childAt == anVar.m3 || childAt == anVar.n3 || childAt == anVar.o3) {
                                        i18 = anVar.Wa;
                                    } else if (childAt != anVar.R) {
                                        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                        if (childAt == kVar) {
                                            i17 -= getPaddingTop();
                                            if (anVar.isInPreviewMode()) {
                                                L = org.telegram.messenger.g0.L(1.0f);
                                                i17 += L;
                                            }
                                        } else if (childAt == anVar.I8) {
                                            kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                            i17 = kVar2.getMeasuredHeight();
                                        } else if (childAt != anVar.q3 && childAt != anVar.r3 && childAt != anVar.x0) {
                                            if (childAt instanceof org.telegram.ui.Components.ka0) {
                                                i17 = org.telegram.messenger.g0.m;
                                            } else if (childAt != anVar.V) {
                                                if (childAt != anVar.c4) {
                                                }
                                            }
                                        }
                                    } else if (qjVar.N0()) {
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
                    e10 = (measuredWidth - anVar.rb) - measuredWidth2;
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
        gj gjVar = anVar.n3;
        if (gjVar != null) {
            gjVar.setBackgroundHeight(getMeasuredHeight());
        }
        anVar.M9();
        anVar.O9();
        anVar.vd(false, false);
        R();
        anVar.I7();
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
        org.telegram.ui.Components.xb xbVar;
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
        an anVar = this.x0;
        vi viVar = anVar.w;
        int i14 = (size - anVar.qb) - anVar.rb;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
        ui.a aVar = anVar.N.a;
        if (aVar instanceof ui.b) {
            ((ui.b) aVar).b(i14, size2);
        }
        int i15 = 0;
        if (this.i0 != i14) {
            anVar.S4 = false;
            this.i0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
            if (z13 || (user = anVar.f) == null || !user.self) {
                anVar.ga = false;
            } else {
                org.telegram.ui.ActionBar.j5 titleTextView = anVar.p1.getTitleTextView();
                if (i14 - org.telegram.messenger.g0.L(152.0f) > org.telegram.messenger.g0.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    anVar.ga = !anVar.ha;
                } else {
                    anVar.ga = false;
                }
            }
            if (anVar.ga || anVar.ha || org.telegram.messenger.q10.v(anVar.f)) {
                ui uiVar = anVar.p1;
                if (uiVar != null && uiVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) anVar.p1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(anVar.g4 == 3 && ((q0Var = anVar.m0) == null || q0Var.getVisibility() != 0) ? 52.0f : 92.0f);
                }
            } else {
                ui uiVar2 = anVar.p1;
                if (uiVar2 != null && uiVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) anVar.p1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(52.0f);
                }
            }
            if (anVar.ga) {
                kVar8 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (!kVar8.o0 && (q0Var2 = anVar.p0) != null) {
                    q0Var2.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var3 = anVar.j0;
                if (q0Var3 != null) {
                    q0Var3.u(40);
                }
            } else {
                org.telegram.ui.ActionBar.q0 q0Var4 = anVar.j0;
                if (q0Var4 != null) {
                    q0Var4.T(40);
                }
                org.telegram.ui.ActionBar.q0 q0Var5 = anVar.p0;
                if (q0Var5 != null) {
                    q0Var5.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (!kVar7.o0 && (xVar = anVar.q0) != null) {
                xVar.e((!anVar.ha || anVar.ga) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.q0 q0Var6 = anVar.j0;
            if (q0Var6 != null) {
                TLRPC.UserFull userFull = anVar.r8;
                if (anVar.ha) {
                    q0Var6.u(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    q0Var6.T(32);
                }
            }
            anVar.S4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + anVar.Ka >= org.telegram.messenger.g0.L(20.0f);
        if (this.h0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (anVar.La > 0 && keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            anVar.Ka = anVar.La;
        } else if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            anVar.Ka = anVar.a0.G0() ? anVar.a0.getEmojiPadding() : 0;
        } else {
            anVar.Ka = 0;
        }
        setEmojiKeyboardHeight(anVar.Ka);
        boolean z15 = this.f + anVar.Ka >= org.telegram.messenger.g0.L(20.0f);
        if (MediaController.B().v0 != null && MediaController.B().v0.h4() && z14 != z15) {
            for (int i16 = 0; i16 < anVar.A0.getChildCount(); i16++) {
                View childAt = anVar.A0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    if (messageObject.h4() && MediaController.B().I(messageObject)) {
                        anVar.A0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            anVar.C0.i1(R, (int) (((((anVar.A0.getMeasuredHeight() - anVar.O9) - anVar.Xa) + ((this.f + anVar.Ka) - r1)) - (z15 ? org.telegram.messenger.g0.u : org.telegram.messenger.g0.g3(anVar.ba(), anVar.S9()))) / 2.0f), false);
                            anVar.D0.g(R);
                            this.I.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(anVar.a0, makeMeasureSpec, 0, i10, 0);
                            z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
                            if (!z10 || anVar.lb) {
                                this.g0 = 0;
                            } else {
                                this.g0 = anVar.a0.getMeasuredHeight();
                            }
                            anVar.Wa = 0;
                            anVar.Xa = 0;
                            if (org.telegram.messenger.gz.f() && !anVar.lb && anVar.H != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = anVar.I;
                                anVar.Wa = i18;
                                anVar.Xa = i18;
                            }
                            i11 = 0;
                            while (i11 < childCount) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i11);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != anVar.a0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                        if (childAt2 != kVar4) {
                                            if (a0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == anVar.A0 || childAt2 == anVar.y0 || (childAt2 instanceof org.telegram.ui.Cells.t9)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), anVar.Wa + size2 + anVar.Xa), TLObject.FLAG_30));
                                                } else if (childAt2 == anVar.R) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int L = org.telegram.messenger.g0.L(10.0f);
                                                    int i20 = i17 - this.g0;
                                                    z12 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, org.telegram.messenger.g0.L((anVar.a0.N0() ? 48 : i15) + 2) + (i20 - (z12 ? org.telegram.messenger.g0.m : i15))), TLObject.FLAG_30));
                                                } else if (childAt2 == anVar.q3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    anVar.q3.setInternalPadding(org.telegram.messenger.g0.L(12.0f) + viVar.e() + ((int) anVar.ad));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == anVar.r3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - viVar.e()) - ((int) anVar.ad)) - org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == anVar.f1) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                                } else if (anVar.a0.H0(childAt2)) {
                                                    org.telegram.ui.Components.pf pfVar = anVar.a0.p2;
                                                    if (childAt2 == pfVar && pfVar != null) {
                                                        i19 = pfVar.getKeyboardHeight();
                                                    }
                                                    z11 = ((org.telegram.ui.ActionBar.e2) anVar).inBubbleMode;
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
                                                    jj jjVar = anVar.X1;
                                                    if (childAt2 == jjVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jjVar.getLayoutParams();
                                                        jg.h1 adapter = anVar.X1.getAdapter();
                                                        if (adapter.x0 == null || adapter.i0) {
                                                            anVar.X1.setIgnoreLayout(true);
                                                            layoutParams.height = i17;
                                                            layoutParams.topMargin = 0;
                                                            anVar.X1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == anVar.t9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                        int i21 = i17 + anVar.Wa;
                                                        if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f) || getLayoutParams().height >= 0 || anVar.lb) {
                                                            pl plVar = anVar.t9;
                                                            plVar.d0 = 0;
                                                            plVar.w();
                                                        } else {
                                                            i21 += keyboardHeight;
                                                            pl plVar2 = anVar.t9;
                                                            plVar2.d0 = keyboardHeight;
                                                            plVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.ka0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n, TLObject.FLAG_30));
                                                    } else if (childAt2 == anVar.g2) {
                                                        kVar5 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                                        if (kVar5.getVisibility() == 0) {
                                                            kVar6 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
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
                            if (anVar.R4) {
                                anVar.S4 = true;
                                anVar.M9();
                                anVar.O9();
                                anVar.R4 = false;
                                aj ajVar = anVar.A0;
                                ajVar.measure(View.MeasureSpec.makeMeasureSpec(ajVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(anVar.A0.getMeasuredHeight(), TLObject.FLAG_30));
                                anVar.S4 = false;
                            }
                            i12 = anVar.M4;
                            if (i12 != -1) {
                                org.telegram.messenger.g0.h3(new ai.w0(this, i12, 28));
                                anVar.M4 = -1;
                            }
                            xbVar = org.telegram.ui.Components.xb.w;
                            if (xbVar != null && anVar.Dc != null) {
                                xbVar.l();
                            }
                            anVar.h7();
                            this.h0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.ke keVar = anVar.a0.G4;
        org.telegram.messenger.g0.r(keVar);
        keVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(anVar.a0, makeMeasureSpec, 0, i10, 0);
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        if (z10) {
        }
        this.g0 = 0;
        anVar.Wa = 0;
        anVar.Xa = 0;
        if (org.telegram.messenger.gz.f()) {
            int i182 = anVar.I;
            anVar.Wa = i182;
            anVar.Xa = i182;
        }
        i11 = 0;
        while (i11 < childCount) {
        }
        if (anVar.R4) {
        }
        i12 = anVar.M4;
        if (i12 != -1) {
        }
        xbVar = org.telegram.ui.Components.xb.w;
        if (xbVar != null) {
            xbVar.l();
        }
        anVar.h7();
        this.h0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        an anVar = this.x0;
        ih.d.c(anVar.O8, anVar.fragmentView);
        anVar.P8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x0.S4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        an anVar = this.x0;
        anVar.R9 = i10;
        anVar.M9();
        anVar.O9();
    }

    @Override // org.telegram.ui.Components.st0
    public final void K() {
    }

    @Override // org.telegram.ui.Components.st0
    public final void V() {
    }

    @Override // org.telegram.ui.Components.st0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
