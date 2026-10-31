package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s1 extends TextView {
    public boolean a;
    public Drawable b;

    public s1(Context context) {
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
        canvas.translate(0.0f, org.telegram.messenger.i0.L(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.a) {
            int y3 = z20.y(16.0f, getHeight(), 2);
            if (cd.X) {
                this.b.setBounds(org.telegram.messenger.i0.L(7.0f), y3, org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(16.0f) + y3);
            } else {
                this.b.setBounds(getWidth() - org.telegram.messenger.i0.L(23.0f), y3, getWidth() - org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(16.0f) + y3);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        this.a = z10;
        if (z10) {
            setPadding(org.telegram.messenger.i0.L(cd.X ? 27.0f : 12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(cd.X ? 12.0f : 27.0f), org.telegram.messenger.i0.L(6.0f));
            setBackground(j6.d(0, j6.b(1090519039), org.telegram.messenger.i0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(14.0f));
            setBackground(j6.d(0, j6.b(-14145495), 0.0f));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
