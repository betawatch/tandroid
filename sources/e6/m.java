package e6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i3 = this.a;
            if (i3 == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i3 == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("title", this.b);
            }
            List list = this.c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((l) it.next()).d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", j6.a.b(this.d));
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && TextUtils.equals(this.b, mVar.b) && p6.m.k(this.c, mVar.c) && p6.m.k(this.d, mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.b);
        List list = this.c;
        j8.a.q(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.d;
        j8.a.q(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        double d = this.e;
        j8.a.r(parcel, 6, 8);
        parcel.writeDouble(d);
        j8.a.t(parcel, s6);
    }
}
