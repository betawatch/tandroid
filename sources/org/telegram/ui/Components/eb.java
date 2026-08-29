package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class eb extends FrameLayout {
    public final rb a;
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
    public final /* synthetic */ mc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(mc mcVar, rb rbVar, FrameLayout frameLayout) {
        super(rbVar.getContext());
        this.y = mcVar;
        this.x = frameLayout;
        this.b = new Rect();
        this.a = rbVar;
        GestureDetector gestureDetector = new GestureDetector(rbVar.getContext(), new bc(this, rbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(rbVar);
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
        rb rbVar = this.a;
        if (!z10) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            Rect rect = this.b;
            rbVar.getHitRect(rect);
            if (!rect.contains((int) x4, (int) y8)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.x;
        mc mcVar = this.y;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                rbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = rbVar.getTranslationX();
                System.currentTimeMillis();
                mc mcVar2 = rbVar.bulletin;
                this.d = mcVar2 == null || mcVar2.m;
                this.e = true;
                mcVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (rbVar.onClickListener != null) {
                    rbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > rbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * rbVar.getWidth();
                    float f9 = this.f;
                    rbVar.animate().translationX(signum).alpha(((f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1)) < 0 && this.v) || ((f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1)) > 0 && this.w) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.e0(this, signum, 1)).start();
                    this.e = false;
                    mcVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (rbVar.onClickListener != null) {
                        rbVar.setPressed(false);
                    }
                } else {
                    rbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && rbVar.isPressed() && (onClickListener = rbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(rbVar);
            }
            this.e = false;
            mcVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (rbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
