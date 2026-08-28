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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, td.b {
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
    public final x00 O;
    public final y00 P;
    public final d10 Q;
    public final a10 R;
    public final c10 S;
    public final a10 T;
    public final a10 U;
    public final ArrayList V;
    public final ArrayList W;
    public final td.a a;
    public boolean a0;
    public final gh.f1 b;
    public final v5 b0;
    public final org.telegram.ui.Components.gw0 c;
    public final s00 c0;
    public org.telegram.ui.Components.vk0 d;
    public w00 d0;
    public p00 e;
    public org.telegram.ui.Components.dn0 e0;
    public final ArrayList f;
    public final f2.m0 f0;
    public final t00 g0;
    public final SparseArray h;
    public final AnimationNotificationsLocker h0;
    public final ih.b3 i0;
    public final o00 j0;
    public e10 k0;
    public boolean l0;
    public int m0;
    public final ArrayList n;
    public boolean n0;
    public final HashMap r;
    public int s;
    public int v;
    public String w;
    public String x;
    public of.m0 y;

    public f10(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        this.a = new td.a(0, this, org.telegram.ui.Components.gr.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.O = new x00(0, 0L);
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.b0 = new v5(this, 4);
        this.c0 = new s00(this);
        this.h0 = new AnimationNotificationsLocker();
        this.j0 = new o00(this, 0);
        this.H = o2Var;
        Activity parentActivity = o2Var.getParentActivity();
        this.G = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        gh.f1 f1Var = new gh.f1(this, parentActivity, 28);
        this.b = f1Var;
        f1Var.setOnItemClickListener(new i(this, 11));
        f1Var.setOnItemLongClickListener(new g(this, 16));
        f2.m0 m0Var = new f2.m0();
        this.f0 = m0Var;
        f1Var.setLayoutManager(m0Var);
        t00 t00Var = new t00(this, parentActivity, 0);
        this.g0 = t00Var;
        addView(t00Var);
        addView(f1Var);
        f1Var.setSectionsType(2);
        f1Var.setSkipDrawSection(true);
        f1Var.setOnScrollListener(new u00(this));
        ih.b3 b3Var = new ih.b3(parentActivity);
        this.i0 = b3Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) b3Var.d, formatDateChat)) {
            b3Var.d = formatDateChat;
            ((org.telegram.ui.Components.i6) b3Var.b).q(formatDateChat, true, true);
        }
        addView(b3Var, g7.e6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.P = new y00(this);
        this.Q = new d10(this, getContext());
        this.R = new a10(this, getContext(), 1);
        this.S = new c10(this, getContext());
        this.T = new a10(this, getContext(), 4);
        this.U = new a10(this, getContext(), 2);
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(parentActivity, t00Var, 1, null);
        this.c = gw0Var;
        addView(gw0Var);
        f1Var.setEmptyView(gw0Var);
        gw0Var.setVisibility(8);
        b();
    }

    public static void a(f10 f10Var, MessageObject messageObject, View view, int i9) {
        if (!f10Var.k0.f()) {
            f10Var.k0.a();
        }
        if (f10Var.k0.f()) {
            f10Var.k0.d(messageObject, view, i9);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z10) {
        return d(messageObject, z10, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z10, int i9, TextPaint textPaint) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.TL_forumTopic findTopic2;
        int i10;
        if (messageObject == null || messageObject.messageOwner == null) {
            return "";
        }
        if (messageObject.isQuickReply()) {
            pf.q1 c10 = pf.r1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
            return c10 == null ? "" : c10.b;
        }
        if (messageObject.isSponsored()) {
            return messageObject.sponsoredCanReport ? LocaleController.getString(R.string.SponsoredMessageAd) : messageObject.sponsoredRecommended ? LocaleController.getString(R.string.SponsoredMessage2Recommended) : LocaleController.getString(R.string.SponsoredMessage2);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = o0;
        if (spannableStringBuilderArr[i9] == null) {
            spannableStringBuilderArr[i9] = new SpannableStringBuilder(">");
            if (i9 == 0) {
                i10 = R.drawable.attach_arrow_right;
            } else if (i9 == 1) {
                i10 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i9 != 2) {
                    return "";
                }
                i10 = R.drawable.msg_mini_arrow_mediabold;
            }
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(i9 == 0 ? 2 : 1, ApplicationLoader.applicationContext.getDrawable(i10).mutate());
            if (i9 == 1 || i9 == 2) {
                eqVar.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i9];
            spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 0);
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
                charSequence2 = vf.c.j(findTopic2, null, null);
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(Emoji.replaceEmoji(UserObject.getFirstName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i9]).append((char) 8202).append(replaceEmoji);
            charSequence = spannableStringBuilder2;
        } else if (user != null) {
            charSequence = Emoji.replaceEmoji(UserObject.getUserName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        } else if (chat != null) {
            CharSequence charSequence3 = chat.title;
            if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                charSequence3 = vf.c.j(findTopic, null, null);
            }
            charSequence = Emoji.replaceEmoji(charSequence3, textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            b();
        }
    }

    public final void b() {
        float f10 = this.a.e;
        ih.b3 b3Var = this.i0;
        b3Var.setTranslationY((1.0f - f10) * (-AndroidUtilities.dp(24.0f)));
        b3Var.setAlpha(f10);
        b3Var.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            gh.f1 f1Var = this.b;
            int childCount = f1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (f1Var.getChildAt(i11) instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) f1Var.getChildAt(i11)).a0(0, true);
                }
                f1Var.getChildAt(i11).invalidate();
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
        org.telegram.ui.Components.vk0 vk0Var;
        int i9;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i10 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            long dialogId = messageObject.getDialogId();
            if (dialogId < 0) {
                i9 = (int) (-dialogId);
            }
            i9 = 0;
            if (i9 == j10) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (messageObject.getId() == ((Integer) arrayList.get(i11)).intValue()) {
                        arrayList2.remove(i10);
                        this.h.remove(messageObject.getId());
                        String str = messageObject.monthKey;
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(messageObject);
                        if (arrayList3.size() == 0) {
                            this.n.remove(messageObject.monthKey);
                            hashMap.remove(messageObject.monthKey);
                        }
                        i10--;
                        this.K--;
                        z10 = true;
                    }
                }
            }
            i10++;
        }
        if (!z10 || (vk0Var = this.d) == null) {
            return;
        }
        vk0Var.l();
    }

    public final void f(int i9, View view, MessageObject messageObject, int i10) {
        String str;
        if (messageObject == null) {
            return;
        }
        if (this.k0.f()) {
            this.k0.d(messageObject, view, i10);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            this.k0.c(messageObject);
            return;
        }
        int i11 = this.y.d;
        s00 s00Var = this.c0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.o2 o2Var = this.H;
        if (i11 == 0) {
            PhotoViewer.t1().K2(null, o2Var, null);
            PhotoViewer.t1().a2(arrayList, i9, 0L, 0L, 0L, s00Var);
            this.N = PhotoViewer.t1().c;
            return;
        }
        if (i11 == 3 || i11 == 5) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).a();
                return;
            }
            return;
        }
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                TLRPC.Document document = messageObject.getDocument();
                if (!i7Var.C) {
                    if (i7Var.B) {
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                        i7Var.f(true);
                        return;
                    } else {
                        MessageObject message = i7Var.getMessage();
                        message.putInDownloadsStore = true;
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                        i7Var.f(true);
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
                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, s00Var);
                    this.N = PhotoViewer.t1().c;
                    return;
                } else {
                    ArrayList k10 = org.telegram.messenger.l0.k(messageObject);
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer.t1().a2(k10, 0, 0L, 0L, 0L, s00Var);
                    this.N = PhotoViewer.t1().c;
                    return;
                }
            }
            return;
        }
        if (i11 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                            o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.gu.I(this.H, messageObject, this.c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.l7) view).A;
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
            org.telegram.ui.Components.y4.q0(this.H, str, true, true);
        } else {
            ve.e.s(this.G, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        gh.f1 f1Var = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        int i11 = org.telegram.ui.ActionBar.f6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.f3, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.g3, null, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.f6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.f6.m0, null, null, org.telegram.ui.ActionBar.f6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.w0, null, null, org.telegram.ui.ActionBar.f6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.y0, null, null, org.telegram.ui.ActionBar.f6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.L0, null, null, org.telegram.ui.ActionBar.f6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.a1}, null, org.telegram.ui.ActionBar.f6.a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.f6.g1, org.telegram.ui.ActionBar.f6.h1};
        int i14 = org.telegram.ui.ActionBar.f6.j9;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.j1, org.telegram.ui.ActionBar.f6.k1, org.telegram.ui.ActionBar.f6.Z0}, null, org.telegram.ui.ActionBar.f6.b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.f6.D0}, null, -1, null, org.telegram.ui.ActionBar.f6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.f6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.f6.E0}, null, -1, null, org.telegram.ui.ActionBar.f6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.F0[1], null, null, org.telegram.ui.ActionBar.f6.i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.F0[0], null, null, org.telegram.ui.ActionBar.f6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.G0, null, null, org.telegram.ui.ActionBar.f6.m9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.f6.H0, null, -1, null, org.telegram.ui.ActionBar.f6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.I0, null, null, org.telegram.ui.ActionBar.f6.q9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.v0, null, null, org.telegram.ui.ActionBar.f6.s9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.u0, null, null, org.telegram.ui.ActionBar.f6.t9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.T0}, null, org.telegram.ui.ActionBar.f6.u9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.V0, org.telegram.ui.ActionBar.f6.W0}, null, org.telegram.ui.ActionBar.f6.v9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.X0}, null, org.telegram.ui.ActionBar.f6.w9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.x0, null, null, org.telegram.ui.ActionBar.f6.x9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.Y0}, null, org.telegram.ui.ActionBar.f6.y9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.i1}, null, org.telegram.ui.ActionBar.f6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f1}, null, org.telegram.ui.ActionBar.f6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.c1}, null, org.telegram.ui.ActionBar.f6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.m1}, null, org.telegram.ui.ActionBar.f6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.d9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.c9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
        org.telegram.ui.Components.gw0 gw0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.h6(gw0Var.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(gw0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.p00] */
    public final void h(final long j10, final long j11, final long j12, final long j13, final of.m0 m0Var, final boolean z10, String str, boolean z11) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j10 + j11 + j12 + j13 + (m0Var == null ? -1 : m0Var.d) + str2 + z10;
        String str4 = this.x;
        boolean z12 = str4 != null && str4.equals(str3);
        boolean z13 = !z12 && z11;
        this.y = m0Var;
        this.A = j10;
        this.B = j11;
        this.D = j12;
        this.C = j13;
        this.E = str2;
        this.F = z10;
        p00 p00Var = this.e;
        if (p00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p00Var);
        }
        v5 v5Var = this.b0;
        AndroidUtilities.cancelRunOnUIThread(v5Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList2 = this.W;
        final boolean z14 = z12;
        ArrayList arrayList3 = this.V;
        org.telegram.ui.Components.gw0 gw0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z13 || (m0Var == null && j11 == 0 && j10 == 0 && j12 == 0 && j13 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.I = true;
            gw0Var.setVisibility(0);
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                vk0Var.l();
            }
            this.L++;
            gh.f1 f1Var = this.b;
            if (f1Var.getPinnedHeader() != null) {
                arrayList = arrayList4;
                f1Var.getPinnedHeader().setAlpha(0.0f);
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
        org.telegram.ui.Components.vk0 vk0Var2 = this.d;
        if (vk0Var2 != null) {
            vk0Var2.l();
        }
        if (!z14) {
            v5Var.run();
            gw0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            w00 w00Var = this.d0;
            if (w00Var != null) {
                ((jv) w00Var).i(false, null, null, false);
            }
        }
        final int i9 = this.L + 1;
        this.L = i9;
        final int i10 = UserConfig.selectedAccount;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.p00
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v11 */
            /* JADX WARN: Type inference failed for: r10v3, types: [int] */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r3v13, types: [org.telegram.tgnet.TLRPC$TL_messages_search] */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                long j14;
                long j15;
                int i12;
                ?? r10;
                int i13;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final f10 f10Var = f10.this;
                ArrayList arrayList5 = f10Var.f;
                final long j16 = j10;
                long j17 = j11;
                final String str5 = str2;
                final of.m0 m0Var2 = m0Var;
                int i14 = i10;
                long j18 = j12;
                long j19 = j13;
                final boolean z15 = z14;
                ArrayList<Object> arrayList6 = null;
                if (j16 == 0 || j17 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str5);
                    boolean z16 = z10;
                    if (isEmpty) {
                        i11 = i14;
                        j14 = j19;
                        j15 = j18;
                        i12 = 20;
                        r10 = z16;
                    } else {
                        j14 = j19;
                        ArrayList<Object> arrayList7 = new ArrayList<>();
                        ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                        ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                        j15 = j18;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                        i11 = i14;
                        i12 = 20;
                        messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                        r10 = z16 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i12;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = m0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : m0Var2.e;
                    tL_messages_searchGlobal2.community = MessagesController.getInstance(i11).getInputChannel(j17);
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z15 && str5.equals(f10Var.w) && !arrayList5.isEmpty()) {
                        i13 = 1;
                        MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = f10Var.v;
                        tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i11).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        i13 = 1;
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i13;
                    tL_messages_searchGlobal2.folder_id = r10;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    ?? tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = m0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : m0Var2.e;
                    tL_messages_search.peer = AccountInstance.getInstance(i14).getMessagesController().getInputPeer(j16);
                    if (j18 > 0) {
                        tL_messages_search.min_date = (int) (j18 / 1000);
                    }
                    if (j19 > 0) {
                        tL_messages_search.max_date = (int) (j19 / 1000);
                    }
                    if (z15 && str5.equals(f10Var.w) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) j3.r0.j(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    i11 = i14;
                    j15 = j18;
                }
                f10Var.w = str5;
                f10Var.x = str3;
                final ArrayList arrayList10 = new ArrayList();
                of.o0.y1(f10Var.w, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final int i15 = i9;
                final ArrayList<Object> arrayList11 = arrayList6;
                final int i16 = i11;
                final long j20 = j15;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() { // from class: org.telegram.ui.q00
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList12 = new ArrayList();
                        final int i17 = i16;
                        final String str6 = str5;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i18 = 0; i18 < size; i18++) {
                                MessageObject messageObject2 = new MessageObject(i17, messages_messages.messages.get(i18), false, true);
                                messageObject2.setQuery(str6);
                                arrayList12.add(messageObject2);
                            }
                        }
                        final f10 f10Var2 = f10.this;
                        final int i19 = i15;
                        final boolean z17 = z15;
                        final of.m0 m0Var3 = m0Var2;
                        final long j21 = j16;
                        final long j22 = j20;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.r00
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int i20;
                                boolean z18;
                                w00 w00Var2;
                                ArrayList arrayList15;
                                int i21;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                char c10;
                                char c11;
                                f10 f10Var3 = f10.this;
                                y00 y00Var = f10Var3.P;
                                d10 d10Var = f10Var3.Q;
                                ArrayList arrayList17 = f10Var3.n;
                                SparseArray sparseArray2 = f10Var3.h;
                                ArrayList arrayList18 = f10Var3.W;
                                HashMap hashMap = f10Var3.r;
                                ArrayList arrayList19 = f10Var3.f;
                                ArrayList arrayList20 = f10Var3.V;
                                gh.f1 f1Var2 = f10Var3.b;
                                org.telegram.ui.Components.gw0 gw0Var2 = f10Var3.c;
                                if (i19 != f10Var3.L) {
                                    return;
                                }
                                f10Var3.I = false;
                                if (tL_error != null) {
                                    dh.u uVar = gw0Var2.d;
                                    org.telegram.ui.Components.l80 l80Var = gw0Var2.e;
                                    uVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                    l80Var.setVisibility(0);
                                    l80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    gw0Var2.e(false, true);
                                    return;
                                }
                                gw0Var2.e(false, true);
                                dh.u uVar2 = gw0Var2.d;
                                org.telegram.ui.Components.l80 l80Var2 = gw0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                f10Var3.v = messages_messages2.next_rate;
                                int i22 = i17;
                                MessagesStorage.getInstance(i22).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                                MessagesController.getInstance(i22).putUsers(messages_messages2.users, false);
                                MessagesController.getInstance(i22).putChats(messages_messages2.chats, false);
                                boolean z19 = z17;
                                if (!z19) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                f10Var3.K = messages_messages2.count;
                                String str7 = str6;
                                f10Var3.M = str7;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i23 = 0;
                                while (i23 < size2) {
                                    boolean z20 = z19;
                                    MessageObject messageObject3 = (MessageObject) arrayList21.get(i23);
                                    ArrayList arrayList22 = arrayList21;
                                    ArrayList arrayList23 = (ArrayList) hashMap.get(messageObject3.monthKey);
                                    if (arrayList23 == null) {
                                        arrayList23 = new ArrayList();
                                        i21 = i23;
                                        hashMap.put(messageObject3.monthKey, arrayList23);
                                        arrayList17.add(messageObject3.monthKey);
                                    } else {
                                        i21 = i23;
                                    }
                                    arrayList23.add(messageObject3);
                                    arrayList19.add(messageObject3);
                                    sparseArray2.put(messageObject3.getId(), messageObject3);
                                    if (PhotoViewer.t1().Q1()) {
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i24 = f10Var3.N;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = t12.V6;
                                        ArrayList arrayList24 = t12.U6;
                                        sparseArray = sparseArray2;
                                        if (i24 == t12.c) {
                                            if (sparseArrayArr[0].indexOfKey(messageObject3.getId()) < 0) {
                                                if (t12.M5) {
                                                    arrayList24.add(messageObject3);
                                                    c11 = 0;
                                                } else {
                                                    c11 = 0;
                                                    arrayList24.add(0, messageObject3);
                                                }
                                                c10 = 0;
                                                sparseArrayArr[c11].put(messageObject3.getId(), messageObject3);
                                            } else {
                                                c10 = 0;
                                            }
                                            t12.L5[c10] = arrayList24.size() == t12.F5;
                                            t12.D2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i23 = i21 + 1;
                                    arrayList21 = arrayList22;
                                    z19 = z20;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z21 = z19;
                                if (arrayList19.size() > f10Var3.K) {
                                    f10Var3.K = arrayList19.size();
                                }
                                f10Var3.J = arrayList19.size() >= f10Var3.K;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                of.m0 m0Var4 = m0Var3;
                                if (isEmpty2) {
                                    if (m0Var4 == null) {
                                        uVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        l80Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(f10Var3.M) && j21 == 0 && j22 == 0) {
                                        uVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                        int i25 = m0Var4.d;
                                        String string = i25 == 1 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles) : i25 == 0 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia) : i25 == 2 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks) : i25 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                                        l80Var2.setVisibility(0);
                                        l80Var2.setText(string);
                                    } else {
                                        uVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        l80Var2.setVisibility(0);
                                        l80Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    }
                                }
                                if (m0Var4 != null) {
                                    int i26 = m0Var4.d;
                                    if (i26 != 0) {
                                        if (i26 == 1) {
                                            f10Var3.d = f10Var3.R;
                                        } else if (i26 == 2) {
                                            f10Var3.d = f10Var3.S;
                                        } else if (i26 == 3) {
                                            f10Var3.d = f10Var3.T;
                                        } else if (i26 == 5) {
                                            f10Var3.d = f10Var3.U;
                                        }
                                    } else if (TextUtils.isEmpty(f10Var3.M)) {
                                        f10Var3.d = d10Var;
                                    } else {
                                        f10Var3.d = y00Var;
                                    }
                                } else {
                                    f10Var3.d = y00Var;
                                }
                                f2.r0 adapter = f1Var2.getAdapter();
                                org.telegram.ui.Components.vk0 vk0Var3 = f10Var3.d;
                                if (adapter != vk0Var3) {
                                    f1Var2.setAdapter(vk0Var3);
                                }
                                if (z21) {
                                    i20 = 0;
                                } else {
                                    arrayList20.clear();
                                    ArrayList arrayList25 = arrayList13;
                                    ArrayList arrayList26 = arrayList20;
                                    if (arrayList25 != null) {
                                        arrayList26.addAll(arrayList25);
                                    }
                                    if (str7.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str7) || "saved messages".startsWith(str7))) {
                                        int i27 = 0;
                                        while (i27 < arrayList26.size()) {
                                            if (arrayList26.get(i27) instanceof TLRPC.User) {
                                                arrayList15 = arrayList26;
                                                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == ((TLRPC.User) arrayList26.get(i27)).id) {
                                                    arrayList26 = arrayList15;
                                                }
                                            } else {
                                                arrayList15 = arrayList26;
                                            }
                                            i27++;
                                            arrayList26 = arrayList15;
                                        }
                                        z18 = 0;
                                        arrayList26.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        f10Var3.a0 = z18;
                                        if (str7.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str7) || "archive".startsWith(str7))) {
                                            f10Var3.a0 = true;
                                        }
                                        w00Var2 = f10Var3.d0;
                                        i20 = z18;
                                        if (w00Var2 != null) {
                                            ((jv) w00Var2).i(TextUtils.isEmpty(f10Var3.M), arrayList26, arrayList18, f10Var3.a0);
                                            i20 = z18;
                                        }
                                    }
                                    z18 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    f10Var3.a0 = z18;
                                    if (str7.length() >= 3) {
                                        f10Var3.a0 = true;
                                    }
                                    w00Var2 = f10Var3.d0;
                                    i20 = z18;
                                    if (w00Var2 != null) {
                                    }
                                }
                                View view = null;
                                int i28 = -1;
                                for (int i29 = i20; i29 < size2; i29++) {
                                    View childAt = f1Var2.getChildAt(i29);
                                    if (childAt instanceof org.telegram.ui.Components.e00) {
                                        i28 = RecyclerView.R(childAt);
                                        view = childAt;
                                    }
                                }
                                if (view != null) {
                                    f1Var2.removeView(view);
                                }
                                if ((f10Var3.g0.getVisibility() == 0 && f1Var2.getChildCount() == 0) || (f1Var2.getAdapter() != d10Var && view != null)) {
                                    f10Var3.getViewTreeObserver().addOnPreDrawListener(new nq(f10Var3, (org.telegram.ui.Components.e00) view, i28, 3));
                                }
                                f10Var3.d.l();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 0L);
        t00 t00Var = this.g0;
        if (m0Var == null) {
            t00Var.setViewType(1);
            return;
        }
        int i11 = m0Var.d;
        if (i11 == 0) {
            if (TextUtils.isEmpty(this.E)) {
                t00Var.setViewType(2);
                return;
            } else {
                t00Var.setViewType(1);
                return;
            }
        }
        if (i11 == 1) {
            t00Var.setViewType(3);
            return;
        }
        if (i11 == 3 || i11 == 5) {
            t00Var.setViewType(4);
        } else if (i11 == 2) {
            t00Var.setViewType(5);
        }
    }

    public final void i(w00 w00Var, boolean z10) {
        this.d0 = w00Var;
        if (!z10 || w00Var == null) {
            return;
        }
        ArrayList arrayList = this.V;
        if (arrayList.isEmpty()) {
            return;
        }
        ((jv) w00Var).i(false, arrayList, this.W, this.a0);
    }

    public final void j(int i9, int i10, boolean z10) {
        setClipToPadding(false);
        this.n0 = z10;
        setPadding(0, i9, 0, i10);
        gh.f1 f1Var = this.b;
        if (z10) {
            f1Var.o1(0, i9, 0, i10);
        } else {
            f1Var.setPadding(0, i9, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i9;
        marginLayoutParams.bottomMargin = -i10;
        this.n0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = UserConfig.selectedAccount;
        this.m0 = i9;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.m0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.Components.vk0 vk0Var;
        int i11 = this.s;
        if (AndroidUtilities.isTablet()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i11 != this.s && (vk0Var = this.d) == this.Q) {
            this.n0 = true;
            vk0Var.l();
            this.n0 = false;
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.n0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(ig.a aVar) {
        lg.d dVar = new lg.d(null);
        dVar.e = new i3.i(26);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(0, 0);
        dVar.f = 1.0f;
        dVar.h = 1.0f;
        ih.b3 b3Var = this.i0;
        kg.d c10 = aVar.c(b3Var, dVar, false);
        b3Var.c = c10;
        c10.p(AndroidUtilities.dp(11.5f));
        ((kg.d) b3Var.c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.dn0 dn0Var) {
        this.e0 = dn0Var;
    }

    public void setUiCallback(e10 e10Var) {
        this.k0 = e10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.l0 = z10;
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
