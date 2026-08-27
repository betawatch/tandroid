package hh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ma extends g71 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public ma(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = c6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        return new la(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((n41) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        int i10 = this.b;
        long j10 = this.f;
        if (j10 == 0) {
            u7 y10 = u7.y(i10, this.c);
            arrayList.add(n41.C(0));
            if (y10.O(1)) {
                arrayList.add(n41.C(1));
            }
            if (y10.O(2)) {
                arrayList.add(n41.C(2));
                return;
            }
            return;
        }
        c0 g10 = c0.g(i10);
        arrayList.add(n41.C(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(n41.C(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(n41.C(2));
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
    }
}
