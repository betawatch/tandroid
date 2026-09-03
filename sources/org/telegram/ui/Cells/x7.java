package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.k6 b;
    public final org.telegram.ui.Components.k6 c;
    public final org.telegram.ui.Components.k6 d;
    public final j0 e;
    public int f;
    public int h;
    public Utilities.Callback n;
    public w7 r;
    public CharSequence s;
    public float v;
    public float w;
    public ValueAnimator x;

    public x7(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = TLObject.FLAG_31;
        this.w = -1.0f;
        this.a = g6Var;
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
        this.b = k6Var;
        pr prVar = pr.h;
        k6Var.b(0.3f, 220L, prVar);
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        k6Var.setGravity(3);
        k6Var.setEmojiCacheType(19);
        k6Var.setEmojiColor(-1);
        k6Var.setImportantForAccessibility(2);
        addView(k6Var, k7.c6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, true, true);
        this.c = k6Var2;
        k6Var2.b(0.3f, 220L, prVar);
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setGravity(17);
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I6, g6Var));
        k6Var2.setEmojiColor(-1);
        k6Var2.setEmojiCacheType(19);
        k6Var2.setImportantForAccessibility(2);
        addView(k6Var2, k7.c6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var3 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.d = k6Var3;
        k6Var3.b(0.3f, 220L, prVar);
        k6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var3.setGravity(5);
        k6Var3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        k6Var3.setEmojiColor(-1);
        k6Var3.setEmojiCacheType(19);
        k6Var3.setImportantForAccessibility(2);
        addView(k6Var3, k7.c6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, g6Var, false);
        this.e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new v7(this));
        addView(j0Var, k7.c6.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int i10, int[] iArr) {
        boolean z4 = false;
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 <= i10) {
                i11++;
                if (i12 == i10) {
                    z4 = true;
                }
            }
        }
        if (!z4) {
            i11++;
        }
        if (i11 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i11];
        int i13 = 0;
        for (int i14 : iArr) {
            if (i14 <= i10) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        if (!z4) {
            iArr2[i13] = i10;
        }
        return iArr2;
    }

    public final float b(int i10) {
        if (this.r.c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.r.c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11 - 1];
                int i13 = iArr[i11];
                if (i10 >= i12 && i10 <= i13) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i12) / (i13 - i12)) * r2.d) / this.r.d) + r4);
                }
                i11++;
            }
        }
        return Utilities.clamp01((i10 - this.r.b()) / (this.r.a() - this.r.b()));
    }

    public final int c(int i10) {
        if (this.r.c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.r.c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = i11 - 1;
                int i13 = iArr[i12];
                int i14 = iArr[i11];
                if (i10 >= i13 && i10 <= i14) {
                    return i12;
                }
                i11++;
            }
        }
        return i10;
    }

    public final void d(int i10, w7 w7Var, Utilities.Callback callback) {
        this.f = i10;
        this.r = w7Var;
        this.n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z4) {
        w7 w7Var = this.r;
        if (w7Var == null || w7Var.e == null) {
            return;
        }
        org.telegram.ui.Components.k6 k6Var = this.b;
        k6Var.a();
        org.telegram.ui.Components.k6 k6Var2 = this.d;
        k6Var2.a();
        org.telegram.ui.Components.k6 k6Var3 = this.c;
        k6Var3.a();
        k6Var3.c((CharSequence) this.r.e.run(0, Integer.valueOf(i10)), z4, true);
        k6Var.c((CharSequence) this.r.e.run(-1, Integer.valueOf(this.r.b())), z4, true);
        k6Var2.c((CharSequence) this.r.e.run(1, Integer.valueOf(this.r.a())), z4, true);
        k6Var2.c.s(org.telegram.ui.ActionBar.k6.v0(i10 >= this.r.a() ? org.telegram.ui.ActionBar.k6.I6 : org.telegram.ui.ActionBar.k6.y6, this.a), z4);
        k6Var2.invalidate();
        float f10 = i10 >= this.r.a() ? 1.0f : 0.0f;
        if (Math.abs(this.w - f10) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x = null;
        }
        this.w = f10;
        if (z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f10);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new r(this, 6));
            this.x.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 3));
            this.x.setDuration(240L);
            this.x.start();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        this.v = f10;
        colorMatrix.setSaturation(f10);
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
        }
        k6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(75.0f), TLObject.FLAG_30));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, AndroidUtilities.dp(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - AndroidUtilities.dp(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f < i10) {
            this.f = i10;
        }
        if (this.r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f, false);
        invalidate();
    }
}
