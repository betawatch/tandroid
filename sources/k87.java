// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class k87 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;

    public /* synthetic */ k87(oc7 oc7Var, byte b) {
        this.a = b;
        this.b = oc7Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 1;
        int i = 0;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new r87(oc7Var, (TL_account.TL_webBrowserSettings) obj2, b2));
                break;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    oc7Var.Y4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    break;
                }
                break;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                if (updates != null) {
                    oc7Var.T3(updates, false);
                    break;
                }
                break;
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                if (updates2 != null) {
                    oc7Var.T3(updates2, false);
                }
                gm.c3(new g87(oc7Var, (byte) 29));
                break;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                if (updates3 != null) {
                    oc7Var.T3(updates3, false);
                }
                gm.c3(new ba7(oc7Var, (byte) 1));
                break;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                if (emojiGameInfo != null) {
                    oc7Var.m5 = emojiGameInfo;
                }
                ArrayList arrayList = oc7Var.l5;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((qac) obj3).a(Boolean.valueOf(oc7Var.m5 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                oc7Var.l5 = null;
                break;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                if (webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings) {
                    oc7Var.Y4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    break;
                }
                break;
        }
    }
}
