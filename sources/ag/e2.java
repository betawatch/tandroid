package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e2 extends View {
    public final Drawable a;
    public final ImageReceiver b;

    public e2(f2 f2Var, Context context) {
        super(context);
        this.a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        r8 r8Var = new r8((p6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        r8Var.r(f2Var.getUserConfig().f());
        imageReceiver.i0(f2Var.getUserConfig().f(), r8Var, null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(62.0f);
        int L2 = org.telegram.messenger.i0.L(85.0f);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = org.telegram.messenger.i0.L(62.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.J0(L3);
        imageReceiver.y0(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(85.0f), TLObject.FLAG_30));
    }
}
