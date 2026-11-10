package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ta extends FrameLayout {
    public final /* synthetic */ bc D;
    public final fb a;
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
    public ta(bc bcVar, fb fbVar, FrameLayout frameLayout) {
        super(fbVar.getContext());
        this.D = bcVar;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = fbVar;
        GestureDetector gestureDetector = new GestureDetector(fbVar.getContext(), new qb(this, fbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(fbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z9 = this.e;
        fb fbVar = this.a;
        if (!z9) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = this.b;
            fbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y10)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        bc bcVar = this.D;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                fbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = fbVar.getTranslationX();
                System.currentTimeMillis();
                bc bcVar2 = fbVar.bulletin;
                this.d = bcVar2 == null || bcVar2.m;
                this.e = true;
                bcVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (fbVar.onClickListener != null) {
                    fbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > fbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * fbVar.getWidth();
                    float f10 = this.f;
                    fbVar.animate().translationX(signum).alpha(((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) < 0 && this.w) || ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.b0(this, signum, 1)).start();
                    this.e = false;
                    bcVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (fbVar.onClickListener != null) {
                        fbVar.setPressed(false);
                    }
                } else {
                    fbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && fbVar.isPressed() && (onClickListener = fbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(fbVar);
            }
            this.e = false;
            bcVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (fbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
