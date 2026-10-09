package org.telegram.ui.Wallet;

import android.util.Base64;
import org.json.JSONObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final boolean f;

    public b2(JSONObject jSONObject) {
        String string = jSONObject.getString("address");
        this.a = string;
        if (string.contains(":") || !WalletEngine2.isValidAddress(string)) {
            throw new IllegalArgumentException("Expected a friendly destination address");
        }
        this.f = (Base64.decode(string.replace('-', '+').replace('_', '/'), 2)[0] & Byte.MAX_VALUE) == 17;
        Object obj = jSONObject.get("amount");
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.matches("[0-9]+")) {
                long parseLong = Long.parseLong(str);
                this.e = parseLong;
                if (jSONObject.has("extra_currency") && jSONObject.getJSONObject("extra_currency").length() != 0) {
                    throw new IllegalArgumentException("Extra currencies are not supported");
                }
                if (parseLong < 0) {
                    throw new IllegalArgumentException("Transfer amount must not be negative");
                }
                String string2 = jSONObject.has("payload") ? jSONObject.getString("payload") : null;
                this.b = string2;
                String string3 = jSONObject.has("stateInit") ? jSONObject.getString("stateInit") : null;
                this.c = string3;
                if ((string2 != null && !WalletEngine2.isValidCellBoc(string2)) || (string3 != null && !WalletEngine2.isValidCellBoc(string3))) {
                    throw new IllegalArgumentException("Invalid transaction cell");
                }
                this.d = WalletEngine2.textCommentFromBody(string2);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid transfer amount");
    }
}
