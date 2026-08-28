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
import org.telegram.ui.Components.k60;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.q70;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w1 extends ScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                int action = motionEvent.getAction();
                float f10 = ((q70) this.b).b.e;
                float y10 = motionEvent.getY();
                if (action != 0 || y10 <= f10) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
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
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                k60 k60Var = (k60) this.b;
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    k60Var.o0 = AndroidUtilities.dp(144.0f);
                } else {
                    k60Var.o0 = AndroidUtilities.dp(56.0f);
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(k60Var.o0, TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i9, i10);
                setMeasuredDimension(((kh.n5) this.b).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 3:
            case 4:
            default:
                super.onMeasure(i9, i10);
                break;
            case 5:
                ((wm0) this.b).o0 = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        switch (this.a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i9, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.a) {
            case 3:
                q70 q70Var = (q70) this.b;
                if (!q70Var.v) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.l0.C(20.0f, q70Var.E, rect.top);
                    rect.bottom = org.telegram.messenger.l0.C(50.0f, q70Var.E, rect.bottom);
                    break;
                } else {
                    q70Var.v = false;
                    break;
                }
            case 4:
                int i9 = ((fg0) this.b).a;
                if (i9 == 1 || i9 == 2 || i9 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                break;
            case 5:
                int i10 = ((wm0) this.b).E1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                break;
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (!usersSelectActivity.v) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.l0.C(20.0f, usersSelectActivity.M, rect.top);
                    rect.bottom = org.telegram.messenger.l0.C(50.0f, usersSelectActivity.M, rect.bottom);
                    break;
                } else {
                    usersSelectActivity.v = false;
                    break;
                }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context, int i9, kh.n5 n5Var) {
        super(context, null, 0, i9);
        this.a = 2;
        this.b = n5Var;
    }
}
