package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hb0 {
    public SpannableStringBuilder a;
    public int b;
    public Drawable c;
    public float d;
    public final int e;
    public final int f;
    public int g = -1;
    public int h = -1;
    public float i = 4.66f;

    public hb0(int i10, int i11) {
        this.e = i10;
        this.f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        SpannableStringBuilder spannableStringBuilder = this.a;
        int i10 = this.f;
        if (spannableStringBuilder != null && this.c != null && org.telegram.messenger.i0.p == this.d) {
            if (this.b != org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) {
                Drawable drawable = this.c;
                int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                this.b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.a;
        }
        if (context == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
        this.d = org.telegram.messenger.i0.p;
        Drawable mutate = context.getResources().getDrawable(this.e).mutate();
        this.c = mutate;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.b = w03;
        mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        int i11 = this.g;
        int intrinsicWidth = i11 <= 0 ? this.c.getIntrinsicWidth() : org.telegram.messenger.i0.L(i11);
        int i12 = this.h;
        int intrinsicHeight = i12 <= 0 ? this.c.getIntrinsicHeight() : org.telegram.messenger.i0.L(i12);
        int L = org.telegram.messenger.i0.L(this.i);
        this.c.setBounds(0, L, intrinsicWidth, intrinsicHeight + L);
        spannableStringBuilder2.setSpan(new ImageSpan(this.c, 2), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.t2(org.telegram.messenger.i0.L(2.0f)), 1, 2, 33);
        this.a = spannableStringBuilder2;
        return spannableStringBuilder2;
    }
}
