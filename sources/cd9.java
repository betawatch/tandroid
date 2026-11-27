// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cd9 extends b8 {
    public final int W;
    public long a0;
    public ad9 b0;

    public cd9(int i, vnb vnbVar, Context context) {
        super(0, vnbVar, context, false, false);
        this.W = i;
        setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        int i2 = aob.E8;
        int i3 = aob.F8;
        c(i2, i3);
        g(aob.v0(i3, vnbVar), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(hl.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new xc(this, (byte) 16));
    }

    @Override // b8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = hl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
    }
}
