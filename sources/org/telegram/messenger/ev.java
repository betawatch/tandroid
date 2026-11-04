package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ev {
    public final cv a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final fv e;
    public int f;
    public int g;
    public fv h;

    public ev(cv cvVar, ArrayList arrayList, int i3, int i10, fv fvVar, int i11, int i12, fv fvVar2) {
        this.a = cvVar;
        this.b = arrayList;
        this.c = i3;
        this.d = i10;
        this.e = fvVar;
        this.f = i11;
        this.g = i12;
        this.h = fvVar2;
    }

    public final TL_iv.RichText a(int i3) {
        int i10 = i3 == this.c ? this.d : 0;
        int i11 = i3 == this.f ? this.g : Integer.MAX_VALUE;
        return (i10 == 0 && i11 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i3) : b(i3).b(i10, i11);
    }

    public final fv b(int i3) {
        if (i3 == this.c) {
            return this.e;
        }
        int i10 = this.f;
        ArrayList arrayList = this.b;
        cv cvVar = this.a;
        if (i3 != i10) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i3);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new fv(richText, identityHashMap, cvVar.o(richText, 0, identityHashMap).length(), 0);
        }
        if (this.h == null) {
            TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i3);
            IdentityHashMap identityHashMap2 = new IdentityHashMap();
            this.h = new fv(richText2, identityHashMap2, cvVar.o(richText2, 0, identityHashMap2).length(), 0);
        }
        return this.h;
    }
}
