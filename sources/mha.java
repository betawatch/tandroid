// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mha {
    public final int a;
    public final int b;
    public final lha c;
    public final kha d;
    public final /* synthetic */ nha e;

    public mha(nha nhaVar, Context context, int i) {
        this.e = nhaVar;
        this.b = i;
        int i2 = nhaVar.o2;
        nhaVar.o2 = i2 + 1;
        this.a = (i2 & 65535) | 65536;
        this.c = new lha(this, context, i);
        this.d = new kha(nhaVar, context, i, false);
    }
}
