package cg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ e2(i2 i2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                i2 i2Var = this.b;
                ArrayList arrayList = i2Var.c0;
                a8.b bVar = i2Var.r0;
                i2Var.j0 = str;
                int i10 = i2Var.n0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 350L);
                        break;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        arrayList.clear();
                        arrayList.addAll(q0.e(i2Var.m0.id));
                        i2Var.a0(false, true);
                        i2Var.X(true);
                        break;
                    }
                } else if (i10 == 3) {
                    i2Var.a0(false, true);
                    i2Var.X(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                i2 i2Var2 = this.b;
                ArrayList arrayList2 = i2Var2.c0;
                if (!TextUtils.isEmpty(i2Var2.j0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    i2Var2.b0(true, true);
                    i2Var2.X(true);
                    break;
                }
                break;
        }
    }
}
