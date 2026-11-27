// default package

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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class me3 extends ny0 {
    public float A2;
    public int B2;
    public l9c S1;
    public final TLRPC.Chat T1;
    public final TLRPC.Chat U1;
    public final boolean V1;
    public final ArrayList W1;
    public final long X1;
    public final int Y1;
    public final int Z1;
    public final Runnable a2;
    public boolean b2;
    public final boolean c2;
    public final le3 d2;
    public final le3 e2;
    public final le3 f2;
    public final le3 g2;
    public final boolean[] h2;
    public final boolean[] i2;
    public final boolean j2;
    public boolean k2;
    public final long l2;
    public TL_communities.ParticipantJoinedChats m2;
    public int[] n2;
    public boolean o2;
    public boolean p2;
    public final TLRPC.TL_chatBannedRights q2;
    public final TLRPC.TL_chatBannedRights r2;
    public final ArrayList s2;
    public boolean t2;
    public final boolean u2;
    public final boolean v2;
    public boolean w2;
    public boolean x2;
    public boolean y2;
    public boolean z2;

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02c3, code lost:
    
        if (r7.send_stickers == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02cb, code lost:
    
        if (r7.send_gifs == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02d3, code lost:
    
        if (r7.send_games == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02db, code lost:
    
        if (r7.send_inline == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02eb, code lost:
    
        if (r7.send_plain == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02f3, code lost:
    
        if (r7.send_polls == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02fb, code lost:
    
        if (r7.send_reactions == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0303, code lost:
    
        if (r7.change_info == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x030b, code lost:
    
        if (r7.invite_users == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0313, code lost:
    
        if (r7.pin_messages == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x031f, code lost:
    
        if (r19.V1 != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0327, code lost:
    
        if (r7.send_photos == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x032f, code lost:
    
        if (r7.send_videos == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0337, code lost:
    
        if (r7.send_roundvideos == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x033f, code lost:
    
        if (r7.send_audios == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0347, code lost:
    
        if (r7.send_voices == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x034f, code lost:
    
        if (r7.send_docs == false) goto L234;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public me3(e eVar, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j, int i, int i2, boolean z, Runnable runnable) {
        super(eVar.getContext(), eVar, false, true, 2, eVar.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.b2 = false;
        this.o2 = false;
        this.p2 = false;
        byte b = 1;
        this.t2 = true;
        this.w2 = true;
        this.x2 = false;
        this.y2 = false;
        this.A2 = 10.0f;
        s0(aob.v0(aob.a7, this.J0));
        this.x1 = true;
        J();
        this.I1 = true;
        this.v2 = z;
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, this.A1, i3, hl.L(63.0f));
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new he3(this, (byte) 4));
        this.I1 = true;
        ke3 ke3Var = new ke3(this);
        ke3Var.m = false;
        ke3Var.C = false;
        ke3Var.o(k43.h);
        ke3Var.n(350L);
        this.n1.setItemAnimator(ke3Var);
        this.n1.s1();
        c51 c51Var = new c51(this.J0, getContext(), true);
        c51Var.f();
        c51Var.setText(ob6.M0(2131751478, null));
        c51Var.setOnClickListener(new r81(this, (byte) 28));
        this.b.addView(c51Var, tre.f(48.0f, -1, 87, hl.L(10.0f) + this.u0, 0, hl.L(10.0f) + this.u0, hl.L(10.0f)));
        this.T1 = chat;
        this.V1 = xc2.c0(chat);
        this.W1 = arrayList;
        this.X1 = j;
        this.Y1 = i;
        this.Z1 = i2;
        this.a2 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.q2 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.r2 = tL_chatBannedRights4;
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
        uc7.s1(this.a);
        this.d2 = new le3(this, 0, arrayList2);
        this.e2 = new le3(this, 1, arrayList2);
        this.f2 = new le3(this, 3, arrayList2);
        boolean z2 = arrayList2.size() == 1;
        this.u2 = z2;
        this.c2 = xc2.p0(chat);
        if (chat.linked_community_id != 0) {
            this.U1 = uc7.s1(this.a).M0(Long.valueOf(chat.linked_community_id));
        }
        byte b2 = 2;
        if (xc2.y(2, this.U1) && xc2.y(27, this.U1) && z2) {
            long d = wf3.d((TLObject) arrayList2.get(0));
            this.l2 = d;
            uc7 s1 = uc7.s1(this.a);
            long j2 = this.U1.id;
            fe3 fe3Var = new fe3(this, b);
            TL_communities.TL_communities_getParticipantJoinedChats tL_communities_getParticipantJoinedChats = new TL_communities.TL_communities_getParticipantJoinedChats();
            tL_communities_getParticipantJoinedChats.community = s1.h1(j2);
            tL_communities_getParticipantJoinedChats.participant = s1.j1(d);
            s1.getConnectionsManager().sendRequestTyped(tL_communities_getParticipantJoinedChats, new ic((byte) 0), new ia7(s1, fe3Var, b2));
        }
        if (xc2.w(2, chat)) {
            this.h2 = new boolean[arrayList2.size()];
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                TLRPC.ChannelParticipant channelParticipant = i4 < channelParticipantArr.length ? channelParticipantArr[i4] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.h2[i4] = true;
                }
                i4++;
            }
            this.i2 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.q2;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.V1) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i5 = 0;
                while (i5 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i5 < channelParticipantArr.length ? channelParticipantArr[i5] : null;
                    if (!(arrayList2.get(i5) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.q2;
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
                        if (this.h2[i5]) {
                            this.i2[i5] = true;
                            this.j2 = true;
                        }
                    }
                    i5++;
                }
            }
            this.s2 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new yz((byte) 7)).collect(Collectors.toCollection(new zl1((byte) 0)));
            le3 le3Var = new le3(this, 2, arrayList2);
            this.g2 = le3Var;
            boolean[] zArr = this.h2;
            if (le3Var.g != 0) {
                le3Var.e = zArr;
                le3Var.h();
                le3Var.i();
            }
        } else {
            this.g2 = new le3(this, 2, new ArrayList(0));
        }
        this.S1.O(false);
        this.o1.setTitle(K0());
    }

    @Override // ny0
    public final boolean F0(View view, float f, float f2) {
        return !(view instanceof ll2);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, this.r1.getClassGuid(), true, new fe3(this, (byte) 0), this.J0);
        this.S1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        boolean[] zArr;
        if (this.v2) {
            return this.x2 ? ob6.M0(2131751488, null) : this.y2 ? ob6.M0(2131751470, null) : ob6.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.W1;
        iArr[0] = arrayList != null ? arrayList.size() : 0;
        int[] iArr2 = this.n2;
        if (iArr2 != null && this.p2) {
            if (!this.u2) {
                int i = 0;
                while (true) {
                    le3 le3Var = this.e2;
                    if (i >= le3Var.g) {
                        break;
                    }
                    if (le3Var.d[i] && ((zArr = le3Var.e) == null || zArr[i])) {
                        iArr[0] = iArr[0] + this.n2[i];
                    }
                    i++;
                }
            } else if (this.x2) {
                for (int i2 : iArr2) {
                    iArr[0] = iArr[0] + i2;
                }
            }
        }
        return ob6.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    public final boolean Z0() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.q2;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void a1(ArrayList arrayList, le3 le3Var) {
        boolean e = le3Var.e();
        int i = le3Var.g;
        byte b = le3Var.a;
        if (e) {
            boolean d = le3Var.d();
            String str = le3Var.b;
            if (!d) {
                b8c z = b8c.z(b, str);
                z.L(le3Var.i > 0);
                arrayList.add(z);
                return;
            }
            int i2 = le3Var.i;
            if (i2 <= 0) {
                i2 = le3Var.e != null ? le3Var.h : i;
            }
            String valueOf = String.valueOf(i2);
            b8c b8cVar = new b8c(36);
            b8cVar.d = b;
            b8cVar.m = str;
            b8cVar.p = valueOf;
            b8cVar.L(le3Var.i > 0);
            b8cVar.f = le3Var.f;
            b8cVar.E = new sb1((Object) this, (Object) le3Var, (byte) 29);
            arrayList.add(b8cVar);
            if (le3Var.f) {
                return;
            }
            for (int i3 = 0; i3 < i; i3++) {
                boolean[] zArr = le3Var.e;
                if (zArr == null || zArr[i3]) {
                    TLObject tLObject = (TLObject) le3Var.c.get(i3);
                    b8c b8cVar2 = new b8c(37);
                    b8cVar2.d = (b << 24) | i3;
                    b8cVar2.H = tLObject;
                    b8cVar2.L(le3Var.d[i3]);
                    b8cVar2.i = 1;
                    arrayList.add(b8cVar2);
                }
            }
        }
    }

    @Override // nx0
    public final void b0() {
        Rect rect = hl.Q;
        d79 d79Var = this.n1;
        rect.set(0, 0, d79Var.getMeasuredWidth(), d79Var.getMeasuredHeight() - hl.L(34.0f));
        d79Var.setClipBounds(rect);
    }

    public final /* synthetic */ void b1(TLObject tLObject, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        byte b = 1;
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            this.n2[i] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(this.W1).filter(new yl1(inputPeer, b)).count());
        }
        int i2 = iArr[0] - 1;
        iArr[0] = i2;
        if (i2 == 0) {
            this.o2 = false;
            this.p2 = true;
            Y0();
        }
    }

    public final void c1() {
        if (this.p2) {
            Y0();
            return;
        }
        if (this.o2) {
            return;
        }
        this.o2 = true;
        le3 le3Var = this.e2;
        int i = le3Var.g;
        this.n2 = new int[i];
        int[] iArr = {i};
        for (int i2 = 0; i2 < le3Var.g; i2++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = uc7.l1(this.T1);
            tL_messages_search.q = "";
            TLRPC.InputPeer k1 = uc7.k1((TLObject) le3Var.c.get(i2));
            tL_messages_search.from_id = k1;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new lh((Object) this, (Object) k1, i2, (Object) iArr, (byte) 3));
        }
    }

    public final void d1() {
        boolean z = this.b2;
        le3 le3Var = this.g2;
        if (z && le3Var.e()) {
            this.z2 = le3Var.i > 0;
        }
        if (this.b2 && le3Var.e() && le3Var.i == 0) {
            le3Var.f();
        } else if (!this.b2 && le3Var.e()) {
            if (this.z2 != (le3Var.i > 0)) {
                le3Var.f();
            }
        }
        if (this.b2 || !le3Var.e()) {
            return;
        }
        this.z2 = le3Var.i > 0;
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        SharedPreferences.Editor edit = uc7.s1(this.a).X3.edit();
        edit.putBoolean("delete_report", this.d2.a());
        edit.putBoolean("delete_deleteAll", this.e2.a());
        edit.putBoolean("delete_ban", !this.b2 && this.g2.a());
        edit.apply();
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e1(boolean z) {
        final byte b;
        le3 le3Var;
        final byte b2;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        int i;
        boolean z2;
        String str;
        byte b3 = 6;
        long j = this.l2;
        boolean z3 = true;
        byte b4 = 0;
        if (z && this.k2 && (participantJoinedChats = this.m2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            vnb vnbVar = this.J0;
            int i2 = this.a;
            ArrayList<Long> arrayList = this.m2.creator_chat_ids;
            he3 he3Var = new he3(this, b3);
            ge3 ge3Var = new ge3(this, b4);
            Pattern pattern = jj.a;
            LinearLayout j2 = uh9.j(context, 1);
            id[] idVarArr = new id[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            String M0 = ob6.M0(2131751920, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.S2(ob6.G(arrayList.size(), "CommunityBanWarningMessage", wf3.r(i2, j)));
            alertDialog$Builder.j(ob6.M0(2131753722, null), new m0(ge3Var, (byte) 13));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.n(j2);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Long l = arrayList.get(i3);
                i3++;
                Long l2 = l;
                id idVar2 = idVar;
                long longValue = l2.longValue();
                TLRPC.Chat M02 = uc7.s1(i2).M0(l2);
                TLRPC.ChatFull N0 = uc7.s1(i2).N0(longValue);
                if (M02 == null) {
                    idVar = idVar2;
                } else {
                    gb0 gb0Var = new gb0(vnbVar, context, z3);
                    ((TextView) gb0Var.c).setText(wf3.l(M02));
                    TextView textView = (TextView) gb0Var.d;
                    if (N0 != null) {
                        i = size;
                        z2 = 0;
                        str = ob6.G(N0.participants_count, "Members", new Object[0]);
                    } else {
                        i = size;
                        z2 = 0;
                        str = null;
                    }
                    textView.setText(str);
                    ((de0) gb0Var.b).f(M02, new rb0(M02));
                    gb0Var.setBackground(aob.L0(z2));
                    gb0Var.setOnClickListener(new dg(idVarArr, he3Var, longValue, (byte) 0));
                    j2.addView(gb0Var, tre.o(-1, -2));
                    idVar = idVar2;
                    b4 = z2;
                    z3 = true;
                    size = i;
                }
            }
            id idVar3 = idVar;
            idVarArr[b4] = idVar3;
            idVar3.show();
            TextView textView2 = (TextView) idVar3.c(-1);
            if (textView2 != null) {
                yob.X(textView2, aob.q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.a2;
        if (runnable != null) {
            runnable.run();
        }
        le3 le3Var2 = this.d2;
        int i4 = le3Var2.i;
        String G = i4 > 0 ? ob6.G(i4, "UsersReported", new Object[0]) : "";
        le3 le3Var3 = this.g2;
        if (le3Var3.i > 0) {
            if (!TextUtils.isEmpty(G)) {
                G = G.concat("\n");
            }
            boolean z4 = this.b2;
            int i5 = le3Var3.i;
            G = z4 ? G.concat(ob6.G(i5, "UsersRestricted", new Object[0])) : G.concat(ob6.G(i5, "UsersBanned", new Object[0]));
        }
        boolean z5 = this.v2;
        boolean z6 = z5 && !this.x2;
        int i6 = le3Var3.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(G);
        e eVar = this.r1;
        if (isEmpty) {
            bs2.v(null, z6 ? 2131746108 : 2131748214, d31.b0(eVar), i6, 36);
        } else {
            d31.b0(eVar).I(i6, ob6.M0(z6 ? 2131746108 : 2131748214, null), G).j();
        }
        if (j == 0 || !this.k2) {
            b = 0;
        } else {
            uc7 s1 = uc7.s1(this.a);
            long j3 = this.U1.id;
            b = 0;
            pp0 pp0Var = new pp0(b);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = s1.h1(j3);
            tL_communities_toggleParticipantBanned.participant = s1.j1(j);
            tL_communities_toggleParticipantBanned.unban = false;
            s1.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new ic((byte) 0), new ky(s1, j3, pp0Var));
        }
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: ie3
            public final /* synthetic */ me3 b;

            {
                this.b = this;
            }

            public final /* synthetic */ Predicate and(Predicate predicate) {
                byte b5 = b;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                byte b5 = b;
                return Predicate$-CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                byte b5 = b;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                byte b5 = b;
                me3 me3Var = this.b;
                r47 r47Var = (r47) obj;
                switch (b5) {
                    case 0:
                        long j4 = me3Var.X1;
                        TLRPC.Peer peer = r47Var.k.peer_id;
                        if ((peer != null && peer.chat_id != (-j4)) || j4 == 0) {
                            break;
                        }
                        break;
                    case 1:
                        TLRPC.Peer peer2 = r47Var.k.peer_id;
                        if (peer2 != null) {
                            long j5 = peer2.chat_id;
                            long j6 = me3Var.X1;
                            if (j5 == (-j6) && j6 != 0) {
                                break;
                            }
                        }
                        break;
                    default:
                        TLRPC.Peer peer3 = r47Var.k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-me3Var.X1)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        }).map(new yz((byte) 6)).collect(Collectors.toCollection(new zl1(b)));
        final byte b5 = 1;
        ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: ie3
            public final /* synthetic */ me3 b;

            {
                this.b = this;
            }

            public final /* synthetic */ Predicate and(Predicate predicate) {
                byte b52 = b5;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                byte b52 = b5;
                return Predicate$-CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                byte b52 = b5;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                byte b52 = b5;
                me3 me3Var = this.b;
                r47 r47Var = (r47) obj;
                switch (b52) {
                    case 0:
                        long j4 = me3Var.X1;
                        TLRPC.Peer peer = r47Var.k.peer_id;
                        if ((peer != null && peer.chat_id != (-j4)) || j4 == 0) {
                            break;
                        }
                        break;
                    case 1:
                        TLRPC.Peer peer2 = r47Var.k.peer_id;
                        if (peer2 != null) {
                            long j5 = peer2.chat_id;
                            long j6 = me3Var.X1;
                            if (j5 == (-j6) && j6 != 0) {
                                break;
                            }
                        }
                        break;
                    default:
                        TLRPC.Peer peer3 = r47Var.k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-me3Var.X1)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        }).map(new yz((byte) 6)).collect(Collectors.toCollection(new zl1((byte) 0)));
        TLRPC.Chat chat = this.T1;
        le3 le3Var4 = this.e2;
        if (z5) {
            if (!this.y2) {
                le3Var4.b(new fu2(this, arrayList3, arrayList4, b3));
            }
            le3Var = le3Var4;
        } else {
            if (arrayList3.isEmpty()) {
                le3Var = le3Var4;
            } else {
                le3Var = le3Var4;
                uc7.s1(this.a).X(arrayList3, null, null, -chat.id, this.Y1, false, this.Z1);
            }
            if (!arrayList4.isEmpty()) {
                uc7.s1(this.a).X(arrayList4, null, null, this.X1, this.Y1, true, this.Z1);
            }
        }
        le3Var3.c(new he3(this, (byte) 3));
        int i7 = 0;
        while (true) {
            b2 = 2;
            if (i7 >= le3Var2.g) {
                break;
            }
            if (le3Var2.d[i7] && ((zArr = le3Var2.e) == null || zArr[i7])) {
                TLObject tLObject = (TLObject) le3Var2.c.get(i7);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: ie3
                    public final /* synthetic */ me3 b;

                    {
                        this.b = this;
                    }

                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        byte b52 = b2;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public final /* synthetic */ Predicate negate() {
                        byte b52 = b2;
                        return Predicate$-CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        byte b52 = b2;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        byte b52 = b2;
                        me3 me3Var = this.b;
                        r47 r47Var = (r47) obj;
                        switch (b52) {
                            case 0:
                                long j4 = me3Var.X1;
                                TLRPC.Peer peer = r47Var.k.peer_id;
                                if ((peer != null && peer.chat_id != (-j4)) || j4 == 0) {
                                    break;
                                }
                                break;
                            case 1:
                                TLRPC.Peer peer2 = r47Var.k.peer_id;
                                if (peer2 != null) {
                                    long j5 = peer2.chat_id;
                                    long j6 = me3Var.X1;
                                    if (j5 == (-j6) && j6 != 0) {
                                        break;
                                    }
                                }
                                break;
                            default:
                                TLRPC.Peer peer3 = r47Var.k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-me3Var.X1)) {
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                }).filter(new yl1(tLObject, b2)).map(new yz((byte) 6)).collect(Collectors.toCollection(new zl1((byte) 0)));
                if (z5 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = uc7.l1(chat);
                    tL_messages_reportReaction.user_id = uc7.s1(this.a).q1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = uc7.i1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = uc7.n1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = uc7.l1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
            i7++;
        }
        if (this.u2) {
            le3Var.b(new he3(this, (byte) 0));
        } else {
            le3Var.c(new he3(this, (byte) 1));
            this.f2.c(new he3(this, b2));
        }
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        int v0 = aob.v0(aob.a7, this.J0);
        if (v0 != this.B2) {
            this.B2 = v0;
            s0(v0);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        v21.e();
    }
}
