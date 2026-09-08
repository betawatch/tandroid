package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class c0 extends SeekBar {
    public final d0 a;

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a3.a(this, getContext());
        d0 d0Var = new d0(this);
        this.a = d0Var;
        d0Var.b(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.a;
        c0 c0Var = d0Var.e;
        Drawable drawable = d0Var.f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0Var.getDrawableState())) {
            c0Var.invalidateDrawable(drawable);
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
