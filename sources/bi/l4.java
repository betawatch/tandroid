package bi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cy;
import org.telegram.ui.o21;
import org.telegram.ui.v21;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ l4(h7 h7Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f = h7Var;
        this.h = cVar;
        this.b = e2Var;
        this.c = tLObject;
        this.n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.r = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h7.u1((h7) this.f, (qf.c) this.h, (org.telegram.ui.ActionBar.e2) this.b, (TLObject) this.c, (TL_stars.TL_starGiftUnique) this.n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.r);
                break;
            case 1:
                cy.l0((cy) this.f, (org.telegram.ui.ActionBar.e2) this.b, (TLObject) this.c, (TLRPC.User) this.h, (TLRPC.Chat) this.n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.c;
                Context context = (Context) this.f;
                di.k0 k0Var = (di.k0) this.h;
                byte[] bArr = (byte[]) this.b;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.n;
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                v21 v21Var = new v21(context, k0Var, this.d, bArr);
                v21Var.R((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
                v21Var.v = new o21(aVar, wcVar, context, k0Var, dVar);
                v21Var.show();
                break;
            default:
                ((WalletEngine2) this.f).lambda$prepareSend$50((byte[]) this.h, (String) this.b, this.d, (byte[]) this.c, (byte[]) this.n, (String) this.e, (Utilities.Callback3) this.r);
                break;
        }
    }

    public /* synthetic */ l4(TLObject tLObject, Context context, di.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, org.telegram.messenger.video.d dVar) {
        this.c = tLObject;
        this.f = context;
        this.h = k0Var;
        this.d = j10;
        this.b = bArr;
        this.n = aVar;
        this.e = wcVar;
        this.r = dVar;
    }

    public /* synthetic */ l4(cy cyVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f = cyVar;
        this.b = e2Var;
        this.c = tLObject;
        this.h = user;
        this.n = chat;
        this.d = j10;
        this.e = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ l4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.f = walletEngine2;
        this.h = bArr;
        this.b = str;
        this.d = j10;
        this.c = bArr2;
        this.n = bArr3;
        this.e = str2;
        this.r = callback3;
    }
}
