package di;

import android.content.Context;
import org.telegram.messenger.c10;
import org.telegram.messenger.gj;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.gy0;
import org.telegram.ui.my0;
import org.telegram.ui.wn0;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ n3(c6 c6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.c = c6Var;
        this.d = bVar;
        this.e = t1Var;
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
                c6 c6Var = (c6) this.c;
                vf.b bVar = (vf.b) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                TLObject tLObject = (TLObject) this.f;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                CharSequence charSequence = (CharSequence) this.r;
                bVar.c(false);
                t1Var.dismiss();
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                        new bb(c6Var.getContext(), c6Var.J0, this.b, 16, null, new s2(6, c6Var, charSequence), 0L).show();
                        break;
                    } else if (tL_error != null) {
                        c6Var.k().f0(tL_error, false);
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
                    TL_stars.SavedStarGift savedStarGift = c6Var.B2;
                    c6Var.l2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
                    org.telegram.messenger.g0.h3(new s2(5, c6Var, tL_starGiftUnique));
                    break;
                }
                break;
            case 1:
                c10 c10Var = (c10) this.c;
                gj gjVar = (gj) this.d;
                String str = (String) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) this.h;
                f3.s sVar = (f3.s) this.n;
                wn0 wn0Var = (wn0) this.r;
                c10Var.getClass();
                TLRPC.Message message = gjVar.k;
                message.translatedToLanguage = str;
                message.translatedText = p21.Q0(tL_textWithEntities, tL_textWithEntities2);
                c10Var.getMessagesStorage().X1(sVar.a, gjVar.k);
                c10Var.M.remove(sVar);
                org.telegram.messenger.g0.i3(wn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                break;
            case 2:
                yw.p0((yw) this.c, (org.telegram.ui.ActionBar.t1) this.e, (TLObject) this.f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.b, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 3:
                TLObject tLObject2 = (TLObject) this.f;
                Context context = (Context) this.c;
                fi.i0 i0Var = (fi.i0) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                my0 my0Var = new my0(context, i0Var, this.b, bArr);
                my0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject2);
                my0Var.v1 = new gy0(aVar, ccVar, context, i0Var, dVar);
                my0Var.show();
                break;
            default:
                ((WalletEngine2) this.c).lambda$prepareSend$50((byte[]) this.d, (String) this.e, this.b, (byte[]) this.f, (byte[]) this.h, (String) this.n, (u10) this.r);
                break;
        }
    }

    public /* synthetic */ n3(c10 c10Var, gj gjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, wn0 wn0Var, long j3) {
        this.c = c10Var;
        this.d = gjVar;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = sVar;
        this.r = wn0Var;
        this.b = j3;
    }

    public /* synthetic */ n3(TLObject tLObject, Context context, fi.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, org.telegram.messenger.video.d dVar) {
        this.f = tLObject;
        this.c = context;
        this.d = i0Var;
        this.b = j3;
        this.e = bArr;
        this.h = aVar;
        this.n = ccVar;
        this.r = dVar;
    }

    public /* synthetic */ n3(yw ywVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = ywVar;
        this.e = t1Var;
        this.f = tLObject;
        this.d = user;
        this.h = chat;
        this.b = j3;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ n3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, u10 u10Var) {
        this.c = walletEngine2;
        this.d = bArr;
        this.e = str;
        this.b = j3;
        this.f = bArr2;
        this.h = bArr3;
        this.n = str2;
        this.r = u10Var;
    }
}
