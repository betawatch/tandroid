package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n9 extends w {
    public final /* synthetic */ y9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Context context, y9 y9Var) {
        super(context);
        this.d = y9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y9 y9Var = this.d;
        q4 currentPeerView = y9Var.n0.getCurrentPeerView();
        b6 b6Var = y9Var.w;
        if (b6Var != null && currentPeerView != null) {
            q3 q3Var = currentPeerView.R0;
            b6Var.setOffset(y9Var.e0);
            if (y9Var.w.f == 1.0f) {
                y9Var.n0.setVisibility(4);
            } else {
                y9Var.n0.setVisibility(0);
            }
            y9Var.n0.B();
            float top = q3Var.getTop() + currentPeerView.getTop();
            float f7 = y9Var.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (q3Var.getMeasuredHeight() > 0) {
                y9Var.q1 = q3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, y9Var.w.n / y9Var.q1, f7);
            y9Var.n0.setPivotY(top);
            y9Var.n0.setPivotX(getMeasuredWidth() / 2.0f);
            y9Var.n0.setScaleX(lerp);
            y9Var.n0.setScaleY(lerp);
            currentPeerView.K2 = true;
            if (y9Var.e0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f7, lerp, y9Var.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.n1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, y9Var.w.f);
            q3Var.invalidateOutline();
            y9Var.n0.setTranslationY((y9Var.w.b - top) * f7);
        }
        if (currentPeerView != null) {
            y9Var.d1.setTranslationY(((currentPeerView.R0.getY() + currentPeerView.getY()) - y9Var.d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        y9 y9Var = this.d;
        if (!y9Var.b || y9Var.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            y9Var.setKeyboardHeightFromParent(i12);
            size += y9Var.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            y9Var.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            y9Var.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        y9Var.y0.getLayoutParams().height = size + 1;
        y9Var.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) y9Var.y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
