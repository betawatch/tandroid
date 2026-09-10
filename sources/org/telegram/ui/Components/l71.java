package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l71 implements b2.z0 {
    public final /* synthetic */ t71 a;

    public l71(t71 t71Var) {
        this.a = t71Var;
    }

    @Override // b2.z0
    public final /* synthetic */ void onCues(d2.c cVar) {
    }

    @Override // b2.z0
    public final void onPlayerStateChanged(boolean z10, int i10) {
        t71 t71Var = this.a;
        if (t71Var.H || i10 != 3) {
            return;
        }
        t71Var.H = true;
        if (t71Var.G && t71Var.I) {
            t71Var.C();
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onAudioAttributesChanged(b2.e eVar) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onAudioSessionIdChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onAvailableCommandsChanged(b2.x0 x0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onMediaMetadataChanged(b2.n0 n0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onMetadata(b2.p0 p0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaybackParametersChanged(b2.v0 v0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayerError(b2.u0 u0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayerErrorChanged(b2.u0 u0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaylistMetadataChanged(b2.n0 n0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // b2.z0
    public final /* synthetic */ void onRepeatModeChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onTrackSelectionParametersChanged(b2.q1 q1Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onTracksChanged(b2.s1 s1Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onVideoSizeChanged(b2.x1 x1Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onVolumeChanged(float f7) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onEvents(b2.b1 b1Var, b2.y0 y0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onMediaItemTransition(b2.k0 k0Var, int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onTimelineChanged(b2.k1 k1Var, int i10) {
    }
}
