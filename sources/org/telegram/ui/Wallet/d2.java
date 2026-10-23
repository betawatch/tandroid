package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        long j10 = 0;
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            c2 c2Var = new c2(jSONArray.getJSONObject(i10));
            long j11 = c2Var.e;
            long j12 = j10 + j11;
            if (!((j11 ^ j10) < 0) && !((j10 ^ j12) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(c2Var);
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
            c2 c2Var = (c2) list.get(i10);
            int i11 = i10 * 5;
            strArr[i11] = c2Var.a;
            strArr[i11 + 1] = Long.toString(c2Var.e);
            strArr[i11 + 2] = c2Var.b;
            strArr[i11 + 3] = c2Var.c;
            strArr[i11 + 4] = c2Var.f ? "1" : "0";
        }
        return strArr;
    }
}
