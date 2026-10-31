package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oa extends FrameLayout {
    public final /* synthetic */ wb D;
    public final bb a;
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
    public oa(wb wbVar, bb bbVar, FrameLayout frameLayout) {
        super(bbVar.getContext());
        this.D = wbVar;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = bbVar;
        GestureDetector gestureDetector = new GestureDetector(bbVar.getContext(), new lb(this, bbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(bbVar);
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
        bb bbVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            Rect rect = this.b;
            bbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y3)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        wb wbVar = this.D;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                bbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = bbVar.getTranslationX();
                System.currentTimeMillis();
                wb wbVar2 = bbVar.bulletin;
                this.d = wbVar2 == null || wbVar2.m;
                this.e = true;
                wbVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (bbVar.onClickListener != null) {
                    bbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > bbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * bbVar.getWidth();
                    float f7 = this.f;
                    bbVar.animate().translationX(signum).alpha(((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) < 0 && this.w) || ((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(org.telegram.messenger.i0.G).withEndAction(new org.telegram.ui.a0(this, signum, 1)).start();
                    this.e = false;
                    wbVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (bbVar.onClickListener != null) {
                        bbVar.setPressed(false);
                    }
                } else {
                    bbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && bbVar.isPressed() && (onClickListener = bbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(bbVar);
            }
            this.e = false;
            wbVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (bbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
