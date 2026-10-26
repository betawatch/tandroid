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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rs extends bb {
    public static final /* synthetic */ int H0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public int G0;
    public j71 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean a0;
    public final ArrayList b0;
    public final long c0;
    public final int d0;
    public final int e0;
    public final Runnable f0;
    public boolean g0;
    public final boolean h0;
    public final qs i0;
    public final qs j0;
    public final qs k0;
    public final qs l0;
    public final boolean[] m0;
    public final boolean[] n0;
    public final boolean o0;
    public boolean p0;
    public final long q0;
    public TL_communities.ParticipantJoinedChats r0;
    public int[] s0;
    public boolean t0;
    public boolean u0;
    public final TLRPC.TL_chatBannedRights v0;
    public final TLRPC.TL_chatBannedRights w0;
    public final ArrayList x0;
    public boolean y0;
    public final boolean z0;

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ae, code lost:
    
        if (r7.send_stickers == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b6, code lost:
    
        if (r7.send_gifs == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02be, code lost:
    
        if (r7.send_games == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02c6, code lost:
    
        if (r7.send_inline == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02d6, code lost:
    
        if (r7.send_plain == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02de, code lost:
    
        if (r7.send_polls == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02e6, code lost:
    
        if (r7.send_reactions == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02ee, code lost:
    
        if (r7.change_info == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02f6, code lost:
    
        if (r7.invite_users == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02fe, code lost:
    
        if (r7.pin_messages == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x030a, code lost:
    
        if (r17.a0 != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0312, code lost:
    
        if (r7.send_photos == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x031a, code lost:
    
        if (r7.send_videos == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0322, code lost:
    
        if (r7.send_roundvideos == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x032a, code lost:
    
        if (r7.send_audios == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0332, code lost:
    
        if (r7.send_voices == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x033a, code lost:
    
        if (r7.send_docs == false) goto L236;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rs(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j10, int i10, int i11, boolean z10, Runnable runnable) {
        super(r2Var.getContext(), r2Var, false, true, 2, r2Var.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.g0 = false;
        this.t0 = false;
        this.u0 = false;
        this.y0 = true;
        this.B0 = true;
        this.C0 = false;
        this.D0 = false;
        this.F0 = 10.0f;
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        this.y = true;
        fixNavigationBar();
        this.O = true;
        this.A0 = z10;
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, this.G, i12, AndroidUtilities.dp(63.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new ns(this, 1));
        this.O = true;
        ps psVar = new ps(this);
        psVar.m = false;
        psVar.C = false;
        psVar.o(ds.h);
        psVar.n(350L);
        this.d.setItemAnimator(psVar);
        this.d.u1();
        fi.d dVar = new fi.d(getContext(), this.resourcesProvider, true);
        dVar.f();
        dVar.setText(LocaleController.getString(R.string.DeleteProceedBtn));
        dVar.setOnClickListener(new f0(this, 10));
        this.containerView.addView(dVar, gb1.j(48.0f, 87, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f)));
        this.Y = chat;
        this.a0 = ChatObject.isForum(chat);
        this.b0 = arrayList;
        this.c0 = j10;
        this.d0 = i10;
        this.e0 = i11;
        this.f0 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.v0 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.w0 = tL_chatBannedRights4;
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
        MessagesController.getInstance(this.currentAccount).getMainSettings();
        this.i0 = new qs(this, 0, arrayList2);
        this.j0 = new qs(this, 1, arrayList2);
        this.k0 = new qs(this, 3, arrayList2);
        boolean z11 = arrayList2.size() == 1;
        this.z0 = z11;
        this.h0 = ChatObject.isMonoForum(chat);
        if (chat.linked_community_id != 0) {
            this.Z = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.linked_community_id));
        }
        if (ChatObject.canUserDoAdminAction(this.Z, 2) && ChatObject.canUserDoAdminAction(this.Z, 27) && z11) {
            long dialogId = DialogObject.getDialogId((TLObject) arrayList2.get(0));
            this.q0 = dialogId;
            MessagesController.getInstance(this.currentAccount).fetchCommunityJoinedChats(this.Z.id, dialogId, new ks(this, 1));
        }
        if (ChatObject.canBlockUsers(chat)) {
            this.m0 = new boolean[arrayList2.size()];
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    break;
                }
                TLRPC.ChannelParticipant channelParticipant = i13 < channelParticipantArr.length ? channelParticipantArr[i13] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.m0[i13] = true;
                }
                i13++;
            }
            this.n0 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.v0;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.a0) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i14 = 0;
                while (i14 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i14 < channelParticipantArr.length ? channelParticipantArr[i14] : null;
                    if (!(arrayList2.get(i14) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.v0;
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
                        if (this.m0[i14]) {
                            this.n0[i14] = true;
                            this.o0 = true;
                        }
                    }
                    i14++;
                }
            }
            this.x0 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new k2.g(4)).collect(Collectors.toCollection(new org.telegram.ui.xf()));
            qs qsVar = new qs(this, 2, arrayList2);
            this.l0 = qsVar;
            boolean[] zArr = this.m0;
            if (qsVar.g != 0) {
                qsVar.e = zArr;
                qsVar.f();
                qsVar.g();
            }
        } else {
            this.l0 = new qs(this, 2, new ArrayList(0));
        }
        this.X.O(false);
        this.e.setTitle(y());
    }

    public static /* synthetic */ void P(rs rsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            rsVar.s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(rsVar.b0).filter(new os(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            rsVar.t0 = false;
            rsVar.u0 = true;
            rsVar.O();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(rs rsVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = rsVar.getContext();
        org.telegram.ui.ActionBar.u6 u6Var = rsVar.resourcesProvider;
        int i10 = rsVar.currentAccount;
        long j10 = rsVar.q0;
        ArrayList<Long> arrayList = rsVar.r0.joined_chat_ids;
        boolean z11 = false;
        ns nsVar = new ns(rsVar, 0 == true ? 1 : 0);
        Pattern pattern = g5.a;
        LinearLayout d = org.telegram.messenger.vh.d(context2, 1);
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, u6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.o(d);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Long l4 = arrayList.get(i11);
            i11++;
            Long l10 = l4;
            long longValue = l10.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(l10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(longValue);
            if (chat != null) {
                bi.t1 t1Var = new bi.t1(context2, u6Var, z11);
                int i12 = size;
                ((TextView) t1Var.b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) t1Var.d;
                if (chatFull != null) {
                    context = context2;
                    z10 = false;
                    charSequence = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
                } else {
                    context = context2;
                    z10 = false;
                    charSequence = null;
                }
                textView.setText(charSequence);
                ((y9) t1Var.c).f(chat, new j9(chat));
                t1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(z10));
                t1Var.setOnClickListener(new bi.p3(e2VarArr, nsVar, longValue, 3));
                d.addView(t1Var, gb1.r(-1, -2));
                context2 = context;
                size = i12;
                z11 = z10;
            }
        }
        e2VarArr[z11 ? 1 : 0] = e2Var;
        e2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.v0;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void T(ArrayList arrayList, qs qsVar) {
        boolean c10 = qsVar.c();
        int i10 = qsVar.g;
        int i11 = qsVar.a;
        if (c10) {
            if (!qsVar.b()) {
                t61 z10 = t61.z(i11, qsVar.b);
                z10.L(qsVar.i > 0);
                arrayList.add(z10);
                return;
            }
            String str = qsVar.b;
            int i12 = qsVar.i;
            if (i12 <= 0) {
                i12 = qsVar.e != null ? qsVar.h : i10;
            }
            String valueOf = String.valueOf(i12);
            t61 t61Var = new t61(36);
            t61Var.d = i11;
            t61Var.l = str;
            t61Var.o = valueOf;
            t61Var.L(qsVar.i > 0);
            t61Var.f = qsVar.f;
            t61Var.D = new ga(10, this, qsVar);
            arrayList.add(t61Var);
            if (qsVar.f) {
                return;
            }
            for (int i13 = 0; i13 < i10; i13++) {
                boolean[] zArr = qsVar.e;
                if (zArr == null || zArr[i13]) {
                    TLObject tLObject = (TLObject) qsVar.c.get(i13);
                    t61 t61Var2 = new t61(37);
                    t61Var2.d = (i11 << 24) | i13;
                    t61Var2.G = tLObject;
                    t61Var2.L(qsVar.d[i13]);
                    t61Var2.i = 1;
                    arrayList.add(t61Var2);
                }
            }
        }
    }

    public final void U() {
        if (this.u0) {
            O();
            return;
        }
        if (this.t0) {
            return;
        }
        this.t0 = true;
        qs qsVar = this.j0;
        int i10 = qsVar.g;
        this.s0 = new int[i10];
        int[] iArr = {i10};
        for (int i11 = 0; i11 < qsVar.g; i11++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
            tL_messages_search.q = "";
            TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) qsVar.c.get(i11));
            tL_messages_search.from_id = inputPeer;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new di.q8(this, inputPeer, i11, iArr, 4));
        }
    }

    public final void V() {
        boolean z10 = this.g0;
        qs qsVar = this.l0;
        if (z10 && qsVar.c()) {
            this.E0 = qsVar.i > 0;
        }
        if (this.g0 && qsVar.c() && qsVar.i == 0) {
            qsVar.d();
        } else if (!this.g0 && qsVar.c()) {
            if (this.E0 != (qsVar.i > 0)) {
                qsVar.d();
            }
        }
        if (this.g0 || !qsVar.c()) {
            return;
        }
        this.E0 = qsVar.i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04b4  */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r1v40, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v25, types: [org.telegram.messenger.MessagesController] */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.messenger.MessagesController] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z10) {
        long j10;
        boolean[] zArr;
        boolean[] zArr2;
        ?? r6;
        boolean[] zArr3;
        boolean[] zArr4;
        long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j12;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        ?? r15;
        long j13;
        String str;
        final int i10 = 2;
        long j14 = this.q0;
        boolean z11 = true;
        if (z10 && this.p0 && (participantJoinedChats = this.r0) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
            int i11 = this.currentAccount;
            ArrayList<Long> arrayList = this.r0.creator_chat_ids;
            ns nsVar = new ns(this, i10);
            ls lsVar = new ls(this, 0);
            Pattern pattern = g5.a;
            LinearLayout d = org.telegram.messenger.vh.d(context, 1);
            org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
            String string = LocaleController.getString(R.string.CommunityBanWarningTitle);
            char c10 = 0;
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i11, j14)));
            alertDialog$Builder.k(LocaleController.getString(R.string.Ban), new s(lsVar, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.o(d);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Long l4 = arrayList.get(i12);
                int i13 = i12 + 1;
                Long l10 = l4;
                long longValue = l10.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(l10);
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(longValue);
                if (chat == null) {
                    i12 = i13;
                } else {
                    bi.t1 t1Var = new bi.t1(context, u6Var, z11);
                    int i14 = size;
                    ((TextView) t1Var.b).setText(DialogObject.getName(chat));
                    TextView textView = (TextView) t1Var.d;
                    if (chatFull != null) {
                        int i15 = chatFull.participants_count;
                        int i16 = c10 == true ? 1 : 0;
                        j13 = longValue;
                        str = LocaleController.formatPluralString("Members", i15, new Object[i16]);
                        r15 = i16;
                    } else {
                        r15 = c10 == true ? 1 : 0;
                        j13 = longValue;
                        str = null;
                    }
                    textView.setText(str);
                    ((y9) t1Var.c).f(chat, new j9(chat));
                    t1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(r15));
                    ?? r12 = d;
                    c10 = r15;
                    t1Var.setOnClickListener(new bi.p3(e2VarArr, nsVar, j13, 2));
                    r12.addView(t1Var, gb1.r(-1, -2));
                    i12 = i13;
                    d = r12;
                    size = i14;
                    z11 = true;
                }
            }
            e2VarArr[c10 == true ? 1 : 0] = e2Var;
            e2Var.show();
            TextView textView2 = (TextView) e2Var.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
        qs qsVar = this.i0;
        String str2 = qsVar.i > 0 ? "" + LocaleController.formatPluralString("UsersReported", qsVar.i, new Object[0]) : "";
        qs qsVar2 = this.l0;
        if (qsVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = b10.u(str2, "\n");
            }
            if (this.g0) {
                StringBuilder u10 = a1.g.u(str2);
                u10.append(LocaleController.formatPluralString("UsersRestricted", qsVar2.i, new Object[0]));
                str2 = u10.toString();
            } else {
                StringBuilder u11 = a1.g.u(str2);
                u11.append(LocaleController.formatPluralString("UsersBanned", qsVar2.i, new Object[0]));
                str2 = u11.toString();
            }
        }
        boolean z12 = this.A0;
        boolean z13 = z12 && !this.C0;
        int i17 = qsVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.r2 r2Var = this.n;
        if (isEmpty) {
            org.telegram.messenger.t.q(z13 ? R.string.ReactionsDeleted : R.string.MessagesDeleted, wc.b0(r2Var), i17, 36);
        } else {
            wc.b0(r2Var).M(LocaleController.getString(z13 ? R.string.ReactionsDeleted : R.string.MessagesDeleted), str2, i17).j();
        }
        long j15 = 0;
        if (j14 != 0 && this.p0) {
            MessagesController.getInstance(this.currentAccount).toggleCommunityParticipantBanned(this.Z.id, this.q0, true, new jh.b(1));
        }
        ArrayList arrayList2 = this.b0;
        final int i18 = 0;
        int i19 = 3;
        ArrayList<Integer> arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.ms
            public final /* synthetic */ rs b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i20 = i18;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i18) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i20 = i18;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i18) {
                    case 0:
                        long j16 = this.b.c0;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j16)) && j16 != 0) {
                        }
                        break;
                    case 1:
                        rs rsVar = this.b;
                        rsVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j17 = peer2.chat_id;
                            long j18 = rsVar.c0;
                            if (j17 != (-j18) || j18 == 0) {
                            }
                        }
                        break;
                    default:
                        rs rsVar2 = this.b;
                        rsVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-rsVar2.c0)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new k2.g(i19)).collect(Collectors.toCollection(new org.telegram.ui.xf()));
        final int i20 = 1;
        ArrayList<Integer> arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.ms
            public final /* synthetic */ rs b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i202 = i20;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i20) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i202 = i20;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i20) {
                    case 0:
                        long j16 = this.b.c0;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j16)) && j16 != 0) {
                        }
                        break;
                    case 1:
                        rs rsVar = this.b;
                        rsVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j17 = peer2.chat_id;
                            long j18 = rsVar.c0;
                            if (j17 != (-j18) || j18 == 0) {
                            }
                        }
                        break;
                    default:
                        rs rsVar2 = this.b;
                        rsVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-rsVar2.c0)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new k2.g(i19)).collect(Collectors.toCollection(new org.telegram.ui.xf()));
        TLRPC.Chat chat2 = this.Y;
        qs qsVar3 = this.j0;
        if (z12) {
            if (!this.D0) {
                int i21 = 0;
                while (i21 < qsVar3.g) {
                    boolean[] zArr5 = qsVar3.e;
                    if (zArr5 == null || zArr5[i21]) {
                        long dialogId = DialogObject.getDialogId((TLObject) qsVar3.c.get(i21));
                        int size2 = arrayList3.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            Integer num = arrayList3.get(i22);
                            i22++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(-chat2.id, dialogId, num.intValue());
                            j15 = j15;
                        }
                        j12 = j15;
                        int size3 = arrayList4.size();
                        int i23 = 0;
                        while (i23 < size3) {
                            Integer num2 = arrayList4.get(i23);
                            i23++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(this.c0, dialogId, num2.intValue());
                        }
                    } else {
                        j12 = j15;
                    }
                    i21++;
                    j15 = j12;
                }
            }
            j10 = j15;
        } else {
            j10 = 0;
            if (!arrayList3.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList3, null, null, -chat2.id, this.d0, false, this.e0);
            }
            if (!arrayList4.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList4, null, null, this.c0, this.d0, true, this.e0);
            }
        }
        for (int i24 = 0; i24 < qsVar2.g; i24++) {
            if (qsVar2.d[i24] && ((zArr4 = qsVar2.e) == null || zArr4[i24])) {
                TLObject tLObject = (TLObject) qsVar2.c.get(i24);
                long j16 = chat2.id;
                if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                    long j17 = chat2.linked_monoforum_id;
                    if (j17 != j10) {
                        j11 = j17;
                        if (!this.g0) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = (TLRPC.TL_chatBannedRights) this.x0.get(i24);
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.w0;
                            if (tL_chatBannedRights3 == null) {
                                tL_chatBannedRights = tL_chatBannedRights2;
                            } else if (tL_chatBannedRights2 == null) {
                                tL_chatBannedRights = tL_chatBannedRights3;
                            } else {
                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                                tL_chatBannedRights4.view_messages = tL_chatBannedRights3.view_messages || tL_chatBannedRights2.view_messages;
                                tL_chatBannedRights4.send_messages = tL_chatBannedRights3.send_messages || tL_chatBannedRights2.send_messages;
                                tL_chatBannedRights4.send_media = tL_chatBannedRights3.send_media || tL_chatBannedRights2.send_media;
                                tL_chatBannedRights4.send_stickers = tL_chatBannedRights3.send_stickers || tL_chatBannedRights2.send_stickers;
                                tL_chatBannedRights4.send_gifs = tL_chatBannedRights3.send_gifs || tL_chatBannedRights2.send_gifs;
                                tL_chatBannedRights4.send_games = tL_chatBannedRights3.send_games || tL_chatBannedRights2.send_games;
                                tL_chatBannedRights4.send_inline = tL_chatBannedRights3.send_inline || tL_chatBannedRights2.send_inline;
                                tL_chatBannedRights4.embed_links = tL_chatBannedRights3.embed_links || tL_chatBannedRights2.embed_links;
                                tL_chatBannedRights4.send_polls = tL_chatBannedRights3.send_polls || tL_chatBannedRights2.send_polls;
                                tL_chatBannedRights4.send_reactions = tL_chatBannedRights3.send_reactions || tL_chatBannedRights2.send_reactions;
                                tL_chatBannedRights4.change_info = tL_chatBannedRights3.change_info || tL_chatBannedRights2.change_info;
                                tL_chatBannedRights4.invite_users = tL_chatBannedRights3.invite_users || tL_chatBannedRights2.invite_users;
                                tL_chatBannedRights4.pin_messages = tL_chatBannedRights3.pin_messages || tL_chatBannedRights2.pin_messages;
                                tL_chatBannedRights4.manage_topics = tL_chatBannedRights3.manage_topics || tL_chatBannedRights2.manage_topics;
                                tL_chatBannedRights4.send_photos = tL_chatBannedRights3.send_photos || tL_chatBannedRights2.send_photos;
                                tL_chatBannedRights4.send_videos = tL_chatBannedRights3.send_videos || tL_chatBannedRights2.send_videos;
                                tL_chatBannedRights4.send_roundvideos = tL_chatBannedRights3.send_roundvideos || tL_chatBannedRights2.send_roundvideos;
                                tL_chatBannedRights4.send_audios = tL_chatBannedRights3.send_audios || tL_chatBannedRights2.send_audios;
                                tL_chatBannedRights4.send_voices = tL_chatBannedRights3.send_voices || tL_chatBannedRights2.send_voices;
                                tL_chatBannedRights4.send_docs = tL_chatBannedRights3.send_docs || tL_chatBannedRights2.send_docs;
                                tL_chatBannedRights4.send_plain = tL_chatBannedRights3.send_plain || tL_chatBannedRights2.send_plain;
                                tL_chatBannedRights = tL_chatBannedRights4;
                            }
                            if (tLObject instanceof TLRPC.User) {
                                MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j11, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, this.n);
                            } else if (tLObject instanceof TLRPC.Chat) {
                                MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j11, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, this.n);
                            }
                        } else if (tLObject instanceof TLRPC.User) {
                            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j11, (TLRPC.User) tLObject, (TLRPC.Chat) null, false, false);
                        } else if (tLObject instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j11, (TLRPC.User) null, (TLRPC.Chat) tLObject, false, false);
                        }
                    }
                }
                j11 = j16;
                if (!this.g0) {
                }
            }
        }
        for (int i25 = 0; i25 < qsVar.g; i25++) {
            if (qsVar.d[i25] && ((zArr3 = qsVar.e) == null || zArr3[i25])) {
                TLObject tLObject2 = (TLObject) qsVar.c.get(i25);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.ms
                    public final /* synthetic */ rs b;

                    {
                        this.b = this;
                    }

                    public /* synthetic */ Predicate and(Predicate predicate) {
                        int i202 = i10;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        switch (i10) {
                        }
                        return Predicate$-CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        int i202 = i10;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        MessageObject messageObject = (MessageObject) obj;
                        switch (i10) {
                            case 0:
                                long j162 = this.b.c0;
                                TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                                if ((peer == null || peer.chat_id == (-j162)) && j162 != 0) {
                                }
                                break;
                            case 1:
                                rs rsVar = this.b;
                                rsVar.getClass();
                                TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                                if (peer2 != null) {
                                    long j172 = peer2.chat_id;
                                    long j18 = rsVar.c0;
                                    if (j172 != (-j18) || j18 == 0) {
                                    }
                                }
                                break;
                            default:
                                rs rsVar2 = this.b;
                                rsVar2.getClass();
                                TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                                if (peer3 == null || peer3.chat_id == (-rsVar2.c0)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new os(1, tLObject2)).map(new k2.g(i19)).collect(Collectors.toCollection(new org.telegram.ui.xf()));
                if (z12 && (tLObject2 instanceof TLRPC.User)) {
                    if (arrayList5.size() == 1) {
                        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                        tL_messages_reportReaction.peer = MessagesController.getInputPeer(chat2);
                        tL_messages_reportReaction.user_id = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) tLObject2);
                        tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, null);
                    }
                }
                TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                tL_channels_reportSpam.channel = MessagesController.getInputChannel(chat2);
                if (tLObject2 instanceof TLRPC.User) {
                    tL_channels_reportSpam.participant = MessagesController.getInputPeer((TLRPC.User) tLObject2);
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    tL_channels_reportSpam.participant = MessagesController.getInputPeer((TLRPC.Chat) tLObject2);
                }
                tL_channels_reportSpam.id = arrayList5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_reportSpam, null);
            }
        }
        if (this.z0) {
            for (int i26 = 0; i26 < qsVar3.g; i26++) {
                boolean[] zArr6 = qsVar3.e;
                if (zArr6 == null || zArr6[i26]) {
                    TLObject tLObject3 = (TLObject) qsVar3.c.get(i26);
                    if (!this.C0) {
                        r6 = 0;
                    } else if (tLObject3 instanceof TLRPC.User) {
                        r6 = 0;
                        MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject3, null, 0);
                    } else {
                        r6 = 0;
                        r6 = 0;
                        if (tLObject3 instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject3, 0);
                        }
                    }
                    if (this.D0) {
                        if (tLObject3 instanceof TLRPC.User) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject3, r6);
                        } else if (tLObject3 instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, r6, (TLRPC.Chat) tLObject3);
                        }
                    }
                }
            }
            return;
        }
        for (int i27 = 0; i27 < qsVar3.g; i27++) {
            if (qsVar3.d[i27] && ((zArr2 = qsVar3.e) == null || zArr2[i27])) {
                TLObject tLObject4 = (TLObject) qsVar3.c.get(i27);
                if (tLObject4 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject4, null, 0);
                } else if (tLObject4 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject4, 0);
                }
            }
        }
        int i28 = 0;
        while (true) {
            qs qsVar4 = this.k0;
            if (i28 >= qsVar4.g) {
                return;
            }
            if (qsVar4.d[i28] && ((zArr = qsVar4.e) == null || zArr[i28])) {
                TLObject tLObject5 = (TLObject) qsVar4.c.get(i28);
                if (tLObject5 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject5, null);
                } else if (tLObject5 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, null, (TLRPC.Chat) tLObject5);
                }
            }
            i28++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.i0.a());
        edit.putBoolean("delete_deleteAll", this.j0.a());
        edit.putBoolean("delete_ban", !this.g0 && this.l0.a());
        edit.apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Rect rect = AndroidUtilities.rectTmp2;
        mm0 mm0Var = this.d;
        rect.set(0, 0, mm0Var.getMeasuredWidth(), mm0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        mm0Var.setClipBounds(rect);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7);
        if (themedColor != this.G0) {
            this.G0 = themedColor;
            setBackgroundColor(themedColor);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        qc.e();
    }

    @Override // org.telegram.ui.Components.bb
    public final boolean t(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.z1);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, this.n.getClassGuid(), true, new ks(this, 0), this.resourcesProvider);
        this.X = j71Var;
        j71Var.r = false;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        boolean[] zArr;
        if (this.A0) {
            return this.C0 ? LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll) : this.D0 ? LocaleController.getString(R.string.DeleteReactionOptionsTitleAll) : LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.b0;
        int[] iArr = {arrayList != null ? arrayList.size() : 0};
        if (this.s0 != null && this.u0) {
            int i10 = 0;
            while (true) {
                qs qsVar = this.j0;
                if (i10 >= qsVar.g) {
                    break;
                }
                if (qsVar.d[i10] && ((zArr = qsVar.e) == null || zArr[i10])) {
                    iArr[0] = iArr[0] + this.s0[i10];
                }
                i10++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
