package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.t50;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.xd0;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k1 extends ScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(cs csVar, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = csVar;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                s1 s1Var = (s1) this.b;
                if (s1Var.E[0].getPaint().getAlpha() != 0) {
                    s1Var.E[0].setBounds(0, getScrollY(), getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f) + getScrollY());
                    s1Var.E[0].draw(canvas);
                }
                if (s1Var.E[1].getPaint().getAlpha() != 0) {
                    s1Var.E[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    s1Var.E[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 1:
                t50 t50Var = (t50) this.b;
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                if (org.telegram.messenger.g0.Q1() || size2 > size) {
                    t50Var.k2 = org.telegram.messenger.g0.L(144.0f);
                } else {
                    t50Var.k2 = org.telegram.messenger.g0.L(56.0f);
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(t50Var.k2, TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i3, i10);
                setMeasuredDimension(((pd0) this.b).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 3:
            default:
                super.onMeasure(i3, i10);
                break;
            case 4:
                ((yj0) this.b).t0 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(30.0f);
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i3, Rect rect) {
        switch (this.a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i3, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.a) {
            case 3:
                int i3 = ((xd0) this.b).a;
                if (i3 == 1 || i3 == 2 || i3 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                break;
            case 4:
                int i10 = ((yj0) this.b).J1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                break;
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (!usersSelectActivity.w) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.k5.C(20.0f, usersSelectActivity.S, rect.top);
                    rect.bottom = org.telegram.messenger.k5.C(50.0f, usersSelectActivity.S, rect.bottom);
                    break;
                } else {
                    usersSelectActivity.w = false;
                    break;
                }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Context context, pd0 pd0Var) {
        super(context, null, 0, R.style.scrollbarShapeStyle);
        this.a = 2;
        this.b = pd0Var;
    }
}
