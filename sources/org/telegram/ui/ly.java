package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ly extends org.telegram.ui.Components.aa implements oh.a7 {
    public static final /* synthetic */ int s3 = 0;
    public boolean a3;
    public boolean b3;
    public boolean c3;
    public final oy d3;
    public int e3;
    public float f3;
    public final Paint g3;
    public final RectF h3;
    public org.telegram.ui.Components.sl0 i3;
    public LongSparseArray j3;
    public Paint k3;
    public float l3;
    public float m3;
    public float n3;
    public boolean o3;
    public oh.q9 p3;
    public int q3;
    public final /* synthetic */ py r3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(py pyVar, Context context, oy oyVar) {
        super(context, null);
        this.r3 = pyVar;
        this.b3 = true;
        this.g3 = new Paint();
        this.h3 = new RectF();
        this.m3 = 1.0f;
        this.d3 = oyVar;
        this.Y2 = AndroidUtilities.dp(200.0f);
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.m4) || view.isClickable();
    }

    @Override // oh.a7
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.r3.K);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(py.x4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ce  */
    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        int i10;
        org.telegram.ui.Components.ed0 ed0Var;
        float f11;
        float f12;
        float f13;
        boolean z4;
        float f14;
        float f15;
        Paint paint2;
        py pyVar;
        float f16;
        int i11;
        int i12;
        org.telegram.ui.Cells.r2 r2Var;
        int i13;
        org.telegram.ui.Cells.r2 r2Var2;
        int i14;
        int i15;
        int i16;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f17 = this.f3;
        org.telegram.ui.ActionBar.g6 g6Var = this.m2;
        Paint paint3 = this.g3;
        if (f17 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(a41.getRightPaddingSize()), this.f3), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s9, g6Var));
            paint3.setAlpha((int) (paint3.getAlpha() * this.f3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(a41.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.k6.k0.getAlpha();
            org.telegram.ui.ActionBar.k6.k0.setAlpha((int) (this.f3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(a41.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(a41.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
            org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.i3 != null) {
            if (this.j3 == null) {
                this.j3 = new LongSparseArray();
            }
            for (int i17 = 0; i17 < this.i3.getChildCount(); i17++) {
                View childAt = this.i3.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.r2) && childAt.getBottom() > 0) {
                    this.j3.put(((org.telegram.ui.Cells.r2) childAt).getDialogId(), childAt);
                }
            }
        }
        py pyVar2 = this.r3;
        float f18 = pyVar2.B ? 0.0f : pyVar2.K;
        int i18 = TLObject.FLAG_31;
        int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i20 = 0;
        org.telegram.ui.Cells.r2 r2Var3 = null;
        float f19 = 2.14748365E9f;
        float f20 = -2.14748365E9f;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var4 = (org.telegram.ui.Cells.r2) childAt2;
                f16 = 1.0f;
                r2Var4.setRightFragmentOpenedProgress(this.f3);
                if (AndroidUtilities.isTablet()) {
                    paint2 = paint;
                    r2Var4.setDialogSelected(r2Var4.getDialogId() == pyVar2.m2.dialogId);
                } else {
                    paint2 = paint;
                }
                LongSparseArray longSparseArray = this.j3;
                if (longSparseArray == null || this.i3 == null) {
                    pyVar = pyVar2;
                } else {
                    View view2 = (View) longSparseArray.get(r2Var4.getDialogId());
                    pyVar = pyVar2;
                    this.j3.delete(r2Var4.getDialogId());
                    if (view2 != null) {
                        this.i3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i18) {
                            i18 = S;
                        }
                        if (S < i19) {
                            i19 = S;
                        }
                        r2Var4.z0 = (view2.getTop() - r2Var4.getTop()) * this.f3;
                        if (r2Var4.getTop() + r2Var4.z0 < f19) {
                            f19 = (r2Var4.getTop() + r2Var4.z0) - f18;
                        }
                        float lerp = AndroidUtilities.lerp(r2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.f3) + r2Var4.getTop() + r2Var4.z0;
                        if (lerp > f20) {
                            f20 = lerp - f18;
                        }
                    }
                }
                if (this.a3 && r2Var4.b0(0, true) && (R = RecyclerView.R(r2Var4)) >= 0) {
                    getAdapter().m(R);
                }
                if (r2Var4.getDialogId() == pyVar.C3.getCurrentFragmetDialogId()) {
                    r2Var3 = r2Var4;
                    r2Var = r2Var3;
                } else {
                    r2Var = r2Var4;
                }
                i11 = i18;
                i12 = i19;
            } else {
                paint2 = paint;
                pyVar = pyVar2;
                f16 = 1.0f;
                i11 = i18;
                i12 = i19;
                r2Var = null;
            }
            if (this.i3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (r2Var != null) {
                    r2Var.n = -f18;
                    view = childAt2;
                    i13 = i20;
                    r2Var2 = r2Var3;
                    i14 = i11;
                    i15 = i12;
                    i16 = save;
                } else {
                    i14 = i11;
                    i16 = save;
                    i15 = i12;
                    r2Var2 = r2Var3;
                    i13 = i20;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f16 - this.f3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (r2Var != null && r2Var != r2Var2) {
                    r2Var.z0 = 0.0f;
                    r2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i16);
            } else {
                i13 = i20;
                r2Var2 = r2Var3;
                i14 = i11;
                i15 = i12;
            }
            i20 = i13 + 1;
            pyVar2 = pyVar;
            r2Var3 = r2Var2;
            i18 = i14;
            paint = paint2;
            i19 = i15;
        }
        Paint paint4 = paint;
        py pyVar3 = pyVar2;
        if (r2Var3 != null) {
            ImageReceiver imageReceiver = r2Var3.V1;
            canvas2.save();
            this.l3 = imageReceiver.getImageY() + r2Var3.getY() + r2Var3.z0;
            r2Var3.z0 = 0.0f;
            r2Var3.n = 0.0f;
            float f21 = this.m3;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.08f;
                this.m3 = f22;
                f13 = 1.0f;
                this.m3 = Utilities.clamp(f22, 1.0f, 0.0f);
                invalidate();
            } else {
                f13 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.pr.f.getInterpolation(this.m3);
            if (interpolation != f13) {
                float f23 = this.n3;
                if (f23 != -2.14748365E9f) {
                    if (Math.abs(f23 - this.l3) < getMeasuredHeight() * 0.4f) {
                        this.l3 = AndroidUtilities.lerp(this.n3, this.l3, interpolation);
                    } else {
                        z4 = true;
                        if (this.o3 || !(z4 || this.n3 == -2.14748365E9f)) {
                            f14 = 1.0f;
                            interpolation = this.f3;
                        } else {
                            f14 = 1.0f;
                        }
                        f15 = f14 - interpolation;
                        if (f15 != f14) {
                            f10 = -2.14748365E9f;
                            this.l3 = -2.14748365E9f;
                        } else {
                            f10 = -2.14748365E9f;
                        }
                        float f24 = (-AndroidUtilities.dp(5.0f)) * f15;
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-AndroidUtilities.dp(4.0f)) + f24, this.l3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f24, imageReceiver.getImageHeight() + this.l3 + AndroidUtilities.dp(1.0f));
                        if (this.k3 == null) {
                            this.k3 = new Paint(1);
                        }
                        this.k3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.k3);
                        canvas2.restore();
                    }
                }
            }
            z4 = false;
            if (this.o3) {
            }
            f14 = 1.0f;
            interpolation = this.f3;
            f15 = f14 - interpolation;
            if (f15 != f14) {
            }
            float f242 = (-AndroidUtilities.dp(5.0f)) * f15;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((-AndroidUtilities.dp(4.0f)) + f242, this.l3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f242, imageReceiver.getImageHeight() + this.l3 + AndroidUtilities.dp(1.0f));
            if (this.k3 == null) {
            }
            this.k3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.k3);
            canvas2.restore();
        } else {
            f10 = -2.14748365E9f;
            this.l3 = -2.14748365E9f;
        }
        boolean z10 = false;
        if (this.j3 != null) {
            float f25 = 2.14748365E9f;
            for (int i21 = 0; i21 < this.j3.size(); i21++) {
                View view3 = (View) this.j3.valueAt(i21);
                this.i3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i19 && view3.getTop() > f10) {
                    f10 = view3.getTop();
                }
                if (S2 > i18 && view3.getBottom() < f25) {
                    f25 = view3.getBottom();
                }
            }
            for (int i22 = 0; i22 < this.j3.size(); i22++) {
                View view4 = (View) this.j3.valueAt(i22);
                if (view4 instanceof org.telegram.ui.Cells.r2) {
                    this.i3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.r2 r2Var5 = (org.telegram.ui.Cells.r2) view4;
                    r2Var5.g0 = false;
                    r2Var5.t();
                    r2Var5.g0 = true;
                    r2Var5.setRightFragmentOpenedProgress(this.f3);
                    int save2 = canvas2.save();
                    if (S3 > i18) {
                        canvas2.translate(view4.getX(), (f20 + view4.getBottom()) - f25);
                    } else {
                        canvas2.translate(view4.getX(), (f20 + view4.getTop()) - f10);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(save2);
                }
            }
            this.j3.clear();
            z10 = false;
        }
        this.a3 = z10;
        if (this.i3 != null) {
            invalidate();
        }
        if (this.i3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint4.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var));
            for (int i23 = 0; i23 < getChildCount(); i23++) {
                View childAt3 = getChildAt(i23);
                if (((childAt3 instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) childAt3).r) || ((childAt3 instanceof uf.j) && ((uf.j) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y10 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y11 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.h3;
                        rectF3.set(x10, y10, x11, y11);
                        canvas2.saveLayerAlpha(rectF3, (int) (childAt3.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    canvas2.translate(childAt3.getX(), childAt3.getY());
                    canvas2.drawRect(0.0f, 0.0f, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight(), paint4);
                    childAt3.draw(canvas2);
                    canvas2.restore();
                }
            }
            invalidate();
        }
        org.telegram.ui.Cells.r2 r2Var6 = pyVar3.T0;
        if (r2Var6 != null && (ed0Var = pyVar3.S0) != null) {
            int measuredHeight = (pyVar3.T0.getMeasuredHeight() / 2) + r2Var6.getTop();
            Paint paint5 = ed0Var.b;
            View view5 = ed0Var.c;
            RectF rectF4 = ed0Var.f;
            Paint paint6 = ed0Var.a;
            int dp = AndroidUtilities.dp(110.0f);
            int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r12) * ed0Var.h) - org.telegram.messenger.y3.D(62.0f, 3, dp);
            int i24 = dp / 2;
            int i25 = measuredHeight - i24;
            paint6.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            int i26 = dp2 / 2;
            float f26 = measuredHeight - i26;
            float f27 = i24 + measuredWidth;
            float f28 = i26 + measuredHeight + 1;
            canvas.drawRect(0.0f, f26, f27, f28, paint6);
            paint6.setColor(-69120);
            float f29 = dp + measuredWidth;
            rectF4.set(measuredWidth, i25, f29, i25 + dp);
            float f30 = ed0Var.g;
            int c3 = (int) (f30 < 0.5f ? b.c(f30, 0.5f, 1.0f, 35.0f) : ((f30 - 0.5f) * 35.0f) / 0.5f);
            float f31 = c3;
            float f32 = 360 - (c3 * 2);
            canvas.drawArc(rectF4, f31, f32, true, paint5);
            canvas.drawArc(rectF4, f31, f32, true, paint6);
            paint6.setColor(-16777216);
            canvas.drawCircle(f27 - AndroidUtilities.dp(8.0f), (dp / 4) + i25, AndroidUtilities.dp(8.0f), paint6);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(20.0f) + f29, measuredHeight - AndroidUtilities.dp(25.0f));
            int i27 = 0;
            for (int i28 = 3; i27 < i28; i28 = 3) {
                Path path = ed0Var.j;
                if (path != null) {
                    f11 = 20.0f;
                    if (ed0Var.k == ed0Var.l) {
                        f12 = 35.0f;
                        canvas.drawPath(ed0Var.j, paint5);
                        if (i27 != 0) {
                            paint6.setColor(-90112);
                        } else if (i27 == 1) {
                            paint6.setColor(-85326);
                        } else {
                            paint6.setColor(-16720161);
                        }
                        canvas.drawPath(ed0Var.j, paint6);
                        paint6.setColor(-1);
                        rectF4.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        paint6.setColor(-16777216);
                        rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                        i27++;
                    }
                } else {
                    f11 = 20.0f;
                }
                if (path == null) {
                    ed0Var.j = new Path();
                }
                ed0Var.j.reset();
                boolean z11 = ed0Var.k;
                ed0Var.l = z11;
                if (z11) {
                    ed0Var.j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    ed0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    ed0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    ed0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(43.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f12 = 35.0f;
                } else {
                    f12 = 35.0f;
                    ed0Var.j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    ed0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    ed0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    ed0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(50.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    ed0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                ed0Var.j.close();
                canvas.drawPath(ed0Var.j, paint5);
                if (i27 != 0) {
                }
                canvas.drawPath(ed0Var.j, paint6);
                paint6.setColor(-1);
                rectF4.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint6);
                paint6.setColor(-16777216);
                rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint6);
                canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                i27++;
            }
            canvas.restore();
            if (ed0Var.h >= 1.0f) {
                ed0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - ed0Var.e;
            ed0Var.e = currentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (ed0Var.g >= 1.0f) {
                ed0Var.g = 0.0f;
            }
            float f33 = j10;
            float f34 = (f33 / 400.0f) + ed0Var.g;
            ed0Var.g = f34;
            if (f34 > 1.0f) {
                ed0Var.g = 1.0f;
            }
            float f35 = (f33 / 2000.0f) + ed0Var.h;
            ed0Var.h = f35;
            if (f35 > 1.0f) {
                ed0Var.h = 1.0f;
            }
            float f36 = (f33 / 200.0f) + ed0Var.i;
            ed0Var.i = f36;
            if (f36 >= 1.0f) {
                ed0Var.k = !ed0Var.k;
                ed0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.p3 == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
            oh.q9[] q9VarArr = oh.q9.f;
            if (q9VarArr[i10] == null) {
                q9VarArr[i10] = new oh.q9(i10);
            }
            this.p3 = q9VarArr[i10];
        }
        this.p3.a(this);
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.r3.K) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return py.x4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        oy oyVar = this.d3;
        if (oyVar.n != null && py.x4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            oyVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.U1) {
            return false;
        }
        py pyVar = this.r3;
        if (pyVar.Y0 || this.d3.x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            pyVar.Z0 = !kVar.s();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.e3 = getPaddingTop();
        this.r3.u3 = 0.0f;
        this.d3.getClass();
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        oy[] oyVarArr;
        AnimatorSet animatorSet;
        oy oyVar = this.d3;
        int L0 = oyVar.c.L0();
        py pyVar = this.r3;
        if (L0 != -1 && oyVar.e.y == 0 && oyVar.c.y < 0 && oyVar.a.getScrollState() != 1) {
            f2.m1 K = oyVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (oyVar.s == 0 && pyVar.Z3() && oyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.c3 = true;
                oyVar.c.h1(L0, (int) ((top - this.e3) + pyVar.u3 + 0));
                this.c3 = false;
            }
        } else if (L0 == -1 && this.b3) {
            oyVar.c.h1((oyVar.s == 0 && pyVar.Z3()) ? 1 : 0, (int) pyVar.K);
        }
        this.c3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        int i12 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (pyVar.H && !pyVar.L) {
            i12 += AndroidUtilities.dp(81.0f);
        }
        if (!pyVar.L) {
            i12 += AndroidUtilities.dp(48.0f);
        }
        this.q3 = 0;
        float S3 = pyVar.S3(false);
        org.telegram.ui.Components.ls lsVar = pyVar.G1;
        float f10 = lsVar != null ? lsVar.getMetadata().c.a : 0.0f;
        int dp = i12 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.q3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.ls lsVar2 = pyVar.G1;
        if (lsVar2 != null) {
            int c3 = (int) lsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c3;
            this.q3 += c3;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        this.q3 -= AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        int n32 = pyVar.n3();
        if (dp2 != this.V2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (pyVar.H) {
                oyVar.w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                oyVar.w.setPaddingTop(dp2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof uf.j) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.c3 = false;
        if (this.b3 && pyVar.getMessagesController().dialogsLoaded) {
            if (oyVar.s == 0 && pyVar.Z3()) {
                this.c3 = true;
                ((f2.j0) getLayoutManager()).h1(1, (int) pyVar.K);
                this.c3 = false;
            }
            this.b3 = false;
        }
        super.onMeasure(i10, i11);
        if (pyVar.i2 || dp2 == 0 || (oyVarArr = pyVar.b0) == null || oyVarArr.length <= 1 || pyVar.i3 || (animatorSet = pyVar.c3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.m1 m1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c3;
        if (this.U1) {
            return false;
        }
        py pyVar = this.r3;
        if (pyVar.Y0 || pyVar.y) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setOverScrollMode(0);
        }
        oy oyVar = this.d3;
        if (action == 1 || action == 3) {
            f2.f0 f0Var = oyVar.e;
            if (f0Var.y != 0) {
                ny nyVar = oyVar.f;
                if (nyVar.e) {
                    nyVar.f = true;
                    if (f0Var.f(null, 4) != 0 && (m1Var = oyVar.f.d) != null) {
                        View view = m1Var.a;
                        if (view instanceof org.telegram.ui.Cells.r2) {
                            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                            long dialogId = r2Var.getDialogId();
                            if (DialogObject.isFolderDialogId(dialogId)) {
                                y1(false, r2Var);
                            } else {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) pyVar.getMessagesController().dialogs_dict.f(dialogId);
                                if (dialog != null) {
                                    if (ChatObject.isCommunity(pyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Long.valueOf(dialogId));
                                        pyVar = pyVar;
                                        pyVar.r4(arrayList, 111, true, false, null);
                                    } else {
                                        pyVar = pyVar;
                                        i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                        if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Long.valueOf(dialogId));
                                            pyVar.J2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                            pyVar.r4(arrayList2, 101, true, false, null);
                                        } else {
                                            i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                i12 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i12) == 0) {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    arrayList3.add(Long.valueOf(dialogId));
                                                    pyVar.K2 = !pyVar.g4(dialog) ? 1 : 0;
                                                    pyVar.r4(arrayList3, 100, true, false, null);
                                                } else {
                                                    i13 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        pyVar.r4(arrayList4, 102, true, false, null);
                                                    }
                                                }
                                            } else if (pyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                i14 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                pyVar.L2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                                pyVar.M2 = pyVar.L2 > 0 ? 0 : 1;
                                                pyVar.r4(arrayList5, 104, true, false, null);
                                            } else {
                                                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                if (org.telegram.ui.Components.qc.a(pyVar)) {
                                                    org.telegram.ui.Components.qc.z(pyVar, 3, 0, null).j();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (oyVar.s == 0 && ((action == 1 || action == 3) && oyVar.v == 2 && pyVar.Z3() && ((f2.j0) getLayoutManager()).L0() == 0)) {
            int paddingTop = getPaddingTop();
            org.telegram.ui.Cells.r2 Q3 = py.Q3(oyVar);
            if (Q3 != null) {
                int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                long currentTimeMillis = System.currentTimeMillis() - pyVar.Z2;
                if (measuredHeight < dp || currentTimeMillis < 200) {
                    pyVar.b2 = true;
                    c3 = 0;
                    v0(0, measuredHeight, org.telegram.ui.Components.pr.h);
                    oyVar.v = 2;
                } else {
                    if (oyVar.v != 1) {
                        if (getViewOffset() == 0.0f) {
                            pyVar.b2 = true;
                            v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.pr.h);
                        }
                        if (!pyVar.b3) {
                            pyVar.b3 = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            ww wwVar = oyVar.n;
                            if (wwVar != null) {
                                wwVar.a(true);
                            }
                        }
                        Q3.a0();
                        oyVar.v = 1;
                        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                        }
                    }
                    c3 = 0;
                }
                if (getViewOffset() != 0.0f) {
                    float[] fArr = new float[2];
                    fArr[c3] = getViewOffset();
                    fArr[1] = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    ofFloat.addUpdateListener(new e3(this, 10));
                    ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.y3.A(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                    ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
                    setScrollEnabled(false);
                    ofFloat.addListener(new org.telegram.ui.Components.f91(this, 18));
                    ofFloat.start();
                }
            }
        }
        return onTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(f2.p0 p0Var) {
        super.setAdapter(p0Var);
        this.b3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m9;
        py.x4 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.B1 != -1 && (m9 = getLayoutManager().m(this.B1)) != null) {
            int left = m9.getLeft();
            int top = (int) (m9.getTop() + f10);
            int right = m9.getRight();
            int bottom = (int) (m9.getBottom() + f10);
            Rect rect = this.D1;
            rect.set(left, top, right, bottom);
            this.A1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean t1() {
        return true;
    }

    @Override // org.telegram.ui.Components.aa
    public final int v1() {
        return AndroidUtilities.dp(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(ix ixVar, float f10, boolean z4) {
        py pyVar;
        org.telegram.ui.Components.sl0 sl0Var = ixVar == null ? this.i3 : this;
        if (sl0Var == null) {
            this.i3 = ixVar;
            return;
        }
        boolean z10 = false;
        org.telegram.ui.Cells.r2 r2Var = null;
        org.telegram.ui.Cells.r2 r2Var2 = null;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        while (true) {
            int childCount = sl0Var.getChildCount();
            pyVar = this.r3;
            if (i11 >= childCount) {
                break;
            }
            View childAt = sl0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var3 = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var3.getDialogId() == pyVar.C3.getCurrentFragmetDialogId()) {
                    r2Var = r2Var3;
                }
                if (childAt.getTop() >= 0 && r2Var3.getDialogId() != 0 && childAt.getTop() < i10) {
                    i10 = r2Var3.getTop();
                    r2Var2 = r2Var3;
                }
            }
            i11++;
        }
        if (r2Var != null) {
            if (AndroidUtilities.dp(70.0f) * getAdapter().h() > getMeasuredHeight()) {
            }
        }
        r2Var = r2Var2;
        this.i3 = ixVar;
        if (r2Var != null) {
            if (ixVar != null) {
                ixVar.setPadding(getPaddingLeft(), this.V2, getPaddingLeft(), getPaddingBottom());
                int F = ((uf.k) ixVar.getAdapter()).F(r2Var.getDialogId());
                int top = (int) ((r2Var.getTop() - sl0Var.getPaddingTop()) + f10);
                if (F >= 0) {
                    oy oyVar = this.d3;
                    if (oyVar.s == 0 && oyVar.v == 2 && pyVar.Z3()) {
                        z10 = true;
                    }
                    int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (F * dp)) - F;
                    if (z10) {
                        paddingTop += dp;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((f2.j0) ixVar.getLayoutManager()).h1(F, top);
                }
            }
            int F2 = ((uf.k) getAdapter()).F(r2Var.getDialogId());
            int top2 = r2Var.getTop() - getPaddingTop();
            if (z4 && pyVar.H) {
                top2 += AndroidUtilities.dp(81.0f);
            }
            if (z4) {
                top2 += AndroidUtilities.dp(48.0f);
            }
            if (F2 >= 0) {
                ((f2.j0) getLayoutManager()).h1(F2, top2);
            }
        }
    }

    public final void y1(boolean z4, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        py pyVar = this.r3;
        UndoView Y3 = pyVar.Y3();
        if (!SharedConfig.archiveHidden) {
            Y3.l(0L, 7, null, null);
            z1();
            if (!z4 || r2Var == null) {
                return;
            }
            r2Var.U();
            r2Var.invalidate();
            return;
        }
        if (r2Var != null) {
            pyVar.b2 = true;
            pyVar.Y0 = true;
            int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
            if (pyVar.H && !pyVar.B0.g()) {
                pyVar.O = true;
                top += AndroidUtilities.dp(81.0f);
            }
            v0(0, top, org.telegram.ui.Components.pr.g);
            if (z4) {
                pyVar.a1 = true;
            } else {
                z1();
            }
        }
        Y3.l(0L, 6, null, null);
    }

    public final void z1() {
        int i10 = SharedConfig.archiveHidden ? 2 : 0;
        oy oyVar = this.d3;
        oyVar.v = i10;
        ww wwVar = oyVar.n;
        if (wwVar != null) {
            wwVar.X = i10 != 0;
        }
    }
}
