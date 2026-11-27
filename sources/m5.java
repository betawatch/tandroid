// default package

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m5 implements r69 {
    public final /* synthetic */ byte a;

    public /* synthetic */ m5(byte b) {
        this.a = b;
    }

    @Override // r69
    public final void e(int i, View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (view instanceof k20) {
                    ((k20) view).a();
                    break;
                }
                break;
            default:
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof d88) {
                    d88 d88Var = (d88) view;
                    d88Var.y.c(d88Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i, View view) {
    }
}
