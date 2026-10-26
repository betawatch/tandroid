package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
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
import java.util.HashSet;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o00 extends org.telegram.ui.ActionBar.r2 {
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public c00 I;
    public d00 J;
    public i00 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public bj R;
    public boolean S;
    public bi.u8 T;
    public int U;
    public int V;
    public int W;
    public bi.r1 a;
    public l00 b;
    public org.telegram.ui.ActionBar.u5 c;
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

    public o00(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
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
        org.telegram.ui.Components.t5.s(this.currentAccount, z10);
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

    public static CharSequence A0(int i10, CharSequence charSequence, boolean z10) {
        Context context;
        if (i10 >= 0) {
            if (!MessagesController.getGlobalMainSettings().getBoolean("n_" + i10, false) && (context = ApplicationLoader.applicationContext) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable mutate = context.getResources().getDrawable(R.drawable.msg_other_new_outline).mutate();
                    mutate.setBounds(0, -AndroidUtilities.dp(8.0f), mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight() - AndroidUtilities.dp(8.0f));
                    spannableString.setSpan(new vz(mutate, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                    Drawable mutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false), mode));
                    org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(mutate2, mutate3);
                    arVar.setBounds(0, 0, arVar.getIntrinsicWidth(), arVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(arVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static /* synthetic */ void V(o00 o00Var) {
        String str;
        o00Var.x = !o00Var.x;
        d00 d00Var = o00Var.J;
        if (d00Var != null) {
            org.telegram.ui.Cells.y3 y3Var = d00Var.r;
            if (m0(o00Var.w)) {
                str = LocaleController.getString(o00Var.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
            } else {
                str = null;
            }
            y3Var.setText(str);
        }
        org.telegram.ui.Components.t5.s(o00Var.currentAccount, o00Var.x);
        o00Var.k0(true);
        org.telegram.ui.ActionBar.r5 r5Var = o00Var.simpleActionBar;
        if (r5Var != null) {
            if (r5Var.getTitleTextView() != null) {
                o00Var.simpleActionBar.getTitleTextView().setEmojiCacheType(o00Var.x ? 0 : 26);
            }
            if (o00Var.simpleActionBar.getTitleTextView2() != null) {
                o00Var.simpleActionBar.getTitleTextView2().setEmojiCacheType(o00Var.x ? 0 : 26);
            }
        }
    }

    public static void W(o00 o00Var) {
        MessagesController.DialogFilter dialogFilter = o00Var.r;
        if (!o00Var.v) {
            o00Var.finishFragment();
            return;
        }
        o00Var.v = false;
        Paint.FontMetricsInt titleFontMetricsInt = o00Var.simpleActionBar.getTitleFontMetricsInt();
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt);
        org.telegram.ui.ActionBar.r5 r5Var = o00Var.simpleActionBar;
        r5Var.getClass();
        r5Var.w(replaceAnimatedEmoji, true, 220L, org.telegram.ui.Components.ds.h);
    }

    public static void X(o00 o00Var) {
        MessagesController messagesController = o00Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = o00Var.r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < dialogFilter.alwaysShow.size(); i10++) {
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && i0(o00Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(o00Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (arrayList.size() > (o00Var.getUserConfig().isPremium() ? o00Var.getMessagesController().dialogFiltersChatsLimitPremium : o00Var.getMessagesController().dialogFiltersChatsLimitDefault)) {
            o00Var.showDialog(new tg.j0(4, o00Var.currentAccount, o00Var.getParentActivity(), o00Var, null));
            return;
        }
        if (arrayList.isEmpty()) {
            lz lzVar = new lz(dialogFilter, null);
            lzVar.x = new oz(o00Var, 1);
            lzVar.w = new oz(o00Var, 2);
            o00Var.presentFragment(lzVar);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        o00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new rz(o00Var, 1));
    }

    public static boolean i0(TLRPC.Chat chat) {
        if (ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return ChatObject.isPublic(chat) && !chat.join_request;
    }

    public static boolean m0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.c6[] c6VarArr = (org.telegram.ui.Components.c6[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.c6.class);
            if (c6VarArr != null && c6VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void r0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.r2 r2Var, Runnable runnable) {
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
            r2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            r2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        r2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = r2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = c3.h0.i(dialogFilters.get(i12).id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            r2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void t0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.Components.wc wcVar) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new tg.j0(4, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            org.telegram.messenger.vh.n(R.string.FolderLinkNoChatsError, wcVar, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.vh.n(R.string.FolderLinkOtherAdminLimitError, wcVar, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new tg.j0(5, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new tg.j0(12, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new tg.j0(13, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            org.telegram.messenger.vh.n(R.string.NoFolderFound, wcVar, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new tg.j0(4, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.vh.n(R.string.UnknownError, wcVar, null);
        } else {
            new tg.j0(3, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
        }
    }

    public static void v0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.r2 r2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (r2Var == null || r2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.e2 e2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(r2Var.getParentActivity(), 3, null);
            e2Var2.i0 = false;
            e2Var2.show();
            e2Var = e2Var2;
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
        MessagesController messagesController = r2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new kt(longSparseIntArray, 1));
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
                org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
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
                e2Var = e2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        r2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: org.telegram.ui.qz
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
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
                final org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.tz
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (!z22) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var4;
                            if (e2Var5 != null) {
                                try {
                                    e2Var5.dismiss();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            o00.r0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, r2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        r0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, r2Var, null);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        return j0(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.s;
        MessagesController.DialogFilter dialogFilter = this.r;
        if (z10) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
            if (r5Var != null) {
                if (r5Var.getTitleTextView() != null) {
                    this.simpleActionBar.getTitleTextView().setEmojiCacheType(this.x ? 0 : 26);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    this.simpleActionBar.getTitleTextView2().setEmojiCacheType(this.x ? 0 : 26);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 28));
        this.c = this.simpleActionBar.i(LocaleController.getString(this.s ? R.string.Create : R.string.Save));
        jg.r1 r1Var = new jg.r1(context, null, 4);
        this.fragmentView = r1Var;
        bi.r1 r1Var2 = new bi.r1(this, context, 28);
        this.a = r1Var2;
        r1Var2.u1();
        this.a.setLayoutManager(new s4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        r1Var.addView(this.a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        bi.r1 r1Var3 = this.a;
        l00 l00Var = new l00(this, context);
        this.b = l00Var;
        r1Var3.setAdapter(l00Var);
        this.a.setOnItemClickListener(new h(this, 10));
        this.a.setOnItemLongClickListener(new nz(this, 0));
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.n(350L);
        this.a.setItemAnimator(lVar);
        this.a.setOnScrollListener(new i3(this, 11));
        k0(false);
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

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 16, new Class[]{org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.ab.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z10) {
        if (!this.c.w.f) {
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

    public final void k0(boolean z10) {
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
        this.c.a(z12, z10);
    }

    public final void l0() {
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
                c00 c00Var = this.I;
                if (c00Var != null) {
                    c00Var.e(org.telegram.ui.Components.c6.cloneSpans(str, -1, c00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.e1 K = this.a.K(this.d);
                if (K != null) {
                    this.b.y(K);
                }
            }
        }
    }

    public final void n0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
            y0();
        }
    }

    public final void o0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        y0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.b3 b3Var;
        i00 i00Var = this.K;
        if (i00Var == null || (b3Var = i00Var.b) == null || !b3Var.e) {
            return j0(z10);
        }
        if (!z10) {
            return false;
        }
        b3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        y0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.M != 0) {
            getConnectionsManager().cancelRequest(this.M, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        y0();
        bi.u8 u8Var = this.T;
        if (u8Var != null) {
            u8Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.b3 b3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            z0();
            try {
                i00 i00Var = this.K;
                if (i00Var != null && (b3Var = i00Var.b) != null && b3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Oh)) != this.U) {
                    this.U = themedColor;
                    this.K.b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void p0(int i10, boolean z10) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.S && (dialogFilter = this.r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.S = true;
            this.T = new bi.u8(this, z10, i10, 6);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void q0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
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
                p0(size, false);
            }
        } else if (size > 0 && size > i10) {
            p0(size, true);
        } else if (i10 > 0) {
            p0(i10, false);
        }
    }

    public final void s0() {
        bj bjVar = this.R;
        if (bjVar != null) {
            bjVar.b(true);
            this.R = null;
        }
        u0(new pz(this, 0), true);
    }

    public final void u0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.w};
        v0(this.r, this.y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), !this.x, this.E, this.F, this.G, this.H, this.s, false, this.h, true, z10, this, new sz(1, this, runnable));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0(boolean z10) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.y, z10 ? this.F : this.G, z10);
        usersSelectActivity.F = this.r.isChatlist();
        usersSelectActivity.n = new di.f(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void x0(f00 f00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        if (z10) {
            e2Var.R = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            e2Var.R = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new bi.z3(this, f00Var, z10, 8));
        showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    public final void y0() {
        ArrayList arrayList = this.O;
        arrayList.clear();
        ArrayList arrayList2 = this.P;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string = LocaleController.getString(R.string.FilterNameHeader);
        String string2 = m0(this.w) ? LocaleController.getString(this.x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable) : null;
        final int i10 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
            public final /* synthetic */ o00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        o00 o00Var = this.b;
                        o00Var.f = true;
                        o00Var.y0();
                        break;
                    case 1:
                        o00 o00Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = o00Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.n10.U(o00Var2, dialogFilter.id, new oz(o00Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o00Var2.getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(o00Var2, 1));
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            o00Var2.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        o00.V(this.b);
                        break;
                    case 3:
                        this.b.w0(true);
                        break;
                    case 4:
                        o00 o00Var3 = this.b;
                        o00Var3.e = true;
                        o00Var3.y0();
                        break;
                    default:
                        this.b.w0(false);
                        break;
                }
            }
        };
        f00 f00Var = new f00(11, false);
        f00Var.d = string;
        f00Var.e = string2;
        f00Var.c = onClickListener;
        arrayList2.add(f00Var);
        this.d = arrayList2.size();
        arrayList2.add(new f00(2, false));
        arrayList2.add(f00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        f00 f00Var2 = new f00(0, false);
        f00Var2.d = string3;
        arrayList2.add(f00Var2);
        f00 b10 = f00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        final int i11 = 3;
        b10.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
            public final /* synthetic */ o00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o00 o00Var = this.b;
                        o00Var.f = true;
                        o00Var.y0();
                        break;
                    case 1:
                        o00 o00Var2 = this.b;
                        MessagesController.DialogFilter dialogFilter = o00Var2.r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.n10.U(o00Var2, dialogFilter.id, new oz(o00Var2, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o00Var2.getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(o00Var2, 1));
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            o00Var2.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        o00.V(this.b);
                        break;
                    case 3:
                        this.b.w0(true);
                        break;
                    case 4:
                        o00 o00Var3 = this.b;
                        o00Var3.e = true;
                        o00Var3.y0();
                        break;
                    default:
                        this.b.w0(false);
                        break;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(f00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(f00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(f00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(f00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(f00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.F.isEmpty()) {
            int size = (this.e || this.F.size() < 8) ? this.F.size() : Math.min(5, this.F.size());
            for (int i12 = 0; i12 < size; i12++) {
                long longValue = ((Long) this.F.get(i12)).longValue();
                f00 f00Var3 = new f00(1, false);
                f00Var3.g = true;
                f00Var3.h = longValue;
                arrayList2.add(f00Var3);
            }
            if (size != this.F.size()) {
                f00 b11 = f00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.F.size() - 5, new Object[0]), false);
                final int i13 = 4;
                b11.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                    public final /* synthetic */ o00 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                o00 o00Var = this.b;
                                o00Var.f = true;
                                o00Var.y0();
                                break;
                            case 1:
                                o00 o00Var2 = this.b;
                                MessagesController.DialogFilter dialogFilter = o00Var2.r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.n10.U(o00Var2, dialogFilter.id, new oz(o00Var2, 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o00Var2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(o00Var2, 1));
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                    o00Var2.showDialog(e2Var);
                                    TextView textView = (TextView) e2Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                o00.V(this.b);
                                break;
                            case 3:
                                this.b.w0(true);
                                break;
                            case 4:
                                o00 o00Var3 = this.b;
                                o00Var3.e = true;
                                o00Var3.y0();
                                break;
                            default:
                                this.b.w0(false);
                                break;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(f00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            f00 f00Var4 = new f00(0, false);
            f00Var4.d = string4;
            arrayList2.add(f00Var4);
            f00 b12 = f00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            final int i14 = 5;
            b12.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                public final /* synthetic */ o00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            o00 o00Var = this.b;
                            o00Var.f = true;
                            o00Var.y0();
                            break;
                        case 1:
                            o00 o00Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = o00Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.n10.U(o00Var2, dialogFilter2.id, new oz(o00Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o00Var2.getParentActivity());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(o00Var2, 1));
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                o00Var2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            o00.V(this.b);
                            break;
                        case 3:
                            this.b.w0(true);
                            break;
                        case 4:
                            o00 o00Var3 = this.b;
                            o00Var3.e = true;
                            o00Var3.y0();
                            break;
                        default:
                            this.b.w0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(f00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(f00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(f00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.G.isEmpty()) {
                int size2 = (this.f || this.G.size() < 8) ? this.G.size() : Math.min(5, this.G.size());
                for (int i15 = 0; i15 < size2; i15++) {
                    long longValue2 = ((Long) this.G.get(i15)).longValue();
                    f00 f00Var5 = new f00(1, false);
                    f00Var5.g = false;
                    f00Var5.h = longValue2;
                    arrayList2.add(f00Var5);
                }
                if (size2 != this.G.size()) {
                    f00 b13 = f00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.G.size() - 5, new Object[0]), false);
                    final int i16 = 0;
                    b13.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                        public final /* synthetic */ o00 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    o00 o00Var = this.b;
                                    o00Var.f = true;
                                    o00Var.y0();
                                    break;
                                case 1:
                                    o00 o00Var2 = this.b;
                                    MessagesController.DialogFilter dialogFilter2 = o00Var2.r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.n10.U(o00Var2, dialogFilter2.id, new oz(o00Var2, 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o00Var2.getParentActivity());
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(o00Var2, 1));
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                        o00Var2.showDialog(e2Var);
                                        TextView textView = (TextView) e2Var.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    o00.V(this.b);
                                    break;
                                case 3:
                                    this.b.w0(true);
                                    break;
                                case 4:
                                    o00 o00Var3 = this.b;
                                    o00Var3.e = true;
                                    o00Var3.y0();
                                    break;
                                default:
                                    this.b.w0(false);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(f00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new f00(9, false));
            arrayList2.add(new f00(10, false));
            arrayList2.add(f00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            f00 f00Var6 = new f00(0, false);
            f00Var6.d = string5;
            f00Var6.f = true;
            arrayList2.add(f00Var6);
            arrayList2.add(f00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(f00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            f00 f00Var7 = new f00(0, false);
            f00Var7.d = string6;
            f00Var7.f = true;
            arrayList2.add(f00Var7);
            arrayList2.add(new f00(8, false));
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i17);
                f00 f00Var8 = new f00(7, false);
                f00Var8.m = tL_exportedChatlistInvite;
                arrayList2.add(f00Var8);
            }
            arrayList2.add(f00.d(dialogFilter.isChatlist() ? LocaleController.getString(R.string.FilterInviteLinksHintNew) : LocaleController.getString(R.string.FilterInviteLinksHint)));
        }
        if (!this.s) {
            f00 b14 = f00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            final int i18 = 1;
            b14.c = new View.OnClickListener(this) { // from class: org.telegram.ui.mz
                public final /* synthetic */ o00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            o00 o00Var = this.b;
                            o00Var.f = true;
                            o00Var.y0();
                            break;
                        case 1:
                            o00 o00Var2 = this.b;
                            MessagesController.DialogFilter dialogFilter2 = o00Var2.r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.n10.U(o00Var2, dialogFilter2.id, new oz(o00Var2, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o00Var2.getParentActivity());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(o00Var2, 1));
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                o00Var2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            o00.V(this.b);
                            break;
                        case 3:
                            this.b.w0(true);
                            break;
                        case 4:
                            o00 o00Var3 = this.b;
                            o00Var3.e = true;
                            o00Var3.y0();
                            break;
                        default:
                            this.b.w0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(f00.d(null));
        }
        l00 l00Var = this.b;
        if (l00Var != null) {
            l00Var.E(arrayList, arrayList2);
        }
    }

    public final void z0() {
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.il, false);
            if (x02 == this.V && x03 == this.W) {
                return;
            }
            this.V = x02;
            this.W = x03;
            int i10 = 0;
            while (i10 < 4) {
                int childCount = i10 == 0 ? this.a.getChildCount() : i10 == 1 ? this.a.getHiddenChildCount() : i10 == 2 ? this.a.getCachedChildCount() : this.a.getAttachedScrapChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = i10 == 0 ? this.a.getChildAt(i11) : i10 == 1 ? this.a.V(i11) : i10 == 2 ? this.a.P(i11) : this.a.O(i11);
                    if (childAt instanceof org.telegram.ui.Cells.ab) {
                        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) childAt;
                        abVar.a0 = true;
                        abVar.Q = x02;
                        abVar.R = x03;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.ab) childAt).i(0);
                        }
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
    }
}
