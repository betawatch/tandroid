package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ s2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                w2Var.invalidate();
                w2Var.b();
                break;
            default:
                ArrayList arrayList = this.b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
