package jh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ga extends q71 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public ga(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = c6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        return new fa(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((w41) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        int i10 = this.b;
        long j10 = this.f;
        if (j10 == 0) {
            s7 y8 = s7.y(i10, this.c);
            arrayList.add(w41.C(0));
            if (y8.O(1)) {
                arrayList.add(w41.C(1));
            }
            if (y8.O(2)) {
                arrayList.add(w41.C(2));
                return;
            }
            return;
        }
        b0 g10 = b0.g(i10);
        arrayList.add(w41.C(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(w41.C(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(w41.C(2));
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
    }
}
