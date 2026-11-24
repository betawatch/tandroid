// default package

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o84 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ o84(byte b, int i, int[] iArr) {
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
