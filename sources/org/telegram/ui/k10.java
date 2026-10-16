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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class k10 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public y00 I;
    public z00 J;
    public e10 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public nj R;
    public boolean S;
    public i2.i0 T;
    public bi.o0 a;
    public h10 b;
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

    public k10(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
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
        org.telegram.ui.Components.s5.s(this.currentAccount, z10);
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

    public static /* synthetic */ void U(k10 k10Var) {
        String str;
        k10Var.x = !k10Var.x;
        z00 z00Var = k10Var.J;
        if (z00Var != null) {
            org.telegram.ui.Cells.u3 u3Var = z00Var.r;
            if (k0(k10Var.w)) {
                str = LocaleController.getString(k10Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
            } else {
                str = null;
            }
            u3Var.setText(str);
        }
        org.telegram.ui.Components.s5.s(k10Var.currentAccount, k10Var.x);
        k10Var.i0(true);
        org.telegram.ui.ActionBar.k kVar = k10Var.actionBar;
        if (kVar != null) {
            if (kVar.getTitleTextView() != null) {
                k10Var.actionBar.getTitleTextView().setEmojiCacheType(k10Var.x ? 0 : 26);
            }
            if (k10Var.actionBar.getTitleTextView2() != null) {
                k10Var.actionBar.getTitleTextView2().setEmojiCacheType(k10Var.x ? 0 : 26);
            }
        }
    }

    public static void V(k10 k10Var) {
        MessagesController.DialogFilter dialogFilter = k10Var.r;
        if (!k10Var.v) {
            k10Var.finishFragment();
            return;
        }
        k10Var.v = false;
        Paint.FontMetricsInt titleFontMetricsInt = k10Var.actionBar.getTitleFontMetricsInt();
        k10Var.actionBar.J(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
    }

    public static void W(k10 k10Var) {
        MessagesController messagesController = k10Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = k10Var.r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < dialogFilter.alwaysShow.size(); i10++) {
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && g0(k10Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(k10Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (arrayList.size() > (k10Var.getUserConfig().isPremium() ? k10Var.getMessagesController().dialogFiltersChatsLimitPremium : k10Var.getMessagesController().dialogFiltersChatsLimitDefault)) {
            k10Var.showDialog(new sg.j0(4, k10Var.currentAccount, k10Var.getParentActivity(), k10Var, null));
            return;
        }
        if (arrayList.isEmpty()) {
            h00 h00Var = new h00(dialogFilter, null);
            h00Var.y = new k00(k10Var, 1);
            h00Var.x = new k00(k10Var, 2);
            k10Var.presentFragment(h00Var);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        k10Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new n00(k10Var, 1));
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
            org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.b6.class);
            if (b6VarArr != null && b6VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void p0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.m2 m2Var, Runnable runnable) {
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
            m2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            m2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        m2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = m2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = com.google.android.gms.internal.play_billing.k3.f(dialogFilters.get(i12).id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            m2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.Components.zc zcVar) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new sg.j0(4, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            org.telegram.messenger.sk.q(R.string.FolderLinkNoChatsError, zcVar, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.sk.q(R.string.FolderLinkOtherAdminLimitError, zcVar, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new sg.j0(5, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new sg.j0(12, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new sg.j0(13, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            org.telegram.messenger.sk.q(R.string.NoFolderFound, zcVar, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new sg.j0(4, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.sk.q(R.string.UnknownError, zcVar, null);
        } else {
            new sg.j0(3, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
        }
    }

    public static void t0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.m2 m2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (m2Var == null || m2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.a2 a2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(m2Var.getParentActivity(), 3, null);
            a2Var2.g0 = false;
            a2Var2.show();
            a2Var = a2Var2;
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
        MessagesController messagesController = m2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new bu(longSparseIntArray, 1));
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
                org.telegram.ui.ActionBar.a2 a2Var3 = a2Var;
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
                a2Var = a2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        m2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: org.telegram.ui.m00
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.a2 a2Var4 = a2Var;
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
                final org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.o00
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (!z22) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            org.telegram.ui.ActionBar.a2 a2Var5 = a2Var4;
                            if (a2Var5 != null) {
                                try {
                                    a2Var5.dismiss();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            k10.p0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, m2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        p0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, m2Var, null);
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
                    spannableString.setSpan(new q00(mutate, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                    Drawable mutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false), mode));
                    org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(mutate2, mutate3);
                    crVar.setBounds(0, 0, crVar.getIntrinsicWidth(), crVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(crVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean canBeginSlide() {
        return h0(true);
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 25));
        this.c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        ig.q1 q1Var = new ig.q1(context, null, 4);
        this.fragmentView = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false));
        bi.o0 o0Var = new bi.o0(this, context, 27);
        this.a = o0Var;
        o0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new s4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        q1Var.addView(this.a, w7.z5.d(-1.0f, -1));
        bi.o0 o0Var2 = this.a;
        h10 h10Var = new h10(this, context);
        this.b = h10Var;
        o0Var2.setAdapter(h10Var);
        this.a.setOnItemClickListener(new i(this, 10));
        this.a.setOnItemLongClickListener(new j00(this, 0));
        s4.k kVar2 = new s4.k();
        kVar2.m = false;
        kVar2.C = false;
        kVar2.o(org.telegram.ui.Components.es.h);
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
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new n00(this, 0));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.xa.class}, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 4, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
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
            alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new j00(this, 2));
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDiscardTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDiscardAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new j00(this, 3));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new j00(this, 4));
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

    @Override // org.telegram.ui.ActionBar.m2
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
                y00 y00Var = this.I;
                if (y00Var != null) {
                    y00Var.e(org.telegram.ui.Components.b6.cloneSpans(str, -1, y00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
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
            this.T = new i2.i0(this, z10, i10, 4);
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

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.e3 e3Var;
        e10 e10Var = this.K;
        if (e10Var == null || (e3Var = e10Var.b) == null || !e3Var.e) {
            return h0(z10);
        }
        if (!z10) {
            return false;
        }
        e3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        w0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.M != 0) {
            getConnectionsManager().cancelRequest(this.M, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        w0();
        i2.i0 i0Var = this.T;
        if (i0Var != null) {
            i0Var.run();
        }
    }

    public final void q0() {
        nj njVar = this.R;
        if (njVar != null) {
            njVar.b(true);
            this.R = null;
        }
        s0(new l00(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.w};
        t0(this.r, this.y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.x, this.E, this.F, this.G, this.H, this.s, false, this.h, true, z10, this, new org.telegram.ui.Components.n51(26, this, runnable));
    }

    public final void u0(boolean z10) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.y, z10 ? this.F : this.G, z10);
        usersSelectActivity.F = this.r.isChatlist();
        usersSelectActivity.n = new bi.h(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void v0(b10 b10Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        if (z10) {
            a2Var.R = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            a2Var.R = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new com.google.firebase.messaging.i(this, b10Var, z10, 7));
        showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.i00
            public final /* synthetic */ k10 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k10 k10Var = this.b;
                        k10Var.f = true;
                        k10Var.w0();
                        break;
                    case 1:
                        k10 k10Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = k10Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.o10.U(k10Var2, dialogFilter.id, new k00(k10Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k10Var2.getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(k10Var2, 1));
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            k10Var2.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                break;
                            }
                        }
                        break;
                    case 2:
                        k10.U(this.b);
                        break;
                    case 3:
                        this.b.u0(true);
                        break;
                    case 4:
                        k10 k10Var3 = this.b;
                        k10Var3.e = true;
                        k10Var3.w0();
                        break;
                    default:
                        this.b.u0(false);
                        break;
                }
            }
        };
        b10 b10Var = new b10(11, false);
        b10Var.d = string;
        b10Var.e = string2;
        b10Var.c = onClickListener;
        arrayList2.add(b10Var);
        this.d = arrayList2.size();
        arrayList2.add(new b10(2, false));
        arrayList2.add(b10.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        b10 b10Var2 = new b10(0, false);
        b10Var2.d = string3;
        arrayList2.add(b10Var2);
        b10 b10 = b10.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        final int i11 = 3;
        b10.c = new View.OnClickListener(this) { // from class: org.telegram.ui.i00
            public final /* synthetic */ k10 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k10 k10Var = this.b;
                        k10Var.f = true;
                        k10Var.w0();
                        break;
                    case 1:
                        k10 k10Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = k10Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.o10.U(k10Var2, dialogFilter.id, new k00(k10Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k10Var2.getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(k10Var2, 1));
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            k10Var2.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                break;
                            }
                        }
                        break;
                    case 2:
                        k10.U(this.b);
                        break;
                    case 3:
                        this.b.u0(true);
                        break;
                    case 4:
                        k10 k10Var3 = this.b;
                        k10Var3.e = true;
                        k10Var3.w0();
                        break;
                    default:
                        this.b.u0(false);
                        break;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(b10.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(b10.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(b10.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(b10.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(b10.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.F.isEmpty()) {
            int size = (this.e || this.F.size() < 8) ? this.F.size() : Math.min(5, this.F.size());
            for (int i12 = 0; i12 < size; i12++) {
                long longValue = ((Long) this.F.get(i12)).longValue();
                b10 b10Var3 = new b10(1, false);
                b10Var3.g = true;
                b10Var3.h = longValue;
                arrayList2.add(b10Var3);
            }
            if (size != this.F.size()) {
                b10 b11 = b10.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.F.size() - 5, new Object[0]), false);
                final int i13 = 4;
                b11.c = new View.OnClickListener(this) { // from class: org.telegram.ui.i00
                    public final /* synthetic */ k10 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                k10 k10Var = this.b;
                                k10Var.f = true;
                                k10Var.w0();
                                break;
                            case 1:
                                k10 k10Var2 = this.b;
                                MessagesController.DialogFilter dialogFilter = k10Var2.r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.o10.U(k10Var2, dialogFilter.id, new k00(k10Var2, 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k10Var2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(k10Var2, 1));
                                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                                    k10Var2.showDialog(a2Var);
                                    TextView textView = (TextView) a2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                k10.U(this.b);
                                break;
                            case 3:
                                this.b.u0(true);
                                break;
                            case 4:
                                k10 k10Var3 = this.b;
                                k10Var3.e = true;
                                k10Var3.w0();
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
        arrayList2.add(b10.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            b10 b10Var4 = new b10(0, false);
            b10Var4.d = string4;
            arrayList2.add(b10Var4);
            b10 b12 = b10.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            final int i14 = 5;
            b12.c = new View.OnClickListener(this) { // from class: org.telegram.ui.i00
                public final /* synthetic */ k10 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            k10 k10Var = this.b;
                            k10Var.f = true;
                            k10Var.w0();
                            break;
                        case 1:
                            k10 k10Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = k10Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.o10.U(k10Var2, dialogFilter2.id, new k00(k10Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k10Var2.getParentActivity());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(k10Var2, 1));
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                                k10Var2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            k10.U(this.b);
                            break;
                        case 3:
                            this.b.u0(true);
                            break;
                        case 4:
                            k10 k10Var3 = this.b;
                            k10Var3.e = true;
                            k10Var3.w0();
                            break;
                        default:
                            this.b.u0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(b10.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(b10.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(b10.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.G.isEmpty()) {
                int size2 = (this.f || this.G.size() < 8) ? this.G.size() : Math.min(5, this.G.size());
                for (int i15 = 0; i15 < size2; i15++) {
                    long longValue2 = ((Long) this.G.get(i15)).longValue();
                    b10 b10Var5 = new b10(1, false);
                    b10Var5.g = false;
                    b10Var5.h = longValue2;
                    arrayList2.add(b10Var5);
                }
                if (size2 != this.G.size()) {
                    b10 b13 = b10.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.G.size() - 5, new Object[0]), false);
                    final int i16 = 0;
                    b13.c = new View.OnClickListener(this) { // from class: org.telegram.ui.i00
                        public final /* synthetic */ k10 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    k10 k10Var = this.b;
                                    k10Var.f = true;
                                    k10Var.w0();
                                    break;
                                case 1:
                                    k10 k10Var2 = this.b;
                                    MessagesController.DialogFilter dialogFilter2 = k10Var2.r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.o10.U(k10Var2, dialogFilter2.id, new k00(k10Var2, 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k10Var2.getParentActivity());
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(k10Var2, 1));
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                                        k10Var2.showDialog(a2Var);
                                        TextView textView = (TextView) a2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    k10.U(this.b);
                                    break;
                                case 3:
                                    this.b.u0(true);
                                    break;
                                case 4:
                                    k10 k10Var3 = this.b;
                                    k10Var3.e = true;
                                    k10Var3.w0();
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
            arrayList2.add(b10.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new b10(9, false));
            arrayList2.add(new b10(10, false));
            arrayList2.add(b10.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            b10 b10Var6 = new b10(0, false);
            b10Var6.d = string5;
            b10Var6.f = true;
            arrayList2.add(b10Var6);
            arrayList2.add(b10.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(b10.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            b10 b10Var7 = new b10(0, false);
            b10Var7.d = string6;
            b10Var7.f = true;
            arrayList2.add(b10Var7);
            arrayList2.add(new b10(8, false));
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i17);
                b10 b10Var8 = new b10(7, false);
                b10Var8.m = tL_exportedChatlistInvite;
                arrayList2.add(b10Var8);
            }
            arrayList2.add(b10.d(dialogFilter.isChatlist() ? LocaleController.getString(R.string.FilterInviteLinksHintNew) : LocaleController.getString(R.string.FilterInviteLinksHint)));
        }
        if (!this.s) {
            b10 b14 = b10.b(0, LocaleController.getString(R.string.FilterDelete), true);
            final int i18 = 1;
            b14.c = new View.OnClickListener(this) { // from class: org.telegram.ui.i00
                public final /* synthetic */ k10 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            k10 k10Var = this.b;
                            k10Var.f = true;
                            k10Var.w0();
                            break;
                        case 1:
                            k10 k10Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = k10Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.o10.U(k10Var2, dialogFilter2.id, new k00(k10Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k10Var2.getParentActivity());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(k10Var2, 1));
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                                k10Var2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            k10.U(this.b);
                            break;
                        case 3:
                            this.b.u0(true);
                            break;
                        case 4:
                            k10 k10Var3 = this.b;
                            k10Var3.e = true;
                            k10Var3.w0();
                            break;
                        default:
                            this.b.u0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(b10.d(null));
        }
        h10 h10Var = this.b;
        if (h10Var != null) {
            h10Var.E(arrayList, arrayList2);
        }
    }
}
