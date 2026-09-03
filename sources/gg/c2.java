package gg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c2(f2 f2Var, boolean z4, int i10) {
        this.a = i10;
        this.b = f2Var;
        this.c = z4;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                f2 f2Var = this.b;
                ArrayList arrayList = f2Var.d0;
                if (this.c) {
                    f2Var.e0.addAll(list);
                }
                if (f2Var.o0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    f2Var.b0(true, true);
                    f2Var.X(true);
                    break;
                }
                break;
            default:
                f2.P(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
