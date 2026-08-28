package bg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import fh.i4;
import gh.a4;
import gh.b4;
import gh.ea;
import gh.fa;
import gh.g4;
import gh.n7;
import gh.oa;
import gh.z3;
import ih.d4;
import ih.t9;
import ih.u9;
import ih.v3;
import java.util.ArrayList;
import java.util.HashSet;
import kh.g6;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ai1;
import org.telegram.ui.cn;
import org.telegram.ui.eb0;
import org.telegram.ui.ho;
import org.telegram.ui.jo0;
import org.telegram.ui.k6;
import org.telegram.ui.kb0;
import org.telegram.ui.l6;
import org.telegram.ui.la0;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import org.telegram.ui.qv0;
import org.telegram.ui.tk0;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x096b  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        int i9;
        g4 g4Var;
        g4 g4Var2;
        g4 g4Var3;
        int i10;
        boolean z10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.Chat chat2;
        TLRPC.EmojiStatus emojiStatus;
        int i11 = 6;
        int i12 = 3;
        TLRPC.TL_contacts_found tL_contacts_found2 = null;
        r6 = null;
        TLRPC.WebPage webPage = null;
        TLRPC.TL_contacts_found tL_contacts_found3 = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                h1Var.m0.a.setLoading(false);
                if (h1Var.getContext() != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    la0 la0Var = LaunchActivity.C1.t0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            h1Var.dismiss();
                            qn R9 = qn.R9(-h1Var.X.id);
                            U.presentFragment(R9);
                            U.whenFullyVisible(new a1.e(14, R9, tL_starsGiveawayOption));
                            if (la0Var != null) {
                                la0Var.c(true);
                                break;
                            }
                        } else if (str != null) {
                            h1Var.dismiss();
                            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, oc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 1:
                i4 i4Var = (i4) this.b;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((n7) this.c).l;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    if (savedStarGift.pinned_to_top) {
                        int i15 = jo0.a;
                        l41 J = l41.J(jo0.class);
                        J.G = savedStarGift;
                        J.K(i4Var.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList.add(J);
                    }
                }
                break;
            case 2:
                gh.i4 i4Var2 = (gh.i4) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                g4[] g4VarArr = i4Var2.n;
                x3 x3Var = i4Var2.P;
                if (x3Var != null) {
                    x3Var.e(true);
                    i4Var2.P = null;
                }
                i4Var2.e0 = true;
                i4Var2.f0 = starGift == null;
                i4Var2.g0 = runnable;
                a4 a4Var = new a4(i4Var2.h);
                ArrayList arrayList4 = a4Var.b;
                ArrayList arrayList5 = new ArrayList();
                for (int i16 = 0; i16 < g4VarArr.length; i16++) {
                    g4 g4Var4 = g4VarArr[i16];
                    if (g4Var4 != null) {
                        TL_stars.StarGift starGift2 = g4Var4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList5.add(Integer.valueOf(i16));
                        }
                    }
                }
                int i17 = 4;
                if (arrayList5.size() == 1) {
                    a4Var.e(g4VarArr[((Integer) arrayList5.get(0)).intValue()], 5, 0.0f);
                    a4Var.d(false);
                    a4Var.c(26.0f, -26.0f);
                    a4Var.a(90);
                    a4Var.d(true);
                    a4Var.a(20);
                    i10 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    g4 g4Var5 = g4VarArr[0];
                    if (g4Var5 != null) {
                        TL_stars.StarGift starGift3 = g4Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            a4Var.e(g4Var5, iArr[0], 0.0f);
                            a4Var.c(25.0f, -22.0f);
                            i9 = 1;
                            g4Var = g4VarArr[1];
                            if (g4Var != null) {
                                TL_stars.StarGift starGift4 = g4Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i9 > 0) {
                                        a4Var.a(42);
                                    }
                                    a4Var.e(g4VarArr[1], iArr[i9], 0.0f);
                                    a4Var.c(25.0f, 31.0f);
                                    i9++;
                                }
                            }
                            g4Var2 = g4VarArr[2];
                            if (g4Var2 != null) {
                                TL_stars.StarGift starGift5 = g4Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i9 > 0) {
                                        a4Var.a(42);
                                    }
                                    a4Var.e(g4VarArr[2], iArr[i9], 180.0f);
                                    a4Var.c(-36.0f, -36.0f);
                                    i9++;
                                }
                            }
                            g4Var3 = g4VarArr[3];
                            if (g4Var3 != null) {
                                TL_stars.StarGift starGift6 = g4Var3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i9 > 0) {
                                        a4Var.a(42);
                                    }
                                    a4Var.e(g4VarArr[3], iArr[i9], 0.0f);
                                    a4Var.c(-31.0f, 31.0f);
                                    i9++;
                                }
                            }
                            a4Var.d(false);
                            a4Var.a(40);
                            a4Var.d(true);
                            a4Var.a(40);
                            i17 = iArr[i9];
                            i10 = 80;
                        }
                    }
                    i9 = 0;
                    g4Var = g4VarArr[1];
                    if (g4Var != null) {
                    }
                    g4Var2 = g4VarArr[2];
                    if (g4Var2 != null) {
                    }
                    g4Var3 = g4VarArr[3];
                    if (g4Var3 != null) {
                    }
                    a4Var.d(false);
                    a4Var.a(40);
                    a4Var.d(true);
                    a4Var.a(40);
                    i17 = iArr[i9];
                    i10 = 80;
                }
                arrayList4.add(new z3(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new d5.i(i4Var2, i17, starGift, 3)));
                arrayList4.add(new z3(4, 0.0f, 0.0f, i10, i17, -90, null, null));
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(i4Var2, starGift, arrayList3, runnable, 9);
                b4 b4Var = a4Var.a;
                a4Var.d = cVar;
                a4Var.e = false;
                a4Var.c = 0;
                a4Var.l = false;
                int size2 = arrayList4.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj4 = arrayList4.get(i18);
                    i18++;
                    z3 z3Var = (z3) obj4;
                    int i19 = z3Var.e;
                    if (i19 >= 0 && i19 < 6) {
                        float f10 = z3Var.f;
                        if (f10 != 0.0f) {
                            b4Var.y[i19] = f10;
                        }
                    }
                }
                b4Var.D = a4Var;
                a4Var.b();
                break;
            case 3:
                oa.y0((oa) this.b, (l41) this.c, (Boolean) obj, (String) obj2);
                break;
            case 4:
                ea.P((ea) this.b, (l41) this.c, (Boolean) obj, (String) obj2);
                break;
            case 5:
                fa.P((fa) this.b, (l41) this.c, (Boolean) obj, (String) obj2);
                break;
            case 6:
                ih.h2 h2Var = (ih.h2) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                ih.a0 a0Var = h2Var.R;
                int i20 = h2Var.J;
                h2Var.Q = false;
                TLRPC.InputGroupCall inputGroupCall = h2Var.K;
                if (inputGroupCall != null && inputGroupCall.id == getgroupcallstars.call.id) {
                    if (groupcallstars != null) {
                        MessagesController.getInstance(i20).putUsers(groupcallstars.users, false);
                        MessagesController.getInstance(i20).putChats(groupcallstars.chats, false);
                        int i21 = 0;
                        while (true) {
                            if (i21 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i21).my) {
                                    z10 = groupcallstars.top_donors.get(i21).stars > 0;
                                } else {
                                    i21++;
                                }
                            }
                        }
                        long j10 = groupcallstars.total_stars;
                        boolean z11 = (j10 == h2Var.M && h2Var.O == z10) ? false : true;
                        h2Var.M = j10;
                        h2Var.P = groupcallstars.top_donors;
                        h2Var.O = z10;
                        if (z11) {
                            h2Var.j();
                        }
                        h2Var.t();
                    }
                    if (h2Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var);
                        AndroidUtilities.runOnUIThread(a0Var, 5000L);
                        break;
                    }
                }
                break;
            case 7:
                t9 t9Var = (t9) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                Vector vector = (Vector) obj;
                u9 u9Var = t9Var.a;
                if (vector != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for (int i22 = 0; i22 < vector.objects.size(); i22++) {
                        if (((Long) arrayList6.get(i22)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(u9Var.a).getUser((Long) arrayList6.get(i22));
                            if (user3 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i22);
                                user3.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    user3.flags2 |= 32;
                                } else {
                                    user3.flags2 &= -33;
                                }
                                arrayList7.add(user3);
                            }
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(u9Var.a).getChat((Long) arrayList6.get(i22));
                            if (chat3 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i22);
                                chat3.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    chat3.flags2 |= 16;
                                } else {
                                    chat3.flags2 &= -17;
                                }
                                arrayList8.add(chat3);
                            }
                        }
                    }
                    MessagesStorage.getInstance(u9Var.a).putUsersAndChats(arrayList7, arrayList8, true, true);
                    NotificationCenter.getInstance(u9Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                    break;
                }
                break;
            case 8:
                g6 g6Var = (g6) this.b;
                yf.j jVar = (yf.j) this.c;
                g6Var.getClass();
                ((yf.s0) jVar).r(g6Var.B1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                g6Var.d0(jVar);
                break;
            case 9:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.t) obj2, (androidx.biometric.u) this.c);
                break;
            case 10:
                org.telegram.ui.a0 a0Var2 = (org.telegram.ui.a0) this.b;
                org.telegram.ui.z zVar = (org.telegram.ui.z) this.c;
                Boolean bool2 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool2.booleanValue()) {
                        a0Var2.run(Boolean.TRUE);
                    }
                    zVar.run();
                    break;
                }
                break;
            case 11:
                qn.g0((qn) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                break;
            case 12:
                qn qnVar = (qn) this.b;
                l6 l6Var = (l6) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                qnVar.B5 = 0;
                if (webpagepreview != null) {
                    qnVar.getMessagesController().putUsers(webpagepreview.users, false);
                    qnVar.getMessagesController().putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage != null) {
                            l6Var.run(Boolean.FALSE, null);
                            break;
                        } else {
                            TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                            if (webPage2 == null || !"telegram_story".equals(webPage2.type)) {
                                l6Var.run(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                                break;
                            } else {
                                if (tL_messageMediaWebPage.webpage.attributes != null) {
                                    for (int i23 = 0; i23 < tL_messageMediaWebPage.webpage.attributes.size(); i23++) {
                                        if (tL_messageMediaWebPage.webpage.attributes.get(i23) instanceof TLRPC.TL_webPageAttributeStory) {
                                            tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i23);
                                            if (tL_webPageAttributeStory != null) {
                                                l6Var.run(Boolean.FALSE, null);
                                                break;
                                            } else if (tL_webPageAttributeStory.storyItem != null) {
                                                l6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                                break;
                                            } else {
                                                qnVar.getMessagesStorage().getStorageQueue().postRunnable(new k6(qnVar, tL_messageMediaWebPage, tL_webPageAttributeStory, l6Var, 9));
                                                break;
                                            }
                                        }
                                    }
                                }
                                tL_webPageAttributeStory = null;
                                if (tL_webPageAttributeStory != null) {
                                }
                            }
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage != null) {
                }
                break;
            case 13:
                cn cnVar = (cn) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                qn qnVar2 = cnVar.a;
                if (tL_channels_channelParticipant != null) {
                    qnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    qnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        cnVar.d(t1Var, channelParticipant);
                        break;
                    }
                }
                break;
            case 14:
                ho hoVar = (ho) this.b;
                View view = (View) this.c;
                hoVar.B0 = ((Boolean) obj).booleanValue();
                hoVar.D0 = ((Boolean) obj2).booleanValue();
                d4 d4Var = hoVar.e;
                int dp = AndroidUtilities.dp(hoVar.B0 ? 16.0f : 32.0f);
                if (d4Var.getRoundRadius()[0] != dp) {
                    ValueAnimator valueAnimator = d4Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(d4Var.getRoundRadius()[0], dp);
                    d4Var.x = ofInt;
                    ofInt.addUpdateListener(new f2.f0(d4Var, i11));
                    d4Var.x.setDuration(200L);
                    d4Var.x.start();
                }
                ((p8) view).setChecked(hoVar.B0);
                hoVar.o0(false, true);
                if (!hoVar.J0) {
                    TLRPC.Chat chat4 = hoVar.t0;
                    if (chat4.forum != hoVar.B0 || chat4.forum_tabs != hoVar.D0) {
                        if (ChatObject.isChannel(chat4) || !hoVar.B0) {
                            boolean z12 = hoVar.t0.forum_tabs != hoVar.D0;
                            hoVar.getMessagesController().toggleChannelForum(hoVar.s0, hoVar.B0, hoVar.D0);
                            TLRPC.Chat chat5 = hoVar.t0;
                            chat5.forum = hoVar.B0;
                            chat5.forum_tabs = hoVar.D0;
                            if (z12) {
                                hoVar.p0();
                                break;
                            }
                        } else {
                            Context parentActivity = hoVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.C1;
                            }
                            if (parentActivity == null) {
                                parentActivity = ApplicationLoader.applicationContext;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(parentActivity, 3, null);
                                hoVar.J0 = true;
                                c2Var.q(250L);
                                hoVar.getMessagesController().convertToMegaGroup(hoVar.getParentActivity(), hoVar.s0, hoVar, new v3(22, hoVar, c2Var));
                                break;
                            }
                        }
                    }
                }
                break;
            case 15:
                ki kiVar = (ki) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                Long l10 = (Long) obj;
                ((Runnable) obj2).run();
                kiVar.f0.setStarsPrice(l10.longValue());
                if (l10.longValue() > 0) {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    g1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l10.longValue(), new Object[0]));
                    kiVar.d0.s(l10.longValue());
                    break;
                } else {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    g1Var.setSubtext(null);
                    kiVar.d0.s(0L);
                    break;
                }
            case 16:
                jn jnVar = (jn) this.b;
                yg.e eVar = (yg.e) this.c;
                jnVar.getClass();
                jnVar.U((zg.e) eVar, true);
                break;
            case 17:
                hs hsVar = (hs) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found4 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = hsVar.O;
                ArrayList arrayList10 = hsVar.N;
                int i24 = hsVar.J;
                if (TextUtils.equals(tL_contacts_search.q, hsVar.a0) && !TextUtils.isEmpty(hsVar.a0)) {
                    hsVar.W = false;
                    if (tL_contacts_found4 != null) {
                        MessagesStorage.getInstance(i24).putUsersAndChats(tL_contacts_found4.users, tL_contacts_found4.chats, true, true);
                        MessagesController.getInstance(i24).putUsers(tL_contacts_found4.users, false);
                        MessagesController.getInstance(i24).putChats(tL_contacts_found4.chats, false);
                        tL_contacts_found2 = tL_contacts_found4;
                    }
                    HashSet hashSet = new HashSet();
                    arrayList10.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList11 = tL_contacts_found2.my_results;
                        int size3 = arrayList11.size();
                        int i25 = 0;
                        while (i25 < size3) {
                            TLRPC.Peer peer = arrayList11.get(i25);
                            i25++;
                            TLRPC.Peer peer2 = peer;
                            if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i24).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                                hashSet.add(Long.valueOf(user2.id));
                                arrayList10.add(user2);
                            }
                        }
                    }
                    arrayList9.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found2.results;
                        int size4 = arrayList12.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            TLRPC.Peer peer3 = arrayList12.get(i26);
                            i26++;
                            TLRPC.Peer peer4 = peer3;
                            if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i24).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                                hashSet.add(Long.valueOf(user.id));
                                arrayList9.add(user);
                            }
                        }
                    }
                    wk0 wk0Var = hsVar.d;
                    if (wk0Var != null) {
                        wk0Var.u0(0);
                    }
                    hsVar.N(true);
                    break;
                }
                break;
            case 18:
                js jsVar = (js) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found5 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList13 = jsVar.O;
                ArrayList arrayList14 = jsVar.N;
                ArrayList arrayList15 = jsVar.M;
                int i27 = jsVar.J;
                if (TextUtils.equals(tL_contacts_search2.q, jsVar.X) && !TextUtils.isEmpty(jsVar.X)) {
                    jsVar.T = false;
                    if (tL_contacts_found5 != null) {
                        MessagesStorage.getInstance(i27).putUsersAndChats(tL_contacts_found5.users, tL_contacts_found5.chats, true, true);
                        MessagesController.getInstance(i27).putUsers(tL_contacts_found5.users, false);
                        MessagesController.getInstance(i27).putChats(tL_contacts_found5.chats, false);
                        tL_contacts_found3 = tL_contacts_found5;
                    }
                    HashSet hashSet2 = new HashSet();
                    arrayList15.clear();
                    if (tL_contacts_found3 != null) {
                        ArrayList<TLRPC.Peer> arrayList16 = tL_contacts_found3.my_results;
                        int size5 = arrayList16.size();
                        int i28 = 0;
                        while (i28 < size5) {
                            TLRPC.Peer peer5 = arrayList16.get(i28);
                            i28++;
                            TLRPC.Peer peer6 = peer5;
                            if ((peer6 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(i27).getChat(Long.valueOf(peer6.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                                if (!hashSet2.contains(Long.valueOf(chat2.id))) {
                                    hashSet2.add(Long.valueOf(chat2.id));
                                    arrayList15.add(chat2);
                                }
                            }
                        }
                    }
                    arrayList14.clear();
                    String lowerCase = jsVar.X.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i27).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                        ArrayList<TLObject> arrayList17 = cachedChannelRecommendations.chats;
                        int size6 = arrayList17.size();
                        int i29 = 0;
                        while (i29 < size6) {
                            TLObject tLObject = arrayList17.get(i29);
                            i29++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat6 = (TLRPC.Chat) tLObject2;
                                if (ChatObject.isChannelAndNotMegaGroup(chat6)) {
                                    tL_contacts_found = tL_contacts_found3;
                                    TLRPC.Chat chat7 = MessagesController.getInstance(i27).getChat(Long.valueOf(chat6.id));
                                    if (ChatObject.isNotInChat(chat6) && (chat7 == null || ChatObject.isNotInChat(chat7))) {
                                        String lowerCase2 = chat6.title.toLowerCase();
                                        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                        if ((lowerCase2.startsWith(lowerCase) || org.telegram.messenger.l0.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) && !hashSet2.contains(Long.valueOf(chat6.id))) {
                                            hashSet2.add(Long.valueOf(chat6.id));
                                            arrayList14.add(chat6);
                                        }
                                    }
                                }
                            } else {
                                tL_contacts_found = tL_contacts_found3;
                            }
                            tL_contacts_found3 = tL_contacts_found;
                        }
                    }
                    TLRPC.TL_contacts_found tL_contacts_found6 = tL_contacts_found3;
                    arrayList13.clear();
                    if (tL_contacts_found6 != null) {
                        ArrayList<TLRPC.Peer> arrayList18 = tL_contacts_found6.results;
                        int size7 = arrayList18.size();
                        int i30 = 0;
                        while (i30 < size7) {
                            TLRPC.Peer peer7 = arrayList18.get(i30);
                            i30++;
                            TLRPC.Peer peer8 = peer7;
                            if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i27).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                hashSet2.add(Long.valueOf(chat.id));
                                arrayList13.add(chat);
                            }
                        }
                    }
                    jsVar.N(true);
                    break;
                }
                break;
            case 19:
                z21.m((z21) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            case 20:
                o50.q((o50) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                break;
            case 21:
                kb0 kb0Var = (kb0) this.b;
                String str2 = (String) this.c;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                kb0Var.a();
                if (passkeys != null) {
                    kb0Var.n(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str2)) {
                        kb0Var.o("addPasskeyRow");
                        break;
                    }
                }
                break;
            case 22:
                kb0 kb0Var2 = (kb0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                kb0Var2.a();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        kb0.b().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        kb0.b().d0(tL_error, false);
                        break;
                    }
                } else {
                    tk0.b(kb0Var2.d, kb0Var2.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    break;
                }
            case 23:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                zArr[0] = true;
                f3Var.dismiss();
                break;
            case 24:
                ((ve.d) this.b).b();
                ((eb0) this.c).run((Boolean) obj);
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                qv0 qv0Var = (qv0) this.c;
                Long l11 = (Long) obj;
                Integer num = (Integer) obj2;
                premiumPreviewFragment.getClass();
                if (l11 == null) {
                    emojiStatus = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l11.longValue();
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                    }
                    emojiStatus = tL_emojiStatus;
                }
                premiumPreviewFragment.getMessagesController().updateEmojiStatus(emojiStatus);
                qv0Var.b(l11 == null ? 0L : l11.longValue(), true);
                break;
            case 26:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.b;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.c;
                String str3 = (String) obj;
                ArrayList arrayList19 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str3)) {
                    y0Var.v("prepared_message_sent", null);
                    org.telegram.ui.web.e0 e0Var = y0Var.c;
                    if (e0Var != null) {
                        e0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new ai1(i12, botWebViewContainer$BotWebViewProxy, arrayList19), 500L);
                    break;
                } else {
                    y0Var.v("prepared_message_failed", org.telegram.ui.web.y0.x(str3, "error"));
                    break;
                }
            default:
                yg.r rVar = (yg.r) this.b;
                String str4 = (String) this.c;
                TL_account.webPagePreview webpagepreview2 = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i31 = rVar.a;
                if (webpagepreview2 != null) {
                    MessagesController.getInstance(i31).putUsers(webpagepreview2.users, false);
                    MessagesController.getInstance(i31).putChats(webpagepreview2.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview2.media;
                    if (messageMedia2 != null) {
                        webPage = messageMedia2.webpage;
                    }
                }
                rVar.b.put(str4, webPage);
                ArrayList arrayList20 = (ArrayList) rVar.c.remove(str4);
                if (arrayList20 != null) {
                    int size8 = arrayList20.size();
                    while (i13 < size8) {
                        Object obj5 = arrayList20.get(i13);
                        i13++;
                        ((Utilities.Callback2) obj5).run(webPage, tL_error2);
                    }
                    break;
                }
                break;
        }
    }
}
