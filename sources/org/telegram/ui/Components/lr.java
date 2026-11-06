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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class lr extends na {
    public static final /* synthetic */ int z2 = 0;
    public l41 P1;
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
    public final kr a2;
    public final kr b2;
    public final kr c2;
    public final kr d2;
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
    
        if (r20.S1 != false) goto L237;
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
    public lr(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j3, int i7, int i10, boolean z9, Runnable runnable) {
        super(f2Var.getContext(), f2Var, false, true, 2, f2Var.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.Y1 = false;
        this.l2 = false;
        this.m2 = false;
        int i11 = 1;
        this.q2 = true;
        this.t2 = true;
        this.u2 = false;
        this.v2 = false;
        this.x2 = 10.0f;
        v0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0));
        this.u1 = true;
        N();
        this.F1 = true;
        this.s2 = z9;
        pj0 pj0Var = this.k1;
        int i12 = this.t0;
        pj0Var.setPadding(i12, this.x1, i12, org.telegram.messenger.g0.L(63.0f));
        this.k1.setClipToPadding(false);
        this.k1.setOnItemClickListener(new fr(this, 3));
        this.F1 = true;
        jr jrVar = new jr(this);
        jrVar.m = false;
        jrVar.C = false;
        jrVar.o(xq.h);
        jrVar.n(350L);
        this.k1.setItemAnimator(jrVar);
        this.k1.r1();
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        dVar.f();
        dVar.setText(org.telegram.messenger.hd.M0(2131751514, null));
        dVar.setOnClickListener(new h0(this, 10));
        this.b.addView(dVar, c8.ha.f(48.0f, -1, 87, org.telegram.messenger.g0.L(10.0f) + this.t0, 0, org.telegram.messenger.g0.L(10.0f) + this.t0, org.telegram.messenger.g0.L(10.0f)));
        this.Q1 = chat;
        this.S1 = org.telegram.messenger.t3.c0(chat);
        this.T1 = arrayList;
        this.U1 = j3;
        this.V1 = i7;
        this.W1 = i10;
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
        org.telegram.messenger.qp.s1(this.a);
        this.a2 = new kr(this, 0, arrayList2);
        this.b2 = new kr(this, 1, arrayList2);
        this.c2 = new kr(this, 3, arrayList2);
        boolean z10 = arrayList2.size() == 1;
        this.r2 = z10;
        this.Z1 = org.telegram.messenger.t3.p0(chat);
        if (chat.linked_community_id != 0) {
            this.R1 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(chat.linked_community_id));
        }
        if (org.telegram.messenger.t3.y(2, this.R1) && org.telegram.messenger.t3.y(27, this.R1) && z10) {
            long d = org.telegram.messenger.m5.d((TLObject) arrayList2.get(0));
            this.i2 = d;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.a);
            long j10 = this.R1.id;
            dr drVar = new dr(this, i11);
            TL_communities.TL_communities_getParticipantJoinedChats tL_communities_getParticipantJoinedChats = new TL_communities.TL_communities_getParticipantJoinedChats();
            tL_communities_getParticipantJoinedChats.community = s12.h1(j10);
            tL_communities_getParticipantJoinedChats.participant = s12.j1(d);
            s12.getConnectionsManager().sendRequestTyped(tL_communities_getParticipantJoinedChats, new d3.b(i11), new org.telegram.messenger.x3(5, s12, drVar));
        }
        if (org.telegram.messenger.t3.w(2, chat)) {
            this.e2 = new boolean[arrayList2.size()];
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                TLRPC.ChannelParticipant channelParticipant = i13 < channelParticipantArr.length ? channelParticipantArr[i13] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.e2[i13] = true;
                }
                i13++;
            }
            this.f2 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.n2;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.S1) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i14 = 0;
                while (i14 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i14 < channelParticipantArr.length ? channelParticipantArr[i14] : null;
                    if (!(arrayList2.get(i14) instanceof TLRPC.Chat)) {
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
                        if (this.e2[i14]) {
                            this.f2[i14] = true;
                            this.g2 = true;
                        }
                    }
                    i14++;
                }
            }
            this.p2 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new aa.l(11)).collect(Collectors.toCollection(new org.telegram.messenger.ok(1)));
            kr krVar = new kr(this, 2, arrayList2);
            this.d2 = krVar;
            boolean[] zArr = this.e2;
            if (krVar.g != 0) {
                krVar.e = zArr;
                krVar.h();
                krVar.i();
            }
        } else {
            this.d2 = new kr(this, 2, new ArrayList(0));
        }
        this.P1.O(false);
        this.l1.setTitle(O0());
    }

    public static /* synthetic */ void d1(lr lrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            lrVar.k2[i7] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(lrVar.T1).filter(new ir(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            lrVar.l2 = false;
            lrVar.m2 = true;
            lrVar.c1();
        }
    }

    @Override // org.telegram.ui.Components.na
    public final boolean J0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.a, this.o1.getClassGuid(), true, new dr(this, 0), this.I0);
        this.P1 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        boolean[] zArr;
        if (this.s2) {
            return this.u2 ? org.telegram.messenger.hd.M0(2131751524, null) : this.v2 ? org.telegram.messenger.hd.M0(2131751506, null) : org.telegram.messenger.hd.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.T1;
        iArr[0] = arrayList != null ? arrayList.size() : 0;
        int[] iArr2 = this.k2;
        if (iArr2 != null && this.m2) {
            if (!this.r2) {
                int i7 = 0;
                while (true) {
                    kr krVar = this.b2;
                    if (i7 >= krVar.g) {
                        break;
                    }
                    if (krVar.d[i7] && ((zArr = krVar.e) == null || zArr[i7])) {
                        iArr[0] = iArr[0] + this.k2[i7];
                    }
                    i7++;
                }
            } else if (this.u2) {
                for (int i10 : iArr2) {
                    iArr[0] = iArr[0] + i10;
                }
            }
        }
        return org.telegram.messenger.hd.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.a).e7.edit();
        edit.putBoolean("delete_report", this.a2.a());
        edit.putBoolean("delete_deleteAll", this.b2.a());
        edit.putBoolean("delete_ban", !this.Y1 && this.d2.a());
        edit.apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void e0() {
        Rect rect = org.telegram.messenger.g0.Q;
        pj0 pj0Var = this.k1;
        rect.set(0, 0, pj0Var.getMeasuredWidth(), pj0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        pj0Var.setClipBounds(rect);
    }

    public final boolean e1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.n2;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void f1(ArrayList arrayList, kr krVar) {
        boolean e10 = krVar.e();
        int i7 = krVar.g;
        int i10 = krVar.a;
        if (e10) {
            if (!krVar.d()) {
                x31 z9 = x31.z(i10, krVar.b);
                z9.L(krVar.i > 0);
                arrayList.add(z9);
                return;
            }
            String str = krVar.b;
            int i11 = krVar.i;
            if (i11 <= 0) {
                i11 = krVar.e != null ? krVar.h : i7;
            }
            String valueOf = String.valueOf(i11);
            x31 x31Var = new x31(36);
            x31Var.d = i10;
            x31Var.l = str;
            x31Var.o = valueOf;
            x31Var.L(krVar.i > 0);
            x31Var.f = krVar.f;
            x31Var.D = new lk(6, this, krVar);
            arrayList.add(x31Var);
            if (krVar.f) {
                return;
            }
            for (int i12 = 0; i12 < i7; i12++) {
                boolean[] zArr = krVar.e;
                if (zArr == null || zArr[i12]) {
                    TLObject tLObject = (TLObject) krVar.c.get(i12);
                    x31 x31Var2 = new x31(37);
                    x31Var2.d = (i10 << 24) | i12;
                    x31Var2.G = tLObject;
                    x31Var2.L(krVar.d[i12]);
                    x31Var2.i = 1;
                    arrayList.add(x31Var2);
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
        kr krVar = this.b2;
        int i7 = krVar.g;
        this.k2 = new int[i7];
        int[] iArr = {i7};
        for (int i10 = 0; i10 < krVar.g; i10++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = org.telegram.messenger.qp.l1(this.Q1);
            tL_messages_search.q = "";
            TLRPC.InputPeer k12 = org.telegram.messenger.qp.k1((TLObject) krVar.c.get(i10));
            tL_messages_search.from_id = k12;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new di.i8(this, k12, i10, iArr, 4));
        }
    }

    public final void h1() {
        boolean z9 = this.Y1;
        kr krVar = this.d2;
        if (z9 && krVar.e()) {
            this.w2 = krVar.i > 0;
        }
        if (this.Y1 && krVar.e() && krVar.i == 0) {
            krVar.f();
        } else if (!this.Y1 && krVar.e()) {
            if (this.w2 != (krVar.i > 0)) {
                krVar.f();
            }
        }
        if (this.Y1 || !krVar.e()) {
            return;
        }
        this.w2 = krVar.i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    public final void i1(boolean z9) {
        final int i7;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        ?? r19;
        int i10;
        String str;
        long j3 = this.i2;
        boolean z10 = true;
        int i11 = 0;
        if (z9 && this.h2 && (participantJoinedChats = this.j2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.I0;
            int i12 = this.a;
            ArrayList<Long> arrayList = this.j2.creator_chat_ids;
            fr frVar = new fr(this, 6);
            er erVar = new er(this, i11);
            Pattern pattern = v4.a;
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
            int i13 = 0;
            String M0 = org.telegram.messenger.hd.M0(2131751955, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.m5.s(i12, j3)));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753729, null), new u(erVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            alertDialog$Builder.o(f10);
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Long l10 = arrayList.get(i14);
                i14++;
                Long l11 = l10;
                ?? r15 = f10;
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                long longValue = l11.longValue();
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i12).M0(l11);
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i12).N0(longValue);
                if (M02 == null) {
                    f10 = r15;
                    u1VarArr = u1VarArr2;
                } else {
                    bi.s1 s1Var = new bi.s1(context, f6Var, z10);
                    int i15 = size;
                    ((TextView) s1Var.b).setText(org.telegram.messenger.m5.m(M02));
                    TextView textView = (TextView) s1Var.d;
                    if (N0 != null) {
                        int i16 = N0.participants_count;
                        int i17 = i13;
                        i10 = i14;
                        r19 = i17;
                        str = org.telegram.messenger.hd.G(i16, "Members", new Object[i17]);
                    } else {
                        r19 = i13;
                        i10 = i14;
                        str = null;
                    }
                    textView.setText(str);
                    ((l9) s1Var.c).e(M02, new w8(M02));
                    s1Var.setBackground(org.telegram.ui.ActionBar.k6.N0(r19));
                    s1Var.setOnClickListener(new bi.p3(u1VarArr2, frVar, longValue, 2));
                    r15.addView(s1Var, c8.ha.o(-1, -2));
                    u1Var = u1Var;
                    f10 = r15;
                    i14 = i10;
                    u1VarArr = u1VarArr2;
                    size = i15;
                    i13 = r19;
                    z10 = true;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
            u1VarArr[i13] = u1Var2;
            u1Var2.show();
            TextView textView2 = (TextView) u1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.X1;
        if (runnable != null) {
            runnable.run();
        }
        kr krVar = this.a2;
        String str2 = "";
        if (krVar.i > 0) {
            str2 = "" + org.telegram.messenger.hd.G(krVar.i, "UsersReported", new Object[0]);
        }
        kr krVar2 = this.d2;
        if (krVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = rf.b.q(str2, "\n");
            }
            if (this.Y1) {
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                m10.append(org.telegram.messenger.hd.G(krVar2.i, "UsersRestricted", new Object[0]));
                str2 = m10.toString();
            } else {
                StringBuilder m11 = com.google.android.recaptcha.internal.a.m(str2);
                m11.append(org.telegram.messenger.hd.G(krVar2.i, "UsersBanned", new Object[0]));
                str2 = m11.toString();
            }
        }
        boolean z11 = this.s2;
        boolean z12 = z11 && !this.u2;
        int i18 = krVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.f2 f2Var = this.o1;
        if (isEmpty) {
            org.telegram.messenger.k5.o(null, z12 ? 2131746380 : 2131748459, hc.a0(f2Var), i18, 36);
        } else {
            hc.a0(f2Var).I(i18, org.telegram.messenger.hd.M0(z12 ? 2131746380 : 2131748459, null), str2).j();
        }
        int i19 = 4;
        if (j3 != 0 && this.h2) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.a);
            long j10 = this.R1.id;
            jh.b bVar = new jh.b(i19);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = s12.h1(j10);
            tL_communities_toggleParticipantBanned.participant = s12.j1(j3);
            tL_communities_toggleParticipantBanned.unban = false;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new org.telegram.messenger.p9(s12, j10, bVar));
        }
        ArrayList arrayList2 = this.T1;
        final int i20 = 0;
        int i21 = 10;
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
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                switch (i20) {
                    case 0:
                        long j11 = this.b.U1;
                        TLRPC.Peer peer = ijVar.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j11)) && j11 != 0) {
                        }
                        break;
                    case 1:
                        lr lrVar = this.b;
                        lrVar.getClass();
                        TLRPC.Peer peer2 = ijVar.k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = lrVar.U1;
                            if (j12 != (-j13) || j13 == 0) {
                            }
                        }
                        break;
                    default:
                        lr lrVar2 = this.b;
                        lrVar2.getClass();
                        TLRPC.Peer peer3 = ijVar.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-lrVar2.U1)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new aa.l(i21)).collect(Collectors.toCollection(new org.telegram.messenger.ok(1)));
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
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                switch (i22) {
                    case 0:
                        long j11 = this.b.U1;
                        TLRPC.Peer peer = ijVar.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j11)) && j11 != 0) {
                        }
                        break;
                    case 1:
                        lr lrVar = this.b;
                        lrVar.getClass();
                        TLRPC.Peer peer2 = ijVar.k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = lrVar.U1;
                            if (j12 != (-j13) || j13 == 0) {
                            }
                        }
                        break;
                    default:
                        lr lrVar2 = this.b;
                        lrVar2.getClass();
                        TLRPC.Peer peer3 = ijVar.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-lrVar2.U1)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new aa.l(i21)).collect(Collectors.toCollection(new org.telegram.messenger.ok(1)));
        TLRPC.Chat chat = this.Q1;
        kr krVar3 = this.b2;
        if (!z11) {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.qp.s1(this.a).Z(arrayList3, null, null, -chat.id, this.V1, false, this.W1);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.qp.s1(this.a).Z(arrayList4, null, null, this.U1, this.V1, true, this.W1);
            }
        } else if (!this.v2) {
            krVar3.b(new hr(this, arrayList3, arrayList4, 0));
        }
        krVar2.c(new fr(this, i19));
        int i23 = 0;
        while (true) {
            i7 = 2;
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
                        int i232 = i7;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        switch (i7) {
                        }
                        return Predicate$-CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        int i232 = i7;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                        switch (i7) {
                            case 0:
                                long j11 = this.b.U1;
                                TLRPC.Peer peer = ijVar.k.peer_id;
                                if ((peer == null || peer.chat_id == (-j11)) && j11 != 0) {
                                }
                                break;
                            case 1:
                                lr lrVar = this.b;
                                lrVar.getClass();
                                TLRPC.Peer peer2 = ijVar.k.peer_id;
                                if (peer2 != null) {
                                    long j12 = peer2.chat_id;
                                    long j13 = lrVar.U1;
                                    if (j12 != (-j13) || j13 == 0) {
                                    }
                                }
                                break;
                            default:
                                lr lrVar2 = this.b;
                                lrVar2.getClass();
                                TLRPC.Peer peer3 = ijVar.k.peer_id;
                                if (peer3 == null || peer3.chat_id == (-lrVar2.U1)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new ir(1, tLObject)).map(new aa.l(i21)).collect(Collectors.toCollection(new org.telegram.messenger.ok(1)));
                if (z11 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.qp.l1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.qp.s1(this.a).q1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.qp.i1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.qp.n1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.qp.l1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
            i23++;
        }
        if (this.r2) {
            krVar3.b(new fr(this, 0));
        } else {
            krVar3.c(new fr(this, 1));
            this.c2.c(new fr(this, i7));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0);
        if (w02 != this.y2) {
            this.y2 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        cc.e();
    }
}
