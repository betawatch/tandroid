package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class hb extends b0 {
    public final /* synthetic */ sb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(Context context, sb sbVar) {
        super(context);
        this.d = sbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sb sbVar = this.d;
        q5 currentPeerView = sbVar.n0.getCurrentPeerView();
        e7 e7Var = sbVar.w;
        if (e7Var != null && currentPeerView != null) {
            o4 o4Var = currentPeerView.c1;
            e7Var.setOffset(sbVar.e0);
            if (sbVar.w.f == 1.0f) {
                sbVar.n0.setVisibility(4);
            } else {
                sbVar.n0.setVisibility(0);
            }
            sbVar.n0.B();
            float top = o4Var.getTop() + currentPeerView.getTop();
            float f7 = sbVar.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (o4Var.getMeasuredHeight() > 0) {
                sbVar.q1 = o4Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, sbVar.w.n / sbVar.q1, f7);
            sbVar.n0.setPivotY(top);
            sbVar.n0.setPivotX(getMeasuredWidth() / 2.0f);
            sbVar.n0.setScaleX(lerp);
            sbVar.n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (sbVar.e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f7, lerp, sbVar.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.y1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, sbVar.w.f);
            o4Var.invalidateOutline();
            sbVar.n0.setTranslationY((sbVar.w.b - top) * f7);
        }
        if (currentPeerView != null) {
            sbVar.d1.setTranslationY(((currentPeerView.c1.getY() + currentPeerView.getY()) - sbVar.d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        sb sbVar = this.d;
        if (!sbVar.b || sbVar.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            sbVar.setKeyboardHeightFromParent(i12);
            size += sbVar.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            sbVar.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            sbVar.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        sbVar.y0.getLayoutParams().height = size + 1;
        sbVar.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) sbVar.y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
