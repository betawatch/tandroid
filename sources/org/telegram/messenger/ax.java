package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ax implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ kj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ dz f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ dz n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ ax(rz rzVar, TLObject tLObject, kj kjVar, String str, dz dzVar, boolean z10, dz dzVar2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.a = i10;
        this.b = rzVar;
        this.c = tLObject;
        this.d = kjVar;
        this.e = str;
        this.f = dzVar;
        this.h = z10;
        this.n = dzVar2;
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
