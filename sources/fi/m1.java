package fi;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ m1(o1 o1Var, int i7) {
        this.a = i7;
        this.b = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1 o1Var = this.b;
                o1Var.invalidate();
                o1Var.b();
                break;
            default:
                ArrayList arrayList = this.b.e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ch0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
