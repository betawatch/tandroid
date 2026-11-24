// default package

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fc2 {
    public static int R;
    public gc2 A;
    public boolean B;
    public j5 C;
    public boolean E;
    public int F;
    public long I;
    public TLRPC.Peer J;
    public Runnable M;
    public long N;
    public boolean O;
    public boolean a;
    public TLRPC.GroupCall b;
    public long c;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public gc2 z;
    public vf6 d = new vf6();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final HashSet n = new HashSet();
    public final ArrayList o = new ArrayList();
    public final SparseArray p = new SparseArray();
    public final SparseArray q = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final zb2 D = new zb2(this, 1);
    public final HashSet G = new HashSet();
    public final ArrayList H = new ArrayList();
    public final HashSet K = new HashSet();
    public final HashSet L = new HashSet();
    public final vf6 P = new vf6();
    public final dc2 Q = new dc2(this);

    public static boolean E(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, fc2 fc2Var) {
        VoIPService sharedInstance;
        gc2 gc2Var;
        if (groupCallParticipant == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return false;
        }
        if (groupCallParticipant.self) {
            return sharedInstance.getVideoState(z) == 2;
        }
        gc2 gc2Var2 = fc2Var.A;
        if ((gc2Var2 != null && gc2Var2.a == groupCallParticipant) || (((gc2Var = fc2Var.z) != null && gc2Var.a == groupCallParticipant) || fc2Var.d.f(k27.B1(groupCallParticipant.peer)) != null)) {
            if (z) {
                return groupCallParticipant.presentation != null;
            }
            if (groupCallParticipant.video != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo, TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2) {
        if (tL_groupCallParticipantVideo == null) {
            return tL_groupCallParticipantVideo2 == null;
        }
        if (tL_groupCallParticipantVideo2 != null && TextUtils.equals(tL_groupCallParticipantVideo.endpoint, tL_groupCallParticipantVideo2.endpoint) && tL_groupCallParticipantVideo.source_groups.size() == tL_groupCallParticipantVideo2.source_groups.size()) {
            int size = tL_groupCallParticipantVideo.source_groups.size();
            for (int i = 0; i < size; i++) {
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i);
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = tL_groupCallParticipantVideo2.source_groups.get(i);
                if (TextUtils.equals(tL_groupCallParticipantVideoSourceGroup.semantics, tL_groupCallParticipantVideoSourceGroup2.semantics) && tL_groupCallParticipantVideoSourceGroup.sources.size() == tL_groupCallParticipantVideoSourceGroup2.sources.size()) {
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (tL_groupCallParticipantVideoSourceGroup2.sources.contains(tL_groupCallParticipantVideoSourceGroup.sources.get(i2))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A() {
        TLRPC.GroupCall groupCall = this.b;
        return groupCall.participants_count > 0 || groupCall.rtmp_stream || k();
    }

    public final void B() {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        ArrayList arrayList2;
        int i;
        int size;
        gc2 gc2Var;
        char c;
        boolean z;
        int i2;
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        ArrayList arrayList4 = this.g;
        arrayList4.clear();
        TLRPC.Chat K0 = na7.q1(this.C.a).K0(Long.valueOf(this.c));
        final boolean w = hc2.w(14, K0);
        gc2 gc2Var2 = this.A;
        if (gc2Var2 != null) {
            arrayList3.add(gc2Var2);
        }
        final long i3 = i();
        VoIPService.getSharedInstance();
        this.x = true;
        int i4 = 0;
        this.y = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            arrayList = this.e;
            int size2 = arrayList.size();
            arrayList2 = this.o;
            if (i5 >= size2) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = arrayList.get(i5);
            boolean E = E(groupCallParticipant, false, this);
            boolean E2 = E(groupCallParticipant, true, this);
            if (!groupCallParticipant.self && (E || E2)) {
                this.y++;
            }
            if (arrayList2.contains(Long.valueOf(cf3.n(groupCallParticipant.peer)))) {
                arrayList.remove(i5);
                i5--;
            }
            if (E || E2) {
                if (!this.x) {
                    groupCallParticipant.videoIndex = 0;
                } else if (groupCallParticipant.videoIndex == 0) {
                    if (groupCallParticipant.self) {
                        groupCallParticipant.videoIndex = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    } else {
                        int i6 = R + 1;
                        R = i6;
                        groupCallParticipant.videoIndex = i6;
                    }
                }
                z2 = true;
            } else if (groupCallParticipant.self || !this.x || (groupCallParticipant.video == null && groupCallParticipant.presentation == null)) {
                groupCallParticipant.videoIndex = 0;
            }
            i5++;
        }
        try {
            Collections.sort(arrayList, new Comparator() { // from class: cc2
                /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
                
                    if (r6 != 0) goto L36;
                 */
                @Override // java.util.Comparator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int compare(Object obj, Object obj2) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) obj;
                    TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) obj2;
                    int i7 = groupCallParticipant2.videoIndex;
                    boolean z3 = i7 > 0;
                    int i8 = groupCallParticipant3.videoIndex;
                    boolean z4 = i8 > 0;
                    if (z3) {
                        if (z4) {
                            return i8 - i7;
                        }
                        return -1;
                    }
                    if (!z4) {
                        int i9 = groupCallParticipant2.active_date;
                        int i10 = groupCallParticipant3.active_date;
                        if (i9 != 0) {
                            if (i10 != 0) {
                                return Integer.compare(i10, i9);
                            }
                            return -1;
                        }
                        if (i10 == 0) {
                            long B1 = k27.B1(groupCallParticipant2.peer);
                            long j = i3;
                            if (B1 == j) {
                                return -1;
                            }
                            if (k27.B1(groupCallParticipant3.peer) != j) {
                                if (w) {
                                    long j2 = groupCallParticipant2.raise_hand_rating;
                                    long j3 = groupCallParticipant3.raise_hand_rating;
                                    if (j2 != 0) {
                                        if (j3 != 0) {
                                            return Long.compare(j3, j2);
                                        }
                                        return -1;
                                    }
                                }
                                return fc2.this.b.join_date_asc ? Integer.compare(groupCallParticipant2.date, groupCallParticipant3.date) : Integer.compare(groupCallParticipant3.date, groupCallParticipant2.date);
                            }
                        }
                    }
                    return 1;
                }
            });
        } catch (Exception unused) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = arrayList.isEmpty() ? null : (TLRPC.GroupCallParticipant) b00.f(1, arrayList);
        char c2 = 2;
        if ((E(groupCallParticipant2, false, this) || E(groupCallParticipant2, true, this)) && (i = this.b.unmuted_video_count) > this.y) {
            this.y = i;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) {
                this.y--;
            }
        }
        int i7 = 5000;
        if (arrayList.size() > 5000 && (!hc2.w(14, K0) || groupCallParticipant2.raise_hand_rating == 0)) {
            int size3 = arrayList.size();
            int i8 = 5000;
            while (i8 < size3) {
                TLRPC.GroupCallParticipant groupCallParticipant3 = arrayList.get(i7);
                char c3 = c2;
                if (groupCallParticipant3.raise_hand_rating != 0) {
                    c = c3;
                    z = z2;
                    i2 = 5000;
                } else {
                    o(groupCallParticipant3, false);
                    c = c3;
                    z = z2;
                    this.d.l(k27.B1(groupCallParticipant3.peer));
                    i2 = 5000;
                    arrayList.remove(5000);
                }
                i8++;
                z2 = z;
                i7 = i2;
                c2 = c;
            }
        }
        boolean z3 = z2;
        d();
        if (!this.x && z3 && (gc2Var = this.z) != null) {
            arrayList3.add(gc2Var);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant4 = arrayList.get(i10);
            if (!this.x || groupCallParticipant4.videoIndex == 0) {
                arrayList4.add(groupCallParticipant4);
            } else {
                boolean z4 = groupCallParticipant4.self;
                HashMap hashMap = this.i;
                if (!z4 && E(groupCallParticipant4, true, this) && E(groupCallParticipant4, false, this)) {
                    gc2 gc2Var3 = (gc2) hashMap.get(groupCallParticipant4.videoEndpoint);
                    if (gc2Var3 == null) {
                        gc2Var3 = new gc2(groupCallParticipant4, false);
                        hashMap.put(groupCallParticipant4.videoEndpoint, gc2Var3);
                    } else {
                        gc2Var3.a = groupCallParticipant4;
                        gc2Var3.b = false;
                    }
                    gc2 gc2Var4 = (gc2) hashMap.get(groupCallParticipant4.presentationEndpoint);
                    if (gc2Var4 == null) {
                        gc2Var4 = new gc2(groupCallParticipant4, true);
                    } else {
                        gc2Var4.a = groupCallParticipant4;
                        gc2Var4.b = true;
                    }
                    arrayList3.add(gc2Var3);
                    if (gc2Var3.c > 1.0f) {
                        i9 = arrayList3.size() - 1;
                    }
                    arrayList3.add(gc2Var4);
                    if (gc2Var4.c > 1.0f) {
                        size = arrayList3.size();
                        i9 = size - 1;
                    }
                } else if (groupCallParticipant4.self) {
                    if (E(groupCallParticipant4, true, this)) {
                        arrayList3.add(new gc2(groupCallParticipant4, true));
                    }
                    if (E(groupCallParticipant4, false, this)) {
                        arrayList3.add(new gc2(groupCallParticipant4, false));
                    }
                } else {
                    boolean E3 = E(groupCallParticipant4, true, this);
                    gc2 gc2Var5 = (gc2) hashMap.get(E3 ? groupCallParticipant4.presentationEndpoint : groupCallParticipant4.videoEndpoint);
                    if (gc2Var5 == null) {
                        gc2Var5 = new gc2(groupCallParticipant4, E3);
                        hashMap.put(E3 ? groupCallParticipant4.presentationEndpoint : groupCallParticipant4.videoEndpoint, gc2Var5);
                    } else {
                        gc2Var5.a = groupCallParticipant4;
                        gc2Var5.b = E3;
                    }
                    arrayList3.add(gc2Var5);
                    if (gc2Var5.c > 1.0f) {
                        size = arrayList3.size();
                        i9 = size - 1;
                    }
                }
            }
        }
        int size4 = arrayList.size();
        int i11 = 0;
        while (i11 < size4) {
            TLRPC.GroupCallParticipant groupCallParticipant5 = arrayList.get(i11);
            i11++;
            arrayList2.remove(Long.valueOf(cf3.n(groupCallParticipant5.peer)));
        }
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (this.b != null && sharedInstance2 != null && sharedInstance2.isConference() && sharedInstance2.groupCall == this) {
            int size5 = arrayList.size();
            int i12 = 0;
            while (i12 < size5) {
                TLRPC.GroupCallParticipant groupCallParticipant6 = arrayList.get(i12);
                i12++;
                sharedInstance2.conference.joiningBlockchainParticipants.remove(Long.valueOf(cf3.n(groupCallParticipant6.peer)));
            }
            ArrayList arrayList5 = this.l;
            arrayList5.clear();
            arrayList5.addAll(sharedInstance2.conference.getShadyLeftParticipants(arrayList));
            ArrayList arrayList6 = this.m;
            arrayList6.clear();
            arrayList6.addAll(sharedInstance2.conference.getShadyJoiningParticipants(arrayList));
            int size6 = arrayList.size();
            while (i4 < size6) {
                TLRPC.GroupCallParticipant groupCallParticipant7 = arrayList.get(i4);
                i4++;
                long n = cf3.n(groupCallParticipant7.peer);
                Long valueOf = Long.valueOf(n);
                HashSet hashSet = this.n;
                if (hashSet.contains(valueOf)) {
                    hashSet.remove(Long.valueOf(n));
                    this.j.remove(Long.valueOf(n));
                }
            }
        }
        if (h75.u5 || arrayList3.size() % 2 != 1) {
            return;
        }
        arrayList3.add((gc2) arrayList3.remove(i9));
    }

    public final void C(int i, String str) {
        this.w = !this.w;
        TL_phone.toggleGroupCallRecord togglegroupcallrecord = new TL_phone.toggleGroupCallRecord();
        togglegroupcallrecord.call = h(this.a);
        togglegroupcallrecord.start = this.w;
        byte b = 2;
        if (str != null) {
            togglegroupcallrecord.title = str;
            togglegroupcallrecord.flags |= 2;
        }
        if (i == 1 || i == 2) {
            togglegroupcallrecord.flags |= 4;
            togglegroupcallrecord.video = true;
            togglegroupcallrecord.video_portrait = i == 1;
        }
        ConnectionsManager.getInstance(this.C.a).sendRequest(togglegroupcallrecord, new ac2(this, b));
        kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void D() {
        B();
        kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE, 0L);
    }

    public final void a(long j) {
        if (this.d.f(j) == null) {
            Long valueOf = Long.valueOf(j);
            HashSet hashSet = this.n;
            if (hashSet.contains(valueOf)) {
                return;
            }
            hashSet.add(Long.valueOf(j));
            this.j.add(Long.valueOf(j));
            this.o.remove(Long.valueOf(j));
            B();
            kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
        }
    }

    public final void b(boolean z) {
        long i = i();
        if (this.d.h(i) < 0) {
            TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            tL_groupCallParticipant.peer = this.J;
            tL_groupCallParticipant.muted = true;
            tL_groupCallParticipant.self = true;
            tL_groupCallParticipant.video_joined = this.b.can_start_video;
            TLRPC.Chat K0 = na7.q1(this.C.a).K0(Long.valueOf(this.c));
            tL_groupCallParticipant.can_self_unmute = !this.b.join_muted || hc2.w(14, K0);
            tL_groupCallParticipant.date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
            if (hc2.w(14, K0) || !hc2.T(K0) || K0.megagroup || tL_groupCallParticipant.can_self_unmute) {
                tL_groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
            }
            j5 j5Var = this.C;
            if (i > 0) {
                TLRPC.UserFull W1 = na7.q1(j5Var.a).W1(i);
                if (W1 != null) {
                    tL_groupCallParticipant.about = W1.about;
                }
            } else {
                TLRPC.ChatFull L0 = na7.q1(j5Var.a).L0(-i);
                if (L0 != null) {
                    tL_groupCallParticipant.about = L0.about;
                }
            }
            this.d.k(tL_groupCallParticipant, i);
            this.e.add(tL_groupCallParticipant);
            B();
            if (z) {
                kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
            }
        }
    }

    public final boolean c() {
        VoIPService sharedInstance;
        return this.x && (((sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) || this.y < this.b.unmuted_video_limit);
    }

    public final void d() {
        boolean z = this.E;
        zb2 zb2Var = this.D;
        if (z) {
            gl.r(zb2Var);
            this.E = false;
        }
        int currentTime = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i2);
            int i3 = currentTime - groupCallParticipant.active_date;
            if (i3 < 5) {
                i = Math.min(i3, i);
            }
            if (Math.max(groupCallParticipant.date, groupCallParticipant.active_date) <= currentTime - 5) {
                break;
            }
        }
        if (i != Integer.MAX_VALUE) {
            gl.e3(zb2Var, i * 1000);
            this.E = true;
        }
    }

    public final void e() {
        this.M = null;
        if (this.I != 0 && System.currentTimeMillis() - this.I >= 1500) {
            if (w01.a) {
                fa4.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
            }
            s();
        }
        if (this.H.isEmpty()) {
            return;
        }
        zb2 zb2Var = new zb2(this, (byte) 3);
        this.M = zb2Var;
        gl.e3(zb2Var, 1000L);
    }

    public final void f() {
        if (this.z != null) {
            return;
        }
        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_groupCallParticipant.peer = tL_peerChannel;
        tL_peerChannel.channel_id = this.c;
        tL_groupCallParticipant.muted = true;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = new TLRPC.TL_groupCallParticipantVideo();
        tL_groupCallParticipant.video = tL_groupCallParticipantVideo;
        tL_groupCallParticipantVideo.paused = true;
        tL_groupCallParticipantVideo.endpoint = "";
        this.z = new gc2(tL_groupCallParticipant, false);
    }

    public final void g(List list) {
        if (!this.B || this.A == null) {
            gc2 gc2Var = this.A;
            TLRPC.GroupCallParticipant tL_groupCallParticipant = gc2Var != null ? gc2Var.a : new TLRPC.TL_groupCallParticipant();
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_groupCallParticipant.peer = tL_peerChat;
            tL_peerChat.channel_id = this.c;
            tL_groupCallParticipant.video = new TLRPC.TL_groupCallParticipantVideo();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
            tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) it.next()).channel));
            }
            tL_groupCallParticipant.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
            tL_groupCallParticipant.video.endpoint = "unified";
            tL_groupCallParticipant.videoEndpoint = "unified";
            this.A = new gc2(tL_groupCallParticipant, false);
            B();
            gl.d3(new zb2(this, (byte) 0));
        }
    }

    public final TLRPC.InputGroupCall h(boolean z) {
        TLRPC.GroupCall groupCall = this.b;
        if (groupCall == null) {
            return null;
        }
        if (z) {
            if (groupCall.invite_link == null) {
                return null;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            tL_inputGroupCallSlug.slug = (String) oo1.m(1, Uri.parse(this.b.invite_link).getPathSegments());
            return tL_inputGroupCallSlug;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        TLRPC.GroupCall groupCall2 = this.b;
        tL_inputGroupCall.id = groupCall2.id;
        tL_inputGroupCall.access_hash = groupCall2.access_hash;
        return tL_inputGroupCall;
    }

    public final long i() {
        TLRPC.Peer peer = this.J;
        return peer != null ? k27.B1(peer) : y6c.h(this.C.a).e();
    }

    public final boolean k() {
        return (this.b.flags & 128) != 0;
    }

    public final void l(boolean z) {
        if (z) {
            if (this.v) {
                return;
            }
            this.t = false;
            this.s = null;
        }
        if (this.t || this.e.size() > 5000) {
            return;
        }
        byte b = 1;
        if (z) {
            this.v = true;
        }
        this.u = true;
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = h(this.a);
        String str = this.s;
        if (str == null) {
            str = "";
        }
        getgroupparticipants.offset = str;
        getgroupparticipants.limit = this.a ? na7.q1(this.C.a).k4.w3.f() : 20;
        ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new mi1(this, z, getgroupparticipants, b));
    }

    public final void m(ArrayList arrayList, boolean z, hs0 hs0Var) {
        HashSet hashSet = z ? this.K : this.L;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            if (hashSet.contains(arrayList.get(i))) {
                arrayList.remove(i);
                i--;
                size--;
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = this.F + 1;
        this.F = i2;
        this.G.add(Integer.valueOf(i2));
        hashSet.addAll(arrayList);
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = h(this.a);
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            long longValue = ((Long) arrayList.get(i3)).longValue();
            if (z) {
                getgroupparticipants.ids.add(na7.q1(this.C.a).h1(longValue));
            } else {
                getgroupparticipants.sources.add(Integer.valueOf((int) longValue));
            }
        }
        getgroupparticipants.offset = "";
        getgroupparticipants.limit = 100;
        ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new vt0((Object) this, i2, (Object) hs0Var, (Object) arrayList, (Object) hashSet, (byte) 2));
    }

    public final void n(ArrayList arrayList, boolean z, String str, String str2, int i, int i2) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int max;
        int max2;
        System.currentTimeMillis();
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.d.f(i());
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList2 = this.e;
        vf6 vf6Var = null;
        if (isEmpty) {
            int m = this.d.m();
            vf6 vf6Var2 = this.d;
            if (m != 0) {
                this.d = new vf6();
                vf6Var = vf6Var2;
            } else {
                vf6Var2.b();
            }
            arrayList2.clear();
            this.p.clear();
            this.q.clear();
            this.r.clear();
            this.G.clear();
        }
        this.s = str2;
        if (arrayList.isEmpty() || TextUtils.isEmpty(this.s)) {
            this.t = true;
        }
        if (TextUtils.isEmpty(str)) {
            TLRPC.GroupCall groupCall = this.b;
            groupCall.version = i;
            groupCall.participants_count = i2;
            if (w01.a) {
                b00.p(this.b.participants_count, new StringBuilder("new participants count "));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        kk7.f(this.C.a).k(kk7.A2, Long.valueOf(elapsedRealtime));
        int size = arrayList.size();
        int i3 = 0;
        boolean z4 = false;
        while (i3 <= size) {
            if (i3 != size) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                z4 = z4;
                if (groupCallParticipant.self) {
                    z4 = true;
                }
            } else if (!z || groupCallParticipant3 == null || z4) {
                z2 = z3;
                i3++;
                z3 = z2;
                z4 = z4;
            } else {
                groupCallParticipant = groupCallParticipant3;
                z4 = z4;
            }
            TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) this.d.f(k27.B1(groupCallParticipant.peer));
            if (groupCallParticipant4 != null) {
                arrayList2.remove(groupCallParticipant4);
                o(groupCallParticipant4, z3);
                if (groupCallParticipant4.self) {
                    max2 = groupCallParticipant4.active_date;
                    groupCallParticipant.lastTypingDate = max2;
                } else {
                    max2 = Math.max(groupCallParticipant.active_date, groupCallParticipant4.active_date);
                    groupCallParticipant.lastTypingDate = max2;
                }
                if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                    groupCallParticipant.active_date = max2;
                }
            } else if (vf6Var != null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) vf6Var.f(k27.B1(groupCallParticipant.peer))) != null) {
                if (groupCallParticipant2.self) {
                    max = groupCallParticipant2.active_date;
                    groupCallParticipant.lastTypingDate = max;
                } else {
                    max = Math.max(groupCallParticipant.active_date, groupCallParticipant2.active_date);
                    groupCallParticipant.lastTypingDate = max;
                }
                z2 = z3;
                if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                    groupCallParticipant.active_date = max;
                } else {
                    groupCallParticipant.active_date = groupCallParticipant2.active_date;
                }
                this.d.k(groupCallParticipant, k27.B1(groupCallParticipant.peer));
                arrayList2.add(groupCallParticipant);
                o(groupCallParticipant, true);
                i3++;
                z3 = z2;
                z4 = z4;
            }
            z2 = z3;
            this.d.k(groupCallParticipant, k27.B1(groupCallParticipant.peer));
            arrayList2.add(groupCallParticipant);
            o(groupCallParticipant, true);
            i3++;
            z3 = z2;
            z4 = z4;
        }
        boolean z5 = z3;
        if (this.b.participants_count < this.d.m()) {
            this.b.participants_count = this.d.m();
        }
        B();
        kk7 f = kk7.f(this.C.a);
        Long valueOf = Long.valueOf(this.c);
        Long valueOf2 = Long.valueOf(this.b.id);
        Object[] objArr = new Object[3];
        objArr[z5 ? 1 : 0] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = Boolean.FALSE;
        f.k(kk7.v2, objArr);
        x();
    }

    public final void o(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        int i;
        int i2 = groupCallParticipant.source;
        SparseArray sparseArray = this.p;
        if (i2 != 0) {
            if (z) {
                sparseArray.put(i2, groupCallParticipant);
            } else {
                sparseArray.remove(i2);
            }
        }
        int i3 = 0;
        while (i3 < 2) {
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = i3 == 0 ? groupCallParticipant.video : groupCallParticipant.presentation;
            if (tL_groupCallParticipantVideo != null) {
                if ((tL_groupCallParticipantVideo.flags & 2) != 0 && (i = tL_groupCallParticipantVideo.audio_source) != 0) {
                    if (z) {
                        sparseArray.put(i, groupCallParticipant);
                    } else {
                        sparseArray.remove(i);
                    }
                }
                SparseArray sparseArray2 = i3 == 0 ? this.q : this.r;
                int size = tL_groupCallParticipantVideo.source_groups.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i4);
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        int intValue = tL_groupCallParticipantVideoSourceGroup.sources.get(i5).intValue();
                        if (z) {
                            sparseArray2.put(intValue, groupCallParticipant);
                        } else {
                            sparseArray2.remove(intValue);
                        }
                    }
                }
                if (z) {
                    String str = tL_groupCallParticipantVideo.endpoint;
                    if (i3 == 0) {
                        groupCallParticipant.videoEndpoint = str;
                    } else {
                        groupCallParticipant.presentationEndpoint = str;
                    }
                } else if (i3 == 0) {
                    groupCallParticipant.videoEndpoint = null;
                } else {
                    groupCallParticipant.presentationEndpoint = null;
                }
            }
            i3++;
        }
    }

    public final void p(TLRPC.GroupCall groupCall) {
        if (this.b.version < groupCall.version) {
            this.s = null;
            l(true);
        }
        apb.a(this.b, groupCall);
        this.b = groupCall;
        this.w = this.b.record_start_date != 0;
        kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void q(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants, boolean z) {
        long j;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        byte b = 2;
        long j2 = 0;
        boolean z2 = true;
        if (!z) {
            int size = tL_updateGroupCallParticipants.participants.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (tL_updateGroupCallParticipants.participants.get(i).versioned) {
                    int i2 = this.b.version;
                    int i3 = i2 + 1;
                    int i4 = tL_updateGroupCallParticipants.version;
                    if (i3 < i4) {
                        if (!this.v && this.I != 0 && Math.abs(System.currentTimeMillis() - this.I) > 1500) {
                            this.s = null;
                            l(true);
                            return;
                        }
                        if (this.I == 0) {
                            this.I = System.currentTimeMillis();
                        }
                        if (w01.a) {
                            b00.p(tL_updateGroupCallParticipants.version, new StringBuilder("add TL_updateGroupCallParticipants to queue "));
                        }
                        this.H.add(tL_updateGroupCallParticipants);
                        if (this.M == null) {
                            zb2 zb2Var = new zb2(this, b);
                            this.M = zb2Var;
                            gl.e3(zb2Var, 1500L);
                            return;
                        }
                        return;
                    }
                    if (i4 < i2) {
                        if (w01.a) {
                            fa4.b("ignore processParticipantsUpdate because of version");
                            return;
                        }
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        long i5 = i();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = this.e;
        int i6 = !arrayList.isEmpty() ? ((TLRPC.GroupCallParticipant) b00.f(1, arrayList)).date : 0;
        kk7.f(this.C.a).k(kk7.A2, Long.valueOf(elapsedRealtime));
        int size2 = tL_updateGroupCallParticipants.participants.size();
        long j3 = 0;
        int i7 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i7 < size2) {
            long j4 = j2;
            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i7);
            boolean z8 = z2;
            long B1 = k27.B1(groupCallParticipant.peer);
            if (w01.a) {
                StringBuilder o = ug8.o(B1, "process participant ", " left = ");
                o.append(groupCallParticipant.left);
                o.append(" versioned ");
                o.append(groupCallParticipant.versioned);
                o.append(" flags = ");
                o.append(groupCallParticipant.flags);
                o.append(" self = ");
                o.append(i5);
                o.append(" volume = ");
                b00.p(groupCallParticipant.volume, o);
            }
            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(B1);
            boolean z9 = groupCallParticipant.left;
            int i8 = size2;
            long j5 = i5;
            vf6 vf6Var = this.P;
            if (z9) {
                if (groupCallParticipant2 == null && tL_updateGroupCallParticipants.version == this.b.version) {
                    if (w01.a) {
                        fa4.b("unknowd participant left, reload call");
                    }
                    z3 = z8;
                }
                if (groupCallParticipant2 != null) {
                    this.d.l(B1);
                    o(groupCallParticipant2, false);
                    arrayList.remove(groupCallParticipant2);
                    this.g.remove(groupCallParticipant2);
                    if (vf6Var.g(null, B1) != null) {
                        j5 j5Var = this.C;
                        if (B1 > j4) {
                            j = elapsedRealtime;
                            TLRPC.User V1 = na7.q1(j5Var.a).V1(Long.valueOf(B1));
                            ir2.x(ug8.o(B1, "left remove from speaking ", " "), V1 == null ? null : V1.first_name, "GroupCall");
                        } else {
                            j = elapsedRealtime;
                            TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(-B1));
                            ir2.x(ug8.o(B1, "left remove from speaking ", " "), K0 == null ? null : K0.title, "GroupCall");
                        }
                        vf6Var.l(B1);
                        z6 = z8;
                    } else {
                        j = elapsedRealtime;
                    }
                    int i9 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f;
                        if (i9 >= arrayList2.size()) {
                            break;
                        }
                        if (k27.B1(((gc2) arrayList2.get(i9)).a.peer) == k27.B1(groupCallParticipant2.peer)) {
                            arrayList2.remove(i9);
                            i9--;
                        }
                        i9++;
                    }
                } else {
                    j = elapsedRealtime;
                }
                TLRPC.GroupCall groupCall = this.b;
                int i10 = groupCall.participants_count - 1;
                groupCall.participants_count = i10;
                if (i10 < 0) {
                    groupCall.participants_count = 0;
                }
            } else {
                j = elapsedRealtime;
                Long valueOf = Long.valueOf(B1);
                HashSet hashSet = this.n;
                if (hashSet.contains(valueOf)) {
                    Long valueOf2 = Long.valueOf(B1);
                    hashSet.remove(valueOf2);
                    this.j.remove(valueOf2);
                }
                if (groupCallParticipant2 != null) {
                    if (w01.a) {
                        fa4.b("new participant, update old");
                    }
                    groupCallParticipant2.muted = groupCallParticipant.muted;
                    if (groupCallParticipant.muted && vf6Var.g(null, B1) != null) {
                        vf6Var.l(B1);
                        j5 j5Var2 = this.C;
                        if (B1 > j4) {
                            TLRPC.User V12 = na7.q1(j5Var2.a).V1(Long.valueOf(B1));
                            ir2.x(ug8.o(B1, "muted remove from speaking ", " "), V12 == null ? null : V12.first_name, "GroupCall");
                        } else {
                            TLRPC.Chat K02 = na7.q1(j5Var2.a).K0(Long.valueOf(-B1));
                            ir2.x(ug8.o(B1, "muted remove from speaking ", " "), K02 == null ? null : K02.title, "GroupCall");
                        }
                        z6 = z8;
                    }
                    if (groupCallParticipant.min) {
                        int i11 = groupCallParticipant.flags;
                        if ((i11 & 128) != 0 && (groupCallParticipant2.flags & 128) == 0) {
                            groupCallParticipant.flags = i11 & (-129);
                        }
                        if (groupCallParticipant.volume_by_admin && groupCallParticipant2.volume_by_admin) {
                            groupCallParticipant2.volume = groupCallParticipant.volume;
                        }
                    } else {
                        groupCallParticipant2.volume = groupCallParticipant.volume;
                        groupCallParticipant2.muted_by_you = groupCallParticipant.muted_by_you;
                    }
                    groupCallParticipant2.flags = groupCallParticipant.flags;
                    groupCallParticipant2.can_self_unmute = groupCallParticipant.can_self_unmute;
                    groupCallParticipant2.video_joined = groupCallParticipant.video_joined;
                    if (groupCallParticipant2.raise_hand_rating == j4 && groupCallParticipant.raise_hand_rating != j4) {
                        groupCallParticipant2.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    groupCallParticipant2.raise_hand_rating = groupCallParticipant.raise_hand_rating;
                    groupCallParticipant2.date = groupCallParticipant.date;
                    int max = Math.max(groupCallParticipant2.active_date, groupCallParticipant.active_date);
                    groupCallParticipant2.lastTypingDate = max;
                    if (j != groupCallParticipant2.lastVisibleDate) {
                        groupCallParticipant2.active_date = max;
                    }
                    if (groupCallParticipant2.source == groupCallParticipant.source && j(groupCallParticipant2.video, groupCallParticipant.video) && j(groupCallParticipant2.presentation, groupCallParticipant.presentation)) {
                        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant2.video;
                        if (tL_groupCallParticipantVideo2 != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            tL_groupCallParticipantVideo2.paused = tL_groupCallParticipantVideo.paused;
                        }
                    } else {
                        o(groupCallParticipant2, false);
                        groupCallParticipant2.video = groupCallParticipant.video;
                        groupCallParticipant2.presentation = groupCallParticipant.presentation;
                        groupCallParticipant2.source = groupCallParticipant.source;
                        o(groupCallParticipant2, z8);
                        groupCallParticipant.presentationEndpoint = groupCallParticipant2.presentationEndpoint;
                        groupCallParticipant.videoEndpoint = groupCallParticipant2.videoEndpoint;
                        groupCallParticipant.videoIndex = groupCallParticipant2.videoIndex;
                    }
                } else {
                    if (groupCallParticipant.just_joined) {
                        if (B1 != j5) {
                            j3 = B1;
                        }
                        TLRPC.GroupCall groupCall2 = this.b;
                        groupCall2.participants_count++;
                        if (tL_updateGroupCallParticipants.version == groupCall2.version) {
                            if (w01.a) {
                                fa4.b("new participant, just joined, reload call");
                            }
                            z3 = true;
                        } else if (w01.a) {
                            fa4.b("new participant, just joined");
                        }
                    }
                    if (groupCallParticipant.raise_hand_rating != j4) {
                        groupCallParticipant.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    if (B1 == j5 || arrayList.size() < 20 || groupCallParticipant.date <= i6 || groupCallParticipant.active_date != 0 || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || !groupCallParticipant.min || this.t) {
                        arrayList.add(groupCallParticipant);
                    }
                    this.d.k(groupCallParticipant, B1);
                    o(groupCallParticipant, true);
                }
                if (B1 == j5 && groupCallParticipant.active_date == 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
                }
                z5 = true;
            }
            if (B1 == j5) {
                z7 = true;
            }
            i7++;
            j2 = j4;
            size2 = i8;
            i5 = j5;
            elapsedRealtime = j;
            z2 = true;
            z4 = true;
        }
        int i12 = tL_updateGroupCallParticipants.version;
        TLRPC.GroupCall groupCall3 = this.b;
        if (i12 > groupCall3.version) {
            groupCall3.version = i12;
            if (!z) {
                s();
            }
        }
        if (this.b.participants_count < this.d.m()) {
            this.b.participants_count = this.d.m();
        }
        if (w01.a) {
            b00.p(this.b.participants_count, new StringBuilder("new participants count after update "));
        }
        if (z3 && !this.O && SystemClock.elapsedRealtime() - this.N >= 30000) {
            this.O = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = h(this.a);
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 1;
            ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new ac2(this, (byte) 0));
        }
        if (z4) {
            if (z5) {
                B();
            }
            kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.valueOf(z7), Long.valueOf(j3));
        }
        if (z6) {
            kk7.f(this.C.a).k(kk7.x2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
        }
    }

    public final void r(int i, ArrayList arrayList) {
        kk7.f(this.C.a).k(kk7.A2, Long.valueOf(SystemClock.elapsedRealtime()));
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            Long l = (Long) arrayList.get(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(l.longValue());
            if (groupCallParticipant == null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(l);
            } else if (i - groupCallParticipant.lastTypingDate > 10) {
                if (groupCallParticipant.lastVisibleDate != i) {
                    groupCallParticipant.active_date = i;
                }
                groupCallParticipant.lastTypingDate = i;
                z = true;
            }
        }
        if (arrayList2 != null) {
            m(arrayList2, true, null);
        }
        if (z) {
            B();
            kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
        }
    }

    public final void s() {
        sa saVar = new sa((byte) 25);
        ArrayList arrayList = this.H;
        Collections.sort(arrayList, saVar);
        if (arrayList != null && !arrayList.isEmpty()) {
            boolean z = false;
            while (arrayList.size() > 0) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) arrayList.get(0);
                int i = this.b.version;
                int i2 = i + 1;
                int i3 = tL_updateGroupCallParticipants.version;
                char c = (i2 == i3 || i == i3) ? (char) 0 : i < i3 ? (char) 1 : (char) 2;
                if (c == 0) {
                    q(tL_updateGroupCallParticipants, true);
                    arrayList.remove(0);
                    z = true;
                } else {
                    if (c == 1) {
                        if (this.I != 0 && (z || Math.abs(System.currentTimeMillis() - this.I) <= 1500)) {
                            if (w01.a) {
                                fa4.b("HOLE IN GROUP CALL UPDATES QUEUE - will wait more time");
                            }
                            if (z) {
                                this.I = System.currentTimeMillis();
                                return;
                            }
                            return;
                        }
                        if (w01.a) {
                            fa4.b("HOLE IN GROUP CALL UPDATES QUEUE - reload participants");
                        }
                        this.I = 0L;
                        arrayList.clear();
                        this.s = null;
                        l(true);
                        return;
                    }
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (w01.a) {
                fa4.b("GROUP CALL UPDATES QUEUE PROCEED - OK");
            }
        }
        this.I = 0L;
    }

    public final void t() {
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = h(this.a);
        getgroupcall.limit = 100;
        ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupcall, new ac2(this, (byte) 3));
    }

    public final void u(long j) {
        this.n.remove(Long.valueOf(j));
        this.j.remove(Long.valueOf(j));
        B();
        kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void v(j5 j5Var, long j, TL_phone.groupCall groupcall) {
        this.c = j;
        this.C = j5Var;
        TLRPC.GroupCall groupCall = this.b;
        TLRPC.GroupCall groupCall2 = groupcall.call;
        apb.a(groupCall, groupCall2);
        this.b = groupCall2;
        int i = groupCall2.record_start_date;
        this.w = i != 0;
        int size = groupcall.participants.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.GroupCallParticipant groupCallParticipant = groupcall.participants.get(i2);
            this.d.k(groupCallParticipant, k27.B1(groupCallParticipant.peer));
            this.e.add(groupCallParticipant);
            o(groupCallParticipant, true);
        }
        B();
        this.s = groupcall.participants_next_offset;
        l(true);
        f();
        if (this.b.rtmp_stream) {
            g(Collections.EMPTY_LIST);
        }
    }

    public final void w(j5 j5Var, TLRPC.GroupCall groupCall) {
        this.c = 0L;
        this.C = j5Var;
        apb.a(this.b, groupCall);
        this.b = groupCall;
        this.w = groupCall.record_start_date != 0;
        B();
        l(true);
        f();
        if (groupCall.rtmp_stream) {
            g(Collections.EMPTY_LIST);
        }
    }

    public final void x() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getAccount() != this.C.a || sharedInstance.getChat() == null || sharedInstance.getChat().id != (-this.c)) {
            return;
        }
        sharedInstance.setParticipantsVolume();
    }

    public final void y(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            this.J = null;
            return;
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.J = tL_peerUser;
            tL_peerUser.user_id = y6c.h(this.C.a).e();
        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.J = tL_peerUser2;
            tL_peerUser2.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.J = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        } else {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.J = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        }
    }

    public final void z(String str) {
        TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
        editgroupcalltitle.call = h(this.a);
        editgroupcalltitle.title = str;
        ConnectionsManager.getInstance(this.C.a).sendRequest(editgroupcalltitle, new ac2(this, (byte) 1));
    }
}
