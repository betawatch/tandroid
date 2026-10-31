package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.w;
import c5.e;
import java.util.WeakHashMap;
import l.a0;
import l.l;
import m.h;
import m.s3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.h0;
import r0.k0;
import v7.r7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public LinearLayout D;
    public TextView E;
    public TextView F;
    public final int G;
    public final int H;
    public boolean I;
    public final int J;
    public final e a;
    public final Context b;
    public ActionMenuView c;
    public h d;
    public int e;
    public k0 f;
    public boolean h;
    public boolean n;
    public CharSequence r;
    public CharSequence s;
    public View w;
    public View x;
    public View y;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int g(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int u10 = i0.a.u(i12, measuredHeight, 2, i11);
        if (z10) {
            view.layout(i10 - measuredWidth, u10, i10, measuredHeight + u10);
        } else {
            view.layout(i10, u10, i10 + measuredWidth, measuredHeight + u10);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void c(k.a aVar) {
        View view = this.w;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.J, (ViewGroup) this, false);
            this.w = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.w);
        }
        View findViewById = this.w.findViewById(R.id.action_mode_close_button);
        this.x = findViewById;
        findViewById.setOnClickListener(new w(aVar, 6));
        l d = aVar.d();
        h hVar = this.d;
        if (hVar != null) {
            hVar.f();
            m.d dVar = hVar.J;
            if (dVar != null && dVar.b()) {
                dVar.i.dismiss();
            }
        }
        h hVar2 = new h(getContext());
        this.d = hVar2;
        hVar2.x = true;
        hVar2.y = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d.b(this.d, this.b);
        h hVar3 = this.d;
        a0 a0Var = hVar3.n;
        if (a0Var == null) {
            a0 a0Var2 = (a0) hVar3.d.inflate(hVar3.f, (ViewGroup) this, false);
            hVar3.n = a0Var2;
            a0Var2.b(hVar3.c);
            hVar3.d();
        }
        a0 a0Var3 = hVar3.n;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(hVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.c = actionMenuView;
        WeakHashMap weakHashMap = h0.a;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.D == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.D = linearLayout;
            this.E = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.F = (TextView) this.D.findViewById(R.id.action_bar_subtitle);
            int i10 = this.G;
            if (i10 != 0) {
                this.E.setTextAppearance(getContext(), i10);
            }
            int i11 = this.H;
            if (i11 != 0) {
                this.F.setTextAppearance(getContext(), i11);
            }
        }
        this.E.setText(this.r);
        this.F.setText(this.s);
        boolean isEmpty = TextUtils.isEmpty(this.r);
        boolean isEmpty2 = TextUtils.isEmpty(this.s);
        this.F.setVisibility(!isEmpty2 ? 0 : 8);
        this.D.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.D.getParent() == null) {
            addView(this.D);
        }
    }

    public final void e() {
        removeAllViews();
        this.y = null;
        this.c = null;
        this.d = null;
        View view = this.x;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.a : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.s;
    }

    public CharSequence getTitle() {
        return this.r;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            k0 k0Var = this.f;
            if (k0Var != null) {
                k0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final k0 i(int i10, long j10) {
        k0 k0Var = this.f;
        if (k0Var != null) {
            k0Var.b();
        }
        e eVar = this.a;
        if (i10 != 0) {
            k0 a2 = h0.a(this);
            a2.a(0.0f);
            a2.c(j10);
            ((ActionBarContextView) eVar.c).f = a2;
            eVar.a = i10;
            a2.d(eVar);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        k0 a10 = h0.a(this);
        a10.a(1.0f);
        a10.c(j10);
        ((ActionBarContextView) eVar.c).f = a10;
        eVar.a = i10;
        a10.d(eVar);
        return a10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.a.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        h hVar = this.d;
        if (hVar != null) {
            Configuration configuration2 = hVar.b.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            hVar.F = (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || (i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960)) ? 5 : (i10 >= 500 || (i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640)) ? 4 : i10 >= 360 ? 3 : 2;
            l lVar = hVar.c;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.d;
        if (hVar != null) {
            hVar.f();
            m.d dVar = this.d.J;
            if (dVar == null || !dVar.b()) {
                return;
            }
            dVar.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.n = false;
        }
        if (!this.n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.n = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.n = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean a2 = s3.a(this);
        int paddingRight = a2 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            int i14 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = a2 ? paddingRight - i14 : paddingRight + i14;
            int g10 = g(i16, paddingTop, paddingTop2, this.w, a2) + i16;
            paddingRight = a2 ? g10 - i15 : g10 + i15;
        }
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.y == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.D, a2);
        }
        View view2 = this.y;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = TLObject.FLAG_30;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.e;
        if (i13 <= 0) {
            i13 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i14 = i13 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31);
        View view = this.w;
        if (view != null) {
            int f7 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            paddingLeft = f7 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.y == null) {
            if (this.I) {
                this.D.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.D.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.D.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i15 >= 0) {
                paddingLeft = Math.min(i15, paddingLeft);
            }
            int i17 = layoutParams.height;
            if (i17 == -2) {
                i12 = Integer.MIN_VALUE;
            }
            if (i17 >= 0) {
                i14 = Math.min(i17, i14);
            }
            this.y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, i13);
            return;
        }
        int childCount = getChildCount();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i18) {
                i18 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.h = false;
        return true;
    }

    public void setContentHeight(int i10) {
        this.e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        this.y = view;
        if (view != null && (linearLayout = this.D) != null) {
            removeView(linearLayout);
            this.D = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.s = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.r = charSequence;
        d();
        h0.k(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.I) {
            requestLayout();
        }
        this.I = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        e eVar = new e();
        eVar.c = this;
        eVar.b = false;
        this.a = eVar;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.b = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.d, i10, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = r7.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = h0.a;
        setBackground(drawable);
        this.G = obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.J = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
