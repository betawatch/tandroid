package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q6 extends View {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.a = starGift;
        this.b = f10;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.a == null) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.b), TLObject.FLAG_30), i10);
        }
    }
}
