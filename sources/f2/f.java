package f2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l c;

    public /* synthetic */ f(l lVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = lVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    l lVar = this.c;
                    if (i10 >= size) {
                        arrayList.clear();
                        lVar.u.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        k kVar = (k) obj;
                        lVar.C(kVar.a, kVar);
                        lVar.w.add(kVar);
                    }
                }
            case 1:
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    l lVar2 = this.c;
                    if (i11 >= size2) {
                        arrayList2.clear();
                        lVar2.v.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        j jVar = (j) obj2;
                        lVar2.B(jVar);
                        lVar2.x.add(jVar);
                    }
                }
            default:
                ArrayList arrayList3 = this.b;
                int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i12 = Math.min(i12, ((l1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    l lVar3 = this.c;
                    if (size4 < 0) {
                        arrayList3.clear();
                        lVar3.t.remove(arrayList3);
                        break;
                    } else {
                        l1 l1Var = (l1) arrayList3.get(size4);
                        long b10 = (l1Var.b() - i12) * lVar3.D;
                        View view = l1Var.a;
                        ViewPropertyAnimator animate = view.animate();
                        lVar3.y.add(l1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(lVar3.h()).setStartDelay(b10).setInterpolator(lVar3.h);
                        animate.setUpdateListener(new d(lVar3, l1Var, 1));
                        animate.setListener(new g(lVar3, l1Var, view, animate)).start();
                    }
                }
        }
    }
}
