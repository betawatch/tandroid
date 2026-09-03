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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c10 extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public ArrayList C;
    public ArrayList D;
    public final LongSparseIntArray E;
    public q00 F;
    public r00 G;
    public w00 H;
    public final ArrayList I;
    public int J;
    public boolean K;
    public final ArrayList L;
    public final ArrayList M;
    public float N;
    public gj O;
    public boolean P;
    public lh.n6 Q;
    public lh.e1 a;
    public z00 b;
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

    public c10(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.x = true;
        this.I = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = -5.0f;
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
        boolean z4 = !this.r.title_noanimate;
        this.x = z4;
        org.telegram.ui.Components.l5.s(this.currentAccount, z4);
        MessagesController.DialogFilter dialogFilter4 = this.r;
        this.y = dialogFilter4.flags;
        this.B = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.r.alwaysShow);
        this.C = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.D = new ArrayList(this.r.neverShow);
        this.E = this.r.pinnedDialogs.clone();
    }

    public static /* synthetic */ void U(c10 c10Var) {
        String str;
        c10Var.x = !c10Var.x;
        r00 r00Var = c10Var.G;
        if (r00Var != null) {
            org.telegram.ui.Cells.s3 s3Var = r00Var.r;
            if (k0(c10Var.w)) {
                str = LocaleController.getString(c10Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
            } else {
                str = null;
            }
            s3Var.setText(str);
        }
        org.telegram.ui.Components.l5.s(c10Var.currentAccount, c10Var.x);
        c10Var.i0(true);
        org.telegram.ui.ActionBar.k kVar = c10Var.actionBar;
        if (kVar != null) {
            if (kVar.getTitleTextView() != null) {
                c10Var.actionBar.getTitleTextView().setEmojiCacheType(c10Var.x ? 0 : 26);
            }
            if (c10Var.actionBar.getTitleTextView2() != null) {
                c10Var.actionBar.getTitleTextView2().setEmojiCacheType(c10Var.x ? 0 : 26);
            }
        }
    }

    public static void V(c10 c10Var) {
        MessagesController.DialogFilter dialogFilter = c10Var.r;
        if (!c10Var.v) {
            c10Var.finishFragment();
            return;
        }
        c10Var.v = false;
        Paint.FontMetricsInt titleFontMetricsInt = c10Var.actionBar.getTitleFontMetricsInt();
        c10Var.actionBar.I(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
    }

    public static void W(c10 c10Var) {
        MessagesController messagesController = c10Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = c10Var.r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < dialogFilter.alwaysShow.size(); i10++) {
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && g0(c10Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(c10Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (arrayList.size() > (c10Var.getUserConfig().isPremium() ? c10Var.getMessagesController().dialogFiltersChatsLimitPremium : c10Var.getMessagesController().dialogFiltersChatsLimitDefault)) {
            c10Var.showDialog(new eg.v0(4, c10Var.currentAccount, c10Var.getParentActivity(), c10Var, null));
            return;
        }
        if (arrayList.isEmpty()) {
            a00 a00Var = new a00(dialogFilter, null);
            a00Var.y = new d00(c10Var, 1);
            a00Var.x = new d00(c10Var, 2);
            c10Var.presentFragment(a00Var);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        c10Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new g00(c10Var, 1));
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
            org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.u5.class);
            if (u5VarArr != null && u5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void p0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z4, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z10, boolean z11, boolean z12, boolean z13, org.telegram.ui.ActionBar.p2 p2Var, Runnable runnable) {
        if (dialogFilter.flags != i10 || z12) {
            dialogFilter.pendingUnreadCount = -1;
            if (z13) {
                dialogFilter.unreadCount = -1;
            }
        }
        dialogFilter.flags = i10;
        dialogFilter.name = str;
        dialogFilter.entities = arrayList;
        dialogFilter.color = i11;
        dialogFilter.neverShow = arrayList3;
        dialogFilter.alwaysShow = arrayList2;
        dialogFilter.title_noanimate = z4;
        if (z10) {
            p2Var.getMessagesController().addFilter(dialogFilter, z11);
        } else {
            p2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        p2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z11, true);
        if (z11) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = p2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = ai.d(dialogFilters.get(i12).id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            p2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.Components.qc qcVar) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new eg.v0(4, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            org.telegram.messenger.y3.s(R.string.FolderLinkNoChatsError, qcVar, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.y3.s(R.string.FolderLinkOtherAdminLimitError, qcVar, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new eg.v0(5, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new eg.v0(12, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new eg.v0(13, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            org.telegram.messenger.y3.s(R.string.NoFolderFound, qcVar, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new eg.v0(4, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.y3.s(R.string.UnknownError, qcVar, null);
        } else {
            new eg.v0(3, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
        }
    }

    public static void t0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z4, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final org.telegram.ui.ActionBar.p2 p2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.d2 d2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z14) {
            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(p2Var.getParentActivity(), 3, null);
            d2Var2.d0 = false;
            d2Var2.show();
            d2Var = d2Var2;
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
        tL_dialogFilter2.title_noanimate = z4;
        if (i11 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= TLObject.FLAG_27;
            tL_dialogFilter2.color = i11;
        }
        MessagesController messagesController = p2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new vt(longSparseIntArray, 1));
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
                Long l10 = (Long) arrayList5.get(i13);
                org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                int i17 = size2;
                long longValue = l10.longValue();
                if ((i16 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !DialogObject.isEncryptedDialog(longValue)) {
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
                i13++;
                d2Var = d2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        p2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: org.telegram.ui.f00
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z15 = z14;
                final org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                final MessagesController.DialogFilter dialogFilter2 = dialogFilter;
                final int i18 = i10;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z16 = z4;
                final int i19 = i11;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z17 = z10;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.h00
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z21 = z15;
                        Runnable runnable3 = runnable2;
                        if (!z21) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var4;
                            if (d2Var5 != null) {
                                try {
                                    d2Var5.dismiss();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            c10.p0(dialogFilter2, i18, str2, arrayList7, z16, i19, arrayList8, arrayList9, z17, z18, z19, z20, p2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z14) {
            return;
        }
        p0(dialogFilter, i10, str, arrayList, z4, i11, arrayList2, arrayList3, z10, z11, z12, z13, p2Var, null);
    }

    public static CharSequence x0(int i10, CharSequence charSequence, boolean z4) {
        Context context;
        if (i10 >= 0) {
            if (!MessagesController.getGlobalMainSettings().getBoolean("n_" + i10, false) && (context = ApplicationLoader.applicationContext) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z4) {
                    Drawable mutate = context.getResources().getDrawable(R.drawable.msg_other_new_outline).mutate();
                    mutate.setBounds(0, -AndroidUtilities.dp(8.0f), mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight() - AndroidUtilities.dp(8.0f));
                    spannableString.setSpan(new j00(mutate, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                    Drawable mutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), mode));
                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(mutate2, mutate3);
                    mqVar.setBounds(0, 0, mqVar.getIntrinsicWidth(), mqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(mqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        return h0(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        boolean z4 = this.s;
        MessagesController.DialogFilter dialogFilter = this.r;
        if (z4) {
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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 10));
        this.c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        org.telegram.ui.Components.z51 z51Var = new org.telegram.ui.Components.z51(context, null, 3);
        this.fragmentView = z51Var;
        z51Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        lh.e1 e1Var = new lh.e1(this, context, 25);
        this.a = e1Var;
        e1Var.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new f2.i0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        z51Var.addView(this.a, k7.b6.c(-1.0f, -1));
        lh.e1 e1Var2 = this.a;
        z00 z00Var = new z00(this, context);
        this.b = z00Var;
        e1Var2.setAdapter(z00Var);
        this.a.setOnItemClickListener(new j(this, 9));
        this.a.setOnItemLongClickListener(new c00(this, 0));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.n(350L);
        this.a.setItemAnimator(lVar);
        this.a.setOnScrollListener(new n3(this, 10));
        i0(false);
        if (!this.K && dialogFilter != null && dialogFilter.isChatlist()) {
            this.K = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
            this.J = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new g00(this, 0));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.n8.class, org.telegram.ui.Cells.ua.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    public final boolean h0(boolean z4) {
        if (this.c.getAlpha() != 1.0f) {
            return true;
        }
        if (!z4) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        if (this.s) {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDiscardNewTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDiscardNewAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new c00(this, 2));
        } else {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDiscardTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDiscardAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new c00(this, 3));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new c00(this, 4));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    public final void i0(boolean z4) {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.w) && this.w.length() <= 12;
        if (z11) {
            z11 = ((this.y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.C.isEmpty()) ? false : true;
            if (z11 && !this.s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.r;
                if (dialogFilter.alwaysShow.size() != this.C.size()) {
                    this.h = true;
                }
                if (dialogFilter.neverShow.size() != this.D.size()) {
                    this.h = true;
                }
                if (dialogFilter.color != this.B) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(dialogFilter.alwaysShow);
                    Collections.sort(this.C);
                    if (!dialogFilter.alwaysShow.equals(this.C)) {
                        this.h = true;
                    }
                    Collections.sort(dialogFilter.neverShow);
                    Collections.sort(this.D);
                    if (!dialogFilter.neverShow.equals(this.D)) {
                        this.h = true;
                    }
                }
                if (dialogFilter.title_noanimate == (!this.x) && TextUtils.equals(dialogFilter.name, this.w) && dialogFilter.flags == this.y) {
                    z10 = this.h;
                }
                z11 = z10;
            }
        }
        if (this.c.isEnabled() == z11) {
            return;
        }
        this.c.setEnabled(z11);
        if (z4) {
            this.c.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.0f).scaleY(z11 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.c.setAlpha(z11 ? 1.0f : 0.0f);
        this.c.setScaleX(z11 ? 1.0f : 0.0f);
        this.c.setScaleY(z11 ? 1.0f : 0.0f);
    }

    @Override // org.telegram.ui.ActionBar.p2
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
                q00 q00Var = this.F;
                if (q00Var != null) {
                    q00Var.e(org.telegram.ui.Components.u5.cloneSpans(str, -1, q00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                f2.l1 K = this.a.K(this.d);
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
            arrayList = this.I;
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
            arrayList = this.I;
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

    public final void n0(int i10, boolean z4) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.P && (dialogFilter = this.r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.P = true;
            this.Q = new lh.n6(this, z4, i10, 3);
            if (getLayoutContainer() != null) {
                this.Q.run();
                this.Q = null;
            }
        }
    }

    public final void o0(ArrayList arrayList, ArrayList arrayList2, boolean z4) {
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
        if (!z4) {
            if (size > 0) {
                n0(size, false);
            }
        } else if (size > 0 && size > i10) {
            n0(size, true);
        } else if (i10 > 0) {
            n0(i10, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Cells.c3 c3Var;
        w00 w00Var = this.H;
        if (w00Var == null || (c3Var = w00Var.b) == null || !c3Var.e) {
            return h0(z4);
        }
        if (!z4) {
            return false;
        }
        c3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        w0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.J != 0) {
            getConnectionsManager().cancelRequest(this.J, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        w0();
        lh.n6 n6Var = this.Q;
        if (n6Var != null) {
            n6Var.run();
        }
    }

    public final void q0() {
        gj gjVar = this.O;
        if (gjVar != null) {
            gjVar.b(true);
            this.O = null;
        }
        s0(new e00(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z4) {
        CharSequence[] charSequenceArr = {this.w};
        t0(this.r, this.y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.x, this.B, this.C, this.D, this.E, this.s, false, this.h, true, z4, this, new org.telegram.ui.Components.k41(26, this, runnable));
    }

    public final void u0(boolean z4) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.y, z4 ? this.C : this.D, z4);
        usersSelectActivity.C = this.r.isChatlist();
        usersSelectActivity.n = new ih.q(7, this, z4);
        presentFragment(usersSelectActivity);
    }

    public final void v0(t00 t00Var, CharSequence charSequence, Object obj, boolean z4) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z4) {
            d2Var.O = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            d2Var.O = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new com.google.firebase.messaging.i(this, t00Var, z4, 7));
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public final void w0() {
        ArrayList arrayList = this.L;
        arrayList.clear();
        ArrayList arrayList2 = this.M;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string = LocaleController.getString(R.string.FilterNameHeader);
        String string2 = k0(this.w) ? LocaleController.getString(this.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable) : null;
        final int i10 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.b00
            public final /* synthetic */ c10 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        c10 c10Var = this.b;
                        c10Var.f = true;
                        c10Var.w0();
                        break;
                    case 1:
                        c10 c10Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = c10Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.d10.T(c10Var2, dialogFilter.id, new d00(c10Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new c00(c10Var2, 1));
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            c10Var2.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                break;
                            }
                        }
                        break;
                    case 2:
                        c10.U(this.b);
                        break;
                    case 3:
                        this.b.u0(true);
                        break;
                    case 4:
                        c10 c10Var3 = this.b;
                        c10Var3.e = true;
                        c10Var3.w0();
                        break;
                    default:
                        this.b.u0(false);
                        break;
                }
            }
        };
        t00 t00Var = new t00(11, false);
        t00Var.d = string;
        t00Var.e = string2;
        t00Var.c = onClickListener;
        arrayList2.add(t00Var);
        this.d = arrayList2.size();
        arrayList2.add(new t00(2, false));
        arrayList2.add(t00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        t00 t00Var2 = new t00(0, false);
        t00Var2.d = string3;
        arrayList2.add(t00Var2);
        t00 b10 = t00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        final int i11 = 3;
        b10.c = new View.OnClickListener(this) { // from class: org.telegram.ui.b00
            public final /* synthetic */ c10 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c10 c10Var = this.b;
                        c10Var.f = true;
                        c10Var.w0();
                        break;
                    case 1:
                        c10 c10Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = c10Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.d10.T(c10Var2, dialogFilter.id, new d00(c10Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new c00(c10Var2, 1));
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            c10Var2.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                break;
                            }
                        }
                        break;
                    case 2:
                        c10.U(this.b);
                        break;
                    case 3:
                        this.b.u0(true);
                        break;
                    case 4:
                        c10 c10Var3 = this.b;
                        c10Var3.e = true;
                        c10Var3.w0();
                        break;
                    default:
                        this.b.u0(false);
                        break;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.C.isEmpty()) {
            int size = (this.e || this.C.size() < 8) ? this.C.size() : Math.min(5, this.C.size());
            for (int i12 = 0; i12 < size; i12++) {
                long longValue = ((Long) this.C.get(i12)).longValue();
                t00 t00Var3 = new t00(1, false);
                t00Var3.g = true;
                t00Var3.h = longValue;
                arrayList2.add(t00Var3);
            }
            if (size != this.C.size()) {
                t00 b11 = t00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.C.size() - 5, new Object[0]), false);
                final int i13 = 4;
                b11.c = new View.OnClickListener(this) { // from class: org.telegram.ui.b00
                    public final /* synthetic */ c10 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                c10 c10Var = this.b;
                                c10Var.f = true;
                                c10Var.w0();
                                break;
                            case 1:
                                c10 c10Var2 = this.b;
                                MessagesController.DialogFilter dialogFilter = c10Var2.r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(c10Var2, dialogFilter.id, new d00(c10Var2, 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new c00(c10Var2, 1));
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                    c10Var2.showDialog(d2Var);
                                    TextView textView = (TextView) d2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                c10.U(this.b);
                                break;
                            case 3:
                                this.b.u0(true);
                                break;
                            case 4:
                                c10 c10Var3 = this.b;
                                c10Var3.e = true;
                                c10Var3.w0();
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
        arrayList2.add(t00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            t00 t00Var4 = new t00(0, false);
            t00Var4.d = string4;
            arrayList2.add(t00Var4);
            t00 b12 = t00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            final int i14 = 5;
            b12.c = new View.OnClickListener(this) { // from class: org.telegram.ui.b00
                public final /* synthetic */ c10 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            c10 c10Var = this.b;
                            c10Var.f = true;
                            c10Var.w0();
                            break;
                        case 1:
                            c10 c10Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = c10Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.d10.T(c10Var2, dialogFilter2.id, new d00(c10Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                                alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new c00(c10Var2, 1));
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                c10Var2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            c10.U(this.b);
                            break;
                        case 3:
                            this.b.u0(true);
                            break;
                        case 4:
                            c10 c10Var3 = this.b;
                            c10Var3.e = true;
                            c10Var3.w0();
                            break;
                        default:
                            this.b.u0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.D.isEmpty()) {
                int size2 = (this.f || this.D.size() < 8) ? this.D.size() : Math.min(5, this.D.size());
                for (int i15 = 0; i15 < size2; i15++) {
                    long longValue2 = ((Long) this.D.get(i15)).longValue();
                    t00 t00Var5 = new t00(1, false);
                    t00Var5.g = false;
                    t00Var5.h = longValue2;
                    arrayList2.add(t00Var5);
                }
                if (size2 != this.D.size()) {
                    t00 b13 = t00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.D.size() - 5, new Object[0]), false);
                    final int i16 = 0;
                    b13.c = new View.OnClickListener(this) { // from class: org.telegram.ui.b00
                        public final /* synthetic */ c10 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    c10 c10Var = this.b;
                                    c10Var.f = true;
                                    c10Var.w0();
                                    break;
                                case 1:
                                    c10 c10Var2 = this.b;
                                    MessagesController.DialogFilter dialogFilter2 = c10Var2.r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.d10.T(c10Var2, dialogFilter2.id, new d00(c10Var2, 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                                        alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
                                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new c00(c10Var2, 1));
                                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                        c10Var2.showDialog(d2Var);
                                        TextView textView = (TextView) d2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    c10.U(this.b);
                                    break;
                                case 3:
                                    this.b.u0(true);
                                    break;
                                case 4:
                                    c10 c10Var3 = this.b;
                                    c10Var3.e = true;
                                    c10Var3.w0();
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
            arrayList2.add(t00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new t00(9, false));
            arrayList2.add(new t00(10, false));
            arrayList2.add(t00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.I;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            t00 t00Var6 = new t00(0, false);
            t00Var6.d = string5;
            t00Var6.f = true;
            arrayList2.add(t00Var6);
            arrayList2.add(t00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(t00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            t00 t00Var7 = new t00(0, false);
            t00Var7.d = string6;
            t00Var7.f = true;
            arrayList2.add(t00Var7);
            arrayList2.add(new t00(8, false));
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i17);
                t00 t00Var8 = new t00(7, false);
                t00Var8.m = tL_exportedChatlistInvite;
                arrayList2.add(t00Var8);
            }
            arrayList2.add(t00.d(dialogFilter.isChatlist() ? LocaleController.getString(R.string.FilterInviteLinksHintNew) : LocaleController.getString(R.string.FilterInviteLinksHint)));
        }
        if (!this.s) {
            t00 b14 = t00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            final int i18 = 1;
            b14.c = new View.OnClickListener(this) { // from class: org.telegram.ui.b00
                public final /* synthetic */ c10 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            c10 c10Var = this.b;
                            c10Var.f = true;
                            c10Var.w0();
                            break;
                        case 1:
                            c10 c10Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = c10Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.d10.T(c10Var2, dialogFilter2.id, new d00(c10Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                                alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new c00(c10Var2, 1));
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                c10Var2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            c10.U(this.b);
                            break;
                        case 3:
                            this.b.u0(true);
                            break;
                        case 4:
                            c10 c10Var3 = this.b;
                            c10Var3.e = true;
                            c10Var3.w0();
                            break;
                        default:
                            this.b.u0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(t00.d(null));
        }
        z00 z00Var = this.b;
        if (z00Var != null) {
            z00Var.E(arrayList, arrayList2);
        }
    }
}
