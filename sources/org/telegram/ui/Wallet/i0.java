package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.bd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class i0 implements Runnable, fs {
    public boolean a;
    public final /* synthetic */ ks b;
    public final /* synthetic */ bd0 c;
    public final /* synthetic */ v0 d;

    public i0(ks ksVar, bd0 bd0Var, v0 v0Var) {
        this.b = ksVar;
        this.c = bd0Var;
        this.d = v0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        v0 v0Var = this.d;
        if (v0Var.e == null) {
            return;
        }
        ArrayList arrayList = v0Var.J;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((r0) obj).d) {
                return;
            }
        }
        run();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.d4) {
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
        this.b.n(this, ks.d4);
        this.c.run();
    }
}
