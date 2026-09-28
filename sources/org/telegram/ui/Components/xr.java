package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i2.f0 f0Var;
        v70 v70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m1 m1Var = ((zr) this.b).a;
                if (motionEvent.getActionMasked() != 1 || m1Var == null || !m1Var.isShowing()) {
                    return false;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                m1Var.d(true);
                return false;
            case 1:
                d60 d60Var = (d60) this.b;
                if (d60Var.P == null || d60Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = d60Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    d60Var.u0 = false;
                    d60Var.s0 = motionEvent.getPointerId(0);
                    d60Var.t0 = -1;
                    int i10 = d60Var.R.a;
                    if (i10 == 5) {
                        ImageView imageView = d60Var.I;
                        ki.s0 s0Var = d60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z10 = d60Var.h0;
                            d60Var.h0 = !z10;
                            ki.s0.t();
                            if (s0Var.W == 5 && (f0Var = s0Var.S) != null) {
                                f0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = d60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = d60Var.h0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.ok.r(imageView.animate(), d60Var.h0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.r0 r0Var = d60Var.R;
                        if (r0Var.a == 3 && !r0Var.e) {
                            d60Var.s0 = motionEvent.getPointerId(0);
                            d60Var.t0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            d60Var.q0 = hypot;
                            d60Var.u0 = hypot > 0.0f;
                            d60Var.r0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && d60Var.u0) {
                        int findPointerIndex = motionEvent.findPointerIndex(d60Var.s0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(d60Var.t0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            d60Var.q();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / d60Var.q0;
                            ki.k0 k0Var = d60Var.S;
                            float f7 = k0Var == null ? 1.0f : k0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            d60Var.r0 = max;
                            d60Var.P.w(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && d60Var.u0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == d60Var.s0 || pointerId == d60Var.t0) {
                            d60Var.q();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && d60Var.u0) {
                        d60Var.q();
                    }
                }
                return true;
            case 2:
                a80 a80Var = (a80) ((WeakReference) this.b).get();
                if (a80Var == null || (v70Var = a80Var.m) == null || !v70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    a80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    a80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = a80Var.p0;
                    if (view2 != null) {
                        a80Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    a80Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = a80Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        a80Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    a80Var.o0 = null;
                }
                return true;
            case 3:
                bb0 bb0Var = (bb0) this.b;
                bb0Var.getClass();
                return org.telegram.ui.nt.q().s(motionEvent, bb0Var.getListView(), bb0Var.w, null, bb0Var.a);
            case 4:
                bc0 bc0Var = (bc0) this.b;
                bc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    bc0Var.c0.a(true);
                }
                return true;
            default:
                return hy0.v((hy0) this.b, motionEvent);
        }
    }
}
