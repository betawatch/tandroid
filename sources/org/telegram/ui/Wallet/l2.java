package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class l2 {
    public final long a;
    public final List b;
    public final long c;

    public l2(JSONObject jSONObject) {
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
            k2 k2Var = new k2(jSONArray.getJSONObject(i7));
            long j10 = k2Var.e;
            long j11 = j3 + j10;
            if (!((j10 ^ j3) < 0) && !((j3 ^ j11) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(k2Var);
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
            k2 k2Var = (k2) list.get(i7);
            int i10 = i7 * 5;
            strArr[i10] = k2Var.a;
            strArr[i10 + 1] = Long.toString(k2Var.e);
            strArr[i10 + 2] = k2Var.b;
            strArr[i10 + 3] = k2Var.c;
            strArr[i10 + 4] = k2Var.f ? "1" : "0";
        }
        return strArr;
    }
}
