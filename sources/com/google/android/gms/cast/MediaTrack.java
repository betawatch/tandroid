package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new zzcn();
    String zza;
    private final long zzb;
    private final int zzc;
    private String zzd;
    private String zze;
    private final String zzf;
    private final String zzg;
    private final int zzh;
    private final List zzi;
    private final JSONObject zzj;

    MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.zzb = j;
        this.zzc = i;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = i2;
        this.zzi = list;
        this.zzj = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.zzj;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.zzj;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && this.zzb == mediaTrack.zzb && this.zzc == mediaTrack.zzc && CastUtils.zze(this.zzd, mediaTrack.zzd) && CastUtils.zze(this.zze, mediaTrack.zze) && CastUtils.zze(this.zzf, mediaTrack.zzf) && CastUtils.zze(this.zzg, mediaTrack.zzg) && this.zzh == mediaTrack.zzh && CastUtils.zze(this.zzi, mediaTrack.zzi);
    }

    public String getContentId() {
        return this.zzd;
    }

    public String getContentType() {
        return this.zze;
    }

    public long getId() {
        return this.zzb;
    }

    public String getLanguage() {
        return this.zzg;
    }

    public String getName() {
        return this.zzf;
    }

    public List getRoles() {
        return this.zzi;
    }

    public int getSubtype() {
        return this.zzh;
    }

    public int getType() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, Integer.valueOf(this.zzh), this.zzi, String.valueOf(this.zzj));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzj;
        this.zza = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getId());
        SafeParcelWriter.writeInt(parcel, 3, getType());
        SafeParcelWriter.writeString(parcel, 4, getContentId(), false);
        SafeParcelWriter.writeString(parcel, 5, getContentType(), false);
        SafeParcelWriter.writeString(parcel, 6, getName(), false);
        SafeParcelWriter.writeString(parcel, 7, getLanguage(), false);
        SafeParcelWriter.writeInt(parcel, 8, getSubtype());
        SafeParcelWriter.writeStringList(parcel, 9, getRoles(), false);
        SafeParcelWriter.writeString(parcel, 10, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:9:0x001c, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0033, B:16:0x0038, B:18:0x003c, B:19:0x0041, B:21:0x0049, B:22:0x0050, B:32:0x0063, B:33:0x0073, B:35:0x0077, B:36:0x0083, B:38:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:9:0x001c, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0033, B:16:0x0038, B:18:0x003c, B:19:0x0041, B:21:0x0049, B:22:0x0050, B:32:0x0063, B:33:0x0073, B:35:0x0077, B:36:0x0083, B:38:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:9:0x001c, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0033, B:16:0x0038, B:18:0x003c, B:19:0x0041, B:21:0x0049, B:22:0x0050, B:32:0x0063, B:33:0x0073, B:35:0x0077, B:36:0x0083, B:38:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:9:0x001c, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0033, B:16:0x0038, B:18:0x003c, B:19:0x0041, B:21:0x0049, B:22:0x0050, B:32:0x0063, B:33:0x0073, B:35:0x0077, B:36:0x0083, B:38:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:9:0x001c, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0033, B:16:0x0038, B:18:0x003c, B:19:0x0041, B:21:0x0049, B:22:0x0050, B:32:0x0063, B:33:0x0073, B:35:0x0077, B:36:0x0083, B:38:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[Catch: JSONException -> 0x008c, TRY_LEAVE, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:9:0x001c, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0033, B:16:0x0038, B:18:0x003c, B:19:0x0041, B:21:0x0049, B:22:0x0050, B:32:0x0063, B:33:0x0073, B:35:0x0077, B:36:0x0083, B:38:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("trackId", this.zzb);
            i = this.zzc;
        } catch (JSONException unused) {
        }
        if (i == 1) {
            str = "TEXT";
        } else {
            if (i != 2) {
                if (i == 3) {
                    str = "VIDEO";
                }
                str2 = this.zzd;
                if (str2 != null) {
                    jSONObject2.put("trackContentId", str2);
                }
                str3 = this.zze;
                if (str3 != null) {
                    jSONObject2.put("trackContentType", str3);
                }
                str4 = this.zzf;
                if (str4 != null) {
                    jSONObject2.put("name", str4);
                }
                if (!TextUtils.isEmpty(this.zzg)) {
                    jSONObject2.put("language", this.zzg);
                }
                i2 = this.zzh;
                if (i2 != 1) {
                    str5 = "SUBTITLES";
                } else if (i2 == 2) {
                    str5 = "CAPTIONS";
                } else if (i2 == 3) {
                    str5 = "DESCRIPTIONS";
                } else {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            str5 = "METADATA";
                        }
                        if (this.zzi != null) {
                            jSONObject2.put("roles", new JSONArray((Collection) this.zzi));
                        }
                        jSONObject = this.zzj;
                        if (jSONObject != null) {
                            jSONObject2.put("customData", jSONObject);
                        }
                        return jSONObject2;
                    }
                    str5 = "CHAPTERS";
                }
                jSONObject2.put("subtype", str5);
                if (this.zzi != null) {
                }
                jSONObject = this.zzj;
                if (jSONObject != null) {
                }
                return jSONObject2;
            }
            str = "AUDIO";
        }
        jSONObject2.put("type", str);
        str2 = this.zzd;
        if (str2 != null) {
        }
        str3 = this.zze;
        if (str3 != null) {
        }
        str4 = this.zzf;
        if (str4 != null) {
        }
        if (!TextUtils.isEmpty(this.zzg)) {
        }
        i2 = this.zzh;
        if (i2 != 1) {
        }
        jSONObject2.put("subtype", str5);
        if (this.zzi != null) {
        }
        jSONObject = this.zzj;
        if (jSONObject != null) {
        }
        return jSONObject2;
    }
}
