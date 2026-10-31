package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ct implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ct(ot otVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = otVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ot otVar = this.b;
                otVar.x = this.c;
                Intent intent = new Intent(w0.b, (Class<?>) PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", otVar.currentAccount);
                intent.setFlags(268763140);
                w0.b.startActivity(intent);
                w0.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                break;
            case 1:
                ot otVar2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    otVar2.w.remove(arrayList.get(i10));
                }
                zs.e().k(zs.d4, new Object[0]);
                break;
            case 2:
                ot otVar3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    otVar3.w.remove(arrayList2.get(i11));
                }
                zs.e().k(zs.d4, new Object[0]);
                break;
            case 3:
                ot otVar4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    otVar4.w.remove(arrayList3.get(i12));
                }
                zs.e().k(zs.d4, new Object[0]);
                break;
            default:
                ot otVar5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    otVar5.w.remove(arrayList4.get(i13));
                }
                zs.e().k(zs.d4, new Object[0]);
                break;
        }
    }
}
