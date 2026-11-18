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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.z10;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w7;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i7) {
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
                j1 j1Var = (j1) obj;
                FrameLayout frameLayout = j1Var.a;
                int height = frameLayout.getHeight();
                int i10 = height - j1Var.i();
                int i11 = j1Var.i;
                if (i10 != i11 - j1Var.k && height != i11 && j1Var.m == null) {
                    if (j1Var.b() && Math.abs(j1Var.i - height) >= org.telegram.messenger.g0.L(20.0f)) {
                        if (j1Var.i != -1 && j1Var.j == j1Var.c.getHeight()) {
                            boolean z11 = height < j1Var.c.getBottom();
                            j1Var.s = z11;
                            int i12 = j1Var.i;
                            if (j1Var.v) {
                                j1Var.v = false;
                            } else if (j1Var.u) {
                                ValueAnimator valueAnimator = j1Var.m;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                int i13 = j1Var.i();
                                ArrayList arrayList = j1Var.o;
                                arrayList.clear();
                                View view = frameLayout;
                                while (view != null) {
                                    arrayList.add(view);
                                    if (view == j1Var.d) {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        int expandedHeight = (launchActivity != null || launchActivity.N() == null) ? 0 : LaunchActivity.H1.N().getExpandedHeight();
                                        z10 = j1Var instanceof ch.l;
                                        if (!z10) {
                                            j1Var.h(Math.max(i12, height + expandedHeight));
                                        }
                                        j1Var.d.requestLayout();
                                        j1Var.g(height, z11);
                                        float f10 = height - i12;
                                        Math.abs(f10);
                                        j1Var.f = true;
                                        if (height <= i12) {
                                            float f11 = f10 - i13;
                                            if (!z10) {
                                                frameLayout.setTranslationY(-f11);
                                            }
                                            j1Var.e(f11, 1.0f, z11);
                                            j1Var.p = -f11;
                                            j1Var.q = -expandedHeight;
                                            j1Var.r = true;
                                        } else {
                                            if (!z10) {
                                                frameLayout.setTranslationY(j1Var.k);
                                            }
                                            j1Var.e(-j1Var.k, 0.0f, z11);
                                            j1Var.q = -j1Var.k;
                                            j1Var.p = f10;
                                            j1Var.r = false;
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        j1Var.m = ofFloat;
                                        j1Var.e = false;
                                        ofFloat.addUpdateListener(new hi.k3(j1Var, 13));
                                        j1Var.m.addListener(new ki.n3(j1Var, 10));
                                        j1Var.m.setDuration(250L);
                                        j1Var.m.setInterpolator(j1.w);
                                        j1Var.n.d();
                                        if (j1Var.g) {
                                            j1Var.m.start();
                                        } else {
                                            j1Var.g = false;
                                            SystemClock.elapsedRealtime();
                                            org.telegram.messenger.g0.h3(j1Var.h, 100L);
                                        }
                                    } else {
                                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                    }
                                }
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 != null) {
                                }
                                z10 = j1Var instanceof ch.l;
                                if (!z10) {
                                }
                                j1Var.d.requestLayout();
                                j1Var.g(height, z11);
                                float f102 = height - i12;
                                Math.abs(f102);
                                j1Var.f = true;
                                if (height <= i12) {
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                j1Var.m = ofFloat2;
                                j1Var.e = false;
                                ofFloat2.addUpdateListener(new hi.k3(j1Var, 13));
                                j1Var.m.addListener(new ki.n3(j1Var, 10));
                                j1Var.m.setDuration(250L);
                                j1Var.m.setInterpolator(j1.w);
                                j1Var.n.d();
                                if (j1Var.g) {
                                }
                            }
                            j1Var.i = height;
                            j1Var.j = j1Var.c.getHeight();
                            j1Var.k = j1Var.i();
                            break;
                        } else {
                            j1Var.i = height;
                            j1Var.j = j1Var.c.getHeight();
                            j1Var.k = j1Var.i();
                            break;
                        }
                    } else {
                        j1Var.i = height;
                        j1Var.j = j1Var.c.getHeight();
                        j1Var.k = j1Var.i();
                        j1Var.e = false;
                    }
                } else if (j1Var.m == null) {
                    j1Var.i = height;
                    j1Var.j = j1Var.c.getHeight();
                    j1Var.k = j1Var.i();
                    j1Var.e = false;
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
                ((bu) obj).a.n1.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 3:
                z10 z10Var = (z10) obj;
                d20 d20Var = z10Var.f;
                w7 w7Var = z10Var.e;
                w7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                w7Var.getLocationOnScreen(z10Var.I);
                float f12 = z10Var.s.x + z10Var.S;
                f20 f20Var = z10Var.W;
                float measuredWidth = ((f20Var.getMeasuredWidth() / 2.0f) + f12) - r8[0];
                float measuredWidth2 = ((f20Var.getMeasuredWidth() / 2.0f) + (z10Var.s.y + z10Var.T)) - r8[1];
                boolean z12 = measuredWidth2 - ((float) org.telegram.messenger.g0.L(61.0f)) > 0.0f && ((float) org.telegram.messenger.g0.L(61.0f)) + measuredWidth2 < ((float) w7Var.getMeasuredHeight());
                if (org.telegram.messenger.g0.L(61.0f) + measuredWidth + d20Var.getMeasuredWidth() < w7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f) && z12) {
                    d20Var.setTranslationX(org.telegram.messenger.g0.L(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / w7Var.getMeasuredHeight();
                    float L = org.telegram.messenger.g0.L(40.0f) / d20Var.getMeasuredHeight();
                    d20Var.setTranslationY((int) (measuredWidth2 - (d20Var.getMeasuredHeight() * Math.max(L, Math.min(measuredHeight, 1.0f - L)))));
                    d20Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - org.telegram.messenger.g0.L(61.0f)) - d20Var.getMeasuredWidth() > org.telegram.messenger.g0.L(16.0f) && z12) {
                    float L2 = org.telegram.messenger.g0.L(40.0f) / d20Var.getMeasuredHeight();
                    float max = Math.max(L2, Math.min(measuredWidth2 / w7Var.getMeasuredHeight(), 1.0f - L2));
                    d20Var.setTranslationX((int) ((measuredWidth - org.telegram.messenger.g0.L(61.0f)) - d20Var.getMeasuredWidth()));
                    d20Var.setTranslationY((int) (measuredWidth2 - (d20Var.getMeasuredHeight() * max)));
                    d20Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= w7Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / w7Var.getMeasuredWidth();
                    float L3 = org.telegram.messenger.g0.L(40.0f) / d20Var.getMeasuredWidth();
                    d20Var.setTranslationX((int) (measuredWidth - (d20Var.getMeasuredWidth() * Math.max(L3, Math.min(measuredWidth3, 1.0f - L3)))));
                    d20Var.setTranslationY((int) (org.telegram.messenger.g0.L(61.0f) + measuredWidth2));
                    d20Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / w7Var.getMeasuredWidth();
                    float L4 = org.telegram.messenger.g0.L(40.0f) / d20Var.getMeasuredWidth();
                    d20Var.setTranslationX((int) (measuredWidth - (d20Var.getMeasuredWidth() * Math.max(L4, Math.min(measuredWidth4, 1.0f - L4)))));
                    d20Var.setTranslationY((int) ((measuredWidth2 - d20Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(61.0f)));
                    d20Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 4:
                ((hi.m5) obj).invalidate();
                break;
            default:
                w71 w71Var = (w71) ((h40) obj).b;
                w71Var.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = w71Var.e;
                int i14 = 4;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    w71Var.e.setImageDrawable(null);
                    Bitmap bitmap = w71Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        w71Var.h = null;
                    }
                }
                org.telegram.messenger.g0.g3(new t51(this, i14));
                w71Var.r = 0;
                break;
        }
        return true;
    }
}
