package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ya extends FrameLayout {
    public final /* synthetic */ fc E;
    public final kb a;
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
    public ya(fc fcVar, kb kbVar, FrameLayout frameLayout) {
        super(kbVar.getContext());
        this.E = fcVar;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = kbVar;
        GestureDetector gestureDetector = new GestureDetector(kbVar.getContext(), new ub(this, kbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(kbVar);
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
        kb kbVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = this.b;
            kbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y10)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        fc fcVar = this.E;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                kbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = kbVar.getTranslationX();
                System.currentTimeMillis();
                fc fcVar2 = kbVar.bulletin;
                this.d = fcVar2 == null || fcVar2.m;
                this.e = true;
                fcVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (kbVar.onClickListener != null) {
                    kbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > kbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * kbVar.getWidth();
                    float f10 = this.f;
                    kbVar.animate().translationX(signum).alpha(((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) < 0 && this.w) || ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.a0(this, signum, 1)).start();
                    this.e = false;
                    fcVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (kbVar.onClickListener != null) {
                        kbVar.setPressed(false);
                    }
                } else {
                    kbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && kbVar.isPressed() && (onClickListener = kbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(kbVar);
            }
            this.e = false;
            fcVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (kbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
