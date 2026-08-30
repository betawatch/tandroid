package org.telegram.ui;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pm extends org.telegram.ui.Components.qv0 {
    public Paint A0;
    public int B0;
    public float C0;
    public float D0;
    public long E0;
    public boolean F0;
    public final /* synthetic */ xn G0;
    public int t0;
    public int u0;
    public int v0;
    public final ArrayList w0;
    public final ArrayList x0;
    public final ArrayList y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(xn xnVar, Context context, org.telegram.ui.ActionBar.e5 e5Var) {
        super(context, e5Var);
        this.G0 = xnVar;
        this.t0 = 0;
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.E = new om(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.G0;
        xnVar.U0.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        kVar.setTranslationY(0.0f);
        al alVar = xnVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.l1 != null ? r3.getCurrentHeight() : 0);
        }
        ph.f3 f3Var = xnVar.t1;
        if (f3Var != null) {
            f3Var.setTranslationY(0.0f);
        }
        ph.f3 f3Var2 = xnVar.s1;
        if (f3Var2 != null) {
            f3Var2.setTranslationY(0.0f);
        }
        org.telegram.ui.Components.w21 w21Var = xnVar.O1;
        if (w21Var != null) {
            w21Var.setTranslationY(0.0f);
        }
        xnVar.N0.setTranslationY(0.0f);
        xnVar.M.setTranslationY(0.0f);
        xnVar.t9 = 0.0f;
        xnVar.u9 = 0.0f;
        xnVar.U0.setBackgroundTranslation(0);
        dl dlVar = xnVar.Y2;
        if (dlVar != null) {
            dlVar.q0 = 0.0f;
            dlVar.s();
        }
        eg.i0 i0Var = xnVar.v2;
        if (i0Var != null) {
            org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.b;
            x9Var.u = 0.0f;
            x9Var.d.invalidate();
        }
        xnVar.setFragmentPanTranslationOffset(0);
        xnVar.o9();
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.dc0) {
            ((org.telegram.ui.Components.dc0) drawable).p();
        }
        xn xnVar = this.G0;
        sg.a c3 = xnVar.T.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(xnVar.T.b(c3));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(xnVar.T.a(c3));
        xnVar.Ab = computePerceivedBrightness <= 0.721f;
        xnVar.Bb = computePerceivedBrightness2 <= 0.9f;
        xnVar.I.a = c3;
        wg.f fVar = xnVar.U;
        if (fVar != null) {
            fVar.invalidate();
        }
        ug.f fVar2 = xnVar.P;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        xnVar.n9();
        xnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f10, org.telegram.ui.Cells.t1 t1Var, int i10) {
        int save = canvas.save();
        xn xnVar = this.G0;
        float x10 = t1Var.getX() + xnVar.u0.getLeft();
        float y10 = t1Var.getY() + xnVar.u0.getY() + t1Var.getPaddingTop();
        float alpha = t1Var.a() ? t1Var.getAlpha() : 1.0f;
        canvas.clipRect(xnVar.u0.getLeft(), f10, xnVar.u0.getRight(), ((((xnVar.u0.getY() + xnVar.u0.getMeasuredHeight()) - xnVar.xa) - xnVar.v.d()) - xnVar.pc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y10);
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.m2(alpha, canvas, true);
        } else if (i10 == 1) {
            t1Var.W1(canvas, alpha);
        } else if (i10 == 2) {
            t1Var.I1(alpha, canvas, t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z4 = t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0;
            t1Var.N1(canvas, alpha);
            if (!z4) {
                t1Var.d2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && xnVar.J8 != null)) {
            float f11 = (xnVar.E8 * xnVar.H8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, xnVar.J8, f11, xnVar.F8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            t1Var.i2(this, canvas, xnVar.K8, xnVar.J8, f11);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ig igVar;
        xn xnVar = this.G0;
        ng.a aVar = xnVar.G;
        jk jkVar = xnVar.V;
        if (jkVar == null || view != jkVar.j0) {
            super.addView(view, i10, layoutParams);
        } else {
            wg.f fVar = xnVar.U;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        jk jkVar2 = xnVar.V;
        if (jkVar2 != null && view == jkVar2.j0) {
            rh.w wVar = (rh.w) view;
            wVar.setBackgroundDrawable(aVar.c(wVar.c, xnVar.x, false));
        }
        jk jkVar3 = xnVar.V;
        if (jkVar3 == null || view != (igVar = jkVar3.K1)) {
            return;
        }
        igVar.setBlurredBackgroundFactory(aVar);
    }

    public final boolean b0(View view) {
        if (view == this.I) {
            return true;
        }
        xn xnVar = this.G0;
        return view == xnVar.v2 || view == xnVar.n1 || view == xnVar.j9 || view == xnVar.U || view == xnVar.H3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0c29, code lost:
    
        if (r0.getVisibility() != 0) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0788, code lost:
    
        if ((r5 & 1) != 0) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a5, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0b7f  */
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Integer num;
        Paint paint;
        Paint paint2;
        float f10;
        View view;
        Paint paint3;
        Paint paint4;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Integer num2;
        View view2;
        Canvas canvas3;
        pm pmVar;
        float f11;
        View view3;
        org.telegram.ui.Components.pa0 pa0Var;
        org.telegram.ui.Components.pa0 pa0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        tm tmVar;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        tm tmVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f12;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f13;
        float f14;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        Paint paint12;
        tm tmVar3;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i11;
        int i12;
        ArrayList arrayList5;
        org.telegram.ui.Cells.t1 t1Var2;
        ArrayList arrayList6;
        ch.i iVar;
        Integer num4;
        float f15;
        float f16;
        boolean z4;
        tm tmVar4;
        tm tmVar5;
        org.telegram.ui.Components.pa0 pa0Var3;
        float f17;
        float f18;
        tm tmVar6;
        tm tmVar7;
        tm tmVar8;
        tm tmVar9;
        Canvas canvas4;
        float f19;
        float f20;
        View view9;
        float f21;
        float f22;
        Integer num5;
        float f23;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.v0 v0Var2;
        Paint paint14;
        float f24;
        float f25;
        Paint paint15;
        float f26;
        float f27;
        float f28;
        float f29;
        tm tmVar10;
        tm tmVar11;
        Integer num7;
        tm tmVar12;
        tm tmVar13;
        Integer num8;
        pm pmVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        Paint paint17;
        Paint paint18;
        float f30;
        float f31;
        View view10;
        Paint paint19;
        float f32;
        float f33;
        Paint paint20;
        float f34;
        float f35;
        float f36;
        Canvas canvas5;
        float f37;
        float f38;
        tm tmVar14;
        tm tmVar15;
        Integer num9;
        tm tmVar16;
        tm tmVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f39;
        Integer num11;
        tm tmVar18;
        tm tmVar19;
        Integer num12;
        org.telegram.ui.Components.df dfVar;
        org.telegram.ui.Components.pa0 pa0Var4;
        org.telegram.ui.Components.pa0 pa0Var5;
        org.telegram.ui.Cells.t1 t1Var3;
        float f40;
        tm tmVar20;
        org.telegram.ui.Cells.t1 t1Var4;
        boolean z10;
        org.telegram.ui.Components.pa0 pa0Var6;
        float f41;
        org.telegram.ui.Components.pa0 pa0Var7;
        float f42;
        tm tmVar21;
        org.telegram.ui.Components.pa0 pa0Var8;
        org.telegram.ui.Components.pa0 pa0Var9;
        tm tmVar22;
        View view11;
        float f43;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.k kVar6;
        View view15;
        float f44;
        Paint paint23;
        float f45;
        float f46;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f47;
        Integer num13;
        float f48;
        Paint paint25;
        Paint paint26;
        float f49;
        float f50;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        Paint paint29;
        float f51;
        Paint paint30;
        float f52;
        float f53;
        Paint paint31;
        View view24;
        org.telegram.ui.ActionBar.k kVar7;
        int i13;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.k40 k40Var;
        View view25;
        ej ejVar;
        View view26;
        sj sjVar;
        pm pmVar3 = this;
        xn xnVar = pmVar3.G0;
        ch.i iVar2 = xnVar.v;
        ArrayList arrayList7 = xnVar.k6;
        xnVar.V.T1();
        xnVar.jc();
        if (xnVar.oa || ((sjVar = xnVar.v0) != null && sjVar.k())) {
            xnVar.oa = false;
            xnVar.uc();
        }
        xnVar.Mc(false, false);
        xnVar.wc();
        ej ejVar2 = xnVar.d2;
        if (ejVar2 != null && ejVar2.getTag() != null && (view26 = (ejVar = xnVar.d2).e) != null) {
            ejVar.g(view26);
        }
        org.telegram.ui.Components.k40 k40Var2 = xnVar.f2;
        if (k40Var2 != null && k40Var2.getTag() != null && (view25 = (k40Var = xnVar.f2).e) != null) {
            k40Var.g(view25);
        }
        if (xnVar.ha) {
            kVar10 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), pmVar3.getMeasuredWidth(), pmVar3.getMeasuredHeight(), (int) (xnVar.ia * 255.0f), 31);
            float f54 = (xnVar.ia * 0.2f) + 0.8f;
            canvas2.scale(f54, f54, pmVar3.getMeasuredWidth() / 2.0f, pmVar3.getMeasuredHeight() / 2.0f);
            i10 = saveLayerAlpha;
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        for (int i14 = 0; i14 < size; i14++) {
            org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList7.get(i14);
            MessageObject.SendAnimationData sendAnimationData = t1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    vk vkVar = xnVar.l1;
                    int currentHeight = measuredHeight + (vkVar != null ? vkVar.getCurrentHeight() : 0);
                    hk hkVar = xnVar.m1;
                    int currentHeight2 = currentHeight + (hkVar != null ? hkVar.getCurrentHeight() : 0);
                    z11 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
                    i13 = currentHeight2 + (z11 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + xnVar.q9, pmVar3.getWidth(), pmVar3.getHeight());
                ImageReceiver photoImage = t1Var5.getPhotoImage();
                t1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((xnVar.V.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) yh.c(1.0f, sendAnimationData.progress, t1Var5.getTranslationY(), r9[1])));
                if (sendAnimationData.fromPreview) {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, topViewEnterProgress, sendAnimationData.progress));
                } else {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, photoImage.getCenterY() + topViewEnterProgress, sendAnimationData.progress));
                }
                float f55 = sendAnimationData.currentScale;
                canvas2.scale(f55, f55);
                if (!sendAnimationData.fromPreview) {
                    canvas2.translate(-photoImage.getCenterX(), -photoImage.getCenterY());
                }
                t1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                t1Var5.draw(canvas2);
                canvas2.restore();
            }
        }
        num = xnVar.J8;
        if (num != null) {
            view24 = xnVar.G8;
        }
        paint = xnVar.A8;
        if (paint != null) {
            matrix = xnVar.B8;
            matrix.reset();
            float measuredWidth = pmVar3.getMeasuredWidth() / xnVar.y8.getWidth();
            matrix2 = xnVar.B8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = xnVar.z8;
            matrix3 = xnVar.B8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = xnVar.A8;
            paint5.setAlpha((int) (xnVar.I8 * 255.0f));
            paint6 = xnVar.A8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = pmVar3.getMeasuredWidth();
                float measuredHeight2 = pmVar3.getMeasuredHeight();
                paint7 = xnVar.A8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = xnVar.C8;
            f10 = xnVar.E8;
            float f56 = f10 * 255.0f;
            view = xnVar.G8;
            paint2.setAlpha((int) (f56 * (view != null ? xnVar.H8 : 1.0f)));
            paint3 = xnVar.C8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = pmVar3.getMeasuredWidth();
                float measuredHeight3 = pmVar3.getMeasuredHeight();
                paint4 = xnVar.C8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = xnVar.J8;
        if (num2 != null && xnVar.L8) {
            pmVar3.invalidate();
        }
        view2 = xnVar.G8;
        if (view2 != null) {
            view4 = xnVar.G8;
            if (view4 == xnVar.g1) {
                f51 = xnVar.H8;
                if (f51 < 1.0f) {
                    paint30 = xnVar.C8;
                    f52 = xnVar.E8;
                    f53 = xnVar.H8;
                    paint30.setAlpha((int) ((1.0f - f53) * f52 * 255.0f));
                    float measuredWidth4 = pmVar3.getMeasuredWidth();
                    float measuredHeight4 = pmVar3.getMeasuredHeight();
                    paint31 = xnVar.C8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = xnVar.G8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f43 = xnVar.H8;
                    if (f43 < 1.0f) {
                        view20 = xnVar.G8;
                        float left = view20.getLeft();
                        view21 = xnVar.G8;
                        float top = view21.getTop();
                        view22 = xnVar.G8;
                        float right = view22.getRight();
                        view23 = xnVar.G8;
                        float bottom = view23.getBottom();
                        f47 = xnVar.H8;
                        int i15 = (int) (f47 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = xnVar.G8;
                    float left2 = view12.getLeft();
                    view13 = xnVar.G8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = xnVar.G8;
                    kVar6 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = xnVar.G8;
                        float x10 = view16.getX();
                        view17 = xnVar.G8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = xnVar.G8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = xnVar.G8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, xnVar.D8);
                    }
                    view15 = xnVar.G8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f44 = xnVar.H8;
                    if (f44 < 1.0f) {
                        paint23 = xnVar.C8;
                        f45 = xnVar.E8;
                        f46 = xnVar.H8;
                        paint23.setAlpha((int) ((1.0f - f46) * f45 * 255.0f));
                        float measuredWidth6 = pmVar3.getMeasuredWidth();
                        float measuredHeight6 = pmVar3.getMeasuredHeight();
                        paint24 = xnVar.C8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    tmVar = xnVar.u0;
                    float y10 = ((tmVar.getY() + xnVar.p9) - xnVar.r9) - AndroidUtilities.dp(4.0f);
                    view6 = xnVar.G8;
                    if (view6 instanceof org.telegram.ui.Cells.t1) {
                        view11 = xnVar.G8;
                        groupedMessages = ((org.telegram.ui.Cells.t1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    tmVar2 = xnVar.u0;
                    int childCount = tmVar2.getChildCount();
                    int i16 = 0;
                    boolean z12 = false;
                    while (true) {
                        arrayList = pmVar3.y0;
                        f11 = 20.0f;
                        arrayList2 = pmVar3.x0;
                        arrayList3 = pmVar3.w0;
                        arrayList4 = pmVar3.z0;
                        if (i16 >= childCount) {
                            break;
                        }
                        tmVar3 = xnVar.u0;
                        View childAt = tmVar3.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            t1Var = (org.telegram.ui.Cells.t1) childAt;
                            groupedMessages2 = t1Var.getCurrentMessagesGroup();
                            groupedMessagePosition = t1Var.getCurrentPosition();
                            v0Var = null;
                        } else {
                            v0Var = childAt instanceof org.telegram.ui.Cells.v0 ? (org.telegram.ui.Cells.v0) childAt : null;
                            groupedMessages2 = null;
                            t1Var = null;
                            groupedMessagePosition = null;
                        }
                        float f57 = y10;
                        view7 = xnVar.G8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != 0.0f) {
                            if (z12 || t1Var == null || groupedMessages == null || (t1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i11 = childCount;
                                i12 = i16;
                                arrayList5 = arrayList;
                                t1Var2 = t1Var;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                f15 = 9.0f;
                                f16 = 1.0f;
                                z4 = z12;
                            } else {
                                f15 = 9.0f;
                                float E2 = t1Var3.E2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f58 = transitionParams.left + E2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f59 = transitionParams.top + transitionParams.offsetTop;
                                float f60 = transitionParams.right + E2 + transitionParams.offsetRight;
                                i11 = childCount;
                                float f61 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f40 = f59;
                                } else {
                                    f40 = transitionParams.cell.getTranslationY() + f59;
                                    f61 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f62 = f40;
                                float dp = f62 < (xnVar.p9 - ((float) xnVar.r9)) - ((float) AndroidUtilities.dp(20.0f)) ? (xnVar.p9 - xnVar.r9) - AndroidUtilities.dp(20.0f) : f62;
                                tmVar20 = xnVar.u0;
                                if (f61 > AndroidUtilities.dp(20.0f) + tmVar20.getMeasuredHeight()) {
                                    tmVar22 = xnVar.u0;
                                    f61 = AndroidUtilities.dp(20.0f) + tmVar22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i12 = i16;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size2) {
                                        arrayList5 = arrayList;
                                        t1Var4 = t1Var;
                                        z10 = true;
                                        break;
                                    }
                                    int i18 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i17);
                                    arrayList5 = arrayList;
                                    if (xnVar.T5[messageObject.getDialogId() == xnVar.Q5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        t1Var4 = t1Var;
                                        z10 = false;
                                        break;
                                    } else {
                                        i17++;
                                        size2 = i18;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - xnVar.pc) - AndroidUtilities.dp(9.0f);
                                pa0Var6 = xnVar.F1;
                                if (pa0Var6 != null) {
                                    pa0Var9 = xnVar.F1;
                                    f41 = pa0Var9.d();
                                } else {
                                    f41 = 0.0f;
                                }
                                float f63 = measuredHeight7 - f41;
                                pa0Var7 = xnVar.F1;
                                if (pa0Var7 != null) {
                                    pa0Var8 = xnVar.F1;
                                    f42 = pa0Var8.e();
                                } else {
                                    f42 = 0.0f;
                                }
                                org.telegram.ui.Cells.t1 t1Var6 = t1Var4;
                                canvas3.clipRect(0.0f, f57 + f42, getMeasuredWidth(), f63);
                                tmVar21 = xnVar.u0;
                                canvas3.translate(0.0f, tmVar21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                t1Var2 = t1Var6;
                                f16 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f58, (int) dp, (int) f60, (int) f61, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z10, 0);
                                canvas.restore();
                                z4 = true;
                            }
                            if (t1Var2 != null && t1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            tmVar4 = xnVar.u0;
                            float left3 = tmVar4.getLeft();
                            tmVar5 = xnVar.u0;
                            float right2 = tmVar5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - xnVar.pc) - xnVar.W8(org.telegram.ui.Components.s21.c)) - AndroidUtilities.dp(f15);
                            pa0Var3 = xnVar.F1;
                            if (pa0Var3 != null) {
                                pa0Var4 = xnVar.F1;
                                float max = Math.max(0.0f, pa0Var4.e());
                                pa0Var5 = xnVar.F1;
                                f18 = Math.max(0.0f, pa0Var5.d());
                                f17 = max;
                            } else {
                                f17 = 0.0f;
                                f18 = 0.0f;
                            }
                            jk jkVar = xnVar.V;
                            if (jkVar != null && (dfVar = jkVar.j0) != null) {
                                f18 = Math.max(f18, dfVar.f ? 0.0f : Math.max(0.0f, dfVar.getMeasuredHeight() - (dfVar.c.getTranslationY() + dfVar.e)));
                            }
                            float f64 = f57 + f17;
                            float f65 = measuredHeight8 - f18;
                            if (t1Var2 == null || !t1Var2.getTransitionParams().w0) {
                                tmVar6 = xnVar.u0;
                                left3 = Math.max(left3, view8.getX() + tmVar6.getLeft());
                                tmVar7 = xnVar.u0;
                                f64 = Math.max(f64, view8.getY() + tmVar7.getY());
                                tmVar8 = xnVar.u0;
                                right2 = Math.min(right2, view8.getX() + tmVar8.getLeft() + view8.getMeasuredWidth());
                                tmVar9 = xnVar.u0;
                                f65 = Math.min(f65, view8.getY() + tmVar9.getY() + view8.getMeasuredHeight());
                            }
                            float f66 = f65;
                            float f67 = f64;
                            float f68 = right2;
                            float max2 = Math.max(left3, xnVar.R8());
                            if (f67 < f66) {
                                if (view8.getAlpha() != f16) {
                                    canvas4 = canvas;
                                    canvas4.saveLayerAlpha(max2, f67, f68, f66, (int) (view8.getAlpha() * 255.0f), 31);
                                    f39 = f67;
                                    f20 = f66;
                                    f21 = max2;
                                    f22 = f68;
                                } else {
                                    canvas4 = canvas;
                                    f39 = f67;
                                    f20 = f66;
                                    f21 = max2;
                                    f22 = f68;
                                    canvas4.save();
                                }
                                if (t1Var2 != null) {
                                    t1Var2.setInvalidatesParent(true);
                                    num12 = xnVar.J8;
                                    t1Var2.setScrimReaction(num12);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(true);
                                    num11 = xnVar.J8;
                                    v0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f21, f39, f22, f20);
                                tmVar18 = xnVar.u0;
                                float x11 = view8.getX() + tmVar18.getLeft();
                                tmVar19 = xnVar.u0;
                                canvas4.translate(x11, view8.getY() + tmVar19.getY());
                                if (t1Var2 != null && groupedMessages3 == null && t1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, t1Var2.getPaddingTop());
                                    t1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (t1Var2 == null || !t1Var2.U2()) {
                                    f19 = f39;
                                } else {
                                    canvas4.save();
                                    f19 = f39;
                                    canvas4.translate(0.0f, t1Var2.getPaddingTop());
                                    t1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (v0Var != null) {
                                    v0Var.A(canvas4);
                                }
                                canvas4.restore();
                                if (t1Var2 != null) {
                                    t1Var2.setInvalidatesParent(false);
                                    t1Var2.setScrimReaction(num4);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(false);
                                    v0Var.setScrimReaction(num4);
                                }
                            } else {
                                canvas4 = canvas;
                                f19 = f67;
                                f20 = f66;
                                view9 = view8;
                                f21 = max2;
                                f22 = f68;
                            }
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePosition;
                            if (groupedMessagePosition2 != null || (t1Var2 != null && t1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(t1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && t1Var2.T2())) {
                                        arrayList2.add(t1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & t1Var2.t0()) != 0) {
                                    arrayList5.add(t1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i19 = groupedMessagePosition2.flags;
                                    if ((i19 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(t1Var2);
                            }
                            num5 = xnVar.J8;
                            if (num5 == null || t1Var2 == null || groupedMessages3 != null) {
                                float f69 = f22;
                                float f70 = f21;
                                View view27 = view9;
                                float f71 = f20;
                                float f72 = f19;
                                f23 = f57;
                                num6 = xnVar.J8;
                                if (num6 != null && v0Var != null) {
                                    paint13 = xnVar.A8;
                                    if (paint13 != null) {
                                        matrix7 = xnVar.B8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / xnVar.y8.getWidth();
                                        matrix8 = xnVar.B8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = xnVar.z8;
                                        matrix9 = xnVar.B8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = xnVar.A8;
                                        paint16.setAlpha((int) (xnVar.I8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = xnVar.A8;
                                        v0Var2 = v0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        v0Var2 = v0Var;
                                        paint14 = xnVar.C8;
                                        f24 = xnVar.E8;
                                        f25 = xnVar.H8;
                                        paint14.setAlpha((int) (f25 * f24 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = xnVar.C8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f67 < f66) {
                                        f26 = xnVar.E8;
                                        f27 = xnVar.H8;
                                        float f73 = (f27 * f26) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f28 = xnVar.H8;
                                        float f74 = f28 * alpha;
                                        if (f74 < f16) {
                                            canvas.saveLayerAlpha(f70, f72, f69, f71, (int) (f74 * 255.0f), 31);
                                            f71 = f71;
                                            f29 = f72;
                                            canvas3 = canvas;
                                        } else {
                                            canvas3 = canvas;
                                            f29 = f72;
                                            canvas3.save();
                                        }
                                        canvas3.clipRect(f70, f29, f69, f71);
                                        tmVar10 = xnVar.u0;
                                        float x12 = view27.getX() + tmVar10.getLeft();
                                        tmVar11 = xnVar.u0;
                                        canvas3.translate(x12, view27.getY() + tmVar11.getY() + view27.getPaddingTop());
                                        num7 = xnVar.J8;
                                        boolean z13 = xnVar.F8;
                                        mg.r0 r0Var = v0Var2.z0;
                                        if (!r0Var.b) {
                                            org.telegram.ui.ActionBar.f6 f6Var = v0Var2.V0;
                                            if (f6Var != null) {
                                                f6Var.l(v0Var2.r0, v0Var2.q0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.s0);
                                            } else {
                                                org.telegram.ui.ActionBar.j6.q(v0Var2.r0, v0Var2.q0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.s0);
                                            }
                                            r0Var.D = f73;
                                            r0Var.E = z13;
                                            r0Var.d(canvas3, v0Var2.f2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        tmVar12 = xnVar.u0;
                                        float x13 = view27.getX() + tmVar12.getLeft();
                                        tmVar13 = xnVar.u0;
                                        canvas3.translate(x13, view27.getY() + tmVar13.getY() + view27.getPaddingTop());
                                        int i20 = xnVar.K8;
                                        num8 = xnVar.J8;
                                        v0Var2.D(this, canvas3, i20, num8, f73);
                                        pmVar2 = this;
                                        canvas3.restore();
                                        z12 = z4;
                                    }
                                }
                            } else {
                                paint18 = xnVar.A8;
                                if (paint18 != null) {
                                    matrix10 = xnVar.B8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / xnVar.y8.getWidth();
                                    matrix11 = xnVar.B8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = xnVar.z8;
                                    matrix12 = xnVar.B8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = xnVar.A8;
                                    paint21.setAlpha((int) (xnVar.I8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = xnVar.A8;
                                    f30 = f22;
                                    f31 = f21;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f30 = f22;
                                    f31 = f21;
                                    view10 = view9;
                                    paint19 = xnVar.C8;
                                    f32 = xnVar.E8;
                                    f33 = xnVar.H8;
                                    paint19.setAlpha((int) (f33 * f32 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = xnVar.C8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f67 < f66) {
                                    f34 = xnVar.E8;
                                    f35 = xnVar.H8;
                                    float f75 = (f35 * f34) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f36 = xnVar.H8;
                                    float f76 = f36 * alpha2;
                                    if (f76 < f16) {
                                        canvas5 = canvas;
                                        f37 = f20;
                                        float f77 = f19;
                                        canvas5.saveLayerAlpha(f31, f77, f30, f37, (int) (f76 * 255.0f), 31);
                                        f38 = f77;
                                    } else {
                                        canvas5 = canvas;
                                        f37 = f20;
                                        f38 = f19;
                                        canvas5.save();
                                    }
                                    canvas5.clipRect(f31, f38, f30, f37);
                                    tmVar14 = xnVar.u0;
                                    float x14 = view10.getX() + tmVar14.getLeft();
                                    tmVar15 = xnVar.u0;
                                    canvas5.translate(x14, view10.getY() + tmVar15.getY() + view10.getPaddingTop());
                                    num9 = xnVar.J8;
                                    t1Var2.h2(canvas5, num9, f75, xnVar.F8);
                                    canvas5.restore();
                                    canvas5.save();
                                    tmVar16 = xnVar.u0;
                                    float x15 = view10.getX() + tmVar16.getLeft();
                                    tmVar17 = xnVar.u0;
                                    canvas5.translate(x15, view10.getY() + tmVar17.getY() + view10.getPaddingTop());
                                    int i21 = xnVar.K8;
                                    num10 = xnVar.J8;
                                    f23 = f57;
                                    t1Var2.i2(this, canvas5, i21, num10, f75);
                                    canvas.restore();
                                } else {
                                    f23 = f57;
                                }
                            }
                            pmVar2 = this;
                            canvas3 = canvas;
                            z12 = z4;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f23 = f57;
                            pmVar2 = this;
                        }
                        i16 = i12 + 1;
                        pmVar3 = pmVar2;
                        y10 = f23;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    pmVar = pmVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f12 = 1.0f;
                    float f78 = y10;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            pmVar.a0(canvas3, f78, (org.telegram.ui.Cells.t1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            pmVar.a0(canvas3, f78, (org.telegram.ui.Cells.t1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList.get(i24);
                            if (t1Var7.getCurrentPosition() != null || t1Var7.getTransitionParams().w0) {
                                pmVar.a0(canvas3, f78, t1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList4.get(i25);
                            if (t1Var8.getCurrentPosition() != null || t1Var8.getTransitionParams().w0) {
                                pmVar.a0(canvas3, f78, t1Var8, 3);
                            }
                        }
                    }
                    num3 = xnVar.J8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = xnVar.A8;
                        if (paint8 != null) {
                            matrix4 = xnVar.B8;
                            matrix4.reset();
                            float measuredWidth13 = pmVar.getMeasuredWidth() / xnVar.y8.getWidth();
                            matrix5 = xnVar.B8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = xnVar.z8;
                            matrix6 = xnVar.B8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = xnVar.A8;
                            paint11.setAlpha((int) (xnVar.I8 * 255.0f));
                            float measuredWidth14 = pmVar.getMeasuredWidth();
                            float measuredHeight13 = pmVar.getMeasuredHeight();
                            paint12 = xnVar.A8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = xnVar.C8;
                            f13 = xnVar.E8;
                            f14 = xnVar.H8;
                            paint9.setAlpha((int) (f14 * f13 * 255.0f));
                            float measuredWidth15 = pmVar.getMeasuredWidth();
                            float measuredHeight14 = pmVar.getMeasuredHeight();
                            paint10 = xnVar.C8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.t1 t1Var9 = (org.telegram.ui.Cells.t1) arrayList4.get(i26);
                            if (t1Var9.getCurrentPosition() != null || t1Var9.getTransitionParams().w0) {
                                pmVar.a0(canvas3, f78, t1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = xnVar.J8;
                    if (num13 == null) {
                        f48 = xnVar.H8;
                        if (f48 < f12) {
                            paint25 = xnVar.A8;
                            if (paint25 != null) {
                                matrix13 = xnVar.B8;
                                matrix13.reset();
                                float measuredWidth16 = pmVar.getMeasuredWidth() / xnVar.y8.getWidth();
                                matrix14 = xnVar.B8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = xnVar.z8;
                                matrix15 = xnVar.B8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = xnVar.A8;
                                paint28.setAlpha((int) (xnVar.I8 * 255.0f));
                                float measuredWidth17 = pmVar.getMeasuredWidth();
                                float measuredHeight15 = pmVar.getMeasuredHeight();
                                paint29 = xnVar.A8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = xnVar.C8;
                                f49 = xnVar.E8;
                                f50 = xnVar.H8;
                                paint26.setAlpha((int) ((f12 - f50) * f49 * 255.0f));
                                float measuredWidth18 = pmVar.getMeasuredWidth();
                                float measuredHeight16 = pmVar.getMeasuredHeight();
                                paint27 = xnVar.C8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            pmVar = pmVar3;
            f11 = 20.0f;
            f12 = 1.0f;
            num13 = xnVar.J8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            pmVar = pmVar3;
            f11 = 20.0f;
        }
        view3 = xnVar.G8;
        if (view3 != null || ((ArrayList) xnVar.J9.c).size() > 0) {
            pa0Var = xnVar.F1;
            if (pa0Var != null) {
                pa0Var2 = xnVar.F1;
            }
            super.drawChild(canvas3, xnVar.g1, SystemClock.uptimeMillis());
            zj zjVar = xnVar.U2;
            if (zjVar != null && zjVar.getTag() != null) {
                super.drawChild(canvas3, xnVar.U2, SystemClock.uptimeMillis());
            }
            yj yjVar = xnVar.V2;
            if (yjVar != null && yjVar.getTag() != null) {
                super.drawChild(canvas3, xnVar.V2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.r00 r00Var = xnVar.j9;
            if (r00Var != null) {
                super.drawChild(canvas3, r00Var, SystemClock.uptimeMillis());
            }
            hh.k kVar11 = xnVar.U9;
            if (kVar11 != null) {
                super.drawChild(canvas3, kVar11, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.k40 k40Var3 = xnVar.b2;
            if (k40Var3 != null) {
                super.drawChild(canvas3, k40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = xnVar.v3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, xnVar.v3, SystemClock.uptimeMillis());
            }
            gl glVar = xnVar.w3;
            if (glVar != null && glVar.getVisibility() == 0) {
                super.drawChild(canvas3, xnVar.w3, SystemClock.uptimeMillis());
            }
            ph.f3 f3Var = xnVar.u1;
            if (f3Var != null && f3Var.getVisibility() == 0) {
                super.drawChild(canvas3, xnVar.u1, SystemClock.uptimeMillis());
            }
            vl vlVar = xnVar.y1;
            if (vlVar != null && vlVar.getVisibility() == 0) {
                super.drawChild(canvas3, xnVar.y1, SystemClock.uptimeMillis());
            }
            ph.f3 f3Var2 = xnVar.w1;
            if (f3Var2 != null && f3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, xnVar.w1, SystemClock.uptimeMillis());
            }
            jk jkVar2 = xnVar.V;
            if (jkVar2 != null && jkVar2.I != null) {
                canvas3.save();
                canvas3.translate(xnVar.V.I.getX() + xnVar.V.getX(), xnVar.V.I.getY() + xnVar.V.getY());
                xnVar.V.I.draw(canvas3);
                canvas3.restore();
            }
        }
        if (xnVar.ma > 0 && pmVar.f < AndroidUtilities.dp(f11)) {
            int themedColor = xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            if (pmVar.A0 == null) {
                pmVar.A0 = new Paint();
            }
            if (pmVar.B0 != themedColor) {
                Paint paint32 = pmVar.A0;
                pmVar.B0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, pmVar.getMeasuredHeight() - xnVar.ma, pmVar.getMeasuredWidth(), pmVar.getMeasuredHeight(), pmVar.A0);
            canvas3 = canvas6;
        }
        tp tpVar = xnVar.M9;
        if (tpVar != null && tpVar.e()) {
            int inputBubbleTop = (int) xnVar.P.getInputBubbleTop();
            int inputBubbleBottom = (int) xnVar.P.getInputBubbleBottom();
            xn xnVar2 = xnVar.Q9;
            int i27 = inputBubbleTop - ((int) (xnVar.R9 * (xnVar2 == null ? 0.0f : xnVar2.L9)));
            tp tpVar2 = xnVar.M9;
            pmVar.getMeasuredWidth();
            tpVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (xnVar.Q9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, pmVar.getMeasuredWidth(), pmVar.getMeasuredHeight(), (int) (xnVar.R9 * 255.0f), 31);
            canvas3 = canvas;
            xnVar.Q9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        xnVar.ua.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (xnVar.ha) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (xnVar.ia * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        fl flVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (flVar = this.G0.Ba) == null || !flVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        flVar.a(true);
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
        boolean z4;
        sk skVar;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.G0;
        ug.d dVar = xnVar.K3;
        if (dVar != null) {
            dVar.n = SystemClock.uptimeMillis();
        }
        float y10 = (AndroidUtilities.isInMultiwindow || xnVar.isInBubbleMode()) ? (xnVar.V.getEmojiView() != null ? xnVar.V.getEmojiView() : xnVar.V).getY() : xnVar.V.getY();
        View view = xnVar.G8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        }
        jk jkVar = xnVar.V;
        if (jkVar == null || !jkVar.v3 || motionEvent.getY() >= y10) {
            xnVar.g9 = motionEvent.getY();
            org.telegram.ui.Cells.y9 o10 = xnVar.Z8.o(getContext());
            motionEvent.offsetLocation(-o10.getX(), -o10.getY());
            if (!xnVar.Z8.y() || !xnVar.Z8.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o10.getX(), o10.getY());
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                ek ekVar = xnVar.n1;
                if (ekVar != null) {
                    if (xnVar.r3 != null) {
                        z4 = ekVar.A(motionEvent);
                        if (xnVar.n1.E) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !xnVar.Z8.y() || (motionEvent.getY() >= xnVar.u0.getTop() && motionEvent.getY() <= xnVar.u0.getBottom())) {
                            skVar = xnVar.ta;
                            if (!skVar.n) {
                                return skVar.g(motionEvent);
                            }
                            cb.m mVar = cb.m.e;
                            if (mVar == null || !mVar.a) {
                                if (xnVar.isInPreviewMode() && xnVar.G9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (xnVar.g1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                s5.m mVar2 = xnVar.g1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
                                                if (mVar2 != null) {
                                                    ((vg.b) mVar2.b).getLocationInWindow(iArr2);
                                                    Rect rect = AndroidUtilities.rectTmp2;
                                                    int i12 = iArr2[0] - iArr[0];
                                                    rect.set(i12, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i12, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z10 = true;
                                                        break;
                                                    }
                                                }
                                                i10++;
                                            }
                                        }
                                        z10 = false;
                                        lj ljVar = xnVar.X0;
                                        if (ljVar != null) {
                                            ljVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], xnVar.X0.getMeasuredWidth() + i13, xnVar.X0.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z11 = true;
                                                if (z10) {
                                                    this.C0 = motionEvent.getX();
                                                    this.D0 = motionEvent.getY();
                                                    this.E0 = SystemClock.elapsedRealtime();
                                                    this.F0 = z11;
                                                    lj ljVar2 = xnVar.X0;
                                                    if (ljVar2 != null) {
                                                        ljVar2.e0.c(z11);
                                                    }
                                                    z4 = true;
                                                } else {
                                                    this.E0 = -1L;
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z10) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        lj ljVar3 = xnVar.X0;
                                        if (ljVar3 != null) {
                                            ljVar3.e0.c(false);
                                        }
                                        if (this.F0 || (k7.n6.a(this.C0, this.D0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.E0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.F0) {
                                                e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                                                xnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) e5Var2).P(ProfileActivity.m4(xnVar.Q5));
                                            } else {
                                                e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                                                ((ActionBarLayout) e5Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.E0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.E0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z4) {
                                }
                            } else {
                                u4 u4Var = (u4) cb.m.l().d;
                                if (u4Var != null) {
                                    u4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o10.getX(), -o10.getY());
                            if (xnVar.Z8.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o10.getX(), o10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = ekVar.e;
                        if (ekVar.E) {
                            ekVar.F = true;
                            ekVar.E = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(ekVar.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            ekVar.d = 0;
                            ekVar.c = 1.0f;
                            org.telegram.ui.Components.a81 a81Var = ekVar.J;
                            if (a81Var != null) {
                                a81Var.e(1.0f, 0, ekVar.b);
                            }
                            ekVar.w(false);
                        }
                    }
                }
                z4 = false;
                if (motionEvent.getAction() == 0) {
                }
                skVar = xnVar.ta;
                if (!skVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.L0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.u0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        eg.i0 i0Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z4;
        boolean z10;
        nk nkVar;
        MessageObject messageObject;
        dl dlVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        xn xnVar = this.G0;
        boolean z11 = false;
        if ((xnVar.G8 == null && ((ArrayList) xnVar.J9.c).size() <= 0) || (view != xnVar.g1 && view != xnVar.U2 && view != xnVar.V2 && view != xnVar.j9 && view != xnVar.U9 && view != xnVar.b2 && view != null && view != xnVar.v3 && view != xnVar.w3)) {
            if ((view != xnVar.v3 || !PhotoViewer.t1().Q1()) && (!xnVar.P9 || view != xnVar.u0)) {
                if (xnVar.ha) {
                    kVar3 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                }
                if (view != xnVar.Y2) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (i0Var = xnVar.v2) != null && i0Var.a() && xnVar.v2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z4 = false;
                        z10 = false;
                        if (view == xnVar.q8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    } else {
                        if (view != xnVar.u0) {
                            if (view != xnVar.P) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z4 = playingMessageObject.isRoundVideo();
                            if (z4 || playingMessageObject.isVideo()) {
                                z10 = true;
                                if (view == xnVar.q8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-xnVar.K9) - (xnVar.R9 != 0.0f ? (xnVar.u0.getMeasuredHeight() - xnVar.K9) * xnVar.R9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.j6.k3 != null && xnVar.s8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y10 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(xnVar.q8.getScaleX(), xnVar.q8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.j6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.j6.k3.setBounds(x10, y10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(xnVar.C9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(xnVar.C9()) + y10);
                                            org.telegram.ui.ActionBar.j6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z11 = super.drawChild(canvas, view, j10);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                                        z11 = super.drawChild(canvas, view, j10);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z11;
                                }
                                if (view == xnVar.P && (dlVar = xnVar.Y2) != null && dlVar.getVisibility() == 0) {
                                    super.drawChild(canvas, xnVar.Y2, j10);
                                }
                                z11 = super.drawChild(canvas, view, j10);
                                if (z10 && view == xnVar.u0 && playingMessageObject.type != 5 && (nkVar = xnVar.q8) != null && nkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-xnVar.K9) - (xnVar.R9 != 0.0f ? (xnVar.u0.getMeasuredHeight() - xnVar.K9) * xnVar.R9 : 0.0f)) + xnVar.L9);
                                    super.drawChild(canvas, xnVar.q8, j10);
                                    if (xnVar.r8 != null) {
                                        canvas.save();
                                        canvas.translate(xnVar.r8.getX(), xnVar.u0.getY() + xnVar.r8.getTop());
                                        if (z4) {
                                            xnVar.r8.g2(canvas);
                                            invalidate();
                                            xnVar.r8.invalidate();
                                        } else {
                                            xnVar.r8.Y1(canvas);
                                            org.telegram.ui.Cells.t1 t1Var = xnVar.r8;
                                            if (!t1Var.sb && ((messageObject = t1Var.v7) == null || messageObject.type != 27)) {
                                                t1Var.m2(t1Var.getAlpha(), canvas, true);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                }
                            }
                        } else {
                            z4 = false;
                        }
                        z10 = false;
                        if (view == xnVar.q8) {
                        }
                    }
                }
            }
            return true;
        }
        return z11;
    }

    @Override // org.telegram.ui.Components.qv0
    public float getBottomOffset() {
        return this.G0.u0.getBottom();
    }

    public xn getChatActivity() {
        return this.G0;
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.qv0
    public int getKeyboardHeight() {
        if (this.G0.La) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.qv0
    public float getListTranslationY() {
        return this.G0.u0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.qv0
    public Drawable getNewDrawable() {
        Drawable d = this.G0.ba.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.qv0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.G0.ba.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.qv0
    public int getScrollOffset() {
        return this.G0.u0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        super.onAttachedToWindow();
        xn xnVar = this.G0;
        if (xnVar.La) {
            this.E.b = xnVar.U0;
        } else {
            e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                if (((ActionBarLayout) e5Var2).b) {
                    org.telegram.ui.ActionBar.r1 r1Var = this.E;
                    e5Var3 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                    r1Var.b = (FrameLayout) e5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.E.c();
        xnVar.V.setAdjustPanLayoutHelper(this.E);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == xnVar.Q5)) {
            MediaController.getInstance().setTextureView(xnVar.N7(false), xnVar.s8, xnVar.q8, true);
        }
        tp tpVar = xnVar.M9;
        if (tpVar != null) {
            tpVar.f();
        }
        xnVar.ua.j();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.E.d();
        xn xnVar = this.G0;
        tp tpVar = xnVar.M9;
        if (tpVar != null) {
            NotificationCenter.getInstance(tpVar.b0).removeObserver(tpVar, NotificationCenter.updateInterfaces);
            tpVar.C.onDetachedFromWindow();
            org.telegram.ui.Components.l5 l5Var = tpVar.h0;
            if (l5Var != null && (view = tpVar.X) != null) {
                l5Var.o(view);
            }
            tpVar.N = 0.0f;
            tpVar.M = 0L;
            xnVar.M9 = null;
        }
        xnVar.ua.k();
        AndroidUtilities.runOnUIThread(new cg.n0(22));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        xn xnVar;
        eg.i0 i0Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (i0Var = (xnVar = this.G0).v2) == null || !i0Var.a() || xnVar.v2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.zc) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int d;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int dp;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar3;
        int i21;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        xn xnVar = this.G0;
        ch.i iVar = xnVar.v;
        int i22 = (measuredWidth - xnVar.Ra) - xnVar.Sa;
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
                int i25 = i24 & 112;
                int i26 = i24 & 7;
                if (i26 == 1) {
                    d = kh.a2.d(i22, measuredWidth2, 2, xnVar.Ra) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = xnVar.Ra + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                    i18 += kVar7.getMeasuredHeight();
                                }
                            }
                        } else if (i25 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = (i13 - i11) - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (b0(childAt)) {
                            i18 = 0;
                            i15 = 0;
                        } else {
                            if (childAt != xnVar.J9 && childAt != xnVar.U9 && childAt != xnVar.P && !(childAt instanceof org.telegram.ui.Components.k40) && !(childAt instanceof org.telegram.ui.Components.op)) {
                                if (childAt instanceof org.telegram.ui.Cells.y9) {
                                    i20 = xnVar.wa;
                                } else if (childAt == xnVar.N0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (xnVar.V.u0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z10 = ((org.telegram.ui.ActionBar.p2) xnVar).inBubbleMode;
                                        if (!z10) {
                                            i18 = xnVar.V.getBottom();
                                        }
                                    }
                                    i18 = xnVar.V.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    jk jkVar = xnVar.V;
                                    if (jkVar != null && (childAt == jkVar.K1 || childAt == jkVar.J1)) {
                                        i18 = b.t(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == xnVar.t2) {
                                        i18 = b.t(7.0f, iVar.d(), i18);
                                    } else if (jkVar == null || childAt != jkVar.b1) {
                                        if (childAt == xnVar.b2 || childAt == xnVar.p2 || childAt == xnVar.c2) {
                                            i19 = this.t0;
                                        } else if (childAt == xnVar.u0 || childAt == xnVar.s0 || childAt == xnVar.U2 || childAt == xnVar.V2 || childAt == xnVar.W2) {
                                            i20 = xnVar.wa;
                                        } else if (childAt != xnVar.M) {
                                            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (xnVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == xnVar.q8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != xnVar.Y2 && childAt != xnVar.Z2 && childAt != xnVar.r0) {
                                                if (childAt instanceof org.telegram.ui.Components.wb0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != xnVar.Q) {
                                                    if (childAt != xnVar.K3) {
                                                    }
                                                }
                                            }
                                        } else if (jkVar.z0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = b.t(9.0f, iVar.d(), i18);
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
                    if (b0(childAt)) {
                    }
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                } else {
                    d = (measuredWidth - xnVar.Sa) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = d - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        yj yjVar = xnVar.V2;
        if (yjVar != null) {
            yjVar.setBackgroundHeight(getMeasuredHeight());
        }
        xnVar.o9();
        xnVar.r9();
        xnVar.Mc(false, false);
        S();
        xnVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0531  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int childCount;
        boolean z4;
        int i12;
        int i13;
        org.telegram.ui.Components.ic icVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.w0 w0Var;
        TLRPC.User user;
        xn xnVar = this.G0;
        ch.i iVar = xnVar.v;
        xnVar.Ac.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - xnVar.Ra) - xnVar.Sa;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        sg.a aVar = xnVar.I.a;
        if (aVar instanceof sg.b) {
            ((sg.b) aVar).b(i15, size2);
        }
        if (this.v0 != i15) {
            xnVar.C4 = false;
            this.v0 = makeMeasureSpec;
            z12 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
            if (z12 || (user = xnVar.f) == null || !user.self) {
                xnVar.H9 = false;
            } else {
                org.telegram.ui.ActionBar.k5 titleTextView = xnVar.X0.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    xnVar.H9 = !xnVar.I9;
                } else {
                    xnVar.H9 = false;
                }
            }
            if (xnVar.H9 || xnVar.I9 || UserObject.isBotForumWithEditableTopics(xnVar.f)) {
                lj ljVar = xnVar.X0;
                if (ljVar != null && ljVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) xnVar.X0.getLayoutParams()).rightMargin = AndroidUtilities.dp(xnVar.O3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                lj ljVar2 = xnVar.X0;
                if (ljVar2 != null && ljVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) xnVar.X0.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (xnVar.H9) {
                kVar8 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (!kVar8.k0 && (w0Var = xnVar.j0) != null) {
                    w0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.e0;
                if (w0Var2 != null) {
                    w0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.w0 w0Var3 = xnVar.e0;
                if (w0Var3 != null) {
                    w0Var3.K(40);
                }
                org.telegram.ui.ActionBar.w0 w0Var4 = xnVar.j0;
                if (w0Var4 != null) {
                    w0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if (!kVar7.k0 && (yVar = xnVar.k0) != null) {
                yVar.f((!xnVar.I9 || xnVar.H9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = xnVar.e0;
            if (w0Var5 != null) {
                TLRPC.UserFull userFull = xnVar.X7;
                if (xnVar.I9) {
                    w0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    w0Var5.K(32);
                }
            }
            xnVar.C4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z13 = this.f + xnVar.la >= AndroidUtilities.dp(20.0f);
        if (this.u0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (xnVar.ma > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            xnVar.la = xnVar.ma;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            xnVar.la = xnVar.V.t0() ? xnVar.V.getEmojiPadding() : 0;
        } else {
            xnVar.la = 0;
        }
        setEmojiKeyboardHeight(xnVar.la);
        boolean z14 = this.f + xnVar.la >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z13 != z14) {
            for (int i16 = 0; i16 < xnVar.u0.getChildCount(); i16++) {
                View childAt = xnVar.u0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        xnVar.u0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            xnVar.w0.i1(R, (int) (((((xnVar.u0.getMeasuredHeight() - xnVar.p9) - xnVar.xa) + ((this.f + xnVar.la) - r1)) - (z14 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(xnVar.C9()))) / 2.0f), false);
                            xnVar.x0.m(R);
                            this.E.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(xnVar.V, makeMeasureSpec, 0, i11, 0);
                            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
                            if (!z4 || xnVar.La) {
                                this.t0 = 0;
                            } else {
                                this.t0 = xnVar.V.getMeasuredHeight();
                            }
                            xnVar.wa = 0;
                            xnVar.xa = 0;
                            if (SharedConfig.chatBlurEnabled() && !xnVar.La && xnVar.C != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = xnVar.D;
                                xnVar.wa = i18;
                                xnVar.xa = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != xnVar.V) {
                                    kVar4 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                    if (childAt2 != kVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == xnVar.u0 || childAt2 == xnVar.s0 || (childAt2 instanceof org.telegram.ui.Cells.y9)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), xnVar.wa + size2 + xnVar.xa), TLObject.FLAG_30));
                                            } else if (childAt2 == xnVar.M) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.t0;
                                                z11 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((xnVar.V.z0() ? 48 : 0) + 2) + (i20 - (z11 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == xnVar.Y2) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                xnVar.Y2.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) xnVar.qc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == xnVar.Z2) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) xnVar.qc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == xnVar.N0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (xnVar.V.u0(childAt2)) {
                                                org.telegram.ui.Components.rf rfVar = xnVar.V.D1;
                                                if (childAt2 == rfVar && rfVar != null) {
                                                    i19 = rfVar.getKeyboardHeight();
                                                }
                                                z10 = ((org.telegram.ui.ActionBar.p2) xnVar).inBubbleMode;
                                                if (z10) {
                                                    int paddingTop2 = getPaddingTop() + (i17 - this.t0) + measuredHeight;
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else if (AndroidUtilities.isInMultiwindow) {
                                                    int paddingTop3 = getPaddingTop() + (((i17 - this.t0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                }
                                            } else {
                                                bk bkVar = xnVar.F1;
                                                if (childAt2 == bkVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bkVar.getLayoutParams();
                                                    tf.u0 adapter = xnVar.F1.getAdapter();
                                                    if (adapter.t0 == null || adapter.e0) {
                                                        xnVar.F1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        xnVar.F1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == xnVar.Z8.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + xnVar.wa;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || xnVar.La) {
                                                        qm qmVar = xnVar.Z8;
                                                        qmVar.e0 = 0;
                                                        qmVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        qm qmVar2 = xnVar.Z8;
                                                        qmVar2.e0 = keyboardHeight;
                                                        qmVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.wb0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == xnVar.O1) {
                                                    kVar5 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                                    if (kVar5.getVisibility() == 0) {
                                                        kVar6 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                                        i14 = size2 - kVar6.getMeasuredHeight();
                                                    } else {
                                                        i14 = size2;
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                                                } else {
                                                    measureChildWithMargins(childAt2, makeMeasureSpec, 0, i11, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (xnVar.B4) {
                                xnVar.C4 = true;
                                xnVar.o9();
                                xnVar.r9();
                                xnVar.B4 = false;
                                qj qjVar = xnVar.u0;
                                qjVar.measure(View.MeasureSpec.makeMeasureSpec(qjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(xnVar.u0.getMeasuredHeight(), TLObject.FLAG_30));
                                xnVar.C4 = false;
                            }
                            i13 = xnVar.u4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new af.b(this, i13, 23));
                                xnVar.u4 = -1;
                            }
                            icVar = org.telegram.ui.Components.ic.w;
                            if (icVar != null && xnVar.Wb != null) {
                                icVar.l();
                            }
                            xnVar.S6();
                            this.u0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.re reVar = xnVar.V.U3;
        AndroidUtilities.cancelRunOnUIThread(reVar);
        reVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(xnVar.V, makeMeasureSpec, 0, i11, 0);
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        if (z4) {
        }
        this.t0 = 0;
        xnVar.wa = 0;
        xnVar.xa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = xnVar.D;
            xnVar.wa = i182;
            xnVar.xa = i182;
        }
        while (i12 < childCount) {
        }
        if (xnVar.B4) {
        }
        i13 = xnVar.u4;
        if (i13 != -1) {
        }
        icVar = org.telegram.ui.Components.ic.w;
        if (icVar != null) {
            icVar.l();
        }
        xnVar.S6();
        this.u0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        xn xnVar = this.G0;
        tg.c.c(xnVar.w8, xnVar.fragmentView);
        xnVar.x8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G0.C4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        xn xnVar = this.G0;
        xnVar.s9 = i11;
        xnVar.o9();
        xnVar.r9();
    }

    @Override // org.telegram.ui.Components.qv0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
    }
}
