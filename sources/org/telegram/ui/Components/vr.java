package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i2.e0 e0Var;
        q70 q70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((xr) this.b).a;
                if (motionEvent.getActionMasked() != 1 || n1Var == null || !n1Var.isShowing()) {
                    return false;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                n1Var.d(true);
                return false;
            case 1:
                z50 z50Var = (z50) this.b;
                if (z50Var.K == null || z50Var.M == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = z50Var.S;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    z50Var.p0 = false;
                    z50Var.n0 = motionEvent.getPointerId(0);
                    z50Var.o0 = -1;
                    int i10 = z50Var.M.a;
                    if (i10 == 5) {
                        ImageView imageView = z50Var.G;
                        ki.o0 o0Var = z50Var.K;
                        if (o0Var != null && i10 == 5) {
                            boolean z10 = z50Var.c0;
                            z50Var.c0 = !z10;
                            ki.o0.s();
                            if (o0Var.U == 5 && (e0Var = o0Var.Q) != null) {
                                e0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = z50Var.P;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = z50Var.c0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.rk.r(imageView.animate(), z50Var.c0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.n0 n0Var = z50Var.M;
                        if (n0Var.a == 3 && !n0Var.e) {
                            z50Var.n0 = motionEvent.getPointerId(0);
                            z50Var.o0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            z50Var.l0 = hypot;
                            z50Var.p0 = hypot > 0.0f;
                            z50Var.m0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && z50Var.p0) {
                        int findPointerIndex = motionEvent.findPointerIndex(z50Var.n0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(z50Var.o0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            z50Var.o();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / z50Var.l0;
                            ki.g0 g0Var = z50Var.N;
                            float f7 = g0Var == null ? 1.0f : g0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            z50Var.m0 = max;
                            z50Var.K.v(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && z50Var.p0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == z50Var.n0 || pointerId == z50Var.o0) {
                            z50Var.o();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && z50Var.p0) {
                        z50Var.o();
                    }
                }
                return true;
            case 2:
                v70 v70Var = (v70) ((WeakReference) this.b).get();
                if (v70Var == null || (q70Var = v70Var.m) == null || !q70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    v70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    v70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = v70Var.p0;
                    if (view2 != null) {
                        v70Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    v70Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = v70Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        v70Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    v70Var.o0 = null;
                }
                return true;
            case 3:
                va0 va0Var = (va0) this.b;
                va0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, va0Var.getListView(), va0Var.w, null, va0Var.a);
            case 4:
                xb0 xb0Var = (xb0) this.b;
                xb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    xb0Var.c0.a(true);
                }
                return true;
            default:
                return gy0.v((gy0) this.b, motionEvent);
        }
    }
}
