// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f0a extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0a(Context context, Integer num, byte b) {
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
