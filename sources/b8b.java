// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class b8b extends qg5 {
    public final /* synthetic */ m8b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8b(m8b m8bVar, Context context) {
        super(context);
        this.d = m8bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m8b m8bVar = this.d;
        y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
        n0a n0aVar = m8bVar.x;
        if (n0aVar != null && currentPeerView != null) {
            d28 d28Var = currentPeerView.S0;
            n0aVar.setOffset(m8bVar.f0);
            float f = m8bVar.x.f;
            c8b c8bVar = m8bVar.o0;
            if (f == 1.0f) {
                c8bVar.setVisibility(4);
            } else {
                c8bVar.setVisibility(0);
            }
            m8bVar.o0.B();
            float top = d28Var.getTop() + currentPeerView.getTop();
            float f2 = m8bVar.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (d28Var.getMeasuredHeight() > 0) {
                m8bVar.q1 = d28Var.getMeasuredHeight();
            }
            float R1 = gl.R1(1.0f, m8bVar.x.n / m8bVar.q1, f2);
            m8bVar.o0.setPivotY(top);
            m8bVar.o0.setPivotX(getMeasuredWidth() / 2.0f);
            m8bVar.o0.setScaleX(R1);
            m8bVar.o0.setScaleY(R1);
            currentPeerView.L2 = true;
            if (m8bVar.f0 == 0.0f) {
                currentPeerView.S0(0.0f, 0.0f, null);
            } else {
                currentPeerView.S0(f2, R1, m8bVar.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.o1.b = (int) gl.R1(10.0f, 6.0f / r6, m8bVar.x.f);
            d28Var.invalidateOutline();
            m8bVar.o0.setTranslationY((m8bVar.x.b - top) * f2);
        }
        if (currentPeerView != null) {
            m8bVar.d1.setTranslationY(((currentPeerView.S0.getY() + currentPeerView.getY()) - m8bVar.d1.getTop()) - gl.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        m8b m8bVar = this.d;
        if (!m8bVar.b || m8bVar.c) {
            View rootView = getRootView();
            Rect rect = gl.Q;
            getWindowVisibleDisplayFrame(rect);
            int i3 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i3 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? gl.m : 0)) - gl.o1(rootView)) - (rect.bottom - rect.top));
            }
            m8bVar.g(i3);
            size += m8bVar.q0;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int i4 = (int) ((size2 * 16.0f) / 9.0f);
        c8b c8bVar = m8bVar.o0;
        if (size > i4) {
            c8bVar.getLayoutParams().width = -1;
            size = i4;
        } else {
            int i5 = (int) ((size / 16.0f) * 9.0f);
            c8bVar.getLayoutParams().width = i5;
            size2 = i5;
        }
        m8bVar.z0.getLayoutParams().height = size + 1;
        m8bVar.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) m8bVar.z0.getLayoutParams()).topMargin = gl.m;
        super.onMeasure(i, i2);
    }
}
