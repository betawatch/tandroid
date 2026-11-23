package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class u8 extends v {
    public final /* synthetic */ f9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(Context context, f9 f9Var) {
        super(context);
        this.d = f9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f9 f9Var = this.d;
        z3 currentPeerView = f9Var.o0.getCurrentPeerView();
        j5 j5Var = f9Var.x;
        if (j5Var != null && currentPeerView != null) {
            c3 c3Var = currentPeerView.M0;
            j5Var.setOffset(f9Var.f0);
            if (f9Var.x.f == 1.0f) {
                f9Var.o0.setVisibility(4);
            } else {
                f9Var.o0.setVisibility(0);
            }
            f9Var.o0.B();
            float top = c3Var.getTop() + currentPeerView.getTop();
            float f10 = f9Var.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (c3Var.getMeasuredHeight() > 0) {
                f9Var.q1 = c3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, f9Var.x.n / f9Var.q1, f10);
            f9Var.o0.setPivotY(top);
            f9Var.o0.setPivotX(getMeasuredWidth() / 2.0f);
            f9Var.o0.setScaleX(T1);
            f9Var.o0.setScaleY(T1);
            currentPeerView.F2 = true;
            if (f9Var.f0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f10, T1, f9Var.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.i1.b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / r6, f9Var.x.f);
            c3Var.invalidateOutline();
            f9Var.o0.setTranslationY((f9Var.x.b - top) * f10);
        }
        if (currentPeerView != null) {
            f9Var.d1.setTranslationY(((currentPeerView.M0.getY() + currentPeerView.getY()) - f9Var.d1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        f9 f9Var = this.d;
        if (!f9Var.b || f9Var.c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i11 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i11 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            f9Var.h(i11);
            size += f9Var.q0;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int i12 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i12) {
            f9Var.o0.getLayoutParams().width = -1;
            size = i12;
        } else {
            int i13 = (int) ((size / 16.0f) * 9.0f);
            f9Var.o0.getLayoutParams().width = i13;
            size2 = i13;
        }
        f9Var.z0.getLayoutParams().height = size + 1;
        f9Var.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) f9Var.z0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        super.onMeasure(i7, i10);
    }
}
