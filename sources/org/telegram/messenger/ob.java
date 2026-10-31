package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ob implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ob(int i10, String str, boolean z10) {
        this.c = i10;
        this.b = str;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = this.d;
        int i11 = this.c;
        String str = this.b;
        switch (i10) {
            case 0:
                zs.f(i11).k(zs.V1, str, Boolean.valueOf(z10));
                break;
            default:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str);
                if (mVar != null && mVar.u != null) {
                    if (!org.telegram.utils.twidget.p.g.contains(mVar)) {
                        mVar.F = i11;
                        mVar.G = z10;
                        ArrayList arrayList = org.telegram.utils.twidget.p.f;
                        arrayList.remove(mVar);
                        arrayList.add(mVar);
                        org.telegram.utils.twidget.p.o();
                        break;
                    } else {
                        mVar.F = i11;
                        mVar.u.n(i11);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ob(String str, int i10, boolean z10) {
        this.b = str;
        this.c = i10;
        this.d = z10;
    }
}
