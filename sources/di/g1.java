package di;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g1 implements ls, AudioManager.OnAudioFocusChangeListener {
    public static g1 W;
    public int D;
    public NativeInstance E;
    public TLRPC.GroupCallParticipant G;
    public final e1 H;
    public boolean I;
    public long J;
    public int K;
    public boolean L;
    public VideoSink O;
    public boolean P;
    public Runnable Q;
    public Runnable R;
    public ArrayList U;
    public ArrayList V;
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
    public final HashMap F = new HashMap();
    public final HashSet M = new HashSet();
    public float N = 1.0f;
    public int S = -1;
    public int T = -1;

    public g1(Context context, int i7, TL_stories.StoryItem storyItem, long j3, int i10, boolean z9, TLRPC.InputGroupCall inputGroupCall, boolean z10, boolean z11) {
        this.I = false;
        this.d = context;
        this.e = i7;
        this.f = inputGroupCall;
        this.a = storyItem;
        this.b = j3;
        this.c = i10;
        this.h = z9;
        this.n = z10;
        this.I = z11;
        e1 e1Var = new e1(this);
        this.H = e1Var;
        org.telegram.messenger.a8.b("[LivePlayer] setup to call " + inputGroupCall.id);
        qs.f(i7).b(this, qs.x2);
        if (z10) {
            this.J = NativeInstance.createVideoCapturer(e1Var, z11 ? 1 : 0);
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
        return (this.x || this.n || !this.s || W != null || (groupCall = this.w) == null || groupCall.rtmp_stream || !groupCall.creator) ? false : true;
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
            this.L = audioManager.requestAudioFocus(this, 0, 2) == 1;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.x2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.b == longValue) {
                cg.d.a(this.w, groupCall);
                this.w = groupCall;
                qs.f(this.e).k(qs.G2, Long.valueOf(groupCall.id));
            }
        }
    }

    public final void e() {
        if (this.x) {
            return;
        }
        this.x = true;
        u(false);
        qs.f(this.e).n(this, qs.x2);
        org.telegram.messenger.a8.b("[LivePlayer] destroyed");
        if (this.y) {
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            leavegroupcall.call = this.f;
            leavegroupcall.source = this.K;
            ConnectionsManager.getInstance(this.e).sendRequest(leavegroupcall, new y0(this, 5));
        }
        if (this.n) {
            this.H.setTarget(null);
            NativeInstance.destroyVideoCapturer(this.J);
        }
        if (this.E != null) {
            org.telegram.messenger.p5 p5Var = Utilities.e;
            NativeInstance nativeInstance = this.E;
            Objects.requireNonNull(nativeInstance);
            p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
            this.M.clear();
            this.E = null;
        }
        if (this.L) {
            ((AudioManager) this.d.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocus(this);
            this.L = false;
        }
        if (this.n) {
            VoipAudioManager.get().setSpeakerphoneOn(false);
        }
        if (W == this) {
            W = null;
            qs.f(this.e).k(qs.G2, Long.valueOf(g()));
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
        int i7 = 0;
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.y1.d("live_" + this.f.id), 0L, false, iz.I0, new v0(this, i7), new a1(i7), new v0(this, 2), new v0(this, 3), new v0(this, 4), new v0(this, 5), false);
        this.E = makeGroup;
        makeGroup.setOnStateUpdatedListener(new f1(this));
        this.E.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.w;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        long j3 = this.b;
        int i7 = this.e;
        return j3 >= 0 ? p10.i(i7).e() == j3 : org.telegram.messenger.t3.w(14, qp.s1(i7).M0(Long.valueOf(-j3)));
    }

    public final boolean m() {
        int i7 = this.D;
        return i7 == 3 || i7 == 1 || i7 == 2;
    }

    public final boolean n() {
        return !this.x && this.s;
    }

    public final boolean o() {
        return this.n && this.r;
    }

    public final void p() {
        this.Q = null;
        if (this.x) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f;
        checkgroupcall.sources.add(Integer.valueOf(this.K));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new y0(this, 3));
    }

    public final void q() {
        this.R = null;
        if (this.x) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new y0(this, 0));
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
                    this.M.add(Integer.valueOf(iArr[i10]));
                    i10++;
                }
            }
            i7++;
        }
    }

    public final void s(VideoSink videoSink) {
        if (this.O == videoSink) {
            return;
        }
        this.O = videoSink;
        this.H.setTarget(videoSink);
    }

    public final void t(boolean z9) {
        if (this.x || this.s == z9) {
            return;
        }
        if (this.n && z9) {
            return;
        }
        this.s = z9;
        qs.f(this.e).k(qs.G2, Long.valueOf(g()));
    }

    public final void u(boolean z9) {
        if (this.x) {
            z9 = false;
        }
        if (this.P == z9) {
            return;
        }
        this.P = z9;
        if (z9) {
            Runnable runnable = this.Q;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
            x0 x0Var = new x0(this, 0);
            this.Q = x0Var;
            org.telegram.messenger.g0.i3(x0Var, 4000L);
            Runnable runnable2 = this.R;
            if (runnable2 != null) {
                org.telegram.messenger.g0.r(runnable2);
            }
            x0 x0Var2 = new x0(this, 1);
            this.R = x0Var2;
            org.telegram.messenger.g0.i3(x0Var2, l() ? 5000 : 20000);
            return;
        }
        int i7 = this.S;
        int i10 = this.e;
        if (i7 != -1) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.S, true);
            this.S = -1;
        }
        if (this.T != -1) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.T, true);
            this.T = -1;
        }
        Runnable runnable3 = this.Q;
        if (runnable3 != null) {
            org.telegram.messenger.g0.r(runnable3);
            this.Q = null;
        }
        Runnable runnable4 = this.R;
        if (runnable4 != null) {
            org.telegram.messenger.g0.r(runnable4);
            this.R = null;
        }
    }

    public final void v(float f10) {
        ti.o oVar;
        float l10 = Utilities.l(f10);
        i1 i1Var = i1.w;
        if (i1Var != null && i1Var.b == this && (oVar = i1Var.a) != null && oVar.d() && i1Var.a.c != 0) {
            i1 i1Var2 = i1.w;
            l10 = (i1Var2 == null || !i1Var2.s) ? 1.0f : 0.0f;
        }
        org.telegram.messenger.a8.b("setVolume(" + l10 + ")");
        if (Math.abs(l10 - this.N) < 0.01f) {
            return;
        }
        this.N = l10;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i7 = this.e;
        tL_updateStory.peer = qp.s1(i7).z1(this.b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.id = this.c;
        qp.s1(i7).P1().c0(tL_updateStory);
        e();
    }

    public final void x() {
        if (this.x || this.E == null) {
            return;
        }
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            this.E.setVolume(((Integer) it.next()).intValue(), this.N);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
    }
}
