package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class os implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ os(ys ysVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = ysVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ys ysVar = this.b;
                ysVar.x = this.c;
                Intent intent = new Intent(t0.b, (Class<?>) PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", ysVar.currentAccount);
                intent.setFlags(268763140);
                t0.b.startActivity(intent);
                t0.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                break;
            case 1:
                ys ysVar2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ysVar2.w.remove(arrayList.get(i7));
                }
                ls.e().k(ls.g4, new Object[0]);
                break;
            case 2:
                ys ysVar3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ysVar3.w.remove(arrayList2.get(i10));
                }
                ls.e().k(ls.g4, new Object[0]);
                break;
            case 3:
                ys ysVar4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ysVar4.w.remove(arrayList3.get(i11));
                }
                ls.e().k(ls.g4, new Object[0]);
                break;
            default:
                ys ysVar5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ysVar5.w.remove(arrayList4.get(i12));
                }
                ls.e().k(ls.g4, new Object[0]);
                break;
        }
    }
}
