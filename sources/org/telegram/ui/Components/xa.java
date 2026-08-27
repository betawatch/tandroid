package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xa extends FrameLayout {
    public final jb a;
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
    public final /* synthetic */ ec y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(ec ecVar, jb jbVar, FrameLayout frameLayout) {
        super(jbVar.getContext());
        this.y = ecVar;
        this.x = frameLayout;
        this.b = new Rect();
        this.a = jbVar;
        GestureDetector gestureDetector = new GestureDetector(jbVar.getContext(), new tb(this, jbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(jbVar);
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
        jb jbVar = this.a;
        if (!z10) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = this.b;
            jbVar.getHitRect(rect);
            if (!rect.contains((int) x8, (int) y10)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.x;
        ec ecVar = this.y;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                jbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = jbVar.getTranslationX();
                System.currentTimeMillis();
                ec ecVar2 = jbVar.bulletin;
                this.d = ecVar2 == null || ecVar2.m;
                this.e = true;
                ecVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (jbVar.onClickListener != null) {
                    jbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > jbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * jbVar.getWidth();
                    float f10 = this.f;
                    jbVar.animate().translationX(signum).alpha(((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) < 0 && this.v) || ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 && this.w) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.e0(this, signum, 1)).start();
                    this.e = false;
                    ecVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (jbVar.onClickListener != null) {
                        jbVar.setPressed(false);
                    }
                } else {
                    jbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && jbVar.isPressed() && (onClickListener = jbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(jbVar);
            }
            this.e = false;
            ecVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (jbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
