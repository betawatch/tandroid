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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.Components.j6 b;
    public final org.telegram.ui.Components.j6 c;
    public final org.telegram.ui.Components.j6 d;
    public final j0 e;
    public int f;
    public int h;
    public Utilities.Callback n;
    public w7 r;
    public CharSequence s;
    public float v;
    public float w;
    public ValueAnimator x;

    public x7(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = TLObject.FLAG_31;
        this.w = -1.0f;
        this.a = b6Var;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.b = j6Var;
        gr grVar = gr.h;
        j6Var.b(0.3f, 220L, grVar);
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i9 = org.telegram.ui.ActionBar.f6.y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        j6Var.setGravity(3);
        j6Var.setEmojiCacheType(19);
        j6Var.setEmojiColor(-1);
        j6Var.setImportantForAccessibility(2);
        addView(j6Var, g7.e6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, true, true);
        this.c = j6Var2;
        j6Var2.b(0.3f, 220L, grVar);
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setGravity(17);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I6, b6Var));
        j6Var2.setEmojiColor(-1);
        j6Var2.setEmojiCacheType(19);
        j6Var2.setImportantForAccessibility(2);
        addView(j6Var2, g7.e6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.d = j6Var3;
        j6Var3.b(0.3f, 220L, grVar);
        j6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var3.setGravity(5);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        j6Var3.setEmojiColor(-1);
        j6Var3.setEmojiCacheType(19);
        j6Var3.setImportantForAccessibility(2);
        addView(j6Var3, g7.e6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, b6Var, false);
        this.e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new v7(this));
        addView(j0Var, g7.e6.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int i9, int[] iArr) {
        boolean z10 = false;
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 <= i9) {
                i10++;
                if (i11 == i9) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            i10++;
        }
        if (i10 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        int i12 = 0;
        for (int i13 : iArr) {
            if (i13 <= i9) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        if (!z10) {
            iArr2[i12] = i9;
        }
        return iArr2;
    }

    public final float b(int i9) {
        if (this.r.c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.r.c;
                if (i10 >= iArr.length) {
                    break;
                }
                int i11 = iArr[i10 - 1];
                int i12 = iArr[i10];
                if (i9 >= i11 && i9 <= i12) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i9 - i11) / (i12 - i11)) * r2.d) / this.r.d) + r4);
                }
                i10++;
            }
        }
        return Utilities.clamp01((i9 - this.r.b()) / (this.r.a() - this.r.b()));
    }

    public final int c(int i9) {
        if (this.r.c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.r.c;
                if (i10 >= iArr.length) {
                    break;
                }
                int i11 = i10 - 1;
                int i12 = iArr[i11];
                int i13 = iArr[i10];
                if (i9 >= i12 && i9 <= i13) {
                    return i11;
                }
                i10++;
            }
        }
        return i9;
    }

    public final void d(int i9, w7 w7Var, Utilities.Callback callback) {
        this.f = i9;
        this.r = w7Var;
        this.n = callback;
        this.e.e(b(i9), false);
        e(i9, false);
    }

    public final void e(int i9, boolean z10) {
        w7 w7Var = this.r;
        if (w7Var == null || w7Var.e == null) {
            return;
        }
        org.telegram.ui.Components.j6 j6Var = this.b;
        j6Var.a();
        org.telegram.ui.Components.j6 j6Var2 = this.d;
        j6Var2.a();
        org.telegram.ui.Components.j6 j6Var3 = this.c;
        j6Var3.a();
        j6Var3.c((CharSequence) this.r.e.run(0, Integer.valueOf(i9)), z10, true);
        j6Var.c((CharSequence) this.r.e.run(-1, Integer.valueOf(this.r.b())), z10, true);
        j6Var2.c((CharSequence) this.r.e.run(1, Integer.valueOf(this.r.a())), z10, true);
        j6Var2.c.s(org.telegram.ui.ActionBar.f6.v0(i9 >= this.r.a() ? org.telegram.ui.ActionBar.f6.I6 : org.telegram.ui.ActionBar.f6.y6, this.a), z10);
        j6Var2.invalidate();
        float f10 = i9 >= this.r.a() ? 1.0f : 0.0f;
        if (Math.abs(this.w - f10) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x = null;
        }
        this.w = f10;
        if (z10) {
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
        if (org.telegram.ui.ActionBar.f6.I.q()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
        }
        j6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(75.0f), TLObject.FLAG_30));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, AndroidUtilities.dp(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - AndroidUtilities.dp(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.s = charSequence;
    }

    public void setMinValueAllowed(int i9) {
        this.h = i9;
        if (this.f < i9) {
            this.f = i9;
        }
        if (this.r == null) {
            return;
        }
        this.e.setMinProgress(b(i9));
        e(this.f, false);
        invalidate();
    }
}
