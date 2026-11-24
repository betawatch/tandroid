// default package

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gg1 extends me2 {
    public final /* synthetic */ byte s;
    public final /* synthetic */ d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(d dVar, Context context, byte b) {
        super(context);
        this.s = b;
        this.w = dVar;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hg1 hg1Var;
        byte b = this.s;
        d dVar = this.w;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (hg1Var = ((vg1) dVar).G0) != null) {
                    hg1Var.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((yv1) dVar).N5(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        hg1 hg1Var;
        byte b = this.s;
        d dVar = this.w;
        switch (b) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (hg1Var = ((vg1) dVar).G0) != null) {
                    hg1Var.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((yv1) dVar).N5(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
