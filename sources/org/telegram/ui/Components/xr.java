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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xr extends ra {
    public static final /* synthetic */ int D2 = 0;
    public boolean A2;
    public float B2;
    public int C2;
    public b51 T1;
    public final TLRPC.Chat U1;
    public final TLRPC.Chat V1;
    public final boolean W1;
    public final ArrayList X1;
    public final long Y1;
    public final int Z1;
    public final int a2;
    public final Runnable b2;
    public boolean c2;
    public final boolean d2;
    public final wr e2;
    public final wr f2;
    public final wr g2;
    public final wr h2;
    public final boolean[] i2;
    public final boolean[] j2;
    public final boolean k2;
    public boolean l2;
    public final long m2;
    public TL_communities.ParticipantJoinedChats n2;
    public int[] o2;
    public boolean p2;
    public boolean q2;
    public final TLRPC.TL_chatBannedRights r2;
    public final TLRPC.TL_chatBannedRights s2;
    public final ArrayList t2;
    public boolean u2;
    public final boolean v2;
    public final boolean w2;
    public boolean x2;
    public boolean y2;
    public boolean z2;

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
    
        if (r21.W1 != false) goto L237;
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
    public xr(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j3, int i7, int i10, boolean z10, Runnable runnable) {
        super(g2Var.getContext(), g2Var, false, true, 2, g2Var.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.c2 = false;
        this.p2 = false;
        this.q2 = false;
        int i11 = 1;
        this.u2 = true;
        this.x2 = true;
        this.y2 = false;
        this.z2 = false;
        this.B2 = 10.0f;
        v0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0));
        this.y1 = true;
        O();
        this.J1 = true;
        this.w2 = z10;
        ek0 ek0Var = this.o1;
        int i12 = this.u0;
        ek0Var.setPadding(i12, this.B1, i12, org.telegram.messenger.g0.L(63.0f));
        this.o1.setClipToPadding(false);
        this.o1.setOnItemClickListener(new sr(this, 3));
        this.J1 = true;
        vr vrVar = new vr(this);
        vrVar.m = false;
        vrVar.C = false;
        vrVar.o(kr.h);
        vrVar.n(350L);
        this.o1.setItemAnimator(vrVar);
        this.o1.r1();
        hi.e eVar = new hi.e(getContext(), this.J0, true);
        eVar.f();
        eVar.setText(org.telegram.messenger.gd.N0(2131751501, null));
        int i13 = 11;
        eVar.setOnClickListener(new n0(this, i13));
        this.b.addView(eVar, c8.na.f(48.0f, -1, 87, org.telegram.messenger.g0.L(10.0f) + this.u0, 0, org.telegram.messenger.g0.L(10.0f) + this.u0, org.telegram.messenger.g0.L(10.0f)));
        this.U1 = chat;
        this.W1 = org.telegram.messenger.v3.c0(chat);
        this.X1 = arrayList;
        this.Y1 = j3;
        this.Z1 = i7;
        this.a2 = i10;
        this.b2 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.r2 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.s2 = tL_chatBannedRights4;
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
        org.telegram.messenger.mp.u1(this.a);
        this.e2 = new wr(this, 0, arrayList2);
        this.f2 = new wr(this, 1, arrayList2);
        this.g2 = new wr(this, 3, arrayList2);
        boolean z11 = arrayList2.size() == 1;
        this.v2 = z11;
        this.d2 = org.telegram.messenger.v3.p0(chat);
        if (chat.linked_community_id != 0) {
            this.V1 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(chat.linked_community_id));
        }
        if (org.telegram.messenger.v3.y(2, this.V1) && org.telegram.messenger.v3.y(27, this.V1) && z11) {
            long d = org.telegram.messenger.n5.d((TLObject) arrayList2.get(0));
            this.m2 = d;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.a);
            long j10 = this.V1.id;
            qr qrVar = new qr(this, i11);
            TL_communities.TL_communities_getParticipantJoinedChats tL_communities_getParticipantJoinedChats = new TL_communities.TL_communities_getParticipantJoinedChats();
            tL_communities_getParticipantJoinedChats.community = u12.j1(j10);
            tL_communities_getParticipantJoinedChats.participant = u12.l1(d);
            u12.getConnectionsManager().sendRequestTyped(tL_communities_getParticipantJoinedChats, new d3.b(i11), new org.telegram.messenger.z3(5, u12, qrVar));
        }
        if (org.telegram.messenger.v3.w(2, chat)) {
            this.i2 = new boolean[arrayList2.size()];
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                TLRPC.ChannelParticipant channelParticipant = i14 < channelParticipantArr.length ? channelParticipantArr[i14] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.i2[i14] = true;
                }
                i14++;
            }
            this.j2 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.r2;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.W1) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i15 = 0;
                while (i15 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i15 < channelParticipantArr.length ? channelParticipantArr[i15] : null;
                    if (!(arrayList2.get(i15) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.r2;
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
                        if (this.i2[i15]) {
                            this.j2[i15] = true;
                            this.k2 = true;
                        }
                    }
                    i15++;
                }
            }
            this.t2 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new aa.l(i13)).collect(Collectors.toCollection(new org.telegram.messenger.jk(1)));
            wr wrVar = new wr(this, 2, arrayList2);
            this.h2 = wrVar;
            boolean[] zArr = this.i2;
            if (wrVar.g != 0) {
                wrVar.e = zArr;
                wrVar.h();
                wrVar.i();
            }
        } else {
            this.h2 = new wr(this, 2, new ArrayList(0));
        }
        this.T1.O(false);
        this.p1.setTitle(P0());
    }

    public static /* synthetic */ void e1(xr xrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            xrVar.o2[i7] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(xrVar.X1).filter(new ur(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            xrVar.p2 = false;
            xrVar.q2 = true;
            xrVar.d1();
        }
    }

    @Override // org.telegram.ui.Components.ra
    public final boolean K0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.e2);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.a, this.s1.getClassGuid(), true, new qr(this, 0), this.J0);
        this.T1 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        boolean[] zArr;
        if (this.w2) {
            return this.y2 ? org.telegram.messenger.gd.N0(2131751511, null) : this.z2 ? org.telegram.messenger.gd.N0(2131751493, null) : org.telegram.messenger.gd.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.X1;
        iArr[0] = arrayList != null ? arrayList.size() : 0;
        int[] iArr2 = this.o2;
        if (iArr2 != null && this.q2) {
            if (!this.v2) {
                int i7 = 0;
                while (true) {
                    wr wrVar = this.f2;
                    if (i7 >= wrVar.g) {
                        break;
                    }
                    if (wrVar.d[i7] && ((zArr = wrVar.e) == null || zArr[i7])) {
                        iArr[0] = iArr[0] + this.o2[i7];
                    }
                    i7++;
                }
            } else if (this.y2) {
                for (int i10 : iArr2) {
                    iArr[0] = iArr[0] + i10;
                }
            }
        }
        return org.telegram.messenger.gd.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.a).h7.edit();
        edit.putBoolean("delete_report", this.e2.a());
        edit.putBoolean("delete_deleteAll", this.f2.a());
        edit.putBoolean("delete_ban", !this.c2 && this.h2.a());
        edit.apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void e0() {
        Rect rect = org.telegram.messenger.g0.Q;
        ek0 ek0Var = this.o1;
        rect.set(0, 0, ek0Var.getMeasuredWidth(), ek0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        ek0Var.setClipBounds(rect);
    }

    public final boolean f1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.r2;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void g1(ArrayList arrayList, wr wrVar) {
        boolean e10 = wrVar.e();
        int i7 = wrVar.g;
        int i10 = wrVar.a;
        if (e10) {
            if (!wrVar.d()) {
                n41 z10 = n41.z(i10, wrVar.b);
                z10.L(wrVar.i > 0);
                arrayList.add(z10);
                return;
            }
            String str = wrVar.b;
            int i11 = wrVar.i;
            if (i11 <= 0) {
                i11 = wrVar.e != null ? wrVar.h : i7;
            }
            String valueOf = String.valueOf(i11);
            n41 n41Var = new n41(36);
            n41Var.d = i10;
            n41Var.m = str;
            n41Var.p = valueOf;
            n41Var.L(wrVar.i > 0);
            n41Var.f = wrVar.f;
            n41Var.E = new l8(8, this, wrVar);
            arrayList.add(n41Var);
            if (wrVar.f) {
                return;
            }
            for (int i12 = 0; i12 < i7; i12++) {
                boolean[] zArr = wrVar.e;
                if (zArr == null || zArr[i12]) {
                    TLObject tLObject = (TLObject) wrVar.c.get(i12);
                    n41 n41Var2 = new n41(37);
                    n41Var2.d = (i10 << 24) | i12;
                    n41Var2.H = tLObject;
                    n41Var2.L(wrVar.d[i12]);
                    n41Var2.i = 1;
                    arrayList.add(n41Var2);
                }
            }
        }
    }

    public final void h1() {
        if (this.q2) {
            d1();
            return;
        }
        if (this.p2) {
            return;
        }
        this.p2 = true;
        wr wrVar = this.f2;
        int i7 = wrVar.g;
        this.o2 = new int[i7];
        int[] iArr = {i7};
        for (int i10 = 0; i10 < wrVar.g; i10++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = org.telegram.messenger.mp.n1(this.U1);
            tL_messages_search.q = "";
            TLRPC.InputPeer m12 = org.telegram.messenger.mp.m1((TLObject) wrVar.c.get(i10));
            tL_messages_search.from_id = m12;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new fi.y7(this, m12, i10, iArr, 4));
        }
    }

    public final void i1() {
        boolean z10 = this.c2;
        wr wrVar = this.h2;
        if (z10 && wrVar.e()) {
            this.A2 = wrVar.i > 0;
        }
        if (this.c2 && wrVar.e() && wrVar.i == 0) {
            wrVar.f();
        } else if (!this.c2 && wrVar.e()) {
            if (this.A2 != (wrVar.i > 0)) {
                wrVar.f();
            }
        }
        if (this.c2 || !wrVar.e()) {
            return;
        }
        this.A2 = wrVar.i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    public final void j1(boolean z10) {
        final int i7;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        ?? r19;
        int i10;
        String str;
        long j3 = this.m2;
        boolean z11 = true;
        int i11 = 0;
        if (z10 && this.l2 && (participantJoinedChats = this.n2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.i6 i6Var = this.J0;
            int i12 = this.a;
            ArrayList<Long> arrayList = this.n2.creator_chat_ids;
            sr srVar = new sr(this, 6);
            rr rrVar = new rr(this, i11);
            Pattern pattern = b5.a;
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            int i13 = 0;
            String N0 = org.telegram.messenger.gd.N0(2131751943, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.n5.s(i12, j3)));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131753726, null), new b0(rrVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            alertDialog$Builder.o(g10);
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Long l10 = arrayList.get(i14);
                i14++;
                Long l11 = l10;
                ?? r15 = g10;
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                long longValue = l11.longValue();
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i12).O0(l11);
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i12).P0(longValue);
                if (O0 == null) {
                    g10 = r15;
                    t1VarArr = t1VarArr2;
                } else {
                    di.d1 d1Var = new di.d1(context, i6Var, z11);
                    int i15 = size;
                    ((TextView) d1Var.b).setText(org.telegram.messenger.n5.m(O0));
                    TextView textView = (TextView) d1Var.d;
                    if (P0 != null) {
                        int i16 = P0.participants_count;
                        int i17 = i13;
                        i10 = i14;
                        r19 = i17;
                        str = org.telegram.messenger.gd.G(i16, "Members", new Object[i17]);
                    } else {
                        r19 = i13;
                        i10 = i14;
                        str = null;
                    }
                    textView.setText(str);
                    ((p9) d1Var.c).f(O0, new a9(O0));
                    d1Var.setBackground(org.telegram.ui.ActionBar.n6.N0(r19));
                    d1Var.setOnClickListener(new di.d3(t1VarArr2, srVar, longValue, 2));
                    r15.addView(d1Var, c8.na.o(-1, -2));
                    t1Var = t1Var;
                    g10 = r15;
                    i14 = i10;
                    t1VarArr = t1VarArr2;
                    size = i15;
                    i13 = r19;
                    z11 = true;
                }
            }
            org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
            t1VarArr[i13] = t1Var2;
            t1Var2.show();
            TextView textView2 = (TextView) t1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.b2;
        if (runnable != null) {
            runnable.run();
        }
        wr wrVar = this.e2;
        String str2 = "";
        if (wrVar.i > 0) {
            str2 = "" + org.telegram.messenger.gd.G(wrVar.i, "UsersReported", new Object[0]);
        }
        wr wrVar2 = this.h2;
        if (wrVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = p5.c.v(str2, "\n");
            }
            if (this.c2) {
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                m10.append(org.telegram.messenger.gd.G(wrVar2.i, "UsersRestricted", new Object[0]));
                str2 = m10.toString();
            } else {
                StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(str2);
                m11.append(org.telegram.messenger.gd.G(wrVar2.i, "UsersBanned", new Object[0]));
                str2 = m11.toString();
            }
        }
        boolean z12 = this.w2;
        boolean z13 = z12 && !this.y2;
        int i18 = wrVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.g2 g2Var = this.s1;
        if (isEmpty) {
            org.telegram.messenger.f3.n(null, z13 ? 2131746185 : 2131748267, kc.b0(g2Var), i18, 36);
        } else {
            kc.b0(g2Var).I(i18, org.telegram.messenger.gd.N0(z13 ? 2131746185 : 2131748267, null), str2).j();
        }
        int i19 = 4;
        if (j3 != 0 && this.l2) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.a);
            long j10 = this.V1.id;
            jh.b bVar = new jh.b(i19);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = u12.j1(j10);
            tL_communities_toggleParticipantBanned.participant = u12.l1(j3);
            tL_communities_toggleParticipantBanned.unban = false;
            u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new org.telegram.messenger.n9(u12, j10, bVar));
        }
        ArrayList arrayList2 = this.X1;
        final int i20 = 0;
        int i21 = 10;
        final int i22 = 1;
        ArrayList arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.tr
            public final /* synthetic */ xr b;

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
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                switch (i20) {
                    case 0:
                        long j11 = this.b.Y1;
                        TLRPC.Peer peer = fjVar.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j11)) && j11 != 0) {
                        }
                        break;
                    case 1:
                        xr xrVar = this.b;
                        xrVar.getClass();
                        TLRPC.Peer peer2 = fjVar.k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = xrVar.Y1;
                            if (j12 != (-j13) || j13 == 0) {
                            }
                        }
                        break;
                    default:
                        xr xrVar2 = this.b;
                        xrVar2.getClass();
                        TLRPC.Peer peer3 = fjVar.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-xrVar2.Y1)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new aa.l(i21)).collect(Collectors.toCollection(new org.telegram.messenger.jk(1)));
        ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.tr
            public final /* synthetic */ xr b;

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
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                switch (i22) {
                    case 0:
                        long j11 = this.b.Y1;
                        TLRPC.Peer peer = fjVar.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j11)) && j11 != 0) {
                        }
                        break;
                    case 1:
                        xr xrVar = this.b;
                        xrVar.getClass();
                        TLRPC.Peer peer2 = fjVar.k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = xrVar.Y1;
                            if (j12 != (-j13) || j13 == 0) {
                            }
                        }
                        break;
                    default:
                        xr xrVar2 = this.b;
                        xrVar2.getClass();
                        TLRPC.Peer peer3 = fjVar.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-xrVar2.Y1)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new aa.l(i21)).collect(Collectors.toCollection(new org.telegram.messenger.jk(1)));
        TLRPC.Chat chat = this.U1;
        wr wrVar3 = this.f2;
        if (!z12) {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.mp.u1(this.a).Z(arrayList3, null, null, -chat.id, this.Z1, false, this.a2);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.mp.u1(this.a).Z(arrayList4, null, null, this.Y1, this.Z1, true, this.a2);
            }
        } else if (!this.z2) {
            wrVar3.b(new rm(this, arrayList3, arrayList4, i22));
        }
        wrVar2.c(new sr(this, i19));
        int i23 = 0;
        while (true) {
            i7 = 2;
            if (i23 >= wrVar.g) {
                break;
            }
            if (wrVar.d[i23] && ((zArr = wrVar.e) == null || zArr[i23])) {
                TLObject tLObject = (TLObject) wrVar.c.get(i23);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.tr
                    public final /* synthetic */ xr b;

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
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                        switch (i7) {
                            case 0:
                                long j11 = this.b.Y1;
                                TLRPC.Peer peer = fjVar.k.peer_id;
                                if ((peer == null || peer.chat_id == (-j11)) && j11 != 0) {
                                }
                                break;
                            case 1:
                                xr xrVar = this.b;
                                xrVar.getClass();
                                TLRPC.Peer peer2 = fjVar.k.peer_id;
                                if (peer2 != null) {
                                    long j12 = peer2.chat_id;
                                    long j13 = xrVar.Y1;
                                    if (j12 != (-j13) || j13 == 0) {
                                    }
                                }
                                break;
                            default:
                                xr xrVar2 = this.b;
                                xrVar2.getClass();
                                TLRPC.Peer peer3 = fjVar.k.peer_id;
                                if (peer3 == null || peer3.chat_id == (-xrVar2.Y1)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new ur(1, tLObject)).map(new aa.l(i21)).collect(Collectors.toCollection(new org.telegram.messenger.jk(1)));
                if (z12 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.mp.n1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.mp.u1(this.a).s1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.mp.k1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.mp.p1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.mp.n1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
            i23++;
        }
        if (this.v2) {
            wrVar3.b(new sr(this, 0));
        } else {
            wrVar3.c(new sr(this, 1));
            this.g2.c(new sr(this, i7));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0);
        if (w02 != this.C2) {
            this.C2 = w02;
            v0(w02);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        fc.e();
    }
}
