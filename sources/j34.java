// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j34 extends FrameLayout {
    public int a;

    public j34(Context context) {
        this(context, 8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30));
    }

    public void setHeight(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    public j34(Context context, int i) {
        super(context);
        this.a = i;
    }
}
