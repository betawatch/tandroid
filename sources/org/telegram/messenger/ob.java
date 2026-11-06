package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str);
                if (mVar != null && mVar.t != null) {
                    if (!org.telegram.utils.twidget.p.g.contains(mVar)) {
                        mVar.E = i10;
                        mVar.F = z9;
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

    public /* synthetic */ ob(String str, int i7, boolean z9) {
        this.b = str;
        this.c = i7;
        this.d = z9;
    }
}
