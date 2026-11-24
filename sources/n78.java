// default package

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n78 extends u0b {
    public final /* synthetic */ o78 q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n78(o78 o78Var, Context context, Object obj, TLObject tLObject, wjb wjbVar) {
        super(context, obj, tLObject, wjbVar);
        this.q2 = o78Var;
    }

    @Override // u0b, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.q2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
