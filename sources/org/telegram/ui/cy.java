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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cy extends org.telegram.ui.Components.y9 implements jh.z6 {
    public static final /* synthetic */ int r3 = 0;
    public boolean Z2;
    public boolean a3;
    public boolean b3;
    public final fy c3;
    public int d3;
    public float e3;
    public final Paint f3;
    public final RectF g3;
    public org.telegram.ui.Components.zk0 h3;
    public LongSparseArray i3;
    public Paint j3;
    public float k3;
    public float l3;
    public float m3;
    public boolean n3;
    public jh.q9 o3;
    public int p3;
    public final /* synthetic */ gy q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(gy gyVar, Context context, fy fyVar) {
        super(context, null);
        this.q3 = gyVar;
        this.a3 = true;
        this.f3 = new Paint();
        this.g3 = new RectF();
        this.l3 = 1.0f;
        this.c3 = fyVar;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        int i10 = SharedConfig.archiveHidden ? 2 : 0;
        fy fyVar = this.c3;
        fyVar.v = i10;
        nw nwVar = fyVar.n;
        if (nwVar != null) {
            nwVar.X = i10 != 0;
        }
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.j4) || view.isClickable();
    }

    @Override // jh.z6
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.q3.J);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(gy.w4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ce  */
    @Override // org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        int i10;
        org.telegram.ui.Components.lc0 lc0Var;
        float f11;
        float f12;
        float f13;
        boolean z10;
        float f14;
        float f15;
        Paint paint2;
        gy gyVar;
        float f16;
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
        float f17 = this.e3;
        org.telegram.ui.ActionBar.c6 c6Var = this.l2;
        Paint paint3 = this.f3;
        if (f17 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(g31.getRightPaddingSize()), this.e3), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s9, c6Var));
            paint3.setAlpha((int) (paint3.getAlpha() * this.e3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(g31.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.g6.k0.getAlpha();
            org.telegram.ui.ActionBar.g6.k0.setAlpha((int) (this.e3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(g31.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(g31.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.k0);
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
        gy gyVar2 = this.q3;
        float f18 = gyVar2.A ? 0.0f : gyVar2.J;
        int i18 = TLObject.FLAG_31;
        int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i20 = 0;
        org.telegram.ui.Cells.p2 p2Var3 = null;
        float f19 = 2.14748365E9f;
        float f20 = -2.14748365E9f;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var4 = (org.telegram.ui.Cells.p2) childAt2;
                f16 = 1.0f;
                p2Var4.setRightFragmentOpenedProgress(this.e3);
                if (AndroidUtilities.isTablet()) {
                    paint2 = paint;
                    p2Var4.setDialogSelected(p2Var4.getDialogId() == gyVar2.l2.dialogId);
                } else {
                    paint2 = paint;
                }
                LongSparseArray longSparseArray = this.i3;
                if (longSparseArray == null || this.h3 == null) {
                    gyVar = gyVar2;
                } else {
                    View view2 = (View) longSparseArray.get(p2Var4.getDialogId());
                    gyVar = gyVar2;
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
                        if (p2Var4.getTop() + p2Var4.y0 < f19) {
                            f19 = (p2Var4.getTop() + p2Var4.y0) - f18;
                        }
                        float lerp = AndroidUtilities.lerp(p2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.e3) + p2Var4.getTop() + p2Var4.y0;
                        if (lerp > f20) {
                            f20 = lerp - f18;
                        }
                    }
                }
                if (this.Z2 && p2Var4.b0(0, true) && (R = RecyclerView.R(p2Var4)) >= 0) {
                    getAdapter().m(R);
                }
                if (p2Var4.getDialogId() == gyVar.B3.getCurrentFragmetDialogId()) {
                    p2Var3 = p2Var4;
                    p2Var = p2Var3;
                } else {
                    p2Var = p2Var4;
                }
                i11 = i18;
                i12 = i19;
            } else {
                paint2 = paint;
                gyVar = gyVar2;
                f16 = 1.0f;
                i11 = i18;
                i12 = i19;
                p2Var = null;
            }
            if (this.h3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (p2Var != null) {
                    p2Var.n = -f18;
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
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f16 - this.e3) * 255.0f), 31);
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
            gyVar2 = gyVar;
            p2Var3 = p2Var2;
            i18 = i14;
            paint = paint2;
            i19 = i15;
        }
        Paint paint4 = paint;
        gy gyVar3 = gyVar2;
        if (p2Var3 != null) {
            ImageReceiver imageReceiver = p2Var3.U1;
            canvas2.save();
            this.k3 = imageReceiver.getImageY() + p2Var3.getY() + p2Var3.y0;
            p2Var3.y0 = 0.0f;
            p2Var3.n = 0.0f;
            float f21 = this.l3;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.08f;
                this.l3 = f22;
                f13 = 1.0f;
                this.l3 = Utilities.clamp(f22, 1.0f, 0.0f);
                invalidate();
            } else {
                f13 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.er.f.getInterpolation(this.l3);
            if (interpolation != f13) {
                float f23 = this.m3;
                if (f23 != -2.14748365E9f) {
                    if (Math.abs(f23 - this.k3) < getMeasuredHeight() * 0.4f) {
                        this.k3 = AndroidUtilities.lerp(this.m3, this.k3, interpolation);
                    } else {
                        z10 = true;
                        if (this.n3 || !(z10 || this.m3 == -2.14748365E9f)) {
                            f14 = 1.0f;
                            interpolation = this.e3;
                        } else {
                            f14 = 1.0f;
                        }
                        f15 = f14 - interpolation;
                        if (f15 != f14) {
                            f10 = -2.14748365E9f;
                            this.k3 = -2.14748365E9f;
                        } else {
                            f10 = -2.14748365E9f;
                        }
                        float f24 = (-AndroidUtilities.dp(5.0f)) * f15;
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-AndroidUtilities.dp(4.0f)) + f24, this.k3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f24, imageReceiver.getImageHeight() + this.k3 + AndroidUtilities.dp(1.0f));
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
            f14 = 1.0f;
            interpolation = this.e3;
            f15 = f14 - interpolation;
            if (f15 != f14) {
            }
            float f242 = (-AndroidUtilities.dp(5.0f)) * f15;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((-AndroidUtilities.dp(4.0f)) + f242, this.k3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f242, imageReceiver.getImageHeight() + this.k3 + AndroidUtilities.dp(1.0f));
            if (this.j3 == null) {
            }
            this.j3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.j3);
            canvas2.restore();
        } else {
            f10 = -2.14748365E9f;
            this.k3 = -2.14748365E9f;
        }
        boolean z11 = false;
        if (this.i3 != null) {
            float f25 = 2.14748365E9f;
            for (int i21 = 0; i21 < this.i3.size(); i21++) {
                View view3 = (View) this.i3.valueAt(i21);
                this.h3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i19 && view3.getTop() > f10) {
                    f10 = view3.getTop();
                }
                if (S2 > i18 && view3.getBottom() < f25) {
                    f25 = view3.getBottom();
                }
            }
            for (int i22 = 0; i22 < this.i3.size(); i22++) {
                View view4 = (View) this.i3.valueAt(i22);
                if (view4 instanceof org.telegram.ui.Cells.p2) {
                    this.h3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.p2 p2Var5 = (org.telegram.ui.Cells.p2) view4;
                    p2Var5.f0 = false;
                    p2Var5.u();
                    p2Var5.f0 = true;
                    p2Var5.setRightFragmentOpenedProgress(this.e3);
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
                if (((childAt3 instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) childAt3).r) || ((childAt3 instanceof pf.j) && ((pf.j) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x8 = childAt3.getX();
                        float y10 = childAt3.getY();
                        float x10 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y11 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.g3;
                        rectF3.set(x8, y10, x10, y11);
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
        org.telegram.ui.Cells.p2 p2Var6 = gyVar3.S0;
        if (p2Var6 != null && (lc0Var = gyVar3.R0) != null) {
            int measuredHeight = (gyVar3.S0.getMeasuredHeight() / 2) + p2Var6.getTop();
            Paint paint5 = lc0Var.b;
            View view5 = lc0Var.c;
            RectF rectF4 = lc0Var.f;
            Paint paint6 = lc0Var.a;
            int dp = AndroidUtilities.dp(110.0f);
            int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r12) * lc0Var.h) - org.telegram.messenger.y1.D(62.0f, 3, dp);
            int i24 = dp / 2;
            int i25 = measuredHeight - i24;
            paint6.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            int i26 = dp2 / 2;
            float f26 = measuredHeight - i26;
            float f27 = i24 + measuredWidth;
            float f28 = i26 + measuredHeight + 1;
            canvas.drawRect(0.0f, f26, f27, f28, paint6);
            paint6.setColor(-69120);
            float f29 = dp + measuredWidth;
            rectF4.set(measuredWidth, i25, f29, i25 + dp);
            float f30 = lc0Var.g;
            int t10 = (int) (f30 < 0.5f ? org.telegram.messenger.rl.t(f30, 0.5f, 1.0f, 35.0f) : ((f30 - 0.5f) * 35.0f) / 0.5f);
            float f31 = t10;
            float f32 = 360 - (t10 * 2);
            canvas.drawArc(rectF4, f31, f32, true, paint5);
            canvas.drawArc(rectF4, f31, f32, true, paint6);
            paint6.setColor(-16777216);
            canvas.drawCircle(f27 - AndroidUtilities.dp(8.0f), (dp / 4) + i25, AndroidUtilities.dp(8.0f), paint6);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(20.0f) + f29, measuredHeight - AndroidUtilities.dp(25.0f));
            int i27 = 0;
            for (int i28 = 3; i27 < i28; i28 = 3) {
                Path path = lc0Var.j;
                if (path != null) {
                    f11 = 20.0f;
                    if (lc0Var.k == lc0Var.l) {
                        f12 = 35.0f;
                        canvas.drawPath(lc0Var.j, paint5);
                        if (i27 != 0) {
                            paint6.setColor(-90112);
                        } else if (i27 == 1) {
                            paint6.setColor(-85326);
                        } else {
                            paint6.setColor(-16720161);
                        }
                        canvas.drawPath(lc0Var.j, paint6);
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
                    lc0Var.j = new Path();
                }
                lc0Var.j.reset();
                boolean z12 = lc0Var.k;
                lc0Var.l = z12;
                if (z12) {
                    lc0Var.j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    lc0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    lc0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    lc0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f12 = 35.0f;
                } else {
                    f12 = 35.0f;
                    lc0Var.j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    lc0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    lc0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    lc0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    lc0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                lc0Var.j.close();
                canvas.drawPath(lc0Var.j, paint5);
                if (i27 != 0) {
                }
                canvas.drawPath(lc0Var.j, paint6);
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
            if (lc0Var.h >= 1.0f) {
                lc0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - lc0Var.e;
            lc0Var.e = currentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (lc0Var.g >= 1.0f) {
                lc0Var.g = 0.0f;
            }
            float f33 = j10;
            float f34 = (f33 / 400.0f) + lc0Var.g;
            lc0Var.g = f34;
            if (f34 > 1.0f) {
                lc0Var.g = 1.0f;
            }
            float f35 = (f33 / 2000.0f) + lc0Var.h;
            lc0Var.h = f35;
            if (f35 > 1.0f) {
                lc0Var.h = 1.0f;
            }
            float f36 = (f33 / 200.0f) + lc0Var.i;
            lc0Var.i = f36;
            if (f36 >= 1.0f) {
                lc0Var.k = !lc0Var.k;
                lc0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.o3 == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
            jh.q9[] q9VarArr = jh.q9.f;
            if (q9VarArr[i10] == null) {
                q9VarArr[i10] = new jh.q9(i10);
            }
            this.o3 = q9VarArr[i10];
        }
        this.o3.a(this);
    }

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.q3.J) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return gy.w4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        fy fyVar = this.c3;
        if (fyVar.n != null && gy.w4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            fyVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.T1) {
            return false;
        }
        gy gyVar = this.q3;
        if (gyVar.X0 || this.c3.x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            gyVar.Y0 = !kVar.t();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.d3 = getPaddingTop();
        this.q3.t3 = 0.0f;
        this.c3.getClass();
    }

    @Override // org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        fy[] fyVarArr;
        AnimatorSet animatorSet;
        fy fyVar = this.c3;
        int L0 = fyVar.c.L0();
        gy gyVar = this.q3;
        if (L0 != -1 && fyVar.e.y == 0 && fyVar.c.y < 0 && fyVar.a.getScrollState() != 1) {
            f2.o1 K = fyVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (fyVar.s == 0 && gyVar.Z3() && fyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.b3 = true;
                fyVar.c.h1(L0, (int) ((top - this.d3) + gyVar.t3 + 0));
                this.b3 = false;
            }
        } else if (L0 == -1 && this.a3) {
            fyVar.c.h1((fyVar.s == 0 && gyVar.Z3()) ? 1 : 0, (int) gyVar.J);
        }
        this.b3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        int i12 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (gyVar.G && !gyVar.K) {
            i12 += AndroidUtilities.dp(81.0f);
        }
        if (!gyVar.K) {
            i12 += AndroidUtilities.dp(48.0f);
        }
        this.p3 = 0;
        float S3 = gyVar.S3(false);
        org.telegram.ui.Components.zr zrVar = gyVar.F1;
        float f10 = zrVar != null ? zrVar.getMetadata().c.a : 0.0f;
        int dp = i12 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.p3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.zr zrVar2 = gyVar.F1;
        if (zrVar2 != null) {
            int c10 = (int) zrVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c10;
            this.p3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        this.p3 -= AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        int n32 = gyVar.n3();
        if (dp2 != this.U2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (gyVar.G) {
                fyVar.w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                fyVar.w.setPaddingTop(dp2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof pf.j) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.b3 = false;
        if (this.a3 && gyVar.getMessagesController().dialogsLoaded) {
            if (fyVar.s == 0 && gyVar.Z3()) {
                this.b3 = true;
                ((f2.k0) getLayoutManager()).h1(1, (int) gyVar.J);
                this.b3 = false;
            }
            this.a3 = false;
        }
        super.onMeasure(i10, i11);
        if (gyVar.h2 || dp2 == 0 || (fyVarArr = gyVar.a0) == null || fyVarArr.length <= 1 || gyVar.h3 || (animatorSet = gyVar.b3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.o1 o1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        if (this.T1) {
            return false;
        }
        gy gyVar = this.q3;
        if (gyVar.X0 || gyVar.y) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setOverScrollMode(0);
        }
        fy fyVar = this.c3;
        if (action == 1 || action == 3) {
            f2.f0 f0Var = fyVar.e;
            if (f0Var.y != 0) {
                ey eyVar = fyVar.f;
                if (eyVar.e) {
                    eyVar.f = true;
                    if (f0Var.f(null, 4) != 0 && (o1Var = fyVar.f.d) != null) {
                        View view = o1Var.a;
                        if (view instanceof org.telegram.ui.Cells.p2) {
                            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                            long dialogId = p2Var.getDialogId();
                            if (DialogObject.isFolderDialogId(dialogId)) {
                                z1(false, p2Var);
                            } else {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId);
                                if (dialog != null) {
                                    if (ChatObject.isCommunity(gyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Long.valueOf(dialogId));
                                        gyVar = gyVar;
                                        gyVar.r4(arrayList, 111, true, false, null);
                                    } else {
                                        gyVar = gyVar;
                                        i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                        if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Long.valueOf(dialogId));
                                            gyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                            gyVar.r4(arrayList2, 101, true, false, null);
                                        } else {
                                            i11 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                i12 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i12) == 0) {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    arrayList3.add(Long.valueOf(dialogId));
                                                    gyVar.J2 = !gyVar.g4(dialog) ? 1 : 0;
                                                    gyVar.r4(arrayList3, 100, true, false, null);
                                                } else {
                                                    i13 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        gyVar.r4(arrayList4, 102, true, false, null);
                                                    }
                                                }
                                            } else if (gyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                i14 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                                gyVar.K2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                                gyVar.L2 = gyVar.K2 > 0 ? 0 : 1;
                                                gyVar.r4(arrayList5, 104, true, false, null);
                                            } else {
                                                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                if (org.telegram.ui.Components.mc.a(gyVar)) {
                                                    org.telegram.ui.Components.mc.z(gyVar, 3, 0, null).j();
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
        if (fyVar.s == 0 && ((action == 1 || action == 3) && fyVar.v == 2 && gyVar.Z3() && ((f2.k0) getLayoutManager()).L0() == 0)) {
            int paddingTop = getPaddingTop();
            org.telegram.ui.Cells.p2 Q3 = gy.Q3(fyVar);
            if (Q3 != null) {
                int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                long currentTimeMillis = System.currentTimeMillis() - gyVar.Y2;
                if (measuredHeight < dp || currentTimeMillis < 200) {
                    gyVar.a2 = true;
                    c10 = 0;
                    v0(0, measuredHeight, org.telegram.ui.Components.er.h);
                    fyVar.v = 2;
                } else {
                    if (fyVar.v != 1) {
                        if (getViewOffset() == 0.0f) {
                            gyVar.a2 = true;
                            v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.er.h);
                        }
                        if (!gyVar.a3) {
                            gyVar.a3 = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            nw nwVar = fyVar.n;
                            if (nwVar != null) {
                                nwVar.a(true);
                            }
                        }
                        Q3.a0();
                        fyVar.v = 1;
                        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                        }
                    }
                    c10 = 0;
                }
                if (getViewOffset() != 0.0f) {
                    float[] fArr = new float[2];
                    fArr[c10] = getViewOffset();
                    fArr[1] = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    ofFloat.addUpdateListener(new g3(this, 10));
                    ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.rl.c(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                    ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
                    setScrollEnabled(false);
                    ofFloat.addListener(new org.telegram.ui.Components.f11(this, 27));
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

    @Override // org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(f2.q0 q0Var) {
        super.setAdapter(q0Var);
        this.a3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.e3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        gy.w4 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.A1 != -1 && (m10 = getLayoutManager().m(this.A1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f10);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.C1;
            rect.set(left, top, right, bottom);
            this.z1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean u1() {
        return true;
    }

    @Override // org.telegram.ui.Components.y9
    public final int w1() {
        return AndroidUtilities.dp(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(zw zwVar, float f10, boolean z10) {
        gy gyVar;
        org.telegram.ui.Components.zk0 zk0Var = zwVar == null ? this.h3 : this;
        if (zk0Var == null) {
            this.h3 = zwVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.p2 p2Var = null;
        org.telegram.ui.Cells.p2 p2Var2 = null;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        while (true) {
            int childCount = zk0Var.getChildCount();
            gyVar = this.q3;
            if (i11 >= childCount) {
                break;
            }
            View childAt = zk0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var3 = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var3.getDialogId() == gyVar.B3.getCurrentFragmetDialogId()) {
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
        this.h3 = zwVar;
        if (p2Var != null) {
            if (zwVar != null) {
                zwVar.setPadding(getPaddingLeft(), this.U2, getPaddingLeft(), getPaddingBottom());
                int F = ((pf.k) zwVar.getAdapter()).F(p2Var.getDialogId());
                int top = (int) ((p2Var.getTop() - zk0Var.getPaddingTop()) + f10);
                if (F >= 0) {
                    fy fyVar = this.c3;
                    if (fyVar.s == 0 && fyVar.v == 2 && gyVar.Z3()) {
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
                    ((f2.k0) zwVar.getLayoutManager()).h1(F, top);
                }
            }
            int F2 = ((pf.k) getAdapter()).F(p2Var.getDialogId());
            int top2 = p2Var.getTop() - getPaddingTop();
            if (z10 && gyVar.G) {
                top2 += AndroidUtilities.dp(81.0f);
            }
            if (z10) {
                top2 += AndroidUtilities.dp(48.0f);
            }
            if (F2 >= 0) {
                ((f2.k0) getLayoutManager()).h1(F2, top2);
            }
        }
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        SharedConfig.toggleArchiveHidden();
        gy gyVar = this.q3;
        UndoView Y3 = gyVar.Y3();
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
            gyVar.a2 = true;
            gyVar.X0 = true;
            int top = (p2Var.getTop() - getPaddingTop()) + p2Var.getMeasuredHeight();
            if (gyVar.G && !gyVar.A0.g()) {
                gyVar.N = true;
                top += AndroidUtilities.dp(81.0f);
            }
            v0(0, top, org.telegram.ui.Components.er.g);
            if (z10) {
                gyVar.Z0 = true;
            } else {
                A1();
            }
        }
        Y3.l(0L, 6, null, null);
    }
}
