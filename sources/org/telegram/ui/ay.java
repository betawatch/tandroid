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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ay extends org.telegram.ui.Components.fa implements lh.z6 {
    public static final /* synthetic */ int r3 = 0;
    public boolean Z2;
    public boolean a3;
    public boolean b3;
    public final ey c3;
    public int d3;
    public float e3;
    public final Paint f3;
    public final RectF g3;
    public org.telegram.ui.Components.jl0 h3;
    public LongSparseArray i3;
    public Paint j3;
    public float k3;
    public float l3;
    public float m3;
    public boolean n3;
    public lh.q9 o3;
    public int p3;
    public final /* synthetic */ fy q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(fy fyVar, Context context, ey eyVar) {
        super(context, null);
        this.q3 = fyVar;
        this.a3 = true;
        this.f3 = new Paint();
        this.g3 = new RectF();
        this.l3 = 1.0f;
        this.c3 = eyVar;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        int i10 = SharedConfig.archiveHidden ? 2 : 0;
        ey eyVar = this.c3;
        eyVar.v = i10;
        mw mwVar = eyVar.n;
        if (mwVar != null) {
            mwVar.X = i10 != 0;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.k4) || view.isClickable();
    }

    @Override // lh.z6
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.q3.J);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(fy.w4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ce  */
    @Override // org.telegram.ui.Components.fa, org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f9;
        int i10;
        org.telegram.ui.Components.wc0 wc0Var;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        float f14;
        Paint paint2;
        fy fyVar;
        float f15;
        int i11;
        int i12;
        org.telegram.ui.Cells.p2 p2Var;
        int i13;
        org.telegram.ui.Cells.p2 p2Var2;
        int i14;
        int i15;
        int i16;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f16 = this.e3;
        org.telegram.ui.ActionBar.c6 c6Var = this.l2;
        Paint paint3 = this.f3;
        if (f16 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(h31.getRightPaddingSize()), this.e3), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s9, c6Var));
            paint3.setAlpha((int) (paint3.getAlpha() * this.e3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(h31.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.g6.k0.getAlpha();
            org.telegram.ui.ActionBar.g6.k0.setAlpha((int) (this.e3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(h31.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(h31.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.k0);
            org.telegram.ui.ActionBar.g6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.h3 != null) {
            if (this.i3 == null) {
                this.i3 = new LongSparseArray();
            }
            for (int i17 = 0; i17 < this.h3.getChildCount(); i17++) {
                View childAt = this.h3.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.p2) && childAt.getBottom() > 0) {
                    this.i3.put(((org.telegram.ui.Cells.p2) childAt).getDialogId(), childAt);
                }
            }
        }
        fy fyVar2 = this.q3;
        float f17 = fyVar2.A ? 0.0f : fyVar2.J;
        int i18 = TLObject.FLAG_31;
        int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i20 = 0;
        org.telegram.ui.Cells.p2 p2Var3 = null;
        float f18 = 2.14748365E9f;
        float f19 = -2.14748365E9f;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var4 = (org.telegram.ui.Cells.p2) childAt2;
                f15 = 1.0f;
                p2Var4.setRightFragmentOpenedProgress(this.e3);
                if (AndroidUtilities.isTablet()) {
                    paint2 = paint;
                    p2Var4.setDialogSelected(p2Var4.getDialogId() == fyVar2.l2.dialogId);
                } else {
                    paint2 = paint;
                }
                LongSparseArray longSparseArray = this.i3;
                if (longSparseArray == null || this.h3 == null) {
                    fyVar = fyVar2;
                } else {
                    View view2 = (View) longSparseArray.get(p2Var4.getDialogId());
                    fyVar = fyVar2;
                    this.i3.delete(p2Var4.getDialogId());
                    if (view2 != null) {
                        this.h3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i18) {
                            i18 = S;
                        }
                        if (S < i19) {
                            i19 = S;
                        }
                        p2Var4.y0 = (view2.getTop() - p2Var4.getTop()) * this.e3;
                        if (p2Var4.getTop() + p2Var4.y0 < f18) {
                            f18 = (p2Var4.getTop() + p2Var4.y0) - f17;
                        }
                        float lerp = AndroidUtilities.lerp(p2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.e3) + p2Var4.getTop() + p2Var4.y0;
                        if (lerp > f19) {
                            f19 = lerp - f17;
                        }
                    }
                }
                if (this.Z2 && p2Var4.b0(0, true) && (R = RecyclerView.R(p2Var4)) >= 0) {
                    getAdapter().m(R);
                }
                if (p2Var4.getDialogId() == fyVar.B3.getCurrentFragmetDialogId()) {
                    p2Var3 = p2Var4;
                    p2Var = p2Var3;
                } else {
                    p2Var = p2Var4;
                }
                i11 = i18;
                i12 = i19;
            } else {
                paint2 = paint;
                fyVar = fyVar2;
                f15 = 1.0f;
                i11 = i18;
                i12 = i19;
                p2Var = null;
            }
            if (this.h3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (p2Var != null) {
                    p2Var.n = -f17;
                    view = childAt2;
                    i13 = i20;
                    p2Var2 = p2Var3;
                    i14 = i11;
                    i15 = i12;
                    i16 = save;
                } else {
                    i14 = i11;
                    i16 = save;
                    i15 = i12;
                    p2Var2 = p2Var3;
                    i13 = i20;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f15 - this.e3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (p2Var != null && p2Var != p2Var2) {
                    p2Var.y0 = 0.0f;
                    p2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i16);
            } else {
                i13 = i20;
                p2Var2 = p2Var3;
                i14 = i11;
                i15 = i12;
            }
            i20 = i13 + 1;
            fyVar2 = fyVar;
            p2Var3 = p2Var2;
            i18 = i14;
            paint = paint2;
            i19 = i15;
        }
        Paint paint4 = paint;
        fy fyVar3 = fyVar2;
        if (p2Var3 != null) {
            ImageReceiver imageReceiver = p2Var3.U1;
            canvas2.save();
            this.k3 = imageReceiver.getImageY() + p2Var3.getY() + p2Var3.y0;
            p2Var3.y0 = 0.0f;
            p2Var3.n = 0.0f;
            float f20 = this.l3;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.08f;
                this.l3 = f21;
                f12 = 1.0f;
                this.l3 = Utilities.clamp(f21, 1.0f, 0.0f);
                invalidate();
            } else {
                f12 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.jr.f.getInterpolation(this.l3);
            if (interpolation != f12) {
                float f22 = this.m3;
                if (f22 != -2.14748365E9f) {
                    if (Math.abs(f22 - this.k3) < getMeasuredHeight() * 0.4f) {
                        this.k3 = AndroidUtilities.lerp(this.m3, this.k3, interpolation);
                    } else {
                        z10 = true;
                        if (this.n3 || !(z10 || this.m3 == -2.14748365E9f)) {
                            f13 = 1.0f;
                            interpolation = this.e3;
                        } else {
                            f13 = 1.0f;
                        }
                        f14 = f13 - interpolation;
                        if (f14 != f13) {
                            f9 = -2.14748365E9f;
                            this.k3 = -2.14748365E9f;
                        } else {
                            f9 = -2.14748365E9f;
                        }
                        float f23 = (-AndroidUtilities.dp(5.0f)) * f14;
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-AndroidUtilities.dp(4.0f)) + f23, this.k3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f23, imageReceiver.getImageHeight() + this.k3 + AndroidUtilities.dp(1.0f));
                        if (this.j3 == null) {
                            this.j3 = new Paint(1);
                        }
                        this.j3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.j3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.n3) {
            }
            f13 = 1.0f;
            interpolation = this.e3;
            f14 = f13 - interpolation;
            if (f14 != f13) {
            }
            float f232 = (-AndroidUtilities.dp(5.0f)) * f14;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((-AndroidUtilities.dp(4.0f)) + f232, this.k3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f232, imageReceiver.getImageHeight() + this.k3 + AndroidUtilities.dp(1.0f));
            if (this.j3 == null) {
            }
            this.j3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.j3);
            canvas2.restore();
        } else {
            f9 = -2.14748365E9f;
            this.k3 = -2.14748365E9f;
        }
        boolean z11 = false;
        if (this.i3 != null) {
            float f24 = 2.14748365E9f;
            for (int i21 = 0; i21 < this.i3.size(); i21++) {
                View view3 = (View) this.i3.valueAt(i21);
                this.h3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i19 && view3.getTop() > f9) {
                    f9 = view3.getTop();
                }
                if (S2 > i18 && view3.getBottom() < f24) {
                    f24 = view3.getBottom();
                }
            }
            for (int i22 = 0; i22 < this.i3.size(); i22++) {
                View view4 = (View) this.i3.valueAt(i22);
                if (view4 instanceof org.telegram.ui.Cells.p2) {
                    this.h3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.p2 p2Var5 = (org.telegram.ui.Cells.p2) view4;
                    p2Var5.f0 = false;
                    p2Var5.t();
                    p2Var5.f0 = true;
                    p2Var5.setRightFragmentOpenedProgress(this.e3);
                    int save2 = canvas2.save();
                    if (S3 > i18) {
                        canvas2.translate(view4.getX(), (f19 + view4.getBottom()) - f24);
                    } else {
                        canvas2.translate(view4.getX(), (f19 + view4.getTop()) - f9);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(save2);
                }
            }
            this.i3.clear();
            z11 = false;
        }
        this.Z2 = z11;
        if (this.h3 != null) {
            invalidate();
        }
        if (this.h3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint4.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            for (int i23 = 0; i23 < getChildCount(); i23++) {
                View childAt3 = getChildAt(i23);
                if (((childAt3 instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) childAt3).r) || ((childAt3 instanceof rf.k) && ((rf.k) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x4 = childAt3.getX();
                        float y8 = childAt3.getY();
                        float x10 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y10 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.g3;
                        rectF3.set(x4, y8, x10, y10);
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
        org.telegram.ui.Cells.p2 p2Var6 = fyVar3.S0;
        if (p2Var6 != null && (wc0Var = fyVar3.R0) != null) {
            int measuredHeight = (fyVar3.S0.getMeasuredHeight() / 2) + p2Var6.getTop();
            Paint paint5 = wc0Var.b;
            View view5 = wc0Var.c;
            RectF rectF4 = wc0Var.f;
            Paint paint6 = wc0Var.a;
            int dp = AndroidUtilities.dp(110.0f);
            int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r12) * wc0Var.h) - org.telegram.messenger.x3.D(62.0f, 3, dp);
            int i24 = dp / 2;
            int i25 = measuredHeight - i24;
            paint6.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            int i26 = dp2 / 2;
            float f25 = measuredHeight - i26;
            float f26 = i24 + measuredWidth;
            float f27 = i26 + measuredHeight + 1;
            canvas.drawRect(0.0f, f25, f26, f27, paint6);
            paint6.setColor(-69120);
            float f28 = dp + measuredWidth;
            rectF4.set(measuredWidth, i25, f28, i25 + dp);
            float f29 = wc0Var.g;
            int c3 = (int) (f29 < 0.5f ? b.c(f29, 0.5f, 1.0f, 35.0f) : ((f29 - 0.5f) * 35.0f) / 0.5f);
            float f30 = c3;
            float f31 = 360 - (c3 * 2);
            canvas.drawArc(rectF4, f30, f31, true, paint5);
            canvas.drawArc(rectF4, f30, f31, true, paint6);
            paint6.setColor(-16777216);
            canvas.drawCircle(f26 - AndroidUtilities.dp(8.0f), (dp / 4) + i25, AndroidUtilities.dp(8.0f), paint6);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(20.0f) + f28, measuredHeight - AndroidUtilities.dp(25.0f));
            int i27 = 0;
            for (int i28 = 3; i27 < i28; i28 = 3) {
                Path path = wc0Var.j;
                if (path != null) {
                    f10 = 20.0f;
                    if (wc0Var.k == wc0Var.l) {
                        f11 = 35.0f;
                        canvas.drawPath(wc0Var.j, paint5);
                        if (i27 != 0) {
                            paint6.setColor(-90112);
                        } else if (i27 == 1) {
                            paint6.setColor(-85326);
                        } else {
                            paint6.setColor(-16720161);
                        }
                        canvas.drawPath(wc0Var.j, paint6);
                        paint6.setColor(-1);
                        rectF4.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        paint6.setColor(-16777216);
                        rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                        i27++;
                    }
                } else {
                    f10 = 20.0f;
                }
                if (path == null) {
                    wc0Var.j = new Path();
                }
                wc0Var.j.reset();
                boolean z12 = wc0Var.k;
                wc0Var.l = z12;
                if (z12) {
                    wc0Var.j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    wc0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    wc0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    wc0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(43.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f11 = 35.0f;
                } else {
                    f11 = 35.0f;
                    wc0Var.j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    wc0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    wc0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    wc0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(50.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    wc0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                wc0Var.j.close();
                canvas.drawPath(wc0Var.j, paint5);
                if (i27 != 0) {
                }
                canvas.drawPath(wc0Var.j, paint6);
                paint6.setColor(-1);
                rectF4.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint6);
                paint6.setColor(-16777216);
                rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint6);
                canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                i27++;
            }
            canvas.restore();
            if (wc0Var.h >= 1.0f) {
                wc0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - wc0Var.e;
            wc0Var.e = currentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (wc0Var.g >= 1.0f) {
                wc0Var.g = 0.0f;
            }
            float f32 = j10;
            float f33 = (f32 / 400.0f) + wc0Var.g;
            wc0Var.g = f33;
            if (f33 > 1.0f) {
                wc0Var.g = 1.0f;
            }
            float f34 = (f32 / 2000.0f) + wc0Var.h;
            wc0Var.h = f34;
            if (f34 > 1.0f) {
                wc0Var.h = 1.0f;
            }
            float f35 = (f32 / 200.0f) + wc0Var.i;
            wc0Var.i = f35;
            if (f35 >= 1.0f) {
                wc0Var.k = !wc0Var.k;
                wc0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.o3 == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
            lh.q9[] q9VarArr = lh.q9.f;
            if (q9VarArr[i10] == null) {
                q9VarArr[i10] = new lh.q9(i10);
            }
            this.o3 = q9VarArr[i10];
        }
        this.o3.a(this);
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.q3.J) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.fa, org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return fy.w4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        ey eyVar = this.c3;
        if (eyVar.n != null && fy.w4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            eyVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.T1) {
            return false;
        }
        fy fyVar = this.q3;
        if (fyVar.X0 || this.c3.x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            fyVar.Y0 = !lVar.s();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.d3 = getPaddingTop();
        this.q3.t3 = 0.0f;
        this.c3.getClass();
    }

    @Override // org.telegram.ui.Components.fa, org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        ey[] eyVarArr;
        AnimatorSet animatorSet;
        ey eyVar = this.c3;
        int L0 = eyVar.c.L0();
        fy fyVar = this.q3;
        if (L0 != -1 && eyVar.e.y == 0 && eyVar.c.y < 0 && eyVar.a.getScrollState() != 1) {
            f2.n1 K = eyVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (eyVar.s == 0 && fyVar.Z3() && eyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.b3 = true;
                eyVar.c.h1(L0, (int) ((top - this.d3) + fyVar.t3 + 0));
                this.b3 = false;
            }
        } else if (L0 == -1 && this.a3) {
            eyVar.c.h1((eyVar.s == 0 && fyVar.Z3()) ? 1 : 0, (int) fyVar.J);
        }
        this.b3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        int i12 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (fyVar.G && !fyVar.K) {
            i12 += AndroidUtilities.dp(81.0f);
        }
        if (!fyVar.K) {
            i12 += AndroidUtilities.dp(48.0f);
        }
        this.p3 = 0;
        float S3 = fyVar.S3(false);
        org.telegram.ui.Components.fs fsVar = fyVar.F1;
        float f9 = fsVar != null ? fsVar.getMetadata().c.a : 0.0f;
        int dp = i12 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.p3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.fs fsVar2 = fyVar.F1;
        if (fsVar2 != null) {
            int c3 = (int) fsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c3;
            this.p3 += c3;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f9) * 5.0f);
        this.p3 -= AndroidUtilities.dp(Math.max(S3, f9) * 5.0f);
        int n32 = fyVar.n3();
        if (dp2 != this.U2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (fyVar.G) {
                eyVar.w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                eyVar.w.setPaddingTop(dp2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof rf.k) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.b3 = false;
        if (this.a3 && fyVar.getMessagesController().dialogsLoaded) {
            if (eyVar.s == 0 && fyVar.Z3()) {
                this.b3 = true;
                ((f2.j0) getLayoutManager()).h1(1, (int) fyVar.J);
                this.b3 = false;
            }
            this.a3 = false;
        }
        super.onMeasure(i10, i11);
        if (fyVar.h2 || dp2 == 0 || (eyVarArr = fyVar.a0) == null || eyVarArr.length <= 1 || fyVar.h3 || (animatorSet = fyVar.b3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.n1 n1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c3;
        if (this.T1) {
            return false;
        }
        fy fyVar = this.q3;
        if (fyVar.X0 || fyVar.y) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setOverScrollMode(0);
        }
        ey eyVar = this.c3;
        if (action == 1 || action == 3) {
            f2.e0 e0Var = eyVar.e;
            if (e0Var.y != 0) {
                dy dyVar = eyVar.f;
                if (dyVar.e) {
                    dyVar.f = true;
                    if (e0Var.f(null, 4) != 0 && (n1Var = eyVar.f.d) != null) {
                        View view = n1Var.a;
                        if (view instanceof org.telegram.ui.Cells.p2) {
                            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                            long dialogId = p2Var.getDialogId();
                            if (DialogObject.isFolderDialogId(dialogId)) {
                                z1(false, p2Var);
                            } else {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(dialogId);
                                if (dialog != null) {
                                    if (ChatObject.isCommunity(fyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Long.valueOf(dialogId));
                                        fyVar = fyVar;
                                        fyVar.r4(arrayList, 111, true, false, null);
                                    } else {
                                        fyVar = fyVar;
                                        i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                        if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Long.valueOf(dialogId));
                                            fyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                            fyVar.r4(arrayList2, 101, true, false, null);
                                        } else {
                                            i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                i12 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i12) == 0) {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    arrayList3.add(Long.valueOf(dialogId));
                                                    fyVar.J2 = !fyVar.g4(dialog) ? 1 : 0;
                                                    fyVar.r4(arrayList3, 100, true, false, null);
                                                } else {
                                                    i13 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        fyVar.r4(arrayList4, 102, true, false, null);
                                                    }
                                                }
                                            } else if (fyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                i14 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                fyVar.K2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                                fyVar.L2 = fyVar.K2 > 0 ? 0 : 1;
                                                fyVar.r4(arrayList5, 104, true, false, null);
                                            } else {
                                                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                if (org.telegram.ui.Components.tc.a(fyVar)) {
                                                    org.telegram.ui.Components.tc.z(fyVar, 3, 0, null).j();
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
        if (eyVar.s == 0 && ((action == 1 || action == 3) && eyVar.v == 2 && fyVar.Z3() && ((f2.j0) getLayoutManager()).L0() == 0)) {
            int paddingTop = getPaddingTop();
            org.telegram.ui.Cells.p2 Q3 = fy.Q3(eyVar);
            if (Q3 != null) {
                int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                long currentTimeMillis = System.currentTimeMillis() - fyVar.Y2;
                if (measuredHeight < dp || currentTimeMillis < 200) {
                    fyVar.a2 = true;
                    c3 = 0;
                    v0(0, measuredHeight, org.telegram.ui.Components.jr.h);
                    eyVar.v = 2;
                } else {
                    if (eyVar.v != 1) {
                        if (getViewOffset() == 0.0f) {
                            fyVar.a2 = true;
                            v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.jr.h);
                        }
                        if (!fyVar.a3) {
                            fyVar.a3 = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            mw mwVar = eyVar.n;
                            if (mwVar != null) {
                                mwVar.a(true);
                            }
                        }
                        Q3.a0();
                        eyVar.v = 1;
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
                    ofFloat.addUpdateListener(new g3(this, 10));
                    ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.x3.A(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                    ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
                    setScrollEnabled(false);
                    ofFloat.addListener(new org.telegram.ui.Components.p11(this, 27));
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

    @Override // org.telegram.ui.Components.fa, org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(f2.p0 p0Var) {
        super.setAdapter(p0Var);
        this.a3 = true;
    }

    public void setOpenRightFragmentProgress(float f9) {
        this.e3 = f9;
        invalidate();
    }

    public void setViewsOffset(float f9) {
        View m10;
        fy.w4 = f9;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f9);
        }
        if (this.A1 != -1 && (m10 = getLayoutManager().m(this.A1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f9);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f9);
            Rect rect = this.C1;
            rect.set(left, top, right, bottom);
            this.z1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean u1() {
        return true;
    }

    @Override // org.telegram.ui.Components.fa
    public final int w1() {
        return AndroidUtilities.dp(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(yw ywVar, float f9, boolean z10) {
        fy fyVar;
        org.telegram.ui.Components.jl0 jl0Var = ywVar == null ? this.h3 : this;
        if (jl0Var == null) {
            this.h3 = ywVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.p2 p2Var = null;
        org.telegram.ui.Cells.p2 p2Var2 = null;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        while (true) {
            int childCount = jl0Var.getChildCount();
            fyVar = this.q3;
            if (i11 >= childCount) {
                break;
            }
            View childAt = jl0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var3 = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var3.getDialogId() == fyVar.B3.getCurrentFragmetDialogId()) {
                    p2Var = p2Var3;
                }
                if (childAt.getTop() >= 0 && p2Var3.getDialogId() != 0 && childAt.getTop() < i10) {
                    i10 = p2Var3.getTop();
                    p2Var2 = p2Var3;
                }
            }
            i11++;
        }
        if (p2Var != null) {
            if (AndroidUtilities.dp(70.0f) * getAdapter().h() > getMeasuredHeight()) {
            }
        }
        p2Var = p2Var2;
        this.h3 = ywVar;
        if (p2Var != null) {
            if (ywVar != null) {
                ywVar.setPadding(getPaddingLeft(), this.U2, getPaddingLeft(), getPaddingBottom());
                int F = ((rf.l) ywVar.getAdapter()).F(p2Var.getDialogId());
                int top = (int) ((p2Var.getTop() - jl0Var.getPaddingTop()) + f9);
                if (F >= 0) {
                    ey eyVar = this.c3;
                    if (eyVar.s == 0 && eyVar.v == 2 && fyVar.Z3()) {
                        z11 = true;
                    }
                    int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (F * dp)) - F;
                    if (z11) {
                        paddingTop += dp;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((f2.j0) ywVar.getLayoutManager()).h1(F, top);
                }
            }
            int F2 = ((rf.l) getAdapter()).F(p2Var.getDialogId());
            int top2 = p2Var.getTop() - getPaddingTop();
            if (z10 && fyVar.G) {
                top2 += AndroidUtilities.dp(81.0f);
            }
            if (z10) {
                top2 += AndroidUtilities.dp(48.0f);
            }
            if (F2 >= 0) {
                ((f2.j0) getLayoutManager()).h1(F2, top2);
            }
        }
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        SharedConfig.toggleArchiveHidden();
        fy fyVar = this.q3;
        UndoView Y3 = fyVar.Y3();
        if (!SharedConfig.archiveHidden) {
            Y3.l(0L, 7, null, null);
            A1();
            if (!z10 || p2Var == null) {
                return;
            }
            p2Var.U();
            p2Var.invalidate();
            return;
        }
        if (p2Var != null) {
            fyVar.a2 = true;
            fyVar.X0 = true;
            int top = (p2Var.getTop() - getPaddingTop()) + p2Var.getMeasuredHeight();
            if (fyVar.G && !fyVar.A0.g()) {
                fyVar.N = true;
                top += AndroidUtilities.dp(81.0f);
            }
            v0(0, top, org.telegram.ui.Components.jr.g);
            if (z10) {
                fyVar.Z0 = true;
            } else {
                A1();
            }
        }
        Y3.l(0L, 6, null, null);
    }
}
