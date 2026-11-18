package di;

import java.util.ArrayList;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k6 b;

    public /* synthetic */ i6(k6 k6Var, int i7) {
        this.a = i7;
        this.b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k6 k6Var = this.b;
                k6Var.r = false;
                k6Var.invalidate();
                k6Var.a();
                k6Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                k6 k6Var2 = this.b;
                k6Var2.setMessageCell(null);
                ArrayList arrayList = k6Var2.K;
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
