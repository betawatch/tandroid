package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class za extends FrameLayout {
    public final /* synthetic */ gc E;
    public final lb a;
    public final Rect b;
    public final GestureDetector c;
    public boolean d;
    public boolean e;
    public float f;
    public float h;
    public float n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public final /* synthetic */ FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(gc gcVar, lb lbVar, FrameLayout frameLayout) {
        super(lbVar.getContext());
        this.E = gcVar;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = lbVar;
        GestureDetector gestureDetector = new GestureDetector(lbVar.getContext(), new vb(this, lbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(lbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z10 = this.e;
        lb lbVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = this.b;
            lbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y10)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        gc gcVar = this.E;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                lbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = lbVar.getTranslationX();
                System.currentTimeMillis();
                gc gcVar2 = lbVar.bulletin;
                this.d = gcVar2 == null || gcVar2.m;
                this.e = true;
                gcVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (lbVar.onClickListener != null) {
                    lbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > lbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * lbVar.getWidth();
                    float f10 = this.f;
                    lbVar.animate().translationX(signum).alpha(((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) < 0 && this.w) || ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.a0(this, signum, 1)).start();
                    this.e = false;
                    gcVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (lbVar.onClickListener != null) {
                        lbVar.setPressed(false);
                    }
                } else {
                    lbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && lbVar.isPressed() && (onClickListener = lbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(lbVar);
            }
            this.e = false;
            gcVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (lbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
