// default package

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mc3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ sc3 c;

    public /* synthetic */ mc3(sc3 sc3Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = sc3Var;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        sc3 sc3Var = this.c;
        switch (b) {
            case 0:
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    rc3 rc3Var = (rc3) obj;
                    sc3Var.C(rc3Var.a, rc3Var);
                    sc3Var.w.add(rc3Var);
                }
                arrayList.clear();
                sc3Var.u.remove(arrayList);
                break;
            default:
                int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    i2 = Math.min(i2, ((u69) arrayList.get(size2)).b());
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    u69 u69Var = (u69) arrayList.get(size3);
                    View view = u69Var.a;
                    ViewPropertyAnimator animate = view.animate();
                    sc3Var.y.add(u69Var);
                    animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(sc3Var.h()).setStartDelay((u69Var.b() - i2) * sc3Var.D).setInterpolator(sc3Var.h);
                    animate.setUpdateListener(new kc3(sc3Var, u69Var, (byte) 1));
                    animate.setListener(new nc3(sc3Var, u69Var, view, animate)).start();
                }
                arrayList.clear();
                sc3Var.t.remove(arrayList);
                break;
        }
    }
}
