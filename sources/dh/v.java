package dh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import dg.m1;
import gg.b1;
import java.util.ArrayList;
import java.util.HashSet;
import kh.v3;
import lh.aa;
import lh.d4;
import lh.f4;
import lh.ja;
import lh.l7;
import lh.w3;
import lh.x3;
import lh.y3;
import lh.z9;
import nh.g2;
import nh.p9;
import nh.q9;
import nh.z;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.os;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.a0;
import org.telegram.ui.ai;
import org.telegram.ui.b0;
import org.telegram.ui.e60;
import org.telegram.ui.gw0;
import org.telegram.ui.kh;
import org.telegram.ui.ln;
import org.telegram.ui.no0;
import org.telegram.ui.r6;
import org.telegram.ui.ro;
import org.telegram.ui.uo0;
import org.telegram.ui.ya0;
import org.telegram.ui.yb0;
import org.telegram.ui.zk0;
import org.telegram.ui.zn;
import ph.c5;
import ph.f3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    /* JADX WARN: Removed duplicated region for block: B:261:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0a78  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        TLRPC.WebPage webPage;
        ArrayList arrayList;
        int i10;
        d4 d4Var;
        d4 d4Var2;
        d4 d4Var3;
        int i11;
        boolean z4;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.Chat chat2;
        TLRPC.EmojiStatus emojiStatus;
        int i12 = 6;
        TLRPC.TL_contacts_found tL_contacts_found2 = null;
        switch (this.a) {
            case 0:
                w wVar = (w) this.b;
                String str = (String) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i13 = wVar.a;
                if (webpagepreview != null) {
                    MessagesController.getInstance(i13).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i13).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        webPage = messageMedia.webpage;
                        wVar.b.put(str, webPage);
                        arrayList = (ArrayList) wVar.c.remove(str);
                        if (arrayList == null) {
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj3 = arrayList.get(i14);
                                i14++;
                                ((Utilities.Callback2) obj3).run(webPage, tL_error);
                            }
                            break;
                        }
                    }
                }
                webPage = null;
                wVar.b.put(str, webPage);
                arrayList = (ArrayList) wVar.c.remove(str);
                if (arrayList == null) {
                }
                break;
            case 1:
                b1 b1Var = (b1) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                b1Var.n0.a.setLoading(false);
                if (b1Var.getContext() != null) {
                    p2 U = LaunchActivity.U();
                    ya0 ya0Var = LaunchActivity.D1.u0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            b1Var.dismiss();
                            zn R9 = zn.R9(-b1Var.Y.id);
                            U.presentFragment(R9);
                            U.whenFullyVisible(new ff.c(7, R9, tL_starsGiveawayOption));
                            if (ya0Var != null) {
                                ya0Var.c(true);
                                break;
                            }
                        } else if (str2 != null) {
                            b1Var.dismiss();
                            ai.r(R.string.UnknownErrorCode, new Object[]{str2}, qc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 2:
                v3 v3Var = (v3) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((l7) this.c).l;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                    if (savedStarGift.pinned_to_top) {
                        int i16 = uo0.a;
                        i51 J = i51.J(uo0.class);
                        J.G = savedStarGift;
                        J.K(v3Var.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList2.add(J);
                    }
                }
                break;
            case 3:
                f4 f4Var = (f4) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                d4[] d4VarArr = f4Var.n;
                f3 f3Var = f4Var.Q;
                if (f3Var != null) {
                    f3Var.e(true);
                    f4Var.Q = null;
                }
                f4Var.f0 = true;
                f4Var.g0 = starGift == null;
                f4Var.h0 = runnable;
                x3 x3Var = new x3(f4Var.h);
                ArrayList arrayList5 = x3Var.b;
                ArrayList arrayList6 = new ArrayList();
                for (int i17 = 0; i17 < d4VarArr.length; i17++) {
                    d4 d4Var4 = d4VarArr[i17];
                    if (d4Var4 != null) {
                        TL_stars.StarGift starGift2 = d4Var4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList6.add(Integer.valueOf(i17));
                        }
                    }
                }
                int i18 = 4;
                if (arrayList6.size() == 1) {
                    x3Var.e(d4VarArr[((Integer) arrayList6.get(0)).intValue()], 5, 0.0f);
                    x3Var.d(false);
                    x3Var.c(26.0f, -26.0f);
                    x3Var.a(90);
                    x3Var.d(true);
                    x3Var.a(20);
                    i11 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    d4 d4Var5 = d4VarArr[0];
                    if (d4Var5 != null) {
                        TL_stars.StarGift starGift3 = d4Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            x3Var.e(d4Var5, iArr[0], 0.0f);
                            x3Var.c(25.0f, -22.0f);
                            i10 = 1;
                            d4Var = d4VarArr[1];
                            if (d4Var != null) {
                                TL_stars.StarGift starGift4 = d4Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i10 > 0) {
                                        x3Var.a(42);
                                    }
                                    x3Var.e(d4VarArr[1], iArr[i10], 0.0f);
                                    x3Var.c(25.0f, 31.0f);
                                    i10++;
                                }
                            }
                            d4Var2 = d4VarArr[2];
                            if (d4Var2 != null) {
                                TL_stars.StarGift starGift5 = d4Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i10 > 0) {
                                        x3Var.a(42);
                                    }
                                    x3Var.e(d4VarArr[2], iArr[i10], 180.0f);
                                    x3Var.c(-36.0f, -36.0f);
                                    i10++;
                                }
                            }
                            d4Var3 = d4VarArr[3];
                            if (d4Var3 != null) {
                                TL_stars.StarGift starGift6 = d4Var3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i10 > 0) {
                                        x3Var.a(42);
                                    }
                                    x3Var.e(d4VarArr[3], iArr[i10], 0.0f);
                                    x3Var.c(-31.0f, 31.0f);
                                    i10++;
                                }
                            }
                            x3Var.d(false);
                            x3Var.a(40);
                            x3Var.d(true);
                            x3Var.a(40);
                            i18 = iArr[i10];
                            i11 = 80;
                        }
                    }
                    i10 = 0;
                    d4Var = d4VarArr[1];
                    if (d4Var != null) {
                    }
                    d4Var2 = d4VarArr[2];
                    if (d4Var2 != null) {
                    }
                    d4Var3 = d4VarArr[3];
                    if (d4Var3 != null) {
                    }
                    x3Var.d(false);
                    x3Var.a(40);
                    x3Var.d(true);
                    x3Var.a(40);
                    i18 = iArr[i10];
                    i11 = 80;
                }
                arrayList5.add(new w3(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new ah.a(f4Var, i18, starGift, 7)));
                arrayList5.add(new w3(4, 0.0f, 0.0f, i11, i18, -90, null, null));
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(f4Var, starGift, arrayList4, runnable, 11);
                y3 y3Var = x3Var.a;
                x3Var.d = cVar;
                x3Var.e = false;
                x3Var.c = 0;
                x3Var.l = false;
                int size3 = arrayList5.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj5 = arrayList5.get(i19);
                    i19++;
                    w3 w3Var = (w3) obj5;
                    int i20 = w3Var.e;
                    if (i20 >= 0 && i20 < 6) {
                        float f10 = w3Var.f;
                        if (f10 != 0.0f) {
                            y3Var.y[i20] = f10;
                        }
                    }
                }
                y3Var.E = x3Var;
                x3Var.b();
                break;
            case 4:
                ja.z0((ja) this.b, (i51) this.c, (Boolean) obj, (String) obj2);
                break;
            case 5:
                z9.Q((z9) this.b, (i51) this.c, (Boolean) obj, (String) obj2);
                break;
            case 6:
                aa.Q((aa) this.b, (i51) this.c, (Boolean) obj, (String) obj2);
                break;
            case 7:
                g2 g2Var = (g2) this.b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                z zVar = g2Var.S;
                int i21 = g2Var.K;
                g2Var.R = false;
                TLRPC.InputGroupCall inputGroupCall = g2Var.L;
                if (inputGroupCall != null && inputGroupCall.id == getgroupcallstars.call.id) {
                    if (groupcallstars != null) {
                        MessagesController.getInstance(i21).putUsers(groupcallstars.users, false);
                        MessagesController.getInstance(i21).putChats(groupcallstars.chats, false);
                        int i22 = 0;
                        while (true) {
                            if (i22 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i22).my) {
                                    z4 = groupcallstars.top_donors.get(i22).stars > 0;
                                } else {
                                    i22++;
                                }
                            }
                        }
                        long j10 = groupcallstars.total_stars;
                        boolean z10 = (j10 == g2Var.N && g2Var.P == z4) ? false : true;
                        g2Var.N = j10;
                        g2Var.Q = groupcallstars.top_donors;
                        g2Var.P = z4;
                        if (z10) {
                            g2Var.j();
                        }
                        g2Var.t();
                    }
                    if (g2Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(zVar);
                        AndroidUtilities.runOnUIThread(zVar, 5000L);
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
                    for (int i23 = 0; i23 < vector.objects.size(); i23++) {
                        if (((Long) arrayList7.get(i23)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(q9Var.a).getUser((Long) arrayList7.get(i23));
                            if (user3 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i23);
                                user3.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    user3.flags2 |= 32;
                                } else {
                                    user3.flags2 &= -33;
                                }
                                arrayList8.add(user3);
                            }
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(q9Var.a).getChat((Long) arrayList7.get(i23));
                            if (chat3 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i23);
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
            case 10:
                zn.h0((zn) this.b, (MessageObject) this.c, (Long) obj, (Runnable) obj2);
                break;
            case 11:
                zn znVar = (zn) this.b;
                r6 r6Var = (r6) this.c;
                TL_account.webPagePreview webpagepreview2 = (TL_account.webPagePreview) obj;
                znVar.C5 = 0;
                if (webpagepreview2 != null) {
                    znVar.getMessagesController().putUsers(webpagepreview2.users, false);
                    znVar.getMessagesController().putChats(webpagepreview2.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview2.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage != null) {
                            r6Var.run(Boolean.FALSE, null);
                            break;
                        } else {
                            TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                            if (webPage2 == null || !"telegram_story".equals(webPage2.type)) {
                                r6Var.run(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                                break;
                            } else {
                                if (tL_messageMediaWebPage.webpage.attributes != null) {
                                    for (int i24 = 0; i24 < tL_messageMediaWebPage.webpage.attributes.size(); i24++) {
                                        if (tL_messageMediaWebPage.webpage.attributes.get(i24) instanceof TLRPC.TL_webPageAttributeStory) {
                                            tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i24);
                                            if (tL_webPageAttributeStory != null) {
                                                r6Var.run(Boolean.FALSE, null);
                                                break;
                                            } else if (tL_webPageAttributeStory.storyItem != null) {
                                                r6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                                                break;
                                            } else {
                                                znVar.getMessagesStorage().getStorageQueue().postRunnable(new kh((Object) znVar, (Object) tL_messageMediaWebPage, (Object) tL_webPageAttributeStory, (Object) r6Var, 1));
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
            case 12:
                ln lnVar = (ln) this.b;
                s1 s1Var = (s1) this.c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                zn znVar2 = lnVar.a;
                if (tL_channels_channelParticipant != null) {
                    znVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    znVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        lnVar.d(s1Var, channelParticipant);
                        break;
                    }
                }
                break;
            case 13:
                ro roVar = (ro) this.b;
                View view = (View) this.c;
                roVar.C0 = ((Boolean) obj).booleanValue();
                roVar.E0 = ((Boolean) obj2).booleanValue();
                nh.y3 y3Var2 = roVar.e;
                int dp = AndroidUtilities.dp(roVar.C0 ? 16.0f : 32.0f);
                if (y3Var2.getRoundRadius()[0] != dp) {
                    ValueAnimator valueAnimator = y3Var2.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(y3Var2.getRoundRadius()[0], dp);
                    y3Var2.x = ofInt;
                    ofInt.addUpdateListener(new eg.b1(y3Var2, i12));
                    y3Var2.x.setDuration(200L);
                    y3Var2.x.start();
                }
                ((n8) view).setChecked(roVar.C0);
                roVar.p0(false, true);
                if (!roVar.K0) {
                    TLRPC.Chat chat4 = roVar.u0;
                    if (chat4.forum != roVar.C0 || chat4.forum_tabs != roVar.E0) {
                        if (ChatObject.isChannel(chat4) || !roVar.C0) {
                            boolean z11 = roVar.u0.forum_tabs != roVar.E0;
                            roVar.getMessagesController().toggleChannelForum(roVar.t0, roVar.C0, roVar.E0);
                            TLRPC.Chat chat5 = roVar.u0;
                            chat5.forum = roVar.C0;
                            chat5.forum_tabs = roVar.E0;
                            if (z11) {
                                roVar.q0();
                                break;
                            }
                        } else {
                            Context parentActivity = roVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.D1;
                            }
                            if (parentActivity == null) {
                                parentActivity = ApplicationLoader.applicationContext;
                            }
                            if (parentActivity != null) {
                                d2 d2Var = new d2(parentActivity, 3, null);
                                roVar.K0 = true;
                                d2Var.q(250L);
                                roVar.getMessagesController().convertToMegaGroup(roVar.getParentActivity(), roVar.t0, roVar, new mg.w(21, roVar, d2Var));
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                li liVar = (li) this.b;
                g1 g1Var = (g1) this.c;
                Long l10 = (Long) obj;
                ((Runnable) obj2).run();
                liVar.g0.setStarsPrice(l10.longValue());
                if (l10.longValue() > 0) {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    g1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l10.longValue(), new Object[0]));
                    liVar.e0.s(l10.longValue());
                    break;
                } else {
                    g1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    g1Var.setSubtext(null);
                    liVar.e0.s(0L);
                    break;
                }
            case 15:
                pn pnVar = (pn) this.b;
                h hVar = (h) this.c;
                pnVar.getClass();
                pnVar.V((eh.e) hVar, true);
                break;
            case 16:
                os osVar = (os) this.b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found3 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList10 = osVar.P;
                ArrayList arrayList11 = osVar.O;
                int i25 = osVar.K;
                if (TextUtils.equals(tL_contacts_search.q, osVar.b0) && !TextUtils.isEmpty(osVar.b0)) {
                    osVar.X = false;
                    if (tL_contacts_found3 != null) {
                        MessagesStorage.getInstance(i25).putUsersAndChats(tL_contacts_found3.users, tL_contacts_found3.chats, true, true);
                        MessagesController.getInstance(i25).putUsers(tL_contacts_found3.users, false);
                        MessagesController.getInstance(i25).putChats(tL_contacts_found3.chats, false);
                        tL_contacts_found2 = tL_contacts_found3;
                    }
                    HashSet hashSet = new HashSet();
                    arrayList11.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found2.my_results;
                        int size4 = arrayList12.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            TLRPC.Peer peer = arrayList12.get(i26);
                            i26++;
                            TLRPC.Peer peer2 = peer;
                            if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i25).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                                hashSet.add(Long.valueOf(user2.id));
                                arrayList11.add(user2);
                            }
                        }
                    }
                    arrayList10.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList13 = tL_contacts_found2.results;
                        int size5 = arrayList13.size();
                        int i27 = 0;
                        while (i27 < size5) {
                            TLRPC.Peer peer3 = arrayList13.get(i27);
                            i27++;
                            TLRPC.Peer peer4 = peer3;
                            if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i25).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                                hashSet.add(Long.valueOf(user.id));
                                arrayList10.add(user);
                            }
                        }
                    }
                    rl0 rl0Var = osVar.d;
                    if (rl0Var != null) {
                        rl0Var.u0(0);
                    }
                    osVar.N(true);
                    break;
                }
                break;
            case 17:
                qs qsVar = (qs) this.b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.c;
                TLRPC.TL_contacts_found tL_contacts_found4 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList14 = qsVar.P;
                ArrayList arrayList15 = qsVar.O;
                ArrayList arrayList16 = qsVar.N;
                int i28 = qsVar.K;
                if (TextUtils.equals(tL_contacts_search2.q, qsVar.Y) && !TextUtils.isEmpty(qsVar.Y)) {
                    qsVar.U = false;
                    if (tL_contacts_found4 != null) {
                        MessagesStorage.getInstance(i28).putUsersAndChats(tL_contacts_found4.users, tL_contacts_found4.chats, true, true);
                        MessagesController.getInstance(i28).putUsers(tL_contacts_found4.users, false);
                        MessagesController.getInstance(i28).putChats(tL_contacts_found4.chats, false);
                        tL_contacts_found2 = tL_contacts_found4;
                    }
                    HashSet hashSet2 = new HashSet();
                    arrayList16.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList17 = tL_contacts_found2.my_results;
                        int size6 = arrayList17.size();
                        int i29 = 0;
                        while (i29 < size6) {
                            TLRPC.Peer peer5 = arrayList17.get(i29);
                            i29++;
                            TLRPC.Peer peer6 = peer5;
                            if ((peer6 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(i28).getChat(Long.valueOf(peer6.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                                if (!hashSet2.contains(Long.valueOf(chat2.id))) {
                                    hashSet2.add(Long.valueOf(chat2.id));
                                    arrayList16.add(chat2);
                                }
                            }
                        }
                    }
                    arrayList15.clear();
                    String lowerCase = qsVar.Y.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i28).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                        ArrayList<TLObject> arrayList18 = cachedChannelRecommendations.chats;
                        int size7 = arrayList18.size();
                        int i30 = 0;
                        while (i30 < size7) {
                            TLObject tLObject = arrayList18.get(i30);
                            i30++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat6 = (TLRPC.Chat) tLObject2;
                                if (ChatObject.isChannelAndNotMegaGroup(chat6)) {
                                    tL_contacts_found = tL_contacts_found2;
                                    TLRPC.Chat chat7 = MessagesController.getInstance(i28).getChat(Long.valueOf(chat6.id));
                                    if (ChatObject.isNotInChat(chat6) && (chat7 == null || ChatObject.isNotInChat(chat7))) {
                                        String lowerCase2 = chat6.title.toLowerCase();
                                        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                        if ((lowerCase2.startsWith(lowerCase) || org.telegram.messenger.y3.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) && !hashSet2.contains(Long.valueOf(chat6.id))) {
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
                        int i31 = 0;
                        while (i31 < size8) {
                            TLRPC.Peer peer7 = arrayList19.get(i31);
                            i31++;
                            TLRPC.Peer peer8 = peer7;
                            if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i28).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.id))) {
                                hashSet2.add(Long.valueOf(chat.id));
                                arrayList14.add(chat);
                            }
                        }
                    }
                    qsVar.N(true);
                    break;
                }
                break;
            case 18:
                v31.m((v31) this.b, (TLRPC.TL_textWithEntities) this.c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            case 19:
                e60.q((e60) this.b, (ChatObject.Call) this.c, (Boolean) obj, (HashSet) obj2);
                break;
            case 20:
                yb0 yb0Var = (yb0) this.b;
                String str3 = (String) this.c;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                yb0Var.a();
                if (passkeys != null) {
                    yb0Var.n(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str3)) {
                        yb0Var.o("addPasskeyRow");
                        break;
                    }
                }
                break;
            case 21:
                yb0 yb0Var2 = (yb0) this.b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                yb0Var2.a();
                if (tL_error2 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                        yb0.b().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        yb0.b().d0(tL_error2, false);
                        break;
                    }
                } else {
                    zk0.b(yb0Var2.d, yb0Var2.b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                    break;
                }
            case 22:
                boolean[] zArr = (boolean[]) this.b;
                g3 g3Var = (g3) this.c;
                zArr[0] = true;
                g3Var.dismiss();
                break;
            case 23:
                ((ze.c) this.b).b();
                ((no0) this.c).run((Boolean) obj);
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                gw0 gw0Var = (gw0) this.c;
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
                gw0Var.b(l11 == null ? 0L : l11.longValue(), true);
                break;
            case 25:
                c5 c5Var = (c5) this.b;
                dg.j jVar = (dg.j) this.c;
                c5Var.getClass();
                ((m1) jVar).r(c5Var.C1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                c5Var.d0(jVar);
                break;
            default:
                ((Utilities.Callback3) this.b).run((Boolean) obj, (androidx.biometric.u) obj2, (androidx.biometric.v) this.c);
                break;
        }
    }
}
