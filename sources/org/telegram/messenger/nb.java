package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ nb(int i7, String str, boolean z10) {
        this.c = i7;
        this.b = str;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean z10 = this.d;
        int i10 = this.c;
        String str = this.b;
        switch (i7) {
            case 0:
                ns.f(i10).k(ns.V1, str, Boolean.valueOf(z10));
                break;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(str);
                if (k0Var != null && k0Var.t != null) {
                    if (!org.telegram.utils.twidget.n0.g.contains(k0Var)) {
                        k0Var.E = i10;
                        k0Var.F = z10;
                        ArrayList arrayList = org.telegram.utils.twidget.n0.f;
                        arrayList.remove(k0Var);
                        arrayList.add(k0Var);
                        org.telegram.utils.twidget.n0.p();
                        break;
                    } else {
                        k0Var.E = i10;
                        k0Var.t.n(i10);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ nb(String str, int i7, boolean z10) {
        this.b = str;
        this.c = i7;
        this.d = z10;
    }
}
