package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.z5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j2 extends TextView {
    public boolean a;
    public Drawable b;

    public j2(Context context) {
        super(context);
        setTextColor(-1);
        setTextSize(1, 14.0f);
        setCurrent(false);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.a) {
            int x10 = org.telegram.ui.b.x(16.0f, getHeight(), 2);
            if (LocaleController.isRTL) {
                this.b.setBounds(AndroidUtilities.dp(7.0f), x10, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + x10);
            } else {
                this.b.setBounds(getWidth() - AndroidUtilities.dp(23.0f), x10, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + x10);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z4) {
        this.a = z4;
        if (z4) {
            setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 27.0f : 12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 27.0f), AndroidUtilities.dp(6.0f));
            setBackground(z5.d(new float[]{AndroidUtilities.dp(32.0f)}, 0, z5.b(1090519039)));
        } else {
            setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
            setBackground(z5.d(new float[]{0.0f}, 0, z5.b(-14145495)));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
