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
import org.telegram.ui.Components.d70;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.e80;
import org.telegram.ui.fn0;
import org.telegram.ui.pg0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x1 extends ScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                int action = motionEvent.getAction();
                float f10 = ((e80) this.b).b.e;
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
                d2 d2Var = (d2) this.b;
                if (d2Var.y[0].getPaint().getAlpha() != 0) {
                    d2Var.y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    d2Var.y[0].draw(canvas);
                }
                if (d2Var.y[1].getPaint().getAlpha() != 0) {
                    d2Var.y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    d2Var.y[1].draw(canvas);
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
                d70 d70Var = (d70) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    d70Var.p0 = AndroidUtilities.dp(144.0f);
                } else {
                    d70Var.p0 = AndroidUtilities.dp(56.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(d70Var.p0, TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((dg.k0) this.b).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                break;
            case 5:
                ((fn0) this.b).p0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
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
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        switch (this.a) {
            case 3:
                e80 e80Var = (e80) this.b;
                if (!e80Var.v) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.y3.C(20.0f, e80Var.F, rect.top);
                    rect.bottom = org.telegram.messenger.y3.C(50.0f, e80Var.F, rect.bottom);
                    break;
                } else {
                    e80Var.v = false;
                    break;
                }
            case 4:
                int i10 = ((pg0) this.b).a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                break;
            case 5:
                int i11 = ((fn0) this.b).F1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                break;
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (!usersSelectActivity.v) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.y3.C(20.0f, usersSelectActivity.N, rect.top);
                    rect.bottom = org.telegram.messenger.y3.C(50.0f, usersSelectActivity.N, rect.bottom);
                    break;
                } else {
                    usersSelectActivity.v = false;
                    break;
                }
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(Context context, int i10, dg.k0 k0Var) {
        super(context, null, 0, i10);
        this.a = 2;
        this.b = k0Var;
    }
}
