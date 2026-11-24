// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fca implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ fca(hd[] hdVarArr, int i, int i2, byte b) {
        this.a = b;
        this.b = hdVarArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        final int i2 = this.c;
        hd[] hdVarArr = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hca
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
                    hdVarArr[0].show();
                    break;
                }
                break;
            default:
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    final byte b3 = 1;
                    hdVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hca
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
                    hdVarArr[0].show();
                    break;
                }
                break;
        }
    }
}
