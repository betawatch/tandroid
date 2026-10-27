package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b2 {
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public TL_wallet.walletOwnershipProof d;

    public b2(JSONObject jSONObject) {
        this.a = jSONObject.getString("clientId");
        this.b = jSONObject.has("challengeAnswer") ? Base64.decode(jSONObject.getString("challengeAnswer"), 2) : null;
        this.c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
