package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class d2 {
    public final long a;
    public final List b;
    public final long c;

    public d2(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i7 = 0;
        while (i7 < jSONArray.length()) {
            c2 c2Var = new c2(jSONArray.getJSONObject(i7));
            long j10 = c2Var.e;
            long j11 = j3 + j10;
            if (!((j10 ^ j3) < 0) && !((j3 ^ j11) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(c2Var);
            i7++;
            j3 = j11;
        }
        this.c = j3;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String[] a() {
        List list = this.b;
        String[] strArr = new String[list.size() * 5];
        for (int i7 = 0; i7 < list.size(); i7++) {
            c2 c2Var = (c2) list.get(i7);
            int i10 = i7 * 5;
            strArr[i10] = c2Var.a;
            strArr[i10 + 1] = Long.toString(c2Var.e);
            strArr[i10 + 2] = c2Var.b;
            strArr[i10 + 3] = c2Var.c;
            strArr[i10 + 4] = c2Var.f ? "1" : "0";
        }
        return strArr;
    }
}
