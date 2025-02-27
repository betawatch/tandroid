package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextTrackStyle> CREATOR = new zzds();
    String zza;
    private float zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private JSONObject zzm;

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.zzb = f;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = i6;
        this.zzi = i7;
        this.zzj = str;
        this.zzk = i8;
        this.zzl = i9;
        this.zza = str2;
        if (str2 == null) {
            this.zzm = null;
            return;
        }
        try {
            this.zzm = new JSONObject(this.zza);
        } catch (JSONException unused) {
            this.zzm = null;
            this.zza = null;
        }
    }

    private static final int zzb(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    private static final String zzc(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        JSONObject jSONObject = this.zzm;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = textTrackStyle.zzm;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && this.zzb == textTrackStyle.zzb && this.zzc == textTrackStyle.zzc && this.zzd == textTrackStyle.zzd && this.zze == textTrackStyle.zze && this.zzf == textTrackStyle.zzf && this.zzg == textTrackStyle.zzg && this.zzh == textTrackStyle.zzh && this.zzi == textTrackStyle.zzi && CastUtils.zze(this.zzj, textTrackStyle.zzj) && this.zzk == textTrackStyle.zzk && this.zzl == textTrackStyle.zzl;
    }

    public void fromJson(JSONObject jSONObject) {
        int i;
        this.zzb = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.zzc = zzb(jSONObject.optString("foregroundColor"));
        this.zzd = zzb(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.zze = 0;
            } else if ("OUTLINE".equals(string)) {
                this.zze = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.zze = 2;
            } else if ("RAISED".equals(string)) {
                this.zze = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.zze = 4;
            }
        }
        this.zzf = zzb(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.zzg = 0;
            } else if ("NORMAL".equals(string2)) {
                this.zzg = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.zzg = 2;
            }
        }
        this.zzh = zzb(jSONObject.optString("windowColor"));
        if (this.zzg == 2) {
            this.zzi = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.zzj = CastUtils.optStringOrNull(jSONObject, "fontFamily");
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.zzk = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.zzk = 1;
            } else if ("SERIF".equals(string3)) {
                this.zzk = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.zzk = 3;
            } else if ("CASUAL".equals(string3)) {
                this.zzk = 4;
            } else {
                if (!"CURSIVE".equals(string3)) {
                    i = "SMALL_CAPITALS".equals(string3) ? 6 : 5;
                }
                this.zzk = i;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.zzl = 0;
            } else if ("BOLD".equals(string4)) {
                this.zzl = 1;
            } else if ("ITALIC".equals(string4)) {
                this.zzl = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.zzl = 3;
            }
        }
        this.zzm = jSONObject.optJSONObject("customData");
    }

    public int getBackgroundColor() {
        return this.zzd;
    }

    public int getEdgeColor() {
        return this.zzf;
    }

    public int getEdgeType() {
        return this.zze;
    }

    public String getFontFamily() {
        return this.zzj;
    }

    public int getFontGenericFamily() {
        return this.zzk;
    }

    public float getFontScale() {
        return this.zzb;
    }

    public int getFontStyle() {
        return this.zzl;
    }

    public int getForegroundColor() {
        return this.zzc;
    }

    public int getWindowColor() {
        return this.zzh;
    }

    public int getWindowCornerRadius() {
        return this.zzi;
    }

    public int getWindowType() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi), this.zzj, Integer.valueOf(this.zzk), Integer.valueOf(this.zzl), String.valueOf(this.zzm));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzm;
        this.zza = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, getFontScale());
        SafeParcelWriter.writeInt(parcel, 3, getForegroundColor());
        SafeParcelWriter.writeInt(parcel, 4, getBackgroundColor());
        SafeParcelWriter.writeInt(parcel, 5, getEdgeType());
        SafeParcelWriter.writeInt(parcel, 6, getEdgeColor());
        SafeParcelWriter.writeInt(parcel, 7, getWindowType());
        SafeParcelWriter.writeInt(parcel, 8, getWindowColor());
        SafeParcelWriter.writeInt(parcel, 9, getWindowCornerRadius());
        SafeParcelWriter.writeString(parcel, 10, getFontFamily(), false);
        SafeParcelWriter.writeInt(parcel, 11, getFontGenericFamily());
        SafeParcelWriter.writeInt(parcel, 12, getFontStyle());
        SafeParcelWriter.writeString(parcel, 13, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
    
        r1 = r8.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        if (r1 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
    
        if (r1 == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        if (r1 == 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if (r1 == 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
    
        r1 = "BOLD_ITALIC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
    
        r0.put("fontStyle", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        r1 = r8.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        r0.put("customData", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c9, code lost:
    
        r1 = "ITALIC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cc, code lost:
    
        r1 = "BOLD";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cf, code lost:
    
        r0.put("fontStyle", "NORMAL");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.zzb);
            int i = this.zzc;
            if (i != 0) {
                jSONObject.put("foregroundColor", zzc(i));
            }
            int i2 = this.zzd;
            if (i2 != 0) {
                jSONObject.put("backgroundColor", zzc(i2));
            }
            int i3 = this.zze;
            if (i3 != 0) {
                if (i3 == 1) {
                    str2 = "OUTLINE";
                } else if (i3 == 2) {
                    str2 = "DROP_SHADOW";
                } else if (i3 == 3) {
                    str2 = "RAISED";
                } else if (i3 == 4) {
                    str2 = "DEPRESSED";
                }
                jSONObject.put("edgeType", str2);
            } else {
                jSONObject.put("edgeType", "NONE");
            }
            int i4 = this.zzf;
            if (i4 != 0) {
                jSONObject.put("edgeColor", zzc(i4));
            }
            int i5 = this.zzg;
            if (i5 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i5 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i5 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i6 = this.zzh;
            if (i6 != 0) {
                jSONObject.put("windowColor", zzc(i6));
            }
            if (this.zzg == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.zzi);
            }
            String str3 = this.zzj;
            if (str3 != null) {
                jSONObject.put("fontFamily", str3);
            }
            switch (this.zzk) {
                case 0:
                    str = "SANS_SERIF";
                    jSONObject.put("fontGenericFamily", str);
                    break;
                case 1:
                    str = "MONOSPACED_SANS_SERIF";
                    jSONObject.put("fontGenericFamily", str);
                    break;
                case 2:
                    str = "SERIF";
                    jSONObject.put("fontGenericFamily", str);
                    break;
                case 3:
                    str = "MONOSPACED_SERIF";
                    jSONObject.put("fontGenericFamily", str);
                    break;
                case 4:
                    str = "CASUAL";
                    jSONObject.put("fontGenericFamily", str);
                    break;
                case 5:
                    str = "CURSIVE";
                    jSONObject.put("fontGenericFamily", str);
                    break;
                case 6:
                    str = "SMALL_CAPITALS";
                    jSONObject.put("fontGenericFamily", str);
                    break;
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
