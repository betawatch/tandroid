package cg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f2(i2 i2Var, boolean z10, int i10) {
        this.a = i10;
        this.b = i2Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                i2 i2Var = this.b;
                ArrayList arrayList = i2Var.c0;
                if (this.c) {
                    i2Var.d0.addAll(list);
                }
                if (i2Var.n0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    i2Var.b0(true, true);
                    i2Var.X(true);
                    break;
                }
                break;
            default:
                i2.P(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
