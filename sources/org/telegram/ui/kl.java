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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kl extends org.telegram.ui.Components.qt0 {
    public int g0;
    public int h0;
    public int i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public final ArrayList m0;
    public Paint n0;
    public int o0;
    public final il p0;
    public final il q0;
    public final RectF r0;
    public float s0;
    public float t0;
    public long u0;
    public boolean v0;
    public ColorDrawable w0;
    public final /* synthetic */ wm x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.il] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.il] */
    public kl(wm wmVar, Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context, q4Var);
        this.x0 = wmVar;
        this.g0 = 0;
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        this.m0 = new ArrayList();
        final int i3 = 0;
        this.p0 = new fh.a(this) { // from class: org.telegram.ui.il
            public final /* synthetic */ kl b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // fh.a
            public final void b(eh.a aVar, RectF rectF) {
                switch (i3) {
                }
                aVar.a = true;
            }

            @Override // fh.a
            public final void d(Canvas canvas, RectF rectF) {
                switch (i3) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        wm wmVar2 = this.b.x0;
                        if (wmVar2.A0.Y0()) {
                            wmVar2.A0.d(canvas, rectF);
                            break;
                        } else {
                            wmVar2.A0.z1(canvas, rectF);
                            for (int i10 = 0; i10 < wmVar2.A0.getChildCount(); i10++) {
                                View childAt = wmVar2.A0.getChildAt(i10);
                                if (!wm.l2(wmVar2, childAt, rectF)) {
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
                                        wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.j2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                        wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.t0) childAt).H(canvas);
                                        canvas.restore();
                                    } else {
                                        wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            wmVar2.A0.A1(canvas, rectF);
                            break;
                        }
                    default:
                        kl klVar = this.b;
                        wm wmVar3 = klVar.x0;
                        RectF rectF2 = klVar.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, klVar.getWidth(), klVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = wmVar3.dd.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.r1(f10 * 0.85f, wmVar3.getThemedColor(org.telegram.ui.ActionBar.k6.d6))));
                            }
                            jh.d.b(klVar.p0, canvas, rectF, wmVar3.A0, klVar, i11);
                            ci.j1 j1Var = wmVar3.a4;
                            if (j1Var != null) {
                                jh.d.b(j1Var, canvas, rectF, j1Var, klVar, i12);
                            }
                            gi.g1 g1Var = wmVar3.F1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = wmVar3.F1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = wmVar3.F1.getChildAt(i13);
                                    if ((childAt2 instanceof ym) && childAt2.getVisibility() == 0) {
                                        kl klVar2 = ((ym) childAt2).a.m1;
                                        jh.d.a(klVar2.q0, canvas, rectF, klVar2, klVar);
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
        this.q0 = new fh.a(this) { // from class: org.telegram.ui.il
            public final /* synthetic */ kl b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // fh.a
            public final void b(eh.a aVar, RectF rectF) {
                switch (i10) {
                }
                aVar.a = true;
            }

            @Override // fh.a
            public final void d(Canvas canvas, RectF rectF) {
                switch (i10) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        wm wmVar2 = this.b.x0;
                        if (wmVar2.A0.Y0()) {
                            wmVar2.A0.d(canvas, rectF);
                            break;
                        } else {
                            wmVar2.A0.z1(canvas, rectF);
                            for (int i102 = 0; i102 < wmVar2.A0.getChildCount(); i102++) {
                                View childAt = wmVar2.A0.getChildAt(i102);
                                if (!wm.l2(wmVar2, childAt, rectF)) {
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
                                        wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.j2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                        wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.t0) childAt).H(canvas);
                                        canvas.restore();
                                    } else {
                                        wmVar2.A0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            wmVar2.A0.A1(canvas, rectF);
                            break;
                        }
                    default:
                        kl klVar = this.b;
                        wm wmVar3 = klVar.x0;
                        RectF rectF2 = klVar.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, klVar.getWidth(), klVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = wmVar3.dd.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.k6.n0(org.telegram.ui.ActionBar.k6.r1(f10 * 0.85f, wmVar3.getThemedColor(org.telegram.ui.ActionBar.k6.d6))));
                            }
                            jh.d.b(klVar.p0, canvas, rectF, wmVar3.A0, klVar, i11);
                            ci.j1 j1Var = wmVar3.a4;
                            if (j1Var != null) {
                                jh.d.b(j1Var, canvas, rectF, j1Var, klVar, i12);
                            }
                            gi.g1 g1Var = wmVar3.F1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = wmVar3.F1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = wmVar3.F1.getChildAt(i13);
                                    if ((childAt2 instanceof ym) && childAt2.getVisibility() == 0) {
                                        kl klVar2 = ((ym) childAt2).a.m1;
                                        jh.d.a(klVar2.q0, canvas, rectF, klVar2, klVar);
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
        this.I = new jl(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.x0;
        wmVar.m1.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        kVar.setTranslationY(0.0f);
        dk dkVar = wmVar.yb;
        if (dkVar != null) {
            dkVar.setTranslationY(wmVar.D1 != null ? r3.getCurrentHeight() : 0);
        }
        gi.l3 l3Var = wmVar.L1;
        if (l3Var != null) {
            l3Var.setTranslationY(0.0f);
        }
        gi.l3 l3Var2 = wmVar.K1;
        if (l3Var2 != null) {
            l3Var2.setTranslationY(0.0f);
        }
        wmVar.f1.setTranslationY(0.0f);
        wmVar.R.setTranslationY(0.0f);
        wmVar.Q9 = 0.0f;
        wmVar.R9 = 0.0f;
        wmVar.m1.setBackgroundTranslation(0);
        org.telegram.ui.Components.p40 p40Var = wmVar.q3;
        if (p40Var != null) {
            p40Var.f(0.0f);
        }
        gi.n5 n5Var = wmVar.N2;
        if (n5Var != null) {
            org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) n5Var.b;
            v9Var.u = 0.0f;
            v9Var.d.invalidate();
        }
        wmVar.setFragmentPanTranslationOffset(0);
        wmVar.K9();
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public final int Q() {
        ei.x2 x2Var = this.x0.Y1;
        if (x2Var == null || !x2Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.qt0
    public final void T(Drawable drawable) {
        wm wmVar = this.x0;
        kh.l lVar = wmVar.Y;
        if (drawable instanceof org.telegram.ui.Components.la0) {
            ((org.telegram.ui.Components.la0) drawable).p();
        }
        si.a c2 = lVar.c(drawable);
        float B = org.telegram.messenger.g0.B(lVar.b(c2));
        float B2 = org.telegram.messenger.g0.B(lVar.a(c2));
        wmVar.ec = B <= 0.721f;
        wmVar.fc = B2 <= 0.9f;
        wmVar.N.a = c2;
        si.f fVar = wmVar.J;
        if (fVar != null) {
            Iterator it = fVar.w.iterator();
            while (it.hasNext()) {
                gh.e eVar = ((gh.g) it.next()).g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        si.f fVar2 = wmVar.K;
        if (fVar2 != null) {
            Iterator it2 = fVar2.w.iterator();
            while (it2.hasNext()) {
                gh.e eVar2 = ((gh.g) it2.next()).g0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        mh.f fVar3 = wmVar.Z;
        if (fVar3 != null) {
            fVar3.setOverlayColor(wmVar.Q9() ? wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.va) : 0);
            wmVar.Z.invalidate();
        }
        kh.f fVar4 = wmVar.U;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        wmVar.m1.invalidate();
        Iterator it3 = wmVar.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        wmVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.q1 q1Var, int i3) {
        int save = canvas.save();
        wm wmVar = this.x0;
        float x10 = q1Var.getX() + wmVar.A0.getLeft();
        float y9 = q1Var.getY() + wmVar.A0.getY() + q1Var.getPaddingTop();
        float alpha = q1Var.a() ? q1Var.getAlpha() : 1.0f;
        canvas.clipRect(wmVar.A0.getLeft(), f10, wmVar.A0.getRight(), ((((wmVar.A0.getY() + wmVar.A0.getMeasuredHeight()) - wmVar.Va) - wmVar.w.e()) - wmVar.Xc) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y9);
        q1Var.setInvalidatesParent(true);
        if (i3 == 0) {
            q1Var.x1(alpha, canvas, true);
        } else if (i3 == 1) {
            q1Var.h1(canvas, alpha);
        } else if (i3 == 2) {
            q1Var.Q0(alpha, canvas, q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0);
        } else if (i3 == 3) {
            boolean z10 = q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0;
            q1Var.V0(canvas, alpha);
            if (!z10) {
                q1Var.o1(canvas, alpha, null);
            }
        } else if (i3 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().l) != 0) && wmVar.b9 != null)) {
            float f11 = (wmVar.W8 * wmVar.Z8) / 0.2f;
            canvas.save();
            q1Var.s1(canvas, wmVar.b9, f11, wmVar.X8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y9);
            q1Var.t1(this, canvas, wmVar.c9, wmVar.b9, f11);
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
    public final boolean Z(Canvas canvas, View view, long j10) {
        gi.n5 n5Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.zi ziVar;
        boolean z10;
        boolean z11;
        pj pjVar;
        org.telegram.messenger.zi ziVar2;
        org.telegram.ui.Components.p40 p40Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        wm wmVar = this.x0;
        boolean z12 = false;
        if ((wmVar.Y8 == null && ((ArrayList) wmVar.ga.c).size() <= 0) || (view != wmVar.y1 && view != wmVar.m3 && view != wmVar.n3 && view != wmVar.G9 && view != wmVar.ra && view != wmVar.t2 && view != null && view != wmVar.N3 && view != wmVar.O3)) {
            if ((view != wmVar.N3 || !PhotoViewer.v1().U1()) && (!wmVar.ma || view != wmVar.A0)) {
                if (wmVar.Ea) {
                    kVar3 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                }
                if (view != wmVar.q3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (n5Var = wmVar.N2) != null && n5Var.a() && wmVar.N2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        ziVar = MediaController.B().v0;
                        if (ziVar == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == wmVar.I8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    } else {
                        if (view != wmVar.A0) {
                            if (view != wmVar.U) {
                            }
                        }
                        ziVar = MediaController.B().v0;
                        if (ziVar == null && ziVar.T == 0) {
                            z10 = ziVar.i4();
                            if (z10 || org.telegram.messenger.zi.M4(ziVar.k)) {
                                z11 = true;
                                if (view == wmVar.I8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-wmVar.ha) - (wmVar.oa != 0.0f ? (wmVar.A0.getMeasuredHeight() - wmVar.ha) * wmVar.oa : 0.0f));
                                    if (ziVar != null && ziVar.D == 5) {
                                        if (org.telegram.ui.ActionBar.k6.k3 != null && wmVar.K8.d) {
                                            int x10 = ((int) view.getX()) - org.telegram.messenger.g0.L(3.0f);
                                            int y9 = ((int) view.getY()) - org.telegram.messenger.g0.L(2.0f);
                                            canvas.save();
                                            canvas.scale(wmVar.I8.getScaleX(), wmVar.I8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.k6.k3.setAlpha(org.telegram.messenger.hs.e4);
                                            org.telegram.ui.ActionBar.k6.k3.setBounds(x10, y9, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.g3(wmVar.Z9(), wmVar.Q9()) + x10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.g3(wmVar.Z9(), wmVar.Q9()) + y9);
                                            org.telegram.ui.ActionBar.k6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z12 = super.drawChild(canvas, view, j10);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-org.telegram.messenger.g0.L(1000.0f));
                                        z12 = super.drawChild(canvas, view, j10);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z12;
                                }
                                if (view == wmVar.U && (p40Var = wmVar.q3) != null && p40Var.getVisibility() == 0) {
                                    super.drawChild(canvas, wmVar.q3, j10);
                                }
                                z12 = super.drawChild(canvas, view, j10);
                                if (z11 && view == wmVar.A0 && ziVar.D != 5 && (pjVar = wmVar.I8) != null && pjVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-wmVar.ha) - (wmVar.oa != 0.0f ? (wmVar.A0.getMeasuredHeight() - wmVar.ha) * wmVar.oa : 0.0f)) + wmVar.ia);
                                    super.drawChild(canvas, wmVar.I8, j10);
                                    if (wmVar.J8 != null) {
                                        canvas.save();
                                        canvas.translate(wmVar.J8.getX(), wmVar.A0.getY() + wmVar.J8.getTop());
                                        if (z10) {
                                            wmVar.J8.r1(canvas);
                                            invalidate();
                                            wmVar.J8.invalidate();
                                        } else {
                                            wmVar.J8.j1(canvas);
                                            org.telegram.ui.Cells.q1 q1Var = wmVar.J8;
                                            if (!q1Var.F9 && ((ziVar2 = q1Var.P5) == null || ziVar2.D != 27)) {
                                                q1Var.x1(q1Var.getAlpha(), canvas, true);
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
                        if (view == wmVar.I8) {
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
        wm wmVar = this.x0;
        return view == wmVar.N2 || view == wmVar.F1 || view == wmVar.G9 || view == wmVar.Z || view == wmVar.Z3 || view == wmVar.n0 || (view instanceof org.telegram.ui.ActionBar.i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.yf yfVar;
        wm wmVar = this.x0;
        mj mjVar = wmVar.a0;
        if (mjVar == null || view != mjVar.n0) {
            super.addView(view, i3, layoutParams);
        } else {
            mh.f fVar = wmVar.Z;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i3 = indexOfChild;
            }
            super.addView(view, i3, layoutParams);
        }
        mj mjVar2 = wmVar.a0;
        if (mjVar2 != null && view == mjVar2.n0) {
            ii.w wVar = (ii.w) view;
            wVar.setBackgroundDrawable(wmVar.L.c(wVar.c, wmVar.E, false));
        }
        mj mjVar3 = wmVar.a0;
        if (mjVar3 == null || view != (yfVar = mjVar3.P1)) {
            return;
        }
        yfVar.setBlurredBackgroundFactory(wmVar.L);
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
    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
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
        kl klVar;
        float f14;
        float f15;
        View view3;
        org.telegram.ui.Components.c90 c90Var;
        org.telegram.ui.Components.c90 c90Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        ol olVar;
        View view6;
        org.telegram.messenger.ui uiVar;
        ol olVar2;
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
        ol olVar3;
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.ui uiVar2;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ri riVar;
        View view7;
        org.telegram.messenger.ui uiVar3;
        View view8;
        int i12;
        int i13;
        ArrayList arrayList5;
        org.telegram.ui.Cells.q1 q1Var2;
        ArrayList arrayList6;
        ri riVar2;
        Integer num4;
        float f20;
        float f21;
        boolean z10;
        ol olVar4;
        ol olVar5;
        org.telegram.ui.Components.c90 c90Var3;
        float f22;
        float f23;
        mj mjVar;
        ol olVar6;
        ol olVar7;
        ol olVar8;
        ol olVar9;
        float f24;
        float f25;
        Canvas canvas4;
        float f26;
        float f27;
        View view9;
        float f28;
        float f29;
        float f30;
        org.telegram.messenger.ri riVar3;
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
        ol olVar10;
        ol olVar11;
        Integer num7;
        ol olVar12;
        ol olVar13;
        Integer num8;
        kl klVar2;
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
        ol olVar14;
        ol olVar15;
        Integer num9;
        ol olVar16;
        ol olVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        float f49;
        Paint paint22;
        float f50;
        Integer num11;
        ol olVar18;
        ol olVar19;
        float f51;
        Integer num12;
        org.telegram.ui.Components.te teVar;
        org.telegram.ui.Components.c90 c90Var4;
        org.telegram.ui.Components.c90 c90Var5;
        ol olVar20;
        float f52;
        org.telegram.ui.Cells.q1 q1Var3;
        boolean z11;
        org.telegram.ui.Components.c90 c90Var6;
        float f53;
        org.telegram.ui.Components.c90 c90Var7;
        float f54;
        ol olVar21;
        org.telegram.ui.Components.c90 c90Var8;
        org.telegram.ui.Components.c90 c90Var9;
        ol olVar22;
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
        yi yiVar;
        kl klVar3 = this;
        wm wmVar = klVar3.x0;
        ri riVar4 = wmVar.w;
        ArrayList arrayList7 = wmVar.E6;
        wmVar.a0.U1();
        wmVar.Nc();
        if (wmVar.La || ((yiVar = wmVar.B0) != null && yiVar.k())) {
            wmVar.La = false;
            wmVar.Yc();
        }
        wmVar.rd(false, false);
        wmVar.ad();
        gi.l3 l3Var = wmVar.v2;
        if (l3Var != null && l3Var.W) {
            l3Var.z();
        }
        gi.l3 l3Var2 = wmVar.x2;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.z();
        }
        float f69 = 0.2f;
        float f70 = 2.0f;
        if (wmVar.Ea) {
            kVar10 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            canvas2 = canvas;
            i3 = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), klVar3.getMeasuredWidth(), klVar3.getMeasuredHeight(), (int) (wmVar.Fa * 255.0f), 31);
            float f71 = (wmVar.Fa * 0.2f) + 0.8f;
            canvas2.scale(f71, f71, klVar3.getMeasuredWidth() / 2.0f, klVar3.getMeasuredHeight() / 2.0f);
        } else {
            canvas2 = canvas;
            i3 = -1;
        }
        int i17 = i3;
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
            org.telegram.messenger.vi viVar = q1Var4.getMessageObject().L1;
            if (viVar != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    wj wjVar = wmVar.D1;
                    int currentHeight = measuredHeight + (wjVar != null ? wjVar.getCurrentHeight() : 0);
                    jj jjVar = wmVar.E1;
                    int currentHeight2 = currentHeight + (jjVar != null ? jjVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
                    i16 = currentHeight2 + (z12 ? org.telegram.messenger.g0.m : 0);
                } else {
                    i16 = 0;
                }
                f67 = f70;
                f68 = f69;
                canvas2.clipRect(0.0f, i16 + wmVar.N9, klVar3.getWidth(), klVar3.getHeight());
                ImageReceiver photoImage = q1Var4.getPhotoImage();
                q1Var4.getLocationInWindow(org.telegram.messenger.g0.R);
                int topViewEnterProgress = (int) ((wmVar.a0.getTopViewEnterProgress() * org.telegram.messenger.g0.L(48.0f)) + ((int) a1.g.D(1.0f, viVar.g, q1Var4.getTranslationY(), r9[1])));
                if (viVar.h) {
                    canvas2.translate(viVar.e, org.telegram.messenger.g0.T1(viVar.b, topViewEnterProgress, viVar.g));
                } else {
                    canvas2.translate(viVar.e, org.telegram.messenger.g0.T1(viVar.b, photoImage.s() + topViewEnterProgress, viVar.g));
                }
                float f72 = viVar.d;
                canvas2.scale(f72, f72);
                if (!viVar.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                q1Var4.setTimeAlpha(viVar.f);
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
        num = wmVar.b9;
        if (num != null) {
            view24 = wmVar.Y8;
        }
        paint = wmVar.S8;
        if (paint != null) {
            matrix = wmVar.T8;
            matrix.reset();
            float measuredWidth = klVar3.getMeasuredWidth() / wmVar.Q8.getWidth();
            matrix2 = wmVar.T8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = wmVar.R8;
            matrix3 = wmVar.T8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = wmVar.S8;
            f13 = wmVar.a9;
            paint5.setAlpha((int) (f13 * 255.0f));
            paint6 = wmVar.S8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = klVar3.getMeasuredWidth();
                float measuredHeight2 = klVar3.getMeasuredHeight();
                paint7 = wmVar.S8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = wmVar.U8;
            f12 = wmVar.W8;
            float f75 = f12 * 255.0f;
            view = wmVar.Y8;
            paint2.setAlpha((int) (f75 * (view != null ? wmVar.Z8 : 1.0f)));
            paint3 = wmVar.U8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = klVar3.getMeasuredWidth();
                float measuredHeight3 = klVar3.getMeasuredHeight();
                paint4 = wmVar.U8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = wmVar.b9;
        if (num2 != null && wmVar.d9) {
            klVar3.invalidate();
        }
        view2 = wmVar.Y8;
        if (view2 != null) {
            view4 = wmVar.Y8;
            if (view4 == wmVar.y1) {
                f64 = wmVar.Z8;
                if (f64 < 1.0f) {
                    paint30 = wmVar.U8;
                    f65 = wmVar.W8;
                    f66 = wmVar.Z8;
                    paint30.setAlpha((int) ((1.0f - f66) * f65 * 255.0f));
                    float measuredWidth4 = klVar3.getMeasuredWidth();
                    float measuredHeight4 = klVar3.getMeasuredHeight();
                    paint31 = wmVar.U8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = wmVar.Y8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f55 = wmVar.Z8;
                    if (f55 < 1.0f) {
                        view20 = wmVar.Y8;
                        float left = view20.getLeft();
                        view21 = wmVar.Y8;
                        float top = view21.getTop();
                        view22 = wmVar.Y8;
                        float right = view22.getRight();
                        view23 = wmVar.Y8;
                        float bottom = view23.getBottom();
                        f59 = wmVar.Z8;
                        int i19 = (int) (f59 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i19, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = wmVar.Y8;
                    float left2 = view12.getLeft();
                    view13 = wmVar.Y8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = wmVar.Y8;
                    kVar6 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = wmVar.Y8;
                        float x10 = view16.getX();
                        view17 = wmVar.Y8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = wmVar.Y8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f73;
                        view19 = wmVar.Y8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f73;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, wmVar.V8);
                    }
                    view15 = wmVar.Y8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f56 = wmVar.Z8;
                    if (f56 < 1.0f) {
                        paint23 = wmVar.U8;
                        f57 = wmVar.W8;
                        f58 = wmVar.Z8;
                        paint23.setAlpha((int) ((1.0f - f58) * f57 * 255.0f));
                        float measuredWidth6 = klVar3.getMeasuredWidth();
                        float measuredHeight6 = klVar3.getMeasuredHeight();
                        paint24 = wmVar.U8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    olVar = wmVar.A0;
                    float y9 = ((olVar.getY() + wmVar.M9) - wmVar.O9) - org.telegram.messenger.g0.L(4.0f);
                    view6 = wmVar.Y8;
                    if (view6 instanceof org.telegram.ui.Cells.q1) {
                        view11 = wmVar.Y8;
                        uiVar = ((org.telegram.ui.Cells.q1) view11).getCurrentMessagesGroup();
                    } else {
                        uiVar = null;
                    }
                    olVar2 = wmVar.A0;
                    int childCount = olVar2.getChildCount();
                    int i20 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = klVar3.l0;
                        f15 = 20.0f;
                        arrayList2 = klVar3.k0;
                        arrayList3 = klVar3.j0;
                        f14 = f11;
                        arrayList4 = klVar3.m0;
                        if (i20 >= childCount) {
                            break;
                        }
                        olVar3 = wmVar.A0;
                        View childAt = olVar3.getChildAt(i20);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            q1Var = (org.telegram.ui.Cells.q1) childAt;
                            uiVar2 = q1Var.getCurrentMessagesGroup();
                            riVar = q1Var.getCurrentPosition();
                            t0Var = null;
                        } else {
                            t0Var = childAt instanceof org.telegram.ui.Cells.t0 ? (org.telegram.ui.Cells.t0) childAt : null;
                            uiVar2 = null;
                            q1Var = null;
                            riVar = null;
                        }
                        float f76 = y9;
                        view7 = wmVar.Y8;
                        if ((childAt == view7 || (uiVar != null && uiVar == uiVar2)) && childAt.getAlpha() != f14) {
                            if (z13 || q1Var == null || uiVar == null) {
                                uiVar3 = uiVar;
                                view8 = childAt;
                                i12 = childCount;
                                i13 = i20;
                                arrayList5 = arrayList;
                                q1Var2 = q1Var;
                                arrayList6 = arrayList4;
                                riVar2 = riVar4;
                                num4 = null;
                                f20 = 1.0f;
                                f21 = 9.0f;
                            } else {
                                ArrayList arrayList8 = uiVar.d;
                                f21 = 9.0f;
                                org.telegram.messenger.ti tiVar = uiVar.m;
                                uiVar3 = uiVar;
                                org.telegram.ui.Cells.q1 q1Var5 = tiVar.m;
                                view8 = childAt;
                                if (q1Var5 != null) {
                                    float R1 = q1Var5.R1(true);
                                    float f77 = tiVar.a + R1 + tiVar.e;
                                    float f78 = tiVar.b + tiVar.f;
                                    float f79 = tiVar.c + R1 + tiVar.g;
                                    float f80 = f78;
                                    float f81 = tiVar.d + tiVar.h;
                                    if (!tiVar.j) {
                                        f80 = tiVar.m.getTranslationY() + f80;
                                        f81 = tiVar.m.getTranslationY() + f81;
                                    }
                                    float L = f80 < (wmVar.M9 - ((float) wmVar.O9)) - ((float) org.telegram.messenger.g0.L(20.0f)) ? (wmVar.M9 - wmVar.O9) - org.telegram.messenger.g0.L(20.0f) : f80;
                                    olVar20 = wmVar.A0;
                                    i12 = childCount;
                                    if (f81 > org.telegram.messenger.g0.L(20.0f) + olVar20.getMeasuredHeight()) {
                                        olVar22 = wmVar.A0;
                                        f52 = org.telegram.messenger.g0.L(20.0f) + olVar22.getMeasuredHeight();
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
                                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList8.get(i21);
                                        ArrayList arrayList9 = arrayList8;
                                        int i22 = i21;
                                        if (wmVar.n6[ziVar.A0() == wmVar.k6 ? (char) 0 : (char) 1].indexOfKey(ziVar.f1()) < 0) {
                                            q1Var3 = q1Var;
                                            z11 = false;
                                            break;
                                        } else {
                                            i21 = i22 + 1;
                                            arrayList8 = arrayList9;
                                        }
                                    }
                                    canvas3.save();
                                    float measuredHeight7 = ((getMeasuredHeight() - riVar4.e()) - wmVar.Xc) - org.telegram.messenger.g0.L(9.0f);
                                    c90Var6 = wmVar.X1;
                                    if (c90Var6 != null) {
                                        c90Var9 = wmVar.X1;
                                        f53 = c90Var9.d();
                                    } else {
                                        f53 = f14;
                                    }
                                    float f82 = measuredHeight7 - f53;
                                    c90Var7 = wmVar.X1;
                                    if (c90Var7 != null) {
                                        c90Var8 = wmVar.X1;
                                        f54 = c90Var8.e();
                                    } else {
                                        f54 = f14;
                                    }
                                    org.telegram.ui.Cells.q1 q1Var6 = q1Var3;
                                    canvas3.clipRect(f14, f76 + f54, getMeasuredWidth(), f82);
                                    olVar21 = wmVar.A0;
                                    canvas3.translate(f14, olVar21.getY());
                                    boolean z14 = tiVar.k;
                                    boolean z15 = tiVar.l;
                                    arrayList6 = arrayList4;
                                    riVar2 = riVar4;
                                    q1Var2 = q1Var6;
                                    num4 = null;
                                    f20 = 1.0f;
                                    tiVar.m.K0(canvas, (int) f77, (int) L, (int) f79, (int) f52, z14, z15, z11, 0);
                                    canvas.restore();
                                    z10 = true;
                                    if (q1Var2 != null && q1Var2.getPhotoImage().M()) {
                                        invalidate();
                                    }
                                    olVar4 = wmVar.A0;
                                    float left3 = olVar4.getLeft();
                                    olVar5 = wmVar.A0;
                                    float right2 = olVar5.getRight();
                                    float measuredHeight8 = (((getMeasuredHeight() - riVar2.e()) - wmVar.Xc) - wmVar.r9(org.telegram.ui.Components.c11.c)) - org.telegram.messenger.g0.L(f21);
                                    c90Var3 = wmVar.X1;
                                    if (c90Var3 == null) {
                                        c90Var4 = wmVar.X1;
                                        float max = Math.max(0.0f, c90Var4.e());
                                        c90Var5 = wmVar.X1;
                                        f23 = Math.max(0.0f, c90Var5.d());
                                        f22 = max;
                                    } else {
                                        f22 = 0.0f;
                                        f23 = 0.0f;
                                    }
                                    mjVar = wmVar.a0;
                                    if (mjVar != null && (teVar = mjVar.n0) != null) {
                                        f23 = Math.max(f23, teVar.f ? 0.0f : Math.max(0.0f, teVar.getMeasuredHeight() - (teVar.c.getTranslationY() + teVar.e)));
                                    }
                                    float f83 = f76 + f22;
                                    float f84 = measuredHeight8 - f23;
                                    if (q1Var2 != null || !q1Var2.getTransitionParams().x0) {
                                        olVar6 = wmVar.A0;
                                        left3 = Math.max(left3, view8.getX() + olVar6.getLeft());
                                        olVar7 = wmVar.A0;
                                        f83 = Math.max(f83, view8.getY() + olVar7.getY());
                                        olVar8 = wmVar.A0;
                                        right2 = Math.min(right2, view8.getX() + olVar8.getLeft() + view8.getMeasuredWidth());
                                        olVar9 = wmVar.A0;
                                        f84 = Math.min(f84, view8.getY() + olVar9.getY() + view8.getMeasuredHeight());
                                    }
                                    f24 = f84;
                                    f25 = f83;
                                    float f85 = right2;
                                    float max2 = Math.max(left3, wmVar.l9());
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
                                            num12 = wmVar.b9;
                                            q1Var2.setScrimReaction(num12);
                                        } else if (t0Var != null) {
                                            t0Var.setInvalidatesParent(true);
                                            num11 = wmVar.b9;
                                            t0Var.setScrimReaction(num11);
                                        }
                                        canvas4.clipRect(f29, f50, f30, f27);
                                        olVar18 = wmVar.A0;
                                        float x11 = view8.getX() + olVar18.getLeft();
                                        olVar19 = wmVar.A0;
                                        canvas4.translate(x11, view8.getY() + olVar19.getY());
                                        if (q1Var2 != null && uiVar3 == null && q1Var2.L0()) {
                                            canvas4.save();
                                            canvas4.translate(0.0f, q1Var2.getPaddingTop());
                                            q1Var2.M0(canvas4, true, false);
                                            canvas4.restore();
                                        }
                                        if (q1Var2 != null && uiVar3 == null) {
                                            f51 = wmVar.a9;
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
                                            t0Var.H(canvas4);
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
                                    riVar3 = riVar;
                                    if (riVar3 == null || (q1Var2 != null && q1Var2.getTransitionParams().x0)) {
                                        if (riVar3 != null || riVar3.h || (riVar3.a == 0 && riVar3.c == 0)) {
                                            if (riVar3 != null || riVar3.h) {
                                                arrayList3.add(q1Var2);
                                            }
                                            if (riVar3 != null || (riVar3.a == 0 && riVar3.c == 0 && q1Var2.i2())) {
                                                arrayList2.add(q1Var2);
                                            }
                                        }
                                        if (riVar3 != null || (riVar3.l & q1Var2.B()) != 0) {
                                            arrayList5.add(q1Var2);
                                        }
                                        if (riVar3 != null) {
                                            int i23 = riVar3.l;
                                            if ((i23 & 8) != 0) {
                                            }
                                        }
                                        arrayList6.add(q1Var2);
                                    }
                                    num5 = wmVar.b9;
                                    if (num5 == null && q1Var2 != null && uiVar3 == null) {
                                        paint18 = wmVar.S8;
                                        if (paint18 != null) {
                                            matrix10 = wmVar.T8;
                                            matrix10.reset();
                                            float measuredWidth7 = getMeasuredWidth() / wmVar.Q8.getWidth();
                                            matrix11 = wmVar.T8;
                                            matrix11.postScale(measuredWidth7, measuredWidth7);
                                            BitmapShader bitmapShader2 = wmVar.R8;
                                            matrix12 = wmVar.T8;
                                            bitmapShader2.setLocalMatrix(matrix12);
                                            paint21 = wmVar.S8;
                                            f49 = wmVar.a9;
                                            paint21.setAlpha((int) (f49 * 255.0f));
                                            float measuredWidth8 = getMeasuredWidth();
                                            float measuredHeight9 = getMeasuredHeight();
                                            paint22 = wmVar.S8;
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
                                            paint19 = wmVar.U8;
                                            f41 = wmVar.W8;
                                            f42 = wmVar.Z8;
                                            paint19.setAlpha((int) (f42 * f41 * 255.0f));
                                            float measuredWidth9 = getMeasuredWidth();
                                            float measuredHeight10 = getMeasuredHeight();
                                            paint20 = wmVar.U8;
                                            canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint20);
                                        }
                                        if (f25 < f24) {
                                            f43 = wmVar.W8;
                                            f44 = wmVar.Z8;
                                            float f86 = (f44 * f43) / f74;
                                            float alpha = view10.getAlpha();
                                            f45 = wmVar.Z8;
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
                                            olVar14 = wmVar.A0;
                                            float x12 = view10.getX() + olVar14.getLeft();
                                            olVar15 = wmVar.A0;
                                            canvas5.translate(x12, view10.getY() + olVar15.getY() + view10.getPaddingTop());
                                            num9 = wmVar.b9;
                                            q1Var2.s1(canvas5, num9, f86, wmVar.X8);
                                            canvas5.restore();
                                            canvas5.save();
                                            olVar16 = wmVar.A0;
                                            float x13 = view10.getX() + olVar16.getLeft();
                                            olVar17 = wmVar.A0;
                                            canvas5.translate(x13, view10.getY() + olVar17.getY() + view10.getPaddingTop());
                                            int i24 = wmVar.c9;
                                            num10 = wmVar.b9;
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
                                        num6 = wmVar.b9;
                                        if (num6 != null && t0Var != null) {
                                            paint13 = wmVar.S8;
                                            if (paint13 == null) {
                                                matrix7 = wmVar.T8;
                                                matrix7.reset();
                                                float measuredWidth10 = getMeasuredWidth() / wmVar.Q8.getWidth();
                                                matrix8 = wmVar.T8;
                                                matrix8.postScale(measuredWidth10, measuredWidth10);
                                                BitmapShader bitmapShader3 = wmVar.R8;
                                                matrix9 = wmVar.T8;
                                                bitmapShader3.setLocalMatrix(matrix9);
                                                paint16 = wmVar.S8;
                                                f38 = wmVar.a9;
                                                paint16.setAlpha((int) (f38 * 255.0f));
                                                float measuredWidth11 = getMeasuredWidth();
                                                float measuredHeight11 = getMeasuredHeight();
                                                paint17 = wmVar.S8;
                                                t0Var2 = t0Var;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint17);
                                            } else {
                                                t0Var2 = t0Var;
                                                paint14 = wmVar.U8;
                                                f32 = wmVar.W8;
                                                f33 = wmVar.Z8;
                                                paint14.setAlpha((int) (f33 * f32 * 255.0f));
                                                float measuredWidth12 = getMeasuredWidth();
                                                float measuredHeight12 = getMeasuredHeight();
                                                paint15 = wmVar.U8;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint15);
                                            }
                                            if (f25 < f24) {
                                                f34 = wmVar.W8;
                                                f35 = wmVar.Z8;
                                                float f93 = (f35 * f34) / f74;
                                                float alpha2 = view25.getAlpha();
                                                f36 = wmVar.Z8;
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
                                                olVar10 = wmVar.A0;
                                                float x14 = view25.getX() + olVar10.getLeft();
                                                olVar11 = wmVar.A0;
                                                canvas3.translate(x14, view25.getY() + olVar11.getY() + view25.getPaddingTop());
                                                num7 = wmVar.b9;
                                                boolean z16 = wmVar.X8;
                                                dh.o0 o0Var = t0Var2.F0;
                                                o0Var.getClass();
                                                org.telegram.ui.ActionBar.e6 e6Var = t0Var2.h1;
                                                if (e6Var != null) {
                                                    e6Var.b(t0Var2.v0, t0Var2.u0 + org.telegram.messenger.g0.L(4.0f), t0Var2.getMeasuredWidth(), t0Var2.w0);
                                                } else {
                                                    org.telegram.ui.ActionBar.k6.r(t0Var2.v0, t0Var2.u0 + org.telegram.messenger.g0.L(4.0f), t0Var2.getMeasuredWidth(), t0Var2.w0);
                                                }
                                                o0Var.A = f93;
                                                o0Var.B = z16;
                                                o0Var.d(canvas3, t0Var2.s2.c, num7);
                                                canvas3.restore();
                                                canvas3.save();
                                                olVar12 = wmVar.A0;
                                                float x15 = view25.getX() + olVar12.getLeft();
                                                olVar13 = wmVar.A0;
                                                canvas3.translate(x15, view25.getY() + olVar13.getY() + view25.getPaddingTop());
                                                int i25 = wmVar.c9;
                                                num8 = wmVar.b9;
                                                t0Var2.K(this, canvas3, i25, num8, f93);
                                                klVar2 = this;
                                                canvas3.restore();
                                                z13 = z10;
                                            }
                                        }
                                    }
                                    klVar2 = this;
                                    canvas3 = canvas;
                                    z13 = z10;
                                } else {
                                    i12 = childCount;
                                    i13 = i20;
                                    arrayList5 = arrayList;
                                    q1Var2 = q1Var;
                                    arrayList6 = arrayList4;
                                    riVar2 = riVar4;
                                    num4 = null;
                                    f20 = 1.0f;
                                }
                            }
                            z10 = z13;
                            if (q1Var2 != null) {
                                invalidate();
                            }
                            olVar4 = wmVar.A0;
                            float left32 = olVar4.getLeft();
                            olVar5 = wmVar.A0;
                            float right22 = olVar5.getRight();
                            float measuredHeight82 = (((getMeasuredHeight() - riVar2.e()) - wmVar.Xc) - wmVar.r9(org.telegram.ui.Components.c11.c)) - org.telegram.messenger.g0.L(f21);
                            c90Var3 = wmVar.X1;
                            if (c90Var3 == null) {
                            }
                            mjVar = wmVar.a0;
                            if (mjVar != null) {
                                f23 = Math.max(f23, teVar.f ? 0.0f : Math.max(0.0f, teVar.getMeasuredHeight() - (teVar.c.getTranslationY() + teVar.e)));
                            }
                            float f832 = f76 + f22;
                            float f842 = measuredHeight82 - f23;
                            if (q1Var2 != null) {
                            }
                            olVar6 = wmVar.A0;
                            left32 = Math.max(left32, view8.getX() + olVar6.getLeft());
                            olVar7 = wmVar.A0;
                            f832 = Math.max(f832, view8.getY() + olVar7.getY());
                            olVar8 = wmVar.A0;
                            right22 = Math.min(right22, view8.getX() + olVar8.getLeft() + view8.getMeasuredWidth());
                            olVar9 = wmVar.A0;
                            f842 = Math.min(f842, view8.getY() + olVar9.getY() + view8.getMeasuredHeight());
                            f24 = f842;
                            f25 = f832;
                            float f852 = right22;
                            float max22 = Math.max(left32, wmVar.l9());
                            if (f25 >= f24) {
                            }
                            riVar3 = riVar;
                            if (riVar3 == null) {
                            }
                            if (riVar3 != null) {
                            }
                            if (riVar3 != null) {
                            }
                            arrayList3.add(q1Var2);
                            if (riVar3 != null) {
                            }
                            arrayList2.add(q1Var2);
                            if (riVar3 != null) {
                            }
                            arrayList5.add(q1Var2);
                            if (riVar3 != null) {
                            }
                            arrayList6.add(q1Var2);
                            num5 = wmVar.b9;
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
                            num6 = wmVar.b9;
                            if (num6 != null) {
                                paint13 = wmVar.S8;
                                if (paint13 == null) {
                                }
                                if (f25 < f24) {
                                }
                            }
                            klVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            f20 = 1.0f;
                            i14 = 1;
                            klVar2 = this;
                            uiVar3 = uiVar;
                            i12 = childCount;
                            i13 = i20;
                            riVar2 = riVar4;
                            f31 = f76;
                        }
                        i20 = i13 + 1;
                        klVar3 = klVar2;
                        y9 = f31;
                        f11 = f14;
                        riVar4 = riVar2;
                        f10 = f20;
                        i10 = i14;
                        uiVar = uiVar3;
                        childCount = i12;
                    }
                    org.telegram.messenger.ui uiVar4 = uiVar;
                    int i26 = i10;
                    f16 = f10;
                    float f95 = y9;
                    klVar = klVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i27 = 0; i27 < size3; i27++) {
                            klVar.Y(canvas3, f95, (org.telegram.ui.Cells.q1) arrayList3.get(i27), 0);
                        }
                        i11 = 0;
                        arrayList3.clear();
                    } else {
                        i11 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i28 = i11; i28 < size4; i28++) {
                            klVar.Y(canvas3, f95, (org.telegram.ui.Cells.q1) arrayList2.get(i28), i26);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i29 = i11; i29 < size5; i29++) {
                            org.telegram.ui.Cells.q1 q1Var7 = (org.telegram.ui.Cells.q1) arrayList.get(i29);
                            if (q1Var7.getCurrentPosition() != null || q1Var7.getTransitionParams().x0) {
                                klVar.Y(canvas3, f95, q1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i30 = i11; i30 < size6; i30++) {
                            org.telegram.ui.Cells.q1 q1Var8 = (org.telegram.ui.Cells.q1) arrayList4.get(i30);
                            if (q1Var8.getCurrentPosition() != null || q1Var8.getTransitionParams().x0) {
                                klVar.Y(canvas3, f95, q1Var8, 3);
                            }
                        }
                    }
                    num3 = wmVar.b9;
                    if (num3 != null && uiVar4 != null) {
                        paint8 = wmVar.S8;
                        if (paint8 != null) {
                            matrix4 = wmVar.T8;
                            matrix4.reset();
                            float measuredWidth13 = klVar.getMeasuredWidth() / wmVar.Q8.getWidth();
                            matrix5 = wmVar.T8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = wmVar.R8;
                            matrix6 = wmVar.T8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = wmVar.S8;
                            f19 = wmVar.a9;
                            paint11.setAlpha((int) (f19 * 255.0f));
                            float measuredWidth14 = klVar.getMeasuredWidth();
                            float measuredHeight13 = klVar.getMeasuredHeight();
                            paint12 = wmVar.S8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = wmVar.U8;
                            f17 = wmVar.W8;
                            f18 = wmVar.Z8;
                            paint9.setAlpha((int) (f18 * f17 * 255.0f));
                            float measuredWidth15 = klVar.getMeasuredWidth();
                            float measuredHeight14 = klVar.getMeasuredHeight();
                            paint10 = wmVar.U8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i31 = i11; i31 < size7; i31++) {
                            org.telegram.ui.Cells.q1 q1Var9 = (org.telegram.ui.Cells.q1) arrayList4.get(i31);
                            if (q1Var9.getCurrentPosition() != null || q1Var9.getTransitionParams().x0) {
                                klVar.Y(canvas3, f95, q1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = wmVar.b9;
                    if (num13 == null) {
                        f60 = wmVar.Z8;
                        if (f60 < f16) {
                            paint25 = wmVar.S8;
                            if (paint25 != null) {
                                matrix13 = wmVar.T8;
                                matrix13.reset();
                                float measuredWidth16 = klVar.getMeasuredWidth() / wmVar.Q8.getWidth();
                                matrix14 = wmVar.T8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = wmVar.R8;
                                matrix15 = wmVar.T8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = wmVar.S8;
                                f63 = wmVar.a9;
                                paint28.setAlpha((int) (f63 * 255.0f));
                                float measuredWidth17 = klVar.getMeasuredWidth();
                                float measuredHeight15 = klVar.getMeasuredHeight();
                                paint29 = wmVar.S8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = wmVar.U8;
                                f61 = wmVar.W8;
                                f62 = wmVar.Z8;
                                paint26.setAlpha((int) ((f16 - f62) * f61 * 255.0f));
                                float measuredWidth18 = klVar.getMeasuredWidth();
                                float measuredHeight16 = klVar.getMeasuredHeight();
                                paint27 = wmVar.U8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            klVar = klVar3;
            f16 = 1.0f;
            f14 = 0.0f;
            f15 = 20.0f;
            num13 = wmVar.b9;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            klVar = klVar3;
            f14 = 0.0f;
            f15 = 20.0f;
        }
        view3 = wmVar.Y8;
        if (view3 != null || ((ArrayList) wmVar.ga.c).size() > 0) {
            c90Var = wmVar.X1;
            if (c90Var != null) {
                c90Var2 = wmVar.X1;
            }
            super.drawChild(canvas3, wmVar.y1, SystemClock.uptimeMillis());
            ej ejVar = wmVar.m3;
            if (ejVar != null && ejVar.getTag() != null) {
                super.drawChild(canvas3, wmVar.m3, SystemClock.uptimeMillis());
            }
            cj cjVar = wmVar.n3;
            if (cjVar != null && cjVar.getTag() != null) {
                super.drawChild(canvas3, wmVar.n3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.gz gzVar = wmVar.G9;
            if (gzVar != null) {
                super.drawChild(canvas3, gzVar, SystemClock.uptimeMillis());
            }
            xh.j jVar = wmVar.ra;
            if (jVar != null) {
                super.drawChild(canvas3, jVar, SystemClock.uptimeMillis());
            }
            gi.l3 l3Var3 = wmVar.t2;
            if (l3Var3 != null) {
                super.drawChild(canvas3, l3Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = wmVar.N3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, wmVar.N3, SystemClock.uptimeMillis());
            }
            ik ikVar = wmVar.O3;
            if (ikVar != null && ikVar.getVisibility() == 0) {
                super.drawChild(canvas3, wmVar.O3, SystemClock.uptimeMillis());
            }
            gi.l3 l3Var4 = wmVar.M1;
            if (l3Var4 != null && l3Var4.getVisibility() == 0) {
                super.drawChild(canvas3, wmVar.M1, SystemClock.uptimeMillis());
            }
            vk vkVar = wmVar.Q1;
            if (vkVar != null && vkVar.getVisibility() == 0) {
                super.drawChild(canvas3, wmVar.Q1, SystemClock.uptimeMillis());
            }
            gi.l3 l3Var5 = wmVar.O1;
            if (l3Var5 != null && l3Var5.getVisibility() == 0) {
                super.drawChild(canvas3, wmVar.O1, SystemClock.uptimeMillis());
            }
            mj mjVar2 = wmVar.a0;
            if (mjVar2 != null && mjVar2.M != null) {
                canvas3.save();
                canvas3.translate(wmVar.a0.M.getX() + wmVar.a0.getX(), wmVar.a0.M.getY() + wmVar.a0.getY());
                wmVar.a0.M.draw(canvas3);
                canvas3.restore();
            }
        }
        if (wmVar.Ja > 0 && klVar.f < org.telegram.messenger.g0.L(f15)) {
            int themedColor = wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            if (klVar.n0 == null) {
                klVar.n0 = new Paint();
            }
            if (klVar.o0 != themedColor) {
                Paint paint32 = klVar.n0;
                klVar.o0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, klVar.getMeasuredHeight() - wmVar.Ja, klVar.getMeasuredWidth(), klVar.getMeasuredHeight(), klVar.n0);
            canvas3 = canvas6;
        }
        to toVar = wmVar.ja;
        if (toVar != null) {
            if (toVar.T > 0.0f && !toVar.S) {
                int inputBubbleTop = (int) wmVar.U.getInputBubbleTop();
                int inputBubbleBottom = (int) wmVar.U.getInputBubbleBottom();
                wm wmVar2 = wmVar.na;
                int i32 = inputBubbleTop - ((int) (wmVar.oa * (wmVar2 == null ? f14 : wmVar2.ia)));
                to toVar2 = wmVar.ja;
                klVar.getMeasuredWidth();
                toVar2.b(canvas3, i32, inputBubbleBottom);
            }
        }
        if (wmVar.na != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, klVar.getMeasuredWidth(), klVar.getMeasuredHeight(), (int) (wmVar.oa * 255.0f), 31);
            canvas3 = canvas;
            wmVar.na.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        wmVar.Ra.e(canvas3);
        if (i17 >= 0) {
            canvas3.restore();
        }
        if (wmVar.Ea) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (wmVar.Fa * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hk hkVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (hkVar = this.x0.Za) == null || !hkVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        hkVar.a(true);
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
        uj ujVar;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.x0;
        kh.e eVar = wmVar.c4;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y9 = (org.telegram.messenger.g0.E || wmVar.isInBubbleMode()) ? (wmVar.a0.getEmojiView() != null ? wmVar.a0.getEmojiView() : wmVar.a0).getY() : wmVar.a0.getY();
        View view = wmVar.Y8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        }
        mj mjVar = wmVar.a0;
        if (mjVar == null || !mjVar.A3 || motionEvent.getY() >= y9) {
            wmVar.D9 = motionEvent.getY();
            org.telegram.ui.Cells.t9 n4 = wmVar.r9.n(getContext());
            motionEvent.offsetLocation(-n4.getX(), -n4.getY());
            if (!wmVar.r9.x() || !wmVar.r9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n4.getX(), n4.getY());
                if (n4.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                gi.g1 g1Var = wmVar.F1;
                if (g1Var != null) {
                    if (wmVar.J3 != null) {
                        z10 = g1Var.A(motionEvent);
                        if (wmVar.F1.I) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !wmVar.r9.x() || (motionEvent.getY() >= wmVar.A0.getTop() && motionEvent.getY() <= wmVar.A0.getBottom())) {
                            ujVar = wmVar.Qa;
                            if (!ujVar.n) {
                                return ujVar.g(motionEvent);
                            }
                            b4.n nVar = b4.n.e;
                            if (nVar == null || !nVar.a) {
                                if (wmVar.isInPreviewMode() && wmVar.da) {
                                    if (motionEvent.getAction() == 0) {
                                        int i3 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (wmVar.y1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                k4.j jVar = wmVar.y1.e[i10 == 0 ? 1 : i10 == 1 ? i3 : i11];
                                                if (jVar != null) {
                                                    ((lh.b) jVar.a).getLocationInWindow(iArr2);
                                                    Rect rect = org.telegram.messenger.g0.Q;
                                                    int i12 = iArr2[0] - iArr[0];
                                                    rect.set(i12, iArr2[1] - iArr[1], org.telegram.messenger.g0.L(56.0f) + i12, org.telegram.messenger.g0.L(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                i10++;
                                                i3 = 2;
                                            }
                                        }
                                        z11 = false;
                                        qi qiVar = wmVar.p1;
                                        if (qiVar != null) {
                                            qiVar.getLocationInWindow(iArr2);
                                            Rect rect2 = org.telegram.messenger.g0.Q;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], wmVar.p1.getMeasuredWidth() + i13, wmVar.p1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.s0 = motionEvent.getX();
                                                    this.t0 = motionEvent.getY();
                                                    this.u0 = SystemClock.elapsedRealtime();
                                                    this.v0 = z12;
                                                    qi qiVar2 = wmVar.p1;
                                                    if (qiVar2 != null) {
                                                        qiVar2.i0.c(z12);
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
                                        qi qiVar3 = wmVar.p1;
                                        if (qiVar3 != null) {
                                            qiVar3.i0.c(false);
                                        }
                                        if (this.v0 || (a7.h.a(this.s0, this.t0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.L(6.0f) && SystemClock.elapsedRealtime() - this.u0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.v0) {
                                                q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                                                wmVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) q4Var2).S(ProfileActivity.A4(wmVar.k6));
                                            } else {
                                                q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                                                ((ActionBarLayout) q4Var).r();
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
                                t4 t4Var = (t4) b4.n.p().d;
                                if (t4Var != null) {
                                    t4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n4.getX(), -n4.getY());
                            if (wmVar.r9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n4.getX(), n4.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = g1Var.e;
                        if (g1Var.I) {
                            g1Var.J = true;
                            g1Var.I = false;
                            g1Var.E(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                g1Var.E(view2, g1Var.E ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            g1Var.d = 0;
                            g1Var.c = 1.0f;
                            org.telegram.ui.Components.d61 d61Var = g1Var.N;
                            if (d61Var != null) {
                                d61Var.e(1.0f, 0, g1Var.b);
                            }
                            g1Var.v(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                ujVar = wmVar.Qa;
                if (!ujVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wm wmVar = this.x0;
        org.telegram.ui.Components.n01 n01Var = wmVar.n0;
        float progress = (view == n01Var || view == this.M || view == wmVar.Z || (view instanceof org.telegram.ui.ActionBar.i5) || n01Var == null) ? 0.0f : n01Var.getProgress() * wmVar.n0.getContentWidth();
        if (progress <= 0.0f) {
            return Z(canvas, view, j10);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j10);
        canvas.restore();
        return Z;
    }

    @Override // org.telegram.ui.Components.qt0
    public float getBottomOffset() {
        return this.x0.A0.getBottom();
    }

    public wm getChatActivity() {
        return this.x0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.x0.getThemedColor(org.telegram.ui.ActionBar.k6.ua);
        ColorDrawable colorDrawable = this.w0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.w0 = new ColorDrawable(themedColor);
        }
        return this.w0;
    }

    @Override // org.telegram.ui.Components.qt0
    public int getKeyboardHeight() {
        if (this.x0.jb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.qt0
    public float getListTranslationY() {
        return this.x0.A0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.qt0
    public Drawable getNewDrawable() {
        wm wmVar = this.x0;
        if (wmVar.Q9()) {
            return getCompactBackground();
        }
        Drawable m10 = wmVar.ya.m();
        return m10 != null ? m10 : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.qt0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.x0.ya.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.qt0
    public int getScrollOffset() {
        return this.x0.A0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        View view;
        super.onAttachedToWindow();
        wm wmVar = this.x0;
        if (wmVar.jb) {
            this.I.b = wmVar.m1;
        } else {
            q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                if (((ActionBarLayout) q4Var2).b) {
                    org.telegram.ui.ActionBar.h1 h1Var = this.I;
                    q4Var3 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                    h1Var.b = (FrameLayout) q4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.I.c();
        wmVar.a0.setAdjustPanLayoutHelper(this.I);
        org.telegram.messenger.zi ziVar = MediaController.B().v0;
        if (ziVar != null && ((ziVar.i4() || org.telegram.messenger.zi.M4(ziVar.k)) && ziVar.T == 0 && org.telegram.messenger.zi.B0(ziVar.k) == wmVar.k6)) {
            MediaController.B().p0(wmVar.c8(false), wmVar.K8, wmVar.I8, true);
        }
        to toVar = wmVar.ja;
        if (toVar != null) {
            toVar.G.P();
            org.telegram.ui.Components.g5 g5Var = toVar.l0;
            if (g5Var != null && (view = toVar.b0) != null) {
                g5Var.a(view);
            }
            org.telegram.messenger.hs.f(toVar.f0).c(toVar, org.telegram.messenger.hs.r);
        }
        wmVar.Ra.i();
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.I.d();
        wm wmVar = this.x0;
        to toVar = wmVar.ja;
        if (toVar != null) {
            org.telegram.messenger.hs.f(toVar.f0).n(toVar, org.telegram.messenger.hs.r);
            toVar.G.R();
            org.telegram.ui.Components.g5 g5Var = toVar.l0;
            if (g5Var != null && (view = toVar.b0) != null) {
                g5Var.n(view);
            }
            toVar.R = 0.0f;
            toVar.Q = 0L;
            wmVar.ja = null;
        }
        wmVar.Ra.j();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.hc(17));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        wm wmVar;
        gi.n5 n5Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (n5Var = (wmVar = this.x0).N2) == null || !n5Var.a() || wmVar.N2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        if (r8 != r3.hd) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
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
        wm wmVar = this.x0;
        ri riVar = wmVar.w;
        int i20 = (measuredWidth - wmVar.ob) - wmVar.pb;
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
                int i23 = i22 & org.telegram.messenger.hs.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    e10 = k2.p1.e(i20, measuredWidth2, 2, wmVar.ob) + layoutParams.leftMargin;
                    i13 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i14 = wmVar.ob + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i17 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
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
                            if (childAt != wmVar.ga && childAt != wmVar.ra && childAt != wmVar.U && !(childAt instanceof org.telegram.ui.Components.u20) && childAt != wmVar.n0) {
                                if (childAt instanceof org.telegram.ui.Cells.t9) {
                                    i18 = wmVar.Ua;
                                } else if (childAt == wmVar.f1) {
                                    kVar3 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                        i19 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    i17 += i19;
                                } else if (wmVar.a0.s0(childAt)) {
                                    if (!org.telegram.messenger.g0.E) {
                                        z11 = ((org.telegram.ui.ActionBar.d2) wmVar).inBubbleMode;
                                        if (!z11) {
                                            i17 = wmVar.a0.getBottom();
                                        }
                                    }
                                    i17 = wmVar.a0.getTop() - childAt.getMeasuredHeight();
                                    L = org.telegram.messenger.g0.L(1.0f);
                                    i17 += L;
                                } else {
                                    mj mjVar = wmVar.a0;
                                    if (mjVar != null && (childAt == mjVar.P1 || childAt == mjVar.O1)) {
                                        i17 = org.telegram.messenger.camera.q.w(7.0f, riVar.e(), i17);
                                        i14 -= org.telegram.messenger.g0.L(3.0f);
                                    } else if (childAt == wmVar.L2) {
                                        i17 = org.telegram.messenger.camera.q.w(7.0f, riVar.e(), i17);
                                    } else if (mjVar != null && childAt == mjVar.f1) {
                                        i17 = org.telegram.messenger.camera.q.w(9.0f, riVar.e(), i17);
                                    } else if (childAt == wmVar.A0 || childAt == wmVar.y0 || childAt == wmVar.m3 || childAt == wmVar.n3 || childAt == wmVar.o3) {
                                        i18 = wmVar.Ua;
                                    } else if (childAt != wmVar.R) {
                                        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                        if (childAt == kVar) {
                                            i17 -= getPaddingTop();
                                            if (wmVar.isInPreviewMode()) {
                                                L = org.telegram.messenger.g0.L(1.0f);
                                                i17 += L;
                                            }
                                        } else if (childAt == wmVar.I8) {
                                            kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                            i17 = kVar2.getMeasuredHeight();
                                        } else if (childAt != wmVar.q3 && childAt != wmVar.r3 && childAt != wmVar.x0) {
                                            if (childAt instanceof org.telegram.ui.Components.da0) {
                                                i17 = org.telegram.messenger.g0.m;
                                            } else if (childAt != wmVar.V) {
                                                if (childAt != wmVar.c4) {
                                                }
                                            }
                                        }
                                    } else if (mjVar.y0()) {
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
                    e10 = (measuredWidth - wmVar.pb) - measuredWidth2;
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
        cj cjVar = wmVar.n3;
        if (cjVar != null) {
            cjVar.setBackgroundHeight(getMeasuredHeight());
        }
        wmVar.K9();
        wmVar.M9();
        wmVar.rd(false, false);
        R();
        wmVar.H7();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x053b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int childCount;
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.Components.ac acVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i13;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.w wVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.q0 q0Var2;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        wm wmVar = this.x0;
        ri riVar = wmVar.w;
        int i14 = (size - wmVar.ob) - wmVar.pb;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
        si.a aVar = wmVar.N.a;
        if (aVar instanceof si.b) {
            ((si.b) aVar).b(i14, size2);
        }
        int i15 = 0;
        if (this.i0 != i14) {
            wmVar.S4 = false;
            this.i0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
            if (z13 || (user = wmVar.f) == null || !user.self) {
                wmVar.ea = false;
            } else {
                org.telegram.ui.ActionBar.k5 titleTextView = wmVar.p1.getTitleTextView();
                if (i14 - org.telegram.messenger.g0.L(152.0f) > org.telegram.messenger.g0.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    wmVar.ea = !wmVar.fa;
                } else {
                    wmVar.ea = false;
                }
            }
            if (wmVar.ea || wmVar.fa || org.telegram.messenger.l10.v(wmVar.f)) {
                qi qiVar = wmVar.p1;
                if (qiVar != null && qiVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) wmVar.p1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(wmVar.g4 == 3 && ((q0Var = wmVar.m0) == null || q0Var.getVisibility() != 0) ? 52.0f : 92.0f);
                }
            } else {
                qi qiVar2 = wmVar.p1;
                if (qiVar2 != null && qiVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) wmVar.p1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(52.0f);
                }
            }
            if (wmVar.ea) {
                kVar8 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (!kVar8.o0 && (q0Var2 = wmVar.p0) != null) {
                    q0Var2.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var3 = wmVar.j0;
                if (q0Var3 != null) {
                    q0Var3.t(40);
                }
            } else {
                org.telegram.ui.ActionBar.q0 q0Var4 = wmVar.j0;
                if (q0Var4 != null) {
                    q0Var4.S(40);
                }
                org.telegram.ui.ActionBar.q0 q0Var5 = wmVar.p0;
                if (q0Var5 != null) {
                    q0Var5.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (!kVar7.o0 && (wVar = wmVar.q0) != null) {
                wVar.e((!wmVar.fa || wmVar.ea) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.q0 q0Var6 = wmVar.j0;
            if (q0Var6 != null) {
                TLRPC.UserFull userFull = wmVar.r8;
                if (wmVar.fa) {
                    q0Var6.t(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    q0Var6.S(32);
                }
            }
            wmVar.S4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + wmVar.Ia >= org.telegram.messenger.g0.L(20.0f);
        if (this.h0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (wmVar.Ja > 0 && keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            wmVar.Ia = wmVar.Ja;
        } else if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            wmVar.Ia = wmVar.a0.r0() ? wmVar.a0.getEmojiPadding() : 0;
        } else {
            wmVar.Ia = 0;
        }
        setEmojiKeyboardHeight(wmVar.Ia);
        boolean z15 = this.f + wmVar.Ia >= org.telegram.messenger.g0.L(20.0f);
        if (MediaController.B().v0 != null && MediaController.B().v0.i4() && z14 != z15) {
            for (int i16 = 0; i16 < wmVar.A0.getChildCount(); i16++) {
                View childAt = wmVar.A0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.zi messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    if (messageObject.i4() && MediaController.B().I(messageObject)) {
                        wmVar.A0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            wmVar.C0.i1(R, (int) (((((wmVar.A0.getMeasuredHeight() - wmVar.M9) - wmVar.Va) + ((this.f + wmVar.Ia) - r1)) - (z15 ? org.telegram.messenger.g0.u : org.telegram.messenger.g0.g3(wmVar.Z9(), wmVar.Q9()))) / 2.0f), false);
                            wmVar.D0.g(R);
                            this.I.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(wmVar.a0, makeMeasureSpec, 0, i10, 0);
                            z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
                            if (!z10 || wmVar.jb) {
                                this.g0 = 0;
                            } else {
                                this.g0 = wmVar.a0.getMeasuredHeight();
                            }
                            wmVar.Ua = 0;
                            wmVar.Va = 0;
                            if (org.telegram.messenger.az.f() && !wmVar.jb && wmVar.H != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = wmVar.I;
                                wmVar.Ua = i18;
                                wmVar.Va = i18;
                            }
                            i11 = 0;
                            while (i11 < childCount) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i11);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != wmVar.a0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                        if (childAt2 != kVar4) {
                                            if (a0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == wmVar.A0 || childAt2 == wmVar.y0 || (childAt2 instanceof org.telegram.ui.Cells.t9)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), wmVar.Ua + size2 + wmVar.Va), TLObject.FLAG_30));
                                                } else if (childAt2 == wmVar.R) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int L = org.telegram.messenger.g0.L(10.0f);
                                                    int i20 = i17 - this.g0;
                                                    z12 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, org.telegram.messenger.g0.L((wmVar.a0.y0() ? 48 : i15) + 2) + (i20 - (z12 ? org.telegram.messenger.g0.m : i15))), TLObject.FLAG_30));
                                                } else if (childAt2 == wmVar.q3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    wmVar.q3.setInternalPadding(org.telegram.messenger.g0.L(12.0f) + riVar.e() + ((int) wmVar.Yc));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == wmVar.r3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - riVar.e()) - ((int) wmVar.Yc)) - org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == wmVar.f1) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                                } else if (wmVar.a0.s0(childAt2)) {
                                                    org.telegram.ui.Components.gf gfVar = wmVar.a0.I1;
                                                    if (childAt2 == gfVar && gfVar != null) {
                                                        i19 = gfVar.getKeyboardHeight();
                                                    }
                                                    z11 = ((org.telegram.ui.ActionBar.d2) wmVar).inBubbleMode;
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
                                                    fj fjVar = wmVar.X1;
                                                    if (childAt2 == fjVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fjVar.getLayoutParams();
                                                        kg.e1 adapter = wmVar.X1.getAdapter();
                                                        if (adapter.x0 == null || adapter.i0) {
                                                            wmVar.X1.setIgnoreLayout(true);
                                                            layoutParams.height = i17;
                                                            layoutParams.topMargin = 0;
                                                            wmVar.X1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == wmVar.r9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                        int i21 = i17 + wmVar.Ua;
                                                        if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f) || getLayoutParams().height >= 0 || wmVar.jb) {
                                                            ll llVar = wmVar.r9;
                                                            llVar.d0 = 0;
                                                            llVar.w();
                                                        } else {
                                                            i21 += keyboardHeight;
                                                            ll llVar2 = wmVar.r9;
                                                            llVar2.d0 = keyboardHeight;
                                                            llVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.da0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n, TLObject.FLAG_30));
                                                    } else if (childAt2 == wmVar.g2) {
                                                        kVar5 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                                        if (kVar5.getVisibility() == 0) {
                                                            kVar6 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
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
                            if (wmVar.R4) {
                                wmVar.S4 = true;
                                wmVar.K9();
                                wmVar.M9();
                                wmVar.R4 = false;
                                wi wiVar = wmVar.A0;
                                wiVar.measure(View.MeasureSpec.makeMeasureSpec(wiVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(wmVar.A0.getMeasuredHeight(), TLObject.FLAG_30));
                                wmVar.S4 = false;
                            }
                            i12 = wmVar.M4;
                            if (i12 != -1) {
                                org.telegram.messenger.g0.h3(new cg.l0(this, i12, 27));
                                wmVar.M4 = -1;
                            }
                            acVar = org.telegram.ui.Components.ac.w;
                            if (acVar != null && wmVar.Bc != null) {
                                acVar.l();
                            }
                            wmVar.g7();
                            this.h0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.he heVar = wmVar.a0.Z3;
        org.telegram.messenger.g0.r(heVar);
        heVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(wmVar.a0, makeMeasureSpec, 0, i10, 0);
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        if (z10) {
        }
        this.g0 = 0;
        wmVar.Ua = 0;
        wmVar.Va = 0;
        if (org.telegram.messenger.az.f()) {
            int i182 = wmVar.I;
            wmVar.Ua = i182;
            wmVar.Va = i182;
        }
        i11 = 0;
        while (i11 < childCount) {
        }
        if (wmVar.R4) {
        }
        i12 = wmVar.M4;
        if (i12 != -1) {
        }
        acVar = org.telegram.ui.Components.ac.w;
        if (acVar != null) {
            acVar.l();
        }
        wmVar.g7();
        this.h0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        wm wmVar = this.x0;
        jh.d.c(wmVar.O8, wmVar.fragmentView);
        wmVar.P8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x0.S4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
        wm wmVar = this.x0;
        wmVar.P9 = i10;
        wmVar.K9();
        wmVar.M9();
    }

    @Override // org.telegram.ui.Components.qt0
    public final void L() {
    }

    @Override // org.telegram.ui.Components.qt0
    public final void V() {
    }

    @Override // org.telegram.ui.Components.qt0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
