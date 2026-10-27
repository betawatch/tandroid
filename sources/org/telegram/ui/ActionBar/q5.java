package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.xq0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public Object c;
    public View d;
    public View e;
    public Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(xq0 xq0Var, Context context) {
        super(context);
        this.h = xq0Var;
    }

    public b6 a() {
        b6 b6Var = new b6(getContext());
        b6Var.setGravity(17);
        b6Var.setTextSize(14);
        b6Var.setTextColor(((r5) this.h).c0);
        addView(b6Var, kb1.i(-2, -2, 51));
        return b6Var;
    }

    public void b(int i10) {
        r5 r5Var = (r5) this.h;
        b6[] b6VarArr = (b6[]) this.c;
        if (b6VarArr[i10] != null) {
            return;
        }
        b6 b6Var = new b6(getContext());
        b6Var.setGravity(17);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(17);
        b6Var.setTextColor(r5Var.b0);
        b6Var.setEmojiColor(r5Var.b0);
        b6Var.setDrawablePadding(AndroidUtilities.dp(4.0f));
        b6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        b6Var.setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        b6VarArr[i10] = b6Var;
        addView(b6Var, 0, kb1.i(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f = charSequence;
        b6 b6Var = (b6) this.e;
        if (b6Var != null) {
            b6Var.animate().cancel();
            ((b6) this.e).setVisibility(8);
        }
        if (((b6) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                this.d = a();
            }
        }
        ((b6) this.d).animate().cancel();
        ((b6) this.d).setAlpha(1.0f);
        ((b6) this.d).setTranslationY(0.0f);
        ((b6) this.d).k(charSequence);
        ((b6) this.d).setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        requestLayout();
    }

    public void d() {
        r5 r5Var = (r5) this.h;
        for (b6 b6Var : (b6[]) this.c) {
            if (b6Var != null) {
                b6Var.setTextColor(r5Var.b0);
                b6Var.setEmojiColor(r5Var.b0);
            }
        }
        b6 b6Var2 = (b6) this.d;
        if (b6Var2 != null) {
            b6Var2.setTextColor(r5Var.c0);
        }
        b6 b6Var3 = (b6) this.e;
        if (b6Var3 != null) {
            b6Var3.setTextColor(r5Var.c0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                b6 b6Var = (b6) this.d;
                boolean z11 = (b6Var == null || b6Var.getVisibility() == 8) ? false : true;
                b6[] b6VarArr = (b6[]) this.c;
                for (b6 b6Var2 : b6VarArr) {
                    if (b6Var2 != null && b6Var2.getVisibility() != 8) {
                        int dp = z11 ? AndroidUtilities.dp(5.0f) + (((i15 / 2) - b6Var2.getTextHeight()) / 2) : (i15 - b6Var2.getTextHeight()) / 2;
                        int measuredWidth = (i14 - b6Var2.getMeasuredWidth()) / 2;
                        int paddingTop = dp - b6Var2.getPaddingTop();
                        b6Var2.layout(measuredWidth, paddingTop, b6Var2.getMeasuredWidth() + measuredWidth, b6Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z11) {
                    b6[] b6VarArr2 = {(b6) this.d, (b6) this.e};
                    for (int i16 = 0; i16 < 2; i16++) {
                        b6 b6Var3 = b6VarArr2[i16];
                        if (b6Var3 != null && b6Var3.getVisibility() != 8) {
                            int i17 = i15 / 2;
                            int textHeight = (((i17 - b6Var3.getTextHeight()) / 2) + i17) - AndroidUtilities.dp(2.0f);
                            int measuredWidth2 = (i14 - b6Var3.getMeasuredWidth()) / 2;
                            b6Var3.layout(measuredWidth2, textHeight, b6Var3.getMeasuredWidth() + measuredWidth2, b6Var3.getTextHeight() + textHeight);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt != b6VarArr[0] && childAt != b6VarArr[1] && childAt != ((b6) this.d) && childAt != ((b6) this.e) && childAt.getVisibility() != 8) {
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
                b6[] b6VarArr = (b6[]) this.c;
                for (b6 b6Var : b6VarArr) {
                    if (b6Var != null && b6Var.getVisibility() != 8) {
                        b6Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(b6Var.getPaddingBottom() + b6Var.getPaddingTop() + AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
                    }
                }
                b6 b6Var2 = (b6) this.d;
                if (b6Var2 != null && b6Var2.getVisibility() != 8) {
                    ((b6) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
                b6 b6Var3 = (b6) this.e;
                if (b6Var3 != null && b6Var3.getVisibility() != 8) {
                    ((b6) this.e).measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != b6VarArr[0] && childAt != b6VarArr[1] && childAt != ((b6) this.d) && childAt != ((b6) this.e) && childAt.getVisibility() != 8) {
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
        q5 q5Var;
        switch (this.a) {
            case 1:
                super.setTranslationX(f7);
                xq0 xq0Var = (xq0) this.h;
                q5[] q5VarArr = xq0Var.n;
                if (xq0Var.s && (q5Var = q5VarArr[0]) == this) {
                    xq0Var.h.i(Math.abs(q5Var.getTranslationX()) / q5VarArr[0].getMeasuredWidth(), q5VarArr[1].b);
                    break;
                }
                break;
            default:
                super.setTranslationX(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, Context context) {
        super(context);
        this.h = r5Var;
        this.c = new b6[2];
        setClipChildren(false);
    }
}
