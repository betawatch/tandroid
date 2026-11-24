// default package

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jy7 implements a33 {
    public final /* synthetic */ fh6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;

    public jy7(fh6 fh6Var, Context context, int i) {
        this.a = fh6Var;
        this.b = context;
        this.c = i;
    }

    @Override // a33
    public final void A(Object obj) {
        vu4 vu4Var = (vu4) obj;
        boolean z = vu4Var instanceof sl7;
        fh6 fh6Var = this.a;
        if (z) {
            fh6Var.a(0L, null, "EMPTY");
            return;
        }
        if (vu4Var instanceof su4) {
            fh6Var.a(0L, null, "CANCELLED");
        } else if (vu4Var instanceof wu4) {
            fh6Var.a(0L, null, "CANCELLED");
        } else if (vu4Var != null) {
            fh6Var.a(0L, null, vu4Var.getMessage());
        }
    }

    @Override // a33
    public final void onResult(Object obj) {
        final fh6 fh6Var = this.a;
        x23 x23Var = ((yu4) obj).a;
        TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
        finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) x23Var.a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
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
            he heVar = new he(3, null, this.b);
            heVar.q(500L);
            int i = this.c;
            if (parseInt != ConnectionsManager.getInstance(i).getCurrentDatacenterId()) {
                int currentDatacenterId = ConnectionsManager.getInstance(i).getCurrentDatacenterId();
                long currentAuthKeyId = ConnectionsManager.getInstance(i).getCurrentAuthKeyId();
                ConnectionsManager.getInstance(i).setDefaultDatacenterId(parseInt);
                finishpasskeylogin.flags |= 1;
                finishpasskeylogin.from_dc_id = currentDatacenterId;
                finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
            }
            final int sendRequestTyped = ConnectionsManager.getInstance(i).sendRequestTyped(finishpasskeylogin, new kc((byte) 0), new fv4(heVar, fh6Var, parseLong, (byte) 4), parseInt, 72);
            final int i2 = this.c;
            heVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: iy7
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(i2).cancelRequest(sendRequestTyped, true);
                    fh6Var.a(Long.valueOf(parseLong), null, "CANCELLED");
                }
            });
        } catch (Exception e) {
            fc4.g(e, true);
            fh6Var.a(0L, null, e.getMessage());
        }
    }
}
