package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b9 extends v {
    public final /* synthetic */ m9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(Context context, m9 m9Var) {
        super(context);
        this.d = m9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m9 m9Var = this.d;
        i4 currentPeerView = m9Var.j0.getCurrentPeerView();
        o5 o5Var = m9Var.w;
        if (o5Var != null && currentPeerView != null) {
            l3 l3Var = currentPeerView.Y0;
            o5Var.setOffset(m9Var.a0);
            if (m9Var.w.f == 1.0f) {
                m9Var.j0.setVisibility(4);
            } else {
                m9Var.j0.setVisibility(0);
            }
            m9Var.j0.B();
            float top = l3Var.getTop() + currentPeerView.getTop();
            float f10 = m9Var.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (l3Var.getMeasuredHeight() > 0) {
                m9Var.m1 = l3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, m9Var.w.n / m9Var.m1, f10);
            m9Var.j0.setPivotY(top);
            m9Var.j0.setPivotX(getMeasuredWidth() / 2.0f);
            m9Var.j0.setScaleX(lerp);
            m9Var.j0.setScaleY(lerp);
            currentPeerView.R2 = true;
            if (m9Var.a0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, m9Var.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.u1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, m9Var.w.f);
            l3Var.invalidateOutline();
            m9Var.j0.setTranslationY((m9Var.w.b - top) * f10);
        }
        if (currentPeerView != null) {
            m9Var.Z0.setTranslationY(((currentPeerView.Y0.getY() + currentPeerView.getY()) - m9Var.Z0.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        m9 m9Var = this.d;
        if (!m9Var.b || m9Var.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i11 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            m9Var.setKeyboardHeightFromParent(i11);
            size += m9Var.l0;
        }
        int size2 = View.MeasureSpec.getSize(i9);
        int i12 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i12) {
            m9Var.j0.getLayoutParams().width = -1;
            size = i12;
        } else {
            int i13 = (int) ((size / 16.0f) * 9.0f);
            m9Var.j0.getLayoutParams().width = i13;
            size2 = i13;
        }
        m9Var.u0.getLayoutParams().height = size + 1;
        m9Var.u0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) m9Var.u0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i9, i10);
    }
}
