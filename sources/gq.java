// default package

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gq extends Spinner {
    public static final int[] r = {R.attr.spinnerMode};
    public final lo a;
    public final Context b;
    public final up c;
    public SpinnerAdapter d;
    public final boolean e;
    public final fq f;
    public int h;
    public final Rect n;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.telegram.messenger.beta.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.n = new Rect();
        brb.a(getContext(), this);
        int[] iArr = w19.v;
        ko9 v = ko9.v(context, attributeSet, iArr, org.telegram.messenger.beta.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) v.c;
        this.a = new lo(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new yw2(context, resourceId);
        } else {
            this.b = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, r, org.telegram.messenger.beta.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i == 0) {
            zp zpVar = new zp(this);
            this.f = zpVar;
            zpVar.c = typedArray2.getString(2);
        } else if (i == 1) {
            dq dqVar = new dq(this, this.b, attributeSet);
            ko9 v2 = ko9.v(this.b, attributeSet, iArr, org.telegram.messenger.beta.R.attr.spinnerStyle);
            this.h = ((TypedArray) v2.c).getLayoutDimension(3, -2);
            dqVar.i(v2.n(1));
            dqVar.T = typedArray2.getString(2);
            v2.y();
            this.f = dqVar;
            this.c = new up(this, this, dqVar);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(org.telegram.messenger.beta.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        v.y();
        this.e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.a.g(attributeSet, org.telegram.messenger.beta.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.n;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        fq fqVar = this.f;
        return fqVar != null ? fqVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        fq fqVar = this.f;
        return fqVar != null ? fqVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.h : super.getDropDownWidth();
    }

    public final fq getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        fq fqVar = this.f;
        return fqVar != null ? fqVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        fq fqVar = this.f;
        return fqVar != null ? fqVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.f();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fq fqVar = this.f;
        if (fqVar == null || !fqVar.a()) {
            return;
        }
        fqVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        eq eqVar = (eq) parcelable;
        super.onRestoreInstanceState(eqVar.getSuperState());
        if (!eqVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new vp(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        eq eqVar = new eq(super.onSaveInstanceState());
        fq fqVar = this.f;
        eqVar.a = fqVar != null && fqVar.a();
        return eqVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        up upVar = this.c;
        if (upVar == null || !upVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        fq fqVar = this.f;
        if (fqVar == null) {
            return super.performClick();
        }
        if (fqVar.a()) {
            return true;
        }
        fqVar.l(xp.b(this), xp.a(this));
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        fq fqVar = this.f;
        if (fqVar != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            aq aqVar = new aq();
            aqVar.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                aqVar.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                yp.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            fqVar.n(aqVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        fq fqVar = this.f;
        if (fqVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            fqVar.k(i);
            fqVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f != null) {
            this.h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(yqd.a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.n(mode);
        }
    }
}
