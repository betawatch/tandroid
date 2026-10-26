package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.l71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ x4(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        l71 l71Var;
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) ((bh.p) this.b).c;
                if (m5Var.F) {
                    m5Var.O0();
                    break;
                }
                break;
            case 1:
                z4 z4Var = (z4) this.b;
                m5 m5Var2 = z4Var.e;
                if (m5Var2.Z != null && (l71Var = m5Var2.a) != null) {
                    boolean z10 = m5Var2.o0 && !l71Var.canScrollVertically(1);
                    if (m5Var2.b0 != z10) {
                        m5Var2.b0 = z10;
                        m5Var2.Z.animate().cancel();
                        if (z10) {
                            m5Var2.Z.setVisibility(0);
                            m5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(ds.g).start();
                        } else {
                            m5Var2.Z.setAlpha(0.0f);
                            m5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = m5Var2.a.f3.m(m5Var2.h);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != z4Var.a || y3 != z4Var.b || height != z4Var.c) {
                    z4Var.a = m10;
                    z4Var.b = y3;
                    z4Var.c = height;
                    m5Var2.P0();
                    break;
                }
                break;
            case 2:
                t7 t7Var = (t7) this.b;
                w5 w5Var = t7Var.c;
                float cardRotationX = w5Var.getCardRotationX();
                float cardRotationY = w5Var.getCardRotationY();
                if (cardRotationX != t7Var.a0 || cardRotationY != t7Var.b0) {
                    t7Var.a0 = cardRotationX;
                    t7Var.b0 = cardRotationY;
                    t7Var.L.invalidate();
                    break;
                }
                break;
            default:
                i9 i9Var = (i9) ((fi.l5) this.b).c;
                fi.l5 l5Var = i9Var.w;
                if (l5Var != null && i9Var.Z != null && l5Var.getHeight() > 0 && i9Var.Z.getHeight() > 0) {
                    float paddingTop = i9Var.fragmentView.getPaddingTop();
                    if (i9Var.v.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (i9Var.v.getScaleY() * (i9Var.v.getContentBottom() - i9Var.v.getPivotY())) + i9Var.v.getPivotY() + i9Var.v.getY());
                    }
                    float max = Math.max(0.0f, Math.min(i9Var.fragmentView.getHeight() - i9Var.fragmentView.getPaddingBottom(), i9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / i9Var.w.getHeight());
                    i9Var.w.setPivotX(r5.getWidth() / 2.0f);
                    i9Var.w.setPivotY(r5.getHeight() / 2.0f);
                    i9Var.w.setScaleX(min);
                    i9Var.w.setScaleY(min);
                    i9Var.w.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (i9Var.w.getHeight() / 2.0f));
                }
                if (i9Var.a0 != null || i9Var.b0 < 1.0f) {
                    i9Var.C0();
                    break;
                }
                break;
        }
        return true;
    }
}
