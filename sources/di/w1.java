package di;

import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

    /* JADX WARN: Removed duplicated region for block: B:128:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190 A[LOOP:4: B:67:0x018e->B:68:0x0190, LOOP_END] */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        fj fjVar;
        int size;
        ArrayList arrayList;
        int i7 = this.a;
        int i10 = 25;
        int i11 = 23;
        int i12 = 0;
        int i13 = 1;
        int i14 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                f6 f6Var = (f6) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i15 = 0; i15 < messages_messages.messages.size(); i15++) {
                        TLRPC.Message message = messages_messages.messages.get(i15);
                        if (message != null && message.id == i14) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                fj fjVar2 = new fj(f6Var.a, message, false, false);
                                fjVar2.L5();
                                fjVar = fjVar2;
                                if (fjVar == null) {
                                    org.telegram.messenger.g0.g3(new aa.r(f6Var, tLObject, fjVar, 20));
                                    break;
                                }
                            }
                        }
                    }
                }
                fjVar = null;
                if (fjVar == null) {
                }
                break;
            case 1:
                org.telegram.messenger.g0.g3(new ai.c1((y8) obj, i14, tLObject, 8));
                break;
            case 2:
                fi.c1 c1Var = (fi.c1) obj;
                TLRPC.InputGroupCall inputGroupCall = c1Var.f;
                int i16 = c1Var.e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(i16).f4(updates.users, false);
                    mp.u1(i16).Z3(updates.chats, false);
                    ArrayList A0 = mp.A0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = A0.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj2 = A0.get(i17);
                        i17++;
                        c1Var.w = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    org.telegram.messenger.g0.g3(new f2(i10, c1Var, mp.B0(updates, TL_update.TL_updateGroupCallMessage.class)));
                    mp.u1(i16).V3(updates, false);
                    TLRPC.GroupCall groupCall = c1Var.w;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList A02 = mp.A0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = A02.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj3 = A02.get(i18);
                        i18++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj3;
                        if (tL_updateGroupCallParticipants.call.id != c1Var.g() || z10) {
                            arrayList = A02;
                        } else {
                            int i19 = 0;
                            while (true) {
                                if (i19 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = A02;
                                    if (org.telegram.messenger.n5.o(tL_updateGroupCallParticipants.participants.get(i19).peer) == c1Var.b) {
                                        c1Var.H = tL_updateGroupCallParticipants.participants.get(i19);
                                    } else {
                                        i19++;
                                        A02 = arrayList;
                                    }
                                } else {
                                    arrayList = A02;
                                }
                            }
                            if (c1Var.H != null) {
                                ArrayList A03 = mp.A0(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = A03.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                while (i12 < size) {
                                    Object obj4 = A03.get(i12);
                                    i12++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj4).params;
                                }
                                i5.c.v(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                                c1Var.y = true;
                                if (!c1Var.x || c1Var.F == null) {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    leavegroupcall.source = i14;
                                    ConnectionsManager.getInstance(i16).sendRequest(leavegroupcall, new fi.x0(c1Var, i13));
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
                                        int i20 = 2;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo != null) {
                                                NativeInstance nativeInstance = c1Var.F;
                                                String str = tL_groupCallParticipantVideo.endpoint;
                                                NativeInstance.SsrcGroup[] d = fi.c1.d(tL_groupCallParticipantVideo);
                                                c1Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, c1Var.I, org.telegram.messenger.n5.o(c1Var.H.peer));
                                            } else {
                                                org.telegram.messenger.g0.g3(new fi.w0(c1Var, i20));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i16).sendRequest(getgroupcallstreamchannels, new fi.u0(c1Var, i13), 65536, 2, c1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i16).sendRequest(getgroupcall, new fi.x0(c1Var, i20));
                                        }
                                    }
                                    org.telegram.messenger.g0.g3(new fi.w0(c1Var, 3));
                                    break;
                                }
                            }
                        }
                        A02 = arrayList;
                    }
                    ArrayList A032 = mp.A0(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = A032.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    while (i12 < size) {
                    }
                    i5.c.v(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                    c1Var.y = true;
                    if (!c1Var.x) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    leavegroupcall2.source = i14;
                    ConnectionsManager.getInstance(i16).sendRequest(leavegroupcall2, new fi.x0(c1Var, i13));
                } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.g3(new fi.w0(c1Var, 4));
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.g3(new ai.c1(tLObject, i14, (p9) obj, 11));
                break;
            case 4:
                fi.h6 h6Var = (fi.h6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList2 = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    while (i12 < tL_stories_stories.stories.size()) {
                        arrayList2.add(h6Var.y(tL_stories_stories.stories.get(i12)));
                        i12++;
                    }
                    org.telegram.messenger.g0.g3(new bi.x4(h6Var, arrayList2, tL_stories_stories, this.b, 4));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new fi.e6(h6Var, i13));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.g3(new ai.c1((ki.s3) obj, tLObject, i14, 22));
                break;
            case 6:
                ((VoIPService) obj).lambda$startScreenCapture$60(i14, tLObject, tL_error);
                break;
            case 7:
                org.telegram.messenger.g0.g3(new org.telegram.ui.b0((vs0) obj, tLObject, i14, i11));
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str2 = LaunchActivity.C1;
                bz.l1 = System.currentTimeMillis();
                bz.y();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    org.telegram.messenger.g0.g3(new j01(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i14, 5));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    org.telegram.messenger.g0.g3(new me(i10));
                    break;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new me(tL_error, 26));
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.g0.g3(new j01((th) obj, tLObject, i14, 6));
                break;
            default:
                org.telegram.messenger.g0.g3(new j01((uc1) obj, i14, tLObject, i11));
                break;
        }
    }

    public /* synthetic */ w1(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
