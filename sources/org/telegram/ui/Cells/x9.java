package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.li;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x9 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ x9(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                y9 y9Var = (y9) this.b;
                int i3 = y9Var.Z5;
                boolean z10 = false;
                if (y9Var.nd == 2 && li.b0(i3).Q() != null) {
                    boolean I5 = y9Var.getMessageObject().I5(dh.n0.b(li.b0(i3).Q()), false);
                    y9Var.u3(y9Var.getMessageObject(), null, false, false, false, false);
                    y9Var.requestLayout();
                    dh.j0.b(false);
                    z10 = true;
                    if (I5) {
                        z9 z9Var = y9Var.od;
                        dh.j0.d(z9Var.x, null, z9Var.n[1], null, motionEvent.getX(), motionEvent.getY(), dh.n0.b(li.b0(i3).Q()), y9Var.Z5, 0);
                        dh.j0.f();
                    }
                    y9Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.g1(this, 1));
                }
                return z10;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                wg.e eVar = (wg.e) this.b;
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
                wg.f fVar = ((wg.e) this.b).a;
                fVar.d -= f10 * 0.5f;
                fVar.i -= f11 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i3 = this.a;
        View view = this.b;
        switch (i3) {
            case 1:
                wg.e eVar = (wg.e) view;
                wg.f fVar = eVar.a;
                if (Math.abs(fVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, eVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y9 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    eVar.b();
                    float f10 = fVar.d;
                    float f11 = fVar.i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    eVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    eVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    eVar.d.addUpdateListener(new gi.k6(this, f10, x10, f11, y9, 2));
                    eVar.d.addListener(new i81(this, 20));
                    eVar.d.start();
                    break;
                }
                break;
            case 2:
                zh.i iVar = (zh.i) view;
                if (!iVar.e.c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (iVar.e.f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= iVar.e.f.getRight() || iVar.e.f.getTop() >= motionEvent.getY() || motionEvent.getY() >= iVar.e.f.getBottom())) {
                    iVar.e.e(false);
                }
                break;
        }
        return super.onSingleTapUp(motionEvent);
    }
}
