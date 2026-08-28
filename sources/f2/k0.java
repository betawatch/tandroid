package f2;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int b10;
        int size = this.k.size();
        View view2 = null;
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((q1) this.k.get(i10)).a;
            a1 a1Var = (a1) view3.getLayoutParams();
            if (view3 != view && !a1Var.a.j() && (b10 = (a1Var.b() - this.d) * this.e) >= 0 && b10 < i9) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                } else {
                    i9 = b10;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((a1) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(n1 n1Var) {
        int i9 = this.d;
        return i9 >= 0 && i9 < n1Var.b();
    }

    public final View c(g1 g1Var) {
        List list = this.k;
        if (list == null) {
            View view = g1Var.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = ((q1) this.k.get(i9)).a;
            a1 a1Var = (a1) view2.getLayoutParams();
            if (!a1Var.a.j() && this.d == a1Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
