package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n00 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public ArrayList B;
    public ArrayList C;
    public final LongSparseIntArray D;
    public b00 E;
    public c00 F;
    public h00 G;
    public final ArrayList H;
    public int I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public float M;
    public wi N;
    public boolean O;
    public gh.q6 P;
    public gh.f1 a;
    public k00 b;
    public org.telegram.ui.ActionBar.w0 c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final MessagesController.DialogFilter r;
    public boolean s;
    public boolean v;
    public CharSequence w;
    public boolean x;
    public int y;

    public n00(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.x = true;
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = -5.0f;
        this.r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.r = dialogFilter2;
            dialogFilter2.id = 2;
            while (getMessagesController().dialogFiltersById.get(this.r.id) != null) {
                this.r.id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r.name);
        this.w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.w = replaceEmoji;
        this.w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.r.title_noanimate;
        this.x = z10;
        org.telegram.ui.Components.k5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.r;
        this.y = dialogFilter4.flags;
        this.A = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.r.alwaysShow);
        this.B = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.C = new ArrayList(this.r.neverShow);
        this.D = this.r.pinnedDialogs.clone();
    }

    public static /* synthetic */ void T(n00 n00Var) {
        String str;
        n00Var.x = !n00Var.x;
        c00 c00Var = n00Var.F;
        if (c00Var != null) {
            org.telegram.ui.Cells.u3 u3Var = c00Var.r;
            if (j0(n00Var.w)) {
                str = LocaleController.getString(n00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
            } else {
                str = null;
            }
            u3Var.setText(str);
        }
        org.telegram.ui.Components.k5.s(n00Var.currentAccount, n00Var.x);
        n00Var.h0(true);
        org.telegram.ui.ActionBar.k kVar = n00Var.actionBar;
        if (kVar != null) {
            if (kVar.getTitleTextView() != null) {
                n00Var.actionBar.getTitleTextView().setEmojiCacheType(n00Var.x ? 0 : 26);
            }
            if (n00Var.actionBar.getTitleTextView2() != null) {
                n00Var.actionBar.getTitleTextView2().setEmojiCacheType(n00Var.x ? 0 : 26);
            }
        }
    }

    public static void U(n00 n00Var) {
        MessagesController.DialogFilter dialogFilter = n00Var.r;
        if (!n00Var.v) {
            n00Var.finishFragment();
            return;
        }
        n00Var.v = false;
        Paint.FontMetricsInt titleFontMetricsInt = n00Var.actionBar.getTitleFontMetricsInt();
        n00Var.actionBar.I(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
    }

    public static void V(n00 n00Var) {
        MessagesController messagesController = n00Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = n00Var.r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i9 = 0; i9 < dialogFilter.alwaysShow.size(); i9++) {
            long longValue = dialogFilter.alwaysShow.get(i9).longValue();
            if (longValue < 0 && f0(n00Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(n00Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (arrayList.size() > (n00Var.getUserConfig().isPremium() ? n00Var.getMessagesController().dialogFiltersChatsLimitPremium : n00Var.getMessagesController().dialogFiltersChatsLimitDefault)) {
            n00Var.showDialog(new zf.j0(4, n00Var.currentAccount, n00Var.getParentActivity(), n00Var, null));
            return;
        }
        if (arrayList.isEmpty()) {
            lz lzVar = new lz(dialogFilter, null);
            lzVar.y = new oz(n00Var, 1);
            lzVar.x = new oz(n00Var, 2);
            n00Var.presentFragment(lzVar);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        n00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new rz(n00Var, 1));
    }

    public static boolean f0(TLRPC.Chat chat) {
        if (ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return ChatObject.isPublic(chat) && !chat.join_request;
    }

    public static boolean j0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.t5.class);
            if (t5VarArr != null && t5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void o0(MessagesController.DialogFilter dialogFilter, int i9, String str, ArrayList arrayList, boolean z10, int i10, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.o2 o2Var, Runnable runnable) {
        if (dialogFilter.flags != i9 || z13) {
            dialogFilter.pendingUnreadCount = -1;
            if (z14) {
                dialogFilter.unreadCount = -1;
            }
        }
        dialogFilter.flags = i9;
        dialogFilter.name = str;
        dialogFilter.entities = arrayList;
        dialogFilter.color = i10;
        dialogFilter.neverShow = arrayList3;
        dialogFilter.alwaysShow = arrayList2;
        dialogFilter.title_noanimate = z10;
        if (z11) {
            o2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            o2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        o2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = o2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i11 = 0; i11 < size; i11 = j3.r0.e(dialogFilters.get(i11).id, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            o2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void q0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.Components.oc ocVar) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new zf.j0(4, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            org.telegram.messenger.ll.p(R.string.FolderLinkNoChatsError, ocVar, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.ll.p(R.string.FolderLinkOtherAdminLimitError, ocVar, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new zf.j0(5, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new zf.j0(12, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new zf.j0(13, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            org.telegram.messenger.ll.p(R.string.NoFolderFound, ocVar, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new zf.j0(4, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.ll.p(R.string.UnknownError, ocVar, null);
        } else {
            new zf.j0(3, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
        }
    }

    public static void s0(final MessagesController.DialogFilter dialogFilter, final int i9, final String str, final ArrayList arrayList, final boolean z10, final int i10, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.o2 o2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.c2 c2Var = null;
        int i11 = 3;
        int i12 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(o2Var.getParentActivity(), 3, null);
            c2Var2.c0 = false;
            c2Var2.show();
            c2Var = c2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = dialogFilter.id;
        int i13 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        tL_dialogFilter.contacts = (i9 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0;
        tL_dialogFilter.non_contacts = (i9 & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0;
        tL_dialogFilter.groups = (i9 & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0;
        tL_dialogFilter.broadcasts = (i9 & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0;
        tL_dialogFilter.bots = (i9 & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0;
        tL_dialogFilter.exclude_muted = (i9 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0;
        tL_dialogFilter.exclude_read = (i9 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0;
        tL_dialogFilter.exclude_archived = (i9 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0;
        tL_dialogFilter.id = dialogFilter.id;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i10 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= TLObject.FLAG_27;
            tL_dialogFilter2.color = i10;
        }
        MessagesController messagesController = o2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                long keyAt = longSparseIntArray.keyAt(i14);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new mt(longSparseIntArray, 1));
        }
        int i15 = 0;
        while (i15 < i11) {
            if (i15 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i15 == i13) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i12 < size2) {
                Long l10 = (Long) arrayList5.get(i12);
                org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                int i16 = size2;
                long longValue = l10.longValue();
                if ((i15 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !DialogObject.isEncryptedDialog(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User user = messagesController.getUser(l10);
                        if (user != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = user.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j10 = -longValue;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                        if (chat != null) {
                            if (ChatObject.isChannel(chat)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j10;
                                tL_inputPeerChannel.access_hash = chat.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j10;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i12++;
                c2Var = c2Var3;
                size2 = i16;
            }
            i15++;
            i11 = 3;
            i12 = 0;
            i13 = 1;
        }
        o2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: org.telegram.ui.qz
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.c2 c2Var4 = c2Var;
                final MessagesController.DialogFilter dialogFilter2 = dialogFilter;
                final int i17 = i9;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i18 = i10;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sz
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (!z22) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            org.telegram.ui.ActionBar.c2 c2Var5 = c2Var4;
                            if (c2Var5 != null) {
                                try {
                                    c2Var5.dismiss();
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            n00.o0(dialogFilter2, i17, str2, arrayList7, z17, i18, arrayList8, arrayList9, z18, z19, z20, z21, o2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        o0(dialogFilter, i9, str, arrayList, z10, i10, arrayList2, arrayList3, z11, z12, z13, z14, o2Var, null);
    }

    public static CharSequence w0(int i9, CharSequence charSequence, boolean z10) {
        Context context;
        if (i9 >= 0) {
            if (!MessagesController.getGlobalMainSettings().getBoolean("n_" + i9, false) && (context = ApplicationLoader.applicationContext) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable mutate = context.getResources().getDrawable(R.drawable.msg_other_new_outline).mutate();
                    mutate.setBounds(0, -AndroidUtilities.dp(8.0f), mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight() - AndroidUtilities.dp(8.0f));
                    spannableString.setSpan(new uz(mutate, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                    Drawable mutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false), mode));
                    org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(mutate2, mutate3);
                    fqVar.setBounds(0, 0, fqVar.getIntrinsicWidth(), fqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(fqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        boolean z10 = this.s;
        MessagesController.DialogFilter dialogFilter = this.r;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (kVar.getTitleTextView() != null) {
                    this.actionBar.getTitleTextView().setEmojiCacheType(this.x ? 0 : 26);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    this.actionBar.getTitleTextView2().setEmojiCacheType(this.x ? 0 : 26);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 18));
        this.c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(context, null, 3);
        this.fragmentView = b51Var;
        b51Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        gh.f1 f1Var = new gh.f1(this, context, 27);
        this.a = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new f2.m0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        b51Var.addView(this.a, g7.e6.c(-1.0f, -1));
        gh.f1 f1Var2 = this.a;
        k00 k00Var = new k00(this, context);
        this.b = k00Var;
        f1Var2.setAdapter(k00Var);
        this.a.setOnItemClickListener(new i(this, 9));
        this.a.setOnItemLongClickListener(new nz(this, 0));
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.n(350L);
        this.a.setItemAnimator(nVar);
        this.a.setOnScrollListener(new l3(this, 10));
        h0(false);
        if (!this.J && dialogFilter != null && dialogFilter.isChatlist()) {
            this.J = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
            this.I = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new rz(this, 0));
        }
        return this.fragmentView;
    }

    public final boolean g0(boolean z10) {
        if (this.c.getAlpha() != 1.0f) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        if (this.s) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDiscardNewTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDiscardNewAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new nz(this, 2));
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDiscardTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDiscardAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new nz(this, 3));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new nz(this, 4));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.va.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    public final void h0(boolean z10) {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.w) && this.w.length() <= 12;
        if (z12) {
            z12 = ((this.y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.B.isEmpty()) ? false : true;
            if (z12 && !this.s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.r;
                if (dialogFilter.alwaysShow.size() != this.B.size()) {
                    this.h = true;
                }
                if (dialogFilter.neverShow.size() != this.C.size()) {
                    this.h = true;
                }
                if (dialogFilter.color != this.A) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(dialogFilter.alwaysShow);
                    Collections.sort(this.B);
                    if (!dialogFilter.alwaysShow.equals(this.B)) {
                        this.h = true;
                    }
                    Collections.sort(dialogFilter.neverShow);
                    Collections.sort(this.C);
                    if (!dialogFilter.neverShow.equals(this.C)) {
                        this.h = true;
                    }
                }
                if (dialogFilter.title_noanimate == (!this.x) && TextUtils.equals(dialogFilter.name, this.w) && dialogFilter.flags == this.y) {
                    z11 = this.h;
                }
                z12 = z11;
            }
        }
        if (this.c.isEnabled() == z12) {
            return;
        }
        this.c.setEnabled(z12);
        if (z10) {
            this.c.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.0f).scaleY(z12 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.c.setAlpha(z12 ? 1.0f : 0.0f);
        this.c.setScaleX(z12 ? 1.0f : 0.0f);
        this.c.setScaleY(z12 ? 1.0f : 0.0f);
    }

    public final void i0() {
        String string;
        if (this.s) {
            if (TextUtils.isEmpty(this.w) || !this.n) {
                int i9 = this.y;
                int i10 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                int i11 = i9 & i10;
                if ((i11 & i10) != i10) {
                    int i12 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    if ((i11 & i12) != 0) {
                        if (((~i12) & i11) == 0) {
                            string = LocaleController.getString(R.string.FilterContacts);
                        }
                        string = "";
                    } else {
                        int i13 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        if ((i11 & i13) != 0) {
                            if (((~i13) & i11) == 0) {
                                string = LocaleController.getString(R.string.FilterNonContacts);
                            }
                            string = "";
                        } else {
                            int i14 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            if ((i11 & i14) != 0) {
                                if (((~i14) & i11) == 0) {
                                    string = LocaleController.getString(R.string.FilterGroups);
                                }
                                string = "";
                            } else {
                                int i15 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                                if ((i11 & i15) != 0) {
                                    if (((~i15) & i11) == 0) {
                                        string = LocaleController.getString(R.string.FilterBots);
                                    }
                                    string = "";
                                } else {
                                    int i16 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                                    if ((i11 & i16) != 0 && ((~i16) & i11) == 0) {
                                        string = LocaleController.getString(R.string.FilterChannels);
                                    }
                                    string = "";
                                }
                            }
                        }
                    }
                } else if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i9) != 0) {
                    string = LocaleController.getString(R.string.FilterNameUnread);
                } else {
                    if ((i9 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                        string = LocaleController.getString(R.string.FilterNameNonMuted);
                    }
                    string = "";
                }
                String str = (string == null || string.length() <= 12) ? string : "";
                this.w = str;
                b00 b00Var = this.E;
                if (b00Var != null) {
                    b00Var.e(org.telegram.ui.Components.t5.cloneSpans(str, -1, b00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                f2.q1 K = this.a.K(this.d);
                if (K != null) {
                    this.b.y(K);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void k0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            arrayList = this.H;
            if (i9 >= arrayList.size()) {
                i9 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i9)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            arrayList.remove(i9);
            if (arrayList.isEmpty()) {
                this.r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
            }
            v0();
        }
    }

    public final void l0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            arrayList = this.H;
            if (i9 >= arrayList.size()) {
                i9 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i9)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i9, tL_exportedChatlistInvite);
        }
        v0();
    }

    public final void m0(int i9, boolean z10) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.O && (dialogFilter = this.r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.O = true;
            this.P = new gh.q6(this, z10, i9, 3);
            if (getLayoutContainer() != null) {
                this.P.run();
                this.P = null;
            }
        }
    }

    public final void n0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i9;
        if (arrayList != null) {
            i9 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!arrayList2.contains(arrayList.get(i10))) {
                    i9++;
                }
            }
            size = 0;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (!arrayList.contains(arrayList2.get(i11))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i9 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i9 = 0;
        }
        if (!z10) {
            if (size > 0) {
                m0(size, false);
            }
        } else if (size > 0 && size > i9) {
            m0(size, true);
        } else if (i9 > 0) {
            m0(i9, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.d3 d3Var;
        h00 h00Var = this.G;
        if (h00Var == null || (d3Var = h00Var.b) == null || !d3Var.e) {
            return g0(z10);
        }
        if (!z10) {
            return false;
        }
        d3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        v0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.I != 0) {
            getConnectionsManager().cancelRequest(this.I, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        v0();
        gh.q6 q6Var = this.P;
        if (q6Var != null) {
            q6Var.run();
        }
    }

    public final void p0() {
        wi wiVar = this.N;
        if (wiVar != null) {
            wiVar.b(true);
            this.N = null;
        }
        r0(new pz(this, 0), true);
    }

    public final void r0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.w};
        s0(this.r, this.y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.x, this.A, this.B, this.C, this.D, this.s, false, this.h, true, z10, this, new org.telegram.ui.Components.p61(21, this, runnable));
    }

    public final void t0(boolean z10) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.y, z10 ? this.B : this.C, z10);
        usersSelectActivity.B = this.r.isChatlist();
        usersSelectActivity.n = new dh.s(7, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void u0(e00 e00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        if (z10) {
            c2Var.N = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            c2Var.N = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new b5.e(this, e00Var, z10, 7));
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        }
    }

    public final void v0() {
        ArrayList arrayList = this.K;
        arrayList.clear();
        ArrayList arrayList2 = this.L;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string = LocaleController.getString(R.string.FilterNameHeader);
        String string2 = j0(this.w) ? LocaleController.getString(this.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable) : null;
        final int i9 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
            public final /* synthetic */ n00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        n00 n00Var = this.b;
                        n00Var.f = true;
                        n00Var.v0();
                        break;
                    case 1:
                        n00 n00Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = n00Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.n00.S(n00Var2, dialogFilter.id, new oz(n00Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            n00Var2.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                break;
                            }
                        }
                        break;
                    case 2:
                        n00.T(this.b);
                        break;
                    case 3:
                        this.b.t0(true);
                        break;
                    case 4:
                        n00 n00Var3 = this.b;
                        n00Var3.e = true;
                        n00Var3.v0();
                        break;
                    default:
                        this.b.t0(false);
                        break;
                }
            }
        };
        e00 e00Var = new e00(11, false);
        e00Var.d = string;
        e00Var.e = string2;
        e00Var.c = onClickListener;
        arrayList2.add(e00Var);
        this.d = arrayList2.size();
        arrayList2.add(new e00(2, false));
        arrayList2.add(e00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        e00 e00Var2 = new e00(0, false);
        e00Var2.d = string3;
        arrayList2.add(e00Var2);
        e00 b10 = e00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        final int i10 = 3;
        b10.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
            public final /* synthetic */ n00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        n00 n00Var = this.b;
                        n00Var.f = true;
                        n00Var.v0();
                        break;
                    case 1:
                        n00 n00Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = n00Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.n00.S(n00Var2, dialogFilter.id, new oz(n00Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            n00Var2.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                break;
                            }
                        }
                        break;
                    case 2:
                        n00.T(this.b);
                        break;
                    case 3:
                        this.b.t0(true);
                        break;
                    case 4:
                        n00 n00Var3 = this.b;
                        n00Var3.e = true;
                        n00Var3.v0();
                        break;
                    default:
                        this.b.t0(false);
                        break;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.B.isEmpty()) {
            int size = (this.e || this.B.size() < 8) ? this.B.size() : Math.min(5, this.B.size());
            for (int i11 = 0; i11 < size; i11++) {
                long longValue = ((Long) this.B.get(i11)).longValue();
                e00 e00Var3 = new e00(1, false);
                e00Var3.g = true;
                e00Var3.h = longValue;
                arrayList2.add(e00Var3);
            }
            if (size != this.B.size()) {
                e00 b11 = e00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.B.size() - 5, new Object[0]), false);
                final int i12 = 4;
                b11.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                    public final /* synthetic */ n00 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                n00 n00Var = this.b;
                                n00Var.f = true;
                                n00Var.v0();
                                break;
                            case 1:
                                n00 n00Var2 = this.b;
                                MessagesController.DialogFilter dialogFilter = n00Var2.r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.n00.S(n00Var2, dialogFilter.id, new oz(n00Var2, 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    n00Var2.showDialog(c2Var);
                                    TextView textView = (TextView) c2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                n00.T(this.b);
                                break;
                            case 3:
                                this.b.t0(true);
                                break;
                            case 4:
                                n00 n00Var3 = this.b;
                                n00Var3.e = true;
                                n00Var3.v0();
                                break;
                            default:
                                this.b.t0(false);
                                break;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(e00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            e00 e00Var4 = new e00(0, false);
            e00Var4.d = string4;
            arrayList2.add(e00Var4);
            e00 b12 = e00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            final int i13 = 5;
            b12.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                public final /* synthetic */ n00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            n00 n00Var = this.b;
                            n00Var.f = true;
                            n00Var.v0();
                            break;
                        case 1:
                            n00 n00Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = n00Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.n00.S(n00Var2, dialogFilter2.id, new oz(n00Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                n00Var2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            n00.T(this.b);
                            break;
                        case 3:
                            this.b.t0(true);
                            break;
                        case 4:
                            n00 n00Var3 = this.b;
                            n00Var3.e = true;
                            n00Var3.v0();
                            break;
                        default:
                            this.b.t0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.C.isEmpty()) {
                int size2 = (this.f || this.C.size() < 8) ? this.C.size() : Math.min(5, this.C.size());
                for (int i14 = 0; i14 < size2; i14++) {
                    long longValue2 = ((Long) this.C.get(i14)).longValue();
                    e00 e00Var5 = new e00(1, false);
                    e00Var5.g = false;
                    e00Var5.h = longValue2;
                    arrayList2.add(e00Var5);
                }
                if (size2 != this.C.size()) {
                    e00 b13 = e00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.C.size() - 5, new Object[0]), false);
                    final int i15 = 0;
                    b13.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                        public final /* synthetic */ n00 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    n00 n00Var = this.b;
                                    n00Var.f = true;
                                    n00Var.v0();
                                    break;
                                case 1:
                                    n00 n00Var2 = this.b;
                                    MessagesController.DialogFilter dialogFilter2 = n00Var2.r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.n00.S(n00Var2, dialogFilter2.id, new oz(n00Var2, 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                        alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
                                        alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        n00Var2.showDialog(c2Var);
                                        TextView textView = (TextView) c2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    n00.T(this.b);
                                    break;
                                case 3:
                                    this.b.t0(true);
                                    break;
                                case 4:
                                    n00 n00Var3 = this.b;
                                    n00Var3.e = true;
                                    n00Var3.v0();
                                    break;
                                default:
                                    this.b.t0(false);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(e00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new e00(9, false));
            arrayList2.add(new e00(10, false));
            arrayList2.add(e00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.H;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            e00 e00Var6 = new e00(0, false);
            e00Var6.d = string5;
            e00Var6.f = true;
            arrayList2.add(e00Var6);
            arrayList2.add(e00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(e00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            e00 e00Var7 = new e00(0, false);
            e00Var7.d = string6;
            e00Var7.f = true;
            arrayList2.add(e00Var7);
            arrayList2.add(new e00(8, false));
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i16);
                e00 e00Var8 = new e00(7, false);
                e00Var8.m = tL_exportedChatlistInvite;
                arrayList2.add(e00Var8);
            }
            arrayList2.add(e00.d(dialogFilter.isChatlist() ? LocaleController.getString(R.string.FilterInviteLinksHintNew) : LocaleController.getString(R.string.FilterInviteLinksHint)));
        }
        if (!this.s) {
            e00 b14 = e00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            final int i17 = 1;
            b14.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                public final /* synthetic */ n00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            n00 n00Var = this.b;
                            n00Var.f = true;
                            n00Var.v0();
                            break;
                        case 1:
                            n00 n00Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = n00Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.n00.S(n00Var2, dialogFilter2.id, new oz(n00Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                n00Var2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            n00.T(this.b);
                            break;
                        case 3:
                            this.b.t0(true);
                            break;
                        case 4:
                            n00 n00Var3 = this.b;
                            n00Var3.e = true;
                            n00Var3.v0();
                            break;
                        default:
                            this.b.t0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(e00.d(null));
        }
        k00 k00Var = this.b;
        if (k00Var != null) {
            k00Var.E(arrayList, arrayList2);
        }
    }
}
