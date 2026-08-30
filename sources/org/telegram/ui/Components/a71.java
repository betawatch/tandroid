package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a71 implements j3.y1 {
    public final /* synthetic */ i71 a;

    public a71(i71 i71Var) {
        this.a = i71Var;
    }

    @Override // j3.y1
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // j3.y1
    public final void onPlayerStateChanged(boolean z4, int i10) {
        i71 i71Var = this.a;
        if (i71Var.E || i10 != 3) {
            return;
        }
        i71Var.E = true;
        if (i71Var.D && i71Var.F) {
            i71Var.C();
        }
    }

    @Override // j3.y1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onCues(v4.c cVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPositionDiscontinuity(j3.z1 z1Var, j3.z1 z1Var2, int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onAudioAttributesChanged(l3.d dVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onAvailableCommandsChanged(j3.w1 w1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onIsLoadingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onIsPlayingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onLoadingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMediaMetadataChanged(j3.e1 e1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMetadata(e4.c cVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlaybackParametersChanged(j3.v1 v1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayerError(j3.t1 t1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayerErrorChanged(j3.t1 t1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // j3.y1
    public final /* synthetic */ void onRepeatModeChanged(int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z4) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onTracksChanged(j3.q2 q2Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onVideoSizeChanged(i5.y yVar) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onEvents(j3.a2 a2Var, j3.x1 x1Var) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onMediaItemTransition(j3.c1 c1Var, int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z4, int i10) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // j3.y1
    public final /* synthetic */ void onTimelineChanged(j3.o2 o2Var, int i10) {
    }
}
