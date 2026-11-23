package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class hv {
    public final fv a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final iv e;
    public int f;
    public int g;
    public iv h;

    public hv(fv fvVar, ArrayList arrayList, int i7, int i10, iv ivVar, int i11, int i12, iv ivVar2) {
        this.a = fvVar;
        this.b = arrayList;
        this.c = i7;
        this.d = i10;
        this.e = ivVar;
        this.f = i11;
        this.g = i12;
        this.h = ivVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10 = i7 == this.c ? this.d : 0;
        int i11 = i7 == this.f ? this.g : Integer.MAX_VALUE;
        return (i10 == 0 && i11 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i7) : b(i7).b(i10, i11);
    }

    public final iv b(int i7) {
        if (i7 == this.c) {
            return this.e;
        }
        int i10 = this.f;
        ArrayList arrayList = this.b;
        fv fvVar = this.a;
        if (i7 != i10) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i7);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new iv(richText, identityHashMap, fvVar.o(richText, 0, identityHashMap).length(), 0);
        }
        if (this.h == null) {
            TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i7);
            IdentityHashMap identityHashMap2 = new IdentityHashMap();
            this.h = new iv(richText2, identityHashMap2, fvVar.o(richText2, 0, identityHashMap2).length(), 0);
        }
        return this.h;
    }
}
