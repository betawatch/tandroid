package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i2.g0 g0Var;
        d80 d80Var;
        switch (this.a) {
            case 0:
                al alVar = (al) this.b;
                alVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                alVar.c0();
                return false;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = ((hs) this.b).a;
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
            case 2:
                l60 l60Var = (l60) this.b;
                if (l60Var.P == null || l60Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = l60Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    l60Var.B0 = false;
                    l60Var.z0 = motionEvent.getPointerId(0);
                    l60Var.A0 = -1;
                    int i10 = l60Var.R.a;
                    if (i10 == 5) {
                        ImageView imageView = l60Var.I;
                        si.t0 t0Var = l60Var.P;
                        if (t0Var != null && i10 == 5) {
                            boolean z10 = l60Var.i0;
                            l60Var.i0 = !z10;
                            si.t0.t();
                            if (t0Var.W == 5 && (g0Var = t0Var.S) != null) {
                                g0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = l60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = l60Var.i0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.wh.s(imageView.animate(), l60Var.i0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        si.s0 s0Var = l60Var.R;
                        if (s0Var.a == 3 && !s0Var.e) {
                            l60Var.z0 = motionEvent.getPointerId(0);
                            l60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            l60Var.x0 = hypot;
                            l60Var.B0 = hypot > 0.0f;
                            l60Var.y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && l60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(l60Var.z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(l60Var.A0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            l60Var.s();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / l60Var.x0;
                            si.l0 l0Var = l60Var.S;
                            float f7 = l0Var == null ? 1.0f : l0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            l60Var.y0 = max;
                            l60Var.P.w(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && l60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == l60Var.z0 || pointerId == l60Var.A0) {
                            l60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && l60Var.B0) {
                        l60Var.s();
                    }
                }
                return true;
            case 3:
                i80 i80Var = (i80) ((WeakReference) this.b).get();
                if (i80Var == null || (d80Var = i80Var.m) == null || !d80Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    i80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    i80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = i80Var.p0;
                    if (view2 != null) {
                        i80Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    i80Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = i80Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        i80Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    i80Var.o0 = null;
                }
                return true;
            case 4:
                ib0 ib0Var = (ib0) this.b;
                ib0Var.getClass();
                return org.telegram.ui.gt.q().s(motionEvent, ib0Var.getListView(), ib0Var.w, null, ib0Var.a);
            case 5:
                ic0 ic0Var = (ic0) this.b;
                ic0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ic0Var.c0.a(true);
                }
                return true;
            default:
                return oy0.x((oy0) this.b, motionEvent);
        }
    }
}
