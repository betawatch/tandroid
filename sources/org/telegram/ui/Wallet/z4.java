package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d71;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ z4(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d71 d71Var;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) ((ah.v) this.b).c;
                if (o5Var.E) {
                    o5Var.N0();
                    break;
                }
                break;
            case 1:
                b5 b5Var = (b5) this.b;
                o5 o5Var2 = b5Var.e;
                if (o5Var2.Y != null && (d71Var = o5Var2.a) != null) {
                    boolean z10 = o5Var2.n0 && !d71Var.canScrollVertically(1);
                    if (o5Var2.a0 != z10) {
                        o5Var2.a0 = z10;
                        o5Var2.Y.animate().cancel();
                        if (z10) {
                            o5Var2.Y.setVisibility(0);
                            o5Var2.Y.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.g).start();
                        } else {
                            o5Var2.Y.setAlpha(0.0f);
                            o5Var2.Y.setVisibility(4);
                        }
                    }
                }
                View m10 = o5Var2.a.Y2.m(o5Var2.f);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != b5Var.a || y3 != b5Var.b || height != b5Var.c) {
                    b5Var.a = m10;
                    b5Var.b = y3;
                    b5Var.c = height;
                    o5Var2.O0();
                    break;
                }
                break;
            case 2:
                t7 t7Var = (t7) this.b;
                x5 x5Var = t7Var.c;
                float cardRotationX = x5Var.getCardRotationX();
                float cardRotationY = x5Var.getCardRotationY();
                if (cardRotationX != t7Var.a0 || cardRotationY != t7Var.b0) {
                    t7Var.a0 = cardRotationX;
                    t7Var.b0 = cardRotationY;
                    t7Var.L.invalidate();
                    break;
                }
                break;
            default:
                j9 j9Var = (j9) ((ei.m5) this.b).c;
                ei.m5 m5Var = j9Var.v;
                if (m5Var != null && j9Var.Y != null && m5Var.getHeight() > 0 && j9Var.Y.getHeight() > 0) {
                    float paddingTop = j9Var.fragmentView.getPaddingTop();
                    if (j9Var.s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (j9Var.s.getScaleY() * (j9Var.s.getContentBottom() - j9Var.s.getPivotY())) + j9Var.s.getPivotY() + j9Var.s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(j9Var.fragmentView.getHeight() - j9Var.fragmentView.getPaddingBottom(), j9Var.Y.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / j9Var.v.getHeight());
                    j9Var.v.setPivotX(r5.getWidth() / 2.0f);
                    j9Var.v.setPivotY(r5.getHeight() / 2.0f);
                    j9Var.v.setScaleX(min);
                    j9Var.v.setScaleY(min);
                    j9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (j9Var.v.getHeight() / 2.0f));
                }
                if (j9Var.Z != null || j9Var.a0 < 1.0f) {
                    j9Var.B0();
                    break;
                }
                break;
        }
        return true;
    }
}
