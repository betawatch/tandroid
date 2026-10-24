package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class ld extends d91 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public ld(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = g6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        return new kd(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((m61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        long j10 = this.f;
        int i10 = this.b;
        if (j10 == 0) {
            ha y3 = ha.y(i10, this.c);
            arrayList.add(m61.C(0));
            if (y3.O(1)) {
                arrayList.add(m61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(m61.C(2));
                return;
            }
            return;
        }
        k0 g10 = k0.g(i10);
        arrayList.add(m61.C(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(m61.C(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(m61.C(2));
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
    }
}
