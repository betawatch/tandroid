package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class zw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ jj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ cz f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ cz n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ zw(qz qzVar, TLObject tLObject, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = tLObject;
        this.d = jjVar;
        this.e = str;
        this.f = czVar;
        this.h = z10;
        this.n = czVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.O(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
            case 1:
                this.b.O(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
            default:
                this.b.O(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
        }
    }
}
