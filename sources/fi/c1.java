package fi;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fs;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class c1 implements fs, AudioManager.OnAudioFocusChangeListener {
    public static c1 X;
    public int E;
    public NativeInstance F;
    public TLRPC.GroupCallParticipant H;
    public final a1 I;
    public boolean J;
    public long K;
    public int L;
    public boolean M;
    public VideoSink P;
    public boolean Q;
    public Runnable R;
    public Runnable S;
    public ArrayList V;
    public ArrayList W;
    public final TL_stories.StoryItem a;
    public final long b;
    public final int c;
    public final Context d;
    public final int e;
    public final TLRPC.InputGroupCall f;
    public final boolean h;
    public boolean n;
    public TLRPC.GroupCall w;
    public boolean y;
    public boolean r = false;
    public boolean s = false;
    public boolean x = false;
    public final HashMap G = new HashMap();
    public final HashSet N = new HashSet();
    public float O = 1.0f;
    public int T = -1;
    public int U = -1;

    public c1(Context context, int i7, TL_stories.StoryItem storyItem, long j3, int i10, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.J = false;
        this.d = context;
        this.e = i7;
        this.f = inputGroupCall;
        this.a = storyItem;
        this.b = j3;
        this.c = i10;
        this.h = z10;
        this.n = z11;
        this.J = z12;
        a1 a1Var = new a1(this);
        this.I = a1Var;
        org.telegram.messenger.a8.b("[LivePlayer] setup to call " + inputGroupCall.id);
        ks.f(i7).b(this, ks.x2);
        if (z11) {
            this.K = NativeInstance.createVideoCapturer(a1Var, z12 ? 1 : 0);
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
        for (int i7 = 0; i7 < size; i7++) {
            ssrcGroupArr[i7] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i7);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i7];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i10 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i7].ssrcs;
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
        return (this.x || this.n || !this.s || X != null || (groupCall = this.w) == null || groupCall.rtmp_stream || !groupCall.creator) ? false : true;
    }

    public final boolean b() {
        if (this.w == null || l()) {
            return false;
        }
        return !this.w.messages_enabled;
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
            this.M = audioManager.requestAudioFocus(this, 0, 2) == 1;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.x2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.b == longValue) {
                cg.d.a(this.w, groupCall);
                this.w = groupCall;
                ks.f(this.e).k(ks.G2, Long.valueOf(groupCall.id));
            }
        }
    }

    public final void e() {
        if (this.x) {
            return;
        }
        this.x = true;
        u(false);
        ks.f(this.e).n(this, ks.x2);
        org.telegram.messenger.a8.b("[LivePlayer] destroyed");
        if (this.y) {
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            leavegroupcall.call = this.f;
            leavegroupcall.source = this.L;
            ConnectionsManager.getInstance(this.e).sendRequest(leavegroupcall, new x0(this, 5));
        }
        if (this.n) {
            this.I.setTarget(null);
            NativeInstance.destroyVideoCapturer(this.K);
        }
        if (this.F != null) {
            org.telegram.messenger.q5 q5Var = Utilities.e;
            NativeInstance nativeInstance = this.F;
            Objects.requireNonNull(nativeInstance);
            q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
            this.N.clear();
            this.F = null;
        }
        if (this.M) {
            ((AudioManager) this.d.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocus(this);
            this.M = false;
        }
        if (this.n) {
            VoipAudioManager.get().setSpeakerphoneOn(false);
        }
        if (X == this) {
            X = null;
            ks.f(this.e).k(ks.G2, Long.valueOf(g()));
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f;
        return inputGroupCall2 == inputGroupCall || inputGroupCall2.id == inputGroupCall.id;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.w;
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
        TLRPC.GroupCall groupCall = this.w;
        return (groupCall == null || (groupCall.flags & 16) == 0) ? ConnectionsManager.DEFAULT_DATACENTER_ID : groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.w;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.w;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.x) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.b2.d("live_" + this.f.id), 0L, false, bz.I0, new u0(this, 0), new ci.v(25), new u0(this, 2), new u0(this, 3), new u0(this, 4), new u0(this, 5), false);
        this.F = makeGroup;
        makeGroup.setOnStateUpdatedListener(new b1(this));
        this.F.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.w;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        long j3 = this.b;
        int i7 = this.e;
        return j3 >= 0 ? j10.i(i7).e() == j3 : org.telegram.messenger.v3.w(14, mp.u1(i7).O0(Long.valueOf(-j3)));
    }

    public final boolean m() {
        int i7 = this.E;
        return i7 == 3 || i7 == 1 || i7 == 2;
    }

    public final boolean n() {
        return !this.x && this.s;
    }

    public final boolean o() {
        return this.n && this.r;
    }

    public final void p() {
        this.R = null;
        if (this.x) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f;
        checkgroupcall.sources.add(Integer.valueOf(this.L));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new x0(this, 3));
    }

    public final void q() {
        this.S = null;
        if (this.x) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new x0(this, 0));
    }

    public final void r(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int i7 = 0;
        while (true) {
            if (i7 >= (ssrcGroupArr == null ? 0 : ssrcGroupArr.length)) {
                x();
                return;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i7].ssrcs;
                if (i10 < iArr.length) {
                    this.N.add(Integer.valueOf(iArr[i10]));
                    i10++;
                }
            }
            i7++;
        }
    }

    public final void s(VideoSink videoSink) {
        if (this.P == videoSink) {
            return;
        }
        this.P = videoSink;
        this.I.setTarget(videoSink);
    }

    public final void t(boolean z10) {
        if (this.x || this.s == z10) {
            return;
        }
        if (this.n && z10) {
            return;
        }
        this.s = z10;
        ks.f(this.e).k(ks.G2, Long.valueOf(g()));
    }

    public final void u(boolean z10) {
        if (this.x) {
            z10 = false;
        }
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        if (z10) {
            Runnable runnable = this.R;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
            w0 w0Var = new w0(this, 0);
            this.R = w0Var;
            org.telegram.messenger.g0.h3(w0Var, 4000L);
            Runnable runnable2 = this.S;
            if (runnable2 != null) {
                org.telegram.messenger.g0.r(runnable2);
            }
            w0 w0Var2 = new w0(this, 1);
            this.S = w0Var2;
            org.telegram.messenger.g0.h3(w0Var2, l() ? 5000 : 20000);
            return;
        }
        int i7 = this.T;
        int i10 = this.e;
        if (i7 != -1) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.T, true);
            this.T = -1;
        }
        if (this.U != -1) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.U, true);
            this.U = -1;
        }
        Runnable runnable3 = this.R;
        if (runnable3 != null) {
            org.telegram.messenger.g0.r(runnable3);
            this.R = null;
        }
        Runnable runnable4 = this.S;
        if (runnable4 != null) {
            org.telegram.messenger.g0.r(runnable4);
            this.S = null;
        }
    }

    public final void v(float f10) {
        wi.n nVar;
        float l10 = Utilities.l(f10);
        e1 e1Var = e1.w;
        if (e1Var != null && e1Var.b == this && (nVar = e1Var.a) != null && nVar.d() && e1Var.a.c != 0) {
            e1 e1Var2 = e1.w;
            l10 = (e1Var2 == null || !e1Var2.s) ? 1.0f : 0.0f;
        }
        org.telegram.messenger.a8.b("setVolume(" + l10 + ")");
        if (Math.abs(l10 - this.O) < 0.01f) {
            return;
        }
        this.O = l10;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i7 = this.e;
        tL_updateStory.peer = mp.u1(i7).B1(this.b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.id = this.c;
        mp.u1(i7).R1().c0(tL_updateStory);
        e();
    }

    public final void x() {
        if (this.x || this.F == null) {
            return;
        }
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            this.F.setVolume(((Integer) it.next()).intValue(), this.O);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
    }
}
