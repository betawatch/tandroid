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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ls extends ab {
    public static final /* synthetic */ int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public j61 X;
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
    public final ks i0;
    public final ks j0;
    public final ks k0;
    public final ks l0;
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
    public ls(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j3, int i10, int i11, boolean z10, Runnable runnable) {
        super(p2Var.getContext(), p2Var, false, true, 2, p2Var.getResourceProvider());
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
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        this.y = true;
        fixNavigationBar();
        this.O = true;
        this.A0 = z10;
        vl0 vl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i12, this.G, i12, AndroidUtilities.dp(63.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new hs(this, 1));
        this.O = true;
        js jsVar = new js(this);
        jsVar.m = false;
        jsVar.C = false;
        jsVar.o(wr.h);
        jsVar.n(350L);
        this.d.setItemAnimator(jsVar);
        this.d.o1();
        bi.d dVar = new bi.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.setText(LocaleController.getString(R.string.DeleteProceedBtn));
        dVar.setOnClickListener(new h0(this, 11));
        this.containerView.addView(dVar, w7.a6.f(48.0f, 87, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f)));
        this.Y = chat;
        this.a0 = ChatObject.isForum(chat);
        this.b0 = arrayList;
        this.c0 = j3;
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
        this.i0 = new ks(this, 0, arrayList2);
        this.j0 = new ks(this, 1, arrayList2);
        this.k0 = new ks(this, 3, arrayList2);
        boolean z11 = arrayList2.size() == 1;
        this.z0 = z11;
        this.h0 = ChatObject.isMonoForum(chat);
        if (chat.linked_community_id != 0) {
            this.Z = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.linked_community_id));
        }
        if (ChatObject.canUserDoAdminAction(this.Z, 2) && ChatObject.canUserDoAdminAction(this.Z, 27) && z11) {
            long dialogId = DialogObject.getDialogId((TLObject) arrayList2.get(0));
            this.q0 = dialogId;
            MessagesController.getInstance(this.currentAccount).fetchCommunityJoinedChats(this.Z.id, dialogId, new es(this, 1));
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
            this.x0 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new org.telegram.ui.l8(3)).collect(Collectors.toCollection(new org.telegram.ui.eg()));
            ks ksVar = new ks(this, 2, arrayList2);
            this.l0 = ksVar;
            boolean[] zArr = this.m0;
            if (ksVar.g != 0) {
                ksVar.e = zArr;
                ksVar.f();
                ksVar.g();
            }
        } else {
            this.l0 = new ks(this, 2, new ArrayList(0));
        }
        this.X.N(false);
        this.e.setTitle(y());
    }

    public static /* synthetic */ void P(ls lsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            lsVar.s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(lsVar.b0).filter(new is(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            lsVar.t0 = false;
            lsVar.u0 = true;
            lsVar.O();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(ls lsVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = lsVar.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = lsVar.resourcesProvider;
        int i10 = lsVar.currentAccount;
        long j3 = lsVar.q0;
        ArrayList<Long> arrayList = lsVar.r0.joined_chat_ids;
        boolean z11 = false;
        hs hsVar = new hs(lsVar, 0 == true ? 1 : 0);
        Pattern pattern = d5.a;
        LinearLayout f7 = org.telegram.messenger.em.f(context2, 1);
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j3)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(f7);
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
                bi.w7 w7Var = new bi.w7(context2, f6Var, z11);
                int i12 = size;
                ((TextView) w7Var.c).setText(DialogObject.getName(chat));
                TextView textView = (TextView) w7Var.d;
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
                ((w9) w7Var.b).e(chat, new g9(chat));
                w7Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z10));
                w7Var.setOnClickListener(new org.telegram.ui.jo(d2VarArr, hsVar, longValue, 2));
                f7.addView(w7Var, w7.a6.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        d2VarArr[0] = d2Var;
        d2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.v0;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void T(ArrayList arrayList, ks ksVar) {
        boolean c10 = ksVar.c();
        int i10 = ksVar.g;
        int i11 = ksVar.a;
        if (c10) {
            if (!ksVar.b()) {
                v51 y3 = v51.y(i11, ksVar.b);
                y3.K(ksVar.i > 0);
                arrayList.add(y3);
                return;
            }
            String str = ksVar.b;
            int i12 = ksVar.i;
            if (i12 <= 0) {
                i12 = ksVar.e != null ? ksVar.h : i10;
            }
            String valueOf = String.valueOf(i12);
            v51 v51Var = new v51(36);
            v51Var.d = i11;
            v51Var.l = str;
            v51Var.o = valueOf;
            v51Var.K(ksVar.i > 0);
            v51Var.f = ksVar.f;
            v51Var.D = new org.telegram.ui.sh(25, this, ksVar);
            arrayList.add(v51Var);
            if (ksVar.f) {
                return;
            }
            for (int i13 = 0; i13 < i10; i13++) {
                boolean[] zArr = ksVar.e;
                if (zArr == null || zArr[i13]) {
                    TLObject tLObject = (TLObject) ksVar.c.get(i13);
                    v51 v51Var2 = new v51(37);
                    v51Var2.d = (i11 << 24) | i13;
                    v51Var2.G = tLObject;
                    v51Var2.K(ksVar.d[i13]);
                    v51Var2.i = 1;
                    arrayList.add(v51Var2);
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
        ks ksVar = this.j0;
        int i10 = ksVar.g;
        this.s0 = new int[i10];
        int[] iArr = {i10};
        for (int i11 = 0; i11 < ksVar.g; i11++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
            tL_messages_search.q = "";
            TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) ksVar.c.get(i11));
            tL_messages_search.from_id = inputPeer;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new di.c5(this, inputPeer, i11, iArr, 3));
        }
    }

    public final void V() {
        boolean z10 = this.g0;
        ks ksVar = this.l0;
        if (z10 && ksVar.c()) {
            this.E0 = ksVar.i > 0;
        }
        if (this.g0 && ksVar.c() && ksVar.i == 0) {
            ksVar.d();
        } else if (!this.g0 && ksVar.c()) {
            if (this.E0 != (ksVar.i > 0)) {
                ksVar.d();
            }
        }
        if (this.g0 || !ksVar.c()) {
            return;
        }
        this.E0 = ksVar.i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04af  */
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
        long j3;
        boolean[] zArr;
        boolean[] zArr2;
        ?? r62;
        boolean[] zArr3;
        boolean[] zArr4;
        long j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j11;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        long j12;
        boolean z11;
        String str;
        final int i10 = 2;
        long j13 = this.q0;
        boolean z12 = true;
        if (z10 && this.p0 && (participantJoinedChats = this.r0) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            int i11 = this.currentAccount;
            ArrayList<Long> arrayList = this.r0.creator_chat_ids;
            hs hsVar = new hs(this, i10);
            fs fsVar = new fs(this, 0);
            Pattern pattern = d5.a;
            LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
            org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            String string = LocaleController.getString(R.string.CommunityBanWarningTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.R = string;
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i11, j13)));
            alertDialog$Builder.k(LocaleController.getString(R.string.Ban), new t(fsVar, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.n(f7);
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
                    bi.w7 w7Var = new bi.w7(context, f6Var, z12);
                    int i14 = size;
                    ((TextView) w7Var.c).setText(DialogObject.getName(chat));
                    ?? r12 = (TextView) w7Var.d;
                    if (chatFull != null) {
                        int i15 = chatFull.participants_count;
                        j12 = longValue;
                        z11 = false;
                        str = LocaleController.formatPluralString("Members", i15, new Object[0]);
                    } else {
                        j12 = longValue;
                        z11 = false;
                        str = null;
                    }
                    r12.setText(str);
                    ((w9) w7Var.b).e(chat, new g9(chat));
                    w7Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z11));
                    ?? r13 = f7;
                    w7Var.setOnClickListener(new org.telegram.ui.jo(d2VarArr, hsVar, j12, 1));
                    r13.addView(w7Var, w7.a6.n(-1, -2));
                    i12 = i13;
                    f7 = r13;
                    size = i14;
                    z12 = true;
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
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
        ks ksVar = this.i0;
        String str2 = ksVar.i > 0 ? "" + LocaleController.formatPluralString("UsersReported", ksVar.i, new Object[0]) : "";
        ks ksVar2 = this.l0;
        if (ksVar2.i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = org.telegram.ui.Cells.r6.t(str2, "\n");
            }
            if (this.g0) {
                StringBuilder u10 = a4.a.u(str2);
                u10.append(LocaleController.formatPluralString("UsersRestricted", ksVar2.i, new Object[0]));
                str2 = u10.toString();
            } else {
                StringBuilder u11 = a4.a.u(str2);
                u11.append(LocaleController.formatPluralString("UsersBanned", ksVar2.i, new Object[0]));
                str2 = u11.toString();
            }
        }
        boolean z13 = this.A0;
        boolean z14 = z13 && !this.C0;
        int i16 = ksVar2.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(str2);
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        if (isEmpty) {
            org.telegram.messenger.a2.o(z14 ? R.string.ReactionsDeleted : R.string.MessagesDeleted, wc.a0(p2Var), i16, 36);
        } else {
            wc.a0(p2Var).M(LocaleController.getString(z14 ? R.string.ReactionsDeleted : R.string.MessagesDeleted), str2, i16).j();
        }
        long j14 = 0;
        if (j13 != 0 && this.p0) {
            MessagesController.getInstance(this.currentAccount).toggleCommunityParticipantBanned(this.Z.id, this.q0, true, new gh.b(1));
        }
        ArrayList arrayList2 = this.b0;
        final int i17 = 0;
        ArrayList<Integer> arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.gs
            public final /* synthetic */ ls b;

            {
                this.b = this;
            }

            public /* synthetic */ Predicate and(Predicate predicate) {
                int i18 = i17;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                switch (i17) {
                }
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                int i18 = i17;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i17) {
                    case 0:
                        long j15 = this.b.c0;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j15)) && j15 != 0) {
                        }
                        break;
                    case 1:
                        ls lsVar = this.b;
                        lsVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j16 = peer2.chat_id;
                            long j17 = lsVar.c0;
                            if (j16 != (-j17) || j17 == 0) {
                            }
                        }
                        break;
                    default:
                        ls lsVar2 = this.b;
                        lsVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-lsVar2.c0)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new org.telegram.ui.l8(i10)).collect(Collectors.toCollection(new org.telegram.ui.eg()));
        final int i18 = 1;
        ArrayList<Integer> arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.gs
            public final /* synthetic */ ls b;

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
                        long j15 = this.b.c0;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        if ((peer == null || peer.chat_id == (-j15)) && j15 != 0) {
                        }
                        break;
                    case 1:
                        ls lsVar = this.b;
                        lsVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j16 = peer2.chat_id;
                            long j17 = lsVar.c0;
                            if (j16 != (-j17) || j17 == 0) {
                            }
                        }
                        break;
                    default:
                        ls lsVar2 = this.b;
                        lsVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        if (peer3 == null || peer3.chat_id == (-lsVar2.c0)) {
                        }
                        break;
                }
                return false;
            }
        }).map(new org.telegram.ui.l8(i10)).collect(Collectors.toCollection(new org.telegram.ui.eg()));
        TLRPC.Chat chat2 = this.Y;
        ks ksVar3 = this.j0;
        if (z13) {
            if (!this.D0) {
                int i19 = 0;
                while (i19 < ksVar3.g) {
                    boolean[] zArr5 = ksVar3.e;
                    if (zArr5 == null || zArr5[i19]) {
                        long dialogId = DialogObject.getDialogId((TLObject) ksVar3.c.get(i19));
                        int size2 = arrayList3.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            Integer num = arrayList3.get(i20);
                            i20++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(-chat2.id, dialogId, num.intValue());
                            j14 = j14;
                        }
                        j11 = j14;
                        int size3 = arrayList4.size();
                        int i21 = 0;
                        while (i21 < size3) {
                            Integer num2 = arrayList4.get(i21);
                            i21++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(this.c0, dialogId, num2.intValue());
                        }
                    } else {
                        j11 = j14;
                    }
                    i19++;
                    j14 = j11;
                }
            }
            j3 = j14;
        } else {
            j3 = 0;
            if (!arrayList3.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList3, null, null, -chat2.id, this.d0, false, this.e0);
            }
            if (!arrayList4.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList4, null, null, this.c0, this.d0, true, this.e0);
            }
        }
        for (int i22 = 0; i22 < ksVar2.g; i22++) {
            if (ksVar2.d[i22] && ((zArr4 = ksVar2.e) == null || zArr4[i22])) {
                TLObject tLObject = (TLObject) ksVar2.c.get(i22);
                long j15 = chat2.id;
                if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                    long j16 = chat2.linked_monoforum_id;
                    if (j16 != j3) {
                        j10 = j16;
                        if (!this.g0) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = (TLRPC.TL_chatBannedRights) this.x0.get(i22);
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
                                MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j10, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, this.n);
                            } else if (tLObject instanceof TLRPC.Chat) {
                                MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j10, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, this.n);
                            }
                        } else if (tLObject instanceof TLRPC.User) {
                            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j10, (TLRPC.User) tLObject, (TLRPC.Chat) null, false, false);
                        } else if (tLObject instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j10, (TLRPC.User) null, (TLRPC.Chat) tLObject, false, false);
                        }
                    }
                }
                j10 = j15;
                if (!this.g0) {
                }
            }
        }
        for (int i23 = 0; i23 < ksVar.g; i23++) {
            if (ksVar.d[i23] && ((zArr3 = ksVar.e) == null || zArr3[i23])) {
                TLObject tLObject2 = (TLObject) ksVar.c.get(i23);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: org.telegram.ui.Components.gs
                    public final /* synthetic */ ls b;

                    {
                        this.b = this;
                    }

                    public /* synthetic */ Predicate and(Predicate predicate) {
                        int i182 = i10;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        switch (i10) {
                        }
                        return Predicate$-CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        int i182 = i10;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        MessageObject messageObject = (MessageObject) obj;
                        switch (i10) {
                            case 0:
                                long j152 = this.b.c0;
                                TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                                if ((peer == null || peer.chat_id == (-j152)) && j152 != 0) {
                                }
                                break;
                            case 1:
                                ls lsVar = this.b;
                                lsVar.getClass();
                                TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                                if (peer2 != null) {
                                    long j162 = peer2.chat_id;
                                    long j17 = lsVar.c0;
                                    if (j162 != (-j17) || j17 == 0) {
                                    }
                                }
                                break;
                            default:
                                ls lsVar2 = this.b;
                                lsVar2.getClass();
                                TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                                if (peer3 == null || peer3.chat_id == (-lsVar2.c0)) {
                                }
                                break;
                        }
                        return false;
                    }
                }).filter(new is(1, tLObject2)).map(new org.telegram.ui.l8(i10)).collect(Collectors.toCollection(new org.telegram.ui.eg()));
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
        if (this.z0) {
            for (int i24 = 0; i24 < ksVar3.g; i24++) {
                boolean[] zArr6 = ksVar3.e;
                if (zArr6 == null || zArr6[i24]) {
                    TLObject tLObject3 = (TLObject) ksVar3.c.get(i24);
                    if (!this.C0) {
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
                    if (this.D0) {
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
        for (int i25 = 0; i25 < ksVar3.g; i25++) {
            if (ksVar3.d[i25] && ((zArr2 = ksVar3.e) == null || zArr2[i25])) {
                TLObject tLObject4 = (TLObject) ksVar3.c.get(i25);
                if (tLObject4 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject4, null, 0);
                } else if (tLObject4 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject4, 0);
                }
            }
        }
        int i26 = 0;
        while (true) {
            ks ksVar4 = this.k0;
            if (i26 >= ksVar4.g) {
                return;
            }
            if (ksVar4.d[i26] && ((zArr = ksVar4.e) == null || zArr[i26])) {
                TLObject tLObject5 = (TLObject) ksVar4.c.get(i26);
                if (tLObject5 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject5, null);
                } else if (tLObject5 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, null, (TLRPC.Chat) tLObject5);
                }
            }
            i26++;
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.i0.a());
        edit.putBoolean("delete_deleteAll", this.j0.a());
        edit.putBoolean("delete_ban", !this.g0 && this.l0.a());
        edit.apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Rect rect = AndroidUtilities.rectTmp2;
        vl0 vl0Var = this.d;
        rect.set(0, 0, vl0Var.getMeasuredWidth(), vl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        vl0Var.setClipBounds(rect);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        pc.e();
    }

    @Override // org.telegram.ui.Components.ab
    public final boolean t(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, this.n.getClassGuid(), true, new es(this, 0), this.resourcesProvider);
        this.X = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.ab
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
                ks ksVar = this.j0;
                if (i10 >= ksVar.g) {
                    break;
                }
                if (ksVar.d[i10] && ((zArr = ksVar.e) == null || zArr[i10])) {
                    iArr[0] = iArr[0] + this.s0[i10];
                }
                i10++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
