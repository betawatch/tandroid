// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hu7 extends TextView {
    public boolean a;
    public Drawable b;

    public hu7(Context context) {
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
        canvas.translate(0.0f, gm.L(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.a) {
            int D = wi8.D(16.0f, getHeight(), 2);
            boolean z = jb6.a0;
            Drawable drawable = this.b;
            if (z) {
                drawable.setBounds(gm.L(7.0f), D, gm.L(23.0f), gm.L(16.0f) + D);
            } else {
                drawable.setBounds(getWidth() - gm.L(23.0f), D, getWidth() - gm.L(7.0f), gm.L(16.0f) + D);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z) {
        this.a = z;
        if (z) {
            setPadding(gm.L(jb6.a0 ? 27.0f : 12.0f), gm.L(6.0f), gm.L(jb6.a0 ? 12.0f : 27.0f), gm.L(6.0f));
            setBackground(ulb.d(0, ulb.b(1090519039), gm.L(32.0f)));
        } else {
            setPadding(gm.L(24.0f), gm.L(14.0f), gm.L(24.0f), gm.L(14.0f));
            setBackground(ulb.d(0, ulb.b(-14145495), 0.0f));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
