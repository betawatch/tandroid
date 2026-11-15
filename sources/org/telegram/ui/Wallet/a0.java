package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.jd0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class a0 implements Runnable, is {
    public boolean a;
    public final /* synthetic */ ns b;
    public final /* synthetic */ jd0 c;
    public final /* synthetic */ l0 d;

    public a0(ns nsVar, jd0 jd0Var, l0 l0Var) {
        this.b = nsVar;
        this.c = jd0Var;
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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.a4) {
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
        this.b.n(this, ns.a4);
        this.c.run();
    }
}
