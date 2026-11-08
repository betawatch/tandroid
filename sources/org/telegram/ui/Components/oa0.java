package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class oa0 {
    public SpannableStringBuilder a;
    public int b;
    public Drawable c;
    public float d;
    public final int e;
    public final int f;
    public int g = -1;
    public int h = -1;
    public float i = 4.66f;

    public oa0(int i7, int i10) {
        this.e = i7;
        this.f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        SpannableStringBuilder spannableStringBuilder = this.a;
        int i7 = this.f;
        if (spannableStringBuilder != null && this.c != null && org.telegram.messenger.g0.p == this.d) {
            if (this.b != org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) {
                Drawable drawable = this.c;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                this.b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.a;
        }
        if (context == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
        this.d = org.telegram.messenger.g0.p;
        Drawable mutate = context.getResources().getDrawable(this.e).mutate();
        this.c = mutate;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        this.b = w03;
        mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        int i10 = this.g;
        int intrinsicWidth = i10 <= 0 ? this.c.getIntrinsicWidth() : org.telegram.messenger.g0.L(i10);
        int i11 = this.h;
        int intrinsicHeight = i11 <= 0 ? this.c.getIntrinsicHeight() : org.telegram.messenger.g0.L(i11);
        int L = org.telegram.messenger.g0.L(this.i);
        this.c.setBounds(0, L, intrinsicWidth, intrinsicHeight + L);
        spannableStringBuilder2.setSpan(new ImageSpan(this.c, 2), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
        this.a = spannableStringBuilder2;
        return spannableStringBuilder2;
    }
}
