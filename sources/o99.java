// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o99 extends a8 {
    public final int W;
    public long a0;
    public m99 b0;

    public o99(int i, wjb wjbVar, Context context) {
        super(0, wjbVar, context, false, false);
        this.W = i;
        setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        int i2 = bkb.D8;
        int i3 = bkb.E8;
        c(i2, i3);
        g(bkb.v0(i3, wjbVar), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(gl.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new wc(this, (byte) 15));
    }

    @Override // a8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = gl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
    }
}
