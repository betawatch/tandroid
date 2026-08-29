package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
