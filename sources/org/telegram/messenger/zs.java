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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zs implements n10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zs(int i3, Context context, n10 n10Var) {
        this.c = n10Var;
        this.d = context;
        this.b = i3;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.ActionBar.d2 T;
        int i3 = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        final int i10 = 1;
        switch (i3) {
            case 0:
                final n10 n10Var = (n10) obj4;
                Context context = (Context) obj3;
                v0.c cVar = (v0.c) obj;
                Throwable th2 = (Throwable) obj2;
                final int i11 = 0;
                if ((th2 instanceof w0.b) || (th2 instanceof w0.e)) {
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.ct
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    n10Var.a(null, "CANCELLED");
                                    break;
                                default:
                                    n10Var.a(null, "EMPTY");
                                    break;
                            }
                        }
                    });
                    break;
                } else if (th2 instanceof w0.f) {
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.ct
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    n10Var.a(null, "CANCELLED");
                                    break;
                                default:
                                    n10Var.a(null, "EMPTY");
                                    break;
                            }
                        }
                    });
                    break;
                } else if (th2 != null) {
                    a8.g(th2, true);
                    g0.h3(new pq(15, n10Var, th2));
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
                        g0.h3(new vf(context, this.b, registerpasskey, n10Var, 16));
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        g0.h3(new at(n10Var, e10, 1));
                        return;
                    }
                }
                break;
            default:
                u10 u10Var = (u10) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((x00) obj4).G;
                int i12 = this.b;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i12));
                    u10Var.a(tL_textWithEntities);
                    break;
                } else if (tL_error != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (T = LaunchActivity.T()) != null) {
                        org.telegram.ui.Components.ac K = org.telegram.ui.Components.fc.a0(T).K(R.raw.star_premium_2, bd.M0(2131744341, null), bd.M0(2131744340, null), new hn(3, T));
                        K.j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i12));
                    u10Var.a(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zs(x00 x00Var, int i3, u10 u10Var) {
        this.c = x00Var;
        this.b = i3;
        this.d = u10Var;
    }
}
