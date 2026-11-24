// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class dab extends pi5 {
    public final /* synthetic */ oab d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dab(oab oabVar, Context context) {
        super(context);
        this.d = oabVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        oab oabVar = this.d;
        a58 currentPeerView = oabVar.o0.getCurrentPeerView();
        p2a p2aVar = oabVar.x;
        if (p2aVar != null && currentPeerView != null) {
            g48 g48Var = currentPeerView.S0;
            p2aVar.setOffset(oabVar.f0);
            float f = oabVar.x.f;
            eab eabVar = oabVar.o0;
            if (f == 1.0f) {
                eabVar.setVisibility(4);
            } else {
                eabVar.setVisibility(0);
            }
            oabVar.o0.B();
            float top = g48Var.getTop() + currentPeerView.getTop();
            float f2 = oabVar.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (g48Var.getMeasuredHeight() > 0) {
                oabVar.q1 = g48Var.getMeasuredHeight();
            }
            float R1 = gm.R1(1.0f, oabVar.x.n / oabVar.q1, f2);
            oabVar.o0.setPivotY(top);
            oabVar.o0.setPivotX(getMeasuredWidth() / 2.0f);
            oabVar.o0.setScaleX(R1);
            oabVar.o0.setScaleY(R1);
            currentPeerView.L2 = true;
            if (oabVar.f0 == 0.0f) {
                currentPeerView.S0(0.0f, 0.0f, null);
            } else {
                currentPeerView.S0(f2, R1, oabVar.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.o1.b = (int) gm.R1(10.0f, 6.0f / r6, oabVar.x.f);
            g48Var.invalidateOutline();
            oabVar.o0.setTranslationY((oabVar.x.b - top) * f2);
        }
        if (currentPeerView != null) {
            oabVar.d1.setTranslationY(((currentPeerView.S0.getY() + currentPeerView.getY()) - oabVar.d1.getTop()) - gm.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        oab oabVar = this.d;
        if (!oabVar.b || oabVar.c) {
            View rootView = getRootView();
            Rect rect = gm.Q;
            getWindowVisibleDisplayFrame(rect);
            int i3 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i3 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? gm.m : 0)) - gm.o1(rootView)) - (rect.bottom - rect.top));
            }
            oabVar.g(i3);
            size += oabVar.q0;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int i4 = (int) ((size2 * 16.0f) / 9.0f);
        eab eabVar = oabVar.o0;
        if (size > i4) {
            eabVar.getLayoutParams().width = -1;
            size = i4;
        } else {
            int i5 = (int) ((size / 16.0f) * 9.0f);
            eabVar.getLayoutParams().width = i5;
            size2 = i5;
        }
        oabVar.z0.getLayoutParams().height = size + 1;
        oabVar.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) oabVar.z0.getLayoutParams()).topMargin = gm.m;
        super.onMeasure(i, i2);
    }
}
