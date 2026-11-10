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
import c8.i9;
import f.a;
import l.b;
import l.c;
import l.k;
import l.m;
import l.y;
import m.a1;
import m.j;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends a1 implements y, View.OnClickListener, j {
    public boolean D;
    public boolean E;
    public final int F;
    public int G;
    public final int H;
    public m n;
    public CharSequence r;
    public Drawable s;
    public l.j w;
    public b x;
    public c y;

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
        if (mVar.hasSubMenu() && this.x == null) {
            this.x = new b(this);
        }
    }

    @Override // m.j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.n.getIcon() == null;
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i7 < 480) {
            return (i7 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void g() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.r);
        if (this.s != null && ((this.n.y & 4) != 4 || (!this.D && !this.E))) {
            z9 = false;
        }
        boolean z11 = z10 & z9;
        setText(z11 ? this.r : null);
        CharSequence charSequence = this.n.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.n.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.n.r;
        if (TextUtils.isEmpty(charSequence2)) {
            i9.a(this, z11 ? null : this.n.e);
        } else {
            i9.a(this, charSequence2);
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
        l.j jVar = this.w;
        if (jVar != null) {
            jVar.a(this.n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.D = f();
        g();
    }

    @Override // m.a1, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i11 = this.G) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.F;
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
        if (this.n.hasSubMenu() && (bVar = this.x) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z9) {
        if (this.E != z9) {
            this.E = z9;
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
            int i7 = this.H;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(l.j jVar) {
        this.w = jVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.G = i7;
        super.setPadding(i7, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.y = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.r = charSequence;
        g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.D = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.c, i7, 0);
        this.F = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.H = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.G = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }
}
