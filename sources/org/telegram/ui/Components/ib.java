package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ib extends FrameLayout {
    public final ub a;
    public final Rect b;
    public final GestureDetector c;
    public boolean d;
    public boolean e;
    public float f;
    public float h;
    public float n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public final /* synthetic */ FrameLayout x;
    public final /* synthetic */ qc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.y = qcVar;
        this.x = frameLayout;
        this.b = new Rect();
        this.a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z10 = this.e;
        ub ubVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            Rect rect = this.b;
            ubVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y3)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.x;
        qc qcVar = this.y;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                ubVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = ubVar.getTranslationX();
                System.currentTimeMillis();
                qc qcVar2 = ubVar.bulletin;
                this.d = qcVar2 == null || qcVar2.m;
                this.e = true;
                qcVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (ubVar.onClickListener != null) {
                    ubVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > ubVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * ubVar.getWidth();
                    float f7 = this.f;
                    ubVar.animate().translationX(signum).alpha(((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) < 0 && this.v) || ((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) > 0 && this.w) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.b0(this, signum, 1)).start();
                    this.e = false;
                    qcVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (ubVar.onClickListener != null) {
                        ubVar.setPressed(false);
                    }
                } else {
                    ubVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && ubVar.isPressed() && (onClickListener = ubVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(ubVar);
            }
            this.e = false;
            qcVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (ubVar.onClickListener != null) {
            }
        }
        return true;
    }
}
