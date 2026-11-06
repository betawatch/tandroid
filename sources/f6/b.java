package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z9, String[] strArr, boolean z10, boolean z11) {
        this.a = j3;
        this.b = str;
        this.c = j10;
        this.d = z9;
        this.e = strArr;
        this.f = z10;
        this.h = z11;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            long j3 = this.a;
            Pattern pattern = j6.a.a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f);
            jSONObject.put("duration", this.c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.e;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j6.a.d(this.b, bVar.b) && this.a == bVar.a && this.c == bVar.c && this.d == bVar.d && Arrays.equals(this.e, bVar.e) && this.f == bVar.f && this.h == bVar.h;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        wb.l(parcel, 3, this.b);
        wb.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.m(parcel, 6, this.e);
        wb.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        wb.s(parcel, r10);
    }
}
