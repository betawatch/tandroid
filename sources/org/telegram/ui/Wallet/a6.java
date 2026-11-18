package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.lr;
import org.telegram.ui.y61;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a6(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        bi.d6 d6Var;
        switch (this.a) {
            case 0:
                n6 n6Var = (n6) ((y61) this.b).b;
                if (n6Var.G) {
                    n6Var.X0();
                    break;
                }
                break;
            case 1:
                c6 c6Var = (c6) this.b;
                n6 n6Var2 = c6Var.e;
                if (n6Var2.a0 != null && (d6Var = n6Var2.a) != null) {
                    boolean z10 = n6Var2.r0 && !d6Var.canScrollVertically(1);
                    if (n6Var2.c0 != z10) {
                        n6Var2.c0 = z10;
                        n6Var2.a0.animate().cancel();
                        if (z10) {
                            n6Var2.a0.setVisibility(0);
                            n6Var2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(lr.g).start();
                        } else {
                            n6Var2.a0.setAlpha(0.0f);
                            n6Var2.a0.setVisibility(4);
                        }
                    }
                }
                n6Var2.f1();
                View m10 = n6Var2.a.f3.m(n6Var2.h);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != c6Var.a || y10 != c6Var.b || height != c6Var.c) {
                    c6Var.a = m10;
                    c6Var.b = y10;
                    c6Var.c = height;
                    n6Var2.Y0();
                    break;
                }
                break;
            case 2:
                r8 r8Var = (r8) this.b;
                x6 x6Var = r8Var.c;
                float cardRotationX = x6Var.getCardRotationX();
                float cardRotationY = x6Var.getCardRotationY();
                if (cardRotationX != r8Var.b0 || cardRotationY != r8Var.c0) {
                    r8Var.b0 = cardRotationX;
                    r8Var.c0 = cardRotationY;
                    r8Var.M.invalidate();
                    break;
                }
                break;
            default:
                da daVar = (da) ((hi.x4) this.b).c;
                hi.x4 x4Var = daVar.x;
                if (x4Var != null && daVar.a0 != null && x4Var.getHeight() > 0 && daVar.a0.getHeight() > 0) {
                    float paddingTop = daVar.fragmentView.getPaddingTop();
                    if (daVar.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (daVar.w.getScaleY() * (daVar.w.getContentBottom() - daVar.w.getPivotY())) + daVar.w.getPivotY() + daVar.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(daVar.fragmentView.getHeight() - daVar.fragmentView.getPaddingBottom(), daVar.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / daVar.x.getHeight());
                    daVar.x.setPivotX(r5.getWidth() / 2.0f);
                    daVar.x.setPivotY(r5.getHeight() / 2.0f);
                    daVar.x.setScaleX(min);
                    daVar.x.setScaleY(min);
                    daVar.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (daVar.x.getHeight() / 2.0f));
                }
                if (daVar.b0 != null || daVar.c0 < 1.0f) {
                    daVar.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
