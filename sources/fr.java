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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fr extends Spinner {
    public static final int[] r = {R.attr.spinnerMode};
    public final kp a;
    public final Context b;
    public final tq c;
    public SpinnerAdapter d;
    public final boolean e;
    public final er f;
    public int h;
    public final Rect n;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.telegram.messenger.beta.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.n = new Rect();
        dpb.a(getContext(), this);
        int[] iArr = k09.v;
        wm9 v = wm9.v(context, attributeSet, iArr, org.telegram.messenger.beta.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) v.c;
        this.a = new kp(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new ox2(context, resourceId);
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
            yq yqVar = new yq(this);
            this.f = yqVar;
            yqVar.c = typedArray2.getString(2);
        } else if (i == 1) {
            cr crVar = new cr(this, this.b, attributeSet);
            wm9 v2 = wm9.v(this.b, attributeSet, iArr, org.telegram.messenger.beta.R.attr.spinnerStyle);
            this.h = ((TypedArray) v2.c).getLayoutDimension(3, -2);
            crVar.i(v2.j(1));
            crVar.T = typedArray2.getString(2);
            v2.y();
            this.f = crVar;
            this.c = new tq(this, this, crVar);
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
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        er erVar = this.f;
        return erVar != null ? erVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        er erVar = this.f;
        return erVar != null ? erVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.h : super.getDropDownWidth();
    }

    public final er getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        er erVar = this.f;
        return erVar != null ? erVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        er erVar = this.f;
        return erVar != null ? erVar.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        er erVar = this.f;
        if (erVar == null || !erVar.a()) {
            return;
        }
        erVar.dismiss();
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
        dr drVar = (dr) parcelable;
        super.onRestoreInstanceState(drVar.getSuperState());
        if (!drVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new uq(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        dr drVar = new dr(super.onSaveInstanceState());
        er erVar = this.f;
        drVar.a = erVar != null && erVar.a();
        return drVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tq tqVar = this.c;
        if (tqVar == null || !tqVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        er erVar = this.f;
        if (erVar == null) {
            return super.performClick();
        }
        if (erVar.a()) {
            return true;
        }
        erVar.l(wq.b(this), wq.a(this));
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        er erVar = this.f;
        if (erVar != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            zq zqVar = new zq();
            zqVar.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                zqVar.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                xq.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            erVar.n(zqVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        er erVar = this.f;
        if (erVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            erVar.k(i);
            erVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        er erVar = this.f;
        if (erVar != null) {
            erVar.j(i);
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
        er erVar = this.f;
        if (erVar != null) {
            erVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(kod.a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        er erVar = this.f;
        if (erVar != null) {
            erVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }
}
