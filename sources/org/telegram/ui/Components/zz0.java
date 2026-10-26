package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zz0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final ak0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public mp0 K;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final yz0 h;
    public final String[] n;
    public final int[] r;
    public final xj0[] s;
    public final xj0[] v;
    public final int[] w;
    public final int[] x;
    public int y;

    public zz0(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.n = new String[]{LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
        this.r = new int[]{r7, r7, r7, r7, org.telegram.ui.ActionBar.y6.Y5, org.telegram.ui.ActionBar.y6.d9};
        this.s = new xj0[6];
        this.v = new xj0[6];
        this.w = new int[6];
        this.x = new int[6];
        this.E = new ak0[2];
        this.G = 1.0f;
        int i11 = org.telegram.ui.ActionBar.y6.c9;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        yz0 yz0Var = new yz0(this, context);
        this.h = yz0Var;
        this.a = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false);
        yz0Var.setMinValue(0);
        yz0Var.setDrawDividers(false);
        boolean isEmpty = MessagesController.getInstance(i10).dialogFilters.isEmpty();
        yz0Var.setMaxValue(isEmpty ? 4 : 5);
        yz0Var.setAllItemsCount(isEmpty ? 5 : 6);
        yz0Var.setWrapSelectorWheel(true);
        yz0Var.setFormatter(new xz0(this));
        yz0Var.setOnValueChangedListener(new xz0(this));
        yz0Var.setImportantForAccessibility(2);
        yz0Var.setValue(SharedConfig.getChatSwipeAction(i10));
        addView(yz0Var, gb1.h(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.y = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.E[i12] = new ak0(context);
            addView(this.E[i12], gb1.h(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        xj0 a2 = a(this.h.getValue());
        if (a2 != null) {
            this.E[0].setImageDrawable(a2);
            a2.M(a2.e[0] - 1);
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.E[0], true, 0.5f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.E[1], false, 0.5f, false);
        this.F = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.J = this.h.getValue();
    }

    public final xj0 a(int i10) {
        xj0[] xj0VarArr = this.s;
        if (xj0VarArr[i10] == null) {
            xj0VarArr[i10] = new xj0(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return xj0VarArr[i10];
    }

    public final void b() {
        int value;
        if (this.K == null && this.J != (value = this.h.getValue())) {
            this.J = value;
            int i10 = (this.y + 1) % 2;
            xj0 a2 = a(value);
            ak0[] ak0VarArr = this.E;
            if (a2 != null) {
                if (ak0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                ak0VarArr[i10].setAnimation(a2);
                ak0VarArr[i10].d();
            } else {
                ak0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(ak0VarArr[this.y], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(ak0VarArr[i10], true, 0.5f, true);
            this.y = i10;
            mp0 mp0Var = new mp0(this, 18);
            this.K = mp0Var;
            AndroidUtilities.runOnUIThread(mp0Var, 150L);
        }
    }

    public final void c(int i10) {
        xj0[] xj0VarArr = this.s;
        if (xj0VarArr[i10] != null) {
            int f7 = i0.a.f(0.9f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.c9, false));
            int i11 = org.telegram.ui.ActionBar.y6.e9;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            xj0 xj0Var = xj0VarArr[i10];
            xj0[] xj0VarArr2 = this.v;
            xj0 xj0Var2 = xj0VarArr2[i10];
            int[] iArr = this.x;
            int[] iArr2 = this.w;
            if (xj0Var == xj0Var2 && x02 == iArr2[i10] && f7 == iArr[i10]) {
                return;
            }
            xj0VarArr2[i10] = xj0Var;
            iArr2[i10] = x02;
            iArr[i10] = f7;
            if (i10 != 2) {
                org.telegram.ui.ActionBar.f7.y(this, xj0VarArr[i10], i11, null, PorterDuff.Mode.SRC_IN);
                return;
            }
            xj0VarArr[i10].Q(f7, "Arrow");
            xj0VarArr[i10].Q(x02, "Box2");
            xj0VarArr[i10].Q(x02, "Box1");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        super.onDraw(canvas);
        yz0 yz0Var = this.h;
        boolean z10 = yz0Var.getValue() == 5;
        ak0[] ak0VarArr = this.E;
        if (z10) {
            float f11 = this.F;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.053333335f;
                this.F = f12;
                if (f12 > 1.0f) {
                    this.F = 1.0f;
                } else {
                    ak0VarArr[0].invalidate();
                    ak0VarArr[1].invalidate();
                    invalidate();
                }
                int i11 = org.telegram.ui.ActionBar.y6.M6;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
                Paint paint = this.b;
                paint.setColor(x02);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
                Paint paint2 = this.d;
                paint2.setColor(x03);
                int z11 = org.telegram.messenger.vh.z(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
                int dp = AndroidUtilities.dp(21.0f);
                int B = org.telegram.messenger.vh.B(48.0f, getMeasuredHeight(), 2);
                float f13 = dp;
                float f14 = B;
                float measuredHeight = getMeasuredHeight() - B;
                RectF rectF = this.f;
                rectF.set(f13, f14, z11, measuredHeight);
                i10 = this.I;
                int[] iArr = this.r;
                if (i10 >= 0) {
                    this.I = iArr[yz0Var.getValue()];
                    this.G = 1.0f;
                    this.H = i0.a.f(0.9f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false), org.telegram.ui.ActionBar.y6.x0(null, this.I, false));
                    f7 = 1.0f;
                } else {
                    f7 = 1.0f;
                    if (iArr[yz0Var.getValue()] != this.I) {
                        this.H = i0.a.f(this.G, this.H, i0.a.f(0.9f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false), org.telegram.ui.ActionBar.y6.x0(null, this.I, false)));
                        this.G = 0.0f;
                        this.I = iArr[yz0Var.getValue()];
                    }
                }
                f10 = this.G;
                if (f10 != f7) {
                    float f15 = f10 + 0.16f;
                    this.G = f15;
                    if (f15 > f7) {
                        this.G = f7;
                    } else {
                        invalidate();
                    }
                }
                int i12 = this.H;
                int i13 = org.telegram.ui.ActionBar.y6.d6;
                int f16 = i0.a.f(this.G, i12, i0.a.f(0.9f, org.telegram.ui.ActionBar.y6.x0(null, i13, false), org.telegram.ui.ActionBar.y6.x0(null, this.I, false)));
                Paint paint3 = this.c;
                paint3.setColor(f16);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
                paint3.setColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
                paint3.setAlpha(255);
                rectF.set(f13, f14, z11 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - B);
                rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
                paint.setAlpha(31);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                canvas.save();
                canvas.clipRect(rectF);
                paint3.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                paint3.setAlpha(60);
                canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), AndroidUtilities.dp(15.0f), paint3);
                float centerY = rectF.centerY() - AndroidUtilities.dp(6.0f);
                paint2.setAlpha(57);
                canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, centerY, rectF.right - AndroidUtilities.dp(68.0f), centerY, paint2);
                float centerY2 = rectF.centerY() + AndroidUtilities.dp(6.0f);
                canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, centerY2, rectF.right - AndroidUtilities.dp(23.0f), centerY2, paint2);
                canvas.restore();
            }
        }
        if (!z10) {
            float f17 = this.F;
            if (f17 != 0.0f) {
                float f18 = f17 - 0.053333335f;
                this.F = f18;
                if (f18 < 0.0f) {
                    this.F = 0.0f;
                } else {
                    ak0VarArr[0].invalidate();
                    ak0VarArr[1].invalidate();
                    invalidate();
                }
            }
        }
        int i112 = org.telegram.ui.ActionBar.y6.M6;
        int x022 = org.telegram.ui.ActionBar.y6.x0(null, i112, false);
        Paint paint4 = this.b;
        paint4.setColor(x022);
        int x032 = org.telegram.ui.ActionBar.y6.x0(null, i112, false);
        Paint paint22 = this.d;
        paint22.setColor(x032);
        int z112 = org.telegram.messenger.vh.z(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
        int dp2 = AndroidUtilities.dp(21.0f);
        int B2 = org.telegram.messenger.vh.B(48.0f, getMeasuredHeight(), 2);
        float f132 = dp2;
        float f142 = B2;
        float measuredHeight2 = getMeasuredHeight() - B2;
        RectF rectF2 = this.f;
        rectF2.set(f132, f142, z112, measuredHeight2);
        i10 = this.I;
        int[] iArr2 = this.r;
        if (i10 >= 0) {
        }
        f10 = this.G;
        if (f10 != f7) {
        }
        int i122 = this.H;
        int i132 = org.telegram.ui.ActionBar.y6.d6;
        int f162 = i0.a.f(this.G, i122, i0.a.f(0.9f, org.telegram.ui.ActionBar.y6.x0(null, i132, false), org.telegram.ui.ActionBar.y6.x0(null, this.I, false)));
        Paint paint32 = this.c;
        paint32.setColor(f162);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint32);
        paint32.setColor(org.telegram.ui.ActionBar.y6.x0(null, i132, false));
        paint32.setAlpha(255);
        rectF2.set(f132, f142, z112 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - B2);
        rectF2.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint32);
        paint4.setAlpha(31);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint4);
        canvas.save();
        canvas.clipRect(rectF2);
        paint32.setColor(org.telegram.ui.ActionBar.y6.x0(null, i112, false));
        paint32.setAlpha(60);
        canvas.drawCircle(rectF2.left + 0.0f, rectF2.centerY(), AndroidUtilities.dp(15.0f), paint32);
        float centerY3 = rectF2.centerY() - AndroidUtilities.dp(6.0f);
        paint22.setAlpha(57);
        canvas.drawLine(rectF2.left + AndroidUtilities.dp(23.0f) + 0.0f, centerY3, rectF2.right - AndroidUtilities.dp(68.0f), centerY3, paint22);
        float centerY22 = rectF2.centerY() + AndroidUtilities.dp(6.0f);
        canvas.drawLine(rectF2.left + AndroidUtilities.dp(23.0f) + 0.0f, centerY22, rectF2.right - AndroidUtilities.dp(23.0f), centerY22, paint22);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            yz0 yz0Var = this.h;
            int value = yz0Var.getValue() + 1;
            if (value > yz0Var.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.n[value]);
            yz0Var.a(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        updateColors();
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false);
        this.a = x02;
        yz0 yz0Var = this.h;
        yz0Var.setTextColor(x02);
        yz0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        for (int i10 = 0; i10 < this.s.length; i10++) {
            c(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
