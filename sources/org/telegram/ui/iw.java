package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ iw(TLObject tLObject, Context context, bi.s0 s0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, org.telegram.messenger.video.d dVar) {
        this.b = tLObject;
        this.d = context;
        this.e = s0Var;
        this.c = j10;
        this.f = bArr;
        this.h = aVar;
        this.n = zcVar;
        this.r = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yy.m0((yy) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLObject) this.b, (TLRPC.User) this.f, (TLRPC.Chat) this.h, this.c, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 1:
                TLObject tLObject = (TLObject) this.b;
                Context context = (Context) this.d;
                bi.s0 s0Var = (bi.s0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                i41 i41Var = new i41(context, s0Var, this.c, bArr);
                i41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
                i41Var.s = new b41(aVar, zcVar, context, s0Var, dVar);
                i41Var.show();
                break;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.e, (String) this.b, this.c, (byte[]) this.f, (byte[]) this.h, (String) this.n, (Utilities.Callback3) this.r);
                break;
            default:
                zh.r3.D0((zh.r3) this.d, (pf.c) this.f, (org.telegram.ui.ActionBar.a2) this.e, (TLObject) this.b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.n, this.c, (CharSequence) this.r);
                break;
        }
    }

    public /* synthetic */ iw(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = yyVar;
        this.e = a2Var;
        this.b = tLObject;
        this.f = user;
        this.h = chat;
        this.c = j10;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ iw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.e = bArr;
        this.b = str;
        this.c = j10;
        this.f = bArr2;
        this.h = bArr3;
        this.n = str2;
        this.r = callback3;
    }

    public /* synthetic */ iw(zh.r3 r3Var, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.d = r3Var;
        this.f = cVar;
        this.e = a2Var;
        this.b = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.c = j10;
        this.r = charSequence;
    }
}
