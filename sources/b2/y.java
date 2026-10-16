package b2;

import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class y implements e1 {
    public final m4.m1 a;
    public final e1 b;

    public y(m4.m1 m1Var, e1 e1Var) {
        this.a = m1Var;
        this.b = e1Var;
    }

    @Override // b2.e1
    public final void onAudioAttributesChanged(f fVar) {
        this.b.onAudioAttributesChanged(fVar);
    }

    @Override // b2.e1
    public final void onAudioSessionIdChanged(int i10) {
        this.b.onAudioSessionIdChanged(i10);
    }

    @Override // b2.e1
    public final void onAvailableCommandsChanged(c1 c1Var) {
        this.b.onAvailableCommandsChanged(c1Var);
    }

    @Override // b2.e1
    public final void onCues(List list) {
        this.b.onCues(list);
    }

    @Override // b2.e1
    public final void onEvents(g1 g1Var, d1 d1Var) {
        this.b.onEvents(this.a, d1Var);
    }

    @Override // b2.e1
    public final void onIsLoadingChanged(boolean z10) {
        this.b.onIsLoadingChanged(z10);
    }

    @Override // b2.e1
    public final void onIsPlayingChanged(boolean z10) {
        this.b.onIsPlayingChanged(z10);
    }

    @Override // b2.e1
    public final void onLoadingChanged(boolean z10) {
        this.b.onIsLoadingChanged(z10);
    }

    @Override // b2.e1
    public final void onMediaItemTransition(p0 p0Var, int i10) {
        this.b.onMediaItemTransition(p0Var, i10);
    }

    @Override // b2.e1
    public final void onMediaMetadataChanged(s0 s0Var) {
        this.b.onMediaMetadataChanged(s0Var);
    }

    @Override // b2.e1
    public final void onMetadata(u0 u0Var) {
        this.b.onMetadata(u0Var);
    }

    @Override // b2.e1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.b.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // b2.e1
    public final void onPlaybackParametersChanged(a1 a1Var) {
        this.b.onPlaybackParametersChanged(a1Var);
    }

    @Override // b2.e1
    public final void onPlaybackStateChanged(int i10) {
        this.b.onPlaybackStateChanged(i10);
    }

    @Override // b2.e1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        this.b.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // b2.e1
    public final void onPlayerError(z0 z0Var) {
        this.b.onPlayerError(z0Var);
    }

    @Override // b2.e1
    public final void onPlayerErrorChanged(z0 z0Var) {
        this.b.onPlayerErrorChanged(z0Var);
    }

    @Override // b2.e1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        this.b.onPlayerStateChanged(z10, i10);
    }

    @Override // b2.e1
    public final void onPlaylistMetadataChanged(s0 s0Var) {
        this.b.onPlaylistMetadataChanged(s0Var);
    }

    @Override // b2.e1
    public final void onPositionDiscontinuity(int i10) {
        this.b.onPositionDiscontinuity(i10);
    }

    @Override // b2.e1
    public final void onRenderedFirstFrame() {
        this.b.onRenderedFirstFrame();
    }

    @Override // b2.e1
    public final void onRepeatModeChanged(int i10) {
        this.b.onRepeatModeChanged(i10);
    }

    @Override // b2.e1
    public final void onShuffleModeEnabledChanged(boolean z10) {
        this.b.onShuffleModeEnabledChanged(z10);
    }

    @Override // b2.e1
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        this.b.onSkipSilenceEnabledChanged(z10);
    }

    @Override // b2.e1
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.b.onSurfaceSizeChanged(i10, i11);
    }

    @Override // b2.e1
    public final void onTimelineChanged(p1 p1Var, int i10) {
        this.b.onTimelineChanged(p1Var, i10);
    }

    @Override // b2.e1
    public final void onTrackSelectionParametersChanged(u1 u1Var) {
        this.b.onTrackSelectionParametersChanged(u1Var);
    }

    @Override // b2.e1
    public final void onTracksChanged(w1 w1Var) {
        this.b.onTracksChanged(w1Var);
    }

    @Override // b2.e1
    public final void onVideoSizeChanged(b2 b2Var) {
        this.b.onVideoSizeChanged(b2Var);
    }

    @Override // b2.e1
    public final void onVolumeChanged(float f7) {
        this.b.onVolumeChanged(f7);
    }

    @Override // b2.e1
    public final void onCues(d2.c cVar) {
        this.b.onCues(cVar);
    }

    @Override // b2.e1
    public final void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        this.b.onPositionDiscontinuity(f1Var, f1Var2, i10);
    }
}
