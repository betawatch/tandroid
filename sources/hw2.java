// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hw2 implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hw2(nw2 nw2Var, ArrayList arrayList, boolean z) {
        this.c = nw2Var;
        this.d = arrayList;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                rw2 rw2Var = ((nw2) obj2).a;
                if (rw2Var.w != null && rw2Var.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        rw2Var.l.z(rw2Var.W);
                    } else if (intValue == 1) {
                        rw2Var.l.s(rw2Var.W);
                    } else if (intValue == 2) {
                        rw2Var.l.s(null);
                    } else if (intValue == 3) {
                        rw2Var.l.G(rw2Var.W);
                    } else if (intValue == 4) {
                        rw2Var.l.o(rw2Var.W);
                    } else if (intValue == 5) {
                        ls6.d0(rw2Var.r).d(2, rw2Var.b0, rw2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    rw2Var.d();
                    break;
                }
                break;
            case 1:
                q61 q61Var = (q61) obj2;
                Runnable runnable = (Runnable) obj;
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, z ? "lastseen" : "readtime"));
                    q61Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                pq8 pq8Var = (pq8) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (z) {
                    ((eja) pq8Var.b).J.p();
                }
                runnable2.run();
                break;
        }
    }

    public /* synthetic */ hw2(pq8 pq8Var, boolean z, Runnable runnable) {
        this.c = pq8Var;
        this.b = z;
        this.d = runnable;
    }

    public /* synthetic */ hw2(boolean z, q61 q61Var, Runnable runnable) {
        this.b = z;
        this.c = q61Var;
        this.d = runnable;
    }
}
