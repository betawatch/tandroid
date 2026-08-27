package m5;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t extends z5.a {
    public static final Parcelable.Creator<t> CREATOR = new w(19);
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public String r;
    public int s;
    public int v;
    public String w;
    public JSONObject x;

    public t(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.a = f10;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
        this.h = i15;
        this.n = i16;
        this.r = str;
        this.s = i17;
        this.v = i18;
        this.w = str2;
        if (str2 == null) {
            this.x = null;
            return;
        }
        try {
            this.x = new JSONObject(this.w);
        } catch (JSONException unused) {
            this.x = null;
            this.w = null;
        }
    }

    public static final int c(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String d(int i10) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Integer.valueOf(Color.alpha(i10)));
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.a);
            int i10 = this.b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", d(i10));
            }
            int i11 = this.c;
            if (i11 != 0) {
                jSONObject.put("backgroundColor", d(i11));
            }
            int i12 = this.d;
            if (i12 == 0) {
                jSONObject.put("edgeType", "NONE");
            } else if (i12 == 1) {
                jSONObject.put("edgeType", "OUTLINE");
            } else if (i12 == 2) {
                jSONObject.put("edgeType", "DROP_SHADOW");
            } else if (i12 == 3) {
                jSONObject.put("edgeType", "RAISED");
            } else if (i12 == 4) {
                jSONObject.put("edgeType", "DEPRESSED");
            }
            int i13 = this.e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", d(i13));
            }
            int i14 = this.f;
            if (i14 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i14 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i14 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i15 = this.h;
            if (i15 != 0) {
                jSONObject.put("windowColor", d(i15));
            }
            if (this.f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.n);
            }
            String str = this.r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.s) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i16 = this.v;
            if (i16 == 0) {
                jSONObject.put("fontStyle", "NORMAL");
            } else if (i16 == 1) {
                jSONObject.put("fontStyle", "BOLD");
            } else if (i16 == 2) {
                jSONObject.put("fontStyle", "ITALIC");
            } else if (i16 == 3) {
                jSONObject.put("fontStyle", "BOLD_ITALIC");
            }
            JSONObject jSONObject2 = this.x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        JSONObject jSONObject = this.x;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = tVar.x;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || f6.c.a(jSONObject, jSONObject2)) && this.a == tVar.a && this.b == tVar.b && this.c == tVar.c && this.d == tVar.d && this.e == tVar.e && this.f == tVar.f && this.h == tVar.h && this.n == tVar.n && r5.a.d(this.r, tVar.r) && this.s == tVar.s && this.v == tVar.v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.h), Integer.valueOf(this.n), this.r, Integer.valueOf(this.s), Integer.valueOf(this.v), String.valueOf(this.x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.x;
        this.w = jSONObject == null ? null : jSONObject.toString();
        int q6 = r8.q(parcel, 20293);
        float f10 = this.a;
        r8.s(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i11 = this.b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f;
        r8.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        r8.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.n;
        r8.s(parcel, 9, 4);
        parcel.writeInt(i17);
        r8.l(parcel, 10, this.r);
        int i18 = this.s;
        r8.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        r8.s(parcel, 12, 4);
        parcel.writeInt(i19);
        r8.l(parcel, 13, this.w);
        r8.r(parcel, q6);
    }
}
