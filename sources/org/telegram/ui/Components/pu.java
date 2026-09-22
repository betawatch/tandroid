package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pu extends WebView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.a = i10;
        this.c = callback;
        this.b = context2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.c;
                super.draw(canvas);
                if (rg0.p0.f == this && iu0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    iu0Var.j(canvas, getWidth(), getHeight());
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
                vu vuVar = (vu) this.c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        vuVar.setDisableScroll(false);
                    } else {
                        vuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
