package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class a5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        v61 v61Var;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) ((ah.v) this.b).c;
                if (o5Var.E) {
                    o5Var.M0();
                    break;
                }
                break;
            case 1:
                c5 c5Var = (c5) this.b;
                o5 o5Var2 = c5Var.e;
                if (o5Var2.Y != null && (v61Var = o5Var2.a) != null) {
                    boolean z10 = o5Var2.n0 && !v61Var.canScrollVertically(1);
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
                View m10 = o5Var2.a.V2.m(o5Var2.f);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != c5Var.a || y3 != c5Var.b || height != c5Var.c) {
                    c5Var.a = m10;
                    c5Var.b = y3;
                    c5Var.c = height;
                    o5Var2.N0();
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
                i9 i9Var = (i9) ((ei.m5) this.b).c;
                ei.m5 m5Var = i9Var.v;
                if (m5Var != null && i9Var.W != null && m5Var.getHeight() > 0 && i9Var.W.getHeight() > 0) {
                    float paddingTop = i9Var.fragmentView.getPaddingTop();
                    if (i9Var.s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (i9Var.s.getScaleY() * (i9Var.s.getContentBottom() - i9Var.s.getPivotY())) + i9Var.s.getPivotY() + i9Var.s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(i9Var.fragmentView.getHeight() - i9Var.fragmentView.getPaddingBottom(), i9Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / i9Var.v.getHeight());
                    i9Var.v.setPivotX(r5.getWidth() / 2.0f);
                    i9Var.v.setPivotY(r5.getHeight() / 2.0f);
                    i9Var.v.setScaleX(min);
                    i9Var.v.setScaleY(min);
                    i9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (i9Var.v.getHeight() / 2.0f));
                }
                if (i9Var.X != null || i9Var.Y < 1.0f) {
                    i9Var.A0();
                    break;
                }
                break;
        }
        return true;
    }
}
