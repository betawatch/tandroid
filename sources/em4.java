// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class em4 extends ImageButton {
    public final /* synthetic */ jm4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em4(jm4 jm4Var, Context context) {
        super(context);
        this.a = jm4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
