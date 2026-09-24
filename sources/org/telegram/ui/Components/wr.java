package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wr(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i2.f0 f0Var;
        t70 t70Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m1 m1Var = ((yr) this.b).a;
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
                        ki.r0 r0Var = b60Var.M;
                        if (r0Var != null && i10 == 5) {
                            boolean z10 = b60Var.e0;
                            b60Var.e0 = !z10;
                            ki.r0.s();
                            if (r0Var.V == 5 && (f0Var = r0Var.R) != null) {
                                f0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = b60Var.R;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = b60Var.e0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.ok.r(imageView.animate(), b60Var.e0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.q0 q0Var = b60Var.O;
                        if (q0Var.a == 3 && !q0Var.e) {
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
                            ki.j0 j0Var = b60Var.P;
                            float f7 = j0Var == null ? 1.0f : j0Var.c;
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
                za0 za0Var = (za0) this.b;
                za0Var.getClass();
                return org.telegram.ui.nt.q().s(motionEvent, za0Var.getListView(), za0Var.w, null, za0Var.a);
            case 4:
                zb0 zb0Var = (zb0) this.b;
                zb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    zb0Var.c0.a(true);
                }
                return true;
            default:
                return fy0.v((fy0) this.b, motionEvent);
        }
    }
}
