package org.telegram.messenger;

import android.content.Context;
import android.util.Base64;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class bt implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bt(int i7, Context context, q10 q10Var) {
        this.c = q10Var;
        this.d = context;
        this.b = i7;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.ActionBar.g2 T;
        int i7 = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        final int i10 = 1;
        switch (i7) {
            case 0:
                final q10 q10Var = (q10) obj4;
                Context context = (Context) obj3;
                v0.c cVar = (v0.c) obj;
                Throwable th2 = (Throwable) obj2;
                final int i11 = 0;
                if ((th2 instanceof w0.b) || (th2 instanceof w0.e)) {
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.et
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    q10Var.a(null, "CANCELLED");
                                    break;
                                default:
                                    q10Var.a(null, "EMPTY");
                                    break;
                            }
                        }
                    });
                    break;
                } else if (th2 instanceof w0.f) {
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.et
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    q10Var.a(null, "CANCELLED");
                                    break;
                                default:
                                    q10Var.a(null, "EMPTY");
                                    break;
                            }
                        }
                    });
                    break;
                } else if (th2 != null) {
                    a8.g(th2, true);
                    g0.g3(new rq(17, q10Var, th2));
                    break;
                } else {
                    TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                    try {
                        JSONObject jSONObject = new JSONObject(cVar.a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                        TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                        registerpasskey.credential = inputpasskeycredentialpublickey;
                        inputpasskeycredentialpublickey.id = jSONObject.getString("id");
                        registerpasskey.credential.raw_id = jSONObject.getString("rawId");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                        TL_account.inputPasskeyResponseRegister inputpasskeyresponseregister = new TL_account.inputPasskeyResponseRegister();
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        inputpasskeyresponseregister.client_data = tL_dataJSON;
                        tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
                        inputpasskeyresponseregister.attestation_object = Base64.decode(jSONObject2.getString("attestationObject"), 8);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("AAGUID: ");
                        byte[] copyOfRange = Arrays.copyOfRange(inputpasskeyresponseregister.attestation_object, 67, 83);
                        StringBuilder sb3 = new StringBuilder(copyOfRange.length * 2);
                        for (byte b10 : copyOfRange) {
                            sb3.append(String.format("%02x", Byte.valueOf(b10)));
                        }
                        sb2.append(sb3.toString());
                        a8.b(sb2.toString());
                        registerpasskey.credential.response = inputpasskeyresponseregister;
                        g0.g3(new dg(context, this.b, registerpasskey, q10Var, 15));
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        g0.g3(new ct(q10Var, e10, 1));
                        return;
                    }
                }
                break;
            default:
                x10 x10Var = (x10) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((z00) obj4).G;
                int i12 = this.b;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i12));
                    x10Var.a(tL_textWithEntities);
                    break;
                } else if (tL_error != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (T = LaunchActivity.T()) != null) {
                        org.telegram.ui.Components.gc K = org.telegram.ui.Components.lc.b0(T).K(R.raw.star_premium_2, gd.N0(2131744090, null), gd.N0(2131744089, null), new ln(3, T));
                        K.j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i12));
                    x10Var.a(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bt(z00 z00Var, int i7, x10 x10Var) {
        this.c = z00Var;
        this.b = i7;
        this.d = x10Var;
    }
}
