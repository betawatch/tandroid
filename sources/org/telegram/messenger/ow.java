package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class ow implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ ij d;
    public final /* synthetic */ String e;
    public final /* synthetic */ sy f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ sy n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ ow(gz gzVar, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = tLObject;
        this.d = ijVar;
        this.e = str;
        this.f = syVar;
        this.h = z9;
        this.n = syVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z10;
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
