package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                    ((kj0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
