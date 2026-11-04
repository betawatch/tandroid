package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b2 {
    public final long a;
    public final List b;
    public final long c;

    public b2(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i3 = 0;
        while (i3 < jSONArray.length()) {
            a2 a2Var = new a2(jSONArray.getJSONObject(i3));
            long j11 = a2Var.e;
            long j12 = j10 + j11;
            if (!((j11 ^ j10) < 0) && !((j10 ^ j12) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(a2Var);
            i3++;
            j10 = j12;
        }
        this.c = j10;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String[] a() {
        List list = this.b;
        String[] strArr = new String[list.size() * 5];
        for (int i3 = 0; i3 < list.size(); i3++) {
            a2 a2Var = (a2) list.get(i3);
            int i10 = i3 * 5;
            strArr[i10] = a2Var.a;
            strArr[i10 + 1] = Long.toString(a2Var.e);
            strArr[i10 + 2] = a2Var.b;
            strArr[i10 + 3] = a2Var.c;
            strArr[i10 + 4] = a2Var.f ? "1" : "0";
        }
        return strArr;
    }
}
