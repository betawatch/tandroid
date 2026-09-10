package bi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ b1(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                f1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r9 a2 = ((e1) arrayList.get(i10)).a();
                    if ((a2.v() || ((file = a2.L) != null && file.exists())) && currentTimeMillis - a2.d <= 604800000) {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.b));
                    } else {
                        arrayList3.add(a2);
                    }
                }
                f1Var.c(arrayList3);
                f1Var.f = false;
                f1Var.e = true;
                zh.i5 storiesController = MessagesController.getInstance(f1Var.a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    zh.h5 h5Var = new zh.h5(storiesController, (r9) obj2);
                    storiesController.d(h5Var.J, h5Var, storiesController.b, false);
                }
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            default:
                f1 f1Var2 = this.b;
                f1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    r9 a10 = ((e1) arrayList.get(i12)).a();
                    if ((a10.v() || ((file2 = a10.L) != null && file2.exists())) && (!a10.g ? currentTimeMillis2 - a10.d <= 604800000 : currentTimeMillis2 <= a10.J)) {
                        f1Var2.b.add(a10);
                        arrayList5.add(Long.valueOf(a10.b));
                    } else {
                        arrayList6.add(a10);
                    }
                }
                f1Var2.c(arrayList6);
                f1Var2.d = false;
                f1Var2.c = true;
                NotificationCenter.getInstance(f1Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                break;
        }
    }
}
