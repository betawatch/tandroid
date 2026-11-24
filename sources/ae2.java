// default package

import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ae2 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ae2(c cVar, String str, p8c p8cVar) {
        this.a = (byte) 16;
        this.b = str;
        this.c = p8cVar;
    }

    private final void b(Object obj, Object obj2) {
        boolean z;
        l18 l18Var = (l18) this.b;
        TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
        TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
        w66 w66Var = l18Var.W;
        int i = l18Var.O;
        l18Var.V = false;
        TLRPC.InputGroupCall inputGroupCall = l18Var.P;
        if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
            return;
        }
        if (groupcallstars != null) {
            na7.q1(i).a4(groupcallstars.users, false);
            na7.q1(i).U3(groupcallstars.chats, false);
            int i2 = 0;
            while (true) {
                if (i2 >= groupcallstars.top_donors.size()) {
                    break;
                }
                if (!groupcallstars.top_donors.get(i2).my) {
                    i2++;
                } else if (groupcallstars.top_donors.get(i2).stars > 0) {
                    z = true;
                }
            }
            z = false;
            long j = groupcallstars.total_stars;
            boolean z2 = (j == l18Var.R && l18Var.T == z) ? false : true;
            l18Var.R = j;
            l18Var.U = groupcallstars.top_donors;
            l18Var.T = z;
            if (z2) {
                l18Var.i();
            }
            l18Var.s();
        }
        if (l18Var.isAttachedToWindow()) {
            gl.r(w66Var);
            gl.e3(w66Var, 5000L);
        }
    }

    private final void c(Object obj, Object obj2) {
        na7 na7Var = (na7) this.b;
        i8c i8cVar = (i8c) this.c;
        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        if (messages_chats == null) {
            i8cVar.a(null, tL_error);
            return;
        }
        ArrayList arrayList = new ArrayList(messages_chats.chats.size());
        na7Var.U3(messages_chats.chats, true);
        ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            TLRPC.Chat chat = arrayList2.get(i);
            i++;
            TLRPC.Chat chat2 = chat;
            if (chat2.creator && !hc2.p0(chat2) && !hc2.Y(chat2)) {
                arrayList.add(chat2);
            }
        }
        i8cVar.a(arrayList, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0a3f  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        boolean z;
        long j;
        InputMethodManager inputMethodManager;
        TLRPC.User V1;
        TLRPC.User V12;
        TLRPC.Chat K0;
        TLRPC.Chat K02;
        long j2;
        u21 b0;
        int i;
        JSONArray jSONArray;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        byte b = 15;
        byte b2 = 14;
        byte b3 = 25;
        String str = "";
        int i2 = 2;
        long j3 = 0;
        byte b4 = 10;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        String str2 = null;
        r13 = null;
        r13 = null;
        byte[] v = null;
        TLRPC.TL_contacts_found tL_contacts_found = null;
        byte b5 = 0;
        switch (this.a) {
            case 0:
                je2 je2Var = (je2) this.b;
                ud2 ud2Var = (ud2) this.c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    gl.d3(new n92(ud2Var, tL_error, b2));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (!(chatThemes instanceof TL_account.Tl_chatThemes)) {
                    if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                        gl.d3(new n92(je2Var, ud2Var, b));
                        return;
                    }
                    return;
                }
                TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                ad7 messagesStorage = je2Var.getMessagesStorage();
                ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
                messagesStorage.getClass();
                messagesStorage.H(new t67(messagesStorage, arrayList2, b3));
                je2Var.getMessagesStorage().j1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                je2Var.getMessagesController().a4(tl_chatThemes.users, false);
                je2Var.getMessagesController().U3(tl_chatThemes.chats, false);
                ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                int size = arrayList3.size();
                int i3 = 0;
                while (i3 < size) {
                    TLRPC.ChatTheme chatTheme = arrayList3.get(i3);
                    i3++;
                    TLRPC.ChatTheme chatTheme2 = chatTheme;
                    if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                        arrayList.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    jy3 jy3Var = new jy3(je2Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i4));
                    jy3Var.p(0, null);
                    jy3Var.p(1, null);
                    jy3Var.n(0, null);
                    jy3Var.n(1, null);
                    arrayList4.add(jy3Var);
                }
                gl.d3(new b87((Object) je2Var, (Object) tl_chatThemes, (Object) arrayList4, (Object) arrayList, (Object) ud2Var, (byte) 23));
                return;
            case 1:
                ht htVar = (ht) this.b;
                gt gtVar = (gt) this.c;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool.booleanValue()) {
                        htVar.a(Boolean.TRUE);
                    }
                    gtVar.run();
                    return;
                }
                return;
            case 2:
                ao0 ao0Var = (ao0) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool2 = (Boolean) obj;
                String str3 = (String) obj2;
                ao0Var.l2.a.setLoading(false);
                if (ao0Var.getContext() != null) {
                    d S = LaunchActivity.S();
                    vz5 vz5Var = LaunchActivity.H1.w0;
                    if (S != null) {
                        if (!bool2.booleanValue()) {
                            if (str3 != null) {
                                ao0Var.dismiss();
                                u21.b0(S).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, str3)).j();
                                return;
                            }
                            return;
                        }
                        ao0Var.dismiss();
                        mu1 U9 = mu1.U9(-ao0Var.W1.id);
                        S.presentFragment(U9);
                        S.whenFullyVisible(new z20(U9, tL_starsGiveawayOption, (byte) 12));
                        if (vz5Var != null) {
                            vz5Var.c(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((k8c) this.b).a((Boolean) obj, (fj0) obj2, (gj0) this.c);
                return;
            case 4:
                uk1 uk1Var = (uk1) this.b;
                d dVar = (d) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    na7.q1(uk1Var.I).Q3(updates, false);
                }
                if (tL_error2 != null) {
                    gl.d3(new aj1(dVar, tL_error2, (byte) 3));
                    return;
                }
                return;
            case 5:
                ((mu1) this.b).h9((k27) this.c, (Long) obj, (Runnable) obj2);
                return;
            case 6:
                mu1 mu1Var = (mu1) this.b;
                p pVar = (p) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                mu1Var.X5 = 0;
                if (webpagepreview != null) {
                    mu1Var.getMessagesController().a4(webpagepreview.users, false);
                    mu1Var.getMessagesController().U3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            pVar.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (webPage == null || !"telegram_story".equals(webPage.type)) {
                            pVar.a(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                            return;
                        }
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            for (int i5 = 0; i5 < tL_messageMediaWebPage.webpage.attributes.size(); i5++) {
                                if (tL_messageMediaWebPage.webpage.attributes.get(i5) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i5);
                                    if (tL_webPageAttributeStory != null) {
                                        pVar.a(Boolean.FALSE, null);
                                        return;
                                    } else if (tL_webPageAttributeStory.storyItem != null) {
                                        pVar.a(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                        return;
                                    } else {
                                        mu1Var.getMessagesStorage().a.c(new hn1(mu1Var, tL_messageMediaWebPage, tL_webPageAttributeStory, pVar, (byte) 2));
                                        return;
                                    }
                                }
                            }
                        }
                        tL_webPageAttributeStory = null;
                        if (tL_webPageAttributeStory != null) {
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage != null) {
                }
                break;
            case 7:
                wt1 wt1Var = (wt1) this.b;
                gb2 gb2Var = (gb2) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                mu1 mu1Var2 = wt1Var.a;
                if (tL_channels_channelParticipant != null) {
                    mu1Var2.getMessagesController().a4(tL_channels_channelParticipant.users, false);
                    mu1Var2.getMessagesController().U3(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        wt1Var.e(gb2Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str4 = (String) this.c;
                CharSequence charSequence = (CharSequence) obj;
                int i6 = ChatActivityEnterView.r7;
                chatActivityEnterView.o6 = -1;
                if (chatActivityEnterView.p6) {
                    ex1 ex1Var = chatActivityEnterView.F0;
                    Editable text = ex1Var != null ? ex1Var.getText() : null;
                    if (text == null || !str4.equals(text.toString())) {
                        chatActivityEnterView.l(false);
                        return;
                    }
                    if (charSequence == null) {
                        chatActivityEnterView.l(true);
                        return;
                    }
                    ex1 ex1Var2 = chatActivityEnterView.F0;
                    Editable text2 = ex1Var2.getText();
                    chatActivityEnterView.y0();
                    Layout layout = ex1Var2.getLayout();
                    if (layout == null || layout.getWidth() <= 0) {
                        z = false;
                    } else {
                        boolean z2 = bm2.h(chatActivityEnterView.F0(bkb.c6)) < 0.5d;
                        float width = layout.getWidth();
                        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), ex1Var2.getPaint(), layout.getWidth()).build();
                        int scrollY = ex1Var2.getScrollY();
                        int max = Math.max(1, (ex1Var2.getHeight() - ex1Var2.getTotalPaddingTop()) - ex1Var2.getTotalPaddingBottom());
                        float max2 = Math.max(scrollY + max, Math.min(build.getHeight(), (max << 1) + scrollY));
                        bn3 bn3Var = chatActivityEnterView.n6;
                        float f = bn3Var.E;
                        z = bn3Var.b(((scrollY * 0.9f) - f) - gl.L(4.0f), ir2.i(max2, 0.9f, width, f) + gl.L(4.0f), chatActivityEnterView.F0(bkb.Oe) | (-16777216), z2);
                        if (z) {
                            j = Math.max(600L, Math.min(900L, (Math.max(layout.getLineCount(), build.getLineCount()) * 60) + 540));
                            chatActivityEnterView.G1 = SystemClock.uptimeMillis() + j;
                            chatActivityEnterView.H1 = bn3.J;
                            BaseInputConnection.removeComposingSpans(text2);
                            text2.replace(0, text2.length(), charSequence);
                            ex1Var2.setSelection(text2.length());
                            inputMethodManager = (InputMethodManager) chatActivityEnterView.getContext().getSystemService("input_method");
                            if (inputMethodManager != null) {
                                inputMethodManager.restartInput(ex1Var2);
                            }
                            if (z) {
                                if (!chatActivityEnterView.F1) {
                                    chatActivityEnterView.w6 = true;
                                    chatActivityEnterView.F1 = true;
                                }
                                chatActivityEnterView.n6.a(j);
                                j92 C0 = chatActivityEnterView.C0();
                                if (C0 != null) {
                                    if (chatActivityEnterView.u6 == null) {
                                        chatActivityEnterView.u6 = new om3();
                                    }
                                    if (C0.h == null) {
                                        C0.h = new q31((Object) chatActivityEnterView, (Object) C0, (byte) 19);
                                    }
                                }
                                j92 C02 = chatActivityEnterView.C0();
                                if (C02 != null) {
                                    C02.invalidate();
                                }
                                bn3 bn3Var2 = chatActivityEnterView.n6;
                                long j4 = bn3Var2.e;
                                chatActivityEnterView.G1 = j4 == 0 ? 0L : j4 + bn3Var2.a;
                                bn3Var2.H = new av1(chatActivityEnterView, b2);
                                ex1Var2.invalidate();
                                gl.e3(new av1(chatActivityEnterView, b), 120 + j);
                            }
                            gl.e3(new av1(chatActivityEnterView, (byte) 10), Math.max(0L, j - 260));
                            qw1 qw1Var = new qw1(chatActivityEnterView, (byte) 1);
                            chatActivityEnterView.r6 = qw1Var;
                            gl.e3(qw1Var, j + 140);
                            return;
                        }
                    }
                    j = 0;
                    BaseInputConnection.removeComposingSpans(text2);
                    text2.replace(0, text2.length(), charSequence);
                    ex1Var2.setSelection(text2.length());
                    inputMethodManager = (InputMethodManager) chatActivityEnterView.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                    }
                    if (z) {
                    }
                    gl.e3(new av1(chatActivityEnterView, (byte) 10), Math.max(0L, j - 260));
                    qw1 qw1Var2 = new qw1(chatActivityEnterView, (byte) 1);
                    chatActivityEnterView.r6 = qw1Var2;
                    gl.e3(qw1Var2, j + 140);
                    return;
                }
                return;
            case 9:
                x02 x02Var = (x02) this.b;
                a8 a8Var = (a8) this.c;
                Long l = (Long) obj;
                ((Runnable) obj2).run();
                x02Var.d2.setStarsPrice(l.longValue());
                if (l.longValue() > 0) {
                    a8Var.setText(k96.M0(2131747535, null));
                    a8Var.setSubtext(k96.G((int) l.longValue(), "Stars", new Object[0]));
                    x02Var.b2.t(l.longValue());
                    return;
                } else {
                    a8Var.setText(k96.M0(2131747537, null));
                    a8Var.setSubtext(null);
                    x02Var.b2.t(0L);
                    return;
                }
            case 10:
                ((k62) this.b).V((qd8) ((ld8) this.c), true);
                return;
            case 11:
                vj3 vj3Var = (vj3) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList5 = vj3Var.V;
                ArrayList arrayList6 = vj3Var.U;
                int i7 = vj3Var.Q;
                if (!TextUtils.equals(tL_contacts_search.q, vj3Var.h0) || TextUtils.isEmpty(vj3Var.h0)) {
                    return;
                }
                vj3Var.d0 = false;
                if (tL_contacts_found2 != null) {
                    ad7.Y(i7).j1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                    na7.q1(i7).a4(tL_contacts_found2.users, false);
                    na7.q1(i7).U3(tL_contacts_found2.chats, false);
                    tL_contacts_found = tL_contacts_found2;
                }
                HashSet hashSet = new HashSet();
                arrayList6.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList7 = tL_contacts_found.my_results;
                    int size2 = arrayList7.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        TLRPC.Peer peer = arrayList7.get(i8);
                        i8++;
                        TLRPC.Peer peer2 = peer;
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (V12 = na7.q1(i7).V1(Long.valueOf(peer2.user_id))) != null && V12.bot && !hashSet.contains(Long.valueOf(V12.id))) {
                            hashSet.add(Long.valueOf(V12.id));
                            arrayList6.add(V12);
                        }
                    }
                }
                arrayList5.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList8 = tL_contacts_found.results;
                    int size3 = arrayList8.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        TLRPC.Peer peer3 = arrayList8.get(i9);
                        i9++;
                        TLRPC.Peer peer4 = peer3;
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (V1 = na7.q1(i7).V1(Long.valueOf(peer4.user_id))) != null && V1.bot && !hashSet.contains(Long.valueOf(V1.id))) {
                            hashSet.add(Long.valueOf(V1.id));
                            arrayList5.add(V1);
                        }
                    }
                }
                o39 o39Var = vj3Var.d;
                if (o39Var != null) {
                    o39Var.w0(0);
                }
                vj3Var.O(true);
                return;
            case 12:
                xj3 xj3Var = (xj3) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = xj3Var.V;
                ArrayList arrayList10 = xj3Var.U;
                ArrayList arrayList11 = xj3Var.T;
                int i10 = xj3Var.Q;
                if (!TextUtils.equals(tL_contacts_search2.q, xj3Var.e0) || TextUtils.isEmpty(xj3Var.e0)) {
                    return;
                }
                xj3Var.a0 = false;
                if (tL_contacts_found3 != null) {
                    ad7.Y(i10).j1(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                    na7.q1(i10).a4(tL_contacts_found3.users, false);
                    na7.q1(i10).U3(tL_contacts_found3.chats, false);
                } else {
                    tL_contacts_found3 = null;
                }
                HashSet hashSet2 = new HashSet();
                arrayList11.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found3.my_results;
                    int size4 = arrayList12.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        TLRPC.Peer peer5 = arrayList12.get(i11);
                        i11++;
                        TLRPC.Peer peer6 = peer5;
                        long j5 = j3;
                        if ((peer6 instanceof TLRPC.TL_peerChannel) && (K02 = na7.q1(i10).K0(Long.valueOf(peer6.channel_id))) != null && hc2.V(K02) && !hashSet2.contains(Long.valueOf(K02.id))) {
                            hashSet2.add(Long.valueOf(K02.id));
                            arrayList11.add(K02);
                        }
                        j3 = j5;
                    }
                }
                long j6 = j3;
                arrayList10.clear();
                String lowerCase = xj3Var.e0.toLowerCase();
                String J3 = gl.J3(lowerCase);
                HashMap hashMap = na7.q1(i10).M4;
                p97 p97Var = hashMap != null ? (p97) hashMap.get(Long.valueOf(j6)) : null;
                if (p97Var != null) {
                    ArrayList arrayList13 = p97Var.b;
                    if (!arrayList13.isEmpty()) {
                        int size5 = arrayList13.size();
                        int i12 = 0;
                        while (i12 < size5) {
                            Object obj3 = arrayList13.get(i12);
                            i12++;
                            TLObject tLObject = (TLObject) obj3;
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (hc2.V(chat)) {
                                    TLRPC.Chat K03 = na7.q1(i10).K0(Long.valueOf(chat.id));
                                    if (hc2.r0(chat) && (K03 == null || hc2.r0(K03))) {
                                        String lowerCase2 = chat.title.toLowerCase();
                                        String J32 = gl.J3(lowerCase2);
                                        if (lowerCase2.startsWith(lowerCase) || de9.t(" ", lowerCase, lowerCase2) || J32.startsWith(J3) || J32.contains(" ".concat(J3))) {
                                            if (!hashSet2.contains(Long.valueOf(chat.id))) {
                                                hashSet2.add(Long.valueOf(chat.id));
                                                arrayList10.add(chat);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList9.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList14 = tL_contacts_found3.results;
                    int size6 = arrayList14.size();
                    int i13 = 0;
                    while (i13 < size6) {
                        TLRPC.Peer peer7 = arrayList14.get(i13);
                        i13++;
                        TLRPC.Peer peer8 = peer7;
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (K0 = na7.q1(i10).K0(Long.valueOf(peer8.channel_id))) != null && hc2.V(K0) && !hashSet2.contains(Long.valueOf(K0.id))) {
                            hashSet2.add(Long.valueOf(K0.id));
                            arrayList9.add(K0);
                        }
                    }
                }
                xj3Var.O(true);
                return;
            case 13:
                CancellationToken cancellationToken = (CancellationToken) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (cancellationToken.isCancellationRequested()) {
                    return;
                }
                if (auth_authorization == null || tL_error3 != null) {
                    taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error3));
                    return;
                } else {
                    taskCompletionSource.trySetResult(auth_authorization);
                    return;
                }
            case 14:
                kt4 kt4Var = (kt4) this.b;
                i8c i8cVar = (i8c) this.c;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = kt4Var.e;
                if (tL_StarGiftAuctionState != null) {
                    kt4Var.getMessagesController().a4(tL_StarGiftAuctionState.users, false);
                    kt4Var.getMessagesController().U3(tL_StarGiftAuctionState.chats, false);
                    boolean booleanValue = ((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE)).booleanValue();
                    TL_stars.StarGift starGift = tL_StarGiftAuctionState.gift;
                    if (!booleanValue) {
                        longSparseArray.put(starGift.id, Boolean.TRUE);
                        kt4Var.j(tL_StarGiftAuctionState.gift.id, new au0((Object) kt4Var, (Object) tL_StarGiftAuctionState, (Object) i8cVar, (Object) tL_error4, (byte) 9));
                        return;
                    }
                    kt4Var.f(starGift.id, tL_StarGiftAuctionState);
                }
                i8cVar.a(tL_StarGiftAuctionState, tL_error4);
                return;
            case 15:
                u41 u41Var = (u41) this.b;
                d dVar2 = (d) this.c;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                u41Var.setLoading(false);
                if (dVar2.getContext() == null || dVar2.getParentActivity() == null) {
                    return;
                }
                if (tL_error5 != null) {
                    u21.e0(tL_error5);
                    return;
                }
                if (tL_starsRevenueStatus != null) {
                    if (!tL_starsRevenueStatus.withdrawal_enabled) {
                        b0 = u21.b0(dVar2);
                        i = 2131749329;
                        ir2.v(null, i, b0, R.raw.error, 36);
                        return;
                    }
                    TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                    if (starsAmount != null) {
                        j2 = Math.max(0L, starsAmount.amount);
                        if (j2 <= 0) {
                            uz4.g(dVar2, j2, null);
                            return;
                        }
                        b0 = u21.b0(dVar2);
                        i = 2131749327;
                        ir2.v(null, i, b0, R.raw.error, 36);
                        return;
                    }
                }
                j2 = 0;
                if (j2 <= 0) {
                }
                break;
            case 16:
                String str5 = (String) this.b;
                p8c p8cVar = (p8c) this.c;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (apiresponse != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(apiresponse.response.data);
                        if (jSONObject.has("stack")) {
                            jSONArray = jSONObject.getJSONArray("stack");
                            if (jSONObject.has("exit_code") && jSONObject.getInt("exit_code") != 0) {
                                throw new Exception("received exit code: " + jSONObject.getInt("exit_code"));
                            }
                        } else {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                            if (jSONObject2.has("exit_code") && jSONObject2.getInt("exit_code") != 0) {
                                throw new Exception("received exit code: " + jSONObject2.getInt("exit_code"));
                            }
                            jSONArray = jSONObject2.getJSONArray("stack");
                        }
                        if (jSONArray.get(0) instanceof JSONArray) {
                            str = jSONArray.getJSONArray(0).getString(1);
                        } else if (jSONArray.get(0) instanceof JSONObject) {
                            str = jSONArray.getJSONObject(0).getString("value");
                        }
                        if (str.startsWith("0x")) {
                            v = Utilities.v(str.substring(2));
                        }
                    } catch (Exception e) {
                        c.n("failed to get public key of " + str5, e);
                    }
                }
                p8cVar.a(v);
                return;
            case 17:
                c cVar = (c) this.b;
                ooc oocVar = (ooc) this.c;
                y05 y05Var = (y05) obj;
                String str6 = (String) obj2;
                if (y05Var == null) {
                    c.m("enable backup: didnt get secret phrase: ".concat(str6 == null ? "NULL_ERROR" : str6));
                    oocVar.a(str6 != null ? str6 : "NULL_ERROR");
                    return;
                }
                y05 b6 = y05Var.b();
                pz1 pz1Var = new pz1(b6, oocVar, b3);
                c.O("enable backup: got secret phrase");
                try {
                    ConnectionsManager.getInstance(cVar.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new hc(b5), new eu0((Object) cVar, (Object) pz1Var, (Object) b6, (Object) WalletEngine2.secretPhraseToPublicKey(b6), (byte) 4));
                    return;
                } catch (Exception e2) {
                    c.n("failed to get public key from secret phrase", e2);
                    pz1Var.a(e2.getMessage() != null ? e2.getMessage() : "NULL_ERROR");
                    return;
                }
            case 18:
                c cVar2 = (c) this.b;
                poc pocVar = (poc) this.c;
                y05 y05Var2 = (y05) obj;
                String str7 = (String) obj2;
                if (y05Var2 == null) {
                    c.m("prepare disable backup, cant get secret phrase: ".concat(str7 == null ? "NULL_ERROR" : str7));
                    pocVar.a(null, str7 != null ? str7 : "NULL_ERROR");
                    return;
                }
                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = cVar2.f;
                if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                    TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                }
                c.O("prepare disable backup: preparing transfer");
                cVar2.b.prepareRotateKey(y05Var2, null, new g05(cVar2, pocVar, b5));
                return;
            case 19:
                c cVar3 = (c) this.b;
                pz1 pz1Var2 = (pz1) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (tL_error6 == null) {
                    c.O("enable backup: server accepted request");
                    cVar3.w0(walletState);
                    pz1Var2.a(null);
                    return;
                }
                c.m("enable backup: server rejected request code=" + tL_error6.code + " error=" + tL_error6.text);
                String str8 = tL_error6.text;
                pz1Var2.a(str8 != null ? str8 : "NULL_ERROR");
                return;
            case 20:
                o05 o05Var = (o05) this.b;
                i8c i8cVar2 = (i8c) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (o05Var.a) {
                    return;
                }
                i8cVar2.a(wallettransaction, str9);
                return;
            case 21:
                String str10 = (String) this.b;
                jq0 jq0Var = (jq0) this.c;
                TL_toncenter.apiResponse apiresponse2 = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse2 != null && apiresponse2.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse2.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(0);
                            if (str10.equals(jSONObject3.optString("domain"))) {
                                String optString = jSONObject3.optString("dns_wallet", "");
                                if (WalletEngine2.isValidAddress(optString)) {
                                    str2 = optString;
                                }
                            }
                        }
                    } catch (JSONException e3) {
                        fa4.g(e3, true);
                    }
                }
                jq0Var.a(str2);
                return;
            case 22:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                f25 f25Var = (f25) this.c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str11 = (String) obj2;
                if (str11 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                f25Var.a(str11);
                return;
            case 23:
                ((y05) this.b).close();
                ((u15) this.c).a((s25) obj, (String) obj2);
                return;
            case 24:
                ((y05) this.b).close();
                gl.d3(new jf4((ae2) this.c, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, b4));
                return;
            case 25:
                h75 h75Var = (h75) this.b;
                fc2 fc2Var = (fc2) this.c;
                Boolean bool3 = (Boolean) obj;
                HashSet hashSet3 = (HashSet) obj2;
                fc2 fc2Var2 = h75Var.T2;
                if (fc2Var2 == null || (groupCall = fc2Var2.b) == null) {
                    return;
                }
                String str12 = groupCall.invite_link;
                int size7 = hashSet3.size();
                AtomicInteger atomicInteger = new AtomicInteger(0);
                HashSet hashSet4 = new HashSet();
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    Long l2 = (Long) it.next();
                    long longValue = l2.longValue();
                    h75Var.T2.a(longValue);
                    TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    inviteconferencecallparticipant.call = tL_inputGroupCall;
                    TLRPC.GroupCall groupCall2 = h75Var.T2.b;
                    tL_inputGroupCall.id = groupCall2.id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    na7 q1 = na7.q1(h75Var.a);
                    inviteconferencecallparticipant.user_id = q1.o1(q1.V1(l2));
                    inviteconferencecallparticipant.video = bool3.booleanValue();
                    String str13 = str12;
                    ConnectionsManager.getInstance(h75Var.a).sendRequest(inviteconferencecallparticipant, new pr0(h75Var, longValue, hashSet4, atomicInteger, size7, fc2Var, str13));
                    str12 = str13;
                }
                h75Var.D0(true);
                if (!bool3.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
                    return;
                }
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                h75Var.L1(true, true);
                return;
            case 26:
                a46 a46Var = (a46) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                a46Var.c();
                if (tL_error7 == null) {
                    un7.b(a46Var.d, a46Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error7.text)) {
                    a46.d().I(R.raw.error, k96.M0(2131753125, null), k96.M0(2131753126, null)).j();
                    return;
                } else {
                    a46.d().g0(tL_error7, false);
                    return;
                }
            case 27:
                b(obj, obj2);
                return;
            case 28:
                c(obj, obj2);
                return;
            default:
                na7 na7Var = (na7) this.b;
                vn2 vn2Var = (vn2) this.c;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                if (updates2 == null) {
                    if (vn2Var != null) {
                        gl.d3(new t67(vn2Var, tL_error8, b4));
                        return;
                    }
                    return;
                }
                ArrayList<TLRPC.Update> arrayList15 = updates2.updates;
                int size8 = arrayList15.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size8) {
                        TLRPC.Update update = arrayList15.get(i14);
                        i14++;
                        TLRPC.Update update2 = update;
                        if (update2 instanceof TL_update.TL_updateNewMessage) {
                            TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) update2).message.action;
                            if (!(messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest)) {
                                if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i2 = 1;
                                }
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                }
                na7Var.Q3(updates2, false);
                gl.d3(new o94(na7Var, vn2Var, i2, b4));
                return;
        }
    }

    public /* synthetic */ ae2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
