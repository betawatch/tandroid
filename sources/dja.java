// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dja {
    public final int a;
    public final int b;
    public final cja c;
    public final bja d;
    public final /* synthetic */ eja e;

    public dja(eja ejaVar, Context context, int i) {
        this.e = ejaVar;
        this.b = i;
        int i2 = ejaVar.o2;
        ejaVar.o2 = i2 + 1;
        this.a = (i2 & 65535) | 65536;
        this.c = new cja(this, context, i);
        this.d = new bja(ejaVar, context, i, false);
    }
}
