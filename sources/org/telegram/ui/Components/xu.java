package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xu extends WebView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.a = i10;
        this.c = callback;
        this.b = context2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                org.telegram.ui.xt0 xt0Var = (org.telegram.ui.xt0) this.c;
                super.draw(canvas);
                if (dh0.p0.f == this && xt0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    xt0Var.j(canvas, getWidth(), getHeight());
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
                AndroidUtilities.checkAndroidTheme(this.b, true);
                super.onAttachedToWindow();
                break;
            default:
                AndroidUtilities.checkAndroidTheme(this.b, true);
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.b, false);
                super.onDetachedFromWindow();
                break;
            default:
                AndroidUtilities.checkAndroidTheme(this.b, false);
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                dv dvVar = (dv) this.c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        dvVar.setDisableScroll(false);
                    } else {
                        dvVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
