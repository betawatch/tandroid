package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hb extends FrameLayout {
    public final tb a;
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
    public final /* synthetic */ pc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(pc pcVar, tb tbVar, FrameLayout frameLayout) {
        super(tbVar.getContext());
        this.y = pcVar;
        this.x = frameLayout;
        this.b = new Rect();
        this.a = tbVar;
        GestureDetector gestureDetector = new GestureDetector(tbVar.getContext(), new ec(this, tbVar));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(tbVar);
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
        tb tbVar = this.a;
        if (!z10) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            Rect rect = this.b;
            tbVar.getHitRect(rect);
            if (!rect.contains((int) x10, (int) y3)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.x;
        pc pcVar = this.y;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                tbVar.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = tbVar.getTranslationX();
                System.currentTimeMillis();
                pc pcVar2 = tbVar.bulletin;
                this.d = pcVar2 == null || pcVar2.m;
                this.e = true;
                pcVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (tbVar.onClickListener != null) {
                    tbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > tbVar.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * tbVar.getWidth();
                    float f7 = this.f;
                    tbVar.animate().translationX(signum).alpha(((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) < 0 && this.v) || ((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) > 0 && this.w) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c0(this, signum, 1)).start();
                    this.e = false;
                    pcVar.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (tbVar.onClickListener != null) {
                        tbVar.setPressed(false);
                    }
                } else {
                    tbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && tbVar.isPressed() && (onClickListener = tbVar.onClickListener) != null && !this.r) {
                onClickListener.onClick(tbVar);
            }
            this.e = false;
            pcVar.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (tbVar.onClickListener != null) {
            }
        }
        return true;
    }
}
