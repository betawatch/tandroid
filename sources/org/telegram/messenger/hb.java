package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ hb(int i3, String str, boolean z10) {
        this.c = i3;
        this.b = str;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        boolean z10 = this.d;
        int i10 = this.c;
        String str = this.b;
        switch (i3) {
            case 0:
                hs.f(i10).k(hs.V1, str, Boolean.valueOf(z10));
                break;
            default:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str);
                if (mVar != null && mVar.t != null) {
                    if (!org.telegram.utils.twidget.p.g.contains(mVar)) {
                        mVar.E = i10;
                        mVar.F = z10;
                        ArrayList arrayList = org.telegram.utils.twidget.p.f;
                        arrayList.remove(mVar);
                        arrayList.add(mVar);
                        org.telegram.utils.twidget.p.o();
                        break;
                    } else {
                        mVar.E = i10;
                        mVar.t.n(i10);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ hb(String str, int i3, boolean z10) {
        this.b = str;
        this.c = i3;
        this.d = z10;
    }
}
