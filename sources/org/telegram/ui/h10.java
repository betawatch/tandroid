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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public static final SpannableStringBuilder[] o0 = new SpannableStringBuilder[3];
    public long A;
    public long B;
    public long C;
    public long D;
    public String E;
    public boolean F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.o2 H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public String M;
    public int N;
    public final z00 O;
    public final a10 P;
    public final f10 Q;
    public final c10 R;
    public final e10 S;
    public final c10 T;
    public final c10 U;
    public final ArrayList V;
    public final ArrayList W;
    public final vd.a a;
    public boolean a0;
    public final jh.e1 b;
    public final w5 b0;
    public final org.telegram.ui.Components.qw0 c;
    public final u00 c0;
    public org.telegram.ui.Components.il0 d;
    public y00 d0;
    public r00 e;
    public org.telegram.ui.Components.pn0 e0;
    public final ArrayList f;
    public final f2.j0 f0;
    public final v00 g0;
    public final SparseArray h;
    public final AnimationNotificationsLocker h0;
    public final lh.z2 i0;
    public final q00 j0;
    public g10 k0;
    public boolean l0;
    public int m0;
    public final ArrayList n;
    public boolean n0;
    public final HashMap r;
    public int s;
    public int v;
    public String w;
    public String x;
    public rf.f0 y;

    public h10(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        this.a = new vd.a(0, this, org.telegram.ui.Components.jr.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.O = new z00(0, 0L);
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.b0 = new w5(this, 4);
        this.c0 = new u00(this);
        this.h0 = new AnimationNotificationsLocker();
        this.j0 = new q00(this, 0);
        this.H = o2Var;
        Activity parentActivity = o2Var.getParentActivity();
        this.G = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        jh.e1 e1Var = new jh.e1(this, parentActivity, 27);
        this.b = e1Var;
        e1Var.setOnItemClickListener(new j(this, 11));
        e1Var.setOnItemLongClickListener(new h(this, 16));
        f2.j0 j0Var = new f2.j0();
        this.f0 = j0Var;
        e1Var.setLayoutManager(j0Var);
        v00 v00Var = new v00(this, parentActivity, 0);
        this.g0 = v00Var;
        addView(v00Var);
        addView(e1Var);
        e1Var.setSectionsType(2);
        e1Var.setSkipDrawSection(true);
        e1Var.setOnScrollListener(new w00(this));
        lh.z2 z2Var = new lh.z2(parentActivity);
        this.i0 = z2Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) z2Var.d, formatDateChat)) {
            z2Var.d = formatDateChat;
            ((org.telegram.ui.Components.n6) z2Var.b).q(formatDateChat, true, true);
        }
        addView(z2Var, i7.f6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.P = new a10(this);
        this.Q = new f10(this, getContext());
        this.R = new c10(this, getContext(), 1);
        this.S = new e10(this, getContext());
        this.T = new c10(this, getContext(), 4);
        this.U = new c10(this, getContext(), 2);
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(parentActivity, v00Var, 1, null);
        this.c = qw0Var;
        addView(qw0Var);
        e1Var.setEmptyView(qw0Var);
        qw0Var.setVisibility(8);
        b();
    }

    public static void a(h10 h10Var, MessageObject messageObject, View view, int i10) {
        if (!h10Var.k0.f()) {
            h10Var.k0.a();
        }
        if (h10Var.k0.f()) {
            h10Var.k0.d(messageObject, view, i10);
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
            sf.r1 c3 = sf.s1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
            return c3 == null ? "" : c3.b;
        }
        if (messageObject.isSponsored()) {
            return messageObject.sponsoredCanReport ? LocaleController.getString(R.string.SponsoredMessageAd) : messageObject.sponsoredRecommended ? LocaleController.getString(R.string.SponsoredMessage2Recommended) : LocaleController.getString(R.string.SponsoredMessage2);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = o0;
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
            org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(i10 == 0 ? 2 : 1, ApplicationLoader.applicationContext.getDrawable(i11).mutate());
            if (i10 == 1 || i10 == 2) {
                iqVar.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
            spannableStringBuilder.setSpan(iqVar, 0, spannableStringBuilder.length(), 0);
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
                charSequence2 = yf.d.j(findTopic2, null, null);
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
                charSequence3 = yf.d.j(findTopic, null, null);
            }
            charSequence = Emoji.replaceEmoji(charSequence3, textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            b();
        }
    }

    public final void b() {
        float f9 = this.a.e;
        lh.z2 z2Var = this.i0;
        z2Var.setTranslationY((1.0f - f9) * (-AndroidUtilities.dp(24.0f)));
        z2Var.setAlpha(f9);
        z2Var.setVisibility(f9 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            jh.e1 e1Var = this.b;
            int childCount = e1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (e1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) e1Var.getChildAt(i12)).b0(0, true);
                }
                e1Var.getChildAt(i12).invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r6, org.telegram.messenger.UserConfig.selectedAccount) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j10, ArrayList arrayList) {
        org.telegram.ui.Components.il0 il0Var;
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
                        this.K--;
                        z10 = true;
                    }
                }
            }
            i11++;
        }
        if (!z10 || (il0Var = this.d) == null) {
            return;
        }
        il0Var.l();
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null) {
            return;
        }
        if (this.k0.f()) {
            this.k0.d(messageObject, view, i11);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p2) {
            this.k0.c(messageObject);
            return;
        }
        int i12 = this.y.d;
        u00 u00Var = this.c0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.o2 o2Var = this.H;
        if (i12 == 0) {
            PhotoViewer.t1().K2(null, o2Var, null);
            PhotoViewer.t1().a2(arrayList, i10, 0L, 0L, 0L, u00Var);
            this.N = PhotoViewer.t1().c;
            return;
        }
        if (i12 == 3 || i12 == 5) {
            if (view instanceof org.telegram.ui.Cells.f7) {
                ((org.telegram.ui.Cells.f7) view).a();
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                TLRPC.Document document = messageObject.getDocument();
                if (!g7Var.C) {
                    if (g7Var.B) {
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                        g7Var.f(true);
                        return;
                    } else {
                        MessageObject message = g7Var.getMessage();
                        message.putInDownloadsStore = true;
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                        g7Var.f(true);
                        return;
                    }
                }
                if (!messageObject.canPreviewDocument()) {
                    AndroidUtilities.openDocument(messageObject, this.G, o2Var);
                    return;
                }
                PhotoViewer.t1().K2(null, o2Var, null);
                int indexOf = arrayList.indexOf(messageObject);
                if (indexOf >= 0) {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, u00Var);
                    this.N = PhotoViewer.t1().c;
                    return;
                } else {
                    ArrayList n10 = org.telegram.messenger.x3.n(messageObject);
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer.t1().a2(n10, 0, 0L, 0L, 0L, u00Var);
                    this.N = PhotoViewer.t1().c;
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
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                            o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.mu.I(this.H, messageObject, this.c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.j7) view).A;
                    if (arrayList2.size() > 0) {
                        str2 = ((CharSequence) arrayList2.get(0)).toString();
                    }
                    str = str2;
                }
                if (str != null) {
                    g(str);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.c5.q0(this.H, str, true, true);
        } else {
            ye.d.s(this.G, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        f fVar = new f(this, 14);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        jh.e1 e1Var = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i12 = org.telegram.ui.ActionBar.g6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 2048, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.g3, null, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 32, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 524304, new Class[]{org.telegram.ui.Cells.k7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.w0, null, null, org.telegram.ui.ActionBar.g6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.y0, null, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.a1}, null, org.telegram.ui.ActionBar.g6.a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.g1, org.telegram.ui.ActionBar.g6.h1};
        int i15 = org.telegram.ui.ActionBar.g6.j9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.j1, org.telegram.ui.ActionBar.g6.k1, org.telegram.ui.ActionBar.g6.Z0}, null, org.telegram.ui.ActionBar.g6.b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.i9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[0], null, null, org.telegram.ui.ActionBar.g6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.m9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, -1, null, org.telegram.ui.ActionBar.g6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.v0, null, null, org.telegram.ui.ActionBar.g6.s9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.u0, null, null, org.telegram.ui.ActionBar.g6.t9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.u9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.v9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.X0}, null, org.telegram.ui.ActionBar.g6.w9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.x0, null, null, org.telegram.ui.ActionBar.g6.x9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Y0}, null, org.telegram.ui.ActionBar.g6.y9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f1}, null, org.telegram.ui.ActionBar.g6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.c1}, null, org.telegram.ui.ActionBar.g6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.m1}, null, org.telegram.ui.ActionBar.g6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.d9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.c9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 524304, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        org.telegram.ui.Components.qw0 qw0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.i6(qw0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qw0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.r00] */
    public final void h(final long j10, final long j11, final long j12, final long j13, final rf.f0 f0Var, final boolean z10, String str, boolean z11) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j10 + j11 + j12 + j13 + (f0Var == null ? -1 : f0Var.d) + str2 + z10;
        String str4 = this.x;
        boolean z12 = str4 != null && str4.equals(str3);
        boolean z13 = !z12 && z11;
        this.y = f0Var;
        this.A = j10;
        this.B = j11;
        this.D = j12;
        this.C = j13;
        this.E = str2;
        this.F = z10;
        r00 r00Var = this.e;
        if (r00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r00Var);
        }
        w5 w5Var = this.b0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList2 = this.W;
        final boolean z14 = z12;
        ArrayList arrayList3 = this.V;
        org.telegram.ui.Components.qw0 qw0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z13 || (f0Var == null && j11 == 0 && j10 == 0 && j12 == 0 && j13 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.I = true;
            qw0Var.setVisibility(0);
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                il0Var.l();
            }
            this.L++;
            jh.e1 e1Var = this.b;
            if (e1Var.getPinnedHeader() != null) {
                arrayList = arrayList4;
                e1Var.getPinnedHeader().setAlpha(0.0f);
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
        this.I = true;
        org.telegram.ui.Components.il0 il0Var2 = this.d;
        if (il0Var2 != null) {
            il0Var2.l();
        }
        if (!z14) {
            w5Var.run();
            qw0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            y00 y00Var = this.d0;
            if (y00Var != null) {
                ((kv) y00Var).i(false, null, null, false);
            }
        }
        final int i10 = this.L + 1;
        this.L = i10;
        final int i11 = UserConfig.selectedAccount;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.r00
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v11 */
            /* JADX WARN: Type inference failed for: r10v3, types: [int] */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r3v13, types: [org.telegram.tgnet.TLRPC$TL_messages_search] */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                long j14;
                long j15;
                int i13;
                ?? r10;
                int i14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final h10 h10Var = h10.this;
                ArrayList arrayList5 = h10Var.f;
                final long j16 = j10;
                long j17 = j11;
                final String str5 = str2;
                final rf.f0 f0Var2 = f0Var;
                int i15 = i11;
                long j18 = j12;
                long j19 = j13;
                final boolean z15 = z14;
                ArrayList<Object> arrayList6 = null;
                if (j16 == 0 || j17 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str5);
                    boolean z16 = z10;
                    if (isEmpty) {
                        i12 = i15;
                        j14 = j19;
                        j15 = j18;
                        i13 = 20;
                        r10 = z16;
                    } else {
                        j14 = j19;
                        ArrayList<Object> arrayList7 = new ArrayList<>();
                        ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                        ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                        j15 = j18;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        i12 = i15;
                        i13 = 20;
                        messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                        r10 = z16 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i13;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = f0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : f0Var2.e;
                    tL_messages_searchGlobal2.community = MessagesController.getInstance(i12).getInputChannel(j17);
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z15 && str5.equals(h10Var.w) && !arrayList5.isEmpty()) {
                        i14 = 1;
                        MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = h10Var.v;
                        tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        i14 = 1;
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i14;
                    tL_messages_searchGlobal2.folder_id = r10;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    ?? tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = f0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : f0Var2.e;
                    tL_messages_search.peer = AccountInstance.getInstance(i15).getMessagesController().getInputPeer(j16);
                    if (j18 > 0) {
                        tL_messages_search.min_date = (int) (j18 / 1000);
                    }
                    if (j19 > 0) {
                        tL_messages_search.max_date = (int) (j19 / 1000);
                    }
                    if (z15 && str5.equals(h10Var.w) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) j7.l1.i(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    i12 = i15;
                    j15 = j18;
                }
                h10Var.w = str5;
                h10Var.x = str3;
                final ArrayList arrayList10 = new ArrayList();
                rf.h0.y1(h10Var.w, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                final int i16 = i10;
                final ArrayList<Object> arrayList11 = arrayList6;
                final int i17 = i12;
                final long j20 = j15;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() { // from class: org.telegram.ui.s00
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList12 = new ArrayList();
                        final int i18 = i17;
                        final String str6 = str5;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                MessageObject messageObject2 = new MessageObject(i18, messages_messages.messages.get(i19), false, true);
                                messageObject2.setQuery(str6);
                                arrayList12.add(messageObject2);
                            }
                        }
                        final h10 h10Var2 = h10.this;
                        final int i20 = i16;
                        final boolean z17 = z15;
                        final rf.f0 f0Var3 = f0Var2;
                        final long j21 = j16;
                        final long j22 = j20;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.t00
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int i21;
                                boolean z18;
                                y00 y00Var2;
                                ArrayList arrayList15;
                                int i22;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                char c3;
                                char c6;
                                h10 h10Var3 = h10.this;
                                a10 a10Var = h10Var3.P;
                                f10 f10Var = h10Var3.Q;
                                ArrayList arrayList17 = h10Var3.n;
                                SparseArray sparseArray2 = h10Var3.h;
                                ArrayList arrayList18 = h10Var3.W;
                                HashMap hashMap = h10Var3.r;
                                ArrayList arrayList19 = h10Var3.f;
                                ArrayList arrayList20 = h10Var3.V;
                                jh.e1 e1Var2 = h10Var3.b;
                                org.telegram.ui.Components.qw0 qw0Var2 = h10Var3.c;
                                if (i20 != h10Var3.L) {
                                    return;
                                }
                                h10Var3.I = false;
                                if (tL_error != null) {
                                    gh.s sVar = qw0Var2.d;
                                    org.telegram.ui.Components.y80 y80Var = qw0Var2.e;
                                    sVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                    y80Var.setVisibility(0);
                                    y80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    qw0Var2.e(false, true);
                                    return;
                                }
                                qw0Var2.e(false, true);
                                gh.s sVar2 = qw0Var2.d;
                                org.telegram.ui.Components.y80 y80Var2 = qw0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                h10Var3.v = messages_messages2.next_rate;
                                int i23 = i18;
                                MessagesStorage.getInstance(i23).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                                MessagesController.getInstance(i23).putUsers(messages_messages2.users, false);
                                MessagesController.getInstance(i23).putChats(messages_messages2.chats, false);
                                boolean z19 = z17;
                                if (!z19) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                h10Var3.K = messages_messages2.count;
                                String str7 = str6;
                                h10Var3.M = str7;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i24 = 0;
                                while (i24 < size2) {
                                    boolean z20 = z19;
                                    MessageObject messageObject3 = (MessageObject) arrayList21.get(i24);
                                    ArrayList arrayList22 = arrayList21;
                                    ArrayList arrayList23 = (ArrayList) hashMap.get(messageObject3.monthKey);
                                    if (arrayList23 == null) {
                                        arrayList23 = new ArrayList();
                                        i22 = i24;
                                        hashMap.put(messageObject3.monthKey, arrayList23);
                                        arrayList17.add(messageObject3.monthKey);
                                    } else {
                                        i22 = i24;
                                    }
                                    arrayList23.add(messageObject3);
                                    arrayList19.add(messageObject3);
                                    sparseArray2.put(messageObject3.getId(), messageObject3);
                                    if (PhotoViewer.t1().Q1()) {
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i25 = h10Var3.N;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = t12.V6;
                                        ArrayList arrayList24 = t12.U6;
                                        sparseArray = sparseArray2;
                                        if (i25 == t12.c) {
                                            if (sparseArrayArr[0].indexOfKey(messageObject3.getId()) < 0) {
                                                if (t12.M5) {
                                                    arrayList24.add(messageObject3);
                                                    c6 = 0;
                                                } else {
                                                    c6 = 0;
                                                    arrayList24.add(0, messageObject3);
                                                }
                                                c3 = 0;
                                                sparseArrayArr[c6].put(messageObject3.getId(), messageObject3);
                                            } else {
                                                c3 = 0;
                                            }
                                            t12.L5[c3] = arrayList24.size() == t12.F5;
                                            t12.D2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i24 = i22 + 1;
                                    arrayList21 = arrayList22;
                                    z19 = z20;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z21 = z19;
                                if (arrayList19.size() > h10Var3.K) {
                                    h10Var3.K = arrayList19.size();
                                }
                                h10Var3.J = arrayList19.size() >= h10Var3.K;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                rf.f0 f0Var4 = f0Var3;
                                if (isEmpty2) {
                                    if (f0Var4 == null) {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        y80Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(h10Var3.M) && j21 == 0 && j22 == 0) {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                        int i26 = f0Var4.d;
                                        String string = i26 == 1 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles) : i26 == 0 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia) : i26 == 2 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks) : i26 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                                        y80Var2.setVisibility(0);
                                        y80Var2.setText(string);
                                    } else {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        y80Var2.setVisibility(0);
                                        y80Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    }
                                }
                                if (f0Var4 != null) {
                                    int i27 = f0Var4.d;
                                    if (i27 != 0) {
                                        if (i27 == 1) {
                                            h10Var3.d = h10Var3.R;
                                        } else if (i27 == 2) {
                                            h10Var3.d = h10Var3.S;
                                        } else if (i27 == 3) {
                                            h10Var3.d = h10Var3.T;
                                        } else if (i27 == 5) {
                                            h10Var3.d = h10Var3.U;
                                        }
                                    } else if (TextUtils.isEmpty(h10Var3.M)) {
                                        h10Var3.d = f10Var;
                                    } else {
                                        h10Var3.d = a10Var;
                                    }
                                } else {
                                    h10Var3.d = a10Var;
                                }
                                f2.p0 adapter = e1Var2.getAdapter();
                                org.telegram.ui.Components.il0 il0Var3 = h10Var3.d;
                                if (adapter != il0Var3) {
                                    e1Var2.setAdapter(il0Var3);
                                }
                                if (z21) {
                                    i21 = 0;
                                } else {
                                    arrayList20.clear();
                                    ArrayList arrayList25 = arrayList13;
                                    ArrayList arrayList26 = arrayList20;
                                    if (arrayList25 != null) {
                                        arrayList26.addAll(arrayList25);
                                    }
                                    if (str7.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str7) || "saved messages".startsWith(str7))) {
                                        int i28 = 0;
                                        while (i28 < arrayList26.size()) {
                                            if (arrayList26.get(i28) instanceof TLRPC.User) {
                                                arrayList15 = arrayList26;
                                                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == ((TLRPC.User) arrayList26.get(i28)).id) {
                                                    arrayList26 = arrayList15;
                                                }
                                            } else {
                                                arrayList15 = arrayList26;
                                            }
                                            i28++;
                                            arrayList26 = arrayList15;
                                        }
                                        z18 = 0;
                                        arrayList26.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        h10Var3.a0 = z18;
                                        if (str7.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str7) || "archive".startsWith(str7))) {
                                            h10Var3.a0 = true;
                                        }
                                        y00Var2 = h10Var3.d0;
                                        i21 = z18;
                                        if (y00Var2 != null) {
                                            ((kv) y00Var2).i(TextUtils.isEmpty(h10Var3.M), arrayList26, arrayList18, h10Var3.a0);
                                            i21 = z18;
                                        }
                                    }
                                    z18 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    h10Var3.a0 = z18;
                                    if (str7.length() >= 3) {
                                        h10Var3.a0 = true;
                                    }
                                    y00Var2 = h10Var3.d0;
                                    i21 = z18;
                                    if (y00Var2 != null) {
                                    }
                                }
                                View view = null;
                                int i29 = -1;
                                for (int i30 = i21; i30 < size2; i30++) {
                                    View childAt = e1Var2.getChildAt(i30);
                                    if (childAt instanceof org.telegram.ui.Components.p00) {
                                        i29 = RecyclerView.R(childAt);
                                        view = childAt;
                                    }
                                }
                                if (view != null) {
                                    e1Var2.removeView(view);
                                }
                                if ((h10Var3.g0.getVisibility() == 0 && e1Var2.getChildCount() == 0) || (e1Var2.getAdapter() != f10Var && view != null)) {
                                    h10Var3.getViewTreeObserver().addOnPreDrawListener(new pq(h10Var3, (org.telegram.ui.Components.p00) view, i29, 3));
                                }
                                h10Var3.d.l();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 0L);
        v00 v00Var = this.g0;
        if (f0Var == null) {
            v00Var.setViewType(1);
            return;
        }
        int i12 = f0Var.d;
        if (i12 == 0) {
            if (TextUtils.isEmpty(this.E)) {
                v00Var.setViewType(2);
                return;
            } else {
                v00Var.setViewType(1);
                return;
            }
        }
        if (i12 == 1) {
            v00Var.setViewType(3);
            return;
        }
        if (i12 == 3 || i12 == 5) {
            v00Var.setViewType(4);
        } else if (i12 == 2) {
            v00Var.setViewType(5);
        }
    }

    public final void i(y00 y00Var, boolean z10) {
        this.d0 = y00Var;
        if (!z10 || y00Var == null) {
            return;
        }
        ArrayList arrayList = this.V;
        if (arrayList.isEmpty()) {
            return;
        }
        ((kv) y00Var).i(false, arrayList, this.W, this.a0);
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.n0 = z10;
        setPadding(0, i10, 0, i11);
        jh.e1 e1Var = this.b;
        if (z10) {
            e1Var.o1(0, i10, 0, i11);
        } else {
            e1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.n0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.m0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.m0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.il0 il0Var;
        int i12 = this.s;
        if (AndroidUtilities.isTablet()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i12 != this.s && (il0Var = this.d) == this.Q) {
            this.n0 = true;
            il0Var.l();
            this.n0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.n0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(lg.a aVar) {
        og.d dVar = new og.d(null);
        dVar.e = new xx0(12);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(0, 0);
        dVar.f = 1.0f;
        dVar.h = 1.0f;
        lh.z2 z2Var = this.i0;
        ng.d c3 = aVar.c(z2Var, dVar, false);
        z2Var.c = c3;
        c3.p(AndroidUtilities.dp(11.5f));
        ((ng.d) z2Var.c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.pn0 pn0Var) {
        this.e0 = pn0Var;
    }

    public void setUiCallback(g10 g10Var) {
        this.k0 = g10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.l0 = z10;
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
