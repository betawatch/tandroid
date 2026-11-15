package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class lw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ gj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ qy f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ qy n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ lw(ez ezVar, TLObject tLObject, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.a = i7;
        this.b = ezVar;
        this.c = tLObject;
        this.d = gjVar;
        this.e = str;
        this.f = qyVar;
        this.h = z10;
        this.n = qyVar2;
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
