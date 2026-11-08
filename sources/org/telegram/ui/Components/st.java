package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class st extends WebView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.a = i7;
        this.c = callback;
        this.b = context2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) this.c;
                if (parent != cq0Var && cq0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    cq0Var.j(canvas, getWidth(), getHeight());
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.u(this.b, true);
                super.onAttachedToWindow();
                break;
            default:
                org.telegram.messenger.g0.u(this.b, true);
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.u(this.b, false);
                super.onDetachedFromWindow();
                break;
            default:
                org.telegram.messenger.g0.u(this.b, false);
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                wt wtVar = (wt) this.c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        wtVar.D0 = false;
                    } else {
                        wtVar.D0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
