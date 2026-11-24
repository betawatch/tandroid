// default package

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fp6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ fp6(hq6 hq6Var, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, String str, boolean z2) {
        this.e = hq6Var;
        this.c = z;
        this.f = tL_messages_stickerSet;
        this.b = i;
        this.h = str;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        Serializable serializable = this.h;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                hq6 hq6Var = (hq6) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                String str = (String) serializable;
                boolean z = this.c;
                int i = this.b;
                if (z) {
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                        gl.e3(new yn6(hq6Var, str, this.d, (byte) 0), (tL_messages_stickerSet != null || z) ? 0L : 1000L);
                        if (tL_messages_stickerSet == null) {
                        }
                    }
                }
                if (tL_messages_stickerSet == null) {
                    if (!z) {
                        hq6Var.I1(str, null, i);
                        break;
                    }
                } else {
                    if (!z) {
                        hq6Var.I1(str, tL_messages_stickerSet, i);
                    }
                    gl.d3(new sx5(hq6Var, str, tL_messages_stickerSet, (byte) 29));
                    break;
                }
                break;
            case 1:
                ((kz6) obj2).U((CharSequence) obj, this.b, (ArrayList) serializable, this.c, this.d);
                break;
            default:
                gl.d3(new cib(bkb.n1((vjb) obj2, (String) serializable, this.b, this.c, (TLRPC.Document) obj, this.d), (byte) 4));
                break;
        }
    }

    public /* synthetic */ fp6(kz6 kz6Var, CharSequence charSequence, int i, ArrayList arrayList, boolean z, boolean z2) {
        this.e = kz6Var;
        this.f = charSequence;
        this.b = i;
        this.h = arrayList;
        this.c = z;
        this.d = z2;
    }

    public /* synthetic */ fp6(vjb vjbVar, String str, int i, boolean z, TLRPC.Document document, boolean z2) {
        this.e = vjbVar;
        this.h = str;
        this.b = i;
        this.c = z;
        this.f = document;
        this.d = z2;
    }
}
