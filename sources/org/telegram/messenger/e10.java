package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.c01;
import org.telegram.ui.jp0;
import org.telegram.ui.wz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ e10(Object obj, Object obj2, Object obj3, long j10, byte[] bArr, Object obj4, Object obj5, Object obj6, int i10) {
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
                t10 t10Var = (t10) this.c;
                jj jjVar = (jj) this.d;
                String str = (String) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) this.h;
                c3.s sVar = (c3.s) this.n;
                jp0 jp0Var = (jp0) this.r;
                t10Var.getClass();
                TLRPC.Message message = jjVar.k;
                message.translatedToLanguage = str;
                message.translatedText = m31.P0(tL_textWithEntities, tL_textWithEntities2);
                t10Var.getMessagesStorage().X1(sVar.a, jjVar.k);
                t10Var.L.remove(sVar);
                i0.h3(jp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                break;
            case 1:
                org.telegram.ui.ay.o0((org.telegram.ui.ay) this.c, (org.telegram.ui.ActionBar.x1) this.d, (TLObject) this.e, (TLRPC.User) this.f, (TLRPC.Chat) this.h, this.b, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.c;
                Context context = (Context) this.d;
                ro0 ro0Var = (ro0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                c01 c01Var = new c01(context, ro0Var, this.b, bArr);
                c01Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
                c01Var.r1 = new wz0(aVar, ccVar, context, ro0Var, dVar);
                c01Var.show();
                break;
            case 3:
                ((WalletEngine2) this.c).lambda$prepareSend$50((byte[]) this.d, (String) this.e, this.b, (byte[]) this.f, (byte[]) this.h, (String) this.n, (l20) this.r);
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
                        new rh.x7(e4Var.getContext(), e4Var.I0, this.b, 16, null, new rh.o(10, e4Var, charSequence), 0L).show();
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
                    i0.g3(new rh.o(9, e4Var, tL_starGiftUnique));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e10(t10 t10Var, jj jjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, c3.s sVar, jp0 jp0Var, long j10) {
        this.a = 0;
        this.c = t10Var;
        this.d = jjVar;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = sVar;
        this.r = jp0Var;
        this.b = j10;
    }

    public /* synthetic */ e10(org.telegram.ui.ay ayVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.a = 1;
        this.c = ayVar;
        this.d = x1Var;
        this.e = tLObject;
        this.f = user;
        this.h = chat;
        this.b = j10;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ e10(rh.e4 e4Var, gf.e eVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
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
