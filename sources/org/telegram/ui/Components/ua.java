package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ua extends FrameLayout {
    public final /* synthetic */ cc D;
    public final gb a;
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
    public ua(cc ccVar, gb gbVar, FrameLayout frameLayout) {
        super(gbVar.getContext());
        this.D = ccVar;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = gbVar;
        GestureDetector gestureDetector = new GestureDetector(gbVar.getContext(), new rb(this, gbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(gbVar);
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
        gb gbVar = this.a;
        if (!z9) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = this.b;
            gbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y10)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        cc ccVar = this.D;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                gbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = gbVar.getTranslationX();
                System.currentTimeMillis();
                cc ccVar2 = gbVar.bulletin;
                this.d = ccVar2 == null || ccVar2.m;
                this.e = true;
                ccVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (gbVar.onClickListener != null) {
                    gbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > gbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * gbVar.getWidth();
                    float f10 = this.f;
                    gbVar.animate().translationX(signum).alpha(((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) < 0 && this.w) || ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.b0(this, signum, 1)).start();
                    this.e = false;
                    ccVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (gbVar.onClickListener != null) {
                        gbVar.setPressed(false);
                    }
                } else {
                    gbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && gbVar.isPressed() && (onClickListener = gbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(gbVar);
            }
            this.e = false;
            ccVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (gbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
