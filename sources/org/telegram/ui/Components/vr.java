package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$-CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vr extends ha {
    public static final /* synthetic */ int z2 = 0;
    public p51 P1;
    public final TLRPC.Chat Q1;
    public final TLRPC.Chat R1;
    public final boolean S1;
    public final ArrayList T1;
    public final long U1;
    public final int V1;
    public final int W1;
    public final Runnable X1;
    public boolean Y1;
    public final boolean Z1;
    public final ur a2;
    public final ur b2;
    public final ur c2;
    public final ur d2;
    public final boolean[] e2;
    public final boolean[] f2;
    public final boolean g2;
    public boolean h2;
    public final long i2;
    public TL_communities.ParticipantJoinedChats j2;
    public int[] k2;
    public boolean l2;
    public boolean m2;
    public final TLRPC.TL_chatBannedRights n2;
    public final TLRPC.TL_chatBannedRights o2;
    public final ArrayList p2;
    public boolean q2;
    public final boolean r2;
    public final boolean s2;
    public boolean t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;
    public float x2;
    public int y2;

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02c7, code lost:
    
        if (r6.send_stickers == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02cf, code lost:
    
        if (r6.send_gifs == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02d7, code lost:
    
        if (r6.send_games == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02df, code lost:
    
        if (r6.send_inline == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02ef, code lost:
    
        if (r6.send_plain == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02f7, code lost:
    
        if (r6.send_polls == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02ff, code lost:
    
        if (r6.send_reactions == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0307, code lost:
    
        if (r6.change_info == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x030f, code lost:
    
        if (r6.invite_users == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0317, code lost:
    
        if (r6.pin_messages == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0323, code lost:
    
        if (r21.S1 != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x032b, code lost:
    
        if (r6.send_photos == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0333, code lost:
    
        if (r6.send_videos == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x033b, code lost:
    
        if (r6.send_roundvideos == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0343, code lost:
    
        if (r6.send_audios == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x034b, code lost:
    
        if (r6.send_voices == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0353, code lost:
    
        if (r6.send_docs == false) goto L237;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vr(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j10, int i10, int i11, boolean z10, Runnable runnable) {
        super(k2Var.getContext(), k2Var, false, true, 2, k2Var.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.Y1 = false;
        this.l2 = false;
        this.m2 = false;
        int i12 = 1;
        this.q2 = true;
        this.t2 = true;
        this.u2 = false;
        this.v2 = false;
        this.x2 = 10.0f;
        v0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0));
        this.u1 = true;
        O();
        this.F1 = true;
        this.s2 = z10;
        tk0 tk0Var = this.k1;
        int i13 = this.t0;
        tk0Var.setPadding(i13, this.x1, i13, org.telegram.messenger.i0.L(63.0f));
        this.k1.setClipToPadding(false);
        this.k1.setOnItemClickListener(new pr(this, 3));
        this.F1 = true;
        tr trVar = new tr(this);
        trVar.m = false;
        trVar.C = false;
        trVar.o(gr.h);
        trVar.n(350L);
        this.k1.setItemAnimator(trVar);
        this.k1.r1();
        vh.d dVar = new vh.d(getContext(), this.I0, true);
        dVar.f();
        dVar.setText(org.telegram.messenger.cd.L0(2131751514, null));
        int i14 = 9;
        dVar.setOnClickListener(new h0(this, i14));
        this.b.addView(dVar, w7.b6.f(48.0f, -1, 87, org.telegram.messenger.i0.L(10.0f) + this.t0, 0, org.telegram.messenger.i0.L(10.0f) + this.t0, org.telegram.messenger.i0.L(10.0f)));
        this.Q1 = chat;
        this.S1 = org.telegram.messenger.w3.c0(chat);
        this.T1 = arrayList;
        this.U1 = j10;
        this.V1 = i10;
        this.W1 = i11;
        this.X1 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.n2 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.o2 = tL_chatBannedRights4;
        if (tL_chatBannedRights3.view_messages) {
            tL_chatBannedRights4.view_messages = true;
        }
        if (tL_chatBannedRights3.send_messages) {
            tL_chatBannedRights4.send_messages = true;
        }
        if (tL_chatBannedRights3.send_media) {
            tL_chatBannedRights4.send_media = true;
        }
        if (tL_chatBannedRights3.send_stickers) {
            tL_chatBannedRights4.send_stickers = true;
        }
        if (tL_chatBannedRights3.send_gifs) {
            tL_chatBannedRights4.send_gifs = true;
        }
        if (tL_chatBannedRights3.send_games) {
            tL_chatBannedRights4.send_games = true;
        }
        if (tL_chatBannedRights3.send_inline) {
            tL_chatBannedRights4.send_inline = true;
        }
        if (tL_chatBannedRights3.embed_links) {
            tL_chatBannedRights4.embed_links = true;
        }
        if (tL_chatBannedRights3.send_polls) {
            tL_chatBannedRights4.send_polls = true;
        }
        if (tL_chatBannedRights3.invite_users) {
            tL_chatBannedRights4.invite_users = true;
        }
        if (tL_chatBannedRights3.change_info) {
            tL_chatBannedRights4.change_info = true;
        }
        if (tL_chatBannedRights3.pin_messages) {
            tL_chatBannedRights4.pin_messages = true;
        }
        if (tL_chatBannedRights3.manage_topics) {
            tL_chatBannedRights4.manage_topics = true;
        }
        if (tL_chatBannedRights3.send_photos) {
            tL_chatBannedRights4.send_photos = true;
        }
        if (tL_chatBannedRights3.send_videos) {
            tL_chatBannedRights4.send_videos = true;
        }
        if (tL_chatBannedRights3.send_audios) {
            tL_chatBannedRights4.send_audios = true;
        }
        if (tL_chatBannedRights3.send_docs) {
            tL_chatBannedRights4.send_docs = true;
        }
        if (tL_chatBannedRights3.send_voices) {
            tL_chatBannedRights4.send_voices = true;
        }
        if (tL_chatBannedRights3.send_roundvideos) {
            tL_chatBannedRights4.send_roundvideos = true;
        }
        if (tL_chatBannedRights3.send_plain) {
            tL_chatBannedRights4.send_plain = true;
        }
        if (tL_chatBannedRights3.send_reactions) {
            tL_chatBannedRights4.send_reactions = true;
        }
        org.telegram.messenger.vp.r1(this.a);
        this.a2 = new ur(this, 0, arrayList2);
        this.b2 = new ur(this, 1, arrayList2);
        this.c2 = new ur(this, 3, arrayList2);
        boolean z11 = arrayList2.size() == 1;
        this.r2 = z11;
        this.Z1 = org.telegram.messenger.w3.p0(chat);
        if (chat.linked_community_id != 0) {
            this.R1 = org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(chat.linked_community_id));
        }
        if (org.telegram.messenger.w3.y(2, this.R1) && org.telegram.messenger.w3.y(27, this.R1) && z11) {
            long d = org.telegram.messenger.o5.d((TLObject) arrayList2.get(0));
            this.i2 = d;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.a);
            long j11 = this.R1.id;
            nr nrVar = new nr(this, i12);
            TL_communities.TL_communities_getParticipantJoinedChats tL_communities_getParticipantJoinedChats = new TL_communities.TL_communities_getParticipantJoinedChats();
            tL_communities_getParticipantJoinedChats.community = r12.g1(j11);
            tL_communities_getParticipantJoinedChats.participant = r12.i1(d);
            r12.getConnectionsManager().sendRequestTyped(tL_communities_getParticipantJoinedChats, new a3.b(i12), new org.telegram.messenger.a4(4, r12, nrVar));
        }
        if (org.telegram.messenger.w3.w(2, chat)) {
            this.e2 = new boolean[arrayList2.size()];
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                TLRPC.ChannelParticipant channelParticipant = i15 < channelParticipantArr.length ? channelParticipantArr[i15] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.e2[i15] = true;
                }
                i15++;
            }
            this.f2 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.n2;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.S1) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i16 < channelParticipantArr.length ? channelParticipantArr[i16] : null;
                    if (!(arrayList2.get(i16) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.n2;
                            if (!tL_chatBannedRights.send_stickers) {
                            }
                            if (!tL_chatBannedRights.send_gifs) {
                            }
                            if (!tL_chatBannedRights.send_games) {
                            }
                            if (!tL_chatBannedRights.send_inline) {
                            }
                            if (!tL_chatBannedRights.embed_links) {
                                if (!tL_chatBannedRights.send_plain) {
                                    if (!tL_chatBannedRights6.embed_links) {
                                    }
                                }
                            }
                            if (!tL_chatBannedRights.send_polls) {
                            }
                            if (!tL_chatBannedRights.send_reactions) {
                            }
                            if (!tL_chatBannedRights.change_info) {
                            }
                            if (!tL_chatBannedRights.invite_users) {
                            }
                            if (!tL_chatBannedRights.pin_messages) {
                            }
                            if (!tL_chatBannedRights.manage_topics) {
                                if (!tL_chatBannedRights6.manage_topics) {
                                }
                            }
                            if (!tL_chatBannedRights.send_photos) {
                            }
                            if (!tL_chatBannedRights.send_videos) {
                            }
                            if (!tL_chatBannedRights.send_roundvideos) {
                            }
                            if (!tL_chatBannedRights.send_audios) {
                            }
                            if (!tL_chatBannedRights.send_voices) {
                            }
                            if (!tL_chatBannedRights.send_docs) {
                            }
                            if (!tL_chatBannedRights.send_plain) {
                                if (tL_chatBannedRights6.send_plain) {
                                }
                            }
                        }
                        if (this.e2[i16]) {
                            this.f2[i16] = true;
                            this.g2 = true;
                        }
                    }
                    i16++;
                }
            }
            this.p2 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new k2.f(i14)).collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
            ur urVar = new ur(this, 2, arrayList2);
            this.d2 = urVar;
            boolean[] zArr = this.e2;
            if (urVar.g != 0) {
                urVar.e = zArr;
                urVar.h();
                urVar.i();
            }
        } else {
            this.d2 = new ur(this, 2, new ArrayList(0));
        }
        this.P1.O(false);
        this.l1.setTitle(O0());
    }

    public static /* synthetic */ void d1(vr vrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            vrVar.k2[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(vrVar.T1).filter(new rr(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            vrVar.l2 = false;
            vrVar.m2 = true;
            vrVar.c1();
        }
    }

    @Override // org.telegram.ui.Components.ha
    public final boolean J0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.a, this.o1.getClassGuid(), true, new nr(this, 0), this.I0);
        this.P1 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        boolean[] zArr;
        if (this.s2) {
            return this.u2 ? org.telegram.messenger.cd.L0(2131751524, null) : this.v2 ? org.telegram.messenger.cd.L0(2131751506, null) : org.telegram.messenger.cd.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        ArrayList arrayList = this.T1;
        int[] iArr = {arrayList != null ? arrayList.size() : 0};
        if (this.k2 != null && this.m2) {
            int i10 = 0;
            while (true) {
                ur urVar = this.b2;
                if (i10 >= urVar.g) {
                    break;
                }
                if (urVar.d[i10] && ((zArr = urVar.e) == null || zArr[i10])) {
                    iArr[0] = iArr[0] + this.k2[i10];
                }
                i10++;
            }
        }
        return org.telegram.messenger.cd.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.a).f7.edit();
        edit.putBoolean("delete_report", this.a2.a());
        edit.putBoolean("delete_deleteAll", this.b2.a());
        edit.putBoolean("delete_ban", !this.Y1 && this.d2.a());
        edit.apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void e0() {
        Rect rect = org.telegram.messenger.i0.Q;
        tk0 tk0Var = this.k1;
        rect.set(0, 0, tk0Var.getMeasuredWidth(), tk0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(34.0f));
        tk0Var.setClipBounds(rect);
    }

    public final boolean e1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.n2;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void f1(ArrayList arrayList, ur urVar) {
        boolean e = urVar.e();
        int i10 = urVar.g;
        int i11 = urVar.a;
        if (e) {
            if (!urVar.d()) {
                a51 z10 = a51.z(i11, urVar.b);
                z10.L(urVar.i > 0);
                arrayList.add(z10);
                return;
            }
            String str = urVar.b;
            int i12 = urVar.i;
            if (i12 <= 0) {
                i12 = urVar.e != null ? urVar.h : i10;
            }
            String valueOf = String.valueOf(i12);
            a51 a51Var = new a51(36);
            a51Var.d = i11;
            a51Var.l = str;
            a51Var.o = valueOf;
            a51Var.L(urVar.i > 0);
            a51Var.f = urVar.f;
            a51Var.D = new org.telegram.ui.ud(29, this, urVar);
            arrayList.add(a51Var);
            if (urVar.f) {
                return;
            }
            for (int i13 = 0; i13 < i10; i13++) {
                boolean[] zArr = urVar.e;
                if (zArr == null || zArr[i13]) {
                    TLObject tLObject = (TLObject) urVar.c.get(i13);
                    a51 a51Var2 = new a51(37);
                    a51Var2.d = (i11 << 24) | i13;
                    a51Var2.G = tLObject;
                    a51Var2.L(urVar.d[i13]);
                    a51Var2.i = 1;
                    arrayList.add(a51Var2);
                }
            }
        }
    }

    public final void g1() {
        if (this.m2) {
            c1();
            return;
        }
        if (this.l2) {
            return;
        }
        this.l2 = true;
        ur urVar = this.b2;
        int i10 = urVar.g;
        this.k2 = new int[i10];
        int[] iArr = {i10};
        for (int i11 = 0; i11 < urVar.g; i11++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = org.telegram.messenger.vp.k1(this.Q1);
            tL_messages_search.q = "";
            TLRPC.InputPeer j12 = org.telegram.messenger.vp.j1((TLObject) urVar.c.get(i11));
            tL_messages_search.from_id = j12;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new org.telegram.ui.b0(this, j12, i11, iArr, 2));
        }
    }

    public final void h1() {
        boolean z10 = this.Y1;
        ur urVar = this.d2;
        if (z10 && urVar.e()) {
            this.w2 = urVar.i > 0;
        }
        if (this.Y1 && urVar.e() && urVar.i == 0) {
            urVar.f();
        } else if (!this.Y1 && urVar.e()) {
            if (this.w2 != (urVar.i > 0)) {
                urVar.f();
            }
        }
        if (this.Y1 || !urVar.e()) {
            return;
        }
        this.w2 = urVar.i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    public final void i1(boolean z10) {
        final int i10;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        ?? r19;
        int i11;
        String str;
        long j10 = this.i2;
        boolean z11 = true;
        int i12 = 0;
        if (z10 && this.h2 && (participantJoinedChats = this.j2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.p6 p6Var = this.I0;
            int i13 = this.a;
            ArrayList<Long> arrayList = this.j2.creator_chat_ids;
            pr prVar = new pr(this, 6);
            or orVar = new or(this, i12);
            Pattern pattern = s4.a;
            LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
            org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
            int i14 = 0;
            String L0 = org.telegram.messenger.cd.L0(2131751955, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.o5.s(i13, j10)));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753729, null), new t(orVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            alertDialog$Builder.o(f7);
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Long l4 = arrayList.get(i15);
                i15++;
                Long l10 = l4;
                ?? r15 = f7;
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = x1VarArr;
                long longValue = l10.longValue();
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i13).L0(l10);
                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i13).M0(longValue);
                if (L02 == null) {
                    f7 = r15;
                    x1VarArr = x1VarArr2;
                } else {
                    jg.a3 a3Var = new jg.a3(context, p6Var, z11);
                    int i16 = size;
                    ((TextView) a3Var.d).setText(org.telegram.messenger.o5.m(L02));
                    TextView textView = (TextView) a3Var.b;
                    if (M0 != null) {
                        int i17 = M0.participants_count;
                        int i18 = i14;
                        i11 = i15;
                        r19 = i18;
                        str = org.telegram.messenger.cd.G(i17, "Members", new Object[i18]);
                    } else {
                        r19 = i14;
                        i11 = i15;
                        str = null;
                    }
                    textView.setText(str);
                    ((g9) a3Var.c).e(L02, new r8(L02));
                    a3Var.setBackground(org.telegram.ui.ActionBar.t6.N0(r19));
                    a3Var.setOnClickListener(new org.telegram.ui.zn(x1VarArr2, prVar, longValue, 1));
                    r15.addView(a3Var, w7.b6.o(-1, -2));
                    x1Var = x1Var;
                    f7 = r15;
                    i15 = i11;
                    x1VarArr = x1VarArr2;
                    size = i16;
                    i14 = r19;
                    z11 = true;
                }
            }
            org.telegram.ui.ActionBar.x1 x1Var2 = x1Var;
            x1VarArr[i14] = x1Var2;
            x1Var2.show();
            TextView textView2 = (TextView) x1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.X1;
        if (runnable != null) {
            runnable.run();
        }
        ur urVar = this.a2;
        String str2 = "";
        if (urVar.i > 0) {
            str2 = "" + org.telegram.messenger.cd.G(urVar.i, "UsersReported", new Object[0]);
        }
        ur urVar2 = this.d2;
        if (urVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = sc.e.A(str2, "\n");
            }
            if (this.Y1) {
                StringBuilder t10 = a1.g.t(str2);
                t10.append(org.telegram.messenger.cd.G(urVar2.i, "UsersRestricted", new Object[0]));
                str2 = t10.toString();
            } else {
                StringBuilder t11 = a1.g.t(str2);
                t11.append(org.telegram.messenger.cd.G(urVar2.i, "UsersBanned", new Object[0]));
                str2 = t11.toString();
            }
        }
        boolean z12 = this.s2;
        boolean z13 = z12 && !this.u2;
        int i19 = urVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.k2 k2Var = this.o1;
        if (isEmpty) {
            org.telegram.messenger.m5.n(null, z13 ? 2131746396 : 2131748475, cc.a0(k2Var), i19, 36);
        } else {
            cc.a0(k2Var).I(i19, org.telegram.messenger.cd.L0(z13 ? 2131746396 : 2131748475, null), str2).j();
        }
        if (j10 != 0 && this.h2) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.a);
            long j11 = this.R1.id;
            org.telegram.messenger.z1 z1Var = new org.telegram.messenger.z1(3);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = r12.g1(j11);
            tL_communities_toggleParticipantBanned.participant = r12.i1(j10);
            tL_communities_toggleParticipantBanned.unban = false;
            r12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new a3.b(1), new org.telegram.messenger.q9(r12, j11, z1Var));
        }
        ArrayList arrayList2 = this.T1;
        final int i20 = 0;
        int i21 = 8;
        Stream map = Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.qr
            public final /* synthetic */ vr b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i22 = i20;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i20) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i22 = i20;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                switch (i20) {
                    case 0:
                        long j12 = this.b.U1;
                        TLRPC.Peer peer = jjVar.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j12)) && j12 != 0) {
                        }
                        break;
                    case 1:
                        vr vrVar = this.b;
                        vrVar.getClass();
                        TLRPC.Peer peer2 = jjVar.k.peer_id;
                        if (peer2 != null) {
                            long j13 = peer2.chat_id;
                            long j14 = vrVar.U1;
                            if (j13 != (-j14) || j14 == 0) {
                            }
                        }
                        break;
                    default:
                        vr vrVar2 = this.b;
                        vrVar2.getClass();
                        TLRPC.Peer peer3 = jjVar.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-vrVar2.U1)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new k2.f(i21));
        final int i22 = 1;
        ArrayList arrayList3 = (ArrayList) map.collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
        ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.qr
            public final /* synthetic */ vr b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i222 = i22;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i22) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i222 = i22;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                switch (i22) {
                    case 0:
                        long j12 = this.b.U1;
                        TLRPC.Peer peer = jjVar.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j12)) && j12 != 0) {
                        }
                        break;
                    case 1:
                        vr vrVar = this.b;
                        vrVar.getClass();
                        TLRPC.Peer peer2 = jjVar.k.peer_id;
                        if (peer2 != null) {
                            long j13 = peer2.chat_id;
                            long j14 = vrVar.U1;
                            if (j13 != (-j14) || j14 == 0) {
                            }
                        }
                        break;
                    default:
                        vr vrVar2 = this.b;
                        vrVar2.getClass();
                        TLRPC.Peer peer3 = jjVar.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-vrVar2.U1)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new k2.f(i21)).collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
        TLRPC.Chat chat = this.Q1;
        ur urVar3 = this.b2;
        if (!z12) {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.vp.r1(this.a).Z(arrayList3, null, null, -chat.id, this.V1, false, this.W1);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.vp.r1(this.a).Z(arrayList4, null, null, this.U1, this.V1, true, this.W1);
            }
        } else if (!this.v2) {
            urVar3.b(new androidx.car.app.utils.a(this, arrayList3, arrayList4, 22));
        }
        urVar2.c(new pr(this, 4));
        int i23 = 0;
        while (true) {
            i10 = 2;
            if (i23 >= urVar.g) {
                break;
            }
            if (urVar.d[i23] && ((zArr = urVar.e) == null || zArr[i23])) {
                TLObject tLObject = (TLObject) urVar.c.get(i23);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.qr
                    public final /* synthetic */ vr b;

                    {
                        this.b = this;
                    }

                    public /* synthetic */ Predicate and(Predicate predicate) {
                        int i222 = i10;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        switch (i10) {
                        }
                        return Predicate$-CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        int i222 = i10;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                        switch (i10) {
                            case 0:
                                long j12 = this.b.U1;
                                TLRPC.Peer peer = jjVar.k.peer_id;
                                if ((peer == null || peer.chat_id == (-j12)) && j12 != 0) {
                                }
                                break;
                            case 1:
                                vr vrVar = this.b;
                                vrVar.getClass();
                                TLRPC.Peer peer2 = jjVar.k.peer_id;
                                if (peer2 != null) {
                                    long j13 = peer2.chat_id;
                                    long j14 = vrVar.U1;
                                    if (j13 != (-j14) || j14 == 0) {
                                    }
                                }
                                break;
                            default:
                                vr vrVar2 = this.b;
                                vrVar2.getClass();
                                TLRPC.Peer peer3 = jjVar.k.peer_id;
                                if (peer3 == null || peer3.chat_id == (-vrVar2.U1)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new rr(1, tLObject)).map(new k2.f(i21)).collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
                if (z12 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.vp.k1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.vp.r1(this.a).p1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.vp.h1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.vp.m1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.vp.k1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
            i23++;
        }
        if (this.r2) {
            urVar3.b(new pr(this, 0));
        } else {
            urVar3.c(new pr(this, 1));
            this.c2.c(new pr(this, i10));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0);
        if (w02 != this.y2) {
            this.y2 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        wb.e();
    }
}
