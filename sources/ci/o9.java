package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class o9 extends w {
    public final /* synthetic */ z9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(Context context, z9 z9Var) {
        super(context);
        this.d = z9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z9 z9Var = this.d;
        p4 currentPeerView = z9Var.n0.getCurrentPeerView();
        b6 b6Var = z9Var.w;
        if (b6Var != null && currentPeerView != null) {
            q3 q3Var = currentPeerView.c1;
            b6Var.setOffset(z9Var.e0);
            if (z9Var.w.f == 1.0f) {
                z9Var.n0.setVisibility(4);
            } else {
                z9Var.n0.setVisibility(0);
            }
            z9Var.n0.B();
            float top = q3Var.getTop() + currentPeerView.getTop();
            float f7 = z9Var.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (q3Var.getMeasuredHeight() > 0) {
                z9Var.q1 = q3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, z9Var.w.n / z9Var.q1, f7);
            z9Var.n0.setPivotY(top);
            z9Var.n0.setPivotX(getMeasuredWidth() / 2.0f);
            z9Var.n0.setScaleX(lerp);
            z9Var.n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (z9Var.e0 == 0.0f) {
                currentPeerView.W0(0.0f, 0.0f, null);
            } else {
                currentPeerView.W0(f7, lerp, z9Var.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.y1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, z9Var.w.f);
            q3Var.invalidateOutline();
            z9Var.n0.setTranslationY((z9Var.w.b - top) * f7);
        }
        if (currentPeerView != null) {
            z9Var.d1.setTranslationY(((currentPeerView.c1.getY() + currentPeerView.getY()) - z9Var.d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        z9 z9Var = this.d;
        if (!z9Var.b || z9Var.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            z9Var.setKeyboardHeightFromParent(i12);
            size += z9Var.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            z9Var.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            z9Var.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        z9Var.y0.getLayoutParams().height = size + 1;
        z9Var.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) z9Var.y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
