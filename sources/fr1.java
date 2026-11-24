// default package

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fr1 extends FrameLayout {
    public final /* synthetic */ yv1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr1(yv1 yv1Var, Activity activity) {
        super(activity);
        this.a = yv1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.N5(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i2), gm.L(300.0f));
        if (min == 0) {
            min = gm.L(300.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31));
    }
}
