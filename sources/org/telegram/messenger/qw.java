package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class qw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ qw(zy zyVar, String str, List list, int i7) {
        this.a = i7;
        this.b = zyVar;
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
