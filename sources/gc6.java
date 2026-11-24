// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gc6 extends View {
    public final Drawable a;
    public final ImageReceiver b;

    public gc6(oc6 oc6Var, Context context) {
        super(context);
        this.a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        pc0 pc0Var = new pc0((ylb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        pc0Var.q(oc6Var.getUserConfig().f());
        imageReceiver.U(oc6Var.getUserConfig().f(), pc0Var, null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = gm.L(62.0f);
        int L2 = gm.L(85.0f);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = gm.L(62.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.q0(L3);
        imageReceiver.i0(gm.L(6.0f), gm.L(6.0f), gm.L(50.0f), gm.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(85.0f), TLObject.FLAG_30));
    }
}
