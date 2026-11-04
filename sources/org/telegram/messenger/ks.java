package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ks implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ks(us usVar, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = usVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                us usVar = this.b;
                usVar.x = this.c;
                Intent intent = new Intent(t0.b, (Class<?>) PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", usVar.currentAccount);
                intent.setFlags(268763140);
                t0.b.startActivity(intent);
                t0.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                break;
            case 1:
                us usVar2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    usVar2.w.remove(arrayList.get(i3));
                }
                hs.e().k(hs.d4, new Object[0]);
                break;
            case 2:
                us usVar3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    usVar3.w.remove(arrayList2.get(i10));
                }
                hs.e().k(hs.d4, new Object[0]);
                break;
            case 3:
                us usVar4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    usVar4.w.remove(arrayList3.get(i11));
                }
                hs.e().k(hs.d4, new Object[0]);
                break;
            default:
                us usVar5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    usVar5.w.remove(arrayList4.get(i12));
                }
                hs.e().k(hs.d4, new Object[0]);
                break;
        }
    }
}
