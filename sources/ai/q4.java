package ai;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cy;
import org.telegram.ui.h21;
import org.telegram.ui.o21;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ q4(l7 l7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f = l7Var;
        this.h = cVar;
        this.b = b2Var;
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
                l7.v1((l7) this.f, (pf.c) this.h, (org.telegram.ui.ActionBar.b2) this.b, (TLObject) this.c, (TL_stars.TL_starGiftUnique) this.n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.r);
                break;
            case 1:
                cy.m0((cy) this.f, (org.telegram.ui.ActionBar.b2) this.b, (TLObject) this.c, (TLRPC.User) this.h, (TLRPC.Chat) this.n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.c;
                Context context = (Context) this.f;
                ci.k0 k0Var = (ci.k0) this.h;
                byte[] bArr = (byte[]) this.b;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.n;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                o21 o21Var = new o21(context, k0Var, this.d, bArr);
                o21Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
                o21Var.s = new h21(aVar, xcVar, context, k0Var, dVar);
                o21Var.show();
                break;
            default:
                ((WalletEngine2) this.f).lambda$prepareSend$50((byte[]) this.h, (String) this.b, this.d, (byte[]) this.c, (byte[]) this.n, (String) this.e, (Utilities.Callback3) this.r);
                break;
        }
    }

    public /* synthetic */ q4(TLObject tLObject, Context context, ci.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.c = tLObject;
        this.f = context;
        this.h = k0Var;
        this.d = j10;
        this.b = bArr;
        this.n = aVar;
        this.e = xcVar;
        this.r = dVar;
    }

    public /* synthetic */ q4(cy cyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f = cyVar;
        this.b = b2Var;
        this.c = tLObject;
        this.h = user;
        this.n = chat;
        this.d = j10;
        this.e = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ q4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
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
