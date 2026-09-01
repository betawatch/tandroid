package mh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.j51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class ha extends e81 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public ha(Context context, int i10, boolean z4, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = context;
        this.b = i10;
        this.c = z4;
        this.d = i11;
        this.e = g6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        return new ga(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.e81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.e81
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((j51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        int i10 = this.b;
        long j10 = this.f;
        if (j10 == 0) {
            t7 y10 = t7.y(i10, this.c);
            arrayList.add(j51.C(0));
            if (y10.O(1)) {
                arrayList.add(j51.C(1));
            }
            if (y10.O(2)) {
                arrayList.add(j51.C(2));
                return;
            }
            return;
        }
        a0 g10 = a0.g(i10);
        arrayList.add(j51.C(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(j51.C(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(j51.C(2));
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
    }
}
