package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public hb0(int i9, int i10) {
        this.e = i9;
        this.f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        SpannableStringBuilder spannableStringBuilder = this.a;
        int i9 = this.f;
        if (spannableStringBuilder != null && this.c != null && AndroidUtilities.density == this.d) {
            if (this.b != org.telegram.ui.ActionBar.f6.v0(i9, b6Var)) {
                Drawable drawable = this.c;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                this.b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.a;
        }
        if (context == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
        this.d = AndroidUtilities.density;
        Drawable mutate = context.getResources().getDrawable(this.e).mutate();
        this.c = mutate;
        int v03 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        this.b = v03;
        mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        int i10 = this.g;
        int intrinsicWidth = i10 <= 0 ? this.c.getIntrinsicWidth() : AndroidUtilities.dp(i10);
        int i11 = this.h;
        int intrinsicHeight = i11 <= 0 ? this.c.getIntrinsicHeight() : AndroidUtilities.dp(i11);
        int dp = AndroidUtilities.dp(this.i);
        this.c.setBounds(0, dp, intrinsicWidth, intrinsicHeight + dp);
        spannableStringBuilder2.setSpan(new ImageSpan(this.c, 2), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
        this.a = spannableStringBuilder2;
        return spannableStringBuilder2;
    }
}
