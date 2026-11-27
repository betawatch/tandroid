// default package

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hq8 extends Paint {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq8(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.setAlpha(i);
                ((ProfileActivity) obj).fragmentView.invalidate();
                break;
            default:
                super.setAlpha(i);
                lo9 lo9Var = (lo9) obj;
                lo9Var.a.setAlpha(Math.round(i * 0.2f));
                lo9Var.invalidate();
                break;
        }
    }
}
