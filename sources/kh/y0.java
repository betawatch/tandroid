package kh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ y0(b1 b1Var, int i9) {
        this.a = i9;
        this.b = b1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.a) {
            case 0:
                b1 b1Var = this.b;
                b1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    a8 a2 = ((a1) arrayList.get(i9)).a();
                    if ((a2.v() || ((file = a2.L) != null && file.exists())) && currentTimeMillis - a2.d <= 604800000) {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.b));
                    } else {
                        arrayList3.add(a2);
                    }
                }
                b1Var.b(arrayList3);
                b1Var.f = false;
                b1Var.e = true;
                ih.v6 storiesController = MessagesController.getInstance(b1Var.a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    ih.u6 u6Var = new ih.u6(storiesController, (a8) obj2);
                    storiesController.d(u6Var.F, u6Var, storiesController.b, false);
                }
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            default:
                b1 b1Var2 = this.b;
                b1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    a8 a3 = ((a1) arrayList.get(i11)).a();
                    if ((a3.v() || ((file2 = a3.L) != null && file2.exists())) && (!a3.g ? currentTimeMillis2 - a3.d <= 604800000 : currentTimeMillis2 <= a3.J)) {
                        b1Var2.b.add(a3);
                        arrayList5.add(Long.valueOf(a3.b));
                    } else {
                        arrayList6.add(a3);
                    }
                }
                b1Var2.b(arrayList6);
                b1Var2.d = false;
                b1Var2.c = true;
                NotificationCenter.getInstance(b1Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                break;
        }
    }
}
