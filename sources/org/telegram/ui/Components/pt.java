package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pt extends WebView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt(KeyEvent.Callback callback, Context context, Context context2, int i3) {
        super(context);
        this.a = i3;
        this.c = callback;
        this.b = context2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.c;
                super.draw(canvas);
                if (ie0.q0.f == this && tp0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    tp0Var.j(canvas, getWidth(), getHeight());
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
                ut utVar = (ut) this.c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        utVar.E0 = false;
                    } else {
                        utVar.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
