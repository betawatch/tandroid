package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public abstract class GridLayoutManagerFixed extends GridLayoutManager {
    private ArrayList additionalViews;
    private boolean canScrollVertically;

    protected abstract boolean hasSiblingChild(int i);

    public abstract boolean shouldLayoutChildFromOpositeSide(View view);

    public GridLayoutManagerFixed(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
        this.additionalViews = new ArrayList(4);
        this.canScrollVertically = true;
    }

    public void setCanScrollVertically(boolean z) {
        this.canScrollVertically = z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.canScrollVertically;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    protected void recycleViewsFromStart(RecyclerView.Recycler recycler, int i, int i2) {
        if (i < 0) {
            return;
        }
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin > i || childAt.getTop() + childAt.getHeight() > i) {
                    recycleChildren(recycler, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt2.getLayoutParams())).bottomMargin > i || childAt2.getTop() + childAt2.getHeight() > i) {
                recycleChildren(recycler, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    protected int[] calculateItemBorders(int[] iArr, int i, int i2) {
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        iArr[0] = 0;
        for (int i3 = 1; i3 <= i; i3++) {
            iArr[i3] = (int) Math.ceil((i3 / i) * i2);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    protected void measureChild(View view, int i, boolean z) {
        GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(this.mCachedBorders[layoutParams.mSpanSize], i, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00d7, code lost:
    
        r23.mFinished = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018d, code lost:
    
        if (r22.mLayoutDirection != (-1)) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        GridLayoutManagerFixed gridLayoutManagerFixed;
        int i6;
        int i7;
        int width;
        int i8;
        View next;
        GridLayoutManagerFixed gridLayoutManagerFixed2 = this;
        RecyclerView.Recycler recycler2 = recycler;
        int modeInOther = gridLayoutManagerFixed2.mOrientationHelper.getModeInOther();
        ?? r11 = 0;
        ?? r12 = 1;
        boolean z = layoutState.mItemDirection == 1;
        layoutChunkResult.mConsumed = 0;
        int i9 = layoutState.mCurrentPosition;
        int i10 = -1;
        if (gridLayoutManagerFixed2.mShouldReverseLayout && layoutState.mLayoutDirection != -1 && gridLayoutManagerFixed2.hasSiblingChild(i9) && gridLayoutManagerFixed2.findViewByPosition(layoutState.mCurrentPosition + 1) == null) {
            if (gridLayoutManagerFixed2.hasSiblingChild(layoutState.mCurrentPosition + 1)) {
                layoutState.mCurrentPosition += 3;
            } else {
                layoutState.mCurrentPosition += 2;
            }
            int i11 = layoutState.mCurrentPosition;
            for (int i12 = i11; i12 > i9; i12--) {
                View next2 = layoutState.next(recycler2);
                if (next2 != null) {
                    gridLayoutManagerFixed2.additionalViews.add(next2);
                    if (i12 != i11) {
                        gridLayoutManagerFixed2.calculateItemDecorationsForChild(next2, gridLayoutManagerFixed2.mDecorInsets);
                        gridLayoutManagerFixed2.measureChild(next2, modeInOther, false);
                        int decoratedMeasurement = gridLayoutManagerFixed2.mOrientationHelper.getDecoratedMeasurement(next2);
                        layoutState.mOffset -= decoratedMeasurement;
                        layoutState.mAvailable += decoratedMeasurement;
                    }
                }
            }
            layoutState.mCurrentPosition = i11;
        }
        boolean z2 = true;
        GridLayoutManagerFixed gridLayoutManagerFixed3 = gridLayoutManagerFixed2;
        while (z2) {
            int i13 = gridLayoutManagerFixed3.mSpanCount;
            boolean z3 = ((gridLayoutManagerFixed3.additionalViews.isEmpty() ? 1 : 0) ^ r12) == true ? 1 : 0;
            int i14 = 0;
            while (i14 < gridLayoutManagerFixed3.mSpanCount && layoutState.hasMore(state) && i13 > 0) {
                int i15 = layoutState.mCurrentPosition;
                i13 -= gridLayoutManagerFixed3.getSpanSize(recycler2, state, i15);
                if (i13 < 0) {
                    break;
                }
                if (!gridLayoutManagerFixed3.additionalViews.isEmpty()) {
                    next = (View) gridLayoutManagerFixed3.additionalViews.get(r11);
                    gridLayoutManagerFixed3.additionalViews.remove((int) r11);
                    layoutState.mCurrentPosition -= r12;
                } else {
                    next = layoutState.next(recycler2);
                }
                if (next == null) {
                    break;
                }
                gridLayoutManagerFixed3.mSet[i14] = next;
                i14++;
                if (layoutState.mLayoutDirection == i10 && i13 <= 0 && gridLayoutManagerFixed3.hasSiblingChild(i15)) {
                    z3 = true;
                }
            }
            gridLayoutManagerFixed3.assignSpans(recycler2, state, i14, z);
            float f = 0.0f;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                View view = gridLayoutManagerFixed3.mSet[i17];
                if (layoutState.mScrapList == null) {
                    if (z) {
                        gridLayoutManagerFixed3.addView(view);
                    } else {
                        gridLayoutManagerFixed3.addView(view, r11);
                    }
                } else if (z) {
                    gridLayoutManagerFixed3.addDisappearingView(view);
                } else {
                    gridLayoutManagerFixed3.addDisappearingView(view, r11);
                }
                gridLayoutManagerFixed3.calculateItemDecorationsForChild(view, gridLayoutManagerFixed3.mDecorInsets);
                gridLayoutManagerFixed3.measureChild(view, modeInOther, r11);
                int decoratedMeasurement2 = gridLayoutManagerFixed3.mOrientationHelper.getDecoratedMeasurement(view);
                if (decoratedMeasurement2 > i16) {
                    i16 = decoratedMeasurement2;
                }
                float decoratedMeasurementInOther = (gridLayoutManagerFixed3.mOrientationHelper.getDecoratedMeasurementInOther(view) * 1.0f) / ((GridLayoutManager.LayoutParams) view.getLayoutParams()).mSpanSize;
                if (decoratedMeasurementInOther > f) {
                    f = decoratedMeasurementInOther;
                }
            }
            int i18 = 0;
            while (i18 < i14) {
                View view2 = gridLayoutManagerFixed3.mSet[i18];
                if (gridLayoutManagerFixed3.mOrientationHelper.getDecoratedMeasurement(view2) != i16) {
                    GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view2.getLayoutParams();
                    Rect rect = layoutParams.mDecorInsets;
                    i8 = i18;
                    gridLayoutManagerFixed3.measureChildWithDecorationsAndMargin(view2, RecyclerView.LayoutManager.getChildMeasureSpec(gridLayoutManagerFixed3.mCachedBorders[layoutParams.mSpanSize], TLObject.FLAG_30, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), View.MeasureSpec.makeMeasureSpec(i16 - (((rect.top + rect.bottom) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin), TLObject.FLAG_30), true);
                } else {
                    i8 = i18;
                }
                i18 = i8 + 1;
            }
            boolean shouldLayoutChildFromOpositeSide = gridLayoutManagerFixed3.shouldLayoutChildFromOpositeSide(gridLayoutManagerFixed3.mSet[0]);
            if (shouldLayoutChildFromOpositeSide) {
                i = -1;
            } else {
                i = -1;
            }
            if (shouldLayoutChildFromOpositeSide || layoutState.mLayoutDirection != 1) {
                int i19 = i16;
                if (layoutState.mLayoutDirection == -1) {
                    i3 = layoutState.mOffset - layoutChunkResult.mConsumed;
                    i2 = i3 - i19;
                    i4 = gridLayoutManagerFixed3.getWidth();
                } else {
                    i2 = layoutChunkResult.mConsumed + layoutState.mOffset;
                    i3 = i2 + i19;
                    i4 = 0;
                }
                int i20 = i3;
                int i21 = 0;
                GridLayoutManagerFixed gridLayoutManagerFixed4 = gridLayoutManagerFixed3;
                while (i21 < i14) {
                    View view3 = gridLayoutManagerFixed4.mSet[i21];
                    GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) view3.getLayoutParams();
                    int decoratedMeasurementInOther2 = gridLayoutManagerFixed4.mOrientationHelper.getDecoratedMeasurementInOther(view3);
                    int i22 = i19;
                    if (layoutState.mLayoutDirection == -1) {
                        i4 -= decoratedMeasurementInOther2;
                    }
                    int i23 = decoratedMeasurementInOther2 + i4;
                    int i24 = i14;
                    int i25 = i4;
                    i4 = i23;
                    GridLayoutManagerFixed gridLayoutManagerFixed5 = this;
                    gridLayoutManagerFixed5.layoutDecoratedWithMargins(view3, i25, i2, i4, i20);
                    if (layoutState.mLayoutDirection != 1) {
                        i4 = i25;
                    }
                    if (layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                        layoutChunkResult.mIgnoreConsumed = true;
                    }
                    layoutChunkResult.mFocusable |= view3.hasFocusable();
                    i21++;
                    i14 = i24;
                    i19 = i22;
                    gridLayoutManagerFixed4 = gridLayoutManagerFixed5;
                }
                i5 = i19;
                gridLayoutManagerFixed = gridLayoutManagerFixed4;
                layoutChunkResult.mConsumed += i5;
                Arrays.fill(gridLayoutManagerFixed.mSet, (Object) null);
                recycler2 = recycler;
                z2 = z3;
                r11 = 0;
                r12 = 1;
                i10 = -1;
                gridLayoutManagerFixed3 = gridLayoutManagerFixed;
            }
            if (layoutState.mLayoutDirection == i) {
                int i26 = layoutState.mOffset - layoutChunkResult.mConsumed;
                i6 = i26 - i16;
                i7 = i26;
                width = 0;
            } else {
                i6 = layoutChunkResult.mConsumed + layoutState.mOffset;
                i7 = i6 + i16;
                width = gridLayoutManagerFixed3.getWidth();
            }
            int i27 = i14 - 1;
            GridLayoutManagerFixed gridLayoutManagerFixed6 = gridLayoutManagerFixed3;
            while (i27 >= 0) {
                View view4 = gridLayoutManagerFixed6.mSet[i27];
                GridLayoutManager.LayoutParams layoutParams3 = (GridLayoutManager.LayoutParams) view4.getLayoutParams();
                int decoratedMeasurementInOther3 = gridLayoutManagerFixed6.mOrientationHelper.getDecoratedMeasurementInOther(view4);
                if (layoutState.mLayoutDirection == 1) {
                    width -= decoratedMeasurementInOther3;
                }
                int i28 = decoratedMeasurementInOther3 + width;
                int i29 = width;
                GridLayoutManagerFixed gridLayoutManagerFixed7 = this;
                int i30 = i16;
                gridLayoutManagerFixed7.layoutDecoratedWithMargins(view4, i29, i6, i28, i7);
                width = layoutState.mLayoutDirection == -1 ? i28 : i29;
                if (layoutParams3.isItemRemoved() || layoutParams3.isItemChanged()) {
                    layoutChunkResult.mIgnoreConsumed = true;
                }
                layoutChunkResult.mFocusable |= view4.hasFocusable();
                i27--;
                i16 = i30;
                gridLayoutManagerFixed6 = gridLayoutManagerFixed7;
            }
            i5 = i16;
            gridLayoutManagerFixed = gridLayoutManagerFixed6;
            layoutChunkResult.mConsumed += i5;
            Arrays.fill(gridLayoutManagerFixed.mSet, (Object) null);
            recycler2 = recycler;
            z2 = z3;
            r11 = 0;
            r12 = 1;
            i10 = -1;
            gridLayoutManagerFixed3 = gridLayoutManagerFixed;
        }
    }
}
