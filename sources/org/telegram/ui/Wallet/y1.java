package org.telegram.ui.Wallet;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y1 {
    public final TL_wallet.tonConnectSession a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final b2 f;
    public final byte[] g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public Runnable r;

    public y1(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        this.a = tonconnectpending.session;
        this.b = tonconnectrequest.msg_id;
        this.c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.l = optInt;
        String str2 = null;
        this.j = jSONObject.optString("errorMessage", null);
        this.f = (optInt >= 0 || !jSONObject.has("transaction")) ? null : new b2(jSONObject.getJSONObject("transaction"));
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.k = str2;
        this.h = str;
        this.g = (byte[]) bArr.clone();
    }
}
