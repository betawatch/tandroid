package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e61 extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ int e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e61(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.e3 = i7;
    }

    @Override // org.telegram.ui.Components.pj0
    public Integer V0(int i7) {
        switch (this.e3) {
            case 1:
                return 0;
            case 2:
            case 5:
            case 6:
            case 8:
            default:
                return super.V0(i7);
            case 3:
                return 0;
            case 4:
                return 0;
            case 7:
                return 0;
            case 9:
                return 0;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
            case 2:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z9 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z9 = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z9);
                }
                break;
            case 6:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z10 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z10);
                }
                break;
            case 14:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.e3) {
            case 8:
                int size = View.MeasureSpec.getSize(i10);
                int b10 = (getAdapter().b() * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(4.0f);
                if (b10 <= size) {
                    size = b10;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            case 11:
                int size2 = View.MeasureSpec.getSize(i10);
                int b11 = (getAdapter().b() * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(4.0f);
                if (b11 <= size2) {
                    size2 = b11;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 13:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void r0(View view, View view2) {
        switch (this.e3) {
            case 5:
                if (view instanceof org.telegram.ui.Cells.a6) {
                    super.r0(view, view2);
                    break;
                }
                break;
            case 12:
                if (view instanceof org.telegram.ui.Cells.a6) {
                    super.r0(view, view2);
                    break;
                }
                break;
            default:
                super.r0(view, view2);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        switch (this.e3) {
            case 5:
                rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
                break;
            case 12:
                rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.e3) {
            case 10:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(Context context) {
        super(context, null);
        this.e3 = 13;
    }
}
