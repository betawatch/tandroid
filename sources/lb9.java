// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lb9 extends a8 {
    public final int W;
    public long a0;
    public jb9 b0;

    public lb9(int i, ylb ylbVar, Context context) {
        super(0, ylbVar, context, false, false);
        this.W = i;
        setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        c(cmb.D8, cmb.E8);
        setIconColor(-1);
        this.c.setTranslationX(gm.L(2.0f));
        this.c.setScaleX(1.2f);
        this.c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new wd(this, (byte) 14));
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
