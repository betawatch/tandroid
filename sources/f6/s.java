package f6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
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
    public int w;
    public String x;
    public JSONObject y;

    public s(float f10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.a = f10;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.h = i14;
        this.n = i15;
        this.r = str;
        this.s = i16;
        this.w = i17;
        this.x = str2;
        if (str2 == null) {
            this.y = null;
            return;
        }
        try {
            this.y = new JSONObject(this.x);
        } catch (JSONException unused) {
            this.y = null;
            this.x = null;
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

    public static final String d(int i7) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i7)), Integer.valueOf(Color.green(i7)), Integer.valueOf(Color.blue(i7)), Integer.valueOf(Color.alpha(i7)));
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.a);
            int i7 = this.b;
            if (i7 != 0) {
                jSONObject.put("foregroundColor", d(i7));
            }
            int i10 = this.c;
            if (i10 != 0) {
                jSONObject.put("backgroundColor", d(i10));
            }
            int i11 = this.d;
            if (i11 == 0) {
                jSONObject.put("edgeType", "NONE");
            } else if (i11 == 1) {
                jSONObject.put("edgeType", "OUTLINE");
            } else if (i11 == 2) {
                jSONObject.put("edgeType", "DROP_SHADOW");
            } else if (i11 == 3) {
                jSONObject.put("edgeType", "RAISED");
            } else if (i11 == 4) {
                jSONObject.put("edgeType", "DEPRESSED");
            }
            int i12 = this.e;
            if (i12 != 0) {
                jSONObject.put("edgeColor", d(i12));
            }
            int i13 = this.f;
            if (i13 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i13 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i13 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i14 = this.h;
            if (i14 != 0) {
                jSONObject.put("windowColor", d(i14));
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
            int i15 = this.w;
            if (i15 == 0) {
                jSONObject.put("fontStyle", "NORMAL");
            } else if (i15 == 1) {
                jSONObject.put("fontStyle", "BOLD");
            } else if (i15 == 2) {
                jSONObject.put("fontStyle", "ITALIC");
            } else if (i15 == 3) {
                jSONObject.put("fontStyle", "BOLD_ITALIC");
            }
            JSONObject jSONObject2 = this.y;
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
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        JSONObject jSONObject = this.y;
        boolean z9 = jSONObject == null;
        JSONObject jSONObject2 = sVar.y;
        if (z9 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || x6.c.a(jSONObject, jSONObject2)) && this.a == sVar.a && this.b == sVar.b && this.c == sVar.c && this.d == sVar.d && this.e == sVar.e && this.f == sVar.f && this.h == sVar.h && this.n == sVar.n && j6.a.d(this.r, sVar.r) && this.s == sVar.s && this.w == sVar.w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.h), Integer.valueOf(this.n), this.r, Integer.valueOf(this.s), Integer.valueOf(this.w), String.valueOf(this.y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        JSONObject jSONObject = this.y;
        this.x = jSONObject == null ? null : jSONObject.toString();
        int r10 = xb.r(parcel, 20293);
        float f10 = this.a;
        xb.q(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i10 = this.b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i14);
        int i15 = this.h;
        xb.q(parcel, 8, 4);
        parcel.writeInt(i15);
        int i16 = this.n;
        xb.q(parcel, 9, 4);
        parcel.writeInt(i16);
        xb.l(parcel, 10, this.r);
        int i17 = this.s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(i17);
        int i18 = this.w;
        xb.q(parcel, 12, 4);
        parcel.writeInt(i18);
        xb.l(parcel, 13, this.x);
        xb.s(parcel, r10);
    }
}
