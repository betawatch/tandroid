package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.an0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class x4 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public Object c;
    public View d;
    public View e;
    public Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(an0 an0Var, Context context) {
        super(context);
        this.h = an0Var;
    }

    public k5 a() {
        k5 k5Var = new k5(getContext());
        k5Var.setGravity(17);
        k5Var.setTextSize(14);
        k5Var.setTextColor(((y4) this.h).e0);
        addView(k5Var, ha.e(-2, -2, 51));
        return k5Var;
    }

    public void b(int i7) {
        y4 y4Var = (y4) this.h;
        k5[] k5VarArr = (k5[]) this.c;
        if (k5VarArr[i7] != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        k5Var.setGravity(17);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(17);
        k5Var.setTextColor(y4Var.d0);
        k5Var.setEmojiColor(y4Var.d0);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        k5Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        k5Var.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        k5VarArr[i7] = k5Var;
        addView(k5Var, 0, ha.e(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f = charSequence;
        k5 k5Var = (k5) this.e;
        if (k5Var != null) {
            k5Var.animate().cancel();
            ((k5) this.e).setVisibility(8);
        }
        if (((k5) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                this.d = a();
            }
        }
        ((k5) this.d).animate().cancel();
        ((k5) this.d).setAlpha(1.0f);
        ((k5) this.d).setTranslationY(0.0f);
        ((k5) this.d).k(charSequence);
        ((k5) this.d).setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        requestLayout();
    }

    public void d() {
        y4 y4Var = (y4) this.h;
        for (k5 k5Var : (k5[]) this.c) {
            if (k5Var != null) {
                k5Var.setTextColor(y4Var.d0);
                k5Var.setEmojiColor(y4Var.d0);
            }
        }
        k5 k5Var2 = (k5) this.d;
        if (k5Var2 != null) {
            k5Var2.setTextColor(y4Var.e0);
        }
        k5 k5Var3 = (k5) this.e;
        if (k5Var3 != null) {
            k5Var3.setTextColor(y4Var.e0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                k5 k5Var = (k5) this.d;
                boolean z10 = (k5Var == null || k5Var.getVisibility() == 8) ? false : true;
                k5[] k5VarArr = (k5[]) this.c;
                for (k5 k5Var2 : k5VarArr) {
                    if (k5Var2 != null && k5Var2.getVisibility() != 8) {
                        int L = z10 ? org.telegram.messenger.g0.L(5.0f) + (((i14 / 2) - k5Var2.getTextHeight()) / 2) : (i14 - k5Var2.getTextHeight()) / 2;
                        int measuredWidth = (i13 - k5Var2.getMeasuredWidth()) / 2;
                        int paddingTop = L - k5Var2.getPaddingTop();
                        k5Var2.layout(measuredWidth, paddingTop, k5Var2.getMeasuredWidth() + measuredWidth, k5Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z10) {
                    k5[] k5VarArr2 = {(k5) this.d, (k5) this.e};
                    for (int i15 = 0; i15 < 2; i15++) {
                        k5 k5Var3 = k5VarArr2[i15];
                        if (k5Var3 != null && k5Var3.getVisibility() != 8) {
                            int i16 = i14 / 2;
                            int textHeight = (((i16 - k5Var3.getTextHeight()) / 2) + i16) - org.telegram.messenger.g0.L(2.0f);
                            int measuredWidth2 = (i13 - k5Var3.getMeasuredWidth()) / 2;
                            k5Var3.layout(measuredWidth2, textHeight, k5Var3.getMeasuredWidth() + measuredWidth2, k5Var3.getTextHeight() + textHeight);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt != k5VarArr[0] && childAt != k5VarArr[1] && childAt != ((k5) this.d) && childAt != ((k5) this.e) && childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int i18 = layoutParams.leftMargin;
                        int measuredHeight = (((i14 - childAt.getMeasuredHeight()) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i18, measuredHeight, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + measuredHeight);
                    }
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                int max = Math.max(0, size - (this.b * 2));
                k5[] k5VarArr = (k5[]) this.c;
                for (k5 k5Var : k5VarArr) {
                    if (k5Var != null && k5Var.getVisibility() != 8) {
                        k5Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(k5Var.getPaddingBottom() + k5Var.getPaddingTop() + org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
                    }
                }
                k5 k5Var2 = (k5) this.d;
                if (k5Var2 != null && k5Var2.getVisibility() != 8) {
                    ((k5) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
                k5 k5Var3 = (k5) this.e;
                if (k5Var3 != null && k5Var3.getVisibility() != 8) {
                    ((k5) this.e).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != k5VarArr[0] && childAt != k5VarArr[1] && childAt != ((k5) this.d) && childAt != ((k5) this.e) && childAt.getVisibility() != 8) {
                        measureChildWithMargins(childAt, i7, 0, i10, 0);
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        x4 x4Var;
        switch (this.a) {
            case 1:
                super.setTranslationX(f10);
                an0 an0Var = (an0) this.h;
                x4[] x4VarArr = an0Var.n;
                if (an0Var.s && (x4Var = x4VarArr[0]) == this) {
                    an0Var.h.i(Math.abs(x4Var.getTranslationX()) / x4VarArr[0].getMeasuredWidth(), x4VarArr[1].b);
                    break;
                }
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(y4 y4Var, Context context) {
        super(context);
        this.h = y4Var;
        this.c = new k5[2];
        setClipChildren(false);
    }
}
