package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class s7 {
    public final TextPaint a;
    public final Paint b;
    public final Drawable c;
    public final Drawable d;
    public final Paint e;
    public final SparseArray f;
    public final HashMap g;

    public s7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint();
        this.b = paint;
        this.e = new Paint();
        this.f = new SparseArray();
        this.g = new HashMap();
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getDrawable(R.drawable.play_mini_video).mutate();
        this.c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(R.drawable.filled_views).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Lh, d6Var));
    }
}
