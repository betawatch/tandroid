package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i2.f0 f0Var;
        k80 k80Var;
        switch (this.a) {
            case 0:
                gl glVar = (gl) this.b;
                glVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                glVar.c0();
                return false;
            case 1:
                org.telegram.ui.ActionBar.n1 n1Var = ((ns) this.b).a;
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
            case 2:
                s60 s60Var = (s60) this.b;
                if (s60Var.P == null || s60Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = s60Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    s60Var.B0 = false;
                    s60Var.y0 = motionEvent.getPointerId(0);
                    s60Var.z0 = -1;
                    int i10 = s60Var.R.a;
                    if (i10 == 5) {
                        ImageView imageView = s60Var.I;
                        ki.t0 t0Var = s60Var.P;
                        if (t0Var != null && i10 == 5) {
                            boolean z10 = s60Var.h0;
                            s60Var.h0 = !z10;
                            ki.t0.t();
                            if (t0Var.W == 5 && (f0Var = t0Var.S) != null) {
                                f0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = s60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = s60Var.h0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.bi.s(imageView.animate(), s60Var.h0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.s0 s0Var = s60Var.R;
                        if (s0Var.a == 3 && !s0Var.e) {
                            s60Var.y0 = motionEvent.getPointerId(0);
                            s60Var.z0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            s60Var.w0 = hypot;
                            s60Var.B0 = hypot > 0.0f;
                            s60Var.x0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && s60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(s60Var.y0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(s60Var.z0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            s60Var.r();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / s60Var.w0;
                            ki.l0 l0Var = s60Var.S;
                            float f7 = l0Var == null ? 1.0f : l0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            s60Var.x0 = max;
                            s60Var.P.w(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && s60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == s60Var.y0 || pointerId == s60Var.z0) {
                            s60Var.r();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && s60Var.B0) {
                        s60Var.r();
                    }
                }
                return true;
            case 3:
                p80 p80Var = (p80) ((WeakReference) this.b).get();
                if (p80Var == null || (k80Var = p80Var.m) == null || !k80Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    p80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    p80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = p80Var.p0;
                    if (view2 != null) {
                        p80Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    p80Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = p80Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        p80Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    p80Var.o0 = null;
                }
                return true;
            case 4:
                pb0 pb0Var = (pb0) this.b;
                pb0Var.getClass();
                return org.telegram.ui.rt.q().s(motionEvent, pb0Var.getListView(), pb0Var.w, null, pb0Var.a);
            case 5:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    pc0Var.c0.a(true);
                }
                return true;
            default:
                return xy0.x((xy0) this.b, motionEvent);
        }
    }
}
