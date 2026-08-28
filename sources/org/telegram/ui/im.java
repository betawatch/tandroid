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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.Components.xu0 {
    public int A0;
    public float B0;
    public float C0;
    public long D0;
    public boolean E0;
    public final /* synthetic */ qn F0;
    public int s0;
    public int t0;
    public int u0;
    public final ArrayList v0;
    public final ArrayList w0;
    public final ArrayList x0;
    public final ArrayList y0;
    public Paint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(qn qnVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.F0 = qnVar;
        this.s0 = 0;
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.D = new hm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.F0;
        qnVar.T0.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        kVar.setTranslationY(0.0f);
        rk rkVar = qnVar.Xa;
        if (rkVar != null) {
            rkVar.setTranslationY(qnVar.k1 != null ? r3.getCurrentHeight() : 0);
        }
        kh.x3 x3Var = qnVar.s1;
        if (x3Var != null) {
            x3Var.setTranslationY(0.0f);
        }
        kh.x3 x3Var2 = qnVar.r1;
        if (x3Var2 != null) {
            x3Var2.setTranslationY(0.0f);
        }
        org.telegram.ui.Components.b21 b21Var = qnVar.N1;
        if (b21Var != null) {
            b21Var.setTranslationY(0.0f);
        }
        qnVar.M0.setTranslationY(0.0f);
        qnVar.L.setTranslationY(0.0f);
        qnVar.s9 = 0.0f;
        qnVar.t9 = 0.0f;
        qnVar.T0.setBackgroundTranslation(0);
        uk ukVar = qnVar.X2;
        if (ukVar != null) {
            ukVar.p0 = 0.0f;
            ukVar.s();
        }
        kh.h6 h6Var = qnVar.u2;
        if (h6Var != null) {
            org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) h6Var.b;
            x9Var.u = 0.0f;
            x9Var.d.invalidate();
        }
        qnVar.setFragmentPanTranslationOffset(0);
        qnVar.o9();
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            ((org.telegram.ui.Components.jb0) drawable).p();
        }
        qn qnVar = this.F0;
        ng.a c10 = qnVar.S.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(qnVar.S.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(qnVar.S.a(c10));
        qnVar.zb = computePerceivedBrightness <= 0.721f;
        qnVar.Ab = computePerceivedBrightness2 <= 0.9f;
        qnVar.H.a = c10;
        rg.f fVar = qnVar.T;
        if (fVar != null) {
            fVar.invalidate();
        }
        pg.f fVar2 = qnVar.O;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        qnVar.n9();
        qnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f10, org.telegram.ui.Cells.t1 t1Var, int i9) {
        int save = canvas.save();
        qn qnVar = this.F0;
        float x10 = t1Var.getX() + qnVar.t0.getLeft();
        float y10 = t1Var.getY() + qnVar.t0.getY() + t1Var.getPaddingTop();
        float alpha = t1Var.a() ? t1Var.getAlpha() : 1.0f;
        canvas.clipRect(qnVar.t0.getLeft(), f10, qnVar.t0.getRight(), ((((qnVar.t0.getY() + qnVar.t0.getMeasuredHeight()) - qnVar.wa) - qnVar.v.d()) - qnVar.oc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y10);
        t1Var.setInvalidatesParent(true);
        if (i9 == 0) {
            t1Var.m2(alpha, canvas, true);
        } else if (i9 == 1) {
            t1Var.W1(canvas, alpha);
        } else if (i9 == 2) {
            t1Var.I1(alpha, canvas, t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i9 == 3) {
            boolean z10 = t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0;
            t1Var.N1(canvas, alpha);
            if (!z10) {
                t1Var.d2(canvas, alpha, null);
            }
        } else if (i9 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && qnVar.I8 != null)) {
            float f11 = (qnVar.D8 * qnVar.G8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, qnVar.I8, f11, qnVar.E8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            t1Var.i2(this, canvas, qnVar.J8, qnVar.I8, f11);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ig igVar;
        qn qnVar = this.F0;
        ig.a aVar = qnVar.F;
        ak akVar = qnVar.U;
        if (akVar == null || view != akVar.i0) {
            super.addView(view, i9, layoutParams);
        } else {
            rg.f fVar = qnVar.T;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i9 = indexOfChild;
            }
            super.addView(view, i9, layoutParams);
        }
        ak akVar2 = qnVar.U;
        if (akVar2 != null && view == akVar2.i0) {
            mh.y yVar = (mh.y) view;
            yVar.setBackgroundDrawable(aVar.c(yVar.c, qnVar.x, false));
        }
        ak akVar3 = qnVar.U;
        if (akVar3 == null || view != (igVar = akVar3.J1)) {
            return;
        }
        igVar.setBlurredBackgroundFactory(aVar);
    }

    public final boolean b0(View view) {
        if (view == this.H) {
            return true;
        }
        qn qnVar = this.F0;
        return view == qnVar.u2 || view == qnVar.m1 || view == qnVar.i9 || view == qnVar.T || view == qnVar.G3;
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
    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i9;
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
        im imVar;
        float f11;
        View view3;
        org.telegram.ui.Components.w90 w90Var;
        org.telegram.ui.Components.w90 w90Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        mm mmVar;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        mm mmVar2;
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
        mm mmVar3;
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i10;
        int i11;
        ArrayList arrayList5;
        org.telegram.ui.Cells.t1 t1Var2;
        ArrayList arrayList6;
        xg.i iVar;
        Integer num4;
        float f15;
        float f16;
        boolean z10;
        mm mmVar4;
        mm mmVar5;
        org.telegram.ui.Components.w90 w90Var3;
        float f17;
        float f18;
        mm mmVar6;
        mm mmVar7;
        mm mmVar8;
        mm mmVar9;
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
        org.telegram.ui.Cells.w0 w0Var2;
        Paint paint14;
        float f24;
        float f25;
        Paint paint15;
        float f26;
        float f27;
        float f28;
        float f29;
        mm mmVar10;
        mm mmVar11;
        Integer num7;
        mm mmVar12;
        mm mmVar13;
        Integer num8;
        im imVar2;
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
        mm mmVar14;
        mm mmVar15;
        Integer num9;
        mm mmVar16;
        mm mmVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f39;
        Integer num11;
        mm mmVar18;
        mm mmVar19;
        Integer num12;
        org.telegram.ui.Components.df dfVar;
        org.telegram.ui.Components.w90 w90Var4;
        org.telegram.ui.Components.w90 w90Var5;
        org.telegram.ui.Cells.t1 t1Var3;
        float f40;
        mm mmVar20;
        org.telegram.ui.Cells.t1 t1Var4;
        boolean z11;
        org.telegram.ui.Components.w90 w90Var6;
        float f41;
        org.telegram.ui.Components.w90 w90Var7;
        float f42;
        mm mmVar21;
        org.telegram.ui.Components.w90 w90Var8;
        org.telegram.ui.Components.w90 w90Var9;
        mm mmVar22;
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
        int i12;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.s30 s30Var;
        View view25;
        wi wiVar;
        View view26;
        kj kjVar;
        im imVar3 = this;
        qn qnVar = imVar3.F0;
        xg.i iVar2 = qnVar.v;
        ArrayList arrayList7 = qnVar.j6;
        qnVar.U.T1();
        qnVar.jc();
        if (qnVar.na || ((kjVar = qnVar.u0) != null && kjVar.k())) {
            qnVar.na = false;
            qnVar.uc();
        }
        qnVar.Mc(false, false);
        qnVar.wc();
        wi wiVar2 = qnVar.c2;
        if (wiVar2 != null && wiVar2.getTag() != null && (view26 = (wiVar = qnVar.c2).e) != null) {
            wiVar.g(view26);
        }
        org.telegram.ui.Components.s30 s30Var2 = qnVar.e2;
        if (s30Var2 != null && s30Var2.getTag() != null && (view25 = (s30Var = qnVar.e2).e) != null) {
            s30Var.g(view25);
        }
        if (qnVar.ga) {
            kVar10 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), imVar3.getMeasuredWidth(), imVar3.getMeasuredHeight(), (int) (qnVar.ha * 255.0f), 31);
            float f54 = (qnVar.ha * 0.2f) + 0.8f;
            canvas2.scale(f54, f54, imVar3.getMeasuredWidth() / 2.0f, imVar3.getMeasuredHeight() / 2.0f);
            i9 = saveLayerAlpha;
        } else {
            canvas2 = canvas;
            i9 = -1;
        }
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        for (int i13 = 0; i13 < size; i13++) {
            org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList7.get(i13);
            MessageObject.SendAnimationData sendAnimationData = t1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    mk mkVar = qnVar.k1;
                    int currentHeight = measuredHeight + (mkVar != null ? mkVar.getCurrentHeight() : 0);
                    yj yjVar = qnVar.l1;
                    int currentHeight2 = currentHeight + (yjVar != null ? yjVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
                    i12 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i12 = 0;
                }
                canvas2.clipRect(0.0f, i12 + qnVar.p9, imVar3.getWidth(), imVar3.getHeight());
                ImageReceiver photoImage = t1Var5.getPhotoImage();
                t1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((qnVar.U.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) j3.r0.C(1.0f, sendAnimationData.progress, t1Var5.getTranslationY(), r9[1])));
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
        num = qnVar.I8;
        if (num != null) {
            view24 = qnVar.F8;
        }
        paint = qnVar.z8;
        if (paint != null) {
            matrix = qnVar.A8;
            matrix.reset();
            float measuredWidth = imVar3.getMeasuredWidth() / qnVar.x8.getWidth();
            matrix2 = qnVar.A8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = qnVar.y8;
            matrix3 = qnVar.A8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = qnVar.z8;
            paint5.setAlpha((int) (qnVar.H8 * 255.0f));
            paint6 = qnVar.z8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = imVar3.getMeasuredWidth();
                float measuredHeight2 = imVar3.getMeasuredHeight();
                paint7 = qnVar.z8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = qnVar.B8;
            f10 = qnVar.D8;
            float f56 = f10 * 255.0f;
            view = qnVar.F8;
            paint2.setAlpha((int) (f56 * (view != null ? qnVar.G8 : 1.0f)));
            paint3 = qnVar.B8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = imVar3.getMeasuredWidth();
                float measuredHeight3 = imVar3.getMeasuredHeight();
                paint4 = qnVar.B8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = qnVar.I8;
        if (num2 != null && qnVar.K8) {
            imVar3.invalidate();
        }
        view2 = qnVar.F8;
        if (view2 != null) {
            view4 = qnVar.F8;
            if (view4 == qnVar.f1) {
                f51 = qnVar.G8;
                if (f51 < 1.0f) {
                    paint30 = qnVar.B8;
                    f52 = qnVar.D8;
                    f53 = qnVar.G8;
                    paint30.setAlpha((int) ((1.0f - f53) * f52 * 255.0f));
                    float measuredWidth4 = imVar3.getMeasuredWidth();
                    float measuredHeight4 = imVar3.getMeasuredHeight();
                    paint31 = qnVar.B8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = qnVar.F8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f43 = qnVar.G8;
                    if (f43 < 1.0f) {
                        view20 = qnVar.F8;
                        float left = view20.getLeft();
                        view21 = qnVar.F8;
                        float top = view21.getTop();
                        view22 = qnVar.F8;
                        float right = view22.getRight();
                        view23 = qnVar.F8;
                        float bottom = view23.getBottom();
                        f47 = qnVar.G8;
                        int i14 = (int) (f47 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i14, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = qnVar.F8;
                    float left2 = view12.getLeft();
                    view13 = qnVar.F8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = qnVar.F8;
                    kVar6 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = qnVar.F8;
                        float x10 = view16.getX();
                        view17 = qnVar.F8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = qnVar.F8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = qnVar.F8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, qnVar.C8);
                    }
                    view15 = qnVar.F8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f44 = qnVar.G8;
                    if (f44 < 1.0f) {
                        paint23 = qnVar.B8;
                        f45 = qnVar.D8;
                        f46 = qnVar.G8;
                        paint23.setAlpha((int) ((1.0f - f46) * f45 * 255.0f));
                        float measuredWidth6 = imVar3.getMeasuredWidth();
                        float measuredHeight6 = imVar3.getMeasuredHeight();
                        paint24 = qnVar.B8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    mmVar = qnVar.t0;
                    float y10 = ((mmVar.getY() + qnVar.o9) - qnVar.q9) - AndroidUtilities.dp(4.0f);
                    view6 = qnVar.F8;
                    if (view6 instanceof org.telegram.ui.Cells.t1) {
                        view11 = qnVar.F8;
                        groupedMessages = ((org.telegram.ui.Cells.t1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    mmVar2 = qnVar.t0;
                    int childCount = mmVar2.getChildCount();
                    int i15 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = imVar3.x0;
                        f11 = 20.0f;
                        arrayList2 = imVar3.w0;
                        arrayList3 = imVar3.v0;
                        arrayList4 = imVar3.y0;
                        if (i15 >= childCount) {
                            break;
                        }
                        mmVar3 = qnVar.t0;
                        View childAt = mmVar3.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            t1Var = (org.telegram.ui.Cells.t1) childAt;
                            groupedMessages2 = t1Var.getCurrentMessagesGroup();
                            groupedMessagePosition = t1Var.getCurrentPosition();
                            w0Var = null;
                        } else {
                            w0Var = childAt instanceof org.telegram.ui.Cells.w0 ? (org.telegram.ui.Cells.w0) childAt : null;
                            groupedMessages2 = null;
                            t1Var = null;
                            groupedMessagePosition = null;
                        }
                        float f57 = y10;
                        view7 = qnVar.F8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != 0.0f) {
                            if (z13 || t1Var == null || groupedMessages == null || (t1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i10 = childCount;
                                i11 = i15;
                                arrayList5 = arrayList;
                                t1Var2 = t1Var;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                f15 = 9.0f;
                                f16 = 1.0f;
                                z10 = z13;
                            } else {
                                f15 = 9.0f;
                                float E2 = t1Var3.E2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f58 = transitionParams.left + E2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f59 = transitionParams.top + transitionParams.offsetTop;
                                float f60 = transitionParams.right + E2 + transitionParams.offsetRight;
                                i10 = childCount;
                                float f61 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f40 = f59;
                                } else {
                                    f40 = transitionParams.cell.getTranslationY() + f59;
                                    f61 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f62 = f40;
                                float dp = f62 < (qnVar.o9 - ((float) qnVar.q9)) - ((float) AndroidUtilities.dp(20.0f)) ? (qnVar.o9 - qnVar.q9) - AndroidUtilities.dp(20.0f) : f62;
                                mmVar20 = qnVar.t0;
                                if (f61 > AndroidUtilities.dp(20.0f) + mmVar20.getMeasuredHeight()) {
                                    mmVar22 = qnVar.t0;
                                    f61 = AndroidUtilities.dp(20.0f) + mmVar22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i11 = i15;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= size2) {
                                        arrayList5 = arrayList;
                                        t1Var4 = t1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i17 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i16);
                                    arrayList5 = arrayList;
                                    if (qnVar.S5[messageObject.getDialogId() == qnVar.P5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        t1Var4 = t1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i16++;
                                        size2 = i17;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - qnVar.oc) - AndroidUtilities.dp(9.0f);
                                w90Var6 = qnVar.E1;
                                if (w90Var6 != null) {
                                    w90Var9 = qnVar.E1;
                                    f41 = w90Var9.d();
                                } else {
                                    f41 = 0.0f;
                                }
                                float f63 = measuredHeight7 - f41;
                                w90Var7 = qnVar.E1;
                                if (w90Var7 != null) {
                                    w90Var8 = qnVar.E1;
                                    f42 = w90Var8.e();
                                } else {
                                    f42 = 0.0f;
                                }
                                org.telegram.ui.Cells.t1 t1Var6 = t1Var4;
                                canvas3.clipRect(0.0f, f57 + f42, getMeasuredWidth(), f63);
                                mmVar21 = qnVar.t0;
                                canvas3.translate(0.0f, mmVar21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                t1Var2 = t1Var6;
                                f16 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f58, (int) dp, (int) f60, (int) f61, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (t1Var2 != null && t1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            mmVar4 = qnVar.t0;
                            float left3 = mmVar4.getLeft();
                            mmVar5 = qnVar.t0;
                            float right2 = mmVar5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - qnVar.oc) - qnVar.W8(org.telegram.ui.Components.w11.c)) - AndroidUtilities.dp(f15);
                            w90Var3 = qnVar.E1;
                            if (w90Var3 != null) {
                                w90Var4 = qnVar.E1;
                                float max = Math.max(0.0f, w90Var4.e());
                                w90Var5 = qnVar.E1;
                                f18 = Math.max(0.0f, w90Var5.d());
                                f17 = max;
                            } else {
                                f17 = 0.0f;
                                f18 = 0.0f;
                            }
                            ak akVar = qnVar.U;
                            if (akVar != null && (dfVar = akVar.i0) != null) {
                                f18 = Math.max(f18, dfVar.f ? 0.0f : Math.max(0.0f, dfVar.getMeasuredHeight() - (dfVar.c.getTranslationY() + dfVar.e)));
                            }
                            float f64 = f57 + f17;
                            float f65 = measuredHeight8 - f18;
                            if (t1Var2 == null || !t1Var2.getTransitionParams().w0) {
                                mmVar6 = qnVar.t0;
                                left3 = Math.max(left3, view8.getX() + mmVar6.getLeft());
                                mmVar7 = qnVar.t0;
                                f64 = Math.max(f64, view8.getY() + mmVar7.getY());
                                mmVar8 = qnVar.t0;
                                right2 = Math.min(right2, view8.getX() + mmVar8.getLeft() + view8.getMeasuredWidth());
                                mmVar9 = qnVar.t0;
                                f65 = Math.min(f65, view8.getY() + mmVar9.getY() + view8.getMeasuredHeight());
                            }
                            float f66 = f65;
                            float f67 = f64;
                            float f68 = right2;
                            float max2 = Math.max(left3, qnVar.R8());
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
                                    num12 = qnVar.I8;
                                    t1Var2.setScrimReaction(num12);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(true);
                                    num11 = qnVar.I8;
                                    w0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f21, f39, f22, f20);
                                mmVar18 = qnVar.t0;
                                float x11 = view8.getX() + mmVar18.getLeft();
                                mmVar19 = qnVar.t0;
                                canvas4.translate(x11, view8.getY() + mmVar19.getY());
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
                                if (w0Var != null) {
                                    w0Var.z(canvas4);
                                }
                                canvas4.restore();
                                if (t1Var2 != null) {
                                    t1Var2.setInvalidatesParent(false);
                                    t1Var2.setScrimReaction(num4);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(false);
                                    w0Var.setScrimReaction(num4);
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
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & t1Var2.s0()) != 0) {
                                    arrayList5.add(t1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i18 = groupedMessagePosition2.flags;
                                    if ((i18 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(t1Var2);
                            }
                            num5 = qnVar.I8;
                            if (num5 == null || t1Var2 == null || groupedMessages3 != null) {
                                float f69 = f22;
                                float f70 = f21;
                                View view27 = view9;
                                float f71 = f20;
                                float f72 = f19;
                                f23 = f57;
                                num6 = qnVar.I8;
                                if (num6 != null && w0Var != null) {
                                    paint13 = qnVar.z8;
                                    if (paint13 != null) {
                                        matrix7 = qnVar.A8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / qnVar.x8.getWidth();
                                        matrix8 = qnVar.A8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = qnVar.y8;
                                        matrix9 = qnVar.A8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = qnVar.z8;
                                        paint16.setAlpha((int) (qnVar.H8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = qnVar.z8;
                                        w0Var2 = w0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint14 = qnVar.B8;
                                        f24 = qnVar.D8;
                                        f25 = qnVar.G8;
                                        paint14.setAlpha((int) (f25 * f24 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = qnVar.B8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f67 < f66) {
                                        f26 = qnVar.D8;
                                        f27 = qnVar.G8;
                                        float f73 = (f27 * f26) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f28 = qnVar.G8;
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
                                        mmVar10 = qnVar.t0;
                                        float x12 = view27.getX() + mmVar10.getLeft();
                                        mmVar11 = qnVar.t0;
                                        canvas3.translate(x12, view27.getY() + mmVar11.getY() + view27.getPaddingTop());
                                        num7 = qnVar.I8;
                                        boolean z14 = qnVar.E8;
                                        hg.s0 s0Var = w0Var2.y0;
                                        if (!s0Var.b) {
                                            org.telegram.ui.ActionBar.b6 b6Var = w0Var2.U0;
                                            if (b6Var != null) {
                                                b6Var.o(w0Var2.q0, w0Var2.p0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.r0);
                                            } else {
                                                org.telegram.ui.ActionBar.f6.q(w0Var2.q0, w0Var2.p0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.r0);
                                            }
                                            s0Var.D = f73;
                                            s0Var.E = z14;
                                            s0Var.d(canvas3, w0Var2.e2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        mmVar12 = qnVar.t0;
                                        float x13 = view27.getX() + mmVar12.getLeft();
                                        mmVar13 = qnVar.t0;
                                        canvas3.translate(x13, view27.getY() + mmVar13.getY() + view27.getPaddingTop());
                                        int i19 = qnVar.J8;
                                        num8 = qnVar.I8;
                                        w0Var2.D(this, canvas3, i19, num8, f73);
                                        imVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = qnVar.z8;
                                if (paint18 != null) {
                                    matrix10 = qnVar.A8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / qnVar.x8.getWidth();
                                    matrix11 = qnVar.A8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = qnVar.y8;
                                    matrix12 = qnVar.A8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = qnVar.z8;
                                    paint21.setAlpha((int) (qnVar.H8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = qnVar.z8;
                                    f30 = f22;
                                    f31 = f21;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f30 = f22;
                                    f31 = f21;
                                    view10 = view9;
                                    paint19 = qnVar.B8;
                                    f32 = qnVar.D8;
                                    f33 = qnVar.G8;
                                    paint19.setAlpha((int) (f33 * f32 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = qnVar.B8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f67 < f66) {
                                    f34 = qnVar.D8;
                                    f35 = qnVar.G8;
                                    float f75 = (f35 * f34) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f36 = qnVar.G8;
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
                                    mmVar14 = qnVar.t0;
                                    float x14 = view10.getX() + mmVar14.getLeft();
                                    mmVar15 = qnVar.t0;
                                    canvas5.translate(x14, view10.getY() + mmVar15.getY() + view10.getPaddingTop());
                                    num9 = qnVar.I8;
                                    t1Var2.h2(canvas5, num9, f75, qnVar.E8);
                                    canvas5.restore();
                                    canvas5.save();
                                    mmVar16 = qnVar.t0;
                                    float x15 = view10.getX() + mmVar16.getLeft();
                                    mmVar17 = qnVar.t0;
                                    canvas5.translate(x15, view10.getY() + mmVar17.getY() + view10.getPaddingTop());
                                    int i20 = qnVar.J8;
                                    num10 = qnVar.I8;
                                    f23 = f57;
                                    t1Var2.i2(this, canvas5, i20, num10, f75);
                                    canvas.restore();
                                } else {
                                    f23 = f57;
                                }
                            }
                            imVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i10 = childCount;
                            i11 = i15;
                            iVar = iVar2;
                            f23 = f57;
                            imVar2 = this;
                        }
                        i15 = i11 + 1;
                        imVar3 = imVar2;
                        y10 = f23;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i10;
                    }
                    imVar = imVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f12 = 1.0f;
                    float f78 = y10;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i21 = 0; i21 < size3; i21++) {
                            imVar.a0(canvas3, f78, (org.telegram.ui.Cells.t1) arrayList3.get(i21), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i22 = 0; i22 < size4; i22++) {
                            imVar.a0(canvas3, f78, (org.telegram.ui.Cells.t1) arrayList2.get(i22), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i23 = 0; i23 < size5; i23++) {
                            org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList.get(i23);
                            if (t1Var7.getCurrentPosition() != null || t1Var7.getTransitionParams().w0) {
                                imVar.a0(canvas3, f78, t1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i24 = 0; i24 < size6; i24++) {
                            org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList4.get(i24);
                            if (t1Var8.getCurrentPosition() != null || t1Var8.getTransitionParams().w0) {
                                imVar.a0(canvas3, f78, t1Var8, 3);
                            }
                        }
                    }
                    num3 = qnVar.I8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = qnVar.z8;
                        if (paint8 != null) {
                            matrix4 = qnVar.A8;
                            matrix4.reset();
                            float measuredWidth13 = imVar.getMeasuredWidth() / qnVar.x8.getWidth();
                            matrix5 = qnVar.A8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = qnVar.y8;
                            matrix6 = qnVar.A8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = qnVar.z8;
                            paint11.setAlpha((int) (qnVar.H8 * 255.0f));
                            float measuredWidth14 = imVar.getMeasuredWidth();
                            float measuredHeight13 = imVar.getMeasuredHeight();
                            paint12 = qnVar.z8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = qnVar.B8;
                            f13 = qnVar.D8;
                            f14 = qnVar.G8;
                            paint9.setAlpha((int) (f14 * f13 * 255.0f));
                            float measuredWidth15 = imVar.getMeasuredWidth();
                            float measuredHeight14 = imVar.getMeasuredHeight();
                            paint10 = qnVar.B8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i25 = 0; i25 < size7; i25++) {
                            org.telegram.ui.Cells.t1 t1Var9 = (org.telegram.ui.Cells.t1) arrayList4.get(i25);
                            if (t1Var9.getCurrentPosition() != null || t1Var9.getTransitionParams().w0) {
                                imVar.a0(canvas3, f78, t1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = qnVar.I8;
                    if (num13 == null) {
                        f48 = qnVar.G8;
                        if (f48 < f12) {
                            paint25 = qnVar.z8;
                            if (paint25 != null) {
                                matrix13 = qnVar.A8;
                                matrix13.reset();
                                float measuredWidth16 = imVar.getMeasuredWidth() / qnVar.x8.getWidth();
                                matrix14 = qnVar.A8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = qnVar.y8;
                                matrix15 = qnVar.A8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = qnVar.z8;
                                paint28.setAlpha((int) (qnVar.H8 * 255.0f));
                                float measuredWidth17 = imVar.getMeasuredWidth();
                                float measuredHeight15 = imVar.getMeasuredHeight();
                                paint29 = qnVar.z8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = qnVar.B8;
                                f49 = qnVar.D8;
                                f50 = qnVar.G8;
                                paint26.setAlpha((int) ((f12 - f50) * f49 * 255.0f));
                                float measuredWidth18 = imVar.getMeasuredWidth();
                                float measuredHeight16 = imVar.getMeasuredHeight();
                                paint27 = qnVar.B8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            imVar = imVar3;
            f11 = 20.0f;
            f12 = 1.0f;
            num13 = qnVar.I8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            imVar = imVar3;
            f11 = 20.0f;
        }
        view3 = qnVar.F8;
        if (view3 != null || ((ArrayList) qnVar.I9.c).size() > 0) {
            w90Var = qnVar.E1;
            if (w90Var != null) {
                w90Var2 = qnVar.E1;
            }
            super.drawChild(canvas3, qnVar.f1, SystemClock.uptimeMillis());
            rj rjVar = qnVar.T2;
            if (rjVar != null && rjVar.getTag() != null) {
                super.drawChild(canvas3, qnVar.T2, SystemClock.uptimeMillis());
            }
            qj qjVar = qnVar.U2;
            if (qjVar != null && qjVar.getTag() != null) {
                super.drawChild(canvas3, qnVar.U2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.c00 c00Var = qnVar.i9;
            if (c00Var != null) {
                super.drawChild(canvas3, c00Var, SystemClock.uptimeMillis());
            }
            ch.k kVar11 = qnVar.T9;
            if (kVar11 != null) {
                super.drawChild(canvas3, kVar11, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.s30 s30Var3 = qnVar.a2;
            if (s30Var3 != null) {
                super.drawChild(canvas3, s30Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = qnVar.u3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.u3, SystemClock.uptimeMillis());
            }
            xk xkVar = qnVar.v3;
            if (xkVar != null && xkVar.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.v3, SystemClock.uptimeMillis());
            }
            kh.x3 x3Var = qnVar.t1;
            if (x3Var != null && x3Var.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.t1, SystemClock.uptimeMillis());
            }
            ml mlVar = qnVar.x1;
            if (mlVar != null && mlVar.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.x1, SystemClock.uptimeMillis());
            }
            kh.x3 x3Var2 = qnVar.v1;
            if (x3Var2 != null && x3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.v1, SystemClock.uptimeMillis());
            }
            ak akVar2 = qnVar.U;
            if (akVar2 != null && akVar2.H != null) {
                canvas3.save();
                canvas3.translate(qnVar.U.H.getX() + qnVar.U.getX(), qnVar.U.H.getY() + qnVar.U.getY());
                qnVar.U.H.draw(canvas3);
                canvas3.restore();
            }
        }
        if (qnVar.la > 0 && imVar.f < AndroidUtilities.dp(f11)) {
            int themedColor = qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6);
            if (imVar.z0 == null) {
                imVar.z0 = new Paint();
            }
            if (imVar.A0 != themedColor) {
                Paint paint32 = imVar.z0;
                imVar.A0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, imVar.getMeasuredHeight() - qnVar.la, imVar.getMeasuredWidth(), imVar.getMeasuredHeight(), imVar.z0);
            canvas3 = canvas6;
        }
        kp kpVar = qnVar.L9;
        if (kpVar != null && kpVar.e()) {
            int inputBubbleTop = (int) qnVar.O.getInputBubbleTop();
            int inputBubbleBottom = (int) qnVar.O.getInputBubbleBottom();
            qn qnVar2 = qnVar.P9;
            int i26 = inputBubbleTop - ((int) (qnVar.Q9 * (qnVar2 == null ? 0.0f : qnVar2.K9)));
            kp kpVar2 = qnVar.L9;
            imVar.getMeasuredWidth();
            kpVar2.b(canvas3, i26, inputBubbleBottom);
        }
        if (qnVar.P9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, imVar.getMeasuredWidth(), imVar.getMeasuredHeight(), (int) (qnVar.Q9 * 255.0f), 31);
            canvas3 = canvas;
            qnVar.P9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        qnVar.ta.e(canvas3);
        if (i9 >= 0) {
            canvas3.restore();
        }
        if (qnVar.ga) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (qnVar.ha * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        wk wkVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (wkVar = this.F0.Aa) == null || !wkVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        wkVar.a(true);
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
        jk jkVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.F0;
        pg.d dVar = qnVar.J3;
        if (dVar != null) {
            dVar.n = SystemClock.uptimeMillis();
        }
        float y10 = (AndroidUtilities.isInMultiwindow || qnVar.isInBubbleMode()) ? (qnVar.U.getEmojiView() != null ? qnVar.U.getEmojiView() : qnVar.U).getY() : qnVar.U.getY();
        View view = qnVar.F8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        }
        ak akVar = qnVar.U;
        if (akVar == null || !akVar.u3 || motionEvent.getY() >= y10) {
            qnVar.f9 = motionEvent.getY();
            org.telegram.ui.Cells.z9 o6 = qnVar.Y8.o(getContext());
            motionEvent.offsetLocation(-o6.getX(), -o6.getY());
            if (!qnVar.Y8.y() || !qnVar.Y8.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o6.getX(), o6.getY());
                if (o6.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                kh.j1 j1Var = qnVar.m1;
                if (j1Var != null) {
                    if (qnVar.q3 != null) {
                        z10 = j1Var.A(motionEvent);
                        if (qnVar.m1.D) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !qnVar.Y8.y() || (motionEvent.getY() >= qnVar.t0.getTop() && motionEvent.getY() <= qnVar.t0.getBottom())) {
                            jkVar = qnVar.sa;
                            if (!jkVar.n) {
                                return jkVar.g(motionEvent);
                            }
                            com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.e;
                            if (lVar == null || !lVar.a) {
                                if (qnVar.isInPreviewMode() && qnVar.F9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (qnVar.f1 != null) {
                                            int i9 = 0;
                                            for (int i10 = 3; i9 < i10; i10 = 3) {
                                                j4.c cVar = qnVar.f1.e[i9 == 0 ? (char) 1 : i9 == 1 ? (char) 2 : (char) 3];
                                                if (cVar != null) {
                                                    ((qg.b) cVar.b).getLocationInWindow(iArr2);
                                                    Rect rect = AndroidUtilities.rectTmp2;
                                                    int i11 = iArr2[0] - iArr[0];
                                                    rect.set(i11, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i11, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                i9++;
                                            }
                                        }
                                        z11 = false;
                                        dj djVar = qnVar.W0;
                                        if (djVar != null) {
                                            djVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i12 = iArr2[0] - iArr[0];
                                            rect2.set(i12, iArr2[1] - iArr[1], qnVar.W0.getMeasuredWidth() + i12, qnVar.W0.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.B0 = motionEvent.getX();
                                                    this.C0 = motionEvent.getY();
                                                    this.D0 = SystemClock.elapsedRealtime();
                                                    this.E0 = z12;
                                                    dj djVar2 = qnVar.W0;
                                                    if (djVar2 != null) {
                                                        djVar2.d0.c(z12);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    this.D0 = -1L;
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        dj djVar3 = qnVar.W0;
                                        if (djVar3 != null) {
                                            djVar3.d0.c(false);
                                        }
                                        if (this.E0 || (g7.w.a(this.B0, this.C0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.D0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.E0) {
                                                b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                                                qnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) b5Var2).P(ProfileActivity.m4(qnVar.P5));
                                            } else {
                                                b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                                                ((ActionBarLayout) b5Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.D0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.D0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z10) {
                                }
                            } else {
                                r4 r4Var = (r4) com.google.firebase.messaging.l.i().d;
                                if (r4Var != null) {
                                    r4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o6.getX(), -o6.getY());
                            if (qnVar.Y8.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o6.getX(), o6.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = j1Var.e;
                        if (j1Var.D) {
                            j1Var.E = true;
                            j1Var.D = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(j1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            j1Var.d = 0;
                            j1Var.c = 1.0f;
                            org.telegram.ui.Components.c71 c71Var = j1Var.I;
                            if (c71Var != null) {
                                c71Var.e(1.0f, 0, j1Var.b);
                            }
                            j1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                jkVar = qnVar.sa;
                if (!jkVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.K0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.t0) goto L69;
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
        kh.h6 h6Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        ek ekVar;
        MessageObject messageObject;
        uk ukVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        qn qnVar = this.F0;
        boolean z12 = false;
        if ((qnVar.F8 == null && ((ArrayList) qnVar.I9.c).size() <= 0) || (view != qnVar.f1 && view != qnVar.T2 && view != qnVar.U2 && view != qnVar.i9 && view != qnVar.T9 && view != qnVar.a2 && view != null && view != qnVar.u3 && view != qnVar.v3)) {
            if ((view != qnVar.u3 || !PhotoViewer.t1().Q1()) && (!qnVar.O9 || view != qnVar.t0)) {
                if (qnVar.ga) {
                    kVar3 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                }
                if (view != qnVar.X2) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (h6Var = qnVar.u2) != null && h6Var.a() && qnVar.u2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == qnVar.p8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    } else {
                        if (view != qnVar.t0) {
                            if (view != qnVar.O) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == qnVar.p8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-qnVar.J9) - (qnVar.Q9 != 0.0f ? (qnVar.t0.getMeasuredHeight() - qnVar.J9) * qnVar.Q9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.f6.k3 != null && qnVar.r8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y10 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(qnVar.p8.getScaleX(), qnVar.p8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.f6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.f6.k3.setBounds(x10, y10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(qnVar.C9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(qnVar.C9()) + y10);
                                            org.telegram.ui.ActionBar.f6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z12 = super.drawChild(canvas, view, j10);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                                        z12 = super.drawChild(canvas, view, j10);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z12;
                                }
                                if (view == qnVar.O && (ukVar = qnVar.X2) != null && ukVar.getVisibility() == 0) {
                                    super.drawChild(canvas, qnVar.X2, j10);
                                }
                                z12 = super.drawChild(canvas, view, j10);
                                if (z11 && view == qnVar.t0 && playingMessageObject.type != 5 && (ekVar = qnVar.p8) != null && ekVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-qnVar.J9) - (qnVar.Q9 != 0.0f ? (qnVar.t0.getMeasuredHeight() - qnVar.J9) * qnVar.Q9 : 0.0f)) + qnVar.K9);
                                    super.drawChild(canvas, qnVar.p8, j10);
                                    if (qnVar.q8 != null) {
                                        canvas.save();
                                        canvas.translate(qnVar.q8.getX(), qnVar.t0.getY() + qnVar.q8.getTop());
                                        if (z10) {
                                            qnVar.q8.g2(canvas);
                                            invalidate();
                                            qnVar.q8.invalidate();
                                        } else {
                                            qnVar.q8.Y1(canvas);
                                            org.telegram.ui.Cells.t1 t1Var = qnVar.q8;
                                            if (!t1Var.rb && ((messageObject = t1Var.u7) == null || messageObject.type != 27)) {
                                                t1Var.m2(t1Var.getAlpha(), canvas, true);
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
                        if (view == qnVar.p8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.xu0
    public float getBottomOffset() {
        return this.F0.t0.getBottom();
    }

    public qn getChatActivity() {
        return this.F0;
    }

    @Override // org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.xu0
    public int getKeyboardHeight() {
        if (this.F0.Ka) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.xu0
    public float getListTranslationY() {
        return this.F0.t0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.xu0
    public Drawable getNewDrawable() {
        Drawable d = this.F0.aa.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.xu0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.F0.aa.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.xu0
    public int getScrollOffset() {
        return this.F0.t0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        qn qnVar = this.F0;
        if (qnVar.Ka) {
            this.D.b = qnVar.T0;
        } else {
            b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.D;
                    b5Var3 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                    q1Var.b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.D.c();
        qnVar.U.setAdjustPanLayoutHelper(this.D);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == qnVar.P5)) {
            MediaController.getInstance().setTextureView(qnVar.N7(false), qnVar.r8, qnVar.p8, true);
        }
        kp kpVar = qnVar.L9;
        if (kpVar != null) {
            kpVar.f();
        }
        qnVar.ta.j();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.D.d();
        qn qnVar = this.F0;
        kp kpVar = qnVar.L9;
        if (kpVar != null) {
            NotificationCenter.getInstance(kpVar.a0).removeObserver(kpVar, NotificationCenter.updateInterfaces);
            kpVar.B.onDetachedFromWindow();
            org.telegram.ui.Components.k5 k5Var = kpVar.g0;
            if (k5Var != null && (view = kpVar.W) != null) {
                k5Var.o(view);
            }
            kpVar.M = 0.0f;
            kpVar.L = 0L;
            qnVar.L9 = null;
        }
        qnVar.ta.k();
        AndroidUtilities.runOnUIThread(new bg.d2(24));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        qn qnVar;
        kh.h6 h6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (h6Var = (qnVar = this.F0).u2) == null || !h6Var.a() || qnVar.u2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.yc) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int d;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int dp;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar3;
        int i20;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        qn qnVar = this.F0;
        xg.i iVar = qnVar.v;
        int i21 = (measuredWidth - qnVar.Qa) - qnVar.Ra;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i23 = layoutParams.gravity;
                if (i23 == -1) {
                    i23 = 51;
                }
                int i24 = i23 & 112;
                int i25 = i23 & 7;
                if (i25 == 1) {
                    d = j3.r0.d(i21, measuredWidth2, 2, qnVar.Qa) + layoutParams.leftMargin;
                    i13 = layoutParams.rightMargin;
                } else if (i25 != 5) {
                    i14 = qnVar.Qa + layoutParams.leftMargin;
                    if (i24 == 16) {
                        if (i24 == 48) {
                            i17 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                    i17 += kVar7.getMeasuredHeight();
                                }
                            }
                        } else if (i24 != 80) {
                            i17 = layoutParams.topMargin;
                        } else {
                            i15 = (i12 - i10) - measuredHeight;
                            i16 = layoutParams.bottomMargin;
                        }
                        if (b0(childAt)) {
                            i17 = 0;
                            i14 = 0;
                        } else {
                            if (childAt != qnVar.I9 && childAt != qnVar.T9 && childAt != qnVar.O && !(childAt instanceof org.telegram.ui.Components.s30) && !(childAt instanceof org.telegram.ui.Components.gp)) {
                                if (childAt instanceof org.telegram.ui.Cells.z9) {
                                    i19 = qnVar.va;
                                } else if (childAt == qnVar.M0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                        i20 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i20 = 0;
                                    }
                                    i17 += i20;
                                } else if (qnVar.U.t0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.o2) qnVar).inBubbleMode;
                                        if (!z11) {
                                            i17 = qnVar.U.getBottom();
                                        }
                                    }
                                    i17 = qnVar.U.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i17 += dp;
                                } else {
                                    ak akVar = qnVar.U;
                                    if (akVar != null && (childAt == akVar.J1 || childAt == akVar.I1)) {
                                        i17 = org.telegram.messenger.ll.w(7.0f, iVar.d(), i17);
                                        i14 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == qnVar.s2) {
                                        i17 = org.telegram.messenger.ll.w(7.0f, iVar.d(), i17);
                                    } else if (akVar == null || childAt != akVar.a1) {
                                        if (childAt == qnVar.a2 || childAt == qnVar.o2 || childAt == qnVar.b2) {
                                            i18 = this.s0;
                                        } else if (childAt == qnVar.t0 || childAt == qnVar.r0 || childAt == qnVar.T2 || childAt == qnVar.U2 || childAt == qnVar.V2) {
                                            i19 = qnVar.va;
                                        } else if (childAt != qnVar.L) {
                                            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                            if (childAt == kVar) {
                                                i17 -= getPaddingTop();
                                                if (qnVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i17 += dp;
                                                }
                                            } else if (childAt == qnVar.p8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                                i17 = kVar2.getMeasuredHeight();
                                            } else if (childAt != qnVar.X2 && childAt != qnVar.Y2 && childAt != qnVar.q0) {
                                                if (childAt instanceof org.telegram.ui.Components.cb0) {
                                                    i17 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != qnVar.P) {
                                                    if (childAt != qnVar.J3) {
                                                    }
                                                }
                                            }
                                        } else if (akVar.y0()) {
                                            i18 = AndroidUtilities.dp(48.0f);
                                        }
                                        i17 -= i18;
                                    } else {
                                        i17 = org.telegram.messenger.ll.w(9.0f, iVar.d(), i17);
                                    }
                                }
                                i17 = -i19;
                            }
                            i17 = 0;
                        }
                        childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
                    } else {
                        i15 = (((i12 - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    i17 = i15 - i16;
                    if (b0(childAt)) {
                    }
                    childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
                } else {
                    d = (measuredWidth - qnVar.Ra) - measuredWidth2;
                    i13 = layoutParams.rightMargin;
                }
                i14 = d - i13;
                if (i24 == 16) {
                }
                i17 = i15 - i16;
                if (b0(childAt)) {
                }
                childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
            }
        }
        qj qjVar = qnVar.U2;
        if (qjVar != null) {
            qjVar.setBackgroundHeight(getMeasuredHeight());
        }
        qnVar.o9();
        qnVar.r9();
        qnVar.Mc(false, false);
        S();
        qnVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0531  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
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
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.w0 w0Var;
        TLRPC.User user;
        qn qnVar = this.F0;
        xg.i iVar = qnVar.v;
        qnVar.zc.a();
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (size - qnVar.Qa) - qnVar.Ra;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
        ng.a aVar = qnVar.H.a;
        if (aVar instanceof ng.b) {
            ((ng.b) aVar).b(i14, size2);
        }
        if (this.u0 != i14) {
            qnVar.B4 = false;
            this.u0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
            if (z13 || (user = qnVar.f) == null || !user.self) {
                qnVar.G9 = false;
            } else {
                org.telegram.ui.ActionBar.h5 titleTextView = qnVar.W0.getTitleTextView();
                if (i14 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    qnVar.G9 = !qnVar.H9;
                } else {
                    qnVar.G9 = false;
                }
            }
            if (qnVar.G9 || qnVar.H9 || UserObject.isBotForumWithEditableTopics(qnVar.f)) {
                dj djVar = qnVar.W0;
                if (djVar != null && djVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) qnVar.W0.getLayoutParams()).rightMargin = AndroidUtilities.dp(qnVar.N3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                dj djVar2 = qnVar.W0;
                if (djVar2 != null && djVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) qnVar.W0.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (qnVar.G9) {
                kVar8 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (!kVar8.j0 && (w0Var = qnVar.i0) != null) {
                    w0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = qnVar.d0;
                if (w0Var2 != null) {
                    w0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.w0 w0Var3 = qnVar.d0;
                if (w0Var3 != null) {
                    w0Var3.K(40);
                }
                org.telegram.ui.ActionBar.w0 w0Var4 = qnVar.i0;
                if (w0Var4 != null) {
                    w0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if (!kVar7.j0 && (yVar = qnVar.j0) != null) {
                yVar.f((!qnVar.H9 || qnVar.G9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = qnVar.d0;
            if (w0Var5 != null) {
                TLRPC.UserFull userFull = qnVar.W7;
                if (qnVar.H9) {
                    w0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    w0Var5.K(32);
                }
            }
            qnVar.B4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + qnVar.ka >= AndroidUtilities.dp(20.0f);
        if (this.t0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (qnVar.la > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            qnVar.ka = qnVar.la;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            qnVar.ka = qnVar.U.s0() ? qnVar.U.getEmojiPadding() : 0;
        } else {
            qnVar.ka = 0;
        }
        setEmojiKeyboardHeight(qnVar.ka);
        boolean z15 = this.f + qnVar.ka >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i15 = 0; i15 < qnVar.t0.getChildCount(); i15++) {
                View childAt = qnVar.t0.getChildAt(i15);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        qnVar.t0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            qnVar.v0.i1(R, (int) (((((qnVar.t0.getMeasuredHeight() - qnVar.o9) - qnVar.wa) + ((this.f + qnVar.ka) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(qnVar.C9()))) / 2.0f), false);
                            qnVar.w0.m(R);
                            this.D.g = true;
                            childCount = getChildCount();
                            int i16 = paddingTop;
                            measureChildWithMargins(qnVar.U, makeMeasureSpec, 0, i10, 0);
                            z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
                            if (!z10 || qnVar.Ka) {
                                this.s0 = 0;
                            } else {
                                this.s0 = qnVar.U.getMeasuredHeight();
                            }
                            qnVar.va = 0;
                            qnVar.wa = 0;
                            if (SharedConfig.chatBlurEnabled() && !qnVar.Ka && qnVar.B != null && Build.VERSION.SDK_INT >= 31) {
                                int i17 = qnVar.C;
                                qnVar.va = i17;
                                qnVar.wa = i17;
                            }
                            for (i11 = 0; i11 < childCount; i11++) {
                                int i18 = -1;
                                View childAt2 = getChildAt(i11);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != qnVar.U) {
                                    kVar4 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                    if (childAt2 != kVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == qnVar.t0 || childAt2 == qnVar.r0 || (childAt2 instanceof org.telegram.ui.Cells.z9)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), qnVar.va + size2 + qnVar.wa), TLObject.FLAG_30));
                                            } else if (childAt2 == qnVar.L) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i19 = i16 - this.s0;
                                                z12 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((qnVar.U.y0() ? 48 : 0) + 2) + (i19 - (z12 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == qnVar.X2) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                qnVar.X2.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) qnVar.pc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == qnVar.Y2) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) qnVar.pc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == qnVar.M0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30));
                                            } else if (qnVar.U.t0(childAt2)) {
                                                org.telegram.ui.Components.rf rfVar = qnVar.U.C1;
                                                if (childAt2 == rfVar && rfVar != null) {
                                                    i18 = rfVar.getKeyboardHeight();
                                                }
                                                z11 = ((org.telegram.ui.ActionBar.o2) qnVar).inBubbleMode;
                                                if (z11) {
                                                    int paddingTop2 = getPaddingTop() + (i16 - this.s0) + measuredHeight;
                                                    if (i18 < 0) {
                                                        i18 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                                                } else if (AndroidUtilities.isInMultiwindow) {
                                                    int paddingTop3 = getPaddingTop() + (((i16 - this.s0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                    if (i18 < 0) {
                                                        i18 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                }
                                            } else {
                                                tj tjVar = qnVar.E1;
                                                if (childAt2 == tjVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tjVar.getLayoutParams();
                                                    of.f1 adapter = qnVar.E1.getAdapter();
                                                    if (adapter.s0 == null || adapter.d0) {
                                                        qnVar.E1.setIgnoreLayout(true);
                                                        layoutParams.height = i16;
                                                        layoutParams.topMargin = 0;
                                                        qnVar.E1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == qnVar.Y8.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int i20 = i16 + qnVar.va;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || qnVar.Ka) {
                                                        jm jmVar = qnVar.Y8;
                                                        jmVar.e0 = 0;
                                                        jmVar.x();
                                                    } else {
                                                        i20 += keyboardHeight;
                                                        jm jmVar2 = qnVar.Y8;
                                                        jmVar2.e0 = keyboardHeight;
                                                        jmVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.cb0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == qnVar.N1) {
                                                    kVar5 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                                    if (kVar5.getVisibility() == 0) {
                                                        kVar6 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                                                        i13 = size2 - kVar6.getMeasuredHeight();
                                                    } else {
                                                        i13 = size2;
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
                                                } else {
                                                    measureChildWithMargins(childAt2, makeMeasureSpec, 0, i10, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (qnVar.A4) {
                                qnVar.B4 = true;
                                qnVar.o9();
                                qnVar.r9();
                                qnVar.A4 = false;
                                ij ijVar = qnVar.t0;
                                ijVar.measure(View.MeasureSpec.makeMeasureSpec(ijVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(qnVar.t0.getMeasuredHeight(), TLObject.FLAG_30));
                                qnVar.B4 = false;
                            }
                            i12 = qnVar.t4;
                            if (i12 != -1) {
                                AndroidUtilities.runOnUIThread(new bg.c2(this, i12, 24));
                                qnVar.t4 = -1;
                            }
                            gcVar = org.telegram.ui.Components.gc.w;
                            if (gcVar != null && qnVar.Vb != null) {
                                gcVar.l();
                            }
                            qnVar.S6();
                            this.t0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.re reVar = qnVar.U.T3;
        AndroidUtilities.cancelRunOnUIThread(reVar);
        reVar.run();
        childCount = getChildCount();
        int i162 = paddingTop;
        measureChildWithMargins(qnVar.U, makeMeasureSpec, 0, i10, 0);
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        if (z10) {
        }
        this.s0 = 0;
        qnVar.va = 0;
        qnVar.wa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i172 = qnVar.C;
            qnVar.va = i172;
            qnVar.wa = i172;
        }
        while (i11 < childCount) {
        }
        if (qnVar.A4) {
        }
        i12 = qnVar.t4;
        if (i12 != -1) {
        }
        gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar != null) {
            gcVar.l();
        }
        qnVar.S6();
        this.t0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        qn qnVar = this.F0;
        og.d.c(qnVar.v8, qnVar.fragmentView);
        qnVar.w8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.F0.B4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        qn qnVar = this.F0;
        qnVar.r9 = i10;
        qnVar.o9();
        qnVar.r9();
    }

    @Override // org.telegram.ui.Components.xu0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.xu0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.xu0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
