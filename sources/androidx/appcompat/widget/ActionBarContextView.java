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
import f7.t7;
import j3.r0;
import java.util.WeakHashMap;
import l.k;
import l.z;
import m.e;
import m.i;
import m.w3;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public static int f(View view, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_31), i10);
        return Math.max(0, i9 - view.getMeasuredWidth());
    }

    public static int g(int i9, int i10, int i11, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int d = r0.d(i11, measuredHeight, 2, i10);
        if (z10) {
            view.layout(i9 - measuredWidth, d, i9, measuredHeight + d);
        } else {
            view.layout(i9, d, i9 + measuredWidth, measuredHeight + d);
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
        findViewById.setOnClickListener(new y(aVar, 6));
        k c10 = aVar.c();
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
            int i9 = this.C;
            if (i9 != 0) {
                this.A.setTextAppearance(getContext(), i9);
            }
            int i10 = this.D;
            if (i10 != 0) {
                this.B.setTextAppearance(getContext(), i10);
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
    public final void setVisibility(int i9) {
        if (i9 != getVisibility()) {
            m0 m0Var = this.f;
            if (m0Var != null) {
                m0Var.b();
            }
            super.setVisibility(i9);
        }
    }

    public final m0 i(int i9, long j10) {
        m0 m0Var = this.f;
        if (m0Var != null) {
            m0Var.b();
        }
        m.a aVar = this.a;
        if (i9 != 0) {
            m0 a2 = j0.a(this);
            a2.a(0.0f);
            a2.c(j10);
            ((ActionBarContextView) aVar.c).f = a2;
            aVar.b = i9;
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
        aVar.b = i9;
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
            int i9 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            iVar.B = (configuration2.smallestScreenWidthDp > 600 || i9 > 600 || (i9 > 960 && i10 > 720) || (i9 > 720 && i10 > 960)) ? 5 : (i9 >= 500 || (i9 > 640 && i10 > 480) || (i9 > 480 && i10 > 640)) ? 4 : i9 >= 360 ? 3 : 2;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean a2 = w3.a(this);
        int paddingRight = a2 ? (i11 - i9) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.v;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            int i13 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = a2 ? paddingRight - i13 : paddingRight + i13;
            int g10 = g(i15, paddingTop, paddingTop2, this.v, a2) + i15;
            paddingRight = a2 ? g10 - i14 : g10 + i14;
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null && this.x == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.y, a2);
        }
        View view2 = this.x;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i11 - i9) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int i11 = TLObject.FLAG_30;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i9);
        int i12 = this.e;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31);
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
            int i14 = layoutParams.width;
            int i15 = i14 != -2 ? TLObject.FLAG_30 : TLObject.FLAG_31;
            if (i14 >= 0) {
                paddingLeft = Math.min(i14, paddingLeft);
            }
            int i16 = layoutParams.height;
            if (i16 == -2) {
                i11 = TLObject.FLAG_31;
            }
            if (i16 >= 0) {
                i13 = Math.min(i16, i13);
            }
            this.x.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i11));
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

    public void setContentHeight(int i9) {
        this.e = i9;
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

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Drawable drawable;
        int resourceId;
        m.a aVar = new m.a();
        aVar.c = this;
        aVar.a = false;
        this.a = aVar;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.b = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.d, i9, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = t7.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = j0.a;
        setBackground(drawable);
        this.C = obtainStyledAttributes.getResourceId(5, 0);
        this.D = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.F = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
