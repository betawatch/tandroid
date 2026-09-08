package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class db extends ov0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 H0;
    public final /* synthetic */ pb I0;
    public float w0;
    public float x0;
    public float y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(pb pbVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = pbVar;
        this.H0 = n2Var;
        this.z0 = new float[8];
        this.A0 = new Path();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new RectF();
        this.G0 = new SparseArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        char c10;
        char c11;
        float f10;
        k5 k5Var;
        float f11;
        char c12;
        float f12;
        RectF rectF;
        float f13;
        float[] fArr;
        float f14;
        float f15;
        RectF rectF2;
        RectF rectF3;
        float f16;
        RectF rectF4;
        float f17;
        float f18;
        float f19;
        j9 j9Var;
        float f20;
        Paint paint;
        View view;
        j9 j9Var2;
        kb kbVar;
        jb jbVar;
        o5 currentPeerView;
        l4 l4Var;
        j9 j9Var3;
        int i10;
        o5 t10;
        bj0 bj0Var;
        pb pbVar = this.I0;
        RectF rectF5 = pbVar.T;
        mb mbVar = pbVar.s0;
        canvas.drawColor(i0.a.k(-16777216, (int) ((((1.0f - pbVar.V) * 0.5f) + 0.5f) * pbVar.U * 255.0f)));
        if (pbVar.b) {
            boolean z10 = (1.0f - pbVar.V) * pbVar.U == 1.0f;
            if (pbVar.K0 != z10) {
                pbVar.K0 = z10;
                org.telegram.ui.ActionBar.n2 n2Var = this.H0;
                if (n2Var.getLayoutContainer() != null) {
                    n2Var.getLayoutContainer().invalidate();
                }
            }
        }
        o5 currentPeerView2 = pbVar.n0.getCurrentPeerView();
        RectF rectF6 = this.F0;
        RectF rectF7 = this.E0;
        if (currentPeerView2 != null) {
            k5 k5Var2 = currentPeerView2.o1;
            if (pbVar.V0) {
                k5Var2.a.getImageReceiver().setVisible(pbVar.U == 1.0f, true);
            } else {
                k5Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (pbVar.h1) {
                pbVar.h1 = false;
                i5 i5Var = k5Var2.a;
                float f21 = 0.0f;
                float f22 = 0.0f;
                f7 = 255.0f;
                c10 = 1;
                for (View view2 = k5Var2.a; view2 != this; view2 = (View) view2.getParent()) {
                    if (view2.getParent() == this) {
                        f21 += view2.getLeft();
                        f22 += view2.getTop();
                    } else if (view2.getParent() != pbVar.n0) {
                        f21 += view2.getX();
                        f22 += view2.getY();
                    }
                }
                c11 = 0;
                f10 = 1.0f;
                rectF7.set(f21, f22, i5Var.getMeasuredWidth() + f21, i5Var.getMeasuredHeight() + f22);
                rectF6.set(0.0f, currentPeerView2.c1.getTop() + currentPeerView2.getTop(), pbVar.v.getMeasuredWidth(), pbVar.v.getMeasuredHeight());
                pbVar.v.getMatrix().mapRect(rectF7);
                pbVar.v.getMatrix().mapRect(rectF6);
            } else {
                f7 = 255.0f;
                c10 = 1;
                c11 = 0;
                f10 = 1.0f;
            }
            k5Var = k5Var2;
        } else {
            f7 = 255.0f;
            c10 = 1;
            c11 = 0;
            f10 = 1.0f;
            k5Var = null;
        }
        pbVar.d1.setAlpha(f10 - pbVar.V);
        float clamp = pbVar.X == 0.0f ? 1.0f - Utilities.clamp(Math.abs(pbVar.W / getMeasuredHeight()), 1.0f, 0.0f) : 1.0f;
        pbVar.n0.setHorizontalProgressToDismiss((pbVar.X / pbVar.v.getMeasuredWidth()) * pbVar.U);
        if (pbVar.N != 0.0f || pbVar.O != 0.0f) {
            float f23 = pbVar.U;
            if (f23 != 1.0f) {
                if (pbVar.H0 && pbVar.V0) {
                    float clamp2 = 1.0f - Utilities.clamp(((1.0f - f23) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f11 = 0.15f;
                    f12 = Utilities.clamp(com.google.android.gms.internal.vision.e2.b(1.0f, clamp2, 0.05f, f23), 1.0f, 0.0f);
                    c12 = 2;
                    pbVar.v.setAlpha(clamp2);
                } else {
                    f11 = 0.15f;
                    c12 = 2;
                    pbVar.v.setAlpha(1.0f);
                    f12 = f23;
                }
                if (!pbVar.H0 || mbVar == null || mbVar.c == null) {
                    rectF = rectF7;
                } else {
                    eb ebVar = pbVar.v;
                    rectF = rectF7;
                    ebVar.setAlpha(ebVar.getAlpha() * ((float) Math.pow(f23, 0.20000000298023224d)));
                }
                eb ebVar2 = pbVar.v;
                float left = (pbVar.N - ebVar2.getLeft()) - (pbVar.v.getMeasuredWidth() / 2.0f);
                float f24 = pbVar.U;
                ebVar2.setTranslationX((pbVar.X * f24) + ((1.0f - f24) * left));
                eb ebVar3 = pbVar.v;
                float top = (pbVar.O - ebVar3.getTop()) - (pbVar.v.getMeasuredHeight() / 2.0f);
                float f25 = pbVar.U;
                ebVar3.setTranslationY((pbVar.W * f25) + ((1.0f - f25) * top));
                float lerp = AndroidUtilities.lerp(pbVar.R / pbVar.v.getMeasuredWidth(), (clamp * f11) + 0.85f, f12);
                pbVar.v.setScaleX(lerp);
                pbVar.v.setScaleY(lerp);
                Path path = this.A0;
                path.rewind();
                float f26 = pbVar.N;
                float f27 = pbVar.R / 2.0f;
                float f28 = pbVar.O;
                float f29 = pbVar.S / 2.0f;
                float f30 = f29 + f28;
                RectF rectF8 = this.B0;
                rectF8.set(f26 - f27, f28 - f29, f27 + f26, f30);
                boolean z11 = pbVar.H0;
                RectF rectF9 = this.C0;
                if (z11 && pbVar.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.c1.getTop() + pbVar.b0, getMeasuredWidth(), getMeasuredHeight() + pbVar.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (pbVar.H0 && pbVar.V0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), pbVar.U);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), pbVar.U);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f12);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f12);
                if (pbVar.H0 && pbVar.V0) {
                    f13 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f13 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f31 = lerp5 / 2.0f;
                float f32 = lerp4 / 2.0f;
                rectF10.set(f13 - f31, lerp3 - f32, f13 + f31, lerp3 + f32);
                boolean z12 = pbVar.V0;
                float[] fArr2 = this.z0;
                if (z12) {
                    float lerp6 = AndroidUtilities.lerp(pbVar.R / 2.0f, 0.0f, f12);
                    fArr = fArr2;
                    fArr[7] = lerp6;
                    fArr[6] = lerp6;
                    fArr[5] = lerp6;
                    fArr[4] = lerp6;
                    fArr[3] = lerp6;
                    fArr[c12] = lerp6;
                    fArr[c10] = lerp6;
                    fArr[c11] = lerp6;
                } else {
                    fArr = fArr2;
                    int[] iArr = pbVar.W0;
                    if (iArr == null) {
                        f14 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[c12] = 0.0f;
                        fArr[c10] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f15 = pbVar.P;
                        if (f15 != f14 && pbVar.Q != f14) {
                            canvas.clipRect(f14, AndroidUtilities.lerp(f14, f15, (float) Math.pow(1.0f - pbVar.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), pbVar.Q, 1.0f - pbVar.U));
                        }
                        if (mbVar == null && (j9Var3 = mbVar.m) != null && j9Var3.w && pbVar.V0) {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f23 * f7), 31);
                        } else {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.D0;
                        if (mbVar != null || mbVar.c == null || (currentPeerView = pbVar.n0.getCurrentPeerView()) == null || (l4Var = currentPeerView.c1) == null) {
                            f16 = f23;
                            rectF4 = rectF2;
                            f17 = 0.0f;
                        } else {
                            boolean visible = mbVar.c.getVisible();
                            f17 = 0.0f;
                            rectF9.set(l4Var.getX() + currentPeerView.getX() + pbVar.X + pbVar.v.getLeft(), l4Var.getY() + currentPeerView.getY() + pbVar.W + pbVar.v.getTop(), ((pbVar.X + pbVar.v.getRight()) - (pbVar.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - l4Var.getRight()), ((pbVar.W + pbVar.v.getBottom()) - (pbVar.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - l4Var.getBottom()));
                            AndroidUtilities.lerp(rectF2, rectF9, f23, rectF11);
                            float imageX = mbVar.c.getImageX();
                            float imageY = mbVar.c.getImageY();
                            float imageWidth = mbVar.c.getImageWidth();
                            float imageHeight = mbVar.c.getImageHeight();
                            mbVar.c.setImageCoords(rectF11);
                            float f33 = 1.0f - f23;
                            mbVar.c.setAlpha(f33);
                            f16 = f23;
                            rectF4 = rectF2;
                            mbVar.c.setVisible(true, false);
                            int saveCount = canvas.getSaveCount();
                            jb jbVar2 = mbVar.f;
                            if (jbVar2 != null) {
                                jbVar2.h(f33, canvas, rectF11, pbVar.E);
                            }
                            mbVar.c.draw(canvas);
                            kb kbVar2 = mbVar.e;
                            if (kbVar2 != null) {
                                kbVar2.h(canvas, rectF11, f33);
                            }
                            mbVar.c.setVisible(visible, false);
                            mbVar.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (k5Var != null) {
                            i5 i5Var2 = k5Var.a;
                            float f34 = pbVar.X;
                            float f35 = pbVar.W;
                            if (pbVar.H0 && pbVar.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = i5Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f34 += view3.getLeft();
                                        f35 += view3.getTop();
                                    } else if (view3.getParent() != pbVar.n0) {
                                        float x10 = view3.getX() + f34;
                                        f35 = view3.getY() + f35;
                                        f34 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f34, f35, i5Var2.getMeasuredWidth() + f34, i5Var2.getMeasuredHeight() + f35);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, pbVar.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (mbVar != null && (jbVar = mbVar.f) != null) {
                                jbVar.h(1.0f - f16, canvas, rectF11, pbVar.E);
                            }
                            if (pbVar.V0) {
                                boolean z13 = (mbVar == null || mbVar.l == null) ? false : true;
                                if (z13 && pbVar.U == f17) {
                                    f18 = f16;
                                } else {
                                    if (mbVar != null && (j9Var2 = mbVar.m) != null && j9Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    i5Var2.getImageReceiver().setImageCoords(rectF11);
                                    i5Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((mbVar == null || mbVar.b == null) ? null : Integer.valueOf((int) (mbVar.b.getRoundRadius()[0] * ((!mbVar.n || (view = mbVar.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) mbVar.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - pbVar.U));
                                    i5Var2.getImageReceiver().setVisible(true, false);
                                    float f36 = z13 ? pbVar.U : 1.0f;
                                    if (mbVar == null || mbVar.k >= 1.0f || (paint = mbVar.j) == null) {
                                        f18 = f16;
                                        f19 = f36;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f16) * f7));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, mbVar.j);
                                        f18 = f16;
                                        f19 = AndroidUtilities.lerp(mbVar.k, f36, f18);
                                    }
                                    i5Var2.getImageReceiver().setAlpha(f19);
                                    k5Var.b(pbVar.U, canvas, rectF11, !pb.A1);
                                    i5Var2.getImageReceiver().draw(canvas);
                                    i5Var2.getImageReceiver().setAlpha(f36);
                                    i5Var2.getImageReceiver().setVisible(false, false);
                                    if (mbVar != null && (j9Var = mbVar.m) != null && j9Var.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f20 = 1.0f;
                                        p9.k(canvas, rectF12, 1.0f - pbVar.U, true, 0.0f);
                                        canvas.restore();
                                        if (pbVar.U != f20 && z13) {
                                            RectF rectF13 = rectF3;
                                            rectF13.set(mbVar.l.getImageX(), mbVar.l.getImageY(), mbVar.l.getImageX2(), mbVar.l.getImageY2());
                                            int i11 = mbVar.l.getRoundRadius()[0];
                                            boolean visible2 = mbVar.l.getVisible();
                                            mbVar.l.setImageCoords(rectF11);
                                            mbVar.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            mbVar.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - pbVar.U) * f7), 31);
                                            mbVar.l.draw(canvas);
                                            canvas.restore();
                                            mbVar.l.setVisible(visible2, false);
                                            mbVar.l.setImageCoords(rectF13);
                                            mbVar.l.setRoundRadius(i11);
                                        }
                                        if (mbVar != null && (kbVar = mbVar.e) != null) {
                                            kbVar.h(canvas, rectF11, 1.0f - f18);
                                        }
                                    }
                                }
                                f20 = 1.0f;
                                if (pbVar.U != f20) {
                                    RectF rectF132 = rectF3;
                                    rectF132.set(mbVar.l.getImageX(), mbVar.l.getImageY(), mbVar.l.getImageX2(), mbVar.l.getImageY2());
                                    int i112 = mbVar.l.getRoundRadius()[0];
                                    boolean visible22 = mbVar.l.getVisible();
                                    mbVar.l.setImageCoords(rectF11);
                                    mbVar.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    mbVar.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - pbVar.U) * f7), 31);
                                    mbVar.l.draw(canvas);
                                    canvas.restore();
                                    mbVar.l.setVisible(visible22, false);
                                    mbVar.l.setImageCoords(rectF132);
                                    mbVar.l.setRoundRadius(i112);
                                }
                                if (mbVar != null) {
                                    kbVar.h(canvas, rectF11, 1.0f - f18);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (pbVar.M != null) {
                            float clamp3 = Utilities.clamp(pbVar.U / 0.4f, 1.0f, 0.0f);
                            if (clamp3 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f37 = pbVar.N;
                                float f38 = pbVar.O;
                                rectF14.set(f37, f38, pbVar.R + f37, pbVar.S + f38);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp3 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp3) * f7), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(pbVar.K, pbVar.L);
                                ((org.telegram.ui.Cells.r2) pbVar.M).B(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (pb.A1) {
                            ArrayList arrayList = pbVar.x0;
                            pbVar.Q();
                            pbVar.U = 0.0f;
                            pbVar.M(true);
                            pbVar.d = false;
                            pb.x1 = true;
                            pbVar.b0 = pbVar.W;
                            if (mbVar.d != null && (t10 = pbVar.t()) != null && (bj0Var = t10.o1.d) != null) {
                                bj0 bj0Var2 = mbVar.d;
                                bj0Var.c = bj0Var2.c;
                                bj0Var.f = bj0Var2.f;
                                bj0Var.b = bj0Var2.b;
                                bj0Var.a = System.currentTimeMillis();
                                bj0Var.c();
                            }
                            pbVar.E = true;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            pbVar.F = ofFloat;
                            ofFloat.addUpdateListener(new xa(pbVar, 1));
                            pbVar.J0.lock();
                            eb ebVar4 = pbVar.v;
                            if (ebVar4 != null) {
                                b0.c = true;
                                i10 = 2;
                                ebVar4.setLayerType(2, null);
                            } else {
                                i10 = 2;
                            }
                            pbVar.F.addListener(new ya(pbVar, i10));
                            pbVar.F.setStartDelay(40L);
                            pbVar.F.setDuration(250L);
                            pbVar.F.setInterpolator(pr.f);
                            pbVar.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((Runnable) arrayList.get(i12)).run();
                                }
                                arrayList.clear();
                            }
                            pb.A1 = false;
                            return;
                        }
                        return;
                    }
                    float lerp7 = AndroidUtilities.lerp(iArr[c11], 0, f23);
                    fArr[c10] = lerp7;
                    fArr[0] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(pbVar.W0[c10], 0, f23);
                    fArr[3] = lerp8;
                    fArr[c12] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(pbVar.W0[c12], 0, f23);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(pbVar.W0[3], 0, f23);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f14 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f15 = pbVar.P;
                if (f15 != f14) {
                    canvas.clipRect(f14, AndroidUtilities.lerp(f14, f15, (float) Math.pow(1.0f - pbVar.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), pbVar.Q, 1.0f - pbVar.U));
                }
                if (mbVar == null) {
                }
                rectF2 = rectF8;
                rectF3 = rectF5;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.D0;
                if (mbVar != null) {
                }
                f16 = f23;
                rectF4 = rectF2;
                f17 = 0.0f;
                canvas.restore();
                if (k5Var != null) {
                }
                if (pbVar.M != null) {
                }
                canvas.restore();
                if (pb.A1) {
                }
            }
        }
        pbVar.v.setAlpha(pbVar.U);
        float f39 = (clamp * 0.15f) + (pbVar.U * 0.1f) + 0.75f;
        pbVar.v.setScaleX(f39);
        pbVar.v.setScaleY(f39);
        pbVar.v.setTranslationY(pbVar.W);
        pbVar.v.setTranslationX(pbVar.X);
        super.dispatchDraw(canvas);
        if (pb.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        pb pbVar = this.I0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            pbVar.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        pbVar.onAttachedBackPressed();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0310  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        fb fbVar;
        int i10;
        fk0 fk0Var;
        pb pbVar = this.I0;
        float[] fArr = pbVar.o0;
        o5 currentPeerView = pbVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            s4 s4Var = currentPeerView.K0;
            if (s4Var.W.y()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!s4Var.W.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        int i11 = 0;
        if (pbVar.p1 && currentPeerView != null && (fk0Var = currentPeerView.r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.r3.getReactionsWindow() != null && currentPeerView.r3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.r3.getReactionsWindow().c.getTranslationY());
                currentPeerView.r3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            fk0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            fk0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            pbVar.j0 = false;
            AndroidUtilities.cancelRunOnUIThread(pbVar.b1);
            float f11 = pbVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                pbVar.G = ofFloat;
                ofFloat.addUpdateListener(new ab(this, i11));
                pbVar.G.addListener(new bb(this, i11));
                pbVar.G.setDuration(250L);
                pbVar.G.setInterpolator(pr.f);
                pbVar.G.start();
            }
            if (pbVar.V >= 0.3f) {
                pbVar.q(true);
            }
            pbVar.K(false);
            pbVar.L(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            pbVar.a0 = false;
            if (currentPeerView != null) {
                g5 g5Var = currentPeerView.y0;
                ua uaVar = currentPeerView.C0;
                l4 l4Var = currentPeerView.c1;
                di.f4 f4Var = currentPeerView.F0;
                if (f4Var != null && f4Var.V && uaVar != null && !f4Var.r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (l4Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (l4Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, uaVar)) {
                    currentPeerView.F0.e(true);
                }
                di.f4 f4Var2 = currentPeerView.G0;
                if (f4Var2 != null && f4Var2.V && g5Var != null && !f4Var2.r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (l4Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (l4Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, g5Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            pbVar.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (pbVar.x || pbVar.H0 || pbVar.I0) ? false : true;
        float f12 = pbVar.e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !pbVar.j0 && pbVar.n0.F0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (fbVar = pbVar.n0).I0) == 0 && fbVar.K0 == 0.0f && floatValue < 0.0f) || (i10 == fbVar.getAdapter().b() - 1 && fbVar.K0 == 0.0f && floatValue > 0.0f))) || pbVar.X != 0.0f) {
                float f13 = pbVar.X;
                if (f13 == 0.0f) {
                    pbVar.Y = -floatValue;
                }
                if ((floatValue < 0.0f && pbVar.Y > 0.0f) || (floatValue > 0.0f && pbVar.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                pbVar.X = f13 - floatValue;
                pb.k(pbVar);
                float f14 = pbVar.X;
                if ((f14 > 0.0f && pbVar.Y < 0.0f) || (f14 < 0.0f && pbVar.Y > 0.0f)) {
                    pbVar.X = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && pbVar.e0 == 0.0f && !pbVar.j0 && !pbVar.L0 && !pbVar.I0 && pbVar.n0.F0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    o5 currentPeerView2 = pbVar.n0.getCurrentPeerView();
                    currentPeerView2.X2.a(motionEvent, currentPeerView2.c1, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                        sparseArray.put(motionEvent.getPointerId(i12), Float.valueOf(motionEvent.getX(i12)));
                    }
                }
                if (!z11) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (pbVar.e0 != 0.0f && !pbVar.g1 && pbVar.p0 < AndroidUtilities.dp(20.0f)) {
                            pbVar.n(pbVar.w.f > 0.5f);
                        }
                        o5 t10 = pbVar.t();
                        if (t10 != null) {
                            t10.K0.w0 = false;
                        }
                    }
                    if (z10 && !pbVar.a0) {
                        pbVar.m();
                    }
                    if (!dispatchTouchEvent && (!pb.x1 || !pbVar.q0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = false;
        if (currentPeerView != null) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            o5 currentPeerView22 = pbVar.n0.getCurrentPeerView();
            currentPeerView22.X2.a(motionEvent, currentPeerView22.c1, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1) {
        }
        sparseArray.clear();
        if (!z11) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.I0.y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pb pbVar = this.I0;
        if (pbVar.b && !pbVar.c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        qc.a(this, new cb(this));
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        pb pbVar = this.I0;
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.storyDeleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e7  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f7;
        e3 e3Var;
        ob obVar;
        o5 currentPeerView;
        boolean z10;
        oa oaVar;
        n5 n5Var;
        o5 currentPeerView2;
        m5 m5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        e3 e3Var2;
        pb pbVar = this.I0;
        p4 p4Var = pbVar.b1;
        if (motionEvent.getAction() == 0 && pbVar.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.y0 = x10;
            this.w0 = x10;
            this.x0 = motionEvent.getY();
            pbVar.g0 = false;
            pbVar.f0 = (pbVar.I0 || pb.i(pbVar, pbVar.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            pbVar.h0 = (pbVar.I0 || pb.i(pbVar, pbVar.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            pbVar.K(pbVar.f0 && !pbVar.m1);
            o5 t10 = pbVar.t();
            if (pbVar.f0 && t10 != null && (e3Var2 = t10.L0) != null) {
                e3Var2.setAllowTouches(false);
            }
            if (pbVar.f0 && !pbVar.I0 && pbVar.m1) {
                oa oaVar2 = new oa(this, 3);
                pbVar.n1 = oaVar2;
                AndroidUtilities.runOnUIThread(oaVar2, 150L);
            }
            if (pbVar.f0 && !pbVar.x && !pbVar.I0 && !pbVar.j1) {
                AndroidUtilities.runOnUIThread(p4Var, 400L);
            }
            f7 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.x0 - motionEvent.getY());
            float abs2 = Math.abs(this.w0 - motionEvent.getX());
            if (pbVar.a1 && pbVar.k0 && !pbVar.f1 && !pbVar.j0 && (n5Var = pbVar.G0) != null && ((ob) n5Var.c) != null && (currentPeerView2 = pbVar.n0.getCurrentPeerView()) != null && (m5Var = currentPeerView2.O1) != null && m5Var.b == null && m5Var.e) {
                long j3 = currentPeerView2.R2;
                if (j3 <= 0 && (storyItem = m5Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j3 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j3 > 0) {
                    float x11 = motionEvent.getX();
                    ob obVar2 = (ob) pbVar.G0.c;
                    f7 = 1.0f;
                    if (((int) (obVar2.seek((x11 - this.y0) / AndroidUtilities.dp(220.0f), j3) * 10.0f)) != ((int) (obVar2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.c1.invalidate();
                    this.y0 = x11;
                    if (abs > abs2 && !pbVar.k0 && !pbVar.g0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        pbVar.g0 = true;
                    }
                    if (!pbVar.j0 && !pbVar.k0 && !pbVar.x && pbVar.h0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            pbVar.j0 = true;
                            currentPeerView = pbVar.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.p0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.O1.f && (currentPeerView.C1 || (currentPeerView.D1 && currentPeerView.B3));
                            pbVar.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || pbVar.u1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.c3 || currentPeerView.O1.a == null || pbVar.u1 != null) ? false : true;
                            pbVar.c0 = z10;
                            if (z10 && this.f != 0) {
                                pbVar.c0 = false;
                            }
                            if (pbVar.c0) {
                                pbVar.p();
                            }
                            pbVar.Z = 0.0f;
                            oaVar = pbVar.n1;
                            if (oaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(oaVar);
                                pbVar.n1.run();
                                pbVar.n1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(p4Var);
                        }
                        pbVar.y();
                    }
                }
            }
            f7 = 1.0f;
            if (abs > abs2) {
                pbVar.g0 = true;
            }
            if (!pbVar.j0) {
                if (abs > abs2) {
                    pbVar.j0 = true;
                    currentPeerView = pbVar.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    pbVar.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || pbVar.u1 != null) ? false : true;
                    if (z11) {
                    }
                    pbVar.c0 = z10;
                    if (z10) {
                        pbVar.c0 = false;
                    }
                    if (pbVar.c0) {
                    }
                    pbVar.Z = 0.0f;
                    oaVar = pbVar.n1;
                    if (oaVar != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(p4Var);
                }
                pbVar.y();
            }
        } else {
            f7 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(p4Var);
                oa oaVar3 = pbVar.n1;
                if (oaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(oaVar3);
                    pbVar.n1 = null;
                }
                pbVar.K(false);
                pbVar.g0 = false;
                pbVar.k0 = false;
                n5 n5Var2 = pbVar.G0;
                if (n5Var2 != null && (obVar = (ob) n5Var2.c) != null) {
                    obVar.setSeeking(false);
                }
                o5 t11 = pbVar.t();
                if (t11 != null && (e3Var = t11.L0) != null) {
                    e3Var.setAllowTouches(true);
                }
            }
        }
        a7 a7Var = pbVar.w;
        boolean z12 = a7Var != null && a7Var.f == f7;
        if (!pbVar.j0 && !z12) {
            pbVar.i0.onTouchEvent(motionEvent);
        }
        return pbVar.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        pb pbVar = this.I0;
        ((FrameLayout.LayoutParams) pbVar.d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        pbVar.d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e3 e3Var;
        int action = motionEvent.getAction();
        pb pbVar = this.I0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            pbVar.j0 = false;
            pbVar.K(false);
            if (pbVar.V >= 1.0f) {
                pbVar.q(true);
            } else if (!pbVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(pbVar.W, 0.0f);
                pbVar.G = ofFloat;
                ofFloat.addUpdateListener(new ab(this, i10));
                pbVar.G.addListener(new bb(this, i10));
                pbVar.G.setDuration(150L);
                pbVar.G.setInterpolator(pr.f);
                pbVar.G.start();
            }
            o5 t10 = pbVar.t();
            if (t10 != null && (e3Var = t10.L0) != null) {
                e3Var.setAllowTouches(true);
            }
        }
        if (!pbVar.j0 && !pbVar.x && pbVar.Z == 0.0f && ((pbVar.e0 == 0.0f || (!pbVar.f0 && !pbVar.g0)) && !pbVar.j1)) {
            return false;
        }
        pbVar.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f0 = false;
    }
}
