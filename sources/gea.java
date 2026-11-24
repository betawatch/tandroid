// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gea implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ gea(he[] heVarArr, int i, int i2, byte b) {
        this.a = b;
        this.b = heVarArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        final int i2 = this.c;
        he[] heVarArr = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                he heVar = heVarArr[0];
                if (heVar != null) {
                    heVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: iea
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (b2) {
                                case 0:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    break;
                            }
                        }
                    });
                    heVarArr[0].show();
                    break;
                }
                break;
            default:
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    final byte b3 = 1;
                    heVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: iea
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (b3) {
                                case 0:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    break;
                            }
                        }
                    });
                    heVarArr[0].show();
                    break;
                }
                break;
        }
    }
}
