package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ci;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y4 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y4(int i7, gc gcVar, long j3) {
        this.a = 1;
        this.b = i7;
        this.d = gcVar;
        this.c = j3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        TLRPC.StickerSet stickerSet;
        int i7 = this.a;
        long j3 = this.c;
        int i10 = this.b;
        Object obj2 = this.d;
        int i11 = 1;
        switch (i7) {
            case 0:
                a5 a5Var = (a5) obj2;
                Long l10 = (Long) obj;
                if (!a5Var.J) {
                    final Context context = a5Var.getContext();
                    final int i12 = a5Var.a;
                    final TL_stars.TL_starGiftUnique tL_starGiftUnique = a5Var.m1;
                    final long j10 = a5Var.n1;
                    long longValue = l10.longValue();
                    final org.telegram.ui.ActionBar.i6 i6Var = a5Var.J0;
                    hi.d dVar = a5Var.w1;
                    Objects.requireNonNull(dVar);
                    final ai.g0 g0Var = new ai.g0(dVar, 3);
                    final lc lcVar = new lc(a5Var.c, a5Var.J0);
                    final x4 x4Var = new x4(a5Var, i11);
                    final x4 x4Var2 = new x4(a5Var, 2);
                    HashMap hashMap = f4.a;
                    TL_stars.sendStarGiftOnchainOffer sendstargiftonchainoffer = new TL_stars.sendStarGiftOnchainOffer();
                    sendstargiftonchainoffer.slug = tL_starGiftUnique.slug;
                    final long j11 = this.c;
                    sendstargiftonchainoffer.amount = j11;
                    sendstargiftonchainoffer.duration = i10;
                    sendstargiftonchainoffer.random_id = longValue;
                    v4.h(tL_starGiftUnique);
                    g0Var.a(Boolean.TRUE);
                    ConnectionsManager.getInstance(i12).sendRequestTyped(sendstargiftonchainoffer, new d3.b(1), new q10() { // from class: bi.z3
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v0 */
                        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String, org.telegram.ui.Components.by0[], org.telegram.ui.Components.nc[]] */
                        /* JADX WARN: Type inference failed for: r13v5 */
                        @Override // org.telegram.messenger.q10
                        public final void a(Object obj3, Object obj4) {
                            org.telegram.ui.ActionBar.i6 i6Var2;
                            o3 o3Var;
                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj3;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                            ai.g0.this.a(Boolean.FALSE);
                            int i13 = i12;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            Context context2 = context;
                            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var;
                            lc lcVar2 = lcVar;
                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                if (tL_error != null && "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT".equals(tL_error.text)) {
                                    String str = tL_starGiftUnique2.slug;
                                    tr a02 = tr.a0(i13);
                                    a02.a.c(new rq(6, a02, str));
                                }
                                v4.r(context2, i13, i6Var3, lcVar2, tL_error, null);
                                return;
                            }
                            org.telegram.ui.Wallet.p0 o4 = f4.o(context2, i6Var3, lcVar2, i13, tL_payments_starGiftOnchainOfferTx);
                            if (o4 == null) {
                                return;
                            }
                            String h = v4.h(tL_starGiftUnique2);
                            o3 o3Var2 = new o3(i13, context2, tL_starGiftUnique2, i6Var3);
                            long j12 = j10;
                            String s5 = j12 != 0 ? org.telegram.messenger.n5.s(i13, j12) : null;
                            o3Var2.k1(org.telegram.messenger.g0.W2(!TextUtils.isEmpty(s5) ? gd.a0(null, null, 2131749607, s5, h) : gd.a0(null, null, 2131749608, h)), gd.M0(2131749606, null));
                            int f10 = v4.f(tL_starGiftUnique2);
                            long j13 = j11;
                            long n10 = v4.n(f10, j13);
                            long j14 = o4.b;
                            long j15 = ((j14 + 99999) / 100000) * 100000;
                            long max = Math.max(0L, j15 - j13);
                            ?? r13 = 0;
                            String M0 = gd.M0(2131749573, null);
                            SpannableStringBuilder i14 = v4.i(j13 - n10);
                            cy0 cy0Var = o3Var2.Z1;
                            cy0Var.e(M0, i14, null, null);
                            if (n10 > 0) {
                                r13 = 0;
                                cy0Var.e(gd.M0(2131749575, null), TextUtils.concat(v4.i(n10), " ", oc.b(v4.g(f10), null, i6Var3, null)), null, null);
                            }
                            if (j14 > j13) {
                                cy0Var.e(gd.M0(2131749540, r13), v4.i(max), r13, r13);
                            }
                            cy0Var.e(gd.M0(2131749574, r13), v4.i(j15), r13, r13);
                            cy0Var.e(gd.M0(2131749532, r13), h, r13, r13);
                            int i15 = tL_payments_starGiftOnchainOfferTx.expires_at;
                            if (i15 > 0) {
                                o3Var = o3Var2;
                                i6Var2 = i6Var3;
                                cy0Var.e(gd.M0(2131749576, r13), gd.x(i15, true), r13, r13);
                            } else {
                                i6Var2 = i6Var3;
                                o3Var = o3Var2;
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
                            o4.h = walletonchaingiftactionoffercreate;
                            o4.i = tL_starGiftUnique2;
                            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.M0(2131749579, null));
                            k80 k80Var = o3Var.a2;
                            k80Var.setText(W2);
                            k80Var.setVisibility(TextUtils.isEmpty(W2) ? 8 : 0);
                            o3Var.q2 = 2131749614;
                            o3Var.j1(o4);
                            o3Var.t2 = new ai.a1(x4Var2, o4, i15, 2);
                            o3 o3Var3 = o3Var;
                            o3Var3.i1(new a3.f(x4Var, 25), new ai.g0(tL_starGiftUnique2, 2), new s3(context2, i13, i6Var2, o3Var3, 1));
                            o3Var3.show();
                        }
                    });
                    break;
                }
                break;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                org.telegram.messenger.g0.h3(new ci(18, (gc) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? gd.M0(2131754433, null) : i10 == 1 ? org.telegram.messenger.g0.W2(gd.a0("TopicContainsEmojiPackSingle", null, 2131743787, stickerSet.title)) : i10 == 2 ? org.telegram.messenger.g0.W2(gd.a0("StoryContainsEmojiPackSingle", null, 2131744464, stickerSet.title)) : org.telegram.messenger.g0.W2(gd.a0("MessageContainsEmojiPackSingle", null, 2131748404, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                break;
            default:
                ((gt0) obj2).getStoriesController().b(i10, j3, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ y4(KeyEvent.Callback callback, long j3, int i7, int i10) {
        this.a = i10;
        this.d = callback;
        this.c = j3;
        this.b = i7;
    }
}
