package di;

import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
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
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1(int i7, p9 p9Var) {
        this.a = 3;
        this.b = i7;
        this.c = p9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c A[LOOP:4: B:67:0x018a->B:68:0x018c, LOOP_END] */
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
        int i12 = 25;
        int i13 = 4;
        int i14 = 22;
        int i15 = 0;
        int i16 = 1;
        int i17 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i18 = 0; i18 < messages_messages.messages.size(); i18++) {
                        TLRPC.Message message = messages_messages.messages.get(i18);
                        if (message != null && message.id == i17) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                gj gjVar2 = new gj(f6Var.a, message, false, false);
                                gjVar2.L5();
                                gjVar = gjVar2;
                                if (gjVar == null) {
                                    org.telegram.messenger.g0.g3(new aa.r(f6Var, tLObject, gjVar, 20));
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
                org.telegram.messenger.g0.g3(new ai.j1((y8) obj, i17, tLObject, 7));
                break;
            case 2:
                fi.c1 c1Var = (fi.c1) obj;
                TLRPC.InputGroupCall inputGroupCall = c1Var.f;
                int i19 = c1Var.e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.u1(i19).f4(updates.users, false);
                    np.u1(i19).Z3(updates.chats, false);
                    ArrayList A0 = np.A0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = A0.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj2 = A0.get(i20);
                        i20++;
                        c1Var.w = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    org.telegram.messenger.g0.g3(new f2(i12, c1Var, np.B0(updates, TL_update.TL_updateGroupCallMessage.class)));
                    np.u1(i19).V3(updates, false);
                    TLRPC.GroupCall groupCall = c1Var.w;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList A02 = np.A0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = A02.size();
                    int i21 = 0;
                    while (i21 < size3) {
                        Object obj3 = A02.get(i21);
                        i21++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj3;
                        if (tL_updateGroupCallParticipants.call.id == c1Var.g() && !z10) {
                            int i22 = i15;
                            while (true) {
                                if (i22 < tL_updateGroupCallParticipants.participants.size()) {
                                    if (org.telegram.messenger.n5.o(tL_updateGroupCallParticipants.participants.get(i22).peer) == c1Var.b) {
                                        c1Var.H = tL_updateGroupCallParticipants.participants.get(i22);
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                            if (c1Var.H != null) {
                                ArrayList A03 = np.A0(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = A03.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i7 = 0;
                                while (i7 < size) {
                                    Object obj4 = A03.get(i7);
                                    i7++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj4).params;
                                }
                                i5.c.v(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                                c1Var.y = true;
                                if (!c1Var.x || c1Var.F == null) {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    leavegroupcall.source = i17;
                                    ConnectionsManager.getInstance(i19).sendRequest(leavegroupcall, new fi.x0(c1Var, 1));
                                    break;
                                } else {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        c1Var.F.prepareForStream(z10);
                                    } else {
                                        c1Var.F.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (c1Var.n) {
                                        c1Var.F.setMuteMicrophone(c1Var.r);
                                        c1Var.F.activateVideoCapturer(c1Var.K);
                                        c1Var.F.setupOutgoingVideoCreated(c1Var.K);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant = c1Var.H;
                                        int i23 = 2;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo != null) {
                                                NativeInstance nativeInstance = c1Var.F;
                                                String str = tL_groupCallParticipantVideo.endpoint;
                                                NativeInstance.SsrcGroup[] d = fi.c1.d(tL_groupCallParticipantVideo);
                                                c1Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, c1Var.I, org.telegram.messenger.n5.o(c1Var.H.peer));
                                            } else {
                                                org.telegram.messenger.g0.g3(new fi.w0(c1Var, i23));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i19).sendRequest(getgroupcallstreamchannels, new fi.u0(c1Var, 1), 65536, 2, c1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i19).sendRequest(getgroupcall, new fi.x0(c1Var, i23));
                                        }
                                    }
                                    org.telegram.messenger.g0.g3(new fi.w0(c1Var, 3));
                                    break;
                                }
                            }
                        }
                        i15 = 0;
                    }
                    ArrayList A032 = np.A0(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = A032.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    i7 = 0;
                    while (i7 < size) {
                    }
                    i5.c.v(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                    c1Var.y = true;
                    if (!c1Var.x) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    leavegroupcall2.source = i17;
                    ConnectionsManager.getInstance(i19).sendRequest(leavegroupcall2, new fi.x0(c1Var, 1));
                } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.g3(new fi.w0(c1Var, i13));
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.g3(new ai.j1(tLObject, i17, (p9) obj, i11));
                break;
            case 4:
                fi.h6 h6Var = (fi.h6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    while (i15 < tL_stories_stories.stories.size()) {
                        arrayList.add(h6Var.y(tL_stories_stories.stories.get(i15)));
                        i15++;
                    }
                    org.telegram.messenger.g0.g3(new ai.b1(h6Var, arrayList, tL_stories_stories, this.b, 5));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new fi.e6(h6Var, i16));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.g3(new ai.j1((ki.s3) obj, tLObject, i17, 21));
                break;
            case 6:
                ((VoIPService) obj).lambda$startScreenCapture$60(i17, tLObject, tL_error);
                break;
            case 7:
                org.telegram.messenger.g0.g3(new org.telegram.ui.f0((vs0) obj, tLObject, i17, i14));
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str2 = LaunchActivity.C1;
                cz.l1 = System.currentTimeMillis();
                cz.y();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    org.telegram.messenger.g0.g3(new f21(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i17, i13));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    org.telegram.messenger.g0.g3(new me(i12));
                    break;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new me(tL_error, 26));
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.g0.g3(new f21((th) obj, tLObject, i17, 5));
                break;
            default:
                org.telegram.messenger.g0.g3(new f21((uc1) obj, i17, tLObject, i14));
                break;
        }
    }

    public /* synthetic */ w1(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
