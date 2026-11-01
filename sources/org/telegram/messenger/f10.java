package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.b01;
import org.telegram.ui.hp0;
import org.telegram.ui.vz0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class f10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ f10(Object obj, Object obj2, Object obj3, long j10, byte[] bArr, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
        this.f = bArr;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u10 u10Var = (u10) this.c;
                kj kjVar = (kj) this.d;
                String str = (String) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) this.h;
                c3.s sVar = (c3.s) this.n;
                hp0 hp0Var = (hp0) this.r;
                u10Var.getClass();
                TLRPC.Message message = kjVar.k;
                message.translatedToLanguage = str;
                message.translatedText = n31.P0(tL_textWithEntities, tL_textWithEntities2);
                u10Var.getMessagesStorage().X1(sVar.a, kjVar.k);
                u10Var.L.remove(sVar);
                i0.h3(hp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                break;
            case 1:
                org.telegram.ui.zx.p0((org.telegram.ui.zx) this.c, (org.telegram.ui.ActionBar.x1) this.d, (TLObject) this.e, (TLRPC.User) this.f, (TLRPC.Chat) this.h, this.b, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.c;
                Context context = (Context) this.d;
                so0 so0Var = (so0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                b01 b01Var = new b01(context, so0Var, this.b, bArr);
                b01Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
                b01Var.r1 = new vz0(aVar, ccVar, context, so0Var, dVar);
                b01Var.show();
                break;
            case 3:
                ((WalletEngine2) this.c).lambda$prepareSend$50((byte[]) this.d, (String) this.e, this.b, (byte[]) this.f, (byte[]) this.h, (String) this.n, (m20) this.r);
                break;
            default:
                rh.e4 e4Var = (rh.e4) this.c;
                gf.e eVar = (gf.e) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                CharSequence charSequence = (CharSequence) this.r;
                eVar.c(false);
                x1Var.dismiss();
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                        new rh.x7(e4Var.getContext(), e4Var.I0, this.b, 16, null, new rh.n(11, e4Var, charSequence), 0L).show();
                        break;
                    } else if (tL_error != null) {
                        e4Var.k().f0(tL_error, false);
                        break;
                    }
                } else {
                    int i10 = 0;
                    while (i10 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    TL_stars.SavedStarGift savedStarGift = e4Var.x2;
                    e4Var.k2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
                    i0.g3(new rh.n(10, e4Var, tL_starGiftUnique));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f10(u10 u10Var, kj kjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, c3.s sVar, hp0 hp0Var, long j10) {
        this.a = 0;
        this.c = u10Var;
        this.d = kjVar;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = sVar;
        this.r = hp0Var;
        this.b = j10;
    }

    public /* synthetic */ f10(org.telegram.ui.zx zxVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.a = 1;
        this.c = zxVar;
        this.d = x1Var;
        this.e = tLObject;
        this.f = user;
        this.h = chat;
        this.b = j10;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ f10(rh.e4 e4Var, gf.e eVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.a = 4;
        this.c = e4Var;
        this.d = eVar;
        this.e = x1Var;
        this.f = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.b = j10;
        this.r = charSequence;
    }
}
