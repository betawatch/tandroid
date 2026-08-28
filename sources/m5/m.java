package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.p8;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i9 = this.a;
            if (i9 == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i9 == 1) {
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
                jSONObject.put("containerImages", r5.a.b(this.d));
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
        return this.a == mVar.a && TextUtils.equals(this.b, mVar.b) && x5.l.l(this.c, mVar.c) && x5.l.l(this.d, mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.b);
        List list = this.c;
        p8.p(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.d;
        p8.p(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        double d = this.e;
        p8.s(parcel, 6, 8);
        parcel.writeDouble(d);
        p8.r(parcel, q10);
    }
}
