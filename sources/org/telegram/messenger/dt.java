package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class dt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ dt(pt ptVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ptVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pt ptVar = this.b;
                ptVar.x = this.c;
                Intent intent = new Intent(w0.b, (Class<?>) PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", ptVar.currentAccount);
                intent.setFlags(268763140);
                w0.b.startActivity(intent);
                w0.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                break;
            case 1:
                pt ptVar2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ptVar2.w.remove(arrayList.get(i10));
                }
                at.e().k(at.d4, new Object[0]);
                break;
            case 2:
                pt ptVar3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ptVar3.w.remove(arrayList2.get(i11));
                }
                at.e().k(at.d4, new Object[0]);
                break;
            case 3:
                pt ptVar4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ptVar4.w.remove(arrayList3.get(i12));
                }
                at.e().k(at.d4, new Object[0]);
                break;
            default:
                pt ptVar5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    ptVar5.w.remove(arrayList4.get(i13));
                }
                at.e().k(at.d4, new Object[0]);
                break;
        }
    }
}
