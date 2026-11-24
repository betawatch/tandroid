// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e1a extends View {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1a(Context context, TL_stars.StarGift starGift, float f) {
        super(context);
        this.a = starGift;
        this.b = f;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.a == null) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.b), TLObject.FLAG_30), i2);
        }
    }
}
