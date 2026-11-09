package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public static pi a(MediaController mediaController, String str, boolean z9) {
        TLRPC.TL_document tL_document = mediaController.f1;
        if (tL_document == null) {
            return null;
        }
        pi piVar = new pi();
        piVar.a = str;
        piVar.b = mediaController.v1;
        piVar.c = mediaController.l1;
        piVar.d = mediaController.k1;
        piVar.e = tL_document.id;
        piVar.f = mediaController.u1;
        piVar.g = z9;
        piVar.h = 0.0f;
        piVar.i = 1.0f;
        return piVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f;
            if (i7 >= sArr.length) {
                return "@" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + "\n" + (this.g ? 1 : 0) + ";" + this.h + ";" + this.i + "\n" + new String(cArr);
            }
            cArr[i7] = (char) sArr[i7];
            i7++;
        }
    }
}
