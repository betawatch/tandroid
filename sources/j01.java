// default package

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class j01 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ j01(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(yac.t0).cancelRequest(i, true);
                break;
            default:
                ob6 D0 = ob6.D0();
                if (i != 0) {
                    Iterator it = D0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        lb6 lb6Var = (lb6) ((Map.Entry) it.next()).getValue();
                        if (lb6Var.c == i) {
                            ConnectionsManager.getInstance(lb6Var.d).cancelRequest(i, true);
                            it.remove();
                            lb6Var.a();
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
