// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class k67 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;

    public /* synthetic */ k67(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new p67(na7Var, (TL_account.TL_webBrowserSettings) obj2, (byte) 1));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    na7Var.W4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
                break;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                if (updates != null) {
                    na7Var.R3(updates, false);
                    break;
                }
                break;
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                if (updates2 != null) {
                    na7Var.R3(updates2, false);
                }
                gl.c3(new f67(na7Var, (byte) 29));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                if (updates3 != null) {
                    na7Var.R3(updates3, false);
                }
                gl.c3(new c87(na7Var, (byte) 2));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                if (emojiGameInfo != null) {
                    na7Var.k5 = emojiGameInfo;
                }
                ArrayList arrayList = na7Var.j5;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((p8c) obj3).a(Boolean.valueOf(na7Var.k5 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                na7Var.j5 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                if (webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings) {
                    na7Var.W4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
                break;
        }
    }
}
