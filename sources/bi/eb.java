package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class eb extends b0 {
    public final /* synthetic */ pb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(Context context, pb pbVar) {
        super(context);
        this.d = pbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        pb pbVar = this.d;
        o5 currentPeerView = pbVar.n0.getCurrentPeerView();
        a7 a7Var = pbVar.w;
        if (a7Var != null && currentPeerView != null) {
            l4 l4Var = currentPeerView.c1;
            a7Var.setOffset(pbVar.e0);
            if (pbVar.w.f == 1.0f) {
                pbVar.n0.setVisibility(4);
            } else {
                pbVar.n0.setVisibility(0);
            }
            pbVar.n0.B();
            float top = l4Var.getTop() + currentPeerView.getTop();
            float f7 = pbVar.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (l4Var.getMeasuredHeight() > 0) {
                pbVar.q1 = l4Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, pbVar.w.n / pbVar.q1, f7);
            pbVar.n0.setPivotY(top);
            pbVar.n0.setPivotX(getMeasuredWidth() / 2.0f);
            pbVar.n0.setScaleX(lerp);
            pbVar.n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (pbVar.e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f7, lerp, pbVar.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.y1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, pbVar.w.f);
            l4Var.invalidateOutline();
            pbVar.n0.setTranslationY((pbVar.w.b - top) * f7);
        }
        if (currentPeerView != null) {
            pbVar.d1.setTranslationY(((currentPeerView.c1.getY() + currentPeerView.getY()) - pbVar.d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        pb pbVar = this.d;
        if (!pbVar.b || pbVar.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            pbVar.setKeyboardHeightFromParent(i12);
            size += pbVar.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            pbVar.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            pbVar.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        pbVar.y0.getLayoutParams().height = size + 1;
        pbVar.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) pbVar.y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
