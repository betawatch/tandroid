package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.oo0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h5 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public Object c;
    public View d;
    public View e;
    public Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(oo0 oo0Var, Context context) {
        super(context);
        this.h = oo0Var;
    }

    public u5 a() {
        u5 u5Var = new u5(getContext());
        u5Var.setGravity(17);
        u5Var.setTextSize(14);
        u5Var.setTextColor(((i5) this.h).e0);
        addView(u5Var, w7.b6.e(-2, -2, 51));
        return u5Var;
    }

    public void b(int i10) {
        i5 i5Var = (i5) this.h;
        u5[] u5VarArr = (u5[]) this.c;
        if (u5VarArr[i10] != null) {
            return;
        }
        u5 u5Var = new u5(getContext());
        u5Var.setGravity(17);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(17);
        u5Var.setTextColor(i5Var.d0);
        u5Var.setEmojiColor(i5Var.d0);
        u5Var.setDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        u5Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        u5Var.setRightDrawableTopPadding(-org.telegram.messenger.i0.L(1.0f));
        u5VarArr[i10] = u5Var;
        addView(u5Var, 0, w7.b6.e(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f = charSequence;
        u5 u5Var = (u5) this.e;
        if (u5Var != null) {
            u5Var.animate().cancel();
            ((u5) this.e).setVisibility(8);
        }
        if (((u5) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                this.d = a();
            }
        }
        ((u5) this.d).animate().cancel();
        ((u5) this.d).setAlpha(1.0f);
        ((u5) this.d).setTranslationY(0.0f);
        ((u5) this.d).k(charSequence);
        ((u5) this.d).setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        requestLayout();
    }

    public void d() {
        i5 i5Var = (i5) this.h;
        for (u5 u5Var : (u5[]) this.c) {
            if (u5Var != null) {
                u5Var.setTextColor(i5Var.d0);
                u5Var.setEmojiColor(i5Var.d0);
            }
        }
        u5 u5Var2 = (u5) this.d;
        if (u5Var2 != null) {
            u5Var2.setTextColor(i5Var.e0);
        }
        u5 u5Var3 = (u5) this.e;
        if (u5Var3 != null) {
            u5Var3.setTextColor(i5Var.e0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                u5 u5Var = (u5) this.d;
                boolean z11 = (u5Var == null || u5Var.getVisibility() == 8) ? false : true;
                u5[] u5VarArr = (u5[]) this.c;
                for (u5 u5Var2 : u5VarArr) {
                    if (u5Var2 != null && u5Var2.getVisibility() != 8) {
                        int L = z11 ? org.telegram.messenger.i0.L(5.0f) + (((i15 / 2) - u5Var2.getTextHeight()) / 2) : (i15 - u5Var2.getTextHeight()) / 2;
                        int measuredWidth = (i14 - u5Var2.getMeasuredWidth()) / 2;
                        int paddingTop = L - u5Var2.getPaddingTop();
                        u5Var2.layout(measuredWidth, paddingTop, u5Var2.getMeasuredWidth() + measuredWidth, u5Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z11) {
                    u5[] u5VarArr2 = {(u5) this.d, (u5) this.e};
                    for (int i16 = 0; i16 < 2; i16++) {
                        u5 u5Var3 = u5VarArr2[i16];
                        if (u5Var3 != null && u5Var3.getVisibility() != 8) {
                            int i17 = i15 / 2;
                            int textHeight = (((i17 - u5Var3.getTextHeight()) / 2) + i17) - org.telegram.messenger.i0.L(2.0f);
                            int measuredWidth2 = (i14 - u5Var3.getMeasuredWidth()) / 2;
                            u5Var3.layout(measuredWidth2, textHeight, u5Var3.getMeasuredWidth() + measuredWidth2, u5Var3.getTextHeight() + textHeight);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt != u5VarArr[0] && childAt != u5VarArr[1] && childAt != ((u5) this.d) && childAt != ((u5) this.e) && childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int i19 = layoutParams.leftMargin;
                        int measuredHeight = (((i15 - childAt.getMeasuredHeight()) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i19, measuredHeight, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + measuredHeight);
                    }
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                int max = Math.max(0, size - (this.b * 2));
                u5[] u5VarArr = (u5[]) this.c;
                for (u5 u5Var : u5VarArr) {
                    if (u5Var != null && u5Var.getVisibility() != 8) {
                        u5Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(u5Var.getPaddingBottom() + u5Var.getPaddingTop() + org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_31));
                    }
                }
                u5 u5Var2 = (u5) this.d;
                if (u5Var2 != null && u5Var2.getVisibility() != 8) {
                    ((u5) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_31));
                }
                u5 u5Var3 = (u5) this.e;
                if (u5Var3 != null && u5Var3.getVisibility() != 8) {
                    ((u5) this.e).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_31));
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != u5VarArr[0] && childAt != u5VarArr[1] && childAt != ((u5) this.d) && childAt != ((u5) this.e) && childAt.getVisibility() != 8) {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        h5 h5Var;
        switch (this.a) {
            case 1:
                super.setTranslationX(f7);
                oo0 oo0Var = (oo0) this.h;
                h5[] h5VarArr = oo0Var.n;
                if (oo0Var.s && (h5Var = h5VarArr[0]) == this) {
                    oo0Var.h.i(Math.abs(h5Var.getTranslationX()) / h5VarArr[0].getMeasuredWidth(), h5VarArr[1].b);
                    break;
                }
                break;
            default:
                super.setTranslationX(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(i5 i5Var, Context context) {
        super(context);
        this.h = i5Var;
        this.c = new u5[2];
        setClipChildren(false);
    }
}
