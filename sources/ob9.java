// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ob9 extends a8 {
    public final int W;
    public long a0;
    public mb9 b0;

    public ob9(int i, ylb ylbVar, Context context) {
        super(0, ylbVar, context, false, false);
        this.W = i;
        setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        int i2 = cmb.D8;
        int i3 = cmb.E8;
        c(i2, i3);
        g(cmb.v0(i3, ylbVar), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(gm.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new wd(this, (byte) 15));
    }

    @Override // a8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = gm.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
    }
}
