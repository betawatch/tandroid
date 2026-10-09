package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class zb extends i0 {
    public final /* synthetic */ kc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(kc kcVar, Context context) {
        super(context);
        this.d = kcVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kc kcVar = this.d;
        f6 currentPeerView = kcVar.n0.getCurrentPeerView();
        t7 t7Var = kcVar.w;
        if (t7Var != null && currentPeerView != null) {
            b5 b5Var = currentPeerView.c1;
            t7Var.setOffset(kcVar.e0);
            if (kcVar.w.f == 1.0f) {
                kcVar.n0.setVisibility(4);
            } else {
                kcVar.n0.setVisibility(0);
            }
            kcVar.n0.B();
            float top = b5Var.getTop() + currentPeerView.getTop();
            float f7 = kcVar.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (b5Var.getMeasuredHeight() > 0) {
                kcVar.q1 = b5Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, kcVar.w.n / kcVar.q1, f7);
            kcVar.n0.setPivotY(top);
            kcVar.n0.setPivotX(getMeasuredWidth() / 2.0f);
            kcVar.n0.setScaleX(lerp);
            kcVar.n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (kcVar.e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f7, lerp, kcVar.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.y1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, kcVar.w.f);
            b5Var.invalidateOutline();
            kcVar.n0.setTranslationY((kcVar.w.b - top) * f7);
        }
        if (currentPeerView != null) {
            kcVar.d1.setTranslationY(((currentPeerView.c1.getY() + currentPeerView.getY()) - kcVar.d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        kc kcVar = this.d;
        if (!kcVar.b || kcVar.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            kcVar.setKeyboardHeightFromParent(i12);
            size += kcVar.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            kcVar.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            kcVar.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        kcVar.y0.getLayoutParams().height = size + 1;
        kcVar.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) kcVar.y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
