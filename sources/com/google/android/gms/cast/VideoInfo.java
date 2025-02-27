package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class VideoInfo extends AbstractSafeParcelable {
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private static final Logger zza = new Logger("VideoInfo");
    public static final Parcelable.Creator<VideoInfo> CREATOR = new zzdu();

    VideoInfo(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static VideoInfo zza(JSONObject jSONObject) {
        char c;
        int i = 1;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            int hashCode = string.hashCode();
            if (hashCode == 3218) {
                if (string.equals("dv")) {
                    c = 0;
                    if (c != 0) {
                    }
                    return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
                }
                c = 65535;
                if (c != 0) {
                }
                return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
            }
            if (hashCode == 103158) {
                if (string.equals("hdr")) {
                    c = 2;
                    if (c != 0) {
                    }
                    return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
                }
                c = 65535;
                if (c != 0) {
                }
                return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
            }
            if (hashCode == 113729) {
                if (string.equals("sdr")) {
                    c = 3;
                    if (c != 0) {
                    }
                    return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
                }
                c = 65535;
                if (c != 0) {
                }
                return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
            }
            if (hashCode == 99136405 && string.equals("hdr10")) {
                c = 1;
                if (c != 0) {
                    i = 3;
                } else if (c == 1) {
                    i = 2;
                } else if (c == 2) {
                    i = 4;
                } else if (c != 3) {
                    zza.d("Unknown HDR type: %s", string);
                    i = 0;
                }
                return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
            }
            c = 65535;
            if (c != 0) {
            }
            return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
        } catch (JSONException e) {
            zza.d(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.zzc == videoInfo.getHeight() && this.zzb == videoInfo.getWidth() && this.zzd == videoInfo.getHdrType();
    }

    public int getHdrType() {
        return this.zzd;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getWidth() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.writeInt(parcel, 4, getHdrType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
