package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.v8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z0 extends View {
    public final Drawable a;
    public final ImageReceiver b;

    public z0(a1 a1Var, Context context) {
        super(context);
        this.a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        v8 v8Var = new v8((h6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        v8Var.r(a1Var.getUserConfig().f());
        imageReceiver.i0(a1Var.getUserConfig().f(), v8Var, null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(62.0f);
        int L2 = org.telegram.messenger.g0.L(85.0f);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = org.telegram.messenger.g0.L(62.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.J0(L3);
        imageReceiver.y0(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(85.0f), TLObject.FLAG_30));
    }
}
