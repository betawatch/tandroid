package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class qs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ qs(at atVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = atVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                at atVar = this.b;
                atVar.x = this.c;
                Intent intent = new Intent(t0.b, (Class<?>) PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", atVar.currentAccount);
                intent.setFlags(268763140);
                t0.b.startActivity(intent);
                t0.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                break;
            case 1:
                at atVar2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    atVar2.w.remove(arrayList.get(i7));
                }
                ns.e().k(ns.d4, new Object[0]);
                break;
            case 2:
                at atVar3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    atVar3.w.remove(arrayList2.get(i10));
                }
                ns.e().k(ns.d4, new Object[0]);
                break;
            case 3:
                at atVar4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    atVar4.w.remove(arrayList3.get(i11));
                }
                ns.e().k(ns.d4, new Object[0]);
                break;
            default:
                at atVar5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    atVar5.w.remove(arrayList4.get(i12));
                }
                ns.e().k(ns.d4, new Object[0]);
                break;
        }
    }
}
