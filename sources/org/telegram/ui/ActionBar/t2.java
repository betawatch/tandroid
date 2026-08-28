package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(Dialog dialog, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = dialog;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int left;
        int measuredWidth;
        switch (this.a) {
            case 1:
                int childCount = getChildCount();
                int i15 = i11 - i9;
                int i16 = -1;
                if (!((c2) this.b).G0) {
                    View view = null;
                    int i17 = 0;
                    while (i17 < childCount) {
                        View childAt = getChildAt(i17);
                        Integer num = (Integer) childAt.getTag();
                        if (num == null) {
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight = childAt.getMeasuredHeight();
                            if (view != null) {
                                i14 = ((view.getMeasuredWidth() - measuredWidth2) / 2) + view.getLeft();
                                i13 = ((view.getMeasuredHeight() - measuredHeight) / 2) + view.getTop();
                            } else {
                                i13 = 0;
                                i14 = 0;
                            }
                            childAt.layout(i14, i13, measuredWidth2 + i14, measuredHeight + i13);
                        } else if (num.intValue() == i16) {
                            if (LocaleController.isRTL) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i15 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i15 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (LocaleController.isRTL) {
                                int paddingLeft = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft = org.telegram.messenger.l0.C(8.0f, view.getMeasuredWidth(), paddingLeft);
                                }
                                childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight = (i15 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight = ll.w(8.0f, view.getMeasuredWidth(), paddingRight);
                                }
                                childAt.layout(paddingRight, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag = findViewWithTag(-3);
                            if (LocaleController.isRTL) {
                                if (findViewWithTag == null) {
                                    left = i15 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag.getLeft() - AndroidUtilities.dp(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i18 = left - measuredWidth;
                                childAt.layout(i18, getPaddingTop(), childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingLeft2 = findViewWithTag == null ? getPaddingLeft() : findViewWithTag.getRight() + AndroidUtilities.dp(8.0f);
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (LocaleController.isRTL) {
                                childAt.layout((i15 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i15 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                        i17++;
                        i16 = -1;
                    }
                    break;
                } else {
                    View findViewWithTag2 = findViewWithTag(-3);
                    View findViewWithTag3 = findViewWithTag(-4);
                    View findViewWithTag4 = findViewWithTag(-2);
                    View findViewWithTag5 = findViewWithTag(-1);
                    int paddingLeft3 = getPaddingLeft();
                    int paddingRight2 = i15 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight2 - paddingLeft3) - AndroidUtilities.dp(8.0f)) / 2);
                    boolean z11 = LocaleController.isRTL;
                    int i19 = z11 ? paddingRight2 - max : paddingLeft3;
                    if (!z11) {
                        paddingLeft3 = paddingRight2 - max;
                    }
                    int paddingTop = getPaddingTop();
                    int dp = AndroidUtilities.dp(44.0f) + paddingTop;
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(i19, paddingTop, i19 + max, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(paddingLeft3, paddingTop, paddingLeft3 + max, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(i19, dp, i19 + max, AndroidUtilities.dp(40.0f) + dp);
                    }
                    if (findViewWithTag5 != null) {
                        findViewWithTag5.layout(paddingLeft3, dp, max + paddingLeft3, AndroidUtilities.dp(40.0f) + dp);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i9, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i11 = 0;
                if (!((c2) this.b).G0) {
                    int i12 = 0;
                    while (i11 < childCount) {
                        View childAt = getChildAt(i11);
                        if ((childAt instanceof TextView) && childAt.getTag() != null) {
                            i12 = childAt.getMeasuredWidth() + i12;
                        }
                        i11++;
                    }
                    if (i12 > measuredWidth) {
                        View findViewWithTag = findViewWithTag(-2);
                        View findViewWithTag2 = findViewWithTag(-4);
                        View findViewWithTag3 = findViewWithTag(-3);
                        if (findViewWithTag != null && findViewWithTag3 != null) {
                            if (findViewWithTag.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i12 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i12 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                            if (findViewWithTag2.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i12 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i12 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        }
                    }
                } else {
                    int max = Math.max(0, (measuredWidth - AndroidUtilities.dp(8.0f)) / 2);
                    while (i11 < childCount) {
                        View childAt2 = getChildAt(i11);
                        if (childAt2.getTag() != null) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                        }
                        i11++;
                    }
                    break;
                }
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f10);
                f3 f3Var = (f3) this.b;
                FrameLayout frameLayout = f3Var.topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(f3Var.container.getHeight() - f3Var.containerView.getY())) + f3Var.backgroundPaddingTop);
                }
                f3Var.onContainerTranslationYChanged(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
