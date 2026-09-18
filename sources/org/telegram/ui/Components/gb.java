package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gb extends FrameLayout {
    public final sb a;
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
    public final /* synthetic */ oc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(oc ocVar, sb sbVar, FrameLayout frameLayout) {
        super(sbVar.getContext());
        this.y = ocVar;
        this.x = frameLayout;
        this.b = new Rect();
        this.a = sbVar;
        GestureDetector gestureDetector = new GestureDetector(sbVar.getContext(), new dc(this, sbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(sbVar);
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
        sb sbVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            Rect rect = this.b;
            sbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y3)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.x;
        oc ocVar = this.y;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                sbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = sbVar.getTranslationX();
                System.currentTimeMillis();
                oc ocVar2 = sbVar.bulletin;
                this.d = ocVar2 == null || ocVar2.m;
                this.e = true;
                ocVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (sbVar.onClickListener != null) {
                    sbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > sbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * sbVar.getWidth();
                    float f7 = this.f;
                    sbVar.animate().translationX(signum).alpha(((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) < 0 && this.v) || ((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) > 0 && this.w) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.b0(this, signum, 1)).start();
                    this.e = false;
                    ocVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (sbVar.onClickListener != null) {
                        sbVar.setPressed(false);
                    }
                } else {
                    sbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && sbVar.isPressed() && (onClickListener = sbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(sbVar);
            }
            this.e = false;
            ocVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (sbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
