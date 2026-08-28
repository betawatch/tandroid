package bg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ l2(q2 q2Var, int i9) {
        this.a = i9;
        this.b = q2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                q2 q2Var = this.b;
                ArrayList arrayList = q2Var.c0;
                androidx.activity.i iVar = q2Var.r0;
                q2Var.j0 = str;
                int i9 = q2Var.n0;
                if (i9 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 350L);
                    break;
                } else if (i9 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        arrayList.clear();
                        arrayList.addAll(u0.e(q2Var.m0.id));
                        q2Var.Z(false, true);
                        q2Var.W(true);
                        break;
                    }
                } else if (i9 == 3) {
                    q2Var.Z(false, true);
                    q2Var.W(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                q2 q2Var2 = this.b;
                ArrayList arrayList2 = q2Var2.c0;
                if (!TextUtils.isEmpty(q2Var2.j0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    q2Var2.a0(true, true);
                    q2Var2.W(true);
                    break;
                }
                break;
        }
    }
}
