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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class es extends sa {
    public static final /* synthetic */ int D0 = 0;
    public boolean A0;
    public boolean B0;
    public float C0;
    public w51 U;
    public final TLRPC.Chat V;
    public final TLRPC.Chat W;
    public final boolean X;
    public final ArrayList Y;
    public final long Z;
    public final int a0;
    public final int b0;
    public final Runnable c0;
    public boolean d0;
    public final boolean e0;
    public final ds f0;
    public final ds g0;
    public final ds h0;
    public final ds i0;
    public final boolean[] j0;
    public final boolean[] k0;
    public final boolean l0;
    public boolean m0;
    public final long n0;
    public TL_communities.ParticipantJoinedChats o0;
    public int[] p0;
    public boolean q0;
    public boolean r0;
    public final TLRPC.TL_chatBannedRights s0;
    public final TLRPC.TL_chatBannedRights t0;
    public final ArrayList u0;
    public boolean v0;
    public final boolean w0;
    public final boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02b2, code lost:
    
        if (r7.send_stickers == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ba, code lost:
    
        if (r7.send_gifs == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02c2, code lost:
    
        if (r7.send_games == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02ca, code lost:
    
        if (r7.send_inline == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02da, code lost:
    
        if (r7.send_plain == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02e2, code lost:
    
        if (r7.send_polls == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02ea, code lost:
    
        if (r7.send_reactions == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02f2, code lost:
    
        if (r7.change_info == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02fa, code lost:
    
        if (r7.invite_users == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0302, code lost:
    
        if (r7.pin_messages == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x030e, code lost:
    
        if (r19.X != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0316, code lost:
    
        if (r7.send_photos == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x031e, code lost:
    
        if (r7.send_videos == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0326, code lost:
    
        if (r7.send_roundvideos == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x032e, code lost:
    
        if (r7.send_audios == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0336, code lost:
    
        if (r7.send_voices == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x033e, code lost:
    
        if (r7.send_docs == false) goto L236;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public es(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j10, int i10, int i11, boolean z4, Runnable runnable) {
        super(p2Var.getContext(), p2Var, false, false, false, false, true, 2, p2Var.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.d0 = false;
        this.q0 = false;
        this.r0 = false;
        this.v0 = true;
        this.y0 = true;
        this.z0 = false;
        this.A0 = false;
        this.C0 = 10.0f;
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        this.y = true;
        fixNavigationBar();
        this.L = true;
        this.x0 = z4;
        sl0 sl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i12, this.D, i12, AndroidUtilities.dp(63.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new as(this, 1));
        this.L = true;
        cs csVar = new cs(this);
        csVar.m = false;
        csVar.C = false;
        csVar.o(nr.h);
        csVar.n(350L);
        this.d.setItemAnimator(csVar);
        this.d.p1();
        ph.d dVar = new ph.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.setText(LocaleController.getString(R.string.DeleteProceedBtn));
        dVar.setOnClickListener(new g0(this, 11));
        this.containerView.addView(dVar, k7.b6.f(48.0f, 87, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f)));
        this.V = chat;
        this.X = ChatObject.isForum(chat);
        this.Y = arrayList;
        this.Z = j10;
        this.a0 = i10;
        this.b0 = i11;
        this.c0 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.s0 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.t0 = tL_chatBannedRights4;
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
        this.f0 = new ds(this, 0, arrayList2);
        this.g0 = new ds(this, 1, arrayList2);
        this.h0 = new ds(this, 3, arrayList2);
        boolean z10 = arrayList2.size() == 1;
        this.w0 = z10;
        this.e0 = ChatObject.isMonoForum(chat);
        if (chat.linked_community_id != 0) {
            this.W = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.linked_community_id));
        }
        if (ChatObject.canUserDoAdminAction(this.W, 2) && ChatObject.canUserDoAdminAction(this.W, 27) && z10) {
            long dialogId = DialogObject.getDialogId((TLObject) arrayList2.get(0));
            this.n0 = dialogId;
            MessagesController.getInstance(this.currentAccount).fetchCommunityJoinedChats(this.W.id, dialogId, new wr(this, 1));
        }
        if (ChatObject.canBlockUsers(chat)) {
            this.j0 = new boolean[arrayList2.size()];
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    break;
                }
                TLRPC.ChannelParticipant channelParticipant = i13 < channelParticipantArr.length ? channelParticipantArr[i13] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.j0[i13] = true;
                }
                i13++;
            }
            this.k0 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.s0;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.X) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i14 = 0;
                while (i14 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i14 < channelParticipantArr.length ? channelParticipantArr[i14] : null;
                    if (!(arrayList2.get(i14) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.s0;
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
                        if (this.j0[i14]) {
                            this.k0[i14] = true;
                            this.l0 = true;
                        }
                    }
                    i14++;
                }
            }
            this.u0 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new org.telegram.ui.n8(3)).collect(Collectors.toCollection(new org.telegram.ui.xf()));
            ds dsVar = new ds(this, 2, arrayList2);
            this.i0 = dsVar;
            boolean[] zArr = this.j0;
            if (dsVar.g != 0) {
                dsVar.e = zArr;
                dsVar.f();
                dsVar.g();
            }
        } else {
            this.i0 = new ds(this, 2, new ArrayList(0));
        }
        this.U.N(false);
        this.e.setTitle(y());
    }

    public static /* synthetic */ void P(es esVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            esVar.p0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(esVar.Y).filter(new bs(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            esVar.q0 = false;
            esVar.r0 = true;
            esVar.O();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(es esVar) {
        Context context;
        boolean z4;
        CharSequence charSequence;
        Context context2 = esVar.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = esVar.resourcesProvider;
        int i10 = esVar.currentAccount;
        long j10 = esVar.n0;
        ArrayList<Long> arrayList = esVar.o0.joined_chat_ids;
        boolean z10 = false;
        as asVar = new as(esVar, 0 == true ? 1 : 0);
        Pattern pattern = z4.a;
        LinearLayout f10 = org.telegram.messenger.y3.f(context2, 1);
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(f10);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Long l10 = arrayList.get(i11);
            i11++;
            Long l11 = l10;
            long longValue = l11.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(l11);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(longValue);
            if (chat != null) {
                dg.v3 v3Var = new dg.v3(context2, f6Var, z10);
                int i12 = size;
                ((TextView) v3Var.d).setText(DialogObject.getName(chat));
                TextView textView = (TextView) v3Var.b;
                if (chatFull != null) {
                    context = context2;
                    z4 = false;
                    charSequence = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
                } else {
                    context = context2;
                    z4 = false;
                    charSequence = null;
                }
                textView.setText(charSequence);
                ((p9) v3Var.c).e(chat, new z8(chat));
                v3Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z4));
                v3Var.setOnClickListener(new lh.r2(d2VarArr, asVar, longValue, 3));
                f10.addView(v3Var, k7.b6.n(-1, -2));
                context2 = context;
                size = i12;
                z10 = false;
            }
        }
        d2VarArr[0] = d2Var;
        d2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.s0;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void T(ArrayList arrayList, ds dsVar) {
        boolean c3 = dsVar.c();
        int i10 = dsVar.g;
        int i11 = dsVar.a;
        if (c3) {
            if (!dsVar.b()) {
                i51 y10 = i51.y(i11, dsVar.b);
                y10.K(dsVar.i > 0);
                arrayList.add(y10);
                return;
            }
            String str = dsVar.b;
            int i12 = dsVar.i;
            if (i12 <= 0) {
                i12 = dsVar.e != null ? dsVar.h : i10;
            }
            String valueOf = String.valueOf(i12);
            i51 i51Var = new i51(36);
            i51Var.d = i11;
            i51Var.l = str;
            i51Var.o = valueOf;
            i51Var.K(dsVar.i > 0);
            i51Var.f = dsVar.f;
            i51Var.D = new w2(13, this, dsVar);
            arrayList.add(i51Var);
            if (dsVar.f) {
                return;
            }
            for (int i13 = 0; i13 < i10; i13++) {
                boolean[] zArr = dsVar.e;
                if (zArr == null || zArr[i13]) {
                    TLObject tLObject = (TLObject) dsVar.c.get(i13);
                    i51 i51Var2 = new i51(37);
                    i51Var2.d = (i11 << 24) | i13;
                    i51Var2.G = tLObject;
                    i51Var2.K(dsVar.d[i13]);
                    i51Var2.i = 1;
                    arrayList.add(i51Var2);
                }
            }
        }
    }

    public final void U() {
        if (this.r0) {
            O();
            return;
        }
        if (this.q0) {
            return;
        }
        this.q0 = true;
        ds dsVar = this.g0;
        int i10 = dsVar.g;
        this.p0 = new int[i10];
        int[] iArr = {i10};
        for (int i11 = 0; i11 < dsVar.g; i11++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInputPeer(this.V);
            tL_messages_search.q = "";
            TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) dsVar.c.get(i11));
            tL_messages_search.from_id = inputPeer;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new nh.b8(this, inputPeer, i11, iArr, 3));
        }
    }

    public final void V() {
        boolean z4 = this.d0;
        ds dsVar = this.i0;
        if (z4 && dsVar.c()) {
            this.B0 = dsVar.i > 0;
        }
        if (this.d0 && dsVar.c() && dsVar.i == 0) {
            dsVar.d();
        } else if (!this.d0 && dsVar.c()) {
            if (this.B0 != (dsVar.i > 0)) {
                dsVar.d();
            }
        }
        if (this.d0 || !dsVar.c()) {
            return;
        }
        this.B0 = dsVar.i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04b0  */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v40, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v25, types: [org.telegram.messenger.MessagesController] */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.messenger.MessagesController] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z4) {
        final int i10;
        long j10;
        boolean[] zArr;
        boolean[] zArr2;
        ?? r62;
        boolean[] zArr3;
        boolean[] zArr4;
        long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j12;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        long j13;
        boolean z10;
        String str;
        final int i11 = 2;
        long j14 = this.n0;
        boolean z11 = true;
        if (z4 && this.m0 && (participantJoinedChats = this.o0) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            int i12 = this.currentAccount;
            ArrayList<Long> arrayList = this.o0.creator_chat_ids;
            as asVar = new as(this, i11);
            xr xrVar = new xr(this, 0);
            Pattern pattern = z4.a;
            LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
            org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            String string = LocaleController.getString(R.string.CommunityBanWarningTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i12, j14)));
            alertDialog$Builder.k(LocaleController.getString(R.string.Ban), new t(xrVar, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.n(f10);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Long l10 = arrayList.get(i13);
                int i14 = i13 + 1;
                Long l11 = l10;
                long longValue = l11.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(l11);
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(longValue);
                if (chat == null) {
                    i13 = i14;
                } else {
                    dg.v3 v3Var = new dg.v3(context, f6Var, z11);
                    int i15 = size;
                    ((TextView) v3Var.d).setText(DialogObject.getName(chat));
                    ?? r12 = (TextView) v3Var.b;
                    if (chatFull != null) {
                        int i16 = chatFull.participants_count;
                        j13 = longValue;
                        z10 = false;
                        str = LocaleController.formatPluralString("Members", i16, new Object[0]);
                    } else {
                        j13 = longValue;
                        z10 = false;
                        str = null;
                    }
                    r12.setText(str);
                    ((p9) v3Var.c).e(chat, new z8(chat));
                    v3Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z10));
                    ?? r13 = f10;
                    v3Var.setOnClickListener(new lh.r2(d2VarArr, asVar, j13, 2));
                    r13.addView(v3Var, k7.b6.n(-1, -2));
                    i13 = i14;
                    f10 = r13;
                    size = i15;
                    z11 = true;
                }
            }
            d2VarArr[0] = d2Var;
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.c0;
        if (runnable != null) {
            runnable.run();
        }
        ds dsVar = this.f0;
        String str2 = dsVar.i > 0 ? "" + LocaleController.formatPluralString("UsersReported", dsVar.i, new Object[0]) : "";
        ds dsVar2 = this.i0;
        if (dsVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = vh.v2.k(str2, "\n");
            }
            if (this.d0) {
                StringBuilder l12 = e2.c.l(str2);
                l12.append(LocaleController.formatPluralString("UsersRestricted", dsVar2.i, new Object[0]));
                str2 = l12.toString();
            } else {
                StringBuilder l13 = e2.c.l(str2);
                l13.append(LocaleController.formatPluralString("UsersBanned", dsVar2.i, new Object[0]));
                str2 = l13.toString();
            }
        }
        boolean z12 = this.x0;
        boolean z13 = z12 && !this.z0;
        int i17 = dsVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        if (isEmpty) {
            kh.a2.v(z13 ? R.string.ReactionsDeleted : R.string.MessagesDeleted, qc.a0(p2Var), i17, 36);
        } else {
            qc.a0(p2Var).M(LocaleController.getString(z13 ? R.string.ReactionsDeleted : R.string.MessagesDeleted), str2, i17).j();
        }
        long j15 = 0;
        if (j14 == 0 || !this.m0) {
            i10 = 0;
        } else {
            i10 = 0;
            MessagesController.getInstance(this.currentAccount).toggleCommunityParticipantBanned(this.W.id, this.n0, true, new yr(i10));
        }
        ArrayList arrayList2 = this.Y;
        ArrayList<Integer> arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.zr
            public final /* synthetic */ es b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i18 = i10;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i10) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i18 = i10;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i10) {
                    case 0:
                        long j16 = this.b.Z;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j16)) && j16 != 0) {
                        }
                        break;
                    case 1:
                        es esVar = this.b;
                        esVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j17 = peer2.chat_id;
                            long j18 = esVar.Z;
                            if (j17 != (-j18) || j18 == 0) {
                            }
                        }
                        break;
                    default:
                        es esVar2 = this.b;
                        esVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-esVar2.Z)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new org.telegram.ui.n8(i11)).collect(Collectors.toCollection(new org.telegram.ui.xf()));
        final int i18 = 1;
        ArrayList<Integer> arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.zr
            public final /* synthetic */ es b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i182 = i18;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i18) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i182 = i18;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i18) {
                    case 0:
                        long j16 = this.b.Z;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j16)) && j16 != 0) {
                        }
                        break;
                    case 1:
                        es esVar = this.b;
                        esVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j17 = peer2.chat_id;
                            long j18 = esVar.Z;
                            if (j17 != (-j18) || j18 == 0) {
                            }
                        }
                        break;
                    default:
                        es esVar2 = this.b;
                        esVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-esVar2.Z)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new org.telegram.ui.n8(i11)).collect(Collectors.toCollection(new org.telegram.ui.xf()));
        TLRPC.Chat chat2 = this.V;
        ds dsVar3 = this.g0;
        if (z12) {
            if (!this.A0) {
                int i19 = 0;
                while (i19 < dsVar3.g) {
                    boolean[] zArr5 = dsVar3.e;
                    if (zArr5 == null || zArr5[i19]) {
                        long dialogId = DialogObject.getDialogId((TLObject) dsVar3.c.get(i19));
                        int size2 = arrayList3.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            Integer num = arrayList3.get(i20);
                            i20++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(-chat2.id, dialogId, num.intValue());
                            j15 = j15;
                        }
                        j12 = j15;
                        int size3 = arrayList4.size();
                        int i21 = 0;
                        while (i21 < size3) {
                            Integer num2 = arrayList4.get(i21);
                            i21++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(this.Z, dialogId, num2.intValue());
                        }
                    } else {
                        j12 = j15;
                    }
                    i19++;
                    j15 = j12;
                }
            }
            j10 = j15;
        } else {
            j10 = 0;
            if (!arrayList3.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList3, null, null, -chat2.id, this.a0, false, this.b0);
            }
            if (!arrayList4.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList4, null, null, this.Z, this.a0, true, this.b0);
            }
        }
        for (int i22 = 0; i22 < dsVar2.g; i22++) {
            if (dsVar2.d[i22] && ((zArr4 = dsVar2.e) == null || zArr4[i22])) {
                TLObject tLObject = (TLObject) dsVar2.c.get(i22);
                long j16 = chat2.id;
                if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                    long j17 = chat2.linked_monoforum_id;
                    if (j17 != j10) {
                        j11 = j17;
                        if (!this.d0) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = (TLRPC.TL_chatBannedRights) this.u0.get(i22);
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.t0;
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
                if (!this.d0) {
                }
            }
        }
        for (int i23 = 0; i23 < dsVar.g; i23++) {
            if (dsVar.d[i23] && ((zArr3 = dsVar.e) == null || zArr3[i23])) {
                TLObject tLObject2 = (TLObject) dsVar.c.get(i23);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.zr
                    public final /* synthetic */ es b;

                    {
                        this.b = this;
                    }

                    public /* synthetic */ Predicate and(Predicate predicate) {
                        int i182 = i11;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        switch (i11) {
                        }
                        return Predicate$-CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        int i182 = i11;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        MessageObject messageObject = (MessageObject) obj;
                        switch (i11) {
                            case 0:
                                long j162 = this.b.Z;
                                TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                                if ((peer == null || peer.chat_id == (-j162)) && j162 != 0) {
                                }
                                break;
                            case 1:
                                es esVar = this.b;
                                esVar.getClass();
                                TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                                if (peer2 != null) {
                                    long j172 = peer2.chat_id;
                                    long j18 = esVar.Z;
                                    if (j172 != (-j18) || j18 == 0) {
                                    }
                                }
                                break;
                            default:
                                es esVar2 = this.b;
                                esVar2.getClass();
                                TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                                if (peer3 == null || peer3.chat_id == (-esVar2.Z)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new bs(1, tLObject2)).map(new org.telegram.ui.n8(i11)).collect(Collectors.toCollection(new org.telegram.ui.xf()));
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
        if (this.w0) {
            for (int i24 = 0; i24 < dsVar3.g; i24++) {
                boolean[] zArr6 = dsVar3.e;
                if (zArr6 == null || zArr6[i24]) {
                    TLObject tLObject3 = (TLObject) dsVar3.c.get(i24);
                    if (!this.z0) {
                        r62 = 0;
                    } else if (tLObject3 instanceof TLRPC.User) {
                        r62 = 0;
                        MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject3, null, 0);
                    } else {
                        r62 = 0;
                        r62 = 0;
                        if (tLObject3 instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject3, 0);
                        }
                    }
                    if (this.A0) {
                        if (tLObject3 instanceof TLRPC.User) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject3, r62);
                        } else if (tLObject3 instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, r62, (TLRPC.Chat) tLObject3);
                        }
                    }
                }
            }
            return;
        }
        for (int i25 = 0; i25 < dsVar3.g; i25++) {
            if (dsVar3.d[i25] && ((zArr2 = dsVar3.e) == null || zArr2[i25])) {
                TLObject tLObject4 = (TLObject) dsVar3.c.get(i25);
                if (tLObject4 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject4, null, 0);
                } else if (tLObject4 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject4, 0);
                }
            }
        }
        int i26 = 0;
        while (true) {
            ds dsVar4 = this.h0;
            if (i26 >= dsVar4.g) {
                return;
            }
            if (dsVar4.d[i26] && ((zArr = dsVar4.e) == null || zArr[i26])) {
                TLObject tLObject5 = (TLObject) dsVar4.c.get(i26);
                if (tLObject5 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject5, null);
                } else if (tLObject5 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, null, (TLRPC.Chat) tLObject5);
                }
            }
            i26++;
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f0.a());
        edit.putBoolean("delete_deleteAll", this.g0.a());
        edit.putBoolean("delete_ban", !this.d0 && this.i0.a());
        edit.apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Rect rect = AndroidUtilities.rectTmp2;
        sl0 sl0Var = this.d;
        rect.set(0, 0, sl0Var.getMeasuredWidth(), sl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        sl0Var.setClipBounds(rect);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        ic.e();
    }

    @Override // org.telegram.ui.Components.sa
    public final boolean t(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, this.n.getClassGuid(), true, new wr(this, 0), this.resourcesProvider);
        this.U = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        boolean[] zArr;
        if (this.x0) {
            return this.z0 ? LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll) : this.A0 ? LocaleController.getString(R.string.DeleteReactionOptionsTitleAll) : LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.Y;
        int[] iArr = {arrayList != null ? arrayList.size() : 0};
        if (this.p0 != null && this.r0) {
            int i10 = 0;
            while (true) {
                ds dsVar = this.g0;
                if (i10 >= dsVar.g) {
                    break;
                }
                if (dsVar.d[i10] && ((zArr = dsVar.e) == null || zArr[i10])) {
                    iArr[0] = iArr[0] + this.p0[i10];
                }
                i10++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
