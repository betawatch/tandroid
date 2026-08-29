package eg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ c2(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                g2 g2Var = this.b;
                ArrayList arrayList = g2Var.c0;
                ag.q1 q1Var = g2Var.r0;
                g2Var.j0 = str;
                int i10 = g2Var.n0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(q1Var);
                    AndroidUtilities.runOnUIThread(q1Var, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(q1Var);
                        AndroidUtilities.runOnUIThread(q1Var, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(q1Var);
                        arrayList.clear();
                        arrayList.addAll(q0.e(g2Var.m0.id));
                        g2Var.a0(false, true);
                        g2Var.X(true);
                        break;
                    }
                } else if (i10 == 3) {
                    g2Var.a0(false, true);
                    g2Var.X(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                g2 g2Var2 = this.b;
                ArrayList arrayList2 = g2Var2.c0;
                if (!TextUtils.isEmpty(g2Var2.j0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    g2Var2.b0(true, true);
                    g2Var2.X(true);
                    break;
                }
                break;
        }
    }
}
