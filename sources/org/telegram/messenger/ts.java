package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ts implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ts(dt dtVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = dtVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dt dtVar = this.b;
                dtVar.x = this.c;
                Intent intent = new Intent(t0.b, (Class<?>) PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", dtVar.currentAccount);
                intent.setFlags(268763140);
                t0.b.startActivity(intent);
                t0.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                break;
            case 1:
                dt dtVar2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    dtVar2.w.remove(arrayList.get(i7));
                }
                qs.e().k(qs.d4, new Object[0]);
                break;
            case 2:
                dt dtVar3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    dtVar3.w.remove(arrayList2.get(i10));
                }
                qs.e().k(qs.d4, new Object[0]);
                break;
            case 3:
                dt dtVar4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    dtVar4.w.remove(arrayList3.get(i11));
                }
                qs.e().k(qs.d4, new Object[0]);
                break;
            default:
                dt dtVar5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    dtVar5.w.remove(arrayList4.get(i12));
                }
                qs.e().k(qs.d4, new Object[0]);
                break;
        }
    }
}
