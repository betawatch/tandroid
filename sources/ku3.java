// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ku3 extends WebView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ KeyEvent.Callback c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku3(KeyEvent.Callback callback, Context context, Context context2, byte b) {
        super(context);
        this.a = b;
        this.c = callback;
        this.b = context2;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                x88 x88Var = (x88) this.c;
                if (parent != x88Var && x88Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    x88Var.j(canvas, getWidth(), getHeight());
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
                gl.u((Activity) this.b, true);
                super.onAttachedToWindow();
                break;
            default:
                gl.u(this.b, true);
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                gl.u((Activity) this.b, false);
                super.onDetachedFromWindow();
                break;
            default:
                gl.u(this.b, false);
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    int action = motionEvent.getAction();
                    ou3 ou3Var = (ou3) this.c;
                    if (action == 1) {
                        ou3Var.E0 = false;
                    } else {
                        ou3Var.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
