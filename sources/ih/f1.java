package ih;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f1 implements NotificationCenter.NotificationCenterDelegate, AudioManager.OnAudioFocusChangeListener {
    public static f1 S;
    public NativeInstance A;
    public TLRPC.GroupCallParticipant C;
    public final d1 D;
    public boolean E;
    public long F;
    public int G;
    public boolean H;
    public VideoSink K;
    public boolean L;
    public Runnable M;
    public Runnable N;
    public ArrayList Q;
    public ArrayList R;
    public final TL_stories.StoryItem a;
    public final long b;
    public final int c;
    public final Context d;
    public final int e;
    public final TLRPC.InputGroupCall f;
    public final boolean h;
    public boolean n;
    public TLRPC.GroupCall v;
    public boolean x;
    public int y;
    public boolean r = false;
    public boolean s = false;
    public boolean w = false;
    public final HashMap B = new HashMap();
    public final HashSet I = new HashSet();
    public float J = 1.0f;
    public int O = -1;
    public int P = -1;

    public f1(Context context, int i9, TL_stories.StoryItem storyItem, long j10, int i10, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.E = false;
        this.d = context;
        this.e = i9;
        this.f = inputGroupCall;
        this.a = storyItem;
        this.b = j10;
        this.c = i10;
        this.h = z10;
        this.n = z11;
        this.E = z12;
        d1 d1Var = new d1(this);
        this.D = d1Var;
        FileLog.d("[LivePlayer] setup to call " + inputGroupCall.id);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storyGroupCallUpdated);
        if (z11) {
            this.F = NativeInstance.createVideoCapturer(d1Var, z12 ? 1 : 0);
        }
        c();
        k();
    }

    public static NativeInstance.SsrcGroup[] d(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i9 = 0; i9 < size; i9++) {
            ssrcGroupArr[i9] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i9);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i9];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i10 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i9].ssrcs;
                if (i10 < iArr.length) {
                    iArr[i10] = tL_groupCallParticipantVideoSourceGroup.sources.get(i10).intValue();
                    i10++;
                }
            }
        }
        return ssrcGroupArr;
    }

    public final boolean a() {
        TLRPC.GroupCall groupCall;
        return (this.w || this.n || !this.s || S != null || (groupCall = this.v) == null || groupCall.rtmp_stream || !groupCall.creator) ? false : true;
    }

    public final boolean b() {
        if (this.v == null || l()) {
            return false;
        }
        return !this.v.messages_enabled;
    }

    public final void c() {
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(TLObject.FLAG_31);
        AudioManager audioManager = (AudioManager) this.d.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.n) {
            audioManager.setMode(3);
            this.H = audioManager.requestAudioFocus(this, 0, 2) == 1;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storyGroupCallUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.b == longValue) {
                gf.d.a(this.v, groupCall);
                this.v = groupCall;
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(groupCall.id));
            }
        }
    }

    public final void e() {
        if (this.w) {
            return;
        }
        this.w = true;
        u(false);
        NotificationCenter.getInstance(this.e).removeObserver(this, NotificationCenter.storyGroupCallUpdated);
        FileLog.d("[LivePlayer] destroyed");
        if (this.x) {
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            leavegroupcall.call = this.f;
            ConnectionsManager.getInstance(this.e).sendRequest(leavegroupcall, new y0(this, 5));
        }
        if (this.n) {
            this.D.setTarget(null);
            NativeInstance.destroyVideoCapturer(this.F);
        }
        if (this.A != null) {
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            NativeInstance nativeInstance = this.A;
            Objects.requireNonNull(nativeInstance);
            dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
            this.I.clear();
            this.A = null;
        }
        if (this.H) {
            ((AudioManager) this.d.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocus(this);
            this.H = false;
        }
        if (this.n) {
            VoipAudioManager.get().setSpeakerphoneOn(false);
        }
        if (S == this) {
            S = null;
            NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f;
        return inputGroupCall2 == inputGroupCall || inputGroupCall2.id == inputGroupCall.id;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null) {
            return groupCall.id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f;
        if (inputGroupCall != null) {
            return inputGroupCall.id;
        }
        return 0L;
    }

    public final int h() {
        TLRPC.GroupCall groupCall = this.v;
        return (groupCall == null || (groupCall.flags & 16) == 0) ? ConnectionsManager.DEFAULT_DATACENTER_ID : groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.w) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.e2.d("live_" + this.f.id), 0L, false, SharedConfig.noiseSupression, new x0(this, 0), new i3.i(1), new x0(this, 2), new x0(this, 3), new x0(this, 4), new x0(this, 5), false);
        this.A = makeGroup;
        makeGroup.setOnStateUpdatedListener(new e1(this));
        this.A.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        int i9 = this.e;
        long j10 = this.b;
        return j10 >= 0 ? UserConfig.getInstance(i9).getClientUserId() == j10 : ChatObject.canUserDoAction(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)), 14);
    }

    public final boolean m() {
        int i9 = this.y;
        return i9 == 3 || i9 == 1 || i9 == 2;
    }

    public final boolean n() {
        return !this.w && this.s;
    }

    public final boolean o() {
        return this.n && this.r;
    }

    public final void p() {
        this.M = null;
        if (this.w) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f;
        checkgroupcall.sources.add(Integer.valueOf(this.G));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new y0(this, 3));
    }

    public final void q() {
        this.N = null;
        if (this.w) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new y0(this, 1));
    }

    public final void r(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int i9 = 0;
        while (true) {
            if (i9 >= (ssrcGroupArr == null ? 0 : ssrcGroupArr.length)) {
                x();
                return;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i9].ssrcs;
                if (i10 < iArr.length) {
                    this.I.add(Integer.valueOf(iArr[i10]));
                    i10++;
                }
            }
            i9++;
        }
    }

    public final void s(VideoSink videoSink) {
        if (this.K == videoSink) {
            return;
        }
        this.K = videoSink;
        this.D.setTarget(videoSink);
    }

    public final void t(boolean z10) {
        if (this.w || this.s == z10) {
            return;
        }
        if (this.n && z10) {
            return;
        }
        this.s = z10;
        NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
    }

    public final void u(boolean z10) {
        if (this.w) {
            z10 = false;
        }
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        if (z10) {
            Runnable runnable = this.M;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            a1 a1Var = new a1(this, 0);
            this.M = a1Var;
            AndroidUtilities.runOnUIThread(a1Var, 4000L);
            Runnable runnable2 = this.N;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
            }
            a1 a1Var2 = new a1(this, 1);
            this.N = a1Var2;
            AndroidUtilities.runOnUIThread(a1Var2, l() ? 5000 : 20000);
            return;
        }
        int i9 = this.O;
        int i10 = this.e;
        if (i9 != -1) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.O, true);
            this.O = -1;
        }
        if (this.P != -1) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.P, true);
            this.P = -1;
        }
        Runnable runnable3 = this.M;
        if (runnable3 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable3);
            this.M = null;
        }
        Runnable runnable4 = this.N;
        if (runnable4 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable4);
            this.N = null;
        }
    }

    public final void v(float f10) {
        float clamp01 = Utilities.clamp01(f10);
        k1 k1Var = k1.V;
        if (k1Var.O && k1Var.v == this) {
            clamp01 = 1.0f;
        }
        FileLog.d("setVolume(" + clamp01 + ")");
        if (Math.abs(clamp01 - this.J) < 0.01f) {
            return;
        }
        this.J = clamp01;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i9 = this.e;
        tL_updateStory.peer = MessagesController.getInstance(i9).getPeer(this.b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.id = this.c;
        MessagesController.getInstance(i9).getStoriesController().Z(tL_updateStory);
        e();
    }

    public final void x() {
        if (this.w || this.A == null) {
            return;
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            this.A.setVolume(((Integer) it.next()).intValue(), this.J);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i9) {
    }
}
