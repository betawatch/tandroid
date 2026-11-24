// default package

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class a01 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ a01(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(y6c.t0).cancelRequest(i, true);
                break;
            default:
                k96 D0 = k96.D0();
                if (i != 0) {
                    Iterator it = D0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        h96 h96Var = (h96) ((Map.Entry) it.next()).getValue();
                        if (h96Var.c == i) {
                            ConnectionsManager.getInstance(h96Var.d).cancelRequest(i, true);
                            it.remove();
                            h96Var.a();
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
