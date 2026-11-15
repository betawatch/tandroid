package org.telegram.messenger.voip;

import org.webrtc.voiceengine.WebRtcAudioRecord;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback {
    @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.lambda$setIncomingAudioCapture$4(audioSamples);
    }
}
