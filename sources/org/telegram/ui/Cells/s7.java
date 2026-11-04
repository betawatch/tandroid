package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.h6 b;
    public final org.telegram.ui.Components.h6 c;
    public final org.telegram.ui.Components.h6 d;
    public final h0 e;
    public int f;
    public int h;
    public u10 n;
    public r7 r;
    public CharSequence s;
    public float w;
    public float x;
    public ValueAnimator y;

    public s7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = TLObject.FLAG_31;
        this.x = -1.0f;
        this.a = e6Var;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, true);
        this.b = h6Var;
        xq xqVar = xq.h;
        h6Var.b(0.3f, 220L, xqVar);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i3 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setGravity(3);
        h6Var.setEmojiCacheType(19);
        h6Var.setEmojiColor(-1);
        h6Var.setImportantForAccessibility(2);
        addView(h6Var, mf.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, true, true);
        this.c = h6Var2;
        h6Var2.b(0.3f, 220L, xqVar);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.I6, e6Var);
        h6Var2.setEmojiColor(-1);
        h6Var2.setEmojiCacheType(19);
        h6Var2.setImportantForAccessibility(2);
        addView(h6Var2, mf.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.d = h6Var3;
        h6Var3.b(0.3f, 220L, xqVar);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var3.setGravity(5);
        h6Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        h6Var3.setEmojiColor(-1);
        h6Var3.setEmojiCacheType(19);
        h6Var3.setImportantForAccessibility(2);
        addView(h6Var3, mf.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        h0 h0Var = new h0(2, context, e6Var, false);
        this.e = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new gi.v5(this, 27));
        addView(h0Var, mf.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int[] iArr, int i3) {
        boolean z10 = false;
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 <= i3) {
                i10++;
                if (i11 == i3) {
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
            if (i13 <= i3) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        if (!z10) {
            iArr2[i12] = i3;
        }
        return iArr2;
    }

    public final float b(int i3) {
        if (this.r.c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.r.c;
                if (i10 >= iArr.length) {
                    break;
                }
                int i11 = iArr[i10 - 1];
                int i12 = iArr[i10];
                if (i3 >= i11 && i3 <= i12) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i3 - i11) / (i12 - i11)) * r2.d) / this.r.d) + r4);
                }
                i10++;
            }
        }
        return Utilities.l((i3 - this.r.b()) / (this.r.a() - this.r.b()));
    }

    public final int c(int i3) {
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
                if (i3 >= i12 && i3 <= i13) {
                    return i11;
                }
                i10++;
            }
        }
        return i3;
    }

    public final void d(int i3, r7 r7Var, u10 u10Var) {
        this.f = i3;
        this.r = r7Var;
        this.n = u10Var;
        this.e.e(false, b(i3));
        e(i3, false);
    }

    public final void e(int i3, boolean z10) {
        r7 r7Var = this.r;
        if (r7Var == null || r7Var.e == null) {
            return;
        }
        org.telegram.ui.Components.h6 h6Var = this.b;
        h6Var.a();
        org.telegram.ui.Components.h6 h6Var2 = this.d;
        h6Var2.a();
        org.telegram.ui.Components.h6 h6Var3 = this.c;
        h6Var3.a();
        h6Var3.c((CharSequence) this.r.e.d(0, Integer.valueOf(i3)), z10, true);
        h6Var.c((CharSequence) this.r.e.d(-1, Integer.valueOf(this.r.b())), z10, true);
        h6Var2.c((CharSequence) this.r.e.d(1, Integer.valueOf(this.r.a())), z10, true);
        h6Var2.c.v(org.telegram.ui.ActionBar.k6.w0(i3 >= this.r.a() ? org.telegram.ui.ActionBar.k6.I6 : org.telegram.ui.ActionBar.k6.y6, this.a), z10);
        h6Var2.invalidate();
        float f10 = i3 >= this.r.a() ? 1.0f : 0.0f;
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
            this.y.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 3));
            this.y.setDuration(240L);
            this.y.start();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        this.w = f10;
        colorMatrix.setSaturation(f10);
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            org.telegram.messenger.g0.h(colorMatrix, (1.0f - this.w) * (-0.3f));
        }
        h6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(75.0f), TLObject.FLAG_30));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, org.telegram.messenger.g0.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - org.telegram.messenger.g0.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.s = charSequence;
    }

    public void setMinValueAllowed(int i3) {
        this.h = i3;
        if (this.f < i3) {
            this.f = i3;
        }
        if (this.r == null) {
            return;
        }
        this.e.setMinProgress(b(i3));
        e(this.f, false);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.h6 h6Var;
        try {
            r7 r7Var = this.r;
            if (r7Var != null && (h6Var = this.d) != null) {
                h6Var.c.v(org.telegram.ui.ActionBar.k6.w0(this.f >= r7Var.a() ? org.telegram.ui.ActionBar.k6.I6 : org.telegram.ui.ActionBar.k6.y6, this.a), false);
                h6Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
