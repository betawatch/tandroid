package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class mv {
    public final kv a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final nv e;
    public int f;
    public int g;
    public nv h;

    public mv(kv kvVar, ArrayList arrayList, int i7, int i10, nv nvVar, int i11, int i12, nv nvVar2) {
        this.a = kvVar;
        this.b = arrayList;
        this.c = i7;
        this.d = i10;
        this.e = nvVar;
        this.f = i11;
        this.g = i12;
        this.h = nvVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10 = i7 == this.c ? this.d : 0;
        int i11 = i7 == this.f ? this.g : Integer.MAX_VALUE;
        return (i10 == 0 && i11 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i7) : b(i7).b(i10, i11);
    }

    public final nv b(int i7) {
        if (i7 == this.c) {
            return this.e;
        }
        int i10 = this.f;
        ArrayList arrayList = this.b;
        kv kvVar = this.a;
        if (i7 != i10) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i7);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new nv(richText, identityHashMap, kvVar.o(richText, 0, identityHashMap).length(), 0);
        }
        if (this.h == null) {
            TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i7);
            IdentityHashMap identityHashMap2 = new IdentityHashMap();
            this.h = new nv(richText2, identityHashMap2, kvVar.o(richText2, 0, identityHashMap2).length(), 0);
        }
        return this.h;
    }
}
