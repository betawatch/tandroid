// default package

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hf1 extends rd2 {
    public final /* synthetic */ byte s;
    public final /* synthetic */ e w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(e eVar, Context context, byte b) {
        super(context);
        this.s = b;
        this.w = eVar;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if1 if1Var;
        byte b = this.s;
        e eVar = this.w;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (if1Var = ((wf1) eVar).G0) != null) {
                    if1Var.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((zu1) eVar).M5(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if1 if1Var;
        byte b = this.s;
        e eVar = this.w;
        switch (b) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (if1Var = ((wf1) eVar).G0) != null) {
                    if1Var.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((zu1) eVar).M5(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
