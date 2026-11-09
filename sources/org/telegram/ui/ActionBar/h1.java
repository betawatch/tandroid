package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.x30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w7;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fc  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        boolean z9;
        int i7 = this.a;
        int i10 = 2;
        Object obj = this.b;
        switch (i7) {
            case 0:
                i1 i1Var = (i1) obj;
                FrameLayout frameLayout = i1Var.a;
                int height = frameLayout.getHeight();
                int i11 = height - i1Var.i();
                int i12 = i1Var.i;
                if (i11 != i12 - i1Var.k && height != i12 && i1Var.m == null) {
                    if (i1Var.b() && Math.abs(i1Var.i - height) >= org.telegram.messenger.g0.L(20.0f)) {
                        if (i1Var.i != -1 && i1Var.j == i1Var.c.getHeight()) {
                            boolean z10 = height < i1Var.c.getBottom();
                            i1Var.s = z10;
                            int i13 = i1Var.i;
                            if (i1Var.v) {
                                i1Var.v = false;
                            } else if (i1Var.u) {
                                ValueAnimator valueAnimator = i1Var.m;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                int i14 = i1Var.i();
                                ArrayList arrayList = i1Var.o;
                                arrayList.clear();
                                View view = frameLayout;
                                while (view != null) {
                                    arrayList.add(view);
                                    if (view == i1Var.d) {
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        int expandedHeight = (launchActivity != null || launchActivity.O() == null) ? 0 : LaunchActivity.G1.O().getExpandedHeight();
                                        z9 = i1Var instanceof ch.k;
                                        if (!z9) {
                                            i1Var.h(Math.max(i13, height + expandedHeight));
                                        }
                                        i1Var.d.requestLayout();
                                        i1Var.g(height, z10);
                                        float f10 = height - i13;
                                        Math.abs(f10);
                                        i1Var.f = true;
                                        if (height <= i13) {
                                            float f11 = f10 - i14;
                                            if (!z9) {
                                                frameLayout.setTranslationY(-f11);
                                            }
                                            i1Var.e(f11, 1.0f, z10);
                                            i1Var.p = -f11;
                                            i1Var.q = -expandedHeight;
                                            i1Var.r = true;
                                        } else {
                                            if (!z9) {
                                                frameLayout.setTranslationY(i1Var.k);
                                            }
                                            i1Var.e(-i1Var.k, 0.0f, z10);
                                            i1Var.q = -i1Var.k;
                                            i1Var.p = f10;
                                            i1Var.r = false;
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        i1Var.m = ofFloat;
                                        i1Var.e = false;
                                        ofFloat.addUpdateListener(new fi.v3(i1Var, 13));
                                        i1Var.m.addListener(new m.a(i1Var, 9));
                                        i1Var.m.setDuration(250L);
                                        i1Var.m.setInterpolator(i1.w);
                                        i1Var.n.d();
                                        if (i1Var.g) {
                                            i1Var.m.start();
                                        } else {
                                            i1Var.g = false;
                                            SystemClock.elapsedRealtime();
                                            org.telegram.messenger.g0.i3(i1Var.h, 100L);
                                        }
                                    } else {
                                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                    }
                                }
                                LaunchActivity launchActivity2 = LaunchActivity.G1;
                                if (launchActivity2 != null) {
                                }
                                z9 = i1Var instanceof ch.k;
                                if (!z9) {
                                }
                                i1Var.d.requestLayout();
                                i1Var.g(height, z10);
                                float f102 = height - i13;
                                Math.abs(f102);
                                i1Var.f = true;
                                if (height <= i13) {
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                i1Var.m = ofFloat2;
                                i1Var.e = false;
                                ofFloat2.addUpdateListener(new fi.v3(i1Var, 13));
                                i1Var.m.addListener(new m.a(i1Var, 9));
                                i1Var.m.setDuration(250L);
                                i1Var.m.setInterpolator(i1.w);
                                i1Var.n.d();
                                if (i1Var.g) {
                                }
                            }
                            i1Var.i = height;
                            i1Var.j = i1Var.c.getHeight();
                            i1Var.k = i1Var.i();
                            break;
                        } else {
                            i1Var.i = height;
                            i1Var.j = i1Var.c.getHeight();
                            i1Var.k = i1Var.i();
                            break;
                        }
                    } else {
                        i1Var.i = height;
                        i1Var.j = i1Var.c.getHeight();
                        i1Var.k = i1Var.i();
                        i1Var.e = false;
                    }
                } else if (i1Var.m == null) {
                    i1Var.i = height;
                    i1Var.j = i1Var.c.getHeight();
                    i1Var.k = i1Var.i();
                    i1Var.e = false;
                }
                break;
            case 1:
                y9 y9Var = (y9) ((x9) obj).b;
                y9Var.getViewTreeObserver().removeOnPreDrawListener(this);
                y9Var.getTransitionParams().e();
                y9Var.getTransitionParams().a();
                y9Var.getTransitionParams().h = true;
                y9Var.getTransitionParams().L1 = 0.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new org.telegram.ui.Cells.r(this, 8));
                ofFloat3.addListener(new m.a(this, 29));
                ofFloat3.start();
                break;
            case 2:
                ((qt) obj).a.j1.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 3:
                q10 q10Var = (q10) obj;
                u10 u10Var = q10Var.f;
                w7 w7Var = q10Var.e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                w7Var.getLocationOnScreen(q10Var.H);
                float f12 = q10Var.s.x + q10Var.R;
                w10 w10Var = q10Var.V;
                float measuredWidth = ((w10Var.getMeasuredWidth() / 2.0f) + f12) - r8[0];
                float measuredWidth2 = ((w10Var.getMeasuredWidth() / 2.0f) + (q10Var.s.y + q10Var.S)) - r8[1];
                boolean z11 = measuredWidth2 - ((float) org.telegram.messenger.g0.L(61.0f)) > 0.0f && ((float) org.telegram.messenger.g0.L(61.0f)) + measuredWidth2 < ((float) w7Var.getMeasuredHeight());
                if (org.telegram.messenger.g0.L(61.0f) + measuredWidth + u10Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f) && z11) {
                    u10Var.setTranslationX(org.telegram.messenger.g0.L(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / w7Var.getMeasuredHeight();
                    float L = org.telegram.messenger.g0.L(40.0f) / u10Var.getMeasuredHeight();
                    u10Var.setTranslationY((int) (measuredWidth2 - (u10Var.getMeasuredHeight() * Math.max(L, Math.min(measuredHeight, 1.0f - L)))));
                    u10Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - org.telegram.messenger.g0.L(61.0f)) - u10Var.getMeasuredWidth() > org.telegram.messenger.g0.L(16.0f) && z11) {
                    float L2 = org.telegram.messenger.g0.L(40.0f) / u10Var.getMeasuredHeight();
                    float max = Math.max(L2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - L2));
                    u10Var.setTranslationX((int) ((measuredWidth - org.telegram.messenger.g0.L(61.0f)) - u10Var.getMeasuredWidth()));
                    u10Var.setTranslationY((int) (measuredWidth2 - (u10Var.getMeasuredHeight() * max)));
                    u10Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= w7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / w7Var.getMeasuredWidth();
                    float L3 = org.telegram.messenger.g0.L(40.0f) / u10Var.getMeasuredWidth();
                    u10Var.setTranslationX((int) (measuredWidth - (u10Var.getMeasuredWidth() * Math.max(L3, Math.min(measuredWidth3, 1.0f - L3)))));
                    u10Var.setTranslationY((int) (org.telegram.messenger.g0.L(61.0f) + measuredWidth2));
                    u10Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / w7Var.getMeasuredWidth();
                    float L4 = org.telegram.messenger.g0.L(40.0f) / u10Var.getMeasuredWidth();
                    u10Var.setTranslationX((int) (measuredWidth - (u10Var.getMeasuredWidth() * Math.max(L4, Math.min(measuredWidth4, 1.0f - L4)))));
                    u10Var.setTranslationY((int) ((measuredWidth2 - u10Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(61.0f)));
                    u10Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 4:
                ((fi.p5) obj).invalidate();
                break;
            default:
                m71 m71Var = (m71) ((x30) obj).b;
                m71Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = m71Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    m71Var.e.setImageDrawable(null);
                    Bitmap bitmap = m71Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        m71Var.h = null;
                    }
                }
                org.telegram.messenger.g0.h3(new t51(this, i10));
                m71Var.r = 0;
                break;
        }
        return true;
    }
}
