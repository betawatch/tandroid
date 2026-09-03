package mh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class ha extends d81 {
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

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        return new ga(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.d81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.d81
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((h51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        int i10 = this.b;
        long j10 = this.f;
        if (j10 == 0) {
            t7 y10 = t7.y(i10, this.c);
            arrayList.add(h51.C(0));
            if (y10.O(1)) {
                arrayList.add(h51.C(1));
            }
            if (y10.O(2)) {
                arrayList.add(h51.C(2));
                return;
            }
            return;
        }
        a0 g10 = a0.g(i10);
        arrayList.add(h51.C(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(h51.C(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(h51.C(2));
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
    }
}
