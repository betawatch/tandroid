package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lb extends FrameLayout {
    public final xb a;
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
    public final /* synthetic */ tc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(tc tcVar, xb xbVar, FrameLayout frameLayout) {
        super(xbVar.getContext());
        this.y = tcVar;
        this.x = frameLayout;
        this.b = new Rect();
        this.a = xbVar;
        GestureDetector gestureDetector = new GestureDetector(xbVar.getContext(), new ic(this, xbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(xbVar);
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
        xb xbVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            Rect rect = this.b;
            xbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y3)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.x;
        tc tcVar = this.y;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                xbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = xbVar.getTranslationX();
                System.currentTimeMillis();
                tc tcVar2 = xbVar.bulletin;
                this.d = tcVar2 == null || tcVar2.m;
                this.e = true;
                tcVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (xbVar.onClickListener != null) {
                    xbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > xbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * xbVar.getWidth();
                    float f7 = this.f;
                    xbVar.animate().translationX(signum).alpha(((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) < 0 && this.v) || ((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) > 0 && this.w) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c0(this, signum, 1)).start();
                    this.e = false;
                    tcVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (xbVar.onClickListener != null) {
                        xbVar.setPressed(false);
                    }
                } else {
                    xbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && xbVar.isPressed() && (onClickListener = xbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(xbVar);
            }
            this.e = false;
            tcVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (xbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
