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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.Components.kw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final /* synthetic */ qn J0;
    public int w0;
    public int x0;
    public int y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(qn qnVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = qnVar;
        this.w0 = 0;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new im(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.J0;
        qnVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        kVar.setTranslationY(0.0f);
        vk vkVar = qnVar.bb;
        if (vkVar != null) {
            vkVar.setTranslationY(qnVar.o1 != null ? r3.getCurrentHeight() : 0);
        }
        ei.x3 x3Var = qnVar.w1;
        if (x3Var != null) {
            x3Var.setTranslationY(0.0f);
        }
        ei.x3 x3Var2 = qnVar.v1;
        if (x3Var2 != null) {
            x3Var2.setTranslationY(0.0f);
        }
        qnVar.Q0.setTranslationY(0.0f);
        qnVar.P.setTranslationY(0.0f);
        qnVar.w9 = 0.0f;
        qnVar.x9 = 0.0f;
        qnVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.r60 r60Var = qnVar.b3;
        if (r60Var != null) {
            r60Var.e(0.0f);
        }
        ei.g6 g6Var = qnVar.y2;
        if (g6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.b;
            faVar.u = 0.0f;
            faVar.d.invalidate();
        }
        qnVar.setFragmentPanTranslationOffset(0);
        qnVar.t9();
    }

    @Override // org.telegram.ui.Components.kw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.kw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.kw0
    public final int R() {
        ci.b3 b3Var = this.J0.J1;
        if (b3Var == null || !b3Var.isShowing()) {
            return super.R();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.kw0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.wc0) {
            ((org.telegram.ui.Components.wc0) drawable).p();
        }
        qn qnVar = this.J0;
        gh.a c10 = qnVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(qnVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(qnVar.W.a(c10));
        qnVar.Db = computePerceivedBrightness <= 0.721f;
        qnVar.Eb = computePerceivedBrightness2 <= 0.9f;
        qnVar.L.a = c10;
        kh.f fVar = qnVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        ih.f fVar2 = qnVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        qnVar.s9();
        qnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        int save = canvas.save();
        qn qnVar = this.J0;
        float x10 = u1Var.getX() + qnVar.x0.getLeft();
        float y3 = u1Var.getY() + qnVar.x0.getY() + u1Var.getPaddingTop();
        float alpha = u1Var.a() ? u1Var.getAlpha() : 1.0f;
        canvas.clipRect(qnVar.x0.getLeft(), f7, qnVar.x0.getRight(), ((((qnVar.x0.getY() + qnVar.x0.getMeasuredHeight()) - qnVar.Ba) - qnVar.v.e()) - qnVar.tc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && qnVar.M8 != null)) {
            float f10 = (qnVar.H8 * qnVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, qnVar.M8, f10, qnVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, qnVar.N8, qnVar.M8, f10);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        qn qnVar = this.J0;
        bh.b bVar = qnVar.J;
        fk fkVar = qnVar.Y;
        if (fkVar == null || view != fkVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            kh.f fVar = qnVar.X;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        fk fkVar2 = qnVar.Y;
        if (fkVar2 != null && view == fkVar2.m0) {
            gi.x xVar = (gi.x) view;
            xVar.setBackgroundDrawable(bVar.c(xVar.c, qnVar.x, false));
        }
        fk fkVar3 = qnVar.Y;
        if (fkVar3 == null || view != (sgVar = fkVar3.O1)) {
            return;
        }
        sgVar.setBlurredBackgroundFactory(bVar);
    }

    public final boolean b0(View view) {
        if (view == this.L) {
            return true;
        }
        qn qnVar = this.J0;
        return view == qnVar.y2 || view == qnVar.q1 || view == qnVar.m9 || view == qnVar.X || view == qnVar.K3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0c1a, code lost:
    
        if (r0.getVisibility() != 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x077f, code lost:
    
        if ((r5 & 1) != 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0b71  */
    @Override // org.telegram.ui.Components.kw0, android.view.ViewGroup, android.view.View
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
        Paint paint6;
        Paint paint7;
        Integer num2;
        View view2;
        Canvas canvas3;
        jm jmVar;
        float f12;
        float f13;
        View view3;
        org.telegram.ui.Components.ib0 ib0Var;
        org.telegram.ui.Components.ib0 ib0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        ci.q5 q5Var;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        ci.q5 q5Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        float f14;
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
        Paint paint12;
        ci.q5 q5Var3;
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i13;
        int i14;
        ArrayList arrayList5;
        org.telegram.ui.Cells.u1 u1Var2;
        ArrayList arrayList6;
        ij ijVar;
        Integer num4;
        float f18;
        float f19;
        boolean z10;
        ci.q5 q5Var4;
        ci.q5 q5Var5;
        org.telegram.ui.Components.ib0 ib0Var3;
        float f20;
        float f21;
        ci.q5 q5Var6;
        ci.q5 q5Var7;
        ci.q5 q5Var8;
        ci.q5 q5Var9;
        Canvas canvas4;
        float f22;
        float f23;
        View view9;
        float f24;
        float f25;
        float f26;
        Integer num5;
        float f27;
        float f28;
        int i15;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.w0 w0Var2;
        Paint paint14;
        float f29;
        float f30;
        Paint paint15;
        float f31;
        float f32;
        float f33;
        float f34;
        ci.q5 q5Var10;
        ci.q5 q5Var11;
        Integer num7;
        ci.q5 q5Var12;
        ci.q5 q5Var13;
        Integer num8;
        jm jmVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        Paint paint17;
        Paint paint18;
        float f35;
        float f36;
        View view10;
        int i16;
        Paint paint19;
        float f37;
        float f38;
        Paint paint20;
        float f39;
        float f40;
        float f41;
        Canvas canvas5;
        float f42;
        float f43;
        float f44;
        ci.q5 q5Var14;
        ci.q5 q5Var15;
        Integer num9;
        ci.q5 q5Var16;
        ci.q5 q5Var17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f45;
        Integer num11;
        ci.q5 q5Var18;
        ci.q5 q5Var19;
        Integer num12;
        org.telegram.ui.Components.nf nfVar;
        org.telegram.ui.Components.ib0 ib0Var4;
        org.telegram.ui.Components.ib0 ib0Var5;
        org.telegram.ui.Cells.u1 u1Var3;
        float f46;
        ci.q5 q5Var20;
        org.telegram.ui.Cells.u1 u1Var4;
        boolean z11;
        org.telegram.ui.Components.ib0 ib0Var6;
        float f47;
        org.telegram.ui.Components.ib0 ib0Var7;
        float f48;
        ci.q5 q5Var21;
        org.telegram.ui.Components.ib0 ib0Var8;
        org.telegram.ui.Components.ib0 ib0Var9;
        ci.q5 q5Var22;
        View view11;
        float f49;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.k kVar6;
        View view15;
        float f50;
        Paint paint23;
        float f51;
        float f52;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f53;
        Integer num13;
        float f54;
        Paint paint25;
        Paint paint26;
        float f55;
        float f56;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        Paint paint29;
        float f57;
        Paint paint30;
        float f58;
        float f59;
        Paint paint31;
        View view24;
        float f60;
        float f61;
        org.telegram.ui.ActionBar.k kVar7;
        int i17;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.r40 r40Var;
        View view25;
        aj ajVar;
        View view26;
        pj pjVar;
        jm jmVar3 = this;
        qn qnVar = jmVar3.J0;
        ij ijVar2 = qnVar.v;
        ArrayList arrayList7 = qnVar.n6;
        qnVar.Y.Q1();
        qnVar.nc();
        if (qnVar.ra || ((pjVar = qnVar.y0) != null && pjVar.k())) {
            qnVar.ra = false;
            qnVar.yc();
        }
        qnVar.Qc(false, false);
        qnVar.Ac();
        aj ajVar2 = qnVar.g2;
        if (ajVar2 != null && ajVar2.getTag() != null && (view26 = (ajVar = qnVar.g2).e) != null) {
            ajVar.g(view26);
        }
        org.telegram.ui.Components.r40 r40Var2 = qnVar.i2;
        if (r40Var2 != null && r40Var2.getTag() != null && (view25 = (r40Var = qnVar.i2).e) != null) {
            r40Var.g(view25);
        }
        float f62 = 0.2f;
        float f63 = 2.0f;
        if (qnVar.ka) {
            kVar10 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            canvas2 = canvas;
            i10 = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), jmVar3.getMeasuredWidth(), jmVar3.getMeasuredHeight(), (int) (qnVar.la * 255.0f), 31);
            float f64 = (qnVar.la * 0.2f) + 0.8f;
            canvas2.scale(f64, f64, jmVar3.getMeasuredWidth() / 2.0f, jmVar3.getMeasuredHeight() / 2.0f);
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
            org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) arrayList7.get(i19);
            MessageObject.SendAnimationData sendAnimationData = u1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    qk qkVar = qnVar.o1;
                    int currentHeight = measuredHeight + (qkVar != null ? qkVar.getCurrentHeight() : 0);
                    ck ckVar = qnVar.p1;
                    int currentHeight2 = currentHeight + (ckVar != null ? ckVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
                    i17 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i17 = 0;
                }
                f60 = f63;
                f61 = f62;
                canvas2.clipRect(0.0f, i17 + qnVar.t9, jmVar3.getWidth(), jmVar3.getHeight());
                ImageReceiver photoImage = u1Var5.getPhotoImage();
                u1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((qnVar.Y.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) com.google.android.gms.internal.play_billing.k3.D(1.0f, sendAnimationData.progress, u1Var5.getTranslationY(), r9[1])));
                if (sendAnimationData.fromPreview) {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, topViewEnterProgress, sendAnimationData.progress));
                } else {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, photoImage.getCenterY() + topViewEnterProgress, sendAnimationData.progress));
                }
                float f65 = sendAnimationData.currentScale;
                canvas2.scale(f65, f65);
                if (!sendAnimationData.fromPreview) {
                    canvas2.translate(-photoImage.getCenterX(), -photoImage.getCenterY());
                }
                u1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                u1Var5.draw(canvas2);
                canvas2.restore();
            } else {
                f60 = f63;
                f61 = f62;
            }
            i19++;
            f63 = f60;
            f62 = f61;
        }
        float f66 = f63;
        float f67 = f62;
        num = qnVar.M8;
        if (num != null) {
            view24 = qnVar.J8;
        }
        paint = qnVar.D8;
        if (paint != null) {
            matrix = qnVar.E8;
            matrix.reset();
            float measuredWidth = jmVar3.getMeasuredWidth() / qnVar.B8.getWidth();
            matrix2 = qnVar.E8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = qnVar.C8;
            matrix3 = qnVar.E8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = qnVar.D8;
            paint5.setAlpha((int) (qnVar.L8 * 255.0f));
            paint6 = qnVar.D8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = jmVar3.getMeasuredWidth();
                float measuredHeight2 = jmVar3.getMeasuredHeight();
                paint7 = qnVar.D8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = qnVar.F8;
            f11 = qnVar.H8;
            float f68 = f11 * 255.0f;
            view = qnVar.J8;
            paint2.setAlpha((int) (f68 * (view != null ? qnVar.K8 : 1.0f)));
            paint3 = qnVar.F8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = jmVar3.getMeasuredWidth();
                float measuredHeight3 = jmVar3.getMeasuredHeight();
                paint4 = qnVar.F8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = qnVar.M8;
        if (num2 != null && qnVar.O8) {
            jmVar3.invalidate();
        }
        view2 = qnVar.J8;
        if (view2 != null) {
            view4 = qnVar.J8;
            if (view4 == qnVar.j1) {
                f57 = qnVar.K8;
                if (f57 < 1.0f) {
                    paint30 = qnVar.F8;
                    f58 = qnVar.H8;
                    f59 = qnVar.K8;
                    paint30.setAlpha((int) ((1.0f - f59) * f58 * 255.0f));
                    float measuredWidth4 = jmVar3.getMeasuredWidth();
                    float measuredHeight4 = jmVar3.getMeasuredHeight();
                    paint31 = qnVar.F8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = qnVar.J8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f49 = qnVar.K8;
                    if (f49 < 1.0f) {
                        view20 = qnVar.J8;
                        float left = view20.getLeft();
                        view21 = qnVar.J8;
                        float top = view21.getTop();
                        view22 = qnVar.J8;
                        float right = view22.getRight();
                        view23 = qnVar.J8;
                        float bottom = view23.getBottom();
                        f53 = qnVar.K8;
                        int i20 = (int) (f53 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i20, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = qnVar.J8;
                    float left2 = view12.getLeft();
                    view13 = qnVar.J8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = qnVar.J8;
                    kVar6 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = qnVar.J8;
                        float x10 = view16.getX();
                        view17 = qnVar.J8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = qnVar.J8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f66;
                        view19 = qnVar.J8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f66;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, qnVar.G8);
                    }
                    view15 = qnVar.J8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f50 = qnVar.K8;
                    if (f50 < 1.0f) {
                        paint23 = qnVar.F8;
                        f51 = qnVar.H8;
                        f52 = qnVar.K8;
                        paint23.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                        float measuredWidth6 = jmVar3.getMeasuredWidth();
                        float measuredHeight6 = jmVar3.getMeasuredHeight();
                        paint24 = qnVar.F8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    q5Var = qnVar.x0;
                    float y3 = ((q5Var.getY() + qnVar.s9) - qnVar.u9) - AndroidUtilities.dp(4.0f);
                    view6 = qnVar.J8;
                    if (view6 instanceof org.telegram.ui.Cells.u1) {
                        view11 = qnVar.J8;
                        groupedMessages = ((org.telegram.ui.Cells.u1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    q5Var2 = qnVar.x0;
                    int childCount = q5Var2.getChildCount();
                    int i21 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = jmVar3.B0;
                        f13 = 20.0f;
                        arrayList2 = jmVar3.A0;
                        arrayList3 = jmVar3.z0;
                        f14 = f10;
                        arrayList4 = jmVar3.C0;
                        if (i21 >= childCount) {
                            break;
                        }
                        q5Var3 = qnVar.x0;
                        View childAt = q5Var3.getChildAt(i21);
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
                        float f69 = y3;
                        view7 = qnVar.J8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != f14) {
                            if (z13 || u1Var == null || groupedMessages == null || (u1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i13 = childCount;
                                i14 = i21;
                                arrayList5 = arrayList;
                                u1Var2 = u1Var;
                                arrayList6 = arrayList4;
                                ijVar = ijVar2;
                                num4 = null;
                                f18 = 9.0f;
                                f19 = 1.0f;
                                z10 = z13;
                            } else {
                                f18 = 9.0f;
                                float E2 = u1Var3.E2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f70 = transitionParams.left + E2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f71 = transitionParams.top + transitionParams.offsetTop;
                                float f72 = transitionParams.right + E2 + transitionParams.offsetRight;
                                i13 = childCount;
                                float f73 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f46 = f71;
                                } else {
                                    f46 = transitionParams.cell.getTranslationY() + f71;
                                    f73 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f74 = f46;
                                float dp = f74 < (qnVar.s9 - ((float) qnVar.u9)) - ((float) AndroidUtilities.dp(20.0f)) ? (qnVar.s9 - qnVar.u9) - AndroidUtilities.dp(20.0f) : f74;
                                q5Var20 = qnVar.x0;
                                if (f73 > AndroidUtilities.dp(20.0f) + q5Var20.getMeasuredHeight()) {
                                    q5Var22 = qnVar.x0;
                                    f73 = AndroidUtilities.dp(20.0f) + q5Var22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i14 = i21;
                                int i22 = 0;
                                while (true) {
                                    if (i22 >= size2) {
                                        arrayList5 = arrayList;
                                        u1Var4 = u1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i23 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i22);
                                    arrayList5 = arrayList;
                                    if (qnVar.W5[messageObject.getDialogId() == qnVar.T5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        u1Var4 = u1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i22++;
                                        size2 = i23;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - ijVar2.e()) - qnVar.tc) - AndroidUtilities.dp(9.0f);
                                ib0Var6 = qnVar.I1;
                                if (ib0Var6 != null) {
                                    ib0Var9 = qnVar.I1;
                                    f47 = ib0Var9.d();
                                } else {
                                    f47 = f14;
                                }
                                float f75 = measuredHeight7 - f47;
                                ib0Var7 = qnVar.I1;
                                if (ib0Var7 != null) {
                                    ib0Var8 = qnVar.I1;
                                    f48 = ib0Var8.e();
                                } else {
                                    f48 = f14;
                                }
                                org.telegram.ui.Cells.u1 u1Var6 = u1Var4;
                                canvas3.clipRect(f14, f69 + f48, getMeasuredWidth(), f75);
                                q5Var21 = qnVar.x0;
                                canvas3.translate(f14, q5Var21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                ijVar = ijVar2;
                                num4 = null;
                                u1Var2 = u1Var6;
                                f19 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f70, (int) dp, (int) f72, (int) f73, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (u1Var2 != null && u1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            q5Var4 = qnVar.x0;
                            float left3 = q5Var4.getLeft();
                            q5Var5 = qnVar.x0;
                            float right2 = q5Var5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - ijVar.e()) - qnVar.tc) - qnVar.b9(org.telegram.ui.Components.m31.c)) - AndroidUtilities.dp(f18);
                            ib0Var3 = qnVar.I1;
                            if (ib0Var3 != null) {
                                ib0Var4 = qnVar.I1;
                                float max = Math.max(0.0f, ib0Var4.e());
                                ib0Var5 = qnVar.I1;
                                f21 = Math.max(0.0f, ib0Var5.d());
                                f20 = max;
                            } else {
                                f20 = 0.0f;
                                f21 = 0.0f;
                            }
                            fk fkVar = qnVar.Y;
                            if (fkVar != null && (nfVar = fkVar.m0) != null) {
                                f21 = Math.max(f21, nfVar.f ? 0.0f : Math.max(0.0f, nfVar.getMeasuredHeight() - (nfVar.c.getTranslationY() + nfVar.e)));
                            }
                            float f76 = f69 + f20;
                            float f77 = measuredHeight8 - f21;
                            if (u1Var2 == null || !u1Var2.getTransitionParams().w0) {
                                q5Var6 = qnVar.x0;
                                left3 = Math.max(left3, view8.getX() + q5Var6.getLeft());
                                q5Var7 = qnVar.x0;
                                f76 = Math.max(f76, view8.getY() + q5Var7.getY());
                                q5Var8 = qnVar.x0;
                                right2 = Math.min(right2, view8.getX() + q5Var8.getLeft() + view8.getMeasuredWidth());
                                q5Var9 = qnVar.x0;
                                f77 = Math.min(f77, view8.getY() + q5Var9.getY() + view8.getMeasuredHeight());
                            }
                            float f78 = f77;
                            float f79 = f76;
                            float f80 = right2;
                            float max2 = Math.max(left3, qnVar.W8());
                            if (f79 < f78) {
                                if (view8.getAlpha() != f19) {
                                    canvas4 = canvas;
                                    canvas4.saveLayerAlpha(max2, f79, f80, f78, (int) (view8.getAlpha() * 255.0f), 31);
                                    f45 = f79;
                                    f23 = f78;
                                    f25 = max2;
                                    f26 = f80;
                                } else {
                                    canvas4 = canvas;
                                    f45 = f79;
                                    f23 = f78;
                                    f25 = max2;
                                    f26 = f80;
                                    canvas4.save();
                                }
                                if (u1Var2 != null) {
                                    u1Var2.setInvalidatesParent(true);
                                    num12 = qnVar.M8;
                                    u1Var2.setScrimReaction(num12);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(true);
                                    num11 = qnVar.M8;
                                    w0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f25, f45, f26, f23);
                                q5Var18 = qnVar.x0;
                                float x11 = view8.getX() + q5Var18.getLeft();
                                q5Var19 = qnVar.x0;
                                canvas4.translate(x11, view8.getY() + q5Var19.getY());
                                if (u1Var2 != null && groupedMessages3 == null && u1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, u1Var2.getPaddingTop());
                                    u1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (u1Var2 == null || !u1Var2.U2()) {
                                    f22 = f45;
                                    f24 = 0.0f;
                                } else {
                                    canvas4.save();
                                    f22 = f45;
                                    f24 = 0.0f;
                                    canvas4.translate(0.0f, u1Var2.getPaddingTop());
                                    u1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (w0Var != null) {
                                    w0Var.B(canvas4);
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
                                f22 = f79;
                                f23 = f78;
                                view9 = view8;
                                f24 = 0.0f;
                                f25 = max2;
                                f26 = f80;
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
                                    int i24 = groupedMessagePosition2.flags;
                                    if ((i24 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(u1Var2);
                            }
                            num5 = qnVar.M8;
                            if (num5 == null || u1Var2 == null || groupedMessages3 != null) {
                                float f81 = f26;
                                float f82 = f25;
                                View view27 = view9;
                                f27 = f24;
                                float f83 = f23;
                                float f84 = f22;
                                f28 = f69;
                                i15 = 1;
                                num6 = qnVar.M8;
                                if (num6 != null && w0Var != null) {
                                    paint13 = qnVar.D8;
                                    if (paint13 != null) {
                                        matrix7 = qnVar.E8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / qnVar.B8.getWidth();
                                        matrix8 = qnVar.E8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = qnVar.C8;
                                        matrix9 = qnVar.E8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = qnVar.D8;
                                        paint16.setAlpha((int) (qnVar.L8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = qnVar.D8;
                                        w0Var2 = w0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint14 = qnVar.F8;
                                        f29 = qnVar.H8;
                                        f30 = qnVar.K8;
                                        paint14.setAlpha((int) (f30 * f29 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = qnVar.F8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f79 < f78) {
                                        f31 = qnVar.H8;
                                        f32 = qnVar.K8;
                                        float f85 = (f32 * f31) / f67;
                                        float alpha = view27.getAlpha();
                                        f33 = qnVar.K8;
                                        float f86 = f33 * alpha;
                                        if (f86 < f19) {
                                            canvas.saveLayerAlpha(f82, f84, f81, f83, (int) (f86 * 255.0f), 31);
                                            f83 = f83;
                                            f34 = f84;
                                            canvas3 = canvas;
                                        } else {
                                            canvas3 = canvas;
                                            f34 = f84;
                                            canvas3.save();
                                        }
                                        canvas3.clipRect(f82, f34, f81, f83);
                                        q5Var10 = qnVar.x0;
                                        float x12 = view27.getX() + q5Var10.getLeft();
                                        q5Var11 = qnVar.x0;
                                        canvas3.translate(x12, view27.getY() + q5Var11.getY() + view27.getPaddingTop());
                                        num7 = qnVar.M8;
                                        boolean z14 = qnVar.I8;
                                        ah.j1 j1Var = w0Var2.E0;
                                        if (!j1Var.b) {
                                            org.telegram.ui.ActionBar.d6 d6Var = w0Var2.g1;
                                            if (d6Var != null) {
                                                d6Var.d(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.h6.q(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            }
                                            j1Var.D = f85;
                                            j1Var.E = z14;
                                            j1Var.d(canvas3, w0Var2.r2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        q5Var12 = qnVar.x0;
                                        float x13 = view27.getX() + q5Var12.getLeft();
                                        q5Var13 = qnVar.x0;
                                        canvas3.translate(x13, view27.getY() + q5Var13.getY() + view27.getPaddingTop());
                                        int i25 = qnVar.N8;
                                        num8 = qnVar.M8;
                                        w0Var2.E(this, canvas3, i25, num8, f85);
                                        jmVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = qnVar.D8;
                                if (paint18 != null) {
                                    matrix10 = qnVar.E8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / qnVar.B8.getWidth();
                                    matrix11 = qnVar.E8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = qnVar.C8;
                                    matrix12 = qnVar.E8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = qnVar.D8;
                                    paint21.setAlpha((int) (qnVar.L8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = qnVar.D8;
                                    f35 = f26;
                                    f36 = f25;
                                    view10 = view9;
                                    i16 = 1;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f35 = f26;
                                    f36 = f25;
                                    view10 = view9;
                                    i16 = 1;
                                    paint19 = qnVar.F8;
                                    f37 = qnVar.H8;
                                    f38 = qnVar.K8;
                                    paint19.setAlpha((int) (f38 * f37 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = qnVar.F8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f79 < f78) {
                                    f39 = qnVar.H8;
                                    f40 = qnVar.K8;
                                    float f87 = (f40 * f39) / f67;
                                    float alpha2 = view10.getAlpha();
                                    f41 = qnVar.K8;
                                    float f88 = f41 * alpha2;
                                    if (f88 < f19) {
                                        f42 = f24;
                                        canvas5 = canvas;
                                        f43 = f23;
                                        float f89 = f22;
                                        canvas5.saveLayerAlpha(f36, f89, f35, f43, (int) (f88 * 255.0f), 31);
                                        f44 = f89;
                                    } else {
                                        canvas5 = canvas;
                                        f42 = f24;
                                        f43 = f23;
                                        f44 = f22;
                                        canvas5.save();
                                    }
                                    canvas5.clipRect(f36, f44, f35, f43);
                                    q5Var14 = qnVar.x0;
                                    float x14 = view10.getX() + q5Var14.getLeft();
                                    q5Var15 = qnVar.x0;
                                    canvas5.translate(x14, view10.getY() + q5Var15.getY() + view10.getPaddingTop());
                                    num9 = qnVar.M8;
                                    u1Var2.h2(canvas5, num9, f87, qnVar.I8);
                                    canvas5.restore();
                                    canvas5.save();
                                    q5Var16 = qnVar.x0;
                                    float x15 = view10.getX() + q5Var16.getLeft();
                                    q5Var17 = qnVar.x0;
                                    canvas5.translate(x15, view10.getY() + q5Var17.getY() + view10.getPaddingTop());
                                    int i26 = qnVar.N8;
                                    num10 = qnVar.M8;
                                    i15 = i16;
                                    f28 = f69;
                                    f27 = f42;
                                    u1Var2.i2(this, canvas5, i26, num10, f87);
                                    canvas.restore();
                                } else {
                                    i15 = i16;
                                    f28 = f69;
                                    f27 = f24;
                                }
                            }
                            jmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            i15 = 1;
                            f19 = 1.0f;
                            jmVar2 = this;
                            i13 = childCount;
                            i14 = i21;
                            ijVar = ijVar2;
                            f27 = f14;
                            f28 = f69;
                            groupedMessages3 = groupedMessages;
                        }
                        i21 = i14 + 1;
                        jmVar3 = jmVar2;
                        y3 = f28;
                        groupedMessages = groupedMessages3;
                        f10 = f27;
                        ijVar2 = ijVar;
                        i11 = i15;
                        childCount = i13;
                        f7 = f19;
                    }
                    f15 = f7;
                    f12 = f14;
                    float f90 = y3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    int i27 = i11;
                    jmVar = jmVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i28 = 0; i28 < size3; i28++) {
                            jmVar.a0(canvas3, f90, (org.telegram.ui.Cells.u1) arrayList3.get(i28), 0);
                        }
                        i12 = 0;
                        arrayList3.clear();
                    } else {
                        i12 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i29 = i12; i29 < size4; i29++) {
                            jmVar.a0(canvas3, f90, (org.telegram.ui.Cells.u1) arrayList2.get(i29), i27);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i30 = i12; i30 < size5; i30++) {
                            org.telegram.ui.Cells.u1 u1Var7 = (org.telegram.ui.Cells.u1) arrayList.get(i30);
                            if (u1Var7.getCurrentPosition() != null || u1Var7.getTransitionParams().w0) {
                                jmVar.a0(canvas3, f90, u1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i31 = i12; i31 < size6; i31++) {
                            org.telegram.ui.Cells.u1 u1Var8 = (org.telegram.ui.Cells.u1) arrayList4.get(i31);
                            if (u1Var8.getCurrentPosition() != null || u1Var8.getTransitionParams().w0) {
                                jmVar.a0(canvas3, f90, u1Var8, 3);
                            }
                        }
                    }
                    num3 = qnVar.M8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = qnVar.D8;
                        if (paint8 != null) {
                            matrix4 = qnVar.E8;
                            matrix4.reset();
                            float measuredWidth13 = jmVar.getMeasuredWidth() / qnVar.B8.getWidth();
                            matrix5 = qnVar.E8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = qnVar.C8;
                            matrix6 = qnVar.E8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = qnVar.D8;
                            paint11.setAlpha((int) (qnVar.L8 * 255.0f));
                            float measuredWidth14 = jmVar.getMeasuredWidth();
                            float measuredHeight13 = jmVar.getMeasuredHeight();
                            paint12 = qnVar.D8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = qnVar.F8;
                            f16 = qnVar.H8;
                            f17 = qnVar.K8;
                            paint9.setAlpha((int) (f17 * f16 * 255.0f));
                            float measuredWidth15 = jmVar.getMeasuredWidth();
                            float measuredHeight14 = jmVar.getMeasuredHeight();
                            paint10 = qnVar.F8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i32 = i12; i32 < size7; i32++) {
                            org.telegram.ui.Cells.u1 u1Var9 = (org.telegram.ui.Cells.u1) arrayList4.get(i32);
                            if (u1Var9.getCurrentPosition() != null || u1Var9.getTransitionParams().w0) {
                                jmVar.a0(canvas3, f90, u1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = qnVar.M8;
                    if (num13 == null) {
                        f54 = qnVar.K8;
                        if (f54 < f15) {
                            paint25 = qnVar.D8;
                            if (paint25 != null) {
                                matrix13 = qnVar.E8;
                                matrix13.reset();
                                float measuredWidth16 = jmVar.getMeasuredWidth() / qnVar.B8.getWidth();
                                matrix14 = qnVar.E8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = qnVar.C8;
                                matrix15 = qnVar.E8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = qnVar.D8;
                                paint28.setAlpha((int) (qnVar.L8 * 255.0f));
                                float measuredWidth17 = jmVar.getMeasuredWidth();
                                float measuredHeight15 = jmVar.getMeasuredHeight();
                                paint29 = qnVar.D8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = qnVar.F8;
                                f55 = qnVar.H8;
                                f56 = qnVar.K8;
                                paint26.setAlpha((int) ((f15 - f56) * f55 * 255.0f));
                                float measuredWidth18 = jmVar.getMeasuredWidth();
                                float measuredHeight16 = jmVar.getMeasuredHeight();
                                paint27 = qnVar.F8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            jmVar = jmVar3;
            f15 = 1.0f;
            f12 = 0.0f;
            f13 = 20.0f;
            num13 = qnVar.M8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            jmVar = jmVar3;
            f12 = 0.0f;
            f13 = 20.0f;
        }
        view3 = qnVar.J8;
        if (view3 != null || ((ArrayList) qnVar.M9.c).size() > 0) {
            ib0Var = qnVar.I1;
            if (ib0Var != null) {
                ib0Var2 = qnVar.I1;
            }
            super.drawChild(canvas3, qnVar.j1, SystemClock.uptimeMillis());
            wj wjVar = qnVar.X2;
            if (wjVar != null && wjVar.getTag() != null) {
                super.drawChild(canvas3, qnVar.X2, SystemClock.uptimeMillis());
            }
            vj vjVar = qnVar.Y2;
            if (vjVar != null && vjVar.getTag() != null) {
                super.drawChild(canvas3, qnVar.Y2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.z00 z00Var = qnVar.m9;
            if (z00Var != null) {
                super.drawChild(canvas3, z00Var, SystemClock.uptimeMillis());
            }
            vh.i iVar = qnVar.X9;
            if (iVar != null) {
                super.drawChild(canvas3, iVar, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.r40 r40Var3 = qnVar.e2;
            if (r40Var3 != null) {
                super.drawChild(canvas3, r40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = qnVar.y3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.y3, SystemClock.uptimeMillis());
            }
            bl blVar = qnVar.z3;
            if (blVar != null && blVar.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.z3, SystemClock.uptimeMillis());
            }
            ei.x3 x3Var = qnVar.x1;
            if (x3Var != null && x3Var.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.x1, SystemClock.uptimeMillis());
            }
            pl plVar = qnVar.B1;
            if (plVar != null && plVar.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.B1, SystemClock.uptimeMillis());
            }
            ei.x3 x3Var2 = qnVar.z1;
            if (x3Var2 != null && x3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, qnVar.z1, SystemClock.uptimeMillis());
            }
            fk fkVar2 = qnVar.Y;
            if (fkVar2 != null && fkVar2.L != null) {
                canvas3.save();
                canvas3.translate(qnVar.Y.L.getX() + qnVar.Y.getX(), qnVar.Y.L.getY() + qnVar.Y.getY());
                qnVar.Y.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (qnVar.pa > 0 && jmVar.f < AndroidUtilities.dp(f13)) {
            int themedColor = qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6);
            if (jmVar.D0 == null) {
                jmVar.D0 = new Paint();
            }
            if (jmVar.E0 != themedColor) {
                Paint paint32 = jmVar.D0;
                jmVar.E0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, jmVar.getMeasuredHeight() - qnVar.pa, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), jmVar.D0);
            canvas3 = canvas6;
        }
        lp lpVar = qnVar.P9;
        if (lpVar != null && lpVar.e()) {
            int inputBubbleTop = (int) qnVar.S.getInputBubbleTop();
            int inputBubbleBottom = (int) qnVar.S.getInputBubbleBottom();
            qn qnVar2 = qnVar.T9;
            int i33 = inputBubbleTop - ((int) (qnVar.U9 * (qnVar2 == null ? f12 : qnVar2.O9)));
            lp lpVar2 = qnVar.P9;
            jmVar.getMeasuredWidth();
            lpVar2.b(canvas3, i33, inputBubbleBottom);
        }
        if (qnVar.T9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, jmVar.getMeasuredWidth(), jmVar.getMeasuredHeight(), (int) (qnVar.U9 * 255.0f), 31);
            canvas3 = canvas;
            qnVar.T9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        qnVar.xa.e(canvas3);
        if (i18 >= 0) {
            canvas3.restore();
        }
        if (qnVar.ka) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (qnVar.la * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        al alVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (alVar = this.J0.Fa) == null || !alVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        alVar.a(true);
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
        ok okVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.J0;
        ih.e eVar = qnVar.N3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || qnVar.isInBubbleMode()) ? (qnVar.Y.getEmojiView() != null ? qnVar.Y.getEmojiView() : qnVar.Y).getY() : qnVar.Y.getY();
        View view = qnVar.J8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        }
        fk fkVar = qnVar.Y;
        if (fkVar == null || !fkVar.z3 || motionEvent.getY() >= y3) {
            qnVar.j9 = motionEvent.getY();
            org.telegram.ui.Cells.z9 n10 = qnVar.c9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!qnVar.c9.x() || !qnVar.c9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                ei.h1 h1Var = qnVar.q1;
                if (h1Var != null) {
                    if (qnVar.u3 != null) {
                        z10 = h1Var.A(motionEvent);
                        if (qnVar.q1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !qnVar.c9.x() || (motionEvent.getY() >= qnVar.x0.getTop() && motionEvent.getY() <= qnVar.x0.getBottom())) {
                            okVar = qnVar.wa;
                            if (!okVar.n) {
                                return okVar.g(motionEvent);
                            }
                            c2.b bVar = c2.b.e;
                            if (bVar == null || !bVar.a) {
                                if (qnVar.isInPreviewMode() && qnVar.J9) {
                                    if (motionEvent.getAction() == 0) {
                                        int i10 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (qnVar.j1 != null) {
                                            int i11 = 0;
                                            for (int i12 = 3; i11 < i12; i12 = 3) {
                                                androidx.biometric.e eVar2 = qnVar.j1.e[i11 == 0 ? 1 : i11 == 1 ? i10 : i12];
                                                if (eVar2 != null) {
                                                    ((jh.b) eVar2.b).getLocationInWindow(iArr2);
                                                    Rect rect = AndroidUtilities.rectTmp2;
                                                    int i13 = iArr2[0] - iArr[0];
                                                    rect.set(i13, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i13, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
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
                                        hj hjVar = qnVar.a1;
                                        if (hjVar != null) {
                                            hjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i14 = iArr2[0] - iArr[0];
                                            rect2.set(i14, iArr2[1] - iArr[1], qnVar.a1.getMeasuredWidth() + i14, qnVar.a1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.F0 = motionEvent.getX();
                                                    this.G0 = motionEvent.getY();
                                                    this.H0 = SystemClock.elapsedRealtime();
                                                    this.I0 = z12;
                                                    hj hjVar2 = qnVar.a1;
                                                    if (hjVar2 != null) {
                                                        hjVar2.h0.c(z12);
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
                                        hj hjVar3 = qnVar.a1;
                                        if (hjVar3 != null) {
                                            hjVar3.h0.c(false);
                                        }
                                        if (this.I0 || (v7.f7.a(this.F0, this.G0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.H0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.I0) {
                                                d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                                                qnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) d5Var2).P(ProfileActivity.m4(qnVar.T5));
                                            } else {
                                                d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                                                ((ActionBarLayout) d5Var).r();
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
                                x4 x4Var = (x4) c2.b.m().d;
                                if (x4Var != null) {
                                    x4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (qnVar.c9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n10.getX(), n10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = h1Var.e;
                        if (h1Var.H) {
                            h1Var.I = true;
                            h1Var.H = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(h1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            h1Var.d = 0;
                            h1Var.c = 1.0f;
                            org.telegram.ui.Components.t81 t81Var = h1Var.M;
                            if (t81Var != null) {
                                t81Var.e(1.0f, 0, h1Var.b);
                            }
                            h1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                okVar = qnVar.wa;
                if (!okVar.n) {
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
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ei.g6 g6Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        ik ikVar;
        MessageObject messageObject;
        org.telegram.ui.Components.r60 r60Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        qn qnVar = this.J0;
        boolean z12 = false;
        if ((qnVar.J8 == null && ((ArrayList) qnVar.M9.c).size() <= 0) || (view != qnVar.j1 && view != qnVar.X2 && view != qnVar.Y2 && view != qnVar.m9 && view != qnVar.X9 && view != qnVar.e2 && view != null && view != qnVar.y3 && view != qnVar.z3)) {
            if ((view != qnVar.y3 || !PhotoViewer.t1().R1()) && (!qnVar.S9 || view != qnVar.x0)) {
                if (qnVar.ka) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                }
                if (view != qnVar.b3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (g6Var = qnVar.y2) != null && g6Var.a() && qnVar.y2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == qnVar.t8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    } else {
                        if (view != qnVar.x0) {
                            if (view != qnVar.S) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == qnVar.t8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-qnVar.N9) - (qnVar.U9 != 0.0f ? (qnVar.x0.getMeasuredHeight() - qnVar.N9) * qnVar.U9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.h6.k3 != null && qnVar.v8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(qnVar.t8.getScaleX(), qnVar.t8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.h6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.h6.k3.setBounds(x10, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(qnVar.H9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(qnVar.H9()) + y3);
                                            org.telegram.ui.ActionBar.h6.k3.draw(canvas);
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
                                if (view == qnVar.S && (r60Var = qnVar.b3) != null && r60Var.getVisibility() == 0) {
                                    super.drawChild(canvas, qnVar.b3, j10);
                                }
                                z12 = super.drawChild(canvas, view, j10);
                                if (z11 && view == qnVar.x0 && playingMessageObject.type != 5 && (ikVar = qnVar.t8) != null && ikVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-qnVar.N9) - (qnVar.U9 != 0.0f ? (qnVar.x0.getMeasuredHeight() - qnVar.N9) * qnVar.U9 : 0.0f)) + qnVar.O9);
                                    super.drawChild(canvas, qnVar.t8, j10);
                                    if (qnVar.u8 != null) {
                                        canvas.save();
                                        canvas.translate(qnVar.u8.getX(), qnVar.x0.getY() + qnVar.u8.getTop());
                                        if (z10) {
                                            qnVar.u8.g2(canvas);
                                            invalidate();
                                            qnVar.u8.invalidate();
                                        } else {
                                            qnVar.u8.Y1(canvas);
                                            org.telegram.ui.Cells.u1 u1Var = qnVar.u8;
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
                        if (view == qnVar.t8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.kw0
    public float getBottomOffset() {
        return this.J0.x0.getBottom();
    }

    public qn getChatActivity() {
        return this.J0;
    }

    @Override // org.telegram.ui.Components.kw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.kw0
    public int getKeyboardHeight() {
        if (this.J0.Pa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.kw0
    public float getListTranslationY() {
        return this.J0.x0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.kw0
    public Drawable getNewDrawable() {
        Drawable e = this.J0.ea.e();
        return e != null ? e : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.kw0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.ea.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.kw0
    public int getScrollOffset() {
        return this.J0.x0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.kw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        qn qnVar = this.J0;
        if (qnVar.Pa) {
            this.H.b = qnVar.X0;
        } else {
            d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                if (((ActionBarLayout) d5Var2).b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
                    o1Var.b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        qnVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == qnVar.T5)) {
            MediaController.getInstance().setTextureView(qnVar.Q7(false), qnVar.v8, qnVar.t8, true);
        }
        lp lpVar = qnVar.P9;
        if (lpVar != null) {
            lpVar.f();
        }
        qnVar.xa.i();
    }

    @Override // org.telegram.ui.Components.kw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        qn qnVar = this.J0;
        lp lpVar = qnVar.P9;
        if (lpVar != null) {
            NotificationCenter.getInstance(lpVar.e0).removeObserver(lpVar, NotificationCenter.updateInterfaces);
            lpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.r5 r5Var = lpVar.k0;
            if (r5Var != null && (view = lpVar.a0) != null) {
                r5Var.o(view);
            }
            lpVar.Q = 0.0f;
            lpVar.P = 0L;
            qnVar.P9 = null;
        }
        qnVar.xa.j();
        AndroidUtilities.runOnUIThread(new ah.j(24));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        qn qnVar;
        ei.g6 g6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (g6Var = (qnVar = this.J0).y2) == null || !g6Var.a() || qnVar.y2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.Dc) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.kw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int C;
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
        qn qnVar = this.J0;
        ij ijVar = qnVar.v;
        int i22 = (measuredWidth - qnVar.Ua) - qnVar.Va;
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
                    C = i2.e.C(i22, measuredWidth2, 2, qnVar.Ua) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = qnVar.Ua + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
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
                            if (childAt != qnVar.M9 && childAt != qnVar.X9 && childAt != qnVar.S && !(childAt instanceof org.telegram.ui.Components.r40) && !(childAt instanceof org.telegram.ui.Components.aq)) {
                                if (childAt instanceof org.telegram.ui.Cells.z9) {
                                    i20 = qnVar.Aa;
                                } else if (childAt == qnVar.Q0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (qnVar.Y.s0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.n2) qnVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = qnVar.Y.getBottom();
                                        }
                                    }
                                    i18 = qnVar.Y.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    fk fkVar = qnVar.Y;
                                    if (fkVar != null && (childAt == fkVar.O1 || childAt == fkVar.N1)) {
                                        i18 = org.telegram.messenger.kk.y(7.0f, ijVar.e(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == qnVar.w2) {
                                        i18 = org.telegram.messenger.kk.y(7.0f, ijVar.e(), i18);
                                    } else if (fkVar == null || childAt != fkVar.e1) {
                                        if (childAt == qnVar.e2 || childAt == qnVar.s2 || childAt == qnVar.f2) {
                                            i19 = this.w0;
                                        } else if (childAt == qnVar.x0 || childAt == qnVar.v0 || childAt == qnVar.X2 || childAt == qnVar.Y2 || childAt == qnVar.Z2) {
                                            i20 = qnVar.Aa;
                                        } else if (childAt != qnVar.P) {
                                            kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (qnVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == qnVar.t8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != qnVar.b3 && childAt != qnVar.c3 && childAt != qnVar.u0) {
                                                if (childAt instanceof org.telegram.ui.Components.oc0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != qnVar.T) {
                                                    if (childAt != qnVar.N3) {
                                                    }
                                                }
                                            }
                                        } else if (fkVar.x0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.kk.y(9.0f, ijVar.e(), i18);
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
                    C = (measuredWidth - qnVar.Va) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = C - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        vj vjVar = qnVar.Y2;
        if (vjVar != null) {
            vjVar.setBackgroundHeight(getMeasuredHeight());
        }
        qnVar.t9();
        qnVar.w9();
        qnVar.Qc(false, false);
        S();
        qnVar.w7();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0548  */
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
        qn qnVar = this.J0;
        ij ijVar = qnVar.v;
        zf.b0 b0Var = qnVar.Ec;
        ViewParent parent = b0Var.getParent();
        if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(b0Var)) >= 0 && indexOfChild != viewGroup.getChildCount() - 1) {
            viewGroup.bringChildToFront(b0Var);
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - qnVar.Ua) - qnVar.Va;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        gh.a aVar = qnVar.L.a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).c(i15, size2);
        }
        int i16 = 0;
        if (this.y0 != i15) {
            qnVar.F4 = false;
            this.y0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
            if (z13 || (user = qnVar.f) == null || !user.self) {
                qnVar.K9 = false;
            } else {
                org.telegram.ui.ActionBar.j5 titleTextView = qnVar.a1.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    qnVar.K9 = !qnVar.L9;
                } else {
                    qnVar.K9 = false;
                }
            }
            if (qnVar.K9 || qnVar.L9 || UserObject.isBotForumWithEditableTopics(qnVar.f)) {
                hj hjVar = qnVar.a1;
                if (hjVar != null && hjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) qnVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(qnVar.R3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                hj hjVar2 = qnVar.a1;
                if (hjVar2 != null && hjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) qnVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (qnVar.K9) {
                kVar8 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                if (!kVar8.n0 && (u0Var = qnVar.m0) != null) {
                    u0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var2 = qnVar.h0;
                if (u0Var2 != null) {
                    u0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.u0 u0Var3 = qnVar.h0;
                if (u0Var3 != null) {
                    u0Var3.K(40);
                }
                org.telegram.ui.ActionBar.u0 u0Var4 = qnVar.m0;
                if (u0Var4 != null) {
                    u0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            if (!kVar7.n0 && (xVar = qnVar.n0) != null) {
                xVar.f((!qnVar.L9 || qnVar.K9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.u0 u0Var5 = qnVar.h0;
            if (u0Var5 != null) {
                TLRPC.UserFull userFull = qnVar.a8;
                if (qnVar.L9) {
                    u0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    u0Var5.K(32);
                }
            }
            qnVar.F4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + qnVar.oa >= AndroidUtilities.dp(20.0f);
        if (this.x0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (qnVar.pa > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            qnVar.oa = qnVar.pa;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            qnVar.oa = qnVar.Y.r0() ? qnVar.Y.getEmojiPadding() : 0;
        } else {
            qnVar.oa = 0;
        }
        setEmojiKeyboardHeight(qnVar.oa);
        boolean z15 = this.f + qnVar.oa >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i17 = 0; i17 < qnVar.x0.getChildCount(); i17++) {
                View childAt = qnVar.x0.getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        qnVar.x0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            qnVar.z0.i1(R, (int) (((((qnVar.x0.getMeasuredHeight() - qnVar.s9) - qnVar.Ba) + ((this.f + qnVar.oa) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(qnVar.H9()))) / 2.0f), false);
                            qnVar.A0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i18 = paddingTop;
                            measureChildWithMargins(qnVar.Y, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
                            if (!z10 || qnVar.Pa) {
                                this.w0 = 0;
                            } else {
                                this.w0 = qnVar.Y.getMeasuredHeight();
                            }
                            qnVar.Aa = 0;
                            qnVar.Ba = 0;
                            if (SharedConfig.chatBlurEnabled() && !qnVar.Pa && qnVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i19 = qnVar.G;
                                qnVar.Aa = i19;
                                qnVar.Ba = i19;
                            }
                            i12 = 0;
                            while (i12 < childCount) {
                                int i20 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != qnVar.Y) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                                        if (childAt2 != kVar4) {
                                            if (b0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == qnVar.x0 || childAt2 == qnVar.v0 || (childAt2 instanceof org.telegram.ui.Cells.z9)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), qnVar.Aa + size2 + qnVar.Ba), TLObject.FLAG_30));
                                                } else if (childAt2 == qnVar.P) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int dp = AndroidUtilities.dp(10.0f);
                                                    int i21 = i18 - this.w0;
                                                    z12 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((qnVar.Y.x0() ? 48 : i16) + 2) + (i21 - (z12 ? AndroidUtilities.statusBarHeight : i16))), TLObject.FLAG_30));
                                                } else if (childAt2 == qnVar.b3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    qnVar.b3.setInternalPadding(AndroidUtilities.dp(12.0f) + ijVar.e() + ((int) qnVar.uc));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == qnVar.c3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - ijVar.e()) - ((int) qnVar.uc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == qnVar.Q0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                                                } else if (qnVar.Y.s0(childAt2)) {
                                                    org.telegram.ui.Components.ag agVar = qnVar.Y.H1;
                                                    if (childAt2 == agVar && agVar != null) {
                                                        i20 = agVar.getKeyboardHeight();
                                                    }
                                                    z11 = ((org.telegram.ui.ActionBar.n2) qnVar).inBubbleMode;
                                                    if (z11) {
                                                        int paddingTop2 = getPaddingTop() + (i18 - this.w0) + measuredHeight;
                                                        if (i20 < 0) {
                                                            i20 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                    } else if (AndroidUtilities.isInMultiwindow) {
                                                        int paddingTop3 = getPaddingTop() + (((i18 - this.w0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                        if (i20 < 0) {
                                                            i20 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                    }
                                                } else {
                                                    xj xjVar = qnVar.I1;
                                                    if (childAt2 == xjVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xjVar.getLayoutParams();
                                                        hg.j1 adapter = qnVar.I1.getAdapter();
                                                        if (adapter.w0 == null || adapter.h0) {
                                                            qnVar.I1.setIgnoreLayout(true);
                                                            layoutParams.height = i18;
                                                            layoutParams.topMargin = 0;
                                                            qnVar.I1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == qnVar.c9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                        int i22 = i18 + qnVar.Aa;
                                                        if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || qnVar.Pa) {
                                                            km kmVar = qnVar.c9;
                                                            kmVar.d0 = 0;
                                                            kmVar.w();
                                                        } else {
                                                            i22 += keyboardHeight;
                                                            km kmVar2 = qnVar.c9;
                                                            kmVar2.d0 = keyboardHeight;
                                                            kmVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.oc0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                    } else if (childAt2 == qnVar.R1) {
                                                        kVar5 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                                                        if (kVar5.getVisibility() == 0) {
                                                            kVar6 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                                                            i14 = size2 - kVar6.getMeasuredHeight();
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
                            if (qnVar.E4) {
                                qnVar.F4 = true;
                                qnVar.t9();
                                qnVar.w9();
                                qnVar.E4 = false;
                                nj njVar = qnVar.x0;
                                njVar.measure(View.MeasureSpec.makeMeasureSpec(njVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(qnVar.x0.getMeasuredHeight(), TLObject.FLAG_30));
                                qnVar.F4 = false;
                            }
                            i13 = qnVar.x4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ah.g(this, i13, 28));
                                qnVar.x4 = -1;
                            }
                            qcVar = org.telegram.ui.Components.qc.w;
                            if (qcVar != null && qnVar.Zb != null) {
                                qcVar.l();
                            }
                            qnVar.V6();
                            this.x0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.af afVar = qnVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(afVar);
        afVar.run();
        childCount = getChildCount();
        int i182 = paddingTop;
        measureChildWithMargins(qnVar.Y, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        if (z10) {
        }
        this.w0 = 0;
        qnVar.Aa = 0;
        qnVar.Ba = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i192 = qnVar.G;
            qnVar.Aa = i192;
            qnVar.Ba = i192;
        }
        i12 = 0;
        while (i12 < childCount) {
        }
        if (qnVar.E4) {
        }
        i13 = qnVar.x4;
        if (i13 != -1) {
        }
        qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar != null) {
            qcVar.l();
        }
        qnVar.V6();
        this.x0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        qn qnVar = this.J0;
        hh.d.c(qnVar.z8, qnVar.fragmentView);
        qnVar.A8.d();
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
        qn qnVar = this.J0;
        qnVar.v9 = i11;
        qnVar.t9();
        qnVar.w9();
    }

    @Override // org.telegram.ui.Components.kw0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.kw0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.kw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
