package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c2 {
    public final long a;
    public final List b;
    public final long c;

    public c2(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            b2 b2Var = new b2(jSONArray.getJSONObject(i10));
            long j10 = b2Var.e;
            long j11 = j3 + j10;
            if (!((j10 ^ j3) < 0) && !((j3 ^ j11) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(b2Var);
            i10++;
            j3 = j11;
        }
        this.c = j3;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String[] a() {
        List list = this.b;
        String[] strArr = new String[list.size() * 5];
        for (int i10 = 0; i10 < list.size(); i10++) {
            b2 b2Var = (b2) list.get(i10);
            int i11 = i10 * 5;
            strArr[i11] = b2Var.a;
            strArr[i11 + 1] = Long.toString(b2Var.e);
            strArr[i11 + 2] = b2Var.b;
            strArr[i11 + 3] = b2Var.c;
            strArr[i11 + 4] = b2Var.f ? "1" : "0";
        }
        return strArr;
    }
}
