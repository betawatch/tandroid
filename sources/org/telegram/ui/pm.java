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
import android.view.ViewParent;
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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pm extends org.telegram.ui.Components.aw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final /* synthetic */ wn J0;
    public int w0;
    public int x0;
    public int y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(wn wnVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.J0 = wnVar;
        this.w0 = 0;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new om(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.J0;
        wnVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        kVar.setTranslationY(0.0f);
        al alVar = wnVar.ab;
        if (alVar != null) {
            alVar.setTranslationY(wnVar.o1 != null ? r3.getCurrentHeight() : 0);
        }
        ci.e4 e4Var = wnVar.w1;
        if (e4Var != null) {
            e4Var.setTranslationY(0.0f);
        }
        ci.e4 e4Var2 = wnVar.v1;
        if (e4Var2 != null) {
            e4Var2.setTranslationY(0.0f);
        }
        wnVar.Q0.setTranslationY(0.0f);
        wnVar.P.setTranslationY(0.0f);
        wnVar.w9 = 0.0f;
        wnVar.x9 = 0.0f;
        wnVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.h60 h60Var = wnVar.b3;
        if (h60Var != null) {
            h60Var.e(0.0f);
        }
        ci.r6 r6Var = wnVar.y2;
        if (r6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.b;
            faVar.u = 0.0f;
            faVar.d.invalidate();
        }
        wnVar.setFragmentPanTranslationOffset(0);
        wnVar.o9();
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.mc0) {
            ((org.telegram.ui.Components.mc0) drawable).p();
        }
        wn wnVar = this.J0;
        fh.a c10 = wnVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(wnVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(wnVar.W.a(c10));
        wnVar.Cb = computePerceivedBrightness <= 0.721f;
        wnVar.Db = computePerceivedBrightness2 <= 0.9f;
        wnVar.L.a = c10;
        jh.f fVar = wnVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.g gVar = wnVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        wnVar.n9();
        wnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        int save = canvas.save();
        wn wnVar = this.J0;
        float x10 = u1Var.getX() + wnVar.x0.getLeft();
        float y3 = u1Var.getY() + wnVar.x0.getY() + u1Var.getPaddingTop();
        float alpha = u1Var.a() ? u1Var.getAlpha() : 1.0f;
        canvas.clipRect(wnVar.x0.getLeft(), f7, wnVar.x0.getRight(), ((((wnVar.x0.getY() + wnVar.x0.getMeasuredHeight()) - wnVar.Aa) - wnVar.v.d()) - wnVar.rc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        u1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            u1Var.m2(alpha, canvas, true);
        } else if (i10 == 1) {
            u1Var.W1(canvas, alpha);
        } else if (i10 == 2) {
            u1Var.I1(alpha, canvas, u1Var.getCurrentPosition() != null && (u1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = u1Var.getCurrentPosition() != null && (u1Var.getCurrentPosition().flags & 1) == 0;
            u1Var.N1(canvas, alpha);
            if (!z10) {
                u1Var.d2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && wnVar.M8 != null)) {
            float f10 = (wnVar.H8 * wnVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, wnVar.M8, f10, wnVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, wnVar.N8, wnVar.M8, f10);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        wn wnVar = this.J0;
        ah.c cVar = wnVar.J;
        jk jkVar = wnVar.Y;
        if (jkVar == null || view != jkVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            jh.f fVar = wnVar.X;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        jk jkVar2 = wnVar.Y;
        if (jkVar2 != null && view == jkVar2.m0) {
            ei.y yVar = (ei.y) view;
            yVar.setBackgroundDrawable(cVar.c(yVar.c, wnVar.x, false));
        }
        jk jkVar3 = wnVar.Y;
        if (jkVar3 == null || view != (sgVar = jkVar3.O1)) {
            return;
        }
        sgVar.setBlurredBackgroundFactory(cVar);
    }

    public final boolean b0(View view) {
        if (view == this.L) {
            return true;
        }
        wn wnVar = this.J0;
        return view == wnVar.y2 || view == wnVar.q1 || view == wnVar.m9 || view == wnVar.X || view == wnVar.K3;
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
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Integer num;
        Paint paint;
        Paint paint2;
        float f7;
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
        float f10;
        View view3;
        org.telegram.ui.Components.za0 za0Var;
        org.telegram.ui.Components.za0 za0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        ai.f7 f7Var;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        ai.f7 f7Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f11;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f12;
        float f13;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        Paint paint12;
        ai.f7 f7Var3;
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i11;
        int i12;
        ArrayList arrayList5;
        org.telegram.ui.Cells.u1 u1Var2;
        ArrayList arrayList6;
        ph.i iVar;
        Integer num4;
        float f14;
        float f15;
        boolean z10;
        ai.f7 f7Var4;
        ai.f7 f7Var5;
        org.telegram.ui.Components.za0 za0Var3;
        float f16;
        float f17;
        ai.f7 f7Var6;
        ai.f7 f7Var7;
        ai.f7 f7Var8;
        ai.f7 f7Var9;
        Canvas canvas4;
        float f18;
        float f19;
        View view9;
        float f20;
        float f21;
        Integer num5;
        float f22;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.w0 w0Var2;
        Paint paint14;
        float f23;
        float f24;
        Paint paint15;
        float f25;
        float f26;
        float f27;
        float f28;
        ai.f7 f7Var10;
        ai.f7 f7Var11;
        Integer num7;
        ai.f7 f7Var12;
        ai.f7 f7Var13;
        Integer num8;
        pm pmVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        Paint paint17;
        Paint paint18;
        float f29;
        float f30;
        View view10;
        Paint paint19;
        float f31;
        float f32;
        Paint paint20;
        float f33;
        float f34;
        float f35;
        Canvas canvas5;
        float f36;
        float f37;
        ai.f7 f7Var14;
        ai.f7 f7Var15;
        Integer num9;
        ai.f7 f7Var16;
        ai.f7 f7Var17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f38;
        Integer num11;
        ai.f7 f7Var18;
        ai.f7 f7Var19;
        Integer num12;
        org.telegram.ui.Components.of ofVar;
        org.telegram.ui.Components.za0 za0Var4;
        org.telegram.ui.Components.za0 za0Var5;
        org.telegram.ui.Cells.u1 u1Var3;
        float f39;
        ai.f7 f7Var20;
        org.telegram.ui.Cells.u1 u1Var4;
        boolean z11;
        org.telegram.ui.Components.za0 za0Var6;
        float f40;
        org.telegram.ui.Components.za0 za0Var7;
        float f41;
        ai.f7 f7Var21;
        org.telegram.ui.Components.za0 za0Var8;
        org.telegram.ui.Components.za0 za0Var9;
        ai.f7 f7Var22;
        View view11;
        float f42;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.k kVar6;
        View view15;
        float f43;
        Paint paint23;
        float f44;
        float f45;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f46;
        Integer num13;
        float f47;
        Paint paint25;
        Paint paint26;
        float f48;
        float f49;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        Paint paint29;
        float f50;
        Paint paint30;
        float f51;
        float f52;
        Paint paint31;
        View view24;
        org.telegram.ui.ActionBar.k kVar7;
        int i13;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.j40 j40Var;
        View view25;
        fj fjVar;
        View view26;
        tj tjVar;
        pm pmVar3 = this;
        wn wnVar = pmVar3.J0;
        ph.i iVar2 = wnVar.v;
        ArrayList arrayList7 = wnVar.n6;
        wnVar.Y.T1();
        wnVar.jc();
        if (wnVar.ra || ((tjVar = wnVar.y0) != null && tjVar.k())) {
            wnVar.ra = false;
            wnVar.uc();
        }
        wnVar.Mc(false, false);
        wnVar.wc();
        fj fjVar2 = wnVar.g2;
        if (fjVar2 != null && fjVar2.getTag() != null && (view26 = (fjVar = wnVar.g2).e) != null) {
            fjVar.g(view26);
        }
        org.telegram.ui.Components.j40 j40Var2 = wnVar.i2;
        if (j40Var2 != null && j40Var2.getTag() != null && (view25 = (j40Var = wnVar.i2).e) != null) {
            j40Var.g(view25);
        }
        if (wnVar.ka) {
            kVar10 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), pmVar3.getMeasuredWidth(), pmVar3.getMeasuredHeight(), (int) (wnVar.la * 255.0f), 31);
            float f53 = (wnVar.la * 0.2f) + 0.8f;
            canvas2.scale(f53, f53, pmVar3.getMeasuredWidth() / 2.0f, pmVar3.getMeasuredHeight() / 2.0f);
            i10 = saveLayerAlpha;
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        for (int i14 = 0; i14 < size; i14++) {
            org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) arrayList7.get(i14);
            MessageObject.SendAnimationData sendAnimationData = u1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    vk vkVar = wnVar.o1;
                    int currentHeight = measuredHeight + (vkVar != null ? vkVar.getCurrentHeight() : 0);
                    hk hkVar = wnVar.p1;
                    int currentHeight2 = currentHeight + (hkVar != null ? hkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
                    i13 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + wnVar.t9, pmVar3.getWidth(), pmVar3.getHeight());
                ImageReceiver photoImage = u1Var5.getPhotoImage();
                u1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((wnVar.Y.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) com.google.android.gms.internal.vision.e2.b(1.0f, sendAnimationData.progress, u1Var5.getTranslationY(), r9[1])));
                if (sendAnimationData.fromPreview) {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, topViewEnterProgress, sendAnimationData.progress));
                } else {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, photoImage.getCenterY() + topViewEnterProgress, sendAnimationData.progress));
                }
                float f54 = sendAnimationData.currentScale;
                canvas2.scale(f54, f54);
                if (!sendAnimationData.fromPreview) {
                    canvas2.translate(-photoImage.getCenterX(), -photoImage.getCenterY());
                }
                u1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                u1Var5.draw(canvas2);
                canvas2.restore();
            }
        }
        num = wnVar.M8;
        if (num != null) {
            view24 = wnVar.J8;
        }
        paint = wnVar.D8;
        if (paint != null) {
            matrix = wnVar.E8;
            matrix.reset();
            float measuredWidth = pmVar3.getMeasuredWidth() / wnVar.B8.getWidth();
            matrix2 = wnVar.E8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = wnVar.C8;
            matrix3 = wnVar.E8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = wnVar.D8;
            paint5.setAlpha((int) (wnVar.L8 * 255.0f));
            paint6 = wnVar.D8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = pmVar3.getMeasuredWidth();
                float measuredHeight2 = pmVar3.getMeasuredHeight();
                paint7 = wnVar.D8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = wnVar.F8;
            f7 = wnVar.H8;
            float f55 = f7 * 255.0f;
            view = wnVar.J8;
            paint2.setAlpha((int) (f55 * (view != null ? wnVar.K8 : 1.0f)));
            paint3 = wnVar.F8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = pmVar3.getMeasuredWidth();
                float measuredHeight3 = pmVar3.getMeasuredHeight();
                paint4 = wnVar.F8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = wnVar.M8;
        if (num2 != null && wnVar.O8) {
            pmVar3.invalidate();
        }
        view2 = wnVar.J8;
        if (view2 != null) {
            view4 = wnVar.J8;
            if (view4 == wnVar.j1) {
                f50 = wnVar.K8;
                if (f50 < 1.0f) {
                    paint30 = wnVar.F8;
                    f51 = wnVar.H8;
                    f52 = wnVar.K8;
                    paint30.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                    float measuredWidth4 = pmVar3.getMeasuredWidth();
                    float measuredHeight4 = pmVar3.getMeasuredHeight();
                    paint31 = wnVar.F8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = wnVar.J8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f42 = wnVar.K8;
                    if (f42 < 1.0f) {
                        view20 = wnVar.J8;
                        float left = view20.getLeft();
                        view21 = wnVar.J8;
                        float top = view21.getTop();
                        view22 = wnVar.J8;
                        float right = view22.getRight();
                        view23 = wnVar.J8;
                        float bottom = view23.getBottom();
                        f46 = wnVar.K8;
                        int i15 = (int) (f46 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = wnVar.J8;
                    float left2 = view12.getLeft();
                    view13 = wnVar.J8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = wnVar.J8;
                    kVar6 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = wnVar.J8;
                        float x10 = view16.getX();
                        view17 = wnVar.J8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = wnVar.J8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = wnVar.J8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, wnVar.G8);
                    }
                    view15 = wnVar.J8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f43 = wnVar.K8;
                    if (f43 < 1.0f) {
                        paint23 = wnVar.F8;
                        f44 = wnVar.H8;
                        f45 = wnVar.K8;
                        paint23.setAlpha((int) ((1.0f - f45) * f44 * 255.0f));
                        float measuredWidth6 = pmVar3.getMeasuredWidth();
                        float measuredHeight6 = pmVar3.getMeasuredHeight();
                        paint24 = wnVar.F8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    f7Var = wnVar.x0;
                    float y3 = ((f7Var.getY() + wnVar.s9) - wnVar.u9) - AndroidUtilities.dp(4.0f);
                    view6 = wnVar.J8;
                    if (view6 instanceof org.telegram.ui.Cells.u1) {
                        view11 = wnVar.J8;
                        groupedMessages = ((org.telegram.ui.Cells.u1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    f7Var2 = wnVar.x0;
                    int childCount = f7Var2.getChildCount();
                    int i16 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = pmVar3.B0;
                        f10 = 20.0f;
                        arrayList2 = pmVar3.A0;
                        arrayList3 = pmVar3.z0;
                        arrayList4 = pmVar3.C0;
                        if (i16 >= childCount) {
                            break;
                        }
                        f7Var3 = wnVar.x0;
                        View childAt = f7Var3.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            u1Var = (org.telegram.ui.Cells.u1) childAt;
                            groupedMessages2 = u1Var.getCurrentMessagesGroup();
                            groupedMessagePosition = u1Var.getCurrentPosition();
                            w0Var = null;
                        } else {
                            w0Var = childAt instanceof org.telegram.ui.Cells.w0 ? (org.telegram.ui.Cells.w0) childAt : null;
                            groupedMessages2 = null;
                            u1Var = null;
                            groupedMessagePosition = null;
                        }
                        float f56 = y3;
                        view7 = wnVar.J8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != 0.0f) {
                            if (z13 || u1Var == null || groupedMessages == null || (u1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i11 = childCount;
                                i12 = i16;
                                arrayList5 = arrayList;
                                u1Var2 = u1Var;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                f14 = 9.0f;
                                f15 = 1.0f;
                                z10 = z13;
                            } else {
                                f14 = 9.0f;
                                float E2 = u1Var3.E2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f57 = transitionParams.left + E2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f58 = transitionParams.top + transitionParams.offsetTop;
                                float f59 = transitionParams.right + E2 + transitionParams.offsetRight;
                                i11 = childCount;
                                float f60 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f39 = f58;
                                } else {
                                    f39 = transitionParams.cell.getTranslationY() + f58;
                                    f60 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f61 = f39;
                                float dp = f61 < (wnVar.s9 - ((float) wnVar.u9)) - ((float) AndroidUtilities.dp(20.0f)) ? (wnVar.s9 - wnVar.u9) - AndroidUtilities.dp(20.0f) : f61;
                                f7Var20 = wnVar.x0;
                                if (f60 > AndroidUtilities.dp(20.0f) + f7Var20.getMeasuredHeight()) {
                                    f7Var22 = wnVar.x0;
                                    f60 = AndroidUtilities.dp(20.0f) + f7Var22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i12 = i16;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size2) {
                                        arrayList5 = arrayList;
                                        u1Var4 = u1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i18 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i17);
                                    arrayList5 = arrayList;
                                    if (wnVar.W5[messageObject.getDialogId() == wnVar.T5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        u1Var4 = u1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i17++;
                                        size2 = i18;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - wnVar.rc) - AndroidUtilities.dp(9.0f);
                                za0Var6 = wnVar.I1;
                                if (za0Var6 != null) {
                                    za0Var9 = wnVar.I1;
                                    f40 = za0Var9.d();
                                } else {
                                    f40 = 0.0f;
                                }
                                float f62 = measuredHeight7 - f40;
                                za0Var7 = wnVar.I1;
                                if (za0Var7 != null) {
                                    za0Var8 = wnVar.I1;
                                    f41 = za0Var8.e();
                                } else {
                                    f41 = 0.0f;
                                }
                                org.telegram.ui.Cells.u1 u1Var6 = u1Var4;
                                canvas3.clipRect(0.0f, f56 + f41, getMeasuredWidth(), f62);
                                f7Var21 = wnVar.x0;
                                canvas3.translate(0.0f, f7Var21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                u1Var2 = u1Var6;
                                f15 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f57, (int) dp, (int) f59, (int) f60, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (u1Var2 != null && u1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            f7Var4 = wnVar.x0;
                            float left3 = f7Var4.getLeft();
                            f7Var5 = wnVar.x0;
                            float right2 = f7Var5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - wnVar.rc) - wnVar.W8(org.telegram.ui.Components.g31.c)) - AndroidUtilities.dp(f14);
                            za0Var3 = wnVar.I1;
                            if (za0Var3 != null) {
                                za0Var4 = wnVar.I1;
                                float max = Math.max(0.0f, za0Var4.e());
                                za0Var5 = wnVar.I1;
                                f17 = Math.max(0.0f, za0Var5.d());
                                f16 = max;
                            } else {
                                f16 = 0.0f;
                                f17 = 0.0f;
                            }
                            jk jkVar = wnVar.Y;
                            if (jkVar != null && (ofVar = jkVar.m0) != null) {
                                f17 = Math.max(f17, ofVar.f ? 0.0f : Math.max(0.0f, ofVar.getMeasuredHeight() - (ofVar.c.getTranslationY() + ofVar.e)));
                            }
                            float f63 = f56 + f16;
                            float f64 = measuredHeight8 - f17;
                            if (u1Var2 == null || !u1Var2.getTransitionParams().w0) {
                                f7Var6 = wnVar.x0;
                                left3 = Math.max(left3, view8.getX() + f7Var6.getLeft());
                                f7Var7 = wnVar.x0;
                                f63 = Math.max(f63, view8.getY() + f7Var7.getY());
                                f7Var8 = wnVar.x0;
                                right2 = Math.min(right2, view8.getX() + f7Var8.getLeft() + view8.getMeasuredWidth());
                                f7Var9 = wnVar.x0;
                                f64 = Math.min(f64, view8.getY() + f7Var9.getY() + view8.getMeasuredHeight());
                            }
                            float f65 = f64;
                            float f66 = f63;
                            float f67 = right2;
                            float max2 = Math.max(left3, wnVar.R8());
                            if (f66 < f65) {
                                if (view8.getAlpha() != f15) {
                                    canvas4 = canvas;
                                    canvas4.saveLayerAlpha(max2, f66, f67, f65, (int) (view8.getAlpha() * 255.0f), 31);
                                    f38 = f66;
                                    f19 = f65;
                                    f20 = max2;
                                    f21 = f67;
                                } else {
                                    canvas4 = canvas;
                                    f38 = f66;
                                    f19 = f65;
                                    f20 = max2;
                                    f21 = f67;
                                    canvas4.save();
                                }
                                if (u1Var2 != null) {
                                    u1Var2.setInvalidatesParent(true);
                                    num12 = wnVar.M8;
                                    u1Var2.setScrimReaction(num12);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(true);
                                    num11 = wnVar.M8;
                                    w0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f20, f38, f21, f19);
                                f7Var18 = wnVar.x0;
                                float x11 = view8.getX() + f7Var18.getLeft();
                                f7Var19 = wnVar.x0;
                                canvas4.translate(x11, view8.getY() + f7Var19.getY());
                                if (u1Var2 != null && groupedMessages3 == null && u1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, u1Var2.getPaddingTop());
                                    u1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (u1Var2 == null || !u1Var2.U2()) {
                                    f18 = f38;
                                } else {
                                    canvas4.save();
                                    f18 = f38;
                                    canvas4.translate(0.0f, u1Var2.getPaddingTop());
                                    u1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (w0Var != null) {
                                    w0Var.z(canvas4);
                                }
                                canvas4.restore();
                                if (u1Var2 != null) {
                                    u1Var2.setInvalidatesParent(false);
                                    u1Var2.setScrimReaction(num4);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(false);
                                    w0Var.setScrimReaction(num4);
                                }
                            } else {
                                canvas4 = canvas;
                                f18 = f66;
                                f19 = f65;
                                view9 = view8;
                                f20 = max2;
                                f21 = f67;
                            }
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePosition;
                            if (groupedMessagePosition2 != null || (u1Var2 != null && u1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(u1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && u1Var2.T2())) {
                                        arrayList2.add(u1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & u1Var2.t0()) != 0) {
                                    arrayList5.add(u1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i19 = groupedMessagePosition2.flags;
                                    if ((i19 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(u1Var2);
                            }
                            num5 = wnVar.M8;
                            if (num5 == null || u1Var2 == null || groupedMessages3 != null) {
                                float f68 = f21;
                                float f69 = f20;
                                View view27 = view9;
                                float f70 = f19;
                                float f71 = f18;
                                f22 = f56;
                                num6 = wnVar.M8;
                                if (num6 != null && w0Var != null) {
                                    paint13 = wnVar.D8;
                                    if (paint13 != null) {
                                        matrix7 = wnVar.E8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / wnVar.B8.getWidth();
                                        matrix8 = wnVar.E8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = wnVar.C8;
                                        matrix9 = wnVar.E8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = wnVar.D8;
                                        paint16.setAlpha((int) (wnVar.L8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = wnVar.D8;
                                        w0Var2 = w0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint14 = wnVar.F8;
                                        f23 = wnVar.H8;
                                        f24 = wnVar.K8;
                                        paint14.setAlpha((int) (f24 * f23 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = wnVar.F8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f66 < f65) {
                                        f25 = wnVar.H8;
                                        f26 = wnVar.K8;
                                        float f72 = (f26 * f25) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f27 = wnVar.K8;
                                        float f73 = f27 * alpha;
                                        if (f73 < f15) {
                                            canvas.saveLayerAlpha(f69, f71, f68, f70, (int) (f73 * 255.0f), 31);
                                            f70 = f70;
                                            f28 = f71;
                                            canvas3 = canvas;
                                        } else {
                                            canvas3 = canvas;
                                            f28 = f71;
                                            canvas3.save();
                                        }
                                        canvas3.clipRect(f69, f28, f68, f70);
                                        f7Var10 = wnVar.x0;
                                        float x12 = view27.getX() + f7Var10.getLeft();
                                        f7Var11 = wnVar.x0;
                                        canvas3.translate(x12, view27.getY() + f7Var11.getY() + view27.getPaddingTop());
                                        num7 = wnVar.M8;
                                        boolean z14 = wnVar.I8;
                                        zg.p0 p0Var = w0Var2.C0;
                                        if (!p0Var.b) {
                                            org.telegram.ui.ActionBar.d6 d6Var = w0Var2.Y0;
                                            if (d6Var != null) {
                                                d6Var.m(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.h6.q(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            }
                                            p0Var.D = f72;
                                            p0Var.E = z14;
                                            p0Var.d(canvas3, w0Var2.j2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        f7Var12 = wnVar.x0;
                                        float x13 = view27.getX() + f7Var12.getLeft();
                                        f7Var13 = wnVar.x0;
                                        canvas3.translate(x13, view27.getY() + f7Var13.getY() + view27.getPaddingTop());
                                        int i20 = wnVar.N8;
                                        num8 = wnVar.M8;
                                        w0Var2.E(this, canvas3, i20, num8, f72);
                                        pmVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = wnVar.D8;
                                if (paint18 != null) {
                                    matrix10 = wnVar.E8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / wnVar.B8.getWidth();
                                    matrix11 = wnVar.E8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = wnVar.C8;
                                    matrix12 = wnVar.E8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = wnVar.D8;
                                    paint21.setAlpha((int) (wnVar.L8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = wnVar.D8;
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    paint19 = wnVar.F8;
                                    f31 = wnVar.H8;
                                    f32 = wnVar.K8;
                                    paint19.setAlpha((int) (f32 * f31 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = wnVar.F8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f66 < f65) {
                                    f33 = wnVar.H8;
                                    f34 = wnVar.K8;
                                    float f74 = (f34 * f33) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f35 = wnVar.K8;
                                    float f75 = f35 * alpha2;
                                    if (f75 < f15) {
                                        canvas5 = canvas;
                                        f36 = f19;
                                        float f76 = f18;
                                        canvas5.saveLayerAlpha(f30, f76, f29, f36, (int) (f75 * 255.0f), 31);
                                        f37 = f76;
                                    } else {
                                        canvas5 = canvas;
                                        f36 = f19;
                                        f37 = f18;
                                        canvas5.save();
                                    }
                                    canvas5.clipRect(f30, f37, f29, f36);
                                    f7Var14 = wnVar.x0;
                                    float x14 = view10.getX() + f7Var14.getLeft();
                                    f7Var15 = wnVar.x0;
                                    canvas5.translate(x14, view10.getY() + f7Var15.getY() + view10.getPaddingTop());
                                    num9 = wnVar.M8;
                                    u1Var2.h2(canvas5, num9, f74, wnVar.I8);
                                    canvas5.restore();
                                    canvas5.save();
                                    f7Var16 = wnVar.x0;
                                    float x15 = view10.getX() + f7Var16.getLeft();
                                    f7Var17 = wnVar.x0;
                                    canvas5.translate(x15, view10.getY() + f7Var17.getY() + view10.getPaddingTop());
                                    int i21 = wnVar.N8;
                                    num10 = wnVar.M8;
                                    f22 = f56;
                                    u1Var2.i2(this, canvas5, i21, num10, f74);
                                    canvas.restore();
                                } else {
                                    f22 = f56;
                                }
                            }
                            pmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f22 = f56;
                            pmVar2 = this;
                        }
                        i16 = i12 + 1;
                        pmVar3 = pmVar2;
                        y3 = f22;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    pmVar = pmVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f11 = 1.0f;
                    float f77 = y3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            pmVar.a0(canvas3, f77, (org.telegram.ui.Cells.u1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            pmVar.a0(canvas3, f77, (org.telegram.ui.Cells.u1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.u1 u1Var7 = (org.telegram.ui.Cells.u1) arrayList.get(i24);
                            if (u1Var7.getCurrentPosition() != null || u1Var7.getTransitionParams().w0) {
                                pmVar.a0(canvas3, f77, u1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.u1 u1Var8 = (org.telegram.ui.Cells.u1) arrayList4.get(i25);
                            if (u1Var8.getCurrentPosition() != null || u1Var8.getTransitionParams().w0) {
                                pmVar.a0(canvas3, f77, u1Var8, 3);
                            }
                        }
                    }
                    num3 = wnVar.M8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = wnVar.D8;
                        if (paint8 != null) {
                            matrix4 = wnVar.E8;
                            matrix4.reset();
                            float measuredWidth13 = pmVar.getMeasuredWidth() / wnVar.B8.getWidth();
                            matrix5 = wnVar.E8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = wnVar.C8;
                            matrix6 = wnVar.E8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = wnVar.D8;
                            paint11.setAlpha((int) (wnVar.L8 * 255.0f));
                            float measuredWidth14 = pmVar.getMeasuredWidth();
                            float measuredHeight13 = pmVar.getMeasuredHeight();
                            paint12 = wnVar.D8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = wnVar.F8;
                            f12 = wnVar.H8;
                            f13 = wnVar.K8;
                            paint9.setAlpha((int) (f13 * f12 * 255.0f));
                            float measuredWidth15 = pmVar.getMeasuredWidth();
                            float measuredHeight14 = pmVar.getMeasuredHeight();
                            paint10 = wnVar.F8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.u1 u1Var9 = (org.telegram.ui.Cells.u1) arrayList4.get(i26);
                            if (u1Var9.getCurrentPosition() != null || u1Var9.getTransitionParams().w0) {
                                pmVar.a0(canvas3, f77, u1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = wnVar.M8;
                    if (num13 == null) {
                        f47 = wnVar.K8;
                        if (f47 < f11) {
                            paint25 = wnVar.D8;
                            if (paint25 != null) {
                                matrix13 = wnVar.E8;
                                matrix13.reset();
                                float measuredWidth16 = pmVar.getMeasuredWidth() / wnVar.B8.getWidth();
                                matrix14 = wnVar.E8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = wnVar.C8;
                                matrix15 = wnVar.E8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = wnVar.D8;
                                paint28.setAlpha((int) (wnVar.L8 * 255.0f));
                                float measuredWidth17 = pmVar.getMeasuredWidth();
                                float measuredHeight15 = pmVar.getMeasuredHeight();
                                paint29 = wnVar.D8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = wnVar.F8;
                                f48 = wnVar.H8;
                                f49 = wnVar.K8;
                                paint26.setAlpha((int) ((f11 - f49) * f48 * 255.0f));
                                float measuredWidth18 = pmVar.getMeasuredWidth();
                                float measuredHeight16 = pmVar.getMeasuredHeight();
                                paint27 = wnVar.F8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            pmVar = pmVar3;
            f10 = 20.0f;
            f11 = 1.0f;
            num13 = wnVar.M8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            pmVar = pmVar3;
            f10 = 20.0f;
        }
        view3 = wnVar.J8;
        if (view3 != null || ((ArrayList) wnVar.M9.c).size() > 0) {
            za0Var = wnVar.I1;
            if (za0Var != null) {
                za0Var2 = wnVar.I1;
            }
            super.drawChild(canvas3, wnVar.j1, SystemClock.uptimeMillis());
            ak akVar = wnVar.X2;
            if (akVar != null && akVar.getTag() != null) {
                super.drawChild(canvas3, wnVar.X2, SystemClock.uptimeMillis());
            }
            zj zjVar = wnVar.Y2;
            if (zjVar != null && zjVar.getTag() != null) {
                super.drawChild(canvas3, wnVar.Y2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.s00 s00Var = wnVar.m9;
            if (s00Var != null) {
                super.drawChild(canvas3, s00Var, SystemClock.uptimeMillis());
            }
            uh.i iVar3 = wnVar.X9;
            if (iVar3 != null) {
                super.drawChild(canvas3, iVar3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.j40 j40Var3 = wnVar.e2;
            if (j40Var3 != null) {
                super.drawChild(canvas3, j40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = wnVar.y3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.y3, SystemClock.uptimeMillis());
            }
            fl flVar = wnVar.z3;
            if (flVar != null && flVar.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.z3, SystemClock.uptimeMillis());
            }
            ci.e4 e4Var = wnVar.x1;
            if (e4Var != null && e4Var.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.x1, SystemClock.uptimeMillis());
            }
            ul ulVar = wnVar.B1;
            if (ulVar != null && ulVar.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.B1, SystemClock.uptimeMillis());
            }
            ci.e4 e4Var2 = wnVar.z1;
            if (e4Var2 != null && e4Var2.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.z1, SystemClock.uptimeMillis());
            }
            jk jkVar2 = wnVar.Y;
            if (jkVar2 != null && jkVar2.L != null) {
                canvas3.save();
                canvas3.translate(wnVar.Y.L.getX() + wnVar.Y.getX(), wnVar.Y.L.getY() + wnVar.Y.getY());
                wnVar.Y.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (wnVar.pa > 0 && pmVar.f < AndroidUtilities.dp(f10)) {
            int themedColor = wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6);
            if (pmVar.D0 == null) {
                pmVar.D0 = new Paint();
            }
            if (pmVar.E0 != themedColor) {
                Paint paint32 = pmVar.D0;
                pmVar.E0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, pmVar.getMeasuredHeight() - wnVar.pa, pmVar.getMeasuredWidth(), pmVar.getMeasuredHeight(), pmVar.D0);
            canvas3 = canvas6;
        }
        up upVar = wnVar.P9;
        if (upVar != null && upVar.e()) {
            int inputBubbleTop = (int) wnVar.S.getInputBubbleTop();
            int inputBubbleBottom = (int) wnVar.S.getInputBubbleBottom();
            wn wnVar2 = wnVar.T9;
            int i27 = inputBubbleTop - ((int) (wnVar.U9 * (wnVar2 == null ? 0.0f : wnVar2.O9)));
            up upVar2 = wnVar.P9;
            pmVar.getMeasuredWidth();
            upVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (wnVar.T9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, pmVar.getMeasuredWidth(), pmVar.getMeasuredHeight(), (int) (wnVar.U9 * 255.0f), 31);
            canvas3 = canvas;
            wnVar.T9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        wnVar.xa.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (wnVar.ka) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (wnVar.la * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        el elVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (elVar = this.J0.Ea) == null || !elVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        elVar.a(true);
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
        sk skVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.J0;
        hh.e eVar = wnVar.N3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || wnVar.isInBubbleMode()) ? (wnVar.Y.getEmojiView() != null ? wnVar.Y.getEmojiView() : wnVar.Y).getY() : wnVar.Y.getY();
        View view = wnVar.J8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        }
        jk jkVar = wnVar.Y;
        if (jkVar == null || !jkVar.z3 || motionEvent.getY() >= y3) {
            wnVar.j9 = motionEvent.getY();
            org.telegram.ui.Cells.ca o9 = wnVar.c9.o(getContext());
            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
            if (!wnVar.c9.y() || !wnVar.c9.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o9.getX(), o9.getY());
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                ci.i1 i1Var = wnVar.q1;
                if (i1Var != null) {
                    if (wnVar.u3 != null) {
                        z10 = i1Var.A(motionEvent);
                        if (wnVar.q1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !wnVar.c9.y() || (motionEvent.getY() >= wnVar.x0.getTop() && motionEvent.getY() <= wnVar.x0.getBottom())) {
                            skVar = wnVar.wa;
                            if (!skVar.n) {
                                return skVar.g(motionEvent);
                            }
                            com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
                            if (mVar == null || !mVar.a) {
                                if (wnVar.isInPreviewMode() && wnVar.J9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (wnVar.j1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                aa.a aVar = wnVar.j1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
                                                if (aVar != null) {
                                                    ((ih.b) aVar.b).getLocationInWindow(iArr2);
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
                                        mj mjVar = wnVar.a1;
                                        if (mjVar != null) {
                                            mjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], wnVar.a1.getMeasuredWidth() + i13, wnVar.a1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.F0 = motionEvent.getX();
                                                    this.G0 = motionEvent.getY();
                                                    this.H0 = SystemClock.elapsedRealtime();
                                                    this.I0 = z12;
                                                    mj mjVar2 = wnVar.a1;
                                                    if (mjVar2 != null) {
                                                        mjVar2.h0.c(z12);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    this.H0 = -1L;
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        mj mjVar3 = wnVar.a1;
                                        if (mjVar3 != null) {
                                            mjVar3.h0.c(false);
                                        }
                                        if (this.I0 || (v7.a7.a(this.F0, this.G0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.H0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.I0) {
                                                b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                                                wnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) b5Var2).P(ProfileActivity.m4(wnVar.T5));
                                            } else {
                                                b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                                                ((ActionBarLayout) b5Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.H0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.H0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z10) {
                                }
                            } else {
                                r4 r4Var = (r4) com.google.firebase.messaging.m.k().d;
                                if (r4Var != null) {
                                    r4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
                            if (wnVar.c9.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o9.getX(), o9.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = i1Var.e;
                        if (i1Var.H) {
                            i1Var.I = true;
                            i1Var.H = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(i1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            i1Var.d = 0;
                            i1Var.c = 1.0f;
                            org.telegram.ui.Components.l81 l81Var = i1Var.M;
                            if (l81Var != null) {
                                l81Var.e(1.0f, 0, i1Var.b);
                            }
                            i1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                skVar = wnVar.wa;
                if (!skVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.O0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.x0) goto L69;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ci.r6 r6Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        nk nkVar;
        MessageObject messageObject;
        org.telegram.ui.Components.h60 h60Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        wn wnVar = this.J0;
        boolean z12 = false;
        if ((wnVar.J8 == null && ((ArrayList) wnVar.M9.c).size() <= 0) || (view != wnVar.j1 && view != wnVar.X2 && view != wnVar.Y2 && view != wnVar.m9 && view != wnVar.X9 && view != wnVar.e2 && view != null && view != wnVar.y3 && view != wnVar.z3)) {
            if ((view != wnVar.y3 || !PhotoViewer.t1().Q1()) && (!wnVar.S9 || view != wnVar.x0)) {
                if (wnVar.ka) {
                    kVar3 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                }
                if (view != wnVar.b3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (r6Var = wnVar.y2) != null && r6Var.a() && wnVar.y2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == wnVar.t8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    } else {
                        if (view != wnVar.x0) {
                            if (view != wnVar.S) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == wnVar.t8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-wnVar.N9) - (wnVar.U9 != 0.0f ? (wnVar.x0.getMeasuredHeight() - wnVar.N9) * wnVar.U9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.h6.k3 != null && wnVar.v8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(wnVar.t8.getScaleX(), wnVar.t8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.h6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.h6.k3.setBounds(x10, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(wnVar.C9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(wnVar.C9()) + y3);
                                            org.telegram.ui.ActionBar.h6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z12 = super.drawChild(canvas, view, j3);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                                        z12 = super.drawChild(canvas, view, j3);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z12;
                                }
                                if (view == wnVar.S && (h60Var = wnVar.b3) != null && h60Var.getVisibility() == 0) {
                                    super.drawChild(canvas, wnVar.b3, j3);
                                }
                                z12 = super.drawChild(canvas, view, j3);
                                if (z11 && view == wnVar.x0 && playingMessageObject.type != 5 && (nkVar = wnVar.t8) != null && nkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-wnVar.N9) - (wnVar.U9 != 0.0f ? (wnVar.x0.getMeasuredHeight() - wnVar.N9) * wnVar.U9 : 0.0f)) + wnVar.O9);
                                    super.drawChild(canvas, wnVar.t8, j3);
                                    if (wnVar.u8 != null) {
                                        canvas.save();
                                        canvas.translate(wnVar.u8.getX(), wnVar.x0.getY() + wnVar.u8.getTop());
                                        if (z10) {
                                            wnVar.u8.g2(canvas);
                                            invalidate();
                                            wnVar.u8.invalidate();
                                        } else {
                                            wnVar.u8.Y1(canvas);
                                            org.telegram.ui.Cells.u1 u1Var = wnVar.u8;
                                            if (!u1Var.vb && ((messageObject = u1Var.y7) == null || messageObject.type != 27)) {
                                                u1Var.m2(u1Var.getAlpha(), canvas, true);
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
                        if (view == wnVar.t8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.aw0
    public float getBottomOffset() {
        return this.J0.x0.getBottom();
    }

    public wn getChatActivity() {
        return this.J0;
    }

    @Override // org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.aw0
    public int getKeyboardHeight() {
        if (this.J0.Oa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.aw0
    public float getListTranslationY() {
        return this.J0.x0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.aw0
    public Drawable getNewDrawable() {
        Drawable d = this.J0.ea.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.aw0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.ea.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.aw0
    public int getScrollOffset() {
        return this.J0.x0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        wn wnVar = this.J0;
        if (wnVar.Oa) {
            this.H.b = wnVar.X0;
        } else {
            b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    b5Var3 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
                    o1Var.b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        wnVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == wnVar.T5)) {
            MediaController.getInstance().setTextureView(wnVar.N7(false), wnVar.v8, wnVar.t8, true);
        }
        up upVar = wnVar.P9;
        if (upVar != null) {
            upVar.f();
        }
        wnVar.xa.j();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        wn wnVar = this.J0;
        up upVar = wnVar.P9;
        if (upVar != null) {
            NotificationCenter.getInstance(upVar.e0).removeObserver(upVar, NotificationCenter.updateInterfaces);
            upVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.q5 q5Var = upVar.k0;
            if (q5Var != null && (view = upVar.a0) != null) {
                q5Var.o(view);
            }
            upVar.Q = 0.0f;
            upVar.P = 0L;
            wnVar.P9 = null;
        }
        wnVar.xa.k();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        wn wnVar;
        ci.r6 r6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (r6Var = (wnVar = this.J0).y2) == null || !r6Var.a() || wnVar.y2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.Bc) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int z11;
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
        boolean z12;
        org.telegram.ui.ActionBar.k kVar3;
        int i21;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        wn wnVar = this.J0;
        ph.i iVar = wnVar.v;
        int i22 = (measuredWidth - wnVar.Ta) - wnVar.Ua;
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
                    z11 = hg.c.z(i22, measuredWidth2, 2, wnVar.Ta) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = wnVar.Ta + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
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
                            if (childAt != wnVar.M9 && childAt != wnVar.X9 && childAt != wnVar.S && !(childAt instanceof org.telegram.ui.Components.j40) && !(childAt instanceof org.telegram.ui.Components.rp)) {
                                if (childAt instanceof org.telegram.ui.Cells.ca) {
                                    i20 = wnVar.za;
                                } else if (childAt == wnVar.Q0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (wnVar.Y.u0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z12 = ((org.telegram.ui.ActionBar.m2) wnVar).inBubbleMode;
                                        if (!z12) {
                                            i18 = wnVar.Y.getBottom();
                                        }
                                    }
                                    i18 = wnVar.Y.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    jk jkVar = wnVar.Y;
                                    if (jkVar != null && (childAt == jkVar.O1 || childAt == jkVar.N1)) {
                                        i18 = org.telegram.messenger.ok.y(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == wnVar.w2) {
                                        i18 = org.telegram.messenger.ok.y(7.0f, iVar.d(), i18);
                                    } else if (jkVar == null || childAt != jkVar.e1) {
                                        if (childAt == wnVar.e2 || childAt == wnVar.s2 || childAt == wnVar.f2) {
                                            i19 = this.w0;
                                        } else if (childAt == wnVar.x0 || childAt == wnVar.v0 || childAt == wnVar.X2 || childAt == wnVar.Y2 || childAt == wnVar.Z2) {
                                            i20 = wnVar.za;
                                        } else if (childAt != wnVar.P) {
                                            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (wnVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == wnVar.t8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != wnVar.b3 && childAt != wnVar.c3 && childAt != wnVar.u0) {
                                                if (childAt instanceof org.telegram.ui.Components.fc0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != wnVar.T) {
                                                    if (childAt != wnVar.N3) {
                                                    }
                                                }
                                            }
                                        } else if (jkVar.z0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.ok.y(9.0f, iVar.d(), i18);
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
                    z11 = (measuredWidth - wnVar.Ua) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = z11 - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        zj zjVar = wnVar.Y2;
        if (zjVar != null) {
            zjVar.setBackgroundHeight(getMeasuredHeight());
        }
        wnVar.o9();
        wnVar.r9();
        wnVar.Mc(false, false);
        S();
        wnVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0548  */
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
        org.telegram.ui.Components.qc qcVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.x xVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.u0 u0Var;
        TLRPC.User user;
        ViewGroup viewGroup;
        int indexOfChild;
        wn wnVar = this.J0;
        ph.i iVar = wnVar.v;
        yf.b0 b0Var = wnVar.Cc;
        ViewParent parent = b0Var.getParent();
        if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(b0Var)) >= 0 && indexOfChild != viewGroup.getChildCount() - 1) {
            viewGroup.bringChildToFront(b0Var);
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - wnVar.Ta) - wnVar.Ua;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        fh.a aVar = wnVar.L.a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).c(i15, size2);
        }
        if (this.y0 != i15) {
            wnVar.F4 = false;
            this.y0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
            if (z13 || (user = wnVar.f) == null || !user.self) {
                wnVar.K9 = false;
            } else {
                org.telegram.ui.ActionBar.h5 titleTextView = wnVar.a1.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    wnVar.K9 = !wnVar.L9;
                } else {
                    wnVar.K9 = false;
                }
            }
            if (wnVar.K9 || wnVar.L9 || UserObject.isBotForumWithEditableTopics(wnVar.f)) {
                mj mjVar = wnVar.a1;
                if (mjVar != null && mjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) wnVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(wnVar.R3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                mj mjVar2 = wnVar.a1;
                if (mjVar2 != null && mjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) wnVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (wnVar.K9) {
                kVar8 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (!kVar8.n0 && (u0Var = wnVar.m0) != null) {
                    u0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var2 = wnVar.h0;
                if (u0Var2 != null) {
                    u0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.u0 u0Var3 = wnVar.h0;
                if (u0Var3 != null) {
                    u0Var3.K(40);
                }
                org.telegram.ui.ActionBar.u0 u0Var4 = wnVar.m0;
                if (u0Var4 != null) {
                    u0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if (!kVar7.n0 && (xVar = wnVar.n0) != null) {
                xVar.f((!wnVar.L9 || wnVar.K9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.u0 u0Var5 = wnVar.h0;
            if (u0Var5 != null) {
                TLRPC.UserFull userFull = wnVar.a8;
                if (wnVar.L9) {
                    u0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    u0Var5.K(32);
                }
            }
            wnVar.F4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + wnVar.oa >= AndroidUtilities.dp(20.0f);
        if (this.x0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (wnVar.pa > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            wnVar.oa = wnVar.pa;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            wnVar.oa = wnVar.Y.t0() ? wnVar.Y.getEmojiPadding() : 0;
        } else {
            wnVar.oa = 0;
        }
        setEmojiKeyboardHeight(wnVar.oa);
        boolean z15 = this.f + wnVar.oa >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i16 = 0; i16 < wnVar.x0.getChildCount(); i16++) {
                View childAt = wnVar.x0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        wnVar.x0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            wnVar.z0.i1(R, (int) (((((wnVar.x0.getMeasuredHeight() - wnVar.s9) - wnVar.Aa) + ((this.f + wnVar.oa) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(wnVar.C9()))) / 2.0f), false);
                            wnVar.A0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(wnVar.Y, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
                            if (!z10 || wnVar.Oa) {
                                this.w0 = 0;
                            } else {
                                this.w0 = wnVar.Y.getMeasuredHeight();
                            }
                            wnVar.za = 0;
                            wnVar.Aa = 0;
                            if (SharedConfig.chatBlurEnabled() && !wnVar.Oa && wnVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = wnVar.G;
                                wnVar.za = i18;
                                wnVar.Aa = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != wnVar.Y) {
                                    kVar4 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                                    if (childAt2 != kVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == wnVar.x0 || childAt2 == wnVar.v0 || (childAt2 instanceof org.telegram.ui.Cells.ca)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), wnVar.za + size2 + wnVar.Aa), TLObject.FLAG_30));
                                            } else if (childAt2 == wnVar.P) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.w0;
                                                z12 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((wnVar.Y.z0() ? 48 : 0) + 2) + (i20 - (z12 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == wnVar.b3) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                wnVar.b3.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) wnVar.sc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == wnVar.c3) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) wnVar.sc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == wnVar.Q0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (wnVar.Y.u0(childAt2)) {
                                                org.telegram.ui.Components.bg bgVar = wnVar.Y.H1;
                                                if (childAt2 == bgVar && bgVar != null) {
                                                    i19 = bgVar.getKeyboardHeight();
                                                }
                                                z11 = ((org.telegram.ui.ActionBar.m2) wnVar).inBubbleMode;
                                                if (z11) {
                                                    int paddingTop2 = getPaddingTop() + (i17 - this.w0) + measuredHeight;
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else if (AndroidUtilities.isInMultiwindow) {
                                                    int paddingTop3 = getPaddingTop() + (((i17 - this.w0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                }
                                            } else {
                                                ck ckVar = wnVar.I1;
                                                if (childAt2 == ckVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ckVar.getLayoutParams();
                                                    gg.k1 adapter = wnVar.I1.getAdapter();
                                                    if (adapter.w0 == null || adapter.h0) {
                                                        wnVar.I1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        wnVar.I1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == wnVar.c9.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + wnVar.za;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || wnVar.Oa) {
                                                        qm qmVar = wnVar.c9;
                                                        qmVar.e0 = 0;
                                                        qmVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        qm qmVar2 = wnVar.c9;
                                                        qmVar2.e0 = keyboardHeight;
                                                        qmVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.fc0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == wnVar.R1) {
                                                    kVar5 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                                                    if (kVar5.getVisibility() == 0) {
                                                        kVar6 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
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
                            if (wnVar.E4) {
                                wnVar.F4 = true;
                                wnVar.o9();
                                wnVar.r9();
                                wnVar.E4 = false;
                                rj rjVar = wnVar.x0;
                                rjVar.measure(View.MeasureSpec.makeMeasureSpec(rjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(wnVar.x0.getMeasuredHeight(), TLObject.FLAG_30));
                                wnVar.F4 = false;
                            }
                            i13 = wnVar.x4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ai.o8(this, i13, 25));
                                wnVar.x4 = -1;
                            }
                            qcVar = org.telegram.ui.Components.qc.w;
                            if (qcVar != null && wnVar.Yb != null) {
                                qcVar.l();
                            }
                            wnVar.S6();
                            this.x0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.bf bfVar = wnVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(bfVar);
        bfVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(wnVar.Y, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
        if (z10) {
        }
        this.w0 = 0;
        wnVar.za = 0;
        wnVar.Aa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = wnVar.G;
            wnVar.za = i182;
            wnVar.Aa = i182;
        }
        while (i12 < childCount) {
        }
        if (wnVar.E4) {
        }
        i13 = wnVar.x4;
        if (i13 != -1) {
        }
        qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar != null) {
            qcVar.l();
        }
        wnVar.S6();
        this.x0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        wn wnVar = this.J0;
        gh.d.c(wnVar.z8, wnVar.fragmentView);
        wnVar.A8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.J0.F4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        wn wnVar = this.J0;
        wnVar.v9 = i11;
        wnVar.o9();
        wnVar.r9();
    }

    @Override // org.telegram.ui.Components.aw0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.aw0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.aw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
