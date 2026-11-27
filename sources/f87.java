// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class f87 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;

    public /* synthetic */ f87(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 1;
        int i = 0;
        Object[] objArr = 0;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new o87(uc7Var, (TL_account.TL_webBrowserSettings) obj2, b2));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    uc7Var.e5((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
                break;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                if (updates != null) {
                    uc7Var.Y3(updates, false);
                }
                hl.c3(new pa7(uc7Var, b2));
                break;
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                if (updates2 != null) {
                    uc7Var.Y3(updates2, false);
                }
                hl.c3(new pa7(uc7Var, objArr == true ? 1 : 0));
                break;
            case 4:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                if (webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings) {
                    uc7Var.e5((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                if (emojiGameInfo != null) {
                    uc7Var.l5 = emojiGameInfo;
                }
                ArrayList arrayList = uc7Var.k5;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((pcc) obj3).a(Boolean.valueOf(uc7Var.l5 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                uc7Var.k5 = null;
                break;
            default:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                if (updates3 != null) {
                    uc7Var.Y3(updates3, false);
                    break;
                }
                break;
        }
    }
}
