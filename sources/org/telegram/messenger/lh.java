package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class lh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ lh(oi oiVar, ArrayList arrayList, String str, int i7) {
        this.a = i7;
        this.b = oiVar;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.g3(new lh(this.b, this.c, this.d, 2));
                break;
            case 1:
                ArrayList arrayList = this.c;
                this.b.e(this.d, arrayList);
                break;
            default:
                ArrayList arrayList2 = this.c;
                this.b.e(this.d, arrayList2);
                break;
        }
    }
}
