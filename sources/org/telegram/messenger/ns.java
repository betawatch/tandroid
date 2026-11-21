package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ns(xs xsVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = xsVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xs xsVar = this.b;
                xsVar.x = this.c;
                Intent intent = new Intent(t0.b, (Class<?>) PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", xsVar.currentAccount);
                intent.setFlags(268763140);
                t0.b.startActivity(intent);
                t0.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                break;
            case 1:
                xs xsVar2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    xsVar2.w.remove(arrayList.get(i7));
                }
                ks.e().k(ks.g4, new Object[0]);
                break;
            case 2:
                xs xsVar3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    xsVar3.w.remove(arrayList2.get(i10));
                }
                ks.e().k(ks.g4, new Object[0]);
                break;
            case 3:
                xs xsVar4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    xsVar4.w.remove(arrayList3.get(i11));
                }
                ks.e().k(ks.g4, new Object[0]);
                break;
            default:
                xs xsVar5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    xsVar5.w.remove(arrayList4.get(i12));
                }
                ks.e().k(ks.g4, new Object[0]);
                break;
        }
    }
}
