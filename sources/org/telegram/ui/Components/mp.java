package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mp extends h6 {
    public final Rect s;
    public Drawable w;
    public boolean x;

    public mp(Context context) {
        super(context, false, false, false);
        this.s = new Rect();
    }

    public Rect getClickBounds() {
        return this.s;
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w != null) {
            Rect bounds = getDrawable().getBounds();
            Rect rect = this.s;
            rect.set(bounds);
            int ceil = (int) Math.ceil(getDrawable().c());
            if (getDrawable().b == 3) {
                rect.right = rect.left + ceil;
            } else if (getDrawable().b == 5) {
                rect.left = rect.right - ceil;
            } else if (getDrawable().b == 17) {
                int i3 = (rect.left + rect.right) / 2;
                int i10 = ceil / 2;
                rect.left = i3 - i10;
                rect.right = i3 + i10;
            }
            rect.left -= getPaddingLeft();
            rect.top -= getPaddingTop();
            rect.right = getPaddingRight() + rect.right;
            rect.bottom = getPaddingBottom() + rect.bottom;
            this.w.setBounds(rect);
            this.w.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = getClickBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0 && contains) {
            this.x = true;
            Drawable drawable = this.w;
            if (drawable != null) {
                drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.w.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
            invalidate();
            return contains;
        }
        if (motionEvent.getAction() == 1) {
            if (this.x && contains) {
                callOnClick();
            }
            this.x = false;
            Drawable drawable2 = this.w;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
                return contains;
            }
        } else if (motionEvent.getAction() == 3) {
            this.x = false;
            Drawable drawable3 = this.w;
            if (drawable3 != null) {
                drawable3.setState(StateSet.NOTHING);
            }
        }
        return contains;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.w || super.verifyDrawable(drawable);
    }
}
