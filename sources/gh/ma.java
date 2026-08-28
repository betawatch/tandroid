package gh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ma extends e71 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public ma(Context context, int i9, boolean z10, long j10, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = context;
        this.b = i9;
        this.c = z10;
        this.d = i10;
        this.e = b6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        return new la(this.a, this.c, this.f, i9, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        int h = h(i9);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        if (i9 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i9 >= arrayList.size()) {
            return 0;
        }
        return ((l41) arrayList.get(i9)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        int i9 = this.b;
        long j10 = this.f;
        if (j10 == 0) {
            v7 y10 = v7.y(i9, this.c);
            arrayList.add(l41.C(0));
            if (y10.O(1)) {
                arrayList.add(l41.C(1));
            }
            if (y10.O(2)) {
                arrayList.add(l41.C(2));
                return;
            }
            return;
        }
        c0 g10 = c0.g(i9);
        arrayList.add(l41.C(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(l41.C(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(l41.C(2));
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
    }
}
