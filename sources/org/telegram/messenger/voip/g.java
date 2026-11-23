package org.telegram.messenger.voip;

import org.webrtc.voiceengine.WebRtcAudioRecord;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback {
    @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.lambda$setIncomingAudioCapture$4(audioSamples);
    }
}
