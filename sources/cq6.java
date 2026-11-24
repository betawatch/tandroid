// default package

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cq6 {
    public String a;
    public long b;
    public int c;
    public long d;
    public long e;
    public short[] f;
    public boolean g;
    public float h = 0.0f;
    public float i = 1.0f;

    public static cq6 a(MediaController mediaController, String str, boolean z) {
        TLRPC.TL_document tL_document = mediaController.g1;
        if (tL_document == null) {
            return null;
        }
        cq6 cq6Var = new cq6();
        cq6Var.a = str;
        cq6Var.b = mediaController.w1;
        cq6Var.c = mediaController.m1;
        cq6Var.d = mediaController.l1;
        cq6Var.e = tL_document.id;
        cq6Var.f = mediaController.v1;
        cq6Var.g = z;
        cq6Var.h = 0.0f;
        cq6Var.i = 1.0f;
        return cq6Var;
    }

    public final String toString() {
        char[] cArr = new char[this.f.length];
        int i = 0;
        while (true) {
            short[] sArr = this.f;
            if (i >= sArr.length) {
                return "@" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + "\n" + (this.g ? 1 : 0) + ";" + this.h + ";" + this.i + "\n" + new String(cArr);
            }
            cArr[i] = (char) sArr[i];
            i++;
        }
    }
}
