package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import eg.i1;
import java.util.WeakHashMap;
import m.p2;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.j0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean a;
    public View b;
    public View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public final boolean h;
    public boolean n;
    public final int r;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful()) {
            this.d.setState(getDrawableState());
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.action_bar);
        this.c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        boolean z10 = true;
        if (this.h) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.d == null) {
                z10 = false;
            } else if (this.b.getVisibility() == 0) {
                this.d.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            } else {
                View view = this.c;
                if (view == null || view.getVisibility() != 0) {
                    this.d.setBounds(0, 0, 0, 0);
                } else {
                    this.d.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                }
            }
            this.n = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.r) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), TLObject.FLAG_31);
        }
        super.onMeasure(i10, i11);
        if (this.b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.d);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.b;
            if (view != null) {
                this.d.setBounds(view.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.h ? !(this.d != null || this.e != null) : this.f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        boolean z4 = this.h;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.d != null || this.e != null) : this.f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.e);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.n && this.e != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.h ? !(this.d != null || this.e != null) : this.f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z4) {
        this.a = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z4 = i10 == 0;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.d;
        boolean z4 = this.h;
        if (drawable == drawable2 && !z4) {
            return true;
        }
        if (drawable == this.e && this.n) {
            return true;
        }
        return (drawable == this.f && z4) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i1 i1Var = new i1(this);
        WeakHashMap weakHashMap = j0.a;
        setBackground(i1Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.a);
        boolean z4 = false;
        this.d = obtainStyledAttributes.getDrawable(0);
        this.e = obtainStyledAttributes.getDrawable(2);
        this.r = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.h = true;
            this.f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.h ? !(this.d != null || this.e != null) : this.f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(p2 p2Var) {
    }
}
