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
import org.telegram.tgnet.tl.TL_agent;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lf2 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lf2(c cVar, String str, qac qacVar) {
        this.a = (byte) 18;
        this.b = str;
        this.c = qacVar;
    }

    private final void b(Object obj, Object obj2) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        g95 g95Var = (g95) this.b;
        qd2 qd2Var = (qd2) this.c;
        Boolean bool = (Boolean) obj;
        HashSet hashSet = (HashSet) obj2;
        qd2 qd2Var2 = g95Var.T2;
        if (qd2Var2 == null || (groupCall = qd2Var2.b) == null) {
            return;
        }
        String str = groupCall.invite_link;
        int size = hashSet.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            g95Var.T2.a(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = g95Var.T2.b;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            oc7 r1 = oc7.r1(g95Var.a);
            inviteconferencecallparticipant.user_id = r1.p1(r1.W1(l));
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(g95Var.a).sendRequest(inviteconferencecallparticipant, new xs0(g95Var, longValue, hashSet2, atomicInteger, size, qd2Var, str));
        }
        g95Var.D0(true);
        if (!bool.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
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
        g95Var.L1(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x09bb  */
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        long j;
        boolean z;
        TLRPC.User W1;
        TLRPC.User W12;
        TLRPC.Chat L0;
        int i;
        long j2;
        c41 b0;
        int i2;
        JSONArray jSONArray;
        boolean z2;
        byte b = 15;
        byte b2 = 26;
        String str = "";
        long j3 = 0;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        Object obj3 = null;
        r11 = null;
        r11 = null;
        Object v = null;
        TLRPC.TL_contacts_found tL_contacts_found = null;
        boolean z3 = true;
        r12 = 1;
        char c = 1;
        z3 = true;
        byte b3 = 0;
        switch (this.a) {
            case 0:
                uf2 uf2Var = (uf2) this.b;
                ff2 ff2Var = (ff2) this.c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    gm.c3(new ra2(ff2Var, tL_error, b));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (!(chatThemes instanceof TL_account.Tl_chatThemes)) {
                    if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                        gm.c3(new ra2(uf2Var, ff2Var, (byte) 16));
                        return;
                    }
                    return;
                }
                TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                cf7 messagesStorage = uf2Var.getMessagesStorage();
                ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
                messagesStorage.getClass();
                messagesStorage.H(new q87(messagesStorage, arrayList2, b2));
                uf2Var.getMessagesStorage().j1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                uf2Var.getMessagesController().d4(tl_chatThemes.users, false);
                uf2Var.getMessagesController().X3(tl_chatThemes.chats, false);
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
                    tz3 tz3Var = new tz3(uf2Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i4));
                    tz3Var.p(0, null);
                    tz3Var.p(1, null);
                    tz3Var.n(0, null);
                    tz3Var.n(1, null);
                    arrayList4.add(tz3Var);
                }
                gm.c3(new da7((Object) uf2Var, (Object) tl_chatThemes, (Object) arrayList4, (Object) arrayList, (Object) ff2Var, (byte) 23));
                return;
            case 1:
                mc mcVar = (mc) this.b;
                x0 x0Var = (x0) this.c;
                TL_agent.settings settingsVar = (TL_agent.settings) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (settingsVar != null) {
                    mcVar.a(settingsVar);
                } else {
                    mcVar.getClass();
                }
                x0Var.a(tL_error2);
                return;
            case 2:
                ad adVar = (ad) this.b;
                String str2 = (String) this.c;
                TL_agent.TL_models tL_models = (TL_agent.TL_models) obj;
                wc wcVar = adVar.E;
                ArrayList arrayList5 = adVar.N;
                ArrayList arrayList6 = adVar.G;
                if (TextUtils.equals(str2, adVar.H)) {
                    adVar.L = -1;
                    adVar.K = false;
                    if (tL_models != null) {
                        arrayList6.addAll(tL_models.models);
                        String str3 = tL_models.next_offset;
                        adVar.I = str3;
                        if (!TextUtils.isEmpty(str3) && !tL_models.models.isEmpty()) {
                            z3 = false;
                        }
                        adVar.J = z3;
                        if (TextUtils.isEmpty(str2)) {
                            arrayList5.clear();
                            arrayList5.addAll(arrayList6);
                            adVar.O = adVar.I;
                            adVar.P = adVar.J;
                        }
                    } else {
                        adVar.J = true;
                    }
                    wcVar.c();
                    gm.c3(new b1(wcVar, (byte) 9));
                    return;
                }
                return;
            case 3:
                iu iuVar = (iu) this.b;
                hu huVar = (hu) this.c;
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool.booleanValue()) {
                        iuVar.a(Boolean.TRUE);
                    }
                    huVar.run();
                    return;
                }
                return;
            case 4:
                ap0 ap0Var = (ap0) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool2 = (Boolean) obj;
                String str4 = (String) obj2;
                ap0Var.l2.a.setLoading(false);
                if (ap0Var.getContext() != null) {
                    d S = LaunchActivity.S();
                    v16 v16Var = LaunchActivity.H1.w0;
                    if (S != null) {
                        if (!bool2.booleanValue()) {
                            if (str4 != null) {
                                ap0Var.dismiss();
                                c41.b0(S).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str4)).j();
                                return;
                            }
                            return;
                        }
                        ap0Var.dismiss();
                        yv1 ga = yv1.ga(-ap0Var.W1.id);
                        S.presentFragment(ga);
                        S.whenFullyVisible(new x30(ga, tL_starsGiveawayOption, (byte) 13));
                        if (v16Var != null) {
                            v16Var.c(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((lac) this.b).a((Boolean) obj, (fk0) obj2, (gk0) this.c);
                return;
            case 6:
                cm1 cm1Var = (cm1) this.b;
                d dVar = (d) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    oc7.r1(cm1Var.I).T3(updates, false);
                }
                if (tL_error3 != null) {
                    gm.c3(new uj1(dVar, tL_error3, (byte) 4));
                    return;
                }
                return;
            case 7:
                ((yv1) this.b).t9((k47) this.c, (Long) obj, (Runnable) obj2);
                return;
            case 8:
                yv1 yv1Var = (yv1) this.b;
                p pVar = (p) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                yv1Var.X5 = 0;
                if (webpagepreview != null) {
                    yv1Var.getMessagesController().d4(webpagepreview.users, false);
                    yv1Var.getMessagesController().X3(webpagepreview.chats, false);
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
                                        yv1Var.getMessagesStorage().a.c(new xo1(yv1Var, tL_messageMediaWebPage, tL_webPageAttributeStory, pVar, (byte) 2));
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
            case 9:
                iv1 iv1Var = (iv1) this.b;
                rc2 rc2Var = (rc2) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                yv1 yv1Var2 = iv1Var.a;
                if (tL_channels_channelParticipant != null) {
                    yv1Var2.getMessagesController().d4(tL_channels_channelParticipant.users, false);
                    yv1Var2.getMessagesController().X3(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        iv1Var.e(rc2Var, channelParticipant);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str5 = (String) this.c;
                CharSequence charSequence = (CharSequence) obj;
                int i6 = ChatActivityEnterView.z7;
                chatActivityEnterView.o6 = -1;
                if (chatActivityEnterView.p6) {
                    sy1 sy1Var = chatActivityEnterView.F0;
                    Editable text = sy1Var != null ? sy1Var.getText() : null;
                    if (text == null || !str5.equals(text.toString())) {
                        chatActivityEnterView.l(false);
                        return;
                    }
                    if (charSequence == null) {
                        chatActivityEnterView.l(true);
                        return;
                    }
                    sy1 sy1Var2 = chatActivityEnterView.F0;
                    Editable text2 = sy1Var2.getText();
                    chatActivityEnterView.y0();
                    Layout layout = sy1Var2.getLayout();
                    if (layout == null || layout.getWidth() <= 0) {
                        j = 0;
                        z = false;
                    } else {
                        boolean z4 = on2.h(chatActivityEnterView.F0(cmb.c6)) < 0.5d;
                        float width = layout.getWidth();
                        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), sy1Var2.getPaint(), layout.getWidth()).build();
                        int scrollY = sy1Var2.getScrollY();
                        int max = Math.max(1, (sy1Var2.getHeight() - sy1Var2.getTotalPaddingTop()) - sy1Var2.getTotalPaddingBottom());
                        float max2 = Math.max(scrollY + max, Math.min(build.getHeight(), (max << 1) + scrollY));
                        lo3 lo3Var = chatActivityEnterView.n6;
                        float f = lo3Var.E;
                        z = lo3Var.b(((scrollY * 0.9f) - f) - gm.L(4.0f), ts2.i(max2, 0.9f, width, f) + gm.L(4.0f), chatActivityEnterView.F0(cmb.Oe) | (-16777216), z4);
                        if (z) {
                            j = Math.max(600L, Math.min(900L, (Math.max(layout.getLineCount(), build.getLineCount()) * 60) + 540));
                            chatActivityEnterView.G1 = SystemClock.uptimeMillis() + j;
                            chatActivityEnterView.H1 = lo3.J;
                        } else {
                            j = 0;
                        }
                    }
                    BaseInputConnection.removeComposingSpans(text2);
                    text2.replace(0, text2.length(), charSequence);
                    sy1Var2.setSelection(text2.length());
                    InputMethodManager inputMethodManager = (InputMethodManager) chatActivityEnterView.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.restartInput(sy1Var2);
                    }
                    if (z) {
                        if (!chatActivityEnterView.F1) {
                            chatActivityEnterView.w6 = true;
                            chatActivityEnterView.F1 = true;
                        }
                        chatActivityEnterView.n6.a(j);
                        va2 C0 = chatActivityEnterView.C0();
                        if (C0 != null) {
                            if (chatActivityEnterView.u6 == null) {
                                chatActivityEnterView.u6 = new zn3();
                            }
                            if (C0.h == null) {
                                C0.h = new g11((Object) chatActivityEnterView, (Object) C0, (byte) 20);
                            }
                        }
                        va2 C02 = chatActivityEnterView.C0();
                        if (C02 != null) {
                            C02.invalidate();
                        }
                        lo3 lo3Var2 = chatActivityEnterView.n6;
                        long j4 = lo3Var2.e;
                        chatActivityEnterView.G1 = j4 == 0 ? 0L : j4 + lo3Var2.a;
                        lo3Var2.H = new mw1(chatActivityEnterView, (byte) 17);
                        sy1Var2.invalidate();
                        gm.d3(new mw1(chatActivityEnterView, (byte) 18), 120 + j);
                    }
                    gm.d3(new mw1(chatActivityEnterView, b), Math.max(0L, j - 260));
                    dy1 dy1Var = new dy1(chatActivityEnterView, z3 ? (byte) 1 : (byte) 0);
                    chatActivityEnterView.r6 = dy1Var;
                    gm.d3(dy1Var, j + 140);
                    return;
                }
                return;
            case 11:
                i22 i22Var = (i22) this.b;
                a8 a8Var = (a8) this.c;
                Long l = (Long) obj;
                ((Runnable) obj2).run();
                i22Var.d2.setStarsPrice(l.longValue());
                if (l.longValue() > 0) {
                    a8Var.setText(jb6.M0(2131747461, null));
                    a8Var.setSubtext(jb6.G((int) l.longValue(), "Stars", new Object[0]));
                    i22Var.b2.t(l.longValue());
                    return;
                } else {
                    a8Var.setText(jb6.M0(2131747463, null));
                    a8Var.setSubtext(null);
                    i22Var.b2.t(0L);
                    return;
                }
            case 12:
                ((v72) this.b).U((sf8) ((nf8) this.c), true);
                return;
            case 13:
                gl3 gl3Var = (gl3) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList7 = gl3Var.V;
                ArrayList arrayList8 = gl3Var.U;
                int i7 = gl3Var.Q;
                if (!TextUtils.equals(tL_contacts_search.q, gl3Var.h0) || TextUtils.isEmpty(gl3Var.h0)) {
                    return;
                }
                gl3Var.d0 = false;
                if (tL_contacts_found2 != null) {
                    cf7.Y(i7).j1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                    oc7.r1(i7).d4(tL_contacts_found2.users, false);
                    oc7.r1(i7).X3(tL_contacts_found2.chats, false);
                    tL_contacts_found = tL_contacts_found2;
                }
                HashSet hashSet = new HashSet();
                arrayList8.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList9 = tL_contacts_found.my_results;
                    int size2 = arrayList9.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        TLRPC.Peer peer = arrayList9.get(i8);
                        i8++;
                        TLRPC.Peer peer2 = peer;
                        if ((peer2 instanceof TLRPC.TL_peerUser) && (W12 = oc7.r1(i7).W1(Long.valueOf(peer2.user_id))) != null && W12.bot && !hashSet.contains(Long.valueOf(W12.id))) {
                            hashSet.add(Long.valueOf(W12.id));
                            arrayList8.add(W12);
                        }
                    }
                }
                arrayList7.clear();
                if (tL_contacts_found != null) {
                    ArrayList<TLRPC.Peer> arrayList10 = tL_contacts_found.results;
                    int size3 = arrayList10.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        TLRPC.Peer peer3 = arrayList10.get(i9);
                        i9++;
                        TLRPC.Peer peer4 = peer3;
                        if ((peer4 instanceof TLRPC.TL_peerUser) && (W1 = oc7.r1(i7).W1(Long.valueOf(peer4.user_id))) != null && W1.bot && !hashSet.contains(Long.valueOf(W1.id))) {
                            hashSet.add(Long.valueOf(W1.id));
                            arrayList7.add(W1);
                        }
                    }
                }
                r59 r59Var = gl3Var.d;
                if (r59Var != null) {
                    r59Var.w0(0);
                }
                gl3Var.O(true);
                return;
            case 14:
                il3 il3Var = (il3) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList11 = il3Var.V;
                ArrayList arrayList12 = il3Var.U;
                ArrayList arrayList13 = il3Var.T;
                int i10 = il3Var.Q;
                if (!TextUtils.equals(tL_contacts_search2.q, il3Var.e0) || TextUtils.isEmpty(il3Var.e0)) {
                    return;
                }
                il3Var.a0 = false;
                if (tL_contacts_found3 != null) {
                    cf7.Y(i10).j1(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                    oc7.r1(i10).d4(tL_contacts_found3.users, false);
                    oc7.r1(i10).X3(tL_contacts_found3.chats, false);
                } else {
                    tL_contacts_found3 = null;
                }
                HashSet hashSet2 = new HashSet();
                arrayList13.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList14 = tL_contacts_found3.my_results;
                    int size4 = arrayList14.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        TLRPC.Peer peer5 = arrayList14.get(i11);
                        i11++;
                        TLRPC.Peer peer6 = peer5;
                        long j5 = j3;
                        if (peer6 instanceof TLRPC.TL_peerChannel) {
                            TLRPC.Chat L02 = oc7.r1(i10).L0(Long.valueOf(peer6.channel_id));
                            if (L02 != null && sd2.V(L02) && !hashSet2.contains(Long.valueOf(L02.id))) {
                                hashSet2.add(Long.valueOf(L02.id));
                                arrayList13.add(L02);
                            }
                            i11 = i11;
                        }
                        j3 = j5;
                    }
                }
                long j6 = j3;
                arrayList12.clear();
                String lowerCase = il3Var.e0.toLowerCase();
                String I3 = gm.I3(lowerCase);
                HashMap hashMap = oc7.r1(i10).O4;
                qb7 qb7Var = hashMap != null ? (qb7) hashMap.get(Long.valueOf(j6)) : null;
                if (qb7Var != null) {
                    ArrayList arrayList15 = qb7Var.b;
                    if (!arrayList15.isEmpty()) {
                        int size5 = arrayList15.size();
                        int i12 = 0;
                        while (i12 < size5) {
                            Object obj4 = arrayList15.get(i12);
                            i12++;
                            TLObject tLObject = (TLObject) obj4;
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (sd2.V(chat)) {
                                    i = i12;
                                    TLRPC.Chat L03 = oc7.r1(i10).L0(Long.valueOf(chat.id));
                                    if (sd2.r0(chat) && (L03 == null || sd2.r0(L03))) {
                                        String lowerCase2 = chat.title.toLowerCase();
                                        String I32 = gm.I3(lowerCase2);
                                        if ((lowerCase2.startsWith(lowerCase) || hg9.s(" ", lowerCase, lowerCase2) || I32.startsWith(I3) || I32.contains(" ".concat(I3))) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                            hashSet2.add(Long.valueOf(chat.id));
                                            arrayList12.add(chat);
                                        }
                                    }
                                }
                            } else {
                                i = i12;
                            }
                            i12 = i;
                        }
                    }
                }
                arrayList11.clear();
                if (tL_contacts_found3 != null) {
                    ArrayList<TLRPC.Peer> arrayList16 = tL_contacts_found3.results;
                    int size6 = arrayList16.size();
                    int i13 = 0;
                    while (i13 < size6) {
                        TLRPC.Peer peer7 = arrayList16.get(i13);
                        i13++;
                        TLRPC.Peer peer8 = peer7;
                        if ((peer8 instanceof TLRPC.TL_peerChannel) && (L0 = oc7.r1(i10).L0(Long.valueOf(peer8.channel_id))) != null && sd2.V(L0) && !hashSet2.contains(Long.valueOf(L0.id))) {
                            hashSet2.add(Long.valueOf(L0.id));
                            arrayList11.add(L0);
                        }
                    }
                }
                il3Var.O(true);
                return;
            case 15:
                CancellationToken cancellationToken = (CancellationToken) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (cancellationToken.isCancellationRequested()) {
                    return;
                }
                if (auth_authorization == null || tL_error4 != null) {
                    taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error4));
                    return;
                } else {
                    taskCompletionSource.trySetResult(auth_authorization);
                    return;
                }
            case 16:
                lv4 lv4Var = (lv4) this.b;
                jac jacVar = (jac) this.c;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = lv4Var.e;
                if (tL_StarGiftAuctionState != null) {
                    lv4Var.getMessagesController().d4(tL_StarGiftAuctionState.users, false);
                    lv4Var.getMessagesController().X3(tL_StarGiftAuctionState.chats, false);
                    boolean booleanValue = ((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE)).booleanValue();
                    TL_stars.StarGift starGift = tL_StarGiftAuctionState.gift;
                    if (!booleanValue) {
                        longSparseArray.put(starGift.id, Boolean.TRUE);
                        lv4Var.j(tL_StarGiftAuctionState.gift.id, new jv0((Object) lv4Var, (Object) tL_StarGiftAuctionState, (Object) jacVar, (Object) tL_error5, (byte) 9));
                        return;
                    }
                    lv4Var.f(starGift.id, tL_StarGiftAuctionState);
                }
                jacVar.a(tL_StarGiftAuctionState, tL_error5);
                return;
            case 17:
                b61 b61Var = (b61) this.b;
                d dVar2 = (d) this.c;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                b61Var.setLoading(false);
                if (dVar2.getContext() == null || dVar2.getParentActivity() == null) {
                    return;
                }
                if (tL_error6 != null) {
                    c41.e0(tL_error6);
                    return;
                }
                if (tL_starsRevenueStatus != null) {
                    if (!tL_starsRevenueStatus.withdrawal_enabled) {
                        b0 = c41.b0(dVar2);
                        i2 = 2131749278;
                        ts2.u(null, i2, b0, R.raw.error, 36);
                        return;
                    }
                    TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                    if (starsAmount != null) {
                        j2 = Math.max(0L, starsAmount.amount);
                        if (j2 <= 0) {
                            u15.g(dVar2, j2, null);
                            return;
                        }
                        b0 = c41.b0(dVar2);
                        i2 = 2131749276;
                        ts2.u(null, i2, b0, R.raw.error, 36);
                        return;
                    }
                }
                j2 = 0;
                if (j2 <= 0) {
                }
                break;
            case 18:
                String str6 = (String) this.b;
                qac qacVar = (qac) this.c;
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
                        c.n("failed to get public key of " + str6, e);
                    }
                }
                qacVar.a(v);
                return;
            case 19:
                c cVar = (c) this.b;
                qqc qqcVar = (qqc) this.c;
                y25 y25Var = (y25) obj;
                String str7 = (String) obj2;
                if (y25Var == null) {
                    c.m("enable backup: didnt get secret phrase: ".concat(str7 == null ? "NULL_ERROR" : str7));
                    qqcVar.a(str7 != null ? str7 : "NULL_ERROR");
                    return;
                }
                y25 b4 = y25Var.b();
                qy1 qy1Var = new qy1(b4, qqcVar, b2);
                c.O("enable backup: got secret phrase");
                try {
                    ConnectionsManager.getInstance(cVar.a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new kc(b3), new nv0((Object) cVar, (Object) qy1Var, (Object) b4, (Object) WalletEngine2.secretPhraseToPublicKey(b4), (byte) 4));
                    return;
                } catch (Exception e2) {
                    c.n("failed to get public key from secret phrase", e2);
                    qy1Var.a(e2.getMessage() != null ? e2.getMessage() : "NULL_ERROR");
                    return;
                }
            case 20:
                c cVar2 = (c) this.b;
                rqc rqcVar = (rqc) this.c;
                y25 y25Var2 = (y25) obj;
                String str8 = (String) obj2;
                if (y25Var2 == null) {
                    c.m("prepare disable backup, cant get secret phrase: ".concat(str8 == null ? "NULL_ERROR" : str8));
                    rqcVar.a(null, str8 != null ? str8 : "NULL_ERROR");
                    return;
                }
                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = cVar2.f;
                if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
                    TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
                }
                c.O("prepare disable backup: preparing transfer");
                cVar2.b.prepareRotateKey(y25Var2, null, new g25(cVar2, rqcVar, b3));
                return;
            case 21:
                c cVar3 = (c) this.b;
                qy1 qy1Var2 = (qy1) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (tL_error7 == null) {
                    c.O("enable backup: server accepted request");
                    cVar3.w0(walletState);
                    qy1Var2.a(null);
                    return;
                }
                c.m("enable backup: server rejected request code=" + tL_error7.code + " error=" + tL_error7.text);
                String str9 = tL_error7.text;
                qy1Var2.a(str9 != null ? str9 : "NULL_ERROR");
                return;
            case 22:
                o25 o25Var = (o25) this.b;
                jac jacVar2 = (jac) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str10 = (String) obj2;
                if (o25Var.a) {
                    return;
                }
                jacVar2.a(wallettransaction, str10);
                return;
            case 23:
                String str11 = (String) this.b;
                jr0 jr0Var = (jr0) this.c;
                TL_toncenter.apiResponse apiresponse2 = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse2 != null && apiresponse2.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse2.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(0);
                            if (str11.equals(jSONObject3.optString("domain"))) {
                                String optString = jSONObject3.optString("dns_wallet", "");
                                if (WalletEngine2.isValidAddress(optString)) {
                                    obj3 = optString;
                                }
                            }
                        }
                    } catch (JSONException e3) {
                        fc4.g(e3, true);
                    }
                }
                jr0Var.a(obj3);
                return;
            case 24:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                f45 f45Var = (f45) this.c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str12 = (String) obj2;
                if (str12 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                f45Var.a(str12);
                return;
            case 25:
                ((y25) this.b).close();
                ((v35) this.c).a((s45) obj, (String) obj2);
                return;
            case 26:
                ((y25) this.b).close();
                gm.c3(new if4(this.c, obj, obj2, (byte) 12));
                return;
            case 27:
                b(obj, obj2);
                return;
            case 28:
                a66 a66Var = (a66) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                a66Var.c();
                if (tL_error8 == null) {
                    xp7.b(a66Var.d, a66Var.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    return;
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error8.text)) {
                    a66.d().I(R.raw.error, jb6.M0(2131753093, null), jb6.M0(2131753094, null)).j();
                    return;
                } else {
                    a66.d().g0(tL_error8, false);
                    return;
                }
            default:
                n38 n38Var = (n38) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                w86 w86Var = n38Var.W;
                int i14 = n38Var.O;
                n38Var.V = false;
                TLRPC.InputGroupCall inputGroupCall = n38Var.P;
                if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
                    return;
                }
                if (groupcallstars != null) {
                    oc7.r1(i14).d4(groupcallstars.users, false);
                    oc7.r1(i14).X3(groupcallstars.chats, false);
                    int i15 = 0;
                    while (true) {
                        if (i15 < groupcallstars.top_donors.size()) {
                            if (!groupcallstars.top_donors.get(i15).my) {
                                i15++;
                            } else if (groupcallstars.top_donors.get(i15).stars > 0) {
                                z2 = true;
                            }
                        }
                    }
                    z2 = false;
                    long j7 = groupcallstars.total_stars;
                    if (j7 == n38Var.R && n38Var.T == z2) {
                        c = 0;
                    }
                    n38Var.R = j7;
                    n38Var.U = groupcallstars.top_donors;
                    n38Var.T = z2;
                    if (c != 0) {
                        n38Var.i();
                    }
                    n38Var.s();
                }
                if (n38Var.isAttachedToWindow()) {
                    gm.r(w86Var);
                    gm.d3(w86Var, 5000L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ lf2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
