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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ut implements k20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ut(int i10, Context context, k20 k20Var) {
        this.c = k20Var;
        this.d = context;
        this.b = i10;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.ActionBar.k2 T;
        int i10 = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        final int i11 = 1;
        switch (i10) {
            case 0:
                final k20 k20Var = (k20) obj4;
                Context context = (Context) obj3;
                v0.c cVar = (v0.c) obj;
                Throwable th2 = (Throwable) obj2;
                final int i12 = 0;
                if ((th2 instanceof w0.b) || (th2 instanceof w0.e)) {
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.xt
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    k20Var.a(null, "CANCELLED");
                                    break;
                                default:
                                    k20Var.a(null, "EMPTY");
                                    break;
                            }
                        }
                    });
                    break;
                } else if (th2 instanceof w0.f) {
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.xt
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    k20Var.a(null, "CANCELLED");
                                    break;
                                default:
                                    k20Var.a(null, "EMPTY");
                                    break;
                            }
                        }
                    });
                    break;
                } else if (th2 != null) {
                    f8.g(th2, true);
                    i0.g3(new ir(13, k20Var, th2));
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
                        f8.b(sb2.toString());
                        registerpasskey.credential.response = inputpasskeyresponseregister;
                        i0.g3(new dg(context, this.b, registerpasskey, k20Var, 16));
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        i0.g3(new vt(k20Var, e, 1));
                        return;
                    }
                }
                break;
            default:
                r20 r20Var = (r20) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((u10) obj4).F;
                int i13 = this.b;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i13));
                    r20Var.a(tL_textWithEntities);
                    break;
                } else if (tL_error != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (T = LaunchActivity.T()) != null) {
                        org.telegram.ui.Components.wb K = org.telegram.ui.Components.cc.a0(T).K(R.raw.star_premium_2, dd.L0(2131744357, null), dd.L0(2131744356, null), new yn(3, T));
                        K.j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i13));
                    r20Var.a(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ut(u10 u10Var, int i10, r20 r20Var) {
        this.c = u10Var;
        this.b = i10;
        this.d = r20Var;
    }
}
