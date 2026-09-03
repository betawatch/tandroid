package nh;

import java.util.ArrayList;
import org.telegram.ui.Components.gj0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ p1(r1 r1Var, int i10) {
        this.a = i10;
        this.b = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r1 r1Var = this.b;
                r1Var.invalidate();
                r1Var.b();
                break;
            default:
                ArrayList arrayList = this.b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((gj0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
