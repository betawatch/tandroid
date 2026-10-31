package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.af0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class yt implements v0.h {
    public final /* synthetic */ af0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;

    public yt(af0 af0Var, Context context, int i10) {
        this.a = af0Var;
        this.b = context;
        this.c = i10;
    }

    @Override // v0.h
    public final void g(Object obj) {
        w0.i iVar = (w0.i) obj;
        boolean z10 = iVar instanceof w0.k;
        af0 af0Var = this.a;
        if (z10) {
            af0Var.a(0L, null, "EMPTY");
            return;
        }
        if (iVar instanceof w0.g) {
            af0Var.a(0L, null, "CANCELLED");
        } else if (iVar instanceof w0.j) {
            af0Var.a(0L, null, "CANCELLED");
        } else if (iVar != null) {
            af0Var.a(0L, null, iVar.getMessage());
        }
    }

    @Override // v0.h
    public final void onResult(Object obj) {
        final af0 af0Var = this.a;
        b2.h hVar = ((v0.n) obj).a;
        TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
        finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) hVar.a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
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
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, this.b, null);
            x1Var.r(500L);
            int i10 = this.c;
            if (parseInt != ConnectionsManager.getInstance(i10).getCurrentDatacenterId()) {
                int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                long currentAuthKeyId = ConnectionsManager.getInstance(i10).getCurrentAuthKeyId();
                ConnectionsManager.getInstance(i10).setDefaultDatacenterId(parseInt);
                finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                finishpasskeylogin.from_dc_id = currentDatacenterId;
                finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
            }
            final int sendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(finishpasskeylogin, new a3.b(1), new r9(x1Var, af0Var, parseLong, 3), parseInt, 72);
            final int i11 = this.c;
            x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.xt
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(i11).cancelRequest(sendRequestTyped, true);
                    af0Var.a(Long.valueOf(parseLong), null, "CANCELLED");
                }
            });
        } catch (Exception e) {
            f8.g(e, true);
            af0Var.a(0L, null, e.getMessage());
        }
    }
}
