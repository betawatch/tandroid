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
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public LinearLayout E;
    public TextView F;
    public TextView G;
    public final int H;
    public final int I;
    public boolean J;
    public final int K;
    public final bc3 a;
    public final Context b;
    public ActionMenuView c;
    public b9 d;
    public int e;
    public ahc f;
    public boolean h;
    public boolean n;
    public CharSequence r;
    public CharSequence s;
    public View w;
    public View x;
    public View y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        bc3 bc3Var = new bc3();
        bc3Var.c = this;
        bc3Var.a = false;
        this.a = bc3Var;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k09.d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : kod.a(context, resourceId);
        WeakHashMap weakHashMap = kfc.a;
        setBackground(drawable);
        this.H = obtainStyledAttributes.getResourceId(5, 0);
        this.I = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.K = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_31), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int g = wi8.g(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, g, i, measuredHeight + g);
            return -measuredWidth;
        }
        view.layout(i, g, i + measuredWidth, measuredHeight + g);
        return measuredWidth;
    }

    public final void c(f9 f9Var) {
        View view = this.w;
        byte b = 0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.K, (ViewGroup) this, false);
            this.w = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.w);
        }
        View findViewById = this.w.findViewById(R.id.action_mode_close_button);
        this.x = findViewById;
        findViewById.setOnClickListener(new g6(f9Var, b));
        y17 d = f9Var.d();
        b9 b9Var = this.d;
        if (b9Var != null) {
            b9Var.e();
            y8 y8Var = b9Var.K;
            if (y8Var != null && y8Var.b()) {
                y8Var.i.dismiss();
            }
        }
        b9 b9Var2 = new b9(getContext());
        this.d = b9Var2;
        b9Var2.x = true;
        b9Var2.y = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d.b(this.d, this.b);
        b9 b9Var3 = this.d;
        v27 v27Var = b9Var3.n;
        if (v27Var == null) {
            v27 v27Var2 = (v27) b9Var3.d.inflate(b9Var3.f, (ViewGroup) this, false);
            b9Var3.n = v27Var2;
            v27Var2.b(b9Var3.c);
            b9Var3.j();
        }
        v27 v27Var3 = b9Var3.n;
        if (v27Var != v27Var3) {
            ((ActionMenuView) v27Var3).setPresenter(b9Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) v27Var3;
        this.c = actionMenuView;
        WeakHashMap weakHashMap = kfc.a;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.E == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.E = linearLayout;
            this.F = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.G = (TextView) this.E.findViewById(R.id.action_bar_subtitle);
            int i = this.H;
            if (i != 0) {
                this.F.setTextAppearance(getContext(), i);
            }
            int i2 = this.I;
            if (i2 != 0) {
                this.G.setTextAppearance(getContext(), i2);
            }
        }
        this.F.setText(this.r);
        this.G.setText(this.s);
        boolean isEmpty = TextUtils.isEmpty(this.r);
        boolean isEmpty2 = TextUtils.isEmpty(this.s);
        this.G.setVisibility(!isEmpty2 ? 0 : 8);
        this.E.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.E.getParent() == null) {
            addView(this.E);
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
        return this.f != null ? this.a.b : getVisibility();
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
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            ahc ahcVar = this.f;
            if (ahcVar != null) {
                ahcVar.b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ahc i(int i, long j) {
        ahc ahcVar = this.f;
        if (ahcVar != null) {
            ahcVar.b();
        }
        bc3 bc3Var = this.a;
        if (i != 0) {
            ahc a = kfc.a(this);
            a.a(0.0f);
            a.c(j);
            ((ActionBarContextView) bc3Var.c).f = a;
            bc3Var.b = i;
            a.d(bc3Var);
            return a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ahc a2 = kfc.a(this);
        a2.a(1.0f);
        a2.c(j);
        ((ActionBarContextView) bc3Var.c).f = a2;
        bc3Var.b = i;
        a2.d(bc3Var);
        return a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, k09.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        b9 b9Var = this.d;
        if (b9Var != null) {
            Configuration configuration2 = b9Var.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            b9Var.G = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            y17 y17Var = b9Var.c;
            if (y17Var != null) {
                y17Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b9 b9Var = this.d;
        if (b9Var != null) {
            b9Var.e();
            y8 y8Var = this.d.K;
            if (y8Var == null || !y8Var.b()) {
                return;
            }
            y8Var.i.dismiss();
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean a = ghc.a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            if (a) {
                int i7 = marginLayoutParams.rightMargin;
                i5 = marginLayoutParams.leftMargin;
                i6 = paddingRight - i7;
            } else {
                int i8 = marginLayoutParams.leftMargin;
                i5 = marginLayoutParams.rightMargin;
                i6 = paddingRight + i8;
            }
            int g = g(i6, paddingTop, paddingTop2, this.w, a) + i6;
            paddingRight = a ? g - i5 : g + i5;
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null && this.y == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.E, a);
        }
        View view2 = this.y;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = TLObject.FLAG_30;
        if (mode != 1073741824) {
            dq9.m(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            dq9.m(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.e;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_31);
        View view = this.w;
        if (view != null) {
            int f = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null && this.y == null) {
            if (this.J) {
                linearLayout.measure(0, makeMeasureSpec);
                int measuredWidth = this.E.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.E.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            if (i8 == -2) {
                i3 = Integer.MIN_VALUE;
            }
            if (i8 >= 0) {
                i5 = Math.min(i8, i5);
            }
            this.y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
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

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        this.y = view;
        if (view != null && (linearLayout = this.E) != null) {
            removeView(linearLayout);
            this.E = null;
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
        kfc.l(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.J) {
            requestLayout();
        }
        this.J = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
