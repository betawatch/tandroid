// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fu0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fu0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(((ku0) obj).a).cancelRequest(i, true);
                break;
            case 1:
                ((uf1) obj).h0(i);
                break;
            case 2:
                ((iv1) obj).a.getConnectionsManager().cancelRequest(i, true);
                break;
            case 3:
                int i2 = ChatActivityEnterView.z7;
                ((ChatActivityEnterView) obj).F3.getConnectionsManager().cancelRequest(i, true);
                break;
            case 4:
                ba2 ba2Var = (ba2) obj;
                ba2Var.O0 = false;
                ba2Var.b = null;
                ba2Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((e24) ((b24) obj).c.b).G.d1).cancelRequest(i, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((g95) obj).n1.a).cancelRequest(i, true);
                break;
            case 7:
                ((pc6) obj).getConnectionsManager().cancelRequest(i, true);
                break;
            case 8:
                ((dw9) obj).getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                ((zob) obj).d0(i);
                break;
        }
    }
}
