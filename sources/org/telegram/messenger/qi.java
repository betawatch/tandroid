package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class qi {
    public String a;
    public long b;
    public int c;
    public long d;
    public long e;
    public short[] f;
    public boolean g;
    public float h = 0.0f;
    public float i = 1.0f;

    public static qi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.e1;
        if (tL_document == null) {
            return null;
        }
        qi qiVar = new qi();
        qiVar.a = str;
        qiVar.b = mediaController.u1;
        qiVar.c = mediaController.k1;
        qiVar.d = mediaController.j1;
        qiVar.e = tL_document.id;
        qiVar.f = mediaController.t1;
        qiVar.g = z10;
        qiVar.h = 0.0f;
        qiVar.i = 1.0f;
        return qiVar;
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
