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
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lr extends ma {
    public static final /* synthetic */ int A2 = 0;
    public f41 Q1;
    public final TLRPC.Chat R1;
    public final TLRPC.Chat S1;
    public final boolean T1;
    public final ArrayList U1;
    public final long V1;
    public final int W1;
    public final int X1;
    public final Runnable Y1;
    public boolean Z1;
    public final boolean a2;
    public final kr b2;
    public final kr c2;
    public final kr d2;
    public final kr e2;
    public final boolean[] f2;
    public final boolean[] g2;
    public final boolean h2;
    public boolean i2;
    public final long j2;
    public TL_communities.ParticipantJoinedChats k2;
    public int[] l2;
    public boolean m2;
    public boolean n2;
    public final TLRPC.TL_chatBannedRights o2;
    public final TLRPC.TL_chatBannedRights p2;
    public final ArrayList q2;
    public boolean r2;
    public final boolean s2;
    public final boolean t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;
    public boolean x2;
    public float y2;
    public int z2;

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
    
        if (r21.T1 != false) goto L237;
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
    public lr(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j10, int i3, int i10, boolean z10, Runnable runnable) {
        super(d2Var.getContext(), d2Var, false, true, 2, d2Var.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.Z1 = false;
        this.m2 = false;
        this.n2 = false;
        int i11 = 1;
        this.r2 = true;
        this.u2 = true;
        this.v2 = false;
        this.w2 = false;
        this.y2 = 10.0f;
        v0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0));
        this.v1 = true;
        N();
        this.G1 = true;
        this.t2 = z10;
        tj0 tj0Var = this.l1;
        int i12 = this.u0;
        tj0Var.setPadding(i12, this.y1, i12, org.telegram.messenger.g0.L(63.0f));
        this.l1.setClipToPadding(false);
        this.l1.setOnItemClickListener(new fr(this, 3));
        this.G1 = true;
        jr jrVar = new jr(this);
        jrVar.m = false;
        jrVar.C = false;
        jrVar.o(xq.h);
        jrVar.n(350L);
        this.l1.setItemAnimator(jrVar);
        this.l1.r1();
        gi.d dVar = new gi.d(getContext(), this.J0, true);
        dVar.f();
        dVar.setText(org.telegram.messenger.bd.M0(2131751514, null));
        int i13 = 10;
        dVar.setOnClickListener(new f0(this, i13));
        this.b.addView(dVar, b8.mf.f(48.0f, -1, 87, org.telegram.messenger.g0.L(10.0f) + this.u0, 0, org.telegram.messenger.g0.L(10.0f) + this.u0, org.telegram.messenger.g0.L(10.0f)));
        this.R1 = chat;
        this.T1 = org.telegram.messenger.t3.c0(chat);
        this.U1 = arrayList;
        this.V1 = j10;
        this.W1 = i3;
        this.X1 = i10;
        this.Y1 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.o2 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.p2 = tL_chatBannedRights4;
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
        org.telegram.messenger.hp.s1(this.a);
        this.b2 = new kr(this, 0, arrayList2);
        this.c2 = new kr(this, 1, arrayList2);
        this.d2 = new kr(this, 3, arrayList2);
        boolean z11 = arrayList2.size() == 1;
        this.s2 = z11;
        this.a2 = org.telegram.messenger.t3.p0(chat);
        if (chat.linked_community_id != 0) {
            this.S1 = org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(chat.linked_community_id));
        }
        if (org.telegram.messenger.t3.y(2, this.S1) && org.telegram.messenger.t3.y(27, this.S1) && z11) {
            long d = org.telegram.messenger.m5.d((TLObject) arrayList2.get(0));
            this.j2 = d;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.a);
            long j11 = this.S1.id;
            dr drVar = new dr(this, i11);
            TL_communities.TL_communities_getParticipantJoinedChats tL_communities_getParticipantJoinedChats = new TL_communities.TL_communities_getParticipantJoinedChats();
            tL_communities_getParticipantJoinedChats.community = s12.h1(j11);
            tL_communities_getParticipantJoinedChats.participant = s12.j1(d);
            s12.getConnectionsManager().sendRequestTyped(tL_communities_getParticipantJoinedChats, new c3.b(i11), new org.telegram.messenger.x3(4, s12, drVar));
        }
        if (org.telegram.messenger.t3.w(2, chat)) {
            this.f2 = new boolean[arrayList2.size()];
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                TLRPC.ChannelParticipant channelParticipant = i14 < channelParticipantArr.length ? channelParticipantArr[i14] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.f2[i14] = true;
                }
                i14++;
            }
            this.g2 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.o2;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.T1) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i15 = 0;
                while (i15 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i15 < channelParticipantArr.length ? channelParticipantArr[i15] : null;
                    if (!(arrayList2.get(i15) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.o2;
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
                        if (this.f2[i15]) {
                            this.g2[i15] = true;
                            this.h2 = true;
                        }
                    }
                    i15++;
                }
            }
            this.q2 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new fa.b(i13)).collect(Collectors.toCollection(new org.telegram.messenger.ek(1)));
            kr krVar = new kr(this, 2, arrayList2);
            this.e2 = krVar;
            boolean[] zArr = this.f2;
            if (krVar.g != 0) {
                krVar.e = zArr;
                krVar.h();
                krVar.i();
            }
        } else {
            this.e2 = new kr(this, 2, new ArrayList(0));
        }
        this.Q1.O(false);
        this.m1.setTitle(O0());
    }

    public static /* synthetic */ void d1(lr lrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i3, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            lrVar.l2[i3] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(lrVar.U1).filter(new ir(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            lrVar.m2 = false;
            lrVar.n2 = true;
            lrVar.c1();
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final boolean J0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, this.p1.getClassGuid(), true, new dr(this, 0), this.J0);
        this.Q1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        boolean[] zArr;
        if (this.t2) {
            return this.v2 ? org.telegram.messenger.bd.M0(2131751524, null) : this.w2 ? org.telegram.messenger.bd.M0(2131751506, null) : org.telegram.messenger.bd.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.U1;
        iArr[0] = arrayList != null ? arrayList.size() : 0;
        int[] iArr2 = this.l2;
        if (iArr2 != null && this.n2) {
            if (!this.s2) {
                int i3 = 0;
                while (true) {
                    kr krVar = this.c2;
                    if (i3 >= krVar.g) {
                        break;
                    }
                    if (krVar.d[i3] && ((zArr = krVar.e) == null || zArr[i3])) {
                        iArr[0] = iArr[0] + this.l2[i3];
                    }
                    i3++;
                }
            } else if (this.v2) {
                for (int i10 : iArr2) {
                    iArr[0] = iArr[0] + i10;
                }
            }
        }
        return org.telegram.messenger.bd.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.a).e7.edit();
        edit.putBoolean("delete_report", this.b2.a());
        edit.putBoolean("delete_deleteAll", this.c2.a());
        edit.putBoolean("delete_ban", !this.Z1 && this.e2.a());
        edit.apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void e0() {
        Rect rect = org.telegram.messenger.g0.Q;
        tj0 tj0Var = this.l1;
        rect.set(0, 0, tj0Var.getMeasuredWidth(), tj0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        tj0Var.setClipBounds(rect);
    }

    public final boolean e1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.o2;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void f1(ArrayList arrayList, kr krVar) {
        boolean e10 = krVar.e();
        int i3 = krVar.g;
        int i10 = krVar.a;
        if (e10) {
            if (!krVar.d()) {
                r31 z10 = r31.z(i10, krVar.b);
                z10.L(krVar.i > 0);
                arrayList.add(z10);
                return;
            }
            String str = krVar.b;
            int i11 = krVar.i;
            if (i11 <= 0) {
                i11 = krVar.e != null ? krVar.h : i3;
            }
            String valueOf = String.valueOf(i11);
            r31 r31Var = new r31(36);
            r31Var.d = i10;
            r31Var.l = str;
            r31Var.o = valueOf;
            r31Var.L(krVar.i > 0);
            r31Var.f = krVar.f;
            r31Var.D = new q2(12, this, krVar);
            arrayList.add(r31Var);
            if (krVar.f) {
                return;
            }
            for (int i12 = 0; i12 < i3; i12++) {
                boolean[] zArr = krVar.e;
                if (zArr == null || zArr[i12]) {
                    TLObject tLObject = (TLObject) krVar.c.get(i12);
                    r31 r31Var2 = new r31(37);
                    r31Var2.d = (i10 << 24) | i12;
                    r31Var2.G = tLObject;
                    r31Var2.L(krVar.d[i12]);
                    r31Var2.i = 1;
                    arrayList.add(r31Var2);
                }
            }
        }
    }

    public final void g1() {
        if (this.n2) {
            c1();
            return;
        }
        if (this.m2) {
            return;
        }
        this.m2 = true;
        kr krVar = this.c2;
        int i3 = krVar.g;
        this.l2 = new int[i3];
        int[] iArr = {i3};
        for (int i10 = 0; i10 < krVar.g; i10++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = org.telegram.messenger.hp.l1(this.R1);
            tL_messages_search.q = "";
            TLRPC.InputPeer k1 = org.telegram.messenger.hp.k1((TLObject) krVar.c.get(i10));
            tL_messages_search.from_id = k1;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new ei.i8(this, k1, i10, iArr, 4));
        }
    }

    public final void h1() {
        boolean z10 = this.Z1;
        kr krVar = this.e2;
        if (z10 && krVar.e()) {
            this.x2 = krVar.i > 0;
        }
        if (this.Z1 && krVar.e() && krVar.i == 0) {
            krVar.f();
        } else if (!this.Z1 && krVar.e()) {
            if (this.x2 != (krVar.i > 0)) {
                krVar.f();
            }
        }
        if (this.Z1 || !krVar.e()) {
            return;
        }
        this.x2 = krVar.i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    public final void i1(boolean z10) {
        final int i3;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        ?? r19;
        int i10;
        String str;
        long j10 = this.j2;
        boolean z11 = true;
        int i11 = 0;
        if (z10 && this.i2 && (participantJoinedChats = this.k2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            int i12 = this.a;
            ArrayList<Long> arrayList = this.k2.creator_chat_ids;
            fr frVar = new fr(this, 6);
            er erVar = new er(this, i11);
            Pattern pattern = t4.a;
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            int i13 = 0;
            String M0 = org.telegram.messenger.bd.M0(2131751955, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.m5.s(i12, j10)));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753729, null), new t(erVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            alertDialog$Builder.o(f10);
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Long l10 = arrayList.get(i14);
                i14++;
                Long l11 = l10;
                ?? r15 = f10;
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = s1VarArr;
                long longValue = l11.longValue();
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i12).M0(l11);
                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i12).N0(longValue);
                if (M02 == null) {
                    f10 = r15;
                    s1VarArr = s1VarArr2;
                } else {
                    ci.l1 l1Var = new ci.l1(context, e6Var, z11);
                    int i15 = size;
                    ((TextView) l1Var.b).setText(org.telegram.messenger.m5.m(M02));
                    TextView textView = (TextView) l1Var.d;
                    if (N0 != null) {
                        int i16 = N0.participants_count;
                        int i17 = i13;
                        i10 = i14;
                        r19 = i17;
                        str = org.telegram.messenger.bd.G(i16, "Members", new Object[i17]);
                    } else {
                        r19 = i13;
                        i10 = i14;
                        str = null;
                    }
                    textView.setText(str);
                    ((k9) l1Var.c).e(M02, new u8(M02));
                    l1Var.setBackground(org.telegram.ui.ActionBar.k6.N0(r19));
                    l1Var.setOnClickListener(new ci.c3(s1VarArr2, frVar, longValue, 2));
                    r15.addView(l1Var, b8.mf.o(-1, -2));
                    s1Var = s1Var;
                    f10 = r15;
                    i14 = i10;
                    s1VarArr = s1VarArr2;
                    size = i15;
                    i13 = r19;
                    z11 = true;
                }
            }
            org.telegram.ui.ActionBar.s1 s1Var2 = s1Var;
            s1VarArr[i13] = s1Var2;
            s1Var2.show();
            TextView textView2 = (TextView) s1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.Y1;
        if (runnable != null) {
            runnable.run();
        }
        kr krVar = this.b2;
        String str2 = "";
        if (krVar.i > 0) {
            str2 = "" + org.telegram.messenger.bd.G(krVar.i, "UsersReported", new Object[0]);
        }
        kr krVar2 = this.e2;
        if (krVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = t4.c.q(str2, "\n");
            }
            if (this.Z1) {
                StringBuilder l12 = com.google.android.recaptcha.internal.a.l(str2);
                l12.append(org.telegram.messenger.bd.G(krVar2.i, "UsersRestricted", new Object[0]));
                str2 = l12.toString();
            } else {
                StringBuilder l13 = com.google.android.recaptcha.internal.a.l(str2);
                l13.append(org.telegram.messenger.bd.G(krVar2.i, "UsersBanned", new Object[0]));
                str2 = l13.toString();
            }
        }
        boolean z12 = this.t2;
        boolean z13 = z12 && !this.v2;
        int i18 = krVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.d2 d2Var = this.p1;
        if (isEmpty) {
            org.telegram.messenger.k5.o(null, z13 ? 2131746389 : 2131748468, fc.a0(d2Var), i18, 36);
        } else {
            fc.a0(d2Var).I(i18, org.telegram.messenger.bd.M0(z13 ? 2131746389 : 2131748468, null), str2).j();
        }
        int i19 = 4;
        if (j10 != 0 && this.i2) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.a);
            long j11 = this.S1.id;
            kh.b bVar = new kh.b(i19);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = s12.h1(j11);
            tL_communities_toggleParticipantBanned.participant = s12.j1(j10);
            tL_communities_toggleParticipantBanned.unban = false;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new c3.b(1), new org.telegram.messenger.j9(s12, j11, bVar));
        }
        ArrayList arrayList2 = this.U1;
        final int i20 = 0;
        int i21 = 9;
        final int i22 = 1;
        ArrayList arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.gr
            public final /* synthetic */ lr b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i23 = i20;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i20) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i23 = i20;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                switch (i20) {
                    case 0:
                        long j12 = this.b.V1;
                        TLRPC.Peer peer = ziVar.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j12)) && j12 != 0) {
                        }
                        break;
                    case 1:
                        lr lrVar = this.b;
                        lrVar.getClass();
                        TLRPC.Peer peer2 = ziVar.k.peer_id;
                        if (peer2 != null) {
                            long j13 = peer2.chat_id;
                            long j14 = lrVar.V1;
                            if (j13 != (-j14) || j14 == 0) {
                            }
                        }
                        break;
                    default:
                        lr lrVar2 = this.b;
                        lrVar2.getClass();
                        TLRPC.Peer peer3 = ziVar.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-lrVar2.V1)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new fa.b(i21)).collect(Collectors.toCollection(new org.telegram.messenger.ek(1)));
        ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.gr
            public final /* synthetic */ lr b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i23 = i22;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i22) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i23 = i22;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                switch (i22) {
                    case 0:
                        long j12 = this.b.V1;
                        TLRPC.Peer peer = ziVar.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j12)) && j12 != 0) {
                        }
                        break;
                    case 1:
                        lr lrVar = this.b;
                        lrVar.getClass();
                        TLRPC.Peer peer2 = ziVar.k.peer_id;
                        if (peer2 != null) {
                            long j13 = peer2.chat_id;
                            long j14 = lrVar.V1;
                            if (j13 != (-j14) || j14 == 0) {
                            }
                        }
                        break;
                    default:
                        lr lrVar2 = this.b;
                        lrVar2.getClass();
                        TLRPC.Peer peer3 = ziVar.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-lrVar2.V1)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new fa.b(i21)).collect(Collectors.toCollection(new org.telegram.messenger.ek(1)));
        TLRPC.Chat chat = this.R1;
        kr krVar3 = this.c2;
        if (!z12) {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.hp.s1(this.a).Z(arrayList3, null, null, -chat.id, this.W1, false, this.X1);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.hp.s1(this.a).Z(arrayList4, null, null, this.V1, this.W1, true, this.X1);
            }
        } else if (!this.w2) {
            krVar3.b(new hr(this, arrayList3, arrayList4, 0));
        }
        krVar2.c(new fr(this, i19));
        int i23 = 0;
        while (true) {
            i3 = 2;
            if (i23 >= krVar.g) {
                break;
            }
            if (krVar.d[i23] && ((zArr = krVar.e) == null || zArr[i23])) {
                TLObject tLObject = (TLObject) krVar.c.get(i23);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.gr
                    public final /* synthetic */ lr b;

                    {
                        this.b = this;
                    }

                    public /* synthetic */ Predicate and(Predicate predicate) {
                        int i232 = i3;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        switch (i3) {
                        }
                        return Predicate$-CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        int i232 = i3;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                        switch (i3) {
                            case 0:
                                long j12 = this.b.V1;
                                TLRPC.Peer peer = ziVar.k.peer_id;
                                if ((peer == null || peer.chat_id == (-j12)) && j12 != 0) {
                                }
                                break;
                            case 1:
                                lr lrVar = this.b;
                                lrVar.getClass();
                                TLRPC.Peer peer2 = ziVar.k.peer_id;
                                if (peer2 != null) {
                                    long j13 = peer2.chat_id;
                                    long j14 = lrVar.V1;
                                    if (j13 != (-j14) || j14 == 0) {
                                    }
                                }
                                break;
                            default:
                                lr lrVar2 = this.b;
                                lrVar2.getClass();
                                TLRPC.Peer peer3 = ziVar.k.peer_id;
                                if (peer3 == null || peer3.chat_id == (-lrVar2.V1)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new ir(1, tLObject)).map(new fa.b(i21)).collect(Collectors.toCollection(new org.telegram.messenger.ek(1)));
                if (z12 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.hp.l1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.hp.s1(this.a).q1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.hp.i1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.hp.n1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.hp.l1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
            i23++;
        }
        if (this.s2) {
            krVar3.b(new fr(this, 0));
        } else {
            krVar3.c(new fr(this, 1));
            this.d2.c(new fr(this, i3));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0);
        if (w02 != this.z2) {
            this.z2 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        ac.e();
    }
}
