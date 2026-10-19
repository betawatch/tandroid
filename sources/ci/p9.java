package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class p9 extends w {
    public final /* synthetic */ aa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(Context context, aa aaVar) {
        super(context);
        this.d = aaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        aa aaVar = this.d;
        q4 currentPeerView = aaVar.n0.getCurrentPeerView();
        c6 c6Var = aaVar.w;
        if (c6Var != null && currentPeerView != null) {
            r3 r3Var = currentPeerView.c1;
            c6Var.setOffset(aaVar.e0);
            if (aaVar.w.f == 1.0f) {
                aaVar.n0.setVisibility(4);
            } else {
                aaVar.n0.setVisibility(0);
            }
            aaVar.n0.B();
            float top = r3Var.getTop() + currentPeerView.getTop();
            float f7 = aaVar.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (r3Var.getMeasuredHeight() > 0) {
                aaVar.q1 = r3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, aaVar.w.n / aaVar.q1, f7);
            aaVar.n0.setPivotY(top);
            aaVar.n0.setPivotX(getMeasuredWidth() / 2.0f);
            aaVar.n0.setScaleX(lerp);
            aaVar.n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (aaVar.e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f7, lerp, aaVar.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.y1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, aaVar.w.f);
            r3Var.invalidateOutline();
            aaVar.n0.setTranslationY((aaVar.w.b - top) * f7);
        }
        if (currentPeerView != null) {
            aaVar.d1.setTranslationY(((currentPeerView.c1.getY() + currentPeerView.getY()) - aaVar.d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        aa aaVar = this.d;
        if (!aaVar.b || aaVar.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            aaVar.setKeyboardHeightFromParent(i12);
            size += aaVar.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            aaVar.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            aaVar.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        aaVar.y0.getLayoutParams().height = size + 1;
        aaVar.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) aaVar.y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
