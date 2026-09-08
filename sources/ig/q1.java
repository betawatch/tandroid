package ig;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ov0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q1 extends ov0 {
    public final /* synthetic */ int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Context context, d5 d5Var, int i10) {
        super(context, d5Var);
        this.w0 = i10;
    }

    @Override // org.telegram.ui.Components.ov0
    public boolean P() {
        switch (this.w0) {
            case 2:
                return false;
            case 3:
                return false;
            case 4:
            default:
                return super.P();
            case 5:
                return false;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        switch (this.w0) {
            case 4:
                if (view instanceof kz) {
                    ViewGroup.LayoutParams layoutParams = ((kz) view).getLayoutParams();
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
    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        switch (this.w0) {
            case 4:
                int childCount = getChildCount();
                int R = R();
                int paddingLeft = getPaddingLeft();
                int paddingRight = (i12 - i10) - getPaddingRight();
                int paddingTop = getPaddingTop();
                int i21 = i13 - i11;
                int paddingBottom = i21 - getPaddingBottom();
                for (int i22 = 0; i22 < childCount; i22++) {
                    View childAt = getChildAt(i22);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i23 = layoutParams.gravity;
                        if (i23 == -1) {
                            i23 = 51;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection());
                        int i24 = i23 & 112;
                        int i25 = absoluteGravity & 7;
                        if (i25 == 1) {
                            i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        } else if (i25 != 5) {
                            i16 = layoutParams.leftMargin + paddingLeft;
                            if (i24 == 16) {
                                if (i24 == 48) {
                                    i20 = layoutParams.topMargin;
                                } else if (i24 != 80) {
                                    i20 = layoutParams.topMargin;
                                } else {
                                    i17 = paddingBottom - measuredHeight;
                                    i18 = layoutParams.bottomMargin;
                                }
                                i19 = i20 + paddingTop;
                                if (childAt instanceof kz) {
                                    i19 = AndroidUtilities.isTablet() ? i21 - measuredHeight : (i21 + R) - measuredHeight;
                                }
                                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                            } else {
                                i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                                i18 = layoutParams.bottomMargin;
                            }
                            i19 = i17 - i18;
                            if (childAt instanceof kz) {
                            }
                            childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = layoutParams.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i24 == 16) {
                        }
                        i19 = i17 - i18;
                        if (childAt instanceof kz) {
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    }
                }
                S();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.w0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
