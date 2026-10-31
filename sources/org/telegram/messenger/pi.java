package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class pi {
    public String a;
    public long b;
    public int c;
    public long d;
    public long e;
    public short[] f;
    public boolean g;
    public float h = 0.0f;
    public float i = 1.0f;

    public static pi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.e1;
        if (tL_document == null) {
            return null;
        }
        pi piVar = new pi();
        piVar.a = str;
        piVar.b = mediaController.u1;
        piVar.c = mediaController.k1;
        piVar.d = mediaController.j1;
        piVar.e = tL_document.id;
        piVar.f = mediaController.t1;
        piVar.g = z10;
        piVar.h = 0.0f;
        piVar.i = 1.0f;
        return piVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f.length];
        int i10 = 0;
        while (true) {
            short[] sArr = this.f;
            if (i10 >= sArr.length) {
                return "@" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + "\n" + (this.g ? 1 : 0) + ";" + this.h + ";" + this.i + "\n" + new String(cArr);
            }
            cArr[i10] = (char) sArr[i10];
            i10++;
        }
    }
}
