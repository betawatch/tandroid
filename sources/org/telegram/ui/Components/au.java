package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class au extends WebView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(KeyEvent.Callback callback, Context context, Context context2, int i9) {
        super(context);
        this.a = i9;
        this.c = callback;
        this.b = context2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) this.c;
                super.draw(canvas);
                if (pf0.l0.f == this && gt0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    gt0Var.j(canvas, getWidth(), getHeight());
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
                gu guVar = (gu) this.c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        guVar.setDisableScroll(false);
                    } else {
                        guVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
