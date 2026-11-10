package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.tc0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class a0 implements Runnable, ls {
    public boolean a;
    public final /* synthetic */ qs b;
    public final /* synthetic */ tc0 c;
    public final /* synthetic */ l0 d;

    public a0(qs qsVar, tc0 tc0Var, l0 l0Var) {
        this.b = qsVar;
        this.c = tc0Var;
        this.d = l0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        l0 l0Var = this.d;
        if (l0Var.e == null) {
            return;
        }
        ArrayList arrayList = l0Var.G;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((h0) obj).d) {
                return;
            }
        }
        run();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.a4) {
            a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        org.telegram.messenger.g0.r(this);
        this.b.n(this, qs.a4);
        this.c.run();
    }
}
