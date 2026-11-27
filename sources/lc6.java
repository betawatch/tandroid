// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lc6 extends View {
    public final Drawable a;
    public final ImageReceiver b;

    public lc6(tc6 tc6Var, Context context) {
        super(context);
        this.a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        rb0 rb0Var = new rb0((vnb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        rb0Var.q(tc6Var.getUserConfig().f());
        imageReceiver.U(tc6Var.getUserConfig().f(), rb0Var, null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = hl.L(62.0f);
        int L2 = hl.L(85.0f);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = hl.L(62.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.q0(L3);
        imageReceiver.i0(hl.L(6.0f), hl.L(6.0f), hl.L(50.0f), hl.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(85.0f), TLObject.FLAG_30));
    }
}
