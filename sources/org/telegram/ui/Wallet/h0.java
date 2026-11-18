package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.o60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h0 implements Runnable, fs {
    public boolean a;
    public final /* synthetic */ ks b;
    public final /* synthetic */ o60 c;
    public final /* synthetic */ u0 d;

    public h0(ks ksVar, o60 o60Var, u0 u0Var) {
        this.b = ksVar;
        this.c = o60Var;
        this.d = u0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        u0 u0Var = this.d;
        if (u0Var.e == null) {
            return;
        }
        ArrayList arrayList = u0Var.J;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((q0) obj).d) {
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
