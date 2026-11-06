package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class px implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ px(int i7, int i10, int[] iArr) {
        this.a = i10;
        this.b = i7;
        this.c = iArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.a;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                break;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                break;
        }
    }
}
