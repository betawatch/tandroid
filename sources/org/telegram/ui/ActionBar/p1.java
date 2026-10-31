package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.hf0;
import org.telegram.ui.ll0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p1 extends ScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(us usVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = usVar;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                x1 x1Var = (x1) this.b;
                if (x1Var.D[0].getPaint().getAlpha() != 0) {
                    x1Var.D[0].setBounds(0, getScrollY(), getMeasuredWidth(), org.telegram.messenger.i0.L(3.0f) + getScrollY());
                    x1Var.D[0].draw(canvas);
                }
                if (x1Var.D[1].getPaint().getAlpha() != 0) {
                    x1Var.D[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - org.telegram.messenger.i0.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    x1Var.D[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                m60 m60Var = (m60) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (org.telegram.messenger.i0.Q1() || size2 > size) {
                    m60Var.j2 = org.telegram.messenger.i0.L(144.0f);
                } else {
                    m60Var.j2 = org.telegram.messenger.i0.L(56.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(m60Var.j2, TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((qe0) this.b).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 3:
            default:
                super.onMeasure(i10, i11);
                break;
            case 4:
                ((ll0) this.b).s0 = View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.L(30.0f);
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.a) {
            case 3:
                int i10 = ((hf0) this.b).a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.i0.L(40.0f) + rect.bottom;
                }
                break;
            case 4:
                int i11 = ((ll0) this.b).I1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = org.telegram.messenger.i0.L(40.0f) + rect.bottom;
                }
                break;
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (!usersSelectActivity.w) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.m5.C(20.0f, usersSelectActivity.Q, rect.top);
                    rect.bottom = org.telegram.messenger.m5.C(50.0f, usersSelectActivity.Q, rect.bottom);
                    break;
                } else {
                    usersSelectActivity.w = false;
                    break;
                }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Context context, qe0 qe0Var) {
        super(context, null, 0, R.style.scrollbarShapeStyle);
        this.a = 2;
        this.b = qe0Var;
    }
}
