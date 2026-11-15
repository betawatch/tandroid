package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class kv {
    public final iv a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final lv e;
    public int f;
    public int g;
    public lv h;

    public kv(iv ivVar, ArrayList arrayList, int i7, int i10, lv lvVar, int i11, int i12, lv lvVar2) {
        this.a = ivVar;
        this.b = arrayList;
        this.c = i7;
        this.d = i10;
        this.e = lvVar;
        this.f = i11;
        this.g = i12;
        this.h = lvVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10 = i7 == this.c ? this.d : 0;
        int i11 = i7 == this.f ? this.g : Integer.MAX_VALUE;
        return (i10 == 0 && i11 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i7) : b(i7).b(i10, i11);
    }

    public final lv b(int i7) {
        if (i7 == this.c) {
            return this.e;
        }
        int i10 = this.f;
        ArrayList arrayList = this.b;
        iv ivVar = this.a;
        if (i7 != i10) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i7);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new lv(richText, identityHashMap, ivVar.o(richText, 0, identityHashMap).length(), 0);
        }
        if (this.h == null) {
            TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i7);
            IdentityHashMap identityHashMap2 = new IdentityHashMap();
            this.h = new lv(richText2, identityHashMap2, ivVar.o(richText2, 0, identityHashMap2).length(), 0);
        }
        return this.h;
    }
}
