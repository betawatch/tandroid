package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bk0;
import org.telegram.ui.ce0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class m1 extends ScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(ls lsVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = lsVar;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                u1 u1Var = (u1) this.b;
                if (u1Var.D[0].getPaint().getAlpha() != 0) {
                    u1Var.D[0].setBounds(0, getScrollY(), getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f) + getScrollY());
                    u1Var.D[0].draw(canvas);
                }
                if (u1Var.D[1].getPaint().getAlpha() != 0) {
                    u1Var.D[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    u1Var.D[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                x50 x50Var = (x50) this.b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (org.telegram.messenger.g0.Q1() || size2 > size) {
                    x50Var.j2 = org.telegram.messenger.g0.L(144.0f);
                } else {
                    x50Var.j2 = org.telegram.messenger.g0.L(56.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(x50Var.j2, TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(((vd0) this.b).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 3:
            default:
                super.onMeasure(i7, i10);
                break;
            case 4:
                ((bk0) this.b).s0 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(30.0f);
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        switch (this.a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i7, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        switch (this.a) {
            case 3:
                int i7 = ((ce0) this.b).a;
                if (i7 == 1 || i7 == 2 || i7 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                break;
            case 4:
                int i10 = ((bk0) this.b).I1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                break;
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (!usersSelectActivity.w) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.k5.C(20.0f, usersSelectActivity.R, rect.top);
                    rect.bottom = org.telegram.messenger.k5.C(50.0f, usersSelectActivity.R, rect.bottom);
                    break;
                } else {
                    usersSelectActivity.w = false;
                    break;
                }
        }
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Context context, vd0 vd0Var) {
        super(context, null, 0, R.style.scrollbarShapeStyle);
        this.a = 2;
        this.b = vd0Var;
    }
}
