package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.i90;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
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
                f2 f2Var = (f2) this.b;
                i90 i90Var = (i90) this.d;
                String str = (String) this.c;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f2Var.getClass();
                if (tL_error != null || tonconnectsession2 == null) {
                    i90Var.a(null, f2.z(tL_error, "createSession"));
                    break;
                } else {
                    ArrayList arrayList = f2Var.d;
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.id == tonconnectsession2.id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            f2Var.p(tonconnectsession);
                            i90Var.a(new a2(tonconnectsession, str, str2, str3, str4), null);
                            break;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    f2Var.p(tonconnectsession);
                    i90Var.a(new a2(tonconnectsession, str, str2, str3, str4), null);
                }
                break;
            case 1:
                f2 f2Var2 = (f2) this.b;
                t tVar = (t) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.e;
                String str5 = (String) this.c;
                byte[] bArr = (byte[]) this.f;
                a2 a2Var = (a2) this.g;
                k0 k0Var = (k0) obj;
                String str6 = (String) obj2;
                f2Var2.getClass();
                if (str6 == null && k0Var != null) {
                    k0 b10 = k0Var.b();
                    Utilities.e.c(new bi.r7(f2Var2, b10, tonconnectsession4, str5, bArr, a2Var, new t(3, b10, tVar), 11));
                    break;
                } else {
                    if (str6 == null) {
                        str6 = "Recovery phrase is unavailable";
                    }
                    tVar.a(str6);
                    break;
                }
            case 2:
                f2 f2Var3 = (f2) this.b;
                t tVar2 = (t) this.d;
                k0 k0Var2 = (k0) this.e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f;
                String str7 = (String) this.c;
                byte[] bArr2 = (byte[]) this.g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.e.c(new bi.r7(f2Var3, k0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, tVar2, 12));
                    break;
                } else {
                    tVar2.a(f2.z(tL_error2, "getNextEventId"));
                    break;
                }
            case 3:
                f2 f2Var4 = (f2) this.b;
                bi.p5 p5Var = (bi.p5) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str8 = (String) this.c;
                byte[] bArr3 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                n0 n0Var = f2Var4.b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.id != tL_urlAuthResultRequest.tc_session_id || !tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) || tonconnectsession6.closed || tonconnectsession6.closing || tonconnectsession6.nonce == null || !TextUtils.equals(str8, n0Var.t()) || !Arrays.equals(bArr3, n0Var.y())) {
                        p5Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        break;
                    } else {
                        n0Var.z(new e1(f2Var4, p5Var, tonconnectsession6, str8, bArr3, jSONArray, tL_urlAuthResultRequest), true, false);
                        break;
                    }
                } else {
                    p5Var.a(null, f2.z(tL_error3, "createSession"));
                    break;
                }
            default:
                u2 u2Var = (u2) this.b;
                int[] iArr = (int[]) this.d;
                n0 n0Var2 = (n0) this.c;
                TextView textView = (TextView) this.e;
                e2 e2Var = (e2) this.f;
                g7 g7Var = (g7) this.g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!u2Var.e && !u2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n10 = n0.n(wallettransaction.fee, true);
                        CharSequence m10 = n0Var2.m(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(m10) ? hd.V(null, null, 2131743121, n10) : hd.V(null, null, 2131743120, n10, m10));
                    } else if (n0Var2.v() < e2Var.c) {
                        iArr[0] = 2;
                        textView.setText(hd.M0(2131743067, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(hd.M0(2131742987, null));
                        if (str9 != null) {
                            f2.m("widget preview", str9);
                        }
                    }
                    g7Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f1(f2 f2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i7) {
        this.a = i7;
        this.b = f2Var;
        this.d = obj;
        this.e = tLObject;
        this.c = str;
        this.f = bArr;
        this.g = obj2;
    }

    public /* synthetic */ f1(f2 f2Var, t tVar, k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.a = 2;
        this.b = f2Var;
        this.d = tVar;
        this.e = k0Var;
        this.f = tonconnectsession;
        this.c = str;
        this.g = bArr;
    }
}
