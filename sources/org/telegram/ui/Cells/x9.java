package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.ui;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x9 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ x9(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                y9 y9Var = (y9) this.b;
                int i7 = y9Var.Z5;
                boolean z9 = false;
                if (y9Var.nd == 2 && ui.b0(i7).Q() != null) {
                    boolean I5 = y9Var.getMessageObject().I5(ch.o0.b(ui.b0(i7).Q()), false);
                    y9Var.v3(y9Var.getMessageObject(), null, false, false, false, false);
                    y9Var.requestLayout();
                    ch.k0.b(false);
                    z9 = true;
                    if (I5) {
                        z9 z9Var = y9Var.od;
                        ch.k0.d(z9Var.x, null, z9Var.n[1], null, motionEvent.getX(), motionEvent.getY(), ch.o0.b(ui.b0(i7).Q()), y9Var.Z5, 0);
                        ch.k0.f();
                    }
                    y9Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 1));
                }
                return z9;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                vg.e eVar = (vg.e) this.b;
                eVar.n = true;
                eVar.b();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.a) {
            case 1:
                vg.f fVar = ((vg.e) this.b).a;
                fVar.d -= f10 * 0.5f;
                fVar.i -= f11 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i7 = this.a;
        View view = this.b;
        switch (i7) {
            case 1:
                vg.e eVar = (vg.e) view;
                vg.f fVar = eVar.a;
                if (Math.abs(fVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, eVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y10 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    eVar.b();
                    float f10 = fVar.d;
                    float f11 = fVar.i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    eVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    eVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    eVar.d.addUpdateListener(new fi.j6(this, f10, x10, f11, y10, 2));
                    eVar.d.addListener(new r81(this, 20));
                    eVar.d.start();
                    break;
                }
                break;
            case 2:
                yh.k kVar = (yh.k) view;
                if (!kVar.e.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (kVar.e.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= kVar.e.f.getRight() || kVar.e.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= kVar.e.f.getBottom())) {
                    kVar.e.e(false);
                }
                break;
        }
        return super.onSingleTapUp(motionEvent);
    }
}
