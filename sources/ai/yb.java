package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class yb extends i0 {
    public final /* synthetic */ jc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(jc jcVar, Context context) {
        super(context);
        this.d = jcVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        jc jcVar = this.d;
        f6 currentPeerView = jcVar.n0.getCurrentPeerView();
        r7 r7Var = jcVar.w;
        if (r7Var != null && currentPeerView != null) {
            a5 a5Var = currentPeerView.c1;
            r7Var.setOffset(jcVar.e0);
            if (jcVar.w.f == 1.0f) {
                jcVar.n0.setVisibility(4);
            } else {
                jcVar.n0.setVisibility(0);
            }
            jcVar.n0.B();
            float top = a5Var.getTop() + currentPeerView.getTop();
            float f7 = jcVar.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (a5Var.getMeasuredHeight() > 0) {
                jcVar.q1 = a5Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, jcVar.w.n / jcVar.q1, f7);
            jcVar.n0.setPivotY(top);
            jcVar.n0.setPivotX(getMeasuredWidth() / 2.0f);
            jcVar.n0.setScaleX(lerp);
            jcVar.n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (jcVar.e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f7, lerp, jcVar.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.y1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, jcVar.w.f);
            a5Var.invalidateOutline();
            jcVar.n0.setTranslationY((jcVar.w.b - top) * f7);
        }
        if (currentPeerView != null) {
            jcVar.d1.setTranslationY(((currentPeerView.c1.getY() + currentPeerView.getY()) - jcVar.d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        jc jcVar = this.d;
        if (!jcVar.b || jcVar.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            jcVar.setKeyboardHeightFromParent(i12);
            size += jcVar.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            jcVar.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            jcVar.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        jcVar.y0.getLayoutParams().height = size + 1;
        jcVar.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) jcVar.y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
