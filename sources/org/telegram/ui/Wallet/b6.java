package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.kr;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b6 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ b6(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        bi.i6 i6Var;
        switch (this.a) {
            case 0:
                o6 o6Var = (o6) ((w61) this.b).b;
                if (o6Var.G) {
                    o6Var.X0();
                    break;
                }
                break;
            case 1:
                d6 d6Var = (d6) this.b;
                o6 o6Var2 = d6Var.e;
                if (o6Var2.a0 != null && (i6Var = o6Var2.a) != null) {
                    boolean z10 = o6Var2.r0 && !i6Var.canScrollVertically(1);
                    if (o6Var2.c0 != z10) {
                        o6Var2.c0 = z10;
                        o6Var2.a0.animate().cancel();
                        if (z10) {
                            o6Var2.a0.setVisibility(0);
                            o6Var2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(kr.g).start();
                        } else {
                            o6Var2.a0.setAlpha(0.0f);
                            o6Var2.a0.setVisibility(4);
                        }
                    }
                }
                o6Var2.f1();
                View m10 = o6Var2.a.f3.m(o6Var2.h);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                int height = m10 != null ? m10.getHeight() : 0;
                if (m10 != d6Var.a || y10 != d6Var.b || height != d6Var.c) {
                    d6Var.a = m10;
                    d6Var.b = y10;
                    d6Var.c = height;
                    o6Var2.Y0();
                    break;
                }
                break;
            case 2:
                s8 s8Var = (s8) this.b;
                y6 y6Var = s8Var.c;
                float cardRotationX = y6Var.getCardRotationX();
                float cardRotationY = y6Var.getCardRotationY();
                if (cardRotationX != s8Var.b0 || cardRotationY != s8Var.c0) {
                    s8Var.b0 = cardRotationX;
                    s8Var.c0 = cardRotationY;
                    s8Var.M.invalidate();
                    break;
                }
                break;
            default:
                ea eaVar = (ea) ((hi.i5) this.b).c;
                hi.i5 i5Var = eaVar.x;
                if (i5Var != null && eaVar.a0 != null && i5Var.getHeight() > 0 && eaVar.a0.getHeight() > 0) {
                    float paddingTop = eaVar.fragmentView.getPaddingTop();
                    if (eaVar.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (eaVar.w.getScaleY() * (eaVar.w.getContentBottom() - eaVar.w.getPivotY())) + eaVar.w.getPivotY() + eaVar.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(eaVar.fragmentView.getHeight() - eaVar.fragmentView.getPaddingBottom(), eaVar.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / eaVar.x.getHeight());
                    eaVar.x.setPivotX(r5.getWidth() / 2.0f);
                    eaVar.x.setPivotY(r5.getHeight() / 2.0f);
                    eaVar.x.setScaleX(min);
                    eaVar.x.setScaleY(min);
                    eaVar.x.setTranslationY((((max / 2.0f) + paddingTop) - r4.getTop()) - (eaVar.x.getHeight() / 2.0f));
                }
                if (eaVar.b0 != null || eaVar.c0 < 1.0f) {
                    eaVar.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
