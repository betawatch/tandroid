package f2;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 {
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
            View view3 = ((o1) this.k.get(i11)).a;
            y0 y0Var = (y0) view3.getLayoutParams();
            if (view3 != view && !y0Var.a.j() && (b10 = (y0Var.b() - this.d) * this.e) >= 0 && b10 < i10) {
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
            this.d = ((y0) view2.getLayoutParams()).b();
        }
    }

    public final boolean b(l1 l1Var) {
        int i10 = this.d;
        return i10 >= 0 && i10 < l1Var.b();
    }

    public final View c(e1 e1Var) {
        List list = this.k;
        if (list == null) {
            View view = e1Var.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((o1) this.k.get(i10)).a;
            y0 y0Var = (y0) view2.getLayoutParams();
            if (!y0Var.a.j() && this.d == y0Var.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
