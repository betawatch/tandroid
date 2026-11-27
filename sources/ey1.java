// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
