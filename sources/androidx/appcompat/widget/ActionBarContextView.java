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
import b8.oc;
import cg.v0;
import java.util.WeakHashMap;
import k2.p1;
import l.k;
import l.z;
import m.h;
import m.r3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public LinearLayout E;
    public TextView F;
    public TextView G;
    public final int H;
    public final int I;
    public boolean J;
    public final int K;
    public final v0 a;
    public final Context b;
    public ActionMenuView c;
    public h d;
    public int e;
    public l0 f;
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

    public static int f(View view, int i3, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), i10);
        return Math.max(0, i3 - view.getMeasuredWidth());
    }

    public static int g(int i3, int i10, int i11, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int e10 = p1.e(i11, measuredHeight, 2, i10);
        if (z10) {
            view.layout(i3 - measuredWidth, e10, i3, measuredHeight + e10);
        } else {
            view.layout(i3, e10, i3 + measuredWidth, measuredHeight + e10);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void c(k.a aVar) {
        View view = this.w;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.K, (ViewGroup) this, false);
            this.w = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.w);
        }
        View findViewById = this.w.findViewById(R.id.action_mode_close_button);
        this.x = findViewById;
        findViewById.setOnClickListener(new w(aVar, 6));
        k e10 = aVar.e();
        h hVar = this.d;
        if (hVar != null) {
            hVar.f();
            m.d dVar = hVar.K;
            if (dVar != null && dVar.b()) {
                dVar.i.dismiss();
            }
        }
        h hVar2 = new h(getContext());
        this.d = hVar2;
        hVar2.x = true;
        hVar2.y = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e10.b(this.d, this.b);
        h hVar3 = this.d;
        z zVar = hVar3.n;
        if (zVar == null) {
            z zVar2 = (z) hVar3.d.inflate(hVar3.f, (ViewGroup) this, false);
            hVar3.n = zVar2;
            zVar2.b(hVar3.c);
            hVar3.e();
        }
        z zVar3 = hVar3.n;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(hVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.c = actionMenuView;
        WeakHashMap weakHashMap = i0.a;
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
            int i3 = this.H;
            if (i3 != 0) {
                this.F.setTextAppearance(getContext(), i3);
            }
            int i10 = this.I;
            if (i10 != 0) {
                this.G.setTextAppearance(getContext(), i10);
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
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            l0 l0Var = this.f;
            if (l0Var != null) {
                l0Var.b();
            }
            super.setVisibility(i3);
        }
    }

    public final l0 i(int i3, long j10) {
        l0 l0Var = this.f;
        if (l0Var != null) {
            l0Var.b();
        }
        v0 v0Var = this.a;
        if (i3 != 0) {
            l0 a10 = i0.a(this);
            a10.a(0.0f);
            a10.c(j10);
            ((ActionBarContextView) v0Var.c).f = a10;
            v0Var.b = i3;
            a10.d(v0Var);
            return a10;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        l0 a11 = i0.a(this);
        a11.a(1.0f);
        a11.c(j10);
        ((ActionBarContextView) v0Var.c).f = a11;
        v0Var.b = i3;
        a11.d(v0Var);
        return a11;
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
            int i3 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            hVar.G = (configuration2.smallestScreenWidthDp > 600 || i3 > 600 || (i3 > 960 && i10 > 720) || (i3 > 720 && i10 > 960)) ? 5 : (i3 >= 500 || (i3 > 640 && i10 > 480) || (i3 > 480 && i10 > 640)) ? 4 : i3 >= 360 ? 3 : 2;
            k kVar = hVar.c;
            if (kVar != null) {
                kVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.d;
        if (hVar != null) {
            hVar.f();
            m.d dVar = this.d.K;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean a10 = r3.a(this);
        int paddingRight = a10 ? (i11 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            int i13 = a10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = a10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = a10 ? paddingRight - i13 : paddingRight + i13;
            int g7 = g(i15, paddingTop, paddingTop2, this.w, a10) + i15;
            paddingRight = a10 ? g7 - i14 : g7 + i14;
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null && this.y == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.E, a10);
        }
        View view2 = this.y;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, a10);
        }
        int paddingLeft = a10 ? getPaddingLeft() : (i11 - i3) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int mode = View.MeasureSpec.getMode(i3);
        int i11 = TLObject.FLAG_30;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i3);
        int i12 = this.e;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31);
        View view = this.w;
        if (view != null) {
            int f10 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            paddingLeft = f10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null && this.y == null) {
            if (this.J) {
                this.E.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.E.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.E.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i14 >= 0) {
                paddingLeft = Math.min(i14, paddingLeft);
            }
            int i16 = layoutParams.height;
            if (i16 == -2) {
                i11 = Integer.MIN_VALUE;
            }
            if (i16 >= 0) {
                i13 = Math.min(i16, i13);
            }
            this.y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i11));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, i12);
            return;
        }
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i17) {
                i17 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i17);
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

    public void setContentHeight(int i3) {
        this.e = i3;
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
        i0.k(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.J) {
            requestLayout();
        }
        this.J = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        Drawable drawable;
        int resourceId;
        v0 v0Var = new v0();
        v0Var.c = this;
        v0Var.a = false;
        this.a = v0Var;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.b = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.d, i3, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = oc.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = i0.a;
        setBackground(drawable);
        this.H = obtainStyledAttributes.getResourceId(5, 0);
        this.I = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.K = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
