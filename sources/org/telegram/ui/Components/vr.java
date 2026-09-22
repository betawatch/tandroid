package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        t70 t70Var;
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
                b60 b60Var = (b60) this.b;
                if (b60Var.M == null || b60Var.O == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = b60Var.U;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    b60Var.r0 = false;
                    b60Var.p0 = motionEvent.getPointerId(0);
                    b60Var.q0 = -1;
                    int i10 = b60Var.O.a;
                    if (i10 == 5) {
                        ImageView imageView = b60Var.I;
                        ki.q0 q0Var = b60Var.M;
                        if (q0Var != null && i10 == 5) {
                            boolean z10 = b60Var.e0;
                            b60Var.e0 = !z10;
                            ki.q0.s();
                            if (q0Var.U == 5 && (e0Var = q0Var.Q) != null) {
                                e0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = b60Var.R;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = b60Var.e0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.rk.r(imageView.animate(), b60Var.e0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.p0 p0Var = b60Var.O;
                        if (p0Var.a == 3 && !p0Var.e) {
                            b60Var.p0 = motionEvent.getPointerId(0);
                            b60Var.q0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            b60Var.n0 = hypot;
                            b60Var.r0 = hypot > 0.0f;
                            b60Var.o0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && b60Var.r0) {
                        int findPointerIndex = motionEvent.findPointerIndex(b60Var.p0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(b60Var.q0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            b60Var.p();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / b60Var.n0;
                            ki.h0 h0Var = b60Var.P;
                            float f7 = h0Var == null ? 1.0f : h0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            b60Var.o0 = max;
                            b60Var.M.v(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && b60Var.r0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == b60Var.p0 || pointerId == b60Var.q0) {
                            b60Var.p();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && b60Var.r0) {
                        b60Var.p();
                    }
                }
                return true;
            case 2:
                y70 y70Var = (y70) ((WeakReference) this.b).get();
                if (y70Var == null || (t70Var = y70Var.m) == null || !t70Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    y70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    y70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = y70Var.p0;
                    if (view2 != null) {
                        y70Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    y70Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = y70Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        y70Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    y70Var.o0 = null;
                }
                return true;
            case 3:
                ya0 ya0Var = (ya0) this.b;
                ya0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, ya0Var.getListView(), ya0Var.w, null, ya0Var.a);
            case 4:
                ac0 ac0Var = (ac0) this.b;
                ac0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ac0Var.c0.a(true);
                }
                return true;
            default:
                return iy0.v((iy0) this.b, motionEvent);
        }
    }
}
