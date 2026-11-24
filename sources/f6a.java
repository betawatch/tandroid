// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f6a extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6a(Context context, int i, int i2) {
        super(context);
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return gm.L(260.0f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.a), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.b), View.MeasureSpec.getMode(i2)));
    }
}
