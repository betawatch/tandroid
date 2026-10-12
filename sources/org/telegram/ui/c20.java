package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c20 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final SpannableStringBuilder[] s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.m2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final u10 S;
    public final v10 T;
    public final a20 U;
    public final x10 V;
    public final z10 W;
    public final ne.b a;
    public final x10 a0;
    public final bi.o0 b;
    public final x10 b0;
    public final org.telegram.ui.Components.wx0 c;
    public final ArrayList c0;
    public org.telegram.ui.Components.lm0 d;
    public final ArrayList d0;
    public m10 e;
    public boolean e0;
    public final ArrayList f;
    public final a6 f0;
    public final p10 g0;
    public final SparseArray h;
    public t10 h0;
    public org.telegram.ui.Components.vo0 i0;
    public final s4.b0 j0;
    public final q10 k0;
    public final AnimationNotificationsLocker l0;
    public final bi.d4 m0;
    public final ArrayList n;
    public final zz n0;
    public b20 o0;
    public boolean p0;
    public int q0;
    public final HashMap r;
    public boolean r0;
    public int s;
    public int v;
    public String w;
    public String x;
    public hg.p0 y;

    public c20(org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getParentActivity());
        this.a = new ne.b(0, this, org.telegram.ui.Components.es.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.S = new u10(0, 0L);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.f0 = new a6(this, 4);
        this.g0 = new p10(this);
        this.l0 = new AnimationNotificationsLocker();
        this.n0 = new zz(this, 1);
        this.L = m2Var;
        Activity parentActivity = m2Var.getParentActivity();
        this.K = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        bi.o0 o0Var = new bi.o0(this, parentActivity, 28);
        this.b = o0Var;
        o0Var.setOnItemClickListener(new i(this, 12));
        o0Var.setOnItemLongClickListener(new g(this, 16));
        s4.b0 b0Var = new s4.b0();
        this.j0 = b0Var;
        o0Var.setLayoutManager(b0Var);
        q10 q10Var = new q10(this, parentActivity, 0);
        this.k0 = q10Var;
        addView(q10Var);
        addView(o0Var);
        o0Var.setSectionsType(2);
        o0Var.setSkipDrawSection(true);
        o0Var.setOnScrollListener(new r10(this));
        bi.d4 d4Var = new bi.d4(parentActivity);
        this.m0 = d4Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) d4Var.d, formatDateChat)) {
            d4Var.d = formatDateChat;
            ((org.telegram.ui.Components.r6) d4Var.b).t(formatDateChat, true, true);
        }
        addView(d4Var, w7.a6.a(33.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1, 49));
        this.T = new v10(this);
        this.U = new a20(this, getContext());
        this.V = new x10(this, getContext(), 1);
        this.W = new z10(this, getContext());
        this.a0 = new x10(this, getContext(), 4);
        this.b0 = new x10(this, getContext(), 2);
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(parentActivity, q10Var, 1, null);
        this.c = wx0Var;
        addView(wx0Var);
        o0Var.setEmptyView(wx0Var);
        wx0Var.setVisibility(8);
        b();
    }

    public static void a(c20 c20Var, MessageObject messageObject, View view, int i10) {
        if (!c20Var.o0.g()) {
            c20Var.o0.a();
        }
        if (c20Var.o0.g()) {
            c20Var.o0.d(messageObject, view, i10);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z10) {
        return d(messageObject, z10, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z10, int i10, TextPaint textPaint) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.TL_forumTopic findTopic2;
        int i11;
        if (messageObject == null || messageObject.messageOwner == null) {
            return "";
        }
        if (messageObject.isQuickReply()) {
            ig.a2 c10 = ig.b2.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
            return c10 == null ? "" : c10.b;
        }
        if (messageObject.isSponsored()) {
            return messageObject.sponsoredCanReport ? LocaleController.getString(R.string.SponsoredMessageAd) : messageObject.sponsoredRecommended ? LocaleController.getString(R.string.SponsoredMessage2Recommended) : LocaleController.getString(R.string.SponsoredMessage2);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = s0;
        if (spannableStringBuilderArr[i10] == null) {
            spannableStringBuilderArr[i10] = new SpannableStringBuilder(">");
            if (i10 == 0) {
                i11 = R.drawable.attach_arrow_right;
            } else if (i10 == 1) {
                i11 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i10 != 2) {
                    return "";
                }
                i11 = R.drawable.msg_mini_arrow_mediabold;
            }
            org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(i10 == 0 ? 2 : 1, ApplicationLoader.applicationContext.getDrawable(i11).mutate());
            if (i10 == 1 || i10 == 2) {
                brVar.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
            spannableStringBuilder.setSpan(brVar, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message = messageObject.messageOwner;
        CharSequence charSequence = null;
        if (message.saved_peer_id != null) {
            if (messageObject.getSavedDialogId() >= 0) {
                user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.getSavedDialogId()));
                chat = null;
            } else if (messageObject.getSavedDialogId() < 0) {
                chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getSavedDialogId()));
                user = null;
                chat2 = null;
            } else {
                user = null;
                chat = null;
            }
            chat2 = chat;
        } else {
            TLRPC.User user2 = message.from_id.user_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id)) : null;
            chat = messageObject.messageOwner.from_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
            if (chat == null) {
                chat = messageObject.messageOwner.from_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
            }
            chat2 = messageObject.messageOwner.peer_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
            if (chat2 == null) {
                chat2 = messageObject.messageOwner.peer_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
            }
            if (ChatObject.isChannelAndNotMegaGroup(chat2) || z10) {
                user = user2;
            } else {
                user = user2;
                chat2 = null;
            }
        }
        if (user != null && chat2 != null) {
            CharSequence charSequence2 = chat2.title;
            if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                charSequence2 = og.d.j(findTopic2, null, null);
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(Emoji.replaceEmoji(UserObject.getFirstName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i10]).append((char) 8202).append(replaceEmoji);
            charSequence = spannableStringBuilder2;
        } else if (user != null) {
            charSequence = Emoji.replaceEmoji(UserObject.getUserName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        } else if (chat != null) {
            CharSequence charSequence3 = chat.title;
            if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                charSequence3 = og.d.j(findTopic, null, null);
            }
            charSequence = Emoji.replaceEmoji(charSequence3, textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        }
        return charSequence == null ? "" : charSequence;
    }

    public final void b() {
        float f7 = this.a.e;
        bi.d4 d4Var = this.m0;
        d4Var.setTranslationY((1.0f - f7) * (-AndroidUtilities.dp(24.0f)));
        d4Var.setAlpha(f7);
        d4Var.setVisibility(f7 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bi.o0 o0Var = this.b;
            int childCount = o0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (o0Var.getChildAt(i12) instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) o0Var.getChildAt(i12)).b0(0, true);
                }
                o0Var.getChildAt(i12).invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5, org.telegram.messenger.UserConfig.selectedAccount) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j10, ArrayList arrayList) {
        org.telegram.ui.Components.lm0 lm0Var;
        int i10;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i11 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            long dialogId = messageObject.getDialogId();
            if (dialogId < 0) {
                i10 = (int) (-dialogId);
            }
            i10 = 0;
            if (i10 == j10) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (messageObject.getId() == ((Integer) arrayList.get(i12)).intValue()) {
                        arrayList2.remove(i11);
                        this.h.remove(messageObject.getId());
                        String str = messageObject.monthKey;
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(messageObject);
                        if (arrayList3.size() == 0) {
                            this.n.remove(messageObject.monthKey);
                            hashMap.remove(messageObject.monthKey);
                        }
                        i11--;
                        this.O--;
                        z10 = true;
                    }
                }
            }
            i11++;
        }
        if (!z10 || (lm0Var = this.d) == null) {
            return;
        }
        lm0Var.l();
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null) {
            return;
        }
        if (this.o0.g()) {
            this.o0.d(messageObject, view, i11);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.s2) {
            this.o0.c(messageObject);
            return;
        }
        int i12 = this.y.d;
        p10 p10Var = this.g0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.m2 m2Var = this.L;
        if (i12 == 0) {
            PhotoViewer.t1().K2(null, m2Var, null);
            PhotoViewer.t1().b2(arrayList, i10, 0L, 0L, 0L, p10Var);
            this.R = PhotoViewer.t1().c;
            return;
        }
        if (i12 == 3 || i12 == 5) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                ((org.telegram.ui.Cells.j7) view).a();
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                TLRPC.Document document = messageObject.getDocument();
                if (!k7Var.G) {
                    if (k7Var.F) {
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                        k7Var.f(true);
                        return;
                    } else {
                        MessageObject message = k7Var.getMessage();
                        message.putInDownloadsStore = true;
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                        k7Var.f(true);
                        return;
                    }
                }
                if (!messageObject.canPreviewDocument()) {
                    AndroidUtilities.openDocument(messageObject, this.K, m2Var);
                    return;
                }
                PhotoViewer.t1().K2(null, m2Var, null);
                int indexOf = arrayList.indexOf(messageObject);
                if (indexOf >= 0) {
                    PhotoViewer.t1().K2(null, m2Var, null);
                    PhotoViewer.t1().b2(arrayList, indexOf, 0L, 0L, 0L, p10Var);
                    this.R = PhotoViewer.t1().c;
                    return;
                } else {
                    ArrayList l4 = org.telegram.messenger.q.l(messageObject);
                    PhotoViewer.t1().K2(null, m2Var, null);
                    PhotoViewer.t1().b2(l4, 0, 0L, 0L, 0L, p10Var);
                    this.R = PhotoViewer.t1().c;
                    return;
                }
            }
            return;
        }
        if (i12 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                            m2Var.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.hv.J(this.L, messageObject, this.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.n7) view).E;
                    if (arrayList2.size() > 0) {
                        str2 = ((CharSequence) arrayList2.get(0)).toString();
                    }
                    str = str2;
                }
                if (str != null) {
                    g(str);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.g5.p0(this.L, str, true, true);
        } else {
            pf.d.s(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        bi.o0 o0Var = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i12 = org.telegram.ui.ActionBar.g6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 2048, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.g6.f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.g6.g3, null, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.w0, null, null, org.telegram.ui.ActionBar.g6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.y0, null, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.a1}, null, org.telegram.ui.ActionBar.g6.a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.g1, org.telegram.ui.ActionBar.g6.h1};
        int i15 = org.telegram.ui.ActionBar.g6.j9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.j1, org.telegram.ui.ActionBar.g6.k1, org.telegram.ui.ActionBar.g6.Z0}, null, org.telegram.ui.ActionBar.g6.b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.i9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.F0[0], null, null, org.telegram.ui.ActionBar.g6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.m9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, -1, null, org.telegram.ui.ActionBar.g6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.v0, null, null, org.telegram.ui.ActionBar.g6.s9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.u0, null, null, org.telegram.ui.ActionBar.g6.t9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.u9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.v9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.X0}, null, org.telegram.ui.ActionBar.g6.w9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.x0, null, null, org.telegram.ui.ActionBar.g6.x9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Y0}, null, org.telegram.ui.ActionBar.g6.y9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f1}, null, org.telegram.ui.ActionBar.g6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.c1}, null, org.telegram.ui.ActionBar.g6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.m1}, null, org.telegram.ui.ActionBar.g6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.g6.d9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.g6.c9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        org.telegram.ui.Components.wx0 wx0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wx0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wx0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.m10] */
    public final void h(final long j10, final long j11, final long j12, final long j13, final hg.p0 p0Var, final boolean z10, String str, boolean z11) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j10 + j11 + j12 + j13 + (p0Var == null ? -1 : p0Var.d) + str2 + z10;
        String str4 = this.x;
        boolean z12 = str4 != null && str4.equals(str3);
        boolean z13 = !z12 && z11;
        this.y = p0Var;
        this.E = j10;
        this.F = j11;
        this.H = j12;
        this.G = j13;
        this.I = str2;
        this.J = z10;
        m10 m10Var = this.e;
        if (m10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m10Var);
        }
        a6 a6Var = this.f0;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList2 = this.d0;
        final boolean z14 = z12;
        ArrayList arrayList3 = this.c0;
        org.telegram.ui.Components.wx0 wx0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z13 || (p0Var == null && j11 == 0 && j10 == 0 && j12 == 0 && j13 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.M = true;
            wx0Var.setVisibility(0);
            org.telegram.ui.Components.lm0 lm0Var = this.d;
            if (lm0Var != null) {
                lm0Var.l();
            }
            this.P++;
            bi.o0 o0Var = this.b;
            if (o0Var.getPinnedHeader() != null) {
                arrayList = arrayList4;
                o0Var.getPinnedHeader().setAlpha(0.0f);
            } else {
                arrayList = arrayList4;
            }
            arrayList3.clear();
            arrayList2.clear();
            if (!z13) {
                return;
            }
        } else if (z11 && !arrayList4.isEmpty()) {
            return;
        } else {
            arrayList = arrayList4;
        }
        this.M = true;
        org.telegram.ui.Components.lm0 lm0Var2 = this.d;
        if (lm0Var2 != null) {
            lm0Var2.l();
        }
        if (!z14) {
            a6Var.run();
            wx0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            t10 t10Var = this.h0;
            if (t10Var != null) {
                ((aw) t10Var).i(false, null, null, false);
            }
        }
        final int i10 = this.P + 1;
        this.P = i10;
        final int i11 = UserConfig.selectedAccount;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.m10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                String str5;
                hg.p0 p0Var2;
                int i13;
                long j14;
                boolean z15;
                long j15;
                int i14;
                int i15;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final c20 c20Var = c20.this;
                ArrayList arrayList5 = c20Var.f;
                final long j16 = j10;
                long j17 = j11;
                String str6 = str2;
                hg.p0 p0Var3 = p0Var;
                int i16 = i11;
                long j18 = j12;
                long j19 = j13;
                boolean z16 = z14;
                ArrayList<Object> arrayList6 = null;
                if (j16 == 0 || j17 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str6);
                    boolean z17 = z10;
                    if (isEmpty) {
                        i12 = i16;
                        str5 = str6;
                        p0Var2 = p0Var3;
                        i13 = z17 ? 1 : 0;
                        j14 = j18;
                        z15 = z16;
                        j15 = j19;
                        i14 = 20;
                    } else {
                        j14 = j18;
                        ArrayList<Object> arrayList7 = new ArrayList<>();
                        ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                        z15 = z16;
                        ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i16);
                        j15 = j19;
                        i12 = i16;
                        str5 = str6;
                        p0Var2 = p0Var3;
                        i14 = 20;
                        messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                        i13 = z17 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i14;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = p0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : p0Var2.e;
                    tL_messages_searchGlobal2.community = MessagesController.getInstance(i12).getInputChannel(j17);
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                    }
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                    }
                    if (z15 && str5.equals(c20Var.w) && !arrayList5.isEmpty()) {
                        i15 = 1;
                        MessageObject messageObject = (MessageObject) i2.d.g(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = c20Var.v;
                        tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        i15 = 1;
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i15;
                    tL_messages_searchGlobal2.folder_id = i13;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str6;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = p0Var3 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : p0Var3.e;
                    tL_messages_search.peer = AccountInstance.getInstance(i16).getMessagesController().getInputPeer(j16);
                    if (j18 > 0) {
                        tL_messages_search.min_date = (int) (j18 / 1000);
                    }
                    if (j19 > 0) {
                        tL_messages_search.max_date = (int) (j19 / 1000);
                    }
                    if (z16 && str6.equals(c20Var.w) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) i2.d.g(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    i12 = i16;
                    str5 = str6;
                    p0Var2 = p0Var3;
                    j14 = j18;
                    tL_messages_searchGlobal = tL_messages_search;
                    z15 = z16;
                }
                c20Var.w = str5;
                c20Var.x = str3;
                final ArrayList arrayList10 = new ArrayList();
                hg.r0.z1(c20Var.w, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                final boolean z18 = z15;
                final int i17 = i10;
                final hg.p0 p0Var4 = p0Var2;
                final String str7 = str5;
                final int i18 = i12;
                final ArrayList<Object> arrayList11 = arrayList6;
                final long j20 = j14;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() { // from class: org.telegram.ui.n10
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList12 = new ArrayList();
                        final int i19 = i18;
                        final String str8 = str7;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i20 = 0; i20 < size; i20++) {
                                MessageObject messageObject2 = new MessageObject(i19, messages_messages.messages.get(i20), false, true);
                                messageObject2.setQuery(str8);
                                arrayList12.add(messageObject2);
                            }
                        }
                        final c20 c20Var2 = c20.this;
                        final int i21 = i17;
                        final boolean z19 = z18;
                        final hg.p0 p0Var5 = p0Var4;
                        final long j21 = j16;
                        final long j22 = j20;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.o10
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x02c4  */
                            /* JADX WARN: Type inference failed for: r12v12 */
                            /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r12v16 */
                            /* JADX WARN: Type inference failed for: r16v0 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2 */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int i22;
                                ?? r12;
                                t10 t10Var2;
                                ArrayList arrayList15;
                                int i23;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                ?? r16;
                                char c10;
                                c20 c20Var3 = c20.this;
                                v10 v10Var = c20Var3.T;
                                a20 a20Var = c20Var3.U;
                                ArrayList arrayList17 = c20Var3.n;
                                SparseArray sparseArray2 = c20Var3.h;
                                ArrayList arrayList18 = c20Var3.d0;
                                HashMap hashMap = c20Var3.r;
                                ArrayList arrayList19 = c20Var3.f;
                                ArrayList arrayList20 = c20Var3.c0;
                                bi.o0 o0Var2 = c20Var3.b;
                                org.telegram.ui.Components.wx0 wx0Var2 = c20Var3.c;
                                if (i21 != c20Var3.P) {
                                    return;
                                }
                                c20Var3.M = false;
                                if (tL_error != null) {
                                    wh.n nVar = wx0Var2.d;
                                    org.telegram.ui.Components.da0 da0Var = wx0Var2.e;
                                    nVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                    da0Var.setVisibility(0);
                                    da0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    wx0Var2.e(false, true);
                                    return;
                                }
                                wx0Var2.e(false, true);
                                wh.n nVar2 = wx0Var2.d;
                                org.telegram.ui.Components.da0 da0Var2 = wx0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                c20Var3.v = messages_messages2.next_rate;
                                int i24 = i19;
                                MessagesStorage.getInstance(i24).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                                MessagesController.getInstance(i24).putUsers(messages_messages2.users, false);
                                MessagesController.getInstance(i24).putChats(messages_messages2.chats, false);
                                boolean z20 = z19;
                                if (!z20) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                c20Var3.O = messages_messages2.count;
                                String str9 = str8;
                                c20Var3.Q = str9;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i25 = 0;
                                while (i25 < size2) {
                                    boolean z21 = z20;
                                    MessageObject messageObject3 = (MessageObject) arrayList21.get(i25);
                                    ArrayList arrayList22 = arrayList21;
                                    ArrayList arrayList23 = (ArrayList) hashMap.get(messageObject3.monthKey);
                                    if (arrayList23 == null) {
                                        arrayList23 = new ArrayList();
                                        i23 = i25;
                                        hashMap.put(messageObject3.monthKey, arrayList23);
                                        arrayList17.add(messageObject3.monthKey);
                                    } else {
                                        i23 = i25;
                                    }
                                    arrayList23.add(messageObject3);
                                    arrayList19.add(messageObject3);
                                    sparseArray2.put(messageObject3.getId(), messageObject3);
                                    if (PhotoViewer.t1().R1()) {
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i26 = c20Var3.R;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = t12.Z6;
                                        ArrayList arrayList24 = t12.Y6;
                                        sparseArray = sparseArray2;
                                        if (i26 == t12.c) {
                                            if (sparseArrayArr[0].indexOfKey(messageObject3.getId()) < 0) {
                                                if (t12.Q5) {
                                                    arrayList24.add(messageObject3);
                                                    c10 = 0;
                                                } else {
                                                    c10 = 0;
                                                    arrayList24.add(0, messageObject3);
                                                }
                                                r16 = c10;
                                                sparseArrayArr[c10].put(messageObject3.getId(), messageObject3);
                                            } else {
                                                r16 = 0;
                                            }
                                            t12.P5[r16] = arrayList24.size() == t12.J5 ? true : r16;
                                            t12.D2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i25 = i23 + 1;
                                    arrayList21 = arrayList22;
                                    z20 = z21;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z22 = z20;
                                if (arrayList19.size() > c20Var3.O) {
                                    c20Var3.O = arrayList19.size();
                                }
                                c20Var3.N = arrayList19.size() >= c20Var3.O;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                hg.p0 p0Var6 = p0Var5;
                                if (isEmpty2) {
                                    if (p0Var6 == null) {
                                        nVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        da0Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(c20Var3.Q) && j21 == 0 && j22 == 0) {
                                        nVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                        int i27 = p0Var6.d;
                                        String string = i27 == 1 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles) : i27 == 0 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia) : i27 == 2 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks) : i27 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                                        da0Var2.setVisibility(0);
                                        da0Var2.setText(string);
                                    } else {
                                        nVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        da0Var2.setVisibility(0);
                                        da0Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    }
                                }
                                if (p0Var6 != null) {
                                    int i28 = p0Var6.d;
                                    if (i28 != 0) {
                                        if (i28 == 1) {
                                            c20Var3.d = c20Var3.V;
                                        } else if (i28 == 2) {
                                            c20Var3.d = c20Var3.W;
                                        } else if (i28 == 3) {
                                            c20Var3.d = c20Var3.a0;
                                        } else if (i28 == 5) {
                                            c20Var3.d = c20Var3.b0;
                                        }
                                    } else if (TextUtils.isEmpty(c20Var3.Q)) {
                                        c20Var3.d = a20Var;
                                    } else {
                                        c20Var3.d = v10Var;
                                    }
                                } else {
                                    c20Var3.d = v10Var;
                                }
                                s4.g0 adapter = o0Var2.getAdapter();
                                org.telegram.ui.Components.lm0 lm0Var3 = c20Var3.d;
                                if (adapter != lm0Var3) {
                                    o0Var2.setAdapter(lm0Var3);
                                }
                                if (z22) {
                                    i22 = 0;
                                } else {
                                    arrayList20.clear();
                                    ArrayList arrayList25 = arrayList13;
                                    ArrayList arrayList26 = arrayList20;
                                    if (arrayList25 != null) {
                                        arrayList26.addAll(arrayList25);
                                    }
                                    if (str9.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str9) || "saved messages".startsWith(str9))) {
                                        int i29 = 0;
                                        while (i29 < arrayList26.size()) {
                                            if (arrayList26.get(i29) instanceof TLRPC.User) {
                                                arrayList15 = arrayList26;
                                                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == ((TLRPC.User) arrayList26.get(i29)).id) {
                                                    arrayList26 = arrayList15;
                                                }
                                            } else {
                                                arrayList15 = arrayList26;
                                            }
                                            i29++;
                                            arrayList26 = arrayList15;
                                        }
                                        r12 = 0;
                                        arrayList26.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        c20Var3.e0 = r12;
                                        if (str9.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str9) || "archive".startsWith(str9))) {
                                            c20Var3.e0 = true;
                                        }
                                        t10Var2 = c20Var3.h0;
                                        i22 = r12;
                                        if (t10Var2 != null) {
                                            ((aw) t10Var2).i(TextUtils.isEmpty(c20Var3.Q), arrayList26, arrayList18, c20Var3.e0);
                                            i22 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    c20Var3.e0 = r12;
                                    if (str9.length() >= 3) {
                                        c20Var3.e0 = true;
                                    }
                                    t10Var2 = c20Var3.h0;
                                    i22 = r12;
                                    if (t10Var2 != null) {
                                    }
                                }
                                View view = null;
                                int i30 = -1;
                                for (int i31 = i22; i31 < size2; i31++) {
                                    View childAt = o0Var2.getChildAt(i31);
                                    if (childAt instanceof org.telegram.ui.Components.f10) {
                                        i30 = RecyclerView.R(childAt);
                                        view = childAt;
                                    }
                                }
                                if (view != null) {
                                    o0Var2.removeView(view);
                                }
                                if ((c20Var3.k0.getVisibility() == 0 && o0Var2.getChildCount() == 0) || (o0Var2.getAdapter() != a20Var && view != null)) {
                                    c20Var3.getViewTreeObserver().addOnPreDrawListener(new fr(c20Var3, (org.telegram.ui.Components.f10) view, i30, 3));
                                }
                                c20Var3.d.l();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 0L);
        q10 q10Var = this.k0;
        if (p0Var == null) {
            q10Var.setViewType(1);
            return;
        }
        int i12 = p0Var.d;
        if (i12 == 0) {
            if (TextUtils.isEmpty(this.I)) {
                q10Var.setViewType(2);
                return;
            } else {
                q10Var.setViewType(1);
                return;
            }
        }
        if (i12 == 1) {
            q10Var.setViewType(3);
            return;
        }
        if (i12 == 3 || i12 == 5) {
            q10Var.setViewType(4);
        } else if (i12 == 2) {
            q10Var.setViewType(5);
        }
    }

    public final void i(t10 t10Var, boolean z10) {
        this.h0 = t10Var;
        if (!z10 || t10Var == null) {
            return;
        }
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((aw) t10Var).i(false, arrayList, this.d0, this.e0);
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.r0 = z10;
        setPadding(0, i10, 0, i11);
        bi.o0 o0Var = this.b;
        if (z10) {
            o0Var.o1(0, i10, 0, i11);
        } else {
            o0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.r0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.q0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.q0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.lm0 lm0Var;
        int i12 = this.s;
        if (AndroidUtilities.isTablet()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i12 != this.s && (lm0Var = this.d) == this.U) {
            this.r0 = true;
            lm0Var.l();
            this.r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        eh.e eVar = new eh.e(null);
        eVar.e = new bi.w2(19);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(0, 0);
        eVar.f = 1.0f;
        eVar.h = 1.0f;
        bi.d4 d4Var = this.m0;
        dh.d c10 = bVar.c(d4Var, eVar, false);
        d4Var.c = c10;
        c10.q(AndroidUtilities.dp(11.5f));
        ((dh.d) d4Var.c).p(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.vo0 vo0Var) {
        this.i0 = vo0Var;
    }

    public void setUiCallback(b20 b20Var) {
        this.o0 = b20Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.p0 = z10;
    }

    @Override // ne.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
