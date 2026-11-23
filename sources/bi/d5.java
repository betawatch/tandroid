package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.ah;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d5(int i7, fc fcVar, long j3) {
        this.a = 1;
        this.b = i7;
        this.d = fcVar;
        this.c = j3;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        TLRPC.StickerSet stickerSet;
        int i7 = this.a;
        long j3 = this.c;
        int i10 = this.b;
        Object obj2 = this.d;
        int i11 = 1;
        switch (i7) {
            case 0:
                f5 f5Var = (f5) obj2;
                Long l10 = (Long) obj;
                if (!f5Var.J) {
                    final Context context = f5Var.getContext();
                    final int i12 = f5Var.a;
                    final TL_stars.TL_starGiftUnique tL_starGiftUnique = f5Var.m1;
                    final long j10 = f5Var.n1;
                    long longValue = l10.longValue();
                    final org.telegram.ui.ActionBar.i6 i6Var = f5Var.J0;
                    hi.e eVar = f5Var.w1;
                    Objects.requireNonNull(eVar);
                    final ai.d0 d0Var = new ai.d0(eVar, 3);
                    final kc kcVar = new kc(f5Var.c, f5Var.J0);
                    final c5 c5Var = new c5(f5Var, i11);
                    final c5 c5Var2 = new c5(f5Var, 2);
                    HashMap hashMap = l4.a;
                    TL_stars.sendStarGiftOnchainOffer sendstargiftonchainoffer = new TL_stars.sendStarGiftOnchainOffer();
                    sendstargiftonchainoffer.slug = tL_starGiftUnique.slug;
                    final long j11 = this.c;
                    sendstargiftonchainoffer.amount = j11;
                    sendstargiftonchainoffer.duration = i10;
                    sendstargiftonchainoffer.random_id = longValue;
                    a5.h(tL_starGiftUnique);
                    d0Var.a(Boolean.TRUE);
                    ConnectionsManager.getInstance(i12).sendRequestTyped(sendstargiftonchainoffer, new d3.b(1), new p10() { // from class: bi.f4
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v0 */
                        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String, org.telegram.ui.Components.cy0[], org.telegram.ui.Components.mc[]] */
                        /* JADX WARN: Type inference failed for: r13v5 */
                        @Override // org.telegram.messenger.p10
                        public final void a(Object obj3, Object obj4) {
                            org.telegram.ui.ActionBar.i6 i6Var2;
                            u3 u3Var;
                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj3;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                            ai.d0.this.a(Boolean.FALSE);
                            int i13 = i12;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            Context context2 = context;
                            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var;
                            kc kcVar2 = kcVar;
                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                if (tL_error != null && "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT".equals(tL_error.text)) {
                                    String str = tL_starGiftUnique2.slug;
                                    tr a02 = tr.a0(i13);
                                    a02.a.c(new rq(6, a02, str));
                                }
                                a5.r(context2, i13, i6Var3, kcVar2, tL_error, null);
                                return;
                            }
                            org.telegram.ui.Wallet.q0 q10 = l4.q(context2, i6Var3, kcVar2, i13, tL_payments_starGiftOnchainOfferTx);
                            if (q10 == null) {
                                return;
                            }
                            String h = a5.h(tL_starGiftUnique2);
                            u3 u3Var2 = new u3(i13, context2, tL_starGiftUnique2, i6Var3);
                            long j12 = j10;
                            String s5 = j12 != 0 ? org.telegram.messenger.n5.s(i13, j12) : null;
                            u3Var2.k1(org.telegram.messenger.g0.W2(!TextUtils.isEmpty(s5) ? gd.a0(null, null, 2131749606, s5, h) : gd.a0(null, null, 2131749607, h)), gd.N0(2131749605, null));
                            int f10 = a5.f(tL_starGiftUnique2);
                            long j13 = j11;
                            long n10 = a5.n(f10, j13);
                            long j14 = q10.b;
                            long j15 = ((j14 + 99999) / 100000) * 100000;
                            long max = Math.max(0L, j15 - j13);
                            ?? r13 = 0;
                            String N0 = gd.N0(2131749572, null);
                            SpannableStringBuilder i14 = a5.i(j13 - n10);
                            dy0 dy0Var = u3Var2.Z1;
                            dy0Var.e(N0, i14, null, null);
                            if (n10 > 0) {
                                r13 = 0;
                                dy0Var.e(gd.N0(2131749574, null), TextUtils.concat(a5.i(n10), " ", nc.b(a5.g(f10), null, i6Var3, null)), null, null);
                            }
                            if (j14 > j13) {
                                dy0Var.e(gd.N0(2131749539, r13), a5.i(max), r13, r13);
                            }
                            dy0Var.e(gd.N0(2131749573, r13), a5.i(j15), r13, r13);
                            dy0Var.e(gd.N0(2131749531, r13), h, r13, r13);
                            int i15 = tL_payments_starGiftOnchainOfferTx.expires_at;
                            if (i15 > 0) {
                                u3Var = u3Var2;
                                i6Var2 = i6Var3;
                                dy0Var.e(gd.N0(2131749575, r13), gd.x(i15, true), r13, r13);
                            } else {
                                i6Var2 = i6Var3;
                                u3Var = u3Var2;
                            }
                            TL_wallet.walletOnchainGiftActionOfferCreate walletonchaingiftactionoffercreate = new TL_wallet.walletOnchainGiftActionOfferCreate();
                            walletonchaingiftactionoffercreate.offer_address = tL_payments_starGiftOnchainOfferTx.offer_address;
                            if (!TextUtils.isEmpty(tL_starGiftUnique2.owner_address)) {
                                walletonchaingiftactionoffercreate.flags |= 1;
                                walletonchaingiftactionoffercreate.counterparty_address = tL_starGiftUnique2.owner_address;
                            }
                            walletonchaingiftactionoffercreate.price = j13;
                            walletonchaingiftactionoffercreate.amount = j14;
                            walletonchaingiftactionoffercreate.service_fee = n10;
                            if (i15 > 0) {
                                walletonchaingiftactionoffercreate.flags |= 2;
                                walletonchaingiftactionoffercreate.expires_at = i15;
                            }
                            q10.h = walletonchaingiftactionoffercreate;
                            q10.i = tL_starGiftUnique2;
                            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.N0(2131749578, null));
                            j80 j80Var = u3Var.a2;
                            j80Var.setText(W2);
                            j80Var.setVisibility(TextUtils.isEmpty(W2) ? 8 : 0);
                            u3Var.q2 = 2131749613;
                            u3Var.j1(q10);
                            u3Var.t2 = new ai.e1(c5Var2, q10, i15, 1);
                            u3 u3Var3 = u3Var;
                            u3Var3.i1(new a3.f(c5Var, 24), new ai.d0(tL_starGiftUnique2, 2), new y3(context2, i13, i6Var2, u3Var3, 1));
                            u3Var3.show();
                        }
                    });
                    break;
                }
                break;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                org.telegram.messenger.g0.h3(new ah(22, (fc) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? gd.N0(2131754432, null) : i10 == 1 ? org.telegram.messenger.g0.W2(gd.a0("TopicContainsEmojiPackSingle", null, 2131743777, stickerSet.title)) : i10 == 2 ? org.telegram.messenger.g0.W2(gd.a0("StoryContainsEmojiPackSingle", null, 2131744455, stickerSet.title)) : org.telegram.messenger.g0.W2(gd.a0("MessageContainsEmojiPackSingle", null, 2131748403, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                break;
            default:
                ((it0) obj2).getStoriesController().b(i10, j3, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ d5(KeyEvent.Callback callback, long j3, int i7, int i10) {
        this.a = i10;
        this.d = callback;
        this.c = j3;
        this.b = i7;
    }
}
