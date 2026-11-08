package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class xw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ xw(gz gzVar, String str, List list, int i7) {
        this.a = i7;
        this.b = gzVar;
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
