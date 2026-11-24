// default package

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l5 implements c39 {
    public final /* synthetic */ byte a;

    public /* synthetic */ l5(byte b) {
        this.a = b;
    }

    @Override // c39
    public final void d(int i, View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (view instanceof j20) {
                    ((j20) view).a();
                    break;
                }
                break;
            default:
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof o48) {
                    o48 o48Var = (o48) view;
                    o48Var.y.c(o48Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i, View view) {
    }
}
