package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.m81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s9;
import org.telegram.ui.w7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fd  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m1 m1Var = (m1) obj;
                FrameLayout frameLayout = m1Var.a;
                int height = frameLayout.getHeight();
                int i11 = height - m1Var.i();
                int i12 = m1Var.i;
                if (i11 != i12 - m1Var.k && height != i12 && m1Var.m == null) {
                    if (m1Var.b() && Math.abs(m1Var.i - height) >= org.telegram.messenger.i0.L(20.0f)) {
                        if (m1Var.i != -1 && m1Var.j == m1Var.c.getHeight()) {
                            boolean z11 = height < m1Var.c.getBottom();
                            m1Var.s = z11;
                            int i13 = m1Var.i;
                            if (m1Var.v) {
                                m1Var.v = false;
                            } else if (m1Var.u) {
                                ValueAnimator valueAnimator = m1Var.m;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                int i14 = m1Var.i();
                                ArrayList arrayList = m1Var.o;
                                arrayList.clear();
                                View view = frameLayout;
                                while (view != null) {
                                    arrayList.add(view);
                                    if (view == m1Var.d) {
                                        LaunchActivity launchActivity = LaunchActivity.I1;
                                        int expandedHeight = (launchActivity != null || launchActivity.O() == null) ? 0 : LaunchActivity.I1.O().getExpandedHeight();
                                        z10 = m1Var instanceof sg.k;
                                        if (!z10) {
                                            m1Var.h(Math.max(i13, height + expandedHeight));
                                        }
                                        m1Var.d.requestLayout();
                                        m1Var.g(height, z11);
                                        float f7 = height - i13;
                                        Math.abs(f7);
                                        m1Var.f = true;
                                        if (height <= i13) {
                                            float f10 = f7 - i14;
                                            if (!z10) {
                                                frameLayout.setTranslationY(-f10);
                                            }
                                            m1Var.e(f10, 1.0f, z11);
                                            m1Var.p = -f10;
                                            m1Var.q = -expandedHeight;
                                            m1Var.r = true;
                                        } else {
                                            if (!z10) {
                                                frameLayout.setTranslationY(m1Var.k);
                                            }
                                            m1Var.e(-m1Var.k, 0.0f, z11);
                                            m1Var.q = -m1Var.k;
                                            m1Var.p = f7;
                                            m1Var.r = false;
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        m1Var.m = ofFloat;
                                        m1Var.e = false;
                                        ofFloat.addUpdateListener(new bg.k(m1Var, 17));
                                        m1Var.m.addListener(new bg.e(m1Var, 20));
                                        m1Var.m.setDuration(250L);
                                        m1Var.m.setInterpolator(m1.w);
                                        m1Var.n.d();
                                        if (m1Var.g) {
                                            m1Var.m.start();
                                        } else {
                                            m1Var.g = false;
                                            SystemClock.elapsedRealtime();
                                            org.telegram.messenger.i0.h3(m1Var.h, 100L);
                                        }
                                    } else {
                                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                    }
                                }
                                LaunchActivity launchActivity2 = LaunchActivity.I1;
                                if (launchActivity2 != null) {
                                }
                                z10 = m1Var instanceof sg.k;
                                if (!z10) {
                                }
                                m1Var.d.requestLayout();
                                m1Var.g(height, z11);
                                float f72 = height - i13;
                                Math.abs(f72);
                                m1Var.f = true;
                                if (height <= i13) {
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                m1Var.m = ofFloat2;
                                m1Var.e = false;
                                ofFloat2.addUpdateListener(new bg.k(m1Var, 17));
                                m1Var.m.addListener(new bg.e(m1Var, 20));
                                m1Var.m.setDuration(250L);
                                m1Var.m.setInterpolator(m1.w);
                                m1Var.n.d();
                                if (m1Var.g) {
                                }
                            }
                            m1Var.i = height;
                            m1Var.j = m1Var.c.getHeight();
                            m1Var.k = m1Var.i();
                            break;
                        } else {
                            m1Var.i = height;
                            m1Var.j = m1Var.c.getHeight();
                            m1Var.k = m1Var.i();
                            break;
                        }
                    } else {
                        m1Var.i = height;
                        m1Var.j = m1Var.c.getHeight();
                        m1Var.k = m1Var.i();
                        m1Var.e = false;
                    }
                } else if (m1Var.m == null) {
                    m1Var.i = height;
                    m1Var.j = m1Var.c.getHeight();
                    m1Var.k = m1Var.i();
                    m1Var.e = false;
                }
                break;
            case 1:
                y9 y9Var = (y9) ((lg.f) obj).b;
                y9Var.getViewTreeObserver().removeOnPreDrawListener(this);
                y9Var.getTransitionParams().e();
                y9Var.getTransitionParams().a();
                y9Var.getTransitionParams().h = true;
                y9Var.getTransitionParams().L1 = 0.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new org.telegram.ui.Cells.r(this, 8));
                ofFloat3.addListener(new s9(this, 10));
                ofFloat3.start();
                break;
            case 2:
                ((bu) obj).a.j1.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 3:
                g20 g20Var = (g20) obj;
                k20 k20Var = g20Var.f;
                w7 w7Var = g20Var.e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                w7Var.getLocationOnScreen(g20Var.G);
                float f11 = g20Var.r.x + g20Var.Q;
                m20 m20Var = g20Var.U;
                float measuredWidth = ((m20Var.getMeasuredWidth() / 2.0f) + f11) - r8[0];
                float measuredWidth2 = ((m20Var.getMeasuredWidth() / 2.0f) + (g20Var.r.y + g20Var.R)) - r8[1];
                boolean z12 = measuredWidth2 - ((float) org.telegram.messenger.i0.L(61.0f)) > 0.0f && ((float) org.telegram.messenger.i0.L(61.0f)) + measuredWidth2 < ((float) w7Var.getMeasuredHeight());
                if (org.telegram.messenger.i0.L(61.0f) + measuredWidth + k20Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f) && z12) {
                    k20Var.setTranslationX(org.telegram.messenger.i0.L(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / w7Var.getMeasuredHeight();
                    float L = org.telegram.messenger.i0.L(40.0f) / k20Var.getMeasuredHeight();
                    k20Var.setTranslationY((int) (measuredWidth2 - (k20Var.getMeasuredHeight() * Math.max(L, Math.min(measuredHeight, 1.0f - L)))));
                    k20Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - org.telegram.messenger.i0.L(61.0f)) - k20Var.getMeasuredWidth() > org.telegram.messenger.i0.L(16.0f) && z12) {
                    float L2 = org.telegram.messenger.i0.L(40.0f) / k20Var.getMeasuredHeight();
                    float max = Math.max(L2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - L2));
                    k20Var.setTranslationX((int) ((measuredWidth - org.telegram.messenger.i0.L(61.0f)) - k20Var.getMeasuredWidth()));
                    k20Var.setTranslationY((int) (measuredWidth2 - (k20Var.getMeasuredHeight() * max)));
                    k20Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= w7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / w7Var.getMeasuredWidth();
                    float L3 = org.telegram.messenger.i0.L(40.0f) / k20Var.getMeasuredWidth();
                    k20Var.setTranslationX((int) (measuredWidth - (k20Var.getMeasuredWidth() * Math.max(L3, Math.min(measuredWidth3, 1.0f - L3)))));
                    k20Var.setTranslationY((int) (org.telegram.messenger.i0.L(61.0f) + measuredWidth2));
                    k20Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / w7Var.getMeasuredWidth();
                    float L4 = org.telegram.messenger.i0.L(40.0f) / k20Var.getMeasuredWidth();
                    k20Var.setTranslationX((int) (measuredWidth - (k20Var.getMeasuredWidth() * Math.max(L4, Math.min(measuredWidth4, 1.0f - L4)))));
                    k20Var.setTranslationY((int) ((measuredWidth2 - k20Var.getMeasuredHeight()) - org.telegram.messenger.i0.L(61.0f)));
                    k20Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 4:
                ((kg.f0) obj).invalidate();
                break;
            default:
                m81 m81Var = (m81) ((li.e) obj).b;
                m81Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = m81Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    m81Var.e.setImageDrawable(null);
                    Bitmap bitmap = m81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        m81Var.h = null;
                    }
                }
                org.telegram.messenger.i0.g3(new j51(this, 6));
                m81Var.r = 0;
                break;
        }
        return true;
    }
}
