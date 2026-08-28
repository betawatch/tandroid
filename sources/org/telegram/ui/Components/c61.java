package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c61 implements h3.a2 {
    public final /* synthetic */ k61 a;

    public c61(k61 k61Var) {
        this.a = k61Var;
    }

    @Override // h3.a2
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // h3.a2
    public final void onPlayerStateChanged(boolean z10, int i9) {
        k61 k61Var = this.a;
        if (k61Var.D || i9 != 3) {
            return;
        }
        k61Var.D = true;
        if (k61Var.C && k61Var.E) {
            k61Var.D();
        }
    }

    @Override // h3.a2
    public final /* synthetic */ void onPositionDiscontinuity(int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onCues(r4.c cVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPositionDiscontinuity(h3.b2 b2Var, h3.b2 b2Var2, int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onAudioAttributesChanged(j3.e eVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onAvailableCommandsChanged(h3.y1 y1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onDeviceInfoChanged(h3.m mVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onMediaMetadataChanged(h3.h1 h1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onMetadata(z3.c cVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlaybackParametersChanged(h3.x1 x1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlaybackStateChanged(int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlayerError(h3.v1 v1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlayerErrorChanged(h3.v1 v1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // h3.a2
    public final /* synthetic */ void onRepeatModeChanged(int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onSeekProcessed() {
    }

    @Override // h3.a2
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onTracksChanged(h3.t2 t2Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onVideoSizeChanged(e5.z zVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onDeviceVolumeChanged(int i9, boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onEvents(h3.c2 c2Var, h3.z1 z1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onMediaItemTransition(h3.f1 f1Var, int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i9) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onSurfaceSizeChanged(int i9, int i10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onTimelineChanged(h3.r2 r2Var, int i9) {
    }
}
