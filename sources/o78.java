// default package

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o78 extends u0b {
    public final /* synthetic */ p78 q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o78(p78 p78Var, Context context, Object obj, TLObject tLObject, wjb wjbVar) {
        super(context, obj, tLObject, wjbVar);
        this.q2 = p78Var;
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
