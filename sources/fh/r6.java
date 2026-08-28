package fh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r6 extends View {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.a = starGift;
        this.b = f10;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.a == null) {
            super.onMeasure(i9, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i9) * this.b), TLObject.FLAG_30), i10);
        }
    }
}
