package o5;

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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.a;
            if (i10 == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i10 == 1) {
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
                jSONObject.put("containerImages", t5.a.b(this.d));
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
        return this.a == mVar.a && TextUtils.equals(this.b, mVar.b) && z5.l.l(this.c, mVar.c) && z5.l.l(this.d, mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        List list = this.c;
        com.google.android.gms.internal.cast.o.p(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.d;
        com.google.android.gms.internal.cast.o.p(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        double d = this.e;
        com.google.android.gms.internal.cast.o.s(parcel, 6, 8);
        parcel.writeDouble(d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
