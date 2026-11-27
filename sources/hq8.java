// default package

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
