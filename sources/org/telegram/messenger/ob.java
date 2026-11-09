package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class ob implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ob(int i7, String str, boolean z9) {
        this.c = i7;
        this.b = str;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean z9 = this.d;
        int i10 = this.c;
        String str = this.b;
        switch (i7) {
            case 0:
                qs.f(i10).k(qs.V1, str, Boolean.valueOf(z9));
                break;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(str);
                if (k0Var != null && k0Var.t != null) {
                    if (!org.telegram.utils.twidget.n0.g.contains(k0Var)) {
                        k0Var.E = i10;
                        k0Var.F = z9;
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

    public /* synthetic */ ob(String str, int i7, boolean z9) {
        this.b = str;
        this.c = i7;
        this.d = z9;
    }
}
