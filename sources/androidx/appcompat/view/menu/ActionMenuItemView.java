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
import f.a;
import l.b;
import l.c;
import l.k;
import l.m;
import l.y;
import m.a1;
import m.j;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends a1 implements y, View.OnClickListener, j {
    public boolean A;
    public final int B;
    public int C;
    public final int D;
    public m n;
    public CharSequence r;
    public Drawable s;
    public l.j v;
    public b w;
    public c x;
    public boolean y;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // m.j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.y
    public final void b(m mVar) {
        this.n = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.getTitleCondensed());
        setId(mVar.a);
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.w == null) {
            this.w = new b(this);
        }
    }

    @Override // m.j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.n.getIcon() == null;
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i9 < 480) {
            return (i9 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void g() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.r);
        if (this.s != null && ((this.n.y & 4) != 4 || (!this.y && !this.A))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.r : null);
        CharSequence charSequence = this.n.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.n.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.n.r;
        if (TextUtils.isEmpty(charSequence2)) {
            g7.m.a(this, z12 ? null : this.n.e);
        } else {
            g7.m.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.y
    public m getItemData() {
        return this.n;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l.j jVar = this.v;
        if (jVar != null) {
            jVar.a(this.n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y = f();
        g();
    }

    @Override // m.a1, android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i11 = this.C) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i9, i10);
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.B;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), i10);
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
        b bVar;
        if (this.n.hasSubMenu() && (bVar = this.w) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            m mVar = this.n;
            if (mVar != null) {
                k kVar = mVar.n;
                kVar.k = true;
                kVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.s = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i9 = this.D;
            if (intrinsicWidth > i9) {
                intrinsicHeight = (int) (intrinsicHeight * (i9 / intrinsicWidth));
                intrinsicWidth = i9;
            }
            if (intrinsicHeight > i9) {
                intrinsicWidth = (int) (intrinsicWidth * (i9 / intrinsicHeight));
            } else {
                i9 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i9);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(l.j jVar) {
        this.v = jVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        this.C = i9;
        super.setPadding(i9, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.x = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.r = charSequence;
        g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Resources resources = context.getResources();
        this.y = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.c, i9, 0);
        this.B = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.D = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.C = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
