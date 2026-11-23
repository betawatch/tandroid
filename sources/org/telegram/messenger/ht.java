package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ud0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class ht implements v0.g {
    public final /* synthetic */ ud0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;

    public ht(ud0 ud0Var, Context context, int i7) {
        this.a = ud0Var;
        this.b = context;
        this.c = i7;
    }

    @Override // v0.g
    public final void a(Object obj) {
        w0.i iVar = (w0.i) obj;
        boolean z10 = iVar instanceof w0.k;
        ud0 ud0Var = this.a;
        if (z10) {
            ud0Var.a(0L, null, "EMPTY");
            return;
        }
        if (iVar instanceof w0.g) {
            ud0Var.a(0L, null, "CANCELLED");
        } else if (iVar instanceof w0.j) {
            ud0Var.a(0L, null, "CANCELLED");
        } else if (iVar != null) {
            ud0Var.a(0L, null, iVar.getMessage());
        }
    }

    @Override // v0.g
    public final void onResult(Object obj) {
        final ud0 ud0Var = this.a;
        com.google.android.gms.common.api.q qVar = ((v0.n) obj).a;
        TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
        finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) qVar.a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
            finishpasskeylogin.credential.id = jSONObject.getString("id");
            finishpasskeylogin.credential.raw_id = jSONObject.getString("rawId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            TL_account.inputPasskeyResponseLogin inputpasskeyresponselogin = new TL_account.inputPasskeyResponseLogin();
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            inputpasskeyresponselogin.client_data = tL_dataJSON;
            tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
            inputpasskeyresponselogin.authenticator_data = Base64.decode(jSONObject2.getString("authenticatorData"), 8);
            inputpasskeyresponselogin.signature = Base64.decode(jSONObject2.getString("signature"), 8);
            String str = new String(Base64.decode(jSONObject2.getString("userHandle"), 8));
            inputpasskeyresponselogin.user_handle = str;
            int parseInt = Integer.parseInt(str.split(":")[0]);
            final long parseLong = Long.parseLong(inputpasskeyresponselogin.user_handle.split(":")[1]);
            finishpasskeylogin.credential.response = inputpasskeyresponselogin;
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, this.b, null);
            t1Var.r(500L);
            int i7 = this.c;
            if (parseInt != ConnectionsManager.getInstance(i7).getCurrentDatacenterId()) {
                int currentDatacenterId = ConnectionsManager.getInstance(i7).getCurrentDatacenterId();
                long currentAuthKeyId = ConnectionsManager.getInstance(i7).getCurrentAuthKeyId();
                ConnectionsManager.getInstance(i7).setDefaultDatacenterId(parseInt);
                finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                finishpasskeylogin.from_dc_id = currentDatacenterId;
                finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
            }
            final int sendRequestTyped = ConnectionsManager.getInstance(i7).sendRequestTyped(finishpasskeylogin, new d3.b(1), new p9(t1Var, ud0Var, parseLong, 3), parseInt, 72);
            final int i10 = this.c;
            t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.gt
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(i10).cancelRequest(sendRequestTyped, true);
                    ud0Var.a(Long.valueOf(parseLong), null, "CANCELLED");
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            ud0Var.a(0L, null, e10.getMessage());
        }
    }
}
