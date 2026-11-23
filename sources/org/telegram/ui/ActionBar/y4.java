package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.dn0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y4 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public Object c;
    public View d;
    public View e;
    public Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(dn0 dn0Var, Context context) {
        super(context);
        this.h = dn0Var;
    }

    public n5 a() {
        n5 n5Var = new n5(getContext());
        n5Var.setGravity(17);
        n5Var.setTextSize(14);
        n5Var.setTextColor(((z4) this.h).f0);
        addView(n5Var, na.e(-2, -2, 51));
        return n5Var;
    }

    public void b(int i7) {
        z4 z4Var = (z4) this.h;
        n5[] n5VarArr = (n5[]) this.c;
        if (n5VarArr[i7] != null) {
            return;
        }
        n5 n5Var = new n5(getContext());
        n5Var.setGravity(17);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(17);
        n5Var.setTextColor(z4Var.e0);
        n5Var.setEmojiColor(z4Var.e0);
        n5Var.setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        n5Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        n5Var.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        n5VarArr[i7] = n5Var;
        addView(n5Var, 0, na.e(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f = charSequence;
        n5 n5Var = (n5) this.e;
        if (n5Var != null) {
            n5Var.animate().cancel();
            ((n5) this.e).setVisibility(8);
        }
        if (((n5) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                this.d = a();
            }
        }
        ((n5) this.d).animate().cancel();
        ((n5) this.d).setAlpha(1.0f);
        ((n5) this.d).setTranslationY(0.0f);
        ((n5) this.d).k(charSequence);
        ((n5) this.d).setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        requestLayout();
    }

    public void d() {
        z4 z4Var = (z4) this.h;
        for (n5 n5Var : (n5[]) this.c) {
            if (n5Var != null) {
                n5Var.setTextColor(z4Var.e0);
                n5Var.setEmojiColor(z4Var.e0);
            }
        }
        n5 n5Var2 = (n5) this.d;
        if (n5Var2 != null) {
            n5Var2.setTextColor(z4Var.f0);
        }
        n5 n5Var3 = (n5) this.e;
        if (n5Var3 != null) {
            n5Var3.setTextColor(z4Var.f0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                n5 n5Var = (n5) this.d;
                boolean z11 = (n5Var == null || n5Var.getVisibility() == 8) ? false : true;
                n5[] n5VarArr = (n5[]) this.c;
                for (n5 n5Var2 : n5VarArr) {
                    if (n5Var2 != null && n5Var2.getVisibility() != 8) {
                        int L = z11 ? org.telegram.messenger.g0.L(5.0f) + (((i14 / 2) - n5Var2.getTextHeight()) / 2) : (i14 - n5Var2.getTextHeight()) / 2;
                        int measuredWidth = (i13 - n5Var2.getMeasuredWidth()) / 2;
                        int paddingTop = L - n5Var2.getPaddingTop();
                        n5Var2.layout(measuredWidth, paddingTop, n5Var2.getMeasuredWidth() + measuredWidth, n5Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z11) {
                    n5[] n5VarArr2 = {(n5) this.d, (n5) this.e};
                    for (int i15 = 0; i15 < 2; i15++) {
                        n5 n5Var3 = n5VarArr2[i15];
                        if (n5Var3 != null && n5Var3.getVisibility() != 8) {
                            int i16 = i14 / 2;
                            int textHeight = (((i16 - n5Var3.getTextHeight()) / 2) + i16) - org.telegram.messenger.g0.L(2.0f);
                            int measuredWidth2 = (i13 - n5Var3.getMeasuredWidth()) / 2;
                            n5Var3.layout(measuredWidth2, textHeight, n5Var3.getMeasuredWidth() + measuredWidth2, n5Var3.getTextHeight() + textHeight);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt != n5VarArr[0] && childAt != n5VarArr[1] && childAt != ((n5) this.d) && childAt != ((n5) this.e) && childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int i18 = layoutParams.leftMargin;
                        int measuredHeight = (((i14 - childAt.getMeasuredHeight()) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i18, measuredHeight, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + measuredHeight);
                    }
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
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
                n5[] n5VarArr = (n5[]) this.c;
                for (n5 n5Var : n5VarArr) {
                    if (n5Var != null && n5Var.getVisibility() != 8) {
                        n5Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(n5Var.getPaddingBottom() + n5Var.getPaddingTop() + org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_31));
                    }
                }
                n5 n5Var2 = (n5) this.d;
                if (n5Var2 != null && n5Var2.getVisibility() != 8) {
                    ((n5) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
                n5 n5Var3 = (n5) this.e;
                if (n5Var3 != null && n5Var3.getVisibility() != 8) {
                    ((n5) this.e).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != n5VarArr[0] && childAt != n5VarArr[1] && childAt != ((n5) this.d) && childAt != ((n5) this.e) && childAt.getVisibility() != 8) {
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
        y4 y4Var;
        switch (this.a) {
            case 1:
                super.setTranslationX(f10);
                dn0 dn0Var = (dn0) this.h;
                y4[] y4VarArr = dn0Var.n;
                if (dn0Var.s && (y4Var = y4VarArr[0]) == this) {
                    dn0Var.h.i(Math.abs(y4Var.getTranslationX()) / y4VarArr[0].getMeasuredWidth(), y4VarArr[1].b);
                    break;
                }
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(z4 z4Var, Context context) {
        super(context);
        this.h = z4Var;
        this.c = new n5[2];
        setClipChildren(false);
    }
}
