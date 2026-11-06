package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class e2 {
    public final long a;
    public final List b;
    public final long c;

    public e2(JSONObject jSONObject) {
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
            d2 d2Var = new d2(jSONArray.getJSONObject(i7));
            long j10 = d2Var.e;
            long j11 = j3 + j10;
            if (!((j10 ^ j3) < 0) && !((j3 ^ j11) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(d2Var);
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
            d2 d2Var = (d2) list.get(i7);
            int i10 = i7 * 5;
            strArr[i10] = d2Var.a;
            strArr[i10 + 1] = Long.toString(d2Var.e);
            strArr[i10 + 2] = d2Var.b;
            strArr[i10 + 3] = d2Var.c;
            strArr[i10 + 4] = d2Var.f ? "1" : "0";
        }
        return strArr;
    }
}
