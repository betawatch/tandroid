package com.google.android.exoplayer2.ext.mediasession;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.d0;
import android.support.v4.media.session.p;
import android.support.v4.media.session.t;
import android.util.Pair;
import b5.y;
import d5.f;
import d5.g;
import d5.g0;
import e5.x;
import h3.a2;
import h3.b2;
import h3.c2;
import h3.f1;
import h3.h1;
import h3.m;
import h3.r0;
import h3.r2;
import h3.s2;
import h3.u2;
import h3.v1;
import h3.x1;
import h3.y1;
import h3.z1;
import j$.util.DesugarCollections;
import j3.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import r4.d;
import z3.c;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class MediaSessionConnector {
    public static final long ALL_PLAYBACK_ACTIONS = 6554447;
    private static final int BASE_MEDIA_SESSION_FLAGS = 3;
    private static final long BASE_PLAYBACK_ACTIONS = 6554119;
    public static final long DEFAULT_PLAYBACK_ACTIONS = 2360143;
    private static final int EDITOR_MEDIA_SESSION_FLAGS = 7;
    public static final String EXTRAS_SPEED = "EXO_SPEED";
    private static final MediaMetadataCompat METADATA_EMPTY;
    private CaptionCallback captionCallback;
    private boolean clearMediaItemsOnStop;
    private final ArrayList<CommandReceiver> commandReceivers;
    private final ComponentListener componentListener;
    private Map<String, CustomActionProvider> customActionMap;
    private CustomActionProvider[] customActionProviders;
    private final ArrayList<CommandReceiver> customCommandReceivers;
    private Pair<Integer, CharSequence> customError;
    private Bundle customErrorExtras;
    private boolean dispatchUnsupportedActionsEnabled;
    private long enabledPlaybackActions;
    private f errorMessageProvider;
    private final Looper looper;
    private boolean mapIdleToStopped;
    private MediaButtonEventHandler mediaButtonEventHandler;
    private MediaMetadataProvider mediaMetadataProvider;
    public final d0 mediaSession;
    private boolean metadataDeduplicationEnabled;
    private PlaybackPreparer playbackPreparer;
    private c2 player;
    private QueueEditor queueEditor;
    private QueueNavigator queueNavigator;
    private RatingCallback ratingCallback;

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface CaptionCallback extends CommandReceiver {
        boolean hasCaptions(c2 c2Var);

        void onSetCaptioningEnabled(c2 c2Var, boolean z10);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface CommandReceiver {
        boolean onCommand(c2 c2Var, String str, Bundle bundle, ResultReceiver resultReceiver);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public class ComponentListener extends t implements a2 {
        private int currentMediaItemIndex;
        private int currentWindowCount;

        private ComponentListener() {
        }

        @Override // android.support.v4.media.session.t
        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onAddQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            if (MediaSessionConnector.this.player != null) {
                for (int i10 = 0; i10 < MediaSessionConnector.this.commandReceivers.size(); i10++) {
                    if (((CommandReceiver) MediaSessionConnector.this.commandReceivers.get(i10)).onCommand(MediaSessionConnector.this.player, str, bundle, resultReceiver)) {
                        return;
                    }
                }
                for (int i11 = 0; i11 < MediaSessionConnector.this.customCommandReceivers.size() && !((CommandReceiver) MediaSessionConnector.this.customCommandReceivers.get(i11)).onCommand(MediaSessionConnector.this.player, str, bundle, resultReceiver); i11++) {
                }
            }
        }

        @Override // h3.a2
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
        }

        @Override // android.support.v4.media.session.t
        public void onCustomAction(String str, Bundle bundle) {
            if (MediaSessionConnector.this.player == null || !MediaSessionConnector.this.customActionMap.containsKey(str)) {
                return;
            }
            ((CustomActionProvider) MediaSessionConnector.this.customActionMap.get(str)).onCustomAction(MediaSessionConnector.this.player, str, bundle);
            MediaSessionConnector.this.invalidateMediaSessionPlaybackState();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            if (r8.currentMediaItemIndex == r4) goto L24;
         */
        @Override // h3.a2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onEvents(c2 c2Var, z1 z1Var) {
            boolean z10;
            boolean z11;
            g gVar = z1Var.a;
            g gVar2 = z1Var.a;
            boolean z12 = true;
            if (gVar.a.get(11)) {
                if (this.currentMediaItemIndex != c2Var.x()) {
                    if (MediaSessionConnector.this.queueNavigator != null) {
                        MediaSessionConnector.this.queueNavigator.onCurrentMediaItemIndexChanged(c2Var);
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (gVar2.a.get(0)) {
                int o10 = c2Var.A().o();
                int x8 = c2Var.x();
                if (MediaSessionConnector.this.queueNavigator != null) {
                    MediaSessionConnector.this.queueNavigator.onTimelineChanged(c2Var);
                } else if (this.currentWindowCount == o10) {
                }
                z11 = true;
                this.currentWindowCount = o10;
                z10 = true;
            }
            this.currentMediaItemIndex = c2Var.x();
            int[] iArr = {4, 5, 7, 8, 12};
            int i10 = 0;
            while (true) {
                if (i10 >= 5) {
                    break;
                }
                if (gVar2.a.get(iArr[i10])) {
                    z11 = true;
                    break;
                }
                i10++;
            }
            if (gVar2.a.get(new int[]{9}[0])) {
                MediaSessionConnector.this.invalidateMediaSessionQueue();
            } else {
                z12 = z11;
            }
            if (z12) {
                MediaSessionConnector.this.invalidateMediaSessionPlaybackState();
            }
            if (z10) {
                MediaSessionConnector.this.invalidateMediaSessionMetadata();
            }
        }

        @Override // android.support.v4.media.session.t
        public void onFastForward() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(64L)) {
                b8.a aVar = (b8.a) MediaSessionConnector.this.player;
                long D = aVar.D() + aVar.p();
                long duration = aVar.getDuration();
                if (duration != -9223372036854775807L) {
                    D = Math.min(D, duration);
                }
                aVar.P(12, Math.max(D, 0L));
            }
        }

        @Override // android.support.v4.media.session.t
        public boolean onMediaButtonEvent(Intent intent) {
            return (MediaSessionConnector.this.canDispatchMediaButtonEvent() && MediaSessionConnector.this.mediaButtonEventHandler.onMediaButtonEvent(MediaSessionConnector.this.player, intent)) || super.onMediaButtonEvent(intent);
        }

        @Override // android.support.v4.media.session.t
        public void onPause() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(2L)) {
                ((b8.a) MediaSessionConnector.this.player).o(false);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPlay() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(4L)) {
                if (MediaSessionConnector.this.player.b() == 1) {
                    if (MediaSessionConnector.this.playbackPreparer != null) {
                        MediaSessionConnector.this.playbackPreparer.onPrepare(true);
                    } else {
                        MediaSessionConnector.this.player.a();
                    }
                } else if (MediaSessionConnector.this.player.b() == 4) {
                    MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                    mediaSessionConnector.seekTo(mediaSessionConnector.player, MediaSessionConnector.this.player.x(), -9223372036854775807L);
                }
                c2 c2Var = MediaSessionConnector.this.player;
                c2Var.getClass();
                ((b8.a) c2Var).o(true);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPlayFromMediaId(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(1024L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromMediaId(str, true, bundle);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPlayFromSearch(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(2048L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromSearch(str, true, bundle);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(8192L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromUri(uri, true, bundle);
            }
        }

        @Override // h3.a2
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        }

        @Override // android.support.v4.media.session.t
        public void onPrepare() {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(16384L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepare(false);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(32768L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromMediaId(str, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPrepareFromSearch(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(65536L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromSearch(str, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(131072L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromUri(uri, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onRemoveQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onRewind() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(8L)) {
                b8.a aVar = (b8.a) MediaSessionConnector.this.player;
                long D = aVar.D() + (-aVar.E());
                long duration = aVar.getDuration();
                if (duration != -9223372036854775807L) {
                    D = Math.min(D, duration);
                }
                aVar.P(11, Math.max(D, 0L));
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSeekTo(long j10) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(256L)) {
                MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                mediaSessionConnector.seekTo(mediaSessionConnector.player, MediaSessionConnector.this.player.x(), j10);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSetCaptioningEnabled(boolean z10) {
            if (MediaSessionConnector.this.canDispatchSetCaptioningEnabled()) {
                MediaSessionConnector.this.captionCallback.onSetCaptioningEnabled(MediaSessionConnector.this.player, z10);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSetPlaybackSpeed(float f10) {
            if (!MediaSessionConnector.this.canDispatchPlaybackAction(4194304L) || f10 <= 0.0f) {
                return;
            }
            MediaSessionConnector.this.player.setPlaybackParameters(new x1(f10, MediaSessionConnector.this.player.getPlaybackParameters().b));
        }

        @Override // android.support.v4.media.session.t
        public void onSetRating(RatingCompat ratingCompat) {
            if (MediaSessionConnector.this.canDispatchSetRating()) {
                MediaSessionConnector.this.ratingCallback.onSetRating(MediaSessionConnector.this.player, ratingCompat);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSetRepeatMode(int i10) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(262144L)) {
                int i11 = 1;
                if (i10 != 1) {
                    i11 = 2;
                    if (i10 != 2 && i10 != 3) {
                        i11 = 0;
                    }
                }
                MediaSessionConnector.this.player.e(i11);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSetShuffleMode(int i10) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(2097152L)) {
                boolean z10 = true;
                if (i10 != 1 && i10 != 2) {
                    z10 = false;
                }
                MediaSessionConnector.this.player.i(z10);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSkipToNext() {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(32L)) {
                MediaSessionConnector.this.queueNavigator.onSkipToNext(MediaSessionConnector.this.player);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSkipToPrevious() {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(16L)) {
                MediaSessionConnector.this.queueNavigator.onSkipToPrevious(MediaSessionConnector.this.player);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSkipToQueueItem(long j10) {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(4096L)) {
                MediaSessionConnector.this.queueNavigator.onSkipToQueueItem(MediaSessionConnector.this.player, j10);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onStop() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(1L)) {
                MediaSessionConnector.this.player.stop();
                if (MediaSessionConnector.this.clearMediaItemsOnStop) {
                    ((b8.a) MediaSessionConnector.this.player).n(0, ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
            }
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onCues(d dVar) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(b2 b2Var, b2 b2Var2, int i10) {
        }

        @Override // android.support.v4.media.session.t
        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onAddQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat, i10);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchSetRating()) {
                MediaSessionConnector.this.ratingCallback.onSetRating(MediaSessionConnector.this.player, ratingCompat, bundle);
            }
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // h3.a2
        @Deprecated
        public /* bridge */ /* synthetic */ void onSeekProcessed() {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(e eVar) {
        }

        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(y1 y1Var) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(m mVar) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
        }

        @Override // h3.a2
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        }

        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(h1 h1Var) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onMetadata(c cVar) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(x1 x1Var) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onPlayerError(v1 v1Var) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(v1 v1Var) {
        }

        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(h1 h1Var) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
        }

        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
        }

        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        }

        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(y yVar) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onTracksChanged(u2 u2Var) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(x xVar) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onMediaItemTransition(f1 f1Var, int i10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        @Override // h3.a2
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        }

        @Override // h3.a2
        public /* bridge */ /* synthetic */ void onTimelineChanged(s2 s2Var, int i10) {
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface CustomActionProvider {
        PlaybackStateCompat.CustomAction getCustomAction(c2 c2Var);

        void onCustomAction(c2 c2Var, String str, Bundle bundle);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static final class DefaultMediaMetadataProvider implements MediaMetadataProvider {
        private final p mediaController;
        private final String metadataExtrasPrefix;

        public DefaultMediaMetadataProvider(p pVar, String str) {
            this.mediaController = pVar;
            this.metadataExtrasPrefix = str == null ? "" : str;
        }

        @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.MediaMetadataProvider
        public MediaMetadataCompat getMetadata(c2 c2Var) {
            Object obj;
            if (c2Var.A().p()) {
                return MediaSessionConnector.METADATA_EMPTY;
            }
            android.support.v4.media.c cVar = new android.support.v4.media.c();
            if (c2Var.c()) {
                cVar.d(1L, "android.media.metadata.ADVERTISEMENT");
            }
            cVar.d((((b8.a) c2Var).I() || c2Var.getDuration() == -9223372036854775807L) ? -1L : c2Var.getDuration(), "android.media.metadata.DURATION");
            long j10 = this.mediaController.b().s;
            if (j10 != -1) {
                List<MediaSession.QueueItem> queue = this.mediaController.a.a.getQueue();
                ArrayList a2 = queue != null ? MediaSessionCompat$QueueItem.a(queue) : null;
                int i10 = 0;
                while (true) {
                    if (a2 == null || i10 >= a2.size()) {
                        break;
                    }
                    MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) a2.get(i10);
                    if (mediaSessionCompat$QueueItem.b == j10) {
                        MediaDescriptionCompat mediaDescriptionCompat = mediaSessionCompat$QueueItem.a;
                        Bundle bundle = mediaDescriptionCompat.h;
                        if (bundle != null) {
                            for (String str : bundle.keySet()) {
                                Object obj2 = bundle.get(str);
                                if (obj2 instanceof String) {
                                    cVar.e(a9.p.p(new StringBuilder(), this.metadataExtrasPrefix, str), (String) obj2);
                                } else {
                                    boolean z10 = obj2 instanceof CharSequence;
                                    Bundle bundle2 = cVar.a;
                                    if (z10) {
                                        String p6 = a9.p.p(new StringBuilder(), this.metadataExtrasPrefix, str);
                                        CharSequence charSequence = (CharSequence) obj2;
                                        a0.f fVar = MediaMetadataCompat.d;
                                        if (fVar.containsKey(p6) && ((Integer) fVar.get(p6)).intValue() != 1) {
                                            throw new IllegalArgumentException(a9.p.m("The ", p6, " key cannot be used to put a CharSequence"));
                                        }
                                        bundle2.putCharSequence(p6, charSequence);
                                    } else if (obj2 instanceof Long) {
                                        cVar.d(((Long) obj2).longValue(), a9.p.p(new StringBuilder(), this.metadataExtrasPrefix, str));
                                    } else if (obj2 instanceof Integer) {
                                        cVar.d(((Integer) obj2).intValue(), a9.p.p(new StringBuilder(), this.metadataExtrasPrefix, str));
                                    } else if (obj2 instanceof Bitmap) {
                                        cVar.c(a9.p.p(new StringBuilder(), this.metadataExtrasPrefix, str), (Bitmap) obj2);
                                    } else if (obj2 instanceof RatingCompat) {
                                        String p9 = a9.p.p(new StringBuilder(), this.metadataExtrasPrefix, str);
                                        RatingCompat ratingCompat = (RatingCompat) obj2;
                                        a0.f fVar2 = MediaMetadataCompat.d;
                                        if (fVar2.containsKey(p9) && ((Integer) fVar2.get(p9)).intValue() != 3) {
                                            throw new IllegalArgumentException(a9.p.m("The ", p9, " key cannot be used to put a Rating"));
                                        }
                                        int i11 = ratingCompat.a;
                                        if (ratingCompat.c == null) {
                                            if (ratingCompat.d()) {
                                                switch (i11) {
                                                    case 1:
                                                        ratingCompat.c = android.support.v4.media.d.g(ratingCompat.c());
                                                        break;
                                                    case 2:
                                                        ratingCompat.c = android.support.v4.media.d.j(ratingCompat.e());
                                                        break;
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                        ratingCompat.c = android.support.v4.media.d.i(i11, ratingCompat.b());
                                                        break;
                                                    case 6:
                                                        ratingCompat.c = android.support.v4.media.d.h(ratingCompat.a());
                                                        break;
                                                    default:
                                                        obj = null;
                                                        break;
                                                }
                                                bundle2.putParcelable(p9, (Parcelable) obj);
                                            } else {
                                                ratingCompat.c = android.support.v4.media.d.k(i11);
                                            }
                                        }
                                        obj = ratingCompat.c;
                                        bundle2.putParcelable(p9, (Parcelable) obj);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        CharSequence charSequence2 = mediaDescriptionCompat.b;
                        if (charSequence2 != null) {
                            String valueOf = String.valueOf(charSequence2);
                            cVar.e("android.media.metadata.TITLE", valueOf);
                            cVar.e("android.media.metadata.DISPLAY_TITLE", valueOf);
                        }
                        CharSequence charSequence3 = mediaDescriptionCompat.c;
                        if (charSequence3 != null) {
                            cVar.e("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(charSequence3));
                        }
                        CharSequence charSequence4 = mediaDescriptionCompat.d;
                        if (charSequence4 != null) {
                            cVar.e("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(charSequence4));
                        }
                        Bitmap bitmap = mediaDescriptionCompat.e;
                        if (bitmap != null) {
                            cVar.c("android.media.metadata.DISPLAY_ICON", bitmap);
                        }
                        Uri uri = mediaDescriptionCompat.f;
                        if (uri != null) {
                            cVar.e("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(uri));
                        }
                        String str2 = mediaDescriptionCompat.a;
                        if (str2 != null) {
                            cVar.e("android.media.metadata.MEDIA_ID", str2);
                        }
                        Uri uri2 = mediaDescriptionCompat.n;
                        if (uri2 != null) {
                            cVar.e("android.media.metadata.MEDIA_URI", String.valueOf(uri2));
                        }
                    } else {
                        i10++;
                    }
                }
            }
            return cVar.a();
        }

        @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.MediaMetadataProvider
        public final /* synthetic */ boolean sameAs(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
            return a.a(this, mediaMetadataCompat, mediaMetadataCompat2);
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface MediaButtonEventHandler {
        boolean onMediaButtonEvent(c2 c2Var, Intent intent);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface MediaMetadataProvider {
        MediaMetadataCompat getMetadata(c2 c2Var);

        boolean sameAs(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackActions {
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface PlaybackPreparer extends CommandReceiver {
        public static final long ACTIONS = 257024;

        long getSupportedPrepareActions();

        void onPrepare(boolean z10);

        void onPrepareFromMediaId(String str, boolean z10, Bundle bundle);

        void onPrepareFromSearch(String str, boolean z10, Bundle bundle);

        void onPrepareFromUri(Uri uri, boolean z10, Bundle bundle);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface QueueEditor extends CommandReceiver {
        void onAddQueueItem(c2 c2Var, MediaDescriptionCompat mediaDescriptionCompat);

        void onAddQueueItem(c2 c2Var, MediaDescriptionCompat mediaDescriptionCompat, int i10);

        void onRemoveQueueItem(c2 c2Var, MediaDescriptionCompat mediaDescriptionCompat);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface QueueNavigator extends CommandReceiver {
        public static final long ACTIONS = 4144;

        long getActiveQueueItemId(c2 c2Var);

        long getSupportedQueueNavigatorActions(c2 c2Var);

        void onCurrentMediaItemIndexChanged(c2 c2Var);

        void onSkipToNext(c2 c2Var);

        void onSkipToPrevious(c2 c2Var);

        void onSkipToQueueItem(c2 c2Var, long j10);

        void onTimelineChanged(c2 c2Var);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface RatingCallback extends CommandReceiver {
        void onSetRating(c2 c2Var, RatingCompat ratingCompat);

        void onSetRating(c2 c2Var, RatingCompat ratingCompat, Bundle bundle);
    }

    static {
        r0.a("goog.exo.mediasession");
        METADATA_EMPTY = new MediaMetadataCompat(new Bundle());
    }

    public MediaSessionConnector(d0 d0Var) {
        this.mediaSession = d0Var;
        int i10 = g0.a;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.looper = myLooper;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.commandReceivers = new ArrayList<>();
        this.customCommandReceivers = new ArrayList<>();
        this.customActionProviders = new CustomActionProvider[0];
        this.customActionMap = Collections.EMPTY_MAP;
        this.mediaMetadataProvider = new DefaultMediaMetadataProvider(d0Var.b, null);
        this.enabledPlaybackActions = DEFAULT_PLAYBACK_ACTIONS;
        d0Var.a.a.setFlags(3);
        d0Var.d(componentListener, new Handler(myLooper));
        this.clearMediaItemsOnStop = true;
    }

    private long buildPlaybackActions(c2 c2Var) {
        boolean z10;
        b8.a aVar = (b8.a) c2Var;
        boolean H = aVar.H(5);
        boolean H2 = aVar.H(11);
        boolean H3 = aVar.H(12);
        boolean z11 = false;
        if (aVar.A().p() || aVar.c()) {
            z10 = false;
        } else {
            boolean z12 = this.ratingCallback != null;
            CaptionCallback captionCallback = this.captionCallback;
            if (captionCallback != null && captionCallback.hasCaptions(aVar)) {
                z11 = true;
            }
            boolean z13 = z11;
            z11 = z12;
            z10 = z13;
        }
        long j10 = H ? 6554375L : BASE_PLAYBACK_ACTIONS;
        if (H3) {
            j10 |= 64;
        }
        if (H2) {
            j10 |= 8;
        }
        long j11 = this.enabledPlaybackActions & j10;
        QueueNavigator queueNavigator = this.queueNavigator;
        if (queueNavigator != null) {
            j11 |= QueueNavigator.ACTIONS & queueNavigator.getSupportedQueueNavigatorActions(aVar);
        }
        if (z11) {
            j11 |= 128;
        }
        return z10 ? j11 | 1048576 : j11;
    }

    private long buildPrepareActions() {
        PlaybackPreparer playbackPreparer = this.playbackPreparer;
        if (playbackPreparer == null) {
            return 0L;
        }
        return PlaybackPreparer.ACTIONS & playbackPreparer.getSupportedPrepareActions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchMediaButtonEvent() {
        return (this.player == null || this.mediaButtonEventHandler == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchPlaybackAction(long j10) {
        if (this.player != null) {
            return (j10 & this.enabledPlaybackActions) != 0 || this.dispatchUnsupportedActionsEnabled;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchQueueEdit() {
        return (this.player == null || this.queueEditor == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchSetCaptioningEnabled() {
        return (this.player == null || this.captionCallback == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchSetRating() {
        return (this.player == null || this.ratingCallback == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchToPlaybackPreparer(long j10) {
        PlaybackPreparer playbackPreparer = this.playbackPreparer;
        if (playbackPreparer != null) {
            return (j10 & playbackPreparer.getSupportedPrepareActions()) != 0 || this.dispatchUnsupportedActionsEnabled;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchToQueueNavigator(long j10) {
        QueueNavigator queueNavigator;
        c2 c2Var = this.player;
        if (c2Var == null || (queueNavigator = this.queueNavigator) == null) {
            return false;
        }
        return (j10 & queueNavigator.getSupportedQueueNavigatorActions(c2Var)) != 0 || this.dispatchUnsupportedActionsEnabled;
    }

    private int getMediaSessionPlaybackState(int i10, boolean z10) {
        if (i10 == 2) {
            return z10 ? 6 : 2;
        }
        if (i10 == 3) {
            return z10 ? 3 : 2;
        }
        if (i10 != 4) {
            return this.mapIdleToStopped ? 1 : 0;
        }
        return 1;
    }

    private void registerCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver == null || this.commandReceivers.contains(commandReceiver)) {
            return;
        }
        this.commandReceivers.add(commandReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(c2 c2Var, int i10, long j10) {
        ((b8.a) c2Var).O(j10, i10, 10, false);
    }

    private void unregisterCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver != null) {
            this.commandReceivers.remove(commandReceiver);
        }
    }

    public final void invalidateMediaSessionMetadata() {
        MediaMetadataCompat a2;
        c2 c2Var;
        MediaMetadataProvider mediaMetadataProvider = this.mediaMetadataProvider;
        MediaMetadataCompat metadata = (mediaMetadataProvider == null || (c2Var = this.player) == null) ? METADATA_EMPTY : mediaMetadataProvider.getMetadata(c2Var);
        MediaMetadataProvider mediaMetadataProvider2 = this.mediaMetadataProvider;
        if (!this.metadataDeduplicationEnabled || mediaMetadataProvider2 == null || (a2 = this.mediaSession.b.a()) == null || !mediaMetadataProvider2.sameAs(a2, metadata)) {
            this.mediaSession.e(metadata);
        }
    }

    public final void invalidateMediaSessionPlaybackState() {
        ArrayList arrayList = new ArrayList();
        c2 c2Var = this.player;
        CharSequence charSequence = null;
        int i10 = 0;
        if (c2Var == null) {
            long buildPrepareActions = buildPrepareActions();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.mediaSession.h(0);
            this.mediaSession.i(0);
            this.mediaSession.f(new PlaybackStateCompat(0, 0L, 0L, 0.0f, buildPrepareActions, 0, null, elapsedRealtime, arrayList, -1L, null));
            return;
        }
        HashMap hashMap = new HashMap();
        for (CustomActionProvider customActionProvider : this.customActionProviders) {
            PlaybackStateCompat.CustomAction customAction = customActionProvider.getCustomAction(c2Var);
            if (customAction != null) {
                hashMap.put(customAction.a, customActionProvider);
                arrayList.add(customAction);
            }
        }
        this.customActionMap = DesugarCollections.unmodifiableMap(hashMap);
        Bundle bundle = new Bundle();
        int mediaSessionPlaybackState = (c2Var.v() == null && this.customError == null) ? getMediaSessionPlaybackState(c2Var.b(), c2Var.h()) : 7;
        Pair<Integer, CharSequence> pair = this.customError;
        if (pair != null) {
            i10 = ((Integer) pair.first).intValue();
            charSequence = (CharSequence) this.customError.second;
            Bundle bundle2 = this.customErrorExtras;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
        QueueNavigator queueNavigator = this.queueNavigator;
        long activeQueueItemId = queueNavigator != null ? queueNavigator.getActiveQueueItemId(c2Var) : -1L;
        float f10 = c2Var.getPlaybackParameters().a;
        bundle.putFloat(EXTRAS_SPEED, f10);
        b8.a aVar = (b8.a) c2Var;
        float f11 = aVar.K() ? f10 : 0.0f;
        s2 A = aVar.A();
        f1 f1Var = A.p() ? null : A.m(aVar.x(), (r2) aVar.a, 0L).c;
        if (f1Var != null) {
            String str = f1Var.a;
            if (!"".equals(str)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str);
            }
        }
        long buildPlaybackActions = buildPlaybackActions(c2Var) | buildPrepareActions();
        long t10 = c2Var.t();
        long D = c2Var.D();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int g10 = c2Var.g();
        this.mediaSession.h(g10 == 1 ? 1 : g10 == 2 ? 2 : 0);
        this.mediaSession.i(c2Var.C() ? 1 : 0);
        this.mediaSession.f(new PlaybackStateCompat(mediaSessionPlaybackState, D, t10, f11, buildPlaybackActions, i10, charSequence, elapsedRealtime2, arrayList, activeQueueItemId, bundle));
    }

    public final void invalidateMediaSessionQueue() {
        c2 c2Var;
        QueueNavigator queueNavigator = this.queueNavigator;
        if (queueNavigator == null || (c2Var = this.player) == null) {
            return;
        }
        queueNavigator.onTimelineChanged(c2Var);
    }

    public void registerCustomCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver == null || this.customCommandReceivers.contains(commandReceiver)) {
            return;
        }
        this.customCommandReceivers.add(commandReceiver);
    }

    public void setCaptionCallback(CaptionCallback captionCallback) {
        CaptionCallback captionCallback2 = this.captionCallback;
        if (captionCallback2 != captionCallback) {
            unregisterCommandReceiver(captionCallback2);
            this.captionCallback = captionCallback;
            registerCommandReceiver(captionCallback);
        }
    }

    public void setClearMediaItemsOnStop(boolean z10) {
        this.clearMediaItemsOnStop = z10;
    }

    public void setCustomActionProviders(CustomActionProvider... customActionProviderArr) {
        if (customActionProviderArr == null) {
            customActionProviderArr = new CustomActionProvider[0];
        }
        this.customActionProviders = customActionProviderArr;
        invalidateMediaSessionPlaybackState();
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        setCustomErrorMessage(charSequence, charSequence == null ? 0 : 1);
    }

    public void setDispatchUnsupportedActionsEnabled(boolean z10) {
        this.dispatchUnsupportedActionsEnabled = z10;
    }

    public void setEnabledPlaybackActions(long j10) {
        long j11 = j10 & ALL_PLAYBACK_ACTIONS;
        if (this.enabledPlaybackActions != j11) {
            this.enabledPlaybackActions = j11;
            invalidateMediaSessionPlaybackState();
        }
    }

    public void setErrorMessageProvider(f fVar) {
        if (fVar != null) {
            invalidateMediaSessionPlaybackState();
        }
    }

    public void setMapStateIdleToSessionStateStopped(boolean z10) {
        this.mapIdleToStopped = z10;
    }

    public void setMediaButtonEventHandler(MediaButtonEventHandler mediaButtonEventHandler) {
        this.mediaButtonEventHandler = mediaButtonEventHandler;
    }

    public void setMediaMetadataProvider(MediaMetadataProvider mediaMetadataProvider) {
        if (this.mediaMetadataProvider != mediaMetadataProvider) {
            this.mediaMetadataProvider = mediaMetadataProvider;
            invalidateMediaSessionMetadata();
        }
    }

    public void setMetadataDeduplicationEnabled(boolean z10) {
        this.metadataDeduplicationEnabled = z10;
    }

    public void setPlaybackPreparer(PlaybackPreparer playbackPreparer) {
        PlaybackPreparer playbackPreparer2 = this.playbackPreparer;
        if (playbackPreparer2 != playbackPreparer) {
            unregisterCommandReceiver(playbackPreparer2);
            this.playbackPreparer = playbackPreparer;
            registerCommandReceiver(playbackPreparer);
            invalidateMediaSessionPlaybackState();
        }
    }

    public void setPlayer(c2 c2Var) {
        d5.a.f(c2Var == null || c2Var.B() == this.looper);
        c2 c2Var2 = this.player;
        if (c2Var2 != null) {
            c2Var2.r(this.componentListener);
        }
        this.player = c2Var;
        if (c2Var != null) {
            c2Var.k(this.componentListener);
        }
        invalidateMediaSessionPlaybackState();
        invalidateMediaSessionMetadata();
    }

    public void setQueueEditor(QueueEditor queueEditor) {
        QueueEditor queueEditor2 = this.queueEditor;
        if (queueEditor2 != queueEditor) {
            unregisterCommandReceiver(queueEditor2);
            this.queueEditor = queueEditor;
            registerCommandReceiver(queueEditor);
            this.mediaSession.a.a.setFlags((queueEditor == null ? 3 : 7) | 3);
        }
    }

    public void setQueueNavigator(QueueNavigator queueNavigator) {
        QueueNavigator queueNavigator2 = this.queueNavigator;
        if (queueNavigator2 != queueNavigator) {
            unregisterCommandReceiver(queueNavigator2);
            this.queueNavigator = queueNavigator;
            registerCommandReceiver(queueNavigator);
        }
    }

    public void setRatingCallback(RatingCallback ratingCallback) {
        RatingCallback ratingCallback2 = this.ratingCallback;
        if (ratingCallback2 != ratingCallback) {
            unregisterCommandReceiver(ratingCallback2);
            this.ratingCallback = ratingCallback;
            registerCommandReceiver(ratingCallback);
        }
    }

    public void unregisterCustomCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver != null) {
            this.customCommandReceivers.remove(commandReceiver);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence, int i10) {
        setCustomErrorMessage(charSequence, i10, null);
    }

    public void setCustomErrorMessage(CharSequence charSequence, int i10, Bundle bundle) {
        this.customError = charSequence == null ? null : new Pair<>(Integer.valueOf(i10), charSequence);
        if (charSequence == null) {
            bundle = null;
        }
        this.customErrorExtras = bundle;
        invalidateMediaSessionPlaybackState();
    }
}
