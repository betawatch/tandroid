package f2;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h0 {
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
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((n1) this.k.get(i11)).a;
            x0 x0Var = (x0) view3.getLayoutParams();
            if (view3 != view && !x0Var.a.j() && (b10 = (x0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                } else {
                    i10 = b10;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((x0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(k1 k1Var) {
        int i10 = this.d;
        return i10 >= 0 && i10 < k1Var.b();
    }

    public final View c(d1 d1Var) {
        List list = this.k;
        if (list == null) {
            View view = d1Var.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((n1) this.k.get(i10)).a;
            x0 x0Var = (x0) view2.getLayoutParams();
            if (!x0Var.a.j() && this.d == x0Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
