// default package

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class nr6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ nr6(ls6 ls6Var, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, String str, boolean z2) {
        this.e = ls6Var;
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
                ls6 ls6Var = (ls6) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                String str = (String) serializable;
                boolean z = this.c;
                int i = this.b;
                if (z) {
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                        hl.d3(new rp6(ls6Var, str, this.d, (byte) 0), (tL_messages_stickerSet != null || z) ? 0L : 1000L);
                        if (tL_messages_stickerSet == null) {
                        }
                    }
                }
                if (tL_messages_stickerSet == null) {
                    if (!z) {
                        ls6Var.I1(str, null, i);
                        break;
                    }
                } else {
                    if (!z) {
                        ls6Var.I1(str, tL_messages_stickerSet, i);
                    }
                    hl.c3(new yg6(ls6Var, str, tL_messages_stickerSet, (byte) 3));
                    break;
                }
                break;
            case 1:
                ((r17) obj2).U((CharSequence) obj, this.b, (ArrayList) serializable, this.c, this.d);
                break;
            default:
                hl.c3(new s8b(aob.n1((unb) obj2, (String) serializable, this.b, this.c, (TLRPC.Document) obj, this.d), (byte) 21));
                break;
        }
    }

    public /* synthetic */ nr6(r17 r17Var, CharSequence charSequence, int i, ArrayList arrayList, boolean z, boolean z2) {
        this.e = r17Var;
        this.f = charSequence;
        this.b = i;
        this.h = arrayList;
        this.c = z;
        this.d = z2;
    }

    public /* synthetic */ nr6(unb unbVar, String str, int i, boolean z, TLRPC.Document document, boolean z2) {
        this.e = unbVar;
        this.h = str;
        this.b = i;
        this.c = z;
        this.f = document;
        this.d = z2;
    }
}
