package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediaStatus extends AbstractSafeParcelable {
    MediaInfo zza;
    long zzb;
    int zzc;
    double zzd;
    int zze;
    int zzf;
    long zzg;
    long zzh;
    double zzi;
    boolean zzj;
    long[] zzk;
    int zzl;
    int zzm;
    String zzn;
    JSONObject zzo;
    int zzp;
    final List zzq;
    boolean zzr;
    AdBreakStatus zzs;
    VideoInfo zzt;
    MediaLiveSeekableRange zzu;
    MediaQueueData zzv;
    boolean zzw;
    private final SparseArray zzy;
    private final Writer zzz;
    private static final Logger zzx = new Logger("MediaStatus");
    public static final Parcelable.Creator<MediaStatus> CREATOR = new zzcm();

    public class Writer {
        public Writer() {
        }
    }

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        this.zzq = new ArrayList();
        this.zzy = new SparseArray();
        this.zzz = new Writer();
        this.zza = mediaInfo;
        this.zzb = j;
        this.zzc = i;
        this.zzd = d;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = d2;
        this.zzj = z;
        this.zzk = jArr;
        this.zzl = i4;
        this.zzm = i5;
        this.zzn = str;
        if (str != null) {
            try {
                this.zzo = new JSONObject(this.zzn);
            } catch (JSONException unused) {
                this.zzo = null;
                this.zzn = null;
            }
        } else {
            this.zzo = null;
        }
        this.zzp = i6;
        if (list != null && !list.isEmpty()) {
            zze(list);
        }
        this.zzr = z2;
        this.zzs = adBreakStatus;
        this.zzt = videoInfo;
        this.zzu = mediaLiveSeekableRange;
        this.zzv = mediaQueueData;
        boolean z3 = false;
        if (mediaQueueData != null && mediaQueueData.zzk()) {
            z3 = true;
        }
        this.zzw = z3;
    }

    public MediaStatus(JSONObject jSONObject) {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        zza(jSONObject, 0);
    }

    private final void zze(List list) {
        this.zzq.clear();
        this.zzy.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
                this.zzq.add(mediaQueueItem);
                this.zzy.put(mediaQueueItem.getItemId(), Integer.valueOf(i));
            }
        }
    }

    private static final boolean zzf(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            }
            if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        return (this.zzo == null) == (mediaStatus.zzo == null) && this.zzb == mediaStatus.zzb && this.zzc == mediaStatus.zzc && this.zzd == mediaStatus.zzd && this.zze == mediaStatus.zze && this.zzf == mediaStatus.zzf && this.zzg == mediaStatus.zzg && this.zzi == mediaStatus.zzi && this.zzj == mediaStatus.zzj && this.zzl == mediaStatus.zzl && this.zzm == mediaStatus.zzm && this.zzp == mediaStatus.zzp && Arrays.equals(this.zzk, mediaStatus.zzk) && CastUtils.zze(Long.valueOf(this.zzh), Long.valueOf(mediaStatus.zzh)) && CastUtils.zze(this.zzq, mediaStatus.zzq) && CastUtils.zze(this.zza, mediaStatus.zza) && ((jSONObject = this.zzo) == null || (jSONObject2 = mediaStatus.zzo) == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && this.zzr == mediaStatus.isPlayingAd() && CastUtils.zze(this.zzs, mediaStatus.zzs) && CastUtils.zze(this.zzt, mediaStatus.zzt) && CastUtils.zze(this.zzu, mediaStatus.zzu) && Objects.equal(this.zzv, mediaStatus.zzv) && this.zzw == mediaStatus.zzw;
    }

    public long[] getActiveTrackIds() {
        return this.zzk;
    }

    public AdBreakStatus getAdBreakStatus() {
        return this.zzs;
    }

    public int getCurrentItemId() {
        return this.zzc;
    }

    public JSONObject getCustomData() {
        return this.zzo;
    }

    public int getIdleReason() {
        return this.zzf;
    }

    public Integer getIndexById(int i) {
        return (Integer) this.zzy.get(i);
    }

    public MediaQueueItem getItemById(int i) {
        Integer num = (Integer) this.zzy.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.zzq.get(num.intValue());
    }

    public MediaLiveSeekableRange getLiveSeekableRange() {
        return this.zzu;
    }

    public int getLoadingItemId() {
        return this.zzl;
    }

    public MediaInfo getMediaInfo() {
        return this.zza;
    }

    public double getPlaybackRate() {
        return this.zzd;
    }

    public int getPlayerState() {
        return this.zze;
    }

    public int getPreloadedItemId() {
        return this.zzm;
    }

    public MediaQueueData getQueueData() {
        return this.zzv;
    }

    public MediaQueueItem getQueueItemById(int i) {
        return getItemById(i);
    }

    public int getQueueItemCount() {
        return this.zzq.size();
    }

    public int getQueueRepeatMode() {
        return this.zzp;
    }

    public long getStreamPosition() {
        return this.zzg;
    }

    public double getStreamVolume() {
        return this.zzi;
    }

    public VideoInfo getVideoInfo() {
        return this.zzt;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb), Integer.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Double.valueOf(this.zzi), Boolean.valueOf(this.zzj), Integer.valueOf(Arrays.hashCode(this.zzk)), Integer.valueOf(this.zzl), Integer.valueOf(this.zzm), String.valueOf(this.zzo), Integer.valueOf(this.zzp), this.zzq, Boolean.valueOf(this.zzr), this.zzs, this.zzt, this.zzu, this.zzv);
    }

    public boolean isMediaCommandSupported(long j) {
        return (j & this.zzh) != 0;
    }

    public boolean isMute() {
        return this.zzj;
    }

    public boolean isPlayingAd() {
        return this.zzr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzo;
        this.zzn = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getMediaInfo(), i, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, getCurrentItemId());
        SafeParcelWriter.writeDouble(parcel, 5, getPlaybackRate());
        SafeParcelWriter.writeInt(parcel, 6, getPlayerState());
        SafeParcelWriter.writeInt(parcel, 7, getIdleReason());
        SafeParcelWriter.writeLong(parcel, 8, getStreamPosition());
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeDouble(parcel, 10, getStreamVolume());
        SafeParcelWriter.writeBoolean(parcel, 11, isMute());
        SafeParcelWriter.writeLongArray(parcel, 12, getActiveTrackIds(), false);
        SafeParcelWriter.writeInt(parcel, 13, getLoadingItemId());
        SafeParcelWriter.writeInt(parcel, 14, getPreloadedItemId());
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeTypedList(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 18, isPlayingAd());
        SafeParcelWriter.writeParcelable(parcel, 19, getAdBreakStatus(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 20, getVideoInfo(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 21, getLiveSeekableRange(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 22, getQueueData(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x018a, code lost:
    
        if (r1 != null) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(JSONObject jSONObject, int i) {
        int i2;
        MediaInfo mediaInfo;
        boolean z;
        int i3;
        MediaQueueItem mediaQueueItem;
        MediaInfo mediaInfo2;
        int i4;
        JSONObject optJSONObject = jSONObject.optJSONObject("extendedStatus");
        boolean z2 = false;
        if (optJSONObject != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                JSONObject jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    jSONObject2.put(next, optJSONObject.get(next));
                }
                jSONObject2.remove("extendedStatus");
                jSONObject = jSONObject2;
            } catch (JSONException unused) {
            }
        }
        long j = jSONObject.getLong("mediaSessionId");
        if (j != this.zzb) {
            this.zzb = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject.has("playerState")) {
            String string = jSONObject.getString("playerState");
            int i5 = 3;
            int i6 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
            if (i6 != this.zze) {
                this.zze = i6;
                i2 |= 2;
            }
            if (i6 == 1 && jSONObject.has("idleReason")) {
                String string2 = jSONObject.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i5 = 2;
                } else if (!string2.equals("INTERRUPTED")) {
                    i5 = string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                }
                if (i5 != this.zzf) {
                    this.zzf = i5;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject.has("playbackRate")) {
            double d = jSONObject.getDouble("playbackRate");
            if (this.zzd != d) {
                this.zzd = d;
                i2 |= 2;
            }
        }
        if (jSONObject.has("currentTime")) {
            long secToMillisec = CastUtils.secToMillisec(jSONObject.getDouble("currentTime"));
            if (secToMillisec != this.zzg) {
                this.zzg = secToMillisec;
                i2 |= 2;
            }
            i2 |= 128;
        }
        if (jSONObject.has("supportedMediaCommands")) {
            long j2 = jSONObject.getLong("supportedMediaCommands");
            if (j2 != this.zzh) {
                this.zzh = j2;
                i2 |= 2;
            }
        }
        if (jSONObject.has("volume") && i == 0) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("volume");
            double d2 = jSONObject3.getDouble("level");
            if (d2 != this.zzi) {
                this.zzi = d2;
                i2 |= 2;
            }
            boolean z3 = jSONObject3.getBoolean("muted");
            if (z3 != this.zzj) {
                this.zzj = z3;
                i2 |= 2;
            }
        }
        long[] zzg = CastUtils.zzg(jSONObject.has("activeTrackIds") ? jSONObject.getJSONArray("activeTrackIds") : null);
        long[] jArr = this.zzk;
        if (zzg != null) {
            if (jArr != null) {
                if (jArr.length == zzg.length) {
                    for (int i7 = 0; i7 < zzg.length; i7++) {
                        if (this.zzk[i7] == zzg[i7]) {
                        }
                    }
                }
            }
            this.zzk = zzg;
            i2 |= 2;
            break;
        }
        if (jSONObject.has("customData")) {
            this.zzo = jSONObject.getJSONObject("customData");
            this.zzn = null;
            i2 |= 2;
        }
        if (jSONObject.has("media")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
            MediaInfo mediaInfo4 = this.zza;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.zza = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject4.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject.has("currentItemId") && this.zzc != (i4 = jSONObject.getInt("currentItemId"))) {
            this.zzc = i4;
            i2 |= 2;
        }
        int optInt = jSONObject.optInt("preloadedItemId", 0);
        if (this.zzm != optInt) {
            this.zzm = optInt;
            i2 |= 16;
        }
        int optInt2 = jSONObject.optInt("loadingItemId", 0);
        if (this.zzl != optInt2) {
            this.zzl = optInt2;
            i2 |= 2;
        }
        MediaInfo mediaInfo5 = this.zza;
        if (zzf(this.zze, this.zzf, this.zzl, mediaInfo5 == null ? -1 : mediaInfo5.getStreamType())) {
            this.zzc = 0;
            this.zzl = 0;
            this.zzm = 0;
            if (!this.zzq.isEmpty()) {
                i2 |= 8;
                this.zzp = 0;
                this.zzq.clear();
                this.zzy.clear();
            }
        } else {
            if (jSONObject.has("repeatMode")) {
                Integer mediaRepeatModeFromString = MediaCommon.mediaRepeatModeFromString(jSONObject.getString("repeatMode"));
                int intValue = mediaRepeatModeFromString == null ? this.zzp : mediaRepeatModeFromString.intValue();
                if (this.zzp != intValue) {
                    this.zzp = intValue;
                    z = true;
                    if (jSONObject.has("items")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("items");
                        int length = jSONArray.length();
                        SparseArray sparseArray = new SparseArray();
                        for (int i8 = 0; i8 < length; i8++) {
                            sparseArray.put(i8, Integer.valueOf(jSONArray.getJSONObject(i8).getInt("itemId")));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        while (i3 < length) {
                            Integer num = (Integer) sparseArray.get(i3);
                            JSONObject jSONObject5 = jSONArray.getJSONObject(i3);
                            MediaQueueItem itemById = getItemById(num.intValue());
                            if (itemById != null) {
                                z |= itemById.fromJson(jSONObject5);
                                arrayList2.add(itemById);
                                i3 = i3 == getIndexById(num.intValue()).intValue() ? i3 + 1 : 0;
                            } else {
                                if (num.intValue() != this.zzc || (mediaInfo2 = this.zza) == null) {
                                    mediaQueueItem = new MediaQueueItem(jSONObject5);
                                } else {
                                    mediaQueueItem = new MediaQueueItem.Builder(mediaInfo2).build();
                                    mediaQueueItem.fromJson(jSONObject5);
                                }
                                arrayList2.add(mediaQueueItem);
                            }
                            z = true;
                        }
                        z |= !(this.zzq.size() == length);
                        zze(arrayList2);
                    }
                    if (z) {
                        i2 |= 8;
                    }
                }
            }
            z = false;
            if (jSONObject.has("items")) {
            }
            if (z) {
            }
        }
        AdBreakStatus zza = AdBreakStatus.zza(jSONObject.optJSONObject("breakStatus"));
        AdBreakStatus adBreakStatus = this.zzs;
        if ((adBreakStatus == null && zza != null) || (adBreakStatus != null && !adBreakStatus.equals(zza))) {
            if (zza != null && (zza.getBreakId() != null || zza.getBreakClipId() != null)) {
                z2 = true;
            }
            this.zzr = z2;
            this.zzs = zza;
            i2 |= 32;
        }
        VideoInfo zza2 = VideoInfo.zza(jSONObject.optJSONObject("videoInfo"));
        VideoInfo videoInfo = this.zzt;
        if ((videoInfo == null && zza2 != null) || (videoInfo != null && !videoInfo.equals(zza2))) {
            this.zzt = zza2;
            i2 |= 64;
        }
        if (jSONObject.has("breakInfo") && (mediaInfo = this.zza) != null) {
            mediaInfo.zzr(jSONObject.getJSONObject("breakInfo"));
            i2 |= 2;
        }
        if (jSONObject.has("queueData")) {
            MediaQueueData.Builder builder = new MediaQueueData.Builder();
            builder.zza(jSONObject.getJSONObject("queueData"));
            MediaQueueData build = builder.build();
            this.zzv = build;
            boolean zzk = build.zzk();
            if (this.zzw != zzk) {
                this.zzw = zzk;
                i2 |= 8;
            }
        }
        if (jSONObject.has("liveSeekableRange")) {
            int i9 = i2 | 2;
            this.zzu = MediaLiveSeekableRange.zza(jSONObject.optJSONObject("liveSeekableRange"));
            return i9;
        }
        if (this.zzu != null) {
            i2 |= 2;
        }
        this.zzu = null;
        return i2;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzd() {
        MediaInfo mediaInfo = this.zza;
        return zzf(this.zze, this.zzf, this.zzl, mediaInfo == null ? -1 : mediaInfo.getStreamType());
    }
}
