package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class ni {
    public String a;
    public long b;
    public int c;
    public long d;
    public long e;
    public short[] f;
    public boolean g;
    public float h = 0.0f;
    public float i = 1.0f;

    public static ni a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.g1;
        if (tL_document == null) {
            return null;
        }
        ni niVar = new ni();
        niVar.a = str;
        niVar.b = mediaController.w1;
        niVar.c = mediaController.m1;
        niVar.d = mediaController.l1;
        niVar.e = tL_document.id;
        niVar.f = mediaController.v1;
        niVar.g = z10;
        niVar.h = 0.0f;
        niVar.i = 1.0f;
        return niVar;
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
