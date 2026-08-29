package bh;

import ag.v0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import bg.o1;
import eg.c1;
import ih.w3;
import java.util.ArrayList;
import java.util.HashSet;
import jh.e4;
import jh.g4;
import jh.ia;
import jh.k7;
import jh.x3;
import jh.y3;
import jh.y9;
import jh.z3;
import jh.z9;
import lh.f2;
import lh.p9;
import lh.q9;
import lh.y;
import nh.t3;
import nh.t5;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.a0;
import org.telegram.ui.b0;
import org.telegram.ui.fn;
import org.telegram.ui.gg;
import org.telegram.ui.io0;
import org.telegram.ui.ko;
import org.telegram.ui.l6;
import org.telegram.ui.mb0;
import org.telegram.ui.oa0;
import org.telegram.ui.pk0;
import org.telegram.ui.qv0;
import org.telegram.ui.r50;
import org.telegram.ui.th;
import org.telegram.ui.tm;
import org.telegram.ui.tn;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.f0;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0aae  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        int i10;
        TLRPC.WebPage webPage;
        ArrayList arrayList;
        int i11;
        e4 e4Var;
        e4 e4Var2;
        e4 e4Var3;
        int i12;
        boolean z10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.Chat chat2;
        TLRPC.EmojiStatus emojiStatus;
        int i13 = 7;
        TLRPC.TL_contacts_found tL_contacts_found2 = null;
        int i14 = 0;
        switch (this.a) {
            case 0:
                w wVar = (w) this.b;
                String str = (String) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = wVar.a;
                if (webpagepreview != null) {
                    i10 = 0;
                    MessagesController.getInstance(i15).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i15).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        webPage = messageMedia.webpage;
                        wVar.b.put(str, webPage);
                        arrayList = (ArrayList) wVar.c.remove(str);
                        if (arrayList == null) {
                            int size = arrayList.size();
                            while (i10 < size) {
                                Object obj3 = arrayList.get(i10);
                                i10++;
                                ((Utilities.Callback2) obj3).run(webPage, tL_error);
                            }
                            break;
                        }
                    }
                } else {
                    i10 = 0;
                }
                webPage = null;
                wVar.b.put(str, webPage);
                arrayList = (ArrayList) wVar.c.remove(str);
                if (arrayList == null) {
                }
                break;
            case 1:
                c1 c1Var = (c1) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                c1Var.m0.a.setLoading(false);
                if (c1Var.getContext() != null) {
                    o2 U = LaunchActivity.U();
                    oa0 oa0Var = LaunchActivity.C1.t0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            c1Var.dismiss();
                            tn R9 = tn.R9(-c1Var.X.id);
                            U.presentFragment(R9);
                            U.whenFullyVisible(new ef.c(i13, R9, tL_starsGiveawayOption));
                            if (oa0Var != null) {
                                oa0Var.c(true);
                                break;
                            }
                        } else if (str2 != null) {
                            c1Var.dismiss();
                            th.r(R.string.UnknownErrorCode, new Object[]{str2}, tc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 2:
                w3 w3Var = (w3) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((k7) this.c).l;
                int size2 = arrayList3.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj4 = arrayList3.get(i16);
                    i16++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                    if (savedStarGift.pinned_to_top) {
                        int i17 = io0.a;
                        w41 J = w41.J(io0.class);
                        J.G = savedStarGift;
                        J.K(w3Var.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList2.add(J);
                    }
                }
                break;
            case 3:
                g4 g4Var = (g4) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                e4[] e4VarArr = g4Var.n;
                t3 t3Var = g4Var.P;
                if (t3Var != null) {
                    t3Var.e(true);
                    g4Var.P = null;
                }
                g4Var.e0 = true;
                g4Var.f0 = starGift == null;
                g4Var.g0 = runnable;
                y3 y3Var = new y3(g4Var.h);
                ArrayList arrayList5 = y3Var.b;
                ArrayList arrayList6 = new ArrayList();
                for (int i18 = 0; i18 < e4VarArr.length; i18++) {
                    e4 e4Var4 = e4VarArr[i18];
                    if (e4Var4 != null) {
                        TL_stars.StarGift starGift2 = e4Var4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList6.add(Integer.valueOf(i18));
                        }
                    }
                }
                int i19 = 4;
                if (arrayList6.size() == 1) {
                    y3Var.e(e4VarArr[((Integer) arrayList6.get(0)).intValue()], 5, 0.0f);
                    y3Var.d(false);
                    y3Var.c(26.0f, -26.0f);
                    y3Var.a(90);
                    y3Var.d(true);
                    y3Var.a(20);
                    i12 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    e4 e4Var5 = e4VarArr[0];
                    if (e4Var5 != null) {
                        TL_stars.StarGift starGift3 = e4Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            y3Var.e(e4Var5, iArr[0], 0.0f);
                            y3Var.c(25.0f, -22.0f);
                            i11 = 1;
                            e4Var = e4VarArr[1];
                            if (e4Var != null) {
                                TL_stars.StarGift starGift4 = e4Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i11 > 0) {
                                        y3Var.a(42);
                                    }
                                    y3Var.e(e4VarArr[1], iArr[i11], 0.0f);
                                    y3Var.c(25.0f, 31.0f);
                                    i11++;
                                }
                            }
                            e4Var2 = e4VarArr[2];
                            if (e4Var2 != null) {
                                TL_stars.StarGift starGift5 = e4Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i11 > 0) {
                                        y3Var.a(42);
                                    }
                                    y3Var.e(e4VarArr[2], iArr[i11], 180.0f);
                                    y3Var.c(-36.0f, -36.0f);
                                    i11++;
                                }
                            }
                            e4Var3 = e4VarArr[3];
                            if (e4Var3 != null) {
                                TL_stars.StarGift starGift6 = e4Var3.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    if (i11 > 0) {
                                        y3Var.a(42);
                                    }
                                    y3Var.e(e4VarArr[3], iArr[i11], 0.0f);
                                    y3Var.c(-31.0f, 31.0f);
                                    i11++;
                                }
                            }
                            y3Var.d(false);
                            y3Var.a(40);
                            y3Var.d(true);
                            y3Var.a(40);
                            i19 = iArr[i11];
                            i12 = 80;
                        }
                    }
                    i11 = 0;
                    e4Var = e4VarArr[1];
                    if (e4Var != null) {
                    }
                    e4Var2 = e4VarArr[2];
                    if (e4Var2 != null) {
                    }
                    e4Var3 = e4VarArr[3];
                    if (e4Var3 != null) {
                    }
                    y3Var.d(false);
                    y3Var.a(40);
                    y3Var.d(true);
                    y3Var.a(40);
                    i19 = iArr[i11];
                    i12 = 80;
                }
                arrayList5.add(new x3(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new v0(g4Var, i19, starGift, 5)));
                arrayList5.add(new x3(4, 0.0f, 0.0f, i12, i19, -90, null, null));
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(g4Var, starGift, arrayList4, runnable, 11);
                z3 z3Var = y3Var.a;
                y3Var.d = cVar;
                y3Var.e = false;
                y3Var.c = 0;
                y3Var.l = false;
                int size3 = arrayList5.size();
                int i20 = 0;
                while (i20 < size3) {
                    Object obj5 = arrayList5.get(i20);
                    i20++;
                    x3 x3Var = (x3) obj5;
                    int i21 = x3Var.e;
                    if (i21 >= 0 && i21 < 6) {
                        float f9 = x3Var.f;
                        if (f9 != 0.0f) {
                            z3Var.y[i21] = f9;
                        }
                    }
                }
                z3Var.D = y3Var;
                y3Var.b();
                break;
            case 4:
                ia.z0((ia) this.b, (w41) this.c, (Boolean) obj, (String) obj2);
                break;
            case 5:
                y9.Q((y9) this.b, (w41) this.c, (Boolean) obj, (String) obj2);
                break;
            case 6:
                z9.Q((z9) this.b, (w41) this.c, (Boolean) obj, (String) obj2);
                break;
            case 7:
                f2 f2Var = (f2) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                y yVar = f2Var.R;
                int i22 = f2Var.J;
                f2Var.Q = false;
                TLRPC.InputGroupCall inputGroupCall = f2Var.K;
                if (inputGroupCall != null && inputGroupCall.id == getgroupcallstars.call.id) {
                    if (groupcallstars != null) {
                        MessagesController.getInstance(i22).putUsers(groupcallstars.users, false);
                        MessagesController.getInstance(i22).putChats(groupcallstars.chats, false);
                        int i23 = 0;
                        while (true) {
                            if (i23 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i23).my) {
                                    z10 = groupcallstars.top_donors.get(i23).stars > 0;
                                } else {
                                    i23++;
                                }
                            }
                        }
                        long j10 = groupcallstars.total_stars;
                        boolean z11 = (j10 == f2Var.M && f2Var.O == z10) ? false : true;
                        f2Var.M = j10;
                        f2Var.P = groupcallstars.top_donors;
                        f2Var.O = z10;
                        if (z11) {
                            f2Var.j();
                        }
                        f2Var.t();
                    }
                    if (f2Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(yVar);
                        AndroidUtilities.runOnUIThread(yVar, 5000L);
                        break;
                    }
                }
                break;
            case 8:
                p9 p9Var = (p9) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                Vector vector = (Vector) obj;
                q9 q9Var = p9Var.a;
                if (vector != null) {
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    for (int i24 = 0; i24 < vector.objects.size(); i24++) {
                        if (((Long) arrayList7.get(i24)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(q9Var.a).getUser((Long) arrayList7.get(i24));
                            if (user3 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i24);
                                user3.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    user3.flags2 |= 32;
                                } else {
                                    user3.flags2 &= -33;
                                }
                                arrayList8.add(user3);
                            }
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(q9Var.a).getChat((Long) arrayList7.get(i24));
                            if (chat3 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i24);
                                chat3.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    chat3.flags2 |= 16;
                                } else {
                                    chat3.flags2 &= -17;
                                }
                                arrayList9.add(chat3);
                            }
                        }
                    }
                    MessagesStorage.getInstance(q9Var.a).putUsersAndChats(arrayList8, arrayList9, true, true);
                    NotificationCenter.getInstance(q9Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                    break;
                }
                break;
            case 9:
                t5 t5Var = (t5) this.b;
                bg.k kVar = (bg.k) this.c;
                t5Var.getClass();
                ((o1) kVar).r(t5Var.B1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                t5Var.d0(kVar);
                break;
            case 10:
                b0 b0Var = (b0) this.b;
                a0 a0Var = (a0) this.c;
                Boolean bool2 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool2.booleanValue()) {
                        b0Var.run(Boolean.TRUE);
                    }
                    a0Var.run();
                    break;
                }
                break;
            case 11:
                tn.h0((tn) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                break;
            case 12:
                tn tnVar = (tn) this.b;
                l6 l6Var = (l6) this.c;
                TL_account.webPagePreview webpagepreview2 = (TL_account.webPagePreview) obj;
                tnVar.B5 = 0;
                if (webpagepreview2 != null) {
                    tnVar.getMessagesController().putUsers(webpagepreview2.users, false);
                    tnVar.getMessagesController().putChats(webpagepreview2.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview2.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
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
                                    for (int i25 = 0; i25 < tL_messageMediaWebPage.webpage.attributes.size(); i25++) {
                                        if (tL_messageMediaWebPage.webpage.attributes.get(i25) instanceof TLRPC.TL_webPageAttributeStory) {
                                            tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i25);
                                            if (tL_webPageAttributeStory != null) {
                                                l6Var.run(Boolean.FALSE, null);
                                                break;
                                            } else if (tL_webPageAttributeStory.storyItem != null) {
                                                l6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                                break;
                                            } else {
                                                tnVar.getMessagesStorage().getStorageQueue().postRunnable(new gg(tnVar, tL_messageMediaWebPage, tL_webPageAttributeStory, l6Var, 3));
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
                fn fnVar = (fn) this.b;
                s1 s1Var = (s1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                tn tnVar2 = fnVar.a;
                if (tL_channels_channelParticipant != null) {
                    tnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    tnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        fnVar.e(s1Var, channelParticipant);
                        break;
                    }
                }
                break;
            case 14:
                ko koVar = (ko) this.b;
                View view = (View) this.c;
                koVar.B0 = ((Boolean) obj).booleanValue();
                koVar.D0 = ((Boolean) obj2).booleanValue();
                lh.y3 y3Var2 = koVar.e;
                int dp = AndroidUtilities.dp(koVar.B0 ? 16.0f : 32.0f);
                if (y3Var2.getRoundRadius()[0] != dp) {
                    ValueAnimator valueAnimator = y3Var2.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(y3Var2.getRoundRadius()[0], dp);
                    y3Var2.x = ofInt;
                    ofInt.addUpdateListener(new cg.c1(y3Var2, i13));
                    y3Var2.x.setDuration(200L);
                    y3Var2.x.start();
                }
                ((m8) view).setChecked(koVar.B0);
                koVar.p0(false, true);
                if (!koVar.J0) {
                    TLRPC.Chat chat4 = koVar.t0;
                    if (chat4.forum != koVar.B0 || chat4.forum_tabs != koVar.D0) {
                        if (ChatObject.isChannel(chat4) || !koVar.B0) {
                            boolean z12 = koVar.t0.forum_tabs != koVar.D0;
                            koVar.getMessagesController().toggleChannelForum(koVar.s0, koVar.B0, koVar.D0);
                            TLRPC.Chat chat5 = koVar.t0;
                            chat5.forum = koVar.B0;
                            chat5.forum_tabs = koVar.D0;
                            if (z12) {
                                koVar.q0();
                                break;
                            }
                        } else {
                            Context parentActivity = koVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.C1;
                            }
                            if (parentActivity == null) {
                                parentActivity = ApplicationLoader.applicationContext;
                            }
                            if (parentActivity != null) {
                                c2 c2Var = new c2(parentActivity, 3, null);
                                koVar.J0 = true;
                                c2Var.q(250L);
                                koVar.getMessagesController().convertToMegaGroup(koVar.getParentActivity(), koVar.s0, koVar, new kg.w(22, koVar, c2Var));
                                break;
                            }
                        }
                    }
                }
                break;
            case 15:
                ni niVar = (ni) this.b;
                g1 g1Var = (g1) this.c;
                Long l10 = (Long) obj;
                ((Runnable) obj2).run();
                niVar.f0.setStarsPrice(l10.longValue());
                if (l10.longValue() > 0) {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    g1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l10.longValue(), new Object[0]));
                    niVar.d0.s(l10.longValue());
                    break;
                } else {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    g1Var.setSubtext(null);
                    niVar.d0.s(0L);
                    break;
                }
            case 16:
                on onVar = (on) this.b;
                h hVar = (h) this.c;
                onVar.getClass();
                onVar.V((ch.e) hVar, true);
                break;
            case 17:
                ls lsVar = (ls) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList10 = lsVar.O;
                ArrayList arrayList11 = lsVar.N;
                int i26 = lsVar.J;
                if (TextUtils.equals(tL_contacts_search.q, lsVar.a0) && !TextUtils.isEmpty(lsVar.a0)) {
                    lsVar.W = false;
                    if (tL_contacts_found3 != null) {
                        MessagesStorage.getInstance(i26).putUsersAndChats(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                        MessagesController.getInstance(i26).putUsers(tL_contacts_found3.users, false);
                        MessagesController.getInstance(i26).putChats(tL_contacts_found3.chats, false);
                        tL_contacts_found2 = tL_contacts_found3;
                    }
                    HashSet hashSet = new HashSet();
                    arrayList11.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found2.my_results;
                        int size4 = arrayList12.size();
                        int i27 = 0;
                        while (i27 < size4) {
                            TLRPC.Peer peer = arrayList12.get(i27);
                            i27++;
                            TLRPC.Peer peer2 = peer;
                            if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i26).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                                hashSet.add(Long.valueOf(user2.id));
                                arrayList11.add(user2);
                            }
                        }
                    }
                    arrayList10.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList13 = tL_contacts_found2.results;
                        int size5 = arrayList13.size();
                        int i28 = 0;
                        while (i28 < size5) {
                            TLRPC.Peer peer3 = arrayList13.get(i28);
                            i28++;
                            TLRPC.Peer peer4 = peer3;
                            if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i26).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                                hashSet.add(Long.valueOf(user.id));
                                arrayList10.add(user);
                            }
                        }
                    }
                    jl0 jl0Var = lsVar.d;
                    if (jl0Var != null) {
                        jl0Var.u0(0);
                    }
                    lsVar.N(true);
                    break;
                }
                break;
            case 18:
                ns nsVar = (ns) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found4 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList14 = nsVar.O;
                ArrayList arrayList15 = nsVar.N;
                ArrayList arrayList16 = nsVar.M;
                int i29 = nsVar.J;
                if (TextUtils.equals(tL_contacts_search2.q, nsVar.X) && !TextUtils.isEmpty(nsVar.X)) {
                    nsVar.T = false;
                    if (tL_contacts_found4 != null) {
                        MessagesStorage.getInstance(i29).putUsersAndChats(tL_contacts_found4.users, tL_contacts_found4.chats, true, true);
                        MessagesController.getInstance(i29).putUsers(tL_contacts_found4.users, false);
                        MessagesController.getInstance(i29).putChats(tL_contacts_found4.chats, false);
                        tL_contacts_found2 = tL_contacts_found4;
                    }
                    HashSet hashSet2 = new HashSet();
                    arrayList16.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList17 = tL_contacts_found2.my_results;
                        int size6 = arrayList17.size();
                        int i30 = 0;
                        while (i30 < size6) {
                            TLRPC.Peer peer5 = arrayList17.get(i30);
                            i30++;
                            TLRPC.Peer peer6 = peer5;
                            if ((peer6 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(i29).getChat(Long.valueOf(peer6.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                                if (!hashSet2.contains(Long.valueOf(chat2.id))) {
                                    hashSet2.add(Long.valueOf(chat2.id));
                                    arrayList16.add(chat2);
                                }
                            }
                        }
                    }
                    arrayList15.clear();
                    String lowerCase = nsVar.X.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i29).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                        ArrayList<TLObject> arrayList18 = cachedChannelRecommendations.chats;
                        int size7 = arrayList18.size();
                        int i31 = 0;
                        while (i31 < size7) {
                            TLObject tLObject = arrayList18.get(i31);
                            i31++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat6 = (TLRPC.Chat) tLObject2;
                                if (ChatObject.isChannelAndNotMegaGroup(chat6)) {
                                    tL_contacts_found = tL_contacts_found2;
                                    TLRPC.Chat chat7 = MessagesController.getInstance(i29).getChat(Long.valueOf(chat6.id));
                                    if (ChatObject.isNotInChat(chat6) && (chat7 == null || ChatObject.isNotInChat(chat7))) {
                                        String lowerCase2 = chat6.title.toLowerCase();
                                        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                        if ((lowerCase2.startsWith(lowerCase) || org.telegram.messenger.x3.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) && !hashSet2.contains(Long.valueOf(chat6.id))) {
                                            hashSet2.add(Long.valueOf(chat6.id));
                                            arrayList15.add(chat6);
                                        }
                                    }
                                }
                            } else {
                                tL_contacts_found = tL_contacts_found2;
                            }
                            tL_contacts_found2 = tL_contacts_found;
                        }
                    }
                    TLRPC.TL_contacts_found tL_contacts_found5 = tL_contacts_found2;
                    arrayList14.clear();
                    if (tL_contacts_found5 != null) {
                        ArrayList<TLRPC.Peer> arrayList19 = tL_contacts_found5.results;
                        int size8 = arrayList19.size();
                        int i32 = 0;
                        while (i32 < size8) {
                            TLRPC.Peer peer7 = arrayList19.get(i32);
                            i32++;
                            TLRPC.Peer peer8 = peer7;
                            if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i29).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                hashSet2.add(Long.valueOf(chat.id));
                                arrayList14.add(chat);
                            }
                        }
                    }
                    nsVar.N(true);
                    break;
                }
                break;
            case 19:
                k31.m((k31) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            case 20:
                r50.q((r50) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                break;
            case 21:
                mb0 mb0Var = (mb0) this.b;
                String str3 = (String) this.c;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                mb0Var.a();
                if (passkeys != null) {
                    mb0Var.n(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str3)) {
                        mb0Var.o("addPasskeyRow");
                        break;
                    }
                }
                break;
            case 22:
                mb0 mb0Var2 = (mb0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                mb0Var2.a();
                if (tL_error2 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                        mb0.b().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        mb0.b().d0(tL_error2, false);
                        break;
                    }
                } else {
                    pk0.b(mb0Var2.d, mb0Var2.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    break;
                }
            case 23:
                boolean[] zArr = (boolean[]) this.b;
                f3 f3Var = (f3) this.c;
                zArr[0] = true;
                f3Var.dismiss();
                break;
            case 24:
                ((ye.c) this.b).b();
                ((tm) this.c).run((Boolean) obj);
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
                z0 z0Var = (z0) this.b;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.c;
                String str4 = (String) obj;
                ArrayList arrayList20 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str4)) {
                    z0Var.v("prepared_message_sent", null);
                    f0 f0Var = z0Var.c;
                    if (f0Var != null) {
                        f0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(i14, botWebViewContainer$BotWebViewProxy, arrayList20), 500L);
                    break;
                } else {
                    z0Var.v("prepared_message_failed", z0.x(str4, "error"));
                    break;
                }
            default:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.u) obj2, (androidx.biometric.v) this.c);
                break;
        }
    }
}
