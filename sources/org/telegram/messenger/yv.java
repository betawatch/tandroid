package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class yv {
    public final wv a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final zv e;
    public int f;
    public int g;
    public zv h;

    public yv(wv wvVar, ArrayList arrayList, int i10, int i11, zv zvVar, int i12, int i13, zv zvVar2) {
        this.a = wvVar;
        this.b = arrayList;
        this.c = i10;
        this.d = i11;
        this.e = zvVar;
        this.f = i12;
        this.g = i13;
        this.h = zvVar2;
    }

    public final TL_iv.RichText a(int i10) {
        int i11 = i10 == this.c ? this.d : 0;
        int i12 = i10 == this.f ? this.g : Integer.MAX_VALUE;
        return (i11 == 0 && i12 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i10) : b(i10).b(i11, i12);
    }

    public final zv b(int i10) {
        if (i10 == this.c) {
            return this.e;
        }
        int i11 = this.f;
        ArrayList arrayList = this.b;
        wv wvVar = this.a;
        if (i10 != i11) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i10);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new zv(richText, identityHashMap, wvVar.o(richText, 0, identityHashMap).length(), 0);
        }
        if (this.h == null) {
            TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i10);
            IdentityHashMap identityHashMap2 = new IdentityHashMap();
            this.h = new zv(richText2, identityHashMap2, wvVar.o(richText2, 0, identityHashMap2).length(), 0);
        }
        return this.h;
    }
}
