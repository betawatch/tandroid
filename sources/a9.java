// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a9 extends lp implements c9 {
    public final /* synthetic */ b9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(b9 b9Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = b9Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        uve.a(this, getContentDescription());
        setOnTouchListener(new w8(this, this));
    }

    @Override // c9
    public final boolean b() {
        return false;
    }

    @Override // c9
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
