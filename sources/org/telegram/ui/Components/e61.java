package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e61 implements h3.a2 {
    public final /* synthetic */ m61 a;

    public e61(m61 m61Var) {
        this.a = m61Var;
    }

    @Override // h3.a2
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // h3.a2
    public final void onPlayerStateChanged(boolean z10, int i10) {
        m61 m61Var = this.a;
        if (m61Var.D || i10 != 3) {
            return;
        }
        m61Var.D = true;
        if (m61Var.C && m61Var.E) {
            m61Var.D();
        }
    }

    @Override // h3.a2
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onCues(r4.d dVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPositionDiscontinuity(h3.b2 b2Var, h3.b2 b2Var2, int i10) {
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
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
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
    public final /* synthetic */ void onRepeatModeChanged(int i10) {
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
    public final /* synthetic */ void onTracksChanged(h3.u2 u2Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onVideoSizeChanged(e5.x xVar) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onEvents(h3.c2 c2Var, h3.z1 z1Var) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onMediaItemTransition(h3.f1 f1Var, int i10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // h3.a2
    public final /* synthetic */ void onTimelineChanged(h3.s2 s2Var, int i10) {
    }
}
