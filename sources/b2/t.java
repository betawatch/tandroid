package b2;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class t implements z0 {
    public final m4.j1 a;
    public final z0 b;

    public t(m4.j1 j1Var, z0 z0Var) {
        this.a = j1Var;
        this.b = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a.equals(tVar.a)) {
            return this.b.equals(tVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // b2.z0
    public final void onAudioAttributesChanged(e eVar) {
        this.b.onAudioAttributesChanged(eVar);
    }

    @Override // b2.z0
    public final void onAudioSessionIdChanged(int i10) {
        this.b.onAudioSessionIdChanged(i10);
    }

    @Override // b2.z0
    public final void onAvailableCommandsChanged(x0 x0Var) {
        this.b.onAvailableCommandsChanged(x0Var);
    }

    @Override // b2.z0
    public final void onCues(List list) {
        this.b.onCues(list);
    }

    @Override // b2.z0
    public final void onEvents(b1 b1Var, y0 y0Var) {
        this.b.onEvents(this.a, y0Var);
    }

    @Override // b2.z0
    public final void onIsLoadingChanged(boolean z10) {
        this.b.onIsLoadingChanged(z10);
    }

    @Override // b2.z0
    public final void onIsPlayingChanged(boolean z10) {
        this.b.onIsPlayingChanged(z10);
    }

    @Override // b2.z0
    public final void onLoadingChanged(boolean z10) {
        this.b.onIsLoadingChanged(z10);
    }

    @Override // b2.z0
    public final void onMediaItemTransition(k0 k0Var, int i10) {
        this.b.onMediaItemTransition(k0Var, i10);
    }

    @Override // b2.z0
    public final void onMediaMetadataChanged(n0 n0Var) {
        this.b.onMediaMetadataChanged(n0Var);
    }

    @Override // b2.z0
    public final void onMetadata(p0 p0Var) {
        this.b.onMetadata(p0Var);
    }

    @Override // b2.z0
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.b.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // b2.z0
    public final void onPlaybackParametersChanged(v0 v0Var) {
        this.b.onPlaybackParametersChanged(v0Var);
    }

    @Override // b2.z0
    public final void onPlaybackStateChanged(int i10) {
        this.b.onPlaybackStateChanged(i10);
    }

    @Override // b2.z0
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        this.b.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // b2.z0
    public final void onPlayerError(u0 u0Var) {
        this.b.onPlayerError(u0Var);
    }

    @Override // b2.z0
    public final void onPlayerErrorChanged(u0 u0Var) {
        this.b.onPlayerErrorChanged(u0Var);
    }

    @Override // b2.z0
    public final void onPlayerStateChanged(boolean z10, int i10) {
        this.b.onPlayerStateChanged(z10, i10);
    }

    @Override // b2.z0
    public final void onPlaylistMetadataChanged(n0 n0Var) {
        this.b.onPlaylistMetadataChanged(n0Var);
    }

    @Override // b2.z0
    public final void onPositionDiscontinuity(int i10) {
        this.b.onPositionDiscontinuity(i10);
    }

    @Override // b2.z0
    public final void onRenderedFirstFrame() {
        this.b.onRenderedFirstFrame();
    }

    @Override // b2.z0
    public final void onRepeatModeChanged(int i10) {
        this.b.onRepeatModeChanged(i10);
    }

    @Override // b2.z0
    public final void onShuffleModeEnabledChanged(boolean z10) {
        this.b.onShuffleModeEnabledChanged(z10);
    }

    @Override // b2.z0
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        this.b.onSkipSilenceEnabledChanged(z10);
    }

    @Override // b2.z0
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.b.onSurfaceSizeChanged(i10, i11);
    }

    @Override // b2.z0
    public final void onTimelineChanged(k1 k1Var, int i10) {
        this.b.onTimelineChanged(k1Var, i10);
    }

    @Override // b2.z0
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        this.b.onTrackSelectionParametersChanged(q1Var);
    }

    @Override // b2.z0
    public final void onTracksChanged(s1 s1Var) {
        this.b.onTracksChanged(s1Var);
    }

    @Override // b2.z0
    public final void onVideoSizeChanged(x1 x1Var) {
        this.b.onVideoSizeChanged(x1Var);
    }

    @Override // b2.z0
    public final void onVolumeChanged(float f7) {
        this.b.onVolumeChanged(f7);
    }

    @Override // b2.z0
    public final void onCues(d2.c cVar) {
        this.b.onCues(cVar);
    }

    @Override // b2.z0
    public final void onPositionDiscontinuity(a1 a1Var, a1 a1Var2, int i10) {
        this.b.onPositionDiscontinuity(a1Var, a1Var2, i10);
    }
}
