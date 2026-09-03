package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qb1 extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ int U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb1(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = i10;
    }

    @Override // org.telegram.ui.Components.sl0
    public Integer V0(int i10) {
        switch (this.U2) {
            case 1:
                return 0;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
            default:
                return super.V0(i10);
            case 7:
                return 0;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
            case 5:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z4 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z4 = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z4);
                }
                break;
            case 12:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z10 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z10);
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.U2) {
            case 6:
                int size = View.MeasureSpec.getSize(i11);
                int h = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h <= size) {
                    size = h;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            case 9:
                int size2 = View.MeasureSpec.getSize(i11);
                int h9 = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h9 <= size2) {
                    size2 = h9;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 11:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void q0(View view, View view2) {
        switch (this.U2) {
            case 4:
                if (view instanceof org.telegram.ui.Cells.c6) {
                    super.q0(view, view2);
                    break;
                }
                break;
            case 10:
                if (view instanceof org.telegram.ui.Cells.c6) {
                    super.q0(view, view2);
                    break;
                }
                break;
            default:
                super.q0(view, view2);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        switch (this.U2) {
            case 4:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                break;
            case 10:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.U2) {
            case 8:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb1(Context context) {
        super(context, null);
        this.U2 = 11;
    }
}
