package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import c8.h9;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class g extends v implements i {
    public final /* synthetic */ h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = hVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        h9.a(this, getContentDescription());
        setOnTouchListener(new l.b(this, this));
    }

    @Override // m.i
    public final boolean a() {
        return false;
    }

    @Override // m.i
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
    public final boolean setFrame(int i7, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i7, i10, i11, i12);
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
