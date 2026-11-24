// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nv2 implements View.OnClickListener {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nv2(tv2 tv2Var, ArrayList arrayList, boolean z) {
        this.c = tv2Var;
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
                xv2 xv2Var = ((tv2) obj2).a;
                if (xv2Var.w != null && xv2Var.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        xv2Var.l.y(xv2Var.W);
                    } else if (intValue == 1) {
                        xv2Var.l.r(xv2Var.W);
                    } else if (intValue == 2) {
                        xv2Var.l.r(null);
                    } else if (intValue == 3) {
                        xv2Var.l.E(xv2Var.W);
                    } else if (intValue == 4) {
                        xv2Var.l.o(xv2Var.W);
                    } else if (intValue == 5) {
                        hq6.d0(xv2Var.r).d(2, xv2Var.b0, xv2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    xv2Var.d();
                    break;
                }
                break;
            case 1:
                i61 i61Var = (i61) obj2;
                Runnable runnable = (Runnable) obj;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, z ? "lastseen" : "readtime"));
                    i61Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                g29 g29Var = (g29) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (z) {
                    ((nfa) g29Var.b).J.p();
                }
                runnable2.run();
                break;
        }
    }

    public /* synthetic */ nv2(g29 g29Var, boolean z, Runnable runnable) {
        this.c = g29Var;
        this.b = z;
        this.d = runnable;
    }

    public /* synthetic */ nv2(boolean z, i61 i61Var, Runnable runnable) {
        this.b = z;
        this.c = i61Var;
        this.d = runnable;
    }
}
