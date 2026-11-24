// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ff implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ff(int i, int[] iArr, hb5 hb5Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = iArr;
        this.d = hb5Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                vm1 vm1Var = (vm1) obj;
                for (int i2 : (int[]) obj2) {
                    if (i2 != 0) {
                        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
                    }
                }
                if (vm1Var != null) {
                    vm1Var.run();
                    break;
                }
                break;
            case 1:
                hb5 hb5Var = (hb5) obj;
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i).cancelRequest(((int[]) obj2)[0], true);
                if (hb5Var != null) {
                    hb5Var.run();
                    break;
                }
                break;
            default:
                ((na7) obj2).getConnectionsManager().cancelRequest(i, true);
                ((d) obj).setVisibleDialog(null);
                break;
        }
    }

    public /* synthetic */ ff(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
