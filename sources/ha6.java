// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ha6 extends View {
    public final Drawable a;
    public final ImageReceiver b;

    public ha6(pa6 pa6Var, Context context) {
        super(context);
        this.a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        pb0 pb0Var = new pb0((wjb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        pb0Var.q(pa6Var.getUserConfig().f());
        imageReceiver.U(pa6Var.getUserConfig().f(), pb0Var, null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = gl.L(62.0f);
        int L2 = gl.L(85.0f);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = gl.L(62.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.q0(L3);
        imageReceiver.i0(gl.L(6.0f), gl.L(6.0f), gl.L(50.0f), gl.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(85.0f), TLObject.FLAG_30));
    }
}
