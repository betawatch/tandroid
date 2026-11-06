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
import bg.w0;
import java.util.WeakHashMap;
import jg.g;
import l.k;
import l.z;
import m.e;
import m.i;
import m.t3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public LinearLayout D;
    public TextView E;
    public TextView F;
    public final int G;
    public final int H;
    public boolean I;
    public final int J;
    public final w0 a;
    public final Context b;
    public ActionMenuView c;
    public i d;
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

    public static int f(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_31), i10);
        return Math.max(0, i7 - view.getMeasuredWidth());
    }

    public static int g(int i7, int i10, int i11, View view, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int D = g.D(i11, measuredHeight, 2, i10);
        if (z9) {
            view.layout(i7 - measuredWidth, D, i7, measuredHeight + D);
        } else {
            view.layout(i7, D, i7 + measuredWidth, measuredHeight + D);
        }
        return z9 ? -measuredWidth : measuredWidth;
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
        k d = aVar.d();
        i iVar = this.d;
        if (iVar != null) {
            iVar.f();
            e eVar = iVar.J;
            if (eVar != null && eVar.b()) {
                eVar.i.dismiss();
            }
        }
        i iVar2 = new i(getContext());
        this.d = iVar2;
        iVar2.x = true;
        iVar2.y = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d.b(this.d, this.b);
        i iVar3 = this.d;
        z zVar = iVar3.n;
        if (zVar == null) {
            z zVar2 = (z) iVar3.d.inflate(iVar3.f, (ViewGroup) this, false);
            iVar3.n = zVar2;
            zVar2.b(iVar3.c);
            iVar3.e();
        }
        z zVar3 = iVar3.n;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(iVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.c = actionMenuView;
        WeakHashMap weakHashMap = i0.a;
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
            int i7 = this.G;
            if (i7 != 0) {
                this.E.setTextAppearance(getContext(), i7);
            }
            int i10 = this.H;
            if (i10 != 0) {
                this.F.setTextAppearance(getContext(), i10);
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
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            l0 l0Var = this.f;
            if (l0Var != null) {
                l0Var.b();
            }
            super.setVisibility(i7);
        }
    }

    public final l0 i(int i7, long j3) {
        l0 l0Var = this.f;
        if (l0Var != null) {
            l0Var.b();
        }
        w0 w0Var = this.a;
        if (i7 != 0) {
            l0 a10 = i0.a(this);
            a10.a(0.0f);
            a10.c(j3);
            ((ActionBarContextView) w0Var.c).f = a10;
            w0Var.b = i7;
            a10.d(w0Var);
            return a10;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        l0 a11 = i0.a(this);
        a11.a(1.0f);
        a11.c(j3);
        ((ActionBarContextView) w0Var.c).f = a11;
        w0Var.b = i7;
        a11.d(w0Var);
        return a11;
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
            int i7 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            iVar.F = (configuration2.smallestScreenWidthDp > 600 || i7 > 600 || (i7 > 960 && i10 > 720) || (i7 > 720 && i10 > 960)) ? 5 : (i7 >= 500 || (i7 > 640 && i10 > 480) || (i7 > 480 && i10 > 640)) ? 4 : i7 >= 360 ? 3 : 2;
            k kVar = iVar.c;
            if (kVar != null) {
                kVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.d;
        if (iVar != null) {
            iVar.f();
            e eVar = this.d.J;
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean a10 = t3.a(this);
        int paddingRight = a10 ? (i11 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            int i13 = a10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = a10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = a10 ? paddingRight - i13 : paddingRight + i13;
            int g10 = g(i15, paddingTop, paddingTop2, this.w, a10) + i15;
            paddingRight = a10 ? g10 - i14 : g10 + i14;
        }
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.y == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.D, a10);
        }
        View view2 = this.y;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, a10);
        }
        int paddingLeft = a10 ? getPaddingLeft() : (i11 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int i11 = TLObject.FLAG_30;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
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
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.y == null) {
            if (this.I) {
                this.D.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.D.getMeasuredWidth();
                boolean z9 = measuredWidth <= paddingLeft;
                if (z9) {
                    paddingLeft -= measuredWidth;
                }
                this.D.setVisibility(z9 ? 0 : 8);
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

    public void setContentHeight(int i7) {
        this.e = i7;
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
        i0.k(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.I) {
            requestLayout();
        }
        this.I = z9;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Drawable drawable;
        int resourceId;
        w0 w0Var = new w0();
        w0Var.c = this;
        w0Var.a = false;
        this.a = w0Var;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.b = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.d, i7, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = b5.a.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = i0.a;
        setBackground(drawable);
        this.G = obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.J = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
