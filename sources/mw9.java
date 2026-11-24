// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mw9 extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw9(Context context, Integer num, byte b) {
        super(context);
        this.a = b;
        this.b = num;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        Integer num = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                if (num != null) {
                    setPivotX(num.intValue());
                    break;
                }
                break;
            default:
                super.onMeasure(i, i2);
                if (num != null) {
                    setPivotX(num.intValue());
                    break;
                }
                break;
        }
    }
}
