package org.telegram.messenger.voip;

import org.webrtc.voiceengine.WebRtcAudioRecord;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback {
    @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.lambda$setIncomingAudioCapture$4(audioSamples);
    }
}
