package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class wc0 {
    public SpannableStringBuilder a;
    public int b;
    public Drawable c;
    public float d;
    public final int e;
    public final int f;
    public int g = -1;
    public int h = -1;
    public float i = 4.66f;

    public wc0(int i10, int i11) {
        this.e = i10;
        this.f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        SpannableStringBuilder spannableStringBuilder = this.a;
        int i10 = this.f;
        if (spannableStringBuilder != null && this.c != null && AndroidUtilities.density == this.d) {
            if (this.b != org.telegram.ui.ActionBar.k6.w0(i10, g6Var)) {
                Drawable drawable = this.c;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                this.b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
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
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        this.b = w03;
        mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        int i11 = this.g;
        int intrinsicWidth = i11 <= 0 ? this.c.getIntrinsicWidth() : AndroidUtilities.dp(i11);
        int i12 = this.h;
        int intrinsicHeight = i12 <= 0 ? this.c.getIntrinsicHeight() : AndroidUtilities.dp(i12);
        int dp = AndroidUtilities.dp(this.i);
        this.c.setBounds(0, dp, intrinsicWidth, intrinsicHeight + dp);
        spannableStringBuilder2.setSpan(new ImageSpan(this.c, 2), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.o2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
        this.a = spannableStringBuilder2;
        return spannableStringBuilder2;
    }
}
