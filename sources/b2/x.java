package b2;

import java.util.List;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class x implements d1 {
    public final m4.m1 a;
    public final d1 b;

    public x(m4.m1 m1Var, d1 d1Var) {
        this.a = m1Var;
        this.b = d1Var;
    }

    @Override // b2.d1
    public final void onAudioAttributesChanged(f fVar) {
        this.b.onAudioAttributesChanged(fVar);
    }

    @Override // b2.d1
    public final void onAudioSessionIdChanged(int i10) {
        this.b.onAudioSessionIdChanged(i10);
    }

    @Override // b2.d1
    public final void onAvailableCommandsChanged(b1 b1Var) {
        this.b.onAvailableCommandsChanged(b1Var);
    }

    @Override // b2.d1
    public final void onCues(List list) {
        this.b.onCues(list);
    }

    @Override // b2.d1
    public final void onEvents(f1 f1Var, c1 c1Var) {
        this.b.onEvents(this.a, c1Var);
    }

    @Override // b2.d1
    public final void onIsLoadingChanged(boolean z10) {
        this.b.onIsLoadingChanged(z10);
    }

    @Override // b2.d1
    public final void onIsPlayingChanged(boolean z10) {
        this.b.onIsPlayingChanged(z10);
    }

    @Override // b2.d1
    public final void onLoadingChanged(boolean z10) {
        this.b.onIsLoadingChanged(z10);
    }

    @Override // b2.d1
    public final void onMediaItemTransition(o0 o0Var, int i10) {
        this.b.onMediaItemTransition(o0Var, i10);
    }

    @Override // b2.d1
    public final void onMediaMetadataChanged(r0 r0Var) {
        this.b.onMediaMetadataChanged(r0Var);
    }

    @Override // b2.d1
    public final void onMetadata(t0 t0Var) {
        this.b.onMetadata(t0Var);
    }

    @Override // b2.d1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.b.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // b2.d1
    public final void onPlaybackParametersChanged(z0 z0Var) {
        this.b.onPlaybackParametersChanged(z0Var);
    }

    @Override // b2.d1
    public final void onPlaybackStateChanged(int i10) {
        this.b.onPlaybackStateChanged(i10);
    }

    @Override // b2.d1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        this.b.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // b2.d1
    public final void onPlayerError(y0 y0Var) {
        this.b.onPlayerError(y0Var);
    }

    @Override // b2.d1
    public final void onPlayerErrorChanged(y0 y0Var) {
        this.b.onPlayerErrorChanged(y0Var);
    }

    @Override // b2.d1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        this.b.onPlayerStateChanged(z10, i10);
    }

    @Override // b2.d1
    public final void onPlaylistMetadataChanged(r0 r0Var) {
        this.b.onPlaylistMetadataChanged(r0Var);
    }

    @Override // b2.d1
    public final void onPositionDiscontinuity(int i10) {
        this.b.onPositionDiscontinuity(i10);
    }

    @Override // b2.d1
    public final void onRenderedFirstFrame() {
        this.b.onRenderedFirstFrame();
    }

    @Override // b2.d1
    public final void onRepeatModeChanged(int i10) {
        this.b.onRepeatModeChanged(i10);
    }

    @Override // b2.d1
    public final void onShuffleModeEnabledChanged(boolean z10) {
        this.b.onShuffleModeEnabledChanged(z10);
    }

    @Override // b2.d1
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        this.b.onSkipSilenceEnabledChanged(z10);
    }

    @Override // b2.d1
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.b.onSurfaceSizeChanged(i10, i11);
    }

    @Override // b2.d1
    public final void onTimelineChanged(o1 o1Var, int i10) {
        this.b.onTimelineChanged(o1Var, i10);
    }

    @Override // b2.d1
    public final void onTrackSelectionParametersChanged(t1 t1Var) {
        this.b.onTrackSelectionParametersChanged(t1Var);
    }

    @Override // b2.d1
    public final void onTracksChanged(v1 v1Var) {
        this.b.onTracksChanged(v1Var);
    }

    @Override // b2.d1
    public final void onVideoSizeChanged(a2 a2Var) {
        this.b.onVideoSizeChanged(a2Var);
    }

    @Override // b2.d1
    public final void onVolumeChanged(float f7) {
        this.b.onVolumeChanged(f7);
    }

    @Override // b2.d1
    public final void onCues(d2.c cVar) {
        this.b.onCues(cVar);
    }

    @Override // b2.d1
    public final void onPositionDiscontinuity(e1 e1Var, e1 e1Var2, int i10) {
        this.b.onPositionDiscontinuity(e1Var, e1Var2, i10);
    }
}
