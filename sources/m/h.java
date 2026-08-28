package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends w implements j {
    public final /* synthetic */ i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = iVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        g7.m.a(this, getContentDescription());
        setOnTouchListener(new l.b(this, this));
    }

    @Override // m.j
    public final boolean a() {
        return false;
    }

    @Override // m.j
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
    public final boolean setFrame(int i9, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i9, i10, i11, i12);
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
