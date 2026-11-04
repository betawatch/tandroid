package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ zi d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ky n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ gw(yy yyVar, TLObject tLObject, zi ziVar, String str, ky kyVar, boolean z10, ky kyVar2, Object obj, HashMap hashMap, boolean z11, int i3) {
        this.a = i3;
        this.b = yyVar;
        this.c = tLObject;
        this.d = ziVar;
        this.e = str;
        this.f = kyVar;
        this.h = z10;
        this.n = kyVar2;
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
