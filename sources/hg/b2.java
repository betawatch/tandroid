package hg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ b2(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                f2 f2Var = this.b;
                ArrayList arrayList = f2Var.d0;
                androidx.activity.i iVar = f2Var.s0;
                f2Var.k0 = str;
                int i10 = f2Var.o0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        arrayList.clear();
                        arrayList.addAll(p0.e(f2Var.n0.id));
                        f2Var.a0(false, true);
                        f2Var.X(true);
                        break;
                    }
                } else if (i10 == 3) {
                    f2Var.a0(false, true);
                    f2Var.X(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                f2 f2Var2 = this.b;
                ArrayList arrayList2 = f2Var2.d0;
                if (!TextUtils.isEmpty(f2Var2.k0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    f2Var2.b0(true, true);
                    f2Var2.X(true);
                    break;
                }
                break;
        }
    }
}
