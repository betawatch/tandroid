// default package

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l5 implements f59 {
    public final /* synthetic */ byte a;

    public /* synthetic */ l5(byte b) {
        this.a = b;
    }

    @Override // f59
    public final void g(int i, View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (view instanceof j30) {
                    ((j30) view).a();
                    break;
                }
                break;
            default:
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof q68) {
                    q68 q68Var = (q68) view;
                    q68Var.y.c(q68Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i, View view) {
    }
}
