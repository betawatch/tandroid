package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e9 extends v {
    public final /* synthetic */ p9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(Context context, p9 p9Var) {
        super(context);
        this.d = p9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p9 p9Var = this.d;
        i4 currentPeerView = p9Var.n0.getCurrentPeerView();
        s5 s5Var = p9Var.x;
        if (s5Var != null && currentPeerView != null) {
            j3 j3Var = currentPeerView.L0;
            s5Var.setOffset(p9Var.e0);
            if (p9Var.x.f == 1.0f) {
                p9Var.n0.setVisibility(4);
            } else {
                p9Var.n0.setVisibility(0);
            }
            p9Var.n0.B();
            float top = j3Var.getTop() + currentPeerView.getTop();
            float f10 = p9Var.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (j3Var.getMeasuredHeight() > 0) {
                p9Var.p1 = j3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, p9Var.x.n / p9Var.p1, f10);
            p9Var.n0.setPivotY(top);
            p9Var.n0.setPivotX(getMeasuredWidth() / 2.0f);
            p9Var.n0.setScaleX(T1);
            p9Var.n0.setScaleY(T1);
            currentPeerView.E2 = true;
            if (p9Var.e0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f10, T1, p9Var.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.h1.b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / r6, p9Var.x.f);
            j3Var.invalidateOutline();
            p9Var.n0.setTranslationY((p9Var.x.b - top) * f10);
        }
        if (currentPeerView != null) {
            p9Var.c1.setTranslationY(((currentPeerView.L0.getY() + currentPeerView.getY()) - p9Var.c1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        p9 p9Var = this.d;
        if (!p9Var.b || p9Var.c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i11 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            p9Var.h(i11);
            size += p9Var.p0;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int i12 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i12) {
            p9Var.n0.getLayoutParams().width = -1;
            size = i12;
        } else {
            int i13 = (int) ((size / 16.0f) * 9.0f);
            p9Var.n0.getLayoutParams().width = i13;
            size2 = i13;
        }
        p9Var.y0.getLayoutParams().height = size + 1;
        p9Var.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) p9Var.y0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        super.onMeasure(i7, i10);
    }
}
