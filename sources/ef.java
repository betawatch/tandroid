// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ef implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ef(int i, int[] iArr, tg5 tg5Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = iArr;
        this.d = tg5Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hm1 hm1Var = (hm1) obj;
                for (int i2 : (int[]) obj2) {
                    if (i2 != 0) {
                        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
                    }
                }
                if (hm1Var != null) {
                    hm1Var.run();
                    break;
                }
                break;
            case 1:
                tg5 tg5Var = (tg5) obj;
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i).cancelRequest(((int[]) obj2)[0], true);
                if (tg5Var != null) {
                    tg5Var.run();
                    break;
                }
                break;
            default:
                ((uc7) obj2).getConnectionsManager().cancelRequest(i, true);
                ((e) obj).setVisibleDialog(null);
                break;
        }
    }

    public /* synthetic */ ef(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
