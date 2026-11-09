package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f9 extends v {
    public final /* synthetic */ q9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(Context context, q9 q9Var) {
        super(context);
        this.d = q9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var = this.d;
        j4 currentPeerView = q9Var.n0.getCurrentPeerView();
        t5 t5Var = q9Var.x;
        if (t5Var != null && currentPeerView != null) {
            j3 j3Var = currentPeerView.L0;
            t5Var.setOffset(q9Var.e0);
            if (q9Var.x.f == 1.0f) {
                q9Var.n0.setVisibility(4);
            } else {
                q9Var.n0.setVisibility(0);
            }
            q9Var.n0.B();
            float top = j3Var.getTop() + currentPeerView.getTop();
            float f10 = q9Var.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (j3Var.getMeasuredHeight() > 0) {
                q9Var.p1 = j3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, q9Var.x.n / q9Var.p1, f10);
            q9Var.n0.setPivotY(top);
            q9Var.n0.setPivotX(getMeasuredWidth() / 2.0f);
            q9Var.n0.setScaleX(T1);
            q9Var.n0.setScaleY(T1);
            currentPeerView.E2 = true;
            if (q9Var.e0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f10, T1, q9Var.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.h1.b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / r6, q9Var.x.f);
            j3Var.invalidateOutline();
            q9Var.n0.setTranslationY((q9Var.x.b - top) * f10);
        }
        if (currentPeerView != null) {
            q9Var.c1.setTranslationY(((currentPeerView.L0.getY() + currentPeerView.getY()) - q9Var.c1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        q9 q9Var = this.d;
        if (!q9Var.b || q9Var.c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i11 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            q9Var.h(i11);
            size += q9Var.p0;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int i12 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i12) {
            q9Var.n0.getLayoutParams().width = -1;
            size = i12;
        } else {
            int i13 = (int) ((size / 16.0f) * 9.0f);
            q9Var.n0.getLayoutParams().width = i13;
            size2 = i13;
        }
        q9Var.y0.getLayoutParams().height = size + 1;
        q9Var.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) q9Var.y0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        super.onMeasure(i7, i10);
    }
}
