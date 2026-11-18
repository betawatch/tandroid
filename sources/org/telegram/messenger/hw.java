package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ fj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ly f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ly n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ hw(zy zyVar, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.a = i7;
        this.b = zyVar;
        this.c = tLObject;
        this.d = fjVar;
        this.e = str;
        this.f = lyVar;
        this.h = z10;
        this.n = lyVar2;
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
