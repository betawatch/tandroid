// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k10 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k10(i20 i20Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = i20Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        byte b = this.a;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                View[] viewArr = i20Var.g2;
                int D = ug8.D(248.0f, i3 - i, 4);
                for (int i5 = 0; i5 < 5; i5++) {
                    int L = (D * i5) + gl.L((i5 * 48) + 4);
                    int L2 = gl.L(9.0f);
                    View view = viewArr[i5];
                    view.layout(L, L2, view.getMeasuredWidth() + L, viewArr[i5].getMeasuredHeight() + L2);
                }
                break;
            case 1:
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 2:
                super.onLayout(z, i, i2, i3, i4);
                r7 r7Var = i20Var.O1;
                if (r7Var != null && (textView = i20Var.T1) != null) {
                    int left = (textView.getLeft() - gl.L(4.0f)) - r7Var.getMeasuredWidth();
                    r7Var.layout(left, r7Var.getTop(), r7Var.getMeasuredWidth() + left, r7Var.getBottom());
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                i20 i20Var = this.b;
                if (i20Var.b2.getTag() != null) {
                    i20Var.Q0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
