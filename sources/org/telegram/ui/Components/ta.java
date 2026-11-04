package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ta extends FrameLayout {
    public final /* synthetic */ ac E;
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
    public ta(ac acVar, fb fbVar, FrameLayout frameLayout) {
        super(fbVar.getContext());
        this.E = acVar;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = fbVar;
        GestureDetector gestureDetector = new GestureDetector(fbVar.getContext(), new pb(this, fbVar));
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
        boolean z10 = this.e;
        fb fbVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            Rect rect = this.b;
            fbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y9)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        ac acVar = this.E;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                fbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = fbVar.getTranslationX();
                System.currentTimeMillis();
                ac acVar2 = fbVar.bulletin;
                this.d = acVar2 == null || acVar2.m;
                this.e = true;
                acVar.i(false);
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
                    fbVar.animate().translationX(signum).alpha(((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) < 0 && this.w) || ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.c0(this, signum, 1)).start();
                    this.e = false;
                    acVar.i(true);
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
            acVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (fbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
