package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(Dialog dialog, Context context, int i10) {
        super(context);
        this.a = i10;
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int left;
        int measuredWidth;
        switch (this.a) {
            case 1:
                int childCount = getChildCount();
                int i16 = i12 - i10;
                int i17 = -1;
                if (!((d2) this.b).K0) {
                    View view = null;
                    int i18 = 0;
                    while (i18 < childCount) {
                        View childAt = getChildAt(i18);
                        Integer num = (Integer) childAt.getTag();
                        if (num == null) {
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight = childAt.getMeasuredHeight();
                            if (view != null) {
                                i15 = ((view.getMeasuredWidth() - measuredWidth2) / 2) + view.getLeft();
                                i14 = ((view.getMeasuredHeight() - measuredHeight) / 2) + view.getTop();
                            } else {
                                i14 = 0;
                                i15 = 0;
                            }
                            childAt.layout(i15, i14, measuredWidth2 + i15, measuredHeight + i14);
                        } else if (num.intValue() == i17) {
                            if (LocaleController.isRTL) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i16 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i16 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (LocaleController.isRTL) {
                                int paddingLeft = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft = org.telegram.messenger.a2.C(8.0f, view.getMeasuredWidth(), paddingLeft);
                                }
                                childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight = (i16 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight = em.v(8.0f, view.getMeasuredWidth(), paddingRight);
                                }
                                childAt.layout(paddingRight, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag = findViewWithTag(-3);
                            if (LocaleController.isRTL) {
                                if (findViewWithTag == null) {
                                    left = i16 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag.getLeft() - AndroidUtilities.dp(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i19 = left - measuredWidth;
                                childAt.layout(i19, getPaddingTop(), childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingLeft2 = findViewWithTag == null ? getPaddingLeft() : findViewWithTag.getRight() + AndroidUtilities.dp(8.0f);
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (LocaleController.isRTL) {
                                childAt.layout((i16 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i16 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                        i18++;
                        i17 = -1;
                    }
                    break;
                } else {
                    View findViewWithTag2 = findViewWithTag(-3);
                    View findViewWithTag3 = findViewWithTag(-4);
                    View findViewWithTag4 = findViewWithTag(-2);
                    View findViewWithTag5 = findViewWithTag(-1);
                    int paddingLeft3 = getPaddingLeft();
                    int paddingRight2 = i16 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight2 - paddingLeft3) - AndroidUtilities.dp(8.0f)) / 2);
                    boolean z11 = LocaleController.isRTL;
                    int i20 = z11 ? paddingRight2 - max : paddingLeft3;
                    if (!z11) {
                        paddingLeft3 = paddingRight2 - max;
                    }
                    int paddingTop = getPaddingTop();
                    int dp = AndroidUtilities.dp(44.0f) + paddingTop;
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(i20, paddingTop, i20 + max, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(paddingLeft3, paddingTop, paddingLeft3 + max, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(i20, dp, i20 + max, AndroidUtilities.dp(40.0f) + dp);
                    }
                    if (findViewWithTag5 != null) {
                        findViewWithTag5.layout(paddingLeft3, dp, max + paddingLeft3, AndroidUtilities.dp(40.0f) + dp);
                        break;
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
            case 1:
                super.onMeasure(i10, i11);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i12 = 0;
                if (!((d2) this.b).K0) {
                    int i13 = 0;
                    while (i12 < childCount) {
                        View childAt = getChildAt(i12);
                        if ((childAt instanceof TextView) && childAt.getTag() != null) {
                            i13 = childAt.getMeasuredWidth() + i13;
                        }
                        i12++;
                    }
                    if (i13 > measuredWidth) {
                        View findViewWithTag = findViewWithTag(-2);
                        View findViewWithTag2 = findViewWithTag(-4);
                        View findViewWithTag3 = findViewWithTag(-3);
                        if (findViewWithTag != null && findViewWithTag3 != null) {
                            if (findViewWithTag.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                            if (findViewWithTag2.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        }
                    }
                } else {
                    int max = Math.max(0, (measuredWidth - AndroidUtilities.dp(8.0f)) / 2);
                    while (i12 < childCount) {
                        View childAt2 = getChildAt(i12);
                        if (childAt2.getTag() != null) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                        }
                        i12++;
                    }
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f7);
                h3 h3Var = (h3) this.b;
                FrameLayout frameLayout = h3Var.topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(h3Var.container.getHeight() - h3Var.containerView.getY())) + h3Var.backgroundPaddingTop);
                }
                h3Var.onContainerTranslationYChanged(f7);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
