package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ActionMenuItemView extends sq implements u07, View.OnClickListener, c9 {
    public boolean E;
    public boolean F;
    public final int G;
    public int H;
    public final int I;
    public c07 n;
    public CharSequence r;
    public Drawable s;
    public xz6 w;
    public w8 x;
    public x8 y;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.E = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jy8.c, 0, 0);
        this.G = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.I = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.H = -1;
        setSaveEnabled(false);
    }

    @Override // u07
    public final void a(c07 c07Var) {
        this.n = c07Var;
        setIcon(c07Var.getIcon());
        setTitle(c07Var.getTitleCondensed());
        setId(c07Var.a);
        setVisibility(c07Var.isVisible() ? 0 : 8);
        setEnabled(c07Var.isEnabled());
        if (c07Var.hasSubMenu() && this.x == null) {
            this.x = new w8(this);
        }
    }

    @Override // c9
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // c9
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.n.getIcon() == null;
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.r);
        if (this.s != null && ((this.n.y & 4) != 4 || (!this.E && !this.F))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.r : null);
        CharSequence charSequence = this.n.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.n.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.n.r;
        if (TextUtils.isEmpty(charSequence2)) {
            uve.a(this, z3 ? null : this.n.e);
        } else {
            uve.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // u07
    public c07 getItemData() {
        return this.n;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xz6 xz6Var = this.w;
        if (xz6Var != null) {
            xz6Var.a(this.n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.E = f();
        g();
    }

    @Override // sq, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.H) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.G;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), i2);
        }
        if (!isEmpty || this.s == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.s.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w8 w8Var;
        if (this.n.hasSubMenu() && (w8Var = this.x) != null && w8Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.F != z) {
            this.F = z;
            c07 c07Var = this.n;
            if (c07Var != null) {
                yz6 yz6Var = c07Var.n;
                yz6Var.k = true;
                yz6Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.s = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.I;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(xz6 xz6Var) {
        this.w = xz6Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.H = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(x8 x8Var) {
        this.y = x8Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.r = charSequence;
        g();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
