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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class as extends xa {
    public static final /* synthetic */ int C0 = 0;
    public boolean A0;
    public float B0;
    public k51 T;
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
    public final zr e0;
    public final zr f0;
    public final zr g0;
    public final zr h0;
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
    public as(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j10, int i10, int i11, boolean z10, Runnable runnable) {
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
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        this.y = true;
        fixNavigationBar();
        this.K = true;
        this.w0 = z10;
        jl0 jl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i12, this.C, i12, AndroidUtilities.dp(63.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new wr(this, 1));
        this.K = true;
        yr yrVar = new yr(this);
        yrVar.m = false;
        yrVar.C = false;
        yrVar.o(jr.h);
        yrVar.n(350L);
        this.d.setItemAnimator(yrVar);
        this.d.p1();
        nh.d dVar = new nh.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.setText(LocaleController.getString(R.string.DeleteProceedBtn));
        dVar.setOnClickListener(new h0(this, 11));
        this.containerView.addView(dVar, i7.f6.f(48.0f, 87, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f)));
        this.U = chat;
        this.W = ChatObject.isForum(chat);
        this.X = arrayList;
        this.Y = j10;
        this.Z = i10;
        this.a0 = i11;
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
        this.e0 = new zr(this, 0, arrayList2);
        this.f0 = new zr(this, 1, arrayList2);
        this.g0 = new zr(this, 3, arrayList2);
        boolean z11 = arrayList2.size() == 1;
        this.v0 = z11;
        this.d0 = ChatObject.isMonoForum(chat);
        if (chat.linked_community_id != 0) {
            this.V = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.linked_community_id));
        }
        if (ChatObject.canUserDoAdminAction(this.V, 2) && ChatObject.canUserDoAdminAction(this.V, 27) && z11) {
            long dialogId = DialogObject.getDialogId((TLObject) arrayList2.get(0));
            this.m0 = dialogId;
            MessagesController.getInstance(this.currentAccount).fetchCommunityJoinedChats(this.V.id, dialogId, new sr(this, 1));
        }
        if (ChatObject.canBlockUsers(chat)) {
            this.i0 = new boolean[arrayList2.size()];
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    break;
                }
                TLRPC.ChannelParticipant channelParticipant = i13 < channelParticipantArr.length ? channelParticipantArr[i13] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.i0[i13] = true;
                }
                i13++;
            }
            this.j0 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.r0;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.W) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i14 = 0;
                while (i14 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i14 < channelParticipantArr.length ? channelParticipantArr[i14] : null;
                    if (!(arrayList2.get(i14) instanceof TLRPC.Chat)) {
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
                        if (this.i0[i14]) {
                            this.j0[i14] = true;
                            this.k0 = true;
                        }
                    }
                    i14++;
                }
            }
            this.t0 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new org.telegram.ui.j8(3)).collect(Collectors.toCollection(new org.telegram.ui.qf()));
            zr zrVar = new zr(this, 2, arrayList2);
            this.h0 = zrVar;
            boolean[] zArr = this.i0;
            if (zrVar.g != 0) {
                zrVar.e = zArr;
                zrVar.f();
                zrVar.g();
            }
        } else {
            this.h0 = new zr(this, 2, new ArrayList(0));
        }
        this.T.N(false);
        this.e.setTitle(y());
    }

    public static /* synthetic */ void P(as asVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            asVar.o0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(asVar.X).filter(new xr(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            asVar.p0 = false;
            asVar.q0 = true;
            asVar.O();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(as asVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = asVar.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = asVar.resourcesProvider;
        int i10 = asVar.currentAccount;
        long j10 = asVar.m0;
        ArrayList<Long> arrayList = asVar.n0.joined_chat_ids;
        boolean z11 = false;
        wr wrVar = new wr(asVar, 0 == true ? 1 : 0);
        Pattern pattern = c5.a;
        LinearLayout g10 = org.telegram.messenger.x3.g(context2, 1);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, c6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(g10);
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
                bg.z3 z3Var = new bg.z3(context2, c6Var, z11);
                int i12 = size;
                ((TextView) z3Var.d).setText(DialogObject.getName(chat));
                TextView textView = (TextView) z3Var.b;
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
                ((t9) z3Var.c).e(chat, new e9(chat));
                z3Var.setBackground(org.telegram.ui.ActionBar.g6.K0(z10));
                z3Var.setOnClickListener(new jh.q2(c2VarArr, wrVar, longValue, 3));
                g10.addView(z3Var, i7.f6.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        c2VarArr[0] = c2Var;
        c2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.r0;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void T(ArrayList arrayList, zr zrVar) {
        boolean c3 = zrVar.c();
        int i10 = zrVar.g;
        int i11 = zrVar.a;
        if (c3) {
            if (!zrVar.b()) {
                w41 y8 = w41.y(i11, zrVar.b);
                y8.K(zrVar.i > 0);
                arrayList.add(y8);
                return;
            }
            String str = zrVar.b;
            int i12 = zrVar.i;
            if (i12 <= 0) {
                i12 = zrVar.e != null ? zrVar.h : i10;
            }
            String valueOf = String.valueOf(i12);
            w41 w41Var = new w41(36);
            w41Var.d = i11;
            w41Var.l = str;
            w41Var.o = valueOf;
            w41Var.K(zrVar.i > 0);
            w41Var.f = zrVar.f;
            w41Var.D = new t2(16, this, zrVar);
            arrayList.add(w41Var);
            if (zrVar.f) {
                return;
            }
            for (int i13 = 0; i13 < i10; i13++) {
                boolean[] zArr = zrVar.e;
                if (zArr == null || zArr[i13]) {
                    TLObject tLObject = (TLObject) zrVar.c.get(i13);
                    w41 w41Var2 = new w41(37);
                    w41Var2.d = (i11 << 24) | i13;
                    w41Var2.G = tLObject;
                    w41Var2.K(zrVar.d[i13]);
                    w41Var2.i = 1;
                    arrayList.add(w41Var2);
                }
            }
        }
    }

    public final void U() {
        if (this.q0) {
            O();
            return;
        }
        if (this.p0) {
            return;
        }
        this.p0 = true;
        zr zrVar = this.f0;
        int i10 = zrVar.g;
        this.o0 = new int[i10];
        int[] iArr = {i10};
        for (int i11 = 0; i11 < zrVar.g; i11++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInputPeer(this.U);
            tL_messages_search.q = "";
            TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) zrVar.c.get(i11));
            tL_messages_search.from_id = inputPeer;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new lh.b8(this, inputPeer, i11, iArr, 3));
        }
    }

    public final void V() {
        boolean z10 = this.c0;
        zr zrVar = this.h0;
        if (z10 && zrVar.c()) {
            this.A0 = zrVar.i > 0;
        }
        if (this.c0 && zrVar.c() && zrVar.i == 0) {
            zrVar.d();
        } else if (!this.c0 && zrVar.c()) {
            if (this.A0 != (zrVar.i > 0)) {
                zrVar.d();
            }
        }
        if (this.c0 || !zrVar.c()) {
            return;
        }
        this.A0 = zrVar.i > 0;
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
    public final void W(boolean z10) {
        final int i10;
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
        long j13;
        boolean z11;
        String str;
        final int i11 = 2;
        long j14 = this.m0;
        boolean z12 = true;
        if (z10 && this.l0 && (participantJoinedChats = this.n0) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            int i12 = this.currentAccount;
            ArrayList<Long> arrayList = this.n0.creator_chat_ids;
            wr wrVar = new wr(this, i11);
            tr trVar = new tr(this, 0);
            Pattern pattern = c5.a;
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
            org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            String string = LocaleController.getString(R.string.CommunityBanWarningTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i12, j14)));
            alertDialog$Builder.k(LocaleController.getString(R.string.Ban), new u(trVar, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.n(g10);
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
                    bg.z3 z3Var = new bg.z3(context, c6Var, z12);
                    int i15 = size;
                    ((TextView) z3Var.d).setText(DialogObject.getName(chat));
                    ?? r12 = (TextView) z3Var.b;
                    if (chatFull != null) {
                        int i16 = chatFull.participants_count;
                        j13 = longValue;
                        z11 = false;
                        str = LocaleController.formatPluralString("Members", i16, new Object[0]);
                    } else {
                        j13 = longValue;
                        z11 = false;
                        str = null;
                    }
                    r12.setText(str);
                    ((t9) z3Var.c).e(chat, new e9(chat));
                    z3Var.setBackground(org.telegram.ui.ActionBar.g6.K0(z11));
                    ?? r13 = g10;
                    z3Var.setOnClickListener(new jh.q2(c2VarArr, wrVar, j13, 2));
                    r13.addView(z3Var, i7.f6.n(-1, -2));
                    i13 = i14;
                    g10 = r13;
                    size = i15;
                    z12 = true;
                }
            }
            c2VarArr[0] = c2Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.b0;
        if (runnable != null) {
            runnable.run();
        }
        zr zrVar = this.e0;
        String str2 = zrVar.i > 0 ? "" + LocaleController.formatPluralString("UsersReported", zrVar.i, new Object[0]) : "";
        zr zrVar2 = this.h0;
        if (zrVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = u3.c.k(str2, "\n");
            }
            if (this.c0) {
                StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str2);
                n10.append(LocaleController.formatPluralString("UsersRestricted", zrVar2.i, new Object[0]));
                str2 = n10.toString();
            } else {
                StringBuilder n11 = com.google.android.recaptcha.internal.a.n(str2);
                n11.append(LocaleController.formatPluralString("UsersBanned", zrVar2.i, new Object[0]));
                str2 = n11.toString();
            }
        }
        boolean z13 = this.w0;
        boolean z14 = z13 && !this.y0;
        int i17 = zrVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        if (isEmpty) {
            j7.l1.v(z14 ? R.string.ReactionsDeleted : R.string.MessagesDeleted, tc.a0(o2Var), i17, 36);
        } else {
            tc.a0(o2Var).M(LocaleController.getString(z14 ? R.string.ReactionsDeleted : R.string.MessagesDeleted), str2, i17).j();
        }
        long j15 = 0;
        if (j14 == 0 || !this.l0) {
            i10 = 0;
        } else {
            i10 = 0;
            MessagesController.getInstance(this.currentAccount).toggleCommunityParticipantBanned(this.V.id, this.m0, true, new ur(i10));
        }
        ArrayList arrayList2 = this.X;
        ArrayList<Integer> arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.vr
            public final /* synthetic */ as b;

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
                        long j16 = this.b.Y;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j16)) && j16 != 0) {
                        }
                        break;
                    case 1:
                        as asVar = this.b;
                        asVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j17 = peer2.chat_id;
                            long j18 = asVar.Y;
                            if (j17 != (-j18) || j18 == 0) {
                            }
                        }
                        break;
                    default:
                        as asVar2 = this.b;
                        asVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-asVar2.Y)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new org.telegram.ui.j8(i11)).collect(Collectors.toCollection(new org.telegram.ui.qf()));
        final int i18 = 1;
        ArrayList<Integer> arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.vr
            public final /* synthetic */ as b;

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
                        long j16 = this.b.Y;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j16)) && j16 != 0) {
                        }
                        break;
                    case 1:
                        as asVar = this.b;
                        asVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j17 = peer2.chat_id;
                            long j18 = asVar.Y;
                            if (j17 != (-j18) || j18 == 0) {
                            }
                        }
                        break;
                    default:
                        as asVar2 = this.b;
                        asVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-asVar2.Y)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new org.telegram.ui.j8(i11)).collect(Collectors.toCollection(new org.telegram.ui.qf()));
        TLRPC.Chat chat2 = this.U;
        zr zrVar3 = this.f0;
        if (z13) {
            if (!this.z0) {
                int i19 = 0;
                while (i19 < zrVar3.g) {
                    boolean[] zArr5 = zrVar3.e;
                    if (zArr5 == null || zArr5[i19]) {
                        long dialogId = DialogObject.getDialogId((TLObject) zrVar3.c.get(i19));
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
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(this.Y, dialogId, num2.intValue());
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
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList3, null, null, -chat2.id, this.Z, false, this.a0);
            }
            if (!arrayList4.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList4, null, null, this.Y, this.Z, true, this.a0);
            }
        }
        for (int i22 = 0; i22 < zrVar2.g; i22++) {
            if (zrVar2.d[i22] && ((zArr4 = zrVar2.e) == null || zArr4[i22])) {
                TLObject tLObject = (TLObject) zrVar2.c.get(i22);
                long j16 = chat2.id;
                if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                    long j17 = chat2.linked_monoforum_id;
                    if (j17 != j10) {
                        j11 = j17;
                        if (!this.c0) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = (TLRPC.TL_chatBannedRights) this.t0.get(i22);
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
        for (int i23 = 0; i23 < zrVar.g; i23++) {
            if (zrVar.d[i23] && ((zArr3 = zrVar.e) == null || zArr3[i23])) {
                TLObject tLObject2 = (TLObject) zrVar.c.get(i23);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.vr
                    public final /* synthetic */ as b;

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
                                long j162 = this.b.Y;
                                TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                                if ((peer == null || peer.chat_id == (-j162)) && j162 != 0) {
                                }
                                break;
                            case 1:
                                as asVar = this.b;
                                asVar.getClass();
                                TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                                if (peer2 != null) {
                                    long j172 = peer2.chat_id;
                                    long j18 = asVar.Y;
                                    if (j172 != (-j18) || j18 == 0) {
                                    }
                                }
                                break;
                            default:
                                as asVar2 = this.b;
                                asVar2.getClass();
                                TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                                if (peer3 == null || peer3.chat_id == (-asVar2.Y)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new xr(1, tLObject2)).map(new org.telegram.ui.j8(i11)).collect(Collectors.toCollection(new org.telegram.ui.qf()));
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
            for (int i24 = 0; i24 < zrVar3.g; i24++) {
                boolean[] zArr6 = zrVar3.e;
                if (zArr6 == null || zArr6[i24]) {
                    TLObject tLObject3 = (TLObject) zrVar3.c.get(i24);
                    if (!this.y0) {
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
                    if (this.z0) {
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
        for (int i25 = 0; i25 < zrVar3.g; i25++) {
            if (zrVar3.d[i25] && ((zArr2 = zrVar3.e) == null || zArr2[i25])) {
                TLObject tLObject4 = (TLObject) zrVar3.c.get(i25);
                if (tLObject4 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject4, null, 0);
                } else if (tLObject4 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject4, 0);
                }
            }
        }
        int i26 = 0;
        while (true) {
            zr zrVar4 = this.g0;
            if (i26 >= zrVar4.g) {
                return;
            }
            if (zrVar4.d[i26] && ((zArr = zrVar4.e) == null || zArr[i26])) {
                TLObject tLObject5 = (TLObject) zrVar4.c.get(i26);
                if (tLObject5 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject5, null);
                } else if (tLObject5 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, null, (TLRPC.Chat) tLObject5);
                }
            }
            i26++;
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
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Rect rect = AndroidUtilities.rectTmp2;
        jl0 jl0Var = this.d;
        rect.set(0, 0, jl0Var.getMeasuredWidth(), jl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        jl0Var.setClipBounds(rect);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        mc.e();
    }

    @Override // org.telegram.ui.Components.xa
    public final boolean t(View view, float f9, float f10) {
        return !(view instanceof org.telegram.ui.Cells.z1);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, this.n.getClassGuid(), true, new sr(this, 0), this.resourcesProvider);
        this.T = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        boolean[] zArr;
        if (this.w0) {
            return this.y0 ? LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll) : this.z0 ? LocaleController.getString(R.string.DeleteReactionOptionsTitleAll) : LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.X;
        int[] iArr = {arrayList != null ? arrayList.size() : 0};
        if (this.o0 != null && this.q0) {
            int i10 = 0;
            while (true) {
                zr zrVar = this.f0;
                if (i10 >= zrVar.g) {
                    break;
                }
                if (zrVar.d[i10] && ((zArr = zrVar.e) == null || zArr[i10])) {
                    iArr[0] = iArr[0] + this.o0[i10];
                }
                i10++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
