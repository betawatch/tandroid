// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mv7 extends TextView {
    public boolean a;
    public Drawable b;

    public mv7(Context context) {
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
        canvas.translate(0.0f, hl.L(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.a) {
            int D = ik8.D(16.0f, getHeight(), 2);
            boolean z = ob6.a0;
            Drawable drawable = this.b;
            if (z) {
                drawable.setBounds(hl.L(7.0f), D, hl.L(23.0f), hl.L(16.0f) + D);
            } else {
                drawable.setBounds(getWidth() - hl.L(23.0f), D, getWidth() - hl.L(7.0f), hl.L(16.0f) + D);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z) {
        this.a = z;
        if (z) {
            setPadding(hl.L(ob6.a0 ? 27.0f : 12.0f), hl.L(6.0f), hl.L(ob6.a0 ? 12.0f : 27.0f), hl.L(6.0f));
            setBackground(rnb.d(0, rnb.b(1090519039), hl.L(32.0f)));
        } else {
            setPadding(hl.L(24.0f), hl.L(14.0f), hl.L(24.0f), hl.L(14.0f));
            setBackground(rnb.d(0, rnb.b(-14145495), 0.0f));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
