// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bh implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bh(int i, int[] iArr, k16 k16Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = iArr;
        this.d = k16Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ho1 ho1Var = (ho1) obj;
                for (int i2 : (int[]) obj2) {
                    if (i2 != 0) {
                        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
                    }
                }
                if (ho1Var != null) {
                    ho1Var.run();
                    break;
                }
                break;
            case 1:
                k16 k16Var = (k16) obj;
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i).cancelRequest(((int[]) obj2)[0], true);
                if (k16Var != null) {
                    k16Var.run();
                    break;
                }
                break;
            default:
                ((oc7) obj2).getConnectionsManager().cancelRequest(i, true);
                ((d) obj).setVisibleDialog(null);
                break;
        }
    }

    public /* synthetic */ bh(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
