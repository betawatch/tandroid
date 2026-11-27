// default package

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fb8 extends s4b {
    public final /* synthetic */ gb8 q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb8(gb8 gb8Var, Context context, Object obj, TLObject tLObject, vnb vnbVar) {
        super(context, obj, tLObject, vnbVar);
        this.q2 = gb8Var;
    }

    @Override // s4b, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.q2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
