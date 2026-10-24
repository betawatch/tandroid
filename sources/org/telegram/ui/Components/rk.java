package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        i2.h0 h0Var;
        e80 e80Var;
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
                m60 m60Var = (m60) this.b;
                if (m60Var.P == null || m60Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = m60Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    m60Var.B0 = false;
                    m60Var.z0 = motionEvent.getPointerId(0);
                    m60Var.A0 = -1;
                    int i10 = m60Var.R.a;
                    if (i10 == 5) {
                        ImageView imageView = m60Var.I;
                        si.u0 u0Var = m60Var.P;
                        if (u0Var != null && i10 == 5) {
                            boolean z10 = m60Var.i0;
                            m60Var.i0 = !z10;
                            si.u0.t();
                            if (u0Var.W == 5 && (h0Var = u0Var.S) != null) {
                                h0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            VideoEditedInfo videoEditedInfo = m60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = m60Var.i0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.sl.s(imageView.animate(), m60Var.i0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        si.t0 t0Var = m60Var.R;
                        if (t0Var.a == 3 && !t0Var.e) {
                            m60Var.z0 = motionEvent.getPointerId(0);
                            m60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            m60Var.x0 = hypot;
                            m60Var.B0 = hypot > 0.0f;
                            m60Var.y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && m60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(m60Var.z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(m60Var.A0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            m60Var.s();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / m60Var.x0;
                            si.l0 l0Var = m60Var.S;
                            float f7 = l0Var == null ? 1.0f : l0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            m60Var.y0 = max;
                            m60Var.P.w(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && m60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == m60Var.z0 || pointerId == m60Var.A0) {
                            m60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && m60Var.B0) {
                        m60Var.s();
                    }
                }
                return true;
            case 3:
                j80 j80Var = (j80) ((WeakReference) this.b).get();
                if (j80Var == null || (e80Var = j80Var.m) == null || !e80Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    j80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    j80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = j80Var.p0;
                    if (view2 != null) {
                        j80Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    j80Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = j80Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        j80Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    j80Var.o0 = null;
                }
                return true;
            case 4:
                jb0 jb0Var = (jb0) this.b;
                jb0Var.getClass();
                return org.telegram.ui.ht.o().q(motionEvent, jb0Var.getListView(), jb0Var.w, null, jb0Var.a);
            case 5:
                lc0 lc0Var = (lc0) this.b;
                lc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    lc0Var.c0.a(true);
                }
                return true;
            default:
                return ty0.y((ty0) this.b, motionEvent);
        }
    }
}
