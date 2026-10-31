package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class kx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ kx(qz qzVar, String str, List list, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                HashMap hashMap = this.b.r;
                String str = this.c;
                hashMap.remove(str);
                this.d.remove(str);
                break;
            default:
                HashMap hashMap2 = this.b.r;
                String str2 = this.c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                break;
        }
    }
}
