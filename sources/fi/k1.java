package fi;

import java.util.ArrayList;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;

    public /* synthetic */ k1(m1 m1Var, int i7) {
        this.a = i7;
        this.b = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m1 m1Var = this.b;
                m1Var.invalidate();
                m1Var.b();
                break;
            default:
                ArrayList arrayList = this.b.e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((mh0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
