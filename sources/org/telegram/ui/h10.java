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
import java.util.HashSet;
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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h10 extends FrameLayout implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate, oe.d {
    public static final SpannableStringBuilder[] s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.r2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final z00 S;
    public final a10 T;
    public final f10 U;
    public final c10 V;
    public final e10 W;
    public final oe.b a;
    public final c10 a0;
    public final bi.r1 b;
    public final c10 b0;
    public final org.telegram.ui.Components.ey0 c;
    public final ArrayList c0;
    public org.telegram.ui.Components.lm0 d;
    public final ArrayList d0;
    public q00 e;
    public boolean e0;
    public final ArrayList f;
    public final y5 f0;
    public final t00 g0;
    public final SparseArray h;
    public x00 h0;
    public org.telegram.ui.Components.zo0 i0;
    public final s4.c0 j0;
    public final u00 k0;
    public final AnimationNotificationsLocker l0;
    public final y00 m0;
    public final ArrayList n;
    public final p00 n0;
    public g10 o0;
    public boolean p0;
    public int q0;
    public final HashMap r;
    public boolean r0;
    public int s;
    public int v;
    public String w;
    public String x;
    public ig.p0 y;

    public h10(org.telegram.ui.ActionBar.r2 r2Var) {
        super(r2Var.getParentActivity());
        this.a = new oe.b(0, this, org.telegram.ui.Components.ds.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.S = new z00(0, 0L);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.f0 = new y5(this, 4);
        this.g0 = new t00(this);
        this.l0 = new AnimationNotificationsLocker();
        this.n0 = new p00(this, 0);
        this.L = r2Var;
        Activity parentActivity = r2Var.getParentActivity();
        this.K = parentActivity;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this, null);
        bi.r1 r1Var = new bi.r1(this, parentActivity, 29);
        this.b = r1Var;
        r1Var.setOnItemClickListener(new h(this, 12));
        r1Var.setOnItemLongClickListener(new f(this, 16));
        s4.c0 c0Var = new s4.c0();
        this.j0 = c0Var;
        r1Var.setLayoutManager(c0Var);
        u00 u00Var = new u00(this, parentActivity, 0);
        this.k0 = u00Var;
        addView(u00Var);
        addView(r1Var);
        r1Var.setSectionsType(2);
        r1Var.setSkipDrawSection(true);
        r1Var.setOnScrollListener(new v00(this));
        y00 y00Var = new y00(parentActivity);
        this.m0 = y00Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals(y00Var.c, formatDateChat)) {
            y00Var.c = formatDateChat;
            y00Var.a.t(formatDateChat, true, true);
        }
        addView(y00Var, org.telegram.ui.Components.gb1.h(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new a10(this);
        this.U = new f10(this, getContext());
        this.V = new c10(this, getContext(), 1);
        this.W = new e10(this, getContext());
        this.a0 = new c10(this, getContext(), 4);
        this.b0 = new c10(this, getContext(), 2);
        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(parentActivity, u00Var, 1, null);
        this.c = ey0Var;
        addView(ey0Var);
        r1Var.setEmptyView(ey0Var);
        ey0Var.setVisibility(8);
        b();
    }

    public static void a(h10 h10Var, MessageObject messageObject, View view, int i10) {
        if (!h10Var.o0.g()) {
            h10Var.o0.a();
        }
        if (h10Var.o0.g()) {
            h10Var.o0.e(messageObject, view, i10);
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
            jg.b2 c10 = jg.c2.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
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
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(i10 == 0 ? 2 : 1, ApplicationLoader.applicationContext.getDrawable(i11).mutate());
            if (i10 == 1 || i10 == 2) {
                zqVar.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
            spannableStringBuilder.setSpan(zqVar, 0, spannableStringBuilder.length(), 0);
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
                charSequence2 = pg.d.j(findTopic2, null, null);
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
                charSequence3 = pg.d.j(findTopic, null, null);
            }
            charSequence = Emoji.replaceEmoji(charSequence3, textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ih));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
    }

    public final void b() {
        float f7 = this.a.e;
        y00 y00Var = this.m0;
        y00Var.setTranslationY((1.0f - f7) * (-AndroidUtilities.dp(24.0f)));
        y00Var.setAlpha(f7);
        y00Var.setVisibility(f7 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bi.r1 r1Var = this.b;
            int childCount = r1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (r1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) r1Var.getChildAt(i12)).a0(0, true);
                }
                r1Var.getChildAt(i12).invalidate();
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
            this.o0.e(messageObject, view, i11);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p2) {
            this.o0.d(messageObject);
            return;
        }
        int i12 = this.y.d;
        t00 t00Var = this.g0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.r2 r2Var = this.L;
        if (i12 == 0) {
            PhotoViewer.u1().M2(null, r2Var, null);
            PhotoViewer.u1().d2(arrayList, i10, 0L, 0L, 0L, t00Var);
            this.R = PhotoViewer.u1().c;
            return;
        }
        if (i12 == 3 || i12 == 5) {
            if (view instanceof org.telegram.ui.Cells.n7) {
                ((org.telegram.ui.Cells.n7) view).a();
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                TLRPC.Document document = messageObject.getDocument();
                if (!o7Var.G) {
                    if (o7Var.F) {
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                        o7Var.f(true);
                        return;
                    } else {
                        MessageObject message = o7Var.getMessage();
                        message.putInDownloadsStore = true;
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                        o7Var.f(true);
                        return;
                    }
                }
                if (!messageObject.canPreviewDocument()) {
                    AndroidUtilities.openDocument(messageObject, this.K, r2Var);
                    return;
                }
                PhotoViewer.u1().M2(null, r2Var, null);
                int indexOf = arrayList.indexOf(messageObject);
                if (indexOf >= 0) {
                    PhotoViewer.u1().M2(null, r2Var, null);
                    PhotoViewer.u1().d2(arrayList, indexOf, 0L, 0L, 0L, t00Var);
                    this.R = PhotoViewer.u1().c;
                    return;
                } else {
                    ArrayList l4 = org.telegram.messenger.t.l(messageObject);
                    PhotoViewer.u1().M2(null, r2Var, null);
                    PhotoViewer.u1().d2(l4, 0, 0L, 0L, 0L, t00Var);
                    this.R = PhotoViewer.u1().c;
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
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                            r2Var.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.dv.I(this.L, messageObject, this.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.r7) view).E;
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
            qf.d.r(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.a7));
        int i10 = org.telegram.ui.ActionBar.y6.i7;
        bi.r1 r1Var = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8192, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 16384, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        org.telegram.ui.Components.ey0 ey0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.h7(ey0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(ey0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.q00] */
    public final void h(final long j10, final long j11, final long j12, final long j13, final ig.p0 p0Var, final boolean z10, String str, boolean z11) {
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
        q00 q00Var = this.e;
        if (q00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(q00Var);
        }
        y5 y5Var = this.f0;
        AndroidUtilities.cancelRunOnUIThread(y5Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList2 = this.d0;
        final boolean z14 = z12;
        ArrayList arrayList3 = this.c0;
        org.telegram.ui.Components.ey0 ey0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z13 || (p0Var == null && j11 == 0 && j10 == 0 && j12 == 0 && j13 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.M = true;
            ey0Var.setVisibility(0);
            org.telegram.ui.Components.lm0 lm0Var = this.d;
            if (lm0Var != null) {
                lm0Var.l();
            }
            this.P++;
            bi.r1 r1Var = this.b;
            if (r1Var.getPinnedHeader() != null) {
                arrayList = arrayList4;
                r1Var.getPinnedHeader().setAlpha(0.0f);
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
            y5Var.run();
            ey0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            x00 x00Var = this.h0;
            if (x00Var != null) {
                ((iv) x00Var).j(false, null, null, false);
            }
        }
        final int i10 = this.P + 1;
        this.P = i10;
        final int i11 = UserConfig.selectedAccount;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.q00
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                String str5;
                ig.p0 p0Var2;
                int i13;
                long j14;
                boolean z15;
                long j15;
                int i14;
                int i15;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final h10 h10Var = h10.this;
                ArrayList arrayList5 = h10Var.f;
                final long j16 = j10;
                long j17 = j11;
                String str6 = str2;
                ig.p0 p0Var3 = p0Var;
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
                    if (z15 && str5.equals(h10Var.w) && !arrayList5.isEmpty()) {
                        i15 = 1;
                        MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = h10Var.v;
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
                    if (z16 && str6.equals(h10Var.w) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) ic.a.g(1, arrayList5)).getId();
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
                h10Var.w = str5;
                h10Var.x = str3;
                final ArrayList arrayList10 = new ArrayList();
                ig.r0.E1(h10Var.w, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                final boolean z18 = z15;
                final int i17 = i10;
                final ig.p0 p0Var4 = p0Var2;
                final String str7 = str5;
                final int i18 = i12;
                final ArrayList<Object> arrayList11 = arrayList6;
                final long j20 = j14;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() { // from class: org.telegram.ui.r00
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
                        final h10 h10Var2 = h10.this;
                        final int i21 = i17;
                        final boolean z19 = z18;
                        final ig.p0 p0Var5 = p0Var4;
                        final long j21 = j16;
                        final long j22 = j20;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.s00
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
                                x00 x00Var2;
                                ArrayList arrayList15;
                                int i23;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                ?? r16;
                                char c10;
                                h10 h10Var3 = h10.this;
                                a10 a10Var = h10Var3.T;
                                f10 f10Var = h10Var3.U;
                                ArrayList arrayList17 = h10Var3.n;
                                SparseArray sparseArray2 = h10Var3.h;
                                ArrayList arrayList18 = h10Var3.d0;
                                HashMap hashMap = h10Var3.r;
                                ArrayList arrayList19 = h10Var3.f;
                                ArrayList arrayList20 = h10Var3.c0;
                                bi.r1 r1Var2 = h10Var3.b;
                                org.telegram.ui.Components.ey0 ey0Var2 = h10Var3.c;
                                if (i21 != h10Var3.P) {
                                    return;
                                }
                                h10Var3.M = false;
                                if (tL_error != null) {
                                    xh.n nVar = ey0Var2.d;
                                    org.telegram.ui.Components.z90 z90Var = ey0Var2.e;
                                    nVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                    z90Var.setVisibility(0);
                                    z90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    ey0Var2.e(false, true);
                                    return;
                                }
                                ey0Var2.e(false, true);
                                xh.n nVar2 = ey0Var2.d;
                                org.telegram.ui.Components.z90 z90Var2 = ey0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                h10Var3.v = messages_messages2.next_rate;
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
                                h10Var3.O = messages_messages2.count;
                                String str9 = str8;
                                h10Var3.Q = str9;
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
                                    if (PhotoViewer.u1().T1()) {
                                        PhotoViewer u12 = PhotoViewer.u1();
                                        int i26 = h10Var3.R;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = u12.Z6;
                                        ArrayList arrayList24 = u12.Y6;
                                        sparseArray = sparseArray2;
                                        if (i26 == u12.c) {
                                            if (sparseArrayArr[0].indexOfKey(messageObject3.getId()) < 0) {
                                                if (u12.Q5) {
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
                                            u12.P5[r16] = arrayList24.size() == u12.J5 ? true : r16;
                                            u12.F2();
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
                                if (arrayList19.size() > h10Var3.O) {
                                    h10Var3.O = arrayList19.size();
                                }
                                h10Var3.N = arrayList19.size() >= h10Var3.O;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                ig.p0 p0Var6 = p0Var5;
                                if (isEmpty2) {
                                    if (p0Var6 == null) {
                                        nVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        z90Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(h10Var3.Q) && j21 == 0 && j22 == 0) {
                                        nVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                        int i27 = p0Var6.d;
                                        String string = i27 == 1 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles) : i27 == 0 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia) : i27 == 2 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks) : i27 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                                        z90Var2.setVisibility(0);
                                        z90Var2.setText(string);
                                    } else {
                                        nVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        z90Var2.setVisibility(0);
                                        z90Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    }
                                }
                                if (p0Var6 != null) {
                                    int i28 = p0Var6.d;
                                    if (i28 != 0) {
                                        if (i28 == 1) {
                                            h10Var3.d = h10Var3.V;
                                        } else if (i28 == 2) {
                                            h10Var3.d = h10Var3.W;
                                        } else if (i28 == 3) {
                                            h10Var3.d = h10Var3.a0;
                                        } else if (i28 == 5) {
                                            h10Var3.d = h10Var3.b0;
                                        }
                                    } else if (TextUtils.isEmpty(h10Var3.Q)) {
                                        h10Var3.d = f10Var;
                                    } else {
                                        h10Var3.d = a10Var;
                                    }
                                } else {
                                    h10Var3.d = a10Var;
                                }
                                s4.h0 adapter = r1Var2.getAdapter();
                                org.telegram.ui.Components.lm0 lm0Var3 = h10Var3.d;
                                if (adapter != lm0Var3) {
                                    r1Var2.setAdapter(lm0Var3);
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
                                        h10Var3.e0 = r12;
                                        if (str9.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str9) || "archive".startsWith(str9))) {
                                            h10Var3.e0 = true;
                                        }
                                        x00Var2 = h10Var3.h0;
                                        i22 = r12;
                                        if (x00Var2 != null) {
                                            ((iv) x00Var2).j(TextUtils.isEmpty(h10Var3.Q), arrayList26, arrayList18, h10Var3.e0);
                                            i22 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    h10Var3.e0 = r12;
                                    if (str9.length() >= 3) {
                                        h10Var3.e0 = true;
                                    }
                                    x00Var2 = h10Var3.h0;
                                    i22 = r12;
                                    if (x00Var2 != null) {
                                    }
                                }
                                View view = null;
                                int i30 = -1;
                                for (int i31 = i22; i31 < size2; i31++) {
                                    View childAt = r1Var2.getChildAt(i31);
                                    if (childAt instanceof org.telegram.ui.Components.c10) {
                                        i30 = RecyclerView.R(childAt);
                                        view = childAt;
                                    }
                                }
                                if (view != null) {
                                    r1Var2.removeView(view);
                                }
                                if ((h10Var3.k0.getVisibility() == 0 && r1Var2.getChildCount() == 0) || (r1Var2.getAdapter() != f10Var && view != null)) {
                                    h10Var3.getViewTreeObserver().addOnPreDrawListener(new rq(h10Var3, (org.telegram.ui.Components.c10) view, i30, 3));
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
        u00 u00Var = this.k0;
        if (p0Var == null) {
            u00Var.setViewType(1);
            return;
        }
        int i12 = p0Var.d;
        if (i12 == 0) {
            if (TextUtils.isEmpty(this.I)) {
                u00Var.setViewType(2);
                return;
            } else {
                u00Var.setViewType(1);
                return;
            }
        }
        if (i12 == 1) {
            u00Var.setViewType(3);
            return;
        }
        if (i12 == 3 || i12 == 5) {
            u00Var.setViewType(4);
        } else if (i12 == 2) {
            u00Var.setViewType(5);
        }
    }

    public final void i(x00 x00Var, boolean z10) {
        this.h0 = x00Var;
        if (!z10 || x00Var == null) {
            return;
        }
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((iv) x00Var).j(false, arrayList, this.d0, this.e0);
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.r0 = z10;
        setPadding(0, i10, 0, i11);
        bi.r1 r1Var = this.b;
        if (z10) {
            r1Var.t1(0, i10, 0, i11);
        } else {
            r1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r1Var.getLayoutParams();
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

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(ch.b bVar) {
        fh.e eVar = new fh.e(null);
        eVar.e = new gh.a(0);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(0, 0);
        eVar.f = 1.0f;
        eVar.h = 1.0f;
        y00 y00Var = this.m0;
        eh.d c10 = bVar.c(y00Var, eVar, false);
        y00Var.b = c10;
        c10.x(AndroidUtilities.dp(11.5f));
        y00Var.b.w(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.zo0 zo0Var) {
        this.i0 = zo0Var;
    }

    public void setUiCallback(g10 g10Var) {
        this.o0 = g10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.p0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            y00 y00Var = this.m0;
            if (y00Var != null) {
                y00Var.updateColors();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
