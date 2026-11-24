// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l94 b;
    public final /* synthetic */ m94 c;

    public /* synthetic */ h94(l94 l94Var, m94 m94Var, byte b) {
        this.a = b;
        this.b = l94Var;
        this.c = m94Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l94 l94Var = this.b;
                m94 m94Var = this.c;
                if (l94Var.m != null) {
                    fa4.d("FileLoadOperation " + l94Var.r + " removing stream listener " + m94Var);
                    l94Var.m.remove(m94Var);
                    break;
                }
                break;
            default:
                l94 l94Var2 = this.b;
                m94 m94Var2 = this.c;
                ArrayList arrayList = l94Var2.m;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    l94Var2.m = arrayList;
                }
                if (m94Var2 != null && !arrayList.contains(m94Var2)) {
                    l94Var2.m.add(m94Var2);
                }
                if (!l94Var2.m.isEmpty()) {
                    Utilities.d.a(l94Var2.f1);
                }
                if (m94Var2 != null && l94Var2.Y != 1 && l94Var2.Y != 0) {
                    m94Var2.a();
                    break;
                }
                break;
        }
    }
}
