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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class py extends org.telegram.ui.Components.la implements ai.t9 {
    public static final /* synthetic */ int t3 = 0;
    public boolean b3;
    public boolean c3;
    public boolean d3;
    public final sy e3;
    public int f3;
    public float g3;
    public final Paint h3;
    public final RectF i3;
    public org.telegram.ui.Components.qm0 j3;
    public LongSparseArray k3;
    public Paint l3;
    public float m3;
    public float n3;
    public float o3;
    public boolean p3;
    public ai.sc q3;
    public int r3;
    public final /* synthetic */ ty s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py(ty tyVar, Context context, sy syVar) {
        super(context, null);
        this.s3 = tyVar;
        this.c3 = true;
        this.h3 = new Paint();
        this.i3 = new RectF();
        this.n3 = 1.0f;
        this.e3 = syVar;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        ty tyVar = this.s3;
        UndoView V3 = tyVar.V3();
        if (!SharedConfig.archiveHidden) {
            V3.l(0L, 7, null, null);
            B1();
            if (!z10 || s2Var == null) {
                return;
            }
            s2Var.U();
            s2Var.invalidate();
            return;
        }
        if (s2Var != null) {
            tyVar.e2 = true;
            tyVar.b1 = true;
            int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
            if (tyVar.K && !tyVar.E0.g()) {
                tyVar.R = true;
                top += AndroidUtilities.dp(81.0f);
            }
            v0(0, top, org.telegram.ui.Components.hs.g);
            if (z10) {
                tyVar.d1 = true;
            } else {
                B1();
            }
        }
        V3.l(0L, 6, null, null);
    }

    public final void B1() {
        int i10 = SharedConfig.archiveHidden ? 2 : 0;
        sy syVar = this.e3;
        syVar.v = i10;
        zw zwVar = syVar.n;
        if (zwVar != null) {
            zwVar.X = i10 != 0;
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.m4) || view.isClickable();
    }

    @Override // ai.t9
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.s3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(ty.z4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02c6  */
    @Override // org.telegram.ui.Components.la, org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f7;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        org.telegram.ui.Components.be0 be0Var;
        float f10;
        float f11;
        Paint paint2;
        float f12;
        boolean z10;
        float f13;
        float f14;
        org.telegram.ui.ActionBar.e6 e6Var2;
        float f15;
        int i11;
        int i12;
        org.telegram.ui.Cells.s2 s2Var;
        int i13;
        org.telegram.ui.Cells.s2 s2Var2;
        int i14;
        int i15;
        int i16;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f16 = this.g3;
        org.telegram.ui.ActionBar.e6 e6Var3 = this.n2;
        Paint paint3 = this.h3;
        boolean z11 = true;
        boolean z12 = false;
        if (f16 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(l41.getRightPaddingSize()), this.g3), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s9, e6Var3));
            paint3.setAlpha((int) (paint3.getAlpha() * this.g3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(l41.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.i6.k0.getAlpha();
            org.telegram.ui.ActionBar.i6.k0.setAlpha((int) (this.g3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(l41.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(l41.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.i6.k0);
            org.telegram.ui.ActionBar.i6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.j3 != null) {
            if (this.k3 == null) {
                this.k3 = new LongSparseArray();
            }
            for (int i17 = 0; i17 < this.j3.getChildCount(); i17++) {
                View childAt = this.j3.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.s2) && childAt.getBottom() > 0) {
                    this.k3.put(((org.telegram.ui.Cells.s2) childAt).getDialogId(), childAt);
                }
            }
        }
        ty tyVar = this.s3;
        float f17 = tyVar.E ? 0.0f : tyVar.N;
        int i18 = TLObject.FLAG_31;
        int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i20 = 0;
        org.telegram.ui.Cells.s2 s2Var3 = null;
        float f18 = 2.14748365E9f;
        float f19 = -2.14748365E9f;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var4 = (org.telegram.ui.Cells.s2) childAt2;
                f15 = 1.0f;
                s2Var4.setRightFragmentOpenedProgress(this.g3);
                if (AndroidUtilities.isTablet()) {
                    e6Var2 = e6Var3;
                    s2Var4.setDialogSelected(s2Var4.getDialogId() == tyVar.p2.dialogId ? z11 : z12);
                } else {
                    e6Var2 = e6Var3;
                }
                LongSparseArray longSparseArray = this.k3;
                if (longSparseArray != null && this.j3 != null) {
                    View view2 = (View) longSparseArray.get(s2Var4.getDialogId());
                    this.k3.delete(s2Var4.getDialogId());
                    if (view2 != null) {
                        this.j3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i18) {
                            i18 = S;
                        }
                        if (S < i19) {
                            i19 = S;
                        }
                        s2Var4.C0 = (view2.getTop() - s2Var4.getTop()) * this.g3;
                        if (s2Var4.getTop() + s2Var4.C0 < f18) {
                            f18 = (s2Var4.getTop() + s2Var4.C0) - f17;
                        }
                        float lerp = AndroidUtilities.lerp(s2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.g3) + s2Var4.getTop() + s2Var4.C0;
                        if (lerp > f19) {
                            f19 = lerp - f17;
                        }
                    }
                }
                if (this.b3 && s2Var4.b0(0, true) && (R = RecyclerView.R(s2Var4)) >= 0) {
                    getAdapter().m(R);
                }
                if (s2Var4.getDialogId() == tyVar.F3.getCurrentFragmetDialogId()) {
                    s2Var3 = s2Var4;
                    s2Var = s2Var3;
                } else {
                    s2Var = s2Var4;
                }
                i11 = i18;
                i12 = i19;
            } else {
                e6Var2 = e6Var3;
                f15 = 1.0f;
                i11 = i18;
                i12 = i19;
                s2Var = null;
            }
            if (this.j3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (s2Var != null) {
                    s2Var.n = -f17;
                    view = childAt2;
                    i13 = i20;
                    s2Var2 = s2Var3;
                    i14 = i11;
                    i15 = i12;
                    i16 = save;
                } else {
                    i14 = i11;
                    i16 = save;
                    i15 = i12;
                    s2Var2 = s2Var3;
                    i13 = i20;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f15 - this.g3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (s2Var != null && s2Var != s2Var2) {
                    s2Var.C0 = 0.0f;
                    s2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i16);
            } else {
                i13 = i20;
                s2Var2 = s2Var3;
                i14 = i11;
                i15 = i12;
            }
            i20 = i13 + 1;
            s2Var3 = s2Var2;
            i18 = i14;
            e6Var3 = e6Var2;
            i19 = i15;
            z11 = true;
            z12 = false;
        }
        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var3;
        if (s2Var3 != null) {
            ImageReceiver imageReceiver = s2Var3.Y1;
            canvas2.save();
            this.m3 = imageReceiver.getImageY() + s2Var3.getY() + s2Var3.C0;
            s2Var3.C0 = 0.0f;
            s2Var3.n = 0.0f;
            float f20 = this.n3;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.08f;
                this.n3 = f21;
                f12 = 1.0f;
                this.n3 = Utilities.clamp(f21, 1.0f, 0.0f);
                invalidate();
            } else {
                f12 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.hs.f.getInterpolation(this.n3);
            if (interpolation != f12) {
                float f22 = this.o3;
                if (f22 != -2.14748365E9f) {
                    if (Math.abs(f22 - this.m3) < getMeasuredHeight() * 0.4f) {
                        this.m3 = AndroidUtilities.lerp(this.o3, this.m3, interpolation);
                    } else {
                        z10 = true;
                        if (this.p3 || !(z10 || this.o3 == -2.14748365E9f)) {
                            f13 = 1.0f;
                            interpolation = this.g3;
                        } else {
                            f13 = 1.0f;
                        }
                        f14 = f13 - interpolation;
                        if (f14 != f13) {
                            f7 = -2.14748365E9f;
                            this.m3 = -2.14748365E9f;
                        } else {
                            f7 = -2.14748365E9f;
                        }
                        float f23 = (-AndroidUtilities.dp(5.0f)) * f14;
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-AndroidUtilities.dp(4.0f)) + f23, this.m3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f23, imageReceiver.getImageHeight() + this.m3 + AndroidUtilities.dp(1.0f));
                        if (this.l3 == null) {
                            this.l3 = new Paint(1);
                        }
                        e6Var = e6Var4;
                        this.l3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.l3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.p3) {
            }
            f13 = 1.0f;
            interpolation = this.g3;
            f14 = f13 - interpolation;
            if (f14 != f13) {
            }
            float f232 = (-AndroidUtilities.dp(5.0f)) * f14;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((-AndroidUtilities.dp(4.0f)) + f232, this.m3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f232, imageReceiver.getImageHeight() + this.m3 + AndroidUtilities.dp(1.0f));
            if (this.l3 == null) {
            }
            e6Var = e6Var4;
            this.l3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.l3);
            canvas2.restore();
        } else {
            f7 = -2.14748365E9f;
            e6Var = e6Var4;
            this.m3 = -2.14748365E9f;
        }
        boolean z13 = false;
        if (this.k3 != null) {
            float f24 = 2.14748365E9f;
            for (int i21 = 0; i21 < this.k3.size(); i21++) {
                View view3 = (View) this.k3.valueAt(i21);
                this.j3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i19 && view3.getTop() > f7) {
                    f7 = view3.getTop();
                }
                if (S2 > i18 && view3.getBottom() < f24) {
                    f24 = view3.getBottom();
                }
            }
            for (int i22 = 0; i22 < this.k3.size(); i22++) {
                View view4 = (View) this.k3.valueAt(i22);
                if (view4 instanceof org.telegram.ui.Cells.s2) {
                    this.j3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.s2 s2Var5 = (org.telegram.ui.Cells.s2) view4;
                    s2Var5.j0 = false;
                    s2Var5.u();
                    s2Var5.j0 = true;
                    s2Var5.setRightFragmentOpenedProgress(this.g3);
                    int save2 = canvas2.save();
                    if (S3 > i18) {
                        canvas2.translate(view4.getX(), (f19 + view4.getBottom()) - f24);
                    } else {
                        canvas2.translate(view4.getX(), (f19 + view4.getTop()) - f7);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(save2);
                }
            }
            this.k3.clear();
            z13 = false;
        }
        this.b3 = z13;
        if (this.j3 != null) {
            invalidate();
        }
        if (this.j3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var));
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt3 = getChildAt(i23);
                if (((childAt3 instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) childAt3).r) || ((childAt3 instanceof gg.l) && ((gg.l) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y3 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y10 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.i3;
                        rectF3.set(x10, y3, x11, y10);
                        canvas2.saveLayerAlpha(rectF3, (int) (childAt3.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    canvas2.translate(childAt3.getX(), childAt3.getY());
                    paint2 = paint;
                    canvas2.drawRect(0.0f, 0.0f, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight(), paint2);
                    childAt3.draw(canvas2);
                    canvas2.restore();
                } else {
                    paint2 = paint;
                }
                i23++;
                paint = paint2;
            }
            invalidate();
        }
        org.telegram.ui.Cells.s2 s2Var6 = tyVar.W0;
        if (s2Var6 != null && (be0Var = tyVar.V0) != null) {
            int measuredHeight = (tyVar.W0.getMeasuredHeight() / 2) + s2Var6.getTop();
            Paint paint4 = be0Var.b;
            View view5 = be0Var.c;
            RectF rectF4 = be0Var.f;
            Paint paint5 = be0Var.a;
            int dp = AndroidUtilities.dp(110.0f);
            int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * be0Var.h) - org.telegram.messenger.q.D(62.0f, 3, dp);
            int i24 = dp / 2;
            int i25 = measuredHeight - i24;
            paint5.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
            int i26 = dp2 / 2;
            float f25 = measuredHeight - i26;
            float f26 = i24 + measuredWidth;
            float f27 = i26 + measuredHeight + 1;
            canvas.drawRect(0.0f, f25, f26, f27, paint5);
            paint5.setColor(-69120);
            float f28 = dp + measuredWidth;
            rectF4.set(measuredWidth, i25, f28, i25 + dp);
            float f29 = be0Var.g;
            float f30 = 35.0f;
            int y11 = (int) (f29 < 0.5f ? org.telegram.messenger.bi.y(f29, 0.5f, 1.0f, 35.0f) : ((f29 - 0.5f) * 35.0f) / 0.5f);
            float f31 = y11;
            float f32 = 360 - (y11 * 2);
            canvas.drawArc(rectF4, f31, f32, true, paint4);
            canvas.drawArc(rectF4, f31, f32, true, paint5);
            paint5.setColor(-16777216);
            float f33 = 8.0f;
            canvas.drawCircle(f26 - AndroidUtilities.dp(8.0f), (dp / 4) + i25, AndroidUtilities.dp(8.0f), paint5);
            canvas.save();
            float f34 = 20.0f;
            canvas.translate(AndroidUtilities.dp(20.0f) + f28, measuredHeight - AndroidUtilities.dp(25.0f));
            int i27 = 0;
            for (int i28 = 3; i27 < i28; i28 = 3) {
                Path path = be0Var.j;
                float f35 = f33;
                if (path != null) {
                    f10 = f34;
                    if (be0Var.k == be0Var.l) {
                        f11 = f30;
                        canvas.drawPath(be0Var.j, paint4);
                        if (i27 != 0) {
                            paint5.setColor(-90112);
                        } else if (i27 == 1) {
                            paint5.setColor(-85326);
                        } else {
                            paint5.setColor(-16720161);
                        }
                        canvas.drawPath(be0Var.j, paint5);
                        paint5.setColor(-1);
                        rectF4.set(AndroidUtilities.dp(f35), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        paint5.setColor(-16777216);
                        rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                        i27++;
                        f30 = f11;
                        f33 = f35;
                        f34 = f10;
                    }
                } else {
                    f10 = f34;
                }
                if (path == null) {
                    be0Var.j = new Path();
                }
                be0Var.j.reset();
                boolean z14 = be0Var.k;
                be0Var.l = z14;
                if (z14) {
                    be0Var.j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    be0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    be0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    be0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(r4), AndroidUtilities.dp(43.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f11 = f30;
                } else {
                    f11 = f30;
                    be0Var.j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    be0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    be0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    be0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(f11), AndroidUtilities.dp(50.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    be0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                be0Var.j.close();
                canvas.drawPath(be0Var.j, paint4);
                if (i27 != 0) {
                }
                canvas.drawPath(be0Var.j, paint5);
                paint5.setColor(-1);
                rectF4.set(AndroidUtilities.dp(f35), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint5);
                paint5.setColor(-16777216);
                rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint5);
                canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                i27++;
                f30 = f11;
                f33 = f35;
                f34 = f10;
            }
            canvas.restore();
            if (be0Var.h >= 1.0f) {
                be0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - be0Var.e;
            be0Var.e = currentTimeMillis;
            if (j3 > 17) {
                j3 = 17;
            }
            if (be0Var.g >= 1.0f) {
                be0Var.g = 0.0f;
            }
            float f36 = j3;
            float f37 = (f36 / 400.0f) + be0Var.g;
            be0Var.g = f37;
            if (f37 > 1.0f) {
                be0Var.g = 1.0f;
            }
            float f38 = (f36 / 2000.0f) + be0Var.h;
            be0Var.h = f38;
            if (f38 > 1.0f) {
                be0Var.h = 1.0f;
            }
            float f39 = (f36 / 200.0f) + be0Var.i;
            be0Var.i = f39;
            if (f39 >= 1.0f) {
                be0Var.k = !be0Var.k;
                be0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.q3 == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            ai.sc[] scVarArr = ai.sc.f;
            if (scVarArr[i10] == null) {
                scVarArr[i10] = new ai.sc(i10);
            }
            this.q3 = scVarArr[i10];
        }
        this.q3.a(this);
    }

    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.s3.N) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.la, org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return ty.z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        sy syVar = this.e3;
        if (syVar.n != null && ty.z4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            syVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.V1) {
            return false;
        }
        ty tyVar = this.s3;
        if (tyVar.b1 || this.e3.x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            tyVar.c1 = !kVar.t();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3 = getPaddingTop();
        this.s3.x3 = 0.0f;
        this.e3.getClass();
    }

    @Override // org.telegram.ui.Components.la, org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        sy[] syVarArr;
        AnimatorSet animatorSet;
        sy syVar = this.e3;
        int L0 = syVar.c.L0();
        ty tyVar = this.s3;
        if (L0 != -1 && syVar.e.y == 0 && syVar.c.y < 0 && syVar.a.getScrollState() != 1) {
            s4.d1 K = syVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (syVar.s == 0 && tyVar.W3() && syVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.d3 = true;
                syVar.c.h1(L0, (int) ((top - this.f3) + tyVar.x3 + 0));
                this.d3 = false;
            }
        } else if (L0 == -1 && this.c3) {
            syVar.c.h1((syVar.s == 0 && tyVar.W3()) ? 1 : 0, (int) tyVar.N);
        }
        this.d3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        int i12 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (tyVar.K && !tyVar.O) {
            i12 += AndroidUtilities.dp(81.0f);
        }
        if (!tyVar.O) {
            i12 += AndroidUtilities.dp(48.0f);
        }
        this.r3 = 0;
        float P3 = tyVar.P3(false);
        org.telegram.ui.Components.at atVar = tyVar.J1;
        float f7 = atVar != null ? atVar.getMetadata().c.a : 0.0f;
        int dp = i12 + ((int) (AndroidUtilities.dp(50.0f) * P3));
        this.r3 += (int) (AndroidUtilities.dp(50.0f) * P3);
        org.telegram.ui.Components.at atVar2 = tyVar.J1;
        if (atVar2 != null) {
            int c10 = (int) atVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), P3));
            dp += c10;
            this.r3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(P3, f7) * 5.0f);
        this.r3 -= AndroidUtilities.dp(Math.max(P3, f7) * 5.0f);
        int k32 = tyVar.k3();
        if (dp2 != this.W2 || k32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, k32);
            if (tyVar.K) {
                syVar.w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                syVar.w.setPaddingTop(dp2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof gg.l) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.d3 = false;
        if (this.c3 && tyVar.getMessagesController().dialogsLoaded) {
            if (syVar.s == 0 && tyVar.W3()) {
                this.d3 = true;
                ((s4.d0) getLayoutManager()).h1(1, (int) tyVar.N);
                this.d3 = false;
            }
            this.c3 = false;
        }
        super.onMeasure(i10, i11);
        if (tyVar.l2 || dp2 == 0 || (syVarArr = tyVar.e0) == null || syVarArr.length <= 1 || tyVar.l3 || (animatorSet = tyVar.f3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.d1 d1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        if (!this.V1) {
            ty tyVar = this.s3;
            if (!tyVar.b1 && !tyVar.y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                sy syVar = this.e3;
                if (action == 1 || action == 3) {
                    s4.z zVar = syVar.e;
                    if (zVar.y != 0) {
                        ry ryVar = syVar.f;
                        if (ryVar.e) {
                            ryVar.f = true;
                            if (zVar.g(null, 4) != 0 && (d1Var = syVar.f.d) != null) {
                                View view = d1Var.a;
                                if (view instanceof org.telegram.ui.Cells.s2) {
                                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                                    long dialogId = s2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        A1(false, s2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(tyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                tyVar = tyVar;
                                                tyVar.o4(arrayList, 111, true, false, null);
                                            } else {
                                                tyVar = tyVar;
                                                i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    tyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    tyVar.o4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i11 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            tyVar.N2 = !tyVar.d4(dialog) ? 1 : 0;
                                                            tyVar.o4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i13 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                tyVar.o4(arrayList4, 102, true, false, null);
                                                            }
                                                        }
                                                    } else if (tyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                        tyVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                                        tyVar.P2 = tyVar.O2 > 0 ? 0 : 1;
                                                        tyVar.o4(arrayList5, 104, true, false, null);
                                                    } else {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.ad.a(tyVar)) {
                                                            org.telegram.ui.Components.ad.z(tyVar, 3, 0, null).j();
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
                if (syVar.s == 0 && ((action == 1 || action == 3) && syVar.v == 2 && tyVar.W3() && ((s4.d0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.s2 N3 = ty.N3(syVar);
                    if (N3 != null) {
                        int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = N3.getMeasuredHeight() + (N3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - tyVar.c3;
                        if (measuredHeight < dp || currentTimeMillis < 200) {
                            tyVar.e2 = true;
                            c10 = 0;
                            v0(0, measuredHeight, org.telegram.ui.Components.hs.h);
                            syVar.v = 2;
                        } else {
                            if (syVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    tyVar.e2 = true;
                                    v0(0, N3.getTop() - paddingTop, org.telegram.ui.Components.hs.h);
                                }
                                if (!tyVar.e3) {
                                    tyVar.e3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    zw zwVar = syVar.n;
                                    if (zwVar != null) {
                                        zwVar.a(true);
                                    }
                                }
                                N3.a0();
                                syVar.v = 1;
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
                            ofFloat.addUpdateListener(new c3(this, 10));
                            ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.bi.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.hs.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.i91(this, 20));
                            ofFloat.start();
                        }
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.la, org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(s4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.c3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.g3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        ty.z4 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f7);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.E1;
            rect.set(left, top, right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean v1() {
        return true;
    }

    @Override // org.telegram.ui.Components.la
    public final int x1() {
        return AndroidUtilities.dp(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z1(lx lxVar, float f7, boolean z10) {
        ty tyVar;
        org.telegram.ui.Components.qm0 qm0Var = lxVar == null ? this.j3 : this;
        if (qm0Var == null) {
            this.j3 = lxVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.s2 s2Var = null;
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        org.telegram.ui.Cells.s2 s2Var2 = null;
        while (true) {
            int childCount = qm0Var.getChildCount();
            tyVar = this.s3;
            if (i10 >= childCount) {
                break;
            }
            View childAt = qm0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var3 = (org.telegram.ui.Cells.s2) childAt;
                if (s2Var3.getDialogId() == tyVar.F3.getCurrentFragmetDialogId()) {
                    s2Var = s2Var3;
                }
                if (childAt.getTop() >= 0 && s2Var3.getDialogId() != 0 && childAt.getTop() < i11) {
                    i11 = s2Var3.getTop();
                    s2Var2 = s2Var3;
                }
            }
            i10++;
        }
        if (s2Var != null) {
            if (AndroidUtilities.dp(70.0f) * getAdapter().h() > getMeasuredHeight()) {
            }
        }
        s2Var = s2Var2;
        this.j3 = lxVar;
        if (s2Var != null) {
            if (lxVar != null) {
                lxVar.setPadding(getPaddingLeft(), this.W2, getPaddingLeft(), getPaddingBottom());
                int F = ((gg.m) lxVar.getAdapter()).F(s2Var.getDialogId());
                int top = (int) ((s2Var.getTop() - qm0Var.getPaddingTop()) + f7);
                if (F >= 0) {
                    sy syVar = this.e3;
                    if (syVar.s == 0 && syVar.v == 2 && tyVar.W3()) {
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
                    ((s4.d0) lxVar.getLayoutManager()).h1(F, top);
                }
            }
            int F2 = ((gg.m) getAdapter()).F(s2Var.getDialogId());
            int top2 = s2Var.getTop() - getPaddingTop();
            if (z10 && tyVar.K) {
                top2 += AndroidUtilities.dp(81.0f);
            }
            if (z10) {
                top2 += AndroidUtilities.dp(48.0f);
            }
            if (F2 >= 0) {
                ((s4.d0) getLayoutManager()).h1(F2, top2);
            }
        }
    }
}
