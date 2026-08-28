package f2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ n c;

    public /* synthetic */ h(n nVar, ArrayList arrayList, int i9) {
        this.a = i9;
        this.c = nVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    n nVar = this.c;
                    if (i9 >= size) {
                        arrayList.clear();
                        nVar.u.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i9);
                        i9++;
                        m mVar = (m) obj;
                        nVar.C(mVar.a, mVar);
                        nVar.w.add(mVar);
                    }
                }
            case 1:
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    n nVar2 = this.c;
                    if (i10 >= size2) {
                        arrayList2.clear();
                        nVar2.v.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        l lVar = (l) obj2;
                        nVar2.B(lVar);
                        nVar2.x.add(lVar);
                    }
                }
            default:
                ArrayList arrayList3 = this.b;
                int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    i11 = Math.min(i11, ((q1) arrayList3.get(size3)).b());
                }
                int size4 = arrayList3.size();
                while (true) {
                    size4--;
                    n nVar3 = this.c;
                    if (size4 < 0) {
                        arrayList3.clear();
                        nVar3.t.remove(arrayList3);
                        break;
                    } else {
                        q1 q1Var = (q1) arrayList3.get(size4);
                        long b10 = (q1Var.b() - i11) * nVar3.D;
                        View view = q1Var.a;
                        ViewPropertyAnimator animate = view.animate();
                        nVar3.y.add(q1Var);
                        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(nVar3.h()).setStartDelay(b10).setInterpolator(nVar3.h);
                        animate.setUpdateListener(new e(nVar3, q1Var, 1));
                        animate.setListener(new i(nVar3, q1Var, view, animate)).start();
                    }
                }
        }
    }
}
