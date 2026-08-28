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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wr extends sa {
    public static final /* synthetic */ int C0 = 0;
    public boolean A0;
    public float B0;
    public z41 T;
    public final TLRPC.Chat U;
    public final TLRPC.Chat V;
    public final boolean W;
    public final ArrayList X;
    public final long Y;
    public final int Z;
    public final int a0;
    public final Runnable b0;
    public boolean c0;
    public final boolean d0;
    public final vr e0;
    public final vr f0;
    public final vr g0;
    public final vr h0;
    public final boolean[] i0;
    public final boolean[] j0;
    public final boolean k0;
    public boolean l0;
    public final long m0;
    public TL_communities.ParticipantJoinedChats n0;
    public int[] o0;
    public boolean p0;
    public boolean q0;
    public final TLRPC.TL_chatBannedRights r0;
    public final TLRPC.TL_chatBannedRights s0;
    public final ArrayList t0;
    public boolean u0;
    public final boolean v0;
    public final boolean w0;
    public boolean x0;
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
    
        if (r19.W != false) goto L236;
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
    public wr(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j10, int i9, int i10, boolean z10, Runnable runnable) {
        super(o2Var.getContext(), o2Var, false, false, false, false, true, 2, o2Var.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.c0 = false;
        this.p0 = false;
        this.q0 = false;
        this.u0 = true;
        this.x0 = true;
        this.y0 = false;
        this.z0 = false;
        this.B0 = 10.0f;
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        this.y = true;
        fixNavigationBar();
        this.K = true;
        this.w0 = z10;
        wk0 wk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i11, this.C, i11, AndroidUtilities.dp(63.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new sr(this, 1));
        this.K = true;
        ur urVar = new ur(this);
        urVar.m = false;
        urVar.C = false;
        urVar.o(gr.h);
        urVar.n(350L);
        this.d.setItemAnimator(urVar);
        this.d.p1();
        kh.d dVar = new kh.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.setText(LocaleController.getString(R.string.DeleteProceedBtn));
        dVar.setOnClickListener(new f0(this, 11));
        this.containerView.addView(dVar, g7.e6.f(48.0f, 87, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f)));
        this.U = chat;
        this.W = ChatObject.isForum(chat);
        this.X = arrayList;
        this.Y = j10;
        this.Z = i9;
        this.a0 = i10;
        this.b0 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.r0 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.s0 = tL_chatBannedRights4;
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
        this.e0 = new vr(this, 0, arrayList2);
        this.f0 = new vr(this, 1, arrayList2);
        this.g0 = new vr(this, 3, arrayList2);
        boolean z11 = arrayList2.size() == 1;
        this.v0 = z11;
        this.d0 = ChatObject.isMonoForum(chat);
        if (chat.linked_community_id != 0) {
            this.V = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.linked_community_id));
        }
        if (ChatObject.canUserDoAdminAction(this.V, 2) && ChatObject.canUserDoAdminAction(this.V, 27) && z11) {
            long dialogId = DialogObject.getDialogId((TLObject) arrayList2.get(0));
            this.m0 = dialogId;
            MessagesController.getInstance(this.currentAccount).fetchCommunityJoinedChats(this.V.id, dialogId, new or(this, 1));
        }
        if (ChatObject.canBlockUsers(chat)) {
            this.i0 = new boolean[arrayList2.size()];
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                TLRPC.ChannelParticipant channelParticipant = i12 < channelParticipantArr.length ? channelParticipantArr[i12] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.i0[i12] = true;
                }
                i12++;
            }
            this.j0 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.r0;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.W) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i13 = 0;
                while (i13 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i13 < channelParticipantArr.length ? channelParticipantArr[i13] : null;
                    if (!(arrayList2.get(i13) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.r0;
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
                        if (this.i0[i13]) {
                            this.j0[i13] = true;
                            this.k0 = true;
                        }
                    }
                    i13++;
                }
            }
            this.t0 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new org.telegram.ui.k8(3)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
            vr vrVar = new vr(this, 2, arrayList2);
            this.h0 = vrVar;
            boolean[] zArr = this.i0;
            if (vrVar.g != 0) {
                vrVar.e = zArr;
                vrVar.f();
                vrVar.g();
            }
        } else {
            this.h0 = new vr(this, 2, new ArrayList(0));
        }
        this.T.N(false);
        this.e.setTitle(y());
    }

    public static /* synthetic */ void O(wr wrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i9, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            wrVar.o0[i9] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(wrVar.X).filter(new tr(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            wrVar.p0 = false;
            wrVar.q0 = true;
            wrVar.N();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void P(wr wrVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = wrVar.getContext();
        org.telegram.ui.ActionBar.b6 b6Var = wrVar.resourcesProvider;
        int i9 = wrVar.currentAccount;
        long j10 = wrVar.m0;
        ArrayList<Long> arrayList = wrVar.n0.joined_chat_ids;
        boolean z11 = false;
        sr srVar = new sr(wrVar, 0 == true ? 1 : 0);
        Pattern pattern = y4.a;
        LinearLayout f10 = org.telegram.messenger.ll.f(context2, 1);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, b6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i9, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(f10);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Long l10 = arrayList.get(i10);
            i10++;
            Long l11 = l10;
            long longValue = l11.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(l11);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(longValue);
            if (chat != null) {
                gh.h1 h1Var = new gh.h1(context2, b6Var, z11);
                int i11 = size;
                ((TextView) h1Var.b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) h1Var.d;
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
                ((o9) h1Var.c).e(chat, new z8(chat));
                h1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(z10));
                h1Var.setOnClickListener(new gh.s2(c2VarArr, srVar, longValue, 3));
                f10.addView(h1Var, g7.e6.n(-1, -2));
                context2 = context;
                size = i11;
                z11 = false;
            }
        }
        c2VarArr[0] = c2Var;
        c2Var.show();
    }

    public final boolean R() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.r0;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void S(ArrayList arrayList, vr vrVar) {
        boolean c10 = vrVar.c();
        int i9 = vrVar.g;
        int i10 = vrVar.a;
        if (c10) {
            if (!vrVar.b()) {
                l41 y10 = l41.y(i10, vrVar.b);
                y10.K(vrVar.i > 0);
                arrayList.add(y10);
                return;
            }
            String str = vrVar.b;
            int i11 = vrVar.i;
            if (i11 <= 0) {
                i11 = vrVar.e != null ? vrVar.h : i9;
            }
            String valueOf = String.valueOf(i11);
            l41 l41Var = new l41(36);
            l41Var.d = i10;
            l41Var.l = str;
            l41Var.o = valueOf;
            l41Var.K(vrVar.i > 0);
            l41Var.f = vrVar.f;
            l41Var.D = new s2(15, this, vrVar);
            arrayList.add(l41Var);
            if (vrVar.f) {
                return;
            }
            for (int i12 = 0; i12 < i9; i12++) {
                boolean[] zArr = vrVar.e;
                if (zArr == null || zArr[i12]) {
                    TLObject tLObject = (TLObject) vrVar.c.get(i12);
                    l41 l41Var2 = new l41(37);
                    l41Var2.d = (i10 << 24) | i12;
                    l41Var2.G = tLObject;
                    l41Var2.K(vrVar.d[i12]);
                    l41Var2.i = 1;
                    arrayList.add(l41Var2);
                }
            }
        }
    }

    public final void T() {
        if (this.q0) {
            N();
            return;
        }
        if (this.p0) {
            return;
        }
        this.p0 = true;
        vr vrVar = this.f0;
        int i9 = vrVar.g;
        this.o0 = new int[i9];
        int[] iArr = {i9};
        for (int i10 = 0; i10 < vrVar.g; i10++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInputPeer(this.U);
            tL_messages_search.q = "";
            TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) vrVar.c.get(i10));
            tL_messages_search.from_id = inputPeer;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new ih.f8(this, inputPeer, i10, iArr, 4));
        }
    }

    public final void U() {
        boolean z10 = this.c0;
        vr vrVar = this.h0;
        if (z10 && vrVar.c()) {
            this.A0 = vrVar.i > 0;
        }
        if (this.c0 && vrVar.c() && vrVar.i == 0) {
            vrVar.d();
        } else if (!this.c0 && vrVar.c()) {
            if (this.A0 != (vrVar.i > 0)) {
                vrVar.d();
            }
        }
        if (this.c0 || !vrVar.c()) {
            return;
        }
        this.A0 = vrVar.i > 0;
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
    public final void V(boolean z10) {
        final int i9;
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
        boolean z11;
        String str;
        final int i10 = 2;
        long j14 = this.m0;
        boolean z12 = true;
        if (z10 && this.l0 && (participantJoinedChats = this.n0) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
            int i11 = this.currentAccount;
            ArrayList<Long> arrayList = this.n0.creator_chat_ids;
            sr srVar = new sr(this, i10);
            pr prVar = new pr(this, 0);
            Pattern pattern = y4.a;
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
            org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
            String string = LocaleController.getString(R.string.CommunityBanWarningTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i11, j14)));
            alertDialog$Builder.k(LocaleController.getString(R.string.Ban), new s(prVar, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.n(f10);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Long l10 = arrayList.get(i12);
                int i13 = i12 + 1;
                Long l11 = l10;
                long longValue = l11.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(l11);
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(longValue);
                if (chat == null) {
                    i12 = i13;
                } else {
                    gh.h1 h1Var = new gh.h1(context, b6Var, z12);
                    int i14 = size;
                    ((TextView) h1Var.b).setText(DialogObject.getName(chat));
                    ?? r12 = (TextView) h1Var.d;
                    if (chatFull != null) {
                        int i15 = chatFull.participants_count;
                        j13 = longValue;
                        z11 = false;
                        str = LocaleController.formatPluralString("Members", i15, new Object[0]);
                    } else {
                        j13 = longValue;
                        z11 = false;
                        str = null;
                    }
                    r12.setText(str);
                    ((o9) h1Var.c).e(chat, new z8(chat));
                    h1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(z11));
                    ?? r13 = f10;
                    h1Var.setOnClickListener(new gh.s2(c2VarArr, srVar, j13, 2));
                    r13.addView(h1Var, g7.e6.n(-1, -2));
                    i12 = i13;
                    f10 = r13;
                    size = i14;
                    z12 = true;
                }
            }
            c2VarArr[0] = c2Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.b0;
        if (runnable != null) {
            runnable.run();
        }
        vr vrVar = this.e0;
        String str2 = vrVar.i > 0 ? "" + LocaleController.formatPluralString("UsersReported", vrVar.i, new Object[0]) : "";
        vr vrVar2 = this.h0;
        if (vrVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = ta.b.j(str2, "\n");
            }
            if (this.c0) {
                StringBuilder n10 = e2.c.n(str2);
                n10.append(LocaleController.formatPluralString("UsersRestricted", vrVar2.i, new Object[0]));
                str2 = n10.toString();
            } else {
                StringBuilder n11 = e2.c.n(str2);
                n11.append(LocaleController.formatPluralString("UsersBanned", vrVar2.i, new Object[0]));
                str2 = n11.toString();
            }
        }
        boolean z13 = this.w0;
        boolean z14 = z13 && !this.y0;
        int i16 = vrVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        if (isEmpty) {
            org.telegram.messenger.l0.p(z14 ? R.string.ReactionsDeleted : R.string.MessagesDeleted, oc.a0(o2Var), i16, 36);
        } else {
            oc.a0(o2Var).M(LocaleController.getString(z14 ? R.string.ReactionsDeleted : R.string.MessagesDeleted), str2, i16).j();
        }
        long j15 = 0;
        if (j14 == 0 || !this.l0) {
            i9 = 0;
        } else {
            i9 = 0;
            MessagesController.getInstance(this.currentAccount).toggleCommunityParticipantBanned(this.V.id, this.m0, true, new qr(i9));
        }
        ArrayList arrayList2 = this.X;
        ArrayList<Integer> arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.rr
            public final /* synthetic */ wr b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i17 = i9;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i9) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i17 = i9;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i9) {
                    case 0:
                        long j16 = this.b.Y;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j16)) && j16 != 0) {
                        }
                        break;
                    case 1:
                        wr wrVar = this.b;
                        wrVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j17 = peer2.chat_id;
                            long j18 = wrVar.Y;
                            if (j17 != (-j18) || j18 == 0) {
                            }
                        }
                        break;
                    default:
                        wr wrVar2 = this.b;
                        wrVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-wrVar2.Y)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new org.telegram.ui.k8(i10)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
        final int i17 = 1;
        ArrayList<Integer> arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.rr
            public final /* synthetic */ wr b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i172 = i17;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i17) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i172 = i17;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i17) {
                    case 0:
                        long j16 = this.b.Y;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j16)) && j16 != 0) {
                        }
                        break;
                    case 1:
                        wr wrVar = this.b;
                        wrVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j17 = peer2.chat_id;
                            long j18 = wrVar.Y;
                            if (j17 != (-j18) || j18 == 0) {
                            }
                        }
                        break;
                    default:
                        wr wrVar2 = this.b;
                        wrVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-wrVar2.Y)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new org.telegram.ui.k8(i10)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
        TLRPC.Chat chat2 = this.U;
        vr vrVar3 = this.f0;
        if (z13) {
            if (!this.z0) {
                int i18 = 0;
                while (i18 < vrVar3.g) {
                    boolean[] zArr5 = vrVar3.e;
                    if (zArr5 == null || zArr5[i18]) {
                        long dialogId = DialogObject.getDialogId((TLObject) vrVar3.c.get(i18));
                        int size2 = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            Integer num = arrayList3.get(i19);
                            i19++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(-chat2.id, dialogId, num.intValue());
                            j15 = j15;
                        }
                        j12 = j15;
                        int size3 = arrayList4.size();
                        int i20 = 0;
                        while (i20 < size3) {
                            Integer num2 = arrayList4.get(i20);
                            i20++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(this.Y, dialogId, num2.intValue());
                        }
                    } else {
                        j12 = j15;
                    }
                    i18++;
                    j15 = j12;
                }
            }
            j10 = j15;
        } else {
            j10 = 0;
            if (!arrayList3.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList3, null, null, -chat2.id, this.Z, false, this.a0);
            }
            if (!arrayList4.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList4, null, null, this.Y, this.Z, true, this.a0);
            }
        }
        for (int i21 = 0; i21 < vrVar2.g; i21++) {
            if (vrVar2.d[i21] && ((zArr4 = vrVar2.e) == null || zArr4[i21])) {
                TLObject tLObject = (TLObject) vrVar2.c.get(i21);
                long j16 = chat2.id;
                if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                    long j17 = chat2.linked_monoforum_id;
                    if (j17 != j10) {
                        j11 = j17;
                        if (!this.c0) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = (TLRPC.TL_chatBannedRights) this.t0.get(i21);
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.s0;
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
                if (!this.c0) {
                }
            }
        }
        for (int i22 = 0; i22 < vrVar.g; i22++) {
            if (vrVar.d[i22] && ((zArr3 = vrVar.e) == null || zArr3[i22])) {
                TLObject tLObject2 = (TLObject) vrVar.c.get(i22);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.rr
                    public final /* synthetic */ wr b;

                    {
                        this.b = this;
                    }

                    public /* synthetic */ Predicate and(Predicate predicate) {
                        int i172 = i10;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        switch (i10) {
                        }
                        return Predicate$-CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        int i172 = i10;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        MessageObject messageObject = (MessageObject) obj;
                        switch (i10) {
                            case 0:
                                long j162 = this.b.Y;
                                TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                                if ((peer == null || peer.chat_id == (-j162)) && j162 != 0) {
                                }
                                break;
                            case 1:
                                wr wrVar = this.b;
                                wrVar.getClass();
                                TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                                if (peer2 != null) {
                                    long j172 = peer2.chat_id;
                                    long j18 = wrVar.Y;
                                    if (j172 != (-j18) || j18 == 0) {
                                    }
                                }
                                break;
                            default:
                                wr wrVar2 = this.b;
                                wrVar2.getClass();
                                TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                                if (peer3 == null || peer3.chat_id == (-wrVar2.Y)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new tr(1, tLObject2)).map(new org.telegram.ui.k8(i10)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
                if (z13 && (tLObject2 instanceof TLRPC.User)) {
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
        if (this.v0) {
            for (int i23 = 0; i23 < vrVar3.g; i23++) {
                boolean[] zArr6 = vrVar3.e;
                if (zArr6 == null || zArr6[i23]) {
                    TLObject tLObject3 = (TLObject) vrVar3.c.get(i23);
                    if (!this.y0) {
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
                    if (this.z0) {
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
        for (int i24 = 0; i24 < vrVar3.g; i24++) {
            if (vrVar3.d[i24] && ((zArr2 = vrVar3.e) == null || zArr2[i24])) {
                TLObject tLObject4 = (TLObject) vrVar3.c.get(i24);
                if (tLObject4 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject4, null, 0);
                } else if (tLObject4 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject4, 0);
                }
            }
        }
        int i25 = 0;
        while (true) {
            vr vrVar4 = this.g0;
            if (i25 >= vrVar4.g) {
                return;
            }
            if (vrVar4.d[i25] && ((zArr = vrVar4.e) == null || zArr[i25])) {
                TLObject tLObject5 = (TLObject) vrVar4.c.get(i25);
                if (tLObject5 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject5, null);
                } else if (tLObject5 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, null, (TLRPC.Chat) tLObject5);
                }
            }
            i25++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.e0.a());
        edit.putBoolean("delete_deleteAll", this.f0.a());
        edit.putBoolean("delete_ban", !this.c0 && this.h0.a());
        edit.apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerLayout(int i9, int i10, int i11, int i12) {
        super.onContainerLayout(i9, i10, i11, i12);
        Rect rect = AndroidUtilities.rectTmp2;
        wk0 wk0Var = this.d;
        rect.set(0, 0, wk0Var.getMeasuredWidth(), wk0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        wk0Var.setClipBounds(rect);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        gc.e();
    }

    @Override // org.telegram.ui.Components.sa
    public final boolean t(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, this.n.getClassGuid(), true, new or(this, 0), this.resourcesProvider);
        this.T = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        boolean[] zArr;
        if (this.w0) {
            return this.y0 ? LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll) : this.z0 ? LocaleController.getString(R.string.DeleteReactionOptionsTitleAll) : LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.X;
        int[] iArr = {arrayList != null ? arrayList.size() : 0};
        if (this.o0 != null && this.q0) {
            int i9 = 0;
            while (true) {
                vr vrVar = this.f0;
                if (i9 >= vrVar.g) {
                    break;
                }
                if (vrVar.d[i9] && ((zArr = vrVar.e) == null || zArr[i9])) {
                    iArr[0] = iArr[0] + this.o0[i9];
                }
                i9++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
