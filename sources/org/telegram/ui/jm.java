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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.Components.zu0 {
    public int A0;
    public float B0;
    public float C0;
    public long D0;
    public boolean E0;
    public final /* synthetic */ rn F0;
    public int s0;
    public int t0;
    public int u0;
    public final ArrayList v0;
    public final ArrayList w0;
    public final ArrayList x0;
    public final ArrayList y0;
    public Paint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(rn rnVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.F0 = rnVar;
        this.s0 = 0;
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.D = new im(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        rn rnVar = this.F0;
        rnVar.T0.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        kVar.setTranslationY(0.0f);
        tk tkVar = rnVar.Xa;
        if (tkVar != null) {
            tkVar.setTranslationY(rnVar.k1 != null ? r3.getCurrentHeight() : 0);
        }
        lh.w3 w3Var = rnVar.s1;
        if (w3Var != null) {
            w3Var.setTranslationY(0.0f);
        }
        lh.w3 w3Var2 = rnVar.r1;
        if (w3Var2 != null) {
            w3Var2.setTranslationY(0.0f);
        }
        org.telegram.ui.Components.d21 d21Var = rnVar.N1;
        if (d21Var != null) {
            d21Var.setTranslationY(0.0f);
        }
        rnVar.M0.setTranslationY(0.0f);
        rnVar.L.setTranslationY(0.0f);
        rnVar.s9 = 0.0f;
        rnVar.t9 = 0.0f;
        rnVar.T0.setBackgroundTranslation(0);
        wk wkVar = rnVar.X2;
        if (wkVar != null) {
            wkVar.p0 = 0.0f;
            wkVar.s();
        }
        ag.t0 t0Var = rnVar.u2;
        if (t0Var != null) {
            org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) t0Var.b;
            v9Var.u = 0.0f;
            v9Var.d.invalidate();
        }
        rnVar.setFragmentPanTranslationOffset(0);
        rnVar.o9();
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.nb0) {
            ((org.telegram.ui.Components.nb0) drawable).p();
        }
        rn rnVar = this.F0;
        og.a c10 = rnVar.S.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(rnVar.S.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(rnVar.S.a(c10));
        rnVar.zb = computePerceivedBrightness <= 0.721f;
        rnVar.Ab = computePerceivedBrightness2 <= 0.9f;
        rnVar.H.a = c10;
        sg.f fVar = rnVar.T;
        if (fVar != null) {
            fVar.invalidate();
        }
        qg.g gVar = rnVar.O;
        if (gVar != null) {
            gVar.invalidate();
        }
        rnVar.n9();
        rnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f10, org.telegram.ui.Cells.s1 s1Var, int i10) {
        int save = canvas.save();
        rn rnVar = this.F0;
        float x8 = s1Var.getX() + rnVar.t0.getLeft();
        float y10 = s1Var.getY() + rnVar.t0.getY() + s1Var.getPaddingTop();
        float alpha = s1Var.a() ? s1Var.getAlpha() : 1.0f;
        canvas.clipRect(rnVar.t0.getLeft(), f10, rnVar.t0.getRight(), ((((rnVar.t0.getY() + rnVar.t0.getMeasuredHeight()) - rnVar.wa) - rnVar.v.d()) - rnVar.oc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x8, y10);
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.l2(alpha, canvas, true);
        } else if (i10 == 1) {
            s1Var.V1(canvas, alpha);
        } else if (i10 == 2) {
            s1Var.H1(alpha, canvas, s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0;
            s1Var.M1(canvas, alpha);
            if (!z10) {
                s1Var.c2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && rnVar.I8 != null)) {
            float f11 = (rnVar.D8 * rnVar.G8) / 0.2f;
            canvas.save();
            s1Var.g2(canvas, rnVar.I8, f11, rnVar.E8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x8, y10);
            s1Var.h2(this, canvas, rnVar.J8, rnVar.I8, f11);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.eg egVar;
        rn rnVar = this.F0;
        jg.a aVar = rnVar.F;
        ck ckVar = rnVar.U;
        if (ckVar == null || view != ckVar.i0) {
            super.addView(view, i10, layoutParams);
        } else {
            sg.f fVar = rnVar.T;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        ck ckVar2 = rnVar.U;
        if (ckVar2 != null && view == ckVar2.i0) {
            nh.w wVar = (nh.w) view;
            wVar.setBackgroundDrawable(aVar.c(wVar.c, rnVar.x, false));
        }
        ck ckVar3 = rnVar.U;
        if (ckVar3 == null || view != (egVar = ckVar3.J1)) {
            return;
        }
        egVar.setBlurredBackgroundFactory(aVar);
    }

    public final boolean b0(View view) {
        if (view == this.H) {
            return true;
        }
        rn rnVar = this.F0;
        return view == rnVar.u2 || view == rnVar.m1 || view == rnVar.i9 || view == rnVar.T || view == rnVar.G3;
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
    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
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
        jm jmVar;
        float f11;
        View view3;
        org.telegram.ui.Components.aa0 aa0Var;
        org.telegram.ui.Components.aa0 aa0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        nm nmVar;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        nm nmVar2;
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
        nm nmVar3;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i11;
        int i12;
        ArrayList arrayList5;
        org.telegram.ui.Cells.s1 s1Var2;
        ArrayList arrayList6;
        yg.i iVar;
        Integer num4;
        float f15;
        float f16;
        boolean z10;
        nm nmVar4;
        nm nmVar5;
        org.telegram.ui.Components.aa0 aa0Var3;
        float f17;
        float f18;
        nm nmVar6;
        nm nmVar7;
        nm nmVar8;
        nm nmVar9;
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
        nm nmVar10;
        nm nmVar11;
        Integer num7;
        nm nmVar12;
        nm nmVar13;
        Integer num8;
        jm jmVar2;
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
        nm nmVar14;
        nm nmVar15;
        Integer num9;
        nm nmVar16;
        nm nmVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f39;
        Integer num11;
        nm nmVar18;
        nm nmVar19;
        Integer num12;
        org.telegram.ui.Components.ze zeVar;
        org.telegram.ui.Components.aa0 aa0Var4;
        org.telegram.ui.Components.aa0 aa0Var5;
        org.telegram.ui.Cells.s1 s1Var3;
        float f40;
        nm nmVar20;
        org.telegram.ui.Cells.s1 s1Var4;
        boolean z11;
        org.telegram.ui.Components.aa0 aa0Var6;
        float f41;
        org.telegram.ui.Components.aa0 aa0Var7;
        float f42;
        nm nmVar21;
        org.telegram.ui.Components.aa0 aa0Var8;
        org.telegram.ui.Components.aa0 aa0Var9;
        nm nmVar22;
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
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.x30 x30Var;
        View view25;
        yi yiVar;
        View view26;
        mj mjVar;
        jm jmVar3 = this;
        rn rnVar = jmVar3.F0;
        yg.i iVar2 = rnVar.v;
        ArrayList arrayList7 = rnVar.j6;
        rnVar.U.S1();
        rnVar.jc();
        if (rnVar.na || ((mjVar = rnVar.u0) != null && mjVar.k())) {
            rnVar.na = false;
            rnVar.uc();
        }
        rnVar.Mc(false, false);
        rnVar.wc();
        yi yiVar2 = rnVar.c2;
        if (yiVar2 != null && yiVar2.getTag() != null && (view26 = (yiVar = rnVar.c2).e) != null) {
            yiVar.g(view26);
        }
        org.telegram.ui.Components.x30 x30Var2 = rnVar.e2;
        if (x30Var2 != null && x30Var2.getTag() != null && (view25 = (x30Var = rnVar.e2).e) != null) {
            x30Var.g(view25);
        }
        if (rnVar.ga) {
            kVar10 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), jmVar3.getMeasuredWidth(), jmVar3.getMeasuredHeight(), (int) (rnVar.ha * 255.0f), 31);
            float f54 = (rnVar.ha * 0.2f) + 0.8f;
            canvas2.scale(f54, f54, jmVar3.getMeasuredWidth() / 2.0f, jmVar3.getMeasuredHeight() / 2.0f);
            i10 = saveLayerAlpha;
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        for (int i14 = 0; i14 < size; i14++) {
            org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) arrayList7.get(i14);
            MessageObject.SendAnimationData sendAnimationData = s1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    ok okVar = rnVar.k1;
                    int currentHeight = measuredHeight + (okVar != null ? okVar.getCurrentHeight() : 0);
                    ak akVar = rnVar.l1;
                    int currentHeight2 = currentHeight + (akVar != null ? akVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
                    i13 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + rnVar.p9, jmVar3.getWidth(), jmVar3.getHeight());
                ImageReceiver photoImage = s1Var5.getPhotoImage();
                s1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((rnVar.U.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) org.telegram.ui.Cells.pa.b(1.0f, sendAnimationData.progress, s1Var5.getTranslationY(), r9[1])));
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
                s1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                s1Var5.draw(canvas2);
                canvas2.restore();
            }
        }
        num = rnVar.I8;
        if (num != null) {
            view24 = rnVar.F8;
        }
        paint = rnVar.z8;
        if (paint != null) {
            matrix = rnVar.A8;
            matrix.reset();
            float measuredWidth = jmVar3.getMeasuredWidth() / rnVar.x8.getWidth();
            matrix2 = rnVar.A8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = rnVar.y8;
            matrix3 = rnVar.A8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = rnVar.z8;
            paint5.setAlpha((int) (rnVar.H8 * 255.0f));
            paint6 = rnVar.z8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = jmVar3.getMeasuredWidth();
                float measuredHeight2 = jmVar3.getMeasuredHeight();
                paint7 = rnVar.z8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = rnVar.B8;
            f10 = rnVar.D8;
            float f56 = f10 * 255.0f;
            view = rnVar.F8;
            paint2.setAlpha((int) (f56 * (view != null ? rnVar.G8 : 1.0f)));
            paint3 = rnVar.B8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = jmVar3.getMeasuredWidth();
                float measuredHeight3 = jmVar3.getMeasuredHeight();
                paint4 = rnVar.B8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = rnVar.I8;
        if (num2 != null && rnVar.K8) {
            jmVar3.invalidate();
        }
        view2 = rnVar.F8;
        if (view2 != null) {
            view4 = rnVar.F8;
            if (view4 == rnVar.f1) {
                f51 = rnVar.G8;
                if (f51 < 1.0f) {
                    paint30 = rnVar.B8;
                    f52 = rnVar.D8;
                    f53 = rnVar.G8;
                    paint30.setAlpha((int) ((1.0f - f53) * f52 * 255.0f));
                    float measuredWidth4 = jmVar3.getMeasuredWidth();
                    float measuredHeight4 = jmVar3.getMeasuredHeight();
                    paint31 = rnVar.B8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = rnVar.F8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f43 = rnVar.G8;
                    if (f43 < 1.0f) {
                        view20 = rnVar.F8;
                        float left = view20.getLeft();
                        view21 = rnVar.F8;
                        float top = view21.getTop();
                        view22 = rnVar.F8;
                        float right = view22.getRight();
                        view23 = rnVar.F8;
                        float bottom = view23.getBottom();
                        f47 = rnVar.G8;
                        int i15 = (int) (f47 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = rnVar.F8;
                    float left2 = view12.getLeft();
                    view13 = rnVar.F8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = rnVar.F8;
                    kVar6 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = rnVar.F8;
                        float x8 = view16.getX();
                        view17 = rnVar.F8;
                        canvas3.translate(x8 - view17.getLeft(), 0.0f);
                        view18 = rnVar.F8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = rnVar.F8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, rnVar.C8);
                    }
                    view15 = rnVar.F8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f44 = rnVar.G8;
                    if (f44 < 1.0f) {
                        paint23 = rnVar.B8;
                        f45 = rnVar.D8;
                        f46 = rnVar.G8;
                        paint23.setAlpha((int) ((1.0f - f46) * f45 * 255.0f));
                        float measuredWidth6 = jmVar3.getMeasuredWidth();
                        float measuredHeight6 = jmVar3.getMeasuredHeight();
                        paint24 = rnVar.B8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    nmVar = rnVar.t0;
                    float y10 = ((nmVar.getY() + rnVar.o9) - rnVar.q9) - AndroidUtilities.dp(4.0f);
                    view6 = rnVar.F8;
                    if (view6 instanceof org.telegram.ui.Cells.s1) {
                        view11 = rnVar.F8;
                        groupedMessages = ((org.telegram.ui.Cells.s1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    nmVar2 = rnVar.t0;
                    int childCount = nmVar2.getChildCount();
                    int i16 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = jmVar3.x0;
                        f11 = 20.0f;
                        arrayList2 = jmVar3.w0;
                        arrayList3 = jmVar3.v0;
                        arrayList4 = jmVar3.y0;
                        if (i16 >= childCount) {
                            break;
                        }
                        nmVar3 = rnVar.t0;
                        View childAt = nmVar3.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            s1Var = (org.telegram.ui.Cells.s1) childAt;
                            groupedMessages2 = s1Var.getCurrentMessagesGroup();
                            groupedMessagePosition = s1Var.getCurrentPosition();
                            v0Var = null;
                        } else {
                            v0Var = childAt instanceof org.telegram.ui.Cells.v0 ? (org.telegram.ui.Cells.v0) childAt : null;
                            groupedMessages2 = null;
                            s1Var = null;
                            groupedMessagePosition = null;
                        }
                        float f57 = y10;
                        view7 = rnVar.F8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != 0.0f) {
                            if (z13 || s1Var == null || groupedMessages == null || (s1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i11 = childCount;
                                i12 = i16;
                                arrayList5 = arrayList;
                                s1Var2 = s1Var;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                f15 = 9.0f;
                                f16 = 1.0f;
                                z10 = z13;
                            } else {
                                f15 = 9.0f;
                                float D2 = s1Var3.D2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f58 = transitionParams.left + D2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f59 = transitionParams.top + transitionParams.offsetTop;
                                float f60 = transitionParams.right + D2 + transitionParams.offsetRight;
                                i11 = childCount;
                                float f61 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f40 = f59;
                                } else {
                                    f40 = transitionParams.cell.getTranslationY() + f59;
                                    f61 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f62 = f40;
                                float dp = f62 < (rnVar.o9 - ((float) rnVar.q9)) - ((float) AndroidUtilities.dp(20.0f)) ? (rnVar.o9 - rnVar.q9) - AndroidUtilities.dp(20.0f) : f62;
                                nmVar20 = rnVar.t0;
                                if (f61 > AndroidUtilities.dp(20.0f) + nmVar20.getMeasuredHeight()) {
                                    nmVar22 = rnVar.t0;
                                    f61 = AndroidUtilities.dp(20.0f) + nmVar22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i12 = i16;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size2) {
                                        arrayList5 = arrayList;
                                        s1Var4 = s1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i18 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i17);
                                    arrayList5 = arrayList;
                                    if (rnVar.S5[messageObject.getDialogId() == rnVar.P5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        s1Var4 = s1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i17++;
                                        size2 = i18;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - rnVar.oc) - AndroidUtilities.dp(9.0f);
                                aa0Var6 = rnVar.E1;
                                if (aa0Var6 != null) {
                                    aa0Var9 = rnVar.E1;
                                    f41 = aa0Var9.d();
                                } else {
                                    f41 = 0.0f;
                                }
                                float f63 = measuredHeight7 - f41;
                                aa0Var7 = rnVar.E1;
                                if (aa0Var7 != null) {
                                    aa0Var8 = rnVar.E1;
                                    f42 = aa0Var8.e();
                                } else {
                                    f42 = 0.0f;
                                }
                                org.telegram.ui.Cells.s1 s1Var6 = s1Var4;
                                canvas3.clipRect(0.0f, f57 + f42, getMeasuredWidth(), f63);
                                nmVar21 = rnVar.t0;
                                canvas3.translate(0.0f, nmVar21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                s1Var2 = s1Var6;
                                f16 = 1.0f;
                                transitionParams2.cell.A1(canvas, (int) f58, (int) dp, (int) f60, (int) f61, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (s1Var2 != null && s1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            nmVar4 = rnVar.t0;
                            float left3 = nmVar4.getLeft();
                            nmVar5 = rnVar.t0;
                            float right2 = nmVar5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - rnVar.oc) - rnVar.W8(org.telegram.ui.Components.z11.c)) - AndroidUtilities.dp(f15);
                            aa0Var3 = rnVar.E1;
                            if (aa0Var3 != null) {
                                aa0Var4 = rnVar.E1;
                                float max = Math.max(0.0f, aa0Var4.e());
                                aa0Var5 = rnVar.E1;
                                f18 = Math.max(0.0f, aa0Var5.d());
                                f17 = max;
                            } else {
                                f17 = 0.0f;
                                f18 = 0.0f;
                            }
                            ck ckVar = rnVar.U;
                            if (ckVar != null && (zeVar = ckVar.i0) != null) {
                                f18 = Math.max(f18, zeVar.f ? 0.0f : Math.max(0.0f, zeVar.getMeasuredHeight() - (zeVar.c.getTranslationY() + zeVar.e)));
                            }
                            float f64 = f57 + f17;
                            float f65 = measuredHeight8 - f18;
                            if (s1Var2 == null || !s1Var2.getTransitionParams().w0) {
                                nmVar6 = rnVar.t0;
                                left3 = Math.max(left3, view8.getX() + nmVar6.getLeft());
                                nmVar7 = rnVar.t0;
                                f64 = Math.max(f64, view8.getY() + nmVar7.getY());
                                nmVar8 = rnVar.t0;
                                right2 = Math.min(right2, view8.getX() + nmVar8.getLeft() + view8.getMeasuredWidth());
                                nmVar9 = rnVar.t0;
                                f65 = Math.min(f65, view8.getY() + nmVar9.getY() + view8.getMeasuredHeight());
                            }
                            float f66 = f65;
                            float f67 = f64;
                            float f68 = right2;
                            float max2 = Math.max(left3, rnVar.R8());
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
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(true);
                                    num12 = rnVar.I8;
                                    s1Var2.setScrimReaction(num12);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(true);
                                    num11 = rnVar.I8;
                                    v0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f21, f39, f22, f20);
                                nmVar18 = rnVar.t0;
                                float x10 = view8.getX() + nmVar18.getLeft();
                                nmVar19 = rnVar.t0;
                                canvas4.translate(x10, view8.getY() + nmVar19.getY());
                                if (s1Var2 != null && groupedMessages3 == null && s1Var2.B1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.C1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (s1Var2 == null || !s1Var2.T2()) {
                                    f19 = f39;
                                } else {
                                    canvas4.save();
                                    f19 = f39;
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.W1(canvas4);
                                    canvas4.restore();
                                }
                                if (v0Var != null) {
                                    v0Var.B(canvas4);
                                }
                                canvas4.restore();
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(false);
                                    s1Var2.setScrimReaction(num4);
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
                            if (groupedMessagePosition2 != null || (s1Var2 != null && s1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(s1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && s1Var2.S2())) {
                                        arrayList2.add(s1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & s1Var2.s0()) != 0) {
                                    arrayList5.add(s1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i19 = groupedMessagePosition2.flags;
                                    if ((i19 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(s1Var2);
                            }
                            num5 = rnVar.I8;
                            if (num5 == null || s1Var2 == null || groupedMessages3 != null) {
                                float f69 = f22;
                                float f70 = f21;
                                View view27 = view9;
                                float f71 = f20;
                                float f72 = f19;
                                f23 = f57;
                                num6 = rnVar.I8;
                                if (num6 != null && v0Var != null) {
                                    paint13 = rnVar.z8;
                                    if (paint13 != null) {
                                        matrix7 = rnVar.A8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / rnVar.x8.getWidth();
                                        matrix8 = rnVar.A8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = rnVar.y8;
                                        matrix9 = rnVar.A8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = rnVar.z8;
                                        paint16.setAlpha((int) (rnVar.H8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = rnVar.z8;
                                        v0Var2 = v0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        v0Var2 = v0Var;
                                        paint14 = rnVar.B8;
                                        f24 = rnVar.D8;
                                        f25 = rnVar.G8;
                                        paint14.setAlpha((int) (f25 * f24 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = rnVar.B8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f67 < f66) {
                                        f26 = rnVar.D8;
                                        f27 = rnVar.G8;
                                        float f73 = (f27 * f26) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f28 = rnVar.G8;
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
                                        nmVar10 = rnVar.t0;
                                        float x11 = view27.getX() + nmVar10.getLeft();
                                        nmVar11 = rnVar.t0;
                                        canvas3.translate(x11, view27.getY() + nmVar11.getY() + view27.getPaddingTop());
                                        num7 = rnVar.I8;
                                        boolean z14 = rnVar.E8;
                                        ig.r0 r0Var = v0Var2.y0;
                                        if (!r0Var.b) {
                                            org.telegram.ui.ActionBar.c6 c6Var = v0Var2.U0;
                                            if (c6Var != null) {
                                                c6Var.m(v0Var2.q0, v0Var2.p0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.r0);
                                            } else {
                                                org.telegram.ui.ActionBar.g6.q(v0Var2.q0, v0Var2.p0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.r0);
                                            }
                                            r0Var.D = f73;
                                            r0Var.E = z14;
                                            r0Var.d(canvas3, v0Var2.e2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        nmVar12 = rnVar.t0;
                                        float x12 = view27.getX() + nmVar12.getLeft();
                                        nmVar13 = rnVar.t0;
                                        canvas3.translate(x12, view27.getY() + nmVar13.getY() + view27.getPaddingTop());
                                        int i20 = rnVar.J8;
                                        num8 = rnVar.I8;
                                        v0Var2.E(this, canvas3, i20, num8, f73);
                                        jmVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = rnVar.z8;
                                if (paint18 != null) {
                                    matrix10 = rnVar.A8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / rnVar.x8.getWidth();
                                    matrix11 = rnVar.A8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = rnVar.y8;
                                    matrix12 = rnVar.A8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = rnVar.z8;
                                    paint21.setAlpha((int) (rnVar.H8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = rnVar.z8;
                                    f30 = f22;
                                    f31 = f21;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f30 = f22;
                                    f31 = f21;
                                    view10 = view9;
                                    paint19 = rnVar.B8;
                                    f32 = rnVar.D8;
                                    f33 = rnVar.G8;
                                    paint19.setAlpha((int) (f33 * f32 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = rnVar.B8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f67 < f66) {
                                    f34 = rnVar.D8;
                                    f35 = rnVar.G8;
                                    float f75 = (f35 * f34) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f36 = rnVar.G8;
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
                                    nmVar14 = rnVar.t0;
                                    float x13 = view10.getX() + nmVar14.getLeft();
                                    nmVar15 = rnVar.t0;
                                    canvas5.translate(x13, view10.getY() + nmVar15.getY() + view10.getPaddingTop());
                                    num9 = rnVar.I8;
                                    s1Var2.g2(canvas5, num9, f75, rnVar.E8);
                                    canvas5.restore();
                                    canvas5.save();
                                    nmVar16 = rnVar.t0;
                                    float x14 = view10.getX() + nmVar16.getLeft();
                                    nmVar17 = rnVar.t0;
                                    canvas5.translate(x14, view10.getY() + nmVar17.getY() + view10.getPaddingTop());
                                    int i21 = rnVar.J8;
                                    num10 = rnVar.I8;
                                    f23 = f57;
                                    s1Var2.h2(this, canvas5, i21, num10, f75);
                                    canvas.restore();
                                } else {
                                    f23 = f57;
                                }
                            }
                            jmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f23 = f57;
                            jmVar2 = this;
                        }
                        i16 = i12 + 1;
                        jmVar3 = jmVar2;
                        y10 = f23;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    jmVar = jmVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f12 = 1.0f;
                    float f78 = y10;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            jmVar.a0(canvas3, f78, (org.telegram.ui.Cells.s1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            jmVar.a0(canvas3, f78, (org.telegram.ui.Cells.s1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.s1 s1Var7 = (org.telegram.ui.Cells.s1) arrayList.get(i24);
                            if (s1Var7.getCurrentPosition() != null || s1Var7.getTransitionParams().w0) {
                                jmVar.a0(canvas3, f78, s1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.s1 s1Var8 = (org.telegram.ui.Cells.s1) arrayList4.get(i25);
                            if (s1Var8.getCurrentPosition() != null || s1Var8.getTransitionParams().w0) {
                                jmVar.a0(canvas3, f78, s1Var8, 3);
                            }
                        }
                    }
                    num3 = rnVar.I8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = rnVar.z8;
                        if (paint8 != null) {
                            matrix4 = rnVar.A8;
                            matrix4.reset();
                            float measuredWidth13 = jmVar.getMeasuredWidth() / rnVar.x8.getWidth();
                            matrix5 = rnVar.A8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = rnVar.y8;
                            matrix6 = rnVar.A8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = rnVar.z8;
                            paint11.setAlpha((int) (rnVar.H8 * 255.0f));
                            float measuredWidth14 = jmVar.getMeasuredWidth();
                            float measuredHeight13 = jmVar.getMeasuredHeight();
                            paint12 = rnVar.z8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = rnVar.B8;
                            f13 = rnVar.D8;
                            f14 = rnVar.G8;
                            paint9.setAlpha((int) (f14 * f13 * 255.0f));
                            float measuredWidth15 = jmVar.getMeasuredWidth();
                            float measuredHeight14 = jmVar.getMeasuredHeight();
                            paint10 = rnVar.B8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.s1 s1Var9 = (org.telegram.ui.Cells.s1) arrayList4.get(i26);
                            if (s1Var9.getCurrentPosition() != null || s1Var9.getTransitionParams().w0) {
                                jmVar.a0(canvas3, f78, s1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = rnVar.I8;
                    if (num13 == null) {
                        f48 = rnVar.G8;
                        if (f48 < f12) {
                            paint25 = rnVar.z8;
                            if (paint25 != null) {
                                matrix13 = rnVar.A8;
                                matrix13.reset();
                                float measuredWidth16 = jmVar.getMeasuredWidth() / rnVar.x8.getWidth();
                                matrix14 = rnVar.A8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = rnVar.y8;
                                matrix15 = rnVar.A8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = rnVar.z8;
                                paint28.setAlpha((int) (rnVar.H8 * 255.0f));
                                float measuredWidth17 = jmVar.getMeasuredWidth();
                                float measuredHeight15 = jmVar.getMeasuredHeight();
                                paint29 = rnVar.z8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = rnVar.B8;
                                f49 = rnVar.D8;
                                f50 = rnVar.G8;
                                paint26.setAlpha((int) ((f12 - f50) * f49 * 255.0f));
                                float measuredWidth18 = jmVar.getMeasuredWidth();
                                float measuredHeight16 = jmVar.getMeasuredHeight();
                                paint27 = rnVar.B8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            jmVar = jmVar3;
            f11 = 20.0f;
            f12 = 1.0f;
            num13 = rnVar.I8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            jmVar = jmVar3;
            f11 = 20.0f;
        }
        view3 = rnVar.F8;
        if (view3 != null || ((ArrayList) rnVar.I9.c).size() > 0) {
            aa0Var = rnVar.E1;
            if (aa0Var != null) {
                aa0Var2 = rnVar.E1;
            }
            super.drawChild(canvas3, rnVar.f1, SystemClock.uptimeMillis());
            tj tjVar = rnVar.T2;
            if (tjVar != null && tjVar.getTag() != null) {
                super.drawChild(canvas3, rnVar.T2, SystemClock.uptimeMillis());
            }
            sj sjVar = rnVar.U2;
            if (sjVar != null && sjVar.getTag() != null) {
                super.drawChild(canvas3, rnVar.U2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.f00 f00Var = rnVar.i9;
            if (f00Var != null) {
                super.drawChild(canvas3, f00Var, SystemClock.uptimeMillis());
            }
            dh.k kVar11 = rnVar.T9;
            if (kVar11 != null) {
                super.drawChild(canvas3, kVar11, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.x30 x30Var3 = rnVar.a2;
            if (x30Var3 != null) {
                super.drawChild(canvas3, x30Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = rnVar.u3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.u3, SystemClock.uptimeMillis());
            }
            zk zkVar = rnVar.v3;
            if (zkVar != null && zkVar.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.v3, SystemClock.uptimeMillis());
            }
            lh.w3 w3Var = rnVar.t1;
            if (w3Var != null && w3Var.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.t1, SystemClock.uptimeMillis());
            }
            ol olVar = rnVar.x1;
            if (olVar != null && olVar.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.x1, SystemClock.uptimeMillis());
            }
            lh.w3 w3Var2 = rnVar.v1;
            if (w3Var2 != null && w3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, rnVar.v1, SystemClock.uptimeMillis());
            }
            ck ckVar2 = rnVar.U;
            if (ckVar2 != null && ckVar2.H != null) {
                canvas3.save();
                canvas3.translate(rnVar.U.H.getX() + rnVar.U.getX(), rnVar.U.H.getY() + rnVar.U.getY());
                rnVar.U.H.draw(canvas3);
                canvas3.restore();
            }
        }
        if (rnVar.la > 0 && jmVar.f < AndroidUtilities.dp(f11)) {
            int themedColor = rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6);
            if (jmVar.z0 == null) {
                jmVar.z0 = new Paint();
            }
            if (jmVar.A0 != themedColor) {
                Paint paint32 = jmVar.z0;
                jmVar.A0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, jmVar.getMeasuredHeight() - rnVar.la, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), jmVar.z0);
            canvas3 = canvas6;
        }
        mp mpVar = rnVar.L9;
        if (mpVar != null && mpVar.e()) {
            int inputBubbleTop = (int) rnVar.O.getInputBubbleTop();
            int inputBubbleBottom = (int) rnVar.O.getInputBubbleBottom();
            rn rnVar2 = rnVar.P9;
            int i27 = inputBubbleTop - ((int) (rnVar.Q9 * (rnVar2 == null ? 0.0f : rnVar2.K9)));
            mp mpVar2 = rnVar.L9;
            jmVar.getMeasuredWidth();
            mpVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (rnVar.P9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), (int) (rnVar.Q9 * 255.0f), 31);
            canvas3 = canvas;
            rnVar.P9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        rnVar.ta.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (rnVar.ga) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
            float x15 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
            canvas3.translate(x15, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (rnVar.ha * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        yk ykVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (ykVar = this.F0.Aa) == null || !ykVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ykVar.a(true);
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
        lk lkVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        rn rnVar = this.F0;
        qg.d dVar = rnVar.J3;
        if (dVar != null) {
            dVar.n = SystemClock.uptimeMillis();
        }
        float y10 = (AndroidUtilities.isInMultiwindow || rnVar.isInBubbleMode()) ? (rnVar.U.getEmojiView() != null ? rnVar.U.getEmojiView() : rnVar.U).getY() : rnVar.U.getY();
        View view = rnVar.F8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        }
        ck ckVar = rnVar.U;
        if (ckVar == null || !ckVar.u3 || motionEvent.getY() >= y10) {
            rnVar.f9 = motionEvent.getY();
            org.telegram.ui.Cells.v9 o10 = rnVar.Y8.o(getContext());
            motionEvent.offsetLocation(-o10.getX(), -o10.getY());
            if (!rnVar.Y8.y() || !rnVar.Y8.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o10.getX(), o10.getY());
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                lh.h1 h1Var = rnVar.m1;
                if (h1Var != null) {
                    if (rnVar.q3 != null) {
                        z10 = h1Var.A(motionEvent);
                        if (rnVar.m1.D) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !rnVar.Y8.y() || (motionEvent.getY() >= rnVar.t0.getTop() && motionEvent.getY() <= rnVar.t0.getBottom())) {
                            lkVar = rnVar.sa;
                            if (!lkVar.n) {
                                return lkVar.g(motionEvent);
                            }
                            com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.e;
                            if (lVar == null || !lVar.a) {
                                if (rnVar.isInPreviewMode() && rnVar.F9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (rnVar.f1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                j9.a aVar = rnVar.f1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
                                                if (aVar != null) {
                                                    ((rg.b) aVar.b).getLocationInWindow(iArr2);
                                                    Rect rect = AndroidUtilities.rectTmp2;
                                                    int i12 = iArr2[0] - iArr[0];
                                                    rect.set(i12, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i12, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                i10++;
                                            }
                                        }
                                        z11 = false;
                                        fj fjVar = rnVar.W0;
                                        if (fjVar != null) {
                                            fjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], rnVar.W0.getMeasuredWidth() + i13, rnVar.W0.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.B0 = motionEvent.getX();
                                                    this.C0 = motionEvent.getY();
                                                    this.D0 = SystemClock.elapsedRealtime();
                                                    this.E0 = z12;
                                                    fj fjVar2 = rnVar.W0;
                                                    if (fjVar2 != null) {
                                                        fjVar2.d0.c(z12);
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
                                        fj fjVar3 = rnVar.W0;
                                        if (fjVar3 != null) {
                                            fjVar3.d0.c(false);
                                        }
                                        if (this.E0 || (h7.y.a(this.B0, this.C0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.D0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.E0) {
                                                b5Var2 = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout;
                                                rnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) b5Var2).P(ProfileActivity.m4(rnVar.P5));
                                            } else {
                                                b5Var = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout;
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
                                s4 s4Var = (s4) com.google.firebase.messaging.l.i().d;
                                if (s4Var != null) {
                                    s4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o10.getX(), -o10.getY());
                            if (rnVar.Y8.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o10.getX(), o10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = h1Var.e;
                        if (h1Var.D) {
                            h1Var.E = true;
                            h1Var.D = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(h1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            h1Var.d = 0;
                            h1Var.c = 1.0f;
                            org.telegram.ui.Components.e71 e71Var = h1Var.I;
                            if (e71Var != null) {
                                e71Var.e(1.0f, 0, h1Var.b);
                            }
                            h1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                lkVar = rnVar.sa;
                if (!lkVar.n) {
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
        ag.t0 t0Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        gk gkVar;
        MessageObject messageObject;
        wk wkVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        rn rnVar = this.F0;
        boolean z12 = false;
        if ((rnVar.F8 == null && ((ArrayList) rnVar.I9.c).size() <= 0) || (view != rnVar.f1 && view != rnVar.T2 && view != rnVar.U2 && view != rnVar.i9 && view != rnVar.T9 && view != rnVar.a2 && view != null && view != rnVar.u3 && view != rnVar.v3)) {
            if ((view != rnVar.u3 || !PhotoViewer.t1().Q1()) && (!rnVar.O9 || view != rnVar.t0)) {
                if (rnVar.ga) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                }
                if (view != rnVar.X2) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (t0Var = rnVar.u2) != null && t0Var.a() && rnVar.u2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == rnVar.p8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    } else {
                        if (view != rnVar.t0) {
                            if (view != rnVar.O) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == rnVar.p8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-rnVar.J9) - (rnVar.Q9 != 0.0f ? (rnVar.t0.getMeasuredHeight() - rnVar.J9) * rnVar.Q9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.g6.k3 != null && rnVar.r8.d) {
                                            int x8 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y10 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(rnVar.p8.getScaleX(), rnVar.p8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.g6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.g6.k3.setBounds(x8, y10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(rnVar.C9()) + x8, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(rnVar.C9()) + y10);
                                            org.telegram.ui.ActionBar.g6.k3.draw(canvas);
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
                                if (view == rnVar.O && (wkVar = rnVar.X2) != null && wkVar.getVisibility() == 0) {
                                    super.drawChild(canvas, rnVar.X2, j10);
                                }
                                z12 = super.drawChild(canvas, view, j10);
                                if (z11 && view == rnVar.t0 && playingMessageObject.type != 5 && (gkVar = rnVar.p8) != null && gkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-rnVar.J9) - (rnVar.Q9 != 0.0f ? (rnVar.t0.getMeasuredHeight() - rnVar.J9) * rnVar.Q9 : 0.0f)) + rnVar.K9);
                                    super.drawChild(canvas, rnVar.p8, j10);
                                    if (rnVar.q8 != null) {
                                        canvas.save();
                                        canvas.translate(rnVar.q8.getX(), rnVar.t0.getY() + rnVar.q8.getTop());
                                        if (z10) {
                                            rnVar.q8.f2(canvas);
                                            invalidate();
                                            rnVar.q8.invalidate();
                                        } else {
                                            rnVar.q8.X1(canvas);
                                            org.telegram.ui.Cells.s1 s1Var = rnVar.q8;
                                            if (!s1Var.rb && ((messageObject = s1Var.u7) == null || messageObject.type != 27)) {
                                                s1Var.l2(s1Var.getAlpha(), canvas, true);
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
                        if (view == rnVar.p8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.zu0
    public float getBottomOffset() {
        return this.F0.t0.getBottom();
    }

    public rn getChatActivity() {
        return this.F0;
    }

    @Override // org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.zu0
    public int getKeyboardHeight() {
        if (this.F0.Ka) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.zu0
    public float getListTranslationY() {
        return this.F0.t0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.zu0
    public Drawable getNewDrawable() {
        Drawable d = this.F0.aa.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.zu0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.F0.aa.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.zu0
    public int getScrollOffset() {
        return this.F0.t0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        rn rnVar = this.F0;
        if (rnVar.Ka) {
            this.D.b = rnVar.T0;
        } else {
            b5Var = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).b) {
                    org.telegram.ui.ActionBar.p1 p1Var = this.D;
                    b5Var3 = ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout;
                    p1Var.b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.D.c();
        rnVar.U.setAdjustPanLayoutHelper(this.D);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == rnVar.P5)) {
            MediaController.getInstance().setTextureView(rnVar.N7(false), rnVar.r8, rnVar.p8, true);
        }
        mp mpVar = rnVar.L9;
        if (mpVar != null) {
            mpVar.f();
        }
        rnVar.ta.j();
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.D.d();
        rn rnVar = this.F0;
        mp mpVar = rnVar.L9;
        if (mpVar != null) {
            NotificationCenter.getInstance(mpVar.a0).removeObserver(mpVar, NotificationCenter.updateInterfaces);
            mpVar.B.onDetachedFromWindow();
            org.telegram.ui.Components.k5 k5Var = mpVar.g0;
            if (k5Var != null && (view = mpVar.W) != null) {
                k5Var.o(view);
            }
            mpVar.M = 0.0f;
            mpVar.L = 0L;
            rnVar.L9 = null;
        }
        rnVar.ta.k();
        AndroidUtilities.runOnUIThread(new ag.l3(23));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        rn rnVar;
        ag.t0 t0Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (t0Var = (rnVar = this.F0).u2) == null || !t0Var.a() || rnVar.u2.getTag() == null) {
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
    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int B;
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
        boolean z11;
        org.telegram.ui.ActionBar.k kVar3;
        int i21;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        rn rnVar = this.F0;
        yg.i iVar = rnVar.v;
        int i22 = (measuredWidth - rnVar.Qa) - rnVar.Ra;
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
                    B = i0.a.B(i22, measuredWidth2, 2, rnVar.Qa) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = rnVar.Qa + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
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
                            if (childAt != rnVar.I9 && childAt != rnVar.T9 && childAt != rnVar.O && !(childAt instanceof org.telegram.ui.Components.x30) && !(childAt instanceof org.telegram.ui.Components.ep)) {
                                if (childAt instanceof org.telegram.ui.Cells.v9) {
                                    i20 = rnVar.va;
                                } else if (childAt == rnVar.M0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (rnVar.U.u0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.n2) rnVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = rnVar.U.getBottom();
                                        }
                                    }
                                    i18 = rnVar.U.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    ck ckVar = rnVar.U;
                                    if (ckVar != null && (childAt == ckVar.J1 || childAt == ckVar.I1)) {
                                        i18 = org.telegram.messenger.rl.u(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == rnVar.s2) {
                                        i18 = org.telegram.messenger.rl.u(7.0f, iVar.d(), i18);
                                    } else if (ckVar == null || childAt != ckVar.a1) {
                                        if (childAt == rnVar.a2 || childAt == rnVar.o2 || childAt == rnVar.b2) {
                                            i19 = this.s0;
                                        } else if (childAt == rnVar.t0 || childAt == rnVar.r0 || childAt == rnVar.T2 || childAt == rnVar.U2 || childAt == rnVar.V2) {
                                            i20 = rnVar.va;
                                        } else if (childAt != rnVar.L) {
                                            kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (rnVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == rnVar.p8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != rnVar.X2 && childAt != rnVar.Y2 && childAt != rnVar.q0) {
                                                if (childAt instanceof org.telegram.ui.Components.gb0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != rnVar.P) {
                                                    if (childAt != rnVar.J3) {
                                                    }
                                                }
                                            }
                                        } else if (ckVar.z0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.rl.u(9.0f, iVar.d(), i18);
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
                    B = (measuredWidth - rnVar.Ra) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = B - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        sj sjVar = rnVar.U2;
        if (sjVar != null) {
            sjVar.setBackgroundHeight(getMeasuredHeight());
        }
        rnVar.o9();
        rnVar.r9();
        rnVar.Mc(false, false);
        S();
        rnVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0533  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int childCount;
        boolean z10;
        int i12;
        int i13;
        org.telegram.ui.Components.ec ecVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.v0 v0Var;
        TLRPC.User user;
        rn rnVar = this.F0;
        yg.i iVar = rnVar.v;
        rnVar.zc.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - rnVar.Qa) - rnVar.Ra;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        og.a aVar = rnVar.H.a;
        if (aVar instanceof og.b) {
            ((og.b) aVar).b(i15, size2);
        }
        if (this.u0 != i15) {
            rnVar.B4 = false;
            this.u0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
            if (z13 || (user = rnVar.f) == null || !user.self) {
                rnVar.G9 = false;
            } else {
                org.telegram.ui.ActionBar.h5 titleTextView = rnVar.W0.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    rnVar.G9 = !rnVar.H9;
                } else {
                    rnVar.G9 = false;
                }
            }
            if (rnVar.G9 || rnVar.H9 || UserObject.isBotForumWithEditableTopics(rnVar.f)) {
                fj fjVar = rnVar.W0;
                if (fjVar != null && fjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) rnVar.W0.getLayoutParams()).rightMargin = AndroidUtilities.dp(rnVar.N3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                fj fjVar2 = rnVar.W0;
                if (fjVar2 != null && fjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) rnVar.W0.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (rnVar.G9) {
                kVar8 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                if (!kVar8.j0 && (v0Var = rnVar.i0) != null) {
                    v0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var2 = rnVar.d0;
                if (v0Var2 != null) {
                    v0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.v0 v0Var3 = rnVar.d0;
                if (v0Var3 != null) {
                    v0Var3.K(40);
                }
                org.telegram.ui.ActionBar.v0 v0Var4 = rnVar.i0;
                if (v0Var4 != null) {
                    v0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
            if (!kVar7.j0 && (yVar = rnVar.j0) != null) {
                yVar.f((!rnVar.H9 || rnVar.G9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = rnVar.d0;
            if (v0Var5 != null) {
                TLRPC.UserFull userFull = rnVar.W7;
                if (rnVar.H9) {
                    v0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    v0Var5.K(32);
                }
            }
            rnVar.B4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + rnVar.ka >= AndroidUtilities.dp(20.0f);
        if (this.t0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (rnVar.la > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            rnVar.ka = rnVar.la;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            rnVar.ka = rnVar.U.t0() ? rnVar.U.getEmojiPadding() : 0;
        } else {
            rnVar.ka = 0;
        }
        setEmojiKeyboardHeight(rnVar.ka);
        boolean z15 = this.f + rnVar.ka >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i16 = 0; i16 < rnVar.t0.getChildCount(); i16++) {
                View childAt = rnVar.t0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        rnVar.t0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            rnVar.v0.i1(R, (int) (((((rnVar.t0.getMeasuredHeight() - rnVar.o9) - rnVar.wa) + ((this.f + rnVar.ka) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(rnVar.C9()))) / 2.0f), false);
                            rnVar.w0.m(R);
                            this.D.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(rnVar.U, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
                            if (!z10 || rnVar.Ka) {
                                this.s0 = 0;
                            } else {
                                this.s0 = rnVar.U.getMeasuredHeight();
                            }
                            rnVar.va = 0;
                            rnVar.wa = 0;
                            if (SharedConfig.chatBlurEnabled() && !rnVar.Ka && rnVar.B != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = rnVar.C;
                                rnVar.va = i18;
                                rnVar.wa = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != rnVar.U) {
                                    kVar4 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                                    if (childAt2 != kVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == rnVar.t0 || childAt2 == rnVar.r0 || (childAt2 instanceof org.telegram.ui.Cells.v9)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), rnVar.va + size2 + rnVar.wa), TLObject.FLAG_30));
                                            } else if (childAt2 == rnVar.L) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.s0;
                                                z12 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((rnVar.U.z0() ? 48 : 0) + 2) + (i20 - (z12 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == rnVar.X2) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                rnVar.X2.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) rnVar.pc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == rnVar.Y2) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) rnVar.pc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == rnVar.M0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (rnVar.U.u0(childAt2)) {
                                                org.telegram.ui.Components.nf nfVar = rnVar.U.C1;
                                                if (childAt2 == nfVar && nfVar != null) {
                                                    i19 = nfVar.getKeyboardHeight();
                                                }
                                                z11 = ((org.telegram.ui.ActionBar.n2) rnVar).inBubbleMode;
                                                if (z11) {
                                                    int paddingTop2 = getPaddingTop() + (i17 - this.s0) + measuredHeight;
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else if (AndroidUtilities.isInMultiwindow) {
                                                    int paddingTop3 = getPaddingTop() + (((i17 - this.s0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                }
                                            } else {
                                                vj vjVar = rnVar.E1;
                                                if (childAt2 == vjVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vjVar.getLayoutParams();
                                                    pf.u0 adapter = rnVar.E1.getAdapter();
                                                    if (adapter.s0 == null || adapter.d0) {
                                                        rnVar.E1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        rnVar.E1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == rnVar.Y8.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + rnVar.va;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || rnVar.Ka) {
                                                        km kmVar = rnVar.Y8;
                                                        kmVar.e0 = 0;
                                                        kmVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        km kmVar2 = rnVar.Y8;
                                                        kmVar2.e0 = keyboardHeight;
                                                        kmVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.gb0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == rnVar.N1) {
                                                    kVar5 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                                                    if (kVar5.getVisibility() == 0) {
                                                        kVar6 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
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
                            if (rnVar.A4) {
                                rnVar.B4 = true;
                                rnVar.o9();
                                rnVar.r9();
                                rnVar.A4 = false;
                                kj kjVar = rnVar.t0;
                                kjVar.measure(View.MeasureSpec.makeMeasureSpec(kjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(rnVar.t0.getMeasuredHeight(), TLObject.FLAG_30));
                                rnVar.B4 = false;
                            }
                            i13 = rnVar.t4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new cg.w1(this, i13, 23));
                                rnVar.t4 = -1;
                            }
                            ecVar = org.telegram.ui.Components.ec.w;
                            if (ecVar != null && rnVar.Vb != null) {
                                ecVar.l();
                            }
                            rnVar.S6();
                            this.t0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.ne neVar = rnVar.U.T3;
        AndroidUtilities.cancelRunOnUIThread(neVar);
        neVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(rnVar.U, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
        if (z10) {
        }
        this.s0 = 0;
        rnVar.va = 0;
        rnVar.wa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = rnVar.C;
            rnVar.va = i182;
            rnVar.wa = i182;
        }
        while (i12 < childCount) {
        }
        if (rnVar.A4) {
        }
        i13 = rnVar.t4;
        if (i13 != -1) {
        }
        ecVar = org.telegram.ui.Components.ec.w;
        if (ecVar != null) {
            ecVar.l();
        }
        rnVar.S6();
        this.t0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        rn rnVar = this.F0;
        pg.c.c(rnVar.v8, rnVar.fragmentView);
        rnVar.w8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.F0.B4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        rn rnVar = this.F0;
        rnVar.r9 = i11;
        rnVar.o9();
        rnVar.r9();
    }

    @Override // org.telegram.ui.Components.zu0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.zu0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.zu0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
