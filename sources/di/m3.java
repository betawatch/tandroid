package di;

import android.content.Context;
import org.telegram.messenger.a10;
import org.telegram.messenger.gj;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cx;
import org.telegram.ui.ky0;
import org.telegram.ui.qy0;
import org.telegram.ui.zn0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ m3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.c = f6Var;
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
                f6 f6Var = (f6) this.c;
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
                        new fb(f6Var.getContext(), f6Var.J0, this.b, 16, null, new f2(8, f6Var, charSequence), 0L).show();
                        break;
                    } else if (tL_error != null) {
                        f6Var.k().g0(tL_error, false);
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
                    TL_stars.SavedStarGift savedStarGift = f6Var.B2;
                    f6Var.x2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
                    org.telegram.messenger.g0.g3(new f2(7, f6Var, tL_starGiftUnique));
                    break;
                }
                break;
            case 1:
                a10 a10Var = (a10) this.c;
                gj gjVar = (gj) this.d;
                String str = (String) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) this.h;
                f3.s sVar = (f3.s) this.n;
                zn0 zn0Var = (zn0) this.r;
                a10Var.getClass();
                TLRPC.Message message = gjVar.k;
                message.translatedToLanguage = str;
                message.translatedText = b31.R0(tL_textWithEntities, tL_textWithEntities2);
                a10Var.getMessagesStorage().X1(sVar.a, gjVar.k);
                a10Var.M.remove(sVar);
                org.telegram.messenger.g0.h3(zn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                break;
            case 2:
                cx.F0((cx) this.c, (org.telegram.ui.ActionBar.t1) this.e, (TLObject) this.f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.b, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 3:
                TLObject tLObject2 = (TLObject) this.f;
                Context context = (Context) this.c;
                fi.h0 h0Var = (fi.h0) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                qy0 qy0Var = new qy0(context, h0Var, this.b, bArr);
                qy0Var.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject2);
                qy0Var.v1 = new ky0(aVar, lcVar, context, h0Var, dVar);
                qy0Var.show();
                break;
            default:
                ((WalletEngine2) this.c).lambda$prepareSend$53((byte[]) this.d, (String) this.e, this.b, (byte[]) this.f, (byte[]) this.h, (String) this.n, (t10) this.r);
                break;
        }
    }

    public /* synthetic */ m3(a10 a10Var, gj gjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, zn0 zn0Var, long j3) {
        this.c = a10Var;
        this.d = gjVar;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = sVar;
        this.r = zn0Var;
        this.b = j3;
    }

    public /* synthetic */ m3(TLObject tLObject, Context context, fi.h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, org.telegram.messenger.video.d dVar) {
        this.f = tLObject;
        this.c = context;
        this.d = h0Var;
        this.b = j3;
        this.e = bArr;
        this.h = aVar;
        this.n = lcVar;
        this.r = dVar;
    }

    public /* synthetic */ m3(cx cxVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = cxVar;
        this.e = t1Var;
        this.f = tLObject;
        this.d = user;
        this.h = chat;
        this.b = j3;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ m3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, t10 t10Var) {
        this.c = walletEngine2;
        this.d = bArr;
        this.e = str;
        this.b = j3;
        this.f = bArr2;
        this.h = bArr3;
        this.n = str2;
        this.r = t10Var;
    }
}
