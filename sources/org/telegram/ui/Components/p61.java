package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p61 implements j3.a2 {
    public final /* synthetic */ x61 a;

    public p61(x61 x61Var) {
        this.a = x61Var;
    }

    @Override // j3.a2
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // j3.a2
    public final void onPlayerStateChanged(boolean z10, int i10) {
        x61 x61Var = this.a;
        if (x61Var.D || i10 != 3) {
            return;
        }
        x61Var.D = true;
        if (x61Var.C && x61Var.E) {
            x61Var.D();
        }
    }

    @Override // j3.a2
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onCues(t4.c cVar) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onPositionDiscontinuity(j3.b2 b2Var, j3.b2 b2Var2, int i10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onAudioAttributesChanged(l3.e eVar) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onAvailableCommandsChanged(j3.y1 y1Var) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onDeviceInfoChanged(j3.m mVar) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onMediaMetadataChanged(j3.h1 h1Var) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onMetadata(b4.c cVar) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onPlaybackParametersChanged(j3.x1 x1Var) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onPlayerError(j3.v1 v1Var) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onPlayerErrorChanged(j3.v1 v1Var) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // j3.a2
    public final /* synthetic */ void onRepeatModeChanged(int i10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onSeekProcessed() {
    }

    @Override // j3.a2
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onTracksChanged(j3.t2 t2Var) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onVideoSizeChanged(g5.y yVar) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onVolumeChanged(float f9) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onEvents(j3.c2 c2Var, j3.z1 z1Var) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onMediaItemTransition(j3.f1 f1Var, int i10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // j3.a2
    public final /* synthetic */ void onTimelineChanged(j3.r2 r2Var, int i10) {
    }
}
