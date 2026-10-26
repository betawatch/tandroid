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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c8 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final org.telegram.ui.Components.s6 b;
    public final org.telegram.ui.Components.s6 c;
    public final org.telegram.ui.Components.s6 d;
    public final i0 e;
    public int f;
    public int h;
    public Utilities.Callback n;
    public b8 r;
    public CharSequence s;
    public float v;
    public float w;
    public ValueAnimator x;

    public c8(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = TLObject.FLAG_31;
        this.w = -1.0f;
        this.a = u6Var;
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
        this.b = s6Var;
        ds dsVar = ds.h;
        s6Var.b(0.3f, 220L, dsVar);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i10, u6Var);
        s6Var.setGravity(3);
        s6Var.setEmojiCacheType(19);
        s6Var.setEmojiColor(-1);
        s6Var.setImportantForAccessibility(2);
        addView(s6Var, gb1.h(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, true, true);
        this.c = s6Var2;
        s6Var2.b(0.3f, 220L, dsVar);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(s6Var2, org.telegram.ui.ActionBar.y6.I6, u6Var);
        s6Var2.setEmojiColor(-1);
        s6Var2.setEmojiCacheType(19);
        s6Var2.setImportantForAccessibility(2);
        addView(s6Var2, gb1.h(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.d = s6Var3;
        s6Var3.b(0.3f, 220L, dsVar);
        s6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var3.setGravity(5);
        s6Var3.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        s6Var3.setEmojiColor(-1);
        s6Var3.setEmojiCacheType(19);
        s6Var3.setImportantForAccessibility(2);
        addView(s6Var3, gb1.h(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        i0 i0Var = new i0(2, context, u6Var, false);
        this.e = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new a8(this));
        addView(i0Var, gb1.h(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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

    public final void d(int i10, b8 b8Var, Utilities.Callback callback) {
        this.f = i10;
        this.r = b8Var;
        this.n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        b8 b8Var = this.r;
        if (b8Var == null || b8Var.e == null) {
            return;
        }
        org.telegram.ui.Components.s6 s6Var = this.b;
        s6Var.a();
        org.telegram.ui.Components.s6 s6Var2 = this.d;
        s6Var2.a();
        org.telegram.ui.Components.s6 s6Var3 = this.c;
        s6Var3.a();
        s6Var3.c((CharSequence) this.r.e.run(0, Integer.valueOf(i10)), z10, true);
        s6Var.c((CharSequence) this.r.e.run(-1, Integer.valueOf(this.r.b())), z10, true);
        s6Var2.c((CharSequence) this.r.e.run(1, Integer.valueOf(this.r.a())), z10, true);
        s6Var2.c.v(org.telegram.ui.ActionBar.y6.w0(i10 >= this.r.a() ? org.telegram.ui.ActionBar.y6.I6 : org.telegram.ui.ActionBar.y6.y6, this.a), z10);
        s6Var2.invalidate();
        float f7 = i10 >= this.r.a() ? 1.0f : 0.0f;
        if (Math.abs(this.w - f7) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x = null;
        }
        this.w = f7;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.x.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 3));
            this.x.setDuration(240L);
            this.x.start();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        this.v = f7;
        colorMatrix.setSaturation(f7);
        if (org.telegram.ui.ActionBar.y6.I.q()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
        }
        s6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Components.s6 s6Var;
        try {
            b8 b8Var = this.r;
            if (b8Var != null && (s6Var = this.d) != null) {
                s6Var.c.v(org.telegram.ui.ActionBar.y6.w0(this.f >= b8Var.a() ? org.telegram.ui.ActionBar.y6.I6 : org.telegram.ui.ActionBar.y6.y6, this.a), false);
                s6Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
