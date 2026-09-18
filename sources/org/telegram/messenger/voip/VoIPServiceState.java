package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public interface VoIPServiceState {
    void acceptIncomingCall();

    void declineIncomingCall();

    long getCallDuration();

    int getCallState();

    TLRPC.GroupCall getGroupCall();

    ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants();

    TL_phone.PhoneCall getPrivateCall();

    TLRPC.User getUser();

    boolean isCallingVideo();

    boolean isConference();

    boolean isOutgoing();

    void stopRinging();
}
