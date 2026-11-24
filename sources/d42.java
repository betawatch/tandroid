// default package

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d42 implements vs2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ d42(byte b) {
        this.a = b;
    }

    @Override // vs2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof o48) {
                    o48 o48Var = (o48) view;
                    o48Var.c(o48Var.getPhotoEntry() != null && o48Var.getPhotoEntry().M, Float.valueOf(250.0f));
                    o48Var.setHighQuality(o48Var.getPhotoEntry() != null && o48Var.getPhotoEntry().c());
                    o48Var.f(o48Var.getPhotoEntry() != null ? o48Var.getPhotoEntry().N : 0L, ChatAttachAlertPhotoLayout.t1.size() > 1);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof us9) {
                    ((us9) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof us9) {
                    ((us9) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
