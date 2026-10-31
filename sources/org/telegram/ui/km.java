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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.Components.uu0 {
    public int f0;
    public int g0;
    public int h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public Paint m0;
    public int n0;
    public final im o0;
    public final im p0;
    public final RectF q0;
    public float r0;
    public float s0;
    public long t0;
    public boolean u0;
    public ColorDrawable v0;
    public final /* synthetic */ un w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.im] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.im] */
    public km(un unVar, Context context, org.telegram.ui.ActionBar.z4 z4Var) {
        super(context, z4Var);
        this.w0 = unVar;
        this.f0 = 0;
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        final int i10 = 0;
        this.o0 = new ug.a(this) { // from class: org.telegram.ui.im
            public final /* synthetic */ km b;

            {
                this.b = this;
            }

            @Override // ug.a
            public final void d(Canvas canvas, RectF rectF) {
                switch (i10) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        un unVar2 = this.b.w0;
                        if (unVar2.z0.Y0()) {
                            unVar2.z0.d(canvas, rectF);
                            break;
                        } else {
                            unVar2.z0.z1(canvas, rectF);
                            for (int i11 = 0; i11 < unVar2.z0.getChildCount(); i11++) {
                                View childAt = unVar2.z0.getChildAt(i11);
                                if (!un.k2(unVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                        if (q1Var.J0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, q1Var.V);
                                            q1Var.K0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        unVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.h2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.g1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                                        unVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.s0) childAt).I(canvas);
                                        canvas.restore();
                                    } else {
                                        unVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            unVar2.z0.A1(canvas, rectF);
                            break;
                        }
                    default:
                        km kmVar = this.b;
                        un unVar3 = kmVar.w0;
                        RectF rectF2 = kmVar.q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, kmVar.getWidth(), kmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = unVar3.Uc.e;
                            int i12 = (int) ((1.0f - f7) * 255.0f);
                            int i13 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.t6.n0(org.telegram.ui.ActionBar.t6.r1(f7 * 0.85f, unVar3.getThemedColor(org.telegram.ui.ActionBar.t6.d6))));
                            }
                            yg.d.b(kmVar.o0, canvas, rectF, unVar3.z0, kmVar, i12);
                            ag.b1 b1Var = unVar3.Z3;
                            if (b1Var != null) {
                                yg.d.b(b1Var, canvas, rectF, b1Var, kmVar, i13);
                            }
                            hk hkVar = unVar3.E1;
                            if (hkVar != null && hkVar.getVisibility() == 0) {
                                int childCount = unVar3.E1.getChildCount();
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt2 = unVar3.E1.getChildAt(i14);
                                    if ((childAt2 instanceof wn) && childAt2.getVisibility() == 0) {
                                        km kmVar2 = ((wn) childAt2).a.l1;
                                        yg.d.a(kmVar2.p0, canvas, rectF, kmVar2, kmVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // ug.a
            public final void g(g.y yVar, RectF rectF) {
                switch (i10) {
                }
                yVar.b = true;
            }
        };
        final int i11 = 1;
        this.p0 = new ug.a(this) { // from class: org.telegram.ui.im
            public final /* synthetic */ km b;

            {
                this.b = this;
            }

            @Override // ug.a
            public final void d(Canvas canvas, RectF rectF) {
                switch (i11) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        un unVar2 = this.b.w0;
                        if (unVar2.z0.Y0()) {
                            unVar2.z0.d(canvas, rectF);
                            break;
                        } else {
                            unVar2.z0.z1(canvas, rectF);
                            for (int i112 = 0; i112 < unVar2.z0.getChildCount(); i112++) {
                                View childAt = unVar2.z0.getChildAt(i112);
                                if (!un.k2(unVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                        if (q1Var.J0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, q1Var.V);
                                            q1Var.K0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        unVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.h2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.g1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                                        unVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.s0) childAt).I(canvas);
                                        canvas.restore();
                                    } else {
                                        unVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            unVar2.z0.A1(canvas, rectF);
                            break;
                        }
                    default:
                        km kmVar = this.b;
                        un unVar3 = kmVar.w0;
                        RectF rectF2 = kmVar.q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, kmVar.getWidth(), kmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = unVar3.Uc.e;
                            int i12 = (int) ((1.0f - f7) * 255.0f);
                            int i13 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.t6.n0(org.telegram.ui.ActionBar.t6.r1(f7 * 0.85f, unVar3.getThemedColor(org.telegram.ui.ActionBar.t6.d6))));
                            }
                            yg.d.b(kmVar.o0, canvas, rectF, unVar3.z0, kmVar, i12);
                            ag.b1 b1Var = unVar3.Z3;
                            if (b1Var != null) {
                                yg.d.b(b1Var, canvas, rectF, b1Var, kmVar, i13);
                            }
                            hk hkVar = unVar3.E1;
                            if (hkVar != null && hkVar.getVisibility() == 0) {
                                int childCount = unVar3.E1.getChildCount();
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt2 = unVar3.E1.getChildAt(i14);
                                    if ((childAt2 instanceof wn) && childAt2.getVisibility() == 0) {
                                        km kmVar2 = ((wn) childAt2).a.l1;
                                        yg.d.a(kmVar2.p0, canvas, rectF, kmVar2, kmVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // ug.a
            public final void g(g.y yVar, RectF rectF) {
                switch (i11) {
                }
                yVar.b = true;
            }
        };
        this.q0 = new RectF();
        this.H = new jm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.l lVar;
        un unVar = this.w0;
        unVar.l1.setTranslationY(f7);
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        lVar.setTranslationY(0.0f);
        dl dlVar = unVar.wb;
        if (dlVar != null) {
            dlVar.setTranslationY(unVar.C1 != null ? r3.getCurrentHeight() : 0);
        }
        vh.p2 p2Var = unVar.K1;
        if (p2Var != null) {
            p2Var.setTranslationY(0.0f);
        }
        vh.p2 p2Var2 = unVar.J1;
        if (p2Var2 != null) {
            p2Var2.setTranslationY(0.0f);
        }
        unVar.e1.setTranslationY(0.0f);
        unVar.Q.setTranslationY(0.0f);
        unVar.P9 = 0.0f;
        unVar.Q9 = 0.0f;
        unVar.l1.setBackgroundTranslation(0);
        org.telegram.ui.Components.j50 j50Var = unVar.p3;
        if (j50Var != null) {
            j50Var.f(0.0f);
        }
        kg.f0 f0Var = unVar.M2;
        if (f0Var != null) {
            org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) f0Var.b;
            q9Var.u = 0.0f;
            q9Var.d.invalidate();
        }
        unVar.setFragmentPanTranslationOffset(0);
        unVar.A9();
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.uu0
    public final int Q() {
        ag.v vVar = this.w0.X1;
        if (vVar == null || !vVar.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.uu0
    public final void T(Drawable drawable) {
        un unVar = this.w0;
        zg.i iVar = unVar.X;
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            ((org.telegram.ui.Components.jb0) drawable).p();
        }
        hi.a c10 = iVar.c(drawable);
        float B = org.telegram.messenger.i0.B(iVar.b(c10));
        float B2 = org.telegram.messenger.i0.B(iVar.a(c10));
        unVar.Yb = B <= 0.721f;
        unVar.Zb = B2 <= 0.9f;
        unVar.M.a = c10;
        hi.f fVar = unVar.I;
        if (fVar != null) {
            Iterator it = fVar.w.iterator();
            while (it.hasNext()) {
                vg.d dVar = ((vg.f) it.next()).b0;
                if (dVar != null) {
                    dVar.h = true;
                }
            }
        }
        hi.f fVar2 = unVar.J;
        if (fVar2 != null) {
            Iterator it2 = fVar2.w.iterator();
            while (it2.hasNext()) {
                vg.d dVar2 = ((vg.f) it2.next()).b0;
                if (dVar2 != null) {
                    dVar2.h = true;
                }
            }
        }
        bh.i iVar2 = unVar.Y;
        if (iVar2 != null) {
            iVar2.setOverlayColor(unVar.G9() ? unVar.getThemedColor(org.telegram.ui.ActionBar.t6.va) : 0);
            unVar.Y.invalidate();
        }
        zg.e eVar = unVar.T;
        if (eVar != null) {
            eVar.invalidate();
        }
        unVar.l1.invalidate();
        Iterator it3 = unVar.E.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        unVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        int save = canvas.save();
        un unVar = this.w0;
        float x10 = q1Var.getX() + unVar.z0.getLeft();
        float y3 = q1Var.getY() + unVar.z0.getY() + q1Var.getPaddingTop();
        float alpha = q1Var.a() ? q1Var.getAlpha() : 1.0f;
        canvas.clipRect(unVar.z0.getLeft(), f7, unVar.z0.getRight(), ((((unVar.z0.getY() + unVar.z0.getMeasuredHeight()) - unVar.Ua) - unVar.w.e()) - unVar.Oc) - org.telegram.messenger.i0.L(9.0f));
        canvas.translate(x10, y3);
        q1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            q1Var.v1(alpha, canvas, true);
        } else if (i10 == 1) {
            q1Var.f1(canvas, alpha);
        } else if (i10 == 2) {
            q1Var.O0(alpha, canvas, q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0;
            q1Var.T0(canvas, alpha);
            if (!z10) {
                q1Var.m1(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().l) != 0) && unVar.a9 != null)) {
            float f10 = (unVar.V8 * unVar.Y8) / 0.2f;
            canvas.save();
            q1Var.q1(canvas, unVar.a9, f10, unVar.W8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            q1Var.r1(this, canvas, unVar.b9, unVar.a9, f10);
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
    public final boolean Z(Canvas canvas, View view, long j10) {
        kg.f0 f0Var;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.messenger.jj jjVar;
        boolean z10;
        boolean z11;
        pk pkVar;
        org.telegram.messenger.jj jjVar2;
        org.telegram.ui.Components.j50 j50Var;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        un unVar = this.w0;
        boolean z12 = false;
        if ((unVar.X8 == null && ((ArrayList) unVar.fa.c).size() <= 0) || (view != unVar.x1 && view != unVar.l3 && view != unVar.m3 && view != unVar.F9 && view != unVar.qa && view != unVar.s2 && view != null && view != unVar.M3 && view != unVar.N3)) {
            if ((view != unVar.M3 || !PhotoViewer.v1().U1()) && (!unVar.la || view != unVar.z0)) {
                if (unVar.Da) {
                    lVar3 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                }
                if (view != unVar.p3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (f0Var = unVar.M2) != null && f0Var.a() && unVar.M2.getTag() != null) {
                            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                            if (view != lVar) {
                            }
                        }
                        jjVar = MediaController.B().u0;
                        if (jjVar == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == unVar.H8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    } else {
                        if (view != unVar.z0) {
                            if (view != unVar.T) {
                            }
                        }
                        jjVar = MediaController.B().u0;
                        if (jjVar == null && jjVar.T == 0) {
                            z10 = jjVar.h4();
                            if (z10 || org.telegram.messenger.jj.L4(jjVar.k)) {
                                z11 = true;
                                if (view == unVar.H8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-unVar.ga) - (unVar.na != 0.0f ? (unVar.z0.getMeasuredHeight() - unVar.ga) * unVar.na : 0.0f));
                                    if (jjVar != null && jjVar.D == 5) {
                                        if (org.telegram.ui.ActionBar.t6.k3 != null && unVar.J8.d) {
                                            int x10 = ((int) view.getX()) - org.telegram.messenger.i0.L(3.0f);
                                            int y3 = ((int) view.getY()) - org.telegram.messenger.i0.L(2.0f);
                                            canvas.save();
                                            canvas.scale(unVar.H8.getScaleX(), unVar.H8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.t6.k3.setAlpha(org.telegram.messenger.zs.e4);
                                            org.telegram.ui.ActionBar.t6.k3.setBounds(x10, y3, org.telegram.messenger.i0.L(6.0f) + org.telegram.messenger.i0.f3(unVar.P9(), unVar.G9()) + x10, org.telegram.messenger.i0.L(6.0f) + org.telegram.messenger.i0.f3(unVar.P9(), unVar.G9()) + y3);
                                            org.telegram.ui.ActionBar.t6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z12 = super.drawChild(canvas, view, j10);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-org.telegram.messenger.i0.L(1000.0f));
                                        z12 = super.drawChild(canvas, view, j10);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z12;
                                }
                                if (view == unVar.T && (j50Var = unVar.p3) != null && j50Var.getVisibility() == 0) {
                                    super.drawChild(canvas, unVar.p3, j10);
                                }
                                z12 = super.drawChild(canvas, view, j10);
                                if (z11 && view == unVar.z0 && jjVar.D != 5 && (pkVar = unVar.H8) != null && pkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-unVar.ga) - (unVar.na != 0.0f ? (unVar.z0.getMeasuredHeight() - unVar.ga) * unVar.na : 0.0f)) + unVar.ha);
                                    super.drawChild(canvas, unVar.H8, j10);
                                    if (unVar.I8 != null) {
                                        canvas.save();
                                        canvas.translate(unVar.I8.getX(), unVar.z0.getY() + unVar.I8.getTop());
                                        if (z10) {
                                            unVar.I8.p1(canvas);
                                            invalidate();
                                            unVar.I8.invalidate();
                                        } else {
                                            unVar.I8.h1(canvas);
                                            org.telegram.ui.Cells.q1 q1Var = unVar.I8;
                                            if (!q1Var.E9 && ((jjVar2 = q1Var.O5) == null || jjVar2.D != 27)) {
                                                q1Var.v1(q1Var.getAlpha(), canvas, true);
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
                        if (view == unVar.H8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    public final boolean a0(View view) {
        if (view == this.L) {
            return true;
        }
        un unVar = this.w0;
        return view == unVar.M2 || view == unVar.E1 || view == unVar.F9 || view == unVar.Y || view == unVar.Y3 || (view instanceof org.telegram.ui.ActionBar.s5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.wf wfVar;
        un unVar = this.w0;
        mk mkVar = unVar.Z;
        if (mkVar == null || view != mkVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            bh.i iVar = unVar.Y;
            int indexOfChild = iVar != null ? indexOfChild(iVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        mk mkVar2 = unVar.Z;
        if (mkVar2 != null && view == mkVar2.m0) {
            xh.s sVar = (xh.s) view;
            sVar.setBackgroundDrawable(unVar.K.c(sVar.c, unVar.D, false));
        }
        mk mkVar3 = unVar.Z;
        if (mkVar3 == null || view != (wfVar = mkVar3.O1)) {
            return;
        }
        wfVar.setBlurredBackgroundFactory(unVar.K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0c44, code lost:
    
        if (r0.getVisibility() != 0) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x07a4, code lost:
    
        if ((r5 & 1) != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0b99  */
    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        float f7;
        float f10;
        int i11;
        Integer num;
        Paint paint;
        Paint paint2;
        float f11;
        View view;
        Paint paint3;
        Paint paint4;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Paint paint5;
        float f12;
        Paint paint6;
        Paint paint7;
        Integer num2;
        View view2;
        Canvas canvas3;
        km kmVar;
        float f13;
        float f14;
        View view3;
        org.telegram.ui.Components.y90 y90Var;
        org.telegram.ui.Components.y90 y90Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        View view4;
        View view5;
        om omVar;
        View view6;
        org.telegram.messenger.ej ejVar;
        om omVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f15;
        int i12;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f16;
        float f17;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        float f18;
        Paint paint12;
        om omVar3;
        org.telegram.ui.Cells.s0 s0Var;
        org.telegram.messenger.ej ejVar2;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.bj bjVar;
        View view7;
        org.telegram.messenger.ej ejVar3;
        View view8;
        int i13;
        int i14;
        ArrayList arrayList5;
        org.telegram.ui.Cells.q1 q1Var2;
        ArrayList arrayList6;
        pj pjVar;
        Integer num4;
        float f19;
        float f20;
        boolean z10;
        om omVar4;
        om omVar5;
        org.telegram.ui.Components.y90 y90Var3;
        float f21;
        float f22;
        mk mkVar;
        om omVar6;
        om omVar7;
        om omVar8;
        om omVar9;
        float f23;
        float f24;
        Canvas canvas4;
        float f25;
        float f26;
        View view9;
        float f27;
        float f28;
        float f29;
        org.telegram.messenger.bj bjVar2;
        Integer num5;
        float f30;
        int i15;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.s0 s0Var2;
        Paint paint14;
        float f31;
        float f32;
        Paint paint15;
        float f33;
        float f34;
        float f35;
        float f36;
        om omVar10;
        om omVar11;
        Integer num7;
        om omVar12;
        om omVar13;
        Integer num8;
        km kmVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        float f37;
        Paint paint17;
        Paint paint18;
        float f38;
        float f39;
        View view10;
        int i16;
        Paint paint19;
        float f40;
        float f41;
        Paint paint20;
        float f42;
        float f43;
        float f44;
        Canvas canvas5;
        float f45;
        float f46;
        float f47;
        om omVar14;
        om omVar15;
        Integer num9;
        om omVar16;
        om omVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        float f48;
        Paint paint22;
        float f49;
        Integer num11;
        om omVar18;
        om omVar19;
        float f50;
        Integer num12;
        org.telegram.ui.Components.qe qeVar;
        org.telegram.ui.Components.y90 y90Var4;
        org.telegram.ui.Components.y90 y90Var5;
        om omVar20;
        float f51;
        org.telegram.ui.Cells.q1 q1Var3;
        boolean z11;
        org.telegram.ui.Components.y90 y90Var6;
        float f52;
        org.telegram.ui.Components.y90 y90Var7;
        float f53;
        om omVar21;
        org.telegram.ui.Components.y90 y90Var8;
        org.telegram.ui.Components.y90 y90Var9;
        om omVar22;
        View view11;
        float f54;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.l lVar6;
        View view15;
        float f55;
        Paint paint23;
        float f56;
        float f57;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f58;
        Integer num13;
        float f59;
        Paint paint25;
        Paint paint26;
        float f60;
        float f61;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        float f62;
        Paint paint29;
        float f63;
        Paint paint30;
        float f64;
        float f65;
        Paint paint31;
        View view24;
        float f66;
        float f67;
        org.telegram.ui.ActionBar.l lVar7;
        int i17;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.l lVar9;
        boolean z12;
        org.telegram.ui.ActionBar.l lVar10;
        org.telegram.ui.Components.q30 q30Var;
        View view25;
        ij ijVar;
        View view26;
        xj xjVar;
        km kmVar3 = this;
        un unVar = kmVar3.w0;
        pj pjVar2 = unVar.w;
        ArrayList arrayList7 = unVar.D6;
        unVar.Z.S1();
        unVar.Dc();
        if (unVar.Ka || ((xjVar = unVar.A0) != null && xjVar.k())) {
            unVar.Ka = false;
            unVar.Oc();
        }
        unVar.hd(false, false);
        unVar.Qc();
        ij ijVar2 = unVar.u2;
        if (ijVar2 != null && ijVar2.getTag() != null && (view26 = (ijVar = unVar.u2).e) != null) {
            ijVar.g(view26);
        }
        org.telegram.ui.Components.q30 q30Var2 = unVar.w2;
        if (q30Var2 != null && q30Var2.getTag() != null && (view25 = (q30Var = unVar.w2).e) != null) {
            q30Var.g(view25);
        }
        float f68 = 0.2f;
        float f69 = 2.0f;
        if (unVar.Da) {
            lVar10 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            canvas2 = canvas;
            i10 = canvas2.saveLayerAlpha(0.0f, lVar10.getBottom(), kmVar3.getMeasuredWidth(), kmVar3.getMeasuredHeight(), (int) (unVar.Ea * 255.0f), 31);
            float f70 = (unVar.Ea * 0.2f) + 0.8f;
            canvas2.scale(f70, f70, kmVar3.getMeasuredWidth() / 2.0f, kmVar3.getMeasuredHeight() / 2.0f);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        int i18 = i10;
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        int i19 = 0;
        while (true) {
            f7 = 1.0f;
            f10 = 0.0f;
            i11 = 1;
            if (i19 >= size) {
                break;
            }
            org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList7.get(i19);
            org.telegram.messenger.fj fjVar = q1Var4.getMessageObject().L1;
            if (fjVar != null) {
                canvas2.save();
                lVar7 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (lVar7.getVisibility() == 0) {
                    lVar8 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    int translationY = (int) lVar8.getTranslationY();
                    lVar9 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    int measuredHeight = lVar9.getMeasuredHeight() + translationY;
                    wk wkVar = unVar.C1;
                    int currentHeight = measuredHeight + (wkVar != null ? wkVar.getCurrentHeight() : 0);
                    kk kkVar = unVar.D1;
                    int currentHeight2 = currentHeight + (kkVar != null ? kkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
                    i17 = currentHeight2 + (z12 ? org.telegram.messenger.i0.m : 0);
                } else {
                    i17 = 0;
                }
                f66 = f69;
                f67 = f68;
                canvas2.clipRect(0.0f, i17 + unVar.M9, kmVar3.getWidth(), kmVar3.getHeight());
                ImageReceiver photoImage = q1Var4.getPhotoImage();
                q1Var4.getLocationInWindow(org.telegram.messenger.i0.R);
                int topViewEnterProgress = (int) ((unVar.Z.getTopViewEnterProgress() * org.telegram.messenger.i0.L(48.0f)) + ((int) sc.e.z(1.0f, fjVar.g, q1Var4.getTranslationY(), r9[1])));
                if (fjVar.h) {
                    canvas2.translate(fjVar.e, org.telegram.messenger.i0.T1(fjVar.b, topViewEnterProgress, fjVar.g));
                } else {
                    canvas2.translate(fjVar.e, org.telegram.messenger.i0.T1(fjVar.b, photoImage.s() + topViewEnterProgress, fjVar.g));
                }
                float f71 = fjVar.d;
                canvas2.scale(f71, f71);
                if (!fjVar.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                q1Var4.setTimeAlpha(fjVar.f);
                q1Var4.draw(canvas2);
                canvas2.restore();
            } else {
                f66 = f69;
                f67 = f68;
            }
            i19++;
            f69 = f66;
            f68 = f67;
        }
        float f72 = f69;
        float f73 = f68;
        num = unVar.a9;
        if (num != null) {
            view24 = unVar.X8;
        }
        paint = unVar.R8;
        if (paint != null) {
            matrix = unVar.S8;
            matrix.reset();
            float measuredWidth = kmVar3.getMeasuredWidth() / unVar.P8.getWidth();
            matrix2 = unVar.S8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = unVar.Q8;
            matrix3 = unVar.S8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = unVar.R8;
            f12 = unVar.Z8;
            paint5.setAlpha((int) (f12 * 255.0f));
            paint6 = unVar.R8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = kmVar3.getMeasuredWidth();
                float measuredHeight2 = kmVar3.getMeasuredHeight();
                paint7 = unVar.R8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = unVar.T8;
            f11 = unVar.V8;
            float f74 = f11 * 255.0f;
            view = unVar.X8;
            paint2.setAlpha((int) (f74 * (view != null ? unVar.Y8 : 1.0f)));
            paint3 = unVar.T8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = kmVar3.getMeasuredWidth();
                float measuredHeight3 = kmVar3.getMeasuredHeight();
                paint4 = unVar.T8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = unVar.a9;
        if (num2 != null && unVar.c9) {
            kmVar3.invalidate();
        }
        view2 = unVar.X8;
        if (view2 != null) {
            view4 = unVar.X8;
            if (view4 == unVar.x1) {
                f63 = unVar.Y8;
                if (f63 < 1.0f) {
                    paint30 = unVar.T8;
                    f64 = unVar.V8;
                    f65 = unVar.Y8;
                    paint30.setAlpha((int) ((1.0f - f65) * f64 * 255.0f));
                    float measuredWidth4 = kmVar3.getMeasuredWidth();
                    float measuredHeight4 = kmVar3.getMeasuredHeight();
                    paint31 = unVar.T8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = unVar.X8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f54 = unVar.Y8;
                    if (f54 < 1.0f) {
                        view20 = unVar.X8;
                        float left = view20.getLeft();
                        view21 = unVar.X8;
                        float top = view21.getTop();
                        view22 = unVar.X8;
                        float right = view22.getRight();
                        view23 = unVar.X8;
                        float bottom = view23.getBottom();
                        f58 = unVar.Y8;
                        int i20 = (int) (f58 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i20, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = unVar.X8;
                    float left2 = view12.getLeft();
                    view13 = unVar.X8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = unVar.X8;
                    lVar6 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    if (view14 == lVar6.getBackButton()) {
                        view16 = unVar.X8;
                        float x10 = view16.getX();
                        view17 = unVar.X8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = unVar.X8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f72;
                        view19 = unVar.X8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f72;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, unVar.U8);
                    }
                    view15 = unVar.X8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f55 = unVar.Y8;
                    if (f55 < 1.0f) {
                        paint23 = unVar.T8;
                        f56 = unVar.V8;
                        f57 = unVar.Y8;
                        paint23.setAlpha((int) ((1.0f - f57) * f56 * 255.0f));
                        float measuredWidth6 = kmVar3.getMeasuredWidth();
                        float measuredHeight6 = kmVar3.getMeasuredHeight();
                        paint24 = unVar.T8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    omVar = unVar.z0;
                    float y3 = ((omVar.getY() + unVar.L9) - unVar.N9) - org.telegram.messenger.i0.L(4.0f);
                    view6 = unVar.X8;
                    if (view6 instanceof org.telegram.ui.Cells.q1) {
                        view11 = unVar.X8;
                        ejVar = ((org.telegram.ui.Cells.q1) view11).getCurrentMessagesGroup();
                    } else {
                        ejVar = null;
                    }
                    omVar2 = unVar.z0;
                    int childCount = omVar2.getChildCount();
                    int i21 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = kmVar3.k0;
                        f14 = 20.0f;
                        arrayList2 = kmVar3.j0;
                        arrayList3 = kmVar3.i0;
                        f13 = f10;
                        arrayList4 = kmVar3.l0;
                        if (i21 >= childCount) {
                            break;
                        }
                        omVar3 = unVar.z0;
                        View childAt = omVar3.getChildAt(i21);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            q1Var = (org.telegram.ui.Cells.q1) childAt;
                            ejVar2 = q1Var.getCurrentMessagesGroup();
                            bjVar = q1Var.getCurrentPosition();
                            s0Var = null;
                        } else {
                            s0Var = childAt instanceof org.telegram.ui.Cells.s0 ? (org.telegram.ui.Cells.s0) childAt : null;
                            ejVar2 = null;
                            q1Var = null;
                            bjVar = null;
                        }
                        float f75 = y3;
                        view7 = unVar.X8;
                        if ((childAt == view7 || (ejVar != null && ejVar == ejVar2)) && childAt.getAlpha() != f13) {
                            if (z13 || q1Var == null || ejVar == null) {
                                ejVar3 = ejVar;
                                view8 = childAt;
                                i13 = childCount;
                                i14 = i21;
                                arrayList5 = arrayList;
                                q1Var2 = q1Var;
                                arrayList6 = arrayList4;
                                pjVar = pjVar2;
                                num4 = null;
                                f19 = 1.0f;
                                f20 = 9.0f;
                            } else {
                                ArrayList arrayList8 = ejVar.d;
                                f20 = 9.0f;
                                org.telegram.messenger.dj djVar = ejVar.m;
                                ejVar3 = ejVar;
                                org.telegram.ui.Cells.q1 q1Var5 = djVar.m;
                                view8 = childAt;
                                if (q1Var5 != null) {
                                    float P1 = q1Var5.P1(true);
                                    float f76 = djVar.a + P1 + djVar.e;
                                    float f77 = djVar.b + djVar.f;
                                    float f78 = djVar.c + P1 + djVar.g;
                                    float f79 = f77;
                                    float f80 = djVar.d + djVar.h;
                                    if (!djVar.j) {
                                        f79 = djVar.m.getTranslationY() + f79;
                                        f80 = djVar.m.getTranslationY() + f80;
                                    }
                                    float L = f79 < (unVar.L9 - ((float) unVar.N9)) - ((float) org.telegram.messenger.i0.L(20.0f)) ? (unVar.L9 - unVar.N9) - org.telegram.messenger.i0.L(20.0f) : f79;
                                    omVar20 = unVar.z0;
                                    i13 = childCount;
                                    if (f80 > org.telegram.messenger.i0.L(20.0f) + omVar20.getMeasuredHeight()) {
                                        omVar22 = unVar.z0;
                                        f51 = org.telegram.messenger.i0.L(20.0f) + omVar22.getMeasuredHeight();
                                    } else {
                                        f51 = f80;
                                    }
                                    i14 = i21;
                                    int size2 = arrayList8.size();
                                    arrayList5 = arrayList;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= size2) {
                                            q1Var3 = q1Var;
                                            z11 = true;
                                            break;
                                        }
                                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList8.get(i22);
                                        ArrayList arrayList9 = arrayList8;
                                        int i23 = i22;
                                        if (unVar.m6[jjVar.A0() == unVar.j6 ? (char) 0 : (char) 1].indexOfKey(jjVar.f1()) < 0) {
                                            q1Var3 = q1Var;
                                            z11 = false;
                                            break;
                                        } else {
                                            i22 = i23 + 1;
                                            arrayList8 = arrayList9;
                                        }
                                    }
                                    canvas3.save();
                                    float measuredHeight7 = ((getMeasuredHeight() - pjVar2.e()) - unVar.Oc) - org.telegram.messenger.i0.L(9.0f);
                                    y90Var6 = unVar.W1;
                                    if (y90Var6 != null) {
                                        y90Var9 = unVar.W1;
                                        f52 = y90Var9.d();
                                    } else {
                                        f52 = f13;
                                    }
                                    float f81 = measuredHeight7 - f52;
                                    y90Var7 = unVar.W1;
                                    if (y90Var7 != null) {
                                        y90Var8 = unVar.W1;
                                        f53 = y90Var8.e();
                                    } else {
                                        f53 = f13;
                                    }
                                    org.telegram.ui.Cells.q1 q1Var6 = q1Var3;
                                    canvas3.clipRect(f13, f75 + f53, getMeasuredWidth(), f81);
                                    omVar21 = unVar.z0;
                                    canvas3.translate(f13, omVar21.getY());
                                    boolean z14 = djVar.k;
                                    boolean z15 = djVar.l;
                                    arrayList6 = arrayList4;
                                    pjVar = pjVar2;
                                    q1Var2 = q1Var6;
                                    num4 = null;
                                    f19 = 1.0f;
                                    djVar.m.I0(canvas, (int) f76, (int) L, (int) f78, (int) f51, z14, z15, z11, 0);
                                    canvas.restore();
                                    z10 = true;
                                    if (q1Var2 != null && q1Var2.getPhotoImage().M()) {
                                        invalidate();
                                    }
                                    omVar4 = unVar.z0;
                                    float left3 = omVar4.getLeft();
                                    omVar5 = unVar.z0;
                                    float right2 = omVar5.getRight();
                                    float measuredHeight8 = (((getMeasuredHeight() - pjVar.e()) - unVar.Oc) - unVar.j9(org.telegram.ui.Components.k21.c)) - org.telegram.messenger.i0.L(f20);
                                    y90Var3 = unVar.W1;
                                    if (y90Var3 == null) {
                                        y90Var4 = unVar.W1;
                                        float max = Math.max(0.0f, y90Var4.e());
                                        y90Var5 = unVar.W1;
                                        f22 = Math.max(0.0f, y90Var5.d());
                                        f21 = max;
                                    } else {
                                        f21 = 0.0f;
                                        f22 = 0.0f;
                                    }
                                    mkVar = unVar.Z;
                                    if (mkVar != null && (qeVar = mkVar.m0) != null) {
                                        f22 = Math.max(f22, qeVar.f ? 0.0f : Math.max(0.0f, qeVar.getMeasuredHeight() - (qeVar.c.getTranslationY() + qeVar.e)));
                                    }
                                    float f82 = f75 + f21;
                                    float f83 = measuredHeight8 - f22;
                                    if (q1Var2 != null || !q1Var2.getTransitionParams().x0) {
                                        omVar6 = unVar.z0;
                                        left3 = Math.max(left3, view8.getX() + omVar6.getLeft());
                                        omVar7 = unVar.z0;
                                        f82 = Math.max(f82, view8.getY() + omVar7.getY());
                                        omVar8 = unVar.z0;
                                        right2 = Math.min(right2, view8.getX() + omVar8.getLeft() + view8.getMeasuredWidth());
                                        omVar9 = unVar.z0;
                                        f83 = Math.min(f83, view8.getY() + omVar9.getY() + view8.getMeasuredHeight());
                                    }
                                    f23 = f83;
                                    f24 = f82;
                                    float f84 = right2;
                                    float max2 = Math.max(left3, unVar.e9());
                                    if (f24 >= f23) {
                                        if (view8.getAlpha() != f19) {
                                            canvas4 = canvas;
                                            canvas4.saveLayerAlpha(max2, f24, f84, f23, (int) (view8.getAlpha() * 255.0f), 31);
                                            f49 = f24;
                                            f26 = f23;
                                            f28 = max2;
                                            f29 = f84;
                                        } else {
                                            canvas4 = canvas;
                                            f49 = f24;
                                            f26 = f23;
                                            f28 = max2;
                                            f29 = f84;
                                            canvas4.save();
                                        }
                                        if (q1Var2 != null) {
                                            q1Var2.setInvalidatesParent(true);
                                            num12 = unVar.a9;
                                            q1Var2.setScrimReaction(num12);
                                        } else if (s0Var != null) {
                                            s0Var.setInvalidatesParent(true);
                                            num11 = unVar.a9;
                                            s0Var.setScrimReaction(num11);
                                        }
                                        canvas4.clipRect(f28, f49, f29, f26);
                                        omVar18 = unVar.z0;
                                        float x11 = view8.getX() + omVar18.getLeft();
                                        omVar19 = unVar.z0;
                                        canvas4.translate(x11, view8.getY() + omVar19.getY());
                                        if (q1Var2 != null && ejVar3 == null && q1Var2.J0()) {
                                            canvas4.save();
                                            canvas4.translate(0.0f, q1Var2.getPaddingTop());
                                            q1Var2.K0(canvas4, true, false);
                                            canvas4.restore();
                                        }
                                        if (q1Var2 != null && ejVar3 == null) {
                                            f50 = unVar.Z8;
                                            q1Var2.Z0(canvas4, f50);
                                        }
                                        view9 = view8;
                                        view9.draw(canvas4);
                                        if (q1Var2 == null || !q1Var2.h2()) {
                                            f25 = f49;
                                            f27 = 0.0f;
                                        } else {
                                            canvas4.save();
                                            f25 = f49;
                                            f27 = 0.0f;
                                            canvas4.translate(0.0f, q1Var2.getPaddingTop());
                                            q1Var2.g1(canvas4);
                                            canvas4.restore();
                                        }
                                        if (s0Var != null) {
                                            s0Var.I(canvas4);
                                        }
                                        canvas4.restore();
                                        if (q1Var2 != null) {
                                            q1Var2.setInvalidatesParent(false);
                                            q1Var2.setScrimReaction(num4);
                                        } else if (s0Var != null) {
                                            s0Var.setInvalidatesParent(false);
                                            s0Var.setScrimReaction(num4);
                                        }
                                    } else {
                                        canvas4 = canvas;
                                        f25 = f24;
                                        f26 = f23;
                                        view9 = view8;
                                        f27 = 0.0f;
                                        f28 = max2;
                                        f29 = f84;
                                    }
                                    bjVar2 = bjVar;
                                    if (bjVar2 == null || (q1Var2 != null && q1Var2.getTransitionParams().x0)) {
                                        if (bjVar2 != null || bjVar2.h || (bjVar2.a == 0 && bjVar2.c == 0)) {
                                            if (bjVar2 != null || bjVar2.h) {
                                                arrayList3.add(q1Var2);
                                            }
                                            if (bjVar2 != null || (bjVar2.a == 0 && bjVar2.c == 0 && q1Var2.g2())) {
                                                arrayList2.add(q1Var2);
                                            }
                                        }
                                        if (bjVar2 != null || (bjVar2.l & q1Var2.F()) != 0) {
                                            arrayList5.add(q1Var2);
                                        }
                                        if (bjVar2 != null) {
                                            int i24 = bjVar2.l;
                                            if ((i24 & 8) != 0) {
                                            }
                                        }
                                        arrayList6.add(q1Var2);
                                    }
                                    num5 = unVar.a9;
                                    if (num5 == null && q1Var2 != null && ejVar3 == null) {
                                        paint18 = unVar.R8;
                                        if (paint18 != null) {
                                            matrix10 = unVar.S8;
                                            matrix10.reset();
                                            float measuredWidth7 = getMeasuredWidth() / unVar.P8.getWidth();
                                            matrix11 = unVar.S8;
                                            matrix11.postScale(measuredWidth7, measuredWidth7);
                                            BitmapShader bitmapShader2 = unVar.Q8;
                                            matrix12 = unVar.S8;
                                            bitmapShader2.setLocalMatrix(matrix12);
                                            paint21 = unVar.R8;
                                            f48 = unVar.Z8;
                                            paint21.setAlpha((int) (f48 * 255.0f));
                                            float measuredWidth8 = getMeasuredWidth();
                                            float measuredHeight9 = getMeasuredHeight();
                                            paint22 = unVar.R8;
                                            f38 = f29;
                                            f39 = f28;
                                            view10 = view9;
                                            i16 = 1;
                                            canvas4.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint22);
                                        } else {
                                            f38 = f29;
                                            f39 = f28;
                                            view10 = view9;
                                            i16 = 1;
                                            paint19 = unVar.T8;
                                            f40 = unVar.V8;
                                            f41 = unVar.Y8;
                                            paint19.setAlpha((int) (f41 * f40 * 255.0f));
                                            float measuredWidth9 = getMeasuredWidth();
                                            float measuredHeight10 = getMeasuredHeight();
                                            paint20 = unVar.T8;
                                            canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint20);
                                        }
                                        if (f24 < f23) {
                                            f42 = unVar.V8;
                                            f43 = unVar.Y8;
                                            float f85 = (f43 * f42) / f73;
                                            float alpha = view10.getAlpha();
                                            f44 = unVar.Y8;
                                            float f86 = f44 * alpha;
                                            if (f86 < f19) {
                                                f45 = f27;
                                                canvas5 = canvas;
                                                f46 = f26;
                                                float f87 = f25;
                                                canvas5.saveLayerAlpha(f39, f87, f38, f46, (int) (f86 * 255.0f), 31);
                                                f47 = f87;
                                            } else {
                                                canvas5 = canvas;
                                                f45 = f27;
                                                f46 = f26;
                                                f47 = f25;
                                                canvas5.save();
                                            }
                                            canvas5.clipRect(f39, f47, f38, f46);
                                            omVar14 = unVar.z0;
                                            float x12 = view10.getX() + omVar14.getLeft();
                                            omVar15 = unVar.z0;
                                            canvas5.translate(x12, view10.getY() + omVar15.getY() + view10.getPaddingTop());
                                            num9 = unVar.a9;
                                            q1Var2.q1(canvas5, num9, f85, unVar.W8);
                                            canvas5.restore();
                                            canvas5.save();
                                            omVar16 = unVar.z0;
                                            float x13 = view10.getX() + omVar16.getLeft();
                                            omVar17 = unVar.z0;
                                            canvas5.translate(x13, view10.getY() + omVar17.getY() + view10.getPaddingTop());
                                            int i25 = unVar.b9;
                                            num10 = unVar.a9;
                                            i15 = i16;
                                            f30 = f75;
                                            f13 = f45;
                                            q1Var2.r1(this, canvas5, i25, num10, f85);
                                            canvas.restore();
                                        } else {
                                            i15 = i16;
                                            f30 = f75;
                                            f13 = f27;
                                        }
                                    } else {
                                        float f88 = f29;
                                        float f89 = f28;
                                        View view27 = view9;
                                        f13 = f27;
                                        float f90 = f26;
                                        float f91 = f25;
                                        f30 = f75;
                                        i15 = 1;
                                        num6 = unVar.a9;
                                        if (num6 != null && s0Var != null) {
                                            paint13 = unVar.R8;
                                            if (paint13 == null) {
                                                matrix7 = unVar.S8;
                                                matrix7.reset();
                                                float measuredWidth10 = getMeasuredWidth() / unVar.P8.getWidth();
                                                matrix8 = unVar.S8;
                                                matrix8.postScale(measuredWidth10, measuredWidth10);
                                                BitmapShader bitmapShader3 = unVar.Q8;
                                                matrix9 = unVar.S8;
                                                bitmapShader3.setLocalMatrix(matrix9);
                                                paint16 = unVar.R8;
                                                f37 = unVar.Z8;
                                                paint16.setAlpha((int) (f37 * 255.0f));
                                                float measuredWidth11 = getMeasuredWidth();
                                                float measuredHeight11 = getMeasuredHeight();
                                                paint17 = unVar.R8;
                                                s0Var2 = s0Var;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint17);
                                            } else {
                                                s0Var2 = s0Var;
                                                paint14 = unVar.T8;
                                                f31 = unVar.V8;
                                                f32 = unVar.Y8;
                                                paint14.setAlpha((int) (f32 * f31 * 255.0f));
                                                float measuredWidth12 = getMeasuredWidth();
                                                float measuredHeight12 = getMeasuredHeight();
                                                paint15 = unVar.T8;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint15);
                                            }
                                            if (f24 < f23) {
                                                f33 = unVar.V8;
                                                f34 = unVar.Y8;
                                                float f92 = (f34 * f33) / f73;
                                                float alpha2 = view27.getAlpha();
                                                f35 = unVar.Y8;
                                                float f93 = f35 * alpha2;
                                                if (f93 < f19) {
                                                    canvas.saveLayerAlpha(f89, f91, f88, f90, (int) (f93 * 255.0f), 31);
                                                    f90 = f90;
                                                    f36 = f91;
                                                    canvas3 = canvas;
                                                } else {
                                                    canvas3 = canvas;
                                                    f36 = f91;
                                                    canvas3.save();
                                                }
                                                canvas3.clipRect(f89, f36, f88, f90);
                                                omVar10 = unVar.z0;
                                                float x14 = view27.getX() + omVar10.getLeft();
                                                omVar11 = unVar.z0;
                                                canvas3.translate(x14, view27.getY() + omVar11.getY() + view27.getPaddingTop());
                                                num7 = unVar.a9;
                                                boolean z16 = unVar.W8;
                                                sg.p0 p0Var = s0Var2.E0;
                                                p0Var.getClass();
                                                org.telegram.ui.ActionBar.p6 p6Var = s0Var2.g1;
                                                if (p6Var != null) {
                                                    p6Var.b(s0Var2.u0, s0Var2.t0 + org.telegram.messenger.i0.L(4.0f), s0Var2.getMeasuredWidth(), s0Var2.v0);
                                                } else {
                                                    org.telegram.ui.ActionBar.t6.r(s0Var2.u0, s0Var2.t0 + org.telegram.messenger.i0.L(4.0f), s0Var2.getMeasuredWidth(), s0Var2.v0);
                                                }
                                                p0Var.A = f92;
                                                p0Var.B = z16;
                                                p0Var.d(canvas3, s0Var2.r2.c, num7);
                                                canvas3.restore();
                                                canvas3.save();
                                                omVar12 = unVar.z0;
                                                float x15 = view27.getX() + omVar12.getLeft();
                                                omVar13 = unVar.z0;
                                                canvas3.translate(x15, view27.getY() + omVar13.getY() + view27.getPaddingTop());
                                                int i26 = unVar.b9;
                                                num8 = unVar.a9;
                                                s0Var2.L(this, canvas3, i26, num8, f92);
                                                kmVar2 = this;
                                                canvas3.restore();
                                                z13 = z10;
                                            }
                                        }
                                    }
                                    kmVar2 = this;
                                    canvas3 = canvas;
                                    z13 = z10;
                                } else {
                                    i13 = childCount;
                                    i14 = i21;
                                    arrayList5 = arrayList;
                                    q1Var2 = q1Var;
                                    arrayList6 = arrayList4;
                                    pjVar = pjVar2;
                                    num4 = null;
                                    f19 = 1.0f;
                                }
                            }
                            z10 = z13;
                            if (q1Var2 != null) {
                                invalidate();
                            }
                            omVar4 = unVar.z0;
                            float left32 = omVar4.getLeft();
                            omVar5 = unVar.z0;
                            float right22 = omVar5.getRight();
                            float measuredHeight82 = (((getMeasuredHeight() - pjVar.e()) - unVar.Oc) - unVar.j9(org.telegram.ui.Components.k21.c)) - org.telegram.messenger.i0.L(f20);
                            y90Var3 = unVar.W1;
                            if (y90Var3 == null) {
                            }
                            mkVar = unVar.Z;
                            if (mkVar != null) {
                                f22 = Math.max(f22, qeVar.f ? 0.0f : Math.max(0.0f, qeVar.getMeasuredHeight() - (qeVar.c.getTranslationY() + qeVar.e)));
                            }
                            float f822 = f75 + f21;
                            float f832 = measuredHeight82 - f22;
                            if (q1Var2 != null) {
                            }
                            omVar6 = unVar.z0;
                            left32 = Math.max(left32, view8.getX() + omVar6.getLeft());
                            omVar7 = unVar.z0;
                            f822 = Math.max(f822, view8.getY() + omVar7.getY());
                            omVar8 = unVar.z0;
                            right22 = Math.min(right22, view8.getX() + omVar8.getLeft() + view8.getMeasuredWidth());
                            omVar9 = unVar.z0;
                            f832 = Math.min(f832, view8.getY() + omVar9.getY() + view8.getMeasuredHeight());
                            f23 = f832;
                            f24 = f822;
                            float f842 = right22;
                            float max22 = Math.max(left32, unVar.e9());
                            if (f24 >= f23) {
                            }
                            bjVar2 = bjVar;
                            if (bjVar2 == null) {
                            }
                            if (bjVar2 != null) {
                            }
                            if (bjVar2 != null) {
                            }
                            arrayList3.add(q1Var2);
                            if (bjVar2 != null) {
                            }
                            arrayList2.add(q1Var2);
                            if (bjVar2 != null) {
                            }
                            arrayList5.add(q1Var2);
                            if (bjVar2 != null) {
                            }
                            arrayList6.add(q1Var2);
                            num5 = unVar.a9;
                            if (num5 == null) {
                            }
                            float f882 = f29;
                            float f892 = f28;
                            View view272 = view9;
                            f13 = f27;
                            float f902 = f26;
                            float f912 = f25;
                            f30 = f75;
                            i15 = 1;
                            num6 = unVar.a9;
                            if (num6 != null) {
                                paint13 = unVar.R8;
                                if (paint13 == null) {
                                }
                                if (f24 < f23) {
                                }
                            }
                            kmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            f19 = 1.0f;
                            i15 = 1;
                            kmVar2 = this;
                            ejVar3 = ejVar;
                            i13 = childCount;
                            i14 = i21;
                            pjVar = pjVar2;
                            f30 = f75;
                        }
                        i21 = i14 + 1;
                        kmVar3 = kmVar2;
                        y3 = f30;
                        f10 = f13;
                        pjVar2 = pjVar;
                        f7 = f19;
                        i11 = i15;
                        ejVar = ejVar3;
                        childCount = i13;
                    }
                    org.telegram.messenger.ej ejVar4 = ejVar;
                    int i27 = i11;
                    f15 = f7;
                    float f94 = y3;
                    kmVar = kmVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i28 = 0; i28 < size3; i28++) {
                            kmVar.Y(canvas3, f94, (org.telegram.ui.Cells.q1) arrayList3.get(i28), 0);
                        }
                        i12 = 0;
                        arrayList3.clear();
                    } else {
                        i12 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i29 = i12; i29 < size4; i29++) {
                            kmVar.Y(canvas3, f94, (org.telegram.ui.Cells.q1) arrayList2.get(i29), i27);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i30 = i12; i30 < size5; i30++) {
                            org.telegram.ui.Cells.q1 q1Var7 = (org.telegram.ui.Cells.q1) arrayList.get(i30);
                            if (q1Var7.getCurrentPosition() != null || q1Var7.getTransitionParams().x0) {
                                kmVar.Y(canvas3, f94, q1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i31 = i12; i31 < size6; i31++) {
                            org.telegram.ui.Cells.q1 q1Var8 = (org.telegram.ui.Cells.q1) arrayList4.get(i31);
                            if (q1Var8.getCurrentPosition() != null || q1Var8.getTransitionParams().x0) {
                                kmVar.Y(canvas3, f94, q1Var8, 3);
                            }
                        }
                    }
                    num3 = unVar.a9;
                    if (num3 != null && ejVar4 != null) {
                        paint8 = unVar.R8;
                        if (paint8 != null) {
                            matrix4 = unVar.S8;
                            matrix4.reset();
                            float measuredWidth13 = kmVar.getMeasuredWidth() / unVar.P8.getWidth();
                            matrix5 = unVar.S8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = unVar.Q8;
                            matrix6 = unVar.S8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = unVar.R8;
                            f18 = unVar.Z8;
                            paint11.setAlpha((int) (f18 * 255.0f));
                            float measuredWidth14 = kmVar.getMeasuredWidth();
                            float measuredHeight13 = kmVar.getMeasuredHeight();
                            paint12 = unVar.R8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = unVar.T8;
                            f16 = unVar.V8;
                            f17 = unVar.Y8;
                            paint9.setAlpha((int) (f17 * f16 * 255.0f));
                            float measuredWidth15 = kmVar.getMeasuredWidth();
                            float measuredHeight14 = kmVar.getMeasuredHeight();
                            paint10 = unVar.T8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i32 = i12; i32 < size7; i32++) {
                            org.telegram.ui.Cells.q1 q1Var9 = (org.telegram.ui.Cells.q1) arrayList4.get(i32);
                            if (q1Var9.getCurrentPosition() != null || q1Var9.getTransitionParams().x0) {
                                kmVar.Y(canvas3, f94, q1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = unVar.a9;
                    if (num13 == null) {
                        f59 = unVar.Y8;
                        if (f59 < f15) {
                            paint25 = unVar.R8;
                            if (paint25 != null) {
                                matrix13 = unVar.S8;
                                matrix13.reset();
                                float measuredWidth16 = kmVar.getMeasuredWidth() / unVar.P8.getWidth();
                                matrix14 = unVar.S8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = unVar.Q8;
                                matrix15 = unVar.S8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = unVar.R8;
                                f62 = unVar.Z8;
                                paint28.setAlpha((int) (f62 * 255.0f));
                                float measuredWidth17 = kmVar.getMeasuredWidth();
                                float measuredHeight15 = kmVar.getMeasuredHeight();
                                paint29 = unVar.R8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = unVar.T8;
                                f60 = unVar.V8;
                                f61 = unVar.Y8;
                                paint26.setAlpha((int) ((f15 - f61) * f60 * 255.0f));
                                float measuredWidth18 = kmVar.getMeasuredWidth();
                                float measuredHeight16 = kmVar.getMeasuredHeight();
                                paint27 = unVar.T8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            kmVar = kmVar3;
            f15 = 1.0f;
            f13 = 0.0f;
            f14 = 20.0f;
            num13 = unVar.a9;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            kmVar = kmVar3;
            f13 = 0.0f;
            f14 = 20.0f;
        }
        view3 = unVar.X8;
        if (view3 != null || ((ArrayList) unVar.fa.c).size() > 0) {
            y90Var = unVar.W1;
            if (y90Var != null) {
                y90Var2 = unVar.W1;
            }
            super.drawChild(canvas3, unVar.x1, SystemClock.uptimeMillis());
            dk dkVar = unVar.l3;
            if (dkVar != null && dkVar.getTag() != null) {
                super.drawChild(canvas3, unVar.l3, SystemClock.uptimeMillis());
            }
            ck ckVar = unVar.m3;
            if (ckVar != null && ckVar.getTag() != null) {
                super.drawChild(canvas3, unVar.m3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.xz xzVar = unVar.F9;
            if (xzVar != null) {
                super.drawChild(canvas3, xzVar, SystemClock.uptimeMillis());
            }
            mh.l lVar11 = unVar.qa;
            if (lVar11 != null) {
                super.drawChild(canvas3, lVar11, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.q30 q30Var3 = unVar.s2;
            if (q30Var3 != null) {
                super.drawChild(canvas3, q30Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = unVar.M3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, unVar.M3, SystemClock.uptimeMillis());
            }
            il ilVar = unVar.N3;
            if (ilVar != null && ilVar.getVisibility() == 0) {
                super.drawChild(canvas3, unVar.N3, SystemClock.uptimeMillis());
            }
            vh.p2 p2Var = unVar.L1;
            if (p2Var != null && p2Var.getVisibility() == 0) {
                super.drawChild(canvas3, unVar.L1, SystemClock.uptimeMillis());
            }
            wl wlVar = unVar.P1;
            if (wlVar != null && wlVar.getVisibility() == 0) {
                super.drawChild(canvas3, unVar.P1, SystemClock.uptimeMillis());
            }
            vh.p2 p2Var2 = unVar.N1;
            if (p2Var2 != null && p2Var2.getVisibility() == 0) {
                super.drawChild(canvas3, unVar.N1, SystemClock.uptimeMillis());
            }
            mk mkVar2 = unVar.Z;
            if (mkVar2 != null && mkVar2.L != null) {
                canvas3.save();
                canvas3.translate(unVar.Z.L.getX() + unVar.Z.getX(), unVar.Z.L.getY() + unVar.Z.getY());
                unVar.Z.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (unVar.Ia > 0 && kmVar.f < org.telegram.messenger.i0.L(f14)) {
            int themedColor = unVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6);
            if (kmVar.m0 == null) {
                kmVar.m0 = new Paint();
            }
            if (kmVar.n0 != themedColor) {
                Paint paint32 = kmVar.m0;
                kmVar.n0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, kmVar.getMeasuredHeight() - unVar.Ia, kmVar.getMeasuredWidth(), kmVar.getMeasuredHeight(), kmVar.m0);
            canvas3 = canvas6;
        }
        tp tpVar = unVar.ia;
        if (tpVar != null && tpVar.e()) {
            int inputBubbleTop = (int) unVar.T.getInputBubbleTop();
            int inputBubbleBottom = (int) unVar.T.getInputBubbleBottom();
            un unVar2 = unVar.ma;
            int i33 = inputBubbleTop - ((int) (unVar.na * (unVar2 == null ? f13 : unVar2.ha)));
            tp tpVar2 = unVar.ia;
            kmVar.getMeasuredWidth();
            tpVar2.b(canvas3, i33, inputBubbleBottom);
        }
        if (unVar.ma != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, kmVar.getMeasuredWidth(), kmVar.getMeasuredHeight(), (int) (unVar.na * 255.0f), 31);
            canvas3 = canvas;
            unVar.ma.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        unVar.Qa.e(canvas3);
        if (i18 >= 0) {
            canvas3.restore();
        }
        if (unVar.Da) {
            canvas3.save();
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            float x16 = lVar.getX();
            lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            canvas3.translate(x16, lVar2.getY());
            lVar3 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            float width = lVar3.getWidth();
            lVar4 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, lVar4.getHeight(), (int) (unVar.Ea * 255.0f), 31);
            lVar5 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            lVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hl hlVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (hlVar = this.w0.Ya) == null || !hlVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        hlVar.a(true);
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
        uk ukVar;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.l lVar;
        un unVar = this.w0;
        zg.d dVar = unVar.b4;
        if (dVar != null) {
            dVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (org.telegram.messenger.i0.E || unVar.isInBubbleMode()) ? (unVar.Z.getEmojiView() != null ? unVar.Z.getEmojiView() : unVar.Z).getY() : unVar.Z.getY();
        View view = unVar.X8;
        if (view != null) {
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        }
        mk mkVar = unVar.Z;
        if (mkVar == null || !mkVar.z3 || motionEvent.getY() >= y3) {
            unVar.C9 = motionEvent.getY();
            org.telegram.ui.Cells.v9 n10 = unVar.q9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!unVar.q9.x() || !unVar.q9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                hk hkVar = unVar.E1;
                if (hkVar != null) {
                    if (unVar.I3 != null) {
                        z10 = hkVar.B(motionEvent);
                        if (unVar.E1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !unVar.q9.x() || (motionEvent.getY() >= unVar.z0.getTop() && motionEvent.getY() <= unVar.z0.getBottom())) {
                            ukVar = unVar.Pa;
                            if (!ukVar.n) {
                                return ukVar.g(motionEvent);
                            }
                            ac.a aVar = ac.a.e;
                            if (aVar == null || !aVar.a) {
                                if (unVar.isInPreviewMode() && unVar.ca) {
                                    if (motionEvent.getAction() == 0) {
                                        int i10 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (unVar.x1 != null) {
                                            int i11 = 0;
                                            for (int i12 = 3; i11 < i12; i12 = 3) {
                                                android.support.v4.media.session.a0 a0Var = unVar.x1.e[i11 == 0 ? 1 : i11 == 1 ? i10 : i12];
                                                if (a0Var != null) {
                                                    ((ah.b) a0Var.b).getLocationInWindow(iArr2);
                                                    Rect rect = org.telegram.messenger.i0.Q;
                                                    int i13 = iArr2[0] - iArr[0];
                                                    rect.set(i13, iArr2[1] - iArr[1], org.telegram.messenger.i0.L(56.0f) + i13, org.telegram.messenger.i0.L(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                i11++;
                                                i10 = 2;
                                            }
                                        }
                                        z11 = false;
                                        qj qjVar = unVar.o1;
                                        if (qjVar != null) {
                                            qjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = org.telegram.messenger.i0.Q;
                                            int i14 = iArr2[0] - iArr[0];
                                            rect2.set(i14, iArr2[1] - iArr[1], unVar.o1.getMeasuredWidth() + i14, unVar.o1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.r0 = motionEvent.getX();
                                                    this.s0 = motionEvent.getY();
                                                    this.t0 = SystemClock.elapsedRealtime();
                                                    this.u0 = z12;
                                                    qj qjVar2 = unVar.o1;
                                                    if (qjVar2 != null) {
                                                        qjVar2.h0.c(z12);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    this.t0 = -1L;
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        qj qjVar3 = unVar.o1;
                                        if (qjVar3 != null) {
                                            qjVar3.h0.c(false);
                                        }
                                        if (this.u0 || (w7.z8.a(this.r0, this.s0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.i0.L(6.0f) && SystemClock.elapsedRealtime() - this.t0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.u0) {
                                                z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                                                unVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) z4Var2).R(ProfileActivity.z4(unVar.j6));
                                            } else {
                                                z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                                                ((ActionBarLayout) z4Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.t0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.t0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z10) {
                                }
                            } else {
                                r4 r4Var = (r4) ac.a.n().d;
                                if (r4Var != null) {
                                    r4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (unVar.q9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n10.getX(), n10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = hkVar.e;
                        if (hkVar.H) {
                            hkVar.I = true;
                            hkVar.H = false;
                            hkVar.F(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                hkVar.F(view2, hkVar.D ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            hkVar.d = 0;
                            hkVar.c = 1.0f;
                            org.telegram.ui.Components.m71 m71Var = hkVar.M;
                            if (m71Var != null) {
                                m71Var.e(1.0f, 0, hkVar.b);
                            }
                            hkVar.x(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                ukVar = unVar.Pa;
                if (!ukVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        un unVar = this.w0;
        org.telegram.ui.Components.t11 t11Var = unVar.m0;
        float progress = (view == t11Var || view == this.L || view == unVar.Y || (view instanceof org.telegram.ui.ActionBar.s5) || t11Var == null) ? 0.0f : t11Var.getProgress() * org.telegram.messenger.i0.L(288.0f);
        if (progress <= 0.0f) {
            return Z(canvas, view, j10);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j10);
        canvas.restore();
        return Z;
    }

    @Override // org.telegram.ui.Components.uu0
    public float getBottomOffset() {
        return this.w0.z0.getBottom();
    }

    public un getChatActivity() {
        return this.w0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.w0.getThemedColor(org.telegram.ui.ActionBar.t6.ua);
        ColorDrawable colorDrawable = this.v0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.v0 = new ColorDrawable(themedColor);
        }
        return this.v0;
    }

    @Override // org.telegram.ui.Components.uu0
    public int getKeyboardHeight() {
        if (this.w0.ib) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.uu0
    public float getListTranslationY() {
        return this.w0.z0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.uu0
    public Drawable getNewDrawable() {
        un unVar = this.w0;
        if (unVar.G9()) {
            return getCompactBackground();
        }
        Drawable m10 = unVar.xa.m();
        return m10 != null ? m10 : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.uu0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.w0.xa.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.uu0
    public int getScrollOffset() {
        return this.w0.z0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        View view;
        super.onAttachedToWindow();
        un unVar = this.w0;
        if (unVar.ib) {
            this.H.b = unVar.l1;
        } else {
            z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
            if (z4Var != null) {
                z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                if (((ActionBarLayout) z4Var2).b) {
                    org.telegram.ui.ActionBar.m1 m1Var = this.H;
                    z4Var3 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
                    m1Var.b = (FrameLayout) z4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        unVar.Z.setAdjustPanLayoutHelper(this.H);
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        if (jjVar != null && ((jjVar.h4() || org.telegram.messenger.jj.L4(jjVar.k)) && jjVar.T == 0 && org.telegram.messenger.jj.B0(jjVar.k) == unVar.j6)) {
            MediaController.B().p0(unVar.V7(false), unVar.J8, unVar.H8, true);
        }
        tp tpVar = unVar.ia;
        if (tpVar != null) {
            tpVar.F.P();
            org.telegram.ui.Components.f5 f5Var = tpVar.k0;
            if (f5Var != null && (view = tpVar.a0) != null) {
                f5Var.a(view);
            }
            org.telegram.messenger.zs.f(tpVar.e0).c(tpVar, org.telegram.messenger.zs.r);
        }
        unVar.Qa.i();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        un unVar = this.w0;
        tp tpVar = unVar.ia;
        if (tpVar != null) {
            org.telegram.messenger.zs.f(tpVar.e0).n(tpVar, org.telegram.messenger.zs.r);
            tpVar.F.R();
            org.telegram.ui.Components.f5 f5Var = tpVar.k0;
            if (f5Var != null && (view = tpVar.a0) != null) {
                f5Var.n(view);
            }
            tpVar.Q = 0.0f;
            tpVar.P = 0L;
            unVar.ia = null;
        }
        unVar.Qa.j();
        org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        un unVar;
        kg.f0 f0Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (f0Var = (unVar = this.w0).M2) == null || !f0Var.a() || unVar.M2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d4, code lost:
    
        if (r8 != r3.Yc) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int u10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int L;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar3;
        int i21;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        un unVar = this.w0;
        pj pjVar = unVar.w;
        int i22 = (measuredWidth - unVar.nb) - unVar.ob;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i24 = layoutParams.gravity;
                if (i24 == -1) {
                    i24 = 51;
                }
                int i25 = i24 & org.telegram.messenger.zs.x1;
                int i26 = i24 & 7;
                if (i26 == 1) {
                    u10 = i0.a.u(i22, measuredWidth2, 2, unVar.nb) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = unVar.nb + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            lVar5 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                            if (childAt != lVar5) {
                                lVar6 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                if (lVar6.getVisibility() == 0) {
                                    lVar7 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                    i18 += lVar7.getMeasuredHeight();
                                }
                            }
                        } else if (i25 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = (i13 - i11) - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (a0(childAt)) {
                            i18 = 0;
                            i15 = 0;
                        } else {
                            if (childAt != unVar.fa && childAt != unVar.qa && childAt != unVar.T && !(childAt instanceof org.telegram.ui.Components.q30) && !(childAt instanceof org.telegram.ui.Components.hp) && childAt != unVar.m0) {
                                if (childAt instanceof org.telegram.ui.Cells.v9) {
                                    i20 = unVar.Ta;
                                } else if (childAt == unVar.e1) {
                                    lVar3 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                    if (lVar3.getVisibility() == 0) {
                                        lVar4 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                        i21 = lVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (unVar.Z.r0(childAt)) {
                                    if (!org.telegram.messenger.i0.E) {
                                        z11 = ((org.telegram.ui.ActionBar.k2) unVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = unVar.Z.getBottom();
                                        }
                                    }
                                    i18 = unVar.Z.getTop() - childAt.getMeasuredHeight();
                                    L = org.telegram.messenger.i0.L(1.0f);
                                    i18 += L;
                                } else {
                                    mk mkVar = unVar.Z;
                                    if (mkVar != null && (childAt == mkVar.O1 || childAt == mkVar.N1)) {
                                        i18 = org.telegram.messenger.z20.w(7.0f, pjVar.e(), i18);
                                        i15 -= org.telegram.messenger.i0.L(3.0f);
                                    } else if (childAt == unVar.K2) {
                                        i18 = org.telegram.messenger.z20.w(7.0f, pjVar.e(), i18);
                                    } else if (mkVar == null || childAt != mkVar.e1) {
                                        if (childAt == unVar.s2 || childAt == unVar.G2 || childAt == unVar.t2) {
                                            i19 = this.f0;
                                        } else if (childAt == unVar.z0 || childAt == unVar.x0 || childAt == unVar.l3 || childAt == unVar.m3 || childAt == unVar.n3) {
                                            i20 = unVar.Ta;
                                        } else if (childAt != unVar.Q) {
                                            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                            if (childAt == lVar) {
                                                i18 -= getPaddingTop();
                                                if (unVar.isInPreviewMode()) {
                                                    L = org.telegram.messenger.i0.L(1.0f);
                                                    i18 += L;
                                                }
                                            } else if (childAt == unVar.H8) {
                                                lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                                i18 = lVar2.getMeasuredHeight();
                                            } else if (childAt != unVar.p3 && childAt != unVar.q3 && childAt != unVar.w0) {
                                                if (childAt instanceof org.telegram.ui.Components.ab0) {
                                                    i18 = org.telegram.messenger.i0.m;
                                                } else if (childAt != unVar.U) {
                                                    if (childAt != unVar.b4) {
                                                    }
                                                }
                                            }
                                        } else if (mkVar.x0()) {
                                            i19 = org.telegram.messenger.i0.L(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.z20.w(9.0f, pjVar.e(), i18);
                                    }
                                }
                                i18 = -i20;
                            }
                            i18 = 0;
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                    } else {
                        i16 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (a0(childAt)) {
                    }
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                } else {
                    u10 = (measuredWidth - unVar.ob) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = u10 - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (a0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        ck ckVar = unVar.m3;
        if (ckVar != null) {
            ckVar.setBackgroundHeight(getMeasuredHeight());
        }
        unVar.A9();
        unVar.C9();
        unVar.hd(false, false);
        R();
        unVar.B7();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x053b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int childCount;
        boolean z10;
        int i12;
        int i13;
        org.telegram.ui.Components.wb wbVar;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        int i14;
        org.telegram.ui.ActionBar.l lVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.t0 t0Var;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.x xVar;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.t0 t0Var2;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        un unVar = this.w0;
        pj pjVar = unVar.w;
        int i15 = (size - unVar.nb) - unVar.ob;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        hi.a aVar = unVar.M.a;
        if (aVar instanceof hi.b) {
            ((hi.b) aVar).b(i15, size2);
        }
        int i16 = 0;
        if (this.h0 != i15) {
            unVar.R4 = false;
            this.h0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
            if (z13 || (user = unVar.f) == null || !user.self) {
                unVar.da = false;
            } else {
                org.telegram.ui.ActionBar.u5 titleTextView = unVar.o1.getTitleTextView();
                if (i15 - org.telegram.messenger.i0.L(152.0f) > org.telegram.messenger.i0.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    unVar.da = !unVar.ea;
                } else {
                    unVar.da = false;
                }
            }
            if (unVar.da || unVar.ea || org.telegram.messenger.h20.v(unVar.f)) {
                qj qjVar = unVar.o1;
                if (qjVar != null && qjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) unVar.o1.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(unVar.f4 == 3 && ((t0Var = unVar.l0) == null || t0Var.getVisibility() != 0) ? 52.0f : 92.0f);
                }
            } else {
                qj qjVar2 = unVar.o1;
                if (qjVar2 != null && qjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) unVar.o1.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(52.0f);
                }
            }
            if (unVar.da) {
                lVar8 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (!lVar8.n0 && (t0Var2 = unVar.o0) != null) {
                    t0Var2.setVisibility(0);
                }
                org.telegram.ui.ActionBar.t0 t0Var3 = unVar.i0;
                if (t0Var3 != null) {
                    t0Var3.t(40);
                }
            } else {
                org.telegram.ui.ActionBar.t0 t0Var4 = unVar.i0;
                if (t0Var4 != null) {
                    t0Var4.S(40);
                }
                org.telegram.ui.ActionBar.t0 t0Var5 = unVar.o0;
                if (t0Var5 != null) {
                    t0Var5.setVisibility(8);
                }
            }
            lVar7 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (!lVar7.n0 && (xVar = unVar.p0) != null) {
                xVar.e((!unVar.ea || unVar.da) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.t0 t0Var6 = unVar.i0;
            if (t0Var6 != null) {
                TLRPC.UserFull userFull = unVar.q8;
                if (unVar.ea) {
                    t0Var6.t(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    t0Var6.S(32);
                }
            }
            unVar.R4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        measureChildWithMargins(lVar, makeMeasureSpec, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + unVar.Ha >= org.telegram.messenger.i0.L(20.0f);
        if (this.g0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (unVar.Ia > 0 && keyboardHeight <= org.telegram.messenger.i0.L(20.0f)) {
            unVar.Ha = unVar.Ia;
        } else if (keyboardHeight <= org.telegram.messenger.i0.L(20.0f)) {
            unVar.Ha = unVar.Z.q0() ? unVar.Z.getEmojiPadding() : 0;
        } else {
            unVar.Ha = 0;
        }
        setEmojiKeyboardHeight(unVar.Ha);
        boolean z15 = this.f + unVar.Ha >= org.telegram.messenger.i0.L(20.0f);
        if (MediaController.B().u0 != null && MediaController.B().u0.h4() && z14 != z15) {
            for (int i17 = 0; i17 < unVar.z0.getChildCount(); i17++) {
                View childAt = unVar.z0.getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.jj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    if (messageObject.h4() && MediaController.B().I(messageObject)) {
                        unVar.z0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            unVar.B0.i1(R, (int) (((((unVar.z0.getMeasuredHeight() - unVar.L9) - unVar.Ua) + ((this.f + unVar.Ha) - r1)) - (z15 ? org.telegram.messenger.i0.u : org.telegram.messenger.i0.f3(unVar.P9(), unVar.G9()))) / 2.0f), false);
                            unVar.C0.g(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i18 = paddingTop;
                            measureChildWithMargins(unVar.Z, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
                            if (!z10 || unVar.ib) {
                                this.f0 = 0;
                            } else {
                                this.f0 = unVar.Z.getMeasuredHeight();
                            }
                            unVar.Ta = 0;
                            unVar.Ua = 0;
                            if (org.telegram.messenger.tz.f() && !unVar.ib && unVar.G != null && Build.VERSION.SDK_INT >= 31) {
                                int i19 = unVar.H;
                                unVar.Ta = i19;
                                unVar.Ua = i19;
                            }
                            i12 = 0;
                            while (i12 < childCount) {
                                int i20 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != unVar.Z) {
                                        lVar4 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                        if (childAt2 != lVar4) {
                                            if (a0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == unVar.z0 || childAt2 == unVar.x0 || (childAt2 instanceof org.telegram.ui.Cells.v9)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), unVar.Ta + size2 + unVar.Ua), TLObject.FLAG_30));
                                                } else if (childAt2 == unVar.Q) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int L = org.telegram.messenger.i0.L(10.0f);
                                                    int i21 = i18 - this.f0;
                                                    z12 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, org.telegram.messenger.i0.L((unVar.Z.x0() ? 48 : i16) + 2) + (i21 - (z12 ? org.telegram.messenger.i0.m : i16))), TLObject.FLAG_30));
                                                } else if (childAt2 == unVar.p3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    unVar.p3.setInternalPadding(org.telegram.messenger.i0.L(12.0f) + pjVar.e() + ((int) unVar.Pc));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == unVar.q3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - pjVar.e()) - ((int) unVar.Pc)) - org.telegram.messenger.i0.L(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == unVar.e1) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                                                } else if (unVar.Z.r0(childAt2)) {
                                                    org.telegram.ui.Components.df dfVar = unVar.Z.H1;
                                                    if (childAt2 == dfVar && dfVar != null) {
                                                        i20 = dfVar.getKeyboardHeight();
                                                    }
                                                    z11 = ((org.telegram.ui.ActionBar.k2) unVar).inBubbleMode;
                                                    if (z11) {
                                                        int paddingTop2 = getPaddingTop() + (i18 - this.f0) + measuredHeight;
                                                        if (i20 < 0) {
                                                            i20 = Math.max(Math.min(paddingTop2, org.telegram.messenger.i0.L(350.0f)), paddingTop2 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                    } else if (org.telegram.messenger.i0.E) {
                                                        int paddingTop3 = getPaddingTop() + (((i18 - this.f0) + measuredHeight) - org.telegram.messenger.i0.m);
                                                        if (i20 < 0) {
                                                            i20 = Math.max(Math.min(paddingTop3, org.telegram.messenger.i0.L(350.0f)), paddingTop3 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                    }
                                                } else {
                                                    ek ekVar = unVar.W1;
                                                    if (childAt2 == ekVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ekVar.getLayoutParams();
                                                        zf.x0 adapter = unVar.W1.getAdapter();
                                                        if (adapter.w0 == null || adapter.h0) {
                                                            unVar.W1.setIgnoreLayout(true);
                                                            layoutParams.height = i18;
                                                            layoutParams.topMargin = 0;
                                                            unVar.W1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == unVar.q9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                        int i22 = i18 + unVar.Ta;
                                                        if (keyboardHeight <= org.telegram.messenger.i0.L(20.0f) || getLayoutParams().height >= 0 || unVar.ib) {
                                                            lm lmVar = unVar.q9;
                                                            lmVar.d0 = 0;
                                                            lmVar.w();
                                                        } else {
                                                            i22 += keyboardHeight;
                                                            lm lmVar2 = unVar.q9;
                                                            lmVar2.d0 = keyboardHeight;
                                                            lmVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.ab0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.n, TLObject.FLAG_30));
                                                    } else if (childAt2 == unVar.f2) {
                                                        lVar5 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                                        if (lVar5.getVisibility() == 0) {
                                                            lVar6 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                                            i14 = size2 - lVar6.getMeasuredHeight();
                                                        } else {
                                                            i14 = size2;
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                                                    } else {
                                                        measureChildWithMargins(childAt2, makeMeasureSpec, 0, i11, 0);
                                                    }
                                                }
                                                i12++;
                                                i16 = 0;
                                            }
                                        }
                                    }
                                    i12++;
                                    i16 = 0;
                                }
                                i12++;
                                i16 = 0;
                            }
                            if (unVar.Q4) {
                                unVar.R4 = true;
                                unVar.A9();
                                unVar.C9();
                                unVar.Q4 = false;
                                vj vjVar = unVar.z0;
                                vjVar.measure(View.MeasureSpec.makeMeasureSpec(vjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(unVar.z0.getMeasuredHeight(), TLObject.FLAG_30));
                                unVar.R4 = false;
                            }
                            i13 = unVar.L4;
                            if (i13 != -1) {
                                org.telegram.messenger.i0.g3(new ag.d3(this, i13, 22));
                                unVar.L4 = -1;
                            }
                            wbVar = org.telegram.ui.Components.wb.w;
                            if (wbVar != null && unVar.uc != null) {
                                wbVar.l();
                            }
                            unVar.a7();
                            this.g0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.ee eeVar = unVar.Z.Y3;
        org.telegram.messenger.i0.r(eeVar);
        eeVar.run();
        childCount = getChildCount();
        int i182 = paddingTop;
        measureChildWithMargins(unVar.Z, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        if (z10) {
        }
        this.f0 = 0;
        unVar.Ta = 0;
        unVar.Ua = 0;
        if (org.telegram.messenger.tz.f()) {
            int i192 = unVar.H;
            unVar.Ta = i192;
            unVar.Ua = i192;
        }
        i12 = 0;
        while (i12 < childCount) {
        }
        if (unVar.Q4) {
        }
        i13 = unVar.L4;
        if (i13 != -1) {
        }
        wbVar = org.telegram.ui.Components.wb.w;
        if (wbVar != null) {
            wbVar.l();
        }
        unVar.a7();
        this.g0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        un unVar = this.w0;
        yg.d.c(unVar.N8, unVar.fragmentView);
        unVar.O8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        un unVar = this.w0;
        unVar.O9 = i11;
        unVar.A9();
        unVar.C9();
    }

    @Override // org.telegram.ui.Components.uu0
    public final void L() {
    }

    @Override // org.telegram.ui.Components.uu0
    public final void V() {
    }

    @Override // org.telegram.ui.Components.uu0
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
