// default package

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class i11 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ i11(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(z8c.t0).cancelRequest(i, true);
                break;
            default:
                jb6 D0 = jb6.D0();
                if (i != 0) {
                    Iterator it = D0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        gb6 gb6Var = (gb6) ((Map.Entry) it.next()).getValue();
                        if (gb6Var.c == i) {
                            ConnectionsManager.getInstance(gb6Var.d).cancelRequest(i, true);
                            it.remove();
                            gb6Var.a();
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
