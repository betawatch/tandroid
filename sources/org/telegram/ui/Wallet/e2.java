package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        long j10 = 0;
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            d2 d2Var = new d2(jSONArray.getJSONObject(i10));
            long j11 = d2Var.e;
            long j12 = j10 + j11;
            if (!((j11 ^ j10) < 0) && !((j10 ^ j12) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(d2Var);
            i10++;
            j10 = j12;
        }
        this.c = j10;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String[] a() {
        List list = this.b;
        String[] strArr = new String[list.size() * 5];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d2 d2Var = (d2) list.get(i10);
            int i11 = i10 * 5;
            strArr[i11] = d2Var.a;
            strArr[i11 + 1] = Long.toString(d2Var.e);
            strArr[i11 + 2] = d2Var.b;
            strArr[i11 + 3] = d2Var.c;
            strArr[i11 + 4] = d2Var.f ? "1" : "0";
        }
        return strArr;
    }
}
