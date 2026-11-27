// default package

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
