package ai;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bi.c4;
import bi.e4;
import bi.o3;
import bi.u4;
import java.util.ArrayList;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements q10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ q1(long j3, Context context, int i7, i6 i6Var, lc lcVar, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.b = j3;
        this.d = context;
        this.c = i7;
        this.e = i6Var;
        this.f = lcVar;
        this.g = tL_messageActionStarGiftOnchainOffer;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i7 = this.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        long j3 = this.b;
        switch (i7) {
            case 0:
                c2 c2Var = (c2) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c2Var.S = false;
                c2Var.U = -1;
                if (!c2Var.j) {
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        Log.d("Dictation", "clean done in " + (SystemClock.elapsedRealtime() - j3) + " ms: " + i2.c(tL_composedMessageWithAI.result_text.text));
                        String n10 = c2Var.g.n();
                        int i10 = this.c;
                        if (n10.startsWith(str, i10)) {
                            ArrayList arrayList = c2Var.Q;
                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                            m10.append(tL_composedMessageWithAI.result_text.text.trim());
                            m10.append(str3);
                            arrayList.add(new z1(i10, str, m10.toString()));
                            c2Var.R = str.length() + i10;
                            c2Var.e();
                            break;
                        }
                    } else {
                        p5.c.t(new StringBuilder("clean failed: "), tL_error != null ? tL_error.text : null, "Dictation");
                        break;
                    }
                }
                break;
            default:
                Context context = (Context) obj6;
                i6 i6Var = (i6) obj5;
                lc lcVar = (lc) obj4;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i11 = this.c;
                if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                    org.telegram.ui.Wallet.p0 q10 = e4.q(context, i6Var, lcVar, i11, tL_payments_starGiftOnchainOfferTx);
                    if (q10 != null) {
                        c4 c4Var = new c4(context, i11, tL_messageActionStarGiftOnchainOffer, tL_payments_starGiftOnchainOfferTx, q10, i6Var, lcVar);
                        int i12 = o3.x2;
                        boolean[] zArr = new boolean[1];
                        aa.r rVar = new aa.r(zArr, new Runnable[]{org.telegram.ui.Wallet.u0.D(i11).l(q10, new bi.h0(zArr, rVar, c4Var, 1))}, c4Var, 8);
                        org.telegram.messenger.g0.h3(rVar, 5000L);
                        break;
                    } else {
                        e4.g(j3);
                        break;
                    }
                } else {
                    e4.g(j3);
                    u4.r(context, i11, i6Var, lcVar, tL_error2, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q1(c2 c2Var, long j3, String str, int i7, String str2, String str3) {
        this.d = c2Var;
        this.b = j3;
        this.e = str;
        this.c = i7;
        this.f = str2;
        this.g = str3;
    }
}
