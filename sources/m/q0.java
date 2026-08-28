package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
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
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import f7.t7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 extends Spinner {
    public static final int[] r = {R.attr.spinnerMode};
    public final n a;
    public final Context b;
    public final f0 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final p0 f;
    public int h;
    public final Rect n;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.telegram.messenger.beta.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.n = new Rect();
        d3.a(this, getContext());
        int[] iArr = f.a.v;
        j4.c E = j4.c.E(context, attributeSet, iArr, org.telegram.messenger.beta.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) E.c;
        this.a = new n(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new k.c(context, resourceId);
        } else {
            this.b = context;
        }
        int i9 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, r, org.telegram.messenger.beta.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i9 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e10) {
                    e = e10;
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
        } catch (Exception e11) {
            e = e11;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i9 == 0) {
            j0 j0Var = new j0(this);
            this.f = j0Var;
            j0Var.c = typedArray2.getString(2);
        } else if (i9 == 1) {
            n0 n0Var = new n0(this, this.b, attributeSet);
            j4.c E2 = j4.c.E(this.b, attributeSet, iArr, org.telegram.messenger.beta.R.attr.spinnerStyle);
            this.h = ((TypedArray) E2.c).getLayoutDimension(3, -2);
            n0Var.i(E2.w(1));
            n0Var.O = typedArray2.getString(2);
            E2.G();
            this.f = n0Var;
            this.c = new f0(this, this, n0Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(org.telegram.messenger.beta.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        E.G();
        this.e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.a.d(attributeSet, org.telegram.messenger.beta.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i9 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i10;
        }
        Rect rect = this.n;
        drawable.getPadding(rect);
        return rect.left + rect.right + i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.a;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        p0 p0Var = this.f;
        return p0Var != null ? p0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        p0 p0Var = this.f;
        return p0Var != null ? p0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.h : super.getDropDownWidth();
    }

    public final p0 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        p0 p0Var = this.f;
        return p0Var != null ? p0Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        p0 p0Var = this.f;
        return p0Var != null ? p0Var.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0 p0Var = this.f;
        if (p0Var == null || !p0Var.a()) {
            return;
        }
        p0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f == null || View.MeasureSpec.getMode(i9) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o0 o0Var = (o0) parcelable;
        super.onRestoreInstanceState(o0Var.getSuperState());
        if (!o0Var.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new androidx.mediarouter.app.k(this, 3));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        o0 o0Var = new o0(super.onSaveInstanceState());
        p0 p0Var = this.f;
        o0Var.a = p0Var != null && p0Var.a();
        return o0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.c;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        p0 p0Var = this.f;
        if (p0Var == null) {
            return super.performClick();
        }
        if (p0Var.a()) {
            return true;
        }
        p0Var.m(h0.b(this), h0.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        n nVar = this.a;
        if (nVar != null) {
            nVar.f(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i9) {
        p0 p0Var = this.f;
        if (p0Var == null) {
            super.setDropDownHorizontalOffset(i9);
        } else {
            p0Var.l(i9);
            p0Var.c(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i9) {
        p0 p0Var = this.f;
        if (p0Var != null) {
            p0Var.j(i9);
        } else {
            super.setDropDownVerticalOffset(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i9) {
        if (this.f != null) {
            this.h = i9;
        } else {
            super.setDropDownWidth(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        p0 p0Var = this.f;
        if (p0Var != null) {
            p0Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i9) {
        setPopupBackgroundDrawable(t7.b(getPopupContext(), i9));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        p0 p0Var = this.f;
        if (p0Var != null) {
            p0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p0 p0Var = this.f;
        if (p0Var != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            p0Var.o(new k0(spinnerAdapter, context.getTheme()));
        }
    }
}
