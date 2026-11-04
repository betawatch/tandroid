package ci;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.messenger.x00;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ey0;
import org.telegram.ui.qn0;
import org.telegram.ui.uw;
import org.telegram.ui.yx0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ w3(l6 l6Var, sf.b bVar, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.c = l6Var;
        this.d = bVar;
        this.e = s1Var;
        this.f = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.b = j10;
        this.r = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.c;
                sf.b bVar = (sf.b) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.e;
                TLObject tLObject = (TLObject) this.f;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                CharSequence charSequence = (CharSequence) this.r;
                bVar.c(false);
                s1Var.dismiss();
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                        new mb(l6Var.getContext(), l6Var.J0, this.b, 16, null, new e0(11, l6Var, charSequence), 0L).show();
                        break;
                    } else if (tL_error != null) {
                        l6Var.k().f0(tL_error, false);
                        break;
                    }
                } else {
                    int i3 = 0;
                    while (i3 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i3) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i3);
                            i3--;
                        }
                        i3++;
                    }
                    TL_stars.SavedStarGift savedStarGift = l6Var.y2;
                    l6Var.k2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
                    org.telegram.messenger.g0.h3(new e0(10, l6Var, tL_starGiftUnique));
                    break;
                }
                break;
            case 1:
                x00 x00Var = (x00) this.c;
                zi ziVar = (zi) this.d;
                String str = (String) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) this.h;
                e3.s sVar = (e3.s) this.n;
                qn0 qn0Var = (qn0) this.r;
                x00Var.getClass();
                TLRPC.Message message = ziVar.k;
                message.translatedToLanguage = str;
                message.translatedText = f21.P0(tL_textWithEntities, tL_textWithEntities2);
                x00Var.getMessagesStorage().X1(sVar.a, ziVar.k);
                x00Var.M.remove(sVar);
                org.telegram.messenger.g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                break;
            case 2:
                uw.p0((uw) this.c, (org.telegram.ui.ActionBar.s1) this.e, (TLObject) this.f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.b, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 3:
                TLObject tLObject2 = (TLObject) this.f;
                Context context = (Context) this.c;
                ei.k0 k0Var = (ei.k0) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                ey0 ey0Var = new ey0(context, k0Var, this.b, bArr);
                ey0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject2);
                ey0Var.s1 = new yx0(aVar, fcVar, context, k0Var, dVar);
                ey0Var.show();
                break;
            default:
                ((WalletEngine2) this.c).lambda$prepareSend$50((byte[]) this.d, (String) this.e, this.b, (byte[]) this.f, (byte[]) this.h, (String) this.n, (p10) this.r);
                break;
        }
    }

    public /* synthetic */ w3(x00 x00Var, zi ziVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, e3.s sVar, qn0 qn0Var, long j10) {
        this.c = x00Var;
        this.d = ziVar;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = sVar;
        this.r = qn0Var;
        this.b = j10;
    }

    public /* synthetic */ w3(TLObject tLObject, Context context, ei.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.fc fcVar, org.telegram.messenger.video.d dVar) {
        this.f = tLObject;
        this.c = context;
        this.d = k0Var;
        this.b = j10;
        this.e = bArr;
        this.h = aVar;
        this.n = fcVar;
        this.r = dVar;
    }

    public /* synthetic */ w3(uw uwVar, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = uwVar;
        this.e = s1Var;
        this.f = tLObject;
        this.d = user;
        this.h = chat;
        this.b = j10;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ w3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, p10 p10Var) {
        this.c = walletEngine2;
        this.d = bArr;
        this.e = str;
        this.b = j10;
        this.f = bArr2;
        this.h = bArr3;
        this.n = str2;
        this.r = p10Var;
    }
}
