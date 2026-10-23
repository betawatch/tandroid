package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w81;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class kd extends w81 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public kd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = d6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        return new jd(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.w81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((h61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        long j10 = this.f;
        int i10 = this.b;
        if (j10 == 0) {
            ga y3 = ga.y(i10, this.c);
            arrayList.add(h61.C(0));
            if (y3.O(1)) {
                arrayList.add(h61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(h61.C(2));
                return;
            }
            return;
        }
        k0 g10 = k0.g(i10);
        arrayList.add(h61.C(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(h61.C(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(h61.C(2));
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
    }
}
