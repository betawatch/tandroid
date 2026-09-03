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
import androidx.mediarouter.app.y;
import b7.l0;
import j7.s7;
import java.util.WeakHashMap;
import l.a0;
import l.l;
import m.h;
import m.u3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public TextView B;
    public TextView C;
    public final int D;
    public final int E;
    public boolean F;
    public final int G;
    public final l0 a;
    public final Context b;
    public ActionMenuView c;
    public h d;
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

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int g(int i10, int i11, int i12, View view, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int d = l.d.d(i12, measuredHeight, 2, i11);
        if (z4) {
            view.layout(i10 - measuredWidth, d, i10, measuredHeight + d);
        } else {
            view.layout(i10, d, i10 + measuredWidth, measuredHeight + d);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(k.a aVar) {
        View view = this.v;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.G, (ViewGroup) this, false);
            this.v = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.v);
        }
        View findViewById = this.v.findViewById(R.id.action_mode_close_button);
        this.w = findViewById;
        findViewById.setOnClickListener(new y(aVar, 6));
        l c3 = aVar.c();
        h hVar = this.d;
        if (hVar != null) {
            hVar.f();
            m.d dVar = hVar.G;
            if (dVar != null && dVar.b()) {
                dVar.i.dismiss();
            }
        }
        h hVar2 = new h(getContext());
        this.d = hVar2;
        hVar2.w = true;
        hVar2.x = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c3.b(this.d, this.b);
        h hVar3 = this.d;
        a0 a0Var = hVar3.n;
        if (a0Var == null) {
            a0 a0Var2 = (a0) hVar3.d.inflate(hVar3.f, (ViewGroup) this, false);
            hVar3.n = a0Var2;
            a0Var2.b(hVar3.c);
            hVar3.e();
        }
        a0 a0Var3 = hVar3.n;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(hVar3);
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
            this.B = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.C = (TextView) this.y.findViewById(R.id.action_bar_subtitle);
            int i10 = this.D;
            if (i10 != 0) {
                this.B.setTextAppearance(getContext(), i10);
            }
            int i11 = this.E;
            if (i11 != 0) {
                this.C.setTextAppearance(getContext(), i11);
            }
        }
        this.B.setText(this.r);
        this.C.setText(this.s);
        boolean isEmpty = TextUtils.isEmpty(this.r);
        boolean isEmpty2 = TextUtils.isEmpty(this.s);
        this.C.setVisibility(!isEmpty2 ? 0 : 8);
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
        l0 l0Var = this.a;
        if (i10 != 0) {
            m0 a2 = j0.a(this);
            a2.a(0.0f);
            a2.c(j10);
            ((ActionBarContextView) l0Var.c).f = a2;
            l0Var.b = i10;
            a2.d(l0Var);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        m0 a10 = j0.a(this);
        a10.a(1.0f);
        a10.c(j10);
        ((ActionBarContextView) l0Var.c).f = a10;
        l0Var.b = i10;
        a10.d(l0Var);
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
            hVar.C = (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || (i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960)) ? 5 : (i10 >= 500 || (i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640)) ? 4 : i10 >= 360 ? 3 : 2;
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
            m.d dVar = this.d.G;
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean a2 = u3.a(this);
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
            if (this.F) {
                this.y.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.y.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.y.setVisibility(z4 ? 0 : 8);
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

    public void setTitleOptional(boolean z4) {
        if (z4 != this.F) {
            requestLayout();
        }
        this.F = z4;
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
        l0 l0Var = new l0();
        l0Var.c = this;
        l0Var.a = false;
        this.a = l0Var;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.b = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.d, i10, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = s7.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = j0.a;
        setBackground(drawable);
        this.D = obtainStyledAttributes.getResourceId(5, 0);
        this.E = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.G = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
