package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class gv {
    public final ev a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final hv e;
    public int f;
    public int g;
    public hv h;

    public gv(ev evVar, ArrayList arrayList, int i7, int i10, hv hvVar, int i11, int i12, hv hvVar2) {
        this.a = evVar;
        this.b = arrayList;
        this.c = i7;
        this.d = i10;
        this.e = hvVar;
        this.f = i11;
        this.g = i12;
        this.h = hvVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10 = i7 == this.c ? this.d : 0;
        int i11 = i7 == this.f ? this.g : Integer.MAX_VALUE;
        return (i10 == 0 && i11 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i7) : b(i7).b(i10, i11);
    }

    public final hv b(int i7) {
        if (i7 == this.c) {
            return this.e;
        }
        int i10 = this.f;
        ArrayList arrayList = this.b;
        ev evVar = this.a;
        if (i7 != i10) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i7);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new hv(richText, identityHashMap, evVar.o(richText, 0, identityHashMap).length(), 0);
        }
        if (this.h == null) {
            TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i7);
            IdentityHashMap identityHashMap2 = new IdentityHashMap();
            this.h = new hv(richText2, identityHashMap2, evVar.o(richText2, 0, identityHashMap2).length(), 0);
        }
        return this.h;
    }
}
