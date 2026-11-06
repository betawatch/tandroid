package bi;

import android.content.Context;
import org.telegram.messenger.f10;
import org.telegram.messenger.ij;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.iy0;
import org.telegram.ui.oy0;
import org.telegram.ui.vn0;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ m4(k7 k7Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.c = k7Var;
        this.d = bVar;
        this.e = u1Var;
        this.f = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.b = j3;
        this.r = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                vf.b bVar = (vf.b) this.d;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.e;
                TLObject tLObject = (TLObject) this.f;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                CharSequence charSequence = (CharSequence) this.r;
                bVar.c(false);
                u1Var.dismiss();
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                        new tc(k7Var.getContext(), k7Var.I0, this.b, 16, null, new a4(4, k7Var, charSequence), 0L).show();
                        break;
                    } else if (tL_error != null) {
                        k7Var.k().f0(tL_error, false);
                        break;
                    }
                } else {
                    int i7 = 0;
                    while (i7 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i7) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    TL_stars.SavedStarGift savedStarGift = k7Var.x2;
                    k7Var.k2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
                    org.telegram.messenger.g0.h3(new a4(3, k7Var, tL_starGiftUnique));
                    break;
                }
                break;
            case 1:
                f10 f10Var = (f10) this.c;
                ij ijVar = (ij) this.d;
                String str = (String) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) this.h;
                f3.s sVar = (f3.s) this.n;
                vn0 vn0Var = (vn0) this.r;
                f10Var.getClass();
                TLRPC.Message message = ijVar.k;
                message.translatedToLanguage = str;
                message.translatedText = e21.P0(tL_textWithEntities, tL_textWithEntities2);
                f10Var.getMessagesStorage().X1(sVar.a, ijVar.k);
                f10Var.L.remove(sVar);
                org.telegram.messenger.g0.i3(vn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                break;
            case 2:
                ww.p0((ww) this.c, (org.telegram.ui.ActionBar.u1) this.e, (TLObject) this.f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.b, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 3:
                TLObject tLObject2 = (TLObject) this.f;
                Context context = (Context) this.c;
                di.i0 i0Var = (di.i0) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                oy0 oy0Var = new oy0(context, i0Var, this.b, bArr);
                oy0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject2);
                oy0Var.r1 = new iy0(aVar, hcVar, context, i0Var, dVar);
                oy0Var.show();
                break;
            default:
                ((WalletEngine2) this.c).lambda$prepareSend$50((byte[]) this.d, (String) this.e, this.b, (byte[]) this.f, (byte[]) this.h, (String) this.n, (x10) this.r);
                break;
        }
    }

    public /* synthetic */ m4(f10 f10Var, ij ijVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, vn0 vn0Var, long j3) {
        this.c = f10Var;
        this.d = ijVar;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = sVar;
        this.r = vn0Var;
        this.b = j3;
    }

    public /* synthetic */ m4(TLObject tLObject, Context context, di.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, org.telegram.messenger.video.d dVar) {
        this.f = tLObject;
        this.c = context;
        this.d = i0Var;
        this.b = j3;
        this.e = bArr;
        this.h = aVar;
        this.n = hcVar;
        this.r = dVar;
    }

    public /* synthetic */ m4(ww wwVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = wwVar;
        this.e = u1Var;
        this.f = tLObject;
        this.d = user;
        this.h = chat;
        this.b = j3;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ m4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, x10 x10Var) {
        this.c = walletEngine2;
        this.d = bArr;
        this.e = str;
        this.b = j3;
        this.f = bArr2;
        this.h = bArr3;
        this.n = str2;
        this.r = x10Var;
    }
}
