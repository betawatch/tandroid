package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        f80 f80Var;
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
                n60 n60Var = (n60) this.b;
                if (n60Var.P == null || n60Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = n60Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    n60Var.B0 = false;
                    n60Var.z0 = motionEvent.getPointerId(0);
                    n60Var.A0 = -1;
                    int i10 = n60Var.R.a;
                    if (i10 == 5) {
                        ImageView imageView = n60Var.I;
                        vi.s0 s0Var = n60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z10 = n60Var.i0;
                            n60Var.i0 = !z10;
                            vi.s0.t();
                            if (s0Var.W == 5 && (j0Var = s0Var.S) != null) {
                                j0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = n60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = n60Var.i0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.vh.p(imageView.animate(), n60Var.i0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        vi.r0 r0Var = n60Var.R;
                        if (r0Var.a == 3 && !r0Var.e) {
                            n60Var.z0 = motionEvent.getPointerId(0);
                            n60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            n60Var.x0 = hypot;
                            n60Var.B0 = hypot > 0.0f;
                            n60Var.y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && n60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(n60Var.z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(n60Var.A0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            n60Var.s();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / n60Var.x0;
                            vi.k0 k0Var = n60Var.S;
                            float f7 = k0Var == null ? 1.0f : k0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            n60Var.y0 = max;
                            n60Var.P.w(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && n60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == n60Var.z0 || pointerId == n60Var.A0) {
                            n60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && n60Var.B0) {
                        n60Var.s();
                    }
                }
                return true;
            case 3:
                k80 k80Var = (k80) ((WeakReference) this.b).get();
                if (k80Var == null || (f80Var = k80Var.m) == null || !f80Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    k80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    k80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = k80Var.p0;
                    if (view2 != null) {
                        k80Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    k80Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = k80Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        k80Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    k80Var.o0 = null;
                }
                return true;
            case 4:
                gb0 gb0Var = (gb0) this.b;
                gb0Var.getClass();
                return org.telegram.ui.ft.o().q(motionEvent, gb0Var.getListView(), gb0Var.w, null, gb0Var.a);
            case 5:
                hc0 hc0Var = (hc0) this.b;
                hc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    hc0Var.c0.a(true);
                }
                return true;
            default:
                return cz0.x((cz0) this.b, motionEvent);
        }
    }
}
