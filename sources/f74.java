// default package

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class f74 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ f74(int i, int[] iArr, byte b) {
        this.a = b;
        this.b = i;
        this.c = iArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int[] iArr = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.y;
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                break;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                break;
        }
    }
}
