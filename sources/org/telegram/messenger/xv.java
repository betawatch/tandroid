package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class xv {
    public final vv a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final yv e;
    public int f;
    public int g;
    public yv h;

    public xv(vv vvVar, ArrayList arrayList, int i10, int i11, yv yvVar, int i12, int i13, yv yvVar2) {
        this.a = vvVar;
        this.b = arrayList;
        this.c = i10;
        this.d = i11;
        this.e = yvVar;
        this.f = i12;
        this.g = i13;
        this.h = yvVar2;
    }

    public final TL_iv.RichText a(int i10) {
        int i11 = i10 == this.c ? this.d : 0;
        int i12 = i10 == this.f ? this.g : Integer.MAX_VALUE;
        return (i11 == 0 && i12 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i10) : b(i10).b(i11, i12);
    }

    public final yv b(int i10) {
        if (i10 == this.c) {
            return this.e;
        }
        int i11 = this.f;
        ArrayList arrayList = this.b;
        vv vvVar = this.a;
        if (i10 != i11) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i10);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new yv(richText, identityHashMap, vvVar.o(richText, 0, identityHashMap).length(), 0);
        }
        if (this.h == null) {
            TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i10);
            IdentityHashMap identityHashMap2 = new IdentityHashMap();
            this.h = new yv(richText2, identityHashMap2, vvVar.o(richText2, 0, identityHashMap2).length(), 0);
        }
        return this.h;
    }
}
