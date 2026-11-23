package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class mi {
    public String a;
    public long b;
    public int c;
    public long d;
    public long e;
    public short[] f;
    public boolean g;
    public float h = 0.0f;
    public float i = 1.0f;

    public static mi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.g1;
        if (tL_document == null) {
            return null;
        }
        mi miVar = new mi();
        miVar.a = str;
        miVar.b = mediaController.w1;
        miVar.c = mediaController.m1;
        miVar.d = mediaController.l1;
        miVar.e = tL_document.id;
        miVar.f = mediaController.v1;
        miVar.g = z10;
        miVar.h = 0.0f;
        miVar.i = 1.0f;
        return miVar;
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
