package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.s30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        boolean z10;
        int i3 = this.a;
        int i10 = 3;
        Object obj = this.b;
        switch (i3) {
            case 0:
                h1 h1Var = (h1) obj;
                FrameLayout frameLayout = h1Var.a;
                int height = frameLayout.getHeight();
                int i11 = height - h1Var.i();
                int i12 = h1Var.i;
                if (i11 != i12 - h1Var.k && height != i12 && h1Var.m == null) {
                    if (h1Var.b() && Math.abs(h1Var.i - height) >= org.telegram.messenger.g0.L(20.0f)) {
                        if (h1Var.i != -1 && h1Var.j == h1Var.c.getHeight()) {
                            boolean z11 = height < h1Var.c.getBottom();
                            h1Var.s = z11;
                            int i13 = h1Var.i;
                            if (h1Var.v) {
                                h1Var.v = false;
                            } else if (h1Var.u) {
                                ValueAnimator valueAnimator = h1Var.m;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                int i14 = h1Var.i();
                                ArrayList arrayList = h1Var.o;
                                arrayList.clear();
                                View view = frameLayout;
                                while (view != null) {
                                    arrayList.add(view);
                                    if (view == h1Var.d) {
                                        LaunchActivity launchActivity = LaunchActivity.K1;
                                        int expandedHeight = (launchActivity != null || launchActivity.O() == null) ? 0 : LaunchActivity.K1.O().getExpandedHeight();
                                        z10 = h1Var instanceof dh.k;
                                        if (!z10) {
                                            h1Var.h(Math.max(i13, height + expandedHeight));
                                        }
                                        h1Var.d.requestLayout();
                                        h1Var.g(height, z11);
                                        float f10 = height - i13;
                                        Math.abs(f10);
                                        h1Var.f = true;
                                        if (height <= i13) {
                                            float f11 = f10 - i14;
                                            if (!z10) {
                                                frameLayout.setTranslationY(-f11);
                                            }
                                            h1Var.e(f11, 1.0f, z11);
                                            h1Var.p = -f11;
                                            h1Var.q = -expandedHeight;
                                            h1Var.r = true;
                                        } else {
                                            if (!z10) {
                                                frameLayout.setTranslationY(h1Var.k);
                                            }
                                            h1Var.e(-h1Var.k, 0.0f, z11);
                                            h1Var.q = -h1Var.k;
                                            h1Var.p = f10;
                                            h1Var.r = false;
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        h1Var.m = ofFloat;
                                        h1Var.e = false;
                                        ofFloat.addUpdateListener(new gi.j3(h1Var, 14));
                                        h1Var.m.addListener(new ii.v3(h1Var, 10));
                                        h1Var.m.setDuration(250L);
                                        h1Var.m.setInterpolator(h1.w);
                                        h1Var.n.d();
                                        if (h1Var.g) {
                                            h1Var.m.start();
                                        } else {
                                            h1Var.g = false;
                                            SystemClock.elapsedRealtime();
                                            org.telegram.messenger.g0.i3(h1Var.h, 100L);
                                        }
                                    } else {
                                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                    }
                                }
                                LaunchActivity launchActivity2 = LaunchActivity.K1;
                                if (launchActivity2 != null) {
                                }
                                z10 = h1Var instanceof dh.k;
                                if (!z10) {
                                }
                                h1Var.d.requestLayout();
                                h1Var.g(height, z11);
                                float f102 = height - i13;
                                Math.abs(f102);
                                h1Var.f = true;
                                if (height <= i13) {
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                h1Var.m = ofFloat2;
                                h1Var.e = false;
                                ofFloat2.addUpdateListener(new gi.j3(h1Var, 14));
                                h1Var.m.addListener(new ii.v3(h1Var, 10));
                                h1Var.m.setDuration(250L);
                                h1Var.m.setInterpolator(h1.w);
                                h1Var.n.d();
                                if (h1Var.g) {
                                }
                            }
                            h1Var.i = height;
                            h1Var.j = h1Var.c.getHeight();
                            h1Var.k = h1Var.i();
                            break;
                        } else {
                            h1Var.i = height;
                            h1Var.j = h1Var.c.getHeight();
                            h1Var.k = h1Var.i();
                            break;
                        }
                    } else {
                        h1Var.i = height;
                        h1Var.j = h1Var.c.getHeight();
                        h1Var.k = h1Var.i();
                        h1Var.e = false;
                    }
                } else if (h1Var.m == null) {
                    h1Var.i = height;
                    h1Var.j = h1Var.c.getHeight();
                    h1Var.k = h1Var.i();
                    h1Var.e = false;
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
                ofFloat3.addListener(new w9(this, 0));
                ofFloat3.start();
                break;
            case 2:
                ((ot) obj).a.k1.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 3:
                l10 l10Var = (l10) obj;
                p10 p10Var = l10Var.f;
                x7 x7Var = l10Var.e;
                x7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                x7Var.getLocationOnScreen(l10Var.H);
                float f12 = l10Var.r.x + l10Var.R;
                r10 r10Var = l10Var.V;
                float measuredWidth = ((r10Var.getMeasuredWidth() / 2.0f) + f12) - r9[0];
                float measuredWidth2 = ((r10Var.getMeasuredWidth() / 2.0f) + (l10Var.r.y + l10Var.S)) - r9[1];
                boolean z12 = measuredWidth2 - ((float) org.telegram.messenger.g0.L(61.0f)) > 0.0f && ((float) org.telegram.messenger.g0.L(61.0f)) + measuredWidth2 < ((float) x7Var.getMeasuredHeight());
                if (org.telegram.messenger.g0.L(61.0f) + measuredWidth + p10Var.getMeasuredWidth() < x7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f) && z12) {
                    p10Var.setTranslationX(org.telegram.messenger.g0.L(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / x7Var.getMeasuredHeight();
                    float L = org.telegram.messenger.g0.L(40.0f) / p10Var.getMeasuredHeight();
                    p10Var.setTranslationY((int) (measuredWidth2 - (p10Var.getMeasuredHeight() * Math.max(L, Math.min(measuredHeight, 1.0f - L)))));
                    p10Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - org.telegram.messenger.g0.L(61.0f)) - p10Var.getMeasuredWidth() > org.telegram.messenger.g0.L(16.0f) && z12) {
                    float measuredHeight2 = measuredWidth2 / x7Var.getMeasuredHeight();
                    float L2 = org.telegram.messenger.g0.L(40.0f) / p10Var.getMeasuredHeight();
                    float max = Math.max(L2, Math.min(measuredHeight2, 1.0f - L2));
                    p10Var.setTranslationX((int) ((measuredWidth - org.telegram.messenger.g0.L(61.0f)) - p10Var.getMeasuredWidth()));
                    p10Var.setTranslationY((int) (measuredWidth2 - (p10Var.getMeasuredHeight() * max)));
                    p10Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= x7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / x7Var.getMeasuredWidth();
                    float L3 = org.telegram.messenger.g0.L(40.0f) / p10Var.getMeasuredWidth();
                    p10Var.setTranslationX((int) (measuredWidth - (p10Var.getMeasuredWidth() * Math.max(L3, Math.min(measuredWidth3, 1.0f - L3)))));
                    p10Var.setTranslationY((int) (org.telegram.messenger.g0.L(61.0f) + measuredWidth2));
                    p10Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / x7Var.getMeasuredWidth();
                    float L4 = org.telegram.messenger.g0.L(40.0f) / p10Var.getMeasuredWidth();
                    p10Var.setTranslationX((int) (measuredWidth - (p10Var.getMeasuredWidth() * Math.max(L4, Math.min(measuredWidth4, 1.0f - L4)))));
                    p10Var.setTranslationY((int) ((measuredWidth2 - p10Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(61.0f)));
                    p10Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 4:
                ((gi.n5) obj).invalidate();
                break;
            default:
                d71 d71Var = (d71) ((s30) obj).b;
                d71Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = d71Var.e;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    d71Var.e.setImageDrawable(null);
                    Bitmap bitmap = d71Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        d71Var.h = null;
                    }
                }
                org.telegram.messenger.g0.h3(new f51(this, i10));
                d71Var.r = 0;
                break;
        }
        return true;
    }
}
