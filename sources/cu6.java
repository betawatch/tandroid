// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class cu6 extends c4 {
    public static final Parcelable.Creator<cu6> CREATOR = new zkd((byte) 12);
    public int a;
    public String b;
    public ArrayList c;
    public ArrayList d;
    public double e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.a;
            if (i == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("title", this.b);
            }
            ArrayList arrayList = this.c;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    jSONArray.put(((mt6) obj).d());
                }
                jSONObject.put("sections", jSONArray);
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                jSONObject.put("containerImages", u9d.b(this.d));
            }
            jSONObject.put("containerDuration", this.e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu6)) {
            return false;
        }
        cu6 cu6Var = (cu6) obj;
        return this.a == cu6Var.a && TextUtils.equals(this.b, cu6Var.b) && vue.a(this.c, cu6Var.c) && vue.a(this.d, cu6Var.d) && this.e == cu6Var.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 3, this.b);
        ArrayList arrayList = this.c;
        bye.p(parcel, 4, arrayList == null ? null : DesugarCollections.unmodifiableList(arrayList));
        ArrayList arrayList2 = this.d;
        bye.p(parcel, 5, arrayList2 != null ? DesugarCollections.unmodifiableList(arrayList2) : null);
        double d = this.e;
        bye.q(parcel, 6, 8);
        parcel.writeDouble(d);
        bye.s(parcel, r);
    }
}
