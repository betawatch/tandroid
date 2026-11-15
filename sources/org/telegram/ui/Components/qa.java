package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qa extends FrameLayout {
    public final /* synthetic */ xb E;
    public final cb a;
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
    public qa(xb xbVar, cb cbVar, FrameLayout frameLayout) {
        super(cbVar.getContext());
        this.E = xbVar;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = cbVar;
        GestureDetector gestureDetector = new GestureDetector(cbVar.getContext(), new mb(this, cbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(cbVar);
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
        cb cbVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = this.b;
            cbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y10)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        xb xbVar = this.E;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                cbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = cbVar.getTranslationX();
                System.currentTimeMillis();
                xb xbVar2 = cbVar.bulletin;
                this.d = xbVar2 == null || xbVar2.m;
                this.e = true;
                xbVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (cbVar.onClickListener != null) {
                    cbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > cbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * cbVar.getWidth();
                    float f10 = this.f;
                    cbVar.animate().translationX(signum).alpha(((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) < 0 && this.w) || ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.a0(this, signum, 1)).start();
                    this.e = false;
                    xbVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (cbVar.onClickListener != null) {
                        cbVar.setPressed(false);
                    }
                } else {
                    cbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && cbVar.isPressed() && (onClickListener = cbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(cbVar);
            }
            this.e = false;
            xbVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (cbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
