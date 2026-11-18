package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i2 {
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public TL_wallet.walletOwnershipProof d;

    public i2(JSONObject jSONObject) {
        this.a = jSONObject.getString("clientId");
        this.b = jSONObject.has("challengeAnswer") ? Base64.decode(jSONObject.getString("challengeAnswer"), 2) : null;
        this.c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
