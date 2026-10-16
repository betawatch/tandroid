package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tk implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i2.h0 h0Var;
        g80 g80Var;
        switch (this.a) {
            case 0:
                cl clVar = (cl) this.b;
                clVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                clVar.c0();
                return false;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = ((ks) this.b).a;
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
                o60 o60Var = (o60) this.b;
                if (o60Var.P == null || o60Var.R == null) {
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
                    int i10 = o60Var.R.a;
                    if (i10 == 5) {
                        ImageView imageView = o60Var.I;
                        ri.r0 r0Var = o60Var.P;
                        if (r0Var != null && i10 == 5) {
                            boolean z10 = o60Var.i0;
                            o60Var.i0 = !z10;
                            ri.r0.t();
                            if (r0Var.W == 5 && (h0Var = r0Var.S) != null) {
                                h0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = o60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = o60Var.i0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.sk.s(imageView.animate(), o60Var.i0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ri.q0 q0Var = o60Var.R;
                        if (q0Var.a == 3 && !q0Var.e) {
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
                            o60Var.s();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / o60Var.x0;
                            ri.j0 j0Var = o60Var.S;
                            float f7 = j0Var == null ? 1.0f : j0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            o60Var.y0 = max;
                            o60Var.P.w(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && o60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == o60Var.z0 || pointerId == o60Var.A0) {
                            o60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && o60Var.B0) {
                        o60Var.s();
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
                ob0 ob0Var = (ob0) this.b;
                ob0Var.getClass();
                return org.telegram.ui.xt.q().s(motionEvent, ob0Var.getListView(), ob0Var.w, null, ob0Var.a);
            case 5:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    pc0Var.c0.a(true);
                }
                return true;
            default:
                return uy0.x((uy0) this.b, motionEvent);
        }
    }
}
