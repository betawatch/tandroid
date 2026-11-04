package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ mx(int i3, int i10, int[] iArr) {
        this.a = i10;
        this.b = i3;
        this.c = iArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i3 = this.a;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                break;
            default:
                String str = LaunchActivity.E1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                break;
        }
    }
}
