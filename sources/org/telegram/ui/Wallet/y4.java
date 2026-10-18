package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ y4(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        u61 u61Var;
        switch (this.a) {
            case 0:
                ah.v vVar = (ah.v) this.b;
                m5 m5Var = (m5) vVar.c;
                if (m5Var.F || m5Var.G) {
                    m5Var.L0();
                }
                if (m5Var.G) {
                    vVar.invalidate();
                    break;
                }
                break;
            case 1:
                a5 a5Var = (a5) this.b;
                m5 m5Var2 = a5Var.e;
                if (m5Var2.a0 != null && (u61Var = m5Var2.a) != null) {
                    boolean z10 = m5Var2.p0 && !u61Var.canScrollVertically(1);
                    if (m5Var2.c0 != z10) {
                        m5Var2.c0 = z10;
                        m5Var2.a0.animate().cancel();
                        if (z10) {
                            m5Var2.a0.setVisibility(0);
                            m5Var2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.g).start();
                        } else {
                            m5Var2.a0.setAlpha(0.0f);
                            m5Var2.a0.setVisibility(4);
                        }
                    }
                }
                View m10 = m5Var2.a.V2.m(m5Var2.f);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != a5Var.a || y3 != a5Var.b || height != a5Var.c) {
                    a5Var.a = m10;
                    a5Var.b = y3;
                    a5Var.c = height;
                    m5Var2.M0();
                    break;
                }
                break;
            case 2:
                z7 z7Var = (z7) this.b;
                x5 x5Var = z7Var.c;
                float cardRotationX = x5Var.getCardRotationX();
                float cardRotationY = x5Var.getCardRotationY();
                if (cardRotationX != z7Var.a0 || cardRotationY != z7Var.b0) {
                    z7Var.a0 = cardRotationX;
                    z7Var.b0 = cardRotationY;
                    z7Var.L.invalidate();
                    break;
                }
                break;
            default:
                o9 o9Var = (o9) ((ei.m5) this.b).c;
                ei.m5 m5Var3 = o9Var.v;
                if (m5Var3 != null && o9Var.W != null && m5Var3.getHeight() > 0 && o9Var.W.getHeight() > 0) {
                    float paddingTop = o9Var.fragmentView.getPaddingTop();
                    if (o9Var.s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (o9Var.s.getScaleY() * (o9Var.s.getContentBottom() - o9Var.s.getPivotY())) + o9Var.s.getPivotY() + o9Var.s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(o9Var.fragmentView.getHeight() - o9Var.fragmentView.getPaddingBottom(), o9Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / o9Var.v.getHeight());
                    o9Var.v.setPivotX(r5.getWidth() / 2.0f);
                    o9Var.v.setPivotY(r5.getHeight() / 2.0f);
                    o9Var.v.setScaleX(min);
                    o9Var.v.setScaleY(min);
                    o9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (o9Var.v.getHeight() / 2.0f));
                }
                if (o9Var.X != null || o9Var.Y < 1.0f) {
                    o9Var.A0();
                    break;
                }
                break;
        }
        return true;
    }
}
