package org.telegram.messenger.voip;

import org.webrtc.voiceengine.WebRtcAudioRecord;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback {
    @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.lambda$setIncomingAudioCapture$4(audioSamples);
    }
}
