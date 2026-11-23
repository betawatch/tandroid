package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w7;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(Object obj, int i7) {
        this.a = i7;
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
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                i1 i1Var = (i1) obj;
                FrameLayout frameLayout = i1Var.a;
                int height = frameLayout.getHeight();
                int i10 = height - i1Var.i();
                int i11 = i1Var.i;
                if (i10 != i11 - i1Var.k && height != i11 && i1Var.m == null) {
                    if (i1Var.b() && Math.abs(i1Var.i - height) >= org.telegram.messenger.g0.L(20.0f)) {
                        if (i1Var.i != -1 && i1Var.j == i1Var.c.getHeight()) {
                            boolean z11 = height < i1Var.c.getBottom();
                            i1Var.s = z11;
                            int i12 = i1Var.i;
                            if (i1Var.v) {
                                i1Var.v = false;
                            } else if (i1Var.u) {
                                ValueAnimator valueAnimator = i1Var.m;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                int i13 = i1Var.i();
                                ArrayList arrayList = i1Var.o;
                                arrayList.clear();
                                View view = frameLayout;
                                while (view != null) {
                                    arrayList.add(view);
                                    if (view == i1Var.d) {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        int expandedHeight = (launchActivity != null || launchActivity.N() == null) ? 0 : LaunchActivity.H1.N().getExpandedHeight();
                                        z10 = i1Var instanceof ch.l;
                                        if (!z10) {
                                            i1Var.h(Math.max(i12, height + expandedHeight));
                                        }
                                        i1Var.d.requestLayout();
                                        i1Var.g(height, z11);
                                        float f10 = height - i12;
                                        Math.abs(f10);
                                        i1Var.f = true;
                                        if (height <= i12) {
                                            float f11 = f10 - i13;
                                            if (!z10) {
                                                frameLayout.setTranslationY(-f11);
                                            }
                                            i1Var.e(f11, 1.0f, z11);
                                            i1Var.p = -f11;
                                            i1Var.q = -expandedHeight;
                                            i1Var.r = true;
                                        } else {
                                            if (!z10) {
                                                frameLayout.setTranslationY(i1Var.k);
                                            }
                                            i1Var.e(-i1Var.k, 0.0f, z11);
                                            i1Var.q = -i1Var.k;
                                            i1Var.p = f10;
                                            i1Var.r = false;
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        i1Var.m = ofFloat;
                                        i1Var.e = false;
                                        ofFloat.addUpdateListener(new hi.j3(i1Var, 13));
                                        i1Var.m.addListener(new ki.m3(i1Var, 10));
                                        i1Var.m.setDuration(250L);
                                        i1Var.m.setInterpolator(i1.w);
                                        i1Var.n.d();
                                        if (i1Var.g) {
                                            i1Var.m.start();
                                        } else {
                                            i1Var.g = false;
                                            SystemClock.elapsedRealtime();
                                            org.telegram.messenger.g0.h3(i1Var.h, 100L);
                                        }
                                    } else {
                                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                    }
                                }
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 != null) {
                                }
                                z10 = i1Var instanceof ch.l;
                                if (!z10) {
                                }
                                i1Var.d.requestLayout();
                                i1Var.g(height, z11);
                                float f102 = height - i12;
                                Math.abs(f102);
                                i1Var.f = true;
                                if (height <= i12) {
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                i1Var.m = ofFloat2;
                                i1Var.e = false;
                                ofFloat2.addUpdateListener(new hi.j3(i1Var, 13));
                                i1Var.m.addListener(new ki.m3(i1Var, 10));
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
                aa aaVar = (aa) ((z9) obj).b;
                aaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                aaVar.getTransitionParams().e();
                aaVar.getTransitionParams().a();
                aaVar.getTransitionParams().h = true;
                aaVar.getTransitionParams().L1 = 0.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new org.telegram.ui.Cells.r(this, 8));
                ofFloat3.addListener(new y9(this, 0));
                ofFloat3.start();
                break;
            case 2:
                ((du) obj).a.n1.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 3:
                c20 c20Var = (c20) obj;
                g20 g20Var = c20Var.f;
                w7 w7Var = c20Var.e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                w7Var.getLocationOnScreen(c20Var.I);
                float f12 = c20Var.s.x + c20Var.S;
                i20 i20Var = c20Var.W;
                float measuredWidth = ((i20Var.getMeasuredWidth() / 2.0f) + f12) - r8[0];
                float measuredWidth2 = ((i20Var.getMeasuredWidth() / 2.0f) + (c20Var.s.y + c20Var.T)) - r8[1];
                boolean z12 = measuredWidth2 - ((float) org.telegram.messenger.g0.L(61.0f)) > 0.0f && ((float) org.telegram.messenger.g0.L(61.0f)) + measuredWidth2 < ((float) w7Var.getMeasuredHeight());
                if (org.telegram.messenger.g0.L(61.0f) + measuredWidth + g20Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f) && z12) {
                    g20Var.setTranslationX(org.telegram.messenger.g0.L(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / w7Var.getMeasuredHeight();
                    float L = org.telegram.messenger.g0.L(40.0f) / g20Var.getMeasuredHeight();
                    g20Var.setTranslationY((int) (measuredWidth2 - (g20Var.getMeasuredHeight() * Math.max(L, Math.min(measuredHeight, 1.0f - L)))));
                    g20Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - org.telegram.messenger.g0.L(61.0f)) - g20Var.getMeasuredWidth() > org.telegram.messenger.g0.L(16.0f) && z12) {
                    float L2 = org.telegram.messenger.g0.L(40.0f) / g20Var.getMeasuredHeight();
                    float max = Math.max(L2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - L2));
                    g20Var.setTranslationX((int) ((measuredWidth - org.telegram.messenger.g0.L(61.0f)) - g20Var.getMeasuredWidth()));
                    g20Var.setTranslationY((int) (measuredWidth2 - (g20Var.getMeasuredHeight() * max)));
                    g20Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= w7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / w7Var.getMeasuredWidth();
                    float L3 = org.telegram.messenger.g0.L(40.0f) / g20Var.getMeasuredWidth();
                    g20Var.setTranslationX((int) (measuredWidth - (g20Var.getMeasuredWidth() * Math.max(L3, Math.min(measuredWidth3, 1.0f - L3)))));
                    g20Var.setTranslationY((int) (org.telegram.messenger.g0.L(61.0f) + measuredWidth2));
                    g20Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / w7Var.getMeasuredWidth();
                    float L4 = org.telegram.messenger.g0.L(40.0f) / g20Var.getMeasuredWidth();
                    g20Var.setTranslationX((int) (measuredWidth - (g20Var.getMeasuredWidth() * Math.max(L4, Math.min(measuredWidth4, 1.0f - L4)))));
                    g20Var.setTranslationY((int) ((measuredWidth2 - g20Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(61.0f)));
                    g20Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 4:
                ((hi.l5) obj).invalidate();
                break;
            default:
                z71 z71Var = (z71) ((k40) obj).b;
                z71Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = z71Var.e;
                int i14 = 4;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    z71Var.e.setImageDrawable(null);
                    Bitmap bitmap = z71Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        z71Var.h = null;
                    }
                }
                org.telegram.messenger.g0.g3(new w51(this, i14));
                z71Var.r = 0;
                break;
        }
        return true;
    }
}
