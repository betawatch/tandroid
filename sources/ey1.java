// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
