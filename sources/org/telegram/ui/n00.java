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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class n00 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public b00 I;
    public c00 J;
    public h00 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public aj R;
    public boolean S;
    public ai.z8 T;
    public ai.u1 a;
    public k00 b;
    public org.telegram.ui.ActionBar.u0 c;
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
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
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
        org.telegram.ui.Components.r5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.r;
        this.y = dialogFilter4.flags;
        this.E = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.r.alwaysShow);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.r.neverShow);
        this.H = this.r.pinnedDialogs.clone();
    }

    public static /* synthetic */ void U(n00 n00Var) {
        String str;
        n00Var.x = !n00Var.x;
        c00 c00Var = n00Var.J;
        if (c00Var != null) {
            org.telegram.ui.Cells.t3 t3Var = c00Var.r;
            if (k0(n00Var.w)) {
                str = LocaleController.getString(n00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
            } else {
                str = null;
            }
            t3Var.setText(str);
        }
        org.telegram.ui.Components.r5.s(n00Var.currentAccount, n00Var.x);
        n00Var.i0(true);
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

    public static void V(n00 n00Var) {
        MessagesController.DialogFilter dialogFilter = n00Var.r;
        if (!n00Var.v) {
            n00Var.finishFragment();
            return;
        }
        n00Var.v = false;
        Paint.FontMetricsInt titleFontMetricsInt = n00Var.actionBar.getTitleFontMetricsInt();
        n00Var.actionBar.J(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
    }

    public static void W(n00 n00Var) {
        MessagesController messagesController = n00Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = n00Var.r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < dialogFilter.alwaysShow.size(); i10++) {
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && g0(n00Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(n00Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (arrayList.size() > (n00Var.getUserConfig().isPremium() ? n00Var.getMessagesController().dialogFiltersChatsLimitPremium : n00Var.getMessagesController().dialogFiltersChatsLimitDefault)) {
            n00Var.showDialog(new sg.k0(4, n00Var.currentAccount, n00Var.getParentActivity(), n00Var, null));
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

    public static boolean g0(TLRPC.Chat chat) {
        if (ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return ChatObject.isPublic(chat) && !chat.join_request;
    }

    public static boolean k0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.a6[] a6VarArr = (org.telegram.ui.Components.a6[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.a6.class);
            if (a6VarArr != null && a6VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void p0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.n2 n2Var, Runnable runnable) {
        if (dialogFilter.flags != i10 || z13) {
            dialogFilter.pendingUnreadCount = -1;
            if (z14) {
                dialogFilter.unreadCount = -1;
            }
        }
        dialogFilter.flags = i10;
        dialogFilter.name = str;
        dialogFilter.entities = arrayList;
        dialogFilter.color = i11;
        dialogFilter.neverShow = arrayList3;
        dialogFilter.alwaysShow = arrayList2;
        dialogFilter.title_noanimate = z10;
        if (z11) {
            n2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            n2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        n2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = n2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = com.google.android.gms.internal.play_billing.k3.f(dialogFilters.get(i12).id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            n2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.Components.xc xcVar) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new sg.k0(4, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            org.telegram.messenger.kk.q(R.string.FolderLinkNoChatsError, xcVar, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.kk.q(R.string.FolderLinkOtherAdminLimitError, xcVar, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new sg.k0(5, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new sg.k0(12, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new sg.k0(13, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            org.telegram.messenger.kk.q(R.string.NoFolderFound, xcVar, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new sg.k0(4, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.kk.q(R.string.UnknownError, xcVar, null);
        } else {
            new sg.k0(3, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
        }
    }

    public static void t0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.n2 n2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.b2 b2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(n2Var.getParentActivity(), 3, null);
            b2Var2.g0 = false;
            b2Var2.show();
            b2Var = b2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = dialogFilter.id;
        int i14 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        tL_dialogFilter.contacts = (i10 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0;
        tL_dialogFilter.non_contacts = (i10 & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0;
        tL_dialogFilter.groups = (i10 & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0;
        tL_dialogFilter.broadcasts = (i10 & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0;
        tL_dialogFilter.bots = (i10 & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0;
        tL_dialogFilter.exclude_muted = (i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0;
        tL_dialogFilter.exclude_read = (i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0;
        tL_dialogFilter.exclude_archived = (i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0;
        tL_dialogFilter.id = dialogFilter.id;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i11 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= TLObject.FLAG_27;
            tL_dialogFilter2.color = i11;
        }
        MessagesController messagesController = n2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new jt(longSparseIntArray, 1));
        }
        int i16 = 0;
        while (i16 < i12) {
            if (i16 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i16 == i14) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i13 < size2) {
                Long l4 = (Long) arrayList5.get(i13);
                org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                int i17 = size2;
                long longValue = l4.longValue();
                if ((i16 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !DialogObject.isEncryptedDialog(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User user = messagesController.getUser(l4);
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
                i13++;
                b2Var = b2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        n2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: org.telegram.ui.qz
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.b2 b2Var4 = b2Var;
                final MessagesController.DialogFilter dialogFilter2 = dialogFilter;
                final int i18 = i10;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i19 = i11;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
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
                            org.telegram.ui.ActionBar.b2 b2Var5 = b2Var4;
                            if (b2Var5 != null) {
                                try {
                                    b2Var5.dismiss();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            n00.p0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, n2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        p0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, n2Var, null);
    }

    public static CharSequence x0(int i10, CharSequence charSequence, boolean z10) {
        Context context;
        if (i10 >= 0) {
            if (!MessagesController.getGlobalMainSettings().getBoolean("n_" + i10, false) && (context = ApplicationLoader.applicationContext) != null) {
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
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false), mode));
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(mutate2, mutate3);
                    zqVar.setBounds(0, 0, zqVar.getIntrinsicWidth(), zqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(zqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        return h0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
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
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 26));
        this.c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        ig.p1 p1Var = new ig.p1(context, null, 4);
        this.fragmentView = p1Var;
        p1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        ai.u1 u1Var = new ai.u1(this, context, 28);
        this.a = u1Var;
        u1Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new s4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        p1Var.addView(this.a, w7.z5.c(-1.0f, -1));
        ai.u1 u1Var2 = this.a;
        k00 k00Var = new k00(this, context);
        this.b = k00Var;
        u1Var2.setAdapter(k00Var);
        this.a.setOnItemClickListener(new i(this, 10));
        this.a.setOnItemLongClickListener(new nz(this, 0));
        s4.k kVar2 = new s4.k();
        kVar2.m = false;
        kVar2.C = false;
        kVar2.o(org.telegram.ui.Components.bs.h);
        kVar2.n(350L);
        this.a.setItemAnimator(kVar2);
        this.a.setOnScrollListener(new k3(this, 10));
        i0(false);
        if (!this.N && dialogFilter != null && dialogFilter.isChatlist()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new rz(this, 0));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.va.class}, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 262144, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 262144, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 262144, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 262144, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.h6.r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        if (this.c.getAlpha() != 1.0f) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        if (this.s) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDiscardNewTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDiscardNewAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new nz(this, 2));
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDiscardTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDiscardAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new nz(this, 3));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new nz(this, 4));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    public final void i0(boolean z10) {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.w) && this.w.length() <= 12;
        if (z12) {
            z12 = ((this.y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.F.isEmpty()) ? false : true;
            if (z12 && !this.s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.r;
                if (dialogFilter.alwaysShow.size() != this.F.size()) {
                    this.h = true;
                }
                if (dialogFilter.neverShow.size() != this.G.size()) {
                    this.h = true;
                }
                if (dialogFilter.color != this.E) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(dialogFilter.alwaysShow);
                    Collections.sort(this.F);
                    if (!dialogFilter.alwaysShow.equals(this.F)) {
                        this.h = true;
                    }
                    Collections.sort(dialogFilter.neverShow);
                    Collections.sort(this.G);
                    if (!dialogFilter.neverShow.equals(this.G)) {
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String string;
        if (this.s) {
            if (TextUtils.isEmpty(this.w) || !this.n) {
                int i10 = this.y;
                int i11 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                int i12 = i10 & i11;
                if ((i12 & i11) != i11) {
                    int i13 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    if ((i12 & i13) != 0) {
                        if (((~i13) & i12) == 0) {
                            string = LocaleController.getString(R.string.FilterContacts);
                        }
                        string = "";
                    } else {
                        int i14 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        if ((i12 & i14) != 0) {
                            if (((~i14) & i12) == 0) {
                                string = LocaleController.getString(R.string.FilterNonContacts);
                            }
                            string = "";
                        } else {
                            int i15 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            if ((i12 & i15) != 0) {
                                if (((~i15) & i12) == 0) {
                                    string = LocaleController.getString(R.string.FilterGroups);
                                }
                                string = "";
                            } else {
                                int i16 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                                if ((i12 & i16) != 0) {
                                    if (((~i16) & i12) == 0) {
                                        string = LocaleController.getString(R.string.FilterBots);
                                    }
                                    string = "";
                                } else {
                                    int i17 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                                    if ((i12 & i17) != 0 && ((~i17) & i12) == 0) {
                                        string = LocaleController.getString(R.string.FilterChannels);
                                    }
                                    string = "";
                                }
                            }
                        }
                    }
                } else if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i10) != 0) {
                    string = LocaleController.getString(R.string.FilterNameUnread);
                } else {
                    if ((i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                        string = LocaleController.getString(R.string.FilterNameNonMuted);
                    }
                    string = "";
                }
                String str = (string == null || string.length() <= 12) ? string : "";
                this.w = str;
                b00 b00Var = this.I;
                if (b00Var != null) {
                    b00Var.e(org.telegram.ui.Components.a6.cloneSpans(str, -1, b00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.b1 K = this.a.K(this.d);
                if (K != null) {
                    this.b.y(K);
                }
            }
        }
    }

    public final void l0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.L;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.remove(i10);
            if (arrayList.isEmpty()) {
                this.r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
            }
            w0();
        }
    }

    public final void m0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.L;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i10, tL_exportedChatlistInvite);
        }
        w0();
    }

    public final void n0(int i10, boolean z10) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.S && (dialogFilter = this.r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.S = true;
            this.T = new ai.z8(this, z10, i10, 5);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void o0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i10;
        if (arrayList != null) {
            i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!arrayList2.contains(arrayList.get(i11))) {
                    i10++;
                }
            }
            size = 0;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (!arrayList.contains(arrayList2.get(i12))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i10 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i10 = 0;
        }
        if (!z10) {
            if (size > 0) {
                n0(size, false);
            }
        } else if (size > 0 && size > i10) {
            n0(size, true);
        } else if (i10 > 0) {
            n0(i10, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.d3 d3Var;
        h00 h00Var = this.K;
        if (h00Var == null || (d3Var = h00Var.b) == null || !d3Var.e) {
            return h0(z10);
        }
        if (!z10) {
            return false;
        }
        d3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        w0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.M != 0) {
            getConnectionsManager().cancelRequest(this.M, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        w0();
        ai.z8 z8Var = this.T;
        if (z8Var != null) {
            z8Var.run();
        }
    }

    public final void q0() {
        aj ajVar = this.R;
        if (ajVar != null) {
            ajVar.b(true);
            this.R = null;
        }
        s0(new pz(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.w};
        t0(this.r, this.y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.x, this.E, this.F, this.G, this.H, this.s, false, this.h, true, z10, this, new lt(14, this, runnable));
    }

    public final void u0(boolean z10) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.y, z10 ? this.F : this.G, z10);
        usersSelectActivity.F = this.r.isChatlist();
        usersSelectActivity.n = new ci.f(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void v0(e00 e00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        if (z10) {
            b2Var.R = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            b2Var.R = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.e4(this, e00Var, z10, 8));
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }

    public final void w0() {
        ArrayList arrayList = this.O;
        arrayList.clear();
        ArrayList arrayList2 = this.P;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string = LocaleController.getString(R.string.FilterNameHeader);
        String string2 = k0(this.w) ? LocaleController.getString(this.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable) : null;
        final int i10 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
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
                        n00Var.w0();
                        break;
                    case 1:
                        n00 n00Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = n00Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.k10.U(n00Var2, dialogFilter.id, new oz(n00Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            n00Var2.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                break;
                            }
                        }
                        break;
                    case 2:
                        n00.U(this.b);
                        break;
                    case 3:
                        this.b.u0(true);
                        break;
                    case 4:
                        n00 n00Var3 = this.b;
                        n00Var3.e = true;
                        n00Var3.w0();
                        break;
                    default:
                        this.b.u0(false);
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
        final int i11 = 3;
        b10.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
            public final /* synthetic */ n00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        n00 n00Var = this.b;
                        n00Var.f = true;
                        n00Var.w0();
                        break;
                    case 1:
                        n00 n00Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = n00Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.k10.U(n00Var2, dialogFilter.id, new oz(n00Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            n00Var2.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                break;
                            }
                        }
                        break;
                    case 2:
                        n00.U(this.b);
                        break;
                    case 3:
                        this.b.u0(true);
                        break;
                    case 4:
                        n00 n00Var3 = this.b;
                        n00Var3.e = true;
                        n00Var3.w0();
                        break;
                    default:
                        this.b.u0(false);
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
        if (!this.F.isEmpty()) {
            int size = (this.e || this.F.size() < 8) ? this.F.size() : Math.min(5, this.F.size());
            for (int i12 = 0; i12 < size; i12++) {
                long longValue = ((Long) this.F.get(i12)).longValue();
                e00 e00Var3 = new e00(1, false);
                e00Var3.g = true;
                e00Var3.h = longValue;
                arrayList2.add(e00Var3);
            }
            if (size != this.F.size()) {
                e00 b11 = e00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.F.size() - 5, new Object[0]), false);
                final int i13 = 4;
                b11.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
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
                                n00Var.w0();
                                break;
                            case 1:
                                n00 n00Var2 = this.b;
                                MessagesController.DialogFilter dialogFilter = n00Var2.r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.k10.U(n00Var2, dialogFilter.id, new oz(n00Var2, 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                    n00Var2.showDialog(b2Var);
                                    TextView textView = (TextView) b2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                n00.U(this.b);
                                break;
                            case 3:
                                this.b.u0(true);
                                break;
                            case 4:
                                n00 n00Var3 = this.b;
                                n00Var3.e = true;
                                n00Var3.w0();
                                break;
                            default:
                                this.b.u0(false);
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
            final int i14 = 5;
            b12.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                public final /* synthetic */ n00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            n00 n00Var = this.b;
                            n00Var.f = true;
                            n00Var.w0();
                            break;
                        case 1:
                            n00 n00Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = n00Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.k10.U(n00Var2, dialogFilter2.id, new oz(n00Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                n00Var2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            n00.U(this.b);
                            break;
                        case 3:
                            this.b.u0(true);
                            break;
                        case 4:
                            n00 n00Var3 = this.b;
                            n00Var3.e = true;
                            n00Var3.w0();
                            break;
                        default:
                            this.b.u0(false);
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
            if (!this.G.isEmpty()) {
                int size2 = (this.f || this.G.size() < 8) ? this.G.size() : Math.min(5, this.G.size());
                for (int i15 = 0; i15 < size2; i15++) {
                    long longValue2 = ((Long) this.G.get(i15)).longValue();
                    e00 e00Var5 = new e00(1, false);
                    e00Var5.g = false;
                    e00Var5.h = longValue2;
                    arrayList2.add(e00Var5);
                }
                if (size2 != this.G.size()) {
                    e00 b13 = e00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.G.size() - 5, new Object[0]), false);
                    final int i16 = 0;
                    b13.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                        public final /* synthetic */ n00 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    n00 n00Var = this.b;
                                    n00Var.f = true;
                                    n00Var.w0();
                                    break;
                                case 1:
                                    n00 n00Var2 = this.b;
                                    MessagesController.DialogFilter dialogFilter2 = n00Var2.r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.k10.U(n00Var2, dialogFilter2.id, new oz(n00Var2, 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        n00Var2.showDialog(b2Var);
                                        TextView textView = (TextView) b2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    n00.U(this.b);
                                    break;
                                case 3:
                                    this.b.u0(true);
                                    break;
                                case 4:
                                    n00 n00Var3 = this.b;
                                    n00Var3.e = true;
                                    n00Var3.w0();
                                    break;
                                default:
                                    this.b.u0(false);
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
        ArrayList arrayList3 = this.L;
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
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i17);
                e00 e00Var8 = new e00(7, false);
                e00Var8.m = tL_exportedChatlistInvite;
                arrayList2.add(e00Var8);
            }
            arrayList2.add(e00.d(dialogFilter.isChatlist() ? LocaleController.getString(R.string.FilterInviteLinksHintNew) : LocaleController.getString(R.string.FilterInviteLinksHint)));
        }
        if (!this.s) {
            e00 b14 = e00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            final int i18 = 1;
            b14.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                public final /* synthetic */ n00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            n00 n00Var = this.b;
                            n00Var.f = true;
                            n00Var.w0();
                            break;
                        case 1:
                            n00 n00Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = n00Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.k10.U(n00Var2, dialogFilter2.id, new oz(n00Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                n00Var2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            n00.U(this.b);
                            break;
                        case 3:
                            this.b.u0(true);
                            break;
                        case 4:
                            n00 n00Var3 = this.b;
                            n00Var3.e = true;
                            n00Var3.w0();
                            break;
                        default:
                            this.b.u0(false);
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
