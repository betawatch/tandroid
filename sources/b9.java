// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class b9 extends mp implements d9 {
    public final /* synthetic */ c9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(c9 c9Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = c9Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        m0f.a(this, getContentDescription());
        setOnTouchListener(new x8(this, this));
    }

    @Override // d9
    public final boolean b() {
        return false;
    }

    @Override // d9
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
