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
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 a;
    public final org.telegram.ui.Components.o6 b;
    public final org.telegram.ui.Components.o6 c;
    public final org.telegram.ui.Components.o6 d;
    public final j0 e;
    public int f;
    public int h;
    public Utilities.Callback n;
    public u7 r;
    public CharSequence s;
    public float v;
    public float w;
    public ValueAnimator x;

    public v7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = TLObject.FLAG_31;
        this.w = -1.0f;
        this.a = c6Var;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.b = o6Var;
        jr jrVar = jr.h;
        o6Var.b(0.3f, 220L, jrVar);
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.g6.y6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        o6Var.setGravity(3);
        o6Var.setEmojiCacheType(19);
        o6Var.setEmojiColor(-1);
        o6Var.setImportantForAccessibility(2);
        addView(o6Var, i7.f6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, true, true);
        this.c = o6Var2;
        o6Var2.b(0.3f, 220L, jrVar);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setGravity(17);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        o6Var2.setEmojiColor(-1);
        o6Var2.setEmojiCacheType(19);
        o6Var2.setImportantForAccessibility(2);
        addView(o6Var2, i7.f6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.d = o6Var3;
        o6Var3.b(0.3f, 220L, jrVar);
        o6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var3.setGravity(5);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        o6Var3.setEmojiColor(-1);
        o6Var3.setEmojiCacheType(19);
        o6Var3.setImportantForAccessibility(2);
        addView(o6Var3, i7.f6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, c6Var, false);
        this.e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new t7(this));
        addView(j0Var, i7.f6.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int i10, int[] iArr) {
        boolean z10 = false;
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 <= i10) {
                i11++;
                if (i12 == i10) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
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
        if (!z10) {
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

    public final void d(int i10, u7 u7Var, Utilities.Callback callback) {
        this.f = i10;
        this.r = u7Var;
        this.n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        u7 u7Var = this.r;
        if (u7Var == null || u7Var.e == null) {
            return;
        }
        org.telegram.ui.Components.o6 o6Var = this.b;
        o6Var.a();
        org.telegram.ui.Components.o6 o6Var2 = this.d;
        o6Var2.a();
        org.telegram.ui.Components.o6 o6Var3 = this.c;
        o6Var3.a();
        o6Var3.c((CharSequence) this.r.e.run(0, Integer.valueOf(i10)), z10, true);
        o6Var.c((CharSequence) this.r.e.run(-1, Integer.valueOf(this.r.b())), z10, true);
        o6Var2.c((CharSequence) this.r.e.run(1, Integer.valueOf(this.r.a())), z10, true);
        o6Var2.c.s(org.telegram.ui.ActionBar.g6.v0(i10 >= this.r.a() ? org.telegram.ui.ActionBar.g6.I6 : org.telegram.ui.ActionBar.g6.y6, this.a), z10);
        o6Var2.invalidate();
        float f9 = i10 >= this.r.a() ? 1.0f : 0.0f;
        if (Math.abs(this.w - f9) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x = null;
        }
        this.w = f9;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f9);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new r(this, 6));
            this.x.addListener(new org.telegram.ui.ActionBar.a1(this, f9, 3));
            this.x.setDuration(240L);
            this.x.start();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        this.v = f9;
        colorMatrix.setSaturation(f9);
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
        }
        o6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
