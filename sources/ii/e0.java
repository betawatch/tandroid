package ii;

import android.content.DialogInterface;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e0(int i7, int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i7;
        this.c = i10;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u1[] u1VarArr = (u1[]) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                u1VarArr[0] = null;
                break;
            default:
                v10 v10Var = (v10) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                v10Var.a(null, "CANCELLED");
                break;
        }
    }
}
