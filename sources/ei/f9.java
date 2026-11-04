package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f9 extends w {
    public final /* synthetic */ r9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(Context context, r9 r9Var) {
        super(context);
        this.d = r9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r9 r9Var = this.d;
        j4 currentPeerView = r9Var.o0.getCurrentPeerView();
        s5 s5Var = r9Var.x;
        if (s5Var != null && currentPeerView != null) {
            m3 m3Var = currentPeerView.M0;
            s5Var.setOffset(r9Var.f0);
            if (r9Var.x.f == 1.0f) {
                r9Var.o0.setVisibility(4);
            } else {
                r9Var.o0.setVisibility(0);
            }
            r9Var.o0.B();
            float top = m3Var.getTop() + currentPeerView.getTop();
            float f10 = r9Var.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (m3Var.getMeasuredHeight() > 0) {
                r9Var.r1 = m3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, r9Var.x.n / r9Var.r1, f10);
            r9Var.o0.setPivotY(top);
            r9Var.o0.setPivotX(getMeasuredWidth() / 2.0f);
            r9Var.o0.setScaleX(T1);
            r9Var.o0.setScaleY(T1);
            currentPeerView.F2 = true;
            if (r9Var.f0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f10, T1, r9Var.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.i1.b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / r6, r9Var.x.f);
            m3Var.invalidateOutline();
            r9Var.o0.setTranslationY((r9Var.x.b - top) * f10);
        }
        if (currentPeerView != null) {
            r9Var.e1.setTranslationY(((currentPeerView.M0.getY() + currentPeerView.getY()) - r9Var.e1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        r9 r9Var = this.d;
        if (!r9Var.b || r9Var.c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i11 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            r9Var.h(i11);
            size += r9Var.q0;
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int i12 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i12) {
            r9Var.o0.getLayoutParams().width = -1;
            size = i12;
        } else {
            int i13 = (int) ((size / 16.0f) * 9.0f);
            r9Var.o0.getLayoutParams().width = i13;
            size2 = i13;
        }
        r9Var.z0.getLayoutParams().height = size + 1;
        r9Var.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) r9Var.z0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        super.onMeasure(i3, i10);
    }
}
