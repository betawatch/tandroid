package org.telegram.ui.Components;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b51 extends xu0 {
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b51(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i9) {
        super(context, b5Var);
        this.s0 = i9;
    }

    @Override // org.telegram.ui.Components.xu0
    public boolean P() {
        switch (this.s0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
            default:
                return super.P();
            case 4:
                return false;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        switch (this.s0) {
            case 3:
                if (view instanceof wy) {
                    ViewGroup.LayoutParams layoutParams = ((wy) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
                break;
            default:
                super.addView(view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        switch (this.s0) {
            case 3:
                int childCount = getChildCount();
                int R = R();
                int paddingLeft = getPaddingLeft();
                int paddingRight = (i11 - i9) - getPaddingRight();
                int paddingTop = getPaddingTop();
                int i20 = i12 - i10;
                int paddingBottom = i20 - getPaddingBottom();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = getChildAt(i21);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i22 = layoutParams.gravity;
                        if (i22 == -1) {
                            i22 = 51;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection());
                        int i23 = i22 & 112;
                        int i24 = absoluteGravity & 7;
                        if (i24 == 1) {
                            i13 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                            i14 = layoutParams.rightMargin;
                        } else if (i24 != 5) {
                            i15 = layoutParams.leftMargin + paddingLeft;
                            if (i23 == 16) {
                                if (i23 == 48) {
                                    i19 = layoutParams.topMargin;
                                } else if (i23 != 80) {
                                    i19 = layoutParams.topMargin;
                                } else {
                                    i16 = paddingBottom - measuredHeight;
                                    i17 = layoutParams.bottomMargin;
                                }
                                i18 = i19 + paddingTop;
                                if (childAt instanceof wy) {
                                    i18 = AndroidUtilities.isTablet() ? i20 - measuredHeight : (i20 + R) - measuredHeight;
                                }
                                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                            } else {
                                i16 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                                i17 = layoutParams.bottomMargin;
                            }
                            i18 = i16 - i17;
                            if (childAt instanceof wy) {
                            }
                            childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                        } else {
                            i13 = paddingRight - measuredWidth;
                            i14 = layoutParams.rightMargin;
                        }
                        i15 = i13 - i14;
                        if (i23 == 16) {
                        }
                        i18 = i16 - i17;
                        if (childAt instanceof wy) {
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    }
                }
                S();
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.s0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }
}
