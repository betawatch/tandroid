package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        long j10 = 0;
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            b2 b2Var = new b2(jSONArray.getJSONObject(i10));
            long j11 = b2Var.e;
            long j12 = j10 + j11;
            if (!((j11 ^ j10) < 0) && !((j10 ^ j12) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(b2Var);
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
