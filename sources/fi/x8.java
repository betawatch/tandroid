package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x8 extends v {
    public final /* synthetic */ i9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(Context context, i9 i9Var) {
        super(context);
        this.d = i9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var = this.d;
        b4 currentPeerView = i9Var.o0.getCurrentPeerView();
        k5 k5Var = i9Var.x;
        if (k5Var != null && currentPeerView != null) {
            e3 e3Var = currentPeerView.M0;
            k5Var.setOffset(i9Var.f0);
            if (i9Var.x.f == 1.0f) {
                i9Var.o0.setVisibility(4);
            } else {
                i9Var.o0.setVisibility(0);
            }
            i9Var.o0.B();
            float top = e3Var.getTop() + currentPeerView.getTop();
            float f10 = i9Var.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (e3Var.getMeasuredHeight() > 0) {
                i9Var.q1 = e3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, i9Var.x.n / i9Var.q1, f10);
            i9Var.o0.setPivotY(top);
            i9Var.o0.setPivotX(getMeasuredWidth() / 2.0f);
            i9Var.o0.setScaleX(T1);
            i9Var.o0.setScaleY(T1);
            currentPeerView.F2 = true;
            if (i9Var.f0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f10, T1, i9Var.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.i1.b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / r6, i9Var.x.f);
            e3Var.invalidateOutline();
            i9Var.o0.setTranslationY((i9Var.x.b - top) * f10);
        }
        if (currentPeerView != null) {
            i9Var.d1.setTranslationY(((currentPeerView.M0.getY() + currentPeerView.getY()) - i9Var.d1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        i9 i9Var = this.d;
        if (!i9Var.b || i9Var.c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i11 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            i9Var.h(i11);
            size += i9Var.q0;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int i12 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i12) {
            i9Var.o0.getLayoutParams().width = -1;
            size = i12;
        } else {
            int i13 = (int) ((size / 16.0f) * 9.0f);
            i9Var.o0.getLayoutParams().width = i13;
            size2 = i13;
        }
        i9Var.z0.getLayoutParams().height = size + 1;
        i9Var.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) i9Var.z0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        super.onMeasure(i7, i10);
    }
}
