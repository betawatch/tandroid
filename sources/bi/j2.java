package bi;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.us;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h10;
import org.telegram.ui.vh;
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j2(int i7, ya yaVar) {
        this.a = 3;
        this.b = i7;
        this.c = yaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02d2  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ij ijVar;
        int i7;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 19;
        int i13 = 0;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                k7 k7Var = (k7) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                        TLRPC.Message message = messages_messages.messages.get(i16);
                        if (message != null && message.id == i15) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                ijVar = new ij(k7Var.a, message, false, false);
                                ijVar.L5();
                                if (ijVar == null) {
                                    org.telegram.messenger.g0.h3(new aa.s(k7Var, tLObject, ijVar, 11));
                                    break;
                                }
                            }
                        }
                    }
                }
                ijVar = null;
                if (ijVar == null) {
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ai.e0((ea) obj, i15, tLObject, 3));
                break;
            case 2:
                di.g1 g1Var = (di.g1) obj;
                TLRPC.InputGroupCall inputGroupCall = g1Var.f;
                int i17 = g1Var.e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(i17).Y3(updates.users, false);
                    qp.s1(i17).S3(updates.chats, false);
                    ArrayList y02 = qp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj2 = y02.get(i18);
                        i18++;
                        g1Var.w = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    org.telegram.messenger.g0.h3(new di.z0(i13, g1Var, qp.z0(updates, TL_update.TL_updateGroupCallMessage.class)));
                    qp.s1(i17).O3(updates, false);
                    TLRPC.GroupCall groupCall = g1Var.w;
                    boolean z9 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList y03 = qp.y0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size2 = y03.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size2) {
                            Object obj3 = y03.get(i19);
                            i19++;
                            TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj3;
                            if (tL_updateGroupCallParticipants.call.id != g1Var.g() || z9) {
                                i7 = i17;
                            } else {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < tL_updateGroupCallParticipants.participants.size()) {
                                        i7 = i17;
                                        if (org.telegram.messenger.m5.o(tL_updateGroupCallParticipants.participants.get(i20).peer) == g1Var.b) {
                                            g1Var.G = tL_updateGroupCallParticipants.participants.get(i20);
                                        } else {
                                            i20++;
                                            i17 = i7;
                                        }
                                    } else {
                                        i7 = i17;
                                    }
                                }
                                if (g1Var.G != null) {
                                }
                            }
                            i17 = i7;
                        } else {
                            i7 = i17;
                        }
                    }
                    ArrayList y04 = qp.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                    int size3 = y04.size();
                    TLRPC.TL_dataJSON tL_dataJSON = null;
                    while (i13 < size3) {
                        Object obj4 = y04.get(i13);
                        i13++;
                        tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj4).params;
                    }
                    jg.g.u(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                    g1Var.y = true;
                    if (!g1Var.x && g1Var.E != null) {
                        if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                            g1Var.E.prepareForStream(z9);
                        } else {
                            g1Var.E.setJoinResponsePayload(tL_dataJSON.data);
                        }
                        if (g1Var.n) {
                            g1Var.E.setMuteMicrophone(g1Var.r);
                            g1Var.E.activateVideoCapturer(g1Var.J);
                            g1Var.E.setupOutgoingVideoCreated(g1Var.J);
                        } else {
                            TLRPC.GroupCallParticipant groupCallParticipant = g1Var.G;
                            if (groupCallParticipant != null) {
                                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                                if (tL_groupCallParticipantVideo != null) {
                                    NativeInstance nativeInstance = g1Var.E;
                                    String str = tL_groupCallParticipantVideo.endpoint;
                                    NativeInstance.SsrcGroup[] d = di.g1.d(tL_groupCallParticipantVideo);
                                    g1Var.r(d);
                                    nativeInstance.addIncomingVideoOutput(2, str, d, g1Var.H, org.telegram.messenger.m5.o(g1Var.G.peer));
                                } else {
                                    org.telegram.messenger.g0.h3(new di.x0(g1Var, 2));
                                }
                            } else if (z9) {
                                TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                getgroupcallstreamchannels.call = inputGroupCall;
                                ConnectionsManager.getInstance(i7).sendRequest(getgroupcallstreamchannels, new di.v0(g1Var, i14), 65536, 2, g1Var.h());
                            } else {
                                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                getgroupcall.call = inputGroupCall;
                                getgroupcall.limit = 10;
                                ConnectionsManager.getInstance(i7).sendRequest(getgroupcall, new di.y0(g1Var, 2));
                            }
                        }
                        org.telegram.messenger.g0.h3(new di.x0(g1Var, 3));
                        break;
                    } else {
                        TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                        leavegroupcall.call = inputGroupCall;
                        leavegroupcall.source = i15;
                        ConnectionsManager.getInstance(i7).sendRequest(leavegroupcall, new di.y0(g1Var, i14));
                        break;
                    }
                } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new di.x0(g1Var, 4));
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.e0(tLObject, i15, (ya) obj, 7));
                break;
            case 4:
                di.r6 r6Var = (di.r6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    while (i13 < tL_stories_stories.stories.size()) {
                        arrayList.add(r6Var.y(tL_stories_stories.stories.get(i13)));
                        i13++;
                    }
                    org.telegram.messenger.g0.h3(new ai.a1(r6Var, arrayList, tL_stories_stories, this.b, 3));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new di.o6(r6Var, i14));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.h3(new ai.e0((hi.c4) obj, tLObject, i15, 16));
                break;
            case 6:
                ((VoIPService) obj).lambda$startScreenCapture$60(i15, tLObject, tL_error);
                break;
            case 7:
                org.telegram.messenger.g0.h3(new org.telegram.ui.q8((ks0) obj, tLObject, i15, i12));
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str2 = LaunchActivity.B1;
                iz.l1 = System.currentTimeMillis();
                iz.y();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    org.telegram.messenger.g0.h3(new h10(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i15, i14));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    org.telegram.messenger.g0.h3(new us(i12));
                    break;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new us(tL_error, 20));
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.g0.h3(new h10((vh) obj, tLObject, i15, i11));
                break;
            default:
                org.telegram.messenger.g0.h3(new h10((wc1) obj, i15, tLObject, i12));
                break;
        }
    }

    public /* synthetic */ j2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
