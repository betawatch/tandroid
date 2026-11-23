package fi;

import java.util.ArrayList;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                    ((oh0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
