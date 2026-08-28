package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class d0 extends SeekBar {
    public final e0 a;

    public d0(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        d3.a(this, getContext());
        e0 e0Var = new e0(this);
        this.a = e0Var;
        e0Var.b(attributeSet, i9);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.a;
        d0 d0Var = e0Var.e;
        Drawable drawable = e0Var.f;
        if (drawable != null && drawable.isStateful() && drawable.setState(d0Var.getDrawableState())) {
            d0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
    }
}
