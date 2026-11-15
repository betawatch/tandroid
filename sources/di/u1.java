package di;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.u11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rc1;
import org.telegram.ui.th;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(int i7, m9 m9Var) {
        this.a = 3;
        this.b = i7;
        this.c = m9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190 A[LOOP:4: B:67:0x018e->B:68:0x0190, LOOP_END] */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gj gjVar;
        int size;
        int i7;
        int i10 = this.a;
        int i11 = 10;
        int i12 = 21;
        int i13 = 4;
        int i14 = 22;
        int i15 = 0;
        int i16 = 1;
        int i17 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                c6 c6Var = (c6) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i18 = 0; i18 < messages_messages.messages.size(); i18++) {
                        TLRPC.Message message = messages_messages.messages.get(i18);
                        if (message != null && message.id == i17) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                gj gjVar2 = new gj(c6Var.a, message, false, false);
                                gjVar2.L5();
                                gjVar = gjVar2;
                                if (gjVar == null) {
                                    org.telegram.messenger.g0.h3(new aa.r(c6Var, tLObject, gjVar, 17));
                                    break;
                                }
                            }
                        }
                    }
                }
                gjVar = null;
                if (gjVar == null) {
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ai.z0((v8) obj, i17, tLObject, 7));
                break;
            case 2:
                fi.e1 e1Var = (fi.e1) obj;
                TLRPC.InputGroupCall inputGroupCall = e1Var.f;
                int i19 = e1Var.e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.s1(i19).Y3(updates.users, false);
                    np.s1(i19).S3(updates.chats, false);
                    ArrayList y02 = np.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = y02.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj2 = y02.get(i20);
                        i20++;
                        e1Var.w = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    org.telegram.messenger.g0.h3(new s2(i12, e1Var, np.z0(updates, TL_update.TL_updateGroupCallMessage.class)));
                    np.s1(i19).O3(updates, false);
                    TLRPC.GroupCall groupCall = e1Var.w;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList y03 = np.y0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = y03.size();
                    int i21 = 0;
                    while (i21 < size3) {
                        Object obj3 = y03.get(i21);
                        i21++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj3;
                        if (tL_updateGroupCallParticipants.call.id == e1Var.g() && !z10) {
                            int i22 = i15;
                            while (true) {
                                if (i22 < tL_updateGroupCallParticipants.participants.size()) {
                                    if (org.telegram.messenger.m5.o(tL_updateGroupCallParticipants.participants.get(i22).peer) == e1Var.b) {
                                        e1Var.H = tL_updateGroupCallParticipants.participants.get(i22);
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                            if (e1Var.H != null) {
                                ArrayList y04 = np.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = y04.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i7 = 0;
                                while (i7 < size) {
                                    Object obj4 = y04.get(i7);
                                    i7++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj4).params;
                                }
                                i5.c.t(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                                e1Var.y = true;
                                if (!e1Var.x || e1Var.F == null) {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    leavegroupcall.source = i17;
                                    ConnectionsManager.getInstance(i19).sendRequest(leavegroupcall, new fi.y0(e1Var, 1));
                                    break;
                                } else {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        e1Var.F.prepareForStream(z10);
                                    } else {
                                        e1Var.F.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (e1Var.n) {
                                        e1Var.F.setMuteMicrophone(e1Var.r);
                                        e1Var.F.activateVideoCapturer(e1Var.K);
                                        e1Var.F.setupOutgoingVideoCreated(e1Var.K);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant = e1Var.H;
                                        int i23 = 2;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo != null) {
                                                NativeInstance nativeInstance = e1Var.F;
                                                String str = tL_groupCallParticipantVideo.endpoint;
                                                NativeInstance.SsrcGroup[] d = fi.e1.d(tL_groupCallParticipantVideo);
                                                e1Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, e1Var.I, org.telegram.messenger.m5.o(e1Var.H.peer));
                                            } else {
                                                org.telegram.messenger.g0.h3(new fi.x0(e1Var, i23));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i19).sendRequest(getgroupcallstreamchannels, new fi.v0(e1Var, 1), 65536, 2, e1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i19).sendRequest(getgroupcall, new fi.y0(e1Var, i23));
                                        }
                                    }
                                    org.telegram.messenger.g0.h3(new fi.x0(e1Var, 3));
                                    break;
                                }
                            }
                        }
                        i15 = 0;
                    }
                    ArrayList y042 = np.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = y042.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    i7 = 0;
                    while (i7 < size) {
                    }
                    i5.c.t(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                    e1Var.y = true;
                    if (!e1Var.x) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    leavegroupcall2.source = i17;
                    ConnectionsManager.getInstance(i19).sendRequest(leavegroupcall2, new fi.y0(e1Var, 1));
                } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new fi.x0(e1Var, i13));
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.z0(tLObject, i17, (m9) obj, i11));
                break;
            case 4:
                fi.k6 k6Var = (fi.k6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    while (i15 < tL_stories_stories.stories.size()) {
                        arrayList.add(k6Var.y(tL_stories_stories.stories.get(i15)));
                        i15++;
                    }
                    org.telegram.messenger.g0.h3(new ci.p0(k6Var, arrayList, tL_stories_stories, this.b, 3));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new fi.h6(k6Var, i16));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.h3(new ai.z0((ki.y3) obj, tLObject, i17, i12));
                break;
            case 6:
                ((VoIPService) obj).lambda$startScreenCapture$60(i17, tLObject, tL_error);
                break;
            case 7:
                org.telegram.messenger.g0.h3(new org.telegram.ui.f0((ks0) obj, tLObject, i17, i14));
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str2 = LaunchActivity.C1;
                gz.l1 = System.currentTimeMillis();
                gz.y();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    org.telegram.messenger.g0.h3(new u11(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i17, i13));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    org.telegram.messenger.g0.h3(new ih(23));
                    break;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new ih(tL_error, 24));
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.g0.h3(new u11((th) obj, tLObject, i17, 5));
                break;
            default:
                org.telegram.messenger.g0.h3(new u11((rc1) obj, i17, tLObject, i14));
                break;
        }
    }

    public /* synthetic */ u1(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
