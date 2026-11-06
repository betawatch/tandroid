package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class c2 {
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public TL_wallet.walletOwnershipProof d;

    public c2(JSONObject jSONObject) {
        this.a = jSONObject.getString("clientId");
        this.b = jSONObject.has("challengeAnswer") ? Base64.decode(jSONObject.getString("challengeAnswer"), 2) : null;
        this.c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
