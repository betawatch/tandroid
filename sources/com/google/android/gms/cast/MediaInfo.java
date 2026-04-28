package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzfn;
import com.google.android.gms.internal.cast.zzfq;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* loaded from: classes.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private MediaMetadata zzf;
    private long zzg;
    private List zzh;
    private TextTrackStyle zzi;
    private List zzj;
    private List zzk;
    private String zzl;
    private VastAdsRequest zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private JSONObject zzs;
    private final Writer zzt;
    public static final long zza = CastUtils.secToMillisec(-1L);
    public static final Parcelable.Creator<MediaInfo> CREATOR = new zzby();

    public static class Builder {
        private String zza;
        private String zzc;
        private MediaMetadata zzd;
        private List zzf;
        private TextTrackStyle zzg;
        private String zzh;
        private List zzi;
        private List zzj;
        private String zzk;
        private VastAdsRequest zzl;
        private String zzm;
        private String zzn;
        private String zzo;
        private String zzp;
        private int zzb = -1;
        private long zze = -1;

        public Builder(String str) {
            this.zza = str;
        }

        public MediaInfo build() {
            return new MediaInfo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, -1L, this.zzm, this.zzn, this.zzo, this.zzp);
        }

        public Builder setContentType(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setMetadata(MediaMetadata mediaMetadata) {
            this.zzd = mediaMetadata;
            return this;
        }

        public Builder setStreamType(int i) {
            if (i < -1 || i > 2) {
                throw new IllegalArgumentException("invalid stream type");
            }
            this.zzb = i;
            return this;
        }
    }

    public class Writer {
        public Writer() {
        }
    }

    MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, List list, TextTrackStyle textTrackStyle, String str3, List list2, List list3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        this.zzt = new Writer();
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
        this.zzf = mediaMetadata;
        this.zzg = j;
        this.zzh = list;
        this.zzi = textTrackStyle;
        this.zzb = str3;
        if (str3 != null) {
            try {
                this.zzs = new JSONObject(this.zzb);
            } catch (JSONException unused) {
                this.zzs = null;
                this.zzb = null;
            }
        } else {
            this.zzs = null;
        }
        this.zzj = list2;
        this.zzk = list3;
        this.zzl = str4;
        this.zzm = vastAdsRequest;
        this.zzn = j2;
        this.zzo = str5;
        this.zzp = str6;
        this.zzq = str7;
        this.zzr = str8;
        if (this.zzc == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.zzs;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.zzs;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && CastUtils.zze(this.zzc, mediaInfo.zzc) && this.zzd == mediaInfo.zzd && CastUtils.zze(this.zze, mediaInfo.zze) && CastUtils.zze(this.zzf, mediaInfo.zzf) && this.zzg == mediaInfo.zzg && CastUtils.zze(this.zzh, mediaInfo.zzh) && CastUtils.zze(this.zzi, mediaInfo.zzi) && CastUtils.zze(this.zzj, mediaInfo.zzj) && CastUtils.zze(this.zzk, mediaInfo.zzk) && CastUtils.zze(this.zzl, mediaInfo.zzl) && CastUtils.zze(this.zzm, mediaInfo.zzm) && this.zzn == mediaInfo.zzn && CastUtils.zze(this.zzo, mediaInfo.zzo) && CastUtils.zze(this.zzp, mediaInfo.zzp) && CastUtils.zze(this.zzq, mediaInfo.zzq) && CastUtils.zze(this.zzr, mediaInfo.zzr);
    }

    public List getAdBreakClips() {
        List list = this.zzk;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public List getAdBreaks() {
        List list = this.zzj;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public String getContentId() {
        String str = this.zzc;
        return str == null ? "" : str;
    }

    public String getContentType() {
        return this.zze;
    }

    public String getContentUrl() {
        return this.zzp;
    }

    public String getEntity() {
        return this.zzl;
    }

    public String getHlsSegmentFormat() {
        return this.zzq;
    }

    public String getHlsVideoSegmentFormat() {
        return this.zzr;
    }

    public List getMediaTracks() {
        return this.zzh;
    }

    public MediaMetadata getMetadata() {
        return this.zzf;
    }

    public long getStartAbsoluteTime() {
        return this.zzn;
    }

    public long getStreamDuration() {
        return this.zzg;
    }

    public int getStreamType() {
        return this.zzd;
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.zzi;
    }

    public VastAdsRequest getVmapAdsRequest() {
        return this.zzm;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzc, Integer.valueOf(this.zzd), this.zze, this.zzf, Long.valueOf(this.zzg), String.valueOf(this.zzs), this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn), this.zzo, this.zzq, this.zzr);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.zzc);
            jSONObject.putOpt("contentUrl", this.zzp);
            int i = this.zzd;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.zze;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            MediaMetadata mediaMetadata = this.zzf;
            if (mediaMetadata != null) {
                jSONObject.put("metadata", mediaMetadata.zza());
            }
            long j = this.zzg;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", CastUtils.millisecToSec(j));
            }
            if (this.zzh != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.zzh.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).zza());
                }
                jSONObject.put("tracks", jSONArray);
            }
            TextTrackStyle textTrackStyle = this.zzi;
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.zza());
            }
            JSONObject jSONObject2 = this.zzs;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.zzl;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.zzj != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.zzj.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((AdBreakInfo) it2.next()).zza());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.zzk != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.zzk.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((AdBreakClipInfo) it3.next()).zza());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            VastAdsRequest vastAdsRequest = this.zzm;
            if (vastAdsRequest != null) {
                jSONObject.put("vmapAdsRequest", vastAdsRequest.zza());
            }
            long j2 = this.zzn;
            if (j2 != -1) {
                jSONObject.put("startAbsoluteTime", CastUtils.millisecToSec(j2));
            }
            jSONObject.putOpt("atvEntity", this.zzo);
            String str3 = this.zzq;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.zzr;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00aa A[LOOP:0: B:4:0x0022->B:10:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188 A[LOOP:2: B:35:0x00d0->B:41:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzr(JSONObject jSONObject) {
        AdBreakClipInfo adBreakClipInfo;
        AdBreakInfo adBreakInfo;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Parcelable.Creator<AdBreakInfo> creator = AdBreakInfo.CREATOR;
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long secToMillisec = CastUtils.secToMillisec(jSONObject2.getLong("position"));
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long secToMillisec2 = CastUtils.secToMillisec(jSONObject2.optLong("duration"));
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                strArr[i2] = optJSONArray.getString(i2);
                            }
                        }
                        adBreakInfo = new AdBreakInfo(secToMillisec, string, secToMillisec2, optBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e) {
                        Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", e.getMessage()));
                    }
                    if (adBreakInfo != null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(adBreakInfo);
                        i++;
                    }
                }
                adBreakInfo = null;
                if (adBreakInfo != null) {
                }
            }
            this.zzj = new ArrayList(arrayList);
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            int i3 = 0;
            while (true) {
                if (i3 >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                Parcelable.Creator<AdBreakClipInfo> creator2 = AdBreakClipInfo.CREATOR;
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long secToMillisec3 = CastUtils.secToMillisec(jSONObject3.optLong("duration"));
                        String optStringOrNull = CastUtils.optStringOrNull(jSONObject3, "clickThroughUrl");
                        String optStringOrNull2 = CastUtils.optStringOrNull(jSONObject3, "contentUrl");
                        String optStringOrNull3 = CastUtils.optStringOrNull(jSONObject3, "mimeType");
                        if (optStringOrNull3 == null) {
                            optStringOrNull3 = CastUtils.optStringOrNull(jSONObject3, "contentType");
                        }
                        String str = optStringOrNull3;
                        String optStringOrNull4 = CastUtils.optStringOrNull(jSONObject3, "title");
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        adBreakClipInfo = new AdBreakClipInfo(string2, optStringOrNull4, secToMillisec3, optStringOrNull2, str, optStringOrNull, (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString(), CastUtils.optStringOrNull(jSONObject3, "contentId"), CastUtils.optStringOrNull(jSONObject3, "posterUrl"), jSONObject3.has("whenSkippable") ? CastUtils.secToMillisec(((Integer) jSONObject3.get("whenSkippable")).intValue()) : -1L, CastUtils.optStringOrNull(jSONObject3, "hlsSegmentFormat"), VastAdsRequest.fromJson(jSONObject3.optJSONObject("vastAdsRequest")));
                    } catch (JSONException e2) {
                        Log.d("AdBreakClipInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", e2.getMessage()));
                    }
                    if (adBreakClipInfo != null) {
                        arrayList2.clear();
                        break;
                    } else {
                        arrayList2.add(adBreakClipInfo);
                        i3++;
                    }
                }
                adBreakClipInfo = null;
                if (adBreakClipInfo != null) {
                }
            }
            this.zzk = new ArrayList(arrayList2);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzs;
        this.zzb = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getContentId(), false);
        SafeParcelWriter.writeInt(parcel, 3, getStreamType());
        SafeParcelWriter.writeString(parcel, 4, getContentType(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getMetadata(), i, false);
        SafeParcelWriter.writeLong(parcel, 6, getStreamDuration());
        SafeParcelWriter.writeTypedList(parcel, 7, getMediaTracks(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, getTextTrackStyle(), i, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 10, getAdBreaks(), false);
        SafeParcelWriter.writeTypedList(parcel, 11, getAdBreakClips(), false);
        SafeParcelWriter.writeString(parcel, 12, getEntity(), false);
        SafeParcelWriter.writeParcelable(parcel, 13, getVmapAdsRequest(), i, false);
        SafeParcelWriter.writeLong(parcel, 14, getStartAbsoluteTime());
        SafeParcelWriter.writeString(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, getContentUrl(), false);
        SafeParcelWriter.writeString(parcel, 17, getHlsSegmentFormat(), false);
        SafeParcelWriter.writeString(parcel, 18, getHlsVideoSegmentFormat(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        MediaInfo mediaInfo;
        int i;
        zzfq zzfqVar;
        String optString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.zzd = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.zzd = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.zzd = 2;
            } else {
                mediaInfo.zzd = -1;
            }
        }
        mediaInfo.zze = CastUtils.optStringOrNull(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject2.getInt("metadataType"));
            mediaInfo.zzf = mediaMetadata;
            mediaMetadata.zzc(jSONObject2);
        }
        mediaInfo.zzg = -1L;
        if (mediaInfo.zzd != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                mediaInfo.zzg = CastUtils.secToMillisec(optDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                Parcelable.Creator<MediaTrack> creator = MediaTrack.CREATOR;
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString(TeXSymbolParser.TYPE_ATTR);
                int i3 = "TEXT".equals(optString2) ? 1 : "AUDIO".equals(optString2) ? 2 : "VIDEO".equals(optString2) ? 3 : 0;
                String optStringOrNull = CastUtils.optStringOrNull(jSONObject3, "trackContentId");
                String optStringOrNull2 = CastUtils.optStringOrNull(jSONObject3, "trackContentType");
                String optStringOrNull3 = CastUtils.optStringOrNull(jSONObject3, "name");
                String optStringOrNull4 = CastUtils.optStringOrNull(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    i = "SUBTITLES".equals(string) ? 1 : "CAPTIONS".equals(string) ? 2 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
                } else {
                    i = 0;
                }
                if (jSONObject3.has("roles")) {
                    zzfn zzfnVar = new zzfn();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        zzfnVar.zzb(jSONArray2.optString(i4));
                    }
                    zzfqVar = zzfnVar.zzc();
                } else {
                    zzfqVar = null;
                }
                arrayList.add(new MediaTrack(j, i3, optStringOrNull, optStringOrNull2, optStringOrNull3, optStringOrNull4, i, zzfqVar, jSONObject3.optJSONObject("customData")));
            }
            mediaInfo.zzh = new ArrayList(arrayList);
        } else {
            mediaInfo.zzh = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.fromJson(jSONObject4);
            mediaInfo.zzi = textTrackStyle;
        } else {
            mediaInfo.zzi = null;
        }
        zzr(jSONObject);
        mediaInfo.zzs = jSONObject.optJSONObject("customData");
        mediaInfo.zzl = CastUtils.optStringOrNull(jSONObject, "entity");
        mediaInfo.zzo = CastUtils.optStringOrNull(jSONObject, "atvEntity");
        mediaInfo.zzm = VastAdsRequest.fromJson(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.zzn = CastUtils.secToMillisec(optDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.zzp = jSONObject.optString("contentUrl");
        }
        mediaInfo.zzq = CastUtils.optStringOrNull(jSONObject, "hlsSegmentFormat");
        mediaInfo.zzr = CastUtils.optStringOrNull(jSONObject, "hlsVideoSegmentFormat");
    }
}
