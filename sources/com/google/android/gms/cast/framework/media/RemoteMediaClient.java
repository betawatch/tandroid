package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadOptions;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzaq;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzed;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RemoteMediaClient implements Cast.MessageReceivedCallback {
    private final zzaq zzd;
    private final zzbf zze;
    private final MediaQueue zzf;
    private com.google.android.gms.cast.zzr zzg;
    private TaskCompletionSource zzh;
    private static final Logger zza = new Logger("RemoteMediaClient");
    public static final String NAMESPACE = zzaq.zzb;
    private final List zzi = new CopyOnWriteArrayList();
    private final List zzj = new CopyOnWriteArrayList();
    private final Map zzk = new ConcurrentHashMap();
    private final Map zzl = new ConcurrentHashMap();
    private final Object zzb = new Object();
    private final Handler zzc = new zzed(Looper.getMainLooper());

    public static abstract class Callback {
        public void onAdBreakStatusUpdated() {
        }

        public void onMediaError(MediaError mediaError) {
        }

        public void onMetadataUpdated() {
        }

        public void onPreloadStatusUpdated() {
        }

        public void onQueueStatusUpdated() {
        }

        public void onSendingRemoteMediaRequest() {
        }

        public void onStatusUpdated() {
        }

        public void zza(String str, long j, int i, long j2, long j3) {
        }

        public void zzb(int[] iArr) {
        }

        public void zzc(int[] iArr, int i) {
        }

        public void zzd(MediaQueueItem[] mediaQueueItemArr) {
        }

        public void zze(int[] iArr) {
        }

        public void zzf(List list, List list2, int i) {
        }

        public void zzg(int[] iArr) {
        }

        public void zzh() {
        }
    }

    public interface MediaChannelResult extends Result {
    }

    public interface ParseAdsInfoCallback {
    }

    public RemoteMediaClient(zzaq zzaqVar) {
        zzbf zzbfVar = new zzbf(this);
        this.zze = zzbfVar;
        zzaq zzaqVar2 = (zzaq) Preconditions.checkNotNull(zzaqVar);
        this.zzd = zzaqVar2;
        zzaqVar2.zzQ(new zzbn(this, null));
        zzaqVar2.zzh(zzbfVar);
        this.zzf = new MediaQueue(this, 20, 20);
    }

    static /* bridge */ /* synthetic */ ParseAdsInfoCallback zzc(RemoteMediaClient remoteMediaClient) {
        remoteMediaClient.getClass();
        return null;
    }

    public static PendingResult zzf(int i, String str) {
        zzbh zzbhVar = new zzbh();
        zzbhVar.setResult(new zzbg(zzbhVar, new Status(i, str)));
        return zzbhVar;
    }

    static /* bridge */ /* synthetic */ void zzo(RemoteMediaClient remoteMediaClient) {
        Iterator it = remoteMediaClient.zzl.values().iterator();
        if (it.hasNext()) {
            ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (remoteMediaClient.hasMediaSession()) {
                throw null;
            }
            remoteMediaClient.hasMediaSession();
            throw null;
        }
    }

    private final boolean zzy() {
        return this.zzg != null;
    }

    private static final zzbk zzz(zzbk zzbkVar) {
        try {
            zzbkVar.zzc();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            zzbkVar.setResult(new zzbj(zzbkVar, new Status(2100)));
        }
        return zzbkVar;
    }

    public long getApproximateStreamPosition() {
        long zzm;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzm = this.zzd.zzm();
        }
        return zzm;
    }

    public int getIdleReason() {
        int idleReason;
        synchronized (this.zzb) {
            try {
                Preconditions.checkMainThread("Must be called from the main thread.");
                MediaStatus mediaStatus = getMediaStatus();
                idleReason = mediaStatus != null ? mediaStatus.getIdleReason() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return idleReason;
    }

    public MediaQueueItem getLoadingItem() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getQueueItemById(mediaStatus.getLoadingItemId());
    }

    public MediaInfo getMediaInfo() {
        MediaInfo zzK;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzK = this.zzd.zzK();
        }
        return zzK;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus zzL;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzL = this.zzd.zzL();
        }
        return zzL;
    }

    public String getNamespace() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzd.zze();
    }

    public int getPlayerState() {
        int playerState;
        synchronized (this.zzb) {
            try {
                Preconditions.checkMainThread("Must be called from the main thread.");
                MediaStatus mediaStatus = getMediaStatus();
                playerState = mediaStatus != null ? mediaStatus.getPlayerState() : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return playerState;
    }

    public long getStreamDuration() {
        long zzo;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzo = this.zzd.zzo();
        }
        return zzo;
    }

    public boolean hasMediaSession() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return isBuffering() || zzv() || isPlaying() || isPaused() || isLoadingNextItem();
    }

    public boolean isBuffering() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return mediaStatus != null && mediaStatus.getPlayerState() == 4;
    }

    public boolean isLiveStream() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaInfo mediaInfo = getMediaInfo();
        return mediaInfo != null && mediaInfo.getStreamType() == 2;
    }

    public boolean isLoadingNextItem() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return (mediaStatus == null || mediaStatus.getLoadingItemId() == 0) ? false : true;
    }

    public boolean isPaused() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus == null) {
            return false;
        }
        if (mediaStatus.getPlayerState() != 3) {
            return isLiveStream() && getIdleReason() == 2;
        }
        return true;
    }

    public boolean isPlaying() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return mediaStatus != null && mediaStatus.getPlayerState() == 2;
    }

    public boolean isPlayingAd() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return mediaStatus != null && mediaStatus.isPlayingAd();
    }

    public PendingResult load(MediaInfo mediaInfo, MediaLoadOptions mediaLoadOptions) {
        MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();
        builder.setMediaInfo(mediaInfo);
        builder.setAutoplay(Boolean.valueOf(mediaLoadOptions.getAutoplay()));
        builder.setCurrentTime(mediaLoadOptions.getPlayPosition());
        builder.setPlaybackRate(mediaLoadOptions.getPlaybackRate());
        builder.setActiveTrackIds(mediaLoadOptions.getActiveTrackIds());
        builder.setCustomData(mediaLoadOptions.getCustomData());
        builder.setCredentials(mediaLoadOptions.getCredentials());
        builder.setCredentialsType(mediaLoadOptions.getCredentialsType());
        return load(builder.build());
    }

    public PendingResult load(MediaLoadRequestData mediaLoadRequestData) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzav zzavVar = new zzav(this, mediaLoadRequestData);
        zzz(zzavVar);
        return zzavVar;
    }

    @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
    public void onMessageReceived(CastDevice castDevice, String str, String str2) {
        this.zzd.zzO(str2);
    }

    public PendingResult pause() {
        return pause(null);
    }

    public PendingResult pause(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzax zzaxVar = new zzax(this, jSONObject);
        zzz(zzaxVar);
        return zzaxVar;
    }

    public PendingResult play() {
        return play(null);
    }

    public PendingResult play(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzaz zzazVar = new zzaz(this, jSONObject);
        zzz(zzazVar);
        return zzazVar;
    }

    public PendingResult queueNext(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzan zzanVar = new zzan(this, jSONObject);
        zzz(zzanVar);
        return zzanVar;
    }

    public PendingResult queuePrev(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzam zzamVar = new zzam(this, jSONObject);
        zzz(zzamVar);
        return zzamVar;
    }

    public PendingResult queueSetRepeatMode(int i, JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzao zzaoVar = new zzao(this, i, jSONObject);
        zzz(zzaoVar);
        return zzaoVar;
    }

    public void registerCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (callback != null) {
            this.zzj.add(callback);
        }
    }

    public PendingResult requestStatus() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzac zzacVar = new zzac(this);
        zzz(zzacVar);
        return zzacVar;
    }

    public PendingResult seek(long j) {
        return seek(j, 0, null);
    }

    public PendingResult seek(long j, int i, JSONObject jSONObject) {
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.setPosition(j);
        builder.setResumeState(i);
        builder.setCustomData(jSONObject);
        return seek(builder.build());
    }

    public PendingResult seek(MediaSeekOptions mediaSeekOptions) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzba zzbaVar = new zzba(this, mediaSeekOptions);
        zzz(zzbaVar);
        return zzbaVar;
    }

    public PendingResult setPlaybackRate(double d) {
        return setPlaybackRate(d, null);
    }

    public PendingResult setPlaybackRate(double d, JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzbd zzbdVar = new zzbd(this, d, jSONObject);
        zzz(zzbdVar);
        return zzbdVar;
    }

    public PendingResult setStreamVolume(double d) {
        return setStreamVolume(d, null);
    }

    public PendingResult setStreamVolume(double d, JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzbb zzbbVar = new zzbb(this, d, jSONObject);
        zzz(zzbbVar);
        return zzbbVar;
    }

    public void togglePlayback() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        int playerState = getPlayerState();
        if (playerState == 4 || playerState == 2) {
            pause();
        } else {
            play();
        }
    }

    public void unregisterCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (callback != null) {
            this.zzj.remove(callback);
        }
    }

    public final int zza() {
        MediaQueueItem loadingItem;
        if (getMediaInfo() != null && hasMediaSession()) {
            if (isBuffering()) {
                return 6;
            }
            if (isPlaying()) {
                return 3;
            }
            if (isPaused()) {
                return 2;
            }
            if (isLoadingNextItem() && (loadingItem = getLoadingItem()) != null && loadingItem.getMedia() != null) {
                return 6;
            }
        }
        return 0;
    }

    public final PendingResult zzi() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzas zzasVar = new zzas(this, true);
        zzz(zzasVar);
        return zzasVar;
    }

    public final PendingResult zzj(int[] iArr) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzat zzatVar = new zzat(this, true, iArr);
        zzz(zzatVar);
        return zzatVar;
    }

    public final Task zzk(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return Tasks.forException(new com.google.android.gms.cast.internal.zzao());
        }
        this.zzh = new TaskCompletionSource();
        zza.d("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
        MediaInfo mediaInfo = getMediaInfo();
        MediaStatus mediaStatus = getMediaStatus();
        SessionState sessionState = null;
        if (mediaInfo != null && mediaStatus != null) {
            MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();
            builder.setMediaInfo(mediaInfo);
            builder.setCurrentTime(getApproximateStreamPosition());
            builder.setQueueData(mediaStatus.getQueueData());
            builder.setPlaybackRate(mediaStatus.getPlaybackRate());
            builder.setActiveTrackIds(mediaStatus.getActiveTrackIds());
            builder.setCustomData(mediaStatus.getCustomData());
            MediaLoadRequestData build = builder.build();
            SessionState.Builder builder2 = new SessionState.Builder();
            builder2.setLoadRequestData(build);
            sessionState = builder2.build();
        }
        TaskCompletionSource taskCompletionSource = this.zzh;
        if (sessionState != null) {
            taskCompletionSource.setResult(sessionState);
        } else {
            taskCompletionSource.setException(new com.google.android.gms.cast.internal.zzao());
        }
        return this.zzh.getTask();
    }

    public final void zzq() {
        com.google.android.gms.cast.zzr zzrVar = this.zzg;
        if (zzrVar == null) {
            return;
        }
        zzrVar.zzi(getNamespace(), this);
        requestStatus();
    }

    public final void zzr(SessionState sessionState) {
        MediaLoadRequestData loadRequestData;
        if (sessionState == null || (loadRequestData = sessionState.getLoadRequestData()) == null) {
            return;
        }
        zza.d("resume SessionState", new Object[0]);
        load(loadRequestData);
    }

    public final void zzs(com.google.android.gms.cast.zzr zzrVar) {
        com.google.android.gms.cast.zzr zzrVar2 = this.zzg;
        if (zzrVar2 == zzrVar) {
            return;
        }
        if (zzrVar2 != null) {
            this.zzd.zzf();
            this.zzf.zzl();
            zzrVar2.zzg(getNamespace());
            this.zze.zzc(null);
            this.zzc.removeCallbacksAndMessages(null);
        }
        this.zzg = zzrVar;
        if (zzrVar != null) {
            this.zze.zzc(zzrVar);
        }
    }

    public final boolean zzt() {
        Integer indexById;
        if (!hasMediaSession()) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) Preconditions.checkNotNull(getMediaStatus());
        return mediaStatus.isMediaCommandSupported(64L) || mediaStatus.getQueueRepeatMode() != 0 || ((indexById = mediaStatus.getIndexById(mediaStatus.getCurrentItemId())) != null && indexById.intValue() < mediaStatus.getQueueItemCount() + (-1));
    }

    public final boolean zzu() {
        Integer indexById;
        if (!hasMediaSession()) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) Preconditions.checkNotNull(getMediaStatus());
        return mediaStatus.isMediaCommandSupported(128L) || mediaStatus.getQueueRepeatMode() != 0 || ((indexById = mediaStatus.getIndexById(mediaStatus.getCurrentItemId())) != null && indexById.intValue() > 0);
    }

    final boolean zzv() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return mediaStatus != null && mediaStatus.getPlayerState() == 5;
    }
}
