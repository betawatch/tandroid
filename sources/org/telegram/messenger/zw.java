package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class zw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ zw(gz gzVar, String str, List list, int i7) {
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
