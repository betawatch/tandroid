package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class gi {
    public String a;
    public long b;
    public int c;
    public long d;
    public long e;
    public short[] f;
    public boolean g;
    public float h = 0.0f;
    public float i = 1.0f;

    public static gi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.g1;
        if (tL_document == null) {
            return null;
        }
        gi giVar = new gi();
        giVar.a = str;
        giVar.b = mediaController.w1;
        giVar.c = mediaController.m1;
        giVar.d = mediaController.l1;
        giVar.e = tL_document.id;
        giVar.f = mediaController.v1;
        giVar.g = z10;
        giVar.h = 0.0f;
        giVar.i = 1.0f;
        return giVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f.length];
        int i3 = 0;
        while (true) {
            short[] sArr = this.f;
            if (i3 >= sArr.length) {
                return "@" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + "\n" + (this.g ? 1 : 0) + ";" + this.h + ";" + this.i + "\n" + new String(cArr);
            }
            cArr[i3] = (char) sArr[i3];
            i3++;
        }
    }
}
