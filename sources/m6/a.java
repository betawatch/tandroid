package m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import g8.j;
import java.util.Arrays;
import java.util.Locale;
import n6.l;
import org.json.JSONException;
import org.json.JSONObject;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(26);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.a = i10;
        this.b = uri;
        this.c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.b.toString();
        StringBuilder k10 = e2.k("Image ", this.c, "x", this.d, " ");
        k10.append(uri);
        return k10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        e0.k(parcel, 2, this.b, i10);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.r(parcel, q6);
    }

    public a(Uri uri, int i10, int i11) {
        this(1, uri, i10, i11);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(JSONObject jSONObject) {
        this(r0, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
    }
}
