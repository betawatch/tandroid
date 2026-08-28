package ih;

import java.util.ArrayList;
import org.telegram.ui.Components.mi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ q1(s1 s1Var, int i9) {
        this.a = i9;
        this.b = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s1 s1Var = this.b;
                s1Var.invalidate();
                s1Var.b();
                break;
            default:
                ArrayList arrayList = this.b.e;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((mi0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
