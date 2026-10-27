package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        i2.j0 j0Var;
        g80 g80Var;
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
                org.telegram.ui.ActionBar.o1 o1Var = ((js) this.b).a;
                if (motionEvent.getActionMasked() != 1 || o1Var == null || !o1Var.isShowing()) {
                    return false;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                o1Var.d(true);
                return false;
            case 2:
                o60 o60Var = (o60) this.b;
                if (o60Var.O == null || o60Var.Q == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = o60Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    o60Var.B0 = false;
                    o60Var.z0 = motionEvent.getPointerId(0);
                    o60Var.A0 = -1;
                    int i10 = o60Var.Q.a;
                    if (i10 == 5) {
                        ImageView imageView = o60Var.H;
                        vi.u0 u0Var = o60Var.O;
                        if (u0Var != null && i10 == 5) {
                            boolean z10 = o60Var.i0;
                            o60Var.i0 = !z10;
                            vi.u0.u();
                            if (u0Var.Z == 5 && (j0Var = u0Var.V) != null) {
                                j0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = o60Var.T;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = o60Var.i0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.wh.p(imageView.animate(), o60Var.i0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        vi.t0 t0Var = o60Var.Q;
                        if (t0Var.a == 3 && !t0Var.f) {
                            o60Var.z0 = motionEvent.getPointerId(0);
                            o60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            o60Var.x0 = hypot;
                            o60Var.B0 = hypot > 0.0f;
                            o60Var.y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && o60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(o60Var.z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(o60Var.A0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            o60Var.u();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / o60Var.x0;
                            vi.m0 m0Var = o60Var.R;
                            float f7 = m0Var == null ? 1.0f : m0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            o60Var.y0 = max;
                            o60Var.O.x(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && o60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == o60Var.z0 || pointerId == o60Var.A0) {
                            o60Var.u();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && o60Var.B0) {
                        o60Var.u();
                    }
                }
                return true;
            case 3:
                l80 l80Var = (l80) ((WeakReference) this.b).get();
                if (l80Var == null || (g80Var = l80Var.m) == null || !g80Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    l80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    l80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = l80Var.p0;
                    if (view2 != null) {
                        l80Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    l80Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = l80Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        l80Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    l80Var.o0 = null;
                }
                return true;
            case 4:
                hb0 hb0Var = (hb0) this.b;
                hb0Var.getClass();
                return org.telegram.ui.ht.o().q(motionEvent, hb0Var.getListView(), hb0Var.w, null, hb0Var.a);
            case 5:
                ic0 ic0Var = (ic0) this.b;
                ic0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ic0Var.c0.a(true);
                }
                return true;
            default:
                return dz0.x((dz0) this.b, motionEvent);
        }
    }
}
