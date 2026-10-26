package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
