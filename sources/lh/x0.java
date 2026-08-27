package lh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ x0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                a1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z7 a2 = ((z0) arrayList.get(i10)).a();
                    if ((a2.v() || ((file = a2.L) != null && file.exists())) && currentTimeMillis - a2.d <= 604800000) {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.b));
                    } else {
                        arrayList3.add(a2);
                    }
                }
                a1Var.b(arrayList3);
                a1Var.f = false;
                a1Var.e = true;
                jh.s6 storiesController = MessagesController.getInstance(a1Var.a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    jh.r6 r6Var = new jh.r6(storiesController, (z7) obj2);
                    storiesController.d(r6Var.F, r6Var, storiesController.b, false);
                }
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            default:
                a1 a1Var2 = this.b;
                a1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    z7 a3 = ((z0) arrayList.get(i12)).a();
                    if ((a3.v() || ((file2 = a3.L) != null && file2.exists())) && (!a3.g ? currentTimeMillis2 - a3.d <= 604800000 : currentTimeMillis2 <= a3.J)) {
                        a1Var2.b.add(a3);
                        arrayList5.add(Long.valueOf(a3.b));
                    } else {
                        arrayList6.add(a3);
                    }
                }
                a1Var2.b(arrayList6);
                a1Var2.d = false;
                a1Var2.c = true;
                NotificationCenter.getInstance(a1Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                break;
        }
    }
}
