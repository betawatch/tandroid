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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.Components.hv0 {
    public int A0;
    public float B0;
    public float C0;
    public long D0;
    public boolean E0;
    public final /* synthetic */ tn F0;
    public int s0;
    public int t0;
    public int u0;
    public final ArrayList v0;
    public final ArrayList w0;
    public final ArrayList x0;
    public final ArrayList y0;
    public Paint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(tn tnVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.F0 = tnVar;
        this.s0 = 0;
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.D = new jm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f9) {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.F0;
        tnVar.T0.setTranslationY(f9);
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        lVar.setTranslationY(0.0f);
        uk ukVar = tnVar.Xa;
        if (ukVar != null) {
            ukVar.setTranslationY(tnVar.k1 != null ? r3.getCurrentHeight() : 0);
        }
        nh.t3 t3Var = tnVar.s1;
        if (t3Var != null) {
            t3Var.setTranslationY(0.0f);
        }
        nh.t3 t3Var2 = tnVar.r1;
        if (t3Var2 != null) {
            t3Var2.setTranslationY(0.0f);
        }
        org.telegram.ui.Components.m21 m21Var = tnVar.N1;
        if (m21Var != null) {
            m21Var.setTranslationY(0.0f);
        }
        tnVar.M0.setTranslationY(0.0f);
        tnVar.L.setTranslationY(0.0f);
        tnVar.s9 = 0.0f;
        tnVar.t9 = 0.0f;
        tnVar.T0.setBackgroundTranslation(0);
        xk xkVar = tnVar.X2;
        if (xkVar != null) {
            xkVar.p0 = 0.0f;
            xkVar.s();
        }
        cg.i0 i0Var = tnVar.u2;
        if (i0Var != null) {
            org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) i0Var.b;
            caVar.u = 0.0f;
            caVar.d.invalidate();
        }
        tnVar.setFragmentPanTranslationOffset(0);
        tnVar.o9();
    }

    @Override // org.telegram.ui.Components.hv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.hv0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.hv0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.yb0) {
            ((org.telegram.ui.Components.yb0) drawable).p();
        }
        tn tnVar = this.F0;
        qg.a c3 = tnVar.S.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(tnVar.S.b(c3));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(tnVar.S.a(c3));
        tnVar.zb = computePerceivedBrightness <= 0.721f;
        tnVar.Ab = computePerceivedBrightness2 <= 0.9f;
        tnVar.H.a = c3;
        ug.f fVar = tnVar.T;
        if (fVar != null) {
            fVar.invalidate();
        }
        sg.f fVar2 = tnVar.O;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        tnVar.n9();
        tnVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f9, org.telegram.ui.Cells.s1 s1Var, int i10) {
        int save = canvas.save();
        tn tnVar = this.F0;
        float x4 = s1Var.getX() + tnVar.t0.getLeft();
        float y8 = s1Var.getY() + tnVar.t0.getY() + s1Var.getPaddingTop();
        float alpha = s1Var.a() ? s1Var.getAlpha() : 1.0f;
        canvas.clipRect(tnVar.t0.getLeft(), f9, tnVar.t0.getRight(), ((((tnVar.t0.getY() + tnVar.t0.getMeasuredHeight()) - tnVar.wa) - tnVar.v.d()) - tnVar.oc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x4, y8);
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(alpha, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, alpha);
        } else if (i10 == 2) {
            s1Var.I1(alpha, canvas, s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0;
            s1Var.N1(canvas, alpha);
            if (!z10) {
                s1Var.d2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && tnVar.I8 != null)) {
            float f10 = (tnVar.D8 * tnVar.G8) / 0.2f;
            canvas.save();
            s1Var.h2(canvas, tnVar.I8, f10, tnVar.E8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x4, y8);
            s1Var.i2(this, canvas, tnVar.J8, tnVar.I8, f10);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.lg lgVar;
        tn tnVar = this.F0;
        lg.a aVar = tnVar.F;
        dk dkVar = tnVar.U;
        if (dkVar == null || view != dkVar.i0) {
            super.addView(view, i10, layoutParams);
        } else {
            ug.f fVar = tnVar.T;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        dk dkVar2 = tnVar.U;
        if (dkVar2 != null && view == dkVar2.i0) {
            ph.v vVar = (ph.v) view;
            vVar.setBackgroundDrawable(aVar.c(vVar.c, tnVar.x, false));
        }
        dk dkVar3 = tnVar.U;
        if (dkVar3 == null || view != (lgVar = dkVar3.J1)) {
            return;
        }
        lgVar.setBlurredBackgroundFactory(aVar);
    }

    public final boolean b0(View view) {
        if (view == this.H) {
            return true;
        }
        tn tnVar = this.F0;
        return view == tnVar.u2 || view == tnVar.m1 || view == tnVar.i9 || view == tnVar.T || view == tnVar.G3;
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
    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Integer num;
        Paint paint;
        Paint paint2;
        float f9;
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
        float f10;
        View view3;
        org.telegram.ui.Components.ka0 ka0Var;
        org.telegram.ui.Components.ka0 ka0Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        View view4;
        View view5;
        om omVar;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        om omVar2;
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
        om omVar3;
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
        ah.i iVar;
        Integer num4;
        float f14;
        float f15;
        boolean z10;
        om omVar4;
        om omVar5;
        org.telegram.ui.Components.ka0 ka0Var3;
        float f16;
        float f17;
        om omVar6;
        om omVar7;
        om omVar8;
        om omVar9;
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
        org.telegram.ui.Cells.v0 v0Var2;
        Paint paint14;
        float f23;
        float f24;
        Paint paint15;
        float f25;
        float f26;
        float f27;
        float f28;
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
        Paint paint22;
        float f38;
        Integer num11;
        om omVar18;
        om omVar19;
        Integer num12;
        org.telegram.ui.Components.gf gfVar;
        org.telegram.ui.Components.ka0 ka0Var4;
        org.telegram.ui.Components.ka0 ka0Var5;
        org.telegram.ui.Cells.s1 s1Var3;
        float f39;
        om omVar20;
        org.telegram.ui.Cells.s1 s1Var4;
        boolean z11;
        org.telegram.ui.Components.ka0 ka0Var6;
        float f40;
        org.telegram.ui.Components.ka0 ka0Var7;
        float f41;
        om omVar21;
        org.telegram.ui.Components.ka0 ka0Var8;
        org.telegram.ui.Components.ka0 ka0Var9;
        om omVar22;
        View view11;
        float f42;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.l lVar6;
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
        org.telegram.ui.ActionBar.l lVar7;
        int i13;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.l lVar9;
        boolean z12;
        org.telegram.ui.ActionBar.l lVar10;
        org.telegram.ui.Components.g40 g40Var;
        View view25;
        zi ziVar;
        View view26;
        nj njVar;
        km kmVar3 = this;
        tn tnVar = kmVar3.F0;
        ah.i iVar2 = tnVar.v;
        ArrayList arrayList7 = tnVar.j6;
        tnVar.U.T1();
        tnVar.jc();
        if (tnVar.na || ((njVar = tnVar.u0) != null && njVar.k())) {
            tnVar.na = false;
            tnVar.uc();
        }
        tnVar.Mc(false, false);
        tnVar.wc();
        zi ziVar2 = tnVar.c2;
        if (ziVar2 != null && ziVar2.getTag() != null && (view26 = (ziVar = tnVar.c2).e) != null) {
            ziVar.g(view26);
        }
        org.telegram.ui.Components.g40 g40Var2 = tnVar.e2;
        if (g40Var2 != null && g40Var2.getTag() != null && (view25 = (g40Var = tnVar.e2).e) != null) {
            g40Var.g(view25);
        }
        if (tnVar.ga) {
            lVar10 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, lVar10.getBottom(), kmVar3.getMeasuredWidth(), kmVar3.getMeasuredHeight(), (int) (tnVar.ha * 255.0f), 31);
            float f53 = (tnVar.ha * 0.2f) + 0.8f;
            canvas2.scale(f53, f53, kmVar3.getMeasuredWidth() / 2.0f, kmVar3.getMeasuredHeight() / 2.0f);
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
                lVar7 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (lVar7.getVisibility() == 0) {
                    lVar8 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    int translationY = (int) lVar8.getTranslationY();
                    lVar9 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    int measuredHeight = lVar9.getMeasuredHeight() + translationY;
                    pk pkVar = tnVar.k1;
                    int currentHeight = measuredHeight + (pkVar != null ? pkVar.getCurrentHeight() : 0);
                    bk bkVar = tnVar.l1;
                    int currentHeight2 = currentHeight + (bkVar != null ? bkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
                    i13 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + tnVar.p9, kmVar3.getWidth(), kmVar3.getHeight());
                ImageReceiver photoImage = s1Var5.getPhotoImage();
                s1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((tnVar.U.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) th.b(1.0f, sendAnimationData.progress, s1Var5.getTranslationY(), r9[1])));
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
                s1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                s1Var5.draw(canvas2);
                canvas2.restore();
            }
        }
        num = tnVar.I8;
        if (num != null) {
            view24 = tnVar.F8;
        }
        paint = tnVar.z8;
        if (paint != null) {
            matrix = tnVar.A8;
            matrix.reset();
            float measuredWidth = kmVar3.getMeasuredWidth() / tnVar.x8.getWidth();
            matrix2 = tnVar.A8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = tnVar.y8;
            matrix3 = tnVar.A8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = tnVar.z8;
            paint5.setAlpha((int) (tnVar.H8 * 255.0f));
            paint6 = tnVar.z8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = kmVar3.getMeasuredWidth();
                float measuredHeight2 = kmVar3.getMeasuredHeight();
                paint7 = tnVar.z8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = tnVar.B8;
            f9 = tnVar.D8;
            float f55 = f9 * 255.0f;
            view = tnVar.F8;
            paint2.setAlpha((int) (f55 * (view != null ? tnVar.G8 : 1.0f)));
            paint3 = tnVar.B8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = kmVar3.getMeasuredWidth();
                float measuredHeight3 = kmVar3.getMeasuredHeight();
                paint4 = tnVar.B8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = tnVar.I8;
        if (num2 != null && tnVar.K8) {
            kmVar3.invalidate();
        }
        view2 = tnVar.F8;
        if (view2 != null) {
            view4 = tnVar.F8;
            if (view4 == tnVar.f1) {
                f50 = tnVar.G8;
                if (f50 < 1.0f) {
                    paint30 = tnVar.B8;
                    f51 = tnVar.D8;
                    f52 = tnVar.G8;
                    paint30.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                    float measuredWidth4 = kmVar3.getMeasuredWidth();
                    float measuredHeight4 = kmVar3.getMeasuredHeight();
                    paint31 = tnVar.B8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = tnVar.F8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f42 = tnVar.G8;
                    if (f42 < 1.0f) {
                        view20 = tnVar.F8;
                        float left = view20.getLeft();
                        view21 = tnVar.F8;
                        float top = view21.getTop();
                        view22 = tnVar.F8;
                        float right = view22.getRight();
                        view23 = tnVar.F8;
                        float bottom = view23.getBottom();
                        f46 = tnVar.G8;
                        int i15 = (int) (f46 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = tnVar.F8;
                    float left2 = view12.getLeft();
                    view13 = tnVar.F8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = tnVar.F8;
                    lVar6 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    if (view14 == lVar6.getBackButton()) {
                        view16 = tnVar.F8;
                        float x4 = view16.getX();
                        view17 = tnVar.F8;
                        canvas3.translate(x4 - view17.getLeft(), 0.0f);
                        view18 = tnVar.F8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = tnVar.F8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, tnVar.C8);
                    }
                    view15 = tnVar.F8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f43 = tnVar.G8;
                    if (f43 < 1.0f) {
                        paint23 = tnVar.B8;
                        f44 = tnVar.D8;
                        f45 = tnVar.G8;
                        paint23.setAlpha((int) ((1.0f - f45) * f44 * 255.0f));
                        float measuredWidth6 = kmVar3.getMeasuredWidth();
                        float measuredHeight6 = kmVar3.getMeasuredHeight();
                        paint24 = tnVar.B8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    omVar = tnVar.t0;
                    float y8 = ((omVar.getY() + tnVar.o9) - tnVar.q9) - AndroidUtilities.dp(4.0f);
                    view6 = tnVar.F8;
                    if (view6 instanceof org.telegram.ui.Cells.s1) {
                        view11 = tnVar.F8;
                        groupedMessages = ((org.telegram.ui.Cells.s1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    omVar2 = tnVar.t0;
                    int childCount = omVar2.getChildCount();
                    int i16 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = kmVar3.x0;
                        f10 = 20.0f;
                        arrayList2 = kmVar3.w0;
                        arrayList3 = kmVar3.v0;
                        arrayList4 = kmVar3.y0;
                        if (i16 >= childCount) {
                            break;
                        }
                        omVar3 = tnVar.t0;
                        View childAt = omVar3.getChildAt(i16);
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
                        float f56 = y8;
                        view7 = tnVar.F8;
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
                                f14 = 9.0f;
                                f15 = 1.0f;
                                z10 = z13;
                            } else {
                                f14 = 9.0f;
                                float E2 = s1Var3.E2(true);
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
                                float dp = f61 < (tnVar.o9 - ((float) tnVar.q9)) - ((float) AndroidUtilities.dp(20.0f)) ? (tnVar.o9 - tnVar.q9) - AndroidUtilities.dp(20.0f) : f61;
                                omVar20 = tnVar.t0;
                                if (f60 > AndroidUtilities.dp(20.0f) + omVar20.getMeasuredHeight()) {
                                    omVar22 = tnVar.t0;
                                    f60 = AndroidUtilities.dp(20.0f) + omVar22.getMeasuredHeight();
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
                                    if (tnVar.S5[messageObject.getDialogId() == tnVar.P5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
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
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - tnVar.oc) - AndroidUtilities.dp(9.0f);
                                ka0Var6 = tnVar.E1;
                                if (ka0Var6 != null) {
                                    ka0Var9 = tnVar.E1;
                                    f40 = ka0Var9.d();
                                } else {
                                    f40 = 0.0f;
                                }
                                float f62 = measuredHeight7 - f40;
                                ka0Var7 = tnVar.E1;
                                if (ka0Var7 != null) {
                                    ka0Var8 = tnVar.E1;
                                    f41 = ka0Var8.e();
                                } else {
                                    f41 = 0.0f;
                                }
                                org.telegram.ui.Cells.s1 s1Var6 = s1Var4;
                                canvas3.clipRect(0.0f, f56 + f41, getMeasuredWidth(), f62);
                                omVar21 = tnVar.t0;
                                canvas3.translate(0.0f, omVar21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                s1Var2 = s1Var6;
                                f15 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f57, (int) dp, (int) f59, (int) f60, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (s1Var2 != null && s1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            omVar4 = tnVar.t0;
                            float left3 = omVar4.getLeft();
                            omVar5 = tnVar.t0;
                            float right2 = omVar5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - tnVar.oc) - tnVar.W8(org.telegram.ui.Components.i21.c)) - AndroidUtilities.dp(f14);
                            ka0Var3 = tnVar.E1;
                            if (ka0Var3 != null) {
                                ka0Var4 = tnVar.E1;
                                float max = Math.max(0.0f, ka0Var4.e());
                                ka0Var5 = tnVar.E1;
                                f17 = Math.max(0.0f, ka0Var5.d());
                                f16 = max;
                            } else {
                                f16 = 0.0f;
                                f17 = 0.0f;
                            }
                            dk dkVar = tnVar.U;
                            if (dkVar != null && (gfVar = dkVar.i0) != null) {
                                f17 = Math.max(f17, gfVar.f ? 0.0f : Math.max(0.0f, gfVar.getMeasuredHeight() - (gfVar.c.getTranslationY() + gfVar.e)));
                            }
                            float f63 = f56 + f16;
                            float f64 = measuredHeight8 - f17;
                            if (s1Var2 == null || !s1Var2.getTransitionParams().w0) {
                                omVar6 = tnVar.t0;
                                left3 = Math.max(left3, view8.getX() + omVar6.getLeft());
                                omVar7 = tnVar.t0;
                                f63 = Math.max(f63, view8.getY() + omVar7.getY());
                                omVar8 = tnVar.t0;
                                right2 = Math.min(right2, view8.getX() + omVar8.getLeft() + view8.getMeasuredWidth());
                                omVar9 = tnVar.t0;
                                f64 = Math.min(f64, view8.getY() + omVar9.getY() + view8.getMeasuredHeight());
                            }
                            float f65 = f64;
                            float f66 = f63;
                            float f67 = right2;
                            float max2 = Math.max(left3, tnVar.R8());
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
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(true);
                                    num12 = tnVar.I8;
                                    s1Var2.setScrimReaction(num12);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(true);
                                    num11 = tnVar.I8;
                                    v0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f20, f38, f21, f19);
                                omVar18 = tnVar.t0;
                                float x10 = view8.getX() + omVar18.getLeft();
                                omVar19 = tnVar.t0;
                                canvas4.translate(x10, view8.getY() + omVar19.getY());
                                if (s1Var2 != null && groupedMessages3 == null && s1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (s1Var2 == null || !s1Var2.U2()) {
                                    f18 = f38;
                                } else {
                                    canvas4.save();
                                    f18 = f38;
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (v0Var != null) {
                                    v0Var.A(canvas4);
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
                                f18 = f66;
                                f19 = f65;
                                view9 = view8;
                                f20 = max2;
                                f21 = f67;
                            }
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePosition;
                            if (groupedMessagePosition2 != null || (s1Var2 != null && s1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(s1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && s1Var2.T2())) {
                                        arrayList2.add(s1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & s1Var2.t0()) != 0) {
                                    arrayList5.add(s1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i19 = groupedMessagePosition2.flags;
                                    if ((i19 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(s1Var2);
                            }
                            num5 = tnVar.I8;
                            if (num5 == null || s1Var2 == null || groupedMessages3 != null) {
                                float f68 = f21;
                                float f69 = f20;
                                View view27 = view9;
                                float f70 = f19;
                                float f71 = f18;
                                f22 = f56;
                                num6 = tnVar.I8;
                                if (num6 != null && v0Var != null) {
                                    paint13 = tnVar.z8;
                                    if (paint13 != null) {
                                        matrix7 = tnVar.A8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / tnVar.x8.getWidth();
                                        matrix8 = tnVar.A8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = tnVar.y8;
                                        matrix9 = tnVar.A8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = tnVar.z8;
                                        paint16.setAlpha((int) (tnVar.H8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = tnVar.z8;
                                        v0Var2 = v0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        v0Var2 = v0Var;
                                        paint14 = tnVar.B8;
                                        f23 = tnVar.D8;
                                        f24 = tnVar.G8;
                                        paint14.setAlpha((int) (f24 * f23 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = tnVar.B8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f66 < f65) {
                                        f25 = tnVar.D8;
                                        f26 = tnVar.G8;
                                        float f72 = (f26 * f25) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f27 = tnVar.G8;
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
                                        omVar10 = tnVar.t0;
                                        float x11 = view27.getX() + omVar10.getLeft();
                                        omVar11 = tnVar.t0;
                                        canvas3.translate(x11, view27.getY() + omVar11.getY() + view27.getPaddingTop());
                                        num7 = tnVar.I8;
                                        boolean z14 = tnVar.E8;
                                        kg.r0 r0Var = v0Var2.y0;
                                        if (!r0Var.b) {
                                            org.telegram.ui.ActionBar.c6 c6Var = v0Var2.U0;
                                            if (c6Var != null) {
                                                c6Var.l(v0Var2.q0, v0Var2.p0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.r0);
                                            } else {
                                                org.telegram.ui.ActionBar.g6.q(v0Var2.q0, v0Var2.p0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.r0);
                                            }
                                            r0Var.D = f72;
                                            r0Var.E = z14;
                                            r0Var.d(canvas3, v0Var2.e2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        omVar12 = tnVar.t0;
                                        float x12 = view27.getX() + omVar12.getLeft();
                                        omVar13 = tnVar.t0;
                                        canvas3.translate(x12, view27.getY() + omVar13.getY() + view27.getPaddingTop());
                                        int i20 = tnVar.J8;
                                        num8 = tnVar.I8;
                                        v0Var2.D(this, canvas3, i20, num8, f72);
                                        kmVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = tnVar.z8;
                                if (paint18 != null) {
                                    matrix10 = tnVar.A8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / tnVar.x8.getWidth();
                                    matrix11 = tnVar.A8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = tnVar.y8;
                                    matrix12 = tnVar.A8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = tnVar.z8;
                                    paint21.setAlpha((int) (tnVar.H8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = tnVar.z8;
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    paint19 = tnVar.B8;
                                    f31 = tnVar.D8;
                                    f32 = tnVar.G8;
                                    paint19.setAlpha((int) (f32 * f31 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = tnVar.B8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f66 < f65) {
                                    f33 = tnVar.D8;
                                    f34 = tnVar.G8;
                                    float f74 = (f34 * f33) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f35 = tnVar.G8;
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
                                    omVar14 = tnVar.t0;
                                    float x13 = view10.getX() + omVar14.getLeft();
                                    omVar15 = tnVar.t0;
                                    canvas5.translate(x13, view10.getY() + omVar15.getY() + view10.getPaddingTop());
                                    num9 = tnVar.I8;
                                    s1Var2.h2(canvas5, num9, f74, tnVar.E8);
                                    canvas5.restore();
                                    canvas5.save();
                                    omVar16 = tnVar.t0;
                                    float x14 = view10.getX() + omVar16.getLeft();
                                    omVar17 = tnVar.t0;
                                    canvas5.translate(x14, view10.getY() + omVar17.getY() + view10.getPaddingTop());
                                    int i21 = tnVar.J8;
                                    num10 = tnVar.I8;
                                    f22 = f56;
                                    s1Var2.i2(this, canvas5, i21, num10, f74);
                                    canvas.restore();
                                } else {
                                    f22 = f56;
                                }
                            }
                            kmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f22 = f56;
                            kmVar2 = this;
                        }
                        i16 = i12 + 1;
                        kmVar3 = kmVar2;
                        y8 = f22;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    kmVar = kmVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f11 = 1.0f;
                    float f77 = y8;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            kmVar.a0(canvas3, f77, (org.telegram.ui.Cells.s1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            kmVar.a0(canvas3, f77, (org.telegram.ui.Cells.s1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.s1 s1Var7 = (org.telegram.ui.Cells.s1) arrayList.get(i24);
                            if (s1Var7.getCurrentPosition() != null || s1Var7.getTransitionParams().w0) {
                                kmVar.a0(canvas3, f77, s1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.s1 s1Var8 = (org.telegram.ui.Cells.s1) arrayList4.get(i25);
                            if (s1Var8.getCurrentPosition() != null || s1Var8.getTransitionParams().w0) {
                                kmVar.a0(canvas3, f77, s1Var8, 3);
                            }
                        }
                    }
                    num3 = tnVar.I8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = tnVar.z8;
                        if (paint8 != null) {
                            matrix4 = tnVar.A8;
                            matrix4.reset();
                            float measuredWidth13 = kmVar.getMeasuredWidth() / tnVar.x8.getWidth();
                            matrix5 = tnVar.A8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = tnVar.y8;
                            matrix6 = tnVar.A8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = tnVar.z8;
                            paint11.setAlpha((int) (tnVar.H8 * 255.0f));
                            float measuredWidth14 = kmVar.getMeasuredWidth();
                            float measuredHeight13 = kmVar.getMeasuredHeight();
                            paint12 = tnVar.z8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = tnVar.B8;
                            f12 = tnVar.D8;
                            f13 = tnVar.G8;
                            paint9.setAlpha((int) (f13 * f12 * 255.0f));
                            float measuredWidth15 = kmVar.getMeasuredWidth();
                            float measuredHeight14 = kmVar.getMeasuredHeight();
                            paint10 = tnVar.B8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.s1 s1Var9 = (org.telegram.ui.Cells.s1) arrayList4.get(i26);
                            if (s1Var9.getCurrentPosition() != null || s1Var9.getTransitionParams().w0) {
                                kmVar.a0(canvas3, f77, s1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = tnVar.I8;
                    if (num13 == null) {
                        f47 = tnVar.G8;
                        if (f47 < f11) {
                            paint25 = tnVar.z8;
                            if (paint25 != null) {
                                matrix13 = tnVar.A8;
                                matrix13.reset();
                                float measuredWidth16 = kmVar.getMeasuredWidth() / tnVar.x8.getWidth();
                                matrix14 = tnVar.A8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = tnVar.y8;
                                matrix15 = tnVar.A8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = tnVar.z8;
                                paint28.setAlpha((int) (tnVar.H8 * 255.0f));
                                float measuredWidth17 = kmVar.getMeasuredWidth();
                                float measuredHeight15 = kmVar.getMeasuredHeight();
                                paint29 = tnVar.z8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = tnVar.B8;
                                f48 = tnVar.D8;
                                f49 = tnVar.G8;
                                paint26.setAlpha((int) ((f11 - f49) * f48 * 255.0f));
                                float measuredWidth18 = kmVar.getMeasuredWidth();
                                float measuredHeight16 = kmVar.getMeasuredHeight();
                                paint27 = tnVar.B8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            kmVar = kmVar3;
            f10 = 20.0f;
            f11 = 1.0f;
            num13 = tnVar.I8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            kmVar = kmVar3;
            f10 = 20.0f;
        }
        view3 = tnVar.F8;
        if (view3 != null || ((ArrayList) tnVar.I9.c).size() > 0) {
            ka0Var = tnVar.E1;
            if (ka0Var != null) {
                ka0Var2 = tnVar.E1;
            }
            super.drawChild(canvas3, tnVar.f1, SystemClock.uptimeMillis());
            uj ujVar = tnVar.T2;
            if (ujVar != null && ujVar.getTag() != null) {
                super.drawChild(canvas3, tnVar.T2, SystemClock.uptimeMillis());
            }
            tj tjVar = tnVar.U2;
            if (tjVar != null && tjVar.getTag() != null) {
                super.drawChild(canvas3, tnVar.U2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.n00 n00Var = tnVar.i9;
            if (n00Var != null) {
                super.drawChild(canvas3, n00Var, SystemClock.uptimeMillis());
            }
            fh.k kVar = tnVar.T9;
            if (kVar != null) {
                super.drawChild(canvas3, kVar, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.g40 g40Var3 = tnVar.a2;
            if (g40Var3 != null) {
                super.drawChild(canvas3, g40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = tnVar.u3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, tnVar.u3, SystemClock.uptimeMillis());
            }
            al alVar = tnVar.v3;
            if (alVar != null && alVar.getVisibility() == 0) {
                super.drawChild(canvas3, tnVar.v3, SystemClock.uptimeMillis());
            }
            nh.t3 t3Var = tnVar.t1;
            if (t3Var != null && t3Var.getVisibility() == 0) {
                super.drawChild(canvas3, tnVar.t1, SystemClock.uptimeMillis());
            }
            pl plVar = tnVar.x1;
            if (plVar != null && plVar.getVisibility() == 0) {
                super.drawChild(canvas3, tnVar.x1, SystemClock.uptimeMillis());
            }
            nh.t3 t3Var2 = tnVar.v1;
            if (t3Var2 != null && t3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, tnVar.v1, SystemClock.uptimeMillis());
            }
            dk dkVar2 = tnVar.U;
            if (dkVar2 != null && dkVar2.H != null) {
                canvas3.save();
                canvas3.translate(tnVar.U.H.getX() + tnVar.U.getX(), tnVar.U.H.getY() + tnVar.U.getY());
                tnVar.U.H.draw(canvas3);
                canvas3.restore();
            }
        }
        if (tnVar.la > 0 && kmVar.f < AndroidUtilities.dp(f10)) {
            int themedColor = tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6);
            if (kmVar.z0 == null) {
                kmVar.z0 = new Paint();
            }
            if (kmVar.A0 != themedColor) {
                Paint paint32 = kmVar.z0;
                kmVar.A0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, kmVar.getMeasuredHeight() - tnVar.la, kmVar.getMeasuredWidth(), kmVar.getMeasuredHeight(), kmVar.z0);
            canvas3 = canvas6;
        }
        np npVar = tnVar.L9;
        if (npVar != null && npVar.e()) {
            int inputBubbleTop = (int) tnVar.O.getInputBubbleTop();
            int inputBubbleBottom = (int) tnVar.O.getInputBubbleBottom();
            tn tnVar2 = tnVar.P9;
            int i27 = inputBubbleTop - ((int) (tnVar.Q9 * (tnVar2 == null ? 0.0f : tnVar2.K9)));
            np npVar2 = tnVar.L9;
            kmVar.getMeasuredWidth();
            npVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (tnVar.P9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, kmVar.getMeasuredWidth(), kmVar.getMeasuredHeight(), (int) (tnVar.Q9 * 255.0f), 31);
            canvas3 = canvas;
            tnVar.P9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        tnVar.ta.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (tnVar.ga) {
            canvas3.save();
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            float x15 = lVar.getX();
            lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            canvas3.translate(x15, lVar2.getY());
            lVar3 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            float width = lVar3.getWidth();
            lVar4 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, lVar4.getHeight(), (int) (tnVar.ha * 255.0f), 31);
            lVar5 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            lVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zk zkVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (zkVar = this.F0.Aa) == null || !zkVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        zkVar.a(true);
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
        mk mkVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.F0;
        sg.d dVar = tnVar.J3;
        if (dVar != null) {
            dVar.n = SystemClock.uptimeMillis();
        }
        float y8 = (AndroidUtilities.isInMultiwindow || tnVar.isInBubbleMode()) ? (tnVar.U.getEmojiView() != null ? tnVar.U.getEmojiView() : tnVar.U).getY() : tnVar.U.getY();
        View view = tnVar.F8;
        if (view != null) {
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        }
        dk dkVar = tnVar.U;
        if (dkVar == null || !dkVar.u3 || motionEvent.getY() >= y8) {
            tnVar.f9 = motionEvent.getY();
            org.telegram.ui.Cells.w9 o10 = tnVar.Y8.o(getContext());
            motionEvent.offsetLocation(-o10.getX(), -o10.getY());
            if (!tnVar.Y8.y() || !tnVar.Y8.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o10.getX(), o10.getY());
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                nh.g1 g1Var = tnVar.m1;
                if (g1Var != null) {
                    if (tnVar.q3 != null) {
                        z10 = g1Var.A(motionEvent);
                        if (tnVar.m1.D) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !tnVar.Y8.y() || (motionEvent.getY() >= tnVar.t0.getTop() && motionEvent.getY() <= tnVar.t0.getBottom())) {
                            mkVar = tnVar.sa;
                            if (!mkVar.n) {
                                return mkVar.g(motionEvent);
                            }
                            ab.m mVar = ab.m.e;
                            if (mVar == null || !mVar.a) {
                                if (tnVar.isInPreviewMode() && tnVar.F9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (tnVar.f1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                l3.g0 g0Var = tnVar.f1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
                                                if (g0Var != null) {
                                                    ((tg.b) g0Var.b).getLocationInWindow(iArr2);
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
                                        gj gjVar = tnVar.W0;
                                        if (gjVar != null) {
                                            gjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], tnVar.W0.getMeasuredWidth() + i13, tnVar.W0.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.B0 = motionEvent.getX();
                                                    this.C0 = motionEvent.getY();
                                                    this.D0 = SystemClock.elapsedRealtime();
                                                    this.E0 = z12;
                                                    gj gjVar2 = tnVar.W0;
                                                    if (gjVar2 != null) {
                                                        gjVar2.d0.c(z12);
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
                                        gj gjVar3 = tnVar.W0;
                                        if (gjVar3 != null) {
                                            gjVar3.d0.c(false);
                                        }
                                        if (this.E0 || (i7.z5.a(this.B0, this.C0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.D0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.E0) {
                                                b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                                                tnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) b5Var2).P(ProfileActivity.m4(tnVar.P5));
                                            } else {
                                                b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
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
                                s4 s4Var = (s4) ab.m.i().d;
                                if (s4Var != null) {
                                    s4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o10.getX(), -o10.getY());
                            if (tnVar.Y8.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o10.getX(), o10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = g1Var.e;
                        if (g1Var.D) {
                            g1Var.E = true;
                            g1Var.D = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(g1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            g1Var.d = 0;
                            g1Var.c = 1.0f;
                            org.telegram.ui.Components.o71 o71Var = g1Var.I;
                            if (o71Var != null) {
                                o71Var.e(1.0f, 0, g1Var.b);
                            }
                            g1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                mkVar = tnVar.sa;
                if (!mkVar.n) {
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
        cg.i0 i0Var;
        org.telegram.ui.ActionBar.l lVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        hk hkVar;
        MessageObject messageObject;
        xk xkVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        tn tnVar = this.F0;
        boolean z12 = false;
        if ((tnVar.F8 == null && ((ArrayList) tnVar.I9.c).size() <= 0) || (view != tnVar.f1 && view != tnVar.T2 && view != tnVar.U2 && view != tnVar.i9 && view != tnVar.T9 && view != tnVar.a2 && view != null && view != tnVar.u3 && view != tnVar.v3)) {
            if ((view != tnVar.u3 || !PhotoViewer.t1().Q1()) && (!tnVar.O9 || view != tnVar.t0)) {
                if (tnVar.ga) {
                    lVar3 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                }
                if (view != tnVar.X2) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (i0Var = tnVar.u2) != null && i0Var.a() && tnVar.u2.getTag() != null) {
                            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                            if (view != lVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == tnVar.p8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    } else {
                        if (view != tnVar.t0) {
                            if (view != tnVar.O) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == tnVar.p8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-tnVar.J9) - (tnVar.Q9 != 0.0f ? (tnVar.t0.getMeasuredHeight() - tnVar.J9) * tnVar.Q9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.g6.k3 != null && tnVar.r8.d) {
                                            int x4 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y8 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(tnVar.p8.getScaleX(), tnVar.p8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.g6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.g6.k3.setBounds(x4, y8, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(tnVar.C9()) + x4, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(tnVar.C9()) + y8);
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
                                if (view == tnVar.O && (xkVar = tnVar.X2) != null && xkVar.getVisibility() == 0) {
                                    super.drawChild(canvas, tnVar.X2, j10);
                                }
                                z12 = super.drawChild(canvas, view, j10);
                                if (z11 && view == tnVar.t0 && playingMessageObject.type != 5 && (hkVar = tnVar.p8) != null && hkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-tnVar.J9) - (tnVar.Q9 != 0.0f ? (tnVar.t0.getMeasuredHeight() - tnVar.J9) * tnVar.Q9 : 0.0f)) + tnVar.K9);
                                    super.drawChild(canvas, tnVar.p8, j10);
                                    if (tnVar.q8 != null) {
                                        canvas.save();
                                        canvas.translate(tnVar.q8.getX(), tnVar.t0.getY() + tnVar.q8.getTop());
                                        if (z10) {
                                            tnVar.q8.g2(canvas);
                                            invalidate();
                                            tnVar.q8.invalidate();
                                        } else {
                                            tnVar.q8.Y1(canvas);
                                            org.telegram.ui.Cells.s1 s1Var = tnVar.q8;
                                            if (!s1Var.rb && ((messageObject = s1Var.u7) == null || messageObject.type != 27)) {
                                                s1Var.m2(s1Var.getAlpha(), canvas, true);
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
                        if (view == tnVar.p8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.hv0
    public float getBottomOffset() {
        return this.F0.t0.getBottom();
    }

    public tn getChatActivity() {
        return this.F0;
    }

    @Override // org.telegram.ui.Components.hv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.hv0
    public int getKeyboardHeight() {
        if (this.F0.Ka) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.hv0
    public float getListTranslationY() {
        return this.F0.t0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.hv0
    public Drawable getNewDrawable() {
        Drawable d = this.F0.aa.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.hv0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.F0.aa.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.hv0
    public int getScrollOffset() {
        return this.F0.t0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        tn tnVar = this.F0;
        if (tnVar.Ka) {
            this.D.b = tnVar.T0;
        } else {
            b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.D;
                    b5Var3 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
                    q1Var.b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.D.c();
        tnVar.U.setAdjustPanLayoutHelper(this.D);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == tnVar.P5)) {
            MediaController.getInstance().setTextureView(tnVar.N7(false), tnVar.r8, tnVar.p8, true);
        }
        np npVar = tnVar.L9;
        if (npVar != null) {
            npVar.f();
        }
        tnVar.ta.j();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.D.d();
        tn tnVar = this.F0;
        np npVar = tnVar.L9;
        if (npVar != null) {
            NotificationCenter.getInstance(npVar.a0).removeObserver(npVar, NotificationCenter.updateInterfaces);
            npVar.B.onDetachedFromWindow();
            org.telegram.ui.Components.p5 p5Var = npVar.g0;
            if (p5Var != null && (view = npVar.W) != null) {
                p5Var.o(view);
            }
            npVar.M = 0.0f;
            npVar.L = 0L;
            tnVar.L9 = null;
        }
        tnVar.ta.k();
        AndroidUtilities.runOnUIThread(new ag.o0(26));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        tn tnVar;
        cg.i0 i0Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (i0Var = (tnVar = this.F0).u2) == null || !i0Var.a() || tnVar.u2.getTag() == null) {
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
    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int e10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int dp;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar3;
        int i21;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        tn tnVar = this.F0;
        ah.i iVar = tnVar.v;
        int i22 = (measuredWidth - tnVar.Qa) - tnVar.Ra;
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
                    e10 = j7.l1.e(i22, measuredWidth2, 2, tnVar.Qa) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = tnVar.Qa + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            lVar5 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                            if (childAt != lVar5) {
                                lVar6 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                if (lVar6.getVisibility() == 0) {
                                    lVar7 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                    i18 += lVar7.getMeasuredHeight();
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
                            if (childAt != tnVar.I9 && childAt != tnVar.T9 && childAt != tnVar.O && !(childAt instanceof org.telegram.ui.Components.g40) && !(childAt instanceof org.telegram.ui.Components.kp)) {
                                if (childAt instanceof org.telegram.ui.Cells.w9) {
                                    i20 = tnVar.va;
                                } else if (childAt == tnVar.M0) {
                                    lVar3 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                    if (lVar3.getVisibility() == 0) {
                                        lVar4 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                        i21 = lVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (tnVar.U.u0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.o2) tnVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = tnVar.U.getBottom();
                                        }
                                    }
                                    i18 = tnVar.U.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    dk dkVar = tnVar.U;
                                    if (dkVar != null && (childAt == dkVar.J1 || childAt == dkVar.I1)) {
                                        i18 = b.u(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == tnVar.s2) {
                                        i18 = b.u(7.0f, iVar.d(), i18);
                                    } else if (dkVar == null || childAt != dkVar.a1) {
                                        if (childAt == tnVar.a2 || childAt == tnVar.o2 || childAt == tnVar.b2) {
                                            i19 = this.s0;
                                        } else if (childAt == tnVar.t0 || childAt == tnVar.r0 || childAt == tnVar.T2 || childAt == tnVar.U2 || childAt == tnVar.V2) {
                                            i20 = tnVar.va;
                                        } else if (childAt != tnVar.L) {
                                            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                            if (childAt == lVar) {
                                                i18 -= getPaddingTop();
                                                if (tnVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == tnVar.p8) {
                                                lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                                i18 = lVar2.getMeasuredHeight();
                                            } else if (childAt != tnVar.X2 && childAt != tnVar.Y2 && childAt != tnVar.q0) {
                                                if (childAt instanceof org.telegram.ui.Components.rb0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != tnVar.P) {
                                                    if (childAt != tnVar.J3) {
                                                    }
                                                }
                                            }
                                        } else if (dkVar.z0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = b.u(9.0f, iVar.d(), i18);
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
                    e10 = (measuredWidth - tnVar.Ra) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = e10 - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        tj tjVar = tnVar.U2;
        if (tjVar != null) {
            tjVar.setBackgroundHeight(getMeasuredHeight());
        }
        tnVar.o9();
        tnVar.r9();
        tnVar.Mc(false, false);
        S();
        tnVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0531  */
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
        org.telegram.ui.Components.mc mcVar;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        int i14;
        org.telegram.ui.ActionBar.l lVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.w0 w0Var;
        TLRPC.User user;
        tn tnVar = this.F0;
        ah.i iVar = tnVar.v;
        tnVar.zc.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - tnVar.Qa) - tnVar.Ra;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        qg.a aVar = tnVar.H.a;
        if (aVar instanceof qg.b) {
            ((qg.b) aVar).b(i15, size2);
        }
        if (this.u0 != i15) {
            tnVar.B4 = false;
            this.u0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
            if (z13 || (user = tnVar.f) == null || !user.self) {
                tnVar.G9 = false;
            } else {
                org.telegram.ui.ActionBar.h5 titleTextView = tnVar.W0.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    tnVar.G9 = !tnVar.H9;
                } else {
                    tnVar.G9 = false;
                }
            }
            if (tnVar.G9 || tnVar.H9 || UserObject.isBotForumWithEditableTopics(tnVar.f)) {
                gj gjVar = tnVar.W0;
                if (gjVar != null && gjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) tnVar.W0.getLayoutParams()).rightMargin = AndroidUtilities.dp(tnVar.N3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                gj gjVar2 = tnVar.W0;
                if (gjVar2 != null && gjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) tnVar.W0.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (tnVar.G9) {
                lVar8 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (!lVar8.j0 && (w0Var = tnVar.i0) != null) {
                    w0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = tnVar.d0;
                if (w0Var2 != null) {
                    w0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.w0 w0Var3 = tnVar.d0;
                if (w0Var3 != null) {
                    w0Var3.K(40);
                }
                org.telegram.ui.ActionBar.w0 w0Var4 = tnVar.i0;
                if (w0Var4 != null) {
                    w0Var4.setVisibility(8);
                }
            }
            lVar7 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (!lVar7.j0 && (zVar = tnVar.j0) != null) {
                zVar.f((!tnVar.H9 || tnVar.G9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = tnVar.d0;
            if (w0Var5 != null) {
                TLRPC.UserFull userFull = tnVar.W7;
                if (tnVar.H9) {
                    w0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    w0Var5.K(32);
                }
            }
            tnVar.B4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        measureChildWithMargins(lVar, makeMeasureSpec, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + tnVar.ka >= AndroidUtilities.dp(20.0f);
        if (this.t0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (tnVar.la > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            tnVar.ka = tnVar.la;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            tnVar.ka = tnVar.U.t0() ? tnVar.U.getEmojiPadding() : 0;
        } else {
            tnVar.ka = 0;
        }
        setEmojiKeyboardHeight(tnVar.ka);
        boolean z15 = this.f + tnVar.ka >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i16 = 0; i16 < tnVar.t0.getChildCount(); i16++) {
                View childAt = tnVar.t0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        tnVar.t0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            tnVar.v0.i1(R, (int) (((((tnVar.t0.getMeasuredHeight() - tnVar.o9) - tnVar.wa) + ((this.f + tnVar.ka) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(tnVar.C9()))) / 2.0f), false);
                            tnVar.w0.m(R);
                            this.D.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(tnVar.U, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
                            if (!z10 || tnVar.Ka) {
                                this.s0 = 0;
                            } else {
                                this.s0 = tnVar.U.getMeasuredHeight();
                            }
                            tnVar.va = 0;
                            tnVar.wa = 0;
                            if (SharedConfig.chatBlurEnabled() && !tnVar.Ka && tnVar.B != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = tnVar.C;
                                tnVar.va = i18;
                                tnVar.wa = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != tnVar.U) {
                                    lVar4 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                    if (childAt2 != lVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == tnVar.t0 || childAt2 == tnVar.r0 || (childAt2 instanceof org.telegram.ui.Cells.w9)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), tnVar.va + size2 + tnVar.wa), TLObject.FLAG_30));
                                            } else if (childAt2 == tnVar.L) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.s0;
                                                z12 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((tnVar.U.z0() ? 48 : 0) + 2) + (i20 - (z12 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == tnVar.X2) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                tnVar.X2.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) tnVar.pc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == tnVar.Y2) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) tnVar.pc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == tnVar.M0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (tnVar.U.u0(childAt2)) {
                                                org.telegram.ui.Components.uf ufVar = tnVar.U.C1;
                                                if (childAt2 == ufVar && ufVar != null) {
                                                    i19 = ufVar.getKeyboardHeight();
                                                }
                                                z11 = ((org.telegram.ui.ActionBar.o2) tnVar).inBubbleMode;
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
                                                wj wjVar = tnVar.E1;
                                                if (childAt2 == wjVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wjVar.getLayoutParams();
                                                    rf.v0 adapter = tnVar.E1.getAdapter();
                                                    if (adapter.s0 == null || adapter.d0) {
                                                        tnVar.E1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        tnVar.E1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == tnVar.Y8.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + tnVar.va;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || tnVar.Ka) {
                                                        lm lmVar = tnVar.Y8;
                                                        lmVar.e0 = 0;
                                                        lmVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        lm lmVar2 = tnVar.Y8;
                                                        lmVar2.e0 = keyboardHeight;
                                                        lmVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.rb0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == tnVar.N1) {
                                                    lVar5 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                                    if (lVar5.getVisibility() == 0) {
                                                        lVar6 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                                        i14 = size2 - lVar6.getMeasuredHeight();
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
                            if (tnVar.A4) {
                                tnVar.B4 = true;
                                tnVar.o9();
                                tnVar.r9();
                                tnVar.A4 = false;
                                lj ljVar = tnVar.t0;
                                ljVar.measure(View.MeasureSpec.makeMeasureSpec(ljVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(tnVar.t0.getMeasuredHeight(), TLObject.FLAG_30));
                                tnVar.B4 = false;
                            }
                            i13 = tnVar.t4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new bg.f(this, i13, 26));
                                tnVar.t4 = -1;
                            }
                            mcVar = org.telegram.ui.Components.mc.w;
                            if (mcVar != null && tnVar.Vb != null) {
                                mcVar.l();
                            }
                            tnVar.S6();
                            this.t0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.ue ueVar = tnVar.U.T3;
        AndroidUtilities.cancelRunOnUIThread(ueVar);
        ueVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(tnVar.U, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
        if (z10) {
        }
        this.s0 = 0;
        tnVar.va = 0;
        tnVar.wa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = tnVar.C;
            tnVar.va = i182;
            tnVar.wa = i182;
        }
        while (i12 < childCount) {
        }
        if (tnVar.A4) {
        }
        i13 = tnVar.t4;
        if (i13 != -1) {
        }
        mcVar = org.telegram.ui.Components.mc.w;
        if (mcVar != null) {
            mcVar.l();
        }
        tnVar.S6();
        this.t0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        tn tnVar = this.F0;
        rg.c.c(tnVar.v8, tnVar.fragmentView);
        tnVar.w8.d();
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
        tn tnVar = this.F0;
        tnVar.r9 = i11;
        tnVar.o9();
        tnVar.r9();
    }

    @Override // org.telegram.ui.Components.hv0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.hv0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.hv0
    public final void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
    }
}
