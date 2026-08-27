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
import g7.o7;
import java.util.WeakHashMap;
import l.a0;
import l.l;
import m.e;
import m.i;
import m.w3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public TextView A;
    public TextView B;
    public final int C;
    public final int D;
    public boolean E;
    public final int F;
    public final m.a a;
    public final Context b;
    public ActionMenuView c;
    public i d;
    public int e;
    public m0 f;
    public boolean h;
    public boolean n;
    public CharSequence r;
    public CharSequence s;
    public View v;
    public View w;
    public View x;
    public LinearLayout y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        m.a aVar = new m.a();
        aVar.c = this;
        aVar.a = false;
        this.a = aVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : o7.b(context, resourceId);
        WeakHashMap weakHashMap = j0.a;
        setBackground(drawable);
        this.C = obtainStyledAttributes.getResourceId(5, 0);
        this.D = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.F = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int g(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int B = i0.a.B(i12, measuredHeight, 2, i11);
        if (z10) {
            view.layout(i10 - measuredWidth, B, i10, measuredHeight + B);
        } else {
            view.layout(i10, B, i10 + measuredWidth, measuredHeight + B);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void c(k.a aVar) {
        View view = this.v;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.F, (ViewGroup) this, false);
            this.v = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.v);
        }
        View findViewById = this.v.findViewById(R.id.action_mode_close_button);
        this.w = findViewById;
        findViewById.setOnClickListener(new g.a(aVar, 1));
        l c10 = aVar.c();
        i iVar = this.d;
        if (iVar != null) {
            iVar.f();
            e eVar = iVar.F;
            if (eVar != null && eVar.b()) {
                eVar.i.dismiss();
            }
        }
        i iVar2 = new i(getContext());
        this.d = iVar2;
        iVar2.w = true;
        iVar2.x = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c10.b(this.d, this.b);
        i iVar3 = this.d;
        a0 a0Var = iVar3.n;
        if (a0Var == null) {
            a0 a0Var2 = (a0) iVar3.d.inflate(iVar3.f, (ViewGroup) this, false);
            iVar3.n = a0Var2;
            a0Var2.b(iVar3.c);
            iVar3.e();
        }
        a0 a0Var3 = iVar3.n;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(iVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.c = actionMenuView;
        WeakHashMap weakHashMap = j0.a;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.y == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.y = linearLayout;
            this.A = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.B = (TextView) this.y.findViewById(R.id.action_bar_subtitle);
            int i10 = this.C;
            if (i10 != 0) {
                this.A.setTextAppearance(getContext(), i10);
            }
            int i11 = this.D;
            if (i11 != 0) {
                this.B.setTextAppearance(getContext(), i11);
            }
        }
        this.A.setText(this.r);
        this.B.setText(this.s);
        boolean isEmpty = TextUtils.isEmpty(this.r);
        boolean isEmpty2 = TextUtils.isEmpty(this.s);
        this.B.setVisibility(!isEmpty2 ? 0 : 8);
        this.y.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.y.getParent() == null) {
            addView(this.y);
        }
    }

    public final void e() {
        removeAllViews();
        this.x = null;
        this.c = null;
        this.d = null;
        View view = this.w;
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
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            m0 m0Var = this.f;
            if (m0Var != null) {
                m0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final m0 i(int i10, long j10) {
        m0 m0Var = this.f;
        if (m0Var != null) {
            m0Var.b();
        }
        m.a aVar = this.a;
        if (i10 != 0) {
            m0 a2 = j0.a(this);
            a2.a(0.0f);
            a2.c(j10);
            ((ActionBarContextView) aVar.c).f = a2;
            aVar.b = i10;
            a2.d(aVar);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        m0 a3 = j0.a(this);
        a3.a(1.0f);
        a3.c(j10);
        ((ActionBarContextView) aVar.c).f = a3;
        aVar.b = i10;
        a3.d(aVar);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.a.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        i iVar = this.d;
        if (iVar != null) {
            Configuration configuration2 = iVar.b.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            iVar.B = (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || (i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960)) ? 5 : (i10 >= 500 || (i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640)) ? 4 : i10 >= 360 ? 3 : 2;
            l lVar = iVar.c;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.d;
        if (iVar != null) {
            iVar.f();
            e eVar = this.d.F;
            if (eVar == null || !eVar.b()) {
                return;
            }
            eVar.i.dismiss();
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
        boolean a2 = w3.a(this);
        int paddingRight = a2 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.v;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            int i14 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = a2 ? paddingRight - i14 : paddingRight + i14;
            int g10 = g(i16, paddingTop, paddingTop2, this.v, a2) + i16;
            paddingRight = a2 ? g10 - i15 : g10 + i15;
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null && this.x == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.y, a2);
        }
        View view2 = this.x;
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
        View view = this.v;
        if (view != null) {
            int f10 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            paddingLeft = f10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null && this.x == null) {
            if (this.E) {
                this.y.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.y.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.y.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.x;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = i15 != -2 ? TLObject.FLAG_30 : TLObject.FLAG_31;
            if (i15 >= 0) {
                paddingLeft = Math.min(i15, paddingLeft);
            }
            int i17 = layoutParams.height;
            if (i17 == -2) {
                i12 = TLObject.FLAG_31;
            }
            if (i17 >= 0) {
                i14 = Math.min(i17, i14);
            }
            this.x.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
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
        View view2 = this.x;
        if (view2 != null) {
            removeView(view2);
        }
        this.x = view;
        if (view != null && (linearLayout = this.y) != null) {
            removeView(linearLayout);
            this.y = null;
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
        j0.l(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.E) {
            requestLayout();
        }
        this.E = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
