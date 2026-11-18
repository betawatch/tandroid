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
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final org.telegram.ui.Components.n6 b;
    public final org.telegram.ui.Components.n6 c;
    public final org.telegram.ui.Components.n6 d;
    public final i0 e;
    public int f;
    public int h;
    public x10 n;
    public s7 r;
    public CharSequence s;
    public float w;
    public float x;
    public ValueAnimator y;

    public t7(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = TLObject.FLAG_31;
        this.x = -1.0f;
        this.a = i6Var;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        this.b = n6Var;
        lr lrVar = lr.h;
        n6Var.b(0.3f, 220L, lrVar);
        n6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i7 = org.telegram.ui.ActionBar.n6.y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setGravity(3);
        n6Var.setEmojiCacheType(19);
        n6Var.setEmojiColor(-1);
        n6Var.setImportantForAccessibility(2);
        addView(n6Var, c8.ma.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, false, true, true);
        this.c = n6Var2;
        n6Var2.b(0.3f, 220L, lrVar);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var2.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.I6, i6Var);
        n6Var2.setEmojiColor(-1);
        n6Var2.setEmojiCacheType(19);
        n6Var2.setImportantForAccessibility(2);
        addView(n6Var2, c8.ma.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.d = n6Var3;
        n6Var3.b(0.3f, 220L, lrVar);
        n6Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var3.setGravity(5);
        n6Var3.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        n6Var3.setEmojiColor(-1);
        n6Var3.setEmojiCacheType(19);
        n6Var3.setImportantForAccessibility(2);
        addView(n6Var3, c8.ma.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        i0 i0Var = new i0(2, context, i6Var, false);
        this.e = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new h9.g1(this, 27));
        addView(i0Var, c8.ma.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int[] iArr, int i7) {
        boolean z10 = false;
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 <= i7) {
                i10++;
                if (i11 == i7) {
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
            if (i13 <= i7) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        if (!z10) {
            iArr2[i12] = i7;
        }
        return iArr2;
    }

    public final float b(int i7) {
        if (this.r.c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.r.c;
                if (i10 >= iArr.length) {
                    break;
                }
                int i11 = iArr[i10 - 1];
                int i12 = iArr[i10];
                if (i7 >= i11 && i7 <= i12) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i7 - i11) / (i12 - i11)) * r2.d) / this.r.d) + r4);
                }
                i10++;
            }
        }
        return Utilities.l((i7 - this.r.b()) / (this.r.a() - this.r.b()));
    }

    public final int c(int i7) {
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
                if (i7 >= i12 && i7 <= i13) {
                    return i11;
                }
                i10++;
            }
        }
        return i7;
    }

    public final void d(int i7, s7 s7Var, x10 x10Var) {
        this.f = i7;
        this.r = s7Var;
        this.n = x10Var;
        this.e.e(false, b(i7));
        e(i7, false);
    }

    public final void e(int i7, boolean z10) {
        s7 s7Var = this.r;
        if (s7Var == null || s7Var.e == null) {
            return;
        }
        org.telegram.ui.Components.n6 n6Var = this.b;
        n6Var.a();
        org.telegram.ui.Components.n6 n6Var2 = this.d;
        n6Var2.a();
        org.telegram.ui.Components.n6 n6Var3 = this.c;
        n6Var3.a();
        n6Var3.c((CharSequence) this.r.e.g(0, Integer.valueOf(i7)), z10, true);
        n6Var.c((CharSequence) this.r.e.g(-1, Integer.valueOf(this.r.b())), z10, true);
        n6Var2.c((CharSequence) this.r.e.g(1, Integer.valueOf(this.r.a())), z10, true);
        n6Var2.c.v(org.telegram.ui.ActionBar.n6.w0(i7 >= this.r.a() ? org.telegram.ui.ActionBar.n6.I6 : org.telegram.ui.ActionBar.n6.y6, this.a), z10);
        n6Var2.invalidate();
        float f10 = i7 >= this.r.a() ? 1.0f : 0.0f;
        if (Math.abs(this.x - f10) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.y = null;
        }
        this.x = f10;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, f10);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new r(this, 6));
            this.y.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 3));
            this.y.setDuration(240L);
            this.y.start();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        this.w = f10;
        colorMatrix.setSaturation(f10);
        if (org.telegram.ui.ActionBar.n6.I.q()) {
            org.telegram.messenger.g0.h(colorMatrix, (1.0f - this.w) * (-0.3f));
        }
        n6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(75.0f), TLObject.FLAG_30));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, org.telegram.messenger.g0.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - org.telegram.messenger.g0.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.s = charSequence;
    }

    public void setMinValueAllowed(int i7) {
        this.h = i7;
        if (this.f < i7) {
            this.f = i7;
        }
        if (this.r == null) {
            return;
        }
        this.e.setMinProgress(b(i7));
        e(this.f, false);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.n6 n6Var;
        try {
            s7 s7Var = this.r;
            if (s7Var != null && (n6Var = this.d) != null) {
                n6Var.c.v(org.telegram.ui.ActionBar.n6.w0(this.f >= s7Var.a() ? org.telegram.ui.ActionBar.n6.I6 : org.telegram.ui.ActionBar.n6.y6, this.a), false);
                n6Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
