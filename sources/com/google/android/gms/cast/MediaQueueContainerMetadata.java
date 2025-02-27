package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueContainerMetadata> CREATOR = new zzcg();
    private int zza;
    private String zzb;
    private List zzc;
    private List zzd;
    private double zze;

    public static class Builder {
        private final MediaQueueContainerMetadata zza = new MediaQueueContainerMetadata(null);

        public MediaQueueContainerMetadata build() {
            return new MediaQueueContainerMetadata(this.zza, null);
        }

        public final Builder zza(JSONObject jSONObject) {
            MediaQueueContainerMetadata.zzb(this.zza, jSONObject);
            return this;
        }
    }

    MediaQueueContainerMetadata(int i, String str, List list, List list2, double d) {
        this.zza = i;
        this.zzb = str;
        this.zzc = list;
        this.zzd = list2;
        this.zze = d;
    }

    /* synthetic */ MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata, zzcf zzcfVar) {
        this.zza = mediaQueueContainerMetadata.zza;
        this.zzb = mediaQueueContainerMetadata.zzb;
        this.zzc = mediaQueueContainerMetadata.zzc;
        this.zzd = mediaQueueContainerMetadata.zzd;
        this.zze = mediaQueueContainerMetadata.zze;
    }

    /* synthetic */ MediaQueueContainerMetadata(zzcf zzcfVar) {
        zzh();
    }

    static /* bridge */ /* synthetic */ void zzb(MediaQueueContainerMetadata mediaQueueContainerMetadata, JSONObject jSONObject) {
        char c;
        mediaQueueContainerMetadata.zzh();
        String optString = jSONObject.optString("containerType", "");
        int hashCode = optString.hashCode();
        if (hashCode != 6924225) {
            if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (optString.equals("AUDIOBOOK_CONTAINER")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            mediaQueueContainerMetadata.zza = 0;
        } else if (c == 1) {
            mediaQueueContainerMetadata.zza = 1;
        }
        mediaQueueContainerMetadata.zzb = CastUtils.optStringOrNull(jSONObject, "title");
        JSONArray optJSONArray = jSONObject.optJSONArray("sections");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueContainerMetadata.zzc = arrayList;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    MediaMetadata mediaMetadata = new MediaMetadata();
                    mediaMetadata.zzc(optJSONObject);
                    arrayList.add(mediaMetadata);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            mediaQueueContainerMetadata.zzd = arrayList2;
            com.google.android.gms.cast.internal.media.zza.zzd(arrayList2, optJSONArray2);
        }
        mediaQueueContainerMetadata.zze = jSONObject.optDouble("containerDuration", mediaQueueContainerMetadata.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        this.zza = 0;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 0.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.zza == mediaQueueContainerMetadata.zza && TextUtils.equals(this.zzb, mediaQueueContainerMetadata.zzb) && Objects.equal(this.zzc, mediaQueueContainerMetadata.zzc) && Objects.equal(this.zzd, mediaQueueContainerMetadata.zzd) && this.zze == mediaQueueContainerMetadata.zze;
    }

    public double getContainerDuration() {
        return this.zze;
    }

    public List getContainerImages() {
        List list = this.zzd;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public int getContainerType() {
        return this.zza;
    }

    public List getSections() {
        List list = this.zzc;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getTitle() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, Double.valueOf(this.zze));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getContainerType());
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getSections(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getContainerImages(), false);
        SafeParcelWriter.writeDouble(parcel, 6, getContainerDuration());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[Catch: JSONException -> 0x0071, TryCatch #0 {JSONException -> 0x0071, blocks: (B:3:0x0005, B:9:0x0011, B:10:0x0018, B:12:0x0020, B:13:0x0027, B:15:0x002b, B:17:0x0031, B:18:0x003c, B:20:0x0042, B:22:0x0050, B:23:0x0055, B:25:0x0059, B:27:0x005f, B:28:0x006a), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[Catch: JSONException -> 0x0071, LOOP:0: B:18:0x003c->B:20:0x0042, LOOP_END, TryCatch #0 {JSONException -> 0x0071, blocks: (B:3:0x0005, B:9:0x0011, B:10:0x0018, B:12:0x0020, B:13:0x0027, B:15:0x002b, B:17:0x0031, B:18:0x003c, B:20:0x0042, B:22:0x0050, B:23:0x0055, B:25:0x0059, B:27:0x005f, B:28:0x006a), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        int i;
        List list;
        List list2;
        Iterator it;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            i = this.zza;
        } catch (JSONException unused) {
        }
        if (i != 0) {
            str = i == 1 ? "AUDIOBOOK_CONTAINER" : "GENERIC_CONTAINER";
            if (!TextUtils.isEmpty(this.zzb)) {
                jSONObject.put("title", this.zzb);
            }
            list = this.zzc;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                it = this.zzc.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaMetadata) it.next()).zza());
                }
                jSONObject.put("sections", jSONArray);
            }
            list2 = this.zzd;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", com.google.android.gms.cast.internal.media.zza.zzc(this.zzd));
            }
            jSONObject.put("containerDuration", this.zze);
            return jSONObject;
        }
        jSONObject.put("containerType", str);
        if (!TextUtils.isEmpty(this.zzb)) {
        }
        list = this.zzc;
        if (list != null) {
            JSONArray jSONArray2 = new JSONArray();
            it = this.zzc.iterator();
            while (it.hasNext()) {
            }
            jSONObject.put("sections", jSONArray2);
        }
        list2 = this.zzd;
        if (list2 != null) {
            jSONObject.put("containerImages", com.google.android.gms.cast.internal.media.zza.zzc(this.zzd));
        }
        jSONObject.put("containerDuration", this.zze);
        return jSONObject;
    }
}
