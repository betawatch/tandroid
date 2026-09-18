package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b70;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.n80;
import org.telegram.ui.qn0;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w1 extends ScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                int action = motionEvent.getAction();
                float f7 = ((n80) this.b).b.e;
                float y3 = motionEvent.getY();
                if (action != 0 || y3 <= f7) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                c2 c2Var = (c2) this.b;
                if (c2Var.y[0].getPaint().getAlpha() != 0) {
                    c2Var.y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    c2Var.y[0].draw(canvas);
                }
                if (c2Var.y[1].getPaint().getAlpha() != 0) {
                    c2Var.y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    c2Var.y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                b70 b70Var = (b70) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    b70Var.s0 = AndroidUtilities.dp(144.0f);
                } else {
                    b70Var.s0 = AndroidUtilities.dp(56.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(b70Var.s0, TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((ci.x5) this.b).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                break;
            case 5:
                ((qn0) this.b).s0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.a) {
            case 3:
                n80 n80Var = (n80) this.b;
                if (!n80Var.v) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.w1.C(20.0f, n80Var.I, rect.top);
                    rect.bottom = org.telegram.messenger.w1.C(50.0f, n80Var.I, rect.bottom);
                    break;
                } else {
                    n80Var.v = false;
                    break;
                }
            case 4:
                int i10 = ((yg0) this.b).a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                break;
            case 5:
                int i11 = ((qn0) this.b).I1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                break;
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (!usersSelectActivity.v) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.w1.C(20.0f, usersSelectActivity.Q, rect.top);
                    rect.bottom = org.telegram.messenger.w1.C(50.0f, usersSelectActivity.Q, rect.bottom);
                    break;
                } else {
                    usersSelectActivity.v = false;
                    break;
                }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context, int i10, ci.x5 x5Var) {
        super(context, null, 0, i10);
        this.a = 2;
        this.b = x5Var;
    }
}
