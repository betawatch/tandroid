// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d4a extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4a(Context context, int i, int i2) {
        super(context);
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return gl.L(260.0f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.a), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.b), View.MeasureSpec.getMode(i2)));
    }
}
