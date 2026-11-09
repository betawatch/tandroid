package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;
    public final /* synthetic */ rd c;

    public /* synthetic */ ld(sd sdVar, rd rdVar, int i7) {
        this.a = i7;
        this.b = sdVar;
        this.c = rdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sd sdVar = this.b;
                ArrayList arrayList = sdVar.I;
                rd rdVar = this.c;
                arrayList.remove(rdVar);
                sdVar.J.l(rdVar.a);
                if (arrayList.isEmpty()) {
                    sd.s();
                }
                qs.e().k(qs.D4, new Object[0]);
                break;
            case 1:
                sd sdVar2 = this.b;
                ArrayList arrayList2 = sdVar2.I;
                rd rdVar2 = this.c;
                arrayList2.remove(rdVar2);
                sdVar2.J.l(rdVar2.a);
                if (arrayList2.isEmpty()) {
                    sd.s();
                }
                qs.e().k(qs.D4, new Object[0]);
                break;
            default:
                sd sdVar3 = this.b;
                ArrayList arrayList3 = sdVar3.I;
                rd rdVar3 = this.c;
                arrayList3.remove(rdVar3);
                sdVar3.J.l(rdVar3.a);
                if (arrayList3.isEmpty()) {
                    sd.s();
                }
                qs.e().k(qs.D4, new Object[0]);
                break;
        }
    }
}
