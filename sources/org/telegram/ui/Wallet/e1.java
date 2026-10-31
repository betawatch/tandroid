package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;
import org.telegram.ui.na0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.a) {
            case 0:
                int i10 = 0;
                e2 e2Var = (e2) this.b;
                na0 na0Var = (na0) this.d;
                String str = (String) this.c;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error != null || tonconnectsession2 == null) {
                    na0Var.a(null, e2.z(tL_error, "createSession"));
                    break;
                } else {
                    ArrayList arrayList = e2Var.d;
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.id == tonconnectsession2.id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            e2Var.p(tonconnectsession);
                            na0Var.a(new z1(tonconnectsession, str, str2, str3, str4), null);
                            break;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    e2Var.p(tonconnectsession);
                    na0Var.a(new z1(tonconnectsession, str, str2, str3, str4), null);
                }
                break;
            case 1:
                e2 e2Var2 = (e2) this.b;
                f11 f11Var = (f11) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.e;
                String str5 = (String) this.c;
                byte[] bArr = (byte[]) this.f;
                z1 z1Var = (z1) this.g;
                h0 h0Var = (h0) obj;
                String str6 = (String) obj2;
                e2Var2.getClass();
                if (str6 == null && h0Var != null) {
                    h0 b10 = h0Var.b();
                    Utilities.e.c(new mg.c0(e2Var2, b10, tonconnectsession4, str5, bArr, z1Var, new f11(9, b10, f11Var), 9));
                    break;
                } else {
                    if (str6 == null) {
                        str6 = "Recovery phrase is unavailable";
                    }
                    f11Var.a(str6);
                    break;
                }
            case 2:
                e2 e2Var3 = (e2) this.b;
                f11 f11Var2 = (f11) this.d;
                h0 h0Var2 = (h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f;
                String str7 = (String) this.c;
                byte[] bArr2 = (byte[]) this.g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.e.c(new mg.c0(e2Var3, h0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, f11Var2, 10));
                    break;
                } else {
                    f11Var2.a(e2.z(tL_error2, "getNextEventId"));
                    break;
                }
            case 3:
                e2 e2Var4 = (e2) this.b;
                ih.s sVar = (ih.s) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str8 = (String) this.c;
                byte[] bArr3 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = e2Var4.b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.id != tL_urlAuthResultRequest.tc_session_id || !tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) || tonconnectsession6.closed || tonconnectsession6.closing || tonconnectsession6.nonce == null || !TextUtils.equals(str8, k0Var.t()) || !Arrays.equals(bArr3, k0Var.y())) {
                        sVar.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        break;
                    } else {
                        k0Var.z(new d1(e2Var4, sVar, tonconnectsession6, str8, bArr3, jSONArray, tL_urlAuthResultRequest), true, false);
                        break;
                    }
                } else {
                    sVar.a(null, e2.z(tL_error3, "createSession"));
                    break;
                }
            default:
                t2 t2Var = (t2) this.b;
                int[] iArr = (int[]) this.d;
                k0 k0Var2 = (k0) this.c;
                TextView textView = (TextView) this.e;
                d2 d2Var = (d2) this.f;
                k7 k7Var = (k7) this.g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!t2Var.e && !t2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n10 = k0.n(wallettransaction.fee, true);
                        CharSequence m10 = k0Var2.m(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(m10) ? cd.V(null, null, 2131743146, n10) : cd.V(null, null, 2131743145, n10, m10));
                    } else if (k0Var2.v() < d2Var.c) {
                        iArr[0] = 2;
                        textView.setText(cd.L0(2131743092, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(cd.L0(2131743012, null));
                        if (str9 != null) {
                            e2.m("widget preview", str9);
                        }
                    }
                    k7Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e1(e2 e2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.a = i10;
        this.b = e2Var;
        this.d = obj;
        this.e = tLObject;
        this.c = str;
        this.f = bArr;
        this.g = obj2;
    }

    public /* synthetic */ e1(e2 e2Var, f11 f11Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.a = 2;
        this.b = e2Var;
        this.d = f11Var;
        this.e = h0Var;
        this.f = tonconnectsession;
        this.c = str;
        this.g = bArr;
    }
}
