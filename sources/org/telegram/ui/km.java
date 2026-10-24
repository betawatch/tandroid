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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.Components.ow0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final /* synthetic */ sn J0;
    public int w0;
    public int x0;
    public int y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(sn snVar, Context context, org.telegram.ui.ActionBar.h5 h5Var) {
        super(context, h5Var);
        this.J0 = snVar;
        this.w0 = 0;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new jm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.J0;
        snVar.j1.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        kVar.setTranslationY(0.0f);
        wk wkVar = snVar.nb;
        if (wkVar != null) {
            wkVar.setTranslationY(snVar.A1 != null ? r3.getCurrentHeight() : 0);
        }
        ei.x3 x3Var = snVar.I1;
        if (x3Var != null) {
            x3Var.setTranslationY(0.0f);
        }
        ei.x3 x3Var2 = snVar.H1;
        if (x3Var2 != null) {
            x3Var2.setTranslationY(0.0f);
        }
        snVar.c1.setTranslationY(0.0f);
        snVar.P.setTranslationY(0.0f);
        snVar.I9 = 0.0f;
        snVar.J9 = 0.0f;
        snVar.j1.setBackgroundTranslation(0);
        org.telegram.ui.Components.s60 s60Var = snVar.n3;
        if (s60Var != null) {
            s60Var.e(0.0f);
        }
        ei.g6 g6Var = snVar.K2;
        if (g6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.b;
            faVar.u = 0.0f;
            faVar.d.invalidate();
        }
        snVar.setFragmentPanTranslationOffset(0);
        snVar.t9();
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.ow0
    public final int Q() {
        ci.a3 a3Var = this.J0.V1;
        if (a3Var == null || !a3Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.ow0
    public final void T(Drawable drawable) {
        sn snVar = this.J0;
        ih.m mVar = snVar.W;
        if (drawable instanceof org.telegram.ui.Components.yc0) {
            ((org.telegram.ui.Components.yc0) drawable).p();
        }
        gh.a c10 = mVar.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(mVar.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(mVar.a(c10));
        snVar.Qb = computePerceivedBrightness <= 0.721f;
        snVar.Rb = computePerceivedBrightness2 <= 0.9f;
        snVar.L.a = c10;
        gh.d dVar = snVar.H;
        if (dVar != null) {
            dVar.f();
        }
        gh.d dVar2 = snVar.I;
        if (dVar2 != null) {
            dVar2.f();
        }
        kh.f fVar = snVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        ih.f fVar2 = snVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        snVar.s9();
        snVar.checkSystemBarColors();
    }

    public final void Z(Canvas canvas, float f7, org.telegram.ui.Cells.t1 t1Var, int i10) {
        int save = canvas.save();
        sn snVar = this.J0;
        float x10 = t1Var.getX() + snVar.x0.getLeft();
        float y3 = t1Var.getY() + snVar.x0.getY() + t1Var.getPaddingTop();
        float alpha = t1Var.c() ? t1Var.getAlpha() : 1.0f;
        canvas.clipRect(snVar.x0.getLeft(), f7, snVar.x0.getRight(), ((((snVar.x0.getY() + snVar.x0.getMeasuredHeight()) - snVar.Na) - snVar.v.e()) - snVar.Gc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.l2(alpha, canvas, true);
        } else if (i10 == 1) {
            t1Var.V1(canvas, alpha);
        } else if (i10 == 2) {
            t1Var.H1(alpha, canvas, t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0;
            t1Var.M1(canvas, alpha);
            if (!z10) {
                t1Var.c2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && snVar.Y8 != null)) {
            float f10 = (snVar.T8 * snVar.W8) / 0.2f;
            canvas.save();
            t1Var.g2(canvas, snVar.Y8, f10, snVar.U8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            t1Var.h2(this, canvas, snVar.Z8, snVar.Y8, f10);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean a0(View view) {
        if (view == this.L) {
            return true;
        }
        sn snVar = this.J0;
        return view == snVar.K2 || view == snVar.C1 || view == snVar.y9 || view == snVar.X || view == snVar.W3;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        sn snVar = this.J0;
        bh.b bVar = snVar.J;
        gk gkVar = snVar.Y;
        if (gkVar == null || view != gkVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            kh.f fVar = snVar.X;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        gk gkVar2 = snVar.Y;
        if (gkVar2 != null && view == gkVar2.m0) {
            gi.x xVar = (gi.x) view;
            xVar.setBackgroundDrawable(bVar.c(xVar.c, snVar.x, false));
        }
        gk gkVar3 = snVar.Y;
        if (gkVar3 == null || view != (sgVar = gkVar3.O1)) {
            return;
        }
        sgVar.setBlurredBackgroundFactory(bVar);
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
    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
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
        km kmVar;
        float f12;
        float f13;
        View view3;
        org.telegram.ui.Components.jb0 jb0Var;
        org.telegram.ui.Components.jb0 jb0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        ci.p5 p5Var;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        ci.p5 p5Var2;
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
        ci.p5 p5Var3;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i13;
        int i14;
        ArrayList arrayList5;
        org.telegram.ui.Cells.t1 t1Var2;
        ArrayList arrayList6;
        ij ijVar;
        Integer num4;
        float f18;
        float f19;
        boolean z10;
        ci.p5 p5Var4;
        ci.p5 p5Var5;
        org.telegram.ui.Components.jb0 jb0Var3;
        float f20;
        float f21;
        ci.p5 p5Var6;
        ci.p5 p5Var7;
        ci.p5 p5Var8;
        ci.p5 p5Var9;
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
        org.telegram.ui.Cells.v0 v0Var2;
        Paint paint14;
        float f29;
        float f30;
        Paint paint15;
        float f31;
        float f32;
        float f33;
        float f34;
        ci.p5 p5Var10;
        ci.p5 p5Var11;
        Integer num7;
        ci.p5 p5Var12;
        ci.p5 p5Var13;
        Integer num8;
        km kmVar2;
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
        ci.p5 p5Var14;
        ci.p5 p5Var15;
        Integer num9;
        ci.p5 p5Var16;
        ci.p5 p5Var17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f45;
        Integer num11;
        ci.p5 p5Var18;
        ci.p5 p5Var19;
        Integer num12;
        org.telegram.ui.Components.nf nfVar;
        org.telegram.ui.Components.jb0 jb0Var4;
        org.telegram.ui.Components.jb0 jb0Var5;
        org.telegram.ui.Cells.t1 t1Var3;
        float f46;
        ci.p5 p5Var20;
        org.telegram.ui.Cells.t1 t1Var4;
        boolean z11;
        org.telegram.ui.Components.jb0 jb0Var6;
        float f47;
        org.telegram.ui.Components.jb0 jb0Var7;
        float f48;
        ci.p5 p5Var21;
        org.telegram.ui.Components.jb0 jb0Var8;
        org.telegram.ui.Components.jb0 jb0Var9;
        ci.p5 p5Var22;
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
        km kmVar3 = this;
        sn snVar = kmVar3.J0;
        ij ijVar2 = snVar.v;
        ArrayList arrayList7 = snVar.z6;
        snVar.Y.Q1();
        snVar.qc();
        if (snVar.Da || ((pjVar = snVar.y0) != null && pjVar.k())) {
            snVar.Da = false;
            snVar.Bc();
        }
        snVar.Tc(false, false);
        snVar.Dc();
        aj ajVar2 = snVar.s2;
        if (ajVar2 != null && ajVar2.getTag() != null && (view26 = (ajVar = snVar.s2).e) != null) {
            ajVar.g(view26);
        }
        org.telegram.ui.Components.r40 r40Var2 = snVar.u2;
        if (r40Var2 != null && r40Var2.getTag() != null && (view25 = (r40Var = snVar.u2).e) != null) {
            r40Var.g(view25);
        }
        float f62 = 0.2f;
        float f63 = 2.0f;
        if (snVar.wa) {
            kVar10 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            canvas2 = canvas;
            i10 = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), kmVar3.getMeasuredWidth(), kmVar3.getMeasuredHeight(), (int) (snVar.xa * 255.0f), 31);
            float f64 = (snVar.xa * 0.2f) + 0.8f;
            canvas2.scale(f64, f64, kmVar3.getMeasuredWidth() / 2.0f, kmVar3.getMeasuredHeight() / 2.0f);
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
            org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList7.get(i19);
            MessageObject.SendAnimationData sendAnimationData = t1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    rk rkVar = snVar.A1;
                    int currentHeight = measuredHeight + (rkVar != null ? rkVar.getCurrentHeight() : 0);
                    dk dkVar = snVar.B1;
                    int currentHeight2 = currentHeight + (dkVar != null ? dkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
                    i17 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i17 = 0;
                }
                f60 = f63;
                f61 = f62;
                canvas2.clipRect(0.0f, i17 + snVar.F9, kmVar3.getWidth(), kmVar3.getHeight());
                ImageReceiver photoImage = t1Var5.getPhotoImage();
                t1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((snVar.Y.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) com.google.android.gms.internal.play_billing.k3.D(1.0f, sendAnimationData.progress, t1Var5.getTranslationY(), r9[1])));
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
                t1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                t1Var5.draw(canvas2);
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
        num = snVar.Y8;
        if (num != null) {
            view24 = snVar.V8;
        }
        paint = snVar.P8;
        if (paint != null) {
            matrix = snVar.Q8;
            matrix.reset();
            float measuredWidth = kmVar3.getMeasuredWidth() / snVar.N8.getWidth();
            matrix2 = snVar.Q8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = snVar.O8;
            matrix3 = snVar.Q8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = snVar.P8;
            paint5.setAlpha((int) (snVar.X8 * 255.0f));
            paint6 = snVar.P8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = kmVar3.getMeasuredWidth();
                float measuredHeight2 = kmVar3.getMeasuredHeight();
                paint7 = snVar.P8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = snVar.R8;
            f11 = snVar.T8;
            float f68 = f11 * 255.0f;
            view = snVar.V8;
            paint2.setAlpha((int) (f68 * (view != null ? snVar.W8 : 1.0f)));
            paint3 = snVar.R8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = kmVar3.getMeasuredWidth();
                float measuredHeight3 = kmVar3.getMeasuredHeight();
                paint4 = snVar.R8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = snVar.Y8;
        if (num2 != null && snVar.a9) {
            kmVar3.invalidate();
        }
        view2 = snVar.V8;
        if (view2 != null) {
            view4 = snVar.V8;
            if (view4 == snVar.v1) {
                f57 = snVar.W8;
                if (f57 < 1.0f) {
                    paint30 = snVar.R8;
                    f58 = snVar.T8;
                    f59 = snVar.W8;
                    paint30.setAlpha((int) ((1.0f - f59) * f58 * 255.0f));
                    float measuredWidth4 = kmVar3.getMeasuredWidth();
                    float measuredHeight4 = kmVar3.getMeasuredHeight();
                    paint31 = snVar.R8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = snVar.V8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f49 = snVar.W8;
                    if (f49 < 1.0f) {
                        view20 = snVar.V8;
                        float left = view20.getLeft();
                        view21 = snVar.V8;
                        float top = view21.getTop();
                        view22 = snVar.V8;
                        float right = view22.getRight();
                        view23 = snVar.V8;
                        float bottom = view23.getBottom();
                        f53 = snVar.W8;
                        int i20 = (int) (f53 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i20, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = snVar.V8;
                    float left2 = view12.getLeft();
                    view13 = snVar.V8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = snVar.V8;
                    kVar6 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = snVar.V8;
                        float x10 = view16.getX();
                        view17 = snVar.V8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = snVar.V8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f66;
                        view19 = snVar.V8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f66;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, snVar.S8);
                    }
                    view15 = snVar.V8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f50 = snVar.W8;
                    if (f50 < 1.0f) {
                        paint23 = snVar.R8;
                        f51 = snVar.T8;
                        f52 = snVar.W8;
                        paint23.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                        float measuredWidth6 = kmVar3.getMeasuredWidth();
                        float measuredHeight6 = kmVar3.getMeasuredHeight();
                        paint24 = snVar.R8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    p5Var = snVar.x0;
                    float y3 = ((p5Var.getY() + snVar.E9) - snVar.G9) - AndroidUtilities.dp(4.0f);
                    view6 = snVar.V8;
                    if (view6 instanceof org.telegram.ui.Cells.t1) {
                        view11 = snVar.V8;
                        groupedMessages = ((org.telegram.ui.Cells.t1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    p5Var2 = snVar.x0;
                    int childCount = p5Var2.getChildCount();
                    int i21 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = kmVar3.B0;
                        f13 = 20.0f;
                        arrayList2 = kmVar3.A0;
                        arrayList3 = kmVar3.z0;
                        f14 = f10;
                        arrayList4 = kmVar3.C0;
                        if (i21 >= childCount) {
                            break;
                        }
                        p5Var3 = snVar.x0;
                        View childAt = p5Var3.getChildAt(i21);
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
                        float f69 = y3;
                        view7 = snVar.V8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != f14) {
                            if (z13 || t1Var == null || groupedMessages == null || (t1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i13 = childCount;
                                i14 = i21;
                                arrayList5 = arrayList;
                                t1Var2 = t1Var;
                                arrayList6 = arrayList4;
                                ijVar = ijVar2;
                                num4 = null;
                                f18 = 9.0f;
                                f19 = 1.0f;
                                z10 = z13;
                            } else {
                                f18 = 9.0f;
                                float D2 = t1Var3.D2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f70 = transitionParams.left + D2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f71 = transitionParams.top + transitionParams.offsetTop;
                                float f72 = transitionParams.right + D2 + transitionParams.offsetRight;
                                i13 = childCount;
                                float f73 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f46 = f71;
                                } else {
                                    f46 = transitionParams.cell.getTranslationY() + f71;
                                    f73 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f74 = f46;
                                float dp = f74 < (snVar.E9 - ((float) snVar.G9)) - ((float) AndroidUtilities.dp(20.0f)) ? (snVar.E9 - snVar.G9) - AndroidUtilities.dp(20.0f) : f74;
                                p5Var20 = snVar.x0;
                                if (f73 > AndroidUtilities.dp(20.0f) + p5Var20.getMeasuredHeight()) {
                                    p5Var22 = snVar.x0;
                                    f73 = AndroidUtilities.dp(20.0f) + p5Var22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i14 = i21;
                                int i22 = 0;
                                while (true) {
                                    if (i22 >= size2) {
                                        arrayList5 = arrayList;
                                        t1Var4 = t1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i23 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i22);
                                    arrayList5 = arrayList;
                                    if (snVar.i6[messageObject.getDialogId() == snVar.f6 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        t1Var4 = t1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i22++;
                                        size2 = i23;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - ijVar2.e()) - snVar.Gc) - AndroidUtilities.dp(9.0f);
                                jb0Var6 = snVar.U1;
                                if (jb0Var6 != null) {
                                    jb0Var9 = snVar.U1;
                                    f47 = jb0Var9.d();
                                } else {
                                    f47 = f14;
                                }
                                float f75 = measuredHeight7 - f47;
                                jb0Var7 = snVar.U1;
                                if (jb0Var7 != null) {
                                    jb0Var8 = snVar.U1;
                                    f48 = jb0Var8.e();
                                } else {
                                    f48 = f14;
                                }
                                org.telegram.ui.Cells.t1 t1Var6 = t1Var4;
                                canvas3.clipRect(f14, f69 + f48, getMeasuredWidth(), f75);
                                p5Var21 = snVar.x0;
                                canvas3.translate(f14, p5Var21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                ijVar = ijVar2;
                                num4 = null;
                                t1Var2 = t1Var6;
                                f19 = 1.0f;
                                transitionParams2.cell.A1(canvas, (int) f70, (int) dp, (int) f72, (int) f73, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (t1Var2 != null && t1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            p5Var4 = snVar.x0;
                            float left3 = p5Var4.getLeft();
                            p5Var5 = snVar.x0;
                            float right2 = p5Var5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - ijVar.e()) - snVar.Gc) - snVar.b9(org.telegram.ui.Components.s31.c)) - AndroidUtilities.dp(f18);
                            jb0Var3 = snVar.U1;
                            if (jb0Var3 != null) {
                                jb0Var4 = snVar.U1;
                                float max = Math.max(0.0f, jb0Var4.e());
                                jb0Var5 = snVar.U1;
                                f21 = Math.max(0.0f, jb0Var5.d());
                                f20 = max;
                            } else {
                                f20 = 0.0f;
                                f21 = 0.0f;
                            }
                            gk gkVar = snVar.Y;
                            if (gkVar != null && (nfVar = gkVar.m0) != null) {
                                f21 = Math.max(f21, nfVar.f ? 0.0f : Math.max(0.0f, nfVar.getMeasuredHeight() - (nfVar.c.getTranslationY() + nfVar.e)));
                            }
                            float f76 = f69 + f20;
                            float f77 = measuredHeight8 - f21;
                            if (t1Var2 == null || !t1Var2.getTransitionParams().w0) {
                                p5Var6 = snVar.x0;
                                left3 = Math.max(left3, view8.getX() + p5Var6.getLeft());
                                p5Var7 = snVar.x0;
                                f76 = Math.max(f76, view8.getY() + p5Var7.getY());
                                p5Var8 = snVar.x0;
                                right2 = Math.min(right2, view8.getX() + p5Var8.getLeft() + view8.getMeasuredWidth());
                                p5Var9 = snVar.x0;
                                f77 = Math.min(f77, view8.getY() + p5Var9.getY() + view8.getMeasuredHeight());
                            }
                            float f78 = f77;
                            float f79 = f76;
                            float f80 = right2;
                            float max2 = Math.max(left3, snVar.W8());
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
                                if (t1Var2 != null) {
                                    t1Var2.setInvalidatesParent(true);
                                    num12 = snVar.Y8;
                                    t1Var2.setScrimReaction(num12);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(true);
                                    num11 = snVar.Y8;
                                    v0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f25, f45, f26, f23);
                                p5Var18 = snVar.x0;
                                float x11 = view8.getX() + p5Var18.getLeft();
                                p5Var19 = snVar.x0;
                                canvas4.translate(x11, view8.getY() + p5Var19.getY());
                                if (t1Var2 != null && groupedMessages3 == null && t1Var2.B1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, t1Var2.getPaddingTop());
                                    t1Var2.C1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (t1Var2 == null || !t1Var2.T2()) {
                                    f22 = f45;
                                    f24 = 0.0f;
                                } else {
                                    canvas4.save();
                                    f22 = f45;
                                    f24 = 0.0f;
                                    canvas4.translate(0.0f, t1Var2.getPaddingTop());
                                    t1Var2.W1(canvas4);
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
                                f22 = f79;
                                f23 = f78;
                                view9 = view8;
                                f24 = 0.0f;
                                f25 = max2;
                                f26 = f80;
                            }
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePosition;
                            if (groupedMessagePosition2 != null || (t1Var2 != null && t1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(t1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && t1Var2.S2())) {
                                        arrayList2.add(t1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & t1Var2.s0()) != 0) {
                                    arrayList5.add(t1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i24 = groupedMessagePosition2.flags;
                                    if ((i24 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(t1Var2);
                            }
                            num5 = snVar.Y8;
                            if (num5 == null || t1Var2 == null || groupedMessages3 != null) {
                                float f81 = f26;
                                float f82 = f25;
                                View view27 = view9;
                                f27 = f24;
                                float f83 = f23;
                                float f84 = f22;
                                f28 = f69;
                                i15 = 1;
                                num6 = snVar.Y8;
                                if (num6 != null && v0Var != null) {
                                    paint13 = snVar.P8;
                                    if (paint13 != null) {
                                        matrix7 = snVar.Q8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / snVar.N8.getWidth();
                                        matrix8 = snVar.Q8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = snVar.O8;
                                        matrix9 = snVar.Q8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = snVar.P8;
                                        paint16.setAlpha((int) (snVar.X8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = snVar.P8;
                                        v0Var2 = v0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        v0Var2 = v0Var;
                                        paint14 = snVar.R8;
                                        f29 = snVar.T8;
                                        f30 = snVar.W8;
                                        paint14.setAlpha((int) (f30 * f29 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = snVar.R8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f79 < f78) {
                                        f31 = snVar.T8;
                                        f32 = snVar.W8;
                                        float f85 = (f32 * f31) / f67;
                                        float alpha = view27.getAlpha();
                                        f33 = snVar.W8;
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
                                        p5Var10 = snVar.x0;
                                        float x12 = view27.getX() + p5Var10.getLeft();
                                        p5Var11 = snVar.x0;
                                        canvas3.translate(x12, view27.getY() + p5Var11.getY() + view27.getPaddingTop());
                                        num7 = snVar.Y8;
                                        boolean z14 = snVar.U8;
                                        ah.j1 j1Var = v0Var2.E0;
                                        if (!j1Var.b) {
                                            org.telegram.ui.ActionBar.g6 g6Var = v0Var2.g1;
                                            if (g6Var != null) {
                                                g6Var.b(v0Var2.u0, v0Var2.t0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.k6.q(v0Var2.u0, v0Var2.t0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.v0);
                                            }
                                            j1Var.D = f85;
                                            j1Var.E = z14;
                                            j1Var.d(canvas3, v0Var2.r2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        p5Var12 = snVar.x0;
                                        float x13 = view27.getX() + p5Var12.getLeft();
                                        p5Var13 = snVar.x0;
                                        canvas3.translate(x13, view27.getY() + p5Var13.getY() + view27.getPaddingTop());
                                        int i25 = snVar.Z8;
                                        num8 = snVar.Y8;
                                        v0Var2.D(this, canvas3, i25, num8, f85);
                                        kmVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = snVar.P8;
                                if (paint18 != null) {
                                    matrix10 = snVar.Q8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / snVar.N8.getWidth();
                                    matrix11 = snVar.Q8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = snVar.O8;
                                    matrix12 = snVar.Q8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = snVar.P8;
                                    paint21.setAlpha((int) (snVar.X8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = snVar.P8;
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
                                    paint19 = snVar.R8;
                                    f37 = snVar.T8;
                                    f38 = snVar.W8;
                                    paint19.setAlpha((int) (f38 * f37 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = snVar.R8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f79 < f78) {
                                    f39 = snVar.T8;
                                    f40 = snVar.W8;
                                    float f87 = (f40 * f39) / f67;
                                    float alpha2 = view10.getAlpha();
                                    f41 = snVar.W8;
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
                                    p5Var14 = snVar.x0;
                                    float x14 = view10.getX() + p5Var14.getLeft();
                                    p5Var15 = snVar.x0;
                                    canvas5.translate(x14, view10.getY() + p5Var15.getY() + view10.getPaddingTop());
                                    num9 = snVar.Y8;
                                    t1Var2.g2(canvas5, num9, f87, snVar.U8);
                                    canvas5.restore();
                                    canvas5.save();
                                    p5Var16 = snVar.x0;
                                    float x15 = view10.getX() + p5Var16.getLeft();
                                    p5Var17 = snVar.x0;
                                    canvas5.translate(x15, view10.getY() + p5Var17.getY() + view10.getPaddingTop());
                                    int i26 = snVar.Z8;
                                    num10 = snVar.Y8;
                                    i15 = i16;
                                    f28 = f69;
                                    f27 = f42;
                                    t1Var2.h2(this, canvas5, i26, num10, f87);
                                    canvas.restore();
                                } else {
                                    i15 = i16;
                                    f28 = f69;
                                    f27 = f24;
                                }
                            }
                            kmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            i15 = 1;
                            f19 = 1.0f;
                            kmVar2 = this;
                            i13 = childCount;
                            i14 = i21;
                            ijVar = ijVar2;
                            f27 = f14;
                            f28 = f69;
                            groupedMessages3 = groupedMessages;
                        }
                        i21 = i14 + 1;
                        kmVar3 = kmVar2;
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
                    kmVar = kmVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i28 = 0; i28 < size3; i28++) {
                            kmVar.Z(canvas3, f90, (org.telegram.ui.Cells.t1) arrayList3.get(i28), 0);
                        }
                        i12 = 0;
                        arrayList3.clear();
                    } else {
                        i12 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i29 = i12; i29 < size4; i29++) {
                            kmVar.Z(canvas3, f90, (org.telegram.ui.Cells.t1) arrayList2.get(i29), i27);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i30 = i12; i30 < size5; i30++) {
                            org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList.get(i30);
                            if (t1Var7.getCurrentPosition() != null || t1Var7.getTransitionParams().w0) {
                                kmVar.Z(canvas3, f90, t1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i31 = i12; i31 < size6; i31++) {
                            org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList4.get(i31);
                            if (t1Var8.getCurrentPosition() != null || t1Var8.getTransitionParams().w0) {
                                kmVar.Z(canvas3, f90, t1Var8, 3);
                            }
                        }
                    }
                    num3 = snVar.Y8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = snVar.P8;
                        if (paint8 != null) {
                            matrix4 = snVar.Q8;
                            matrix4.reset();
                            float measuredWidth13 = kmVar.getMeasuredWidth() / snVar.N8.getWidth();
                            matrix5 = snVar.Q8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = snVar.O8;
                            matrix6 = snVar.Q8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = snVar.P8;
                            paint11.setAlpha((int) (snVar.X8 * 255.0f));
                            float measuredWidth14 = kmVar.getMeasuredWidth();
                            float measuredHeight13 = kmVar.getMeasuredHeight();
                            paint12 = snVar.P8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = snVar.R8;
                            f16 = snVar.T8;
                            f17 = snVar.W8;
                            paint9.setAlpha((int) (f17 * f16 * 255.0f));
                            float measuredWidth15 = kmVar.getMeasuredWidth();
                            float measuredHeight14 = kmVar.getMeasuredHeight();
                            paint10 = snVar.R8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i32 = i12; i32 < size7; i32++) {
                            org.telegram.ui.Cells.t1 t1Var9 = (org.telegram.ui.Cells.t1) arrayList4.get(i32);
                            if (t1Var9.getCurrentPosition() != null || t1Var9.getTransitionParams().w0) {
                                kmVar.Z(canvas3, f90, t1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = snVar.Y8;
                    if (num13 == null) {
                        f54 = snVar.W8;
                        if (f54 < f15) {
                            paint25 = snVar.P8;
                            if (paint25 != null) {
                                matrix13 = snVar.Q8;
                                matrix13.reset();
                                float measuredWidth16 = kmVar.getMeasuredWidth() / snVar.N8.getWidth();
                                matrix14 = snVar.Q8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = snVar.O8;
                                matrix15 = snVar.Q8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = snVar.P8;
                                paint28.setAlpha((int) (snVar.X8 * 255.0f));
                                float measuredWidth17 = kmVar.getMeasuredWidth();
                                float measuredHeight15 = kmVar.getMeasuredHeight();
                                paint29 = snVar.P8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = snVar.R8;
                                f55 = snVar.T8;
                                f56 = snVar.W8;
                                paint26.setAlpha((int) ((f15 - f56) * f55 * 255.0f));
                                float measuredWidth18 = kmVar.getMeasuredWidth();
                                float measuredHeight16 = kmVar.getMeasuredHeight();
                                paint27 = snVar.R8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            kmVar = kmVar3;
            f15 = 1.0f;
            f12 = 0.0f;
            f13 = 20.0f;
            num13 = snVar.Y8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            kmVar = kmVar3;
            f12 = 0.0f;
            f13 = 20.0f;
        }
        view3 = snVar.V8;
        if (view3 != null || ((ArrayList) snVar.Y9.c).size() > 0) {
            jb0Var = snVar.U1;
            if (jb0Var != null) {
                jb0Var2 = snVar.U1;
            }
            super.drawChild(canvas3, snVar.v1, SystemClock.uptimeMillis());
            xj xjVar = snVar.j3;
            if (xjVar != null && xjVar.getTag() != null) {
                super.drawChild(canvas3, snVar.j3, SystemClock.uptimeMillis());
            }
            vj vjVar = snVar.k3;
            if (vjVar != null && vjVar.getTag() != null) {
                super.drawChild(canvas3, snVar.k3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.z00 z00Var = snVar.y9;
            if (z00Var != null) {
                super.drawChild(canvas3, z00Var, SystemClock.uptimeMillis());
            }
            vh.i iVar = snVar.ja;
            if (iVar != null) {
                super.drawChild(canvas3, iVar, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.r40 r40Var3 = snVar.q2;
            if (r40Var3 != null) {
                super.drawChild(canvas3, r40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = snVar.K3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, snVar.K3, SystemClock.uptimeMillis());
            }
            cl clVar = snVar.L3;
            if (clVar != null && clVar.getVisibility() == 0) {
                super.drawChild(canvas3, snVar.L3, SystemClock.uptimeMillis());
            }
            ei.x3 x3Var = snVar.J1;
            if (x3Var != null && x3Var.getVisibility() == 0) {
                super.drawChild(canvas3, snVar.J1, SystemClock.uptimeMillis());
            }
            ql qlVar = snVar.N1;
            if (qlVar != null && qlVar.getVisibility() == 0) {
                super.drawChild(canvas3, snVar.N1, SystemClock.uptimeMillis());
            }
            ei.x3 x3Var2 = snVar.L1;
            if (x3Var2 != null && x3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, snVar.L1, SystemClock.uptimeMillis());
            }
            gk gkVar2 = snVar.Y;
            if (gkVar2 != null && gkVar2.L != null) {
                canvas3.save();
                canvas3.translate(snVar.Y.L.getX() + snVar.Y.getX(), snVar.Y.L.getY() + snVar.Y.getY());
                snVar.Y.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (snVar.Ba > 0 && kmVar.f < AndroidUtilities.dp(f13)) {
            int themedColor = snVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            if (kmVar.D0 == null) {
                kmVar.D0 = new Paint();
            }
            if (kmVar.E0 != themedColor) {
                Paint paint32 = kmVar.D0;
                kmVar.E0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, kmVar.getMeasuredHeight() - snVar.Ba, kmVar.getMeasuredWidth(), kmVar.getMeasuredHeight(), kmVar.D0);
            canvas3 = canvas6;
        }
        np npVar = snVar.ba;
        if (npVar != null && npVar.e()) {
            int inputBubbleTop = (int) snVar.S.getInputBubbleTop();
            int inputBubbleBottom = (int) snVar.S.getInputBubbleBottom();
            sn snVar2 = snVar.fa;
            int i33 = inputBubbleTop - ((int) (snVar.ga * (snVar2 == null ? f12 : snVar2.aa)));
            np npVar2 = snVar.ba;
            kmVar.getMeasuredWidth();
            npVar2.b(canvas3, i33, inputBubbleBottom);
        }
        if (snVar.fa != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, kmVar.getMeasuredWidth(), kmVar.getMeasuredHeight(), (int) (snVar.ga * 255.0f), 31);
            canvas3 = canvas;
            snVar.fa.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        snVar.Ja.e(canvas3);
        if (i18 >= 0) {
            canvas3.restore();
        }
        if (snVar.wa) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (snVar.xa * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        bl blVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (blVar = this.J0.Ra) == null || !blVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        blVar.a(true);
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
        pk pkVar;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.J0;
        ih.e eVar = snVar.Z3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || snVar.isInBubbleMode()) ? (snVar.Y.getEmojiView() != null ? snVar.Y.getEmojiView() : snVar.Y).getY() : snVar.Y.getY();
        View view = snVar.V8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        }
        gk gkVar = snVar.Y;
        if (gkVar == null || !gkVar.z3 || motionEvent.getY() >= y3) {
            snVar.v9 = motionEvent.getY();
            org.telegram.ui.Cells.aa n10 = snVar.o9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!snVar.o9.x() || !snVar.o9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                ei.h1 h1Var = snVar.C1;
                if (h1Var != null) {
                    if (snVar.G3 != null) {
                        z10 = h1Var.A(motionEvent);
                        if (snVar.C1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !snVar.o9.x() || (motionEvent.getY() >= snVar.x0.getTop() && motionEvent.getY() <= snVar.x0.getBottom())) {
                            pkVar = snVar.Ia;
                            if (!pkVar.n) {
                                return pkVar.g(motionEvent);
                            }
                            c2.b bVar = c2.b.e;
                            if (bVar == null || !bVar.a) {
                                if (snVar.isInPreviewMode() && snVar.V9) {
                                    if (motionEvent.getAction() == 0) {
                                        int i10 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (snVar.v1 != null) {
                                            int i11 = 0;
                                            for (int i12 = 3; i11 < i12; i12 = 3) {
                                                androidx.biometric.e eVar2 = snVar.v1.e[i11 == 0 ? 1 : i11 == 1 ? i10 : i12];
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
                                        hj hjVar = snVar.m1;
                                        if (hjVar != null) {
                                            hjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i14 = iArr2[0] - iArr[0];
                                            rect2.set(i14, iArr2[1] - iArr[1], snVar.m1.getMeasuredWidth() + i14, snVar.m1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.F0 = motionEvent.getX();
                                                    this.G0 = motionEvent.getY();
                                                    this.H0 = SystemClock.elapsedRealtime();
                                                    this.I0 = z12;
                                                    hj hjVar2 = snVar.m1;
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
                                        hj hjVar3 = snVar.m1;
                                        if (hjVar3 != null) {
                                            hjVar3.h0.c(false);
                                        }
                                        if (this.I0 || (v7.f7.a(this.F0, this.G0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.H0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.I0) {
                                                h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                                                snVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) h5Var2).Q(ProfileActivity.o4(snVar.f6));
                                            } else {
                                                h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                                                ((ActionBarLayout) h5Var).r();
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
                                w4 w4Var = (w4) c2.b.m().d;
                                if (w4Var != null) {
                                    w4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (snVar.o9.n(getContext()).onTouchEvent(motionEvent)) {
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
                            org.telegram.ui.Components.b91 b91Var = h1Var.M;
                            if (b91Var != null) {
                                b91Var.e(1.0f, 0, h1Var.b);
                            }
                            h1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                pkVar = snVar.Ia;
                if (!pkVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.a1) goto L136;
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
        jk jkVar;
        MessageObject messageObject;
        org.telegram.ui.Components.s60 s60Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        sn snVar = this.J0;
        boolean z12 = false;
        if ((snVar.V8 == null && ((ArrayList) snVar.Y9.c).size() <= 0) || (view != snVar.v1 && view != snVar.j3 && view != snVar.k3 && view != snVar.y9 && view != snVar.ja && view != snVar.q2 && view != null && view != snVar.K3 && view != snVar.L3)) {
            if ((view != snVar.K3 || !PhotoViewer.u1().T1()) && (!snVar.ea || view != snVar.x0)) {
                if (snVar.wa) {
                    kVar3 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                }
                if (view != snVar.n3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (g6Var = snVar.K2) != null && g6Var.a() && snVar.K2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == snVar.F8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    } else {
                        if (view != snVar.x0) {
                            if (view != snVar.S) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == snVar.F8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-snVar.Z9) - (snVar.ga != 0.0f ? (snVar.x0.getMeasuredHeight() - snVar.Z9) * snVar.ga : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.k6.k3 != null && snVar.H8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(snVar.F8.getScaleX(), snVar.F8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.k6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.k6.k3.setBounds(x10, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(snVar.H9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(snVar.H9()) + y3);
                                            org.telegram.ui.ActionBar.k6.k3.draw(canvas);
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
                                if (view == snVar.S && (s60Var = snVar.n3) != null && s60Var.getVisibility() == 0) {
                                    super.drawChild(canvas, snVar.n3, j10);
                                }
                                z12 = super.drawChild(canvas, view, j10);
                                if (z11 && view == snVar.x0 && playingMessageObject.type != 5 && (jkVar = snVar.F8) != null && jkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-snVar.Z9) - (snVar.ga != 0.0f ? (snVar.x0.getMeasuredHeight() - snVar.Z9) * snVar.ga : 0.0f)) + snVar.aa);
                                    super.drawChild(canvas, snVar.F8, j10);
                                    if (snVar.G8 != null) {
                                        canvas.save();
                                        canvas.translate(snVar.G8.getX(), snVar.x0.getY() + snVar.G8.getTop());
                                        if (z10) {
                                            snVar.G8.f2(canvas);
                                            invalidate();
                                            snVar.G8.invalidate();
                                        } else {
                                            snVar.G8.X1(canvas);
                                            org.telegram.ui.Cells.t1 t1Var = snVar.G8;
                                            if (!t1Var.vb && ((messageObject = t1Var.y7) == null || messageObject.type != 27)) {
                                                t1Var.l2(t1Var.getAlpha(), canvas, true);
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
                        if (view == snVar.F8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.ow0
    public float getBottomOffset() {
        return this.J0.x0.getBottom();
    }

    public sn getChatActivity() {
        return this.J0;
    }

    @Override // org.telegram.ui.Components.ow0
    public int getKeyboardHeight() {
        if (this.J0.bb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.ow0
    public float getListTranslationY() {
        return this.J0.x0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.ow0
    public Drawable getNewDrawable() {
        Drawable l4 = this.J0.qa.l();
        return l4 != null ? l4 : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.ow0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.qa.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.ow0
    public int getScrollOffset() {
        return this.J0.x0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.h5 h5Var3;
        super.onAttachedToWindow();
        sn snVar = this.J0;
        if (snVar.bb) {
            this.H.b = snVar.j1;
        } else {
            h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
            if (h5Var != null) {
                h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                if (((ActionBarLayout) h5Var2).b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    h5Var3 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
                    o1Var.b = (FrameLayout) h5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        snVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == snVar.f6)) {
            MediaController.getInstance().setTextureView(snVar.Q7(false), snVar.H8, snVar.F8, true);
        }
        np npVar = snVar.ba;
        if (npVar != null) {
            npVar.f();
        }
        snVar.Ja.i();
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        sn snVar = this.J0;
        np npVar = snVar.ba;
        if (npVar != null) {
            NotificationCenter.getInstance(npVar.e0).removeObserver(npVar, NotificationCenter.updateInterfaces);
            npVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.r5 r5Var = npVar.k0;
            if (r5Var != null && (view = npVar.a0) != null) {
                r5Var.o(view);
            }
            npVar.Q = 0.0f;
            npVar.P = 0L;
            snVar.ba = null;
        }
        snVar.Ja.j();
        AndroidUtilities.runOnUIThread(new ah.j(24));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        sn snVar;
        ei.g6 g6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (g6Var = (snVar = this.J0).K2) == null || !g6Var.a() || snVar.K2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.Qc) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        sn snVar = this.J0;
        ij ijVar = snVar.v;
        int i22 = (measuredWidth - snVar.gb) - snVar.hb;
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
                    C = i2.o1.C(i22, measuredWidth2, 2, snVar.gb) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = snVar.gb + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                                    i18 += kVar7.getMeasuredHeight();
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
                            if (childAt != snVar.Y9 && childAt != snVar.ja && childAt != snVar.S && !(childAt instanceof org.telegram.ui.Components.r40) && !(childAt instanceof org.telegram.ui.Components.bq)) {
                                if (childAt instanceof org.telegram.ui.Cells.aa) {
                                    i20 = snVar.Ma;
                                } else if (childAt == snVar.c1) {
                                    kVar3 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (snVar.Y.r0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.o2) snVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = snVar.Y.getBottom();
                                        }
                                    }
                                    i18 = snVar.Y.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    gk gkVar = snVar.Y;
                                    if (gkVar != null && (childAt == gkVar.O1 || childAt == gkVar.N1)) {
                                        i18 = org.telegram.messenger.sl.y(7.0f, ijVar.e(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == snVar.I2) {
                                        i18 = org.telegram.messenger.sl.y(7.0f, ijVar.e(), i18);
                                    } else if (gkVar == null || childAt != gkVar.e1) {
                                        if (childAt == snVar.q2 || childAt == snVar.E2 || childAt == snVar.r2) {
                                            i19 = this.w0;
                                        } else if (childAt == snVar.x0 || childAt == snVar.v0 || childAt == snVar.j3 || childAt == snVar.k3 || childAt == snVar.l3) {
                                            i20 = snVar.Ma;
                                        } else if (childAt != snVar.P) {
                                            kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (snVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == snVar.F8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != snVar.n3 && childAt != snVar.o3 && childAt != snVar.u0) {
                                                if (childAt instanceof org.telegram.ui.Components.rc0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != snVar.T) {
                                                    if (childAt != snVar.Z3) {
                                                    }
                                                }
                                            }
                                        } else if (gkVar.x0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.sl.y(9.0f, ijVar.e(), i18);
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
                    C = (measuredWidth - snVar.hb) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = C - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (a0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        vj vjVar = snVar.k3;
        if (vjVar != null) {
            vjVar.setBackgroundHeight(getMeasuredHeight());
        }
        snVar.t9();
        snVar.w9();
        snVar.Tc(false, false);
        R();
        snVar.w7();
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
        sn snVar = this.J0;
        ij ijVar = snVar.v;
        zf.b0 b0Var = snVar.Rc;
        ViewParent parent = b0Var.getParent();
        if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(b0Var)) >= 0 && indexOfChild != viewGroup.getChildCount() - 1) {
            viewGroup.bringChildToFront(b0Var);
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - snVar.gb) - snVar.hb;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        gh.a aVar = snVar.L.a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).c(i15, size2);
        }
        int i16 = 0;
        if (this.y0 != i15) {
            snVar.R4 = false;
            this.y0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
            if (z13 || (user = snVar.f) == null || !user.self) {
                snVar.W9 = false;
            } else {
                org.telegram.ui.ActionBar.n5 titleTextView = snVar.m1.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    snVar.W9 = !snVar.X9;
                } else {
                    snVar.W9 = false;
                }
            }
            if (snVar.W9 || snVar.X9 || UserObject.isBotForumWithEditableTopics(snVar.f)) {
                hj hjVar = snVar.m1;
                if (hjVar != null && hjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) snVar.m1.getLayoutParams()).rightMargin = AndroidUtilities.dp(snVar.d4 != 3 ? 92.0f : 52.0f);
                }
            } else {
                hj hjVar2 = snVar.m1;
                if (hjVar2 != null && hjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) snVar.m1.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (snVar.W9) {
                kVar8 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                if (!kVar8.n0 && (u0Var = snVar.m0) != null) {
                    u0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var2 = snVar.h0;
                if (u0Var2 != null) {
                    u0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.u0 u0Var3 = snVar.h0;
                if (u0Var3 != null) {
                    u0Var3.K(40);
                }
                org.telegram.ui.ActionBar.u0 u0Var4 = snVar.m0;
                if (u0Var4 != null) {
                    u0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            if (!kVar7.n0 && (xVar = snVar.n0) != null) {
                xVar.f((!snVar.X9 || snVar.W9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.u0 u0Var5 = snVar.h0;
            if (u0Var5 != null) {
                TLRPC.UserFull userFull = snVar.m8;
                if (snVar.X9) {
                    u0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    u0Var5.K(32);
                }
            }
            snVar.R4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + snVar.Aa >= AndroidUtilities.dp(20.0f);
        if (this.x0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (snVar.Ba > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            snVar.Aa = snVar.Ba;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            snVar.Aa = snVar.Y.q0() ? snVar.Y.getEmojiPadding() : 0;
        } else {
            snVar.Aa = 0;
        }
        setEmojiKeyboardHeight(snVar.Aa);
        boolean z15 = this.f + snVar.Aa >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i17 = 0; i17 < snVar.x0.getChildCount(); i17++) {
                View childAt = snVar.x0.getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        snVar.x0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            snVar.z0.i1(R, (int) (((((snVar.x0.getMeasuredHeight() - snVar.E9) - snVar.Na) + ((this.f + snVar.Aa) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(snVar.H9()))) / 2.0f), false);
                            snVar.A0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i18 = paddingTop;
                            measureChildWithMargins(snVar.Y, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
                            if (!z10 || snVar.bb) {
                                this.w0 = 0;
                            } else {
                                this.w0 = snVar.Y.getMeasuredHeight();
                            }
                            snVar.Ma = 0;
                            snVar.Na = 0;
                            if (SharedConfig.chatBlurEnabled() && !snVar.bb && snVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i19 = snVar.G;
                                snVar.Ma = i19;
                                snVar.Na = i19;
                            }
                            i12 = 0;
                            while (i12 < childCount) {
                                int i20 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != snVar.Y) {
                                        kVar4 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                                        if (childAt2 != kVar4) {
                                            if (a0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == snVar.x0 || childAt2 == snVar.v0 || (childAt2 instanceof org.telegram.ui.Cells.aa)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), snVar.Ma + size2 + snVar.Na), TLObject.FLAG_30));
                                                } else if (childAt2 == snVar.P) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int dp = AndroidUtilities.dp(10.0f);
                                                    int i21 = i18 - this.w0;
                                                    z12 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((snVar.Y.x0() ? 48 : i16) + 2) + (i21 - (z12 ? AndroidUtilities.statusBarHeight : i16))), TLObject.FLAG_30));
                                                } else if (childAt2 == snVar.n3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    snVar.n3.setInternalPadding(AndroidUtilities.dp(12.0f) + ijVar.e() + ((int) snVar.Hc));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == snVar.o3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - ijVar.e()) - ((int) snVar.Hc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == snVar.c1) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                                                } else if (snVar.Y.r0(childAt2)) {
                                                    org.telegram.ui.Components.ag agVar = snVar.Y.H1;
                                                    if (childAt2 == agVar && agVar != null) {
                                                        i20 = agVar.getKeyboardHeight();
                                                    }
                                                    z11 = ((org.telegram.ui.ActionBar.o2) snVar).inBubbleMode;
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
                                                    yj yjVar = snVar.U1;
                                                    if (childAt2 == yjVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yjVar.getLayoutParams();
                                                        hg.j1 adapter = snVar.U1.getAdapter();
                                                        if (adapter.w0 == null || adapter.h0) {
                                                            snVar.U1.setIgnoreLayout(true);
                                                            layoutParams.height = i18;
                                                            layoutParams.topMargin = 0;
                                                            snVar.U1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == snVar.o9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                        int i22 = i18 + snVar.Ma;
                                                        if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || snVar.bb) {
                                                            lm lmVar = snVar.o9;
                                                            lmVar.d0 = 0;
                                                            lmVar.w();
                                                        } else {
                                                            i22 += keyboardHeight;
                                                            lm lmVar2 = snVar.o9;
                                                            lmVar2.d0 = keyboardHeight;
                                                            lmVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.rc0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                    } else if (childAt2 == snVar.d2) {
                                                        kVar5 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                                                        if (kVar5.getVisibility() == 0) {
                                                            kVar6 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
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
                            if (snVar.Q4) {
                                snVar.R4 = true;
                                snVar.t9();
                                snVar.w9();
                                snVar.Q4 = false;
                                nj njVar = snVar.x0;
                                njVar.measure(View.MeasureSpec.makeMeasureSpec(njVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(snVar.x0.getMeasuredHeight(), TLObject.FLAG_30));
                                snVar.R4 = false;
                            }
                            i13 = snVar.J4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ah.g(this, i13, 28));
                                snVar.J4 = -1;
                            }
                            qcVar = org.telegram.ui.Components.qc.w;
                            if (qcVar != null && snVar.mc != null) {
                                qcVar.l();
                            }
                            snVar.V6();
                            this.x0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.af afVar = snVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(afVar);
        afVar.run();
        childCount = getChildCount();
        int i182 = paddingTop;
        measureChildWithMargins(snVar.Y, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
        if (z10) {
        }
        this.w0 = 0;
        snVar.Ma = 0;
        snVar.Na = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i192 = snVar.G;
            snVar.Ma = i192;
            snVar.Na = i192;
        }
        i12 = 0;
        while (i12 < childCount) {
        }
        if (snVar.Q4) {
        }
        i13 = snVar.J4;
        if (i13 != -1) {
        }
        qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar != null) {
            qcVar.l();
        }
        snVar.V6();
        this.x0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        sn snVar = this.J0;
        hh.d.c(snVar.L8, snVar.fragmentView);
        snVar.M8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.J0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        sn snVar = this.J0;
        snVar.H9 = i11;
        snVar.t9();
        snVar.w9();
    }

    @Override // org.telegram.ui.Components.ow0
    public final void L() {
    }

    @Override // org.telegram.ui.Components.ow0
    public final void W() {
    }

    @Override // org.telegram.ui.Components.ow0
    public final void I(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
