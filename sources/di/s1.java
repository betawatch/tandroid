package di;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;
import org.telegram.ui.l90;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = serializable;
        this.g = obj5;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        l90 l90Var;
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                TextView textView = (TextView) this.d;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.e;
                Runnable[] runnableArr = (Runnable[]) this.f;
                long[] jArr = (long[]) this.g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (!zArr[0]) {
                    if (stargiftdepositpayload != null) {
                        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                        if (org.telegram.ui.Wallet.v0.D(f6Var.a).A() >= stargiftdepositpayload.amount) {
                            runnableArr[0] = org.telegram.ui.Wallet.v0.D(f6Var.a).k(stargiftdepositpayload, new bi.r6(2, textView, jArr));
                            break;
                        } else {
                            textView.setVisibility(8);
                            break;
                        }
                    } else {
                        textView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.b;
                l90 l90Var2 = (l90) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m2Var.getClass();
                if (tL_error != null || tonconnectsession2 == null) {
                    l90Var2.a(null, org.telegram.ui.Wallet.m2.z(tL_error, "createSession"));
                    break;
                } else {
                    ArrayList arrayList = m2Var.d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            tonconnectsession = (TL_wallet.tonConnectSession) obj3;
                            l90Var = l90Var2;
                            if (tonconnectsession.id != tonconnectsession2.id || (tonconnectsession.manifest == null && tonconnectsession.manifest_error == null && !tonconnectsession.closed && !tonconnectsession.closing)) {
                                l90Var2 = l90Var;
                            }
                        } else {
                            l90Var = l90Var2;
                            tonconnectsession = tonconnectsession2;
                        }
                    }
                    m2Var.p(tonconnectsession);
                    l90Var.a(new org.telegram.ui.Wallet.h2(tonconnectsession, str, str2, str3, str4), null);
                }
                break;
            case 2:
                org.telegram.ui.Wallet.m2 m2Var2 = (org.telegram.ui.Wallet.m2) this.b;
                a31 a31Var = (a31) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str5 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.g;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) obj;
                String str6 = (String) obj2;
                m2Var2.getClass();
                if (str6 == null && s0Var != null) {
                    org.telegram.ui.Wallet.s0 b10 = s0Var.b();
                    Utilities.e.c(new m6(m2Var2, b10, tonconnectsession3, str5, bArr, h2Var, new a31(12, b10, a31Var), 11));
                    break;
                } else {
                    if (str6 == null) {
                        str6 = "Recovery phrase is unavailable";
                    }
                    a31Var.a(str6);
                    break;
                }
            case 3:
                org.telegram.ui.Wallet.m2 m2Var3 = (org.telegram.ui.Wallet.m2) this.b;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.c;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                String str7 = (String) this.e;
                byte[] bArr2 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.g;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.Wallet.v0 v0Var = m2Var3.b;
                if (tL_error2 == null && tonconnectsession4 != null) {
                    if (tonconnectsession4.id != tL_urlAuthResultRequest.tc_session_id || !tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession4.dapp_client_id) || tonconnectsession4.closed || tonconnectsession4.closing || tonconnectsession4.nonce == null || !TextUtils.equals(str7, v0Var.y()) || !Arrays.equals(bArr2, v0Var.E())) {
                        f0Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        break;
                    } else {
                        v0Var.F(true, false, false, new org.telegram.ui.Wallet.m1(m2Var3, f0Var, tonconnectsession4, str7, bArr2, jSONArray, tL_urlAuthResultRequest));
                        break;
                    }
                } else {
                    f0Var.a(null, org.telegram.ui.Wallet.m2.z(tL_error2, "createSession"));
                    break;
                }
            case 4:
                org.telegram.ui.Wallet.m2 m2Var4 = (org.telegram.ui.Wallet.m2) this.b;
                a31 a31Var2 = (a31) this.c;
                org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) this.d;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.e;
                String str8 = (String) this.f;
                byte[] bArr3 = (byte[]) this.g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m2Var4.getClass();
                if (tL_error3 == null && tonconnectnexteventid != null) {
                    Utilities.e.c(new m6(m2Var4, s0Var2, tonconnectsession5, str8, bArr3, tonconnectnexteventid, a31Var2, 13));
                    break;
                } else {
                    a31Var2.a(org.telegram.ui.Wallet.m2.z(tL_error3, "getNextEventId"));
                    break;
                }
            default:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.b;
                int[] iArr = (int[]) this.c;
                org.telegram.ui.Wallet.v0 v0Var2 = (org.telegram.ui.Wallet.v0) this.e;
                TextView textView2 = (TextView) this.d;
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f;
                org.telegram.ui.Wallet.w7 w7Var = (org.telegram.ui.Wallet.w7) this.g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!z2Var.e && !z2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.v0.s(wallettransaction.fee, true);
                        CharSequence r10 = v0Var2.r(wallettransaction.fee, true);
                        textView2.setText(TextUtils.isEmpty(r10) ? gd.V(null, null, 2131742868, s5) : gd.V(null, null, 2131742867, s5, r10));
                    } else if (v0Var2.A() < l2Var.c) {
                        iArr[0] = 2;
                        textView2.setText(gd.N0(2131742814, null));
                    } else {
                        iArr[0] = 3;
                        textView2.setText(gd.N0(2131742715, null));
                        if (str9 != null) {
                            org.telegram.ui.Wallet.m2.m("widget preview", str9);
                        }
                    }
                    w7Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s1(org.telegram.ui.Wallet.z2 z2Var, int[] iArr, org.telegram.ui.Wallet.v0 v0Var, TextView textView, org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.w7 w7Var) {
        this.a = 5;
        this.b = z2Var;
        this.c = iArr;
        this.e = v0Var;
        this.d = textView;
        this.f = l2Var;
        this.g = w7Var;
    }
}
