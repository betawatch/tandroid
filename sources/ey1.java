// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ey1 extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ knc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey1(Context context, knc kncVar, byte b) {
        super(context);
        this.a = b;
        this.b = kncVar;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                this.b.setLanguagePillAlpha(f);
                break;
            default:
                super.setAlpha(f);
                this.b.setPillAlpha(f);
                break;
        }
    }
}
