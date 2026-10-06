package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i2.f0 f0Var;
        w70 w70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((as) this.b).a;
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
                e60 e60Var = (e60) this.b;
                if (e60Var.P == null || e60Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = e60Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    e60Var.u0 = false;
                    e60Var.s0 = motionEvent.getPointerId(0);
                    e60Var.t0 = -1;
                    int i10 = e60Var.R.a;
                    if (i10 == 5) {
                        ImageView imageView = e60Var.I;
                        ki.s0 s0Var = e60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z10 = e60Var.h0;
                            e60Var.h0 = !z10;
                            ki.s0.t();
                            if (s0Var.W == 5 && (f0Var = s0Var.S) != null) {
                                f0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = e60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = e60Var.h0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.bi.q(imageView.animate(), e60Var.h0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.r0 r0Var = e60Var.R;
                        if (r0Var.a == 3 && !r0Var.e) {
                            e60Var.s0 = motionEvent.getPointerId(0);
                            e60Var.t0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            e60Var.q0 = hypot;
                            e60Var.u0 = hypot > 0.0f;
                            e60Var.r0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && e60Var.u0) {
                        int findPointerIndex = motionEvent.findPointerIndex(e60Var.s0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(e60Var.t0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            e60Var.q();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / e60Var.q0;
                            ki.k0 k0Var = e60Var.S;
                            float f7 = k0Var == null ? 1.0f : k0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            e60Var.r0 = max;
                            e60Var.P.w(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && e60Var.u0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == e60Var.s0 || pointerId == e60Var.t0) {
                            e60Var.q();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && e60Var.u0) {
                        e60Var.q();
                    }
                }
                return true;
            case 2:
                b80 b80Var = (b80) ((WeakReference) this.b).get();
                if (b80Var == null || (w70Var = b80Var.m) == null || !w70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    b80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    b80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = b80Var.p0;
                    if (view2 != null) {
                        b80Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    b80Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = b80Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        b80Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    b80Var.o0 = null;
                }
                return true;
            case 3:
                bb0 bb0Var = (bb0) this.b;
                bb0Var.getClass();
                return org.telegram.ui.rt.q().s(motionEvent, bb0Var.getListView(), bb0Var.w, null, bb0Var.a);
            case 4:
                cc0 cc0Var = (cc0) this.b;
                cc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    cc0Var.c0.a(true);
                }
                return true;
            default:
                return ry0.v((ry0) this.b, motionEvent);
        }
    }
}
