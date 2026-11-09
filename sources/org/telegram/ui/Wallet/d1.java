package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.k90;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                int i7 = 0;
                d2 d2Var = (d2) this.b;
                k90 k90Var = (k90) this.d;
                String str = (String) this.c;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error != null || tonconnectsession2 == null) {
                    k90Var.a(null, d2.z(tL_error, "createSession"));
                    break;
                } else {
                    ArrayList arrayList = d2Var.d;
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.id == tonconnectsession2.id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            d2Var.p(tonconnectsession);
                            k90Var.a(new y1(tonconnectsession, str, str2, str3, str4), null);
                            break;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    d2Var.p(tonconnectsession);
                    k90Var.a(new y1(tonconnectsession, str, str2, str3, str4), null);
                }
                break;
            case 1:
                d2 d2Var2 = (d2) this.b;
                s sVar = (s) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.e;
                String str5 = (String) this.c;
                byte[] bArr = (byte[]) this.f;
                y1 y1Var = (y1) this.g;
                i0 i0Var = (i0) obj;
                String str6 = (String) obj2;
                d2Var2.getClass();
                if (str6 == null && i0Var != null) {
                    i0 b10 = i0Var.b();
                    Utilities.e.c(new bi.r7(d2Var2, b10, tonconnectsession4, str5, bArr, y1Var, new s(3, b10, sVar), 11));
                    break;
                } else {
                    if (str6 == null) {
                        str6 = "Recovery phrase is unavailable";
                    }
                    sVar.a(str6);
                    break;
                }
            case 2:
                d2 d2Var3 = (d2) this.b;
                s sVar2 = (s) this.d;
                i0 i0Var2 = (i0) this.e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f;
                String str7 = (String) this.c;
                byte[] bArr2 = (byte[]) this.g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.e.c(new bi.r7(d2Var3, i0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, sVar2, 12));
                    break;
                } else {
                    sVar2.a(d2.z(tL_error2, "getNextEventId"));
                    break;
                }
            case 3:
                d2 d2Var4 = (d2) this.b;
                bi.p5 p5Var = (bi.p5) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str8 = (String) this.c;
                byte[] bArr3 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = d2Var4.b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.id != tL_urlAuthResultRequest.tc_session_id || !tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) || tonconnectsession6.closed || tonconnectsession6.closing || tonconnectsession6.nonce == null || !TextUtils.equals(str8, l0Var.t()) || !Arrays.equals(bArr3, l0Var.y())) {
                        p5Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        break;
                    } else {
                        l0Var.z(new c1(d2Var4, p5Var, tonconnectsession6, str8, bArr3, jSONArray, tL_urlAuthResultRequest), true, false);
                        break;
                    }
                } else {
                    p5Var.a(null, d2.z(tL_error3, "createSession"));
                    break;
                }
            default:
                s2 s2Var = (s2) this.b;
                int[] iArr = (int[]) this.d;
                l0 l0Var2 = (l0) this.c;
                TextView textView = (TextView) this.e;
                c2 c2Var = (c2) this.f;
                e7 e7Var = (e7) this.g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!s2Var.e && !s2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n10 = l0.n(wallettransaction.fee, true);
                        CharSequence m10 = l0Var2.m(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(m10) ? id.V(null, null, 2131743120, n10) : id.V(null, null, 2131743119, n10, m10));
                    } else if (l0Var2.v() < c2Var.c) {
                        iArr[0] = 2;
                        textView.setText(id.M0(2131743066, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(id.M0(2131742986, null));
                        if (str9 != null) {
                            d2.m("widget preview", str9);
                        }
                    }
                    e7Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d1(d2 d2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i7) {
        this.a = i7;
        this.b = d2Var;
        this.d = obj;
        this.e = tLObject;
        this.c = str;
        this.f = bArr;
        this.g = obj2;
    }

    public /* synthetic */ d1(d2 d2Var, s sVar, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.a = 2;
        this.b = d2Var;
        this.d = sVar;
        this.e = i0Var;
        this.f = tonconnectsession;
        this.c = str;
        this.g = bArr;
    }
}
