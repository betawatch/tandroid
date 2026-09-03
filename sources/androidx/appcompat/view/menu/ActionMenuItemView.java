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
import l.j;
import l.k;
import l.m;
import l.y;
import m.a1;
import m.i;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends a1 implements y, View.OnClickListener, i {
    public boolean B;
    public final int C;
    public int D;
    public final int E;
    public m n;
    public CharSequence r;
    public Drawable s;
    public j v;
    public b w;
    public c x;
    public boolean y;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // m.i
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

    @Override // m.i
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.n.getIcon() == null;
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void g() {
        boolean z4 = true;
        boolean z10 = !TextUtils.isEmpty(this.r);
        if (this.s != null && ((this.n.y & 4) != 4 || (!this.y && !this.B))) {
            z4 = false;
        }
        boolean z11 = z10 & z4;
        setText(z11 ? this.r : null);
        CharSequence charSequence = this.n.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.n.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.n.r;
        if (TextUtils.isEmpty(charSequence2)) {
            k7.m.a(this, z11 ? null : this.n.e);
        } else {
            k7.m.a(this, charSequence2);
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
        j jVar = this.v;
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i12 = this.D) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.C;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), i11);
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

    public void setExpandedFormat(boolean z4) {
        if (this.B != z4) {
            this.B = z4;
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
            int i10 = this.E;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(j jVar) {
        this.v = jVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.D = i10;
        super.setPadding(i10, i11, i12, i13);
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

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.y = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.c, i10, 0);
        this.C = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.E = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.D = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }
}
